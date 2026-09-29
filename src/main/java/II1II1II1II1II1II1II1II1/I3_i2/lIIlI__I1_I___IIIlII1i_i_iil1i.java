package II1II1II1II1II1II1II1II1.I3_i2;

import II1II1II1II1II1II1II1II1.I8_i7.i1II1iil__ii1iii1_l1IiII;
import II1II1II1II1II1II1II1II1.l8_I7.Ii_1_il_l_II1lIIl_1I1i1li;
import II1II1II1II1II1II1II1II1.l8_I7.iii1lli_l1ii_liIIIIi1IlIil_I_I;
import II1II1II1II1II1II1II1II1.l8_I7.il__11ii_IIliilIlI_1II1i_Ii1;
import II1II1II1II1II1II1II1II1.l8_I7.l_ll1_1II11l1iIl11lI11I;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class lIIlI__I1_I___IIIlII1i_i_iil1i {
   private static final lIIlI__I1_I___IIIlII1i_i_iil1i ii1II_1_I1_ll_1I1IIi111IIi1I__ = new lIIlI__I1_I___IIIlII1i_i_iil1i();
   private final List<lil11iliIlliiiliii1I11> lIlI__Ii1illi_II_iIl_l_1 = new ArrayList<>();
   private String ii1Il1iIli_11__11I_IIi_Ii;
   private boolean II_l1Ii_11_ilI_lI__ii1Il1lI1;
   public static final char[][] I1II1IilIl1iI1lI_i_ill1il_II1 = new char[~-1334796202 - -1422510181 ^ -1537660846][];

   private lIIlI__I1_I___IIIlII1i_i_iil1i() {
      String var10001 = I1i_11ilI__IIil_1_IiIl1lII((1216217088 | 60472) ^ 1216277560);
      if (var10001 == null) {
         byte[] var1 = new byte[(1197998080 | 18298) ^ 1198016383];
         var1[(-6946816 | 3956) ^ -6942860] = (byte)((-365297664 | 50531) ^ -365247159);
         var1[(-1947926528 | 63987) ^ -1947862542] = (byte)(~1619773779 - -2129164758 ^ -509391025);
         var1[~-783419660 - 707983390 ^ 75436271] = (byte)((-765198336 | 13268) ^ -765185110);
         var1[~-1238585191 - 1586031460 ^ -347446271] = (byte)(~754016827 - -1032240317 ^ 278223557);
         var1[824671046 * -1609774523 + 298748454] = (byte)((-1662255104 | 2111) ^ -1662253052);
         var10001 = ll1I11l_I_iiiiiil_l1III_I11i(var1, ~2018934892 - 1098764716 ^ 1177267687);
      }

      this.ii1Il1iIli_11__11I_IIi_Ii = var10001;
   }

   public static lIIlI__I1_I___IIIlII1i_i_iil1i lIl1il_lllll1_I1l_1Il1_Il1ll() {
      int var1 = System.identityHashCode(null);
      if ((var1 * (var1 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return ii1II_1_I1_ll_1I1IIi111IIi1I__;
      }
   }

   public void initialize() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else if (!this.II_l1Ii_11_ilI_lI__ii1Il1lI1) {
         this.II_l1Ii_11_ilI_lI__ii1Il1lI1 = (boolean)((-565641216 | 41925) ^ -565599292);
         Object var10001 = null;
         Thread.currentThread().hashCode();
         this.ii1Il1iIli_11__11I_IIi_Ii = li_i1_lilIl__lll1_IlI1lll11lii();
         List var10000 = this.lIlI__Ii1illi_II_iIl_l_1;
         Object var10004 = null;
         Thread.currentThread().hashCode();
         var10001 = new Ii_1_il_l_II1lIIl_1I1i1li(this);
         Object var10002 = null;
         Thread.currentThread().hashCode();
         var10000.add(var10001);
         var10000 = this.lIlI__Ii1illi_II_iIl_l_1;
         var10004 = null;
         Thread.currentThread().hashCode();
         var10001 = new iii1lli_l1ii_liIIIIi1IlIil_I_I(this);
         var10002 = null;
         Thread.currentThread().hashCode();
         var10000.add(var10001);
         var10000 = this.lIlI__Ii1illi_II_iIl_l_1;
         var10004 = null;
         Thread.currentThread().hashCode();
         var10001 = new il__11ii_IIliilIlI_1II1i_Ii1(this);
         var10002 = null;
         Thread.currentThread().hashCode();
         var10000.add(var10001);
         var10000 = this.lIlI__Ii1illi_II_iIl_l_1;
         var10004 = null;
         Thread.currentThread().hashCode();
         var10001 = new l_ll1_1II11l1iIl11lI11I(this);
         var10002 = null;
         Thread.currentThread().hashCode();
         var10000.add(var10001);
      }
   }

   public List<lil11iliIlliiiliii1I11> getCommands() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.lIlI__Ii1illi_II_iIl_l_1;
      }
   }

   public String getPrefix() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.ii1Il1iIli_11__11I_IIi_Ii;
      }
   }

   public void setPrefix(String param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         this.ii1Il1iIli_11__11I_IIi_Ii = var1;
         String var10000 = I1i_11ilI__IIil_1_IiIl1lII(1050489318 * 1659957493 + -517497117);
         if (var10000 == null) {
            byte[] var5 = new byte[~-610243300 - -1220291933 ^ 1830535242];
            var5[947822421 * 2093894221 + 91586927] = (byte)(1374957988 * 859852407 + 1801254161);
            var5[(767426560 | 49464) ^ 767476025] = (byte)((-1510604800 | 48496) ^ 1510556405);
            var5[-1372778097 * 961150825 + -767599781] = (byte)((364183552 | 18720) ^ 364202276);
            var5[~427959657 - 1750614566 ^ 2116393075] = (byte)((-1869479936 | 55841) ^ -1869424001);
            var5[(-573112320 | 21877) ^ -573090447] = (byte)(~78059531 - -1795678625 ^ -1717619183);
            var5[~-354508021 - 1221611779 ^ -867103756] = (byte)(1186569578 * -1120189709 + 2043428961);
            var5[~-837849243 - 2142743310 ^ -1304894070] = (byte)((623443968 | 35068) ^ 623479008);
            var5[(258146304 | 44356) ^ 258190659] = (byte)(~159698725 - 780231986 ^ 939930674);
            var5[~-1782488087 - -7477586 ^ 1789965664] = (byte)((-1566113792 | 7783) ^ -1566106022);
            var5[~-2040309069 - 1884347146 ^ 155961931] = (byte)(~-688096921 - -95071050 ^ -783167939);
            var10000 = ll1I11l_I_iiiiiil_l1III_I11i(var5, ~1742662479 - 1442476769 ^ 1109828046);
         }

         Object var10001 = null;
         Thread.currentThread().hashCode();
         JsonObject var4 = i1II1iil__ii1iii1_l1IiII.iIl_li1l_I_llI_l_1_1____i(var10000);
         var10001 = I1i_11ilI__IIil_1_IiIl1lII((221446144 | 49114) ^ 221495256);
         if (var10001 == null) {
            var10001 = new byte[1947793289 * -320547849 + -1512095781];
            ((Object[])var10001)[-2098342478 * 948004483 + -1636517398] = (byte)(-1758712474 * -1239687587 + 2010320405);
            ((Object[])var10001)[-239987843 * -358546363 + -1894397104] = (byte)((-79167488 | 29165) ^ 79138357);
            ((Object[])var10001)[1925950053 * 1546710675 + 2108899843] = (byte)(~2080298166 - 1162513322 ^ -1052155830);
            ((Object[])var10001)[(-913768448 | 20836) ^ -913747609] = (byte)(~-1467983839 - -1051973544 ^ -1775009862);
            ((Object[])var10001)[~1114389592 - 955383658 ^ -2069773255] = (byte)(~-17369414 - 1888298102 ^ -1870928697);
            ((Object[])var10001)[(-1871380480 | 31298) ^ -1871349177] = (byte)((1793654784 | 62606) ^ -1793717424);
            ((Object[])var10001)[(-1747386368 | 37534) ^ -1747348840] = (byte)((-133955584 | 59509) ^ -133896117);
            ((Object[])var10001)[~-675607491 - -1509030911 ^ -2110328890] = (byte)(1366927007 * 1060720857 + -1318513815);
            ((Object[])var10001)[(2017132544 | 35582) ^ 2017168118] = (byte)(741084116 * 396350863 + 1222770745);
            ((Object[])var10001)[931163392 * 494888697 + -978846967] = (byte)(-112637500 * -870823817 + 1741657468);
            var10001 = ll1I11l_I_iiiiiil_l1III_I11i((byte[])var10001, -708637537 * -102624451 + -885509857);
         }

         Object var10003 = null;
         Thread.currentThread().hashCode();
         var4.addProperty((String)var10001, var1);
         var10000 = null;
         Thread.currentThread().hashCode();
         i1II1iil__ii1iii1_l1IiII.llIl_IlI1ll1__Il__IlIl__ll();
      }
   }

   private static String li_i1_lilIl__lll1_IlI1lll11lii() {
      int var1 = System.identityHashCode(null);
      if ((var1 * (var1 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         String var10000 = I1i_11ilI__IIil_1_IiIl1lII(8699827 * -446339153 + 2072047526);
         if (var10000 == null) {
            byte[] var4 = new byte[(1190068224 | 39137) ^ 1190107371];
            var4[~-1647378291 - 1073431662 ^ 573946628] = (byte)(~-2091459713 - 795289413 ^ -1296170349);
            var4[~994204753 - 2070189432 ^ 1230573111] = (byte)((-1962737664 | 28690) ^ 1962708965);
            var4[(1566179328 | 51166) ^ 1566230492] = (byte)(~1145179010 - -371566866 ^ 773612032);
            var4[~1821565889 - -1594396191 ^ -227169698] = (byte)(-1950040508 * 1338229111 + -900838784);
            var4[1449875449 * 886803819 + -341109263] = (byte)((-814546944 | 39556) ^ -814507321);
            var4[1661212867 * 489595485 + -439510226] = (byte)((-1000210432 | 14898) ^ -1000195494);
            var4[956931351 * -407031799 + 1983523383] = (byte)((1630797824 | 59262) ^ -1630856976);
            var4[~-1144895695 - 984903162 ^ 159992531] = (byte)(~-457931385 - -421623226 ^ -879554636);
            var4[~1254302045 - 1389849081 ^ 1650816161] = (byte)(1950773096 * 468717539 + 1535385188);
            var4[(-976683008 | 37030) ^ -976645969] = (byte)(-1518455055 * -1508672423 + -90232267);
            var10000 = ll1I11l_I_iiiiiil_l1III_I11i(var4, ~-170399886 - 1680770412 ^ -1510370526);
         }

         Object var10001 = null;
         Thread.currentThread().hashCode();
         JsonObject var3 = i1II1iil__ii1iii1_l1IiII.iIl_li1l_I_llI_l_1_1____i(var10000);
         var10001 = I1i_11ilI__IIil_1_IiIl1lII(-731137868 * 1599654123 + -1896820024);
         if (var10001 == null) {
            var10001 = new byte[-1334717962 * 538358649 + 960544964];
            ((Object[])var10001)[258535240 * 2115030903 + -1740796536] = (byte)(-285213291 * 802092713 + -764515676);
            ((Object[])var10001)[-1734261125 * 881474411 + 252391832] = (byte)((-193593344 | 61274) ^ 193532096);
            ((Object[])var10001)[~2075816532 - 994250025 ^ 1224900736] = (byte)(~82698745 - 720526803 ^ 803225528);
            ((Object[])var10001)[~-919524598 - 997853228 ^ -78328630] = (byte)(1940558548 * -74914623 + 84049480);
            ((Object[])var10001)[1228971987 * -1706884587 + -1170588235] = (byte)(~-398063816 - 735002167 ^ -336938358);
            ((Object[])var10001)[-121638061 * -999885303 + 1314697242] = (byte)(293510529 * 1328336811 + 233143302);
            ((Object[])var10001)[~835011163 - -1144976993 ^ 309965827] = (byte)(-1052751675 * 2013120279 + 754406296);
            ((Object[])var10001)[(1029242880 | 1637) ^ 1029244514] = (byte)(~1813920935 - -566161190 ^ -1247759764);
            ((Object[])var10001)[(-1430847488 | 51121) ^ -1430796359] = (byte)((69861376 | 2233) ^ 69863566);
            ((Object[])var10001)[-1889193468 * -565008073 + -436888275] = (byte)((373555200 | 43374) ^ 373598502);
            var10001 = ll1I11l_I_iiiiiil_l1III_I11i((byte[])var10001, ~-2045149875 - 739404877 ^ 1305744993);
         }

         Object var10002 = null;
         Thread.currentThread().hashCode();
         if (!var3.has((String)var10001)) {
            var10000 = I1i_11ilI__IIil_1_IiIl1lII((303300608 | 8738) ^ 303309351);
            if (var10000 == null) {
               byte[] var9 = new byte[~-1423966289 - -1657176891 ^ -1213824114];
               var9[-1083288314 * -829876529 + 1715780646] = (byte)(-1530985097 * -1840900633 + 1336233723);
               var9[-486848925 * -1481320945 + -1814815180] = (byte)((369885184 | 18789) ^ 369903908);
               var9[(1977810944 | 31813) ^ 1977842759] = (byte)((-2131165184 | 55621) ^ 2131109613);
               var9[(802816000 | 52451) ^ 802868448] = (byte)(~-809849574 - -2094037621 ^ 1391080117);
               var9[-18146410 * -244468501 + -1175833262] = (byte)((-2026504192 | 16656) ^ -2026487431);
               var10000 = ll1I11l_I_iiiiiil_l1III_I11i(var9, (2018836480 | 36557) ^ 2018873032);
            }

            return var10000;
         } else {
            var10001 = I1i_11ilI__IIil_1_IiIl1lII(-2114871304 * -772289139 + 545868910);
            if (var10001 == null) {
               var10001 = new byte[~879570447 - -1035586140 ^ 156015686];
               ((Object[])var10001)[1891832731 * 1985435881 + 872996845] = (byte)((1557790720 | 31325) ^ 1557822068);
               ((Object[])var10001)[(19791872 | 52029) ^ 19843900] = (byte)(~-662905794 - 2075398439 ^ 1412492559);
               ((Object[])var10001)[(1569980416 | 32557) ^ 1570012975] = (byte)(1020660057 * 552393343 + -808480146);
               ((Object[])var10001)[~-1398142066 - 682356340 ^ 715785726] = (byte)((199884800 | 39244) ^ 199924000);
               ((Object[])var10001)[~-705033309 - 315535751 ^ 389497553] = (byte)(~61922426 - -167554398 ^ 105631947);
               ((Object[])var10001)[(1849425920 | 61320) ^ 1849487245] = (byte)(138135957 * 1414975567 + 1169537857);
               ((Object[])var10001)[~1414134529 - 2099043225 ^ 781789539] = (byte)(~322774734 - -350623515 ^ -27848809);
               ((Object[])var10001)[~-1910982858 - -596528247 ^ -1787456185] = (byte)((-1312227328 | 14930) ^ -1312212355);
               ((Object[])var10001)[(-924319744 | 3415) ^ -924316321] = (byte)(-1269204204 * 1230017861 + 620703672);
               ((Object[])var10001)[(2011037696 | 1246) ^ 2011038935] = (byte)(~931831792 - 1067503867 ^ -1999335679);
               var10001 = ll1I11l_I_iiiiiil_l1III_I11i((byte[])var10001, -562017765 * 1031613579 + -2056511651);
            }

            var10002 = null;
            Thread.currentThread().hashCode();
            JsonElement var5 = var3.get((String)var10001);
            var10001 = null;
            Thread.currentThread().hashCode();
            String var2 = var5.getAsString();
            if (var2 != null) {
               var10001 = null;
               Thread.currentThread().hashCode();
               if (!var2.isBlank()) {
                  return var2;
               }
            }

            var10000 = I1i_11ilI__IIil_1_IiIl1lII(~-2055957232 - 2043891624 ^ 12065600);
            if (var10000 == null) {
               byte[] var7 = new byte[(1921581056 | 44285) ^ 1921625336];
               var7[265684323 * 1967233473 + -1991588515] = (byte)((-1561526272 | 51417) ^ -1561474867);
               var7[1889101950 * -582895721 + -1647096913] = (byte)(~1248681991 - 23307277 ^ 1271989253);
               var7[~1881200948 - -887227856 ^ -993973095] = (byte)((-1842413568 | 56647) ^ 1842356983);
               var7[~589188177 - 1212921654 ^ -1802109829] = (byte)((-370081792 | 7357) ^ 370074470);
               var7[~-872674529 - 331811475 ^ 540863049] = (byte)(~273420820 - -673607293 ^ -400186419);
               var10000 = ll1I11l_I_iiiiiil_l1III_I11i(var7, ~-126075896 - 1064757394 ^ -938681502);
            }

            return var10000;
         }
      }
   }

   public boolean isCommand(String param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10001 = null;
         Thread.currentThread().hashCode();
         this.initialize();
         if (var1 != null) {
            var10001 = this.ii1Il1iIli_11__11I_IIi_Ii;
            Object var10002 = null;
            Thread.currentThread().hashCode();
            if (var1.startsWith((String)var10001)) {
               return (boolean)((-1620443136 | 38056) ^ -1620405079);
            }
         }

         return (boolean)(-1032700950 * -470795331 + 1954207294);
      }
   }

   public Suggestions buildSuggestions(String param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         String var10001 = null;
         Thread.currentThread().hashCode();
         this.initialize();
         var10001 = this.ii1Il1iIli_11__11I_IIi_Ii;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         int var14 = var10001.length();
         var10002 = null;
         Thread.currentThread().hashCode();
         String var8 = var1.substring(var14);
         int var26 = (981073920 | 18803) ^ -981092724;
         Object var10003 = null;
         Thread.currentThread().hashCode();
         String[] var4 = var8.split("\\s+", var26);
         if (var4.length <= 280838657 * 830885875 + -143259122) {
            var10001 = this.ii1Il1iIli_11__11I_IIi_Ii;
            var10002 = null;
            Thread.currentThread().hashCode();
            int var24 = var10001.length();
            if (var4.length == 0) {
               var10003 = I1i_11ilI__IIil_1_IiIl1lII(2123133770 * -1174960099 + 1450287270);
               if (var10003 == null) {
                  var10003 = new byte[-280031297 * -437372755 + 2106495985];
                  ((Object[])var10003)[~1903850297 - 437858969 ^ 1953258029] = (byte)((199426048 | 31076) ^ 199457098);
                  ((Object[])var10003)[~1969061687 - -258447711 ^ -1710613978] = (byte)(-2069682644 * 138395781 + -171431181);
                  ((Object[])var10003)[372026285 * 839207851 + -176380813] = (byte)(~1049915458 - 263113626 ^ -1313029056);
                  ((Object[])var10003)[~-1503294807 - -229182954 ^ 1732477763] = (byte)((-166985728 | 12057) ^ -166973683);
                  var10003 = ll1I11l_I_iiiiiil_l1III_I11i((byte[])var10003, (242155520 | 15815) ^ 242171343);
               }

               if ((~-732767523 - -221320066 ^ -337791744) != ((819331072 | 65416) ^ -472550868)) {
               }
            } else {
               var10003 = var4[~-1400246649 - -316597839 ^ 1716844487];
            }

            Object var10004 = null;
            Thread.currentThread().hashCode();
            var10002 = this.l1iii1l1i1II_11_I1_1li_l_illIil((String)var10003);
            var10003 = null;
            Thread.currentThread().hashCode();
            return II_11_iII_I1__illII11l_lii(var1, var24, (List<String>)var10002);
         } else {
            var10001 = var4[~1804885823 - 1857567813 ^ 632513659];
            var10002 = null;
            Thread.currentThread().hashCode();
            lil11iliIlliiiliii1I11 var5 = this.Ill_I_1l1_i1iIl1I_II_11l(var10001);
            if (var5 == null) {
               Object var11 = null;
               Thread.currentThread().hashCode();
               var11 = Suggestions.empty();
               var10001 = null;
               Thread.currentThread().hashCode();
               return (Suggestions)var11.join();
            } else {
               int var16 = ~-1091816496 - 1896626006 ^ -804809512;
               int var28 = var4.length;
               var10003 = null;
               Thread.currentThread().hashCode();
               String[] var6 = Arrays.copyOfRange(var4, var16, var28);
               var10001 = var4[(-288489472 | 20446) ^ -288469026];
               var10003 = null;
               Thread.currentThread().hashCode();
               Stream var10000 = var5.suggest(var10001, var6);
               var10002 = null;
               Thread.currentThread().hashCode();
               Predicate var18 = nullxx -> {
                  int var3x = System.identityHashCode(null);
                  if ((var3x * (var3x + 1) & 1) != 0) {
                     throw new Error("unreachable");
                  } else {
                     Locale var10001x = Locale.ROOT;
                     Object var10002x = null;
                     Thread.currentThread().hashCode();
                     String var10000x = nullxx.toLowerCase(var10001x);
                     String var4x = var6[var6.length - ((-504365056 | 6204) ^ -504358851)];
                     var10002x = Locale.ROOT;
                     Object var10003x = null;
                     Thread.currentThread().hashCode();
                     String var5x = var4x.toLowerCase((Locale)var10002x);
                     var10002x = null;
                     Thread.currentThread().hashCode();
                     return var10000x.startsWith(var5x);
                  }
               };
               var10002 = null;
               Thread.currentThread().hashCode();
               var10000 = var10000.filter(var18);
               Comparator var19 = String.CASE_INSENSITIVE_ORDER;
               var10002 = null;
               Thread.currentThread().hashCode();
               var10000 = var10000.sorted(var19);
               var10001 = null;
               Thread.currentThread().hashCode();
               List var7 = var10000.toList();
               int var32 = -948289645 * 1623997483 + 242015855;
               var10003 = null;
               Thread.currentThread().hashCode();
               int var21 = var1.lastIndexOf(var32) + (~-2026687014 - 392360473 ^ 1634326541);
               var10003 = null;
               Thread.currentThread().hashCode();
               return II_11_iII_I1__illII11l_lii(var1, var21, var7);
            }
         }
      }
   }

   public String suggestionSuffix(String param1, Suggestions nullx) {
      int var4 = System.identityHashCode(null);
      if ((var4 * (var4 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         StringRange var10001 = null;
         Thread.currentThread().hashCode();
         List var10000 = nullx.getList();
         var10001 = null;
         Thread.currentThread().hashCode();
         if (var10000.size() != (~1043370760 - 2117143640 ^ 1134452894)) {
            String var12 = I1i_11ilI__IIil_1_IiIl1lII(-1084130607 * 1708675231 + -1766102982);
            if (var12 == null) {
               byte[] var13 = new byte[(-2069692416 | 1960) ^ -2069690452];
               var13[-1633070167 * -1565108011 + 1546996835] = (byte)((-1706557440 | 34799) ^ 1706522723);
               var13[1717050295 * -1822151527 + -937952350] = (byte)(97296087 * -1000116673 + -1656780979);
               var13[(614531072 | 23544) ^ 614554618] = (byte)(206656280 * -1096239279 + -1608610479);
               var13[(-186974208 | 41973) ^ -186932234] = (byte)((1649672192 | 33522) ^ 1649705622);
               var12 = ll1I11l_I_iiiiiil_l1III_I11i(var13, (-418185216 | 15375) ^ -418169850);
            }

            return var12;
         } else {
            var10001 = null;
            Thread.currentThread().hashCode();
            var10000 = nullx.getList();
            int var16 = (-1637220352 | 12135) ^ -1637208217;
            Object var10002 = null;
            Thread.currentThread().hashCode();
            Suggestion var7 = (Suggestion)var10000.get(var16);
            var10001 = null;
            Thread.currentThread().hashCode();
            int var9 = var1.length();
            var10002 = null;
            Thread.currentThread().hashCode();
            var10001 = var7.getRange();
            var10002 = null;
            Thread.currentThread().hashCode();
            int var5 = var9 - var10001.getStart();
            var10001 = null;
            Thread.currentThread().hashCode();
            String var6 = var7.getText();
            var10002 = null;
            Thread.currentThread().hashCode();
            String var10;
            if (var5 >= var6.length()) {
               var10 = I1i_11ilI__IIil_1_IiIl1lII(~1906532291 - 1923695358 ^ 464739636);
               if (var10 == null) {
                  byte[] var11 = new byte[~-716264220 - 1069051230 ^ -352787015];
                  var11[(566558720 | 6318) ^ 566565038] = (byte)((814022656 | 55699) ^ 814078359);
                  var11[~113353659 - 1501354119 ^ -1614707780] = (byte)(-967164098 * 549105147 + -709158823);
                  var11[(-70123520 | 15087) ^ -70108435] = (byte)((772014080 | 15344) ^ 772029359);
                  var11[-351522784 * -718808695 + -321970461] = (byte)(~444827971 - 1285462409 ^ -1730290410);
                  var10 = ll1I11l_I_iiiiiil_l1III_I11i(var11, 2033542881 * -239487345 + 711889499);
               }
            } else {
               var10002 = null;
               Thread.currentThread().hashCode();
               var10 = var6.substring(var5);
            }

            return var10;
         }
      }
   }

   private List<String> l1iii1l1i1II_11_I1_1li_l_illIil(String param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Locale var10001 = Locale.ROOT;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         String var7 = var1.toLowerCase(var10001);
         var10002 = null;
         Thread.currentThread().hashCode();
         ArrayList var4 = new ArrayList();
         List var10000 = this.lIlI__Ii1illi_II_iIl_l_1;
         var10001 = null;
         Thread.currentThread().hashCode();
         Iterator var5 = var10000.iterator();

         while (true) {
            var10001 = null;
            Thread.currentThread().hashCode();
            if (!var5.hasNext()) {
               Comparator var16 = String.CASE_INSENSITIVE_ORDER;
               var10002 = null;
               Thread.currentThread().hashCode();
               var4.sort(var16);
               return var4;
            }

            var10001 = null;
            Thread.currentThread().hashCode();
            lil11iliIlliiiliii1I11 var6 = (lil11iliIlliiiliii1I11)var5.next();
            var10001 = null;
            Thread.currentThread().hashCode();
            String var8 = var6.getName();
            var10001 = Locale.ROOT;
            var10002 = null;
            Thread.currentThread().hashCode();
            String var9 = var8.toLowerCase(var10001);
            var10002 = null;
            Thread.currentThread().hashCode();
            if (var9.startsWith(var7)) {
               var10002 = null;
               Thread.currentThread().hashCode();
               String var15 = var6.getName();
               var10002 = null;
               Thread.currentThread().hashCode();
               var4.add(var15);
            }

            if (-646976749 * -1538282105 + 1847061081 != ((-92405760 | 17150) ^ -1968440672)) {
            }
         }
      }
   }

   private static Suggestions II_11_iII_I1__illII11l_lii(String param0, int nullx, List<String> nullxx) {
      int var4 = System.identityHashCode(null);
      if ((var4 * (var4 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10002 = null;
         Thread.currentThread().hashCode();
         int var10001 = var0.length();
         var10002 = null;
         Thread.currentThread().hashCode();
         StringRange var8 = StringRange.between(nullx, var10001);
         var10002 = null;
         Thread.currentThread().hashCode();
         ArrayList var5 = new ArrayList();
         Object var9 = null;
         Thread.currentThread().hashCode();
         Iterator var6 = nullxx.iterator();

         while (true) {
            Object var10 = null;
            Thread.currentThread().hashCode();
            if (!var6.hasNext()) {
               Object var10004 = null;
               Thread.currentThread().hashCode();
               return new Suggestions(var8, var5);
            }

            Object var11 = null;
            Thread.currentThread().hashCode();
            String var7 = (String)var6.next();
            Object var10005 = null;
            Thread.currentThread().hashCode();
            Suggestion var12 = new Suggestion(var8, var7);
            var10002 = null;
            Thread.currentThread().hashCode();
            var5.add(var12);
            if ((~662157466 - -582512535 ^ -1492352287) != ((-346030080 | 63578) ^ -1221800889)) {
            }
         }
      }
   }

   public boolean handle(String param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         String var10001 = null;
         Thread.currentThread().hashCode();
         this.initialize();
         if (var1 == null) {
            return (boolean)((-842596352 | 50450) ^ -842545902);
         } else {
            var10001 = null;
            Thread.currentThread().hashCode();
            String var5 = var1.trim();
            var10001 = this.ii1Il1iIli_11__11I_IIi_Ii;
            Object var10002 = null;
            Thread.currentThread().hashCode();
            if (!var5.startsWith((String)var10001)) {
               return (boolean)(~-771593035 - 1829966713 ^ -1058373679);
            } else {
               var10001 = this.ii1Il1iIli_11__11I_IIi_Ii;
               var10002 = null;
               Thread.currentThread().hashCode();
               int var11 = var10001.length();
               var10002 = null;
               Thread.currentThread().hashCode();
               String var10000 = var5.substring(var11);
               var10001 = null;
               Thread.currentThread().hashCode();
               String var4 = var10000.trim();
               var10001 = null;
               Thread.currentThread().hashCode();
               if (var4.isEmpty()) {
                  var10001 = I1i_11ilI__IIil_1_IiIl1lII((-1006698496 | 6004) ^ -1006692481);
                  if (var10001 == null) {
                     byte[] var17 = new byte[~-1299819911 - -543679070 ^ 1843498988];
                     var17[(815071232 | 31730) ^ 815102962] = (byte)(-596552399 * 1597384587 + -484030616);
                     var17[~20905939 - -731304834 ^ 710398895] = (byte)(~921644405 - -915483839 ^ -6160571);
                     var17[~1302409717 - -72555386 ^ -1229854330] = (byte)(~-716998521 - -1858745447 ^ -1719223354);
                     var17[(827260928 | 20250) ^ 827281177] = (byte)((1330380800 | 63716) ^ 1330444531);
                     var17[~-57318860 - 1524371786 ^ -1467052923] = (byte)(357968538 * 867099883 + 155827475);
                     var17[~2032935771 - -1406409340 ^ -626526427] = (byte)(466956650 * 966530331 + -589424603);
                     var17[~-1856690018 - -1498389699 ^ -939887582] = (byte)(34543323 * 759273709 + -707080285);
                     var17[(817430528 | 41465) ^ 817471998] = (byte)(~2033070036 - 1994366981 ^ 267530329);
                     var10001 = ll1I11l_I_iiiiiil_l1III_I11i(var17, (-1561067520 | 63512) ^ -1561004013);
                  }

                  var10002 = null;
                  Thread.currentThread().hashCode();
                  this.lIIilIil__iiill__ll_IlIlIl(var10001);
                  return (boolean)(897267064 * 1127516005 + -1462657111);
               } else {
                  var10002 = null;
                  Thread.currentThread().hashCode();
                  if (!this.lIIilIil__iiill__ll_IlIlIl(var4)) {
                     var10000 = this.ii1Il1iIli_11__11I_IIi_Ii;
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     var10000 = "Неизвестная команда. Используйте " + var10000 + "help.";
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     l_lii1lilIIiI1l11iIi_I1lli.li_ii_iiIIi_i_iIlIlI__ii11(var10000);
                  }

                  return (boolean)((-1960771584 | 48050) ^ -1960723533);
               }
            }
         }
      }
   }

   private boolean lIIilIil__iiill__ll_IlIlIl(String param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10002 = null;
         Thread.currentThread().hashCode();
         String[] var7 = var1.split("\\s+");
         if (var7.length == 0) {
            return (boolean)(~-705253303 - -1644393044 ^ -1945320950);
         } else {
            String var10001 = var7[-1455717474 * -853619435 + -2093699574];
            var10002 = null;
            Thread.currentThread().hashCode();
            lil11iliIlliiiliii1I11 var4 = this.Ill_I_1l1_i1iIl1I_II_11l(var10001);
            if (var4 == null) {
               return (boolean)(~-821602815 - 1798857339 ^ -977254525);
            } else {
               try {
                  var10001 = var7[1970825708 * -1115492587 + -328991836];
                  int var10003 = ~-75810973 - -965945486 ^ 1041756459;
                  int var10004 = var7.length;
                  Object var10005 = null;
                  Thread.currentThread().hashCode();
                  var10002 = Arrays.copyOfRange(var7, var10003, var10004);
                  Object var15 = null;
                  Thread.currentThread().hashCode();
                  var4.execute(var10001, (String[])var10002);
               } catch (RuntimeException var6) {
                  var10001 = null;
                  Thread.currentThread().hashCode();
                  String var10000 = var6.getMessage();
                  var10001 = null;
                  Thread.currentThread().hashCode();
                  var10000 = "Команда завершилась ошибкой: " + var10000;
                  var10001 = null;
                  Thread.currentThread().hashCode();
                  l_lii1lilIIiI1l11iIi_I1lli.li_ii_iiIIi_i_iIlIlI__ii11(var10000);
                  return (boolean)((2119565312 | 6276) ^ 2119571589);
               }

               if (((-755630080 | 57480) ^ 505642971) != (~-332461129 - -791269167 ^ -1909498844)) {
               }

               return (boolean)((2119565312 | 6276) ^ 2119571589);
            }
         }
      }
   }

   private lil11iliIlliiiliii1I11 Ill_I_1l1_i1iIl1I_II_11l(String param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         List var10000 = this.lIlI__Ii1illi_II_iIl_l_1;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         Iterator var5 = var10000.iterator();

         lil11iliIlliiiliii1I11 var4;
         do {
            var10001 = null;
            Thread.currentThread().hashCode();
            if (!var5.hasNext()) {
               return null;
            }

            var10001 = null;
            Thread.currentThread().hashCode();
            var4 = (lil11iliIlliiiliii1I11)var5.next();
            Object var10002 = null;
            Thread.currentThread().hashCode();
         } while (!var4.matches(var1));

         return var4;
      }
   }
}
