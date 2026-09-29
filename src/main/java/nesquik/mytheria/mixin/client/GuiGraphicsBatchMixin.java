package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I8_i7.Ii1_I1Ii_l1ilIIlII1iliIlI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({DrawContext.class})
public class GuiGraphicsBatchMixin {
   @Inject(
      method = {"draw"},
      at = {@At("HEAD")}
   )
   private void mytheria$flushBatch(CallbackInfo info) {
      Ii1_I1Ii_l1ilIIlII1iliIlI.l1i_111_IIlI1___1l_IlIil1();
   }

   @Inject(
      method = {"enableScissor"},
      at = {@At("HEAD")}
   )
   private void mytheria$flushBeforeScissor(int left, int top, int right, int bottom, CallbackInfo info) {
      Ii1_I1Ii_l1ilIIlII1iliIlI.l1i_111_IIlI1___1l_IlIil1();
   }

   @Inject(
      method = {"disableScissor"},
      at = {@At("HEAD")}
   )
   private void mytheria$flushAfterScissor(CallbackInfo info) {
      Ii1_I1Ii_l1ilIIlII1iliIlI.l1i_111_IIlI1___1l_IlIil1();
   }
}
