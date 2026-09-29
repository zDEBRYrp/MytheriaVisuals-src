package II1II1II1II1II1II1II1II1.l2_I1;

import II1II1II1II1II1II1II1II1.I1_i0.liI_1iil1lii_llII__I1i1l1;
import II1II1II1II1II1II1II1II1.l0_I9.lIiI_i1ii_iIl_11iiI1IIil1_1_;
import II1II1II1II1II1II1II1II1.l4_I3.I1I_IiI_iIIllilllIil1_;
import II1II1II1II1II1II1II1II1.l4_I3.IlIilI1Ili1_i1i1lIliliII1;
import II1II1II1II1II1II1II1II1.l4_I3.iIIlIIi1iI_1lilll1i11111l_Ii1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class Il_I___1i_lllli_Ili1lilIlI1i1 extends liI_1iil1lii_llII__I1i1l1<lIiI_i1ii_iIl_11iiI1IIil1_1_> {
   private IlIilI1Ili1_i1i1lIliliII1 ii1iiI_i1Il1il1_I1l11iil1ll__ii;
   private iIIlIIi1iI_1lilll1i11111l_Ii1 i1l_1_1lil1I1i1l_ilI1Il_lI1_li;
   private I1I_IiI_iIIllilllIil1_ llli_I_1ll1lIIIiIIlIIi__1_1I1;
   private float i_1_1Iii11_ii_1lIl1IiiiiIiI1i_1;
   private float IIIiIiIi1lI111i1Il_ili1;

   public Il_I___1i_lllli_Ili1lilIlI1i1 size(IlIilI1Ili1_i1i1lIliliII1 param1) {
      this.ii1iiI_i1Il1il1_I1l11iil1ll__ii = var1;
      return this;
   }

   public Il_I___1i_lllli_Ili1lilIlI1i1 radius(iIIlIIi1iI_1lilll1i11111l_Ii1 param1) {
      this.i1l_1_1lil1I1i1l_ilI1Il_lI1_li = var1;
      return this;
   }

   public Il_I___1i_lllli_Ili1lilIlI1i1 color(I1I_IiI_iIIllilllIil1_ param1) {
      this.llli_I_1ll1lIIIiIIlIIi__1_1I1 = var1;
      return this;
   }

   public Il_I___1i_lllli_Ili1lilIlI1i1 smoothness(float param1) {
      this.i_1_1Iii11_ii_1lIl1IiiiiIiI1i_1 = var1;
      return this;
   }

   public Il_I___1i_lllli_Ili1lilIlI1i1 blurRadius(float param1) {
      this.IIIiIiIi1lI111i1Il_ili1 = var1;
      return this;
   }

   protected lIiI_i1ii_iIl_11iiI1IIil1_1_ _build() {
      return new lIiI_i1ii_iIl_11iiI1IIil1_1_(
         this.ii1iiI_i1Il1il1_I1l11iil1ll__ii,
         this.i1l_1_1lil1I1i1l_ilI1Il_lI1_li,
         this.llli_I_1ll1lIIIiIIlIIi__1_1I1,
         this.i_1_1Iii11_ii_1lIl1IiiiiIiI1i_1,
         this.IIIiIiIi1lI111i1Il_ili1
      );
   }

   @Override
   protected void reset() {
      this.ii1iiI_i1Il1il1_I1l11iil1ll__ii = IlIilI1Ili1_i1i1lIliliII1.lii_i_I1I_l_1i__Iii___il;
      this.i1l_1_1lil1I1i1l_ilI1Il_lI1_li = iIIlIIi1iI_1lilll1i11111l_Ii1.I11i_lli_IiIilIlIili_lI_1_;
      this.llli_I_1ll1lIIIiIIlIIi__1_1I1 = I1I_IiI_iIIllilllIil1_.l__I1llli_IllIiI_ll1ll11Il;
      this.i_1_1Iii11_ii_1lIl1IiiiiIiI1i_1 = 1.0F;
      this.IIIiIiIi1lI111i1Il_ili1 = 0.0F;
   }
}
