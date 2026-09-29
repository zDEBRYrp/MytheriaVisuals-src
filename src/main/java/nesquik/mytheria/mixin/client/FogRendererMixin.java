package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.i_Iii11I11Il_1i_i_i11i_ll_1l;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.client.world.ClientWorld;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({BackgroundRenderer.class})
public class FogRendererMixin {
   @Inject(
      method = {"getFogColor"},
      at = {@At("RETURN")}
   )
   private static void fogColor(
      Camera camera, float partialTick, ClientWorld level, int renderDistance, float darkenWorldAmount, CallbackInfoReturnable<Vector4f> cir
   ) {
      if (i_Iii11I11Il_1i_i_i11i_ll_1l.lllI1_1_Iiii_l1i111llIIl1I() && camera.getSubmersionType() == CameraSubmersionType.NONE) {
         Vector4f color = (Vector4f)cir.getReturnValue();
         if (color != null) {
            float[] tint = i_Iii11I11Il_1i_i_i11i_ll_1l.i111lli_1l_iIIlIlIllIiI__ll1_I1(color.x, color.y, color.z);
            color.set(tint[0], tint[1], tint[2], color.w);
         }
      }
   }

   @Inject(
      method = {"applyFog(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/BackgroundRenderer$FogType;Lorg/joml/Vector4f;FZF)Lnet/minecraft/client/render/Fog;"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private static void customFog(
      Camera camera, FogType mode, Vector4f color, float renderDistance, boolean thickFog, float partialTick, CallbackInfoReturnable<Fog> cir
   ) {
      if (i_Iii11I11Il_1i_i_i11i_ll_1l.lllI1_1_Iiii_l1i111llIIl1I() && camera.getSubmersionType() == CameraSubmersionType.NONE) {
         Fog parameters = (Fog)cir.getReturnValue();
         float[] tint = i_Iii11I11Il_1i_i_i11i_ll_1l.i111lli_1l_iIIlIlIllIiI__ll1_I1(parameters.red(), parameters.green(), parameters.blue());
         cir.setReturnValue(
            new Fog(
               i_Iii11I11Il_1i_i_i11i_ll_1l.ll_li_11_l_l_iII1ll1iIII_i(),
               i_Iii11I11Il_1i_i_i11i_ll_1l.I1I__1l11II__III1iiilI_II(),
               parameters.shape(),
               tint[0],
               tint[1],
               tint[2],
               parameters.alpha()
            )
         );
      }
   }
}
