package II1II1II1II1II1II1II1II1.l2_I1;

import II1II1II1II1II1II1II1II1.I1_i0.liI_1iil1lii_llII__I1i1l1;
import II1II1II1II1II1II1II1II1.l0_I9.iiiIiI_l__1I_I11Il1III;
import II1II1II1II1II1II1II1II1.l4_I3.I1I_IiI_iIIllilllIil1_;
import II1II1II1II1II1II1II1II1.l4_I3.IlIilI1Ili1_i1i1lIliliII1;
import II1II1II1II1II1II1II1II1.l4_I3.iIIlIIi1iI_1lilll1i11111l_Ii1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1044;

@Environment(EnvType.CLIENT)
public final class i1iI_I_1l1l_1IiliIIlIl1Il extends liI_1iil1lii_llII__I1i1l1<iiiIiI_l__1I_I11Il1III> {
   private IlIilI1Ili1_i1i1lIliliII1 Ili1IiI1llIi_1__l_lIiIIII_lII;
   private iIIlIIi1iI_1lilll1i11111l_Ii1 i1Iili11l__I1_1ii1_l_I1_lIiIi_i;
   private I1I_IiI_iIIllilllIil1_ l_ii__lil1ll_iI_l1lIii_;
   private float I1_1___iIili1___i1l1I__1;
   private float IlIl1I1Iiii_ii_1Ii1I__I_lI;
   private float i_1ii__iIlilil1li1_Ii11il;
   private float lIiiill_lI_IllIII111i_i1il_i1;
   private float llil_lIIIIIi1ii1li_ii1l_lii1i1;
   private int il__illilillII1il_Ii_I;

   public i1iI_I_1l1l_1IiliIIlIl1Il size(IlIilI1Ili1_i1i1lIliliII1 param1) {
      this.Ili1IiI1llIi_1__l_lIiIIII_lII = var1;
      return this;
   }

   public i1iI_I_1l1l_1IiliIIlIl1Il radius(iIIlIIi1iI_1lilll1i11111l_Ii1 param1) {
      this.i1Iili11l__I1_1ii1_l_I1_lIiIi_i = var1;
      return this;
   }

   public i1iI_I_1l1l_1IiliIIlIl1Il color(I1I_IiI_iIIllilllIil1_ param1) {
      this.l_ii__lil1ll_iI_l1lIii_ = var1;
      return this;
   }

   public i1iI_I_1l1l_1IiliIIlIl1Il smoothness(float param1) {
      this.I1_1___iIili1___i1l1I__1 = var1;
      return this;
   }

   public i1iI_I_1l1l_1IiliIIlIl1Il texture(float param1, float nullx, float nullxx, float nullxxx, class_1044 nullxxxx) {
      return this.texture(var1, nullx, nullxx, nullxxx, nullxxxx.method_4624());
   }

   public i1iI_I_1l1l_1IiliIIlIl1Il texture(float param1, float nullx, float nullxx, float nullxxx, int nullxxxx) {
      this.IlIl1I1Iiii_ii_1Ii1I__I_lI = var1;
      this.i_1ii__iIlilil1li1_Ii11il = nullx;
      this.lIiiill_lI_IllIII111i_i1il_i1 = nullxx;
      this.llil_lIIIIIi1ii1li_ii1l_lii1i1 = nullxxx;
      this.il__illilillII1il_Ii_I = nullxxxx;
      return this;
   }

   protected iiiIiI_l__1I_I11Il1III _build() {
      return new iiiIiI_l__1I_I11Il1III(
         this.Ili1IiI1llIi_1__l_lIiIIII_lII,
         this.i1Iili11l__I1_1ii1_l_I1_lIiIi_i,
         this.l_ii__lil1ll_iI_l1lIii_,
         this.I1_1___iIili1___i1l1I__1,
         this.IlIl1I1Iiii_ii_1Ii1I__I_lI,
         this.i_1ii__iIlilil1li1_Ii11il,
         this.lIiiill_lI_IllIII111i_i1il_i1,
         this.llil_lIIIIIi1ii1li_ii1l_lii1i1,
         this.il__illilillII1il_Ii_I
      );
   }

   @Override
   protected void reset() {
      this.Ili1IiI1llIi_1__l_lIiIIII_lII = IlIilI1Ili1_i1i1lIliliII1.lii_i_I1I_l_1i__Iii___il;
      this.i1Iili11l__I1_1ii1_l_I1_lIiIi_i = iIIlIIi1iI_1lilll1i11111l_Ii1.I11i_lli_IiIilIlIili_lI_1_;
      this.l_ii__lil1ll_iI_l1lIii_ = I1I_IiI_iIIllilllIil1_.l__I1llli_IllIiI_ll1ll11Il;
      this.I1_1___iIili1___i1l1I__1 = 1.0F;
      this.IlIl1I1Iiii_ii_1Ii1I__I_lI = 0.0F;
      this.i_1ii__iIlilil1li1_Ii11il = 0.0F;
      this.lIiiill_lI_IllIII111i_i1il_i1 = 0.0F;
      this.llil_lIIIIIi1ii1li_ii1l_lii1i1 = 0.0F;
      this.il__illilillII1il_Ii_I = ~-1741144795 - -1279455553 ^ -1274366949;
   }
}
