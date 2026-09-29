package II1II1II1II1II1II1II1II1.l9_I8;

import II1II1II1II1II1II1II1II1.I8_i7.i1II1iil__ii1iii1_l1IiII;
import II1II1II1II1II1II1II1II1.l5_I4.IIil_llIl1l_Iili_I1III;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4587;

@Environment(EnvType.CLIENT)
public interface I__lllIliii1_1lIiIli_l1iiII_l1_ {
   List<I__lllIliii1_1lIiIli_l1iiII_l1_> ELEMENTS = new ArrayList<>();
   float BASE_SCALE = 1.25F;
   float[] EMPTY_BOUNDS = new float[-2075169613 * 409453877 + -119291915];
   float POP_DEPTH = 0.08F;
   float DRAG_TAU = 26.0F;
   float SETTLE_TAU = 110.0F;

   String name();

   float[] bounds();

   void moveTo(float var1, float var2);

   default boolean click(float param1, float nullx) {
      return (boolean)(~-999084289 - -1509118191 ^ -1786764817);
   }

   static void register(I__lllIliii1_1lIiIli_l1iiII_l1_ param0) {
      if (!ELEMENTS.contains(var0)) {
         ELEMENTS.add(var0);
      }
   }

   default void savePosition(float param1, float nullx) {
      JsonObject var3 = i1II1iil__ii1iii1_l1IiII.iIl_li1l_I_llI_l_1_1____i("hud");
      JsonObject var4 = new JsonObject();
      var4.addProperty("x", var1);
      var4.addProperty("y", nullx);
      var3.add(this.name(), var4);
      i1II1iil__ii1iii1_l1IiII.llIl_IlI1ll1__Il__IlIl__ll();
   }

