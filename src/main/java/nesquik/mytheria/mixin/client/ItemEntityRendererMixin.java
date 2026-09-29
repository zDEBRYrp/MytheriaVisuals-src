package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I6_i5.I1I_l__11IIliiIi1Illi1;
import II1II1II1II1II1II1II1II1.l5_I4.ili1I_i1_lllI11illIl_llli_l_;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.math.RotationAxis;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({ItemEntityRenderer.class})
public class ItemEntityRendererMixin {
   @Unique
   private static final float SPIN_SPEED = 15.0F;

   @Inject(
      method = {"updateRenderState(Lnet/minecraft/entity/ItemEntity;Lnet/minecraft/client/render/entity/state/ItemEntityRenderState;F)V"},
      at = {@At("RETURN")}
   )
   private void grounded(ItemEntity entity, ItemEntityRenderState state, float partialTick, CallbackInfo ci) {
      ((I1I_l__11IIliiIi1Illi1)state).mytheria$setGrounded(entity.isOnGround());
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/ItemEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V",
         ordinal = 0
      )
   )
   private void lift(
      MatrixStack matrices, float x, float y, float z, ItemEntityRenderState state, MatrixStack matricesArg, VertexConsumerProvider buffers, int light
   ) {
      if (!ili1I_i1_lllI11illIl_llli_l_.IlIi1IIIl1II1I1ilii1ii_()) {
         matrices.translate(x, y, z);
      } else {
         float scale = state.itemRenderState.getTransformation().scale.y();
         if (((I1I_l__11IIliiIi1Illi1)state).mytheria$isGrounded()) {
            float half = state.itemRenderState.hasDepth() ? scale * 0.5F : scale / 32.0F;
            matrices.translate(x, half + 0.005F, z);
         } else {
            matrices.translate(x, 0.25F * scale + 0.0625F, z);
         }
      }
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/state/ItemEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/ItemEntityRenderer;renderStack(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/ItemStackEntityRenderState;Lnet/minecraft/util/math/random/Random;)V"
      )}
   )
   private void itemPhysic(ItemEntityRenderState state, MatrixStack matrices, VertexConsumerProvider buffers, int light, CallbackInfo ci) {
      if (ili1I_i1_lllI11illIl_llli_l_.IlIi1IIIl1II1I1ilii1ii_()) {
         matrices.multiply(RotationAxis.POSITIVE_Y.rotation(-ItemEntity.getRotation(state.age, state.uniqueOffset)));
         if (((I1I_l__11IIliiIi1Illi1)state).mytheria$isGrounded()) {
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
         } else {
            float offset = state.uniqueOffset / (float) (Math.PI * 2);
            float rotation = (state.age * 15.0F + offset * 360.0F) % 360.0F;
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(rotation));
         }
      }
   }
}
