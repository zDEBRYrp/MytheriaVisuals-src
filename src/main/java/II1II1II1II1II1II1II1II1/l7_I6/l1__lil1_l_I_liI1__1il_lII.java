package II1II1II1II1II1II1II1II1.l7_I6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Environment(EnvType.CLIENT)
public @interface l1__lil1_l_I_liI1__1il_lII {
   liI1i1I1iiI___lllll1I_IiI priority() default liI1i1I1iiI___lllll1I_IiI.low;
}
