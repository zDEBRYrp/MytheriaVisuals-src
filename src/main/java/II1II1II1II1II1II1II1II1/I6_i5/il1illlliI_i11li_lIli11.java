package II1II1II1II1II1II1II1II1.I6_i5;

import II1II1II1II1II1II1II1II1.I1_i0.I_IlI1I_i_1l_i__il1_iilIliII_i;
import II1II1II1II1II1II1II1II1.I8_i7.I11i11Ii1illli1iliI_1I_II_;
import II1II1II1II1II1II1II1II1.I9_i8.i_I_I_ii_I1l_1__illlIl1l__li;
import II1II1II1II1II1II1II1II1.l1_I0.i_Illl11Ii_l_11IIiiIIlIli;
import II1II1II1II1II1II1II1II1.l1_I0.llli1lii1I__l__1l_1llI1I11i;
import II1II1II1II1II1II1II1II1.l4_I3.I1I_IiI_iIIllilllIil1_;
import II1II1II1II1II1II1II1II1.l4_I3.IlIilI1Ili1_i1i1lIliliII1;
import II1II1II1II1II1II1II1II1.l4_I3.iIIlIIi1iI_1lilll1i11111l_Ii1;
import II1II1II1II1II1II1II1II1.l5_I4.IIil_llIl1l_Iili_I1III;
import II1II1II1II1II1II1II1II1.l5_I4.Il1_1_i1i_1__ll1_1_111i_11i1i;
import II1II1II1II1II1II1II1II1.l5_I4.liIi1IIl_il1IIlIll1Il_1II;
import II1II1II1II1II1II1II1II1.l8_I7.I_i1iii1l_i1Il1_l11_IIiI1ll____;
import II1II1II1II1II1II1II1II1.l9_I8.I__lllIliii1_1lIiIli_l1iiII_l1_;
import II1II1II1II1II1II1II1II1.l9_I8.i1ii11IIilIl1_1IlliiiI1iii;
import II1II1II1II1II1II1II1II1.l9_I8.liiil1liIil1l11iil11li1iI;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.minecraft.class_243;
import net.minecraft.class_332;
import org.joml.Matrix4f;
import org.joml.Vector4f;

@Environment(EnvType.CLIENT)
public class il1illlliI_i11li_lIli11 extends liiil1liIil1l11iil11li1iI {
   private static il1illlliI_i11li_lIli11 liiiIllllIl_iIIlIIlIl1iII;
   private final Il1_1_i1i_1__ll1_1_111i_11i1i ii_l1_lili1IiIli1llI_ll_iIl1i__;
   private final Il1_1_i1i_1__ll1_1_111i_11i1i illiillIlI1I111_Iil___il_1lii;
   private final IIil_llIl1l_Iili_I1III ilIl1Ill1l1II_li_1111__i1ll;
   private Matrix4f l11Ii1lll11IlIIiI_ll1__lI__1ll;
   private Matrix4f liI_1iii_11iI1Ill1lIIIII;
   private double I_1l1__Ii_I1_l1_1II__1l1iI_I;
   private double Il__i_Ill_i1li__I1l1lII_IiI_i;
   private double iI1ll1i_l_l11ll_I11liII;
   private final Map<String, Float> iI1_II1lil_li_IiI1_lli;
   public static final char[][] I_l1li_11_iI_iIlllI1_l1_li1li = new char[~1308027238 - 1462730112 ^ 1524210043][];

