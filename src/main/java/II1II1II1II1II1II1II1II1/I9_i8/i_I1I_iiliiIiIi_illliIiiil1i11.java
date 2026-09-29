package II1II1II1II1II1II1II1II1.I9_i8;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class i_I1I_iiliiIiIi_illliIiiil1i11 {
   private i_I1I_iiliiIiIi_illliIiiil1i11.IiI1i_l_i___111iI11i1i1I__I atlas;
   private i_I1I_iiliiIiIi_illliIiiil1i11.I1_I111_IIl1i_i1i_l1i_ii_IiiI metrics;
   private List<i_I1I_iiliiIiIi_illliIiiil1i11.l_1l_l_i1llI1i_lIl_lIII_i1II> glyphs;
   @SerializedName("kerning")
   private List<i_I1I_iiliiIiIi_illliIiiil1i11.l_iiI1i__1iI1_iIIli_llI1_> kernings;

   public i_I1I_iiliiIiIi_illliIiiil1i11.IiI1i_l_i___111iI11i1i1I__I atlas() {
      return this.atlas;
   }

   public i_I1I_iiliiIiIi_illliIiiil1i11.I1_I111_IIl1i_i1i_l1i_ii_IiiI metrics() {
      return this.metrics;
   }

   public List<i_I1I_iiliiIiIi_illliIiiil1i11.l_1l_l_i1llI1i_lIl_lIII_i1II> glyphs() {
      return this.glyphs;
   }

   public List<i_I1I_iiliiIiIi_illliIiiil1i11.l_iiI1i__1iI1_iIIli_llI1_> kernings() {
      return this.kernings;
   }

   @Environment(EnvType.CLIENT)
   public static final class I1_I111_IIl1i_i1i_l1i_ii_IiiI {
      private float lineHeight;
      private float descender;

      public float baselineHeight() {
         return this.lineHeight + this.descender;
      }
   }

   @Environment(EnvType.CLIENT)
   public static final class IiI1i_l_i___111iI11i1i1I__I {
      @SerializedName("distanceRange")
      private float range;
      private float width;
      private float height;

      public float range() {
         return this.range;
      }

      public float width() {
         return this.width;
      }

      public float height() {
         return this.height;
      }
   }

   @Environment(EnvType.CLIENT)
   public static final class IiIiIII__IliIIlli1iiI_1 {
      private float left;
      private float top;
      private float right;
      private float bottom;

      public float left() {
         return this.left;
      }

      public float top() {
         return this.top;
      }

      public float right() {
         return this.right;
      }

      public float bottom() {
         return this.bottom;
      }
   }

   @Environment(EnvType.CLIENT)
   public static final class l_1l_l_i1llI1i_lIl_lIII_i1II {
      private int unicode;
      private float advance;
      private i_I1I_iiliiIiIi_illliIiiil1i11.IiIiIII__IliIIlli1iiI_1 planeBounds;
      private i_I1I_iiliiIiIi_illliIiiil1i11.IiIiIII__IliIIlli1iiI_1 atlasBounds;

      public int unicode() {
         return this.unicode;
      }

      public float advance() {
         return this.advance;
      }

      public i_I1I_iiliiIiIi_illliIiiil1i11.IiIiIII__IliIIlli1iiI_1 planeBounds() {
         return this.planeBounds;
      }

      public i_I1I_iiliiIiIi_illliIiiil1i11.IiIiIII__IliIIlli1iiI_1 atlasBounds() {
         return this.atlasBounds;
      }
   }

   @Environment(EnvType.CLIENT)
   public static final class l_iiI1i__1iI1_iIIli_llI1_ {
      @SerializedName("unicode1")
      private int leftChar;
      @SerializedName("unicode2")
      private int rightChar;
      private float advance;

      public int leftChar() {
         return this.leftChar;
      }

      public int rightChar() {
         return this.rightChar;
      }

      public float advance() {
         return this.advance;
      }
   }
}
