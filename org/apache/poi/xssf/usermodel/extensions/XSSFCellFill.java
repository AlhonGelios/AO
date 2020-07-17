package org.apache.poi.xssf.usermodel.extensions;

import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType;

public final class XSSFCellFill {

   private CTFill _fill;


   public XSSFCellFill(CTFill fill) {
      this._fill = fill;
   }

   public XSSFCellFill() {
      this._fill = CTFill.Factory.newInstance();
   }

   public XSSFColor getFillBackgroundColor() {
      CTPatternFill ptrn = this._fill.getPatternFill();
      if(ptrn == null) {
         return null;
      } else {
         CTColor ctColor = ptrn.getBgColor();
         return ctColor == null?null:new XSSFColor(ctColor);
      }
   }

   public void setFillBackgroundColor(int index) {
      CTPatternFill ptrn = this.ensureCTPatternFill();
      CTColor ctColor = ptrn.isSetBgColor()?ptrn.getBgColor():ptrn.addNewBgColor();
      ctColor.setIndexed((long)index);
   }

   public void setFillBackgroundColor(XSSFColor color) {
      CTPatternFill ptrn = this.ensureCTPatternFill();
      ptrn.setBgColor(color.getCTColor());
   }

   public XSSFColor getFillForegroundColor() {
      CTPatternFill ptrn = this._fill.getPatternFill();
      if(ptrn == null) {
         return null;
      } else {
         CTColor ctColor = ptrn.getFgColor();
         return ctColor == null?null:new XSSFColor(ctColor);
      }
   }

   public void setFillForegroundColor(int index) {
      CTPatternFill ptrn = this.ensureCTPatternFill();
      CTColor ctColor = ptrn.isSetFgColor()?ptrn.getFgColor():ptrn.addNewFgColor();
      ctColor.setIndexed((long)index);
   }

   public void setFillForegroundColor(XSSFColor color) {
      CTPatternFill ptrn = this.ensureCTPatternFill();
      ptrn.setFgColor(color.getCTColor());
   }

   public STPatternType.Enum getPatternType() {
      CTPatternFill ptrn = this._fill.getPatternFill();
      return ptrn == null?null:ptrn.getPatternType();
   }

   public void setPatternType(STPatternType.Enum patternType) {
      CTPatternFill ptrn = this.ensureCTPatternFill();
      ptrn.setPatternType(patternType);
   }

   private CTPatternFill ensureCTPatternFill() {
      CTPatternFill patternFill = this._fill.getPatternFill();
      if(patternFill == null) {
         patternFill = this._fill.addNewPatternFill();
      }

      return patternFill;
   }

   @Internal
   public CTFill getCTFill() {
      return this._fill;
   }

   public int hashCode() {
      return this._fill.toString().hashCode();
   }

   public boolean equals(Object o) {
      if(!(o instanceof XSSFCellFill)) {
         return false;
      } else {
         XSSFCellFill cf = (XSSFCellFill)o;
         return this._fill.toString().equals(cf.getCTFill().toString());
      }
   }
}