   public il1illlliI_i11li_lIli11() {
      String var10001 = l__III11__1I1i1IIli1II1_11i_(437458253 * 283809393 + 112622339);
      if (var10001 == null) {
         byte[] var1 = new byte[~-919595351 - 1294232011 ^ -374636666];
         var1[~150288244 - -50550848 ^ -99737397] = (byte)(1944044107 * 154722129 + 1217147192);
         var1[940369373 * 1069407665 + 92031284] = (byte)(~1496930530 - 1807962263 ^ 990074527);
         var1[344819431 * 1318259509 + -784194257] = (byte)(-2051779981 * 338523603 + -394626119);
         var1[~2138277888 - 1390834952 ^ 765854452] = (byte)(-383913679 * -229700065 + 1645223161);
         var1[-1844982199 * -1557109321 + 1599651029] = (byte)((1564016640 | 18015) ^ 1564034613);
         var1[(336658432 | 48853) ^ 336707280] = (byte)(-2031809226 * -501700045 + 478708252);
         var1[(2094727168 | 65055) ^ 2094792217] = (byte)((1324023808 | 36053) ^ -1324059897);
         var1[(576061440 | 51609) ^ 576113054] = (byte)((700514304 | 20708) ^ -700534989);
         var1[-249110666 * 381540749 + 470672906] = (byte)(~2007576819 - -1003607319 ^ 1003969435);
         var1[(-2078932992 | 2133) ^ -2078930852] = (byte)(~-494623557 - 764937740 ^ -270314193);
         var1[(687865856 | 1077) ^ 687866943] = (byte)((1235615744 | 9343) ^ -1235625001);
         var1[(-864747520 | 50035) ^ -864697480] = (byte)(-1354807892 * -95063989 + -539011356);
         var1[~1379434213 - 1016348706 ^ 1899184372] = (byte)(~986262170 - -108659242 ^ -877602891);
         var10001 = lIiI11i1__i11__lllIlI1ll(var1, ~-1552295212 - 527016146 ^ 1025279065);
      }

      String var10002 = l__III11__1I1i1IIli1II1_11i_(-1084397620 * 797290157 + -799526107);
      if (var10002 == null) {
         int[] var6 = new int[~1380002505 - 1196903919 ^ 1718060872];
         var6[(392101888 | 55613) ^ 392157501] = ~-2037988294 - -1566905049 ^ -1927156337;
         var6[(-1801322496 | 22778) ^ -1801299717] = ~-311258161 - -150757579 ^ 310962806;
         var6[285243647 * 490508249 + 339672795] = (-1250361344 | 41848) ^ 2011317444;
         var6[486858772 * 871761549 + -1747444481] = 596489224 * 306466801 + -318871636;
         var6[-1525732316 * -1515708037 + -1855641928] = (-1833959424 | 44411) ^ -1974674081;
         var6[(-1115357184 | 56171) ^ -1115301010] = ~-833444390 - 896808383 ^ -1467947942;
         var6[194764083 * -479083009 + -1576834247] = ~931894290 - 528411760 ^ -1614401691;
         var6[~-2002356 - 1789928948 ^ -1787926600] = (-389611520 | 27955) ^ -6799052;
         var6[1267747112 * -1349803737 + -1370836240] = -129013382 * 1341505799 + 226363213;
         var6[~-702370610 - -2144074267 ^ -1448522427] = 1815060814 * -433884489 + -2033252563;
         var6[~-1926774199 - -270464935 ^ -2097728169] = (204537856 | 34343) ^ -1204477129;
         var6[(-1513553920 | 42989) ^ -1513510938] = 190624953 * 1584263259 + -323293848;
         var6[(-386465792 | 11655) ^ -386454133] = ~546892325 - 791711122 ^ 1225510829;
         var6[~1014097983 - -1116628505 ^ 102530516] = -1787506095 * 2112857147 + -1535332018;
         var6[~-281268545 - 398773544 ^ -117505002] = (2013462528 | 7772) ^ 890204289;
         var10002 = lIiI11i1__i11__lllIlI1ll(var6, (-952107008 | 9858) ^ -952097090, ~-1116960573 - 1790074530 ^ -673113957);
      }

      super(var10001, var10002, i1ii11IIilIl1_1IlliiiI1iii.UTILS);
      Il1_1_i1i_1__ll1_1_111i_11i1i var2 = new Il1_1_i1i_1__ll1_1_111i_11i1i;
      String var10003 = l__III11__1I1i1IIli1II1_11i_(-2082631206 * 1880314369 + 1346148904);
      if (var10003 == null) {
         byte[] var7 = new byte[-2115062212 * -1203326079 + -1461569574];
         var7[~802746629 - 254187183 ^ -1056933813] = (byte)(~1276204051 - 227367089 ^ 1503571095);
         var7[~77348330 - -1440559408 ^ 1363211076] = (byte)((-1849360384 | 53143) ^ -1849307183);
         var7[(-810942464 | 58380) ^ -810884082] = (byte)(-1887336021 * -1632850217 + 1707026156);
         var7[(2025193472 | 36382) ^ 2025229853] = (byte)((-2142830592 | 18074) ^ -2142812530);
         var7[(-2038235136 | 17799) ^ -2038217341] = (byte)(~-941760268 - 1011685334 ^ 69925003);
         var7[-1767706585 * -179702211 + -1169666886] = (byte)(-676683195 * -1901599215 + 1054751586);
         var7[(-1395523584 | 56777) ^ -1395466801] = (byte)((263913472 | 27054) ^ 263940520);
         var7[~749780881 - -338343660 ^ -411437219] = (byte)((-1474297856 | 24681) ^ 1474273170);
         var7[(1637941248 | 11602) ^ 1637952858] = (byte)(~1118784155 - 1218989073 ^ -1957193995);
         var7[~437824479 - 39724740 ^ -477549227] = (byte)(~58407507 - -1020092283 ^ -961684770);
         var7[~168803160 - 411193077 ^ -579996232] = (byte)(~415477188 - 1346064534 ^ -1761541686);
         var7[1981071120 * 1822979027 + 949114331] = (byte)(1049079520 * -1878943527 + -1069038636);
         var7[1145314737 * -2085226999 + -1813127469] = (byte)((1740767232 | 47376) ^ 1740814645);
         var7[-771006141 * -2092745489 + 2131459712] = (byte)((1700134912 | 53354) ^ 1700188227);
         var7[(-283181056 | 43109) ^ -283137941] = (byte)(-1678753227 * -1196797643 + -1558346221);
         var7[(1872560128 | 10277) ^ 1872570410] = (byte)(-1834477571 * 403429745 + 127464610);
         var7[(-1360265216 | 32595) ^ -1360232637] = (byte)(~158401628 - 1188527910 ^ 1346929661);
         var7[~1044935136 - -45582189 ^ -999352931] = (byte)((-149749760 | 41555) ^ 149708242);
         var7[1101013096 * 757960419 + 46240730] = (byte)(-384107990 * 1096881953 + 320993954);
         var7[(56492032 | 52530) ^ 56544545] = (byte)((-1325268992 | 43249) ^ 1325225780);
         var7[2136082997 * 1654673519 + 2099053337] = (byte)(~-455447552 - 1511661245 ^ 1056213707);
         var7[-1853604006 * -1261804491 + -237258125] = (byte)(-119386143 * -10607989 + 1524940428);
         var10003 = lIiI11i1__i11__lllIlI1ll(var7, (-1201864704 | 39990) ^ -1201824716);
      }

      var2./* $VF: Unable to resugar constructor */<init>(var10003, (boolean)(~-840638306 - 1243280790 ^ -402642486));
      this.ii_l1_lili1IiIli1llI_ll_iIl1i__ = var2;
      Il1_1_i1i_1__ll1_1_111i_11i1i var3 = new Il1_1_i1i_1__ll1_1_111i_11i1i;
      var10003 = l__III11__1I1i1IIli1II1_11i_(894916666 * 1386798733 + 1716657169);
      if (var10003 == null) {
         byte[] var9 = new byte[(-708640768 | 54219) ^ -708586533];
         var9[704924624 * 1394946459 + 1473464592] = (byte)(-571298995 * -445872941 + -886236376);
         var9[-1662716151 * -887588221 + 1296256102] = (byte)(~1957905135 - 1967229928 ^ -369832195);
         var9[(-659947520 | 56755) ^ -659890767] = (byte)(-867225583 * 2044959943 + 1158956730);
         var9[(-2118123520 | 44220) ^ -2118079297] = (byte)(171359921 * 1653729231 + -1821829190);
         var9[93943918 * -1295343097 + 936122626] = (byte)(-842653360 * 1048923197 + 2002145340);
         var9[~2144913258 - -9528875 ^ -2135384379] = (byte)((-111017984 | 20266) ^ 110997686);
         var9[-2102988509 * -2135898963 + -1669316769] = (byte)(-756387024 * 846324701 + -817430535);
         var9[-1801995978 * 529919093 + -511929767] = (byte)(-1792254306 * -1116988039 + -425238248);
         var9[~1436272614 - -271964398 ^ -1164308209] = (byte)(-1964277009 * 1320340949 + -167465871);
         var9[(-993984512 | 36800) ^ -993947703] = (byte)((1505296384 | 3520) ^ -1505299845);
         var9[(1425014784 | 38930) ^ 1425053720] = (byte)(~-44837694 - -204860793 ^ 249698463);
         var9[~447615821 - 970249404 ^ -1417865219] = (byte)((1098842112 | 29118) ^ 1098871207);
         var9[-1886377298 * -107875617 + 1048860282] = (byte)((-545849344 | 49060) ^ -545800203);
         var9[~-1328295798 - 1507433060 ^ -179137252] = (byte)(511722096 * 214847833 + 440629098);
         var9[1808096073 * -1816391453 + 632258131] = (byte)(~264125955 - -1344748879 ^ 1080622928);
         var9[~1250822709 - -735108100 ^ -515714623] = (byte)(-1388177445 * -1882641373 + -471197308);
         var10003 = lIiI11i1__i11__lllIlI1ll(var9, ~-1095912086 - -620377138 ^ 1716289220);
      }

      var3./* $VF: Unable to resugar constructor */<init>(var10003, (boolean)(~876679512 - 1576084132 ^ 1842203650));
      this.illiillIlI1I111_Iil___il_1lii = var3;
      IIil_llIl1l_Iili_I1III var4 = new IIil_llIl1l_Iili_I1III;
      var10003 = l__III11__1I1i1IIli1II1_11i_(-1183816544 * 1729803767 + 86624676);
      if (var10003 == null) {
         byte[] var11 = new byte[-1258103964 * 932331721 + -1897873780];
         var11[~-1320328507 - -705397016 ^ 2025725522] = (byte)(-1448089161 * 723433083 + 1205902034);
         var11[183013754 * -1494417429 + 455208707] = (byte)((-582483968 | 7821) ^ 582476090);
         var11[-658115592 * -1117415211 + -1046953302] = (byte)(1532852449 * 1974690953 + 1030712121);
         var11[(1785069568 | 49681) ^ 1785119250] = (byte)(1893352001 * 975750671 + 2144327707);
         var11[947297997 * 384574729 + -605763121] = (byte)(~-637546997 - 1587405495 ^ -949858537);
         var11[-161978036 * 1216339961 + -1013685991] = (byte)((536346624 | 41217) ^ 536387879);
         var11[(-1764229120 | 35771) ^ -1764193347] = (byte)((503250944 | 36551) ^ -503287431);
         var11[~610031223 - -666547518 ^ 56516289] = (byte)((-2053242880 | 16524) ^ -2053226355);
         var11[-1769708744 * -1352762911 + 1815040976] = (byte)((218300416 | 15901) ^ 218316410);
         var11[-1864567186 * 1552586071 + -902939993] = (byte)((1333657600 | 54215) ^ -1333711777);
         var11[(-2100494336 | 28580) ^ -2100465746] = (byte)((-1008926720 | 53751) ^ -1008873022);
         var11[1009035103 * -1024258997 + -868383946] = (byte)((-209059840 | 35042) ^ -209024826);
         var11[-763300707 * 1850274465 + 1937882959] = (byte)(~-1211052705 - -260220997 ^ 1471273641);
         var11[1867989248 * 1320945065 + 253826829] = (byte)(1220938405 * -839199997 + 1690689806);
         var11[-71244195 * 2121892421 + -2012107011] = (byte)(-1027216768 * 1132845517 + -281233421);
         var11[(-1509490688 | 45063) ^ -1509445624] = (byte)(536212770 * -1662412169 + 1531091236);
         var10003 = lIiI11i1__i11__lllIlI1ll(var11, -814579798 * -667169509 + -1836882154);
      }

      String var10004 = l__III11__1I1i1IIli1II1_11i_((1359151104 | 10400) ^ 1359161509);
      if (var10004 == null) {
         byte[] var12 = new byte[-1895223915 * 453535229 + -515233081];
         var12[~-1533657268 - -2130660683 ^ -630649346] = (byte)((1977810944 | 23467) ^ -1977834467);
         var12[(718798848 | 5693) ^ 718804540] = (byte)(~-1301347704 - 225275731 ^ -1076071999);
         var12[1189623057 * -568627177 + -1289696389] = (byte)(~636723162 - 511675495 ^ 1148398713);
         var12[(-1880162304 | 25712) ^ -1880136589] = (byte)(~-1348728600 - 803351843 ^ 545376666);
         var12[~-575865428 - 1705794579 ^ -1129929148] = (byte)((476971008 | 21840) ^ 476992815);
         var12[(-1485111296 | 26087) ^ -1485085214] = (byte)((-1044578304 | 1236) ^ 1044577076);
         var12[(-1435500544 | 18048) ^ -1435482490] = (byte)(~1169509908 - -1973888608 ^ -804378662);
         var12[~212672953 - -1186575821 ^ 973902868] = (byte)((1804402688 | 2977) ^ 1804405751);
         var10004 = lIiI11i1__i11__lllIlI1ll(var12, ~1521109753 - 1933559144 ^ 840298395);
      }

      String[] var10005 = new String[1968741418 * -1055996887 + 687002957];
      int var10007 = (1189085184 | 61215) ^ 1189146399;
      String var10008 = l__III11__1I1i1IIli1II1_11i_(~30629797 - -2125137060 ^ 2094507256);
      if (var10008 == null) {
         byte[] var19 = new byte[923315976 * -2004209825 + 1632932879];
         var19[~1906712088 - -1720050084 ^ -186662005] = (byte)(~-2034366994 - 442281423 ^ -1592085605);
         var19[~-1236215374 - -1515611610 ^ -1543140314] = (byte)((-680067072 | 15059) ^ 680051970);
         var19[(184221696 | 116) ^ 184221814] = (byte)(~-356813533 - -1698032993 ^ -2054846527);
         var19[(-458227712 | 49294) ^ -458178419] = (byte)(492160875 * 897765387 + -1611432310);
         var19[-1234314854 * 2086761649 + 202949770] = (byte)(~411918809 - -2096178883 ^ 1684260066);
         var19[~141612005 - -1271645299 ^ 1130033288] = (byte)(-649643591 * -2105106583 + 2082040924);
         var19[(143654912 | 46293) ^ 143701203] = (byte)(~1926381418 - 306135475 ^ -2062450353);
         var10008 = lIiI11i1__i11__lllIlI1ll(var19, -577126356 * -1352452349 + -102413438);
      }

      var10005[var10007] = var10008;
      var10007 = ~-1064764911 - -82746383 ^ 1147511292;
      var10008 = l__III11__1I1i1IIli1II1_11i_((-1379860480 | 9900) ^ -1379850581);
      if (var10008 == null) {
         byte[] var21 = new byte[~1728946001 - 1861497185 ^ 704524106];
         var21[(57344000 | 28845) ^ 57372845] = (byte)(-406584091 * 1127010183 + -2125447192);
         var21[(-1010302976 | 42313) ^ -1010260664] = (byte)(-917945858 * 361145387 + -512282134);
         var21[(1196163072 | 3573) ^ 1196166647] = (byte)(~1835019638 - 2021742268 ^ 438205323);
         var21[(500760576 | 52583) ^ 500813156] = (byte)(~1306783125 - -1137183567 ^ -169599560);
         var21[~1820578196 - -2009703915 ^ 189125714] = (byte)(~838132401 - -1427273936 ^ -589141540);
         var21[(1608843264 | 53700) ^ 1608896961] = (byte)(543380155 * -1271233227 + 1997977627);
         var21[-1053772896 * 1337248705 + 257471590] = (byte)(~-1659326414 - -469084127 ^ -2128410607);
         var10008 = lIiI11i1__i11__lllIlI1ll(var21, (-2126053376 | 14098) ^ -2126039275);
      }

      var10005[var10007] = var10008;
      var10007 = (639959040 | 19407) ^ 639978445;
      var10008 = l__III11__1I1i1IIli1II1_11i_(~726626899 - 2060132637 ^ 1508207751);
      if (var10008 == null) {
         byte[] var23 = new byte[~197979752 - 178047821 ^ -376027582];
         var23[(-1197146112 | 17146) ^ -1197128966] = (byte)((100204544 | 29791) ^ -100234340);
         var23[(1337982976 | 57794) ^ 1338040771] = (byte)(-1807728325 * -1143576107 + -1418295582);
         var23[1818570576 * 346770801 + -575992398] = (byte)(~1529040942 - -256674322 ^ -1272366688);
         var23[~10086180 - -249094435 ^ 239008253] = (byte)(-536196904 * -1487534069 + -1397219583);
         var23[~-1831187738 - -675021050 ^ -1788758505] = (byte)((1016332288 | 51521) ^ -1016383825);
         var23[998346525 * -1221845023 + -1362054008] = (byte)(~-1010348010 - 321737674 ^ -688610356);
         var23[-1728980426 * -779638855 + -1956244224] = (byte)((-1723531264 | 4361) ^ 1723526843);
         var23[-162460396 * -1177887767 + -1270678317] = (byte)((181993472 | 28782) ^ 182022224);
         var10008 = lIiI11i1__i11__lllIlI1ll(var23, (429457408 | 11007) ^ 429468407);
      }

      var10005[var10007] = var10008;
      var10007 = 1446208225 * -1828205301 + 1047892824;
      var10008 = l__III11__1I1i1IIli1II1_11i_((-2039939072 | 10855) ^ -2039928210);
      if (var10008 == null) {
         byte[] var25 = new byte[-270813965 * 1025822055 + 898079555];
         var25[~-334594288 - -2106556418 ^ -1853816591] = (byte)((774963200 | 43527) ^ -775006784);
         var25[~-1807278451 - 925078333 ^ 882200116] = (byte)((-414449664 | 65128) ^ 414384603);
         var25[-878161942 * -1647538311 + -2007595928] = (byte)(-243498266 * 1106394361 + -875903474);
         var25[135462015 * 307104437 + -1341881288] = (byte)(~672614012 - 1997297947 ^ 1625055252);
         var25[(802816000 | 24803) ^ 802840807] = (byte)((757202944 | 47056) ^ 757249940);
         var25[~230661182 - -309630061 ^ 78968875] = (byte)(~192780490 - -1348128432 ^ -1155347865);
         var25[-635966660 * 409666997 + 1667924634] = (byte)(~-739968328 - -1739572656 ^ 1815426331);
         var25[(1459093504 | 35511) ^ 1459129008] = (byte)((1683226624 | 26448) ^ -1683253086);
         var10008 = lIiI11i1__i11__lllIlI1ll(var25, (-1659371520 | 13924) ^ -1659357587);
      }

      var10005[var10007] = var10008;
      var10007 = 282022772 * -1270317657 + -1000281256;
      var10008 = l__III11__1I1i1IIli1II1_11i_((1768292352 | 26477) ^ 1768318823);
      if (var10008 == null) {
         byte[] var27 = new byte[-599006251 * -403992975 + 1385777411];
         var27[-1340186304 * -755605087 + -963930432] = (byte)((-159776768 | 13268) ^ -159763520);
         var27[~1789493143 - -2130298257 ^ 340805112] = (byte)((1282998272 | 14144) ^ -1283012464);
         var27[~1701838352 - 1320292795 ^ 1272836150] = (byte)(-1508078609 * 1261114977 + 352547026);
         var27[(-1853423616 | 32136) ^ -1853391477] = (byte)(~-1557286961 - -2018260946 ^ 719419360);
         var27[179983612 * 1392945909 + 1297437400] = (byte)(1956929205 * -1272649903 + 823440886);
         var27[1753774071 * 1518233361 + 1159309214] = (byte)(~-842878885 - 1496993764 ^ 654114843);
         var27[-741360341 * 279229407 + 1564026513] = (byte)((-2143158272 | 59933) ^ -2143098292);
         var27[~-2020879852 - -2089667674 ^ -184419774] = (byte)(~-1424899944 - -187159986 ^ -1612059945);
         var10008 = lIiI11i1__i11__lllIlI1ll(var27, ~-1802455976 - -1527864882 ^ -964646445);
      }

      var10005[var10007] = var10008;
      var10007 = -1905711341 * 336291755 + 1731805524;
      var10008 = l__III11__1I1i1IIli1II1_11i_((316080128 | 48054) ^ 316128189);
      if (var10008 == null) {
         byte[] var29 = new byte[(-1814233088 | 60839) ^ -1814172241];
         var29[~3371356 - 1056085938 ^ -1059457295] = (byte)((1002110976 | 15414) ^ 1002126439);
         var29[(1136590848 | 9126) ^ 1136599975] = (byte)(-665380096 * -628869857 + -656622931);
         var29[(-128516096 | 17752) ^ -128498342] = (byte)((-211353600 | 58564) ^ -211295104);
         var29[(-1851981824 | 10172) ^ -1851971649] = (byte)(1291817420 * 1085576535 + -1848002695);
         var29[-26435072 * -709761473 + -944233980] = (byte)((998047744 | 15897) ^ -998063705);
         var29[(1995505664 | 42115) ^ 1995547782] = (byte)(161174280 * 885147589 + -77471016);
         var29[(-544210944 | 23176) ^ -544187762] = (byte)((-1709965312 | 50682) ^ -1709914653);
         var29[-1512851971 * -282988755 + -1975201906] = (byte)(778657261 * 1298886899 + 1305815145);
         var10008 = lIiI11i1__i11__lllIlI1ll(var29, (-2077753344 | 2575) ^ -2077750780);
      }

      var10005[var10007] = var10008;
      var10007 = (1734148096 | 15109) ^ 1734163203;
      var10008 = l__III11__1I1i1IIli1II1_11i_(-355589513 * 490365339 + 1881934591);
      if (var10008 == null) {
         byte[] var31 = new byte[-340459122 * -605520569 + 1549417382];
         var31[(1723269120 | 41320) ^ 1723310440] = (byte)((1229062144 | 63665) ^ -1229125778);
         var31[1517327354 * 1877353387 + -638191101] = (byte)(~126441761 - 1321528639 ^ -1447970402);
         var31[~-1261588908 - -707941524 ^ 1969530429] = (byte)(~-1210840586 - -975778867 ^ 2108347878);
         var31[-1914447370 * -2138763817 + 113538153] = (byte)(1419898227 * -1466970105 + 57151841);
         var31[(1983709184 | 59100) ^ 1983768280] = (byte)((-1427767296 | 6802) ^ 1427760444);
         var31[~-698083206 - 2119368513 ^ -1421285311] = (byte)(-1947488023 * 1567625517 + -1243451834);
         var31[~2108781078 - 1638342619 ^ 547843592] = (byte)(2060728830 * 267537693 + -1939339115);
         var31[~218069211 - -1007342218 ^ 789273001] = (byte)(1225142023 * 1600355833 + 726718294);
         var10008 = lIiI11i1__i11__lllIlI1ll(var31, (1576140800 | 60788) ^ 1576201592);
      }

      var10005[var10007] = var10008;
      var4./* $VF: Unable to resugar constructor */<init>(var10003, var10004, var10005);
      this.ilIl1Ill1l1II_li_1111__i1ll = var4;
      this.iI1_II1lil_li_IiI1_lli = new HashMap<>();
      liIi1IIl_il1IIlIll1Il_1II[] var5 = new liIi1IIl_il1IIlIll1Il_1II[~-2005784350 - 374051105 ^ 1631733247];
      var5[1068775924 * -1593816187 + -1503434692] = this.ii_l1_lili1IiIli1llI_ll_iIl1i__;
      var5[~-1676183768 - 1409619558 ^ 266564208] = this.illiillIlI1I111_Iil___il_1lii;
      var5[~1370524096 - 1232608981 ^ 1691834216] = this.ilIl1Ill1l1II_li_1111__i1ll;
      this.addSettings(var5);
      liiiIllllIl_iIIlIIlIl1iII = this;
   }

