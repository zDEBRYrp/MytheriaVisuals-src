package nesquik.mytheria.mixin.client;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.command.CommandSource;
import net.minecraft.text.OrderedText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({ChatInputSuggestor.class})
public interface CommandSuggestionsAccessor {
   @Accessor("parse")
   void mytheria$setCurrentParse(ParseResults<CommandSource> var1);

   @Accessor("pendingSuggestions")
   void mytheria$setPendingSuggestions(CompletableFuture<Suggestions> var1);

   @Accessor("messages")
   List<OrderedText> mytheria$getCommandUsage();
}
