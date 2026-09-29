package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.l_IilIl__I1lllii_II_iI1ilIIli_;
import II1II1II1II1II1II1II1II1.l8_I7.I_i1iii1l_i1Il1_l11_IIiI1ll____;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({LivingEntity.class})
public class LivingEntityMixin {
   @Inject(
      method = {"getHandSwingDuration"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void swingDuration(CallbackInfoReturnable<Integer> cir) {
      if (this == I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.player) {
         int duration = l_IilIl__I1lllii_II_iI1ilIIli_.i11_11il_1IIlli1l___IIllI();
         if (duration > 0) {
            cir.setReturnValue(duration);
         }
      }
   }
}
