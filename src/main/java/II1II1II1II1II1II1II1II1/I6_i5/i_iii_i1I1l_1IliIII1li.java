package II1II1II1II1II1II1II1II1.I6_i5;

import II1II1II1II1II1II1II1II1.I2_i1.Ili_li1lli_Ii1111i1i_iI__ll1Ii;
import II1II1II1II1II1II1II1II1.I2_i1.i_ilIii1lIil1__lli1lIIi_i1;
import II1II1II1II1II1II1II1II1.I3_i2.il_l_li__li_i1lI1iII_I_iI_l1Ii1;
import II1II1II1II1II1II1II1II1.I8_i7.I11i11Ii1illli1iliI_1I_II_;
import II1II1II1II1II1II1II1II1.I8_i7.Ii1_I1Ii_l1ilIIlII1iliIlI;
import II1II1II1II1II1II1II1II1.I8_i7.i___I1II11i_IlIil__IlI__IIi;
import II1II1II1II1II1II1II1II1.I9_i8.i_I_I_ii_I1l_1__illlIl1l__li;
import II1II1II1II1II1II1II1II1.l1_I0.lli_11I__lI_i1li1Ii11i_;
import II1II1II1II1II1II1II1II1.l3_I2.IlI11_1i_IlIIli1lI_Il_il;
import II1II1II1II1II1II1II1II1.l5_I4.IIil_llIl1l_Iili_I1III;
import II1II1II1II1II1II1II1II1.l5_I4.IiiI_Ii11l1I1__11ll1I1;
import II1II1II1II1II1II1II1II1.l5_I4.Il1_1_i1i_1__ll1_1_111i_11i1i;
import II1II1II1II1II1II1II1II1.l5_I4.i_i1i_lI11l_1i_I_1I__lii_l__i1;
import II1II1II1II1II1II1II1II1.l5_I4.l1Iil1_lllilIi1IIIi_i1l_1__i;
import II1II1II1II1II1II1II1II1.l5_I4.liIi1IIl_il1IIlIll1Il_1II;
import II1II1II1II1II1II1II1II1.l9_I8.I__lllIliii1_1lIiIli_l1iiII_l1_;
import II1II1II1II1II1II1II1II1.l9_I8.i1ii11IIilIl1_1IlliiiI1iii;
import II1II1II1II1II1II1II1II1.l9_I8.liiil1liIil1l11iil11li1iI;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public class i_iii_i1I1l_1IliIII1li extends class_437 {
   private final II1_ll_ll1Ill__1IIIl_iii iI___11lIl1ilI_i1iiI_Il_i_lll;
   private float illilIl_IIII1i1IlIIi_i1iI____;
   private final i1ii11IIilIl1_1IlliiiI1iii[] i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i;
   private final float[] I1lIiil1Ii_Ii__II_II1l_;
   private final float[] ii_1_11llliI1lil_11i1l;
   private final float[] l_I111l__llIiI__I1iI_i;
   private final float[] IilIliii1l__1iIl__lI11;
   private final i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11[] Ii_ii11I_liIl1Ili1_1_1l___I1l;
   private final Map<Object, Float> IIliilI1_1I_1II1IilIi1iIIl1ii__;
   private final Map<liiil1liIil1l11iil11li1iI, Float> il_ii_1_l_1i11l_l1lil11lllI;
   private final Map<liIi1IIl_il1IIlIll1Il_1II, Float> iIllI1I1iIIl11iI__i11l_11I;
   private final Set<liiil1liIil1l11iil11li1iI> iiliiiIII_l_l1i__l1l1iilII_l__1;
   private final Map<liiil1liIil1l11iil11li1iI, i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11> l1llII1_ll1i1_I_l_Ili1_;
   private final Map<liIi1IIl_il1IIlIll1Il_1II, i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11> i1i1ilI_ilI11ii_lIi11I1;
   private final Map<String, i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11> I1lIIIiIlililliIII_1I_l1_;
   private IiiI_Ii11l1I1__11ll1I1 I_li1li_iiiiIiIIiI_1I__;
   private i_i1i_lI11l_1i_I_1I__lii_l__i1 l1l11l_1l1I_IiI_ilIli_111;
   private IIil_llIl1l_Iili_I1III II11_Ii1Iil1l_Ii_iIiI1_IllI;
   private boolean iii1__l_i__1iiIli1lIlll_1iI;
   private float l_11_111IliI1__I1li_II1_l;
   private String ilIIilIl_i1IiII1lilliI;
   private String I_I11liIll11__1l11I___iIl1;
   private float lIiIIili_Ii__l1l1lI1llliII_III;
   private float llll1_ll_1Il11_iIIl_IlIi;
   private float I1l1IiI_iiiII_i11iIlII;
   private float Iil1ili_lIIi1_l_iIiIli_l_1i;
   private float i1li_iiI1liI1ii_iI_1_1_1l1_;
   private float i__lIllIlIIl11111_l1l___;
   private float lI1llll1IIIi1lIlIlII__i__ll1i;
   private float l1I_111l_i1I1__Iii_1i_Iili111I;
   private long i1I11iil1_l1_1_l_lIii_lil_1_i1l;
   private boolean IlIi1i_i1i1l1i_i_iiii_Il1;
   private boolean IIlIlIiiii1l_lllllllllI;
   public static final char[][] ilI1IIl_IIIlilii11I11llli_ = new char[~1631407211 - -323139858 ^ -1308267294][];

   public i_iii_i1I1l_1IliIII1li() {
      String var10001 = l_1_1lllll_II1ii1i_iIi_I1_Iiii1((-130678784 | 25576) ^ -130653208);
      if (var10001 == null) {
         byte[] var1 = new byte[(-786890752 | 22115) ^ -786868625];
         var1[~1649690746 - -1432178316 ^ -217512431] = (byte)(-749241187 * -581228153 + -1256643598);
         var1[-1014036172 * 1210919767 + 1169433429] = (byte)((-1154678784 | 38416) ^ -1154640332);
         var1[(-1485242368 | 58729) ^ -1485183637] = (byte)(~761461364 - -1053187810 ^ 291726381);
         var1[1721087871 * 394378305 + 557589700] = (byte)((-1548025856 | 16299) ^ -1548009530);
         var1[(1242300416 | 17643) ^ 1242318063] = (byte)((-1857617920 | 61709) ^ 1857556199);
         var1[~1664923061 - -820609350 ^ -844313707] = (byte)(-90229260 * 1324167601 + -206307715);
         var1[~511486789 - 48773538 ^ -560260322] = (byte)(486584323 * 1565877737 + -856711491);
         var1[163726596 * 1260200111 + 236868171] = (byte)((1125384192 | 61831) ^ 1125446136);
         var1[(-1237581824 | 53349) ^ -1237528467] = (byte)(~-1222158579 - 1223736124 ^ -1577578);
         var1[~972773601 - 724091289 ^ -1696864884] = (byte)((703922176 | 48367) ^ 703970543);
         var1[~-1509125833 - -2011859047 ^ -773982427] = (byte)((40501248 | 44501) ^ 40545735);
         var1[874467433 * 1166589183 + 284806004] = (byte)(~-1111917485 - 28286897 ^ 1083630564);
         var10001 = llIl_I_lli1_IlI_1_1l1_Il1ii_(var1, ~-323861474 - 808704195 ^ -484842722);
      }

      super(class_2561.method_43470(var10001));
      this.iI___11lIl1ilI_i1iiI_Il_i_lll = new II1_ll_ll1Ill__1IIIl_iii();
      this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i = i1ii11IIilIl1_1IlliiiI1iii.values();
      this.I1lIiil1Ii_Ii__II_II1l_ = new float[this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i.length];
      this.ii_1_11llliI1lil_11i1l = new float[this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i.length];
      this.l_I111l__llIiI__I1iI_i = new float[this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i.length];
      this.IilIliii1l__1iIl__lI11 = new float[this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i.length];
      this.Ii_ii11I_liIl1Ili1_1_1l___I1l = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11[this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i.length];
      this.IIliilI1_1I_1II1IilIi1iIIl1ii__ = new HashMap<>();
      this.il_ii_1_l_1i11l_l1lil11lllI = new HashMap<>();
      this.iIllI1I1iIIl11iI__i11l_11I = new HashMap<>();
      this.iiliiiIII_l_l1i__l1l1iilII_l__1 = new HashSet<>();
      this.l1llII1_ll1i1_I_l_Ili1_ = new HashMap<>();
      this.i1i1ilI_ilI11ii_lIi11I1 = new HashMap<>();
      this.I1lIIIiIlililliIII_1I_l1_ = new LinkedHashMap<>();
      this.i__lIllIlIIl11111_l1l___ = 1.0F;
      this.i1I11iil1_l1_1_l_lIii_lil_1_i1l = ~-1187500099579808574L - 4526980341699225313L ^ 3339480242119416739L;
      this.IIlIlIiiii1l_lllllllllI = (boolean)((-753729536 | 2833) ^ -753726704);
      i_ilIii1lIil1__lli1lIIi_i1.iilIi_III_lIi_1Ill__il();
   }

   private float lilI1ili1_II_Ii_liI_iiIiI(float param1) {
      return IlI11_1i_IlIIli1lI_Il_il.il__iIiIli_l1iii1Ii_li(var1) * Float.intBitsToFloat((1080492032 | 34390) ^ 2144646501);
   }

   public void method_25394(class_332 param1, int nullx, int nullxx, float nullxxx) {
      super.method_25394(var1, nullx, nullxx, nullxxx);
      boolean var5 = iI1liiliiIi__lI_1__I__.I1i1l__ii1Il_1l__ili11i();
      i___I1II11i_IlIil__IlI__IIi.i_IiIil_1_I_IlIlIilIIliIl_1i1();
      float var6 = this.iil_1li_1_iIiii__iiI_11lII_();
      this.lI1llll1IIIi1lIlIlII__i__ll1i = var6;
      this.l1I_111l_i1I1__Iii_1i_Iili111I += var6;
      this.i__li1i1_I1iil_li_1lil1ili_l__();
      this.iii11I1lIl_1I__1II__iIi_Ii__1(var6);
      if (!this.IlIi1i_i1i1l1i_i_iiii_Il1
         || (var5 ? !(this.illilIl_IIII1i1IlIIi_i1iI____ <= Float.intBitsToFloat(~-2029412125 - -1942669356 ^ -700304089)) : !this.I1ii1liI1Il1l_liI1IliI1())) {
         this.i__lIllIlIIl11111_l1l___ = iI1liiliiIi__lI_1__I__.ii1i1Ili_ii_1Iil_1i_1II_l_iI_I();
         if (var5) {
            this.i__lIllIlIIl11111_l1l___ = this.i__lIllIlIIl11111_l1l___ * Float.intBitsToFloat((-2044985344 | 36426) ^ -1181494685);
            this.i__lIllIlIIl11111_l1l___ = this.i__lIllIlIIl11111_l1l___
               * this.iI___11lIl1ilI_i1iiI_Il_i_lll.fit((float)this.field_22789, (float)this.field_22790, this.i__lIllIlIIl11111_l1l___);
         }

         var1.method_51448().method_22903();
         var1.method_51448()
            .method_46416(
               (float)this.field_22789 * Float.intBitsToFloat((-1075838976 | 41982) ^ -2132761602),
               (float)this.field_22790 * Float.intBitsToFloat((-359989248 | 42869) ^ -712267915),
               0.0F
            );
         var1.method_51448().method_22905(this.i__lIllIlIIl11111_l1l___, this.i__lIllIlIIl11111_l1l___, 1.0F);
         var1.method_51448()
            .method_46416(
               (float)this.field_22789 * Float.intBitsToFloat(~456032294 - 579627623 ^ 2101679474),
               (float)this.field_22790 * Float.intBitsToFloat((-880476160 | 39900) ^ 1954913244),
               0.0F
            );
         Matrix4f var7 = var1.method_51448().method_23760().method_23761();
         this.Iil1ili_lIIi1_l_iIiIli_l_1i = this.i1il1I1I__Il_IIi1i1__lIlil((double)nullx);
         this.i1li_iiI1liI1ii_iI_1_1_1l1_ = this.IiIllI_llIlii11__l_l1li_I1l((double)nullxx);
         this.ilIIilIl_i1IiII1lilliI = null;
         this.l1llII1_ll1i1_I_l_Ili1_.clear();
         this.i1i1ilI_ilI11ii_lIi11I1.clear();
         if (var5) {
            this.iI___11lIl1ilI_i1iiI_Il_i_lll
               .render(
                  var1,
                  (float)this.field_22789,
                  (float)this.field_22790,
                  this.Iil1ili_lIIi1_l_iIiIli_l_1i,
                  this.i1li_iiI1liI1ii_iI_1_1_1l1_,
                  var6,
                  this.illilIl_IIII1i1IlIIi_i1iI____,
                  this.IlIi1i_i1i1l1i_i_iiii_Il1
               );
            Ii1_I1Ii_l1ilIIlII1iliIlI.l1i_111_IIlI1___1l_IlIil1();
            var1.method_51448().method_22909();
         } else {
            float var8 = ((float)this.field_22789 - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-1551564800 | 58495) ^ -526654337)))
               * Float.intBitsToFloat((1106771968 | 33046) ^ 2130215190);
            float var9 = ((float)this.field_22790 - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1552849476 - 613702147 ^ 1951318080)))
               * Float.intBitsToFloat(-881193049 * -2024265143 + -1070062751);

            for (int var10 = -1201676361 * -1132694683 + 1879672781; var10 < this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i.length; var10++) {
               float var11 = this.I1lIiil1Ii_Ii__II_II1l_[var10];
               if (!(var11 <= Float.intBitsToFloat((1612644352 | 19603) ^ 1520197372))) {
                  float var12 = Ill_ll11lIlllilliI1_iil(var11);
                  float var13 = var8
                     + (float)(var10 - ((-2016149504 | 8633) ^ -2016140872))
                        * (
                           this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~231683469 - 1697908406 ^ -807222340))
                              + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1542984209 * 439797079 + -1860909255))
                        );
                  float var14 = var9 + ((float)this.field_22790 - var9) * (1.0F - var12);
                  this.i_l_1__Illilli_li__11_lli1IiI(
                     var1,
                     var7,
                     var10,
                     new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
                        var13,
                        var14,
                        this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((420872192 | 52955) ^ 1510526683)),
                        this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-56615709 - 1554312552 ^ -452037196))
                     ),
                     var12,
                     var6
                  );
               }
            }

            this.i1illiliIIII_i_l111111I(
               var1,
               var7,
               new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
                  var8,
                  var9,
                  this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1779208190 - 845136459 ^ 546155958)),
                  this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1327454471 * -370723917 + -38020325))
               ),
               var6
            );
            this.ii_i_Ii1_Il1____11i1Ii_ll(var1, var7, var6);
            Ii1_I1Ii_l1ilIIlII1iliIlI.l1i_111_IIlI1___1l_IlIil1();
            var1.method_51448().method_22909();
         }
      } else {
         this.field_22787.method_1507(null);
      }
   }

   private float i1il1I1I__Il_IIi1i1__lIlil(double param1) {
      return (float)(
         (var1 - (double)this.field_22789 * Double.longBitsToDouble(~-1667537052296702431L - -3343741598562557508L ^ 8821323935614699554L))
               / (double)this.i__lIllIlIIl11111_l1l___
            + (double)this.field_22789 * Double.longBitsToDouble(~4043755435652956120L - -7408048374072977556L ^ 1247601113555888315L)
      );
   }

   private float IiIllI_llIlii11__l_l1li_I1l(double param1) {
      return (float)(
         (var1 - (double)this.field_22790 * Double.longBitsToDouble(~-8976986322950802975L - 3962435366505886713L ^ 8824596241200355877L))
               / (double)this.i__lIllIlIIl11111_l1l___
            + (double)this.field_22790 * Double.longBitsToDouble(~-1942593367805399659L - -7612129027437630405L ^ -4937861205635226065L)
      );
   }

   private void i_l_1__Illilli_li__11_lli1IiI(
      class_332 param1, Matrix4f nullx, int nullxx, i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 nullxxx, float nullxxxx, float nullxxxxx
   ) {
      i_I_I_ii_I1l_1__illlIl1l__li var7 = I11i11Ii1illli1iliI_1I_II_.li_illlii1_1_i_Iii1I__1__i1I();
      i_I_I_ii_I1l_1__illlIl1l__li var8 = I11i11Ii1illli1iliI_1I_II_.li_illlii1_1_i_Iii1I__1__i1I();
      this.I1ii1i_i1_11i__IIll_Ii(
         nullx,
         nullxxx,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1546387456 | 13453) ^ 495727757)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               1707084245 * -690233753 + 268326221,
               -1136816222 * -1694989689 + -542573166,
               (1062273024 | 56888) ^ 1062329912,
               ~1390560867 - -281867384 ^ -1108693356
            ),
            nullxxxx
         )
      );
      String var9 = this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i[nullxx].getName();
      float var10 = var7.getWidth(var9, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~612909869 - 4306750 ^ -1704589932)));
      float var11 = nullxxx.y() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~83116400 - -440931285 ^ 1410585188));
      this.il1IIl_iii_IiIliIi1I_1(
         nullx,
         var7,
         var9,
         nullxxx.x() + (nullxxx.width() - var10) * Float.intBitsToFloat(-1836048686 * -1691302491 + -217806682),
         var11 - var7.getGlyphTop(var9, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1195691820 - -1935355164 ^ -70255545))),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(797471825 * 816259529 + 1196899175)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               (-2106195968 | 58019) ^ -2106138020,
               ~-854807689 - -1890385887 ^ -1549773672,
               -1916632399 * -1644990087 + -2007164330,
               (1666908160 | 43730) ^ 1666951789
            ),
            nullxxxx
         )
      );
      float var12 = var11
         + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~901134353 - 1306230775 ^ 1027491831))
         + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((913047552 | 331) ^ 2001469771));
      this.ilIlil1Iil_II__l_I_1_Ii(
         nullx,
         new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
            nullxxx.x()
               + (nullxxx.width() - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(75844489 * -1126399865 + -1253922111)))
                  * Float.intBitsToFloat(~1732101904 - 185935189 ^ -1297280102),
            var12,
            this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(95968892 * -274051755 + 1712542932)),
            this.lilI1ili1_II_Ii_liI_iiIiI(2.0F)
         ),
         0.0F,
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               (1503592448 | 16063) ^ 1503608384,
               ~1251723114 - -85604372 ^ -1166118826,
               (1599471616 | 51643) ^ 1599523140,
               ~-394793763 - -1795863569 ^ -2104309963
            ),
            nullxxxx
         )
      );
      float var13 = var12 + this.lilI1ili1_II_Ii_liI_iiIiI(2.0F) + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-581107712 | 46848) ^ -1669482752));
      float var14 = nullxxx.bottom() - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-1904672768 | 15842) ^ -816235038));
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var15 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         nullxxx.x(), var13, nullxxx.width(), Math.max(0.0F, var14 - var13)
      );
      this.Ii_ii11I_liIl1Ili1_1_1l___I1l[nullxx] = var15;
      this.l1liil1lIiiii1i_I_1__l_llli__I(var1, var15);
      float var16 = nullxxx.x()
         + (
               this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1458044928 | 17259) ^ 368460651))
                  - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(2056223554 * 169480361 + 1240301934))
            )
            * Float.intBitsToFloat(~40008375 - -149378049 ^ 965007689);
      float var17 = var13 - this.I1i1IiI__IllIIii1I_i____l(nullxx, nullxxxxx);
      float var18 = var17;

      for (liiil1liIil1l11iil11li1iI var20 : il_l_li__li_i1lI1iII_I_iI_l1Ii1.iIIIiI_11_IIi____lIlIIllIII()
         .getModules(this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i[nullxx])) {
         float var21 = Ill_ll11lIlllilliI1_iil(this.IIi_l1ilili_IIII1__Iii1(var20, nullxxxxx));
         float var22 = var20.getSettings().isEmpty() ? 0.0F : this.ll___1I1lIi_1l_iiIil_I_i1i1Ii(var20) * var21;
         this.I____ll111_li_illlIl1Il1111l1I(
            nullx,
            var8,
            var20,
            new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
               var16,
               var18,
               this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-236523812 * -2099911 + 778454276)),
               this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1485832192 | 50887) ^ 424724167)) + var22
            ),
            nullxxxx
         );
         if (var22 > Float.intBitsToFloat(2016508906 * 609933347 + -1802602996)) {
            this.IIIIilll_Il_IIil__l__1(
               var1,
               nullx,
               var8,
               var20,
               var16,
               var18 + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1242431488 | 4821) ^ 198054613)),
               var22,
               nullxxxx,
               var21
            );
         }

         var18 += this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1627026619 - 1354284413 ^ 260885959))
            + var22
            + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-942080000 | 58733) ^ -2026248851));
      }

      var1.method_44380();
      float var23 = Math.max(0.0F, var18 - var17 - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-670926641 - -1401123288 ^ 996210952)));
      this.IilIliii1l__1iIl__lI11[nullxx] = Math.max(0.0F, var23 - var15.height());
      this.ii_1_11llliI1lil_11i1l[nullxx] = I1l1_ill_I11_iii_1II_il11_lli1l(this.ii_1_11llliI1lil_11i1l[nullxx], 0.0F, this.IilIliii1l__1iIl__lI11[nullxx]);
   }

   private void I____ll111_li_illlIl1Il1111l1I(
      Matrix4f param1,
      i_I_I_ii_I1l_1__illlIl1l__li nullx,
      liiil1liIil1l11iil11li1iI nullxx,
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 nullxxx,
      float nullxxxx
   ) {
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var6 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         nullxxx.x(), nullxxx.y(), nullxxx.width(), this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((286130176 | 31424) ^ 1355709120))
      );
      this.l1llII1_ll1i1_I_l_Ili1_.put(nullxx, var6);
      if (var6.contains((double)this.Iil1ili_lIIi1_l_iIiIli_l_1i, (double)this.i1li_iiI1liI1ii_iI_1_1_1l1_)) {
         this.ilIIilIl_i1IiII1lilliI = nullxx.getDescription();
      }

      float var7 = this.I11l_1iiIil11Ii_IlIil_l_(
         nullxx, (boolean)(!nullxx.isEnabled() && nullxx.isToggleable() ? ~-347331267 - 2002072934 ^ -1654741668 : ~144244438 - 1929528837 ^ -2073773275)
      );
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         nullxxx,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-2011824128 | 20754) ^ -919187182)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               ~921604886 - 734146191 ^ -1655751126,
               (-1647968256 | 28436) ^ -1647939740,
               ~364126006 - -822889956 ^ 458763997,
               (1455423488 | 21823) ^ 1455445302
            ),
            nullxxxx
         )
      );
      this.iI_lliI_Il1__1_i1_1l_iliI1il1I(
         var1,
         nullxxx,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1341723463 - 2108968095 ^ -1822112089)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               1261337923 * -677311149 + 929954999,
               191693331 * 1804109083 + 508881263,
               ~-369552877 - -281512404 ^ 651065264,
               2027255793 * -834934307 + -754836483
            ),
            nullxxxx
         )
      );
      Color var8 = this.llill_II1iI1i1lli1iliIII(
         new Color(
            (943980544 | 775) ^ 943981560, (-869138432 | 36102) ^ -869102087, 961029966 * -1981334581 + -1118315483, 1305473524 * -967897987 + -539792356
         ),
         new Color(
            ~-1006386466 - -1076174514 ^ 2082560812, (522977280 | 25537) ^ 523002686, (-1943011328 | 8288) ^ -1943002977, ~-2070515610 - 1236970209 ^ 833545299
         ),
         var7
      );
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         nullxx.getName(),
         var6.x() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(739360773 * 526549797 + -1346195385)),
         I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
               nullx, nullxx.getName(), this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-382266916 - -1845925928 ^ -974158261)), var6.y(), var6.height()
            )
            + Float.intBitsToFloat(~2062340566 - 621285240 ^ 1581765244),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-340854909 * -558842289 + -430021485)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(var8, nullxxxx)
      );
   }

   private float ll___1I1lIi_1l_iiIil_I_i1i1Ii(liiil1liIil1l11iil11li1iI param1) {
      float var2 = this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1202651136 | 31067) ^ 120551771));

      for (liIi1IIl_il1IIlIll1Il_1II var4 : var1.getSettings()) {
         if (var4.isVisible()) {
            var2 += (
                  var4 instanceof IiiI_Ii11l1I1__11ll1I1
                     ? this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~803274213 - 918011136 ^ -661175014))
                     : this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-506068992 | 16819) ^ -1604959821))
               )
               + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1803878400 | 27660) ^ 721775628));
         }
      }

      return var2;
   }

   private void IIIIilll_Il_IIil__l__1(
      class_332 param1,
      Matrix4f nullx,
      i_I_I_ii_I1l_1__illlIl1l__li nullxx,
      liiil1liIil1l11iil11li1iI nullxxx,
      float nullxxxx,
      float nullxxxxx,
      float nullxxxxxx,
      float nullxxxxxxx,
      float nullxxxxxxxx
   ) {
      this.l1liil1lIiiii1i_I_1__l_llli__I(
         var1,
         new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
            nullxxxx, nullxxxxx, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1591051812 - -383226887 ^ 916658730)), nullxxxxxx
         )
      );
      float var10 = nullxxxxx + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1176132496 - 1343058172 ^ -1232278893));

      for (liIi1IIl_il1IIlIll1Il_1II var12 : nullxxx.getSettings()) {
         if (var12.isVisible()) {
            if (var12 instanceof IiiI_Ii11l1I1__11ll1I1 var13) {
               this.l__i_il_l1I1_liiII1Ii1IlIi_11I(nullx, nullxx, var13, nullxxxx, var10, nullxxxxxxx * nullxxxxxxxx);
               var10 += this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(2056663570 * 525792321 + -100130450))
                  + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-356143180 * -442721111 + -1220718036));
            } else if (var12 instanceof Il1_1_i1i_1__ll1_1_111i_11i1i var14) {
               this.Il1l1l__1_IIi1llIiiI_1IiIil_1Ii(nullx, nullxx, var14, nullxxxx, var10, nullxxxxxxx * nullxxxxxxxx);
               var10 += this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1955948753 - -1621799706 ^ -1382725048))
                  + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1740839386 - -1009554506 ^ -479220189));
            } else if (var12 instanceof IIil_llIl1l_Iili_I1III var15) {
               this.Ii_I1__1l_ilil_I1iIl1i1(nullx, nullxx, var15, nullxxxx, var10, nullxxxxxxx * nullxxxxxxxx);
               var10 += this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-1253507072 | 38543) ^ -188115313))
                  + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1246742993 - -1883968770 ^ 1702578992));
            } else if (var12 instanceof i_i1i_lI11l_1i_I_1I__lii_l__i1 var16) {
               this.ilIlii_iIlIIli1Il1illIl1lI1_l_(nullx, nullxx, var16, nullxxxx, var10, nullxxxxxxx * nullxxxxxxxx);
               var10 += this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1579024384 | 24642) ^ 530473026))
                  + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-947585024 | 36364) ^ -2029679092));
            } else if (var12 instanceof l1Iil1_lllilIi1IIIi_i1l_1__i var17) {
               this.I1lIiill_iili1i1I11iIIl_lliil(nullx, nullxx, var17, nullxxxx, var10, nullxxxxxxx * nullxxxxxxxx);
               var10 += this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-653796762 * 322954471 + 466425334))
                  + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-512557056 | 1444) ^ -1577908828));
            }
         }
      }

      var1.method_44380();
   }

   private void ilIlii_iIlIIli1Il1illIl1lI1_l_(
      Matrix4f param1, i_I_I_ii_I1l_1__illlIl1l__li nullx, i_i1i_lI11l_1i_I_1I__lii_l__i1 nullxx, float nullxxx, float nullxxxx, float nullxxxxx
   ) {
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var7 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         nullxxx,
         nullxxxx,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1536926975 * 1357885795 + 2125980259)),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-618790912 | 46674) ^ -1700874670))
      );
      this.i1i1ilI_ilI11ii_lIi11I1.put(nullxx, var7);
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         nullxx.getName(),
         nullxxx + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-914391699 * -1189352215 + 1415011275)),
         I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
            nullx, nullxx.getName(), this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(249103329 * -466295215 + 1730518991)), var7.y(), var7.height()
         ),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-401646158 * -155759881 + -489085630)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               ~-422374056 - -108508855 ^ 530882977,
               ~1900954044 - -1268546177 ^ -632408005,
               2123474525 * -121684131 + -171790794,
               (758579200 | 63573) ^ 758642878
            ),
            nullxxxxx
         )
      );
      int var8 = this.l1l11l_1l1I_IiI_ilIli_111 == nullxx ? -37993218 * -1906381155 + 572623931 : (-1601306624 | 38331) ^ -1601268293;
      String var10000;
      if (var8 != 0) {
         var10000 = l_1_1lllll_II1ii1i_iIi_I1_Iiii1((-14942208 | 20258) ^ -14921949);
         if (var10000 == null) {
            byte[] var13 = new byte[~-1595560693 - 742945571 ^ 852615126];
            var13[~-1258802275 - 1109056024 ^ 149746250] = (byte)(~737083678 - -220100494 ^ 516983238);
            var13[~-1274290378 - 16541646 ^ 1257748730] = (byte)(~-1929926888 - 885033465 ^ -1044893420);
            var13[791225798 * -1350880065 + -193029816] = (byte)((106823680 | 58791) ^ -106882504);
            var13[-1249713556 * 677064573 + -81683129] = (byte)(973725119 * 1313133089 + 1410841632);
            var13[(1696071680 | 56182) ^ 1696127858] = (byte)((1424031744 | 35428) ^ 1424067118);
            var13[(89325568 | 35419) ^ 89360990] = (byte)(~-584720185 - -267829725 ^ 852549944);
            var13[(-1490616320 | 21056) ^ -1490595258] = (byte)(~-1069582455 - -1116801404 ^ 2108583472);
            var10000 = llIl_I_lli1_IlI_1_1l1_Il1ii_(var13, ~-1394712078 - 1398630763 ^ -3918685);
         }
      } else {
         var10000 = nullxx.display();
      }

      String var9 = var10000;
      float var10 = nullx.getWidth(var9, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1508704256 | 22063) ^ 418207279)));
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var11 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         var7.right()
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1581250951 * -1846137915 + -983649821))
            - var10
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-110253363 * -368204465 + -1977013827)) * 2.0F,
         var7.y()
            + (
                  var7.height()
                     - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~994442609 - 1829446935 ^ 380558711))
                     - Float.intBitsToFloat((932577280 | 38481) ^ 1997968977)
               )
               * Float.intBitsToFloat(-910874514 * 358150667 + 1747928902),
         var10 + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-1254621184 | 2530) ^ -172488222)) * 2.0F,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~985260150 - -771115826 ^ -1304663365))
            + Float.intBitsToFloat(~441515071 - 1037227670 ^ -413389526)
      );
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         var11,
         var11.height() * Float.intBitsToFloat((-684261376 | 51465) ^ -398997239),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               (1470496768 | 555) ^ 1470497371, ~-1533779843 - 175311305 ^ 1358468553, (917831680 | 14150) ^ 917845814, -703125608 * 650981475 + -1729679294
            ),
            nullxxxxx
         )
      );
      Color var12 = var8 != 0
         ? Ili_li1lli_Ii1111i1i_iI__ll1Ii.IiIlIl_I1liIi1_IIIIi1li1l()
         : (
            nullxx.getKey() == (~1234306671 - 1730174208 ^ -1330486417)
               ? new Color(
                  ~1254397229 - -184885435 ^ -1069511822,
                  -1889244740 * -995984749 + -168054261,
                  (-796852224 | 58220) ^ -796793965,
                  (-1466695680 | 51686) ^ -1466644058
               )
               : new Color(
                  1663248729 * 147787037 + -990655254, (-219938816 | 32711) ^ -219906248, (-994508800 | 59162) ^ -994449435, (-1470562304 | 4879) ^ -1470557212
               )
         );
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         var9,
         var11.x() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-707973531 - -1911508768 ^ -593354566)),
         I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
            nullx, var9, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((107741184 | 34637) ^ 1198294861)), var11.y(), var11.height()
         ),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1339018853 * 749536975 + 48283221)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(var12, nullxxxxx)
      );
   }

   private void I1lIiill_iili1i1I11iIIl_lliil(
      Matrix4f param1, i_I_I_ii_I1l_1__illlIl1l__li nullx, l1Iil1_lllilIi1IIIi_i1l_1__i nullxx, float nullxxx, float nullxxxx, float nullxxxxx
   ) {
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var7 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         nullxxx,
         nullxxxx,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-445894407 - 159873717 ^ 1375884369)),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-358042305 * 2076688425 + -74270487))
      );
      this.i1i1ilI_ilI11ii_lIi11I1.put(nullxx, var7);
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         nullxx.getName(),
         nullxxx + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(2049305028 * 1030694915 + -712269132)),
         I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
            nullx, nullxx.getName(), this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-2064461784 - 1690058213 ^ 1464922610)), var7.y(), var7.height()
         ),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(2073309586 * -809549913 + 556972994)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               ~-977166189 - -1016932357 ^ 1994098574,
               -1633626763 * -879203587 + 506632798,
               (-166395904 | 20252) ^ -166375453,
               -122636639 * -798763971 + -161208178
            ),
            nullxxxxx
         )
      );
      String var8 = nullxx.hex();
      float var9 = nullx.getWidth(var8, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~116849921 - 871317462 ^ -2078686424)));
      float var10 = this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1680056075 * -554562901 + 1799858777));
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var11 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         var7.right()
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1286339076 * -1707142049 + 1848240260))
            - var9
            - var10
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1386151936 | 43025) ^ 304064529))
               * Float.intBitsToFloat(~1128538083 - 477546643 ^ -536537207),
         var7.y()
            + (
                  var7.height()
                     - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-930485346 - -1729064350 ^ -544898561))
                     - Float.intBitsToFloat(577908303 * 1946606881 + 1542706385)
               )
               * Float.intBitsToFloat((-1208090624 | 37891) ^ -1996581885),
         var9
            + var10
            + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(688058084 * -466134235 + -450073332)) * Float.intBitsToFloat((25886720 | 37297) ^ 1103860145),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1060292990 * 1473306545 + -922882590))
            + Float.intBitsToFloat(1671352014 * -520114389 + -1237159578)
      );
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         var11,
         var11.height() * Float.intBitsToFloat((225443840 | 12413) ^ 846213245),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               -1698891337 * 437833541 + 2113779997,
               ~-110860465 - -1057996313 ^ 1168856761,
               ~1648979293 - -104373599 ^ -1544605583,
               (95485952 | 27305) ^ 95513251
            ),
            nullxxxxx
         )
      );
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
            var11.x() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(491621625 * 2009776445 + -767316053)),
            var11.y() + (var11.height() - var10) * Float.intBitsToFloat(~-1791186584 - -1048756398 ^ -1773791419),
            var10,
            var10
         ),
         var10 * Float.intBitsToFloat(926620403 * -559749291 + -884422575),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(nullxx.getColor(), nullxxxxx)
      );
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         var8,
         var11.x() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1476449688 * 811981135 + -490225176)) * 2.0F + var10,
         I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
            nullx, var8, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1076715773 * -489109017 + -2022779211)), var11.y(), var11.height()
         ),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~826064581 - 208053110 ^ -2091082300)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               1219901952 * 1087743749 + 1922752255,
               (-1238958080 | 9645) ^ -1238948526,
               ~-960193637 - 1963255156 ^ -1003061745,
               398416116 * -749380595 + 1649200263
            ),
            nullxxxxx
         )
      );
   }

   private void l__i_il_l1I1_liiII1Ii1IlIi_11I(
      Matrix4f param1, i_I_I_ii_I1l_1__illlIl1l__li nullx, IiiI_Ii11l1I1__11ll1I1 nullxx, float nullxxx, float nullxxxx, float nullxxxxx
   ) {
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var7 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         nullxxx,
         nullxxxx,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1444196379 * 196361571 + 253458063)),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1801912320 | 23351) ^ 714562359))
      );
      this.i1i1ilI_ilI11ii_lIi11I1.put(nullxx, var7);
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         nullxx.getName(),
         nullxxx + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-379696624 * -630330647 + -2127825040)),
         nullxxxx,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1939596409 * 301762661 + -1627558979)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               (2122907648 | 3544) ^ 2122911015,
               ~1295642987 - -1445696409 ^ 150053586,
               (1885601792 | 60035) ^ 1885661820,
               ~1380092537 - 1467826764 ^ 1447048145
            ),
            nullxxxxx
         )
      );
      String var8 = nullxx.display();
      float var9 = nullx.getWidth(var8, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1021360238 * 1367248247 + -1697534242)));
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var10 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         var7.right()
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1040220644 * 1833599999 + -1684082204))
            - var9
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(740119064 * 470231353 + -584392536)) * 2.0F,
         nullxxxx - 1.0F,
         var9 + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1695523034 * -1875585985 + 1557470630)) * 2.0F,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((127991808 | 39249) ^ 1184995665)) + Float.intBitsToFloat(-162893529 * -503536775 + -941576303)
      );
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         var10,
         var10.height() * Float.intBitsToFloat(~-683557362 - 1918861259 ^ -1990278618),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               (1120600064 | 4127) ^ 1120604271,
               ~-1356546332 - 1872371794 ^ -515825479,
               ~1131366342 - 311668529 ^ -1443034760,
               (1134166016 | 20830) ^ 1134186836
            ),
            nullxxxxx
         )
      );
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         var8,
         var10.x() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1036018956 - 1802447930 ^ 374369977)),
         I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
            nullx, var8, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-214447589 - 1067786388 ^ -1943857840)), var10.y(), var10.height()
         ),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1595998208 | 15936) ^ 505495104)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               (-482410496 | 33742) ^ -482376911,
               -515079663 * 237926809 + -490849322,
               -2056921482 * 827105667 + 183432349,
               ~-1936869633 - -1667330089 ^ -690767422
            ),
            nullxxxxx
         )
      );
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var11 = this.II1lIIIIIll1iliiiil_1IliII(var7);
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         var11,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1193130365 - 288929779 ^ -404124017))
            * Float.intBitsToFloat(~1349704985 - -1099354169 ^ -837553377),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               -1244132177 * -1371264719 + 1193380992,
               (1787887616 | 25193) ^ 1787912854,
               (-1015808000 | 23712) ^ -1015784353,
               (1435959296 | 13046) ^ 1435972324
            ),
            nullxxxxx
         )
      );
      float var12 = this.i_1ll_II1i1Ill1_lliI___iI1Il_I(nullxx);
      float var13 = Math.max(this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~2090813984 - 1637496343 ^ 1636204488)), var11.width() * var12);
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
            var11.x(), var11.y(), var13, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~337508428 - 715980445 ^ -2123036394))
         ),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1074326249 - 1197726365 ^ -1192947637))
            * Float.intBitsToFloat((-1934622720 | 35161) ^ -1280276135),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               -1008930536 * -1199573969 + -1715675886,
               -2030429760 * -1520231775 + 14175963,
               (1307508736 | 9304) ^ 1307518136,
               ~1763015595 - 1378763180 ^ 1153188439
            ),
            nullxxxxx
         )
      );
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
            var11.x()
               + var13
               - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-1781268480 | 49724) ^ -717962692))
                  * Float.intBitsToFloat((-1846542336 | 2024) ^ -1360001048),
            var11.y()
               + (
                     this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((102432768 | 3023) ^ 1180371919))
                        - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1538557097 - 136039709 ^ -590369223))
                  )
                  * Float.intBitsToFloat((1171652608 | 52390) ^ 2060897446),
            this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1417774416 * 1645842461 + 1398348304)),
            this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~688953536 - -1607067130 ^ 1985563961))
         ),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1452706985 - 1523460735 ^ -1154981335))
            * Float.intBitsToFloat(-839786122 * 1990468323 + -1376032674),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(Color.WHITE, nullxxxxx)
      );
      String var14 = nullxx.displayMin();
      String var15 = nullxx.displayMax();
      float var16 = var11.bottom() + Float.intBitsToFloat(~-2097195993 - 862328572 ^ 165319900);
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         var14,
         var11.x(),
         var16,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((2065760256 | 29632) ^ 1002533824)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               -1194578758 * 1366827455 + -55138247,
               ~1658407523 - -263534807 ^ -1394872692,
               ~137724997 - -1731930188 ^ 1594205433,
               (-684195840 | 10593) ^ -684185311
            ),
            nullxxxxx
         )
      );
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         var15,
         var11.right() - nullx.getWidth(var15, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1495326096 * 940613691 + -1360195536))),
         var16,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1545436165 - -1139988011 ^ -521121233)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               1461445589 * -1870220027 + -2099186474,
               -2073011271 * 1330090313 + 280170558,
               1311532647 * -1908654481 + 936290390,
               (-343736320 | 48300) ^ -343687956
            ),
            nullxxxxx
         )
      );
   }

   private void Il1l1l__1_IIi1llIiiI_1IiIil_1Ii(
      Matrix4f param1, i_I_I_ii_I1l_1__illlIl1l__li nullx, Il1_1_i1i_1__ll1_1_111i_11i1i nullxx, float nullxxx, float nullxxxx, float nullxxxxx
   ) {
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var7 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         nullxxx,
         nullxxxx,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-657522688 | 53863) ^ -1681796505)),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1033215912 * 1759048409 + -1493247336))
      );
      this.i1i1ilI_ilI11ii_lIi11I1.put(nullxx, var7);
      float var8 = this.I11l_1iiIil11Ii_IlIil_l_(nullxx, nullxx.isValue());
      Color var9 = this.llill_II1iI1i1lli1iliIII(
         new Color(
            -430611413 * 1371223199 + -768274870,
            -1615098980 * -690893601 + 100996123,
            (1423048704 | 60627) ^ 1423109164,
            ~-2015644371 - 2109792470 ^ -94148164
         ),
         new Color(
            (1444413440 | 14301) ^ 1444427554, 1537735833 * -2073989781 + -1874638836, (-209715200 | 55688) ^ -209659529, 839121375 * 138332449 + -229985236
         ),
         var8
      );
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         nullxx.getName(),
         nullxxx + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((278593536 | 33352) ^ 1343980104)),
         I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
            nullx, nullxx.getName(), this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1238630400 | 12805) ^ 148124165)), var7.y(), var7.height()
         ),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~649068573 - 929990336 ^ -522094302)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(var9, nullxxxxx)
      );
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var10 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         var7.right()
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~470085557 - -1271217758 ^ 1866485416))
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(721098297 * -610128259 + 1406527531)),
         var7.y()
            + (var7.height() - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1381498880 | 39670) ^ 323525366)))
               * Float.intBitsToFloat(~-1741578015 - -1809455496 ^ -324503386),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1115098677 - -1475476921 ^ -605484051)),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-624099328 | 35716) ^ -1679979644))
      );
      Color var11 = this.llill_II1iI1i1lli1iliIII(
         new Color(
            ~-875140115 - -534554798 ^ 1409694940, (-1630797824 | 1364) ^ -1630796472, (369491968 | 10615) ^ 369502571, (1689387008 | 10854) ^ 1689397930
         ),
         new Color(
            ~1853096477 - 298286098 ^ 2143584682, 617490998 * -618205515 + -654707603, (427819008 | 38772) ^ 427857812, (-1745289216 | 52530) ^ -1745236531
         ),
         var8
      );
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         var10,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-1636958208 | 49498) ^ -545341094)) * Float.intBitsToFloat((-1509621760 | 3693) ^ -1727721875),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(var11, nullxxxxx)
      );
      float var12 = this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1239285760 | 12916) ^ 147731060))
         - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1924595712 | 41858) ^ 1299686274)) * 2.0F;
      float var13 = var10.x()
         + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-279838720 | 62283) ^ -795675829))
         + (var10.width() - var12 - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1014154361 * 2772025 + 2080658703)) * 2.0F) * var8;
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
            var13, var10.y() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-920846336 | 24876) ^ -153263828)), var12, var12
         ),
         var12 * Float.intBitsToFloat((-1220476928 | 18533) ^ -2008987547),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(Color.WHITE, nullxxxxx)
      );
   }

   private void Ii_I1__1l_ilil_I1iIl1i1(
      Matrix4f param1, i_I_I_ii_I1l_1__illlIl1l__li nullx, IIil_llIl1l_Iili_I1III nullxx, float nullxxx, float nullxxxx, float nullxxxxx
   ) {
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var7 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         nullxxx,
         nullxxxx,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-1128005632 | 53332) ^ -3485612)),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~630383834 - 475000238 ^ -6476425))
      );
      this.i1i1ilI_ilI11ii_lIi11I1.put(nullxx, var7);
      int var8 = this.iii1__l_i__1iiIli1lIlll_1iI && this.II11_Ii1Iil1l_Ii_iIiI1_IllI == nullxx
         ? ~1177852762 - -819961716 ^ -357891048
         : 852495918 * -1088549235 + -1489130326;
      float var9 = this.I11l_1iiIil11Ii_IlIil_l_(nullxx, (boolean)var8);
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         nullxx.getName(),
         nullxxx + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1339653181 * 1384936615 + 1594339275)),
         I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
            nullx, nullxx.getName(), this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(8877434 * -641325503 + -1127280634)), var7.y(), var7.height()
         ),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-244196458 * 777407565 + 472673250)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               (2042036224 | 46971) ^ 2042083204, (1862729728 | 47936) ^ 1862777791, ~-78684011 - 1801353107 ^ -1722669272, (1050214400 | 28386) ^ 1050242569
            ),
            nullxxxxx
         )
      );
      String var10 = nullxx.getValue();
      float var11 = nullx.getWidth(var10, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1915434470 - -1533009316 ^ -1472944195)));
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var12 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         var7.right()
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((627441664 | 50387) ^ 1709622483))
            - var11
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1343557524 - -1472826925 ^ -413229632)) * 2.0F,
         var7.y()
            + (
                  var7.height()
                     - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-907283166 * -1202255113 + 2016749618))
                     - Float.intBitsToFloat((1694236672 | 55454) ^ 612161694)
               )
               * Float.intBitsToFloat(745238670 * 2115828779 + -761245658),
         var11 + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1743320946 * -288236793 + 1671383582)) * 2.0F,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1183305451 * -670538907 + 1492222903))
            + Float.intBitsToFloat(342312165 * 1697297781 + 1124440663)
      );
      this.ilIlil1Iil_II__l_I_1_Ii(
         var1,
         var12,
         var12.height() * Float.intBitsToFloat(690209310 * 336185441 + -1916927326),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(
            new Color(
               (-2089615360 | 6559) ^ -2089608721,
               284408961 * -279880085 + 1461180549,
               ~2001301311 - 1917555453 ^ 376110515,
               ~2074987344 - -682861510 ^ -1392125825
            ),
            nullxxxxx
         )
      );
      Color var13 = this.llill_II1iI1i1lli1iliIII(
         new Color(
            ~-1720313100 - 750432958 ^ 969880242, ~83019596 - 2028800634 ^ -2111820090, ~9596937 - -1090599557 ^ 1081002628, 1107235859 * 995010529 + 434960184
         ),
         new Color(
            ~291734369 - 1826217078 ^ -2117951406, (66781184 | 58041) ^ 66839074, 1162765116 * -1929965665 + -845423972, ~-400508142 - -1394020223 ^ 1794528403
         ),
         var9
      );
      this.il1IIl_iii_IiIliIi1I_1(
         var1,
         nullx,
         var10,
         var12.x() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~73254805 - -72010210 ^ -1083375028)),
         I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
            nullx, var10, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-774338106 - -542963002 ^ 260336499)), var12.y(), var12.height()
         ),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1863628674 * -6396301 + 1498924186)),
         this.II1I1lll1I_iilI1I_1I1I_I11llli(var13, nullxxxxx)
      );
   }

   private void i1illiliIIII_i_l111111I(class_332 param1, Matrix4f nullx, i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 nullxx, float nullxxx) {
      if (this.ilIIilIl_i1IiII1lilliI != null) {
         this.I_I11liIll11__1l11I___iIl1 = this.ilIIilIl_i1IiII1lilliI;
      }

      float var5 = nullxxx / Float.intBitsToFloat(~-1901269050 - -1863919353 ^ -1555286222);
      this.lIiIIili_Ii__l1l1lI1llliII_III = this.ilIIilIl_i1IiII1lilliI != null && !this.IlIi1i_i1i1l1i_i_iiii_Il1
         ? Math.min(1.0F, this.lIiIIili_Ii__l1l1lI1llliII_III + var5)
         : Math.max(0.0F, this.lIiIIili_Ii__l1l1lI1llliII_III - var5);
      if (this.I_I11liIll11__1l11I___iIl1 != null && !(this.lIiIIili_Ii__l1l1lI1llliII_III <= Float.intBitsToFloat((-660471808 | 28559) ^ -501121568))) {
         i_I_I_ii_I1l_1__illlIl1l__li var6 = I11i11Ii1illli1iliI_1I_II_.li_illlii1_1_i_Iii1I__1__i1I();
         float var7 = Ill_ll11lIlllilliI1_iil(this.lIiIIili_Ii__l1l1lI1llliII_III);
         float var8 = var6.getWidth(
            this.I_I11liIll11__1l11I___iIl1, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-438174351 - 1295965327 ^ -1918949889))
         );
         float var9 = var8 + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1755054080 | 789) ^ 697041685)) * 2.0F;
         float var10 = var6.getGlyphBottom(
               this.I_I11liIll11__1l11I___iIl1, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(136588878 * 1036263681 + -2056535118))
            )
            - var6.getGlyphTop(this.I_I11liIll11__1l11I___iIl1, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1170800144 - 1538860425 ^ -1420830586)))
            + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1837270371 - 1318847570 ^ 1579581712)) * 2.0F;
         if (this.llll1_ll_1Il11_iIIl_IlIi <= 0.0F) {
            this.llll1_ll_1Il11_iIIl_IlIi = var9;
            this.I1l1IiI_iiiII_i11iIlII = var10;
         }

         this.llll1_ll_1Il11_iIIl_IlIi = I__lllIliii1_1lIiIli_l1iiII_l1_.follow(
            this.llll1_ll_1Il11_iIIl_IlIi, var9, Float.intBitsToFloat(-2003749190 * -25945993 + -769515638), nullxxx
         );
         this.I1l1IiI_iiiII_i11iIlII = I__lllIliii1_1lIiIli_l1iiII_l1_.follow(
            this.I1l1IiI_iiiII_i11iIlII, var10, Float.intBitsToFloat((1306984448 | 64523) ^ 250346507), nullxxx
         );
         i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var11 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
            nullxx.x() + (nullxx.width() - this.llll1_ll_1Il11_iIIl_IlIi) * Float.intBitsToFloat(-1149558388 * -798591849 + -1067202964),
            nullxx.y() - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1697232388 - -973620021 ^ -570296008)) - this.I1l1IiI_iiiII_i11iIlII,
            this.llll1_ll_1Il11_iIIl_IlIi,
            this.I1l1IiI_iiiII_i11iIlII
         );
         this.I1ii1i_i1_11i__IIll_Ii(
            nullx,
            var11,
            this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1360950535 - 1647350534 ^ -1345461760)),
            this.II1I1lll1I_iilI1I_1I1I_I11llli(
               new Color(
                  (-1416364032 | 50926) ^ -1416313106,
                  (-1847787520 | 16319) ^ -1847771201,
                  -739246768 * -1868110611 + -883475216,
                  (1731330048 | 18819) ^ 1731348739
               ),
               var7
            )
         );
         this.l1liil1lIiiii1i_I_1__l_llli__I(var1, var11);
         this.il1IIl_iii_IiIliIi1I_1(
            nullx,
            var6,
            this.I_I11liIll11__1l11I___iIl1,
            var11.x() + (var11.width() - var8) * Float.intBitsToFloat((455999488 | 17428) ^ 607011860),
            I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
                  var6,
                  this.I_I11liIll11__1l11I___iIl1,
                  this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-1469120512 | 36575) ^ -382759201)),
                  var11.y(),
                  var11.height()
               )
               + 1.0F,
            this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1458176000 | 23929) ^ 397041017)),
            this.II1I1lll1I_iilI1I_1I1I_I11llli(
               new Color(
                  (1587806208 | 28882) ^ 1587834925,
                  339332065 * 1607385995 + 1883499220,
                  (1763704832 | 14376) ^ 1763719383,
                  -109108363 * 1031281009 + -191697638
               ),
               var7
            )
         );
         var1.method_44380();
      }
   }

   private void ii_i_Ii1_Il1____11i1Ii_ll(class_332 param1, Matrix4f nullx, float nullxx) {
      float var4 = nullxx / Float.intBitsToFloat((-455409664 | 24435) ^ -1476698253);
      this.l_11_111IliI1__I1li_II1_l = this.iii1__l_i__1iiIli1lIlll_1iI
         ? Math.min(1.0F, this.l_11_111IliI1__I1li_II1_l + var4)
         : Math.max(0.0F, this.l_11_111IliI1__I1li_II1_l - var4);
      if (this.II11_Ii1Iil1l_Ii_iIiI1_IllI != null) {
         if (this.l_11_111IliI1__I1li_II1_l <= Float.intBitsToFloat(-615811187 * -1898456573 + -949511736)) {
            this.II11_Ii1Iil1l_Ii_iIiI1_IllI = null;
            this.I1lIIIiIlililliIII_1I_l1_.clear();
         } else {
            i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var5 = this.i1i1ilI_ilI11ii_lIi11I1.get(this.II11_Ii1Iil1l_Ii_iIiI1_IllI);
            if (var5 == null) {
               this.iii1__l_i__1iiIli1lIlll_1iI = (boolean)(~220104985 - -2060079690 ^ 1839974704);
               this.I1lIIIiIlililliIII_1I_l1_.clear();
            } else {
               i_I_I_ii_I1l_1__illlIl1l__li var6 = I11i11Ii1illli1iliI_1I_II_.li_illlii1_1_i_Iii1I__1__i1I();
               float var7 = Ill_ll11lIlllilliI1_iil(this.l_11_111IliI1__I1li_II1_l);
               List var8 = this.II11_Ii1Iil1l_Ii_iIiI1_IllI.getModes();
               float var9 = this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1958505075 - -1595410500 ^ -1469866544));

               for (String var11 : var8) {
                  var9 = Math.max(
                     var9,
                     var6.getWidth(var11, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1744986161 - 1486303382 ^ 1315647386)))
                        + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1762864909 - -546911047 ^ -138017735))
                           * Float.intBitsToFloat((1555234816 | 17881) ^ 473122265)
                  );
               }

               float var17 = (float)var8.size() * this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-773062656 | 50143) ^ -1869823009))
                  + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1973737341 - -758574979 ^ -493107457)) * 2.0F;
               i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var18 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
                  var5.right() - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-880007133 - -1223726864 ^ 1038380780)) - var9,
                  var5.bottom()
                     + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1348306848 - -1000224908 ^ -876888021))
                     + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-639147557 - 665670610 ^ -1093973422)) * (1.0F - var7),
                  var9,
                  var17
               );
               i___I1II11i_IlIil__IlI__IIi.l1i111l_Ii1Ii1I1l1i1i1ll_1iil();
               this.I1ii1i_i1_11i__IIll_Ii(
                  nullx,
                  var18,
                  this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-408158208 | 16998) ^ -1498660250)),
                  this.II1I1lll1I_iilI1I_1I1I_I11llli(
                     new Color(
                        565232313 * 891099027 + 1779208389,
                        ~2105124881 - 994813083 ^ 1195029331,
                        (-1950810112 | 39596) ^ -1950770516,
                        794974789 * -332457775 + -376252885
                     ),
                     var7
                  )
               );
               this.iI_lliI_Il1__1_i1_1l_iliI1il1I(
                  nullx,
                  var18,
                  this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1482113385 * -787478771 + -272092843)),
                  this.II1I1lll1I_iilI1I_1I1I_I11llli(
                     new Color(
                        ~-1215429359 - 1538324277 ^ -322894903,
                        (490471424 | 50023) ^ 490521367,
                        ~-2100493406 - -1874262861 ^ -320210982,
                        -1364290016 * 1169976853 + -945033366
                     ),
                     var7
                  )
               );
               this.I1lIIIiIlililliIII_1I_l1_.clear();
               this.l1liil1lIiiii1i_I_1__l_llli__I(var1, var18);
               float var12 = var18.y() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((453509120 | 56307) ^ 1531501555));

               for (String var14 : var8) {
                  i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var15 = new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
                     var18.x() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-43319296 | 58740) ^ -1121196684)),
                     var12,
                     var18.width() - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-295632896 | 19123) ^ -1373549901)) * 2.0F,
                     this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1996603225 - 74542707 ^ 871387365))
                  );
                  if (this.iii1__l_i__1iiIli1lIlll_1iI && this.l_11_111IliI1__I1li_II1_l >= Float.intBitsToFloat((1609957376 | 42119) ^ 1619598064)) {
                     this.I1lIIIiIlililliIII_1I_l1_.put(var14, var15);
                  }

                  if (var15.contains((double)this.Iil1ili_lIIi1_l_iIiIli_l_1i, (double)this.i1li_iiI1liI1ii_iI_1_1_1l1_)) {
                     this.ilIlil1Iil_II__l_I_1_Ii(
                        nullx,
                        var15,
                        this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-566168811 * 1977290213 + -1734902473))
                           * Float.intBitsToFloat((-303824896 | 35395) ^ -755166247),
                        this.II1I1lll1I_iilI1I_1I1I_I11llli(
                           new Color(
                              -471974359 * 1691587061 + -884061502,
                              (2143944704 | 45267) ^ 2143989804,
                              (-1807548416 | 8731) ^ -1807539484,
                              ~1884107975 - -1912359660 ^ 28251681
                           ),
                           var7
                        )
                     );
                  }

                  Color var16 = this.II11_Ii1Iil1l_Ii_iIiI1_IllI.is(var14)
                     ? new Color(
                        (-157155328 | 41574) ^ -157113828,
                        ~149562392 - 936722313 ^ -1086284603,
                        (1175257088 | 30819) ^ 1175287939,
                        (933298176 | 58160) ^ 933356495
                     )
                     : new Color(
                        1742386217 * 2055362411 + 1032504540,
                        (604045312 | 46265) ^ 604091462,
                        -140305866 * -1714095643 + -605878095,
                        ~2145638527 - 1544125529 ^ 605203404
                     );
                  this.il1IIl_iii_IiIliIi1I_1(
                     nullx,
                     var6,
                     var14,
                     var15.x() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((-1159069696 | 63702) ^ -89458474)),
                     I11i11Ii1illli1iliI_1I_II_.llii_lIl_l_i11_I_1Ili_I111ii_1(
                        var6, var14, this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1883853325 * 1850909997 + 1678783159)), var15.y(), var15.height()
                     ),
                     this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-1977106690 * 1874691145 + 967414162)),
                     this.II1I1lll1I_iilI1I_1I1I_I11llli(var16, var7)
                  );
                  var12 += this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(1260416471 * 834949301 + -1048369411));
               }

               var1.method_44380();
            }
         }
      }
   }

   private i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 II1lIIIIIll1iliiiil_1IliII(i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 param1) {
      return new i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11(
         var1.x() + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(802184020 * -16372119 + 1672049292)),
         var1.y()
            + this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1483733507 - -631032938 ^ -1943219610))
            + Float.intBitsToFloat(~396956504 - -1485351138 ^ 2069897),
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(-172457367 * 1667485793 + 882132535))
            - this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-354939211 - 770596229 ^ -1481010235)) * 2.0F,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~-1652996918 - 159993922 ^ 415066867))
      );
   }

   private void I1ii1i_i1_11i__IIll_Ii(Matrix4f param1, i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 nullx, float nullxx, Color nullxxx) {
      lliII1_Ili_I1Il11l_I1ill.iliiI_1lI11l_iil1iIIl__liI_lIi(
         var1, nullx.x(), nullx.y(), nullx.width(), nullx.height(), nullxx, Float.intBitsToFloat(-1990774525 * 555030013 + -152022775), nullxxx
      );
   }

   private void ilIlil1Iil_II__l_I_1_Ii(Matrix4f param1, i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 nullx, float nullxx, Color nullxxx) {
      lliII1_Ili_I1Il11l_I1ill.i1I1l_1_Ii__il_1_1iIllI1i1(var1, nullx.x(), nullx.y(), nullx.width(), nullx.height(), nullxx, nullxxx);
   }

   private void iI_lliI_Il1__1_i1_1l_iliI1il1I(Matrix4f param1, i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 nullx, float nullxx, Color nullxxx) {
      lliII1_Ili_I1Il11l_I1ill.i_Ii1ll1_liII1I__I_1l1iiIi1I(
         var1,
         nullx.x(),
         nullx.y(),
         nullx.width(),
         nullx.height(),
         nullxx,
         this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat((1477312512 | 37256) ^ 1741590920)),
         nullxxx
      );
   }

   private void il1IIl_iii_IiIliIi1I_1(
      Matrix4f param1, i_I_I_ii_I1l_1__illlIl1l__li nullx, String nullxx, float nullxxx, float nullxxxx, float nullxxxxx, Color nullxxxxxx
   ) {
      lliII1_Ili_I1Il11l_I1ill.iiII_1_Ii_1I___IiIl1ll(var1, nullx, nullxx, nullxxx, nullxxxx, nullxxxxx, nullxxxxxx);
   }

   private void l1liil1lIiiii1i_I_1__l_llli__I(class_332 param1, i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 nullx) {
      lliII1_Ili_I1Il11l_I1ill.Ii1ii1_1_llI1l1iiIIll_111IIiii_(var1, nullx.x(), nullx.y(), nullx.width(), nullx.height());
   }

   private void i__li1i1_I1iil_li_1lil1ili_l__() {
      for (int var1 = 372325976 * 84504257 + 855519144; var1 < this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i.length; var1++) {
         int var2 = this.IlIi1i_i1i1l1i_i_iiii_Il1 ? this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i.length - (-348806578 * -1503882491 + -1279718789) - var1 : var1;
         float var3 = (this.l1I_111l_i1I1__Iii_1i_Iili111I - (float)var2 * Float.intBitsToFloat(872837312 * 236069897 + 418842944))
            / Float.intBitsToFloat(~1210374867 - -1184158215 ^ -1120667853);
         float var4 = I1l1_ill_I11_iii_1II_il11_lli1l(var3, 0.0F, 1.0F);
         this.I1lIiil1Ii_Ii__II_II1l_[var1] = this.IlIi1i_i1i1l1i_i_iiii_Il1 ? 1.0F - var4 : var4;
      }
   }

   private void iii11I1lIl_1I__1II__iIi_Ii__1(float param1) {
      float var2 = var1 / Float.intBitsToFloat((2123169792 | 5498) ^ 1037112698);
      this.illilIl_IIII1i1IlIIi_i1iI____ = this.IlIi1i_i1i1l1i_i_iiii_Il1
         ? Math.max(0.0F, this.illilIl_IIII1i1IlIIi_i1iI____ - var2)
         : Math.min(1.0F, this.illilIl_IIII1i1IlIIi_i1iI____ + var2);
   }

   private boolean I1ii1liI1Il1l_liI1IliI1() {
      float[] var1 = this.I1lIiil1Ii_Ii__II_II1l_;
      int var2 = var1.length;

      for (int var3 = (-1528889344 | 46566) ^ -1528842778; var3 < var2; var3++) {
         float var4 = var1[var3];
         if (var4 > Float.intBitsToFloat(~-948136288 - 1392102432 ^ -552956080)) {
            return (boolean)((-324206592 | 47066) ^ -324159526);
         }
      }

      return (boolean)(~-255908499 - 1817668343 ^ -1561759846);
   }

   private float I11l_1iiIil11Ii_IlIil_l_(Object param1, boolean nullx) {
      float var3 = nullx ? 1.0F : 0.0F;
      float var4 = this.IIliilI1_1I_1II1IilIi1iIIl1ii__.getOrDefault(var1, var3);
      float var5 = this.lI1llll1IIIi1lIlIlII__i__ll1i / Float.intBitsToFloat((1091764224 | 34441) ^ 35620489);
      var4 = var3 > var4 ? Math.min(var3, var4 + var5) : Math.max(var3, var4 - var5);
      this.IIliilI1_1I_1II1IilIi1iIIl1ii__.put(var1, var4);
      return var4;
   }

   private float IIi_l1ilili_IIII1__Iii1(liiil1liIil1l11iil11li1iI param1, float nullx) {
      float var3 = this.iiliiiIII_l_l1i__l1l1iilII_l__1.contains(var1) ? 1.0F : 0.0F;
      float var4 = this.il_ii_1_l_1i11l_l1lil11lllI.getOrDefault(var1, var3);
      float var5 = nullx / Float.intBitsToFloat(700849945 * 2077668063 + 472745785);
      var4 = var3 > var4 ? Math.min(var3, var4 + var5) : Math.max(var3, var4 - var5);
      this.il_ii_1_l_1i11l_l1lil11lllI.put(var1, var4);
      return var4;
   }

   private float i_1ll_II1i1Ill1_lliI___iI1Il_I(IiiI_Ii11l1I1__11ll1I1 param1) {
      float var2 = var1.percent();
      float var3 = I__lllIliii1_1lIiIli_l1iiII_l1_.follow(
         this.iIllI1I1iIIl11iI__i11l_11I.getOrDefault(var1, var2),
         var2,
         Float.intBitsToFloat((163577856 | 51390) ^ 1265944766),
         this.lI1llll1IIIi1lIlIlII__i__ll1i
      );
      this.iIllI1I1iIIl11iI__i11l_11I.put(var1, var3);
      return var3;
   }

   private float I1i1IiI__IllIIii1I_i____l(int param1, float nullx) {
      float var3 = this.ii_1_11llliI1lil_11i1l[var1];
      float var4 = I__lllIliii1_1lIiIli_l1iiII_l1_.follow(
         this.l_I111l__llIiI__I1iI_i[var1], var3, Float.intBitsToFloat((-1480785920 | 34287) ^ -446593553), nullx
      );
      this.l_I111l__llIiI__I1iI_i[var1] = var4;
      return var4;
   }

   private float iil_1li_1_iIiii__iiI_11lII_() {
      long var1 = System.nanoTime();
      float var3 = this.i1I11iil1_l1_1_l_lIii_lil_1_i1l < 0L
         ? 0.0F
         : (float)(var1 - this.i1I11iil1_l1_1_l_lIii_lil_1_i1l) / Float.intBitsToFloat(-1512708001 * -1205724927 + -1689324383);
      this.i1I11iil1_l1_1_l_lIii_lil_1_i1l = var1;
      return Math.min(var3, Float.intBitsToFloat((335872000 | 60722) ^ 1456336178));
   }

   public boolean method_25402(double param1, double nullx, int nullxx) {
      var1 = (double)this.i1il1I1I__Il_IIi1i1__lIlil(var1);
      nullx = (double)this.IiIllI_llIlii11__l_l1li_I1l(nullx);
      if (this.IlIi1i_i1i1l1i_i_iiii_Il1) {
         return (boolean)(2012080259 * -805371623 + -731985866);
      } else if (nullxx >= (~83809827 - -649563245 ^ 565753419) && this.ii__iliiI1li___ll_il_I1111((~-2100137432 - 106648919 ^ 1993489256) + nullxx)) {
         return (boolean)((219414528 | 22946) ^ 219437475);
      } else if (iI1liiliiIi__lI_1__I__.I1i1l__ii1Il_1l__ili11i()) {
         this.iI___11lIl1ilI_i1iiI_Il_i_lll.mouseClicked((float)var1, (float)nullx, nullxx);
         return (boolean)((1360396288 | 65064) ^ 1360461353);
      } else if (this.iii1__l_i__1iiIli1lIlll_1iI && this.II11_Ii1Iil1l_Ii_iIiI1_IllI != null) {
         for (Entry var19 : this.I1lIIIiIlililliIII_1I_l1_.entrySet()) {
            if (((i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11)var19.getValue()).contains(var1, nullx)) {
               this.II11_Ii1Iil1l_Ii_iIiI1_IllI.setValue((String)var19.getKey());
               break;
            }
         }

         this.iii1__l_i__1iiIli1lIlll_1iI = (boolean)((328859648 | 36996) ^ 328896644);
         this.I1lIIIiIlililliIII_1I_l1_.clear();
         return (boolean)(291721892 * 265032609 + 985062109);
      } else {
         for (Entry var7 : new ArrayList<>(this.i1i1ilI_ilI11ii_lIi11I1.entrySet())) {
            if (((i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11)var7.getValue()).contains(var1, nullx)) {
               liIi1IIl_il1IIlIll1Il_1II var8 = (liIi1IIl_il1IIlIll1Il_1II)var7.getKey();
               if (var8 instanceof IiiI_Ii11l1I1__11ll1I1 var9) {
                  this.I_li1li_iiiiIiIIiI_1I__ = var9;
                  var9.setPercent(this.iI_lIlII1iill___11iI1I_1___I1I1((i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11)var7.getValue(), var1));
               } else if (var8 instanceof Il1_1_i1i_1__ll1_1_111i_11i1i var10) {
                  var10.toggle();
               } else if (var8 instanceof IIil_llIl1l_Iili_I1III var11) {
                  this.II11_Ii1Iil1l_Ii_iIiI1_IllI = var11;
                  this.iii1__l_i__1iiIli1lIlll_1iI = (boolean)(1458193849 * -519719239 + -1383786672);
                  this.l_11_111IliI1__I1li_II1_l = 0.0F;
                  this.I1lIIIiIlililliIII_1I_l1_.clear();
               } else if (var8 instanceof l1Iil1_lllilIi1IIIi_i1l_1__i var12) {
                  var12.cycle(nullxx == ((582221824 | 32160) ^ 582253985) ? ~97947984 - 921968641 ^ 1019916625 : ~-666913257 - -763278844 ^ 1430192101);
               } else if (var8 instanceof i_i1i_lI11l_1i_I_1I__lii_l__i1 var13) {
                  this.l1l11l_1l1I_IiI_ilIli_111 = this.l1l11l_1l1I_IiI_ilIli_111 == var13 ? null : var13;
                  return (boolean)(~1475213260 - 1848495403 ^ 971258633);
               }

               this.l1l11l_1l1I_IiI_ilIli_111 = null;
               return (boolean)((-1681129472 | 55062) ^ -1681074409);
            }
         }

         for (Entry var18 : new ArrayList<>(this.l1llII1_ll1i1_I_l_Ili1_.entrySet())) {
            if (((i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11)var18.getValue()).contains(var1, nullx)) {
               liiil1liIil1l11iil11li1iI var20 = (liiil1liIil1l11iil11li1iI)var18.getKey();
               int var21 = nullxx != -1849021532 * -1090263027 + -2109527891 && var20.isToggleable()
                  ? ~1671716524 - -1101399006 ^ -570317519
                  : (-522649600 | 54143) ^ -522595458;
               if (var21 != 0 && !var20.getSettings().isEmpty()) {
                  if (!this.iiliiiIII_l_l1i__l1l1iilII_l__1.remove(var20)) {
                     this.iiliiiIII_l_l1i__l1l1iilII_l__1.add(var20);
                  }

                  if (this.l1l11l_1l1I_IiI_ilIli_111 != null && var20.getSettings().contains(this.l1l11l_1l1I_IiI_ilIli_111)) {
                     this.l1l11l_1l1I_IiI_ilIli_111 = null;
                  }
               } else {
                  var20.toggle();
               }

               return (boolean)((800587776 | 23304) ^ 800611081);
            }
         }

         return super.method_25402(var1, nullx, nullxx);
      }
   }

   public boolean method_25403(double param1, double nullx, int nullxx, double nullxxx, double nullxxxx) {
      var1 = (double)this.i1il1I1I__Il_IIi1i1__lIlil(var1);
      nullx = (double)this.IiIllI_llIlii11__l_l1li_I1l(nullx);
      if (!iI1liiliiIi__lI_1__I__.I1i1l__ii1Il_1l__ili11i()) {
         if (this.I_li1li_iiiiIiIIiI_1I__ != null) {
            i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var10 = this.i1i1ilI_ilI11ii_lIi11I1.get(this.I_li1li_iiiiIiIIiI_1I__);
            if (var10 != null) {
               this.I_li1li_iiiiIiIIiI_1I__.setPercent(this.iI_lIlII1iill___11iI1I_1___I1I1(var10, var1));
            }

            return (boolean)(~-1548818472 - 1292007954 ^ 256810516);
         } else {
            return super.method_25403(var1, nullx, nullxx, nullxxx, nullxxxx);
         }
      } else {
         return (boolean)(!this.iI___11lIl1ilI_i1iiI_Il_i_lll.mouseDragged((float)var1, (float)nullx)
               && !super.method_25403(var1, nullx, nullxx, nullxxx, nullxxxx)
            ? -1729399721 * -1011874529 + -1587071369
            : ~540520736 - -858602853 ^ 318082117);
      }
   }

   public boolean method_25406(double param1, double nullx, int nullxx) {
      this.I_li1li_iiiiIiIIiI_1I__ = null;
      this.iI___11lIl1ilI_i1iiI_Il_i_lll.mouseReleased();
      return super.method_25406(var1, nullx, nullxx);
   }

   public boolean method_25401(double param1, double nullx, double nullxx, double nullxxx) {
      var1 = (double)this.i1il1I1I__Il_IIi1i1__lIlil(var1);
      nullx = (double)this.IiIllI_llIlii11__l_l1li_I1l(nullx);
      if (nullxxx != 0.0 && this.ii__iliiI1li___ll_il_I1111(lli_11I__lI_i1li1Ii11i_.Ii1_II_i11_il_l11l1II_lI_I(nullxxx))) {
         return (boolean)(~1872598572 - -106300316 ^ -1766298258);
      } else if (!iI1liiliiIi__lI_1__I__.I1i1l__ii1Il_1l__ili11i()) {
         for (int var9 = (-16449536 | 54041) ^ -16395495; var9 < this.i_l_l1iiIIi_1_Ii1l11_l_i_IliI_i.length; var9++) {
            i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var10 = this.Ii_ii11I_liIl1Ili1_1_1l___I1l[var9];
            if (var10 != null && !(this.IilIliii1l__1iIl__lI11[var9] <= 0.0F) && var10.contains(var1, nullx)) {
               this.ii_1_11llliI1lil_11i1l[var9] = I1l1_ill_I11_iii_1II_il11_lli1l(
                  this.ii_1_11llliI1lil_11i1l[var9]
                     - (float)nullxxx * this.lilI1ili1_II_Ii_liI_iiIiI(Float.intBitsToFloat(~1906239013 - -39925600 ^ -787328710)),
                  0.0F,
                  this.IilIliii1l__1iIl__lI11[var9]
               );
               return (boolean)((641007616 | 65000) ^ 641072617);
            }
         }

         return super.method_25401(var1, nullx, nullxx, nullxxx);
      } else {
         return (boolean)(!this.iI___11lIl1ilI_i1iiI_Il_i_lll.mouseScrolled(nullxxx) && !super.method_25401(var1, nullx, nullxx, nullxxx)
            ? ~-1128727526 - 694244712 ^ 434482813
            : 443747440 * 1253810735 + -516827279);
      }
   }

   private boolean ii__iliiI1li___ll_il_I1111(int param1) {
      if (iI1liiliiIi__lI_1__I__.I1i1l__ii1Il_1l__ili11i()) {
         return this.iI___11lIl1ilI_i1iiI_Il_i_lll.bindInput(var1);
      } else if (this.l1l11l_1l1I_IiI_ilIli_111 == null) {
         return (boolean)(~917186295 - -190359644 ^ -726826652);
      } else {
         this.l1l11l_1l1I_IiI_ilIli_111.setKey(var1);
         this.l1l11l_1l1I_IiI_ilIli_111 = null;
         return (boolean)(1482384080 * 1823275723 + -1924561647);
      }
   }

   private float iI_lIlII1iill___11iI1I_1___I1I1(i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 param1, double nullx) {
      i_iii_i1I1l_1IliIII1li.iiIllI_1i__1l11iIIi_I1IliI__11 var4 = this.II1lIIIIIll1iliiiil_1IliII(var1);
      return (float)((nullx - (double)var4.x()) / (double)Math.max(1.0F, var4.width()));
   }

   public boolean method_25400(char param1, int nullx) {
      return (boolean)(iI1liiliiIi__lI_1__I__.I1i1l__ii1Il_1l__ili11i() && this.iI___11lIl1ilI_i1iiI_Il_i_lll.charTyped(var1)
         ? ~655324169 - -723681495 ^ 68357324
         : super.method_25400(var1, nullx));
   }

   public boolean method_25404(int param1, int nullx, int nullxx) {
      if (iI1liiliiIi__lI_1__I__.I1i1l__ii1Il_1l__ili11i() && this.iI___11lIl1ilI_i1iiI_Il_i_lll.keyPressed(var1)) {
         return (boolean)(~734787035 - -2111728899 ^ 1376941862);
      } else if (this.l1l11l_1l1I_IiI_ilIli_111 == null) {
         if (var1 == 428554457 * -309519741 + -1787371443) {
            if (!this.IIlIlIiiii1l_lllllllllI) {
               this.method_25419();
            }

            return (boolean)((561184768 | 31825) ^ 561216592);
         } else if (var1 == (~76751643 - -462455915 ^ 385704015)) {
            this.method_25419();
            return (boolean)((-903086080 | 14110) ^ -903071969);
         } else {
            return super.method_25404(var1, nullx, nullxx);
         }
      } else {
         int var4 = var1 != (~178518362 - 266024338 ^ -444542957) && var1 != ((2001666048 | 41885) ^ 2001707672)
            ? ~1470457188 - -1524378469 ^ 53921280
            : (-402849792 | 2282) ^ -402847509;
         this.l1l11l_1l1I_IiI_ilIli_111.setKey(var4 != 0 ? ~-1467887060 - -38890984 ^ -1506778044 : var1);
         this.l1l11l_1l1I_IiI_ilIli_111 = null;
         return (boolean)(-875668463 * -566193469 + 1326329102);
      }
   }

   public boolean method_16803(int param1, int nullx, int nullxx) {
      if (var1 == 1433145989 * 371065939 + 68545593) {
         this.IIlIlIiiii1l_lllllllllI = (boolean)((-641335296 | 48159) ^ -641287137);
         return (boolean)((785252352 | 6210) ^ 785258563);
      } else {
         return super.method_16803(var1, nullx, nullxx);
      }
   }

   public void method_25419() {
      if (!this.IlIi1i_i1i1l1i_i_iiii_Il1) {
         this.IlIi1i_i1i1l1i_i_iiii_Il1 = (boolean)(-456511681 * -909595031 + 1555942698);
         this.l1I_111l_i1I1__Iii_1i_Iili111I = 0.0F;
         this.iii1__l_i__1iiIli1lIlll_1iI = (boolean)(-908462236 * 1243120307 + 328678676);
         this.I1lIIIiIlililliIII_1I_l1_.clear();
      }
   }

   public void method_25420(class_332 param1, int nullx, int nullxx, float nullxxx) {
   }

   public boolean method_25421() {
      return (boolean)(1079205271 * 1556691147 + 31244611);
   }

   private Color II1I1lll1I_iilI1I_1I1I_I11llli(Color param1, float nullx) {
      return lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(var1, nullx);
   }

   private Color llill_II1iI1i1lli1iliIII(Color param1, Color nullx, float nullxx) {
      return lliII1_Ili_I1Il11l_I1ill.Ili__I1l1l_iIIil__l1i1I_l1l1I(var1, nullx, nullxx);
   }

   private static float I1l1_ill_I11_iii_1II_il11_lli1l(float param0, float nullx, float nullxx) {
      return lliII1_Ili_I1Il11l_I1ill.lli_1Ii11i1Ii1_l__Ii______I(var0, nullx, nullxx);
   }

   private static float Ill_ll11lIlllilliI1_iil(float param0) {
      return lliII1_Ili_I1Il11l_I1ill.i_IiIiiiIIllI_iII1i1ii1il1l(var0);
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
