package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I3_i2.il_l_li__li_i1lI1iII_I_iI_l1Ii1;
import II1II1II1II1II1II1II1II1.l2_I1.I11111l11iIl_ll1liiI11l1ll1l_;
import II1II1II1II1II1II1II1II1.l2_I1.IiI1Ili__l_Ii11_1_i1i_i;
import II1II1II1II1II1II1II1II1.l2_I1.i1_Illliil_I1liIii111Ili1_I;
import II1II1II1II1II1II1II1II1.l5_I4.Illli1IIiIl1_I1lI__Iill_I1_;
import II1II1II1II1II1II1II1II1.l5_I4.llI11i__1111l_l1liIl__1i1ill1i;
import II1II1II1II1II1II1II1II1.l9_I8.iiIlIl_Illilii1Illl1ll_i_;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({ClientPlayerInteractionManager.class})
public class MultiPlayerGameModeMixin {
   @Inject(
      method = {"attackEntity"},
      at = {@At("HEAD")}
   )
   private void attack(PlayerEntity player, Entity target, CallbackInfo ci) {
      llI11i__1111l_l1liIl__1i1ill1i.i1ii_l1iIl1llI__ll1IIi1_I(target);
      Illli1IIiIl1_I1lI__Iill_I1_.iil_1l1iliI_Illl_i1I_Il_liI1I1(target);
      I11111l11iIl_ll1liiI11l1ll1l_.lI11l_IIIl1i_i___l11_lI_l_(target);
      i1_Illliil_I1liIii111Ili1_I.Ililil1_liI1l__llI_1ilIlI__(target);
      IiI1Ili__l_Ii11_1_i1i_i.ll_1iI11I111lI_iI1111__1I(target);
   }

   @Inject(
      method = {"clickSlot"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void click(int containerId, int slotId, int button, SlotActionType type, PlayerEntity player, CallbackInfo ci) {
      if (il_l_li__li_i1lI1iII_I_iI_l1Ii1.Ii_iI1i_I_il_IliII_li__() != null) {
         iiIlIl_Illilii1Illl1ll_i_ event = il_l_li__li_i1lI1iII_I_iI_l1Ii1.lIIil1_ii11__III_lI1_1_1_().call(new iiIlIl_Illilii1Illl1ll_i_(slotId));
         if (event.isCancel()) {
            ci.cancel();
         }
      }
   }
}
