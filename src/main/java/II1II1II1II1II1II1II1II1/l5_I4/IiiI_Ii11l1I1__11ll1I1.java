package II1II1II1II1II1II1II1II1.l5_I4;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IiiI_Ii11l1I1__11ll1I1 extends liIi1IIl_il1IIlIll1Il_1II {
   private final float l1lllI_1l1111II_1__l1_I_I1l_Ii;
   private final float Il__i1__llliiil_I1l111_IiIl1I_;
   private final float iIIIliiilI_111II1l1IIl;
   private float li1i1l__iilili_ll_li_I;

   public IiiI_Ii11l1I1__11ll1I1(String param1, float nullx, float nullxx, float nullxxx, float nullxxxx) {
      super(var1);
      this.l1lllI_1l1111II_1__l1_I_I1l_Ii = nullxx;
      this.Il__i1__llliiil_I1l111_IiIl1I_ = nullxxx;
      this.iIIIliiilI_111II1l1IIl = nullxxxx;
      this.setValue(nullx);
   }

   public void setValue(float param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         float var10000 = this.l1lllI_1l1111II_1__l1_I_I1l_Ii;
         float var10001 = this.Il__i1__llliiil_I1l111_IiIl1I_;
         Object var10003 = null;
         Thread.currentThread().hashCode();
         var10001 = Math.min(var10001, var1);
         Object var10002 = null;
         Thread.currentThread().hashCode();
         float var5 = Math.max(var10000, var10001);
         var10000 = (var5 - this.l1lllI_1l1111II_1__l1_I_I1l_Ii) / this.iIIIliiilI_111II1l1IIl;
         Object var8 = null;
         Thread.currentThread().hashCode();
         float var4 = (float)Math.round(var10000);
         var10001 = this.l1lllI_1l1111II_1__l1_I_I1l_Ii;
         float var10 = this.Il__i1__llliiil_I1l111_IiIl1I_;
         float var12 = this.l1lllI_1l1111II_1__l1_I_I1l_Ii + var4 * this.iIIIliiilI_111II1l1IIl;
         Object var10004 = null;
         Thread.currentThread().hashCode();
         float var11 = Math.min(var10, var12);
         var10003 = null;
         Thread.currentThread().hashCode();
         this.li1i1l__iilili_ll_li_I = Math.max(var10001, var11);
      }
   }

   public float percent() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         float var3 = this.Il__i1__llliiil_I1l111_IiIl1I_ - this.l1lllI_1l1111II_1__l1_I_I1l_Ii;
         return var3 <= 0.0F ? 0.0F : (this.li1i1l__iilili_ll_li_I - this.l1lllI_1l1111II_1__l1_I_I1l_Ii) / var3;
      }
   }

   public void setPercent(float param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         float var10001 = this.l1lllI_1l1111II_1__l1_I_I1l_Ii;
         float var10002 = this.Il__i1__llliiil_I1l111_IiIl1I_ - this.l1lllI_1l1111II_1__l1_I_I1l_Ii;
         Object var10006 = null;
         Thread.currentThread().hashCode();
         float var10004 = Math.min(1.0F, var1);
         Object var10005 = null;
         Thread.currentThread().hashCode();
         var10001 += var10002 * Math.max(0.0F, var10004);
         Object var5 = null;
         Thread.currentThread().hashCode();
         this.setValue(var10001);
      }
   }

   public String display() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         float var10000 = this.li1i1l__iilili_ll_li_I;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         return IlIIlI_1ll_ll1l_1i_il_i(var10000);
      }
   }

   public String displayMin() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         float var10000 = this.l1lllI_1l1111II_1__l1_I_I1l_Ii;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         return IlIIlI_1ll_ll1l_1i_il_i(var10000);
      }
   }

   public String displayMax() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         float var10000 = this.Il__i1__llliiil_I1l111_IiIl1I_;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         return IlIIlI_1ll_ll1l_1i_il_i(var10000);
      }
   }

   public float getValue() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.li1i1l__iilili_ll_li_I;
      }
   }

   public float getStep() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.iIIIliiilI_111II1l1IIl;
      }
   }

   private static String IlIIlI_1ll_ll1l_1i_il_i(float param0) {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10002 = null;
         Thread.currentThread().hashCode();
         float var10000 = var0 - (float)Math.round(var0);
         Object var10001 = null;
         Thread.currentThread().hashCode();
         if (Math.abs(var10000) < Float.intBitsToFloat((1561133056 | 64034) ^ 1737418829)) {
            var10001 = null;
            Thread.currentThread().hashCode();
            if (Math.abs(var0) >= 1.0F) {
               var10001 = null;
               Thread.currentThread().hashCode();
               int var5 = Math.round(var0);
               var10001 = null;
               Thread.currentThread().hashCode();
               return Integer.toString(var5);
            }
         }

         var10000 = var0 * Float.intBitsToFloat(~-8499825 - 2126685632 ^ -1015608144);
         var10001 = null;
         Thread.currentThread().hashCode();
         var10000 = (float)Math.round(var10000) / Float.intBitsToFloat((-1428094976 | 37118) ^ -399929090);
         var10001 = null;
         Thread.currentThread().hashCode();
         return String.valueOf(var10000);
      }
   }
}
