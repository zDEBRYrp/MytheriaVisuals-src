package II1II1II1II1II1II1II1II1.I3_i2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class il1Il11I__li1illliIIii_II_i_i implements IlI1I_l1__1II1ii_I_l1II_iIIiI {
   private final RandomAccessFile file;
   public static final char[][] l1l_l111_lI1il_i11iIill11_ = new char[-327491402 * 2101716363 + -144396432][];

   public il1Il11I__li1illliIIii_II_i_i(String param1) throws IOException {
      RandomAccessFile var10001 = new RandomAccessFile;
      String var10004 = il_Ii1lI1I1IiIlll1i1li1I((-301268992 | 52254) ^ -301216738);
      if (var10004 == null) {
         byte[] var2 = new byte[~-667042688 - -658508808 ^ 1325551489];
         var2[(1968635904 | 47663) ^ 1968683567] = (byte)(1757337085 * 437571121 + -108825351);
         var2[-158682251 * -553136927 + -169604564] = (byte)((93388800 | 17096) ^ -93405880);
         var2[558279919 * 328265343 + -977665167] = (byte)(-1922087442 * -1780340871 + -257642434);
         var2[1771812134 * 877528387 + 1747048721] = (byte)(~268127114 - 1582816310 ^ 1850943397);
         var2[(-1506738176 | 9687) ^ -1506728493] = (byte)(~504918228 - 1726573990 ^ -2063475194);
         var2[(-2005467136 | 60459) ^ -2005406674] = (byte)((1795227648 | 7978) ^ -1795235668);
         var10004 = I11_lil1_1Illi11iil1Iii(var2, 1712209149 * -505286617 + 592086389);
      }

      var10001./* $VF: Unable to resugar constructor */<init>(var1, var10004);
      this.file = var10001;
   }

   @Override
   public void write(byte[] param1) throws IOException {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         RandomAccessFile var10000 = this.file;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         var10000.write(var1);
      }
   }

   @Override
   public int read(byte[] param1, int nullx, int nullxx) throws IOException {
      int var5 = System.identityHashCode(null);
      if ((var5 * (var5 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         RandomAccessFile var10000 = this.file;
         Object var10004 = null;
         Thread.currentThread().hashCode();
         return var10000.read(var1, nullx, nullxx);
      }
   }

   @Override
   public boolean open() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         RandomAccessFile var10000 = this.file;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         FileChannel var3 = var10000.getChannel();
         var10001 = null;
         Thread.currentThread().hashCode();
         return var3.isOpen();
      }
   }

   @Override
   public void close() throws IOException {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         RandomAccessFile var10000 = this.file;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         var10000.close();
      }
   }
}
