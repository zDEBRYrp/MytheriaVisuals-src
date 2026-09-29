package II1II1II1II1II1II1II1II1.l2_I1;

import II1II1II1II1II1II1II1II1.l1_I0.lli_11I__lI_i1li1Ii11i_;
import II1II1II1II1II1II1II1II1.l4_I3.IIlli1_I_iII1ll1iillii1_l_;
import II1II1II1II1II1II1II1II1.l5_I4.i_i1i_lI11l_1i_I_1I__lii_l__i1;
import II1II1II1II1II1II1II1II1.l5_I4.liIi1IIl_il1IIlIll1Il_1II;
import II1II1II1II1II1II1II1II1.l8_I7.I_i1iii1l_i1Il1_l11_IIiI1ll____;
import II1II1II1II1II1II1II1II1.l9_I8.i1ii11IIilIl1_1IlliiiI1iii;
import II1II1II1II1II1II1II1II1.l9_I8.liiil1liIil1l11iil11li1iI;
import II1II1II1II1II1II1II1II1.l9_I8.llllIlilI_ll_1li_l_i_1_1lI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public abstract class Ii_IIliiIiIIIlI_i_iI1iiII_ extends liiil1liIil1l11iil11li1iI {
   private final List<Ii_IIliiIiIIIlI_i_iI1iiII_.l1i1IIII11I1_li11IlliiI> illl1Ill1i11Il11_iIl1_1IiI111_i = new ArrayList<>();

   protected Ii_IIliiIiIIIlI_i_iI1iiII_(String param1, String nullx, Map<String, class_1792> nullxx) {
      super(var1, nullx, i1ii11IIilIl1_1IlliiiI1iii.UTILS);
      ArrayList var4 = new ArrayList();
      Object var10003 = null;
      Thread.currentThread().hashCode();
      nullxx.forEach((nullxxxx, nullxxx) -> {
         int var5 = System.identityHashCode(null);
         if ((var5 * (var5 + 1) & 1) != 0) {
            throw new Error("unreachable");
         } else {
            int var10003x = -1729628810 * -930105359 + -264203799;
            Object var10004 = null;
            Thread.currentThread().hashCode();
            i_i1i_lI11l_1i_I_1I__lii_l__i1 var6 = new i_i1i_lI11l_1i_I_1I__lii_l__i1(nullxxxx, var10003x);
            List var10000 = this.illl1Ill1i11Il11_iIl1_1IiI111_i;
            Object var10005 = null;
            Thread.currentThread().hashCode();
            Ii_IIliiIiIIIlI_i_iI1iiII_.l1i1IIII11I1_li11IlliiI var10001 = new Ii_IIliiIiIIIlI_i_iI1iiII_.l1i1IIII11I1_li11IlliiI(var6, nullxxx);
            Object var10002 = null;
            Thread.currentThread().hashCode();
            var10000.add(var10001);
            var10002 = null;
            Thread.currentThread().hashCode();
            var4.add(var6);
         }
      });
      this.addSettings(var4.toArray(new liIi1IIl_il1IIlIll1Il_1II[~688263069 - 410254944 ^ -1098518014]));
   }

   public void onTick(llllIlilI_ll_1li_l_i_1_1lI param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else if (I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724 != null && I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1755 == null) {
         List var9 = this.illl1Ill1i11Il11_iIl1_1IiI111_i;
         Object var16 = null;
         Thread.currentThread().hashCode();
         Iterator var7 = var9.iterator();

         while (true) {
            var16 = null;
            Thread.currentThread().hashCode();
            if (!var7.hasNext()) {
               return;
            }

            Ii_IIliiIiIIIlI_i_iI1iiII_.l1i1IIII11I1_li11IlliiI var8;
            label32: {
               var16 = null;
               Thread.currentThread().hashCode();
               var8 = (Ii_IIliiIiIIIlI_i_iI1iiII_.l1i1IIII11I1_li11IlliiI)var7.next();
               i_i1i_lI11l_1i_I_1I__lii_l__i1 var10 = var8.i__l1I_1ii11lI1IIiIi11_l_1;
               var16 = null;
               Thread.currentThread().hashCode();
               if (var10.getKey() != ((1130364928 | 27951) ^ -1130392880)) {
                  i_i1i_lI11l_1i_I_1I__lii_l__i1 var11 = var8.i__l1I_1ii11lI1IIiIi11_l_1;
                  var16 = null;
                  Thread.currentThread().hashCode();
                  int var12 = var11.getKey();
                  var16 = null;
                  Thread.currentThread().hashCode();
                  if (lli_11I__lI_i1li1Ii11i_.i_i_1_lili1II_I_I_11__1(var12)) {
                     var13 = 1022571439 * 933897845 + 536307462;
                     break label32;
                  }
               }

               var13 = -441118559 * 289227273 + -1761875881;
            }

            int var5 = var13;
            if (var5 != 0 && !var8.lll1IIiIi1iI_II1_i_iiI1IlI) {
               var16 = var8.IIlI_lil__iI__I1__lili1;
               Object var10002 = null;
               Thread.currentThread().hashCode();
               this.I11l1il_iI_ililIIiIIliI((class_1792)var16);
            }

            var8.lll1IIiIi1iI_II1_i_iiI1IlI = (boolean)var5;
         }
      } else {
         List var10000 = this.illl1Ill1i11Il11_iIl1_1IiI111_i;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         Iterator var6 = var10000.iterator();

         while (true) {
            var10001 = null;
            Thread.currentThread().hashCode();
            if (!var6.hasNext()) {
               return;
            }

            var10001 = null;
            Thread.currentThread().hashCode();
            Ii_IIliiIiIIIlI_i_iI1iiII_.l1i1IIII11I1_li11IlliiI var4 = (Ii_IIliiIiIIIlI_i_iI1iiII_.l1i1IIII11I1_li11IlliiI)var6.next();
            var4.lll1IIiIi1iI_II1_i_iiI1IlI = (boolean)(~-174997683 - 248541424 ^ -73543742);
         }
      }
   }

   private void I11l1il_iI_ililIIiIIliI(class_1792 param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         class_746 var10000 = I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         class_1661 var4 = var10000.method_31548();
         var10001 = null;
         Thread.currentThread().hashCode();
         class_1799 var5 = var4.method_7391();
         Object var10002 = null;
         Thread.currentThread().hashCode();
         if (!var5.method_31574(var1)) {
            var10001 = null;
            Thread.currentThread().hashCode();
            int var6 = IIlli1_I_iII1ll1iillii1_l_.i1IiIli1I1Ii11llIi___liI_(var1);
            var10001 = null;
            Thread.currentThread().hashCode();
            IIlli1_I_iII1ll1iillii1_l_.Ii1l11iii1lll11___il_1_1_l_1(var6);
         }
      }
   }

// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "varName" is null
//   at org.jetbrains.java.decompiler.main.InitializerProcessor.isExprentIndependent(InitializerProcessor.java:423)
//   at org.jetbrains.java.decompiler.main.InitializerProcessor.extractDynamicInitializers(InitializerProcessor.java:335)
//   at org.jetbrains.java.decompiler.main.InitializerProcessor.extractInitializers(InitializerProcessor.java:44)
//   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:97)
//   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:348)
//   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:492)
//   at org.jetbrains.java.decompiler.main.ClassesProcessor.writeClass(ClassesProcessor.java:474)
//   at org.jetbrains.java.decompiler.main.Fernflower.getClassContent(Fernflower.java:191)
//   at org.jetbrains.java.decompiler.struct.ContextUnit.lambda$save$3(ContextUnit.java:187)
}
