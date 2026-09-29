package II1II1II1II1II1II1II1II1.l2_I1;

import II1II1II1II1II1II1II1II1.I3_i2.IlI1I_l1__1II1ii_I_l1II_iIIiI;
import II1II1II1II1II1II1II1II1.I3_i2.Ill111II11ilI1_iIlI1Il;
import II1II1II1II1II1II1II1II1.I3_i2.il1Il11I__li1illliIIii_II_i_i;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class l1_li1il_1IlIliIiI_l_11Il_ {
   private IlI1I_l1__1II1ii_I_l1II_iIIiI pipe;
   public static final char[][] l_1_l1ili1____I1iiIiIII_I = new char[~-1291654936 - 282610445 ^ 1009044600][];

   public boolean ready() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         if (this.pipe != null) {
            IlI1I_l1__1II1ii_I_l1II_iIIiI var10000 = this.pipe;
            Object var10001 = null;
            Thread.currentThread().hashCode();
            if (var10000.open()) {
               return (boolean)(~210004424 - 1628463107 ^ -1838467531);
            }
         }

         return (boolean)((1855586304 | 19934) ^ 1855606238);
      }
   }

   public void connect(String param1) throws IOException {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10001 = null;
         Thread.currentThread().hashCode();
         this.close();
         var10001 = null;
         Thread.currentThread().hashCode();
         this.pipe = I_i_i_lIllIlI1I1_I___l11l();
         Object var10002 = null;
         Thread.currentThread().hashCode();
         JsonObject var4 = new JsonObject();
         var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII(~-94141767 - 226644083 ^ -132502317);
         if (var10001 == null) {
            var10001 = new byte[-1252209582 * 2009116601 + 616843971];
            ((Object[])var10001)[263514144 * 1433125567 + -1967222752] = (byte)(~-177702991 - -438202898 ^ -615905834);
            ((Object[])var10001)[~257004092 - 812590578 ^ -1069594672] = (byte)((2082013184 | 6529) ^ 2082019727);
            ((Object[])var10001)[(-348389376 | 12183) ^ -348377195] = (byte)(1336176790 * -96776715 + -483319081);
            ((Object[])var10001)[(-1395720192 | 48924) ^ -1395671265] = (byte)((540016640 | 59031) ^ 540075650);
            ((Object[])var10001)[~1952239033 - -1148528288 ^ -803710750] = (byte)(-1647941639 * 917249663 + 420953358);
            var10001 = li_111l1ilI___iI1II_il__li1lI_((byte[])var10001, (-562429952 | 6505) ^ -562423447);
         }

         int var12 = ~-458492352 - 1273213272 ^ -814720922;
         Object var10003 = null;
         Thread.currentThread().hashCode();
         var10002 = var12;
         var10003 = null;
         Thread.currentThread().hashCode();
         var4.addProperty((String)var10001, (Number)var10002);
         var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII(~1901417084 - -1726620555 ^ -174796529);
         if (var10001 == null) {
            var10001 = new byte[-2127604937 * 1829447911 + 183390572];
            ((Object[])var10001)[-2072518600 * 1050720861 + 344644520] = (byte)(-1752848049 * 1678766685 + -758918978);
            ((Object[])var10001)[1521202854 * 459217279 + -161469017] = (byte)(-1275341811 * 285255891 + -2025344705);
            ((Object[])var10001)[(980942848 | 43197) ^ 980986047] = (byte)((34078720 | 65056) ^ -34143766);
            ((Object[])var10001)[-2076646214 * -90509759 + 1292173513] = (byte)(1042051216 * 889467079 + -796295096);
            ((Object[])var10001)[(-113049600 | 11443) ^ -113038153] = (byte)((336461824 | 56488) ^ 336518360);
            ((Object[])var10001)[-267133876 * -1491214185 + 2062192433] = (byte)(~1821163219 - -1103145787 ^ -718017473);
            ((Object[])var10001)[~-343830309 - -1720519671 ^ 2064349981] = (byte)((2015625216 | 52203) ^ -2015677427);
            ((Object[])var10001)[-1599499640 * -2040780919 + 1460526399] = (byte)((1175715840 | 32892) ^ -1175748711);
            ((Object[])var10001)[~1158446914 - -1071725876 ^ -86721031] = (byte)(684841716 * -1691525271 + 684238344);
            ((Object[])var10001)[-333044011 * 737058283 + -232539774] = (byte)((957677568 | 27620) ^ 957705119);
            ((Object[])var10001)[628446974 * 22671633 + -805168340] = (byte)((1174732800 | 28045) ^ -1174760858);
            ((Object[])var10001)[~-488818027 - -204513700 ^ 693331717] = (byte)(1864869435 * -1106594487 + -52698567);
            ((Object[])var10001)[~1268975827 - 1526850648 ^ 1499140824] = (byte)((659619840 | 36906) ^ -659656746);
            var10001 = li_111l1ilI___iI1II_il__li1lI_((byte[])var10001, 299562535 * 1835361235 + -487388964);
         }

         var10003 = null;
         Thread.currentThread().hashCode();
         var4.addProperty((String)var10001, var1);
         int var10 = -2131531631 * -1377484845 + 1240473981;
         var10003 = null;
         Thread.currentThread().hashCode();
         this.i_lill_Ii_1_1II1il__Ii(var10, var4);
         var10001 = null;
         Thread.currentThread().hashCode();
         this.I_1I1I1Il1I11I_ll1l_i_I11II();
      }
   }

   public void set(JsonObject param1) throws IOException {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         ProcessHandle var10002 = null;
         Thread.currentThread().hashCode();
         JsonObject var4 = new JsonObject();
         String var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII((-1900019712 | 26851) ^ -1899992863);
         if (var10001 == null) {
            byte[] var5 = new byte[~-2040035990 - 335639033 ^ 1704396955];
            var5[~-1222332592 - -817747856 ^ 2040080447] = (byte)((1654849536 | 50199) ^ -1654899729);
            var5[(-668598272 | 9954) ^ -668588317] = (byte)(381312306 * -205190797 + 260530407);
            var5[~1631990392 - 927015659 ^ 1735961246] = (byte)((1506803712 | 21435) ^ 1506825107);
            var5[~-2078837900 - -1033568774 ^ -1182560622] = (byte)((898039808 | 13779) ^ -898053572);
            var5[844653703 * 440943251 + 1364949119] = (byte)((-1445265408 | 10170) ^ 1445255240);
            var5[(-1559298048 | 22343) ^ -1559275710] = (byte)((337969152 | 56798) ^ -338025912);
            var5[(1283129344 | 30627) ^ 1283159973] = (byte)((1807613952 | 47942) ^ -1807661869);
            var10001 = li_111l1ilI___iI1II_il__li1lI_(var5, ~-1682866966 - -2099097340 ^ -513002989);
         }

         var10002 = null;
         Thread.currentThread().hashCode();
         var10002 = ProcessHandle.current();
         Object var10003 = null;
         Thread.currentThread().hashCode();
         long var12 = var10002.pid();
         var10003 = null;
         Thread.currentThread().hashCode();
         Long var13 = var12;
         var10003 = null;
         Thread.currentThread().hashCode();
         var4.addProperty(var10001, var13);
         var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII(630046606 * 2053210411 + 47990057);
         if (var10001 == null) {
            byte[] var7 = new byte[-1481430626 * 562750189 + -952566586];
            var7[~-635265851 - 216309332 ^ 418956518] = (byte)(~1879132763 - -1646464842 ^ 232667947);
            var7[-39497902 * -995426553 + -234608957] = (byte)(~-741456929 - -836799193 ^ 1578256036);
            var7[-614280315 * 50605309 + 1441143185] = (byte)(~-1730343157 - 845319239 ^ 885023887);
            var7[(1479016448 | 63934) ^ 1479080381] = (byte)((860094464 | 27608) ^ -860122003);
            var7[~-1883644488 - 1582376627 ^ 301267856] = (byte)(442455571 * 1880359931 + -49782258);
            var7[(-1199702016 | 61064) ^ -1199640947] = (byte)((-450494464 | 9960) ^ 450484523);
            var7[~-471144109 - 1865517820 ^ -1394373706] = (byte)((942866432 | 62900) ^ -942929356);
            var7[(-2121859072 | 3500) ^ -2121855573] = (byte)(487159312 * 1006061649 + -1923275569);
            var7[~-1588464482 - -1465848785 ^ -1240654022] = (byte)(~-1798117755 - 1062437490 ^ -735680341);
            var7[~1519195906 - 724910107 ^ 2050861291] = (byte)(~1626014271 - -174077780 ^ 1451936453);
            var7[~-1863288235 - 1445805836 ^ 417482388] = (byte)((1356136448 | 2011) ^ -1356138390);
            var7[~-1305257590 - -1574775603 ^ -1414934109] = (byte)(1758358883 * 1031919189 + -299766831);
            var10001 = li_111l1ilI___iI1II_il__li1lI_(var7, -1630524032 * -140924491 + -1756998525);
         }

         var10003 = null;
         Thread.currentThread().hashCode();
         var4.add(var10001, var1);
         var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII((1745813504 | 5530) ^ 1745819038);
         if (var10001 == null) {
            byte[] var9 = new byte[(1783627776 | 47075) ^ 1783674867];
            var9[(-936050688 | 40367) ^ -936010321] = (byte)(-307241039 * 1158430451 + -1735013158);
            var9[(-427950080 | 15213) ^ -427934868] = (byte)((-397606912 | 27628) ^ -397579326);
            var9[(-1673723904 | 10069) ^ -1673713833] = (byte)(-879653702 * 47688257 + 73515086);
            var9[(-1563295744 | 26399) ^ -1563269348] = (byte)(-879242665 * 410291245 + -1210289547);
            var9[(1970864128 | 1038) ^ 1970865162] = (byte)(~1603828602 - -573641543 ^ -1030187089);
            var9[(343474176 | 12963) ^ 343487142] = (byte)((-520945664 | 23468) ^ -520922173);
            var9[(-894107648 | 17246) ^ -894090408] = (byte)(-795799873 * -824989357 + -993058450);
            var9[(2056192000 | 20553) ^ 2056212558] = (byte)((1449394176 | 59222) ^ 1449453369);
            var9[(-1941766144 | 1116) ^ -1941765036] = (byte)(-2031611938 * -313572215 + -1105819001);
            var9[(798294016 | 56049) ^ 798350072] = (byte)(~-1139048837 - -436267209 ^ -1575316094);
            var9[1004890284 * 64813397 + 37024494] = (byte)(-2069156516 * 2064509249 + 43302930);
            var9[~396108576 - 869861837 ^ -1265970407] = (byte)(~1131663920 - -510389289 ^ -621274666);
            var9[354486971 * 279890553 + -170893399] = (byte)(922297008 * -1749465243 + 1441169678);
            var9[~1290444999 - 601689793 ^ -1892134790] = (byte)(~752886107 - -145723352 ^ -607162835);
            var9[~-1677134437 - 369338346 ^ 1307796084] = (byte)(253439561 * 167618149 + 454977404);
            var9[-344199611 * 1649520037 + -1421489002] = (byte)(-44816121 * 1358231939 + 928723521);
            var10001 = li_111l1ilI___iI1II_il__li1lI_(var9, (514719744 | 38282) ^ 514758030);
         }

         var10003 = null;
         Thread.currentThread().hashCode();
         this.l1li_l_l1ill11lIII_1_Il_l_l111l(var10001, var4);
      }
   }

   public void clear() throws IOException {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         ProcessHandle var10002 = null;
         Thread.currentThread().hashCode();
         JsonObject var3 = new JsonObject();
         String var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII(-1631344027 * -1998084055 + -1045140008);
         if (var10001 == null) {
            byte[] var4 = new byte[626300624 * 1368301825 + 812816695];
            var4[-1094618225 * -168827295 + 761248977] = (byte)(-629380860 * -1430615821 + -1892273919);
            var4[-1127257122 * 309777583 + -728929473] = (byte)(-167519989 * 1623224253 + -875758137);
            var4[551225003 * -52683391 + -1830009641] = (byte)((-470941696 | 59435) ^ -470882277);
            var4[~-952874558 - -1410436816 ^ -1931655922] = (byte)(~-559353520 - 2057752049 ^ -1498398591);
            var4[(-387710976 | 39939) ^ -387671033] = (byte)(~-1911601397 - -1189949695 ^ -1193416238);
            var4[(-982712320 | 7626) ^ -982704689] = (byte)((21233664 | 64084) ^ -21297693);
            var4[(401670144 | 41241) ^ 401711391] = (byte)(-488095645 * 1535796537 + -226190513);
            var10001 = li_111l1ilI___iI1II_il__li1lI_(var4, 653784 * -1590075597 + -785116675);
         }

         var10002 = null;
         Thread.currentThread().hashCode();
         var10002 = ProcessHandle.current();
         Object var10003 = null;
         Thread.currentThread().hashCode();
         long var9 = var10002.pid();
         var10003 = null;
         Thread.currentThread().hashCode();
         Long var10 = var9;
         var10003 = null;
         Thread.currentThread().hashCode();
         var3.addProperty(var10001, var10);
         var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII(~1801796356 - 2092573736 ^ 400597205);
         if (var10001 == null) {
            byte[] var6 = new byte[(5570560 | 56042) ^ 5626618];
            var6[~1380949750 - 910098474 ^ 2003919071] = (byte)(-506632460 * -528488683 + -1892392389);
            var6[(1846345728 | 31894) ^ 1846377623] = (byte)((-1844117504 | 54629) ^ 1844062909);
            var6[-1933917842 * 479558829 + -753663828] = (byte)(469784288 * -158670211 + -228338466);
            var6[-1323483512 * 849543669 + 19701723] = (byte)(~-751751578 - -1885070979 ^ 1658144715);
            var6[~52315435 - 860913395 ^ -913228827] = (byte)(~-1070485807 - -1590578847 ^ -1633902608);
            var6[~187076128 - -935861962 ^ 748785836] = (byte)(1928003857 * -929175701 + -94161134);
            var6[(373424128 | 47734) ^ 373471856] = (byte)(922044902 * -1691332741 + -919108427);
            var6[~-1958401208 - -872809302 ^ -1463756790] = (byte)(~1810213884 - 40850823 ^ -1851064745);
            var6[~-2120887300 - -494632986 ^ -1679447019] = (byte)(~1133987244 - -1997602435 ^ 863615215);
            var6[1311940919 * -155960737 + 1308866208] = (byte)((-157155328 | 7575) ^ -157147776);
            var6[(812318720 | 23340) ^ 812342054] = (byte)(~-867727638 - 1882719682 ^ -1014992011);
            var6[(-1076953088 | 60018) ^ -1076893063] = (byte)(845647635 * -1061073065 + -866876509);
            var6[~822923835 - -1346125946 ^ 523202098] = (byte)(~-1159197387 - -23476731 ^ -1182674096);
            var6[~1467569222 - -1843682911 ^ 376113685] = (byte)(-914949788 * -55405319 + 1804705295);
            var6[~-142562197 - 128066892 ^ 14495302] = (byte)((2030370816 | 48239) ^ 2030419018);
            var6[(-376504320 | 24516) ^ -376479797] = (byte)(~-33639092 - 1733695241 ^ 1700056135);
            var10001 = li_111l1ilI___iI1II_il__li1lI_(var6, (2107375616 | 54016) ^ 2107429638);
         }

         var10003 = null;
         Thread.currentThread().hashCode();
         this.l1li_l_l1ill11lIII_1_Il_l_l111l(var10001, var3);
      }
   }

   public void close() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else if (this.pipe != null) {
         label21: {
            try {
               IlI1I_l1__1II1ii_I_l1II_iIIiI var10000 = this.pipe;
               Object var10001 = null;
               Thread.currentThread().hashCode();
               var10000.close();
            } catch (IOException var3) {
               break label21;
            }

            if (-1308200568 * 654540825 + -1223305064 != (~-757346599 - 1323578428 ^ -2127752694)) {
            }
         }

         this.pipe = null;
      }
   }

   private void l1li_l_l1ill11lIII_1_Il_l_l111l(String param1, JsonObject nullx) throws IOException {
      int var4 = System.identityHashCode(null);
      if ((var4 * (var4 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         UUID var10002 = null;
         Thread.currentThread().hashCode();
         JsonObject var5 = new JsonObject();
         String var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII(~-2143292757 - 295491081 ^ 1847801676);
         if (var10001 == null) {
            byte[] var6 = new byte[-1867214819 * 1539514025 + 986871522];
            var6[(-14614528 | 18278) ^ -14596250] = (byte)((-502136832 | 7568) ^ 502129264);
            var6[~1891496131 - -2055045926 ^ 163549795] = (byte)((-1867055104 | 2453) ^ 1867052670);
            var6[(-756875264 | 46045) ^ -756829217] = (byte)(~730492785 - -509297721 ^ 221195008);
            var6[1939829327 * -540964007 + 1005673868] = (byte)((-542769152 | 35364) ^ -542733725);
            var6[1680589444 * 1946143985 + -967790144] = (byte)((-1841627136 | 49337) ^ -1841577734);
            var6[~-351114333 - 28129278 ^ 322985051] = (byte)(~-560528314 - -1272263476 ^ -1832791745);
            var6[-1576049953 * 1284827221 + -497150981] = (byte)((-2086404096 | 28256) ^ 2086375877);
            var10001 = li_111l1ilI___iI1II_il__li1lI_(var6, ~-1585577427 - -1071623172 ^ -1637766703);
         }

         Object var10003 = null;
         Thread.currentThread().hashCode();
         var5.addProperty(var10001, var1);
         var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII((-334888960 | 40124) ^ -334848844);
         if (var10001 == null) {
            byte[] var8 = new byte[(-1658519552 | 27243) ^ -1658492317];
            var8[(-1645281280 | 57529) ^ -1645223751] = (byte)(~448133462 - 647031637 ^ -1095165160);
            var8[~557393530 - 307644666 ^ -865038198] = (byte)(~-770853714 - -1334122656 ^ 2104976357);
            var8[(-243728384 | 42383) ^ -243686003] = (byte)(~2095226586 - 652678114 ^ 1547062639);
            var8[~-1717710634 - 1283116499 ^ 434594133] = (byte)((-1707606016 | 17942) ^ -1707588052);
            var8[~-1207864648 - -875572218 ^ 2083436869] = (byte)((-1134231552 | 30336) ^ -1134201186);
            var8[201665811 * -46664381 + 1886192908] = (byte)(~1296830657 - 2123255749 ^ -874880896);
            var8[~-365573752 - -1851987964 ^ -2077405579] = (byte)((-706347008 | 60593) ^ -706286414);
            var8[(-1698168832 | 36323) ^ -1698132508] = (byte)((-61210624 | 3654) ^ -61206919);
            var10001 = li_111l1ilI___iI1II_il__li1lI_(var8, ~-1881130592 - 1347941140 ^ 533189443);
         }

         var10003 = null;
         Thread.currentThread().hashCode();
         var5.add(var10001, nullx);
         var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII((426967040 | 61290) ^ 427028323);
         if (var10001 == null) {
            byte[] var10 = new byte[~-1047198633 - 1204414930 ^ -157216289];
            var10[~1233526670 - 583388922 ^ -1816915593] = (byte)((-334757888 | 35192) ^ 334722703);
            var10[-1997525163 * -1383872807 + 2118984436] = (byte)(-288737598 * 308155085 + -788757746);
            var10[~-1078952188 - 114295053 ^ 964657132] = (byte)(~1726684044 - -899402927 ^ -827281094);
            var10[866975624 * 427565547 + 895542827] = (byte)(~1855236966 - 44745430 ^ 1899982447);
            var10[1733286325 * 1219556339 + -1893889483] = (byte)(1225978917 * -1205335801 + -1742862877);
            var10[(1102053376 | 57725) ^ 1102111096] = (byte)(~-2082801680 - 2068812870 ^ 13988817);
            var10[~-2115924622 - 1494105180 ^ 621819447] = (byte)((1205207040 | 26765) ^ -1205233906);
            var10[~280173423 - 1367846902 ^ -1648020323] = (byte)((2110193664 | 27471) ^ -2110221107);
            var10[~2006941661 - 337341825 ^ 1950683817] = (byte)(~649074760 - -375746344 ^ 273328491);
            var10001 = li_111l1ilI___iI1II_il__li1lI_(var10, (152698880 | 43404) ^ 152742277);
         }

         var10002 = null;
         Thread.currentThread().hashCode();
         var10002 = UUID.randomUUID();
         var10003 = null;
         Thread.currentThread().hashCode();
         String var16 = var10002.toString();
         var10003 = null;
         Thread.currentThread().hashCode();
         var5.addProperty(var10001, var16);
         int var11 = 1694788005 * 2017876927 + -720795930;
         var10003 = null;
         Thread.currentThread().hashCode();
         this.i_lill_Ii_1_1II1il__Ii(var11, var5);
         var10001 = null;
         Thread.currentThread().hashCode();
         ii1_i_i1_11Il_Illi_1i_Ii_I var10000 = this.I_1I1I1Il1I11I_ll1l_i_I11II();
         var10001 = null;
         Thread.currentThread().hashCode();
         ii___I_11ii_l1i1_l1liiI(var10000);
      }
   }

   private void i_lill_Ii_1_1II1il__Ii(int param1, JsonObject nullx) throws IOException {
      int var4 = System.identityHashCode(null);
      if ((var4 * (var4 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10001 = null;
         Thread.currentThread().hashCode();
         String var10000 = nullx.toString();
         var10001 = StandardCharsets.UTF_8;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         byte[] var6 = var10000.getBytes((Charset)var10001);
         int var7 = (~1933551758 - 463978653 ^ 1897436892) + var6.length;
         var10001 = null;
         Thread.currentThread().hashCode();
         ByteBuffer var8 = ByteBuffer.allocate(var7);
         var10001 = ByteOrder.LITTLE_ENDIAN;
         var10002 = null;
         Thread.currentThread().hashCode();
         ByteBuffer var5 = var8.order((ByteOrder)var10001);
         var10002 = null;
         Thread.currentThread().hashCode();
         var5.putInt(var1);
         int var13 = var6.length;
         var10002 = null;
         Thread.currentThread().hashCode();
         var5.putInt(var13);
         var10002 = null;
         Thread.currentThread().hashCode();
         var5.put(var6);
         IlI1I_l1__1II1ii_I_l1II_iIIiI var9 = this.pipe;
         var10002 = null;
         Thread.currentThread().hashCode();
         var10001 = var5.array();
         var10002 = null;
         Thread.currentThread().hashCode();
         var9.write((byte[])var10001);
      }
   }

   private ii1_i_i1_11Il_Illi_1i_Ii_I I_1I1I1Il1I11I_ll1l_i_I11II() throws IOException {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         while (true) {
            Object var10001 = null;
            Thread.currentThread().hashCode();
            ii1_i_i1_11Il_Illi_1i_Ii_I var4 = this.IllIlii11_liii11l_lIi_ii1i__l();
            var10001 = null;
            Thread.currentThread().hashCode();
            if (var4.opcode() != ((1164378112 | 27539) ^ 1164405648)) {
               var10001 = null;
               Thread.currentThread().hashCode();
               if (var4.opcode() == ((-2005336064 | 31500) ^ -2005304562)) {
                  Object var10003 = null;
                  Thread.currentThread().hashCode();
                  String var24 = var4.text();
                  var10003 = null;
                  Thread.currentThread().hashCode();
                  throw new IOException(var24);
               }

               return var4;
            }

            int var10000 = (-1776877568 | 23686) ^ -1776853874;
            Object var10002 = null;
            Thread.currentThread().hashCode();
            var10000 += var4.body().length;
            var10001 = null;
            Thread.currentThread().hashCode();
            ByteBuffer var6 = ByteBuffer.allocate(var10000);
            var10001 = ByteOrder.LITTLE_ENDIAN;
            var10002 = null;
            Thread.currentThread().hashCode();
            ByteBuffer var3 = var6.order((ByteOrder)var10001);
            int var11 = -576871894 * -1781564229 + 827863894;
            var10002 = null;
            Thread.currentThread().hashCode();
            var3.putInt(var11);
            var10002 = null;
            Thread.currentThread().hashCode();
            int var12 = var4.body().length;
            var10002 = null;
            Thread.currentThread().hashCode();
            var3.putInt(var12);
            var10002 = null;
            Thread.currentThread().hashCode();
            var10001 = var4.body();
            var10002 = null;
            Thread.currentThread().hashCode();
            var3.put((byte[])var10001);
            IlI1I_l1__1II1ii_I_l1II_iIIiI var7 = this.pipe;
            var10002 = null;
            Thread.currentThread().hashCode();
            var10001 = var3.array();
            var10002 = null;
            Thread.currentThread().hashCode();
            var7.write((byte[])var10001);
            if ((~989221849 - -249393878 ^ 42528723) != ((682819584 | 38072) ^ -102996585)) {
            }
         }
      }
   }

   private ii1_i_i1_11Il_Illi_1i_Ii_I IllIlii11_liii11l_lIi_ii1i__l() throws IOException {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         byte[] var7 = new byte[462266355 * 1765253475 + 1047417359];
         Object var10002 = null;
         Thread.currentThread().hashCode();
         this.i11I_1lI1lili1lilI1_iI_(var7);
         Object var10001 = null;
         Thread.currentThread().hashCode();
         ByteBuffer var10000 = ByteBuffer.wrap(var7);
         var10001 = ByteOrder.LITTLE_ENDIAN;
         var10002 = null;
         Thread.currentThread().hashCode();
         ByteBuffer var3 = var10000.order((ByteOrder)var10001);
         var10001 = null;
         Thread.currentThread().hashCode();
         int var4 = var3.getInt();
         var10001 = null;
         Thread.currentThread().hashCode();
         int var5 = var3.getInt();
         if (var5 >= 0 && var5 <= ((-1105854464 | 30466) ^ -1106872574)) {
            byte[] var6 = new byte[var5];
            var10002 = null;
            Thread.currentThread().hashCode();
            this.i11I_1lI1lili1lilI1_iI_(var6);
            Object var10004 = null;
            Thread.currentThread().hashCode();
            return new ii1_i_i1_11Il_Illi_1i_Ii_I(var4, var6);
         } else {
            Object var10003 = null;
            Thread.currentThread().hashCode();
            var10002 = "bad discord packet size: " + var5;
            var10003 = null;
            Thread.currentThread().hashCode();
            throw new IOException((String)var10002);
         }
      }
   }

   private void i11I_1lI1lili1lilI1_iI_(byte[] param1) throws IOException {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         var3 = ~655629349 - -312578707 ^ -343050643;

         while (var3 < var1.length) {
            IlI1I_l1__1II1ii_I_l1II_iIIiI var10000 = this.pipe;
            int var10003 = var1.length - var3;
            Object var10004 = null;
            Thread.currentThread().hashCode();
            int var4 = var10000.read(var1, var3, var10003);
            if (var4 == ((-505872384 | 65014) ^ 505807369)) {
               EOFException var6 = new EOFException;
               String var10002 = Iil__1il1llIi_1liIIi1_iI_1iiiII((1011286016 | 31649) ^ 1011317675);
               if (var10002 == null) {
                  byte[] var7 = new byte[~-247929468 - -1672937010 ^ 1920866490];
                  var7[~1967983524 - -205609017 ^ -1762374508] = (byte)((962658304 | 55449) ^ -962713812);
                  var7[1352637964 * -1867806123 + -573960699] = (byte)(~-172579212 - 516080596 ^ -343501365);
                  var7[~-1877576984 - -2134977009 ^ -282413302] = (byte)((-579076096 | 13753) ^ -579062387);
                  var7[~986816171 - -712483409 ^ -274332762] = (byte)((-877723648 | 54025) ^ -877669509);
                  var7[(-342491136 | 53850) ^ -342437282] = (byte)(~1947109531 - 1218120735 ^ -1129736987);
                  var7[(476512256 | 55994) ^ 476568255] = (byte)(~-492707623 - -636417400 ^ -1129125017);
                  var7[-1259667025 * 1618863885 + 1327038755] = (byte)(~149431622 - -1998576346 ^ 1849144743);
                  var7[(-2002190336 | 63315) ^ -2002127020] = (byte)((-436862976 | 43701) ^ -436819317);
                  var7[(968753152 | 44547) ^ 968797707] = (byte)((-6422528 | 38880) ^ -6383621);
                  var7[695503757 * 860763367 + 1334276046] = (byte)(1503751782 * -19405427 + 1319826271);
                  var7[(-1471283200 | 21257) ^ -1471261949] = (byte)(~-778003984 - 1053409309 ^ 275405354);
                  var7[1247360788 * -550933251 + -1536941753] = (byte)(~1383758841 - -416289296 ^ 967469502);
                  var7[1621029013 * 1024138805 + -2021672141] = (byte)(~-797629897 - 2064398479 ^ -1266768640);
                  var7[(2127691776 | 48626) ^ 2127740415] = (byte)((1846935552 | 31343) ^ -1846966867);
                  var7[-437332473 * -542804259 + 1588003331] = (byte)(~-1047479685 - -1138030272 ^ 2109457319);
                  var7[(1558970368 | 60839) ^ 1559031208] = (byte)((-348389376 | 26777) ^ 348362600);
                  var7[-1992274077 * 935240635 + -1694500417] = (byte)((309723136 | 44572) ^ -309767778);
                  var7[(1404108800 | 46978) ^ 1404155795] = (byte)((-1888288768 | 10967) ^ -1888277862);
                  var7[~1473238847 - -74578181 ^ -1398660649] = (byte)((-127991808 | 11039) ^ -127980673);
                  var7[~-1140280302 - 249997437 ^ 890282851] = (byte)(89595880 * -1773163871 + 7134892);
                  var7[~-1793275928 - -2058316199 ^ -443375190] = (byte)(1416610346 * 1305578359 + -346689496);
                  var7[(1298268160 | 31800) ^ 1298299949] = (byte)((919273472 | 65079) ^ -919338535);
                  var7[~-611841267 - -373304100 ^ 985145344] = (byte)((1359937536 | 36322) ^ -1359973839);
                  var10002 = li_111l1ilI___iI1II_il__li1lI_(var7, ~1295811813 - 617500305 ^ -1913312125);
               }

               Object var8 = null;
               Thread.currentThread().hashCode();
               var6./* $VF: Unable to resugar constructor */<init>(var10002);
               throw var6;
            }

            var3 += var4;
            if ((~-1569210468 - 1772555295 ^ -1115803717) != ((-946798592 | 58224) ^ -1995507569)) {
            }
         }
      }
   }

   private static void ii___I_11ii_l1i1_l1liiI(ii1_i_i1_11Il_Illi_1i_Ii_I param0) throws IOException {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10001 = null;
         Thread.currentThread().hashCode();
         String var10000 = var0.text();
         var10001 = null;
         Thread.currentThread().hashCode();
         JsonElement var6 = JsonParser.parseString(var10000);
         var10001 = null;
         Thread.currentThread().hashCode();
         if (var6.isJsonObject()) {
            var10001 = null;
            Thread.currentThread().hashCode();
            JsonObject var3 = var6.getAsJsonObject();
            var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII(1029838390 * 996928513 + -1684921899);
            if (var10001 == null) {
               var10001 = new byte[~-283393954 - 1627481384 ^ -1344087426];
               ((Object[])var10001)[(-1445789696 | 16135) ^ -1445773561] = (byte)((2027487232 | 48203) ^ 2027535457);
               ((Object[])var10001)[-1063190992 * 1263293041 + -515609391] = (byte)(-952128705 * -2056388607 + -391228298);
               ((Object[])var10001)[~49344216 - -110152575 ^ 60808356] = (byte)(230619405 * -1074004837 + -847812273);
               ((Object[])var10001)[(958267392 | 34291) ^ 958301680] = (byte)((-465567744 | 812) ^ -465566963);
               ((Object[])var10001)[(-674824192 | 61183) ^ -674763013] = (byte)((1601634304 | 2106) ^ -1601636445);
               ((Object[])var10001)[-375326902 * -1698573827 + -1086443037] = (byte)((1944977408 | 7335) ^ -1944984713);
               ((Object[])var10001)[(41418752 | 64096) ^ 41482854] = (byte)(1557434478 * 896982611 + 958515340);
               var10001 = li_111l1ilI___iI1II_il__li1lI_((byte[])var10001, (-2113798144 | 22914) ^ -2113775223);
            }

            JsonElement var10002 = null;
            Thread.currentThread().hashCode();
            JsonElement var4 = var3.get((String)var10001);
            if (var4 != null) {
               var10001 = null;
               Thread.currentThread().hashCode();
               if (!var4.isJsonNull()) {
                  var10000 = Iil__1il1llIi_1liIIi1_iI_1iiiII(-1142593885 * -815980293 + 50921019);
                  if (var10000 == null) {
                     byte[] var8 = new byte[-1531360600 * -1847995379 + -1067707007];
                     var8[(195887104 | 44321) ^ 195931425] = (byte)((1316618240 | 49521) ^ -1316667660);
                     var8[~1721873326 - -1230091312 ^ -491782016] = (byte)(-2051229292 * -1114766623 + -946488023);
                     var8[~-2075602212 - 1026150067 ^ 1049452146] = (byte)(-1063292611 * 1775806525 + -415630318);
                     var8[1516802347 * 1786526069 + 1192170588] = (byte)((-1631911936 | 45561) ^ 1631866405);
                     var8[(-886243328 | 52196) ^ -886191136] = (byte)(702126205 * 1875862819 + -301738410);
                     var8[437835610 * -2093312603 + -532557565] = (byte)((-2132475904 | 12377) ^ 2132463547);
                     var8[~-298758982 - -792581387 ^ 1091340374] = (byte)((-1662058496 | 576) ^ 1662057900);
                     var8[~2132517993 - -1038960902 ^ -1093557093] = (byte)(~-1546760007 - -1210412879 ^ 1537794384);
                     var8[~188932423 - -1883680294 ^ 1694747862] = (byte)(~-257620565 - -1510834570 ^ 1768455097);
                     var10000 = li_111l1ilI___iI1II_il__li1lI_(var8, (880607232 | 61776) ^ 880669020);
                  }

                  var10002 = null;
                  Thread.currentThread().hashCode();
                  var10001 = var4.getAsString();
                  var10002 = null;
                  Thread.currentThread().hashCode();
                  if (var10000.equals(var10001)) {
                     var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII((572719104 | 47202) ^ 572766319);
                     if (var10001 == null) {
                        var10001 = new byte[(-916062208 | 4094) ^ -916058122];
                        ((Object[])var10001)[~1607853273 - -261724463 ^ -1346128811] = (byte)((-21757952 | 31698) ^ 21726242);
                        ((Object[])var10001)[~-160338553 - 913207582 ^ -752869029] = (byte)((354811904 | 10145) ^ -354822079);
                        ((Object[])var10001)[-1242797667 * -250614751 + -1644779835] = (byte)((485425152 | 9227) ^ 485434406);
                        ((Object[])var10001)[~304305062 - -1051391490 ^ 747086424] = (byte)(~510533130 - 1389064018 ^ 1899597147);
                        ((Object[])var10001)[2049563549 * -50755927 + 1236588383] = (byte)(1012932506 * 1039663109 + -2098241063);
                        ((Object[])var10001)[(-397017088 | 44694) ^ -396972397] = (byte)(~-124242586 - -1548565349 ^ -1672807815);
                        ((Object[])var10001)[-1884425100 * -1024920479 + 1358417938] = (byte)(~1508516695 - 885849776 ^ 1900600776);
                        ((Object[])var10001)[~-22650384 - -150559749 ^ 173210131] = (byte)((-570753024 | 49307) ^ -570703700);
                        var10001 = li_111l1ilI___iI1II_il__li1lI_((byte[])var10001, ~2109671729 - -1881436325 ^ -228235394);
                     }

                     var10002 = null;
                     Thread.currentThread().hashCode();
                     if (var3.has((String)var10001)) {
                        var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII((-240648192 | 30074) ^ -240618124);
                        if (var10001 == null) {
                           var10001 = new byte[(1175912448 | 45498) ^ 1175957938];
                           ((Object[])var10001)[~-1493868024 - -2040949503 ^ -760149770] = (byte)(-786165330 * -803122317 + -1281186571);
                           ((Object[])var10001)[-1282690500 * 763997619 + 532927501] = (byte)(~-293323443 - -2080337274 ^ 1921306619);
                           ((Object[])var10001)[(33554432 | 57507) ^ 33611937] = (byte)(~-886396179 - 908974141 ^ 22577921);
                           ((Object[])var10001)[~1480650848 - 1907526136 ^ 906790308] = (byte)(~-2060837077 - 214019 ^ 2060623046);
                           ((Object[])var10001)[(667877376 | 52150) ^ 667929522] = (byte)(~-2047375242 - 122343899 ^ 1925031358);
                           ((Object[])var10001)[~838066254 - -1264574502 ^ 426508242] = (byte)((-2142896128 | 63549) ^ -2142832573);
                           ((Object[])var10001)[(1097203712 | 1880) ^ 1097205598] = (byte)(~1001038368 - -1883873251 ^ -882834897);
                           ((Object[])var10001)[~786050804 - 94034165 ^ -880084975] = (byte)((-514457600 | 6981) ^ 514450661);
                           var10001 = li_111l1ilI___iI1II_il__li1lI_((byte[])var10001, (-1571553280 | 39135) ^ -1571514159);
                        }

                        var10002 = null;
                        Thread.currentThread().hashCode();
                        JsonElement var9 = var3.get((String)var10001);
                        var10001 = null;
                        Thread.currentThread().hashCode();
                        if (var9.isJsonObject()) {
                           var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII((-43384832 | 63164) ^ -43321677);
                           if (var10001 == null) {
                              var10001 = new byte[~310153315 - -1018866658 ^ 708713334];
                              ((Object[])var10001)[(-640024576 | 38913) ^ -639985663] = (byte)(~1929584923 - -1786632208 ^ 142952736);
                              ((Object[])var10001)[1524900430 * 246165533 + -1655603925] = (byte)(~-1952574995 - -1334203258 ^ -1008189016);
                              ((Object[])var10001)[~-945318892 - -87837898 ^ 1033156791] = (byte)(~-1549707993 - 1334052775 ^ 215655195);
                              ((Object[])var10001)[(317718528 | 5491) ^ 317724016] = (byte)((-67829760 | 64663) ^ 67765082);
                              ((Object[])var10001)[(1489960960 | 42250) ^ 1490003214] = (byte)(-910618466 * 1313296397 + 748079055);
                              ((Object[])var10001)[-1257214353 * 1588171445 + -216031862] = (byte)((-1897332736 | 52943) ^ -1897279840);
                              ((Object[])var10001)[(1824849920 | 39760) ^ 1824889686] = (byte)((982712320 | 3527) ^ -982715857);
                              ((Object[])var10001)[~1454465016 - -1549799791 ^ 95334769] = (byte)(~-1344324612 - 1101621512 ^ 242703002);
                              var10001 = li_111l1ilI___iI1II_il__li1lI_((byte[])var10001, (-535560192 | 8014) ^ -535552191);
                           }

                           var10002 = null;
                           Thread.currentThread().hashCode();
                           JsonObject var5 = var3.getAsJsonObject((String)var10001);
                           var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII(1495883741 * 1235328575 + 917111469);
                           if (var10001 == null) {
                              var10001 = new byte[(-1885077504 | 12030) ^ -1885065483];
                              ((Object[])var10001)[(1429143552 | 337) ^ 1429143889] = (byte)((434765824 | 56180) ^ -434821923);
                              ((Object[])var10001)[-1575642293 * 1638841691 + 1991339352] = (byte)(~-1986607528 - 1709473040 ^ 277134491);
                              ((Object[])var10001)[~-1340889802 - 621259122 ^ 719630677] = (byte)(~-441988764 - 258398792 ^ -183589904);
                              ((Object[])var10001)[433808828 * -1285327383 + 1713208295] = (byte)((621477888 | 53681) ^ -621531613);
                              ((Object[])var10001)[~-767732376 - -557850517 ^ 1325582888] = (byte)(-1018155700 * 601229525 + -1151864877);
                              ((Object[])var10001)[~-1334466887 - 1216626232 ^ 117840651] = (byte)(-1407201113 * 1704243015 + -67464);
                              ((Object[])var10001)[~814178150 - -182641799 ^ -631536346] = (byte)(1486603527 * -63771043 + -1629558112);
                              ((Object[])var10001)[1626423965 * -2091925807 + -433776678] = (byte)((-691208192 | 60101) ^ 691148076);
                              ((Object[])var10001)[1222068946 * -1299315273 + 891775466] = (byte)((171507712 | 15505) ^ 171523326);
                              ((Object[])var10001)[~333533272 - 1851354854 ^ 2110079176] = (byte)((1985347584 | 9250) ^ 1985356804);
                              ((Object[])var10001)[(-2130575360 | 57833) ^ -2130517533] = (byte)(-738074484 * 1164787139 + -1200318040);
                              var10001 = li_111l1ilI___iI1II_il__li1lI_((byte[])var10001, (418643968 | 41072) ^ 418685024);
                           }

                           var10002 = null;
                           Thread.currentThread().hashCode();
                           if (var5.has((String)var10001)) {
                              IOException var10 = new IOException;
                              String var37 = Iil__1il1llIi_1liIIi1_iI_1iiiII(1528982955 * 782910831 + -1493869588);
                              if (var37 == null) {
                                 byte[] var38 = new byte[~-2136013430 - -958310245 ^ -1200643631];
                                 var38[(1543831552 | 43133) ^ 1543874685] = (byte)(-1174840193 * -211688123 + 921532033);
                                 var38[~-871886418 - -1284102261 ^ -2138978617] = (byte)(~635528459 - 2081761209 ^ -1577677656);
                                 var38[~545548825 - -414884331 ^ -130664493] = (byte)((-2081947648 | 473) ^ -2081947231);
                                 var38[(1507524608 | 37054) ^ 1507561661] = (byte)(200344072 * 846606461 + 2067825216);
                                 var38[396077783 * -1121748641 + -1827210437] = (byte)((-1017511936 | 12425) ^ 1017499478);
                                 var38[(-1454833664 | 64858) ^ -1454768801] = (byte)(~-509628580 - 1624956905 ^ 1115328260);
                                 var38[(1709375488 | 63618) ^ 1709439108] = (byte)(-2079948652 * 1192526455 + 1008669371);
                                 var38[~1809403188 - 1645943345 ^ 839620765] = (byte)((-1654521856 | 59491) ^ -1654462411);
                                 var38[~-2052188481 - -1543001585 ^ -699777223] = (byte)(-1457477604 * -761611269 + 961984553);
                                 var38[1699153630 * 1543618823 + -536645129] = (byte)(~1899185121 - 1174291801 ^ -1221490314);
                                 var38[-472179735 * -2077995533 + -1092916001] = (byte)((-1945763840 | 16234) ^ 1945747608);
                                 var37 = li_111l1ilI___iI1II_il__li1lI_(var38, ~-1215829085 - 1041932305 ^ 173896794);
                              }

                              Object var10004 = null;
                              Thread.currentThread().hashCode();
                              var10002 = var5.get(var37);
                              var37 = null;
                              Thread.currentThread().hashCode();
                              String var35 = var10002.getAsString();
                              var37 = null;
                              Thread.currentThread().hashCode();
                              var10./* $VF: Unable to resugar constructor */<init>(var35);
                              throw var10;
                           }
                        }
                     }

                     Object var10003 = null;
                     Thread.currentThread().hashCode();
                     String var33 = var3.toString();
                     var10003 = null;
                     Thread.currentThread().hashCode();
                     throw new IOException(var33);
                  }
               }
            }
         }
      }
   }

   private static IlI1I_l1__1II1ii_I_l1II_iIIiI I_i_i_lIllIlI1I1_I___l11l() throws IOException {
      int var1 = System.identityHashCode(null);
      if ((var1 * (var1 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         IOException var7 = null;
         int var2 = ~653066717 - 1556611207 ^ 2085289371;

         while (var2 < (~540371310 - -1944425640 ^ 1404054323)) {
            Object var10000 = null;
            Thread.currentThread().hashCode();
            if (I__iIllIIl__1IIIi__i1_il11i_l()) {
               try {
                  Object var15 = null;
                  Thread.currentThread().hashCode();
                  String var10 = "\\\\?\\pipe\\discord-ipc-" + var2;
                  var15 = null;
                  Thread.currentThread().hashCode();
                  return new il1Il11I__li1illliIIii_II_i_i(var10);
               } catch (IOException var6) {
                  try {
                     Object var10003 = null;
                     Thread.currentThread().hashCode();
                     String var10002 = "\\\\.\\pipe\\discord-ipc-" + var2;
                     var10003 = null;
                     Thread.currentThread().hashCode();
                     return new il1Il11I__li1illliIIii_II_i_i(var10002);
                  } catch (IOException var5) {
                     var7 = var5;
                     if ((~-1681822839 - -1086601609 ^ 1246935583) != 1565963374 * 2094723041 + 100479282) {
                     }
                  }
               }
            } else {
               label49: {
                  try {
                     Object var10001 = null;
                     Thread.currentThread().hashCode();
                     Path var3 = IIII_ll__IiIiI_I_llI_IiIl1(var2);
                     var10001 = new LinkOption[~224535316 - 769490488 ^ -994025805];
                     Object var11 = null;
                     Thread.currentThread().hashCode();
                     if (Files.exists(var3, (LinkOption[])var10001)) {
                        Object var17 = null;
                        Thread.currentThread().hashCode();
                        return new Ill111II11ilI1_iIlI1Il(var3);
                     }
                  } catch (IOException var4) {
                     var7 = var4;
                     break label49;
                  }

                  if ((~1966851588 - -888451167 ^ 2128950223) != ((395051008 | 13366) ^ -690885213)) {
                  }
               }
            }

            var2++;
            if ((~-511397167 - -1717372068 ^ 50506723) != 789372051 * -575990017 + 1374003652) {
            }
         }

         IOException var8 = new IOException;
         String var12 = Iil__1il1llIi_1liIIi1_iI_1iiiII(-1357447899 * 248516933 + -1813098471);
         if (var12 == null) {
            byte[] var13 = new byte[(1350434816 | 9993) ^ 1350444819];
            var13[(-880214016 | 48284) ^ -880165732] = (byte)(~-930529004 - -1581985068 ^ -1782453133);
            var13[(-625147904 | 52837) ^ -625095068] = (byte)(-15524497 * 1735933047 + 2117029293);
            var13[930827479 * -1715082623 + -1238449749] = (byte)((-564002816 | 8629) ^ 563994228);
            var13[-1727285494 * 452610603 + 609967445] = (byte)(~1879300495 - -1430558119 ^ -448742376);
            var13[1460943598 * -756325181 + 1880630458] = (byte)((592642048 | 39699) ^ -592681798);
            var13[-442564859 * -1910687825 + 905222298] = (byte)(~-2055500649 - 1027957255 ^ 1027543406);
            var13[~374301952 - 1806916224 ^ 2113749113] = (byte)((1638400000 | 36442) ^ -1638436392);
            var13[~-1143182880 - -2069354554 ^ -1082429858] = (byte)(-991343857 * 556978031 + 1664701217);
            var13[44801796 * 1367057203 + -2036087236] = (byte)(~1894896473 - -38591772 ^ 1856304723);
            var13[(-769982464 | 43796) ^ -769938659] = (byte)((-495779840 | 3539) ^ 495776368);
            var13[~1696043643 - -2098228966 ^ 402185312] = (byte)(~-414476107 - -1200570865 ^ 1615047003);
            var13[~557959340 - 1033163276 ^ -1591122612] = (byte)(~-1286715291 - -1412420186 ^ -1595831922);
            var13[(-505610240 | 39520) ^ -505570708] = (byte)((-2043412480 | 57436) ^ -2043355083);
            var13[-1361431165 * 211909499 + 1510955292] = (byte)(2041804371 * 1444659865 + -414031300);
            var13[~2060201073 - -184816688 ^ -1875384400] = (byte)((853278720 | 63047) ^ 853341819);
            var13[2060938749 * -1575413403 + -1483807170] = (byte)((-1320091648 | 60257) ^ -1320031454);
            var13[~1305052161 - 940592079 ^ 2049323071] = (byte)(-140815039 * 474296661 + -141148126);
            var13[(-1046544384 | 45882) ^ -1046498517] = (byte)(~1092182513 - -1381055048 ^ -288872538);
            var13[~1841822875 - -617279818 ^ -1224543044] = (byte)(-2083446570 * 1759329211 + 988656046);
            var13[~301111370 - -501650033 ^ 200538677] = (byte)(~-168206598 - -1388029744 ^ 1556236338);
            var13[-1191100217 * 1770971957 + 149627361] = (byte)((-334823424 | 10691) ^ 334812798);
            var13[~1893219398 - 260293251 ^ 2141454627] = (byte)(~-1720809893 - 1727982298 ^ -7172424);
            var13[1939686134 * 378690629 + -29324344] = (byte)((491651072 | 8920) ^ 491660026);
            var13[~1204440780 - 843902101 ^ -2048342903] = (byte)((-1445789696 | 26579) ^ -1445763177);
            var13[~357993610 - -317748314 ^ -40245289] = (byte)(-1896272506 * 1414587325 + 1288409710);
            var13[564596926 * 2023122275 + 863342751] = (byte)(736095407 * -911612697 + 1402900988);
            var12 = li_111l1ilI___iI1II_il__li1lI_(var13, (-1194524672 | 48465) ^ -1194476221);
         }

         Object var10004 = null;
         Thread.currentThread().hashCode();
         var8./* $VF: Unable to resugar constructor */<init>(var12, var7);
         throw var8;
      }
   }

   private static Path IIII_ll__IiIiI_I_llI_IiIl1(int param0) {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         String var10000 = Iil__1il1llIi_1liIIi1_iI_1iiiII((743833600 | 56714) ^ 743890329);
         if (var10000 == null) {
            byte[] var4 = new byte[~-511374561 - 711233732 ^ -199859185];
            var4[175654826 * -1110427109 + -386667246] = (byte)(~-1786101794 - 927197689 ^ 858904099);
            var4[1742129377 * 1205187381 + -941746580] = (byte)((1263796224 | 34052) ^ 1263830353);
            var4[2132778259 * -1362335797 + 1687670001] = (byte)(~1269286889 - -15619191 ^ -1253667642);
            var4[~-1339212180 - 1195610774 ^ 143601406] = (byte)(625984712 * 1446730527 + -1773399085);
            var4[(-421330944 | 43708) ^ -421287240] = (byte)((1834614784 | 7616) ^ 1834622404);
            var4[(-1357512704 | 10536) ^ -1357502163] = (byte)((-917569536 | 2190) ^ -917567331);
            var4[(-1799618560 | 23293) ^ -1799595269] = (byte)(-409513106 * 1888707917 + -1687715471);
            var4[-1027838799 * 352741967 + -776787096] = (byte)(~-1006594043 - -1153000744 ^ -2135372463);
            var4[(-1065746432 | 22251) ^ -1065724189] = (byte)(30714681 * 85143871 + 94958597);
            var4[-728512139 * 2046624123 + -476856366] = (byte)((150077440 | 59784) ^ -150137221);
            var4[~-218016278 - -1294970740 ^ 1512987011] = (byte)(-1251386437 * -110772157 + 1826209396);
            var4[~1605036119 - -2052647687 ^ 447611556] = (byte)(~96830122 - 796600025 ^ 893430213);
            var4[1368488175 * 1271268089 + -122322539] = (byte)((-1595998208 | 52723) ^ 1595945556);
            var4[~-1485389749 - -2009043752 ^ -800533807] = (byte)(~540844489 - 1978560420 ^ -1775562461);
            var4[~1722921098 - 1227567052 ^ 1344479143] = (byte)((478085120 | 996) ^ -478086025);
            var4[-1357677101 * 835336855 + -1518273894] = (byte)(~2017336268 - -134981701 ^ 1882354685);
            var4[~-729007311 - -1637196526 ^ -1928763476] = (byte)((31588352 | 61275) ^ 31649542);
            var4[~140183316 - 1609941538 ^ -1750124840] = (byte)(~1020742262 - -538899088 ^ -481843114);
            var4[(105709568 | 52606) ^ 105762156] = (byte)((-1945763840 | 42125) ^ 1945721724);
            var10000 = li_111l1ilI___iI1II_il__li1lI_(var4, ~-1959043830 - 781990584 ^ 1177053230);
         }

         Object var10001 = null;
         Thread.currentThread().hashCode();
         String var3 = IIIilIIll_1_lIi_1_1ilI(var10000);
         if (var3 == null) {
            var10000 = Iil__1il1llIi_1liIIi1_iI_1iiiII((-50397184 | 15750) ^ -50381422);
            if (var10000 == null) {
               byte[] var6 = new byte[2051481591 * 600740189 + -850625457];
               var6[(1964048384 | 5052) ^ 1964053436] = (byte)((487522304 | 60155) ^ 487582345);
               var6[~387932300 - -906841682 ^ 518909380] = (byte)(-1018112014 * 1114639203 + 546641741);
               var6[(-689766400 | 45313) ^ -689721085] = (byte)(1926153604 * 1877409417 + -1228450606);
               var6[1201964420 * -236932585 + 333592871] = (byte)(1938249768 * 862911221 + 1781633388);
               var6[(507969536 | 31321) ^ 508000861] = (byte)(~202881423 - -1181216070 ^ 978334700);
               var6[~385864038 - 543682457 ^ -929546491] = (byte)(-2037594033 * -1296280575 + 1068846046);
               var6[1431194860 * 693243915 + 20705762] = (byte)((-1602813952 | 31359) ^ -1602782626);
               var6[(-822673408 | 31404) ^ -822642005] = (byte)(~57273986 - 651348208 ^ -708622184);
               var6[~70683858 - -1580519613 ^ 1509835746] = (byte)((-2076901376 | 26369) ^ -2076874944);
               var6[~1920571455 - 689254064 ^ 1685141785] = (byte)(~-1417742429 - -646392008 ^ -2064134487);
               var10000 = li_111l1ilI___iI1II_il__li1lI_(var6, 543816901 * 806556387 + 463471461);
            }

            var10001 = null;
            Thread.currentThread().hashCode();
            var3 = IIIilIIll_1_lIi_1_1ilI(var10000);
         }

         if (var3 == null) {
            var10000 = Iil__1il1llIi_1liIIi1_iI_1iiiII(1235416053 * -286626991 + -746100592);
            if (var10000 == null) {
               byte[] var8 = new byte[(149618688 | 32290) ^ 149650986];
               var8[(-1071120384 | 14763) ^ -1071105621] = (byte)(1348511796 * 104303921 + 95365624);
               var8[281355477 * 1925783751 + -1930903954] = (byte)(~510635111 - -1980503145 ^ 1469868090);
               var8[~1287399772 - 2119139058 ^ 888428467] = (byte)((410255360 | 21118) ^ -410276366);
               var8[-406150688 * -2076948745 + -1850044189] = (byte)((-331808768 | 42819) ^ 331765977);
               var8[(1436155904 | 617) ^ 1436156525] = (byte)(~-1003562674 - 960214213 ^ -43348429);
               var8[~1321092884 - -2110471071 ^ 789378191] = (byte)((2058616832 | 32784) ^ 2058649702);
               var8[(-1848836096 | 21956) ^ -1848814142] = (byte)(-979342820 * 1918292293 + -1480947142);
               var8[~1563766019 - -1900730462 ^ 336964445] = (byte)((1087569920 | 6798) ^ 1087576825);
               var10000 = li_111l1ilI___iI1II_il__li1lI_(var8, ~222908113 - -386531989 ^ 163623894);
            }

            var3 = var10000;
         }

         var10001 = new String[~1117902006 - 2088878246 ^ 1088187042];
         int var10003 = 448690104 * -1035144253 + -626579752;
         Object var10005 = null;
         Thread.currentThread().hashCode();
         ((Object[])var10001)[var10003] = "discord-ipc-" + var0;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         return Path.of(var3, (String[])var10001);
      }
   }

   private static boolean I__iIllIIl__1IIIi__i1_il11i_l() {
      int var1 = System.identityHashCode(null);
      if ((var1 * (var1 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         String var10000 = Iil__1il1llIi_1liIIi1_iI_1iiiII(-1411043865 * -468462083 + 1261137867);
         if (var10000 == null) {
            byte[] var2 = new byte[~1369111802 - 1366192812 ^ 1559662674];
            var2[~-1757876408 - -908035471 ^ -1629055418] = (byte)((-711852032 | 35824) ^ 711816204);
            var2[(-1644232704 | 20629) ^ -1644212076] = (byte)(432825748 * -869939847 + -439019363);
            var2[~-138141274 - -1754840380 ^ 1892981655] = (byte)(1421440801 * -756508615 + -66002641);
            var2[845653197 * 23037313 + -871074890] = (byte)((637927424 | 64923) ^ -637992327);
            var2[-1950181686 * -1172354125 + 1045258950] = (byte)(~1776480988 - -145885040 ^ -1630595908);
            var2[(-1825177600 | 2365) ^ -1825175240] = (byte)((714866688 | 62793) ^ 714929513);
            var2[~101136421 - -23645928 ^ -77490492] = (byte)(~52047700 - -338406722 ^ -286358997);
            var2[2076419356 * 617557021 + -388924453] = (byte)(~1163922428 - -522057901 ^ 641864480);
            var2[581612267 * 767040907 + -282838161] = (byte)(1454703502 * -678180717 + 2126382515);
            var2[-1237736971 * -1036163147 + -1212814640] = (byte)((1692073984 | 8696) ^ -1692082630);
            var2[(-657326080 | 48699) ^ -657277391] = (byte)(-984990758 * -1697900335 + 588297082);
            var10000 = li_111l1ilI___iI1II_il__li1lI_(var2, 207072497 * -714328205 + 600410323);
         }

         String var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII((-1984299008 | 17177) ^ -1984281842);
         if (var10001 == null) {
            byte[] var5 = new byte[(1037893632 | 17882) ^ 1037911518];
            var5[1563682396 * 1631284223 + -2066672036] = (byte)(1414293790 * 1025982407 + -2127960152);
            var5[~-607621144 - 690058045 ^ -82436901] = (byte)(103715826 * -1995428859 + 512328685);
            var5[2059523036 * 859738377 + -1024986810] = (byte)(2027985641 * 1964519845 + 381521522);
            var5[-150301334 * -13029823 + -2065890279] = (byte)(-646984478 * -2125762923 + 2142151673);
            var10001 = li_111l1ilI___iI1II_il__li1lI_(var5, -2073299222 * -557785753 + 1760011761);
         }

         Object var10002 = null;
         Thread.currentThread().hashCode();
         var10000 = System.getProperty(var10000, var10001);
         var10001 = null;
         Thread.currentThread().hashCode();
         var10000 = var10000.toLowerCase();
         var10001 = Iil__1il1llIi_1liIIi1_iI_1iiiII((977076224 | 58828) ^ 977135060);
         if (var10001 == null) {
            byte[] var8 = new byte[1186425738 * 1013201445 + -549965547];
            var8[1898082977 * 559582515 + 1868987629] = (byte)((2001993728 | 30570) ^ 2002024252);
            var8[873653480 * -1268128303 + -1834510695] = (byte)(~-1180094579 - -752714476 ^ 1932809021);
            var8[~-38599764 - -534607341 ^ 573207106] = (byte)(~1317175231 - 637002976 ^ 1954178196);
            var8[-959562402 * 751462967 + 1344005329] = (byte)((1494548480 | 6768) ^ 1494555143);
            var8[(-1976762368 | 22067) ^ -1976740297] = (byte)((-608763904 | 33730) ^ -608730227);
            var8[-1505729125 * -1026117867 + -240077490] = (byte)((1025900544 | 20606) ^ -1025921098);
            var8[(-1183776768 | 60545) ^ -1183716217] = (byte)(-1371655464 * 1401215795 + -725805277);
            var10001 = li_111l1ilI___iI1II_il__li1lI_(var8, ~-933696868 - -96172366 ^ 1029869225);
         }

         var10002 = null;
         Thread.currentThread().hashCode();
         return var10000.contains(var10001);
      }
   }

   private static String IIIilIIll_1_lIi_1_1ilI(String param0) {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10001 = null;
         Thread.currentThread().hashCode();
         String var3 = System.getenv(var0);
         if (var3 != null) {
            var10001 = null;
            Thread.currentThread().hashCode();
            if (!var3.isBlank()) {
               return var3;
            }
         }

         return null;
      }
   }
}
