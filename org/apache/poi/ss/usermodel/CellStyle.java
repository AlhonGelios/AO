package org.apache.poi.ss.usermodel;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.util.Removal;

public interface CellStyle {

   @Removal(
      version = "3.17"
   )
   short ALIGN_GENERAL = 0;
   @Removal(
      version = "3.17"
   )
   short ALIGN_LEFT = 1;
   @Removal(
      version = "3.17"
   )
   short ALIGN_CENTER = 2;
   @Removal(
      version = "3.17"
   )
   short ALIGN_RIGHT = 3;
   @Removal(
      version = "3.17"
   )
   short ALIGN_FILL = 4;
   @Removal(
      version = "3.17"
   )
   short ALIGN_JUSTIFY = 5;
   @Removal(
      version = "3.17"
   )
   short ALIGN_CENTER_SELECTION = 6;
   @Removal(
      version = "3.17"
   )
   short VERTICAL_TOP = 0;
   @Removal(
      version = "3.17"
   )
   short VERTICAL_CENTER = 1;
   @Removal(
      version = "3.17"
   )
   short VERTICAL_BOTTOM = 2;
   @Removal(
      version = "3.17"
   )
   short VERTICAL_JUSTIFY = 3;
   @Removal(
      version = "3.17"
   )
   short BORDER_NONE = 0;
   @Removal(
      version = "3.17"
   )
   short BORDER_THIN = 1;
   @Removal(
      version = "3.17"
   )
   short BORDER_MEDIUM = 2;
   @Removal(
      version = "3.17"
   )
   short BORDER_DASHED = 3;
   @Removal(
      version = "3.17"
   )
   short BORDER_DOTTED = 4;
   @Removal(
      version = "3.17"
   )
   short BORDER_THICK = 5;
   @Removal(
      version = "3.17"
   )
   short BORDER_DOUBLE = 6;
   @Removal(
      version = "3.17"
   )
   short BORDER_HAIR = 7;
   @Removal(
      version = "3.17"
   )
   short BORDER_MEDIUM_DASHED = 8;
   @Removal(
      version = "3.17"
   )
   short BORDER_DASH_DOT = 9;
   @Removal(
      version = "3.17"
   )
   short BORDER_MEDIUM_DASH_DOT = 10;
   @Removal(
      version = "3.17"
   )
   short BORDER_DASH_DOT_DOT = 11;
   @Removal(
      version = "3.17"
   )
   short BORDER_MEDIUM_DASH_DOT_DOT = 12;
   @Removal(
      version = "3.17"
   )
   short BORDER_SLANTED_DASH_DOT = 13;
   @Removal(
      version = "3.17"
   )
   short NO_FILL = 0;
   @Removal(
      version = "3.17"
   )
   short SOLID_FOREGROUND = 1;
   @Removal(
      version = "3.17"
   )
   short FINE_DOTS = 2;
   @Removal(
      version = "3.17"
   )
   short ALT_BARS = 3;
   @Removal(
      version = "3.17"
   )
   short SPARSE_DOTS = 4;
   @Removal(
      version = "3.17"
   )
   short THICK_HORZ_BANDS = 5;
   @Removal(
      version = "3.17"
   )
   short THICK_VERT_BANDS = 6;
   @Removal(
      version = "3.17"
   )
   short THICK_BACKWARD_DIAG = 7;
   @Removal(
      version = "3.17"
   )
   short THICK_FORWARD_DIAG = 8;
   @Removal(
      version = "3.17"
   )
   short BIG_SPOTS = 9;
   @Removal(
      version = "3.17"
   )
   short BRICKS = 10;
   @Removal(
      version = "3.17"
   )
   short THIN_HORZ_BANDS = 11;
   @Removal(
      version = "3.17"
   )
   short THIN_VERT_BANDS = 12;
   @Removal(
      version = "3.17"
   )
   short THIN_BACKWARD_DIAG = 13;
   @Removal(
      version = "3.17"
   )
   short THIN_FORWARD_DIAG = 14;
   @Removal(
      version = "3.17"
   )
   short SQUARES = 15;
   @Removal(
      version = "3.17"
   )
   short DIAMONDS = 16;
   @Removal(
      version = "3.17"
   )
   short LESS_DOTS = 17;
   @Removal(
      version = "3.17"
   )
   short LEAST_DOTS = 18;


   short getIndex();

   void setDataFormat(short var1);

   short getDataFormat();

   String getDataFormatString();

   void setFont(Font var1);

   short getFontIndex();

   void setHidden(boolean var1);

   boolean getHidden();

   void setLocked(boolean var1);

   boolean getLocked();

   void setAlignment(short var1);

   void setAlignment(HorizontalAlignment var1);

   short getAlignment();

   HorizontalAlignment getAlignmentEnum();

   void setWrapText(boolean var1);

   boolean getWrapText();

   void setVerticalAlignment(short var1);

   void setVerticalAlignment(VerticalAlignment var1);

   short getVerticalAlignment();

   VerticalAlignment getVerticalAlignmentEnum();

   void setRotation(short var1);

   short getRotation();

   void setIndention(short var1);

   short getIndention();

   @Removal(
      version = "3.17"
   )
   void setBorderLeft(short var1);

   void setBorderLeft(BorderStyle var1);

   short getBorderLeft();

   BorderStyle getBorderLeftEnum();

   @Removal(
      version = "3.17"
   )
   void setBorderRight(short var1);

   void setBorderRight(BorderStyle var1);

   short getBorderRight();

   BorderStyle getBorderRightEnum();

   @Removal(
      version = "3.17"
   )
   void setBorderTop(short var1);

   void setBorderTop(BorderStyle var1);

   short getBorderTop();

   BorderStyle getBorderTopEnum();

   @Removal(
      version = "3.17"
   )
   void setBorderBottom(short var1);

   void setBorderBottom(BorderStyle var1);

   short getBorderBottom();

   BorderStyle getBorderBottomEnum();

   void setLeftBorderColor(short var1);

   short getLeftBorderColor();

   void setRightBorderColor(short var1);

   short getRightBorderColor();

   void setTopBorderColor(short var1);

   short getTopBorderColor();

   void setBottomBorderColor(short var1);

   short getBottomBorderColor();

   void setFillPattern(short var1);

   void setFillPattern(FillPatternType var1);

   short getFillPattern();

   FillPatternType getFillPatternEnum();

   void setFillBackgroundColor(short var1);

   short getFillBackgroundColor();

   Color getFillBackgroundColorColor();

   void setFillForegroundColor(short var1);

   short getFillForegroundColor();

   Color getFillForegroundColorColor();

   void cloneStyleFrom(CellStyle var1);

   void setShrinkToFit(boolean var1);

   boolean getShrinkToFit();
}
