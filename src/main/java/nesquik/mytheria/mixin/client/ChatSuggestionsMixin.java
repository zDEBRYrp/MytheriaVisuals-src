package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I3_i2.lIIlI__I1_I___IIIlII1i_i_iil1i;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({ChatScreen.class})
public abstract class ChatSuggestionsMixin {
   @Shadow
   protected TextFieldWidget chatField;
   @Shadow
   ChatInputSuggestor chatInputSuggestor;

   @Inject(
      method = {"onChatFieldUpdate"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onEdited(String text, CallbackInfo ci) {
      lIIlI__I1_I___IIIlII1i_i_iil1i manager = lIIlI__I1_I___IIIlII1i_i_iil1i.lIl1il_lllll1_I1l_1Il1_Il1ll();
      if (manager.isCommand(text)) {
         Suggestions suggestions = manager.buildSuggestions(text);
         CommandSuggestionsAccessor accessor = (CommandSuggestionsAccessor)this.chatInputSuggestor;
         accessor.mytheria$setCurrentParse(null);
         accessor.mytheria$getCommandUsage().clear();
         accessor.mytheria$setPendingSuggestions(CompletableFuture.completedFuture(suggestions));
         this.chatInputSuggestor.clearWindow();
         this.chatInputSuggestor.setWindowActive(true);
         this.chatField.setSuggestion(manager.suggestionSuffix(text, suggestions));
         if (!suggestions.isEmpty()) {
            this.chatInputSuggestor.show(false);
         }

         ci.cancel();
      }
   }
}
