package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.Ii1ii1__ilIl1II_l_l_ilI_1iliI1;
import II1II1II1II1II1II1II1II1.l5_I4.Ii1il11Il_1_l_iI_lIIll_liiI;
import II1II1II1II1II1II1II1II1.l5_I4.i11_ill_lIlII1II_1iii1lli11I11i;
import II1II1II1II1II1II1II1II1.l5_I4.iIll1lli1il1I__lI_1ll_;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({GameRenderer.class})
public class GameRendererMixin {
   @Redirect(
      method = {"getBasicProjectionMatrix"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/util/Window;getFramebufferWidth()I"
      )
   )
   private int aspectRatio(Window window) {
      float aspect = Ii1ii1__ilIl1II_l_l_ilI_1iliI1.lii1lIllll__1iiiI1I_I1l();
      if (aspect <= 0.0F) {
         return window.getFramebufferWidth();
      } else {
         int stretched = (int)((float)window.getFramebufferHeight() * aspect);
         return Ii1ii1__ilIl1II_l_l_ilI_1iliI1.lllI__liIIi___1Ii_1_1I1l1_11i1() ? Math.max(window.getFramebufferWidth(), stretched) : stretched;
      }
   }

   @WrapOperation(
      method = {"renderWorld"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/GameRenderer;getBasicProjectionMatrix(F)Lorg/joml/Matrix4f;",
         ordinal = 1
      )}
   )
   private Matrix4f cullingProjection(GameRenderer renderer, float fov, Operation<Matrix4f> original) {
      Ii1ii1__ilIl1II_l_l_ilI_1iliI1.Ii1IiI1_IilIliillIii1_();

      Matrix4f var4;
      try {
         var4 = (Matrix4f)original.call(new Object[]{renderer, fov});
      } finally {
         Ii1ii1__ilIl1II_l_l_ilI_1iliI1.liIl_IIl1_Ill1_1___Il1lI_lil();
      }

      return var4;
   }

   @Inject(
      method = {"getFov"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void zoom(Camera camera, float partialTick, boolean useFovSetting, CallbackInfoReturnable<Float> cir) {
      if (i11_ill_lIlII1II_1iii1lli11I11i.li_1iII1_ii_lIII1_i_Iiii()) {
         cir.setReturnValue(i11_ill_lIlII1II_1iii1lli11I11i.l11l1_1I__lill1li_iiIi11l__1I1((Float)cir.getReturnValue()));
      } else if (Ii1il11Il_1_l_iI_lIIll_liiI.lI1i1_11lii_11Il1III_l_1l__l1I_("FOV") && useFovSetting) {
         cir.setReturnValue((float)this.mytheria$fovSetting());
      }
   }

   @Inject(
      method = {"tiltViewWhenHurt"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hurtTilt(MatrixStack matrices, float partialTick, CallbackInfo ci) {
      if (Ii1il11Il_1_l_iI_lIIll_liiI.lI1i1_11lii_11Il1III_l_1l__l1I_("Урон")) {
         ci.cancel();
      }
   }

   @Inject(
      method = {"bobView"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void viewBobbing(MatrixStack matrices, float partialTick, CallbackInfo ci) {
      if (Ii1il11Il_1_l_iI_lIIll_liiI.lI1i1_11lii_11Il1III_l_1l__l1I_("Покачивание")) {
         ci.cancel();
      }
   }

   private double mytheria$fovSetting() {
      return (double)((Integer)MinecraftClient.getInstance().options.getFov().getValue()).intValue();
   }

   @WrapOperation(
      method = {"renderWorld"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/GameRenderer;renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V"
      )}
   )
   private void blurHand(GameRenderer renderer, Camera camera, float partialTick, Matrix4f projection, Operation<Void> original) {
      iIll1lli1il1I__lI_1ll_ blurHand = iIll1lli1il1I__lI_1ll_.li1II_111llili11_ll1lI_iIl1l_1I();
      if (blurHand != null && blurHand.isEnabled()) {
         blurHand.render(() -> original.call(new Object[]{renderer, camera, partialTick, projection}));
      } else {
         original.call(new Object[]{renderer, camera, partialTick, projection});
      }
   }
}
