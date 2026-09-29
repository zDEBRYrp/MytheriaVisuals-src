package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.Ii1il11Il_1_l_iI_lIIll_liiI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin(
   targets = {"net/minecraft/client/gui/hud/InGameHud$HeartType"}
)
public class HeartTypeMixin {
   @Redirect(
      method = {"fromPlayerState"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;hasStatusEffect(Lnet/minecraft/registry/entry/RegistryEntry;)Z"
      )
   )
   private static boolean hearts(PlayerEntity player, RegistryEntry<StatusEffect> effect) {
      return effect == StatusEffects.WITHER && Ii1il11Il_1_l_iI_lIIll_liiI.lI1i1_11lii_11Il1III_l_1l__l1I_("Чёрные сердца")
         ? false
         : player.hasStatusEffect(effect);
   }
}
