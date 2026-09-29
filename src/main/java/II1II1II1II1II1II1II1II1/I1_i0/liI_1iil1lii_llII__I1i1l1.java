package II1II1II1II1II1II1II1II1.I1_i0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public abstract class liI_1iil1lii_llII__I1i1l1<T> {
   public liI_1iil1lii_llII__I1i1l1() {
      this.reset();
   }

   public final T build() {
      Object var1 = this._build();
      this.reset();
      return (T)var1;
   }

   protected abstract void reset();

   protected abstract T _build();
}
