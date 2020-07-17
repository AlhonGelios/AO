package org.apache.poi.xssf.usermodel;

import java.util.ArrayList;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.ConditionalFormatting;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.ExtendedColor;
import org.apache.poi.ss.usermodel.IconMultiStateFormatting;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeUtil;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFConditionalFormatting;
import org.apache.poi.xssf.usermodel.XSSFConditionalFormattingRule;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator;

public class XSSFSheetConditionalFormatting implements SheetConditionalFormatting {

   protected static final String CF_EXT_2009_NS_X14 = "http://schemas.microsoft.com/office/spreadsheetml/2009/9/main";
   private final XSSFSheet _sheet;


   XSSFSheetConditionalFormatting(XSSFSheet sheet) {
      this._sheet = sheet;
   }

   public XSSFConditionalFormattingRule createConditionalFormattingRule(byte comparisonOperation, String formula1, String formula2) {
      XSSFConditionalFormattingRule rule = new XSSFConditionalFormattingRule(this._sheet);
      CTCfRule cfRule = rule.getCTCfRule();
      cfRule.addFormula(formula1);
      if(formula2 != null) {
         cfRule.addFormula(formula2);
      }

      cfRule.setType(STCfType.CELL_IS);
      STConditionalFormattingOperator.Enum operator;
      switch(comparisonOperation) {
      case 1:
         operator = STConditionalFormattingOperator.BETWEEN;
         break;
      case 2:
         operator = STConditionalFormattingOperator.NOT_BETWEEN;
         break;
      case 3:
         operator = STConditionalFormattingOperator.EQUAL;
         break;
      case 4:
         operator = STConditionalFormattingOperator.NOT_EQUAL;
         break;
      case 5:
         operator = STConditionalFormattingOperator.GREATER_THAN;
         break;
      case 6:
         operator = STConditionalFormattingOperator.LESS_THAN;
         break;
      case 7:
         operator = STConditionalFormattingOperator.GREATER_THAN_OR_EQUAL;
         break;
      case 8:
         operator = STConditionalFormattingOperator.LESS_THAN_OR_EQUAL;
         break;
      default:
         throw new IllegalArgumentException("Unknown comparison operator: " + comparisonOperation);
      }

      cfRule.setOperator(operator);
      return rule;
   }

   public XSSFConditionalFormattingRule createConditionalFormattingRule(byte comparisonOperation, String formula) {
      return this.createConditionalFormattingRule(comparisonOperation, formula, (String)null);
   }

   public XSSFConditionalFormattingRule createConditionalFormattingRule(String formula) {
      XSSFConditionalFormattingRule rule = new XSSFConditionalFormattingRule(this._sheet);
      CTCfRule cfRule = rule.getCTCfRule();
      cfRule.addFormula(formula);
      cfRule.setType(STCfType.EXPRESSION);
      return rule;
   }

   public XSSFConditionalFormattingRule createConditionalFormattingRule(XSSFColor color) {
      XSSFConditionalFormattingRule rule = new XSSFConditionalFormattingRule(this._sheet);
      rule.createDataBarFormatting(color);
      return rule;
   }

   public XSSFConditionalFormattingRule createConditionalFormattingRule(ExtendedColor color) {
      return this.createConditionalFormattingRule((XSSFColor)color);
   }

   public XSSFConditionalFormattingRule createConditionalFormattingRule(IconMultiStateFormatting.IconSet iconSet) {
      XSSFConditionalFormattingRule rule = new XSSFConditionalFormattingRule(this._sheet);
      rule.createMultiStateFormatting(iconSet);
      return rule;
   }

   public XSSFConditionalFormattingRule createConditionalFormattingColorScaleRule() {
      XSSFConditionalFormattingRule rule = new XSSFConditionalFormattingRule(this._sheet);
      rule.createColorScaleFormatting();
      return rule;
   }

