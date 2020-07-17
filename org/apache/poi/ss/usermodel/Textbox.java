package org.apache.poi.ss.usermodel;

import org.apache.poi.ss.usermodel.RichTextString;

public interface Textbox {

   short OBJECT_TYPE_TEXT = 6;


   RichTextString getString();

   void setString(RichTextString var1);

   int getMarginLeft();

   void setMarginLeft(int var1);

   int getMarginRight();

   void setMarginRight(int var1);

   int getMarginTop();

   void setMarginTop(int var1);

   int getMarginBottom();

   void setMarginBottom(int var1);
}
