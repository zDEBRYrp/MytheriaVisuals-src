package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l2_I1.ii__1_1I_lII_lii_lil__;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({PlayerListHud.class})
public class PlayerTabOverlayMixin {
   @Inject(
      method = {"getPlayerName"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void mytheria$badgeSpace(PlayerListEntry info, CallbackInfoReturnable<Text> cir) {
      cir.setReturnValue(ii__1_1I_lII_lii_lil__.lIIiIl1l1l1lli1iI1i_il(info.getProfile().getId(), (Text)cir.getReturnValue()));
   }

   @Redirect(
      method = {"render"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)I"
      )
   )
   private int mytheria$trackName(DrawContext graphics, TextRenderer font, Text text, int x, int y, int color) {
      ii__1_1I_lII_lii_lil__.iI_II1Iili1I1_1ilIi_1lIll(text, x, y);
      return graphics.drawTextWithShadow(font, text, x, y, color);
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   private void mytheria$drawBadges(DrawContext graphics, int width, Scoreboard scoreboard, ScoreboardObjective objective, CallbackInfo ci) {
      ii__1_1I_lII_lii_lil__.iII_l_li_1l11IIiliI__1ii1_l(graphics);
   }
}
