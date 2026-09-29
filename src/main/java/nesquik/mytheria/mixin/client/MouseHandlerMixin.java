package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I3_i2.il_l_li__li_i1lI1iII_I_iI_l1Ii1;
import II1II1II1II1II1II1II1II1.l1_I0.lli_11I__lI_i1li1Ii11i_;
import II1II1II1II1II1II1II1II1.l2_I1.iI_IllliIIIliI11i11IiiIIil11;
import II1II1II1II1II1II1II1II1.l9_I8.IiI_1_i_l_iI_1iilillIiiI_1I_l;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({Mouse.class})
public class MouseHandlerMixin {
   @Shadow
   @Final
   private MinecraftClient client;
   @Shadow
   private double cursorDeltaX;
   @Shadow
   private double cursorDeltaY;

   @Inject(
      method = {"updateMouse"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void freeLook(double deltaTime, CallbackInfo ci) {
      if (this.client.player != null) {
         double sensitivity = (Double)this.client.options.getMouseSensitivity().getValue() * 0.6 + 0.2;
         double scaled = sensitivity * sensitivity * sensitivity * 8.0;
         int invert = this.client.options.getInvertYMouse().getValue() ? -1 : 1;
         if (iI_IllliIIIliI11i11IiiIIil11.I1__iI1IiiIII111lI__l_____I(this.cursorDeltaX * scaled, this.cursorDeltaY * scaled * (double)invert)) {
            this.cursorDeltaX = 0.0;
            this.cursorDeltaY = 0.0;
            ci.cancel();
         }
      }
   }

   @Inject(
      method = {"onMouseButton"},
      at = {@At("HEAD")}
   )
   private void mouseBind(long window, int button, int action, int modifiers, CallbackInfo ci) {
      if (window == this.client.getWindow().getHandle() && il_l_li__li_i1lI1iII_I_iI_l1Ii1.Ii_iI1i_I_il_IliII_li__() != null) {
         il_l_li__li_i1lI1iII_I_iI_l1Ii1.lIIil1_ii11__III_lI1_1_1_().call(new IiI_1_i_l_iI_1iilillIiiI_1I_l(1000 + button, action));
      }
   }

   @Inject(
      method = {"onMouseScroll"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wheelBind(long window, double horizontal, double vertical, CallbackInfo ci) {
      if (vertical != 0.0 && window == this.client.getWindow().getHandle() && il_l_li__li_i1lI1iII_I_iI_l1Ii1.Ii_iI1i_I_il_IliII_li__() != null) {
         int code = lli_11I__lI_i1li1Ii11i_.Ii1_II_i11_il_l11l1II_lI_I(vertical);
         lli_11I__lI_i1li1Ii11i_.l1l11_i11_iIIi1iI1I_1111__I11(code);
         il_l_li__li_i1lI1iII_I_iI_l1Ii1.lIIil1_ii11__III_lI1_1_1_().call(new IiI_1_i_l_iI_1iilillIiiI_1I_l(code, 1));
         if (this.client.currentScreen == null && il_l_li__li_i1lI1iII_I_iI_l1Ii1.Il_il_1lIi11i1lIi1_1i1il__i(code)) {
            ci.cancel();
         }
      }
   }
}
