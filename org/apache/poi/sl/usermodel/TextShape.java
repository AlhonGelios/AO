package org.apache.poi.sl.usermodel;

import java.util.List;
import org.apache.poi.sl.usermodel.Insets2D;
import org.apache.poi.sl.usermodel.SimpleShape;
import org.apache.poi.sl.usermodel.TextRun;
import org.apache.poi.sl.usermodel.VerticalAlignment;

public interface TextShape extends SimpleShape, Iterable {

   String getText();

   TextRun setText(String var1);

   TextRun appendText(String var1, boolean var2);

   List getTextParagraphs();

   Insets2D getInsets();

   void setInsets(Insets2D var1);

   double getTextHeight();

   VerticalAlignment getVerticalAlignment();

   void setVerticalAlignment(VerticalAlignment var1);

   boolean isHorizontalCentered();

   void setHorizontalCentered(Boolean var1);

   boolean getWordWrap();

   void setWordWrap(boolean var1);

   TextShape.TextDirection getTextDirection();

   void setTextDirection(TextShape.TextDirection var1);

   Double getTextRotation();

   void setTextRotation(Double var1);

   void setTextPlaceholder(TextShape.TextPlaceholder var1);

   TextShape.TextPlaceholder getTextPlaceholder();

   public static enum TextDirection {

      HORIZONTAL("HORIZONTAL", 0),
      VERTICAL("VERTICAL", 1),
      VERTICAL_270("VERTICAL_270", 2),
      STACKED("STACKED", 3);
      // $FF: synthetic field
      private static final TextShape.TextDirection[] $VALUES = new TextShape.TextDirection[]{HORIZONTAL, VERTICAL, VERTICAL_270, STACKED};


      private TextDirection(String var1, int var2) {}

   }

   public static enum TextPlaceholder {

      TITLE("TITLE", 0),
      BODY("BODY", 1),
      CENTER_TITLE("CENTER_TITLE", 2),
      CENTER_BODY("CENTER_BODY", 3),
      HALF_BODY("HALF_BODY", 4),
      QUARTER_BODY("QUARTER_BODY", 5),
      NOTES("NOTES", 6),
      OTHER("OTHER", 7);
      // $FF: synthetic field
      private static final TextShape.TextPlaceholder[] $VALUES = new TextShape.TextPlaceholder[]{TITLE, BODY, CENTER_TITLE, CENTER_BODY, HALF_BODY, QUARTER_BODY, NOTES, OTHER};


      private TextPlaceholder(String var1, int var2) {}

   }

   public static enum TextAutofit {

      NONE("NONE", 0),
      NORMAL("NORMAL", 1),
      SHAPE("SHAPE", 2);
      // $FF: synthetic field
      private static final TextShape.TextAutofit[] $VALUES = new TextShape.TextAutofit[]{NONE, NORMAL, SHAPE};


      private TextAutofit(String var1, int var2) {}

   }
}
