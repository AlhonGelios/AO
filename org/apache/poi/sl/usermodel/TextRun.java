package org.apache.poi.sl.usermodel;

import java.awt.Color;
import org.apache.poi.sl.usermodel.Hyperlink;
import org.apache.poi.sl.usermodel.PaintStyle;

public interface TextRun {

   String getRawText();

   void setText(String var1);

   TextRun.TextCap getTextCap();

   PaintStyle getFontColor();

   void setFontColor(Color var1);

   void setFontColor(PaintStyle var1);

   Double getFontSize();

   void setFontSize(Double var1);

   String getFontFamily();

   void setFontFamily(String var1);

   boolean isBold();

   void setBold(boolean var1);

   boolean isItalic();

   void setItalic(boolean var1);

   boolean isUnderlined();

   void setUnderlined(boolean var1);

   boolean isStrikethrough();

   void setStrikethrough(boolean var1);

   boolean isSubscript();

   boolean isSuperscript();

   byte getPitchAndFamily();

   Hyperlink getHyperlink();

   Hyperlink createHyperlink();

   public static enum TextCap {

      NONE("NONE", 0),
      SMALL("SMALL", 1),
      ALL("ALL", 2);
      // $FF: synthetic field
      private static final TextRun.TextCap[] $VALUES = new TextRun.TextCap[]{NONE, SMALL, ALL};


      private TextCap(String var1, int var2) {}

   }
}
