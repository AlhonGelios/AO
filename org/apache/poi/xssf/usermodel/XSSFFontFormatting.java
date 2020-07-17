package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.FontFormatting;
import org.apache.poi.ss.usermodel.FontUnderline;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STVerticalAlignRun;

public class XSSFFontFormatting implements FontFormatting {

   CTFont _font;


   XSSFFontFormatting(CTFont font) {
      this._font = font;
   }

   public short getEscapementType() {
      if(this._font.sizeOfVertAlignArray() == 0) {
         return (short)0;
      } else {
         CTVerticalAlignFontProperty prop = this._font.getVertAlignArray(0);
         return (short)(prop.getVal().intValue() - 1);
      }
   }

   public void setEscapementType(short escapementType) {
      this._font.setVertAlignArray((CTVerticalAlignFontProperty[])null);
      if(escapementType != 0) {
         this._font.addNewVertAlign().setVal(STVerticalAlignRun.Enum.forInt(escapementType + 1));
      }

   }

   public short getFontColorIndex() {
      if(this._font.sizeOfColorArray() == 0) {
         return (short)-1;
      } else {
         int idx = 0;
         CTColor color = this._font.getColorArray(0);
         if(color.isSetIndexed()) {
            idx = (int)color.getIndexed();
         }

         return (short)idx;
      }
   }

   public void setFontColorIndex(short color) {
      this._font.setColorArray((CTColor[])null);
      if(color != -1) {
         this._font.addNewColor().setIndexed((long)color);
      }

   }

   public XSSFColor getFontColor() {
      return this._font.sizeOfColorArray() == 0?null:new XSSFColor(this._font.getColorArray(0));
   }

   public void setFontColor(Color color) {
      XSSFColor xcolor = XSSFColor.toXSSFColor(color);
      if(xcolor == null) {
         this._font.getColorList().clear();
      } else {
         this._font.setColorArray(0, xcolor.getCTColor());
      }

   }

   public int getFontHeight() {
      if(this._font.sizeOfSzArray() == 0) {
         return -1;
      } else {
         CTFontSize sz = this._font.getSzArray(0);
         return (short)((int)(20.0D * sz.getVal()));
      }
   }

   public void setFontHeight(int height) {
      this._font.setSzArray((CTFontSize[])null);
      if(height != -1) {
         this._font.addNewSz().setVal((double)height / 20.0D);
      }

   }

   public short getUnderlineType() {
      if(this._font.sizeOfUArray() == 0) {
         return (short)0;
      } else {
         CTUnderlineProperty u = this._font.getUArray(0);
         switch(u.getVal().intValue()) {
         case 1:
            return (short)1;
         case 2:
            return (short)2;
         case 3:
            return (short)33;
         case 4:
            return (short)34;
         default:
            return (short)0;
         }
      }
   }

   public void setUnderlineType(short underlineType) {
      this._font.setUArray((CTUnderlineProperty[])null);
      if(underlineType != 0) {
         FontUnderline fenum = FontUnderline.valueOf((int)underlineType);
         STUnderlineValues.Enum val = STUnderlineValues.Enum.forInt(fenum.getValue());
         this._font.addNewU().setVal(val);
      }

   }

   public boolean isBold() {
      return this._font.sizeOfBArray() == 1 && this._font.getBArray(0).getVal();
   }

   public boolean isItalic() {
      return this._font.sizeOfIArray() == 1 && this._font.getIArray(0).getVal();
   }

   public void setFontStyle(boolean italic, boolean bold) {
      this._font.setIArray((CTBooleanProperty[])null);
      this._font.setBArray((CTBooleanProperty[])null);
      if(italic) {
         this._font.addNewI().setVal(true);
      }

      if(bold) {
         this._font.addNewB().setVal(true);
      }

   }

   public void resetFontStyle() {
      this._font.set(CTFont.Factory.newInstance());
   }
}
