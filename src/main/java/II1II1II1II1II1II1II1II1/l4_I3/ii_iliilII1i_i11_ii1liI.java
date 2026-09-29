package II1II1II1II1II1II1II1II1.l4_I3;

import II1II1II1II1II1II1II1II1.l8_I7.I_i1iii1l_i1Il1_l11_IIiI1ll____;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;

@Environment(EnvType.CLIENT)
public final class ii_iliilII1i_i11_ii1liI {
   private static double ii_I1l1_l1_1I1IIlIiII_Iill = Double.longBitsToDouble(~-9208092360110215997L - 252680599174234960L ^ 265716279924609004L);

   private ii_iliilII1i_i11_ii1liI() {
   }

   public static void ll_III_I__I_Iiilii_Iilli__l() {
      if (I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724 == null) {
         ii_I1l1_l1_1I1IIlIiII_Iill = Double.longBitsToDouble(~-1127741863733617387L - 885385606486189304L ^ 8981591334159875570L);
      } else {
         double var0 = I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_23318();
         if (!Double.isNaN(ii_I1l1_l1_1I1IIlIiII_Iill)
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_24828()
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_6101()
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_5799()
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_5765()
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_31549().field_7479) {
            ii_I1l1_l1_1I1IIlIiII_Iill = Math.max(ii_I1l1_l1_1I1IIlIiII_Iill, var0);
         } else {
            ii_I1l1_l1_1I1IIlIiII_Iill = var0;
         }
      }
   }

   public static double i11_1liI111i_1iI_1i_lIiIl() {
      ll_III_I__I_Iiilii_Iilli__l();
      return I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724 == null
         ? 0.0
         : ii_I1l1_l1_1I1IIlIiII_Iill - I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_23318();
   }

   public static boolean lI_1I_1I1I_iIilIIlii1l(class_1297 param0) {
      return (boolean)(I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724 != null
            && var0 instanceof class_1309
            && I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_7261(Float.intBitsToFloat((-490733568 | 29005) ^ -574590643))
               > Float.intBitsToFloat(~1642076762 - 2082623516 ^ 513537007)
            && i11_1liI111i_1iI_1i_lIiIl() > 0.0
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_24828()
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_6101()
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_5799()
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_6059(class_1294.field_5919)
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_5765()
            && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724.method_5624()
         ? -1345208618 * 241335337 + 2097989563
         : 570127891 * -754883361 + 214022515);
   }
}
