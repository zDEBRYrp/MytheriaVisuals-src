package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.Ii1il11Il_1_l_iI_lIIll_liiI;
import II1II1II1II1II1II1II1II1.l5_I4.iIlIilI11lI1_1_lI_1il_;
import II1II1II1II1II1II1II1II1.l5_I4.l1__1l___l1_111ill1liiIili11i;
import II1II1II1II1II1II1II1II1.l8_I7.I_i1iii1l_i1Il1_l11_IIiI1ll____;
import com.llamalad7.mixinextras.sugar.Local;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({LivingEntityRenderer.class})
public class LivingEntityRendererMixin {
   @ModifyArg(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      ),
      index = 4
   )
   private int hitColor(int color, @Local(argsOnly = true) LivingEntityRenderState state) {
      return state.hurt && l1__1l___l1_111ill1liiIili11i.IIIlIi1l1IlI1iIiIi1iIi() ? l1__1l___l1_111ill1liiIili11i.I_lIi_IiIl__I11ilII1Ili(color) : color;
   }

   @ModifyArg(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      ),
      index = 3
   )
   private int hitOverlay(int overlay, @Local(argsOnly = true) LivingEntityRenderState state) {
      return state.hurt && l1__1l___l1_111ill1liiIili11i.IIIlIi1l1IlI1iIiIi1iIi() ? OverlayTexture.DEFAULT_UV : overlay;
   }

   @Inject(
      method = {"hasLabel(Lnet/minecraft/entity/LivingEntity;D)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void selfNametag(LivingEntity entity, double distanceSquared, CallbackInfoReturnable<Boolean> cir) {
      if (iIlIilI11lI1_1_lI_1il_.iliIi1Il_l11_1___lII_l1Il_ili()
         && entity == I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.player
         && !I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.options.getPerspective().isFirstPerson()) {
         cir.setReturnValue(true);
      }
   }

   @Inject(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At("RETURN")}
   )
   private void noGlowing(LivingEntity entity, LivingEntityRenderState state, float partialTick, CallbackInfo ci) {
      if (Ii1il11Il_1_l_iI_lIIll_liiI.lI1i1_11lii_11Il1III_l_1l__l1I_("Свечение")) {
         state.hasOutline = false;
      }
   }
}
