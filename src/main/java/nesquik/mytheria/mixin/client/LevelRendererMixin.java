package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.Ii1il11Il_1_l_iI_lIIll_liiI;
import II1II1II1II1II1II1II1II1.l5_I4.Ili1_liliI1lllI___Ii1l__11IiI1l;
import II1II1II1II1II1II1II1II1.l5_I4.i1__11__1_IIlil_i1IlIii1;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({WorldRenderer.class})
public class LevelRendererMixin {
   @Inject(
      method = {"drawBlockOutline"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void blockOutline(
      MatrixStack matrices,
      VertexConsumer consumer,
      Entity entity,
      double cameraX,
      double cameraY,
      double cameraZ,
      BlockPos pos,
      BlockState state,
      int color,
      CallbackInfo ci
   ) {
      if (Ii1il11Il_1_l_iI_lIIll_liiI.lI1i1_11lii_11Il1III_l_1l__l1I_("Подсветка блока") || i1__11__1_IIlil_i1IlIii1.i1l_i_li_1i1illll1l1lIi_1_iIiI()) {
         ci.cancel();
      }
   }

   @Inject(
      method = {"renderSky"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void skyShaderSky(CallbackInfo ci) {
      if (Ili1_liliI1lllI___Ii1l__11IiI1l.l_1il1ii_1_1iIllIl1Iil_Iii_I_l()) {
         ci.cancel();
      }
   }

   @Inject(
      method = {"renderClouds"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void skyShaderClouds(CallbackInfo ci) {
      if (Ili1_liliI1lllI___Ii1l__11IiI1l.l_1il1ii_1_1iIllIl1Iil_Iii_I_l()) {
         ci.cancel();
      }
   }
}