   public static il1illlliI_i11li_lIli11 Ii1_li_1II_1__1_II1_I__II_llll() {
      return liiiIllllIl_iIIlIIlIl1iII;
   }

   @Override
   public void onDisable() {
      this.iI1_II1lil_li_IiI1_lli.clear();
   }

   public void capture(WorldRenderContext param1) {
      if (var1.camera() != null) {
         this.l11Ii1lll11IlIIiI_ll1__lI__1ll = new Matrix4f(var1.positionMatrix());
         this.liI_1iii_11iI1Ill1lIIIII = new Matrix4f(var1.projectionMatrix());
         class_243 var2 = var1.camera().method_19326();
         this.I_1l1__Ii_I1_l1_1II__1l1iI_I = var2.field_1352;
         this.Il__i_Ill_i1li__I1l1lII_IiI_i = var2.field_1351;
         this.iI1ll1i_l_l11ll_I11liII = var2.field_1350;
      }
   }

   public void render(class_332 param1, float nullx, float nullxx) {
      i_Illl11Ii_l_11IIiiIIlIli.l__IiIliil_iI_i_1_I1i__II_Iil1();
      if (I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.field_1724 != null && this.l11Ii1lll11IlIIiI_ll1__lI__1ll != null && this.liI_1iii_11iI1Ill1lIIIII != null) {
         float var4 = I__lllIliii1_1lIiIli_l1iiII_l1_.frameDelta();
         float var5 = I__lllIliii1_1lIiIli_l1iiII_l1_.scale(this.ilIl1Ill1l1II_li_1111__i1ll);
         ArrayList var6 = new ArrayList();

         for (llli1lii1I__l__1l_1llI1I11i var8 : i_Illl11Ii_l_11IIiiIIlIli.li111IlIl_I_liI1il111II___ii()) {
            float var9 = this.ilIIlli_1l__1ll_1I1ilIliI_1(var8.getName(), var4);
            il1illlliI_i11li_lIli11.Illi1ii_iil_I1iliiiIli1II_11lIl var10 = this.illi1il_l_li1Il1____1__1l(var8, var9, var5, nullx, nullxx);
            if (var10 != null) {
               var6.add(var10);
            }
         }

         this.iI1_II1lil_li_IiI1_lli
            .keySet()
            .removeIf(
               nullxxx -> (boolean)(this.iI1_II1lil_li_IiI1_lli.get(nullxxx) <= Float.intBitsToFloat((-1597571072 | 4914) ^ -1706819235)
                        && !this.lI__li_l1_l_Illl_i111I1Ii1_i1(nullxxx)
                     ? -1872570200 * 1683125845 + 2038472761
                     : ~398408434 - -273391020 ^ -125017415)
            );
         if (!var6.isEmpty()) {
            var6.sort(Comparator.comparingDouble(il1illlliI_i11li_lIli11.Illi1ii_iil_I1iliiiIli1II_11lIl::distance).reversed());
            Matrix4f var11 = var1.method_51448().method_23760().method_23761();

            for (il1illlliI_i11li_lIli11.Illi1ii_iil_I1iliiiIli1II_11lIl var13 : var6) {
               this.llIlli_iIl11i_illIi1l1li1l_i(var11, var13);
            }
         }
      }
   }

