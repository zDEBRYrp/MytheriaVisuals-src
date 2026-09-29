package nesquik.mytheria.mixin.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.session.Session;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({MinecraftClient.class})
public interface MinecraftAccessor {
   @Accessor("itemUseCooldown")
   int mytheria$getRightClickDelay();

   @Accessor("itemUseCooldown")
   void mytheria$setRightClickDelay(int var1);

   @Mutable
   @Accessor("session")
   void mytheria$setUser(Session var1);

   @Invoker("doAttack")
   boolean mytheria$startAttack();

   @Invoker("doItemUse")
   void mytheria$startUseItem();
}
