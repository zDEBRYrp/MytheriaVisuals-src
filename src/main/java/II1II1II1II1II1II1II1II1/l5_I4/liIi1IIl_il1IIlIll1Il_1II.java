package II1II1II1II1II1II1II1II1.l5_I4;

import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public abstract class liIi1IIl_il1IIlIll1Il_1II {
   private final String Il_i_1IiI11I_i__i_Iil_Ii_1lI;
   private BooleanSupplier l_i1_l1ii1I_i_II_llIll11lI;

   protected liIi1IIl_il1IIlIll1Il_1II(String param1) {
      Object var10001 = null;
      Thread.currentThread().hashCode();
      this.l_i1_l1ii1I_i_II_llIll11lI = () -> {
         int var1 = System.identityHashCode(null);
         if ((var1 * (var1 + 1) & 1) != 0) {
            throw new Error("unreachable");
         } else {
            return (boolean)(~-1938472075 - -1406324680 ^ -950170541);
         }
      };
      this.Il_i_1IiI11I_i__i_Iil_Ii_1lI = var1;
   }

   public liIi1IIl_il1IIlIll1Il_1II visibleWhen(BooleanSupplier param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         this.l_i1_l1ii1I_i_II_llIll11lI = var1;
         return this;
      }
   }

   public boolean isVisible() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         BooleanSupplier var10000 = this.l_i1_l1ii1I_i_II_llIll11lI;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         return var10000.getAsBoolean();
      }
   }

   public String getName() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.Il_i_1IiI11I_i__i_Iil_Ii_1lI;
      }
   }
}
