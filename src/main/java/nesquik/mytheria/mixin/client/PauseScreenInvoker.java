package nesquik.mytheria.mixin.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.GameMenuScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({GameMenuScreen.class})
public interface PauseScreenInvoker {
   @Invoker("disconnect")
   void mytheria$onDisconnect();
}
