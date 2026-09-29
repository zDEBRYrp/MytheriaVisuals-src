package II1II1II1II1II1II1II1II1.l7_I6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class i_ii_i1i1il1ll_1II_lII1_1l1liI_ {
   private final Map<Class<?>, List<l_IiI1_i___l1I1__1lIll_1__>> lIiI1liII_iil1i1i1_l1IliII_Il1 = new ConcurrentHashMap<>();
   private final Map<Class<?>, List<l_IiI1_i___l1I1__1lIll_1__>> iIliIiIiIiliiI_1lil1ll1___I_1 = new ConcurrentHashMap<>();
   private final Lookup ll_l_1lI1Il_I_i_I_1i_l_11II = MethodHandles.lookup();

   public <T extends li11lI11II__l1_iIiI1llIl_1_IIli> T call(T param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Map var10000 = this.iIliIiIiIiliiI_1lil1ll1___I_1;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         Class var10001 = var1.getClass();
         Object var10003 = null;
         Thread.currentThread().hashCode();
         var10002 = (Function<Class, List>)nullx -> {
            int var3x = System.identityHashCode(null);
            if ((var3x * (var3x + 1) & 1) != 0) {
               throw new Error("unreachable");
            } else {
               Object var10002x = null;
               Thread.currentThread().hashCode();
               ArrayList var4x = new ArrayList();
               Map var10000x = this.lIiI1liII_iil1i1i1_l1IliII_Il1;
               Object var10003x = null;
               Thread.currentThread().hashCode();
               BiConsumer var10001x = (nullxxxx, nullxxxxx) -> {
                  int var5xx = System.identityHashCode(null);
                  if ((var5xx * (var5xx + 1) & 1) != 0) {
                     throw new Error("unreachable");
                  } else {
                     Object var10002xx = null;
                     Thread.currentThread().hashCode();
                     if (nullxxxx.isAssignableFrom(nullx)) {
                        var10002xx = null;
                        Thread.currentThread().hashCode();
                        var4x.addAll(nullxxxxx);
                     }
                  }
               };
               var10002x = null;
               Thread.currentThread().hashCode();
               var10000x.forEach(var10001x);
               var10001x = null;
               Thread.currentThread().hashCode();
               ToIntFunction var6 = nullxx -> {
                  int var2 = System.identityHashCode(null);
                  if ((var2 * (var2 + 1) & 1) != 0) {
                     throw new Error("unreachable");
                  } else {
                     Object var10001xx = null;
                     Thread.currentThread().hashCode();
                     liI1i1I1iiI___lllll1I_IiI var10000xx = nullxx.priority();
                     var10001xx = null;
                     Thread.currentThread().hashCode();
                     return var10000xx.ordinal();
                  }
               };
               var10002x = null;
               Thread.currentThread().hashCode();
               Comparator var7x = Comparator.comparingInt(var6);
               var10002x = null;
               Thread.currentThread().hashCode();
               var4x.sort(var7x);
               return var4x;
            }
         };
         var10003 = null;
         Thread.currentThread().hashCode();
         List var8 = (List)var10000.computeIfAbsent(var10001, (Function)var10002);
         var10001 = null;
         Thread.currentThread().hashCode();
         Iterator var4 = var8.iterator();

         while (true) {
            var10001 = null;
            Thread.currentThread().hashCode();
            if (!var4.hasNext()) {
               return (T)var1;
            }

            var10001 = null;
            Thread.currentThread().hashCode();
            l_IiI1_i___l1I1__1lIll_1__ var5 = (l_IiI1_i___l1I1__1lIll_1__)var4.next();

            try {
               var10001 = null;
               Thread.currentThread().hashCode();
               MethodHandle var9 = var5.methodHandle();
               var10002 = null;
               Thread.currentThread().hashCode();
               var9.invoke((li11lI11II__l1_iIiI1llIl_1_IIli)var1);
            } catch (Throwable var7) {
               var10003 = null;
               Thread.currentThread().hashCode();
               throw new RuntimeException(var7);
            }

            if (1148013376 * 522988229 + -722986946 != 922486443 * 2077788715 + 958804933) {
            }

            if (((-1955463168 | 30628) ^ -1611590002) != (~322024956 - -1219786670 ^ 553754779)) {
            }
         }
      }
   }

   public void register(Object param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10002 = null;
         Thread.currentThread().hashCode();
         HashSet var13 = new HashSet();
         Object var10001 = null;
         Thread.currentThread().hashCode();
         Class var4 = var1.getClass();

         while (var4 != null && var4 != Object.class) {
            var10001 = null;
            Thread.currentThread().hashCode();
            Method[] var5 = var4.getDeclaredMethods();
            int var6 = var5.length;
            int var7 = (1059192832 | 41782) ^ 1059234614;

            while (var7 < var6) {
               Method var8 = var5[var7];
               var10001 = null;
               Thread.currentThread().hashCode();
               if (var8.getParameterCount() != 793844156 * -1161700365 + -1237008755) {
                  if (749324108 * -1384085093 + 717320099 != 1176004199 * 1845886755 + -304403054) {
                  }
               } else {
                  var10001 = null;
                  Thread.currentThread().hashCode();
                  Class var9 = var8.getParameterTypes()[~-1884072317 - -1789817690 ^ -621077290];
                  var10002 = null;
                  Thread.currentThread().hashCode();
                  if (!li11lI11II__l1_iIiI1llIl_1_IIli.class.isAssignableFrom(var9)) {
                     if (-1005218499 * -1820700255 + -259416601 != ((-1238761472 | 51983) ^ -1974727349)) {
                     }
                  } else {
                     var10002 = null;
                     Thread.currentThread().hashCode();
                     var10001 = var8.getName();
                     Object var10003 = null;
                     Thread.currentThread().hashCode();
                     var10002 = var9.getName();
                     var10003 = null;
                     Thread.currentThread().hashCode();
                     var10001 = var10001 + "(" + var10002 + ")";
                     var10002 = null;
                     Thread.currentThread().hashCode();
                     if (!var13.add(var10001)) {
                        if (1116441953 * 457473659 + 98685950 != (~1665709340 - -1294732803 ^ -1632950401)) {
                        }
                     } else {
                        try {
                           int var25 = (1061355520 | 58417) ^ 1061413936;
                           var10002 = null;
                           Thread.currentThread().hashCode();
                           var8.setAccessible((boolean)var25);
                           Lookup var10000 = this.ll_l_1lI1Il_I_i_I_1i_l_11II;
                           var10002 = null;
                           Thread.currentThread().hashCode();
                           MethodHandle var14 = var10000.unreflect(var8);
                           var10002 = null;
                           Thread.currentThread().hashCode();
                           MethodHandle var10 = var14.bindTo(var1);
                           var10002 = null;
                           Thread.currentThread().hashCode();
                           liI1i1I1iiI___lllll1I_IiI var16;
                           if (var8.isAnnotationPresent(l1__lil1_l_I_liI1__1il_lII.class)) {
                              var10002 = null;
                              Thread.currentThread().hashCode();
                              l1__lil1_l_I_liI1__1il_lII var15 = var8.getAnnotation(l1__lil1_l_I_liI1__1il_lII.class);
                              var10001 = null;
                              Thread.currentThread().hashCode();
                              var16 = var15.priority();
                              if ((~-209840886 - 1986380309 ^ -1386129550) != ((182517760 | 14923) ^ 832325081)) {
                              }
                           } else {
                              var16 = liI1i1I1iiI___lllll1I_IiI.low;
                           }

                           liI1i1I1iiI___lllll1I_IiI var11 = var16;
                           Map var17 = this.lIiI1liII_iil1i1i1_l1IliII_Il1;
                           var10002 = null;
                           Thread.currentThread().hashCode();
                           var10002 = (Function<Class, List>)nullx -> {
                              int var2 = System.identityHashCode(null);
                              if ((var2 * (var2 + 1) & 1) != 0) {
                                 throw new Error("unreachable");
                              } else {
                                 Object var10002x = null;
                                 Thread.currentThread().hashCode();
                                 return new ArrayList();
                              }
                           };
                           var10003 = null;
                           Thread.currentThread().hashCode();
                           List var18 = (List)var17.computeIfAbsent(var9, (Function)var10002);
                           Object var10006 = null;
                           Thread.currentThread().hashCode();
                           var10001 = new l_IiI1_i___l1I1__1lIll_1__(var10, var11, var1);
                           var10002 = null;
                           Thread.currentThread().hashCode();
                           var18.add(var10001);
                           Map var19 = this.iIliIiIiIiliiI_1lil1ll1___I_1;
                           var10001 = null;
                           Thread.currentThread().hashCode();
                           var19.clear();
                        } catch (IllegalAccessException var12) {
                           var10003 = null;
                           Thread.currentThread().hashCode();
                           throw new RuntimeException(var12);
                        }

                        if (((-796917760 | 16731) ^ 1296060753) != (~1767198515 - 1257436916 ^ -696800814)) {
                        }
                     }
                  }
               }

               var7++;
               if ((~2115425368 - 484188959 ^ -189863894) != (~-44940221 - 1541425003 ^ 929993971)) {
               }
            }

            var10001 = null;
            Thread.currentThread().hashCode();
            var4 = var4.getSuperclass();
            if (((-1114112000 | 28670) ^ -1892369229) != ((-1974468608 | 38873) ^ -1191426924)) {
            }
         }
      }
   }

   public void unregister(Object param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Map var10000 = this.lIiI1liII_iil1i1i1_l1IliII_Il1;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         Collection var4 = var10000.values();
         Object var10002 = null;
         Thread.currentThread().hashCode();
         var10001 = (Consumer<List>)nullxx -> {
            int var3x = System.identityHashCode(null);
            if ((var3x * (var3x + 1) & 1) != 0) {
               throw new Error("unreachable");
            } else {
               Object var10002x = null;
               Thread.currentThread().hashCode();
               Predicate var10001x = nullxxxx -> {
                  int var3xx = System.identityHashCode(null);
                  if ((var3xx * (var3xx + 1) & 1) != 0) {
                     throw new Error("unreachable");
                  } else {
                     Object var10001xx = null;
                     Thread.currentThread().hashCode();
                     return (boolean)(nullxxxx.owner() == var0 ? ~-687616643 - -2023021277 ^ -1584329378 : -1082267770 * 1536035093 + -818656254);
                  }
               };
               var10002x = null;
               Thread.currentThread().hashCode();
               nullxx.removeIf(var10001x);
            }
         };
         var10002 = null;
         Thread.currentThread().hashCode();
         var4.forEach((Consumer)var10001);
         var10000 = this.iIliIiIiIiliiI_1lil1ll1___I_1;
         var10001 = null;
         Thread.currentThread().hashCode();
         var10000.clear();
      }
   }
}
