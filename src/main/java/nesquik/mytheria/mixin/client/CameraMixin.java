package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l2_I1.iI_IllliIIIliI11i11IiiIIil11;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({Camera.class})
public abstract class CameraMixin {
   @Shadow
   protected abstract void setRotation(float var1, float var2);

   @Redirect(
      method = {"update"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V"
      )
   )
   private void freeLook(
      Camera instance, float yRot, float xRot, BlockView level, Entity entity, boolean detached, boolean thirdPersonReverse, float partialTick
   ) {
      float[] rotation = iI_IllliIIIliI11i11IiiIIil11.lli1II1I1I_1l1ii_1II_ii1();
      if (rotation == null) {
         this.setRotation(yRot, xRot);
      } else if (detached && thirdPersonReverse) {
         this.setRotation(rotation[0] + 180.0F, -rotation[1]);
      } else {
         this.setRotation(rotation[0], rotation[1]);
      }
   }
}
