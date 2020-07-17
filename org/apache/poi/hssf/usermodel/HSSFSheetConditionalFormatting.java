package org.apache.poi.hssf.usermodel;

import org.apache.poi.hssf.record.CFRule12Record;
import org.apache.poi.hssf.record.CFRuleBase;
import org.apache.poi.hssf.record.CFRuleRecord;
import org.apache.poi.hssf.record.aggregates.CFRecordsAggregate;
import org.apache.poi.hssf.record.aggregates.ConditionalFormattingTable;
import org.apache.poi.hssf.usermodel.HSSFConditionalFormatting;
import org.apache.poi.hssf.usermodel.HSSFConditionalFormattingRule;
import org.apache.poi.hssf.usermodel.HSSFExtendedColor;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.ConditionalFormatting;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.ExtendedColor;
import org.apache.poi.ss.usermodel.IconMultiStateFormatting;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;

public final class HSSFSheetConditionalFormatting implements SheetConditionalFormatting {

   private final HSSFSheet _sheet;
   private final ConditionalFormattingTable _conditionalFormattingTable;


   HSSFSheetConditionalFormatting(HSSFSheet sheet) {
      this._sheet = sheet;
      this._conditionalFormattingTable = sheet.getSheet().getConditionalFormattingTable();
   }

   public HSSFConditionalFormattingRule createConditionalFormattingRule(byte comparisonOperation, String formula1, String formula2) {
      CFRuleRecord rr = CFRuleRecord.create(this._sheet, comparisonOperation, formula1, formula2);
      return new HSSFConditionalFormattingRule(this._sheet, rr);
   }

   public HSSFConditionalFormattingRule createConditionalFormattingRule(byte comparisonOperation, String formula1) {
      CFRuleRecord rr = CFRuleRecord.create(this._sheet, comparisonOperation, formula1, (String)null);
      return new HSSFConditionalFormattingRule(this._sheet, rr);
   }

   public HSSFConditionalFormattingRule createConditionalFormattingRule(String formula) {
      CFRuleRecord rr = CFRuleRecord.create(this._sheet, formula);
      return new HSSFConditionalFormattingRule(this._sheet, rr);
   }

   public HSSFConditionalFormattingRule createConditionalFormattingRule(IconMultiStateFormatting.IconSet iconSet) {
      CFRule12Record rr = CFRule12Record.create(this._sheet, iconSet);
      return new HSSFConditionalFormattingRule(this._sheet, rr);
   }

   public HSSFConditionalFormattingRule createConditionalFormattingRule(HSSFExtendedColor color) {
      CFRule12Record rr = CFRule12Record.create(this._sheet, color.getExtendedColor());
      return new HSSFConditionalFormattingRule(this._sheet, rr);
   }

   public HSSFConditionalFormattingRule createConditionalFormattingRule(ExtendedColor color) {
      return this.createConditionalFormattingRule((HSSFExtendedColor)color);
   }

   public HSSFConditionalFormattingRule createConditionalFormattingColorScaleRule() {
      CFRule12Record rr = CFRule12Record.createColorScale(this._sheet);
      return new HSSFConditionalFormattingRule(this._sheet, rr);
   }

   public int addConditionalFormatting(HSSFConditionalFormatting cf) {
      CFRecordsAggregate cfraClone = cf.getCFRecordsAggregate().cloneCFAggregate();
      return this._conditionalFormattingTable.add(cfraClone);
   }

   public int addConditionalFormatting(ConditionalFormatting cf) {
      return this.addConditionalFormatting((HSSFConditionalFormatting)cf);
   }

   public int addConditionalFormatting(CellRangeAddress[] regions, HSSFConditionalFormattingRule[] cfRules) {
      if(regions == null) {
         throw new IllegalArgumentException("regions must not be null");
      } else {
         CellRangeAddress[] rules = regions;
         int cfra = regions.length;

         for(int i$ = 0; i$ < cfra; ++i$) {
            CellRangeAddress range = rules[i$];
            range.validate(SpreadsheetVersion.EXCEL97);
         }

         if(cfRules == null) {
            throw new IllegalArgumentException("cfRules must not be null");
         } else if(cfRules.length == 0) {
            throw new IllegalArgumentException("cfRules must not be empty");
         } else if(cfRules.length > 3) {
            throw new IllegalArgumentException("Number of rules must not exceed 3");
         } else {
            CFRuleBase[] var7 = new CFRuleBase[cfRules.length];

            for(cfra = 0; cfra != cfRules.length; ++cfra) {
               var7[cfra] = cfRules[cfra].getCfRuleRecord();
            }

            CFRecordsAggregate var8 = new CFRecordsAggregate(regions, var7);
            return this._conditionalFormattingTable.add(var8);
         }
      }
   }

   public int addConditionalFormatting(CellRangeAddress[] regions, ConditionalFormattingRule[] cfRules) {
      HSSFConditionalFormattingRule[] hfRules;
      if(cfRules instanceof HSSFConditionalFormattingRule[]) {
         hfRules = (HSSFConditionalFormattingRule[])((HSSFConditionalFormattingRule[])cfRules);
      } else {
         hfRules = new HSSFConditionalFormattingRule[cfRules.length];
         System.arraycopy(cfRules, 0, hfRules, 0, hfRules.length);
      }

      return this.addConditionalFormatting(regions, hfRules);
   }

   public int addConditionalFormatting(CellRangeAddress[] regions, HSSFConditionalFormattingRule rule1) {
      return this.addConditionalFormatting(regions, rule1 == null?null:new HSSFConditionalFormattingRule[]{rule1});
   }

   public int addConditionalFormatting(CellRangeAddress[] regions, ConditionalFormattingRule rule1) {
      return this.addConditionalFormatting(regions, (HSSFConditionalFormattingRule)rule1);
   }

   public int addConditionalFormatting(CellRangeAddress[] regions, HSSFConditionalFormattingRule rule1, HSSFConditionalFormattingRule rule2) {
      return this.addConditionalFormatting(regions, new HSSFConditionalFormattingRule[]{rule1, rule2});
   }

   public int addConditionalFormatting(CellRangeAddress[] regions, ConditionalFormattingRule rule1, ConditionalFormattingRule rule2) {
      return this.addConditionalFormatting(regions, (HSSFConditionalFormattingRule)rule1, (HSSFConditionalFormattingRule)rule2);
   }

   public HSSFConditionalFormatting getConditionalFormattingAt(int index) {
      CFRecordsAggregate cf = this._conditionalFormattingTable.get(index);
      return cf == null?null:new HSSFConditionalFormatting(this._sheet, cf);
   }

   public int getNumConditionalFormattings() {
      return this._conditionalFormattingTable.size();
   }

   public void removeConditionalFormatting(int index) {
      this._conditionalFormattingTable.remove(index);
   }
}
