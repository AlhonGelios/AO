package org.apache.poi.xssf.streaming;

import java.util.Iterator;
import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.IStabilityClassifier;
import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFEvaluationCell;
import org.apache.poi.xssf.streaming.SXSSFEvaluationWorkbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.BaseXSSFFormulaEvaluator;

public final class SXSSFFormulaEvaluator extends BaseXSSFFormulaEvaluator {

   private static POILogger logger = POILogFactory.getLogger(SXSSFFormulaEvaluator.class);
   private SXSSFWorkbook wb;


   public SXSSFFormulaEvaluator(SXSSFWorkbook workbook) {
      this(workbook, (IStabilityClassifier)null, (UDFFinder)null);
   }

   private SXSSFFormulaEvaluator(SXSSFWorkbook workbook, IStabilityClassifier stabilityClassifier, UDFFinder udfFinder) {
      this(workbook, new WorkbookEvaluator(SXSSFEvaluationWorkbook.create(workbook), stabilityClassifier, udfFinder));
   }

   private SXSSFFormulaEvaluator(SXSSFWorkbook workbook, WorkbookEvaluator bookEvaluator) {
      super(bookEvaluator);
      this.wb = workbook;
   }

   public static SXSSFFormulaEvaluator create(SXSSFWorkbook workbook, IStabilityClassifier stabilityClassifier, UDFFinder udfFinder) {
      return new SXSSFFormulaEvaluator(workbook, stabilityClassifier, udfFinder);
   }

   protected EvaluationCell toEvaluationCell(Cell cell) {
      if(!(cell instanceof SXSSFCell)) {
         throw new IllegalArgumentException("Unexpected type of cell: " + cell.getClass() + "." + " Only SXSSFCells can be evaluated.");
      } else {
         return new SXSSFEvaluationCell((SXSSFCell)cell);
      }
   }

   public SXSSFCell evaluateInCell(Cell cell) {
      return (SXSSFCell)super.evaluateInCell(cell);
   }

   public static void evaluateAllFormulaCells(SXSSFWorkbook wb, boolean skipOutOfWindow) {
      SXSSFFormulaEvaluator eval = new SXSSFFormulaEvaluator(wb);
      Iterator i$ = wb.iterator();

      Sheet sheet;
      while(i$.hasNext()) {
         sheet = (Sheet)i$.next();
         if(((SXSSFSheet)sheet).areAllRowsFlushed()) {
            throw new SXSSFFormulaEvaluator.SheetsFlushedException();
         }
      }

      i$ = wb.iterator();

      while(i$.hasNext()) {
         sheet = (Sheet)i$.next();
         int lastFlushedRowNum = ((SXSSFSheet)sheet).getLastFlushedRowNum();
         if(lastFlushedRowNum > -1) {
            if(!skipOutOfWindow) {
               throw new SXSSFFormulaEvaluator.RowFlushedException(0);
            }

            logger.log(3, new Object[]{"Rows up to " + lastFlushedRowNum + " have already been flushed, skipping"});
         }

         Iterator i$1 = sheet.iterator();

         while(i$1.hasNext()) {
            Row r = (Row)i$1.next();
            Iterator i$2 = r.iterator();

            while(i$2.hasNext()) {
               Cell c = (Cell)i$2.next();
               if(c.getCellTypeEnum() == CellType.FORMULA) {
                  eval.evaluateFormulaCellEnum(c);
               }
            }
         }
      }

   }

   public void evaluateAll() {
      evaluateAllFormulaCells(this.wb, false);
   }


   public static class RowFlushedException extends IllegalStateException {

      protected RowFlushedException(int rowNum) {
         super("Row " + rowNum + " has been flushed, cannot evaluate all cells");
      }
   }

   public static class SheetsFlushedException extends IllegalStateException {

      protected SheetsFlushedException() {
         super("One or more sheets have been flushed, cannot evaluate all cells");
      }
   }
}
