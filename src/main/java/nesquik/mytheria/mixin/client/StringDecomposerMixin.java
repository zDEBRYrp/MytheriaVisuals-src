package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.l2_I1.lii_II1llli1i1Il_11i_i;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.TextVisitFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Environment(EnvType.CLIENT)
@Mixin({TextVisitFactory.class})
public class StringDecomposerMixin {
   @ModifyArg(
      method = {"visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z"},
      index = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/text/TextVisitFactory;visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z",
         ordinal = 0
      )
   )
   private static String patchName(String text) {
      return lii_II1llli1i1Il_11i_i.ii1Ii1l1Ii__iIi1I_I1l1i1i_1(text);
   }
}
