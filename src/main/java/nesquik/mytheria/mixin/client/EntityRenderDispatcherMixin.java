package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.i1__1il1I_i1_I_I1_1liiI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({EntityRenderDispatcher.class})
public class EntityRenderDispatcherMixin {
   @Inject(
      method = {"renderHitbox"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void customHitBox(
      MatrixStack matrices, VertexConsumer consumer, Entity entity, float partialTick, float red, float green, float blue, CallbackInfo ci
   ) {
      if (i1__1il1I_i1_I_I1_1liiI.IiiIlIl111ll_11I_liiI1_I_1I(entity)) {
         ci.cancel();
      }
   }
}
