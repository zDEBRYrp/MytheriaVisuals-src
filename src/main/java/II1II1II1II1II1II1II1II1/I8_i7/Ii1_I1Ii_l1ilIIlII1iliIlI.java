package II1II1II1II1II1II1II1II1.I8_i7;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10209;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_293;
import net.minecraft.class_3695;
import net.minecraft.class_4588;
import net.minecraft.class_9801;
import net.minecraft.class_293.class_5596;

@Environment(EnvType.CLIENT)
public final class Ii1_I1Ii_l1ilIIlII1iliIlI {
   private static final class_289 l1i_I1l1_iIIlili_lii11 = new class_289(~155510686 - -690543238 ^ 535294695);
   private static class_287 I_ll_l_llIIliI_i1lli_I;
   private static Ii1_I1Ii_l1ilIIlII1iliIlI.Il_i1_11i1__iIiIi1l1___lIliiI1 IiiI1lli11l1i__1i_iIl1IIl1lIl;
   public static final char[][] l_1ii111_1i1lil_1_i1_11iIii_ = new char[-2123042661 * 187719285 + 522526571][];

   private Ii1_I1Ii_l1ilIIlII1iliIlI() {
   }

   public static class_4588 IiIl_Ii1_I1iili1IlilI_11liIilli(Ii1_I1Ii_l1ilIIlII1iliIlI.Il_i1_11i1__iIiIi1l1___lIliiI1 param0, class_293 nullx) {
      if (I_ll_l_llIIliI_i1lli_I != null && !var0.equals(IiiI1lli11l1i__1i_iIl1IIl1lIl)) {
         l1i_111_IIlI1___1l_IlIil1();
      }

      if (I_ll_l_llIIliI_i1lli_I == null) {
         IiiI1lli11l1i__1i_iIl1IIl1lIl = var0;
         I_ll_l_llIIliI_i1lli_I = l1i_I1l1_iIIlili_lii11.method_60827(class_5596.field_27382, nullx);
      }

      return I_ll_l_llIIliI_i1lli_I;
   }

   public static void l1i_111_IIlI1___1l_IlIil1() {
      class_287 var0 = I_ll_l_llIIliI_i1lli_I;
      Ii1_I1Ii_l1ilIIlII1iliIlI.Il_i1_11i1__iIiIi1l1___lIliiI1 var1 = IiiI1lli11l1i__1i_iIl1IIl1lIl;
      I_ll_l_llIIliI_i1lli_I = null;
      IiiI1lli11l1i__1i_iIl1IIl1lIl = null;
      if (var0 != null) {
         class_9801 var2 = var0.method_60794();
         if (var2 != null) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableCull();
            var1.apply();
            class_3695 var10000 = class_10209.method_64146();
            String var10001 = iiiI1liIl111iI1_l1__ii1IlI11__(2117853355 * -154615157 + 1034120487);
            if (var10001 == null) {
               byte[] var3 = new byte[-1310719336 * 1041496783 + 1745712938];
               var3[2133265880 * 1110887767 + -401321064] = (byte)((1178337280 | 3554) ^ 1178340786);
               var3[~2131676891 - -276867508 ^ -1854809383] = (byte)((-1341521920 | 12437) ^ 1341509478);
               var3[~-1404415429 - -882092669 ^ -2008459197] = (byte)((95289344 | 33711) ^ 95323054);
               var3[~-895291752 - -1216342598 ^ 2111634350] = (byte)(-967078082 * 409151259 + -326405606);
               var3[(309002240 | 49746) ^ 309051990] = (byte)((-1796866048 | 9504) ^ 1796856541);
               var3[(1834156032 | 37962) ^ 1834193999] = (byte)(1258790654 * -398145641 + 1718732397);
               var3[-927562207 * -1086539075 + 621739945] = (byte)(~-1682768507 - 1853684284 ^ 170915798);
               var3[~986930277 - -1757514921 ^ 770584644] = (byte)((-1658191872 | 42253) ^ 1658149529);
               var3[(1060110336 | 10689) ^ 1060121033] = (byte)((-1514405888 | 53874) ^ 1514352110);
               var3[(318308352 | 40811) ^ 318349154] = (byte)(-1989915996 * 1004499473 + 1715340062);
               var3[~-1267502670 - -780558049 ^ 2048060708] = (byte)(~-1064431859 - 1382065048 ^ 317633219);
               var3[(814481408 | 64704) ^ 814546123] = (byte)((505544704 | 57424) ^ -505602143);
               var3[1643104138 * -1627347663 + -8463198] = (byte)(~1762421968 - 1266285570 ^ -1266259831);
               var3[1076508719 * -1658588959 + -2067034434] = (byte)(-1984427494 * 457898399 + -883265566);
               var3[(-1979711488 | 19875) ^ -1979691603] = (byte)(~821954157 - -201589821 ^ -620364290);
               var3[~575158144 - -1535951022 ^ 960792866] = (byte)(~1651600791 - 1758254520 ^ -885112042);
               var3[1910643959 * 736005473 + -1272120455] = (byte)((832765952 | 46597) ^ 832812568);
               var3[(59572224 | 46186) ^ 59618427] = (byte)((-1813970944 | 61192) ^ -1813909752);
               var10001 = IIii1IIlII_IIil_llII_lII(var3, (-1075314688 | 18419) ^ -1075296269);
            }

            var10000.method_39278(var10001);
            class_286.method_43433(var2);
            RenderSystem.setShaderTexture((493748224 | 4803) ^ 493753027, (1759510528 | 51495) ^ 1759562023);
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
         }
      }
   }

   @Environment(EnvType.CLIENT)
   public interface Il_i1_11i1__iIiIi1l1___lIliiI1 {
      void apply();
   }
}
