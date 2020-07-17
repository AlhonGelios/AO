package org.apache.poi.ss.formula.eval.forked;

import java.lang.reflect.Method;
import org.apache.poi.hssf.usermodel.HSSFEvaluationWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.CollaboratingWorkbooksEnvironment;
import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.IStabilityClassifier;
import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.eval.forked.ForkedEvaluationCell;
import org.apache.poi.ss.formula.eval.forked.ForkedEvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;

public final class ForkedEvaluator {

   private WorkbookEvaluator _evaluator;
   private ForkedEvaluationWorkbook _sewb;


   private ForkedEvaluator(EvaluationWorkbook masterWorkbook, IStabilityClassifier stabilityClassifier, UDFFinder udfFinder) {
      this._sewb = new ForkedEvaluationWorkbook(masterWorkbook);
      this._evaluator = new WorkbookEvaluator(this._sewb, stabilityClassifier, udfFinder);
   }

   private static EvaluationWorkbook createEvaluationWorkbook(Workbook wb) {
      if(wb instanceof HSSFWorkbook) {
         return HSSFEvaluationWorkbook.create((HSSFWorkbook)wb);
      } else {
         try {
            Class e = Class.forName("org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook");
            Class xssfWB = Class.forName("org.apache.poi.xssf.usermodel.XSSFWorkbook");
            Method createM = e.getDeclaredMethod("create", new Class[]{xssfWB});
            return (EvaluationWorkbook)createM.invoke((Object)null, new Object[]{wb});
         } catch (Exception var4) {
            throw new IllegalArgumentException("Unexpected workbook type (" + wb.getClass().getName() + ") - check for poi-ooxml and poi-ooxml schemas jar in the classpath", var4);
         }
      }
   }

   public static ForkedEvaluator create(Workbook wb, IStabilityClassifier stabilityClassifier, UDFFinder udfFinder) {
      return new ForkedEvaluator(createEvaluationWorkbook(wb), stabilityClassifier, udfFinder);
   }

   public void updateCell(String sheetName, int rowIndex, int columnIndex, ValueEval value) {
      ForkedEvaluationCell cell = this._sewb.getOrCreateUpdatableCell(sheetName, rowIndex, columnIndex);
      cell.setValue(value);
      this._evaluator.notifyUpdateCell(cell);
   }

   public void copyUpdatedCells(Workbook workbook) {
      this._sewb.copyUpdatedCells(workbook);
   }

   public ValueEval evaluate(String sheetName, int rowIndex, int columnIndex) {
      EvaluationCell cell = this._sewb.getEvaluationCell(sheetName, rowIndex, columnIndex);
      switch(ForkedEvaluator.NamelessClass1202049741.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cell.getCellTypeEnum().ordinal()]) {
      case 1:
         return BoolEval.valueOf(cell.getBooleanCellValue());
      case 2:
         return ErrorEval.valueOf(cell.getErrorCellValue());
      case 3:
         return this._evaluator.evaluate(cell);
      case 4:
         return new NumberEval(cell.getNumericCellValue());
      case 5:
         return new StringEval(cell.getStringCellValue());
      case 6:
         return null;
      default:
         throw new IllegalStateException("Bad cell type (" + cell.getCellTypeEnum() + ")");
      }
   }

   public static void setupEnvironment(String[] workbookNames, ForkedEvaluator[] evaluators) {
      WorkbookEvaluator[] wbEvals = new WorkbookEvaluator[evaluators.length];

      for(int i = 0; i < wbEvals.length; ++i) {
         wbEvals[i] = evaluators[i]._evaluator;
      }

      CollaboratingWorkbooksEnvironment.setup(workbookNames, wbEvals);
   }

   // $FF: synthetic class
   static class NamelessClass1202049741 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$CellType = new int[CellType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.BOOLEAN.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.ERROR.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.FORMULA.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.NUMERIC.ordinal()] = 4;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.STRING.ordinal()] = 5;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.BLANK.ordinal()] = 6;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
