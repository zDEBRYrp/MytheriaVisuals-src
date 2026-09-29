package II1II1II1II1II1II1II1II1.I3_i2;

import java.io.IOException;
import java.net.StandardProtocolFamily;
import java.net.UnixDomainSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class Ill111II11ilI1_iIlI1Il implements IlI1I_l1__1II1ii_I_l1II_iIIiI {
   private final SocketChannel channel = SocketChannel.open(StandardProtocolFamily.UNIX);

   public Ill111II11ilI1_iIlI1Il(Path param1) throws IOException {
      this.channel.connect(UnixDomainSocketAddress.of(var1));
   }

   @Override
   public void write(byte[] param1) throws IOException {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10001 = null;
         Thread.currentThread().hashCode();
         ByteBuffer var4 = ByteBuffer.wrap(var1);

         while (true) {
            var10001 = null;
            Thread.currentThread().hashCode();
            if (!var4.hasRemaining()) {
               return;
            }

            SocketChannel var10000 = this.channel;
            Object var10002 = null;
            Thread.currentThread().hashCode();
            var10000.write(var4);
         }
      }
   }

   @Override
   public int read(byte[] param1, int nullx, int nullxx) throws IOException {
      int var5 = System.identityHashCode(null);
      if ((var5 * (var5 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         SocketChannel var10000 = this.channel;
         Object var10004 = null;
         Thread.currentThread().hashCode();
         ByteBuffer var10001 = ByteBuffer.wrap(var1, nullx, nullxx);
         Object var10002 = null;
         Thread.currentThread().hashCode();
         return var10000.read(var10001);
      }
   }

   @Override
   public boolean open() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         SocketChannel var10000 = this.channel;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         return var10000.isOpen();
      }
   }

   @Override
   public void close() throws IOException {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         SocketChannel var10000 = this.channel;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         var10000.close();
      }
   }
}
