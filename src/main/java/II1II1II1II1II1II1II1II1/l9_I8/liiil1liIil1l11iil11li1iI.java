package II1II1II1II1II1II1II1II1.l9_I8;

import II1II1II1II1II1II1II1II1.I2_i1.i_ilIii1lIil1__lli1lIIi_i1;
import II1II1II1II1II1II1II1II1.I3_i2.il_l_li__li_i1lI1iII_I_iI_l1Ii1;
import II1II1II1II1II1II1II1II1.I6_i5.iI__11iIl1i_1_ii_i_IiI;
import II1II1II1II1II1II1II1II1.l5_I4.i_i1i_lI11l_1i_I_1I__lii_l__i1;
import II1II1II1II1II1II1II1II1.l5_I4.liIi1IIl_il1IIlIll1Il_1II;
import II1II1II1II1II1II1II1II1.l7_I6.i_ii_i1i1il1ll_1II_lII1_1l1liI_;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class liiil1liIil1l11iil11li1iI {
   private final String i_ii_II_1I__Ilii_illl1Ii_i1I;
   private final String i11i_111_i1I11l_iIll1ii;
   private final i1ii11IIilIl1_1IlliiiI1iii ii1iIli11_l___ii1l_i_i_II;
   private final List<liIi1IIl_il1IIlIll1Il_1II> IllIi1_1_1lIi_i_11_1__ = new ArrayList<>();
   private boolean l1IiiIil_l_Ili_iIi_1iiii;
   private int I_i1i1lI1Iil11liiI__iI1il___l = 1953421585 * 1054172743 + -778041784;

   public liiil1liIil1l11iil11li1iI(String param1, String nullx, i1ii11IIilIl1_1IlliiiI1iii nullxx) {
      this.i_ii_II_1I__Ilii_illl1Ii_i1I = var1;
      this.i11i_111_i1I11l_iIll1ii = nullx;
      this.ii1iIli11_l___ii1l_i_i_II = nullxx;
   }

   public void onEnable() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      }
   }

   public void onDisable() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      }
   }

   public boolean isToggleable() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return (boolean)((1870921728 | 16278) ^ 1870938007);
      }
   }

   public void toggle() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10001 = null;
         Thread.currentThread().hashCode();
         if (this.isToggleable()) {
            int var3 = !this.l1IiiIil_l_Ili_iIi_1iiii ? (1910505472 | 44626) ^ 1910550099 : ~2061883019 - -775804032 ^ -1286078988;
            Object var10002 = null;
            Thread.currentThread().hashCode();
            this.setEnabled((boolean)var3);
            boolean var10000 = this.l1IiiIil_l_Ili_iIi_1iiii;
            var10001 = null;
            Thread.currentThread().hashCode();
            i_ilIii1lIil1__lli1lIIi_i1.Il1l_1_1_i_Il1il1i1llIi_(var10000);
            boolean var5 = this.l1IiiIil_l_Ili_iIi_1iiii;
            var10002 = null;
            Thread.currentThread().hashCode();
            iI__11iIl1i_1_ii_i_IiI.l1II___i_1__iilIi1illii_1illI1I(this, var5);
         }
      }
   }

   public void setEnabled(boolean param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else if (this.l1IiiIil_l_Ili_iIi_1iiii != var1) {
         this.l1IiiIil_l_Ili_iIi_1iiii = var1;
         if (var1) {
            i_ii_i1i1il1ll_1II_lII1_1l1liI_ var10000 = null;
            Thread.currentThread().hashCode();
            var10000 = il_l_li__li_i1lI1iII_I_iI_l1Ii1.lIIil1_ii11__III_lI1_1_1_();
            Object var10002 = null;
            Thread.currentThread().hashCode();
            var10000.register(this);
            Object var10001 = null;
            Thread.currentThread().hashCode();
            this.onEnable();
         } else {
            Object var7 = null;
            Thread.currentThread().hashCode();
            this.onDisable();
            i_ii_i1i1il1ll_1II_lII1_1l1liI_ var5 = null;
            Thread.currentThread().hashCode();
            var5 = il_l_li__li_i1lI1iII_I_iI_l1Ii1.lIIil1_ii11__III_lI1_1_1_();
            Object var8 = null;
            Thread.currentThread().hashCode();
            var5.unregister(this);
         }
      }
   }

   public boolean isEnabled() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.l1IiiIil_l_Ili_iIi_1iiii;
      }
   }

   public int getBind() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.I_i1i1lI1Iil11liiI__iI1il___l;
      }
   }

   public void setBind(int param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         this.I_i1i1lI1Iil11liiI__iI1il___l = var1;
      }
   }

   public String bindName() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         int var10000 = this.I_i1i1lI1Iil11liiI__iI1il___l;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         return i_i1i_lI11l_1i_I_1I__lii_l__i1.l1ii_l1__I_i_l_l11IllIli(var10000);
      }
   }

   public String getName() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.i_ii_II_1I__Ilii_illl1Ii_i1I;
      }
   }

   public String getDescription() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.i11i_111_i1I11l_iIll1ii;
      }
   }

   public i1ii11IIilIl1_1IlliiiI1iii getCategory() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.ii1iIli11_l___ii1l_i_i_II;
      }
   }

   protected void addSettings(liIi1IIl_il1IIlIll1Il_1II... param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         List var10000 = this.IllIi1_1_1lIi_i_11_1__;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         List var10001 = Arrays.asList(var1);
         var10002 = null;
         Thread.currentThread().hashCode();
         var10000.addAll(var10001);
      }
   }

   public List<liIi1IIl_il1IIlIll1Il_1II> getSettings() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.IllIi1_1_1lIi_i_11_1__;
      }
   }
}
