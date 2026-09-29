package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.Ii1il11Il_1_l_iI_lIIll_liiI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({InGameHud.class})
public class GuiConfusionMixin {
   @Inject(
      method = {"renderNauseaOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void nausea(DrawContext graphics, float scale, CallbackInfo ci) {
      if (Ii1il11Il_1_l_iI_lIIll_liiI.lI1i1_11lii_11Il1III_l_1l__l1I_("Тошнота")) {
         ci.cancel();
      }
   }
}
