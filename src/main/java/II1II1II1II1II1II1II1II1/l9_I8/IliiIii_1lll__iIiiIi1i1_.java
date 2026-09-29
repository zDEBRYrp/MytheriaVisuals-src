package II1II1II1II1II1II1II1II1.l9_I8;

import II1II1II1II1II1II1II1II1.I1_i0.I_IlI1I_i_1l_i__il1_iilIliII_i;
import II1II1II1II1II1II1II1II1.I2_i1.Ili_li1lli_Ii1111i1i_iI__ll1Ii;
import II1II1II1II1II1II1II1II1.I6_i5.lliII1_Ili_I1Il11l_I1ill;
import II1II1II1II1II1II1II1II1.I8_i7.I11i11Ii1illli1iliI_1I_II_;
import II1II1II1II1II1II1II1II1.I8_i7.Ii1_I1Ii_l1ilIIlII1iliIlI;
import II1II1II1II1II1II1II1II1.I8_i7.i___I1II11i_IlIil__IlI__IIi;
import II1II1II1II1II1II1II1II1.I9_i8.i_I_I_ii_I1l_1__illlIl1l__li;
import II1II1II1II1II1II1II1II1.l3_I2.iiIIi_1l1_IllIi11iiil1l_1iIli;
import II1II1II1II1II1II1II1II1.l4_I3.I1I_IiI_iIIllilllIil1_;
import II1II1II1II1II1II1II1II1.l4_I3.IlIilI1Ili1_i1i1lIliliII1;
import II1II1II1II1II1II1II1II1.l4_I3.iIIlIIi1iI_1lilll1i11111l_Ii1;
import java.awt.Color;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import nesquik.mytheria.mixin.client.MinecraftAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_1068;
import net.minecraft.class_1109;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_320;
import net.minecraft.class_332;
import net.minecraft.class_3417;
import net.minecraft.class_437;
import net.minecraft.class_4844;
import net.minecraft.class_320.class_321;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public class IliiIii_1lll__iIiiIi1i1_ extends class_437 {
   private static final float i_IiiiIil1Illi_1ilI1_lI = Float.intBitsToFloat(~-460053938 - 1620243782 ^ -19453845);
   private static final float I1i_IIIll1i1IiI__i_IlllIi_lIi = Float.intBitsToFloat(~1167302204 - -1081218996 ^ -1101432457);
   private static final float iII__IiIi1Ill_Ii_1_II_i_li1 = Float.intBitsToFloat(~420820732 - -1939821699 ^ 419831174);
   private static final float li11il1i11i_Il_ll11lI_i_lIi_l1 = Float.intBitsToFloat((-233963520 | 46850) ^ -1309985022);
   private static final float lIIil_IIli___lI_1iiIiII_ = Float.intBitsToFloat((-1622147072 | 36149) ^ -613708491);
   private static final float IiIliiI_l_1_I1iI1l1__Il_1 = Float.intBitsToFloat((1542520832 | 55425) ^ 430823553);
   private static final float III11II_IiiIi1_11Il_1_1_li1 = Float.intBitsToFloat(111023850 * 246362777 + -143353306);
   private static final float il_ili11iIiI_1il_Ii1__lIll11lll = Float.intBitsToFloat(~-300983721 - 460134825 ^ -1215067137);
   private static final Color ii_lIIli11_illiIl1I_1iIII = new Color(
      -262474893 * -1315303921 + -80907709, -412709831 * 504583165 + -101322581, 1664403285 * 2126544931 + -1235337375, -317673394 * 567433033 + 207042677
   );
   private static final Color II_iiliIiI1I_II_lliil1_ = new Color(
      (1574240256 | 1828) ^ 1574242084, (-605552640 | 58456) ^ -605494184, 1031892328 * -855284371 + 1420976824, 1785696638 * 1166418967 + -1584384492
   );
   private static final Color i1_lI1I1l___I1i1ii1i_1 = new Color(
      -1191441915 * 1861977819 + -633483093, 1797702502 * -1917134217 + 142233740, ~-380373367 - -946145615 ^ 1326518842, ~-460624405 - -409873703 ^ 870498295
   );
   private static final Color ilI11_iiIlIiiiIliIiI1lI__I = new Color(
      ~909630118 - 260993925 ^ -1170624213, (1347551232 | 13234) ^ 1347564365, -1324264145 * -1554216463 + 2117380288, -593239714 * 1760915765 + 480369149
   );
   private static final Color iiilIlllIl1l_l11Iilllliil = new Color(
      2119503233 * -1971607779 + 764629584, ~-1781569795 - -1744621512 ^ -768776028, -1729621533 * -69788965 + 151168317, ~945731292 - 732433971 ^ -1678165489
   );
   private static final float i1ii1I_I1llllIi_l___IIl_1 = Float.intBitsToFloat(1373376396 * 402414205 + 180695204);
   private static final DateTimeFormatter iiIIII1_iIii_I1_i1I11i_i_ii_ii;
   private static final String[] I_l1_i1I111lll_IIlIlli1_lI1__li;
   private static final String[] lI1l_lI_l_1i_I1i1l11Il;
   private static final List<IliiIii_1lll__iIiiIi1i1_.li_I1Ii_iii_IlIIIl1l1i1_l1_1_iI> I11_1111_l_l_i_1_Iii1l_;
   private static boolean li1i1I_Ii_liiI1_lii__1I1___1i;
   private static boolean i1ii1l1iIll1II111iilill_lI1I11;
   private final class_437 ilI_Ii_I_l1i1i11_iI_1__I1i__;
   private String I1i__1Iil_li__Ilii_IiII_Ii;
   private boolean I1Ii1l_l1lil_11illlli1Il1_i;
   private float iii__1_1_ii_1i_l_liIl11l_;
   private float I__l1__lI1_1lllliill___i_lIi;
   private float IIii_1l1li__iIlil_l1IIiiiiI1il1;
   private long ii_IlII1llI1ii1l1__l_iii111i;
   private long i_I1Iil11IIi1_1I1l_1IlI_;
   private final float[] IlIlI__I_1I1_lIl_11ll1I;
   private float[] iI1lI1il_1llII1___li11i1I_i;
   private float l11IIIl_1il_I_I_i1illI1lI1_I1;
   private float I1iII_1_i1ilI__i11lIili1Ill1l1l;
   private float I_Ii__li__Illlii1lIi1I1ll_Ii;
   public static final char[][] ii1_1lIiiI1_ilIiill1iI1l = new char[(284819456 | 15362) ^ 284834998][];

   public IliiIii_1lll__iIiiIi1i1_(class_437 param1) {
      String var10001 = il1i1__I_ll_Il_i11i_I__i_1I_I((2061959168 | 16328) ^ 2061975496);
      if (var10001 == null) {
         byte[] var2 = new byte[(-1719009280 | 7068) ^ -1719002222];
         var2[(1274740736 | 60163) ^ 1274800899] = (byte)(~819853084 - -1052534201 ^ 232681122);
         var2[(1542389760 | 50852) ^ 1542440613] = (byte)(~-226127027 - -1031701939 ^ -1257828939);
         var2[-802169580 * -1906282593 + -236321642] = (byte)(-664183077 * 1434640105 + -979320570);
         var2[(852099072 | 11955) ^ 852111024] = (byte)(1706283495 * 451616863 + -1560593682);
         var2[~-292707940 - 2133121353 ^ -1840413410] = (byte)(~1718376362 - 1582980459 ^ -993610437);
         var2[~-878875251 - 1284541966 ^ -405666719] = (byte)((1740767232 | 35686) ^ 1740802910);
         var2[416929890 * -1126111617 + -1513776280] = (byte)(-470175391 * -1192838053 + -2099988884);
         var2[(1734344704 | 36830) ^ 1734381529] = (byte)(~237366129 - 304966018 ^ 542332065);
         var2[~1843518012 - 806858430 ^ 1644590861] = (byte)((-344064000 | 16824) ^ -344047129);
         var2[(1552285696 | 50701) ^ 1552336388] = (byte)((-1331691520 | 8290) ^ 1331683208);
         var2[(831258624 | 265) ^ 831258883] = (byte)(~-1973624877 - -492626925 ^ 1828715447);
         var2[-1615638945 * 1673814383 + 315819482] = (byte)((-1425408000 | 20858) ^ -1425387153);
         var2[1239461131 * 2015104501 + -839068283] = (byte)(~941722279 - -882235074 ^ -59487228);
         var2[(20054016 | 20120) ^ 20074133] = (byte)(~870812179 - 738641754 ^ -1609453827);
         var10001 = II11iiII_11iiiilIIl_IlIIl1_l_(var2, ~-1855589606 - 64689270 ^ 1790900335);
      }

      super(class_2561.method_43470(var10001));
      var10001 = il1i1__I_ll_Il_i11i_I__i_1I_I((-463798272 | 26364) ^ -463771907);
      if (var10001 == null) {
         byte[] var4 = new byte[~598111033 - -1016048546 ^ 417937516];
         var4[~-2009733965 - 1847624415 ^ 162109549] = (byte)(~-778082791 - 941271870 ^ 163189040);
         var4[(-205914112 | 42066) ^ -205872045] = (byte)((-1844051968 | 4804) ^ -1844047152);
         var4[(-1661337600 | 27794) ^ -1661309808] = (byte)(1895453557 * 1676846555 + -562679362);
         var4[(-284622848 | 45575) ^ -284577276] = (byte)(2824549 * -2014470821 + -1130755976);
         var10001 = II11iiII_11iiiilIIl_IlIIl1_l_(var4, ~-51871293 - -1552077605 ^ 1603948896);
      }

      this.I1i__1Iil_li__Ilii_IiII_Ii = var10001;
      this.IIii_1l1li__iIlil_l1IIiiiiI1il1 = 1.0F;
      this.ii_IlII1llI1ii1l1__l_iii111i = System.currentTimeMillis();
      this.i_I1Iil11IIi1_1I1l_1IlI_ = this.ii_IlII1llI1ii1l1__l_iii111i;
      this.IlIlI__I_1I1_lIl_11ll1I = new float[~-452805403 - -1731324823 ^ -2110837067];
      this.iI1lI1il_1llII1___li11i1I_i = new float[(-1861353472 | 29148) ^ -1861324324];
      this.l11IIIl_1il_I_I_i1illI1lI1_I1 = Float.intBitsToFloat(-1628264 * 277057033 + 1225870248);
      this.I1iII_1_i1ilI__i11lIili1Ill1l1l = Float.intBitsToFloat((-267124736 | 35426) ^ -1275491742);
      this.I_Ii__li__Illlii1lIi1I1ll_Ii = Float.intBitsToFloat(~-2123236691 - 1128082809 ^ 2046482393);
      this.ilI_Ii_I_l1i1i11_iI_1__I1i__ = var1;
      l11I__l11_i11i1lliI1il1I1();
   }

   protected void method_25426() {
      this.i_I1Iil11IIi1_1I1l_1IlI_ = System.currentTimeMillis();
      this.ii_IlII1llI1ii1l1__l_iii111i = this.i_I1Iil11IIi1_1I1l_1IlI_;
   }

   private float l_llIl_lI_IIiI11Ii1_1_1__ii1l(float param1) {
      return (float)this.field_22789 * Float.intBitsToFloat(1519758732 * -1132076137 + 504856172)
         + (var1 - Float.intBitsToFloat((-938016768 | 10062) ^ -1952913586)) * this.IIii_1l1li__iIlil_l1IIiiiiI1il1;
   }

   private float i_iilII1liI11i_i_i1l_lIl(float param1) {
      return (float)this.field_22790 * Float.intBitsToFloat(~-191478848 - -2082744663 ^ -1198660202)
         + (var1 - Float.intBitsToFloat((1097203712 | 61599) ^ 90304671)) * this.IIii_1l1li__iIlil_l1IIiiiiI1il1;
   }

   private boolean iiII_Ill1l_ll1I_i_1i11i(double param1, double nullx, float nullxx, float nullxxx, float nullxxxx, float nullxxxxx) {
      return (boolean)(var1 >= (double)this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(nullxx)
            && var1 <= (double)this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(nullxx + nullxxxx)
            && nullx >= (double)this.i_iilII1liI11i_i_i1l_lIl(nullxxx)
            && nullx <= (double)this.i_iilII1liI11i_i_i1l_lIl(nullxxx + nullxxxxx)
         ? (-1079705600 | 25776) ^ -1079679823
         : (597688320 | 31975) ^ 597720295);
   }

   public void method_25394(class_332 param1, int nullx, int nullxx, float nullxxx) {
      i___I1II11i_IlIil__IlI__IIi.i_IiIil_1_I_IlIlIilIIliIl_1i1();
      long var5 = System.currentTimeMillis();
      float var7 = (float)Math.min(~-7739852828289883949L - 7543418440638155132L ^ 196434387651728852L, var5 - this.ii_IlII1llI1ii1l1__l_iii111i);
      this.ii_IlII1llI1ii1l1__l_iii111i = var5;
      float var8 = (float)(var5 - this.i_I1Iil11IIi1_1I1l_1IlI_);
      float var9 = this.IIii_1l1li__iIlil_l1IIiiiiI1il1 = (float)this.field_22790 / Float.intBitsToFloat(~47151442 - 202567848 ^ -1248160251);
      Matrix4f var10 = var1.method_51448().method_23760().method_23761();
      II_i1_l1l_Ill11I1__1iII1_1.il__Ili11__I_1lI__lli_Iii_I1_li(var10, (float)this.field_22789, (float)this.field_22790);
      float var11 = lliII1_Ili_I1Il11l_I1ill.i_IiIiiiIIllI_iII1i1ii1il1l(var8 / Float.intBitsToFloat(-1560830210 * 1675404377 + 497549746));
      float var12 = (1.0F - var11) * Float.intBitsToFloat(-1384026146 * 331977371 + 315009174) * var9;
      if (this.iI1lI1il_1llII1___li11i1I_i.length != I11_1111_l_l_i_1_Iii1l_.size()) {
         this.iI1lI1il_1llII1___li11i1I_i = new float[I11_1111_l_l_i_1_Iii1l_.size()];
      }

      float var13 = Math.max(
         0.0F,
         (float)I11_1111_l_l_i_1_Iii1l_.size() * Float.intBitsToFloat(~862304161 - -495118043 ^ -1465962695)
            - Float.intBitsToFloat(~-1248086340 - -1194929299 ^ -796035626)
            + Float.intBitsToFloat((-99549184 | 65482) ^ -1142816822)
            - Float.intBitsToFloat((1488715776 | 10357) ^ 458860661)
      );
      this.I__l1__lI1_1lllliill___i_lIi = lliII1_Ili_I1Il11l_I1ill.lli_1Ii11i1Ii1_l__Ii______I(this.I__l1__lI1_1lllliill___i_lIi, 0.0F, var13);
      this.iii__1_1_ii_1i_l_liIl11l_ = this.iii__1_1_ii_1i_l_liIl11l_
         + (this.I__l1__lI1_1lllliill___i_lIi - this.iii__1_1_ii_1i_l_liIl11l_)
            * Math.min(1.0F, var7 / Float.intBitsToFloat(-1445631484 * 1053177901 + -1044415156));
      lliII1_Ili_I1Il11l_I1ill.iliiI_1lI11l_iil1iIIl__liI_lIi(
         var10,
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(0.0F),
         this.i_iilII1liI11i_i_i1l_lIl(Float.intBitsToFloat(-786961249 * -1954622487 + 1903990345)) + var12,
         Float.intBitsToFloat((30736384 | 2410) ^ 1171966314) * var9,
         Float.intBitsToFloat((-110493696 | 48705) ^ -1165017535) * var9,
         Float.intBitsToFloat(-2038310577 * -694840391 + -122251031) * var9,
         Float.intBitsToFloat(-1747475679 * 1857120889 + 1010252647),
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(ii_lIIli11_illiIl1I_1iIII, var11)
      );
      Ii1_I1Ii_l1ilIIlII1iliIlI.l1i_111_IIlI1___1l_IlIil1();
      lliII1_Ili_I1Il11l_I1ill.Ii1ii1_1_llI1l1iiIIll_111IIiii_(
         var1,
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(0.0F),
         this.i_iilII1liI11i_i_i1l_lIl(Float.intBitsToFloat((-439091200 | 3556) ^ -1504178716)),
         Float.intBitsToFloat(-743971804 * -1537895387 + -856492340) * var9,
         Float.intBitsToFloat(~419423131 - -256771244 ^ -1247043312) * var9
      );
      String var14 = this.field_22787.method_1548().method_1676();
      boolean var15 = this.iiII_Ill1l_ll1I_i_1i11i(
         (double)nullx,
         (double)nullxx,
         0.0F,
         Float.intBitsToFloat(~1590575254 - -1040111507 ^ -1665362180),
         Float.intBitsToFloat(~308349613 - -209171352 ^ -1105630998),
         Float.intBitsToFloat((-1106968576 | 42905) ^ -35641447)
      );

      for (int var16 = 1646241854 * 1402507999 + 2041124350; var16 < I11_1111_l_l_i_1_Iii1l_.size(); var16++) {
         IliiIii_1lll__iIiiIi1i1_.li_I1Ii_iii_IlIIIl1l1i1_l1_1_iI var17 = I11_1111_l_l_i_1_Iii1l_.get(var16);
         float var18 = Float.intBitsToFloat(~-902521098 - -1897897427 ^ -444989732)
            + (float)var16 * Float.intBitsToFloat(-1443941541 * 457249501 + 441140337)
            - this.iii__1_1_ii_1i_l_liIl11l_;
         if (!(var18 + Float.intBitsToFloat(~-992551924 - 858574880 ^ 1167872979) < Float.intBitsToFloat((36175872 | 29803) ^ 1101296747))
            && !(var18 > Float.intBitsToFloat((-13828096 | 29309) ^ -1156205955))) {
            int var19 = var15
                  && this.iiII_Ill1l_ll1I_i_1i11i(
                     (double)nullx,
                     (double)nullxx,
                     Float.intBitsToFloat(1995649108 * 1335390993 + 2125729388),
                     var18,
                     Float.intBitsToFloat(~1717348526 - 253837507 ^ -829794674),
                     Float.intBitsToFloat(~1978471348 - -2120883728 ^ 1243417179)
                  )
               ? ~1538685572 - 622203077 ^ 2134078647
               : ~-1523054191 - -1251926923 ^ -1519986183;
            this.iI1lI1il_1llII1___li11i1I_i[var16] = Il11____I111_l_liI1111(this.iI1lI1il_1llII1___li11i1I_i[var16], (boolean)var19, var7);
            this.iIII1l1_l_lli1I_liIl1i(
               var10,
               var17,
               var18,
               var12,
               var11,
               this.iI1lI1il_1llII1___li11i1I_i[var16],
               var17.name().equals(var14),
               (boolean)(var15
                     && this.iiII_Ill1l_ll1I_i_1i11i(
                        (double)nullx,
                        (double)nullxx,
                        Float.intBitsToFloat(-1208288845 * 1456804991 + 2131715123),
                        var18 + Float.intBitsToFloat(~-699447361 - 64025738 ^ 1687143350),
                        Float.intBitsToFloat(665170958 * 971689671 + 1718732062),
                        Float.intBitsToFloat(398916397 * 1756602933 + -2108389969)
                     )
                  ? 2083372217 * -716924309 + -2026449746
                  : 377504061 * -1987878235 + 1596299695)
            );
         }
      }

      if (I11_1111_l_l_i_1_Iii1l_.isEmpty()) {
         i_I_I_ii_I1l_1__illlIl1l__li var20 = I11i11Ii1illli1iliI_1I_II_.li1i1_iIili1IllII1lIi_1liI11I_();
         String var10000 = il1i1__I_ll_Il_i11i_I__i_1I_I((2120155136 | 19609) ^ 2120174747);
         if (var10000 == null) {
            int[] var23 = new int[(-907935744 | 13194) ^ -907922533];
            var23[~1560026056 - -499577842 ^ -1060448215] = -511007208 * -575354083 + -566335562;
            var23[~-1992435652 - 706389807 ^ 1286045845] = (-1202520064 | 37480) ^ 1142856285;
            var23[-2052288472 * -1758656901 + -877802294] = (-358023168 | 10389) ^ -564225284;
            var23[-413932536 * 351331859 + 241623915] = -562008533 * -1209284209 + 361992866;
            var23[-1736496434 * 618977067 + 2117651818] = (-1441464320 | 40878) ^ -692660741;
            var23[~-166559613 - 648978712 ^ -482419103] = ~-136289709 - 1444607015 ^ 1373685948;
            var23[~2039127581 - -6689076 ^ -2032438512] = ~-230840236 - 883022396 ^ 898180394;
            var23[(-1163132928 | 23708) ^ -1163109221] = ~2011651084 - -64467027 ^ 724148609;
            var23[~1736178894 - 131715619 ^ -1867894522] = (-907804672 | 53549) ^ -2009367315;
            var23[-712669776 * 939134153 + -1174026023] = ~694221938 - 444005094 ^ 244381198;
            var23[-941589976 * 515996419 + 92625298] = -2034853966 * -18893383 + 92176396;
            var23[(-1677721600 | 2236) ^ -1677719369] = (63766528 | 33232) ^ 223268998;
            var23[-1591541798 * -178911871 + -1994272462] = ~1079280816 - 1729213720 ^ 229878375;
            var23[(687407104 | 44450) ^ 687451567] = ~21567934 - 589500396 ^ 547510089;
            var23[(-1405943808 | 38022) ^ -1405905784] = 31902719 * -423801719 + -1432287010;
            var23[~-925138239 - -2055388305 ^ -1314440768] = 1077555534 * -1962996587 + 114990434;
            var23[(-1126367232 | 28082) ^ -1126339166] = ~1872300870 - 1980706436 ^ 441921581;
            var10000 = II11iiII_11iiiilIIl_IlIIl1_l_(var23, -278400924 * -1524106757 + 420088374, (-15532032 | 55707) ^ -15476327);
         }

         String var21 = var10000;
         float var22 = Float.intBitsToFloat(~1035684342 - 770990321 ^ -718252776) * var9;
         lliII1_Ili_I1Il11l_I1ill.iiII_1_Ii_1I___IiIl1ll(
            var10,
            var20,
            var21,
            (float)this.field_22789 * Float.intBitsToFloat(~-14786461 - -1975616828 ^ 1235428568)
               - var20.getWidth(var21, var22) * Float.intBitsToFloat(~1635070859 - -1661087404 ^ 1049426720),
            this.i_iilII1liI11i_i_i1l_lIl(Float.intBitsToFloat(-1744684762 * -1944479683 + 1557303794))
               - var22 * Float.intBitsToFloat(-1125634065 * 1701278783 + -134551505)
               + var12,
            var22,
            lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(ilI11_iiIlIiiiIliIiI1lI__I, var11)
         );
      }

      Ii1_I1Ii_l1ilIIlII1iliIlI.l1i_111_IIlI1___1l_IlIil1();
      var1.method_44380();
      this.II__lIliiII_I1llIlI1I1i_il11i_(var10, nullx, nullxx, var7, var8, var12, var11);
      Ii1_I1Ii_l1ilIIlII1iliIlI.l1i_111_IIlI1___1l_IlIil1();
      super.method_25394(var1, nullx, nullxx, nullxxx);
   }

   private void iIII1l1_l_lli1I_liIl1i(
      Matrix4f param1,
      IliiIii_1lll__iIiiIi1i1_.li_I1Ii_iii_IlIIIl1l1i1_l1_1_iI nullx,
      float nullxx,
      float nullxxx,
      float nullxxxx,
      float nullxxxxx,
      boolean nullxxxxxx,
      boolean nullxxxxxxx
   ) {
      float var9 = this.IIii_1l1li__iIlil_l1IIiiiiI1il1;
      float var10 = this.i_iilII1liI11i_i_i1l_lIl(nullxx) + nullxxx;
      Color var11 = lliII1_Ili_I1Il11l_I1ill.Ili__I1l1l_iIIil__l1i1I_l1l1I(
         II_iiliIiI1I_II_lliil1_,
         new Color(569635947 * 1920803211 + 533298957, (122945536 | 32900) ^ 122978466, (84410368 | 49588) ^ 84459934, (292093952 | 27444) ^ 292121528),
         nullxxxxx
      );
      lliII1_Ili_I1Il11l_I1ill.i1I1l_1_Ii__il_1_1iIllI1i1(
         var1,
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat(2089338620 * 1358193099 + 1164229164)),
         var10,
         Float.intBitsToFloat((-1492320256 | 4786) ^ -486190414) * var9,
         Float.intBitsToFloat(1905748171 * 1858440567 + 839875235) * var9,
         Float.intBitsToFloat(-1754644619 * -653893495 + -1208341917) * var9,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(var11, nullxxxx)
      );
      class_1044 var12 = this.field_22787.method_1531().method_4619(class_1068.method_4648(Ili___l_iIi_i_1_lli1_iIi_lIii(nullx.name())).comp_1626());
      float var13 = Float.intBitsToFloat((839057408 | 27427) ^ 1880582947) * var9;
      float var14 = this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat((-1273364480 | 38778) ^ -170748038));
      float var15 = var10 + Float.intBitsToFloat((-760479744 | 56612) ^ -1816339164) * var9;
      int var16 = lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(Color.WHITE, nullxxxx).getRGB();
      float[] var10000 = new float[(-161546240 | 33281) ^ -161512957];
      var10000[754893824 * 61984981 + 214363136] = Float.intBitsToFloat(~1042437790 - 1301928925 ^ 1245957508);
      var10000[~1582221507 - -1078577422 ^ -503644085] = Float.intBitsToFloat((-852623360 | 60254) ^ -233903266);
      float[] var17 = var10000;
      int var18 = var17.length;

      for (int var19 = ~191439423 - -1969970235 ^ 1778530811; var19 < var18; var19++) {
         float var20 = var17[var19];
         I_IlI1I_i_1l_i__il1_iilIliII_i.lIillIIlll11_IIIil1il1_()
            .size(new IlIilI1Ili1_i1i1lIliliII1(var13, var13))
            .radius(new iIIlIIi1iI_1lilll1i11111l_Ii1(Float.intBitsToFloat(2133048485 * 1993317321 + 862845811) * var9))
            .smoothness(1.0F)
            .color(new I1I_IiI_iIIllilllIil1_(var16))
            .texture(
               var20,
               Float.intBitsToFloat(~-569257158 - -1575635160 ^ 1104704925),
               Float.intBitsToFloat(~1416111022 - 1408144059 ^ 1772702102),
               Float.intBitsToFloat(-1224173014 * 1656258345 + -957056698),
               var12
            )
            .build()
            .render(var1, var14, var15);
      }

      Color var28 = new Color(
         (2081816576 | 933) ^ 2081817509,
         1037066625 * -1573913445 + -366282011,
         ~1996697808 - 109794739 ^ -2106492548,
         (int)(Float.intBitsToFloat(~1504525006 - -107977618 ^ -289251133) * nullxxxx)
      );
      Color var29 = new Color(
         -1297653171 * 1236499005 + -127016537,
         ~1715277994 - -660414406 ^ -1054863589,
         (-1688010752 | 4050) ^ -1688006702,
         (int)(Float.intBitsToFloat((-1249640448 | 61716) ^ -150671084) * nullxxxx)
      );
      lliII1_Ili_I1Il11l_I1ill.i_iii1Iii_lI1lIlilII1ilI(
         var1, var14, var15, var13, var13, Float.intBitsToFloat(~-1825546633 - -1297752702 ^ -83246074) * var9, var28, var28, var29, var29
      );
      i_I_I_ii_I1l_1__illlIl1l__li var30 = I11i11Ii1illli1iliI_1I_II_.li1i1_iIili1IllII1lIi_1liI11I_();
      float var31 = Float.intBitsToFloat((690421760 | 3387) ^ 1751059771) * var9;
      float var21 = var10 + Float.intBitsToFloat((-838467584 | 37419) ^ -1880714709) * var9;
      float var22 = this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat(-415872933 * -733929779 + 75523361)) + nullxxxxx * 2.0F * var9;
      String var10002 = il1i1__I_ll_Il_i11i_I__i_1I_I(-368834285 * -2003916431 + -374312032);
      if (var10002 == null) {
         byte[] var33 = new byte[1563971606 * -1632614287 + 1618900559];
         var33[907596642 * 60362955 + 294142282] = (byte)((1898381312 | 40200) ^ 1898421527);
         var33[(460718080 | 50666) ^ 460768747] = (byte)(~-1425978890 - -1046003686 ^ -1822984789);
         var33[~316379962 - -1916677792 ^ 1600297831] = (byte)(~-865970234 - 939866340 ^ -73896099);
         var33[(1914699776 | 61054) ^ 1914760829] = (byte)(1317462692 * -130945657 + 1973987206);
         var33[(-1612709888 | 28865) ^ -1612681019] = (byte)((2081554432 | 57966) ^ 2081612349);
         var10002 = II11iiII_11iiiilIIl_IlIIl1_l_(var33, (-724369408 | 1124) ^ -724368281);
      }

      float var10001 = var30.getGlyphTop(var10002, var31);
      String var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((426508288 | 37612) ^ 426545896);
      if (var10003 == null) {
         byte[] var38 = new byte[2124547380 * -2125335355 + 1189637889];
         var38[-1201820818 * 628771877 + -215641830] = (byte)((-1215627264 | 61011) ^ 1215566270);
         var38[~-461908331 - 503829271 ^ -41920942] = (byte)(~1487186109 - 1536296562 ^ 1271484635);
         var38[~60473898 - -278953852 ^ 218479955] = (byte)((1393885184 | 19097) ^ 1393904288);
         var38[(409665536 | 48040) ^ 409713579] = (byte)(1351889703 * -618360401 + 1799090631);
         var38[~1149495553 - -496048332 ^ -653447218] = (byte)(~-937257614 - 1615140578 ^ 677882964);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var38, ~-69943582 - -1401529174 ^ 1471472759);
      }

      float var23 = var21 - (var10001 + var30.getGlyphBottom(var10003, var31)) * Float.intBitsToFloat(~1001287542 - -1474273874 ^ 590426843);
      lliII1_Ili_I1Il11l_I1ill.iiII_1_Ii_1I___IiIl1ll(
         var1,
         var30,
         nullx.name(),
         var22,
         var23,
         var31,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(
            nullxxxxxx
               ? Ili_li1lli_Ii1111i1i_iI__ll1Ii.IiIlIl_I1liIi1_IIIIi1li1l()
               : lliII1_Ili_I1Il11l_I1ill.Ili__I1l1l_iIIil__l1i1I_l1l1I(i1_lI1I1l___I1i1ii1i_1, Color.WHITE, nullxxxxx),
            nullxxxx
         )
      );
      String var24 = nullx.added().format(iiIIII1_iIii_I1_i1I11i_i_ii_ii);
      float var25 = Float.intBitsToFloat((1046806528 | 25596) ^ 2133681148) * var9;
      var10002 = il1i1__I_ll_Il_i11i_I__i_1I_I(~-190097235 - 681023540 ^ -490926309);
      if (var10002 == null) {
         byte[] var35 = new byte[-1755961316 * -1623966317 + 138955761];
         var35[(-1594753024 | 54037) ^ -1594698987] = (byte)(~2109785863 - 405457397 ^ -1779724118);
         var35[1922073127 * 647153209 + -1259676846] = (byte)((1196687360 | 18286) ^ -1196705583);
         var35[~330362332 - 959180693 ^ -1289543028] = (byte)(-1157522034 * -262811185 + 132819960);
         var35[(-306053120 | 64588) ^ -305988529] = (byte)((1123745792 | 35941) ^ 1123781657);
         var35[1756751309 * 361958243 + -351186243] = (byte)((105512960 | 10529) ^ 105523497);
         var10002 = II11iiII_11iiiilIIl_IlIIl1_l_(var35, -1225108945 * 1440234095 + 3127204);
      }

      float var32 = var23 + var30.getGlyphBottom(var10002, var31);
      var10002 = il1i1__I_ll_Il_i11i_I__i_1I_I(~-502593720 - -2030111473 ^ -1762262098);
      if (var10002 == null) {
         byte[] var37 = new byte[-957978998 * 829248909 + -531909629];
         var37[253518853 * 2019490625 + 1105441723] = (byte)(-1343705392 * -985870605 + -1061768989);
         var37[~2113712663 - 1145401456 ^ 1035853177] = (byte)((-209321984 | 2247) ^ 209319807);
         var37[(-1319043072 | 34454) ^ -1319008620] = (byte)((49217536 | 54051) ^ 49271614);
         var37[-1890952542 * 1776251803 + 1915116013] = (byte)(~2069375777 - 1904355357 ^ 321236193);
         var37[-1938483007 * 772723035 + 1889313385] = (byte)((-1650917376 | 39628) ^ -1650877740);
         var10002 = II11iiII_11iiiilIIl_IlIIl1_l_(var37, (281083904 | 45527) ^ 281129425);
      }

      float var26 = var32 - var30.getGlyphBottom(var10002, var25);
      lliII1_Ili_I1Il11l_I1ill.iiII_1_Ii_1I___IiIl1ll(
         var1,
         var30,
         var24,
         var22 + var30.getWidth(nullx.name(), var31) + Float.intBitsToFloat((-1368653824 | 50683) ^ -290667013) * var9,
         var26,
         var25,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(ilI11_iiIlIiiiIliIiI1lI__I, nullxxxx)
      );
      Color var27 = nullxxxxxxx
         ? iiilIlllIl1l_l11Iilllliil
         : new Color(
            (851247104 | 36694) ^ 851283881, (-1145765888 | 42786) ^ -1145722915, ~1194942067 - -293350437 ^ -901591730, (-1146814464 | 55310) ^ -1146759072
         );
      IliiIii_1lll__iIiiIi1i1_.l_Ii_I_i11___i_il__I_l___.IIl_l1IlIIl__1Il__ii_l_1l1(
         var1,
         IliiIii_1lll__iIiiIi1i1_.l_Ii_I_i11___i_il__I_l___.Il1_l_IIII_lIi_1lIIlI_1III__(),
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat((-1026752512 | 19286) ^ -2033497258)),
         var21,
         Float.intBitsToFloat(~-1220368850 - -210818332 ^ 349056749) * var9,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(var27, nullxxxx)
      );
   }

   private void II__lIliiII_I1llIlI1I1i_il11i_(Matrix4f param1, int nullx, int nullxx, float nullxxx, float nullxxxx, float nullxxxxx, float nullxxxxxx) {
      float var8 = this.IIii_1l1li__iIlil_l1IIiiiiI1il1;
      i_I_I_ii_I1l_1__illlIl1l__li var9 = I11i11Ii1illli1iliI_1I_II_.li1i1_iIili1IllII1lIi_1liI11I_();
      float var10 = Float.intBitsToFloat(-679463152 * 1463148021 + 2112519600) * var8;
      lliII1_Ili_I1Il11l_I1ill.iliiI_1lI11l_iil1iIIl__liI_lIi(
         var1,
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(0.0F),
         this.i_iilII1liI11i_i_i1l_lIl(Float.intBitsToFloat(534113428 * -2141479773 + -1975571004)) + nullxxxxx,
         Float.intBitsToFloat(~1619730335 - -632030771 ^ -2127616365) * var8,
         Float.intBitsToFloat(146237631 * -265383061 + 1782287147) * var8,
         Float.intBitsToFloat(~1155895716 - -70032170 ^ -32044667) * var8,
         Float.intBitsToFloat((1989476352 | 64891) ^ 873856379),
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(ii_lIIli11_illiIl1I_1iIII, nullxxxxxx)
      );
      float var10001 = Float.intBitsToFloat(1654203955 * 1757459665 + -1257507747);
      String var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(-1851664588 * 66217085 + -1597924445);
      if (var10003 == null) {
         byte[] var30 = new byte[1372198018 * 744526379 + -90412488];
         var30[~-2079304764 - -507329695 ^ -1708332838] = (byte)((-262995968 | 24472) ^ 262971517);
         var30[~151587881 - 1305201324 ^ -1456789205] = (byte)((-163381248 | 18370) ^ -163362879);
         var30[516755829 * 1493332995 + -406468701] = (byte)((1248002048 | 8467) ^ -1248010514);
         var30[~-901555335 - 1231756425 ^ -330201090] = (byte)(~-52737314 - -2051379684 ^ 2104117084);
         var30[(253231104 | 36258) ^ 253267366] = (byte)(-2083031421 * 1610427661 + -1312623549);
         var30[~-533070337 - -1273924666 ^ 1806995007] = (byte)(~-303592879 - -1765070239 ^ 2068663122);
         var30[~-306309584 - 1091180193 ^ -784870616] = (byte)(1055418174 * 451723819 + -678318914);
         var30[-1548422603 * -414828001 + 548972956] = (byte)((743440384 | 24869) ^ -743465336);
         var30[1961437800 * 1344182949 + -368764160] = (byte)(~-1036275948 - -1705645381 ^ -1553046004);
         var30[~-605065976 - 1086476891 ^ -481410923] = (byte)(-745022805 * -2026051449 + 1605154737);
         var30[(1928462336 | 14973) ^ 1928477303] = (byte)(14381146 * 170574243 + 298818860);
         var30[-414272541 * 182201721 + 1629098688] = (byte)(444648499 * -610022731 + -61447666);
         var30[(-1690501120 | 50067) ^ -1690451041] = (byte)((-1044054016 | 45736) ^ -1044008241);
         var30[-520950006 * 194169051 + 62501503] = (byte)(-641728720 * 1740827515 + 1864323981);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var30, -2069141161 * 1955504993 + -1128746736);
      }

      this.l11IIIl_1il_I_I_i1illI1lI1_I1 = var10001
         + var9.getWidth(var10003, var10) / var8
         + Float.intBitsToFloat(~-191063838 - 425721180 ^ -1291621951)
         + Float.intBitsToFloat((-448790528 | 1074) ^ -1543502798)
         + Float.intBitsToFloat(~1027032161 - -1156748696 ^ 1184583990);
      var10001 = Float.intBitsToFloat(~-446112991 - 465438260 ^ -1075241302);
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~1323585009 - -814483788 ^ -509101230);
      if (var10003 == null) {
         byte[] var32 = new byte[-39730883 * 1126563737 + 1711718291];
         var32[(1199833088 | 8383) ^ 1199841471] = (byte)(~1256680445 - -145413113 ^ 1111267454);
         var32[~696195388 - -955191313 ^ 258995925] = (byte)((-1883373568 | 24898) ^ -1883348670);
         var32[~1168674617 - 458040748 ^ -1626715368] = (byte)((-1800470528 | 28676) ^ 1800441830);
         var32[(490078208 | 15401) ^ 490093610] = (byte)((850198528 | 42092) ^ -850240566);
         var32[~1547967874 - 1944358741 ^ 802640684] = (byte)(~421218118 - -1389859290 ^ 968641169);
         var32[~-1752626321 - -1012627353 ^ -1529713620] = (byte)((1644822528 | 23614) ^ 1644846134);
         var32[(-222625792 | 45495) ^ -222580303] = (byte)((231538688 | 26910) ^ -231565571);
         var32[1016318188 * -64039787 + -248471893] = (byte)(-132981600 * 698539805 + 980263356);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var32, -1413099057 * -476351663 + 869507209);
      }

      this.I_Ii__li__Illlii1lIi1I1ll_Ii = var10001
         + var9.getWidth(var10003, var10) / var8
         + Float.intBitsToFloat(-1001080405 * -1390127643 + -729537783)
         + Float.intBitsToFloat(1959043224 * -593245893 + 354395384)
         + Float.intBitsToFloat(~-1422645104 - -1352855191 ^ -463550970);
      this.I1iII_1_i1ilI__i11lIili1Ill1l1l = Float.intBitsToFloat(~-1895342677 - 153067551 ^ 601014837) - this.I_Ii__li__Illlii1lIi1I1ll_Ii;
      int var11 = nullxxxx > Float.intBitsToFloat((30146560 | 31703) ^ 1119255511) ? ~1438255929 - -323875620 ^ -1114380309 : (353107968 | 28885) ^ 353136853;
      this.IlIlI__I_1I1_lIl_11ll1I[~-329122718 - 1439696872 ^ -1110574155] = Il11____I111_l_liI1111(
         this.IlIlI__I_1I1_lIl_11ll1I[1331205694 * -80123663 + 314793890],
         (boolean)(var11 != 0
               && this.iiII_Ill1l_ll1I_i_1i11i(
                  (double)nullx,
                  (double)nullxx,
                  Float.intBitsToFloat(~-1046074585 - -1579529401 ^ -580941423),
                  Float.intBitsToFloat(~-634417607 - 1924257087 ^ -148857721),
                  Float.intBitsToFloat((192151552 | 58629) ^ 1215882501),
                  Float.intBitsToFloat((-839450624 | 11623) ^ -1945162393)
               )
            ? (1115619328 | 49294) ^ 1115668623
            : (270729216 | 5539) ^ 270734755),
         nullxxx
      );
      this.IlIlI__I_1I1_lIl_11ll1I[(-1305083904 | 13802) ^ -1305070103] = Il11____I111_l_liI1111(
         this.IlIlI__I_1I1_lIl_11ll1I[2084082358 * -339482023 + 1201185469],
         (boolean)(var11 != 0
               && this.iiII_Ill1l_ll1I_i_1i11i(
                  (double)nullx,
                  (double)nullxx,
                  Float.intBitsToFloat(~874902604 - 1740700389 ^ 655298766),
                  Float.intBitsToFloat(-399591780 * -799784289 + 1492540700),
                  Float.intBitsToFloat(-213532588 * 747641571 + -700060284),
                  Float.intBitsToFloat((1802371072 | 62762) ^ 714536234)
               )
            ? ~1452775775 - -838969314 ^ -613806461
            : (-201588736 | 25233) ^ -201563503),
         nullxxx
      );
      this.IlIlI__I_1I1_lIl_11ll1I[-199928289 * -1426526161 + 726671440] = Il11____I111_l_liI1111(
         this.IlIlI__I_1I1_lIl_11ll1I[~2083144896 - -2083119320 ^ -25578],
         (boolean)(var11 != 0
               && this.iiII_Ill1l_ll1I_i_1i11i(
                  (double)nullx,
                  (double)nullxx,
                  Float.intBitsToFloat(-1037381122 * 1940153067 + 13828054),
                  Float.intBitsToFloat((-1739587584 | 46711) ^ -596724105),
                  this.l11IIIl_1il_I_I_i1illI1lI1_I1,
                  Float.intBitsToFloat((1408303104 | 42542) ^ 302622254)
               )
            ? ~-728512629 - -307106584 ^ 1035619213
            : ~63314634 - 1855187714 ^ -1918502349),
         nullxxx
      );
      this.IlIlI__I_1I1_lIl_11ll1I[-2133145850 * -726776671 + -1686684356] = Il11____I111_l_liI1111(
         this.IlIlI__I_1I1_lIl_11ll1I[-704912267 * -2068279031 + 1168552677],
         (boolean)(var11 != 0
               && this.iiII_Ill1l_ll1I_i_1i11i(
                  (double)nullx,
                  (double)nullxx,
                  this.I1iII_1_i1ilI__i11lIili1Ill1l1l,
                  Float.intBitsToFloat(~1547889915 - -1443549917 ^ -1107696159),
                  this.I_Ii__li__Illlii1lIi1I1ll_Ii,
                  Float.intBitsToFloat(~1286676904 - 249718918 ^ -443255343)
               )
            ? ~22119300 - -1758308939 ^ 1736189639
            : ~-1995310226 - -1881198676 ^ -418458395),
         nullxxx
      );
      float var12 = this.i_iilII1liI11i_i_i1l_lIl(Float.intBitsToFloat(-1315751840 * -812238467 + 529406240)) + nullxxxxx;
      float var13 = var12 + Float.intBitsToFloat(-1838347741 * -2129345541 + 874145455) * var8;
      String var10002 = il1i1__I_ll_Il_i11i_I__i_1I_I(275475174 * -713396119 + -175077453);
      if (var10002 == null) {
         byte[] var25 = new byte[~-1544849109 - 185791672 ^ 1359057433];
         var25[1968407169 * -1003416457 + 827015689] = (byte)(-1710699685 * 2145468797 + -1374184998);
         var25[-2061611604 * -703353767 + -796692683] = (byte)(-1366030751 * 1520255195 + -1572255047);
         var25[~602986495 - 784451194 ^ -1387437692] = (byte)(518311782 * 1125644543 + 1023449499);
         var25[(-581238784 | 18474) ^ -581220311] = (byte)((164954112 | 61158) ^ 165015270);
         var25[~244798205 - 589189411 ^ -833987621] = (byte)(~1842889378 - -90863825 ^ -1752025504);
         var10002 = II11iiII_11iiiilIIl_IlIIl1_l_(var25, (-2001076224 | 47693) ^ -2001028540);
      }

      var10001 = var9.getGlyphTop(var10002, var10);
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(-806254812 * -2104442655 + -887277210);
      if (var10003 == null) {
         byte[] var34 = new byte[(-1170276352 | 11963) ^ -1170264386];
         var34[(1104084992 | 2482) ^ 1104087474] = (byte)((2136408064 | 56937) ^ -2136465021);
         var34[(57606144 | 24160) ^ 57630305] = (byte)(442333764 * 499565779 + 1858087420);
         var34[~1482145922 - 1075936188 ^ 1736885187] = (byte)(~-1560593085 - 1990344605 ^ -429751489);
         var34[1181476912 * -584540739 + 493888659] = (byte)(976772665 * -389319659 + 1333489937);
         var34[~-1208937374 - -1792762147 ^ -1293267772] = (byte)(~-64293387 - 925103735 ^ -860810256);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var34, ~135039320 - -604185789 ^ 469146478);
      }

      float var14 = var13 - (var10001 + var9.getGlyphBottom(var10003, var10)) * Float.intBitsToFloat((974323712 | 7560) ^ 85138824);
      Color var15 = lliII1_Ili_I1Il11l_I1ill.Ili__I1l1l_iIIil__l1i1I_l1l1I(
         II_iiliIiI1I_II_lliil1_,
         new Color(
            848232721 * -951678603 + -613651871, (1661599744 | 13524) ^ 1661613298, (-456982528 | 62573) ^ -456919993, ~-615393190 - -1214316487 ^ 1829709792
         ),
         Math.max(this.IlIlI__I_1I1_lIl_11ll1I[676521424 * -868116019 + 276080752], this.I1Ii1l_l1lil_11illlli1Il1_i ? 1.0F : 0.0F)
      );
      lliII1_Ili_I1Il11l_I1ill.i1I1l_1_Ii__il_1_1iIllI1i1(
         var1,
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat(~-842966679 - 504943182 ^ 1426445384)),
         var12,
         Float.intBitsToFloat(~1094686455 - -1400600557 ^ 1360191733) * var8,
         Float.intBitsToFloat(~-1718142321 - -1796127009 ^ -1869644143) * var8,
         Float.intBitsToFloat(~-195498639 - -1632727962 ^ 769164840) * var8,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(var15, nullxxxxxx)
      );
      String var10000;
      if (this.I1i__1Iil_li__Ilii_IiII_Ii.isEmpty() && !this.I1Ii1l_l1lil_11illlli1Il1_i) {
         var10000 = il1i1__I_ll_Il_i11i_I__i_1I_I((1886846976 | 61402) ^ 1886908369);
         if (var10000 == null) {
            byte[] var22 = new byte[875729358 * 1239294895 + 953887290];
            var22[~-442087143 - 1011038957 ^ -568951815] = (byte)(~1071494578 - 2046160389 ^ 1177312372);
            var22[-1700910492 * -1165759159 + 578508157] = (byte)((171573248 | 59443) ^ 171632655);
            var22[~-802246994 - 420393071 ^ 381853920] = (byte)(~-769544827 - -2147043035 ^ 1378379518);
            var22[(-1011023872 | 33638) ^ -1010990235] = (byte)((-1383006208 | 22609) ^ 1382983590);
            var22[1485990795 * -551778435 + -1315491803] = (byte)(2060312271 * -1744680967 + -816259258);
            var22[(-1798438912 | 1897) ^ -1798437012] = (byte)(~322672593 - -25339396 ^ 297333179);
            var22[(-1369309184 | 61562) ^ -1369247620] = (byte)(-320178624 * -1069383555 + -1713093862);
            var22[113812874 * 6148069 + -1920510571] = (byte)(152881317 * 258874807 + 1472979131);
            var22[2033212648 * 1638551949 + 1491561536] = (byte)((1796669440 | 48980) ^ -1796718446);
            var22[(1268449280 | 14127) ^ 1268463398] = (byte)((-498794496 | 21685) ^ -498772813);
            var22[157597274 * 193740059 + 164395660] = (byte)((1505558528 | 23868) ^ -1505582353);
            var22[-760858616 * -1719175389 + -1694327053] = (byte)(1516973666 * 1734868265 + -2137999288);
            var10000 = II11iiII_11iiiilIIl_IlIIl1_l_(var22, ~546258347 - -750625592 ^ 204367239);
         }
      } else {
         var10000 = this.I1i__1Iil_li__Ilii_IiII_Ii;
      }

      String var16 = var10000;
      Color var17 = this.I1i__1Iil_li__Ilii_IiII_Ii.isEmpty() ? ilI11_iiIlIiiiIliIiI1lI__I : i1_lI1I1l___I1i1ii1i_1;
      lliII1_Ili_I1Il11l_I1ill.iiII_1_Ii_1I___IiIl1ll(
         var1,
         var9,
         var16,
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat(~-1014346155 - -1226937615 ^ -1006156103)),
         var14,
         var10,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(var17, nullxxxxxx)
      );
      if (this.I1Ii1l_l1lil_11illlli1Il1_i
         && System.currentTimeMillis()
               / (~-2193738729760497353L - 1360976242486852085L ^ 832762487273645351L)
               % (~-1836099554675981430L - 4407433405702908116L ^ -2571333851026926685L)
            == 0L) {
         float var18 = this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat(~-129841650 - -253916411 ^ 1464839916))
            + var9.getWidth(this.I1i__1Iil_li__Ilii_IiII_Ii, var10)
            + 1.0F * var8;
         lliII1_Ili_I1Il11l_I1ill.i1I1l_1_Ii__il_1_1iIllI1i1(
            var1,
            var18,
            var13 - Float.intBitsToFloat(822616634 * -110691457 + -416536774) * var8,
            Float.intBitsToFloat(-1236801925 * 1271492413 + -1544201909) * var8,
            Float.intBitsToFloat(~1578913089 - 1970893582 ^ 1829388208) * var8,
            0.0F,
            lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(i1_lI1I1l___I1i1ii1i_1, nullxxxxxx)
         );
      }

      boolean var21 = iII1Ii_iI__1li1I_l1Ilil__I(this.I1i__1Iil_li__Ilii_IiII_Ii);
      Color var19 = var21
         ? lliII1_Ili_I1Il11l_I1ill.Ili__I1l1l_iIIil__l1i1I_l1l1I(
            new Color(
               ~675299367 - 1812454436 ^ 1807213387, (195362816 | 42718) ^ 195405345, ~-1120003058 - 1997310777 ^ -877307833, (873005056 | 29322) ^ 873034268
            ),
            Ili_li1lli_Ii1111i1i_iI__ll1Ii.IiIlIl_I1liIi1_IIIIi1li1l(),
            this.IlIlI__I_1I1_lIl_11ll1I[~-1526087274 - 1746402328 ^ -220315054]
         )
         : new Color(
            (-1162674176 | 25205) ^ -1162648950, -473328050 * -344149945 + -738610851, (975372288 | 44631) ^ 975417000, ~1527879166 - -1217358286 ^ -310520845
         );
      IliiIii_1lll__iIiiIi1i1_.l_Ii_I_i11___i_il__I_l___.IIl_l1IlIIl__1Il__ii_l_1l1(
         var1,
         IliiIii_1lll__iIiiIi1i1_.l_Ii_I_i11___i_il__I_l___.I_1_IIIIi1Ii_iI1I__lii_i(),
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat((-1735000064 | 60710) ^ -608867034)),
         var13,
         Float.intBitsToFloat((1422983168 | 25825) ^ 360801505) * var8,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(var19, nullxxxxxx)
      );
      lliII1_Ili_I1Il11l_I1ill.i1I1l_1_Ii__il_1_1iIllI1i1(
         var1,
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat(209714630 * -788763635 + -221932302)),
         var12,
         this.l11IIIl_1il_I_I_i1illI1lI1_I1 * var8,
         Float.intBitsToFloat(-65924311 * 1050507167 + -1649341815) * var8,
         Float.intBitsToFloat((235077632 | 6003) ^ 1327699827) * var8,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(
            lliII1_Ili_I1Il11l_I1ill.Ili__I1l1l_iIIil__l1i1I_l1l1I(
               II_iiliIiI1I_II_lliil1_,
               new Color(
                  -976780374 * 2129799927 + 1311904544,
                  (320995328 | 20641) ^ 321015943,
                  ~-1890603464 - -1595175442 ^ -809188365,
                  (-270467072 | 26174) ^ -270440782
               ),
               this.IlIlI__I_1I1_lIl_11ll1I[~4673941 - -1653818269 ^ 1649144326]
            ),
            nullxxxxxx
         )
      );
      var10002 = il1i1__I_ll_Il_i11i_I__i_1I_I(74204122 * 455375001 + 315966146);
      if (var10002 == null) {
         byte[] var27 = new byte[(-746258432 | 9633) ^ -746248785];
         var27[~1412127523 - -78968209 ^ -1333159315] = (byte)(-1012305487 * -494934453 + -932730096);
         var27[~1711727758 - 1166738362 ^ 1416501174] = (byte)(~-41843903 - 99204505 ^ -57360637);
         var27[~1536381678 - 1368338241 ^ 1390247378] = (byte)(~1173799400 - 882777743 ^ 2056577063);
         var27[(-1376714752 | 62422) ^ -1376652331] = (byte)(~-1257690136 - 1984373718 ^ -726683579);
         var27[-1696315630 * -1245491151 + 660784530] = (byte)((-393347072 | 26214) ^ 393320906);
         var27[(-384630784 | 18273) ^ -384612508] = (byte)((-1117257728 | 21792) ^ 1117235923);
         var27[~-1988014896 - -849706630 ^ -1457245773] = (byte)(~2106972813 - 1739661963 ^ 448332446);
         var27[(1938358272 | 22187) ^ 1938380460] = (byte)(~-1644603384 - 385585147 ^ -1259018137);
         var27[~1185985267 - -439198911 ^ -746786365] = (byte)((-226623488 | 42246) ^ 226581210);
         var27[-2057440803 * -733749361 + 1509909142] = (byte)(-1130913875 * -1656670483 + -939151549);
         var27[-1654370742 * -1365880083 + -38547064] = (byte)(~1096531448 - -1180127768 ^ -83596329);
         var27[~-1369934790 - -1675255137 ^ -1249777363] = (byte)((1777532928 | 29291) ^ 1777562200);
         var27[(709689344 | 29859) ^ 709719215] = (byte)(~1208000252 - 455142445 ^ -1663142744);
         var27[~1512030706 - 535637104 ^ -2047667824] = (byte)(~-284986689 - 168310505 ^ -116676143);
         var10002 = II11iiII_11iiiilIIl_IlIIl1_l_(var27, ~-376803202 - 1534422631 ^ -1157619434);
      }

      lliII1_Ili_I1Il11l_I1ill.iiII_1_Ii_1I___IiIl1ll(
         var1,
         var9,
         var10002,
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat((-250740736 | 40989) ^ -1303994339)),
         var14,
         var10,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(
            lliII1_Ili_I1Il11l_I1ill.Ili__I1l1l_iIIil__l1i1I_l1l1I(
               i1_lI1I1l___I1i1ii1i_1, Color.WHITE, this.IlIlI__I_1I1_lIl_11ll1I[495825805 * 1264716419 + 1283431642]
            ),
            nullxxxxxx
         )
      );
      IliiIii_1lll__iIiiIi1i1_.l_Ii_I_i11___i_il__I_l___.IIl_l1IlIIl__1Il__ii_l_1l1(
         var1,
         IliiIii_1lll__iIiiIi1i1_.l_Ii_I_i11___i_il__I_l___.i_I_l1ll1i11iI_IlliIi11iil1ii_l(),
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(
            Float.intBitsToFloat(~-996759968 - -794058321 ^ 696301552)
               + this.l11IIIl_1il_I_I_i1illI1lI1_I1
               - Float.intBitsToFloat((-1350172672 | 25776) ^ -291085136)
               - Float.intBitsToFloat(~1197597122 - 1057346848 ^ 962087197)
         ),
         var13,
         Float.intBitsToFloat(-1912986526 * -922373273 + -1841244526) * var8,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(
            lliII1_Ili_I1Il11l_I1ill.Ili__I1l1l_iIIil__l1i1I_l1l1I(
               i1_lI1I1l___I1i1ii1i_1,
               Ili_li1lli_Ii1111i1i_iI__ll1Ii.IiIlIl_I1liIi1_IIIIi1li1l(),
               this.IlIlI__I_1I1_lIl_11ll1I[1829993668 * -200661819 + -1563595475]
            ),
            nullxxxxxx
         )
      );
      lliII1_Ili_I1Il11l_I1ill.i1I1l_1_Ii__il_1_1iIllI1i1(
         var1,
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(this.I1iII_1_i1ilI__i11lIili1Ill1l1l),
         var12,
         this.I_Ii__li__Illlii1lIi1I1ll_Ii * var8,
         Float.intBitsToFloat((-1201405952 | 62042) ^ -107154854) * var8,
         Float.intBitsToFloat((1346437120 | 60699) ^ 291630363) * var8,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(
            lliII1_Ili_I1Il11l_I1ill.Ili__I1l1l_iIIil__l1i1I_l1l1I(
               II_iiliIiI1I_II_lliil1_,
               new Color(
                  -811977160 * -926361839 + -1753653628,
                  -1432781564 * 1118921105 + -1091719984,
                  (-1787035648 | 12254) ^ -1787023414,
                  ~1457048464 - 993903223 ^ 1844015476
               ),
               this.IlIlI__I_1I1_lIl_11ll1I[(-981139456 | 30979) ^ -981108479]
            ),
            nullxxxxxx
         )
      );
      Color var20 = lliII1_Ili_I1Il11l_I1ill.Ili__I1l1l_iIIil__l1i1I_l1l1I(
         new Color(
            ~611126111 - 1618376551 ^ 2065464788,
            985690882 * -2002948995 + -2025258892,
            ~-2009216492 - -842761577 ^ -1442989254,
            (553648128 | 56271) ^ 553704281
         ),
         iiilIlllIl1l_l11Iilllliil,
         this.IlIlI__I_1I1_lIl_11ll1I[-30618611 * -550061575 + 154804829]
      );
      var10002 = il1i1__I_ll_Il_i11i_I__i_1I_I(~1034149267 - -194958242 ^ -839191037);
      if (var10002 == null) {
         byte[] var29 = new byte[(-2084569088 | 3949) ^ -2084565147];
         var29[~-1109596275 - -1404170264 ^ -1781200758] = (byte)((-1593114624 | 36262) ^ 1593078346);
         var29[488143679 * -2070427561 + -834935400] = (byte)(~-1217736049 - 846554580 ^ -371181530);
         var29[329615450 * 213024995 + -914941900] = (byte)(~2112933775 - 640491387 ^ 1541542116);
         var29[(126812160 | 38486) ^ 126850645] = (byte)(-460924579 * 845441473 + 1423637422);
         var29[~1813897490 - 667046529 ^ 1814023272] = (byte)(~1191040313 - 17066741 ^ 1208107089);
         var29[(-604766208 | 33061) ^ -604733152] = (byte)((2043740160 | 47191) ^ 2043787318);
         var29[(1455489024 | 41002) ^ 1455530028] = (byte)((-1470627840 | 48492) ^ 1470579333);
         var29[~1843247891 - 1752740666 ^ 698978741] = (byte)(1473256078 * -500250321 + 1517134314);
         var10002 = II11iiII_11iiiilIIl_IlIIl1_l_(var29, -1423939570 * -539676373 + 1207818163);
      }

      lliII1_Ili_I1Il11l_I1ill.iiII_1_Ii_1I___IiIl1ll(
         var1,
         var9,
         var10002,
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(this.I1iII_1_i1ilI__i11lIili1Ill1l1l + Float.intBitsToFloat(1484502025 * 805947697 + 752253255)),
         var14,
         var10,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(var20, nullxxxxxx)
      );
      IliiIii_1lll__iIiiIi1i1_.l_Ii_I_i11___i_il__I_l___.IIl_l1IlIIl__1Il__ii_l_1l1(
         var1,
         IliiIii_1lll__iIiiIi1i1_.l_Ii_I_i11___i_il__I_l___.lii1_i_1__1l1III_Iil_ll_i1IIlII(),
         this.l_llIl_lI_IIiI11Ii1_1_1__ii1l(Float.intBitsToFloat(-817541643 * -1723513837 + 153387729)),
         var13,
         Float.intBitsToFloat((-917045248 | 53861) ^ -2012753307) * var8,
         lliII1_Ili_I1Il11l_I1ill.IiIi1ll1llIi_ll_i1IlIll1i11(var20, nullxxxxxx)
      );
   }

   private static float Il11____I111_l_liI1111(float param0, boolean nullx, float nullxx) {
      return var0 + ((nullx ? 1.0F : 0.0F) - var0) * Math.min(1.0F, nullxx / Float.intBitsToFloat(1663487950 * -112159899 + -1934575174));
   }

   public boolean method_25402(double param1, double nullx, int nullxx) {
      if (nullxx != 0) {
         return super.method_25402(var1, nullx, nullxx);
      } else {
         this.I1Ii1l_l1lil_11illlli1Il1_i = this.iiII_Ill1l_ll1I_i_1i11i(
            var1,
            nullx,
            Float.intBitsToFloat(~503413020 - 818177272 ^ -266722837),
            Float.intBitsToFloat(2099615294 * -580837267 + -721991782),
            Float.intBitsToFloat(~798679378 - -1341368709 ^ 1666500658),
            Float.intBitsToFloat(~-325697596 - 1936380975 ^ -569971700)
         );
         if (this.I1Ii1l_l1lil_11illlli1Il1_i) {
            return (boolean)(~1599794592 - -2093693954 ^ 493899360);
         } else if (this.iiII_Ill1l_ll1I_i_1i11i(
            var1,
            nullx,
            Float.intBitsToFloat(-1880843073 * 2067513309 + -1799148003),
            Float.intBitsToFloat(~-430384731 - 854635161 ^ -1568115775),
            Float.intBitsToFloat((-10682368 | 65437) ^ -1095368803),
            Float.intBitsToFloat((220987392 | 49495) ^ 1289011543)
         )) {
            this.l11_l_liIIIil1_l1l1l__111l1_();
            return (boolean)(~244436855 - -2135892712 ^ 1891455857);
         } else if (this.iiII_Ill1l_ll1I_i_1i11i(
            var1,
            nullx,
            Float.intBitsToFloat((-1393426432 | 874) ^ -271645846),
            Float.intBitsToFloat(936830778 * -1817345677 + 1409148658),
            this.l11IIIl_1il_I_I_i1illI1lI1_I1,
            Float.intBitsToFloat((-365887488 | 26783) ^ -1412863841)
         )) {
            this.IIl1__1_I_1l1II1_1I___1_l__();
            this.I1i__1Iil_li__Ilii_IiII_Ii = l_II_1Iliii_l11Ii_I1l1l();
            this.I1Ii1l_l1lil_11illlli1Il1_i = (boolean)(-1283543349 * 1300882729 + 1421306494);
            return (boolean)((100007936 | 48252) ^ 100056189);
         } else if (this.iiII_Ill1l_ll1I_i_1i11i(
            var1,
            nullx,
            this.I1iII_1_i1ilI__i11lIili1Ill1l1l,
            Float.intBitsToFloat(~70529375 - -32521980 ^ -1182659172),
            this.I_Ii__li__Illlii1lIi1I1ll_Ii,
            Float.intBitsToFloat((455016448 | 17271) ^ 1525105527)
         )) {
            this.IIl1__1_I_1l1II1_1I___1_l__();
            this.method_25419();
            return (boolean)((-1281097728 | 4076) ^ -1281093651);
         } else {
            if (this.iiII_Ill1l_ll1I_i_1i11i(
               var1,
               nullx,
               0.0F,
               Float.intBitsToFloat(~1517196701 - 1680987818 ^ 47420344),
               Float.intBitsToFloat(512386721 * -1221098931 + -1464197229),
               Float.intBitsToFloat((-1840709632 | 24318) ^ -777199874)
            )) {
               for (int var6 = -195370650 * 40650495 + -590375066; var6 < I11_1111_l_l_i_1_Iii1l_.size(); var6++) {
                  float var7 = Float.intBitsToFloat(~-662691238 - 1950931306 ^ -257686469)
                     + (float)var6 * Float.intBitsToFloat(1394470685 * 537747149 + -247210041)
                     - this.iii__1_1_ii_1i_l_liIl11l_;
                  if (this.iiII_Ill1l_ll1I_i_1i11i(
                     var1,
                     nullx,
                     Float.intBitsToFloat((17104896 | 45069) ^ 1158148109),
                     var7 + Float.intBitsToFloat(-105736348 * -1518131383 + -333014916),
                     Float.intBitsToFloat(~-363316195 - 124928992 ^ 1338343426),
                     Float.intBitsToFloat(2070272970 * -1986241361 + 1127885034)
                  )) {
                     this.IIl1__1_I_1l1II1_1I___1_l__();
                     I11_1111_l_l_i_1_Iii1l_.remove(var6);
                     I_1_lilIli_Ilil_iI1i_11i1il_II1();
                     return (boolean)(1992447102 * -1971328303 + -1818502877);
                  }

                  if (this.iiII_Ill1l_ll1I_i_1i11i(
                     var1,
                     nullx,
                     Float.intBitsToFloat(-676107252 * 1344705905 + -745385292),
                     var7,
                     Float.intBitsToFloat((2004549632 | 57332) ^ 863215604),
                     Float.intBitsToFloat((1222967296 | 13048) ^ 176501496)
                  )) {
                     this.IIl1__1_I_1l1II1_1I___1_l__();
                     IiiIl1__IlI_iIIl111lI1__1(I11_1111_l_l_i_1_Iii1l_.get(var6).name());
                     return (boolean)(~1503561663 - -485685500 ^ -1017876163);
                  }
               }
            }

            return super.method_25402(var1, nullx, nullxx);
         }
      }
   }

   public boolean method_25401(double param1, double nullx, double nullxx, double nullxxx) {
      this.I__l1__lI1_1lllliill___i_lIi = this.I__l1__lI1_1lllliill___i_lIi - (float)nullxxx * Float.intBitsToFloat((-344129536 | 19869) ^ -1453503075);
      return (boolean)(~-1246068770 - -1235078135 ^ -1813820391);
   }

   public boolean method_25400(char param1, int nullx) {
      if (!this.I1Ii1l_l1lil_11illlli1Il1_i
         || this.I1i__1Iil_li__Ilii_IiII_Ii.length() >= -1727844969 * 1005988927 + 810013671
         || (!Character.isLetterOrDigit(var1) || var1 >= ((817102848 | 26153) ^ 817129129)) && var1 != 1243447009 * 1469544259 + -1768541060) {
         return super.method_25400(var1, nullx);
      } else {
         this.I1i__1Iil_li__Ilii_IiII_Ii = this.I1i__1Iil_li__Ilii_IiII_Ii + var1;
         return (boolean)(~1589533187 - 1666868089 ^ 1038566018);
      }
   }

   public boolean method_25404(int param1, int nullx, int nullxx) {
      if (this.I1Ii1l_l1lil_11illlli1Il1_i) {
         if (var1 == (~726493942 - 1723547187 ^ 1844926421) && !this.I1i__1Iil_li__Ilii_IiII_Ii.isEmpty()) {
            String var10001;
            if (class_437.method_25441()) {
               var10001 = il1i1__I_ll_Il_i11i_I__i_1I_I(-1279973625 * 425281077 + 40108443);
               if (var10001 == null) {
                  byte[] var5 = new byte[-1350949454 * 1456964347 + 2006623870];
                  var5[~-313610343 - -532803222 ^ 846413564] = (byte)(894968826 * 916338495 + -12030142);
                  var5[(1882521600 | 26115) ^ 1882547714] = (byte)(-1670223255 * -1663605247 + 1928904522);
                  var5[2111791613 * -91064177 + 100641711] = (byte)((1799225344 | 28240) ^ 1799253606);
                  var5[~1628094672 - -506658902 ^ -1121435770] = (byte)(-830180084 * -215654091 + -1082247116);
                  var10001 = II11iiII_11iiiilIIl_IlIIl1_l_(var5, (-1897005056 | 58210) ^ -1896946836);
               }
            } else {
               var10001 = this.I1i__1Iil_li__Ilii_IiII_Ii
                  .substring((543817728 | 19968) ^ 543837696, this.I1i__1Iil_li__Ilii_IiII_Ii.length() - ((-443285504 | 31745) ^ -443253760));
            }

            this.I1i__1Iil_li__Ilii_IiII_Ii = var10001;
            return (boolean)(~-1351131302 - 426731044 ^ 924400256);
         }

         if (var1 == ((1354891264 | 20881) ^ 1354911888) || var1 == -381436059 * -1407489029 + -303226296) {
            this.l11_l_liIIIil1_l1l1l__111l1_();
            return (boolean)(-1278618422 * 342041781 + 1849828655);
         }

         if (class_437.method_25437(var1)) {
            String var10000 = this.field_22787.field_1774.method_1460();
            String var10002 = il1i1__I_ll_Il_i11i_I__i_1I_I(638167592 * 1637978255 + 633041847);
            if (var10002 == null) {
               byte[] var6 = new byte[294171720 * 1676021625 + -484273668];
               var6[(-736690176 | 11131) ^ -736679045] = (byte)(-2053519021 * 969552685 + -1973546085);
               var6[~-1316732742 - -1116556232 ^ -1861678324] = (byte)((1707606016 | 15175) ^ 1707621180);
               var6[(407175168 | 51798) ^ 407226964] = (byte)(~608470380 - -1006846687 ^ 398376206);
               var6[(-1495007232 | 28771) ^ -1494978464] = (byte)((-1880096768 | 29598) ^ -1880067089);
               var10002 = II11iiII_11iiiilIIl_IlIIl1_l_(var6, (-1742733312 | 6973) ^ -1742726350);
            }

            String var4 = var10000.replaceAll("[^A-Za-z0-9_]", var10002);
            this.I1i__1Iil_li__Ilii_IiII_Ii = (this.I1i__1Iil_li__Ilii_IiII_Ii + var4)
               .substring(
                  ~273074088 - -428850657 ^ 155776568, Math.min((-658046976 | 24942) ^ -658022018, this.I1i__1Iil_li__Ilii_IiII_Ii.length() + var4.length())
               );
            return (boolean)((73400320 | 53552) ^ 73453873);
         }
      }

      return super.method_25404(var1, nullx, nullxx);
   }

   private void l11_l_liIIIil1_l1l1l__111l1_() {
      if (iII1Ii_iI__1li1I_l1Ilil__I(this.I1i__1Iil_li__Ilii_IiII_Ii)) {
         this.IIl1__1_I_1l1II1_1I___1_l__();
         String var1 = this.I1i__1Iil_li__Ilii_IiII_Ii;
         if (I11_1111_l_l_i_1_Iii1l_.stream().noneMatch(nullx -> nullx.name().equalsIgnoreCase(var1))) {
            I11_1111_l_l_i_1_Iii1l_.add(new IliiIii_1lll__iIiiIi1i1_.li_I1Ii_iii_IlIIIl1l1i1_l1_1_iI(var1, LocalDate.now()));
            I_1_lilIli_Ilil_iI1i_11i1il_II1();
         }

         IiiIl1__IlI_iIIl111lI1__1(var1);
         String var10001 = il1i1__I_ll_Il_i11i_I__i_1I_I((2095644672 | 32668) ^ 2095677324);
         if (var10001 == null) {
            byte[] var2 = new byte[(-1893859328 | 52466) ^ -1893806858];
            var2[(-1981218816 | 64323) ^ -1981154493] = (byte)((-2013003776 | 26665) ^ -2012977127);
            var2[~2103802279 - -970831449 ^ -1132970832] = (byte)((527106048 | 20881) ^ 527126931);
            var2[~-1735788476 - -1210661169 ^ -1348517650] = (byte)(-1048744333 * 358726651 + 1640215637);
            var2[(-398327808 | 36826) ^ -398290983] = (byte)(~-570923213 - 1064624752 ^ -493701540);
            var10001 = II11iiII_11iiiilIIl_IlIIl1_l_(var2, (-385024000 | 21359) ^ -385002625);
         }

         this.I1i__1Iil_li__Ilii_IiII_Ii = var10001;
         this.I1Ii1l_l1lil_11illlli1Il1_i = (boolean)(~-1066401432 - 1125968305 ^ -59566874);
      }
   }

   private void IIl1__1_I_1l1II1_1I___1_l__() {
      this.field_22787.method_1483().method_4873(class_1109.method_47978(class_3417.field_15015, 1.0F));
   }

   private static String l_II_1Iliii_l11Ii_I1l1l() {
      ThreadLocalRandom var0 = ThreadLocalRandom.current();
      String var1 = I_l1_i1I111lll_IIlIlli1_lI1__li[var0.nextInt(I_l1_i1I111lll_IIlIlli1_lI1__li.length)]
         + lI1l_lI_l_1i_I1i1l11Il[var0.nextInt(lI1l_lI_l_1i_I1i1l11Il.length)];
      if (var0.nextBoolean()) {
         var1 = var1 + var0.nextInt((1118044160 | 24364) ^ 1118068518, ~1564607021 - -1948331331 ^ 383723773);
      }

      return var1.length() > ((1663893504 | 45037) ^ 1663938557)
         ? var1.substring(1506127786 * -1713375109 + -1128142510, -191256762 * -2130717223 + 853145530)
         : var1;
   }

   private static Path ll_ill_l_liiii1__liiIi_l1_ii_il() {
      return FabricLoader.getInstance().getConfigDir().resolve(iiIIi_1l1_IllIi11iiil1l_1iIli.Iiiiil_l___li_l_1111I_lI__li_1I());
   }

   private static boolean iII1Ii_iI__1li1I_l1Ilil__I(String param0) {
      return (boolean)(var0 != null && var0.matches("[A-Za-z0-9_]{3,16}") ? ~-1956992887 - 878032139 ^ 1078960746 : -596415072 * -89486041 + -892785504);
   }

   private static UUID Ili___l_iIi_i_1_lli1_iIi_lIii(String param0) {
      return class_4844.method_43344(var0);
   }

   private static void I_ii1I1l_l_1i_iIlIIIlli1(String param0) {
      MinecraftAccessor var10000 = (MinecraftAccessor)class_310.method_1551();
      class_320 var10001 = new class_320;
      UUID var10004 = Ili___l_iIi_i_1_lli1_iIi_lIii(var0);
      String var10005 = il1i1__I_ll_Il_i11i_I__i_1I_I(-1737356457 * -633528999 + 1263940562);
      if (var10005 == null) {
         byte[] var1 = new byte[(1360461824 | 7389) ^ 1360469208];
         var1[~1062677967 - -59067753 ^ -1003610215] = (byte)(942894577 * -884404695 + -1157155185);
         var1[~-623450811 - 972225739 ^ -348774930] = (byte)(~-676620100 - 1786912235 ^ 1110292210);
         var1[(-2085617664 | 30880) ^ -2085586782] = (byte)((360185856 | 46135) ^ -360232022);
         var1[(-1559232512 | 30666) ^ -1559201847] = (byte)(-1225118121 * -1219948911 + 1173618301);
         var1[-1864710428 * -221096439 + -1166644736] = (byte)((1446838272 | 30393) ^ -1446868630);
         var10005 = II11iiII_11iiiilIIl_IlIIl1_l_(var1, 1062226368 * 1041530395 + -1959020335);
      }

      var10001./* $VF: Unable to resugar constructor */<init>(var0, var10004, var10005, Optional.empty(), Optional.empty(), class_321.field_1990);
      var10000.mytheria$setUser(var10001);
   }

   private static void IiiIl1__IlI_iIIl111lI1__1(String param0) {
      I_ii1I1l_l_1i_iIlIIIlli1(var0);

      try {
         Files.createDirectories(ll_ill_l_liiii1__liiIi_l1_ii_il());
         Path var10000 = ll_ill_l_liiii1__liiIi_l1_ii_il();
         String var10001 = il1i1__I_ll_Il_i11i_I__i_1I_I(-1558651500 * 246135435 + 1185294518);
         if (var10001 == null) {
            byte[] var3 = new byte[-800293600 * -1821821049 + 111682603];
            var3[(-2129592320 | 53686) ^ -2129538634] = (byte)(1552092836 * -585951573 + 1191649385);
            var3[958598619 * 914160331 + -1919408808] = (byte)((938934272 | 56949) ^ -938991152);
            var3[-601728319 * -1454008453 + 1826721351] = (byte)((1178730496 | 53148) ^ -1178783720);
            var3[-580296308 * -1019960759 + -1194813673] = (byte)(1498855248 * 1205881329 + -1793614498);
            var3[~-1569886342 - 1120283913 ^ 449602424] = (byte)(440984280 * -1367264797 + -1625587140);
            var3[(-650313728 | 37123) ^ -650276602] = (byte)((-165871616 | 16365) ^ -165855352);
            var3[(-598409216 | 16708) ^ -598392510] = (byte)(~739069872 - 972990653 ^ -1712060514);
            var3[~1929135105 - -1966981109 ^ 37846004] = (byte)(~-1827917598 - 1510944430 ^ 316973085);
            var3[~-1056238859 - 473571563 ^ 582667287] = (byte)((-1410072576 | 22843) ^ 1410049762);
            var3[-181952846 * -983756761 + -1939754261] = (byte)(1179802788 * 595126871 + -126575441);
            var3[(1752039424 | 24954) ^ 1752064368] = (byte)(-1529888680 * 183072295 + -1583799760);
            var10001 = II11iiII_11iiiilIIl_IlIIl1_l_(var3, (2076311552 | 49447) ^ 2076361013);
         }

         Files.writeString(var10000.resolve(var10001), var0, StandardCharsets.UTF_8);
      } catch (IOException var2) {
      }
   }

   private static void l11I__l11_i11i1lliI1il1I1() {
      if (!li1i1I_Ii_liiI1_lii__1I1___1i) {
         li1i1I_Ii_liiI1_lii__1I1___1i = (boolean)(~267592080 - -2037745288 ^ 1770153206);

         try {
            Path var10000 = ll_ill_l_liiii1__liiIi_l1_ii_il();
            String var10001 = il1i1__I_ll_Il_i11i_I__i_1I_I(~-2002978090 - 1274979605 ^ 727998471);
            if (var10001 == null) {
               byte[] var9 = new byte[-1999023012 * -1678742651 + 1184151620];
               var9[(1875705856 | 36733) ^ 1875742589] = (byte)(-441164664 * 690709735 + -213687876);
               var9[1183460046 * -620127333 + -416326841] = (byte)(~-662937375 - 2124031463 ^ 1461094114);
               var9[~656677382 - -662414038 ^ 5736653] = (byte)(-1463685403 * -1402418553 + 305288026);
               var9[~873152488 - 733071558 ^ -1606224046] = (byte)(-1011828469 * 1604003403 + 1360603042);
               var9[-1458645473 * -1053561397 + 768901743] = (byte)(~-1848403139 - 496921560 ^ -1351481584);
               var9[~-50965120 - -781142244 ^ 832107366] = (byte)(-211883004 * -1965398609 + 194450873);
               var9[1016310978 * -192036995 + 791013196] = (byte)(1891915481 * 1940848497 + 609583952);
               var9[-70374710 * 901746567 + 1303026049] = (byte)((1151074304 | 9353) ^ 1151083678);
               var9[(1108082688 | 57749) ^ 1108140445] = (byte)(1172937824 * -2041502301 + -28864783);
               var9[1752793301 * -1029956509 + 1663033770] = (byte)(-1438276328 * 1994148185 + 18203362);
               var9[112687412 * -2030746313 + -467275298] = (byte)(~-1778744943 - -527973847 ^ -1988248464);
               var9[~1195386475 - 1308810876 ^ 1790769939] = (byte)((955645952 | 57585) ^ -955703532);
               var9[(-2038890496 | 2642) ^ -2038887842] = (byte)((571801600 | 62618) ^ -571864283);
               var9[994659034 * -894220231 + -718076541] = (byte)(~685851699 - 1467937575 ^ 2141177984);
               var9[~-1224632762 - -918263465 ^ 2142896236] = (byte)((-1683750912 | 26365) ^ -1683724629);
               var9[~756760778 - 1467687570 ^ 2070518956] = (byte)((984350720 | 48753) ^ 984399449);
               var10001 = II11iiII_11iiiilIIl_IlIIl1_l_(var9, (-1101791232 | 65484) ^ -1101725729);
            }

            Path var0 = var10000.resolve(var10001);
            if (!Files.exists(var0)) {
               return;
            }

            for (String var2 : Files.readAllLines(var0, StandardCharsets.UTF_8)) {
               String var8 = var2.trim();
               var10001 = il1i1__I_ll_Il_i11i_I__i_1I_I(1121324145 * 1004500955 + 1907086441);
               if (var10001 == null) {
                  byte[] var11 = new byte[~-109844708 - 499532575 ^ -389687871];
                  var11[~1978728239 - 1826237835 ^ 490001221] = (byte)(~-2063610837 - 181885558 ^ 1881725233);
                  var11[-1405342475 * -429903465 + -368667010] = (byte)((-966852608 | 33063) ^ 966819551);
                  var11[(1507393536 | 57631) ^ 1507451165] = (byte)(~-724939161 - 1568808078 ^ 843868868);
                  var11[1527905311 * -391914555 + -390236376] = (byte)(-1214357805 * 797299653 + 710549083);
                  var11[(1282146304 | 49316) ^ 1282195616] = (byte)(~-318659361 - -2138192007 ^ 1838115931);
                  var10001 = II11iiII_11iiiilIIl_IlIIl1_l_(var11, -1431419926 * 1223622451 + 1981178486);
               }

               String[] var3 = var8.split(var10001);
               if (iII1Ii_iI__1li1I_l1Ilil__I(var3[~531273111 - 1963296624 ^ 1800397560])) {
                  LocalDate var4;
                  try {
                     var4 = var3.length > (~-159781443 - 893507205 ^ -733725764)
                        ? LocalDate.parse(var3[~535096993 - 488541473 ^ -1023638468])
                        : LocalDate.now();
                  } catch (RuntimeException var6) {
                     var4 = LocalDate.now();
                  }

                  I11_1111_l_l_i_1_Iii1l_.add(new IliiIii_1lll__iIiiIi1i1_.li_I1Ii_iii_IlIIIl1l1i1_l1_1_iI(var3[(-1057357824 | 23298) ^ -1057334526], var4));
               }
            }
         } catch (IOException var7) {
         }
      }
   }

   private static void I_1_lilIli_Ilil_iI1i_11i1il_II1() {
      ArrayList var0 = new ArrayList();

      for (IliiIii_1lll__iIiiIi1i1_.li_I1Ii_iii_IlIIIl1l1i1_l1_1_iI var2 : I11_1111_l_l_i_1_Iii1l_) {
         var0.add(var2.name() + ";" + var2.added());
      }

      try {
         Files.createDirectories(ll_ill_l_liiii1__liiIi_l1_ii_il());
         Path var10000 = ll_ill_l_liiii1__liiIi_l1_ii_il();
         String var10001 = il1i1__I_ll_Il_i11i_I__i_1I_I(~-1866359892 - -1347574051 ^ -1081033373);
         if (var10001 == null) {
            byte[] var4 = new byte[1027113202 * 1745429255 + -1051630734];
            var4[(207224832 | 18371) ^ 207243203] = (byte)((1158545408 | 12139) ^ 1158557470);
            var4[~-1221975318 - 287426674 ^ 934548642] = (byte)(-870458624 * 1465385927 + -1288060233);
            var4[~764518863 - 2018776093 ^ 1511672337] = (byte)(~630756452 - -225687394 ^ -405069158);
            var4[(1533149184 | 31985) ^ 1533181170] = (byte)(1371633812 * 620401889 + -1162381934);
            var4[-2109281973 * 730450523 + 1251140699] = (byte)(-1639577390 * -364657031 + -1021482754);
            var4[~763051008 - 175758348 ^ -938809354] = (byte)(-1824864904 * -1602956089 + 1734942609);
            var4[~-699756898 - -2074496514 ^ -1520713883] = (byte)((-1990918144 | 30806) ^ -1990887318);
            var4[-1968926310 * -526810351 + -813267251] = (byte)(~-1630653661 - -1727019093 ^ 937294477);
            var4[~-1454580140 - -462755016 ^ 1917335163] = (byte)(~936558018 - -1369882853 ^ -433324892);
            var4[~1356752916 - -310577944 ^ -1046174966] = (byte)((1098252288 | 36229) ^ 1098288565);
            var4[(2003566592 | 43630) ^ 2003610212] = (byte)((768606208 | 40353) ^ -768646530);
            var4[~-985522957 - 780181430 ^ 205341533] = (byte)(-2001315400 * -1428815751 + 838834068);
            var4[(1360658432 | 22154) ^ 1360680582] = (byte)(~443987151 - 305835061 ^ -749822241);
            var4[1913180980 * -948567969 + -389963839] = (byte)(-176428106 * 683119107 + -2080083848);
            var4[~1586693886 - -1452368267 ^ -134325630] = (byte)(325961855 * 1749680909 + 761091096);
            var4[~623306496 - 333959288 ^ -957265784] = (byte)(~-1823899405 - -2036033677 ^ 435034210);
            var10001 = II11iiII_11iiiilIIl_IlIIl1_l_(var4, ~-904924627 - 1792675074 ^ -887750459);
         }

         Files.write(var10000.resolve(var10001), var0, StandardCharsets.UTF_8);
      } catch (IOException var3) {
      }
   }

   public static void i1_i1iI_ill1lil_1lI1lIIi11liiI1() {
      if (!i1ii1l1iIll1II111iilill_lI1I11) {
         i1ii1l1iIll1II111iilill_lI1I11 = (boolean)(595463058 * 2061142083 + 1367959755);

         try {
            Path var10000 = ll_ill_l_liiii1__liiIi_l1_ii_il();
            String var10001 = il1i1__I_ll_Il_i11i_I__i_1I_I((2065235968 | 26384) ^ 2065262342);
            if (var10001 == null) {
               byte[] var3 = new byte[(-990380032 | 20613) ^ -990359410];
               var3[(-1429864448 | 2714) ^ -1429861734] = (byte)(~-432592211 - 1397717282 ^ 965125016);
               var3[149374234 * -157704117 + -1870364317] = (byte)(~1671368257 - -1058848506 ^ 612519792);
               var3[(1857224704 | 7713) ^ 1857232419] = (byte)(~2036874530 - 319496575 ^ 1938596173);
               var3[(219938816 | 59495) ^ 219998308] = (byte)(-74416739 * -493002439 + -1712158011);
               var3[~462034861 - -2077415002 ^ 1615380136] = (byte)(~-1797644303 - 1476118336 ^ -321525921);
               var3[284391097 * 2126965667 + -706112198] = (byte)(715120522 * 1199788355 + -1731209898);
               var3[(1618542592 | 33868) ^ 1618576458] = (byte)(244033226 * -1748488253 + -734995013);
               var3[~-1775583318 - 1378455199 ^ 397128113] = (byte)(-1707311679 * 1885941577 + -444550008);
               var3[1447272962 * 227298245 + 442875518] = (byte)((-361955328 | 37330) ^ 361918048);
               var3[(-828964864 | 63767) ^ -828901090] = (byte)(-1723938324 * -2029260215 + -787262519);
               var3[-1656299466 * 1746856565 + 525740892] = (byte)(825693824 * -1259383775 + -1828447819);
               var10001 = II11iiII_11iiiilIIl_IlIIl1_l_(var3, -1821476171 * 1523166429 + -2062453291);
            }

            Path var0 = var10000.resolve(var10001);
            if (Files.exists(var0)) {
               String var1 = Files.readString(var0, StandardCharsets.UTF_8).trim();
               if (iII1Ii_iI__1li1I_l1Ilil__I(var1)) {
                  I_ii1I1l_l_1i_iIlIIIlli1(var1);
               }
            }
         } catch (IOException var2) {
         }
      }
   }

   public void method_25420(class_332 param1, int nullx, int nullxx, float nullxxx) {
   }

   public void method_25419() {
      this.field_22787.method_1507(this.ilI_Ii_I_l1i1i11_iI_1__I1i__);
   }

   static {
      String var10000 = il1i1__I_ll_Il_i11i_I__i_1I_I(~1577980683 - -1022662535 ^ -555318164);
      if (var10000 == null) {
         byte[] var0 = new byte[(879296512 | 1645) ^ 879298145];
         var0[1302521880 * 1008377399 + -1806609704] = (byte)((956694528 | 17713) ^ 956712287);
         var0[1415514086 * 971654505 + 1504232619] = (byte)(1852295231 * 489160379 + -1125566590);
         var0[(-1633484800 | 36295) ^ -1633448507] = (byte)((851705856 | 25396) ^ -851731260);
         var0[~-993963743 - -1444991042 ^ -1856012509] = (byte)(~-646178349 - 55555589 ^ 590622780);
         var0[~1085632704 - 2057636000 ^ 1151698587] = (byte)(~1645713939 - 257794999 ^ -1903508943);
         var0[~1617508119 - 972743683 ^ 1704715488] = (byte)(~1908544726 - 130686367 ^ -2039231073);
         var0[1583539724 * 1232836383 + 1217466514] = (byte)(~466945295 - 34128419 ^ -501073697);
         var0[949874278 * 1066894547 + 784198133] = (byte)(~-1633002929 - 2076738246 ^ -443735314);
         var0[(-1549729792 | 24261) ^ -1549705523] = (byte)((88735744 | 56375) ^ 88792139);
         var0[1640221696 * -1209949995 + -57195511] = (byte)(-1715842635 * -2124388693 + 991776337);
         var0[~1577250232 - -363512487 ^ -1213737756] = (byte)(1293860116 * -1586908403 + 1980197256);
         var0[(-1901199360 | 53062) ^ -1901146291] = (byte)((-707985408 | 22106) ^ -707963381);
         var10000 = II11iiII_11iiiilIIl_IlIIl1_l_(var0, ~2011244264 - 2139537209 ^ 144185801);
      }

      iiIIII1_iIii_I1_i1I11i_i_ii_ii = DateTimeFormatter.ofPattern(var10000);
      String[] var1 = new String[~1037221944 - 797292912 ^ -1834514873];
      int var10002 = ~-319156810 - 934036914 ^ -614880105;
      String var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((-2102263808 | 34674) ^ -2102229142);
      if (var10003 == null) {
         byte[] var34 = new byte[~-1346391134 - 1525833055 ^ -179441930];
         var34[~1174103946 - 21418680 ^ -1195522627] = (byte)(757360868 * 839673393 + 1737298933);
         var34[-1416534540 * -158197183 + 244471053] = (byte)(-18628522 * 2072197833 + -2020048860);
         var34[~1070769172 - 627731811 ^ -1698500982] = (byte)(~251441295 - -1174655878 ^ 923214480);
         var34[1388361453 * -1099742865 + 495419968] = (byte)(~-96090894 - -2067238353 ^ 2131638075);
         var34[-976663154 * -1279358281 + 1072104322] = (byte)(~-1966408064 - 856455174 ^ 1109952838);
         var34[~-1043824519 - 719327193 ^ 324497320] = (byte)(-1219510271 * 179629831 + 2111623437);
         var34[(-903675904 | 52210) ^ -903623692] = (byte)(~-1903259124 - -1177711587 ^ 1213996660);
         var34[~1012333461 - -625405925 ^ -386927544] = (byte)(-1978825316 * 1913285971 + -878558493);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var34, (941228032 | 3860) ^ 941231884);
      }

      var1[var10002] = var10003;
      var10002 = 1452801435 * 432397067 + -163741352;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(858390679 * -514294031 + 1044586482);
      if (var10003 == null) {
         byte[] var36 = new byte[662139618 * 1070192405 + -1606040192];
         var36[487269252 * -1947950057 + -206618844] = (byte)((860028928 | 34983) ^ -860063923);
         var36[514206539 * -1731836389 + 1352723736] = (byte)((-137035776 | 29820) ^ -137005969);
         var36[~1403828628 - 1596412959 ^ 1294725710] = (byte)(~2078818281 - -1496077341 ^ -582740889);
         var36[(-2090074112 | 13201) ^ -2090060910] = (byte)(836893320 * 1014184767 + 965607476);
         var36[(-1108934656 | 25104) ^ -1108909548] = (byte)((-484048896 | 58148) ^ 483990696);
         var36[(136577024 | 32513) ^ 136609540] = (byte)(1199462952 * 1906990125 + 2144585338);
         var36[-161465784 * 531880485 + -98679906] = (byte)(-335237691 * 1666714397 + 625531392);
         var36[949316235 * -2018306347 + 1213556832] = (byte)(-1220552192 * -999569179 + 328334750);
         var36[~-1840608544 - 1195085933 ^ 645522618] = (byte)((1405878272 | 39790) ^ 1405917964);
         var36[(1998716928 | 26835) ^ 1998743770] = (byte)(~-571863410 - 1031033329 ^ 459169913);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var36, ~1385832010 - -1128046674 ^ -257785314);
      }

      var1[var10002] = var10003;
      var10002 = -341992707 * -924621751 + 690813405;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((1632567296 | 10870) ^ 1632578156);
      if (var10003 == null) {
         byte[] var38 = new byte[(2017132544 | 15776) ^ 2017148329];
         var38[~499964454 - 262611623 ^ -762576078] = (byte)(~-2075081239 - 2129152229 ^ -54070987);
         var38[-75553895 * -1319200857 + 383944754] = (byte)((-1455751168 | 16159) ^ -1455734976);
         var38[~-305754052 - 369249692 ^ -63495643] = (byte)(~-895963084 - -1143406272 ^ -2039369362);
         var38[(727384064 | 14604) ^ 727398671] = (byte)((-1634140160 | 47194) ^ 1634092951);
         var38[-1137377283 * -893468137 + 1299793481] = (byte)(~-352881668 - 772786181 ^ -419904537);
         var38[(-897843200 | 44716) ^ -897798487] = (byte)(-1920797228 * 1937919167 + 2024253236);
         var38[-1421529748 * 804071163 + -311267550] = (byte)(780458986 * -2112963999 + -48977728);
         var38[-82893685 * -1427140183 + 1133061444] = (byte)(~-2108270679 - 928531118 ^ -1179739624);
         var38[~-408772284 - -377506722 ^ 786278997] = (byte)(-1837748182 * -1822023157 + -1278584168);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var38, ~-385828881 - 1143056475 ^ -757227601);
      }

      var1[var10002] = var10003;
      var10002 = ~875714704 - -405754296 ^ -469960412;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(-95407510 * 228671881 + -1751245983);
      if (var10003 == null) {
         byte[] var40 = new byte[~1352646936 - 1404559687 ^ 1537760681];
         var40[~-9675898 - -2072454161 ^ 2082130058] = (byte)((-316276736 | 38606) ^ 316238084);
         var40[(-1694564352 | 23429) ^ -1694540924] = (byte)((-334102528 | 31000) ^ 334071464);
         var40[-622144820 * -661757057 + -1999337266] = (byte)(~1607477477 - 266250976 ^ -1873728504);
         var40[(1508114432 | 53079) ^ 1508167508] = (byte)((-1798176768 | 51517) ^ -1798125275);
         var40[~346397410 - -1340065059 ^ 993667652] = (byte)(816010126 * -1873802921 + -1104241494);
         var40[(-992215040 | 13336) ^ -992201699] = (byte)((1395589120 | 38076) ^ 1395627185);
         var40[(1277558784 | 22133) ^ 1277580915] = (byte)(~-1494237311 - 52763840 ^ -1441473526);
         var40[~-1419192997 - -1585906274 ^ -1289868031] = (byte)(~-502195201 - -1688783839 ^ -2103988303);
         var40[847202171 * 807506639 + 1299582355] = (byte)(-624639400 * -510247123 + -402248011);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var40, (1379139584 | 25944) ^ 1379165507);
      }

      var1[var10002] = var10003;
      var10002 = ~-190668063 - -429526877 ^ 620194943;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(-2108185469 * -459685177 + 1156110407);
      if (var10003 == null) {
         byte[] var42 = new byte[(-2006253568 | 38551) ^ -2006215011];
         var42[(-228130816 | 38631) ^ -228092185] = (byte)((558039040 | 20044) ^ -558059025);
         var42[~1378422705 - -110199631 ^ -1268223076] = (byte)(~460950692 - 504873578 ^ 965824275);
         var42[1215980882 * 1882994015 + 610430100] = (byte)(~1743158055 - 532131986 ^ -2019677273);
         var42[-1858928564 * -281316401 + -1457742193] = (byte)(-501718180 * 1471925301 + -376299957);
         var42[(278396928 | 64295) ^ 278461219] = (byte)(132544904 * 9783453 + -1722730594);
         var42[-1689444479 * 1199691663 + -747302922] = (byte)(-1248531647 * 2047829925 + 1234057209);
         var42[-1376576880 * 1085854731 + 487496662] = (byte)((283246592 | 33936) ^ -283280541);
         var42[~187376224 - -430592725 ^ 243216499] = (byte)(1643877941 * -445400465 + -705143471);
         var42[~-1132104057 - 1529185065 ^ -397081017] = (byte)(~-1606726732 - -1451414842 ^ -1236825666);
         var42[~-1890094599 - 614757170 ^ 1275337437] = (byte)(~1977767250 - -1005944405 ^ -971822761);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var42, (1172504576 | 22878) ^ 1172527426);
      }

      var1[var10002] = var10003;
      var10002 = (1891434496 | 51835) ^ 1891486334;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((236453888 | 38275) ^ 236492190);
      if (var10003 == null) {
         byte[] var44 = new byte[(1233125376 | 1206) ^ 1233126591];
         var44[-1253576918 * -199693783 + -1024569786] = (byte)((1426391040 | 54576) ^ -1426445639);
         var44[1596854913 * 1114701895 + 759684666] = (byte)(~-1975725155 - -323349876 ^ 1995892246);
         var44[1599801561 * -2050833635 + 1770042477] = (byte)((458620928 | 60021) ^ 458680919);
         var44[-1506441064 * -1777277353 + -778697637] = (byte)(48608286 * -1548334837 + 946910305);
         var44[-1524873376 * -1021968761 + -463135644] = (byte)((-518193152 | 3962) ^ 518189286);
         var44[-719325435 * 908251037 + -1778485516] = (byte)((-1898315776 | 35841) ^ 1898279911);
         var44[(-1565655040 | 24844) ^ -1565630198] = (byte)(~-787762949 - -1739291238 ^ -1767913211);
         var44[~-1012963797 - -1592979065 ^ -1689024438] = (byte)(~-2120065249 - 937331110 ^ 1182734123);
         var44[~-97224628 - -1527160563 ^ 1624385198] = (byte)(1488638836 * 1256719377 + 120202660);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var44, (-594739200 | 9761) ^ -594729412);
      }

      var1[var10002] = var10003;
      var10002 = -1369653772 * 233134311 + 2042673370;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~-1898351944 - -846599462 ^ -1550015885);
      if (var10003 == null) {
         byte[] var46 = new byte[~370893733 - -610376353 ^ 239482611];
         var46[(307298304 | 46049) ^ 307344353] = (byte)(~-1008151987 - 363658992 ^ -644493016);
         var46[-322083962 * -211597707 + -300359741] = (byte)((136904704 | 60754) ^ -136965414);
         var46[-2141463645 * -1481741353 + 809724189] = (byte)(250183166 * 344783347 + -35038870);
         var46[~-1432206289 - 135513874 ^ 1296692413] = (byte)(~1088476857 - -200640914 ^ 887835915);
         var46[~-1280376414 - 1842343423 ^ -561967014] = (byte)(2067342637 * -1168644887 + -1617553908);
         var46[(-1490092032 | 38710) ^ -1490053325] = (byte)(1091629903 * -1567739747 + -148244301);
         var46[(-1638662144 | 33688) ^ -1638628450] = (byte)(~-457790188 - 1483809066 ^ 1026018840);
         var46[-1470929195 * 650660991 + -944717732] = (byte)(-419578173 * -1770372939 + 335110082);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var46, ~-1577885148 - 1620404327 ^ -42519190);
      }

      var1[var10002] = var10003;
      var10002 = ~-2107937316 - -1154822495 ^ -1032207483;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~-1048304577 - 436250058 ^ 612054505);
      if (var10003 == null) {
         byte[] var48 = new byte[~-1774664085 - -152985948 ^ 1927650041];
         var48[(-1606352896 | 37900) ^ -1606314996] = (byte)((-773062656 | 34238) ^ 773028455);
         var48[(-1393950720 | 52385) ^ -1393898336] = (byte)(~-809184101 - 119237747 ^ -689946252);
         var48[(97583104 | 32707) ^ 97615809] = (byte)(190743166 * -857843533 + -20221546);
         var48[(-1121583104 | 20320) ^ -1121562781] = (byte)((-1657733120 | 968) ^ -1657732194);
         var48[1803035492 * 2064825531 + -1137134088] = (byte)((345636864 | 26354) ^ 345663227);
         var48[~-221204927 - -2013354645 ^ -2060407722] = (byte)(-1384116968 * 7841021 + 1776791465);
         var48[(1596194816 | 28217) ^ 1596223039] = (byte)(~1737288034 - 520417953 ^ -2037261303);
         var48[-2043448469 * -707330821 + 1132364318] = (byte)(2108564124 * 107251895 + 2033345263);
         var48[-1626061823 * 1409634883 + 937746885] = (byte)(-1295932312 * 1284111985 + 465518003);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var48, ~1600045545 - 2032480779 ^ 662440980);
      }

      var1[var10002] = var10003;
      var10002 = (346095616 | 62441) ^ 346158049;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~-1514591590 - -1213494918 ^ -1566880821);
      if (var10003 == null) {
         byte[] var50 = new byte[(1590624256 | 15255) ^ 1590639519];
         var50[~948408847 - 1269747535 ^ 2076810913] = (byte)(~1892017673 - 975183109 ^ 1427766503);
         var50[~-925202348 - 1768850579 ^ -843648231] = (byte)(2143539928 * -358622939 + 651259609);
         var50[(-984875008 | 23026) ^ -984851984] = (byte)(~-884489359 - -510957238 ^ -1395446615);
         var50[-941146895 * -982285909 + 496097800] = (byte)(~-481384916 - 1339828905 ^ -858444014);
         var50[(877330432 | 57823) ^ 877388251] = (byte)((-1876426752 | 33278) ^ 1876393481);
         var50[~1275897416 - -1723498898 ^ 447601484] = (byte)(~-1198378280 - -584264413 ^ -1782642718);
         var50[-176076046 * 75524267 + 993042528] = (byte)(1112841408 * -1273702935 + -74345156);
         var50[381388675 * 222956303 + -917344678] = (byte)(1109172489 * -945612863 + 238536940);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var50, -1279279548 * -1526651413 + -1237810252);
      }

      var1[var10002] = var10003;
      var10002 = ~-1749893043 - 1270664411 ^ 479228638;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~279867449 - -1648147812 ^ 1368280331);
      if (var10003 == null) {
         byte[] var52 = new byte[1527671785 * 1949988917 + 1554280651];
         var52[796466179 * 1122315503 + 141514035] = (byte)(1241082964 * -992306643 + 1685417347);
         var52[(-1044185088 | 11648) ^ -1044173439] = (byte)(-1635772921 * -554086177 + 1757126510);
         var52[(-355860480 | 37807) ^ -355822675] = (byte)(~-676184763 - 2050953736 ^ 1374768896);
         var52[-2116944294 * -1321059711 + 878342313] = (byte)(-1137625537 * 1833837371 + -1945378225);
         var52[~-1366423969 - -812763382 ^ -2115779950] = (byte)(~659267073 - 1415445550 ^ -2074712676);
         var52[(1657536512 | 45239) ^ 1657581746] = (byte)(~-1994234686 - -692955984 ^ -1607776567);
         var52[~-1006961256 - 1575961774 ^ -569000513] = (byte)(1319001935 * 205747237 + 977235367);
         var52[747532740 * -1244498789 + -1821618597] = (byte)(~936241668 - -504781329 ^ -431460311);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var52, (-1568342016 | 51762) ^ -1568290285);
      }

      var1[var10002] = var10003;
      var10002 = (161873920 | 58172) ^ 161932086;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~-890358855 - -29883963 ^ 920242851);
      if (var10003 == null) {
         byte[] var54 = new byte[~476783466 - 1824363037 ^ 1993820785];
         var54[(1563164672 | 15338) ^ 1563180010] = (byte)(~-241237548 - 813977118 ^ -572739533);
         var54[~-1498652279 - 1450907299 ^ 47744978] = (byte)(-1508388764 * 512603059 + -1215341009);
         var54[2022727726 * 554166419 + 1588401560] = (byte)((-2092761088 | 5679) ^ -2092755415);
         var54[1442832983 * 1161858135 + -847085454] = (byte)(~1427183135 - 1183186148 ^ 1684597913);
         var54[(-1994784768 | 25830) ^ -1994758942] = (byte)((80740352 | 57355) ^ 80797766);
         var54[-793897477 * 1759965267 + 1802604452] = (byte)(~747268956 - 1824901817 ^ -1722796460);
         var54[(-140640256 | 15280) ^ -140624970] = (byte)(-26333570 * 1846811841 + 1543580358);
         var54[1903534073 * 298727049 + 888200646] = (byte)(490071978 * 1059282405 + -949943605);
         var54[~1846024235 - -484184677 ^ -1361839567] = (byte)(~328056787 - 1076758385 ^ -1404815108);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var54, ~-2046921994 - 1958939491 ^ 87982468);
      }

      var1[var10002] = var10003;
      var10002 = -1834043286 * -1642856793 + -651262235;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(90580857 * -1959389281 + 1903926524);
      if (var10003 == null) {
         byte[] var56 = new byte[(145752064 | 63981) ^ 145816036];
         var56[-63956162 * -1190467931 + 1578679562] = (byte)(-1425918871 * 2129034919 + -1754390049);
         var56[~-73138682 - -2132597716 ^ -2089230900] = (byte)(1317204813 * -1435263169 + -351122060);
         var56[-631133399 * -699916533 + 1619766847] = (byte)(~454683334 - -986347987 ^ -531664736);
         var56[~256359309 - 338050538 ^ -594409845] = (byte)((-825884672 | 3865) ^ -825880745);
         var56[1950166787 * 1092283479 + -1903148545] = (byte)(-1839281729 * -1854797285 + -703511965);
         var56[~-366088472 - -1883044166 ^ -2045834664] = (byte)((-1577975808 | 8678) ^ -1577967158);
         var56[1513469566 * 1013272855 + 1589165236] = (byte)((-600244224 | 39462) ^ 600204753);
         var56[1265989909 * -1367557813 + 334060000] = (byte)((8060928 | 44504) ^ 8105400);
         var56[~1190210413 - 1049936418 ^ 2054820472] = (byte)((-1522466816 | 27537) ^ 1522439183);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var56, 1260930458 * -1695040131 + -966962703);
      }

      var1[var10002] = var10003;
      var10002 = -1449905266 * 1770877721 + 975711534;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~-467318469 - 1506411257 ^ -1039092753);
      if (var10003 == null) {
         byte[] var58 = new byte[(688914432 | 65499) ^ 688979922];
         var58[~68641833 - 1618642618 ^ -1687284452] = (byte)((1241841664 | 52186) ^ 1241893873);
         var58[1079271430 * 1232144117 + 1549399619] = (byte)(~1334895258 - 453639126 ^ -1788534337);
         var58[(2054094848 | 51398) ^ 2054146244] = (byte)((-33554432 | 27253) ^ 33527197);
         var58[1058302671 * 1450830605 + 135499392] = (byte)(-1054303777 * 835292831 + 56081618);
         var58[~1017398061 - -1689388507 ^ 671990441] = (byte)(~890835069 - 59662213 ^ 950497393);
         var58[1041714430 * 1012968835 + 332133387] = (byte)(~-1983963868 - -1160422542 ^ 1150580983);
         var58[283127183 * 1208019879 + -68156739] = (byte)(1929467444 * 674706283 + 85499047);
         var58[(1495662592 | 65403) ^ 1495727996] = (byte)((-1984823296 | 39067) ^ -1984784162);
         var58[(-1647771648 | 37737) ^ -1647733919] = (byte)(~-1221004360 - 636301954 ^ -584702414);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var58, 644918268 * 2131918045 + 565540760);
      }

      var1[var10002] = var10003;
      var10002 = (1275527168 | 39459) ^ 1275566638;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((811925504 | 49549) ^ 811975080);
      if (var10003 == null) {
         byte[] var60 = new byte[1236129227 * -1210299383 + -168347674];
         var60[-1852138786 * 1924213561 + -1391314286] = (byte)(~-139026323 - 986349091 ^ 847322861);
         var60[(-620756992 | 22818) ^ -620734173] = (byte)(2048824049 * 1405557975 + -1142342695);
         var60[(1467416576 | 15911) ^ 1467432485] = (byte)(367714097 * 963226311 + -1977813218);
         var60[~-1764307996 - -1443238623 ^ -1087420679] = (byte)(~84059757 - -802649221 ^ -718589545);
         var60[~-2088622325 - -1167241686 ^ -1039103282] = (byte)(655949331 * 1280285129 + 1370105906);
         var60[-635412982 * 459374555 + -1478584457] = (byte)(~1808620719 - 1241378406 ^ 1244968179);
         var60[-1386703601 * 619707913 + -1090723713] = (byte)(~-2142979252 - -1890741450 ^ 261246674);
         var60[(673513472 | 46521) ^ 673559998] = (byte)(-106071286 * -357993539 + 1594665907);
         var60[~381741756 - -1222163010 ^ 840421261] = (byte)((863371264 | 43925) ^ 863415263);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var60, 1400980840 * 426995827 + -1730653587);
      }

      var1[var10002] = var10003;
      var10002 = -70743448 * -527157397 + -1454256490;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~971544635 - 659141181 ^ -1630685791);
      if (var10003 == null) {
         byte[] var62 = new byte[1707416439 * -1177488979 + 1531013534];
         var62[(-1109000192 | 45139) ^ -1108955053] = (byte)(-127038682 * -1773200755 + -691109822);
         var62[-1473689743 * 1429130687 + 531641778] = (byte)(-2121502477 * 1464186501 + -750940274);
         var62[(-1460797440 | 2709) ^ -1460794729] = (byte)(~2083864855 - 1581479463 ^ 629622924);
         var62[~-1512426869 - 1823040674 ^ -310613807] = (byte)(~-1731707712 - -1309731548 ^ 1253528033);
         var62[(1252130816 | 15825) ^ 1252146645] = (byte)(-1388298427 * -795625701 + 1751121987);
         var62[-1402421394 * -130771857 + 1032939347] = (byte)(-1330832589 * 1807696417 + -56666020);
         var62[~475574168 - -839119067 ^ 363544900] = (byte)(~1236501306 - 1642288552 ^ -1416177427);
         var62[~-290759480 - 2008789611 ^ -1718030133] = (byte)(-590739554 * 1222915823 + 152014739);
         var62[~1758379988 - 1289952613 ^ 1246634702] = (byte)(1700672277 * -2051727337 + 390973772);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var62, (-2099576832 | 59184) ^ -2099517674);
      }

      var1[var10002] = var10003;
      var10002 = 536134308 * 895429303 + -784468781;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~1670422881 - 388594944 ^ -2059017799);
      if (var10003 == null) {
         byte[] var64 = new byte[~2028709519 - 76134552 ^ -2104844080];
         var64[~-1922504937 - -891612581 ^ -1480849779] = (byte)((-448266240 | 30871) ^ -448235330);
         var64[~-314513253 - 1851890604 ^ -1537377351] = (byte)((-409927680 | 7860) ^ 409919761);
         var64[~-685712466 - 800800941 ^ -115088474] = (byte)(~-340087499 - 2054892287 ^ -1714804862);
         var64[~-850438226 - -1869273131 ^ -1575255937] = (byte)((2002255872 | 28274) ^ -2002284106);
         var64[(1840644096 | 25143) ^ 1840669235] = (byte)(-395476318 * 258972013 + 1947111149);
         var64[~2081490302 - -29144150 ^ -2052346158] = (byte)(1881685610 * -1631884433 + -1995922940);
         var64[911986515 * -513401847 + 2114363931] = (byte)(~731451628 - 1726318876 ^ -1837196797);
         var64[(2106851328 | 49196) ^ 2106900523] = (byte)(~2143770934 - 1765601595 ^ -385594754);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var64, (-1091895296 | 44517) ^ -1091850814);
      }

      var1[var10002] = var10003;
      I_l1_i1I111lll_IIlIlli1_lI1__li = var1;
      String[] var2 = new String[1122570370 * -1041226613 + 1765917050];
      var10002 = ~-1676754152 - -1954518287 ^ -663694858;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~1226285496 - -970451861 ^ -255833612);
      if (var10003 == null) {
         byte[] var66 = new byte[1233671972 * -1447347003 + 173834580];
         var66[~202712247 - 916589696 ^ -1119301944] = (byte)((1972174848 | 51600) ^ 1972226496);
         var66[283816253 * 1660794615 + 1346674726] = (byte)((-955514880 | 47501) ^ -955467382);
         var66[-2109466949 * -683415001 + -353854587] = (byte)(~1031729828 - -144513435 ^ 887216423);
         var66[~-529017830 - 385125357 ^ 143892475] = (byte)(-259375585 * -1683807765 + 207223460);
         var66[~-106742330 - -897971335 ^ 1004713668] = (byte)((-184549376 | 47187) ^ 184502150);
         var66[1459325799 * 1670243155 + 588937376] = (byte)(~-2123529908 - 1307857888 ^ -815672064);
         var66[1252532774 * -213689975 + -1774943312] = (byte)(~-1853811441 - 1503886417 ^ 349925107);
         var66[796249761 * 424738811 + -748943060] = (byte)((-1997471744 | 9332) ^ -1997462409);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var66, (-2072641536 | 28754) ^ -2072612742);
      }

      var2[var10002] = var10003;
      var10002 = (797114368 | 55954) ^ 797170323;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((1560674304 | 45658) ^ 1560719987);
      if (var10003 == null) {
         byte[] var68 = new byte[-1159019381 * -1555787931 + 1739247664];
         var68[(1682505728 | 9438) ^ 1682515166] = (byte)(1532891863 * 148372695 + 518097233);
         var68[-105037467 * 753039561 + 479612852] = (byte)((-1051000832 | 54780) ^ -1050946138);
         var68[(-951844864 | 53239) ^ -951791627] = (byte)((-1415512064 | 46342) ^ -1415465621);
         var68[1118094002 * -896341337 + 1862945253] = (byte)(-316686998 * 1569713209 + -1592058979);
         var68[~88842491 - -874801864 ^ 785959368] = (byte)((-275316736 | 26206) ^ 275290528);
         var68[1169258723 * -449539435 + -1683542554] = (byte)(~-1493887611 - 981817499 ^ 512070051);
         var68[2063863881 * 777496441 + -1918521723] = (byte)(-279095051 * 300254785 + -2070729673);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var68, -1443158607 * 1593362397 + -2039750820);
      }

      var2[var10002] = var10003;
      var10002 = ~-140987264 - -785514142 ^ 926501407;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~1946391200 - -346032181 ^ -1600358978);
      if (var10003 == null) {
         byte[] var70 = new byte[~651092591 - 550244397 ^ -1201336983];
         var70[1958943226 * 501345205 + 846996542] = (byte)(211727527 * -1906273161 + 19495424);
         var70[-1070597226 * 1014801165 + -1414023325] = (byte)((-1434255360 | 54505) ^ -1434200932);
         var70[~-151523937 - 731222052 ^ -579698114] = (byte)(~1655081515 - 468273499 ^ -2123355065);
         var70[-493299827 * 1628121263 + -2016960864] = (byte)(~-1956948657 - 1510964406 ^ 445984226);
         var70[~-1707025312 - -1845888000 ^ -742053989] = (byte)(844972173 * -474141967 + -1702487680);
         var70[(-363921408 | 52325) ^ -363869088] = (byte)((-1528496128 | 46004) ^ -1528450074);
         var70[~-938932452 - 717776058 ^ 221156399] = (byte)(1028241256 * 1996421371 + -1780716214);
         var70[644130922 * -790787825 + 1584883665] = (byte)((-1856438272 | 59948) ^ 1856378311);
         var70[929840428 * -420482911 + 125847388] = (byte)(~1739896962 - -347163477 ^ -1392733540);
         var70[(146210816 | 5654) ^ 146216479] = (byte)(1227309606 * 983509615 + 629544262);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var70, (-504692736 | 12809) ^ -504679901);
      }

      var2[var10002] = var10003;
      var10002 = ~1770219025 - 1923172840 ^ 601575429;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~1455314441 - -206159061 ^ -1249155360);
      if (var10003 == null) {
         byte[] var72 = new byte[(-816971776 | 61316) ^ -816910451];
         var72[(1853161472 | 31216) ^ 1853192688] = (byte)(~-719544138 - 106487786 ^ 613056286);
         var72[~1941680546 - -427775348 ^ -1513905200] = (byte)(~-1287173356 - 2075625784 ^ 788452359);
         var72[-1472490646 * -400525197 + 48437092] = (byte)(~1966817886 - -1497136071 ^ 469681806);
         var72[1477964992 * -787469421 + 1478636995] = (byte)((-2075131904 | 57552) ^ 2075074386);
         var72[-546141385 * -1772021675 + 403939009] = (byte)(1242975938 * -1501083549 + -1091896474);
         var72[(-480313344 | 3607) ^ -480309742] = (byte)(-1876846947 * 1883735915 + -1778499330);
         var72[~-1863376473 - -2056111238 ^ -375479592] = (byte)((-792657920 | 8818) ^ 792649188);
         var72[-603701265 * 1784915607 + -929279986] = (byte)(749259615 * 578199649 + 958763228);
         var72[-1123537933 * 423900651 + 1624922359] = (byte)(~1820474652 - 1831368814 ^ 643123750);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var72, 553036671 * -81492743 + 482981284);
      }

      var2[var10002] = var10003;
      var10002 = (937951232 | 4975) ^ 937956203;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(461072579 * 1503543669 + -1482318835);
      if (var10003 == null) {
         byte[] var74 = new byte[-271538623 * 1829642341 + -1990703004];
         var74[1171757892 * 1686094453 + 437289452] = (byte)(~-1035004954 - -1587607198 ^ 1672355111);
         var74[(1299513344 | 17398) ^ 1299530743] = (byte)(~1612434221 - -1454632361 ^ 157801945);
         var74[-163804565 * 107197677 + 1866440435] = (byte)((-1841102848 | 5555) ^ 1841097286);
         var74[-600713462 * -1241909031 + -692778871] = (byte)(-1571806039 * -939066549 + -90337412);
         var74[923905401 * -1542632231 + -1084290957] = (byte)((1641152512 | 64468) ^ -1641216956);
         var74[(-1868038144 | 19269) ^ -1868018880] = (byte)(1315450655 * 1226908475 + -980621639);
         var74[~1065953496 - 2126232671 ^ 1102781134] = (byte)((1596981248 | 2830) ^ -1596984136);
         var74[1632973788 * -330662491 + -601151685] = (byte)((1521549312 | 57908) ^ -1521607179);
         var74[22408202 * -208510129 + 1082149618] = (byte)(~-136839160 - 38602569 ^ -98236661);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var74, ~-1256992408 - -1699279774 ^ -1338695143);
      }

      var2[var10002] = var10003;
      var10002 = ~-1646786567 - 1524599221 ^ 122187348;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(267115913 * 17881285 + 1526918592);
      if (var10003 == null) {
         byte[] var76 = new byte[~-644046843 - -61925132 ^ 705971982];
         var76[~2080770994 - -1106547027 ^ -974223968] = (byte)(~-533216411 - -59916844 ^ -593133289);
         var76[1633570971 * -348425799 + 613045502] = (byte)(~1189586335 - 805708524 ^ 1995294867);
         var76[~-843207747 - -1315203163 ^ -2136556385] = (byte)(-653727191 * -1644916491 + -223553792);
         var76[-1294322339 * 1420005745 + -146946826] = (byte)((885915648 | 17765) ^ 885933400);
         var76[(2061893632 | 28173) ^ 2061921801] = (byte)(-295882656 * 80494581 + -446098452);
         var76[(970850304 | 13452) ^ 970863753] = (byte)(45877575 * -1199353999 + -53608665);
         var76[~-879909563 - -1696072645 ^ -1718985095] = (byte)((1215430656 | 18173) ^ -1215448753);
         var76[~-569478380 - -1920645691 ^ -1804843231] = (byte)(-1485210160 * -1048208487 + 740744866);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var76, (-851443712 | 36802) ^ -851406865);
      }

      var2[var10002] = var10003;
      var10002 = 1149498543 * 1342393767 + 256229085;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(-1743537241 * 1086384885 + -296303781);
      if (var10003 == null) {
         byte[] var78 = new byte[(-1577713664 | 27589) ^ -1577686065];
         var78[(1640431616 | 11644) ^ 1640443260] = (byte)(~76872208 - -1717500344 ^ -1640628138);
         var78[~-1126586962 - -707576330 ^ 1834163290] = (byte)(~1230387482 - -2028661893 ^ -798274336);
         var78[(1673592832 | 34863) ^ 1673627693] = (byte)((-1700855808 | 36951) ^ 1700818919);
         var78[~-538521625 - -963502927 ^ 1502024548] = (byte)((-46137344 | 11414) ^ 46125939);
         var78[~2082411855 - 2019566564 ^ 192988872] = (byte)(854481399 * 1758970247 + -1945479308);
         var78[~1224042275 - -178713594 ^ -1045328685] = (byte)(~-1277052434 - -6201931 ^ -1283254354);
         var78[~-929616707 - -1883810091 ^ -1481540501] = (byte)((-1534525440 | 64055) ^ 1534461385);
         var78[~1676115976 - 1069007345 ^ 1549843969] = (byte)((-884539392 | 5015) ^ -884534400);
         var78[(-1740177408 | 18239) ^ -1740159177] = (byte)(1250373987 * 1991399479 + -1960551572);
         var78[181561399 * -1203230859 + 679345638] = (byte)(-1232598372 * -1076858371 + -1944147894);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var78, 610551543 * -1642745895 + 1446641615);
      }

      var2[var10002] = var10003;
      var10002 = (-75104256 | 35558) ^ -75068703;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((-774373376 | 59205) ^ -774314134);
      if (var10003 == null) {
         byte[] var80 = new byte[(-1944453120 | 22476) ^ -1944430649];
         var80[-1910298980 * 1277684397 + -1624223596] = (byte)((1317666816 | 35132) ^ 1317701975);
         var80[(-781385728 | 29238) ^ -781356489] = (byte)(~1033444523 - 932430486 ^ 1965874995);
         var80[~-841044369 - 1562835571 ^ -721791201] = (byte)((1712914432 | 5211) ^ -1712919644);
         var80[(-1308426240 | 34023) ^ -1308392220] = (byte)((2043478016 | 38222) ^ -2043516226);
         var80[1467376667 * 1673154251 + 1711301787] = (byte)((1452802048 | 4746) ^ -1452806799);
         var80[-534841328 * -986582635 + -1688039755] = (byte)(~-1301807304 - -399352970 ^ 1701160273);
         var80[(623575040 | 14401) ^ 623589447] = (byte)(~-343703786 - 778202793 ^ 434498977);
         var80[-1887386174 * -391871699 + 1625487085] = (byte)(~-1983405570 - -1559054922 ^ -752506782);
         var80[(1450835968 | 46144) ^ 1450882120] = (byte)((1607532544 | 32669) ^ -1607565262);
         var80[~-1908600103 - -1845584564 ^ -540782637] = (byte)(~1258113330 - 2142133265 ^ -894720713);
         var80[~709818223 - 1371204761 ^ -2081022979] = (byte)((723779584 | 19280) ^ -723798793);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var80, -409030282 * -59961359 + -269023719);
      }

      var2[var10002] = var10003;
      var10002 = (-1710489600 | 32909) ^ -1710456699;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((1002307584 | 62585) ^ 1002370121);
      if (var10003 == null) {
         byte[] var82 = new byte[-2097984290 * 279841535 + -272514329];
         var82[-253739073 * -1625947469 + -1219891341] = (byte)(~1093390085 - -1039631124 ^ -53758899);
         var82[(1001586688 | 57338) ^ 1001644027] = (byte)((-256049152 | 46006) ^ 256003189);
         var82[(1704001536 | 20940) ^ 1704022478] = (byte)(~-544850156 - 700767167 ^ -155916976);
         var82[(1617166336 | 2760) ^ 1617169099] = (byte)(-1413413445 * -1667358699 + 1258891067);
         var82[(2117926912 | 32716) ^ 2117959624] = (byte)(-2120776027 * -696347633 + -1693337488);
         var82[~-988862332 - 687955177 ^ 300907159] = (byte)(~552469438 - 242127477 ^ 794596890);
         var82[(1683947520 | 23130) ^ 1683970652] = (byte)((1512964096 | 10462) ^ -1512974556);
         var82[-1858006864 * -1219757309 + -850379273] = (byte)(1219361746 * -417936619 + -251735570);
         var82[~-1161317679 - 1131902158 ^ 29415528] = (byte)(1991290147 * -693809807 + -1637806988);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var82, ~-1199383779 - 203326171 ^ 996057655);
      }

      var2[var10002] = var10003;
      var10002 = ~-1465553617 - 1341540217 ^ 124013406;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~714764768 - 399278080 ^ -1114042834);
      if (var10003 == null) {
         byte[] var84 = new byte[(-672202752 | 22540) ^ -672180219];
         var84[-1338278425 * 1186221369 + 762739857] = (byte)((107413504 | 17077) ^ 107430603);
         var84[(936902656 | 40506) ^ 936943163] = (byte)(~-408628346 - 1546897919 ^ -1138269650);
         var84[-315916572 * 771778681 + 1122264638] = (byte)((1366949888 | 13777) ^ -1366963602);
         var84[~800247050 - -581197292 ^ -219049758] = (byte)(1889316538 * -1374174821 + -1833829496);
         var84[(248709120 | 2560) ^ 248711684] = (byte)(-351138254 * -1336086023 + -501538872);
         var84[1204135617 * -537824051 + -596049032] = (byte)(~-1403195289 - 2144949922 ^ -741754738);
         var84[1244436953 * -730642917 + 717189155] = (byte)(830518907 * 2016573039 + -384946416);
         var84[-1554665636 * -1473759895 + 2116880203] = (byte)(-1753014721 * 1533780379 + -1002303273);
         var84[127682824 * 258029653 + 622461024] = (byte)(416233221 * -1911801349 + 794358050);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var84, -1202808361 * -1729391127 + -1601251198);
      }

      var2[var10002] = var10003;
      var10002 = -363035801 * 1931905223 + -436395271;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(1181597639 * -1721479543 + 102350003);
      if (var10003 == null) {
         byte[] var86 = new byte[1753618369 * 1209801321 + -1585797151];
         var86[~740442850 - 856479685 ^ -1596922536] = (byte)((1653997568 | 36458) ^ 1654034026);
         var86[(1282605056 | 19936) ^ 1282624993] = (byte)((1960509440 | 7453) ^ 1960516970);
         var86[(1819344896 | 34018) ^ 1819378912] = (byte)(-1646361584 * 337164447 + 1650489946);
         var86[(-955777024 | 13147) ^ -955763880] = (byte)(~-30172765 - -727079705 ^ -757252479);
         var86[(-319815680 | 5765) ^ -319809919] = (byte)((1349058560 | 36334) ^ -1349094818);
         var86[(-7405568 | 15720) ^ -7389843] = (byte)(~-1139405917 - -979266069 ^ 2118671947);
         var86[680046820 * 643967311 + 171238826] = (byte)((-638910464 | 27150) ^ -638883314);
         var86[(1827340288 | 18997) ^ 1827359282] = (byte)((-1653735424 | 54895) ^ 1653680548);
         var86[~-908918766 - -630407090 ^ 1539325847] = (byte)((-858980352 | 46917) ^ -858933485);
         var86[(985726976 | 59244) ^ 985786213] = (byte)(-1498910537 * 573929841 + 779927645);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var86, 1384483537 * 1056013333 + 1057841421);
      }

      var2[var10002] = var10003;
      var10002 = ~1776044123 - -1735803565 ^ -40240550;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((827392000 | 55888) ^ 827447907);
      if (var10003 == null) {
         byte[] var88 = new byte[-583547226 * 676673289 + 1480481331];
         var88[716857119 * -1153142221 + -1790492973] = (byte)(~-1701419900 - -517620 ^ 1701937446);
         var88[-399602792 * 263103383 + -1604722343] = (byte)((1213923328 | 11021) ^ -1213934425);
         var88[(-159449088 | 17690) ^ -159431400] = (byte)(1003329808 * -574800713 + 1062720994);
         var88[~-364212326 - 1985801156 ^ -1621588830] = (byte)(-1063673323 * -745476211 + 37756732);
         var88[902336228 * -1683091931 + 389734672] = (byte)((-2124152832 | 62487) ^ 2124090317);
         var88[(-537460736 | 48089) ^ -537412644] = (byte)(~2112837380 - -757999380 ^ 1354838003);
         var88[-1646134834 * 1509124347 + -1452645620] = (byte)((-2113667072 | 21709) ^ 2113645439);
         var88[1947398785 * 1254399555 + -124065212] = (byte)(1131079634 * -55651593 + -118222737);
         var88[(770506752 | 30700) ^ 770537444] = (byte)((989462528 | 39793) ^ -989502239);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var88, ~308532641 - -1195070495 ^ 886537806);
      }

      var2[var10002] = var10003;
      var10002 = 507134325 * 1122265153 + 845797719;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((-1727987712 | 26947) ^ -1727960713);
      if (var10003 == null) {
         byte[] var90 = new byte[~545798133 - 2133363651 ^ 1615805504];
         var90[(1127350272 | 45430) ^ 1127395702] = (byte)((394330112 | 36879) ^ 394367038);
         var90[~262779737 - 1711208664 ^ -1973988401] = (byte)(484988792 * 1305111373 + 350128317);
         var90[(-450101248 | 64732) ^ -450036514] = (byte)(739739500 * -2079492195 + 1965211267);
         var90[-756328424 * 1295237477 + -1762384245] = (byte)((-496762880 | 31444) ^ -496731468);
         var90[(-385024000 | 44196) ^ -384979808] = (byte)((2092957696 | 36045) ^ 2092993678);
         var90[(352124928 | 10322) ^ 352135255] = (byte)(~1908322080 - -1029829702 ^ -878492292);
         var90[1877089434 * -1467062761 + -304213456] = (byte)(~-94178233 - -1227245314 ^ -1321423497);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var90, (1353449472 | 17522) ^ 1353466950);
      }

      var2[var10002] = var10003;
      var10002 = 846391272 * -58636795 + 1550846085;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((-718209024 | 6289) ^ -718202716);
      if (var10003 == null) {
         byte[] var92 = new byte[(-2126249984 | 33221) ^ -2126216753];
         var92[(-243990528 | 62924) ^ -243927604] = (byte)(1814185375 * -507065633 + 725345457);
         var92[~-1542888544 - 1837086729 ^ -294198185] = (byte)(1369726915 * 545873275 + 1877026280);
         var92[-1949819271 * -1738566559 + 816283689] = (byte)(-1876131970 * 799324083 + -1828206469);
         var92[~-1374962238 - 1839058661 ^ -464096421] = (byte)((-1840513024 | 31109) ^ -1840481805);
         var92[(852230144 | 58934) ^ 852289074] = (byte)(880347929 * 1080552705 + 87150467);
         var92[(-37814272 | 8997) ^ -37805280] = (byte)(-430017125 * -166575915 + 2132501968);
         var92[(-1147273216 | 45504) ^ -1147227706] = (byte)(~-173883279 - -1053448238 ^ -1227331463);
         var92[-930031778 * 731495671 + -1662440363] = (byte)(~-243328207 - 1287079019 ^ 1043750894);
         var92[-366453350 * 942043751 + 993510162] = (byte)((-1954676736 | 18227) ^ 1954658551);
         var92[1231599207 * 1298087811 + -11644844] = (byte)(~1411420909 - -408142771 ^ -1003278085);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var92, ~-870689370 - -951278560 ^ 1821967884);
      }

      var2[var10002] = var10003;
      var10002 = (-2109276160 | 56562) ^ -2109219588;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I((475398144 | 44557) ^ 475442747);
      if (var10003 == null) {
         byte[] var94 = new byte[~-310388385 - -1558645504 ^ 1869033897];
         var94[~1838502670 - -301751550 ^ -1536751121] = (byte)(-1608053517 * 2023538301 + 87970644);
         var94[~-1859013915 - -89156051 ^ 1948169964] = (byte)(~-869892312 - 516106236 ^ -353785985);
         var94[(1778843648 | 26621) ^ 1778870271] = (byte)(~-1361991511 - -1909584307 ^ 1023391485);
         var94[~-559293185 - 560288943 ^ -995758] = (byte)(-1567822107 * -39996517 + 909130732);
         var94[(380305408 | 49170) ^ 380354582] = (byte)(1067332260 * 1301830037 + -1812888896);
         var94[(-1265827840 | 22849) ^ -1265804988] = (byte)((2032992256 | 61985) ^ 2033054236);
         var94[~1725965955 - 814247813 ^ 1754753521] = (byte)((1486290944 | 47422) ^ 1486338409);
         var94[487252701 * 1196768519 + -29089028] = (byte)((-1625751552 | 13324) ^ -1625738120);
         var94[-1924237942 * 1957494515 + -2060484086] = (byte)(~-2134081831 - 807269805 ^ 1326811956);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var94, ~-1674872776 - 328632576 ^ 1346240241);
      }

      var2[var10002] = var10003;
      var10002 = ~984653936 - -608350467 ^ -376303459;
      var10003 = il1i1__I_ll_Il_i11i_I__i_1I_I(~-1460285448 - 289565444 ^ 1170720052);
      if (var10003 == null) {
         byte[] var96 = new byte[991972742 * -829471067 + -316578647];
         var96[~1759509303 - -352704930 ^ -1406804374] = (byte)((36306944 | 26725) ^ -36333635);
         var96[~-2036913456 - -436540504 ^ -1821513338] = (byte)(~25713232 - 2001862054 ^ -2027575181);
         var96[~1248514133 - 535014570 ^ -1783528702] = (byte)(~875736960 - 690086852 ^ -1565823780);
         var96[~-1547629500 - 1919694372 ^ -372064876] = (byte)((-1981022208 | 18650) ^ 1981003631);
         var96[271758192 * -1152857413 + -505377484] = (byte)(2057555115 * -1396793523 + -1783415801);
         var96[(-956235776 | 32405) ^ -956203376] = (byte)((1188233216 | 60809) ^ -1188294019);
         var96[-1025270737 * 640453827 + 1092768825] = (byte)((-975306752 | 57141) ^ -975249658);
         var10003 = II11iiII_11iiiilIIl_IlIIl1_l_(var96, (687341568 | 49219) ^ 687390836);
      }

      var2[var10002] = var10003;
      lI1l_lI_l_1i_I1i1l11Il = var2;
      I11_1111_l_l_i_1_Iii1l_ = new ArrayList<>();
   }

   @Environment(EnvType.CLIENT)
   public static final class l_Ii_I_i11___i_il__I_l___ {
      private static final int I1II_l_iiiIIlll_ii__iI1Ii11IiI = ~-1737643677 - 2101072744 ^ -363429004;
      private static class_2960 li1_ll_11ilI__il_lilii11i1i_i;
      private static class_2960 iIIII_1il1iIlIIi_II_i1_l1l1_;
      private static class_2960 illl1__1i_II_illIll_l_iI;
      private static class_2960 l11ii___1l1iiIlIilIIiIIII1i_I;
      public static final char[][] Il_lI_l1_iiil11_lI11liiii11_Il = new char[~-1475687273 - -250502004 ^ 1726189204][];

      static class_2960 Il1_l_IIII_lIi_1lIIlI_1III__() {
         class_2960 var10000;
         if (li1_ll_11ilI__il_lilii11i1i_i != null) {
            var10000 = li1_ll_11ilI__il_lilii11i1i_i;
         } else {
            String var0 = I_1liilllIIIil_iI1liillil1Ii11(-314256524 * -1956967177 + -1301116140);
            if (var0 == null) {
               byte[] var1 = new byte[(-2077163520 | 4360) ^ -2077159167];
               var1[~91995077 - 791691413 ^ -883686491] = (byte)(~151624297 - 1736556755 ^ 1888181058);
               var1[~36772911 - 780440361 ^ -817213274] = (byte)((-1435172864 | 31855) ^ -1435141008);
               var1[(-1051590656 | 2615) ^ -1051588043] = (byte)(340202005 * 1366351495 + 514277654);
               var1[475963031 * 1948323909 + -1826696880] = (byte)(~-1133576184 - 1647841932 ^ -514265737);
               var1[1964428073 * -1363601939 + 211455503] = (byte)(~1721765179 - -1877219658 ^ 155454485);
               var1[2106799547 * 463314191 + -1346557168] = (byte)(-1369265562 * -1406540677 + -2072032984);
               var1[-805012865 * -1982623875 + -4833533] = (byte)(-654107772 * 1026620837 + 1913507847);
               var1[~-1888025820 - 422224164 ^ 1465801648] = (byte)(~634508778 - 1975930994 ^ 1684527512);
               var1[-1162686662 * 1543764355 + 1161988954] = (byte)((739180544 | 44905) ^ 739225422);
               var0 = llI_i_iilIilil_1ilIill1I_I1_(var1, ~-1110664307 - -485135293 ^ 1595799599);
            }

            float var10001 = Float.intBitsToFloat(~-26460255 - -612482776 ^ 433697787);
            float[][] var10002 = new float[-377455254 * 1441453695 + -343462804][];
            int var10004 = 1627411074 * -985051709 + 1927154938;
            float[] var10005 = new float[-1675914036 * 951427339 + 503336768];
            var10005[-1271121778 * -463247737 + -1630824162] = Float.intBitsToFloat(-329104289 * -1113319113 + -287700841);
            var10005[1947522040 * 592478925 + 1378767465] = Float.intBitsToFloat((533790720 | 61935) ^ 1599205871);
            var10005[-1411885151 * -112813589 + 1694651959] = Float.intBitsToFloat(-363990902 * 1140159531 + 1131942098);
            var10005[2081846629 * -1222522891 + 1950032730] = Float.intBitsToFloat(~1235886327 - 303943001 ^ -443018833);
            var10002[var10004] = var10005;
            var10004 = (-414580736 | 831) ^ -414579906;
            var10005 = new float[-1512688592 * -143570147 + 474089108];
            var10005[~101846076 - -1799485064 ^ 1697638987] = Float.intBitsToFloat(~-1660576072 - -1238545354 ^ -311618287);
            var10005[(810614784 | 30679) ^ 810645462] = Float.intBitsToFloat((-967049216 | 6115) ^ -2032396317);
            var10005[(1925971968 | 24735) ^ 1925996701] = Float.intBitsToFloat((-832831488 | 61597) ^ -1898123107);
            var10005[(-1145372672 | 44336) ^ -1145328333] = Float.intBitsToFloat((1389559808 | 63376) ^ 326367120);
            var10002[var10004] = var10005;
            var10000 = li1_ll_11ilI__il_lilii11i1i_i = iilill_1_I__11il1Iil_i_i1__lll(var0, var10001, var10002);
         }

         return var10000;
      }

      public static class_2960 I_1_IIIIi1Ii_iI1I__lii_i() {
         class_2960 var10000;
         if (iIIII_1il1iIlIIi_II_i1_l1l1_ != null) {
            var10000 = iIIII_1il1iIlIIi_II_i1_l1l1_;
         } else {
            String var0 = I_1liilllIIIil_iI1liillil1Ii11((-1740308480 | 11789) ^ -1740296692);
            if (var0 == null) {
               byte[] var1 = new byte[(-15794176 | 18056) ^ -15776127];
               var1[~849523192 - -1668202262 ^ 818679069] = (byte)(-1424276832 * 1488930557 + -1133025427);
               var1[~-1926468801 - 2081128560 ^ -154659759] = (byte)((-1815085056 | 18329) ^ -1815066741);
               var1[(1045233664 | 63784) ^ 1045297450] = (byte)((222756864 | 51049) ^ -222807872);
               var1[~-1151937403 - -809831660 ^ 1961769061] = (byte)(~1380830390 - -1553640333 ^ 172809944);
               var1[1780561072 * -2144294779 + 824975508] = (byte)(~315396757 - 1495101735 ^ -1810498547);
               var1[(1884028928 | 24193) ^ 1884053124] = (byte)((-1200553984 | 38667) ^ -1200515218);
               var1[(1754333184 | 42603) ^ 1754375789] = (byte)(~-1326010059 - -963686762 ^ -2005270419);
               var1[(1981743104 | 16939) ^ 1981760044] = (byte)(~89447485 - -715298869 ^ 625851318);
               var1[(-492240896 | 3651) ^ -492237237] = (byte)(~-1358183356 - 270407728 ^ -1087775646);
               var0 = llI_i_iilIilil_1ilIill1I_I1_(var1, ~1922568124 - 712589166 ^ 1659810004);
            }

            float[][] var10002 = new float[(323616768 | 57361) ^ 323674131][];
            int var10004 = -1175805407 * -1566422291 + -1811391117;
            float[] var10005 = new float[694472838 * -1740751169 + -1563166710];
            var10005[(-1110245376 | 25615) ^ -1110219761] = Float.intBitsToFloat((-734724096 | 65159) ^ -1804206457);
            var10005[~-218220947 - 1485972521 ^ -1267751576] = Float.intBitsToFloat(~171256383 - 76823457 ^ -1333880289);
            var10005[~-127078538 - -431464024 ^ 558542563] = Float.intBitsToFloat((-1230503936 | 63324) ^ -138872996);
            var10005[292283389 * 1068034105 + 2002056366] = Float.intBitsToFloat(-917003017 * -473544285 + 1957791675);
            var10002[var10004] = var10005;
            var10004 = (1273167872 | 32895) ^ 1273200766;
            var10005 = new float[(-987758592 | 40727) ^ -987717869];
            var10005[~1428379390 - -205594360 ^ -1222785031] = Float.intBitsToFloat(2126208171 * -854332331 + -1547987143);
            var10005[~737642332 - -508109311 ^ -229533021] = Float.intBitsToFloat(~-515933210 - 1035298993 ^ -1600185496);
            var10005[-1947254022 * 213026479 + -795976932] = Float.intBitsToFloat(-166715693 * 1667436379 + 1401269759);
            var10005[~-1411999017 - 471136819 ^ 940862198] = Float.intBitsToFloat(~834315731 - -1353515655 ^ 1581407411);
            var10002[var10004] = var10005;
            var10000 = iIIII_1il1iIlIIi_II_i1_l1l1_ = iilill_1_I__11il1Iil_i_i1__lll(var0, 2.0F, var10002);
         }

         return var10000;
      }

      static class_2960 lii1_i_1__1l1III_Iil_ll_i1IIlII() {
         class_2960 var10000;
         if (l11ii___1l1iiIlIilIIiIIII1i_I != null) {
            var10000 = l11ii___1l1iiIlIilIIiIIII1i_I;
         } else {
            String var0 = I_1liilllIIIil_iI1liillil1Ii11(~509084180 - 1658690469 ^ 2127192644);
            if (var0 == null) {
               byte[] var1 = new byte[~-1061943963 - -805135568 ^ 1867079522];
               var1[~-2078372087 - -1316882107 ^ -899713103] = (byte)(~1234657017 - -1208214573 ^ 26442455);
               var1[-1691582021 * 691844365 + 1278227074] = (byte)((-416153600 | 11355) ^ 416142296);
               var1[-112733080 * -378660289 + 1863330410] = (byte)(-290613943 * 382190627 + 641315650);
               var1[502531525 * -572654177 + 799783336] = (byte)(1698792469 * 66676753 + -242175252);
               var1[598004234 * -1878275 + 850333730] = (byte)(-1880765498 * 549458969 + 1780720153);
               var1[26370702 * 427689361 + -532322409] = (byte)(2055699320 * -2147233335 + -1117055404);
               var1[362647766 * -1518847173 + -503427916] = (byte)(~-663570578 - -139691657 ^ -803262319);
               var1[~2033737977 - -921879775 ^ -1111858206] = (byte)(-824575784 * -438785287 + -528644645);
               var0 = llI_i_iilIilil_1ilIill1I_I1_(var1, -307762661 * 1313671837 + 213999475);
            }

            float var10001 = Float.intBitsToFloat(-1278163297 * 201931495 + 1105995501);
            float[][] var10002 = new float[(77725696 | 4664) ^ 77730366][];
            int var10004 = (-922288128 | 9677) ^ -922278451;
            float[] var10005 = new float[104527672 * -1936663215 + 1886154572];
            var10005[524157502 * -1627805967 + -287461470] = Float.intBitsToFloat(-2029083371 * -546884207 + 57943579);
            var10005[(1527775232 | 10326) ^ 1527785559] = Float.intBitsToFloat(~-1563892852 - -653398277 ^ -999740040);
            var10005[~1587061749 - 1890594603 ^ 817310941] = Float.intBitsToFloat(~-2070597373 - 1817270326 ^ 1320777414);
            var10005[-270023519 * 541163439 + -115099916] = Float.intBitsToFloat(-1151829173 * 1360638343 + -2113593229);
            var10002[var10004] = var10005;
            var10004 = ~-1573039749 - -2086762488 ^ -635165059;
            var10005 = new float[-682638822 * 2075484297 + 589651994];
            var10005[~-1218483155 - 701867740 ^ 516615414] = Float.intBitsToFloat((92340224 | 17993) ^ 1143031369);
            var10005[-169595999 * -651892555 + -1031848148] = Float.intBitsToFloat(-1801339290 * -367624965 + -1800607234);
            var10005[(-1156644864 | 52403) ^ -1156592463] = Float.intBitsToFloat(~1034462509 - 522646058 ^ -493852504);
            var10005[227604670 * 2046255721 + 587152917] = Float.intBitsToFloat((-1988886528 | 21748) ^ -925084428);
            var10002[var10004] = var10005;
            var10004 = ~-1480569566 - 1519924175 ^ -39354612;
            var10005 = new float[~610367784 - -1602352474 ^ 991984693];
            var10005[~1143139720 - 802292299 ^ -1945432020] = Float.intBitsToFloat(-344613593 * -1418209237 + 1579463283);
            var10005[~1418495998 - -1812753904 ^ 394257904] = Float.intBitsToFloat((1070399488 | 65010) ^ 2120613362);
            var10005[(1518534656 | 27714) ^ 1518562368] = Float.intBitsToFloat(~-145631582 - 820224220 ^ -1767208831);
            var10005[(-190119936 | 63733) ^ -190056202] = Float.intBitsToFloat(~719024228 - -1361178416 ^ 1743683275);
            var10002[var10004] = var10005;
            var10004 = ~-1224425720 - -1485520263 ^ -1585021315;
            var10005 = new float[(1567948800 | 50004) ^ 1567998800];
            var10005[~-1933080189 - -254539372 ^ -2107347736] = Float.intBitsToFloat(~-82395112 - 908015040 ^ -1903556057);
            var10005[~1036572533 - 1380999711 ^ 1877395050] = Float.intBitsToFloat(~311074766 - 1043635737 ^ -301940200);
            var10005[~781594681 - -753078281 ^ -28516403] = Float.intBitsToFloat(~72602525 - 2054462385 ^ -1068003151);
            var10005[-1934258136 * 601005775 + 1902624683] = Float.intBitsToFloat(-2047998753 * -293985335 + -361910295);
            var10002[var10004] = var10005;
            var10004 = (429326336 | 35047) ^ 429361379;
            var10005 = new float[~1727048467 - -1297277612 ^ -429770852];
            var10005[~-1275775711 - 900179936 ^ 375595774] = Float.intBitsToFloat(688085956 * 1881664339 + 619729780);
            var10005[~-1359531611 - -1065431570 ^ -1870004115] = Float.intBitsToFloat((-1285423104 | 42032) ^ -228416464);
            var10005[1362557122 * 181549615 + -9936796] = Float.intBitsToFloat(-49371086 * 423595357 + -98870314);
            var10005[~1939354291 - -316962694 ^ -1622391599] = Float.intBitsToFloat(-1823785789 * 1724544277 + 628155649);
            var10002[var10004] = var10005;
            var10004 = (-1794310144 | 38757) ^ -1794271392;
            var10005 = new float[456107663 * -647092175 + -1855404379];
            var10005[~1605439098 - -547544209 ^ -1057894890] = Float.intBitsToFloat((-1648754688 | 11425) ^ -593875807);
            var10005[(2064449536 | 9642) ^ 2064459179] = Float.intBitsToFloat(~1002267164 - -2081716381 ^ 30873216);
            var10005[446567607 * 1856088501 + 695700383] = Float.intBitsToFloat((-955449344 | 37052) ^ -2039639876);
            var10005[(-577961984 | 16469) ^ -577945514] = Float.intBitsToFloat(1087488667 * -692935217 + -1016087125);
            var10002[var10004] = var10005;
            var10000 = l11ii___1l1iiIlIilIIiIIII1i_I = iilill_1_I__11il1Iil_i_i1__lll(var0, var10001, var10002);
         }

         return var10000;
      }

      static class_2960 i_I_l1ll1i11iI_IlliIi11iil1ii_l() {
         float[][] var10000 = new float[(1016922112 | 36251) ^ 1016958354][];
         int var10002 = (1089208320 | 8048) ^ 1089216368;
         float[] var10003 = new float[-2098767186 * -39394245 + 85402090];
         var10003[(-1261699072 | 22274) ^ -1261676798] = Float.intBitsToFloat(-1451140850 * 84630155 + -1524909722);
         var10003[~-1329209171 - 2084565575 ^ -755356406] = 2.0F;
         var10003[~1713192679 - -1903224263 ^ 190031581] = Float.intBitsToFloat((1665531904 | 51630) ^ 586074542);
         var10003[(-654245888 | 62680) ^ -654183205] = Float.intBitsToFloat((453574656 | 21224) ^ 1542017768);
         var10000[var10002] = var10003;
         var10002 = 349387626 * 878508041 + -1058260665;
         var10003 = new float[(-1711931392 | 588) ^ -1711930808];
         var10003[29394124 * 190093117 + -1344534684] = Float.intBitsToFloat(~-1231900584 - -2002768051 ^ -2124079014);
         var10003[(1741684736 | 65052) ^ 1741749789] = Float.intBitsToFloat(~-1481777431 - 1159857460 ^ 1406147554);
         var10003[~-806503342 - -1280564768 ^ 2087068111] = Float.intBitsToFloat((630652928 | 10289) ^ 1681860657);
         var10003[1013156215 * 461689205 + -1259600480] = Float.intBitsToFloat(~-471168540 - 1270976186 ^ -1847859359);
         var10000[var10002] = var10003;
         var10002 = ~-1773085991 - 1115857144 ^ 657228844;
         var10003 = new float[1978745052 * 239613077 + 327716856];
         var10003[~1873476525 - 1144536968 ^ 1276953802] = Float.intBitsToFloat(663540286 * 1920669511 + 49028814);
         var10003[2145178210 * -830428901 + -1345118805] = Float.intBitsToFloat((452788224 | 54819) ^ 1534449187);
         var10003[~-600407856 - -1076952021 ^ 1677359878] = Float.intBitsToFloat(570309187 * -132591733 + -590204769);
         var10003[-172329878 * 1350674855 + -753265443] = Float.intBitsToFloat(~-524299378 - 947597496 ^ -1485505607);
         var10000[var10002] = var10003;
         var10002 = 1474525663 * -1427819779 + -1679294304;
         var10003 = new float[~1278869294 - 1734258024 ^ 1281839981];
         var10003[~1767638956 - -1954651457 ^ 187012500] = Float.intBitsToFloat((21561344 | 19745) ^ 1074351393);
         var10003[(-1937965056 | 9156) ^ -1937955899] = Float.intBitsToFloat(-339162675 * 1865309263 + 811470269);
         var10003[(-929103872 | 46340) ^ -929057530] = Float.intBitsToFloat((1646198784 | 48931) ^ 576700195);
         var10003[~188851274 - 1105102621 ^ -1293953893] = Float.intBitsToFloat(~-1919079724 - 686935350 ^ 150538229);
         var10000[var10002] = var10003;
         var10002 = (1669201920 | 24609) ^ 1669226533;
         var10003 = new float[(-606928896 | 6753) ^ -606922139];
         var10003[1768053898 * 785291597 + 1091547262] = Float.intBitsToFloat(-695491167 * 1306506527 + -721609599);
         var10003[~-1191333122 - 1324156372 ^ -132823252] = Float.intBitsToFloat(-930558690 * 809694939 + -1112951978);
         var10003[(-1169489920 | 55170) ^ -1169434752] = Float.intBitsToFloat(-47715745 * -1239893795 + -2123471875);
         var10003[(-1934753792 | 55101) ^ -1934698690] = Float.intBitsToFloat(~2124363937 - 1753354054 ^ 1480505368);
         var10000[var10002] = var10003;
         var10002 = (553123840 | 26519) ^ 553150354;
         var10003 = new float[(-1988362240 | 18722) ^ -1988343514];
         var10003[(-161611776 | 6698) ^ -161605078] = Float.intBitsToFloat(1271649276 * 1669500283 + 2006407660);
         var10003[(-1199374336 | 4077) ^ -1199370260] = Float.intBitsToFloat((401801216 | 58577) ^ 1460921553);
         var10003[~-786907176 - 1920582898 ^ -1133675721] = Float.intBitsToFloat((-1583939584 | 62962) ^ -522717710);
         var10003[-73554899 * -321219415 + 2008193614] = 2.0F;
         var10000[var10002] = var10003;
         var10002 = (-1185808384 | 47257) ^ -1185761121;
         var10003 = new float[(277020672 | 48108) ^ 277068776];
         var10003[(1197080576 | 38831) ^ 1197119407] = Float.intBitsToFloat((-1145176064 | 24735) ^ -67215201);
         var10003[-739654949 * -2039718845 + -1318630224] = Float.intBitsToFloat(~84458998 - 1701943183 ^ -714757510);
         var10003[~231842324 - 2000232633 ^ 2062892336] = Float.intBitsToFloat((-118882304 | 3573) ^ -1180037643);
         var10003[~-989600322 - 1812819879 ^ -823219559] = Float.intBitsToFloat(1305066255 * -1238878117 + -1790494293);
         var10000[var10002] = var10003;
         var10002 = (-1091764224 | 14311) ^ -1091749920;
         var10003 = new float[176579143 * -1886462915 + -719089383];
         var10003[(-195821568 | 56492) ^ -195765076] = Float.intBitsToFloat((-1599340544 | 43990) ^ -519787562);
         var10003[(-1283260416 | 35902) ^ -1283224513] = Float.intBitsToFloat((-1913389056 | 16310) ^ -854310986);
         var10003[833841923 * -111977863 + -778412649] = Float.intBitsToFloat((658112512 | 44982) ^ 1719316406);
         var10003[1528896141 * -1264915401 + -896053320] = Float.intBitsToFloat((-325451776 | 43245) ^ -1378178835);
         var10000[var10002] = var10003;
         var10002 = (1284046848 | 10950) ^ 1284057806;
         var10003 = new float[(577699840 | 38665) ^ 577738509];
         var10003[~1608133101 - 419979594 ^ -2028112696] = Float.intBitsToFloat(~-650157387 - 235531801 ^ 1509338929);
         var10003[1140136888 * -1133610541 + 433074009] = Float.intBitsToFloat(-916471020 * 840501333 + 1902615132);
         var10003[-2130520007 * 489307609 + 146219697] = Float.intBitsToFloat(~57203562 - -1774952115 ^ 656589640);
         var10003[(-181862400 | 56016) ^ -181806381] = Float.intBitsToFloat(206811374 * -1883639259 + -1906806374);
         var10000[var10002] = var10003;
         float[][] var0 = var10000;
         class_2960 var1;
         if (illl1__1i_II_illIll_l_iI != null) {
            var1 = illl1__1i_II_illIll_l_iI;
         } else {
            String var2 = I_1liilllIIIil_iI1liillil1Ii11((-1810235392 | 26538) ^ -1810208855);
            if (var2 == null) {
               byte[] var3 = new byte[353941136 * 1604603983 + 1611835800];
               var3[(25821184 | 5059) ^ 25826243] = (byte)(189584674 * -570551087 + -203204861);
               var3[-1743734458 * 983477961 + 129823755] = (byte)(393580887 * -1614060683 + -2028802489);
               var3[~1916221116 - 596708126 ^ 1782038055] = (byte)(-1827473325 * -1558878213 + -223469073);
               var3[(1369571328 | 43639) ^ 1369614964] = (byte)(~-1472341503 - 662318546 ^ 810022962);
               var3[~-1836949832 - 1012716811 ^ 824233016] = (byte)(343462681 * -684754439 + 974969840);
               var3[201965189 * -626474481 + -1614476230] = (byte)((-253624320 | 10072) ^ -253614216);
               var3[~-1326741875 - -1111299152 ^ -1856926268] = (byte)(~-686315317 - 2106536219 ^ 1420220851);
               var3[(-825819136 | 28587) ^ -825790548] = (byte)((-1383989248 | 56506) ^ -1383932694);
               var2 = llI_i_iilIilil_1ilIill1I_I1_(var3, 302283399 * -2013687807 + 180393340);
            }

            var1 = illl1__1i_II_illIll_l_iI = iilill_1_I__11il1Iil_i_i1__lll(var2, Float.intBitsToFloat(~-100687133 - 1666806874 ^ -492166129), var0);
         }

         return var1;
      }

      private static class_2960 iilill_1_I__11il1Iil_i_i1__lll(String param0, float nullx, float[][] nullxx) {
         class_1011 var3 = new class_1011(
            -1338131609 * -156639283 + 1733506501, ~-1801677161 - 642412921 ^ 1159264175, (boolean)((-186908672 | 54060) ^ -186854611)
         );
         float var4 = Float.intBitsToFloat(~-1622466504 - -2060412752 ^ -1683034692);

         for (int var5 = ~-656395625 - 546279559 ^ 110116065; var5 < ((-1446969344 | 28026) ^ -1446941382); var5++) {
            for (int var6 = (1421606912 | 49502) ^ 1421656414; var6 < (~851354335 - -707398611 ^ -143955789); var6++) {
               float var7 = ((float)var6 + Float.intBitsToFloat(-1702929533 * -462542919 + 867952981)) / var4;
               float var8 = ((float)var5 + Float.intBitsToFloat(~277335193 - -670169810 ^ 678047288)) / var4;
               float var9 = Float.intBitsToFloat(~-2018622075 - 1811298158 ^ 1931771123);
               float[][] var10 = nullxx;
               int var11 = nullxx.length;

               for (int var12 = (1177485312 | 61164) ^ 1177546476; var12 < var11; var12++) {
                  float[] var13 = var10[var12];
                  var9 = Math.min(
                     var9,
                     I_1il____ii11i_lii_l_l_IIlIilI_(
                        var7,
                        var8,
                        var13[1620409285 * -1076356875 + 605951095],
                        var13[-2044701806 * 736628435 + 1819878059],
                        var13[(736362496 | 42846) ^ 736405340],
                        var13[-1867074419 * 7501041 + -1822022842]
                     )
                  );
               }

               float var16 = lliII1_Ili_I1Il11l_I1ill.lli_1Ii11i1Ii1_l__Ii______I(
                  (nullx * Float.intBitsToFloat((-357498880 | 1540) ^ -709818876) - var9) * var4 + Float.intBitsToFloat(~-2092936605 - 279054452 ^ 1394451752),
                  0.0F,
                  1.0F
               );
               var3.method_61941(
                  var6,
                  var5,
                  (int)(var16 * Float.intBitsToFloat(-1638971205 * 641563569 + -1607672395)) << -630370068 * 572297573 + -1237752068
                     | (307036160 | 303) ^ 313720528
               );
            }
         }

         class_2960 var14 = class_2960.method_60655(iiIIi_1l1_IllIi11iiil1l_1iIli.Iiiiil_l___li_l_1111I_lI__li_1I(), "altmanager/" + var0);
         class_1043 var15 = new class_1043(var3);
         var15.method_4527((boolean)((-955514880 | 11250) ^ -955503629), (boolean)(~409631800 - 1141289146 ^ -1550920947));
         class_310.method_1551().method_1531().method_4616(var14, var15);
         return var14;
      }

      private static float I_1il____ii11i_lii_l_l_IIlIilI_(float param0, float nullx, float nullxx, float nullxxx, float nullxxxx, float nullxxxxx) {
         float var6 = nullxxxx - nullxx;
         float var7 = nullxxxxx - nullxxx;
         float var8 = lliII1_Ili_I1Il11l_I1ill.lli_1Ii11i1Ii1_l__Ii______I(
            ((var0 - nullxx) * var6 + (nullx - nullxxx) * var7) / (var6 * var6 + var7 * var7), 0.0F, 1.0F
         );
         float var9 = var0 - nullxx - var6 * var8;
         float var10 = nullx - nullxxx - var7 * var8;
         return (float)Math.sqrt((double)(var9 * var9 + var10 * var10));
      }

      public static void IIl_l1IlIIl__1Il__ii_l_1l1(Matrix4f param0, class_2960 nullx, float nullxx, float nullxxx, float nullxxxx, Color nullxxxxx) {
         I_IlI1I_i_1l_i__il1_iilIliII_i.lIillIIlll11_IIIil1il1_()
            .size(new IlIilI1Ili1_i1i1lIliliII1(nullxxxx, nullxxxx))
            .color(new I1I_IiI_iIIllilllIil1_(nullxxxxx))
            .texture(0.0F, 0.0F, 1.0F, 1.0F, class_310.method_1551().method_1531().method_4619(nullx))
            .build()
            .render(
               var0,
               nullxx - nullxxxx * Float.intBitsToFloat(1760615224 * 1261114083 + 127642968),
               nullxxx - nullxxxx * Float.intBitsToFloat(496338547 * -2098277067 + 1363376945)
            );
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