   private boolean lI__li_l1_l_Illl_i111I1Ii1_i1(String param1) {
      for (llli1lii1I__l__1l_1llI1I11i var3 : i_Illl11Ii_l_11IIiiIIlIli.li111IlIl_I_liI1il111II___ii()) {
         if (var3.getName().equals(var1)) {
            return (boolean)((813694976 | 10787) ^ 813705762);
         }
      }

      return (boolean)(~2013698074 - -1108979172 ^ -904718903);
   }

   private float ilIIlli_1l__1ll_1I1ilIliI_1(String param1, float nullx) {
      float var3 = nullx / Float.intBitsToFloat(1226051689 * 16739735 + 1156750609);
      float var4 = Math.min(1.0F, this.iI1_II1lil_li_IiI1_lli.getOrDefault(var1, 0.0F) + var3);
      this.iI1_II1lil_li_IiI1_lli.put(var1, var4);
      return var4;
   }

   private il1illlliI_i11li_lIli11.Illi1ii_iil_I1iliiiIli1II_11lIl illi1il_l_li1Il1____1__1l(
      llli1lii1I__l__1l_1llI1I11i param1, float nullx, float nullxx, float nullxxx, float nullxxxx
   ) {
      double var6 = var1.getX() + Double.longBitsToDouble(~2231475302520170980L - -5079165083721675711L ^ 1757818671377844698L);
      double var8 = var1.getY() + Double.longBitsToDouble(~-7670241143696909473L - -1856994879419054996L ^ -4916600810528124153L);
      double var10 = var1.getZ() + Double.longBitsToDouble(~-3520949325917002571L - -1672881970513794471L ^ 8643588610996596977L);
      float[] var12 = this.il__1iil_li__i11lI___iiI11lIi(var6, var8, var10, nullxxx, nullxxxx);
      if (var12 == null) {
         return null;
      } else {
         double var13 = Math.sqrt(
            (var6 - this.I_1l1__Ii_I1_l1_1II__1l1iI_I) * (var6 - this.I_1l1__Ii_I1_l1_1II__1l1iI_I)
               + (var8 - this.Il__i_Ill_i1li__I1l1lII_IiI_i) * (var8 - this.Il__i_Ill_i1li__I1l1lII_IiI_i)
               + (var10 - this.iI1ll1i_l_l11ll_I11liII) * (var10 - this.iI1ll1i_l_l11ll_I11liII)
         );
         float var15 = I__lllIliii1_1lIiIli_l1iiII_l1_.clamp(
            (float)Math.sqrt(
               Double.longBitsToDouble(~-5495666590768258811L - -8023361806705625138L ^ -312651958087751892L)
                  / Math.max(var13, Double.longBitsToDouble(~3048200073240568306L - 5906237806872528634L ^ -4833751645953245457L))
            ),
            1.0F,
            Float.intBitsToFloat(1311285372 * -382574383 + 3046084)
         );
         float var16 = I__lllIliii1_1lIiIli_l1iiII_l1_.easeOutCubic(nullx);
         float var17 = nullxx
            * var15
            * (Float.intBitsToFloat((1182597120 | 9342) ^ 2032451044) + Float.intBitsToFloat(~-775139925 - 1093933076 ^ -756677670) * var16);
         if (var17 <= Float.intBitsToFloat(~469025043 - 1745856274 ^ 1098417589)) {
            return null;
         } else {
            i_I_I_ii_I1l_1__illlIl1l__li var18 = I11i11Ii1illli1iliI_1I_II_.li1iIll_I1_IIi_IiiI_I1II1I1_I();
            String var19 = var1.getName();
            String var10000;
            if (this.ii_l1_lili1IiIli1llI_ll_iIl1i__.isValue()) {
               var10000 = (int)var13 + "m";
            } else {
               var10000 = l__III11__1I1i1IIli1II1_11i_(~1193213803 - -1954852679 ^ 761638870);
               if (var10000 == null) {
                  byte[] var30 = new byte[(-256901120 | 17345) ^ -256883771];
                  var30[(432668672 | 46932) ^ 432715604] = (byte)((1351221248 | 43197) ^ -1351264399);
                  var30[1021980089 * -654644795 + 1032023972] = (byte)((1206779904 | 30835) ^ -1206810721);
                  var30[~-455842832 - 1746278802 ^ -1290435969] = (byte)((-1164771328 | 53587) ^ -1164717742);
                  var30[(-1638006784 | 50722) ^ -1637956063] = (byte)((1020264448 | 60172) ^ -1020324637);
                  var10000 = lIiI11i1__i11__lllIlI1ll(var30, 1530658844 * -1649802525 + 1664331577);
               }
            }

            String var20 = var10000;
            if (this.illiillIlI1I111_Iil___il_1lii.isValue() && var1.hasTimer()) {
               var10000 = this.i1_lllllIIiii_llill_Ii_I_IIi(var1.getRemainingSeconds());
            } else {
               var10000 = l__III11__1I1i1IIli1II1_11i_(~-1921143161 - 1958148796 ^ -37005646);
               if (var10000 == null) {
                  byte[] var32 = new byte[~-1148999757 - 214181310 ^ 934818442];
                  var32[(-247332864 | 9522) ^ -247323342] = (byte)(-1265330550 * 1122246317 + -418768747);
                  var32[~-1739693744 - -783763186 ^ -1771510368] = (byte)(~1687270762 - -139401527 ^ 1547869192);
                  var32[~1067767422 - -82893916 ^ -984873505] = (byte)(~860062022 - 1434987278 ^ -1999917971);
                  var32[~-1680285447 - -241546028 ^ 1921831473] = (byte)(~-958939521 - -75504820 ^ -1034444296);
                  var10000 = lIiI11i1__i11__lllIlI1ll(var32, -46820953 * -251173815 + -1404880017);
               }
            }

            String var21 = var10000;
            float var22 = Float.intBitsToFloat(-1409674783 * -637389829 + 333358437)
               + var18.getWidth(var19, Float.intBitsToFloat(~-1976852284 - 148332133 ^ 742195414));
            var22 += this.l_1_IIIlIiIiII_1_i1__Ii_I_ill_(var18, var20);
            var22 += this.l_1_IIIlIiIiII_1_i1__Ii_I_ill_(var18, var21);
            float var23 = var22 * var17;
            float var24 = Float.intBitsToFloat(~-1386932436 - 156581184 ^ 148220819) * var17;
            float var25 = var12[~556183533 - -171693719 ^ -384489815] - var23 * Float.intBitsToFloat(2072641513 * 2089179985 + 1248343111);
            float var26 = var12[(-890372096 | 43844) ^ -890328251] - var24 * Float.intBitsToFloat((-1157169152 | 7809) ^ -2079908223);
            float var27 = Math.max(Float.intBitsToFloat((768278528 | 21203) ^ 1867207379), var23);
            return !(var25 > nullxxx + var27) && !(var25 + var23 < -var27) && !(var26 > nullxxxx + var27) && !(var26 + var24 < -var27)
               ? new il1illlliI_i11li_lIli11.Illi1ii_iil_I1iliiiIli1II_11lIl(var25, var26, var23, var24, var17, var16, var13, var19, var20, var21)
               : null;
         }
      }
   }

