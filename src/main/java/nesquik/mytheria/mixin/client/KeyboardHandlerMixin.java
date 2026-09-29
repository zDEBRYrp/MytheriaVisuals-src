package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I3_i2.il_l_li__li_i1lI1iII_I_iI_l1Ii1;
import II1II1II1II1II1II1II1II1.l8_I7.I_i1iii1l_i1Il1_l11_IIiI1ll____;
import II1II1II1II1II1II1II1II1.l9_I8.IiI_1_i_l_iI_1iilillIiiI_1I_l;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({Keyboard.class})
public class KeyboardHandlerMixin {
   @Inject(
      method = {"onKey"},
      at = {@At("HEAD")}
   )
   private void press(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
      if (key != -1 && window == I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.getWindow().getHandle()) {
         if (il_l_li__li_i1lI1iII_I_iI_l1Ii1.Ii_iI1i_I_il_IliII_li__() != null) {
            il_l_li__li_i1lI1iII_I_iI_l1Ii1.lIIil1_ii11__III_lI1_1_1_().call(new IiI_1_i_l_iI_1iilillIiiI_1I_l(key, action));
         }
      }
   }
}
