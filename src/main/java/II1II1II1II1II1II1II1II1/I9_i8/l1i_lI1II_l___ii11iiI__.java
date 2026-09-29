package II1II1II1II1II1II1II1II1.I9_i8;

import java.util.Arrays;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class l1i_lI1II_l___ii11iiI__ {
   private static final int EMPTY = ~-1892953651 - 1192955806 ^ -699997845;
   private final int[] keys;
   private final float[] values;
   private final int mask;

   l1i_lI1II_l___ii11iiI__(Map<Integer, Map<Integer, Float>> param1) {
      int var2 = (-662634496 | 64874) ^ -662569622;

      for (Map var4 : var1.values()) {
         var2 += var4.size();
      }

      int var5 = Integer.highestOneBit(
            Math.max(~1090943069 - 188129441 ^ -1279072495, var2 * (~-784220760 - -1656202561 ^ -1854543972) - (-326086891 * -806758821 + 1367037322))
         )
         << ((1701052416 | 26323) ^ 1701078738);
      this.keys = new int[var5];
      this.values = new float[var5];
      this.mask = var5 - ((-600702976 | 10252) ^ -600692723);
      Arrays.fill(this.keys, 173818061 * 1690183377 + -1393907038);
      var1.forEach(
         (nullx, nullxx) -> nullxx.forEach((nullxxxx, nullxxx) -> this.Ill1Ii1Ii_l_lllii_1Ii_Ii_lii1I(i_Ii1l__lIl1I_I1IlIl__i11(nullx, nullxxxx), nullxxx))
      );
   }

   float get(int param1, int nullx) {
      if (var1 < 0) {
         return 0.0F;
      } else {
         int var3 = i_Ii1l__lIl1I_I1IlIl__i11(var1, nullx);
         int var4 = iIli1_11ili1Ii1I1I_iIl_l_i_Ii(var3) & this.mask;

         while (true) {
            int var5 = this.keys[var4];
            if (var5 == var3) {
               return this.values[var4];
            }

            if (var5 == (~136879845 - 645995438 ^ 782875283)) {
               return 0.0F;
            }

            var4 = var4 + -771086777 * -406881633 + 360408040 & this.mask;
         }
      }
   }

   private void Ill1Ii1Ii_l_lllii_1Ii_Ii_lii1I(int param1, float nullx) {
      int var3 = iIli1_11ili1Ii1I1I_iIl_l_i_Ii(var1) & this.mask;

      while (this.keys[var3] != (~-118261901 - 1633844363 ^ 1515582462) && this.keys[var3] != var1) {
         var3 = var3 + 1871743043 * 2057911969 + -220261410 & this.mask;
      }

      this.keys[var3] = var1;
      this.values[var3] = nullx;
   }

   private static int i_Ii1l__lIl1I_I1IlIl__i11(int param0, int nullx) {
      return (var0 & (~1704740126 - -476515943 ^ -1228228937)) << 866999926 * -2131271889 + 155442790 | nullx & ((980549632 | 57851) ^ 980557316);
   }

   private static int iIli1_11ili1Ii1I1I_iIl_l_i_Ii(int param0) {
      int var1 = var0 * (~-314025311 - 965267926 ^ 1192864313);
      return var1 ^ var1 >>> (~12587862 - 1393386129 ^ -1405974008);
   }
}
