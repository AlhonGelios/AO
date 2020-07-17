package org.apache.poi.hssf.usermodel;

import org.apache.poi.hssf.record.CFRuleBase;
import org.apache.poi.hssf.record.cf.Threshold;
import org.apache.poi.hssf.usermodel.HSSFConditionalFormattingRule;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.ConditionalFormattingThreshold;

public final class HSSFConditionalFormattingThreshold implements ConditionalFormattingThreshold {

   private final Threshold threshold;
   private final HSSFSheet sheet;
   private final HSSFWorkbook workbook;


   protected HSSFConditionalFormattingThreshold(Threshold threshold, HSSFSheet sheet) {
      this.threshold = threshold;
      this.sheet = sheet;
      this.workbook = sheet.getWorkbook();
   }

   protected Threshold getThreshold() {
      return this.threshold;
   }

   public ConditionalFormattingThreshold.RangeType getRangeType() {
      return ConditionalFormattingThreshold.RangeType.byId(this.threshold.getType());
   }

   public void setRangeType(ConditionalFormattingThreshold.RangeType type) {
      this.threshold.setType((byte)type.id);
   }

   public String getFormula() {
      return HSSFConditionalFormattingRule.toFormulaString(this.threshold.getParsedExpression(), this.workbook);
   }

   public void setFormula(String formula) {
      this.threshold.setParsedExpression(CFRuleBase.parseFormula(formula, this.sheet));
   }

   public Double getValue() {
      return this.threshold.getValue();
   }

   public void setValue(Double value) {
      this.threshold.setValue(value);
   }
}
