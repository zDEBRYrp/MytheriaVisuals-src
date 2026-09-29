package II1II1II1II1II1II1II1II1.l5_I4;

import II1II1II1II1II1II1II1II1.I2_i1.Ili_li1lli_Ii1111i1i_iI__ll1Ii;
import java.awt.Color;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class l1Iil1_lllilIi1IIIi_i1l_1__i extends liIi1IIl_il1IIlIll1Il_1II {
   public static final List<Color> I_I1Il_iiil1I_1llIiIi_;
   private Color I1i_Il1ilIliilIlIi1_1ii1;
   public static final char[][] i_l1iI_Ii1_I1__ii1lI_1_lllIiii_ = new char[(-735641600 | 58463) ^ -735583203][];

   public l1Iil1_lllilIi1IIIi_i1l_1__i(String param1, Color nullx) {
      super(var1);
      this.setColor(nullx);
   }

   public Color getColor() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.I1i_Il1ilIliilIlIi1_1ii1;
      }
   }

   public void setColor(Color param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10004 = null;
         Thread.currentThread().hashCode();
         int var10003 = var1.getRed();
         Object var10005 = null;
         Thread.currentThread().hashCode();
         int var4 = var1.getGreen();
         Object var10006 = null;
         Thread.currentThread().hashCode();
         int var5 = var1.getBlue();
         var10006 = null;
         Thread.currentThread().hashCode();
         this.I1i_Il1ilIliilIlIi1_1ii1 = new Color(var10003, var4, var5);
      }
   }

   public int getRGB() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Color var10000 = this.I1i_Il1ilIliilIlIi1_1ii1;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         return var10000.getRGB() & (~243791413 - -927638245 ^ 675107664);
      }
   }

   public void setRGB(int param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         int var10003 = var1 & ((371785728 | 42642) ^ 383146349);
         Object var10004 = null;
         Thread.currentThread().hashCode();
         this.I1i_Il1ilIliilIlIi1_1ii1 = new Color(var10003);
      }
   }

   public String hex() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         String var10000 = I__Iili_1l1_lll1IIllI_I1l_ii_(2029081427 * 1700528689 + 1179936541);
         if (var10000 == null) {
            byte[] var3 = new byte[(-1061814272 | 58948) ^ -1061755315];
            var3[-669938471 * 827676891 + -746263971] = (byte)((-64028672 | 47952) ^ 63980748);
            var3[(-1604059136 | 45399) ^ -1604013738] = (byte)((-98566144 | 29494) ^ -98536587);
            var3[~669276295 - 626667340 ^ -1295943634] = (byte)(656881053 * 1470808271 + -103553545);
            var3[(940638208 | 65366) ^ 940703573] = (byte)((720175104 | 27068) ^ -720202182);
            var3[~-429599998 - -1905648477 ^ -1959718818] = (byte)((-657391616 | 1654) ^ -657390017);
            var3[~655581551 - 1840226008 ^ 1799159741] = (byte)(~-1646375931 - 1008347394 ^ 638028527);
            var3[(358285312 | 49958) ^ 358335264] = (byte)(~-1793016881 - 514847831 ^ -1278168998);
            var3[(-72286208 | 11656) ^ -72274545] = (byte)((1890320384 | 50915) ^ -1890371277);
            var3[~110920170 - -613132758 ^ 502212579] = (byte)(1595408481 * -878750925 + 517569038);
            var10000 = i1iI__1l1IlIlIlI_lII1i(var3, ~-1825104160 - 1183213363 ^ 641890796);
         }

         Object[] var10001 = new Object[~-1898709383 - 1854394934 ^ 44314449];
         int var10003 = -963170559 * -1850832757 + 1464005237;
         Object var10005 = null;
         Thread.currentThread().hashCode();
         int var10004 = this.getRGB();
         var10005 = null;
         Thread.currentThread().hashCode();
         var10001[var10003] = var10004;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         return String.format(var10000, var10001);
      }
   }

   public void cycle(int param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         var3 = -1163179516 * -2094125835 + -1868465620;
         int var4 = (1456209920 | 13991) ^ 1456223911;

         while (true) {
            List var10001 = I_I1Il_iiil1I_1llIiIi_;
            Object var10002 = null;
            Thread.currentThread().hashCode();
            if (var4 >= var10001.size()) {
               break;
            }

            List var10000 = I_I1Il_iiil1I_1llIiIi_;
            var10002 = null;
            Thread.currentThread().hashCode();
            Color var7 = (Color)var10000.get(var4);
            var10001 = null;
            Thread.currentThread().hashCode();
            int var8 = var7.getRGB() & ((-263520256 | 29967) ^ -256603408);
            var10002 = null;
            Thread.currentThread().hashCode();
            if (var8 == this.getRGB()) {
               var3 = var4;
               break;
            }

            var4++;
         }

         int var9 = var3 + var1;
         List var13 = I_I1Il_iiil1I_1llIiIi_;
         Object var20 = null;
         Thread.currentThread().hashCode();
         var9 %= var13.size();
         var13 = I_I1Il_iiil1I_1llIiIi_;
         var20 = null;
         Thread.currentThread().hashCode();
         var9 += var13.size();
         var13 = I_I1Il_iiil1I_1llIiIi_;
         var20 = null;
         Thread.currentThread().hashCode();
         var4 = var9 % var13.size();
         var13 = I_I1Il_iiil1I_1llIiIi_;
         Object var10003 = null;
         Thread.currentThread().hashCode();
         Color var17 = (Color)var13.get(var4);
         var20 = null;
         Thread.currentThread().hashCode();
         this.setColor(var17);
      }
   }

   public static Color IIiIi11iI1Ilil1iiii1Ill1(Il1_1_i1i_1__ll1_1_111i_11i1i param0, l1Iil1_lllilIi1IIIi_i1l_1__i nullx) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         Object var10001 = null;
         Thread.currentThread().hashCode();
         Color var4;
         if (var0.isValue()) {
            Object var10000 = null;
            Thread.currentThread().hashCode();
            var4 = Ili_li1lli_Ii1111i1i_iI__ll1Ii.IiIlIl_I1liIi1_IIIIi1li1l();
         } else {
            var10001 = null;
            Thread.currentThread().hashCode();
            var4 = nullx.getColor();
         }

         return var4;
      }
   }

   static {
      Color[] var10000 = new Color[-1799196001 * 342066787 + -246320491];
      var10000[423544307 * 744422199 + -1808517173] = new Color(
         (-622133248 | 42930) ^ -622090290, 642534101 * -1018745489 + -72278694, (1567621120 | 8989) ^ 1567630306
      );
      var10000[(1406205952 | 63129) ^ 1406269080] = new Color(
         ~-934704240 - 86890295 ^ 847813959, 1330838689 * -1770345495 + -1543600373, 1123123984 * -1245965225 + -772852115
      );
      var10000[(312541184 | 62624) ^ 312603810] = new Color(
         (316735488 | 19306) ^ 316754883, (2114650112 | 54660) ^ 2114704654, ~1878784085 - 1282362670 ^ 1133820556
      );
      var10000[185090807 * 818875305 + -420336140] = new Color(
         119932871 * 641591131 + -1072976879, ~-397032309 - 1427896436 ^ -1030863989, ~1125942219 - 1339758899 ^ 1829266409
      );
      var10000[313309970 * -769420725 + -1388384834] = new Color(
         ~1529907924 - 426671216 ^ -1956579260, ~-1488107755 - -2074526913 ^ -732332767, ~-248935595 - 915574389 ^ -666638691
      );
      var10000[(2031550464 | 44378) ^ 2031594847] = new Color(
         ~-1947504808 - -157712566 ^ 2105217453, ~-1507394004 - 1854821268 ^ -347427244, ~-1204791605 - 335722705 ^ 869068822
      );
      var10000[(-1738866688 | 8563) ^ -1738858123] = new Color(
         ~-374888955 - -495575141 ^ 870464160, 2107160862 * 894644715 + 1051022333, -884119694 * 1627736335 + -860000579
      );
      var10000[(-1856176128 | 5797) ^ -1856170334] = new Color(
         ~-1967775338 - -387150666 ^ -1940041396, 668299452 * -617164409 + 566235524, 1009076871 * -805693549 + 739120119
      );
      var10000[~-1256359117 - -278261913 ^ 1534621037] = new Color(
         1302527246 * 1902514311 + -576213347, (684064768 | 62058) ^ 684126936, ~-1317857554 - 1409973369 ^ -92115755
      );
      var10000[-426065990 * 2038227201 + 1321911887] = new Color(
         (-669057024 | 47527) ^ -669009579, (1028784128 | 52415) ^ 1028836471, ~162398740 - 1516955240 ^ -1679353883
      );
      var10000[(-132186112 | 38201) ^ -132147917] = new Color(
         ~577290334 - -124297014 ^ -452993516, ~-1213772707 - -1738716656 ^ -1342477958, 654621139 * -376587693 + -2042793199
      );
      var10000[(581500928 | 28257) ^ 581529194] = new Color(
         (-151781376 | 13009) ^ -151768411, 1081829881 * -1646784501 + 1694163750, -739988120 * 856662753 + 758106184
      );
      var10000[(-1218183168 | 30205) ^ -1218152975] = new Color(
         ~-1626389682 - -921351682 ^ -1747225860, (1753022464 | 16666) ^ 1753039325, (-176226304 | 17372) ^ -176209066
      );
      var10000[-772298355 * 345700235 + 119399806] = new Color(
         ~1370772701 - 1065973665 ^ 1858221021, (-1066663936 | 9202) ^ -1066654917, -1247949135 * -1700096925 + -856637871
      );
      var10000[~531683655 - 1472241444 ^ -2003925094] = new Color(
         -1297315752 * -931315431 + 1804621783, (714801152 | 23285) ^ 714824237, ~-2098613259 - -63637070 ^ -2132716888
      );
      var10000[(564330496 | 13552) ^ 564344063] = new Color(
         241002872 * -1702683099 + -776228249, 1344014440 * 1439259511 + -1437392763, 380040693 * 1864876073 + 1937235128
      );
      var10000[148797869 * 2106885645 + 1207911495] = new Color(
         224865511 * 1891679135 + -1847697274, -663085015 * -2034505429 + -2008790971, ~793479566 - -230552954 ^ -562926653
      );
      var10000[~778740643 - -1528724724 ^ 749984065] = new Color(
         ~-1919673439 - 937262947 ^ 982410244, (-895746048 | 15048) ^ -895731145, -1977840371 * 347561601 + 327624562
      );
      I_I1Il_iiil1I_1llIiIi_ = List.of(var10000);
   }
}
