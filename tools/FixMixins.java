import java.io.*;
import java.net.URI;
import java.net.http.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.zip.*;

/**
 * Translates intermediary names -> Yarn names inside mixin classes of the mod
 * (annotation strings, @Shadow members, class/member refs) by rewriting the class-file constant pool.
 * No dependencies (no ASM), works on any JDK 17+.
 *
 * Usage: java tools/FixMixins.java <in.jar> <out.jar> [mappings.tiny]
 */
public class FixMixins {
    static final String YARN = "1.21.4+build.8";
    static final Map<String, String> classes = new HashMap<>();
    static final Map<String, String> members = new HashMap<>();
    static final Pattern CLS = Pattern.compile("net([/.])minecraft\\1class_\\d+(?:\\$class_\\d+)*");
    static final Pattern MEM = Pattern.compile("\\b(?:method|field|comp)_\\d+\\b");
    static int changed = 0, missing = 0, classesPatched = 0;
    static final Set<String> missingNames = new TreeSet<>();

    public static void main(String[] a) throws Exception {
        Path in = Path.of(a[0]), out = Path.of(a[1]);
        loadTiny(a.length > 2 ? Files.readString(Path.of(a[2])) : downloadTiny());
        System.out.println("Mappings loaded: classes=" + classes.size() + ", members=" + members.size());
        if (classes.isEmpty()) throw new IllegalStateException("Empty mappings");

        Files.createDirectories(out.toAbsolutePath().getParent());
        try (ZipInputStream zi = new ZipInputStream(Files.newInputStream(in));
             ZipOutputStream zo = new ZipOutputStream(Files.newOutputStream(out))) {
            ZipEntry e;
            while ((e = zi.getNextEntry()) != null) {
                byte[] data = zi.readAllBytes();
                if (e.getName().startsWith("nesquik/mytheria/mixin/") && e.getName().endsWith(".class")) {
                    data = patchClass(data);
                    classesPatched++;
                }
                zo.putNextEntry(new ZipEntry(e.getName()));
                zo.write(data);
                zo.closeEntry();
            }
        }
        System.out.printf("Done: mixin classes=%d, strings rewritten=%d, names without mapping=%d%n",
                classesPatched, changed, missing);
        if (!missingNames.isEmpty()) System.out.println("Unmapped: " + missingNames);
    }

    static String downloadTiny() throws Exception {
        String v = YARN.replace("+", "%2B");
        String url = "https://maven.fabricmc.net/net/fabricmc/yarn/" + v + "/yarn-" + v + "-v2.jar";
        System.out.println("Downloading Yarn: " + url);
        HttpResponse<byte[]> r = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.ALWAYS).build()
                .send(HttpRequest.newBuilder(URI.create(url)).build(), HttpResponse.BodyHandlers.ofByteArray());
        if (r.statusCode() != 200) throw new IOException("HTTP " + r.statusCode());
        try (ZipInputStream z = new ZipInputStream(new ByteArrayInputStream(r.body()))) {
            ZipEntry e;
            while ((e = z.getNextEntry()) != null)
                if (e.getName().equals("mappings/mappings.tiny"))
                    return new String(z.readAllBytes(), StandardCharsets.UTF_8);
        }
        throw new IOException("mappings/mappings.tiny not found in yarn jar");
    }

    static void loadTiny(String text) {
        for (String line : text.split("\n")) {
            String[] p = line.split("\t");
            if (p.length >= 3 && p[0].equals("c")) classes.put(p[1], p[2]);
            else if (p.length >= 5 && p[0].isEmpty() && (p[1].equals("m") || p[1].equals("f")))
                members.putIfAbsent(p[3], p[4]);
        }
    }

    static String translate(String s) {
        if (!s.contains("class_") && !s.contains("method_") && !s.contains("field_") && !s.contains("comp_")) return s;
        Matcher m = CLS.matcher(s);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            boolean slash = m.group(1).equals("/");
            String key = m.group().replace('.', '/');
            String to = classes.get(key);
            if (to == null) { missing++; missingNames.add(key); to = key; }
            m.appendReplacement(sb, Matcher.quoteReplacement(slash ? to : to.replace('/', '.')));
        }
        m.appendTail(sb);
        m = MEM.matcher(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        while (m.find()) {
            String to = members.get(m.group());
            if (to == null) { missing++; missingNames.add(m.group()); to = m.group(); }
            m.appendReplacement(sb2, Matcher.quoteReplacement(to));
        }
        m.appendTail(sb2);
        return sb2.toString();
    }

    /** Rewrites every CONSTANT_Utf8 of the class; everything after the pool is copied verbatim (indices unchanged). */
    static byte[] patchClass(byte[] b) throws IOException {
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(b));
        ByteArrayOutputStream bo = new ByteArrayOutputStream(b.length + 512);
        DataOutputStream o = new DataOutputStream(bo);
        o.writeInt(in.readInt());          // magic
        o.writeShort(in.readUnsignedShort()); // minor
        o.writeShort(in.readUnsignedShort()); // major
        int count = in.readUnsignedShort();
        o.writeShort(count);
        for (int i = 1; i < count; i++) {
            int tag = in.readUnsignedByte();
            o.writeByte(tag);
            switch (tag) {
                case 1 -> {
                    int len = in.readUnsignedShort();
                    byte[] s = new byte[len];
                    in.readFully(s);
                    boolean ascii = true;
                    for (byte x : s) if (x <= 0) { ascii = false; break; }
                    if (ascii) {
                        String str = new String(s, StandardCharsets.ISO_8859_1);
                        String t = translate(str);
                        if (!t.equals(str)) { s = t.getBytes(StandardCharsets.ISO_8859_1); changed++; }
                    }
                    o.writeShort(s.length);
                    o.write(s);
                }
                case 3, 4, 9, 10, 11, 12, 17, 18 -> copy(in, o, 4);
                case 5, 6 -> { copy(in, o, 8); i++; }
                case 7, 8, 16, 19, 20 -> copy(in, o, 2);
                case 15 -> copy(in, o, 3);
                default -> throw new IOException("Unknown constant pool tag " + tag);
            }
        }
        in.transferTo(o);
        return bo.toByteArray();
    }

    static void copy(DataInputStream in, DataOutputStream o, int n) throws IOException {
        byte[] x = new byte[n];
        in.readFully(x);
        o.write(x);
    }
}
