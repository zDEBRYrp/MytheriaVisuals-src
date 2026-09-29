package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.l_iIillIi_1Iill__li1_iII_1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ModelTransformationMode;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({HeldItemRenderer.class})
public class ItemInHandRendererMixin {
   @Inject(
      method = {"renderItem"},
      at = {@At("HEAD")}
   )
   private void transformHeldItem(
      LivingEntity entity,
      ItemStack stack,
      ModelTransformationMode context,
      boolean leftHand,
      MatrixStack matrices,
      VertexConsumerProvider buffers,
      int light,
      CallbackInfo ci
   ) {
      Arm arm = firstPersonArm(context);
      if (!stack.isEmpty() && arm != null) {
         matrices.push();
         l_iIillIi_1Iill__li1_iII_1.il_i1_111_l_1liIiI1lIl1Iil1_I(matrices, arm);
      }
   }

   @Inject(
      method = {"renderItem"},
      at = {@At("RETURN")}
   )
   private void restoreHeldItemPose(
      LivingEntity entity,
      ItemStack stack,
      ModelTransformationMode context,
      boolean leftHand,
      MatrixStack matrices,
      VertexConsumerProvider buffers,
      int light,
      CallbackInfo ci
   ) {
      if (!stack.isEmpty() && firstPersonArm(context) != null) {
         matrices.pop();
      }
   }

   @Redirect(
      method = {"renderArmHoldingItem"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/PlayerEntityRenderer;renderRightArm(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;Z)V"
      )
   )
   private void renderViewModelRightArm(
      PlayerEntityRenderer renderer, MatrixStack matrices, VertexConsumerProvider buffers, int light, Identifier skin, boolean sleeve
   ) {
      matrices.push();

      try {
         l_iIillIi_1Iill__li1_iII_1.il_i1_111_l_1liIiI1lIl1Iil1_I(matrices, Arm.RIGHT);
         renderer.renderRightArm(matrices, buffers, light, skin, sleeve);
      } finally {
         matrices.pop();
      }
   }

   @Redirect(
      method = {"renderArmHoldingItem"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/PlayerEntityRenderer;renderLeftArm(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;Z)V"
      )
   )
   private void renderViewModelLeftArm(
      PlayerEntityRenderer renderer, MatrixStack matrices, VertexConsumerProvider buffers, int light, Identifier skin, boolean sleeve
   ) {
      matrices.push();

      try {
         l_iIillIi_1Iill__li1_iII_1.il_i1_111_l_1liIiI1lIl1Iil1_I(matrices, Arm.LEFT);
         renderer.renderLeftArm(matrices, buffers, light, skin, sleeve);
      } finally {
         matrices.pop();
      }
   }

   private static Arm firstPersonArm(ModelTransformationMode context) {
      return switch (context) {
         case FIRST_PERSON_RIGHT_HAND -> Arm.RIGHT;
         case FIRST_PERSON_LEFT_HAND -> Arm.LEFT;
         default -> null;
      };
   }
}
