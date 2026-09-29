package II1II1II1II1II1II1II1II1.I3_i2;

import II1II1II1II1II1II1II1II1.l3_I2.iiIIi_1l1_IllIi11iiil1l_1iIli;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3300;

@Environment(EnvType.CLIENT)
public final class i1i_lIliii1I11I1I__ll1I1 {
   private static final Gson iI11ilIIi1i_i_1lIli_11_lill1li = new Gson();
   public static final char[][] l1il1l_I_iii11li_iil_I_I_1i1I_ = new char[601695317 * -2089491269 + -476659157][];

   private static class_3300 llIilI1ilI11_lIIl_l1ii_1() {
      return class_310.method_1551().method_1478();
   }

   public static class_2960 i1___1l_l__1ii1_I1l1iIil_(String param0) {
      return class_2960.method_60655(iiIIi_1l1_IllIi11iiil1l_1iIli.Iiiiil_l___li_l_1111I_lI__li_1I(), "core/" + var0);
   }

   public static JsonObject lil__I_1i11ili11I__IIi_IIl1_i(class_2960 param0) {
      return JsonParser.parseString(ii11_I_1_1_liIIi_I1i_iI1_1ii(var0)).getAsJsonObject();
   }

   public static <T> T Iii1i_l_lil___Iiii_i_11ii1llI(class_2960 param0, Class<T> nullx) {
      return (T)iI11ilIIi1i_i_1lIli_11_lill1li.fromJson(ii11_I_1_1_liIIi_I1i_iI1_1ii(var0), nullx);
   }

   public static String ii11_I_1_1_liIIi_I1i_iI1_1ii(class_2960 param0) {
      String var10001 = iili1I_Illl_lilii1_Il____(~-77862283 - -1211148290 ^ 1289010572);
      if (var10001 == null) {
         byte[] var1 = new byte[(-1720057856 | 16862) ^ -1720040997];
         var1[(1086586880 | 58638) ^ 1086645518] = (byte)(~-1272791758 - -905951485 ^ 2116224049);
         var1[(1925120000 | 21287) ^ 1925141286] = (byte)(~-686896800 - -14045439 ^ 700942265);
         var1[~2134829688 - -1642830250 ^ -491999437] = (byte)(1480728624 * 554138557 + 6761509);
         var1[(2144272384 | 37180) ^ 2144309567] = (byte)(~1747463030 - 1712877881 ^ -834626314);
         var1[1405313823 * -368162767 + 1107775253] = (byte)(-1093648705 * -103138801 + 1844383011);
         var10001 = Iillil1Ili_lII_lIII_i1lI(var1, ~-57243610 - -1126291572 ^ 1183535181);
      }

      return IIi_1il_i1llIIi1_1I1I1__i1(var0, var10001);
   }

   public static String IIi_1il_i1llIIi1_1I1I1__i1(class_2960 param0, String nullx) {
      try {
         String var4;
         try (
            InputStream var2 = llIilI1ilI11_lIIl_l1ii_1().open(var0);
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2));
         ) {
            var4 = var3.lines().collect(Collectors.joining(nullx));
         }

         return var4;
      } catch (IOException var10) {
         throw new RuntimeException(var10);
      }
   }
}
