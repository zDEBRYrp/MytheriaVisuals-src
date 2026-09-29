package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l2_I1.I1_llii1_lIIi_11i11li11iIl1I1_I;
import II1II1II1II1II1II1II1II1.l2_I1.l1l__lI_1II1I_iI1i_1I_11__I;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({HandledScreen.class})
public class AbstractContainerScreenMixin {
   @Shadow
   protected Slot focusedSlot;
   @Shadow
   @Final
   protected ScreenHandler handler;

   @Inject(
      method = {"handledScreenTick"},
      at = {@At("RETURN")}
   )
   private void tick(CallbackInfo ci) {
      I1_llii1_lIIi_11i11li11iIl1I1_I.l1_1I1_l_lIIIiIiillI_Iilll1III(this.focusedSlot);
   }

   @Inject(
      method = {"drawSlots"},
      at = {@At("RETURN")}
   )
   private void cooldowns(DrawContext graphics, CallbackInfo ci) {
      l1l__lI_1II1I_iI1i_1I_11__I.i_il11li1_iI1iill11lI_i1IlliI(graphics, this.handler);
   }
}
