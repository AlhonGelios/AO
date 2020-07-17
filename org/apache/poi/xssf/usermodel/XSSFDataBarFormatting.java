package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.DataBarFormatting;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFConditionalFormattingThreshold;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar;

public class XSSFDataBarFormatting implements DataBarFormatting {

   CTDataBar _databar;


   XSSFDataBarFormatting(CTDataBar databar) {
      this._databar = databar;
   }

   public boolean isIconOnly() {
      return this._databar.isSetShowValue()?!this._databar.getShowValue():false;
   }

   public void setIconOnly(boolean only) {
      this._databar.setShowValue(!only);
   }

   public boolean isLeftToRight() {
      return true;
   }

   public void setLeftToRight(boolean ltr) {}

   public int getWidthMin() {
      return 0;
   }

   public void setWidthMin(int width) {}

   public int getWidthMax() {
      return 100;
   }

   public void setWidthMax(int width) {}

   public XSSFColor getColor() {
      return new XSSFColor(this._databar.getColor());
   }

   public void setColor(Color color) {
      this._databar.setColor(((XSSFColor)color).getCTColor());
   }

   public XSSFConditionalFormattingThreshold getMinThreshold() {
      return new XSSFConditionalFormattingThreshold(this._databar.getCfvoArray(0));
   }

   public XSSFConditionalFormattingThreshold getMaxThreshold() {
      return new XSSFConditionalFormattingThreshold(this._databar.getCfvoArray(1));
   }

   public XSSFConditionalFormattingThreshold createThreshold() {
      return new XSSFConditionalFormattingThreshold(this._databar.addNewCfvo());
   }
}
