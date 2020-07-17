package org.apache.poi.hssf.record.aggregates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.model.RecordStream;
import org.apache.poi.hssf.record.CFHeader12Record;
import org.apache.poi.hssf.record.CFHeaderBase;
import org.apache.poi.hssf.record.CFHeaderRecord;
import org.apache.poi.hssf.record.CFRule12Record;
import org.apache.poi.hssf.record.CFRuleBase;
import org.apache.poi.hssf.record.CFRuleRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.aggregates.RecordAggregate;
import org.apache.poi.ss.formula.FormulaShifter;
import org.apache.poi.ss.formula.ptg.AreaErrPtg;
import org.apache.poi.ss.formula.ptg.AreaPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.RecordFormatException;

public final class CFRecordsAggregate extends RecordAggregate {

   private static final int MAX_97_2003_CONDTIONAL_FORMAT_RULES = 3;
   private static final POILogger logger = POILogFactory.getLogger(CFRecordsAggregate.class);
   private final CFHeaderBase header;
   private final List rules;


   private CFRecordsAggregate(CFHeaderBase pHeader, CFRuleBase[] pRules) {
      if(pHeader == null) {
         throw new IllegalArgumentException("header must not be null");
      } else if(pRules == null) {
         throw new IllegalArgumentException("rules must not be null");
      } else {
         if(pRules.length > 3) {
            logger.log(5, new Object[]{"Excel versions before 2007 require that No more than 3 rules may be specified, " + pRules.length + " were found," + " this file will cause problems with old Excel versions"});
         }

         if(pRules.length != pHeader.getNumberOfConditionalFormats()) {
            throw new RecordFormatException("Mismatch number of rules");
         } else {
            this.header = pHeader;
            this.rules = new ArrayList(pRules.length);
            CFRuleBase[] arr$ = pRules;
            int len$ = pRules.length;

            for(int i$ = 0; i$ < len$; ++i$) {
               CFRuleBase pRule = arr$[i$];
               this.checkRuleType(pRule);
               this.rules.add(pRule);
            }

         }
      }
   }

   public CFRecordsAggregate(CellRangeAddress[] regions, CFRuleBase[] rules) {
      this(createHeader(regions, rules), rules);
   }

   private static CFHeaderBase createHeader(CellRangeAddress[] regions, CFRuleBase[] rules) {
      Object header;
      if(rules.length != 0 && !(rules[0] instanceof CFRuleRecord)) {
         header = new CFHeader12Record(regions, rules.length);
      } else {
         header = new CFHeaderRecord(regions, rules.length);
      }

      ((CFHeaderBase)header).setNeedRecalculation(true);
      return (CFHeaderBase)header;
   }

   public static CFRecordsAggregate createCFAggregate(RecordStream rs) {
      Record rec = rs.getNext();
      if(rec.getSid() != 432 && rec.getSid() != 2169) {
         throw new IllegalStateException("next record sid was " + rec.getSid() + " instead of " + 432 + " or " + 2169 + " as expected");
      } else {
         CFHeaderBase header = (CFHeaderBase)rec;
         int nRules = header.getNumberOfConditionalFormats();
         CFRuleBase[] rules = new CFRuleBase[nRules];

         for(int i = 0; i < rules.length; ++i) {
            rules[i] = (CFRuleBase)rs.getNext();
         }

         return new CFRecordsAggregate(header, rules);
      }
   }

   public CFRecordsAggregate cloneCFAggregate() {
      CFRuleBase[] newRecs = new CFRuleBase[this.rules.size()];

      for(int i = 0; i < newRecs.length; ++i) {
         newRecs[i] = this.getRule(i).clone();
      }

      return new CFRecordsAggregate(this.header.clone(), newRecs);
   }

   public CFHeaderBase getHeader() {
      return this.header;
   }

   private void checkRuleIndex(int idx) {
      if(idx < 0 || idx >= this.rules.size()) {
         throw new IllegalArgumentException("Bad rule record index (" + idx + ") nRules=" + this.rules.size());
      }
   }

   private void checkRuleType(CFRuleBase r) {
      if(!(this.header instanceof CFHeaderRecord) || !(r instanceof CFRuleRecord)) {
         if(!(this.header instanceof CFHeader12Record) || !(r instanceof CFRule12Record)) {
            throw new IllegalArgumentException("Header and Rule must both be CF or both be CF12, can\'t mix");
         }
      }
   }

   public CFRuleBase getRule(int idx) {
      this.checkRuleIndex(idx);
      return (CFRuleBase)this.rules.get(idx);
   }

