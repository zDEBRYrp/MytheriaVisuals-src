package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l2_I1.I__l1lii1__lIli111I11Ii_l1_I1l_;
import II1II1II1II1II1II1II1II1.l5_I4.l_iIl1liiillliiIi_IiIl;
import II1II1II1II1II1II1II1II1.l8_I7.I_i1iii1l_i1Il1_l11_IIiI1ll____;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.sound.SoundEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({ClientPlayNetworkHandler.class})
public class ClientPacketListenerMixin {
   @Inject(
      method = {"onEntityStatus"},
      at = {@At("TAIL")}
   )
   private void totemPop(EntityStatusS2CPacket packet, CallbackInfo ci) {
      if (packet.getStatus() == 35 && I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.world != null) {
         if (packet.getEntity(I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.world) instanceof PlayerEntity player) {
            ItemStack mainHand = player.getMainHandStack();
            ItemStack totem = mainHand.isOf(Items.TOTEM_OF_UNDYING) ? mainHand : player.getOffHandStack();
            if (totem.isOf(Items.TOTEM_OF_UNDYING)) {
               I__l1lii1__lIli111I11Ii_l1_I1l_.I1lI__I1I_1IiII11lI__i11(player, totem.hasEnchantments());
            }
         }
      }
   }

   @Inject(
      method = {"onPlaySound"},
      at = {@At("TAIL")}
   )
   private void sound(PlaySoundS2CPacket packet, CallbackInfo ci) {
      l_iIl1liiillliiIi_IiIl.iIilIIi11_ili1i1__liIi1i11Ilii_(
         ((SoundEvent)packet.getSound().value()).id().getPath(), packet.getVolume(), packet.getPitch(), packet.getX(), packet.getY(), packet.getZ()
      );
   }
}
