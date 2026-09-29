package II1II1II1II1II1II1II1II1.I9_i8;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public interface Ii11I1III11iiili_I_lIlll1IIlI {
   Matrix4f DEFAULT_MATRIX = new Matrix4f();

   default void render(double param1, double nullx) {
      this.render((float)var1, (float)nullx);
   }

   default void render(float param1, float nullx) {
      this.render(DEFAULT_MATRIX, var1, nullx);
   }

   default void render(Matrix4f param1, double nullx, double nullxx) {
      this.render(var1, (float)nullx, (float)nullxx);
   }

   default void render(Matrix4f param1, float nullx, float nullxx) {
      this.render(var1, nullx, nullxx, 0.0F);
   }

   default void render(double param1, double nullx, double nullxx) {
      this.render((float)var1, (float)nullx, (float)nullxx);
   }

   default void render(float param1, float nullx, float nullxx) {
      this.render(DEFAULT_MATRIX, var1, nullx, nullxx);
   }

   default void render(Matrix4f param1, double nullx, double nullxx, double nullxxx) {
      this.render(var1, (float)nullx, (float)nullxx, (float)nullxxx);
   }

   void render(Matrix4f var1, float var2, float var3, float var4);
}
