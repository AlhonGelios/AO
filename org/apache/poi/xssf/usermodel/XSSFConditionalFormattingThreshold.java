package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.ConditionalFormattingThreshold;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfvoType;

public class XSSFConditionalFormattingThreshold implements ConditionalFormattingThreshold {

   private CTCfvo cfvo;


   protected XSSFConditionalFormattingThreshold(CTCfvo cfvo) {
      this.cfvo = cfvo;
   }

   protected CTCfvo getCTCfvo() {
      return this.cfvo;
   }

   public ConditionalFormattingThreshold.RangeType getRangeType() {
      return ConditionalFormattingThreshold.RangeType.byName(this.cfvo.getType().toString());
   }

   public void setRangeType(ConditionalFormattingThreshold.RangeType type) {
      STCfvoType.Enum xtype = STCfvoType.Enum.forString(type.name);
      this.cfvo.setType(xtype);
   }

   public String getFormula() {
      return this.cfvo.getType() == STCfvoType.FORMULA?this.cfvo.getVal():null;
   }

   public void setFormula(String formula) {
      this.cfvo.setVal(formula);
   }

   public Double getValue() {
      return this.cfvo.getType() != STCfvoType.FORMULA && this.cfvo.getType() != STCfvoType.MIN && this.cfvo.getType() != STCfvoType.MAX?(this.cfvo.isSetVal()?Double.valueOf(Double.parseDouble(this.cfvo.getVal())):null):null;
   }

   public void setValue(Double value) {
      if(value == null) {
         this.cfvo.unsetVal();
      } else {
         this.cfvo.setVal(value.toString());
      }

   }
}
