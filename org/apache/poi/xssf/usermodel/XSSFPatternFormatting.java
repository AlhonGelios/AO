package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.PatternFormatting;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType;

public class XSSFPatternFormatting implements PatternFormatting {

   CTFill _fill;


   XSSFPatternFormatting(CTFill fill) {
      this._fill = fill;
   }

   public XSSFColor getFillBackgroundColorColor() {
      return !this._fill.isSetPatternFill()?null:new XSSFColor(this._fill.getPatternFill().getBgColor());
   }

   public XSSFColor getFillForegroundColorColor() {
      return this._fill.isSetPatternFill() && this._fill.getPatternFill().isSetFgColor()?new XSSFColor(this._fill.getPatternFill().getFgColor()):null;
   }

   public short getFillPattern() {
      return this._fill.isSetPatternFill() && this._fill.getPatternFill().isSetPatternType()?(short)(this._fill.getPatternFill().getPatternType().intValue() - 1):0;
   }

   public short getFillBackgroundColor() {
      XSSFColor color = this.getFillBackgroundColorColor();
      return color == null?0:color.getIndexed();
   }

   public short getFillForegroundColor() {
      XSSFColor color = this.getFillForegroundColorColor();
      return color == null?0:color.getIndexed();
   }

   public void setFillBackgroundColor(Color bg) {
      XSSFColor xcolor = XSSFColor.toXSSFColor(bg);
      if(xcolor == null) {
         this.setFillBackgroundColor((CTColor)null);
      } else {
         this.setFillBackgroundColor(xcolor.getCTColor());
      }

   }

   public void setFillBackgroundColor(short bg) {
      CTColor bgColor = CTColor.Factory.newInstance();
      bgColor.setIndexed((long)bg);
      this.setFillBackgroundColor(bgColor);
   }

   private void setFillBackgroundColor(CTColor color) {
      CTPatternFill ptrn = this._fill.isSetPatternFill()?this._fill.getPatternFill():this._fill.addNewPatternFill();
      if(color == null) {
         ptrn.unsetBgColor();
      } else {
         ptrn.setBgColor(color);
      }

   }

   public void setFillForegroundColor(Color fg) {
      XSSFColor xcolor = XSSFColor.toXSSFColor(fg);
      if(xcolor == null) {
         this.setFillForegroundColor((CTColor)null);
      } else {
         this.setFillForegroundColor(xcolor.getCTColor());
      }

   }

   public void setFillForegroundColor(short fg) {
      CTColor fgColor = CTColor.Factory.newInstance();
      fgColor.setIndexed((long)fg);
      this.setFillForegroundColor(fgColor);
   }

   private void setFillForegroundColor(CTColor color) {
      CTPatternFill ptrn = this._fill.isSetPatternFill()?this._fill.getPatternFill():this._fill.addNewPatternFill();
      if(color == null) {
         ptrn.unsetFgColor();
      } else {
         ptrn.setFgColor(color);
      }

   }

   public void setFillPattern(short fp) {
      CTPatternFill ptrn = this._fill.isSetPatternFill()?this._fill.getPatternFill():this._fill.addNewPatternFill();
      if(fp == 0) {
         ptrn.unsetPatternType();
      } else {
         ptrn.setPatternType(STPatternType.Enum.forInt(fp + 1));
      }

   }
}