   private float l_1_IIIlIiIiII_1_i1__Ii_I_ill_(i_I_I_ii_I1l_1__illlIl1l__li param1, String nullx) {
      return nullx.isEmpty()
         ? 0.0F
         : Float.intBitsToFloat(1027189279 * -2059848241 + -745536017) + var1.getWidth(nullx, Float.intBitsToFloat(~991053169 - 471694892 ^ -401589150));
   }

   private void llIlli_iIl11i_illIi1l1li1l_i(Matrix4f param1, il1illlliI_i11li_lIli11.Illi1ii_iil_I1iliiiIli1II_11lIl nullx) {
      float var3 = nullx.scale();
      float var4 = nullx.alpha();
      I_IlI1I_i_1l_i__il1_iilIliII_i.Il_11_I1lIlIllI_1lii1IIl1l1iiI()
         .size(new IlIilI1Ili1_i1i1lIliliII1(nullx.width(), nullx.height()))
         .radius(new iIIlIIi1iI_1lilll1i11111l_Ii1(Float.intBitsToFloat(682662596 * 1696258943 + -254440252) * var3))
         .blurRadius(Float.intBitsToFloat((-1607008256 | 5332) ^ -512289580))
         .smoothness(1.0F)
         .color(
            new I1I_IiI_iIIllilllIil1_(
               I__lllIliii1_1lIiIli_l1iiII_l1_.fade(
                  new Color(
                     (-1777074176 | 38459) ^ -1777035717,
                     ~-1479737702 - 1000804192 ^ 478933509,
                     ~1147872404 - 42422419 ^ -1190294824,
                     -265945469 * 2040085529 + -1655148107
                  ),
                  var4
               )
            )
         )
         .build()
         .render(var1, nullx.x(), nullx.y());
      i_I_I_ii_I1l_1__illlIl1l__li var5 = I11i11Ii1illli1iliI_1I_II_.li1iIll_I1_IIi_IiiI_I1II1I1_I();
      float var6 = nullx.y() + nullx.height() * Float.intBitsToFloat(~-765548509 - 1771514436 ^ -83219048);
      float var7 = nullx.x() + Float.intBitsToFloat(~1867713456 - 891111105 ^ 460303758) * var3;
      var7 = this.l___ll1_l1i1iI1_ili_l1ii1il(
         var1,
         var5,
         nullx.name(),
         var7,
         var6,
         var3,
         new Color(
            -394765812 * 1038342871 + -1852167957, 1119285587 * 2019180163 + -826119802, (719060992 | 57838) ^ 719118609, (-1462304768 | 46825) ^ -1462258174
         ),
         var4
      );
      var7 = this.li1il1I_iIi1ll1I1i1_I1i1l_III1(var1, var5, nullx.detail(), var7, var6, var3, var4);
      var7 = this.l___ll1_l1i1iI1_ili_l1ii1il(
         var1,
         var5,
         nullx.detail(),
         var7,
         var6,
         var3,
         new Color(
            -1358889444 * 2127749757 + 1899443539, (247398400 | 19758) ^ 247418321, -1251650321 * 2033946307 + 345947378, ~488527340 - 1997179403 ^ 1809260680
         ),
         var4
      );
      var7 = this.li1il1I_iIi1ll1I1i1_I1i1l_III1(var1, var5, nullx.timer(), var7, var6, var3, var4);
      this.l___ll1_l1i1iI1_ili_l1ii1il(
         var1,
         var5,
         nullx.timer(),
         var7,
         var6,
         var3,
         new Color(
            (-510853120 | 61701) ^ -510791174, (-679084032 | 6408) ^ -679077385, ~-740919732 - -274503512 ^ 1015423476, (1722023936 | 46643) ^ 1722070707
         ),
         var4
      );
   }

