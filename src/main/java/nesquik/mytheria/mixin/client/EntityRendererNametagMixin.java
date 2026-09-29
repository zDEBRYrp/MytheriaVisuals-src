package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l2_I1.ii__1_1I_lII_lii_lil__;
import com.llamalad7.mixinextras.sugar.Local;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({EntityRenderer.class})
public class EntityRendererNametagMixin {
   @ModifyVariable(
      method = {"renderLabelIfPresent"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private Text mytheria$badgeSpace(Text name, @Local(argsOnly = true) EntityRenderState state) {
      return ii__1_1I_lII_lii_lil__.iIi_Iii1Il_l_I_iiIlll_i1ii1(state, name);
   }

   @Inject(
      method = {"renderLabelIfPresent"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/font/TextRenderer;draw(Lnet/minecraft/text/Text;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/font/TextRenderer$TextLayerType;II)I",
         ordinal = 0
      )}
   )
   private void mytheria$badge(EntityRenderState state, Text name, MatrixStack poseStack, VertexConsumerProvider buffers, int light, CallbackInfo ci) {
      ii__1_1I_lII_lii_lil__.I_II1lii_1lli1_1lil_IlI1(name, poseStack.peek().getPositionMatrix());
   }
}
