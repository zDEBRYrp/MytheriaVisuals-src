package II1II1II1II1II1II1II1II1.I3_i2;

import java.io.IOException;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface IlI1I_l1__1II1ii_I_l1II_iIIiI {
   void write(byte[] var1) throws IOException;

   int read(byte[] var1, int var2, int var3) throws IOException;

   boolean open();

   void close() throws IOException;
}