   public int addConditionalFormatting(CellRangeAddress[] regions, ConditionalFormattingRule[] cfRules) {
      if(regions == null) {
         throw new IllegalArgumentException("regions must not be null");
      } else {
         CellRangeAddress[] mergeCellRanges = regions;
         int cf = regions.length;

         for(int refs = 0; refs < cf; ++refs) {
            CellRangeAddress priority = mergeCellRanges[refs];
            priority.validate(SpreadsheetVersion.EXCEL2007);
         }

         if(cfRules == null) {
            throw new IllegalArgumentException("cfRules must not be null");
         } else if(cfRules.length == 0) {
            throw new IllegalArgumentException("cfRules must not be empty");
         } else if(cfRules.length > 3) {
            throw new IllegalArgumentException("Number of rules must not exceed 3");
         } else {
            mergeCellRanges = CellRangeUtil.mergeCellRanges(regions);
            CTConditionalFormatting var12 = this._sheet.getCTWorksheet().addNewConditionalFormatting();
            ArrayList var13 = new ArrayList();
            CellRangeAddress[] var14 = mergeCellRanges;
            int arr$ = mergeCellRanges.length;

            int len$;
            for(len$ = 0; len$ < arr$; ++len$) {
               CellRangeAddress i$ = var14[len$];
               var13.add(i$.formatAsString());
            }

            var12.setSqref(var13);
            int var15 = 1;
            CTConditionalFormatting[] var16 = this._sheet.getCTWorksheet().getConditionalFormattingArray();
            len$ = var16.length;

            int var18;
            for(var18 = 0; var18 < len$; ++var18) {
               CTConditionalFormatting rule = var16[var18];
               var15 += rule.sizeOfCfRuleArray();
            }

            ConditionalFormattingRule[] var17 = cfRules;
            len$ = cfRules.length;

            for(var18 = 0; var18 < len$; ++var18) {
               ConditionalFormattingRule var19 = var17[var18];
               XSSFConditionalFormattingRule xRule = (XSSFConditionalFormattingRule)var19;
               xRule.getCTCfRule().setPriority(var15++);
               var12.addNewCfRule().set(xRule.getCTCfRule());
            }

            return this._sheet.getCTWorksheet().sizeOfConditionalFormattingArray() - 1;
         }
      }
   }

   public int addConditionalFormatting(CellRangeAddress[] regions, ConditionalFormattingRule rule1) {
      return this.addConditionalFormatting(regions, (ConditionalFormattingRule[])(rule1 == null?null:new XSSFConditionalFormattingRule[]{(XSSFConditionalFormattingRule)rule1}));
   }

   public int addConditionalFormatting(CellRangeAddress[] regions, ConditionalFormattingRule rule1, ConditionalFormattingRule rule2) {
      return this.addConditionalFormatting(regions, (ConditionalFormattingRule[])(rule1 == null?null:new XSSFConditionalFormattingRule[]{(XSSFConditionalFormattingRule)rule1, (XSSFConditionalFormattingRule)rule2}));
   }

   public int addConditionalFormatting(ConditionalFormatting cf) {
      XSSFConditionalFormatting xcf = (XSSFConditionalFormatting)cf;
      CTWorksheet sh = this._sheet.getCTWorksheet();
      sh.addNewConditionalFormatting().set(xcf.getCTConditionalFormatting().copy());
      return sh.sizeOfConditionalFormattingArray() - 1;
   }

   public XSSFConditionalFormatting getConditionalFormattingAt(int index) {
      this.checkIndex(index);
      CTConditionalFormatting cf = this._sheet.getCTWorksheet().getConditionalFormattingArray(index);
      return new XSSFConditionalFormatting(this._sheet, cf);
   }

   public int getNumConditionalFormattings() {
      return this._sheet.getCTWorksheet().sizeOfConditionalFormattingArray();
   }

   public void removeConditionalFormatting(int index) {
      this.checkIndex(index);
      this._sheet.getCTWorksheet().removeConditionalFormatting(index);
   }

   private void checkIndex(int index) {
      int cnt = this.getNumConditionalFormattings();
      if(index < 0 || index >= cnt) {
         throw new IllegalArgumentException("Specified CF index " + index + " is outside the allowable range (0.." + (cnt - 1) + ")");
      }
   }
}