   private float l___ll1_l1i1iI1_ili_l1ii1il(
      Matrix4f param1, i_I_I_ii_I1l_1__illlIl1l__li nullx, String nullxx, float nullxxx, float nullxxxx, float nullxxxxx, Color nullxxxxxx, float nullxxxxxxx
   ) {
      if (nullxx.isEmpty()) {
         return nullxxx;
      } else {
         float var9 = Float.intBitsToFloat(~-1116749641 - -135881183 ^ 174694695) * nullxxxxx;
         float var10 = nullx.getGlyphTop(nullxx, var9);
         float var11 = nullx.getGlyphBottom(nullxx, var9);
         I_IlI1I_i_1l_i__il1_iilIliII_i.lI1IlIi_i1liII11i1i1li11i11__l()
            .font(nullx)
            .text(nullxx)
            .size(var9)
            .thickness(0.0F)
            .smoothness(1.0F)
            .color(I__lllIliii1_1lIiIli_l1iiII_l1_.fade(nullxxxxxx, nullxxxxxxx))
            .build()
            .render(var1, nullxxx, nullxxxx - (var10 + var11) * Float.intBitsToFloat(1249153750 * -485483095 + -200748358));
         return nullxxx + nullx.getWidth(nullxx, var9);
      }
   }

   private float li1il1I_iIi1ll1I1i1_I1i1l_III1(
      Matrix4f param1, i_I_I_ii_I1l_1__illlIl1l__li nullx, String nullxx, float nullxxx, float nullxxxx, float nullxxxxx, float nullxxxxxx
   ) {
      if (nullxx.isEmpty()) {
         return nullxxx;
      } else {
         float var8 = 1.0F * nullxxxxx;
         float var9 = Float.intBitsToFloat(1649242966 * 696661769 + 59471866) * nullxxxxx;
         float var10 = nullxxx + Float.intBitsToFloat(~-2119135853 - -1598938498 ^ -1654829074) * nullxxxxx;
         I_IlI1I_i_1l_i__il1_iilIliII_i.l_lI_i1_Ii1I_1iI1IlIil1l()
            .size(new IlIilI1Ili1_i1i1lIliliII1(var8, var9))
            .radius(new iIIlIIi1iI_1lilll1i11111l_Ii1(var8 * Float.intBitsToFloat(638215041 * -1598734265 + 520693561)))
            .smoothness(1.0F)
            .color(
               new I1I_IiI_iIIllilllIil1_(
                  I__lllIliii1_1lIiIli_l1iiII_l1_.fade(
                     new Color(
                        -1609915284 * 668102953 + 1461714867,
                        ~-1654255093 - -1922723758 ^ -717988515,
                        1487000700 * -1959936389 + -1598103189,
                        ~-1739216303 - -1826801610 ^ -728949402
                     ),
                     nullxxxxxx
                  )
               )
            )
            .build()
            .render(var1, var10, nullxxxx - var9 * Float.intBitsToFloat((89128960 | 29469) ^ 978350877));
         return var10 + var8 + Float.intBitsToFloat((1090060288 | 55577) ^ 3791129) * nullxxxxx;
      }
   }

