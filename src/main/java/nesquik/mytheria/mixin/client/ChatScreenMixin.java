package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I3_i2.lIIlI__I1_I___IIIlII1i_i_iil1i;
import II1II1II1II1II1II1II1II1.l2_I1.I1ill11iiIll1_iliI_11lI1iiIii;
import II1II1II1II1II1II1II1II1.l2_I1.IiII_II_1__1II_1l1I1Iiil1I;
import II1II1II1II1II1II1II1II1.l8_I7.I_i1iii1l_i1Il1_l11_IIiI1ll____;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({ChatScreen.class})
public class ChatScreenMixin {
   @Inject(
      method = {"sendMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void handleChatInput(String message, boolean addToHistory, CallbackInfo ci) {
      if (lIIlI__I1_I___IIIlII1i_i_iil1i.lIl1il_lllll1_I1l_1Il1_Il1ll().handle(message)) {
         if (addToHistory) {
            I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.inGameHud.getChatHud().addToMessageHistory(message);
         }

         ci.cancel();
      } else if (IiII_II_1__1II_1l1I1Iiil1I.I_l_11i11i_l_____l__111___111(message)) {
         ci.cancel();
      } else {
         String converted = I1ill11iiIll1_iliI_11lI1iiIii.lIII1I1iIillI1ll1iI1___l1il(message);
         if (converted != null && I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.player != null && I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.player.networkHandler != null) {
            if (addToHistory) {
               I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.inGameHud.getChatHud().addToMessageHistory(message);
            }

            I_i1iii1l_i1Il1_l11_IIiI1ll____.mc.player.networkHandler.sendChatCommand(converted.substring(1));
            ci.cancel();
         }
      }
   }
}
