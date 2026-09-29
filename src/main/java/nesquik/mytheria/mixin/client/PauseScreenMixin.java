package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l2_I1.IiII_II_1__1II_1l1I1Iiil1I;
import II1II1II1II1II1II1II1II1.l8_I7.I_i1iii1l_i1Il1_l11_IIiI1ll____;
import II1II1II1II1II1II1II1II1.l9_I8.Il1i_II1_I_ilil1i_1I_1II_11l11I;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({GameMenuScreen.class})
public class PauseScreenMixin {
   @Inject(
      method = {"method_19836"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void mytheria$confirmLeave(ButtonWidget button, CallbackInfo ci) {
      if (IiII_II_1__1II_1l1I1Iiil1I.I_Ii_11iI_iii1II_iiiIii()) {
         ci.cancel();
         I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.setScreen(new Il1i_II1_I_ilil1i_1I_1II_11l11I((GameMenuScreen)this));
      }
   }
}
