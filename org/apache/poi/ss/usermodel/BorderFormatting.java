package org.apache.poi.ss.usermodel;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.util.Removal;

public interface BorderFormatting {

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


   short getBorderBottom();

   BorderStyle getBorderBottomEnum();

   short getBorderDiagonal();

   BorderStyle getBorderDiagonalEnum();

   short getBorderLeft();

   BorderStyle getBorderLeftEnum();

   short getBorderRight();

   BorderStyle getBorderRightEnum();

   short getBorderTop();

   BorderStyle getBorderTopEnum();

   short getBottomBorderColor();

   Color getBottomBorderColorColor();

   short getDiagonalBorderColor();

   Color getDiagonalBorderColorColor();

   short getLeftBorderColor();

   Color getLeftBorderColorColor();

   short getRightBorderColor();

   Color getRightBorderColorColor();

   short getTopBorderColor();

   Color getTopBorderColorColor();

   void setBorderBottom(short var1);

   void setBorderBottom(BorderStyle var1);

   void setBorderDiagonal(short var1);

   void setBorderDiagonal(BorderStyle var1);

   void setBorderLeft(short var1);

   void setBorderLeft(BorderStyle var1);

   void setBorderRight(short var1);

   void setBorderRight(BorderStyle var1);

   void setBorderTop(short var1);

   void setBorderTop(BorderStyle var1);

   void setBottomBorderColor(short var1);

   void setBottomBorderColor(Color var1);

   void setDiagonalBorderColor(short var1);

   void setDiagonalBorderColor(Color var1);

   void setLeftBorderColor(short var1);

   void setLeftBorderColor(Color var1);

   void setRightBorderColor(short var1);

   void setRightBorderColor(Color var1);

   void setTopBorderColor(short var1);

   void setTopBorderColor(Color var1);
}