   default float[] loadPosition() {
      JsonObject var1 = i1II1iil__ii1iii1_l1IiII.iIl_li1l_I_llI_l_1_1____i("hud");
      if (var1.has(this.name()) && var1.get(this.name()).isJsonObject()) {
         JsonObject var2 = var1.getAsJsonObject(this.name());
         if (var2.has("x") && var2.has("y")) {
            float[] var10000 = new float[1172854864 * -24336645 + 539855250];
            var10000[634131613 * -1849942591 + 1384295587] = var2.get("x").getAsFloat();
            var10000[(298778624 | 26572) ^ 298805197] = var2.get("y").getAsFloat();
            return var10000;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   static float scale(IIil_llIl1l_Iili_I1III param0) {
      String var1 = var0.getValue();

      try {
         float var2 = Float.parseFloat(
            var1.endsWith("%") ? var1.substring(-1358559612 * -2129292197 + 1078157076, var1.length() - ((-136970240 | 41261) ^ -136928980)) : var1
         );
         return var2 / Float.intBitsToFloat((-1586692096 | 13592) ^ -475712232) * Float.intBitsToFloat(~1186416608 - 1270613385 ^ 1378661014);
      } catch (NumberFormatException var3) {
         return Float.intBitsToFloat(1499316893 * 1368175811 + 629300841);
      }
   }

   static float corner(float param0, float nullx) {
      return Math.min(var0, nullx * Float.intBitsToFloat(~2052019706 - -238281725 ^ -1392318364));
   }

   static float follow(float param0, float nullx, float nullxx, float nullxxx) {
      if (!(nullxxx <= 0.0F) && !(nullxx <= 0.0F)) {
         float var4 = 1.0F - (float)Math.exp((double)(-nullxxx / nullxx));
         float var5 = var0 + (nullx - var0) * var4;
         return Math.abs(nullx - var5) < Float.intBitsToFloat((-872480768 | 55487) ^ -243479856) ? nullx : var5;
      } else {
         return nullx;
      }
   }

   static int fade(Color param0, float nullx) {
      int var2 = (int)clamp((float)var0.getAlpha() * nullx, 0.0F, Float.intBitsToFloat(~1344943894 - -126394478 ^ -199136937));
      return var2 << (~-755636420 - -1612019739 ^ -1927311162)
         | var0.getRed() << ((1762918400 | 3307) ^ 1762921723)
         | var0.getGreen() << (~1491366594 - -1372999576 ^ -118367011)
         | var0.getBlue();
   }

   static float clamp(float param0, float nullx, float nullxx) {
      return Math.max(nullx, Math.min(Math.max(nullx, nullxx), var0));
   }

   static float easeOutCubic(float param0) {
      float var1 = clamp(var0, 0.0F, 1.0F);
      float var2 = 1.0F - var1;
      return 1.0F - var2 * var2 * var2;
   }

   static float easeOutBack(float param0) {
      float var1 = clamp(var0, 0.0F, 1.0F) - 1.0F;
      return 1.0F + var1 * var1 * (Float.intBitsToFloat((1178992640 | 40387) ^ 107641715) * var1 + Float.intBitsToFloat((425525248 | 1485) ^ 646236333));
   }

   static float pop(float param0) {
      return Float.intBitsToFloat((136052736 | 10555) ^ 930589732) + Float.intBitsToFloat(~-348970834 - 529184028 ^ -924713665) * easeOutBack(var0);
   }

   static void appear(class_4587 param0, float nullx, float nullxx, float nullxxx, float nullxxxx, float nullxxxxx, float nullxxxxxx) {
      var0.method_46416(nullx, nullxx, 0.0F);
      var0.method_22905(nullxxxxx, nullxxxxx, 1.0F);
      var0.method_46416(-nullx, -nullxx, 0.0F);
      float var7 = pop(nullxxxxxx);
      float var8 = nullx + nullxxx * nullxxxxx * Float.intBitsToFloat(~-1901473582 - 381609226 ^ 1704413731);
      float var9 = nullxx + nullxxxx * nullxxxxx * Float.intBitsToFloat((1889009664 | 21468) ^ 1335383004);
      var0.method_46416(var8, var9, 0.0F);
      var0.method_22905(var7, var7, 1.0F);
      var0.method_46416(-var8, -var9, 0.0F);
   }

   static float followDrag(float param0, float nullx, float nullxx, boolean nullxxx) {
      return follow(
         var0,
         nullx,
         nullxxx ? Float.intBitsToFloat(~-1787036692 - -1511132796 ^ -2059005297) : Float.intBitsToFloat(-37958290 * -190681567 + -1784397614),
         nullxx
      );
   }

   static float frameDelta() {
      return I__lllIliii1_1lIiIli_l1iiII_l1_.Il1l1I__li11_I111il1ill_1l__1.i_l__Ii_1__l_i_li1_I___i_l;
   }

   static void beginFrame() {
      I__lllIliii1_1lIiIli_l1iiII_l1_.Il1l1I__li11_I111il1ill_1l__1.lIiliilll_l1I1__il1II__li();
   }

   @Environment(EnvType.CLIENT)
   public static final class Il1l1I__li11_I111il1ill_1l__1 {
      private static long l1__lI_lliliIll_I_1i11iI = ~4357486655218465085L - 5561399469412724280L ^ -8527857949078362251L;
      private static float i_l__Ii_1__l_i_li1_I___i_l;

      private Il1l1I__li11_I111il1ill_1l__1() {
      }

      private static void lIiliilll_l1I1__il1II__li() {
         long var0 = System.nanoTime();
         i_l__Ii_1__l_i_li1_I___i_l = l1__lI_lliliIll_I_1i11iI < 0L
            ? 0.0F
            : Math.min(
               Float.intBitsToFloat(~-1883936631 - 1451963294 ^ 1534551000),
               (float)(var0 - l1__lI_lliliIll_I_1i11iI) / Float.intBitsToFloat(-2015017495 * 1059241067 + 2102841245)
            );
         l1__lI_lliliIll_I_1i11iI = var0;
      }
   }
}
