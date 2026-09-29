package II1II1II1II1II1II1II1II1.l0_I9;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class l1iil1_lill1II11ll_11i {
   private static final l1iil1_lill1II11ll_11i iiil_lI1l_i_I1_1I1lIlIl11i1ii = new l1iil1_lill1II11ll_11i();
   private final Queue<l1iil1_lill1II11ll_11i.li_l1iil_i1lI1_IIiI1_1111I> lII1__11111i1i_iiiiI_11l = new ConcurrentLinkedQueue<>();
   private final Object i_i1ll11l_1i1l1l__ll1i111I = new Object();
   private volatile IMediaSession li1lIi1_lI_1lil1I_lII1II;
   private volatile boolean lI1iiI11_llIliIlli11_lII_1lII1;
   private volatile long I_II1i1_Iii1l_lI1I111l1I1;
   private volatile boolean Ii1Ii_i__i_1ii_111ili_1IiiIIiI = (boolean)(-1323739299 * 1426308177 + 1941704596);
   private volatile boolean i11liIlIl1iI_iil_11_ll1IiIIi;
   private volatile String II1_iIIiilI__iiIiii__i;
   private volatile String l1Iill1l1lII___IlIIl_IIlI__1;
   private volatile byte[] ii_Il11Iii1I1i1IllII1I_il_iIiiI;
   private volatile long I____iIiiilI1_lIl_Ii___iI;
   private volatile boolean I111_1l11__1_iillI1_1lllIl_;
   private volatile long i1lII__1iiliiI_1_1il_lIlII_;
   private volatile long ii1iIIl_1llIl1iIilIl_ll;
   private Thread iiI_Ii111_llillil_I1i_;
   public static final char[][] IIi1ii11III_1lI1l1_1I_li = new char[~-320837607 - -1863003081 ^ -2111126531][];

   private l1iil1_lill1II11ll_11i() {
      String var10001 = iiIIiiillIl1l_I_l1I_1lI___((1595080704 | 43151) ^ 1595123855);
      if (var10001 == null) {
         byte[] var1 = new byte[(-2145386496 | 16300) ^ -2145370200];
         var1[-30625815 * 1554913823 + 1650133193] = (byte)(~-922009620 - 1009929132 ^ -87919603);
         var1[~-1936870303 - 1615210242 ^ 321660061] = (byte)((1381695488 | 30783) ^ 1381726326);
         var1[(-1323433984 | 36443) ^ -1323397543] = (byte)((1662976000 | 33705) ^ -1663009723);
         var1[~-1931909830 - -1742995885 ^ -620061583] = (byte)(-599353830 * 1079591297 + 1699201844);
         var10001 = IlIIlli1_1i_liiliiIiI11I_I(var1, (-358547456 | 59638) ^ -358487818);
      }

      this.II1_iIIiilI__iiIiii__i = var10001;
      var10001 = iiIIiiillIl1l_I_l1I_1lI___(~-878192663 - -1010265080 ^ 1888457743);
      if (var10001 == null) {
         byte[] var3 = new byte[-1127100248 * -965761887 + 1837639260];
         var3[2073364391 * 1808823057 + -738559767] = (byte)(~1425844349 - 1516847269 ^ -1352275675);
         var3[~682728520 - -475547807 ^ -207180713] = (byte)(~-216027422 - 1649440803 ^ -1433413492);
         var3[~-537137896 - 592657934 ^ -55520037] = (byte)(-861266328 * 2011470761 + 1990784449);
         var3[~1967911944 - -1215135819 ^ -752776127] = (byte)(1581862833 * 1024770313 + 58966515);
         var10001 = IlIIlli1_1i_liiliiIiI11I_I(var3, ~346860631 - -1030801579 ^ 683940946);
      }

      this.l1Iill1l1lII___IlIIl_IIlI__1 = var10001;
   }

   public static l1iil1_lill1II11ll_11i Ii__1liIlll_Il_l_Iii_l_II11_iI() {
      int var1 = System.identityHashCode(null);
      if ((var1 * (var1 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return iiil_lI1l_i_I1_1I1lIlIl11i1ii;
      }
   }

   public synchronized void start() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else if (!this.i11liIlIl1iI_iil_11_ll1IiIIi && this.Ii1Ii_i__i_1ii_111ili_1IiiIIiI) {
         this.i11liIlIl1iI_iil_11_ll1IiIIi = (boolean)(-2067608636 * -1484524019 + -251572467);
         Thread var10001 = new Thread;
         Object var10004 = null;
         Thread.currentThread().hashCode();
         Runnable var10003 = this::IiI_i_I1_lI_i_l11i1I11Il_I_lI1;
         var10004 = iiIIiiillIl1l_I_l1I_1lI___(-44392393 * 635867801 + 17621283);
         if (var10004 == null) {
            var10004 = new byte[269406611 * 1737903379 + 1757100841];
            ((Object[])var10004)[535170684 * -684609719 + -1178395996] = (byte)((-1942028288 | 28099) ^ -1942000133);
            ((Object[])var10004)[(-78053376 | 52380) ^ -78000995] = (byte)(-699188864 * 1464616531 + 793467825);
            ((Object[])var10004)[~280330458 - 559651811 ^ -839982272] = (byte)((1329070080 | 13640) ^ 1329083761);
            ((Object[])var10004)[~-1105514883 - 931443940 ^ 174070941] = (byte)(~1233214987 - -1099339311 ^ -133875596);
            ((Object[])var10004)[~875774693 - 75995480 ^ -951770170] = (byte)(-1064412131 * -1619634909 + -275396949);
            ((Object[])var10004)[-1806572732 * -1050926683 + -394477263] = (byte)((-837222400 | 20077) ^ -837202411);
            ((Object[])var10004)[1121526294 * 101908195 + 1612247684] = (byte)(-913669145 * -2034102565 + 607946646);
            ((Object[])var10004)[-1920424568 * -1215421909 + 178266671] = (byte)(-1007711150 * -1881352515 + -1268720871);
            ((Object[])var10004)[1019638374 * -1742077797 + -551764922] = (byte)((-1795293184 | 41567) ^ -1795251589);
            ((Object[])var10004)[-713918531 * -1426891967 + -218600948] = (byte)(~-25418431 - 1043441255 ^ -1018022808);
            ((Object[])var10004)[-1959835389 * -618829167 + -1079679145] = (byte)((-1532952576 | 7386) ^ -1532945248);
            ((Object[])var10004)[~1038333167 - 1568048535 ^ 1688585586] = (byte)((-1549533184 | 34463) ^ -1549498712);
            ((Object[])var10004)[~56386786 - -1380670799 ^ 1324284000] = (byte)((-1068433408 | 32364) ^ -1068401028);
            ((Object[])var10004)[(-1660944384 | 60196) ^ -1660884183] = (byte)((715849728 | 37443) ^ 715887190);
            ((Object[])var10004)[~325959381 - 180218473 ^ -506177841] = (byte)(~1266053542 - 1670295736 ^ -1358618085);
            ((Object[])var10004)[(-713621504 | 53446) ^ -713568055] = (byte)(1315883016 * -149642003 + 313241640);
            ((Object[])var10004)[(829030400 | 1737) ^ 829032153] = (byte)(1937077184 * -1769410229 + -1667279270);
            ((Object[])var10004)[~-935917631 - 478254944 ^ 457662671] = (byte)(~-1754863773 - 1811690047 ^ 56826353);
            var10004 = IlIIlli1_1i_liiliiIiI11I_I((byte[])var10004, (113180672 | 61357) ^ 113242031);
         }

         Object var10005 = null;
         Thread.currentThread().hashCode();
         var10001./* $VF: Unable to resugar constructor */<init>(var10003, (String)var10004);
         this.iiI_Ii111_llillil_I1i_ = var10001;
         Thread var10000 = this.iiI_Ii111_llillil_I1i_;
         int var4 = (-1715339264 | 22269) ^ -1715316996;
         Object var10002 = null;
         Thread.currentThread().hashCode();
         var10000.setDaemon((boolean)var4);
         var10000 = this.iiI_Ii111_llillil_I1i_;
         Object var5 = null;
         Thread.currentThread().hashCode();
         var10000.start();
      }
   }

   public synchronized void stop() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         this.i11liIlIl1iI_iil_11_ll1IiIIi = (boolean)((382009344 | 52555) ^ 382061899);
         this.iiI_Ii111_llillil_I1i_ = null;
         this.li1lIi1_lI_1lil1I_lII1II = null;
         Queue var10000 = this.lII1__11111i1i_iiiiI_11l;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         var10000.clear();
         var10001 = iiIIiiillIl1l_I_l1I_1lI___(-81357284 * 1835519193 + 191394375);
         if (var10001 == null) {
            var10001 = new byte[-1979828501 * -1526803347 + -1340210699];
            ((Object[])var10001)[(335216640 | 41992) ^ 335258632] = (byte)(-876871643 * 89841937 + 1986099244);
            ((Object[])var10001)[(531496960 | 58197) ^ 531555156] = (byte)(~-210190387 - 65806705 ^ 144383731);
            ((Object[])var10001)[(-1902575616 | 50654) ^ -1902524964] = (byte)(~884705825 - -431456995 ^ 453248843);
            ((Object[])var10001)[-2043269162 * -965645623 + -1909467907] = (byte)(2137905018 * -288158247 + 1650796493);
            var10001 = IlIIlli1_1i_liiliiIiI11I_I((byte[])var10001, -1456817635 * 1746877581 + 2119545354);
         }

         this.II1_iIIiilI__iiIiii__i = (String)var10001;
         var10001 = iiIIiiillIl1l_I_l1I_1lI___(-510017684 * -1034724607 + -1890132840);
         if (var10001 == null) {
            var10001 = new byte[-1000750519 * -1877703407 + 375794731];
            ((Object[])var10001)[~1605125329 - -913779586 ^ -691345744] = (byte)((540672000 | 14784) ^ -540686836);
            ((Object[])var10001)[~1748488663 - 1482300410 ^ 1064178223] = (byte)(434395357 * 280591929 + -793349818);
            ((Object[])var10001)[(-1222049792 | 57757) ^ -1221992033] = (byte)(237186105 * -1551688225 + -953219710);
            ((Object[])var10001)[(-1769406464 | 35082) ^ -1769371383] = (byte)((-1972568064 | 60331) ^ 1972507665);
            var10001 = IlIIlli1_1i_liiliiIiI11I_I((byte[])var10001, -1235430342 * -1092897543 + -1059140710);
         }

         this.l1Iill1l1lII___IlIIl_IIlI__1 = (String)var10001;
         this.ii_Il11Iii1I1i1IllII1I_il_iIiiI = null;
         this.I____iIiiilI1_lIl_Ii___iI = 0L;
         this.I111_1l11__1_iillI1_1lllIl_ = (boolean)(~889042201 - 296804088 ^ -1185846290);
         synchronized (this.i_i1ll11l_1i1l1l__ll1i111I) {
            Object var6 = this.i_i1ll11l_1i1l1l__ll1i111I;
            var10001 = null;
            Thread.currentThread().hashCode();
            var6.notifyAll();
         }

         if ((~-416996542 - 46825373 ^ 1367670543) != (~1853279084 - 1050590964 ^ 360634288)) {
         }
      }
   }

   public void press(l1iil1_lill1II11ll_11i.li_l1iil_i1lI1_IIiI1_1111I param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else if (this.Ii1Ii_i__i_1ii_111ili_1IiiIIiI && this.i11liIlIl1iI_iil_11_ll1IiIIi) {
         if (var1 == l1iil1_lill1II11ll_11i.li_l1iil_i1lI1_IIiI1_1111I.PLAY_PAUSE) {
            Object var10002 = null;
            Thread.currentThread().hashCode();
            this.i1lII__1iiliiI_1_1il_lIlII_ = this.getPosition();
            Object var10001 = null;
            Thread.currentThread().hashCode();
            this.ii1iIIl_1llIl1iIilIl_ll = System.currentTimeMillis();
            int var8;
            if (!this.I111_1l11__1_iillI1_1lllIl_) {
               var8 = (1121320960 | 59149) ^ 1121380108;
               if (((-162922496 | 23949) ^ -1365739654) != ((1767702528 | 61805) ^ 831511450)) {
               }
            } else {
               var8 = ~1586326204 - -862056272 ^ -724269933;
            }

            this.I111_1l11__1_iillI1_1lllIl_ = (boolean)var8;
            this.lI1iiI11_llIliIlli11_lII_1lII1 = this.I111_1l11__1_iillI1_1lllIl_;
            this.I_II1i1_Iii1l_lI1I111l1I1 = this.ii1iIIl_1llIl1iIilIl_ll + (~-7177079386035292631L - -8930864319226683236L ^ -2338800368447574810L);
            if ((~-481793045 - -1477359397 ^ -1193026008) != -259156632 * -1112848005 + 1141646361) {
            }
         } else {
            this.lI1iiI11_llIliIlli11_lII_1lII1 = (boolean)(494656975 * 1050624791 + 155247976);
            Object var9 = null;
            Thread.currentThread().hashCode();
            this.I_II1i1_Iii1l_lI1I111l1I1 = System.currentTimeMillis() + (~-1554638500557070331L - 7873157584204522987L ^ -6318519083647451181L);
            this.I111_1l11__1_iillI1_1lllIl_ = (boolean)(1501478135 * 455334837 + 1794644062);
         }

         Queue var10000 = this.lII1__11111i1i_iiiiI_11l;
         Object var11 = null;
         Thread.currentThread().hashCode();
         var10000.add(var1);
         synchronized (this.i_i1ll11l_1i1l1l__ll1i111I) {
            Object var7 = this.i_i1ll11l_1i1l1l__ll1i111I;
            Object var10 = null;
            Thread.currentThread().hashCode();
            var7.notifyAll();
         }

         if (-1305020260 * 1532389795 + 1512976627 != (~318960438 - 1868451100 ^ 705742826)) {
         }
      }
   }

   private void l___Iii_1lIiill11iI__l_I_1_ii() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         IMediaSession var4 = this.li1lIi1_lI_1lil1I_lII1II;

         while (true) {
            Queue var10000 = this.lII1__11111i1i_iiiiI_11l;
            Object var10001 = null;
            Thread.currentThread().hashCode();
            l1iil1_lill1II11ll_11i.li_l1iil_i1lI1_IIiI1_1111I var3;
            if ((var3 = (l1iil1_lill1II11ll_11i.li_l1iil_i1lI1_IIiI1_1111I)var10000.poll()) == null) {
               return;
            }

            if (var4 != null) {
               var10001 = null;
               Thread.currentThread().hashCode();
               switch (var3) {
                  case PREVIOUS:
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     var4.previous();
                     break;
                  case PLAY_PAUSE:
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     var4.playPause();
                     break;
                  case NEXT:
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     var4.next();
               }
            }
         }
      }
   }

   private void IiI_i_I1_lI_i_l11i1I11Il_I_lI1() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         while (this.i11liIlIl1iI_iil_11_ll1IiIIi) {
            label129: {
               try {
                  MediaPlayerInfo.Instance var10001 = null;
                  Thread.currentThread().hashCode();
                  this.l___Iii_1lIiill11iI__l_I_1_ii();
                  var10001 = MediaPlayerInfo.Instance;
                  Object var10002 = null;
                  Thread.currentThread().hashCode();
                  List var23 = var10001.getMediaSessions();
                  var10002 = null;
                  Thread.currentThread().hashCode();
                  IMediaSession var15 = this.i11I___IIi1ili111IIi1i(var23);
                  MediaInfo var10000;
                  if (var15 == null) {
                     var10000 = null;
                     if (328684834 * 9963933 + 886997064 != ((1107558400 | 23665) ^ 1423946835)) {
                     }
                  } else {
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     var10000 = var15.getMedia();
                  }

                  MediaInfo var3 = var10000;
                  this.li1lIi1_lI_1lil1I_lII1II = var15;
                  if (var3 == null) {
                     String var25 = iiIIiiillIl1l_I_l1I_1lI___(~-259398820 - -1745834663 ^ 2005233487);
                     if (var25 == null) {
                        byte[] var26 = new byte[(-968949760 | 35144) ^ -968914612];
                        var26[~-134237767 - 964707511 ^ -830469745] = (byte)(~-656415733 - -914179802 ^ -1570595577);
                        var26[1276163189 * -97239191 + -956747516] = (byte)(413350471 * 201155743 + 1253052937);
                        var26[~1072044194 - 691383870 ^ -1763428067] = (byte)(1453272564 * 871876023 + -1553112362);
                        var26[(-2088566784 | 61569) ^ -2088505214] = (byte)(~1716740152 - -2003823377 ^ -287083220);
                        var25 = IlIIlli1_1i_liiliiIiI11I_I(var26, (-25427968 | 51933) ^ -25376040);
                     }

                     this.II1_iIIiilI__iiIiii__i = var25;
                     String var27 = iiIIiiillIl1l_I_l1I_1lI___((859308032 | 53588) ^ 859361618);
                     if (var27 == null) {
                        byte[] var28 = new byte[-111661285 * -824050815 + -1012544919];
                        var28[~1832648599 - 1156766329 ^ 1305552367] = (byte)((-2057895936 | 51993) ^ -2057843950);
                        var28[~-1999735976 - -555207809 ^ -1740023511] = (byte)(995894487 * -1349478161 + 757724041);
                        var28[-746871224 * 2046055117 + -2045196198] = (byte)(-1865094095 * 1098337149 + -1425059503);
                        var28[(-1613627392 | 62013) ^ -1613565378] = (byte)((-1149370368 | 57111) ^ 1149313196);
                        var27 = IlIIlli1_1i_liiliiIiI11I_I(var28, 892077017 * -742285049 + 466054167);
                     }

                     this.l1Iill1l1lII___IlIIl_IIlI__1 = var27;
                     this.ii_Il11Iii1I1i1IllII1I_il_iIiiI = null;
                     this.I____iIiiilI1_lIl_Ii___iI = 0L;
                     this.I111_1l11__1_iillI1_1lllIl_ = (boolean)((-973471744 | 25041) ^ -973446703);
                     if ((~408500314 - -1031205132 ^ -1797448800) != -1157007397 * -322333407 + 332576982) {
                     }
                  } else {
                     var10002 = null;
                     Thread.currentThread().hashCode();
                     String var29;
                     if (var3.getTitle() == null) {
                        var29 = iiIIiiillIl1l_I_l1I_1lI___(1472039650 * 71327991 + 59391993);
                        if (var29 == null) {
                           byte[] var30 = new byte[-105857636 * -1646483871 + 721747944];
                           var30[~1167729349 - 227555671 ^ -1395285021] = (byte)((1085472768 | 5220) ^ -1085477970);
                           var30[-491439299 * -1198559501 + -9335014] = (byte)((122159104 | 34753) ^ -122193901);
                           var30[(-2063400960 | 54606) ^ -2063346356] = (byte)(~877426571 - 714131972 ^ 1591558645);
                           var30[-340109165 * -1897749369 + -1808327042] = (byte)(~-1019043461 - -2036602955 ^ 1239320940);
                           var29 = IlIIlli1_1i_liiliiIiI11I_I(var30, ~-1645121054 - -1179251858 ^ -1470594392);
                        }

                        if (((1203896320 | 61059) ^ 610793952) != -536463997 * -519409465 + 1296707214) {
                        }
                     } else {
                        var10002 = null;
                        Thread.currentThread().hashCode();
                        var29 = var3.getTitle();
                     }

                     this.II1_iIIiilI__iiIiii__i = var29;
                     var10002 = null;
                     Thread.currentThread().hashCode();
                     String var31;
                     if (var3.getArtist() == null) {
                        var31 = iiIIiiillIl1l_I_l1I_1lI___(~1701066305 - 767041451 ^ 1826859547);
                        if (var31 == null) {
                           byte[] var32 = new byte[-1395407745 * -329906307 + -1148218111];
                           var32[(-833224704 | 61101) ^ -833163603] = (byte)((1066205184 | 59568) ^ -1066264745);
                           var32[-389234355 * -83736693 + -845369294] = (byte)((1798111232 | 29822) ^ -1798141026);
                           var32[~174595520 - 846541177 ^ -1021136700] = (byte)(~-1595485489 - 1119561752 ^ 475923809);
                           var32[-1189058702 * 573323983 + 197428949] = (byte)((-2100232192 | 33311) ^ -2100198862);
                           var31 = IlIIlli1_1i_liiliiIiI11I_I(var32, 2002844817 * -1559064849 + -1423325527);
                        }

                        if (((1129906176 | 13809) ^ -1355780026) != ((-540540928 | 5286) ^ 866210065)) {
                        }
                     } else {
                        var10002 = null;
                        Thread.currentThread().hashCode();
                        var31 = var3.getArtist();
                     }

                     this.l1Iill1l1lII___IlIIl_IIlI__1 = var31;
                     var10002 = null;
                     Thread.currentThread().hashCode();
                     this.ii_Il11Iii1I1i1IllII1I_il_iIiiI = var3.getArtworkPng();
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     long var4 = var3.getDuration();
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     long var6 = var3.getPosition();
                     var10002 = null;
                     Thread.currentThread().hashCode();
                     int var17;
                     if (Math.max(var4, var6) >= (~4688210194625613662L - -7709219343330656762L ^ 3021009148705076283L)) {
                        var17 = ~1346415787 - 1782830986 ^ 1165720523;
                        if ((~945122080 - -390128713 ^ -670425957) != -552774518 * 980537195 + 1879669253) {
                        }
                     } else {
                        var17 = 303953783 * -1766941981 + -72483973;
                     }

                     int var8 = var17;
                     long var35;
                     if (var8 != 0) {
                        var35 = var4;
                        if (((-809238528 | 35423) ^ 324079621) != ((-923074560 | 44245) ^ 342767247)) {
                        }
                     } else {
                        var35 = var4 * (~-1613578944455680327L - -7990424021434746011L ^ -8842741107819125239L);
                     }

                     this.I____iIiiilI1_lIl_Ii___iI = var35;
                     long var36;
                     if (var8 != 0) {
                        var36 = var6;
                        if ((~1593241842 - 656540613 ^ 1660875018) != (~-1605897507 - -273576598 ^ 1797228026)) {
                        }
                     } else {
                        var36 = var6 * (~2828759510651698492L - -4956972997786251811L ^ 2128213487134553870L);
                     }

                     this.i1lII__1iiliiI_1_1il_lIlII_ = var36;
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     this.ii1iIIl_1llIl1iIilIl_ll = System.currentTimeMillis();
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     boolean var9 = var3.getPlaying();
                     if (this.ii1iIIl_1llIl1iIilIl_ll < this.I_II1i1_Iii1l_lI1I111l1I1 && var9 != this.lI1iiI11_llIliIlli11_lII_1lII1) {
                        this.I111_1l11__1_iillI1_1lllIl_ = this.lI1iiI11_llIliIlli11_lII_1lII1;
                        if ((~-964341875 - 1236168024 ^ 1600015653) != ((683671552 | 50516) ^ -1739404437)) {
                        }
                     } else {
                        this.I_II1i1_Iii1l_lI1I111l1I1 = 0L;
                        this.I111_1l11__1_iillI1_1lllIl_ = var9;
                     }
                  }
               } catch (LinkageError var11) {
                  this.Ii1Ii_i__i_1ii_111ili_1IiiIIiI = (boolean)((-1880948736 | 54177) ^ -1880894559);
                  this.i11liIlIl1iI_iil_11_ll1IiIIi = (boolean)(1980892607 * -275376453 + -2056428677);
                  return;
               } catch (Throwable var12) {
                  this.li1lIi1_lI_1lil1I_lII1II = null;
                  break label129;
               }

               if (1902643526 * 897431523 + -206081438 != ((1071579136 | 31090) ^ -652620794)) {
               }
            }

            try {
               synchronized (this.i_i1ll11l_1i1l1l__ll1i111I) {
                  Queue var20 = this.lII1__11111i1i_iiiiI_11l;
                  Object var40 = null;
                  Thread.currentThread().hashCode();
                  if (var20.isEmpty()) {
                     var20 = (Queue)this.i_i1ll11l_1i1l1l__ll1i111I;
                     long var41 = ~53297423475603335L - -720086056549542093L ^ 666788633073938609L;
                     Object var49 = null;
                     Thread.currentThread().hashCode();
                     var20.wait(var41);
                  }
               }

               if (((1437990912 | 43556) ^ -388471337) != (~663290789 - 1498774305 ^ -1034989878)) {
               }
            } catch (InterruptedException var14) {
               Thread var18 = null;
               Thread.currentThread().hashCode();
               var18 = Thread.currentThread();
               Object var39 = null;
               Thread.currentThread().hashCode();
               var18.interrupt();
               return;
            }

            if (((91553792 | 47318) ^ 895524815) != (~-1163966215 - 641206008 ^ 792565527)) {
            }
         }
      }
   }

   private IMediaSession i11I___IIi1ili111IIi1i(List<IMediaSession> param1) {
      int var3 = System.identityHashCode(null);
      if ((var3 * (var3 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         IMediaSession var8 = null;
         IMediaSession var4 = this.li1lIi1_lI_1lil1I_lII1II;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         Iterator var5 = var1.iterator();

         while (true) {
            var10001 = null;
            Thread.currentThread().hashCode();
            if (!var5.hasNext()) {
               return var8;
            }

            var10001 = null;
            Thread.currentThread().hashCode();
            IMediaSession var6 = (IMediaSession)var5.next();
            var10001 = null;
            Thread.currentThread().hashCode();
            MediaInfo var7 = var6.getMedia();
            if (var7 != null) {
               var10001 = null;
               Thread.currentThread().hashCode();
               if (var7.getTitle() != null) {
                  var10001 = null;
                  Thread.currentThread().hashCode();
                  String var10000 = var7.getTitle();
                  var10001 = null;
                  Thread.currentThread().hashCode();
                  if (!var10000.isEmpty()) {
                     var10001 = null;
                     Thread.currentThread().hashCode();
                     if (var7.getPlaying()) {
                        return var6;
                     }

                     var10001 = null;
                     Thread.currentThread().hashCode();
                     if (var7.getDuration() > 0L) {
                        if (var8 != null) {
                           if (var4 == null) {
                              continue;
                           }

                           var10001 = null;
                           Thread.currentThread().hashCode();
                           var10000 = var4.getOwner();
                           Object var10002 = null;
                           Thread.currentThread().hashCode();
                           var10001 = var6.getOwner();
                           var10002 = null;
                           Thread.currentThread().hashCode();
                           if (!var10000.equals(var10001)) {
                              continue;
                           }
                        }

                        var8 = var6;
                     }
                  }
               }
            }
         }
      }
   }

   public boolean hasMedia() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         String var10000 = this.II1_iIIiilI__iiIiii__i;
         Object var10001 = null;
         Thread.currentThread().hashCode();
         return (boolean)(!var10000.isEmpty() && this.I____iIiiilI1_lIl_Ii___iI > 0L
            ? (-1413218304 | 17996) ^ -1413200307
            : -1369470645 * 1336515609 + -109124691);
      }
   }

   public String getTitle() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.II1_iIIiilI__iiIiii__i;
      }
   }

   public String getArtist() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.l1Iill1l1lII___IlIIl_IIlI__1;
      }
   }

   public byte[] getArtwork() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.ii_Il11Iii1I1i1IllII1I_il_iIiiI;
      }
   }

   public long getDuration() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.I____iIiiilI1_lIl_Ii___iI;
      }
   }

   public boolean isPlaying() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         return this.I111_1l11__1_iillI1_1lllIl_;
      }
   }

   public long getPosition() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         long var3 = this.i1lII__1iiliiI_1_1il_lIlII_;
         if (this.I111_1l11__1_iillI1_1lllIl_) {
            Object var10001 = null;
            Thread.currentThread().hashCode();
            var3 += System.currentTimeMillis() - this.ii1iIIl_1llIl1iIilIl_ll;
         }

         long var5 = this.I____iIiiilI1_lIl_Ii___iI;
         Object var10003 = null;
         Thread.currentThread().hashCode();
         var5 = Math.min(var5, var3);
         Object var10002 = null;
         Thread.currentThread().hashCode();
         return Math.max(0L, var5);
      }
   }

   public float getProgress() {
      int var2 = System.identityHashCode(null);
      if ((var2 * (var2 + 1) & 1) != 0) {
         throw new Error("unreachable");
      } else {
         float var10000;
         if (this.I____iIiiilI1_lIl_Ii___iI <= 0L) {
            var10000 = 0.0F;
         } else {
            Object var10001 = null;
            Thread.currentThread().hashCode();
            var10000 = (float)this.getPosition() / (float)this.I____iIiiilI1_lIl_Ii___iI;
         }

         return var10000;
      }
   }

   @Environment(EnvType.CLIENT)
   public static enum li_l1iil_i1lI1_IIiI1_1111I {
      PREVIOUS,
      PLAY_PAUSE,
      NEXT;

      public static final char[][] IllIl1i1llI_l1_IIi1lii_1iI1iIl = new char[(-359399424 | 15730) ^ -359383756][];

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      static {
         l1iil1_lill1II11ll_11i.li_l1iil_i1lI1_IIiI1_1111I var10000 = new l1iil1_lill1II11ll_11i.li_l1iil_i1lI1_IIiI1_1111I;
         String var10002 = liIli_i_1_ll_ili1lII1lIili__(~312174549 - -1692091686 ^ 1379917136);
         if (var10002 == null) {
            byte[] var2 = new byte[~-92646860 - -2019291056 ^ 2111937911];
            var2[-1398591395 * 1010266263 + -1768240859] = (byte)((1957232640 | 7389) ^ -1957239970);
            var2[-502489865 * 1644509635 + 1654550748] = (byte)((-1104019456 | 49651) ^ 1103969907);
            var2[~-822217679 - -85308066 ^ 907525746] = (byte)((-242876416 | 37968) ^ -242838480);
            var2[-180460012 * -375115421 + -1635470777] = (byte)(~-1729666456 - -1019479536 ^ -1545821246);
            var2[~637287720 - 1637751491 ^ 2019928080] = (byte)(~1311369668 - 46144050 ^ -1357513669);
            var2[~399850032 - 1022351952 ^ -1422201990] = (byte)(-497091439 * 662037047 + -44385682);
            var2[(-1580400640 | 19334) ^ -1580381312] = (byte)(~-356028985 - 1506240554 ^ -1150211467);
            var2[481040193 * -691481281 + 1099248136] = (byte)((1946681344 | 5099) ^ -1946686458);
            var2[~-285482672 - 985134745 ^ -699652066] = (byte)(-1712995386 * -1784434065 + -1641123655);
            var2[~2147333363 - -1212439931 ^ -934893426] = (byte)(1749480712 * -1173520795 + -1375771644);
            var2[1639429766 * 460473605 + 696996204] = (byte)(~1468142082 - 1317842379 ^ 1508982870);
            var2[~697925282 - 1160803456 ^ -1858728746] = (byte)(-948772763 * 1757947185 + -508791833);
            var10002 = IlIi1i1_I1lI1I_Iii1111II1iI11(var2, 36477920 * 1044408115 + 1717949024);
         }

         var10000./* $VF: Unable to resugar constructor */<init>();
         PREVIOUS = var10000;
         var10000 = new l1iil1_lill1II11ll_11i.li_l1iil_i1lI1_IIiI1_1111I;
         var10002 = liIli_i_1_ll_ili1lII1lIili__((-295632896 | 5608) ^ -295627287);
         if (var10002 == null) {
            byte[] var4 = new byte[-1402234772 * 1430685781 + 231015474];
            var4[~1946549525 - 18876158 ^ -1965425684] = (byte)(~-561325369 - 449496097 ^ 111829312);
            var4[1730522836 * 586550385 + -1938561939] = (byte)(~-938720701 - 1903290015 ^ -964569269);
            var4[(-1507262464 | 2887) ^ -1507259579] = (byte)((-814678016 | 47996) ^ -814630049);
            var4[~227006251 - 1963529957 ^ 2104431084] = (byte)(~-1726502114 - 828471596 ^ 898030546);
            var4[-1874662126 * -1806416833 + -2035883882] = (byte)(~-1644493674 - 1328957087 ^ -315536558);
            var4[~632060338 - -1074099707 ^ 442039373] = (byte)((530251776 | 45730) ^ -530297499);
            var4[-692163293 * -1860422381 + -529422483] = (byte)((-1190461440 | 23982) ^ -1190437441);
            var4[~539683762 - 333283124 ^ -872966882] = (byte)(~1844882935 - -537766393 ^ -1307116498);
            var4[(1314521088 | 58293) ^ 1314579389] = (byte)(~-473903808 - 2015288815 ^ 1541385045);
            var4[~-359146810 - -1194120502 ^ 1553267302] = (byte)(-1954224682 * -1298661035 + -454436435);
            var4[~-1214816338 - 1000711213 ^ 214105134] = (byte)(~1403263231 - -746853509 ^ -656409656);
            var4[~-201810768 - -1381741577 ^ 1583552339] = (byte)(~2134505517 - 1423279055 ^ -737182831);
            var4[~1813042832 - 2040320198 ^ 441604261] = (byte)(~-1750945589 - 1686527581 ^ -64418024);
            var4[(-783286272 | 19779) ^ -783266482] = (byte)(~-1873859199 - -715903415 ^ -1705204729);
            var10002 = IlIi1i1_I1lI1I_Iii1111II1iI11(var4, ~-1240582660 - -961565105 ^ -2092819531);
         }

         var10000./* $VF: Unable to resugar constructor */<init>();
         PLAY_PAUSE = var10000;
         var10000 = new l1iil1_lill1II11ll_11i.li_l1iil_i1lI1_IIiI1_1111I;
         var10002 = liIli_i_1_ll_ili1lII1lIili__(-594414581 * 825932961 + -1283493609);
         if (var10002 == null) {
            byte[] var6 = new byte[-1139267806 * -817634089 + -923346310];
            var6[(344064000 | 16885) ^ 344080885] = (byte)(946528950 * -470683051 + 1792847240);
            var6[~1901184512 - -1589535372 ^ -311649142] = (byte)(~-1832062989 - 837511775 ^ -994551225);
            var6[(-852164608 | 40585) ^ -852124021] = (byte)(~385791788 - 1604421585 ^ -1990213302);
            var6[(1293811712 | 50932) ^ 1293862647] = (byte)(~-945652280 - -891741296 ^ -1837393602);
            var6[(-1954676736 | 7932) ^ -1954668808] = (byte)(-2131115236 * -1088961231 + -1316414519);
            var6[-1967629360 * 99357767 + 1811040597] = (byte)(~988369313 - -2107666138 ^ 1119296875);
            var6[578658761 * 2104974263 + 1447028311] = (byte)(-1457662945 * 1130194571 + 503740620);
            var6[1350333478 * 2094187063 + -1240317987] = (byte)((-32112640 | 40022) ^ -32072669);
            var10002 = IlIi1i1_I1lI1I_Iii1111II1iI11(var6, (1315045376 | 42453) ^ 1315087831);
         }

         var10000./* $VF: Unable to resugar constructor */<init>();
         NEXT = var10000;
      }
   }
}
