package II1II1II1II1II1II1II1II1.I6_i5;

import II1II1II1II1II1II1II1II1.I1_i0.I_IlI1I_i_1l_i__il1_iilIliII_i;
import II1II1II1II1II1II1II1II1.I9_i8.I_l_li_i1I111i_lIIi11I;
import II1II1II1II1II1II1II1II1.I9_i8.i_I_I_ii_I1l_1__illlIl1l__li;
import II1II1II1II1II1II1II1II1.l4_I3.I1I_IiI_iIIllilllIil1_;
import II1II1II1II1II1II1II1II1.l4_I3.IlIilI1Ili1_i1i1lIliliII1;
import II1II1II1II1II1II1II1II1.l4_I3.iIIlIIi1iI_1lilll1i11111l_Ii1;
import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_332;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public final class lliII1_Ili_I1Il11l_I1ill {
   private static final String[] Ii_lIlIIIi_Il1_II11il_I1i = new String[-959032848 * 1425817825 + 1088814224];

   private lliII1_Ili_I1Il11l_I1ill() {
   }

   public static void iliiI_1lI11l_iil1iIIl__liI_lIi(
      Matrix4f param0, float nullx, float nullxx, float nullxxx, float nullxxxx, float nullxxxxx, float nullxxxxxx, Color nullxxxxxxx
   ) {
      I_IlI1I_i_1l_i__il1_iilIliII_i.Il_11_I1lIlIllI_1lii1IIl1l1iiI()
         .size(new IlIilI1Ili1_i1i1lIliliII1(nullxxx, nullxxxx))
         .radius(new iIIlIIi1iI_1lilll1i11111l_Ii1(nullxxxxx))
         .blurRadius(nullxxxxxx)
         .smoothness(1.0F)
         .color(new I1I_IiI_iIIllilllIil1_(nullxxxxxxx))
         .build()
         .render(var0, nullx, nullxx);
   }

   public static void i1I1l_1_Ii__il_1_1iIllI1i1(Matrix4f param0, float nullx, float nullxx, float nullxxx, float nullxxxx, float nullxxxxx, Color nullxxxxxx) {
      I_IlI1I_i_1l_i__il1_iilIliII_i.l_lI_i1_Ii1I_1iI1IlIil1l()
         .size(new IlIilI1Ili1_i1i1lIliliII1(nullxxx, nullxxxx))
         .radius(new iIIlIIi1iI_1lilll1i11111l_Ii1(nullxxxxx))
         .smoothness(1.0F)
         .color(new I1I_IiI_iIIllilllIil1_(nullxxxxxx))
         .build()
         .render(var0, nullx, nullxx);
   }

   public static void i_iii1Iii_lI1lIlilII1ilI(
      Matrix4f param0,
      float nullx,
      float nullxx,
      float nullxxx,
      float nullxxxx,
      float nullxxxxx,
      Color nullxxxxxx,
      Color nullxxxxxxx,
      Color nullxxxxxxxx,
      Color nullxxxxxxxxx
   ) {
      I_IlI1I_i_1l_i__il1_iilIliII_i.l_lI_i1_Ii1I_1iI1IlIil1l()
         .size(new IlIilI1Ili1_i1i1lIliliII1(nullxxx, nullxxxx))
         .radius(new iIIlIIi1iI_1lilll1i11111l_Ii1(nullxxxxx))
         .smoothness(1.0F)
         .color(new I1I_IiI_iIIllilllIil1_(nullxxxxxx, nullxxxxxxxxx, nullxxxxxxxx, nullxxxxxxx))
         .build()
         .render(var0, nullx, nullxx);
   }

   public static void i_Ii1ll1_liII1I__I_1l1iiIi1I(
      Matrix4f param0, float nullx, float nullxx, float nullxxx, float nullxxxx, float nullxxxxx, float nullxxxxxx, Color nullxxxxxxx
   ) {
      I_IlI1I_i_1l_i__il1_iilIliII_i.III1iili1_iiI_llil_IiII11i()
         .size(new IlIilI1Ili1_i1i1lIliliII1(nullxxx, nullxxxx))
         .radius(new iIIlIIi1iI_1lilll1i11111l_Ii1(nullxxxxx))
         .thickness(nullxxxxxx)
         .smoothness(1.0F, 1.0F)
         .color(new I1I_IiI_iIIllilllIil1_(nullxxxxxxx))
         .build()
         .render(var0, nullx, nullxx);
   }

   public static void iiII_1_Ii_1I___IiIl1ll(
      Matrix4f param0, i_I_I_ii_I1l_1__illlIl1l__li nullx, String nullxx, float nullxxx, float nullxxxx, float nullxxxxx, Color nullxxxxxx
   ) {
      I_IlI1I_i_1l_i__il1_iilIliII_i.lI1IlIi_i1liII11i1i1li11i11__l()
         .font(nullx)
         .text(nullxx)
         .size(nullxxxxx)
         .thickness(0.0F)
         .smoothness(1.0F)
         .color(nullxxxxxx)
         .build()
         .render(var0, nullxxx, nullxxxx);
   }

   public static void i_l1_IIIII___lllI1_1l1_(
      Matrix4f param0, i_I_I_ii_I1l_1__illlIl1l__li nullx, String nullxx, float nullxxx, float nullxxxx, float nullxxxxx, float nullxxxxxx, Color nullxxxxxxx
   ) {
      if (nullxx != null && !nullxx.isEmpty() && !(nullxxxxxx <= 1.0F)) {
         if (nullx.getWidth(nullxx, nullxxxxx) <= nullxxxxxx) {
            iiII_1_Ii_1I___IiIl1ll(var0, nullx, nullxx, nullxxx, nullxxxx, nullxxxxx, nullxxxxxxx);
         } else {
            float var8 = Math.min(nullxxxxx * Float.intBitsToFloat(1911370411 * -2010248779 + 1778985497), nullxxxxxx);
            float var9 = nullxxx + nullxxxxxx - var8;
            float var10 = nullxxx;
            int var11 = (61931520 | 56423) ^ -61987944;

            for (int var12 = (-1472921600 | 45983) ^ -1472875617; var12 < nullxx.length(); var12++) {
               char var13 = nullxx.charAt(var12);
               I_l_li_i1I111i_lIIi11I var14 = nullx.glyph(var13);
               if (var14 != null) {
                  var10 += nullx.getKerning(var11, var13, nullxxxxx);
                  var11 = var13;
                  float var15 = var10 <= var9 ? 1.0F : 1.0F - (var10 - var9) / var8;
                  if (var15 <= Float.intBitsToFloat(724440701 * -1834621463 + -318599611)) {
                     break;
                  }

                  iiII_1_Ii_1I___IiIl1ll(
                     var0, nullx, I1il_il1l1illIi1__11__1lI11(var13), var10, nullxxxx, nullxxxxx, IiIi1ll1llIi_ll_i1IlIll1i11(nullxxxxxxx, var15)
                  );
                  var10 += var14.getWidth(nullxxxxx);
               }
            }
         }
      }
   }

   private static String I1il_il1l1illIi1__11__1lI11(char param0) {
      return var0 < Ii_lIlIIIi_Il1_II11il_I1i.length ? Ii_lIlIIIi_Il1_II11il_I1i[var0] : String.valueOf(var0);
   }

   public static void Ii1ii1_1_llI1l1iiIIll_111IIiii_(class_332 param0, float nullx, float nullxx, float nullxxx, float nullxxxx) {
      var0.method_44379(
         (int)Math.floor((double)nullx),
         (int)Math.floor((double)nullxx),
         (int)Math.ceil((double)(nullx + nullxxx)),
         (int)Math.ceil((double)(nullxx + nullxxxx))
      );
   }

   public static Color IiIi1ll1llIi_ll_i1IlIll1i11(Color param0, float nullx) {
      return new Color(
         var0.getRed(),
         var0.getGreen(),
         var0.getBlue(),
         (int)lli_1Ii11i1Ii1_l__Ii______I((float)var0.getAlpha() * nullx, 0.0F, Float.intBitsToFloat((1405157376 | 48857) ^ 280936153))
      );
   }

   public static Color Ili__I1l1l_iIIil__l1i1I_l1l1I(Color param0, Color nullx, float nullxx) {
      float var3 = lli_1Ii11i1Ii1_l__Ii______I(nullxx, 0.0F, 1.0F);
      return new Color(
         (int)((float)var0.getRed() + (float)(nullx.getRed() - var0.getRed()) * var3),
         (int)((float)var0.getGreen() + (float)(nullx.getGreen() - var0.getGreen()) * var3),
         (int)((float)var0.getBlue() + (float)(nullx.getBlue() - var0.getBlue()) * var3),
         (int)((float)var0.getAlpha() + (float)(nullx.getAlpha() - var0.getAlpha()) * var3)
      );
   }

   public static float lli_1Ii11i1Ii1_l__Ii______I(float param0, float nullx, float nullxx) {
      return Math.max(nullx, Math.min(Math.max(nullx, nullxx), var0));
   }

   public static float i_IiIiiiIIllI_iII1i1ii1il1l(float param0) {
      float var1 = lli_1Ii11i1Ii1_l__Ii______I(var0, 0.0F, 1.0F);
      float var2 = 1.0F - var1;
      return 1.0F - var2 * var2 * var2;
   }

   static {
      for (int var0 = -1897294138 * 1150348653 + 2123726770; var0 < Ii_lIlIIIi_Il1_II11il_I1i.length; var0++) {
         Ii_lIlIIIi_Il1_II11il_I1i[var0] = String.valueOf((char)var0);
      }
   }
}
