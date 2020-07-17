package org.apache.poi.sl.usermodel;

import java.awt.Color;
import java.util.List;
import org.apache.poi.sl.usermodel.AutoNumberingScheme;
import org.apache.poi.sl.usermodel.PaintStyle;
import org.apache.poi.sl.usermodel.TextShape;

public interface TextParagraph extends Iterable {

   Double getSpaceBefore();

   void setSpaceBefore(Double var1);

   Double getSpaceAfter();

   void setSpaceAfter(Double var1);

   Double getLeftMargin();

   void setLeftMargin(Double var1);

   Double getRightMargin();

   void setRightMargin(Double var1);

   Double getIndent();

   void setIndent(Double var1);

   int getIndentLevel();

   void setIndentLevel(int var1);

   Double getLineSpacing();

   void setLineSpacing(Double var1);

   String getDefaultFontFamily();

   Double getDefaultFontSize();

   TextParagraph.TextAlign getTextAlign();

   void setTextAlign(TextParagraph.TextAlign var1);

   TextParagraph.FontAlign getFontAlign();

   TextParagraph.BulletStyle getBulletStyle();

   void setBulletStyle(Object ... var1);

   Double getDefaultTabSize();

   TextShape getParentShape();

   List getTextRuns();

   boolean isHeaderOrFooter();

   public static enum TextAlign {

      LEFT("LEFT", 0),
      CENTER("CENTER", 1),
      RIGHT("RIGHT", 2),
      JUSTIFY("JUSTIFY", 3),
      JUSTIFY_LOW("JUSTIFY_LOW", 4),
      DIST("DIST", 5),
      THAI_DIST("THAI_DIST", 6);
      // $FF: synthetic field
      private static final TextParagraph.TextAlign[] $VALUES = new TextParagraph.TextAlign[]{LEFT, CENTER, RIGHT, JUSTIFY, JUSTIFY_LOW, DIST, THAI_DIST};


      private TextAlign(String var1, int var2) {}

   }

   public interface BulletStyle {

      String getBulletCharacter();

      String getBulletFont();

      Double getBulletFontSize();

      void setBulletFontColor(Color var1);

      void setBulletFontColor(PaintStyle var1);

      PaintStyle getBulletFontColor();

      AutoNumberingScheme getAutoNumberingScheme();

      Integer getAutoNumberingStartAt();
   }

   public static enum FontAlign {

      AUTO("AUTO", 0),
      TOP("TOP", 1),
      CENTER("CENTER", 2),
      BASELINE("BASELINE", 3),
      BOTTOM("BOTTOM", 4);
      // $FF: synthetic field
      private static final TextParagraph.FontAlign[] $VALUES = new TextParagraph.FontAlign[]{AUTO, TOP, CENTER, BASELINE, BOTTOM};


      private FontAlign(String var1, int var2) {}

   }
}
