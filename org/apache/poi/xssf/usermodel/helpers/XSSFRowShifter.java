package org.apache.poi.xssf.usermodel.helpers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.formula.FormulaParser;
import org.apache.poi.ss.formula.FormulaRenderer;
import org.apache.poi.ss.formula.FormulaShifter;
import org.apache.poi.ss.formula.FormulaType;
import org.apache.poi.ss.formula.ptg.AreaErrPtg;
import org.apache.poi.ss.formula.ptg.AreaPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.helpers.RowShifter;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.Internal;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType;

public final class XSSFRowShifter extends RowShifter {

   private static final POILogger logger = POILogFactory.getLogger(XSSFRowShifter.class);


   public XSSFRowShifter(XSSFSheet sh) {
      super(sh);
   }

   public List shiftMerged(int startRow, int endRow, int n) {
      return this.shiftMergedRegions(startRow, endRow, n);
   }

   public void updateNamedRanges(FormulaShifter shifter) {
      Workbook wb = this.sheet.getWorkbook();
      XSSFEvaluationWorkbook fpb = XSSFEvaluationWorkbook.create((XSSFWorkbook)wb);
      Iterator i$ = wb.getAllNames().iterator();

      while(i$.hasNext()) {
         Name name = (Name)i$.next();
         String formula = name.getRefersToFormula();
         int sheetIndex = name.getSheetIndex();
         boolean rowIndex = true;
         Ptg[] ptgs = FormulaParser.parse(formula, fpb, FormulaType.NAMEDRANGE, sheetIndex, -1);
         if(shifter.adjustFormula(ptgs, sheetIndex)) {
            String shiftedFmla = FormulaRenderer.toFormulaString(fpb, ptgs);
            name.setRefersToFormula(shiftedFmla);
         }
      }

   }

   public void updateFormulas(FormulaShifter shifter) {
      this.updateSheetFormulas(this.sheet, shifter);
      Workbook wb = this.sheet.getWorkbook();
      Iterator i$ = wb.iterator();

      while(i$.hasNext()) {
         Sheet sh = (Sheet)i$.next();
         if(this.sheet != sh) {
            this.updateSheetFormulas(sh, shifter);
         }
      }

   }

   private void updateSheetFormulas(Sheet sh, FormulaShifter shifter) {
      Iterator i$ = sh.iterator();

      while(i$.hasNext()) {
         Row r = (Row)i$.next();
         XSSFRow row = (XSSFRow)r;
         this.updateRowFormulas(row, shifter);
      }

   }

   @Internal
   public void updateRowFormulas(Row row, FormulaShifter shifter) {
      XSSFSheet sheet = (XSSFSheet)row.getSheet();
      Iterator i$ = row.iterator();

      while(i$.hasNext()) {
         Cell c = (Cell)i$.next();
         XSSFCell cell = (XSSFCell)c;
         CTCell ctCell = cell.getCTCell();
         if(ctCell.isSetF()) {
            CTCellFormula f = ctCell.getF();
            String formula = f.getStringValue();
            String ref;
            if(formula.length() > 0) {
               ref = shiftFormula(row, formula, shifter);
               if(ref != null) {
                  f.setStringValue(ref);
                  if(f.getT() == STCellFormulaType.SHARED) {
                     int shiftedRef = (int)f.getSi();
                     CTCellFormula sf = sheet.getSharedFormula(shiftedRef);
                     sf.setStringValue(ref);
                  }
               }
            }

            if(f.isSetRef()) {
               ref = f.getRef();
               String shiftedRef1 = shiftFormula(row, ref, shifter);
               if(shiftedRef1 != null) {
                  f.setRef(shiftedRef1);
               }
            }
         }
      }

   }

   private static String shiftFormula(Row row, String formula, FormulaShifter shifter) {
      Sheet sheet = row.getSheet();
      Workbook wb = sheet.getWorkbook();
      int sheetIndex = wb.getSheetIndex(sheet);
      int rowIndex = row.getRowNum();
      XSSFEvaluationWorkbook fpb = XSSFEvaluationWorkbook.create((XSSFWorkbook)wb);

      try {
         Ptg[] fpe = FormulaParser.parse(formula, fpb, FormulaType.CELL, sheetIndex, rowIndex);
         String shiftedFmla = null;
         if(shifter.adjustFormula(fpe, sheetIndex)) {
            shiftedFmla = FormulaRenderer.toFormulaString(fpb, fpe);
         }

         return shiftedFmla;
      } catch (FormulaParseException var10) {
         logger.log(5, new Object[]{"Error shifting formula on row ", Integer.valueOf(row.getRowNum()), var10});
         return formula;
      }
   }

