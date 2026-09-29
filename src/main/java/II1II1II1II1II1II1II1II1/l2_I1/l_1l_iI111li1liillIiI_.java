package II1II1II1II1II1II1II1II1.l2_I1;

import II1II1II1II1II1II1II1II1.I1_i0.liI_1iil1lii_llII__I1i1l1;
import II1II1II1II1II1II1II1II1.l0_I9.il_l_l111iIi_ii1l_l1_I;
import II1II1II1II1II1II1II1II1.l4_I3.I1I_IiI_iIIllilllIil1_;
import II1II1II1II1II1II1II1II1.l4_I3.IlIilI1Ili1_i1i1lIliliII1;
import II1II1II1II1II1II1II1II1.l4_I3.iIIlIIi1iI_1lilll1i11111l_Ii1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class l_1l_iI111li1liillIiI_ extends liI_1iil1lii_llII__I1i1l1<il_l_l111iIi_ii1l_l1_I> {
   private IlIilI1Ili1_i1i1lIliliII1 li_I_1i_ll_I_iIIl1lil_;
   private iIIlIIi1iI_1lilll1i11111l_Ii1 liiI1i1ll_I_IlIIi_I_I__I;
   private I1I_IiI_iIIllilllIil1_ i_I_lIi1i_1I__iliil1_il11IlI;
   private float lI_l_li1_Ii_l_iIiIIl_I__I__lI;

   public l_1l_iI111li1liillIiI_ size(IlIilI1Ili1_i1i1lIliliII1 param1) {
      this.li_I_1i_ll_I_iIIl1lil_ = var1;
      return this;
   }

   public l_1l_iI111li1liillIiI_ radius(iIIlIIi1iI_1lilll1i11111l_Ii1 param1) {
      this.liiI1i1ll_I_IlIIi_I_I__I = var1;
      return this;
   }

   public l_1l_iI111li1liillIiI_ color(I1I_IiI_iIIllilllIil1_ param1) {
      this.i_I_lIi1i_1I__iliil1_il11IlI = var1;
      return this;
   }

   public l_1l_iI111li1liillIiI_ smoothness(float param1) {
      this.lI_l_li1_Ii_l_iIiIIl_I__I__lI = var1;
      return this;
   }

   protected il_l_l111iIi_ii1l_l1_I _build() {
      return new il_l_l111iIi_ii1l_l1_I(
         this.li_I_1i_ll_I_iIIl1lil_, this.liiI1i1ll_I_IlIIi_I_I__I, this.i_I_lIi1i_1I__iliil1_il11IlI, this.lI_l_li1_Ii_l_iIiIIl_I__I__lI
      );
   }

   @Override
   protected void reset() {
      this.li_I_1i_ll_I_iIIl1lil_ = IlIilI1Ili1_i1i1lIliliII1.lii_i_I1I_l_1i__Iii___il;
      this.liiI1i1ll_I_IlIIi_I_I__I = iIIlIIi1iI_1lilll1i11111l_Ii1.I11i_lli_IiIilIlIili_lI_1_;
      this.i_I_lIi1i_1I__iliil1_il11IlI = I1I_IiI_iIIllilllIil1_.iiIii_l_i1I_l1ilIi11liIlIl1_1I1;
      this.lI_l_li1_Ii_l_iIiIIl_I__I__lI = 1.0F;
   }
}
