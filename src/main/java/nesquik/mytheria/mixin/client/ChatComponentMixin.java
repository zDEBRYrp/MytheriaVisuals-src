package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I3_i2.il_l_li__li_i1lI1iII_I_iI_l1Ii1;
import II1II1II1II1II1II1II1II1.l9_I8.ll1i_l1__1l1_1II11lii1__;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({ChatHud.class})
public class ChatComponentMixin {
   @Inject(
      method = {"addMessage(Lnet/minecraft/text/Text;)V"},
      at = {@At("HEAD")}
   )
   private void addMessage(Text message, CallbackInfo ci) {
      if (il_l_li__li_i1lI1iII_I_iI_l1Ii1.Ii_iI1i_I_il_IliII_li__() != null) {
         il_l_li__li_i1lI1iII_I_iI_l1Ii1.lIIil1_ii11__III_lI1_1_1_().call(new ll1i_l1__1l1_1II11lii1__(message.getString()));
      }
   }
}
