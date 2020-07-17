package org.apache.poi.xssf.usermodel;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.ConditionalFormatting;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFConditionalFormattingRule;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting;

public class XSSFConditionalFormatting implements ConditionalFormatting {

   private final CTConditionalFormatting _cf;
   private final XSSFSheet _sh;


   XSSFConditionalFormatting(XSSFSheet sh) {
      this._cf = CTConditionalFormatting.Factory.newInstance();
      this._sh = sh;
   }

   XSSFConditionalFormatting(XSSFSheet sh, CTConditionalFormatting cf) {
      this._cf = cf;
      this._sh = sh;
   }

   CTConditionalFormatting getCTConditionalFormatting() {
      return this._cf;
   }

   public CellRangeAddress[] getFormattingRanges() {
      ArrayList lst = new ArrayList();
      Iterator i$ = this._cf.getSqref().iterator();

      while(i$.hasNext()) {
         Object stRef = i$.next();
         String[] regions = stRef.toString().split(" ");

         for(int i = 0; i < regions.length; ++i) {
            lst.add(CellRangeAddress.valueOf(regions[i]));
         }
      }

      return (CellRangeAddress[])lst.toArray(new CellRangeAddress[lst.size()]);
   }

   public void setRule(int idx, ConditionalFormattingRule cfRule) {
      XSSFConditionalFormattingRule xRule = (XSSFConditionalFormattingRule)cfRule;
      this._cf.getCfRuleArray(idx).set(xRule.getCTCfRule());
   }

   public void addRule(ConditionalFormattingRule cfRule) {
      XSSFConditionalFormattingRule xRule = (XSSFConditionalFormattingRule)cfRule;
      this._cf.addNewCfRule().set(xRule.getCTCfRule());
   }

   public XSSFConditionalFormattingRule getRule(int idx) {
      return new XSSFConditionalFormattingRule(this._sh, this._cf.getCfRuleArray(idx));
   }

   public int getNumberOfRules() {
      return this._cf.sizeOfCfRuleArray();
   }

   public String toString() {
      return this._cf.toString();
   }
}
