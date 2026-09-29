package II1II1II1II1II1II1II1II1.l1_I0;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class i_Illl11Ii_l_11IIiiIIlIli {
   private static final List<llli1lii1I__l__1l_1llI1I11i> I11Illl_I1111111illIl1iil = new CopyOnWriteArrayList<>();

   private i_Illl11Ii_l_11IIiiIIlIli() {
   }

   public static List<llli1lii1I__l__1l_1llI1I11i> li111IlIl_I_liI1il111II___ii() {
      int var1 = System.identityHashCode(null);
      if ((var1 * (var1 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return I11Illl_I1111111illIl1iil;
      }
   }

   public static int ilIIIlI__lIi_1iiIi1Iil_1() {
      int var1 = System.identityHashCode(null);
      if ((var1 * (var1 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         List var10000 = I11Illl_I1111111illIl1iil;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         return var10000.size();
      }
   }

   public static llli1lii1I__l__1l_1llI1I11i l_Ill_iiIiil1IlIIii1__ll_Ii11(
      String param0, double nullx, double nullxx, double nullxxx, boolean nullxxxx, long nullxxxxx
   ) {
      int var11 = System.identityHashCode(null);
      if ((var11 * (var11 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10001 = null;
         Thread.currentThread().hashCode();
         l_I___IIiI11l1_Il1_ii_II1__(var0);
         Object var10008 = null;
         Thread.currentThread().hashCode();
         llli1lii1I__l__1l_1llI1I11i var12 = new llli1lii1I__l__1l_1llI1I11i(var0, nullx, nullxx, nullxxx, nullxxxx, nullxxxxx);
         List var10000 = I11Illl_I1111111illIl1iil;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         var10000.add(var12);
         return var12;
      }
   }

   public static boolean l_I___IIiI11l1_Il1_ii_II1__(String param0) {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         List var10000 = I11Illl_I1111111illIl1iil;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         Predicate var10001 = nullxx -> {
            int var3x = System.identityHashCode(null);
            if ((var3x * (var3x + 1) & 1) != 0) {
               throw new Error("unreachable");
            } else {
               Object var10001x = null;
               Thread.currentThread().hashCode();
               String var10000x = nullxx.getName();
               Object var10002x = null;
               Thread.currentThread().hashCode();
               return var10000x.equalsIgnoreCase(var0);
            }
         };
         var10002 = null;
         Thread.currentThread().hashCode();
         return var10000.removeIf(var10001);
      }
   }

   public static void IlI1li_IIlII11i_I1_11l1illl() {
      int var1 = System.identityHashCode(null);
      if ((var1 * (var1 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         List var10000 = I11Illl_I1111111illIl1iil;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         var10000.clear();
      }
   }

   public static void il_I1lill1lI11IiiIilI1_1ll_1() {
      int var1 = System.identityHashCode(null);
      if ((var1 * (var1 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         List var10000 = I11Illl_I1111111illIl1iil;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         var10001 = llli1lii1I__l__1l_1llI1I11i::isEvent;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         var10000.removeIf((Predicate)var10001);
      }
   }

   public static void l__IiIliil_iI_i_1_I1i__II_Iil1() {
      int var1 = System.identityHashCode(null);
      if ((var1 * (var1 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         List var10000 = I11Illl_I1111111illIl1iil;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         var10001 = llli1lii1I__l__1l_1llI1I11i::isExpired;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         var10000.removeIf((Predicate)var10001);
      }
   }

   public static String lilI1I_lilli_i__ii_11__lii__l(String param0) {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         if (var0 != null) {
            Object var10001 = null;
            Thread.currentThread().hashCode();
            if (!var0.isEmpty()) {
               var10001 = null;
               Thread.currentThread().hashCode();
               String var3 = var0.trim();
               int var6 = (-1168310272 | 49494) ^ -1168260778;
               int var10002 = 1475229914 * 150048795 + 1688953091;
               Object var10003 = null;
               Thread.currentThread().hashCode();
               String var10000 = var3.substring(var6, var10002);
               var10001 = Locale.ROOT;
               Object var9 = null;
               Thread.currentThread().hashCode();
               var10000 = var10000.toUpperCase((Locale)var10001);
               var10002 = ~1493240022 - -1076967329 ^ -416272693;
               var10003 = null;
               Thread.currentThread().hashCode();
               var10001 = var3.substring(var10002);
               Object var11 = null;
               Thread.currentThread().hashCode();
               return var10000 + var10001;
            }
         }

         return var0;
      }
   }
}
