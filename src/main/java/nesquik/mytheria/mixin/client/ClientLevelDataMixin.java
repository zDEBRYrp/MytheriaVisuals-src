package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l5_I4.i_Iii11I11Il_1i_i_i11i_ll_1l;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.world.ClientWorld.Properties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({Properties.class})
public class ClientLevelDataMixin {
   @Inject(
      method = {"getTimeOfDay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void customTime(CallbackInfoReturnable<Long> cir) {
      if (i_Iii11I11Il_1i_i_i11i_ll_1l.lIillIilllI111_i_l111i1()) {
         cir.setReturnValue(i_Iii11I11Il_1i_i_i11i_ll_1l.i_1ll1iIllliiIiI1iIiIII());
      }
   }
}
