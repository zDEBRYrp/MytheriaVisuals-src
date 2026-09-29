package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I6_i5.I1I_l__11IIliiIi1Illi1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Environment(EnvType.CLIENT)
@Mixin({ItemEntityRenderState.class})
public class ItemEntityRenderStateMixin implements I1I_l__11IIliiIi1Illi1 {
   @Unique
   private boolean mytheria$grounded;
   @Unique
   private float mytheria$yaw;

   @Override
   public boolean mytheria$isGrounded() {
      return this.mytheria$grounded;
   }

   @Override
   public void mytheria$setGrounded(boolean grounded) {
      this.mytheria$grounded = grounded;
   }

   @Override
   public float mytheria$getYaw() {
      return this.mytheria$yaw;
   }

   @Override
   public void mytheria$setYaw(float yaw) {
      this.mytheria$yaw = yaw;
   }
}
