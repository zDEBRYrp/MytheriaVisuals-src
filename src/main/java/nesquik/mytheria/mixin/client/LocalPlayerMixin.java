package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I3_i2.il_l_li__li_i1lI1iII_I_iI_l1Ii1;
import II1II1II1II1II1II1II1II1.l9_I8.Iiil11iI_li_i1___I__1l_l;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({ClientPlayerEntity.class})
public class LocalPlayerMixin {
   @Inject(
      method = {"dropSelectedItem(Z)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void drop(boolean fullStack, CallbackInfoReturnable<Boolean> cir) {
      if (il_l_li__li_i1lI1iII_I_iI_l1Ii1.Ii_iI1i_I_il_IliII_li__() != null) {
         Iiil11iI_li_i1___I__1l_l event = il_l_li__li_i1lI1iII_I_iI_l1Ii1.lIIil1_ii11__III_lI1_1_1_().call(new Iiil11iI_li_i1___I__1l_l());
         if (event.isCancel()) {
            cir.setReturnValue(false);
         }
      }
   }
}