   private float[] il__1iil_li__i11lI___iiI11lIi(double param1, double nullx, double nullxx, float nullxxx, float nullxxxx) {
      Vector4f var9 = new Vector4f(
         (float)(var1 - this.I_1l1__Ii_I1_l1_1II__1l1iI_I),
         (float)(nullx - this.Il__i_Ill_i1li__I1l1lII_IiI_i),
         (float)(nullxx - this.iI1ll1i_l_l11ll_I11liII),
         1.0F
      );
      var9.mul(this.l11Ii1lll11IlIIiI_ll1__lI__1ll);
      var9.mul(this.liI_1iii_11iI1Ill1lIIIII);
      if (var9.w <= 0.0F) {
         return null;
      } else {
         float var10 = (
               var9.x / var9.w * Float.intBitsToFloat((126091264 | 52217) ^ 948227065) + Float.intBitsToFloat(~-1210779229 - -1028419550 ^ -1166576070)
            )
            * nullxxx;
         float var11 = (
               1.0F - (var9.y / var9.w * Float.intBitsToFloat(~-284727406 - 1960475262 ^ -1558307345) + Float.intBitsToFloat((1023082496 | 63063) ^ 66844247))
            )
            * nullxxxx;
         float[] var10000 = new float[(-82968576 | 2389) ^ -82966185];
         var10000[(368967680 | 19126) ^ 368986806] = var10;
         var10000[2022385063 * 313206195 + -1246328516] = var11;
         return var10000;
      }
   }

