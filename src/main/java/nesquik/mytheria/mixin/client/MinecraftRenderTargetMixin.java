package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.iIll1lli1il1I__lI_1ll_;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Environment(EnvType.CLIENT)
@Mixin({MinecraftClient.class})
public class MinecraftRenderTargetMixin {
   @ModifyReturnValue(
      method = {"getFramebuffer"},
      at = {@At("RETURN")}
   )
   private Framebuffer blurHandTarget(Framebuffer original) {
      Framebuffer capture = iIll1lli1il1I__lI_1ll_.ii1IlIiI1ii_illiIl1_Illlll11();
      return capture != null ? capture : original;
   }
}
