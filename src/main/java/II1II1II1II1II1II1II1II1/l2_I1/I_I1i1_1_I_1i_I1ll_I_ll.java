package II1II1II1II1II1II1II1II1.l2_I1;

import II1II1II1II1II1II1II1II1.I1_i0.liI_1iil1lii_llII__I1i1l1;
import II1II1II1II1II1II1II1II1.l0_I9.Ii_iiI_i1i11lI_Ill1illll;
import II1II1II1II1II1II1II1II1.l4_I3.I1I_IiI_iIIllilllIil1_;
import II1II1II1II1II1II1II1II1.l4_I3.IlIilI1Ili1_i1i1lIliliII1;
import II1II1II1II1II1II1II1II1.l4_I3.iIIlIIi1iI_1lilll1i11111l_Ii1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class I_I1i1_1_I_1i_I1ll_I_ll extends liI_1iil1lii_llII__I1i1l1<Ii_iiI_i1i11lI_Ill1illll> {
   private IlIilI1Ili1_i1i1lIliliII1 il1Iil__I_il_I1l1__l1Ii1_1i_;
   private iIIlIIi1iI_1lilll1i11111l_Ii1 l1Ii_I_1_li1lii11li1I_1il_;
   private I1I_IiI_iIIllilllIil1_ I_IlIi_l_II1_Ili_ii_IllI1lil1Ii;
   private float li_1iIi__1iillI_I_llli1ii_;
   private float iI1_11li_il1i_i1l_I_i1;
   private float l_I1_I11__l1ii_1lIliiI1Ii1;

   public I_I1i1_1_I_1i_I1ll_I_ll size(IlIilI1Ili1_i1i1lIliliII1 param1) {
      this.il1Iil__I_il_I1l1__l1Ii1_1i_ = var1;
      return this;
   }

   public I_I1i1_1_I_1i_I1ll_I_ll radius(iIIlIIi1iI_1lilll1i11111l_Ii1 param1) {
      this.l1Ii_I_1_li1lii11li1I_1il_ = var1;
      return this;
   }

   public I_I1i1_1_I_1i_I1ll_I_ll color(I1I_IiI_iIIllilllIil1_ param1) {
      this.I_IlIi_l_II1_Ili_ii_IllI1lil1Ii = var1;
      return this;
   }

   public I_I1i1_1_I_1i_I1ll_I_ll thickness(float param1) {
      this.li_1iIi__1iillI_I_llli1ii_ = var1;
      return this;
   }

   public I_I1i1_1_I_1i_I1ll_I_ll smoothness(float param1, float nullx) {
      this.iI1_11li_il1i_i1l_I_i1 = var1;
      this.l_I1_I11__l1ii_1lIliiI1Ii1 = nullx;
      return this;
   }

   protected Ii_iiI_i1i11lI_Ill1illll _build() {
      return new Ii_iiI_i1i11lI_Ill1illll(
         this.il1Iil__I_il_I1l1__l1Ii1_1i_,
         this.l1Ii_I_1_li1lii11li1I_1il_,
         this.I_IlIi_l_II1_Ili_ii_IllI1lil1Ii,
         this.li_1iIi__1iillI_I_llli1ii_,
         this.iI1_11li_il1i_i1l_I_i1,
         this.l_I1_I11__l1ii_1lIliiI1Ii1
      );
   }

   @Override
   protected void reset() {
      this.il1Iil__I_il_I1l1__l1Ii1_1i_ = IlIilI1Ili1_i1i1lIliliII1.lii_i_I1I_l_1i__Iii___il;
      this.l1Ii_I_1_li1lii11li1I_1il_ = iIIlIIi1iI_1lilll1i11111l_Ii1.I11i_lli_IiIilIlIili_lI_1_;
      this.I_IlIi_l_II1_Ili_ii_IllI1lil1Ii = I1I_IiI_iIIllilllIil1_.iiIii_l_i1I_l1ilIi11liIlIl1_1I1;
      this.li_1iIi__1iillI_I_llli1ii_ = 0.0F;
      this.iI1_11li_il1i_i1l_I_i1 = 1.0F;
      this.l_I1_I11__l1ii_1lIliiI1Ii1 = 1.0F;
   }
}