   public void updateConditionalFormatting(FormulaShifter shifter) {
      XSSFSheet xsheet = (XSSFSheet)this.sheet;
      XSSFWorkbook wb = xsheet.getWorkbook();
      int sheetIndex = wb.getSheetIndex(this.sheet);
      boolean rowIndex = true;
      XSSFEvaluationWorkbook fpb = XSSFEvaluationWorkbook.create(wb);
      CTWorksheet ctWorksheet = xsheet.getCTWorksheet();
      CTConditionalFormatting[] conditionalFormattingArray = ctWorksheet.getConditionalFormattingArray();

      for(int j = conditionalFormattingArray.length - 1; j >= 0; --j) {
         CTConditionalFormatting cf = conditionalFormattingArray[j];
         ArrayList cellRanges = new ArrayList();
         Iterator changed = cf.getSqref().iterator();

         int i$;
         while(changed.hasNext()) {
            Object temp = changed.next();
            String[] arr$ = temp.toString().split(" ");
            String[] len$ = arr$;
            i$ = arr$.length;

            for(int cfRule = 0; cfRule < i$; ++cfRule) {
               String formulaArray = len$[cfRule];
               cellRanges.add(CellRangeAddress.valueOf(formulaArray));
            }
         }

         boolean var23 = false;
         ArrayList var24 = new ArrayList();
         Iterator var25 = cellRanges.iterator();

         while(var25.hasNext()) {
            CellRangeAddress var28 = (CellRangeAddress)var25.next();
            CellRangeAddress var31 = shiftRange(shifter, var28, sheetIndex);
            if(var31 == null) {
               var23 = true;
            } else {
               var24.add(var31);
               if(var31 != var28) {
                  var23 = true;
               }
            }
         }

         if(var23) {
            int var26 = var24.size();
            if(var26 == 0) {
               ctWorksheet.removeConditionalFormatting(j);
               continue;
            }

            ArrayList var29 = new ArrayList();
            Iterator var32 = var24.iterator();

            while(var32.hasNext()) {
               CellRangeAddress var33 = (CellRangeAddress)var32.next();
               var29.add(var33.formatAsString());
            }

            cf.setSqref(var29);
         }

         CTCfRule[] var27 = cf.getCfRuleArray();
         int var30 = var27.length;

         for(i$ = 0; i$ < var30; ++i$) {
            CTCfRule var34 = var27[i$];
            String[] var35 = var34.getFormulaArray();

            for(int i = 0; i < var35.length; ++i) {
               String formula = var35[i];
               Ptg[] ptgs = FormulaParser.parse(formula, fpb, FormulaType.CELL, sheetIndex, -1);
               if(shifter.adjustFormula(ptgs, sheetIndex)) {
                  String shiftedFmla = FormulaRenderer.toFormulaString(fpb, ptgs);
                  var34.setFormulaArray(i, shiftedFmla);
               }
            }
         }
      }

   }

   public void updateHyperlinks(FormulaShifter shifter) {
      int sheetIndex = this.sheet.getWorkbook().getSheetIndex(this.sheet);
      List hyperlinkList = this.sheet.getHyperlinkList();
      Iterator i$ = hyperlinkList.iterator();

      while(i$.hasNext()) {
         Hyperlink hyperlink = (Hyperlink)i$.next();
         XSSFHyperlink xhyperlink = (XSSFHyperlink)hyperlink;
         String cellRef = xhyperlink.getCellRef();
         CellRangeAddress cra = CellRangeAddress.valueOf(cellRef);
         CellRangeAddress shiftedRange = shiftRange(shifter, cra, sheetIndex);
         if(shiftedRange != null && shiftedRange != cra) {
            xhyperlink.setCellReference(shiftedRange.formatAsString());
         }
      }

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
