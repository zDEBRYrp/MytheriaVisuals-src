package nesquik.mytheria.mixin.client;

import II1II1II1II1II1II1II1II1.I2_i1.Il1ilIiii_IlIl1iII1_1IIilI1i;
import II1II1II1II1II1II1II1II1.I3_i2.il_l_li__li_i1lI1iII_I_iI_l1Ii1;
import II1II1II1II1II1II1II1II1.l4_I3.ii_iliilII1i_i11_ii1liI;
import II1II1II1II1II1II1II1II1.l5_I4.Ii1il11Il_1_l_iI_lIIll_liiI;
import II1II1II1II1II1II1II1II1.l9_I8.II_i1_l1l_Ill11I1__1iII1_1;
import II1II1II1II1II1II1II1II1.l9_I8.llllIlilI_ll_1li_l_i_1_1lI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({MinecraftClient.class})
public class MinecraftMixin {
   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void tick(CallbackInfo ci) {
      ii_iliilII1i_i11_ii1liI.ll_III_I__I_Iiilii_Iilli__l();
      if (il_l_li__li_i1lI1iII_I_iI_l1Ii1.Ii_iI1i_I_il_IliII_li__() != null) {
         il_l_li__li_i1lI1iII_I_iI_l1Ii1.lIIil1_ii11__III_lI1_1_1_().call(new llllIlilI_ll_1li_l_i_1_1lI());
      }
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void mytheria$customMainMenu(Screen screen, CallbackInfo ci) {
      if (screen instanceof TitleScreen && !II_i1_l1l_Ill11I1__1iII1_1.i_i_li11IIiii_l1lI1_1I(screen)) {
         ci.cancel();
         ((MinecraftClient)this).setScreen(new II_i1_l1l_Ill11I1__1iII1_1());
      }
   }

   @Inject(
      method = {"hasOutline"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void mytheria$noGlowing(Entity entity, CallbackInfoReturnable<Boolean> cir) {
      if (Ii1il11Il_1_l_iI_lIIll_liiI.lI1i1_11lii_11Il1III_l_1l__l1I_("Свечение")) {
         cir.setReturnValue(false);
      }
   }

   @Inject(
      method = {"getWindowTitle"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void createTitle(CallbackInfoReturnable<String> cir) {
      cir.setReturnValue(Il1ilIiii_IlIl1iII1_1IIilI1i.I_lI_iIii1l_l_il_i1liil_I());
   }
}