   private String i1_lllllIIiii_llill_Ii_I_IIi(int param1) {
      if (var1 < 0) {
         String var2 = l__III11__1I1i1IIli1II1_11i_((378732544 | 57079) ^ 378789624);
         if (var2 == null) {
            byte[] var3 = new byte[~822737990 - -246638948 ^ -576099047];
            var3[(1382940672 | 41597) ^ 1382982269] = (byte)(284079228 * -1651532891 + -1315268648);
            var3[(1815543808 | 61553) ^ 1815605360] = (byte)((168689664 | 3156) ^ -168692859);
            var3[908374763 * -887822375 + -1441379889] = (byte)((-38600704 | 1664) ^ 38599011);
            var3[(-314441728 | 36214) ^ -314405515] = (byte)(~577829700 - -531291455 ^ 46538340);
            var2 = lIiI11i1__i11__lllIlI1ll(var3, (-1223163904 | 34654) ^ -1223129263);
         }

         return var2;
      } else {
         int var10000 = var1 / (-879178242 * 1723361253 + 585009670);
         String var10001 = l__III11__1I1i1IIli1II1_11i_(~1214527577 - 234546315 ^ -1449073909);
         if (var10001 == null) {
            byte[] var4 = new byte[~-84555496 - 1454874242 ^ -1370318739];
            var4[~-153024 - 765777060 ^ -765624037] = (byte)(1552060673 * -387085489 + 1762440749);
            var4[1427479336 * 333440053 + 75448505] = (byte)(~-645735333 - 505224432 ^ 140510890);
            var4[(-1068826624 | 17927) ^ -1068808699] = (byte)((-804651008 | 55921) ^ -804595110);
            var4[274711082 * 1254838925 + 868391649] = (byte)((1662386176 | 49953) ^ -1662436129);
            var4[~-2103827626 - -351122336 ^ -1840017331] = (byte)((-1899298816 | 1589) ^ -1899297203);
            var4[-1513917211 * 426601965 + 784746244] = (byte)((-1577713664 | 22765) ^ -1577690912);
            var4[~1511384685 - 1636294111 ^ 1147288501] = (byte)((-2056388608 | 5759) ^ -2056382858);
            var4[(163905536 | 10568) ^ 163916111] = (byte)(~-700842747 - 1002493638 ^ 301650887);
            var10001 = lIiI11i1__i11__lllIlI1ll(var4, ~-460529112 - -1230421583 ^ 1690950710);
         }

         Object[] var10002 = new Object[859417581 * 2029660817 + -2001814332];
         var10002[(-359464960 | 64014) ^ -359400946] = var1 % (~1345275330 - -834060760 ^ -511214551);
         return var10000 + ":" + String.format(var10001, var10002);
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
