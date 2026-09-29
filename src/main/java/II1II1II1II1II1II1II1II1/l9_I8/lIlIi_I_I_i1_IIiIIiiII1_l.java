package II1II1II1II1II1II1II1II1.l9_I8;

import II1II1II1II1II1II1II1II1.I6_i5.i_iii_i1I1l_1IliIII1li;
import II1II1II1II1II1II1II1II1.l1_I0.lli_11I__lI_i1li1Ii11i_;
import II1II1II1II1II1II1II1II1.l8_I7.I_i1iii1l_i1Il1_l11_IIiI1ll____;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_408;
import net.minecraft.class_437;

@Environment(EnvType.CLIENT)
public final class lIlIi_I_I_i1_IIiIIiiII1_l {
   public static final lIlIi_I_I_i1_IIiIIiiII1_l liii__i_llI1IliiiiIlllI = new lIlIi_I_I_i1_IIiIIiiII1_l();
   private I__lllIliii1_1lIiIli_l1iiII_l1_ I_ll_IIllll_l1i_1i_ll1_l;
   private boolean Ii_i1I1_li_li1IliIi111;
   private boolean il1I1_1I_il_l1iIi_III1;
   private float illi1iii_1_lllIIIi1_il_I1i1;
   private float iilli1ii1I_l11i_IlIiiIllI1_lI;

   private lIlIi_I_I_i1_IIiIIiiII1_l() {
   }

   public static boolean i___il1iIiIIIiIi1IlI11Ii_() {
      class_437 var0 = I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1755;
      return (boolean)(!(var0 instanceof class_408) && !(var0 instanceof i_iii_i1I1l_1IliIII1li)
         ? (1990459392 | 8782) ^ 1990468174
         : -1523644887 * 556074169 + -1208031136);
   }

   public static boolean llIll_l_i1Il_iliil_lI1_l_1i_i() {
      return I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1755 instanceof class_408;
   }

   public static float ilii_l__iI__I_i1_I_IIIl_l() {
      return (float)(
         I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1729.method_1603()
            * (double)I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.method_22683().method_4486()
            / (double)I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.method_22683().method_4480()
      );
   }

   public static float Iiiiiiiili___1IIi_il_I_() {
      return (float)(
         I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1729.method_1604()
            * (double)I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.method_22683().method_4502()
            / (double)I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.method_22683().method_4507()
      );
   }

   public void update() {
      int var1 = lli_11I__lI_i1li1Ii11i_.lIlIli_IiiiIillI1Il1i1_1_1_l1i(1866990729 * 2009118561 + 1152932119) && i___il1iIiIIIiIi1IlI11Ii_()
         ? -464552207 * 456375111 + -415842262
         : 1070656519 * 1530273327 + -2038310729;
      if (var1 != 0 && !this.il1I1_1I_il_l1iIi_III1) {
         this.ilI1l1Il_lll_11i11i_iI1iil1I1iI();
      } else if (var1 == 0 && this.Ii_i1I1_li_li1IliIi111) {
         this.Illl___1IiiIIi1illli___1();
      }

      this.il1I1_1I_il_l1iIi_III1 = (boolean)var1;
      if (this.Ii_i1I1_li_li1IliIi111) {
         if (!i___il1iIiIIIiIi1IlI11Ii_()) {
            this.Illl___1IiiIIi1illli___1();
         } else {
            if (this.I_ll_IIllll_l1i_1i_ll1_l != null) {
               this.I_ll_IIllll_l1i_1i_ll1_l
                  .moveTo(ilii_l__iI__I_i1_I_IIIl_l() - this.illi1iii_1_lllIIIi1_il_I1i1, Iiiiiiiili___1IIi_il_I_() - this.iilli1ii1I_l11i_IlIiiIllI1_lI);
            }
         }
      }
   }

   public boolean isDragging(I__lllIliii1_1lIiIli_l1iiII_l1_ param1) {
      return (boolean)(this.Ii_i1I1_li_li1IliIi111 && this.I_ll_IIllll_l1i_1i_ll1_l == var1
         ? ~2034879032 - -589344524 ^ -1445534510
         : ~410120585 - 620434333 ^ -1030554919);
   }

   private void ilI1l1Il_lll_11i11i_iI1iil1I1iI() {
      float var1 = ilii_l__iI__I_i1_I_IIIl_l();
      float var2 = Iiiiiiiili___1IIi_il_I_();

      for (I__lllIliii1_1lIiIli_l1iiII_l1_ var4 : I__lllIliii1_1lIiIli_l1iiII_l1_.ELEMENTS) {
         float[] var5 = var4.bounds();
         if (!(var5[~1640113632 - 590290559 ^ 2064563106] <= 0.0F)
            && !(var5[(1456603136 | 26987) ^ 1456630120] <= 0.0F)
            && var1 >= var5[126448947 * 1098807353 + 1096482725]
            && var1 <= var5[~-1333154148 - 981368536 ^ 351785611] + var5[800610826 * -1002762723 + 451100896]
            && var2 >= var5[-1151234688 * -1347898799 + -2051065215]
            && var2 <= var5[(-1070006272 | 21473) ^ -1069984800] + var5[1803299649 * 990901083 + 1778314472]) {
            if (var4.click(var1, var2)) {
               return;
            }

            this.I_ll_IIllll_l1i_1i_ll1_l = var4;
            this.illi1iii_1_lllIIIi1_il_I1i1 = var1 - var5[~-205497664 - -346766701 ^ 552264364];
            this.iilli1ii1I_l11i_IlIiiIllI1_lI = var2 - var5[(838991872 | 16906) ^ 839008779];
            this.Ii_i1I1_li_li1IliIi111 = (boolean)(~1054493629 - 1078820069 ^ -2133313700);
            return;
         }
      }
   }

   private void Illl___1IiiIIi1illli___1() {
      if (this.I_ll_IIllll_l1i_1i_ll1_l != null) {
         float[] var1 = this.I_ll_IIllll_l1i_1i_ll1_l.bounds();
         this.I_ll_IIllll_l1i_1i_ll1_l.savePosition(var1[609607679 * -1995897273 + -1846024633], var1[2054523586 * 468311337 + 701582575]);
      }

      this.Ii_i1I1_li_li1IliIi111 = (boolean)((-1008467968 | 18747) ^ -1008449221);
   }
}