   public void setRule(int idx, CFRuleBase r) {
      if(r == null) {
         throw new IllegalArgumentException("r must not be null");
      } else {
         this.checkRuleIndex(idx);
         this.checkRuleType(r);
         this.rules.set(idx, r);
      }
   }

   public void addRule(CFRuleBase r) {
      if(r == null) {
         throw new IllegalArgumentException("r must not be null");
      } else {
         if(this.rules.size() >= 3) {
            logger.log(5, new Object[]{"Excel versions before 2007 cannot cope with any more than 3 - this file will cause problems with old Excel versions"});
         }

         this.checkRuleType(r);
         this.rules.add(r);
         this.header.setNumberOfConditionalFormats(this.rules.size());
      }
   }

   public int getNumberOfRules() {
      return this.rules.size();
   }

   public String toString() {
      StringBuilder buffer = new StringBuilder();
      String type = "CF";
      if(this.header instanceof CFHeader12Record) {
         type = "CF12";
      }

      buffer.append("[").append(type).append("]\n");
      if(this.header != null) {
         buffer.append(this.header.toString());
      }

      Iterator i$ = this.rules.iterator();

      while(i$.hasNext()) {
         CFRuleBase cfRule = (CFRuleBase)i$.next();
         buffer.append(cfRule.toString());
      }

      buffer.append("[/").append(type).append("]\n");
      return buffer.toString();
   }

   public void visitContainedRecords(RecordAggregate.RecordVisitor rv) {
      rv.visitRecord(this.header);
      Iterator i$ = this.rules.iterator();

      while(i$.hasNext()) {
         CFRuleBase rule = (CFRuleBase)i$.next();
         rv.visitRecord(rule);
      }

   }

   public boolean updateFormulasAfterCellShift(FormulaShifter shifter, int currentExternSheetIx) {
      CellRangeAddress[] cellRanges = this.header.getCellRanges();
      boolean changed = false;
      ArrayList temp = new ArrayList();
      CellRangeAddress[] i$ = cellRanges;
      int rule = cellRanges.length;

      for(int ptgs = 0; ptgs < rule; ++ptgs) {
         CellRangeAddress rule12 = i$[ptgs];
         CellRangeAddress craNew = shiftRange(shifter, rule12, currentExternSheetIx);
         if(craNew == null) {
            changed = true;
         } else {
            temp.add(craNew);
            if(craNew != rule12) {
               changed = true;
            }
         }
      }

      if(changed) {
         int var11 = temp.size();
         if(var11 == 0) {
            return false;
         }

         CellRangeAddress[] var13 = new CellRangeAddress[var11];
         temp.toArray(var13);
         this.header.setCellRanges(var13);
      }

      Iterator var12 = this.rules.iterator();

      while(var12.hasNext()) {
         CFRuleBase var14 = (CFRuleBase)var12.next();
         Ptg[] var15 = var14.getParsedExpression1();
         if(var15 != null && shifter.adjustFormula(var15, currentExternSheetIx)) {
            var14.setParsedExpression1(var15);
         }

         var15 = var14.getParsedExpression2();
         if(var15 != null && shifter.adjustFormula(var15, currentExternSheetIx)) {
            var14.setParsedExpression2(var15);
         }

         if(var14 instanceof CFRule12Record) {
            CFRule12Record var16 = (CFRule12Record)var14;
            var15 = var16.getParsedExpressionScale();
            if(var15 != null && shifter.adjustFormula(var15, currentExternSheetIx)) {
               var16.setParsedExpressionScale(var15);
            }
         }
      }

      return true;
   }

   private static CellRangeAddress shiftRange(FormulaShifter shifter, CellRangeAddress cra, int currentExternSheetIx) {
      AreaPtg aptg = new AreaPtg(cra.getFirstRow(), cra.getLastRow(), cra.getFirstColumn(), cra.getLastColumn(), false, false, false, false);
      Ptg[] ptgs = new Ptg[]{aptg};
      if(!shifter.adjustFormula(ptgs, currentExternSheetIx)) {
         return cra;
      } else {
         Ptg ptg0 = ptgs[0];
         if(ptg0 instanceof AreaPtg) {
            AreaPtg bptg = (AreaPtg)ptg0;
            return new CellRangeAddress(bptg.getFirstRow(), bptg.getLastRow(), bptg.getFirstColumn(), bptg.getLastColumn());
         } else if(ptg0 instanceof AreaErrPtg) {
            return null;
         } else {
            throw new IllegalStateException("Unexpected shifted ptg class (" + ptg0.getClass().getName() + ")");
         }
      }
   }

}
