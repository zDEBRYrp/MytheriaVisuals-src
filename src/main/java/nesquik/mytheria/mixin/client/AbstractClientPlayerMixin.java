package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.II_1II11iiI1I1_I1IIi1_;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({AbstractClientPlayerEntity.class})
public abstract class AbstractClientPlayerMixin {
   @Inject(
      method = {"getSkinTextures"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void cape(CallbackInfoReturnable<SkinTextures> cir) {
      SkinTextures skin = (SkinTextures)cir.getReturnValue();
      if (skin != null) {
         AbstractClientPlayerEntity player = (AbstractClientPlayerEntity)this;
         Identifier cape = II_1II11iiI1I1_I1IIi1_.liI11111__illl1l1_I__11(player.getUuid());
         if (cape != null) {
            cir.setReturnValue(new SkinTextures(skin.texture(), skin.textureUrl(), cape, skin.elytraTexture(), skin.model(), skin.secure()));
         }
      }
   }
}
