package org.apache.poi.ss.usermodel;

import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.util.Internal;

public interface FormulaEvaluator {

   void clearAllCachedResultValues();

   void notifySetFormula(Cell var1);

   void notifyDeleteCell(Cell var1);

   void notifyUpdateCell(Cell var1);

   void evaluateAll();

   CellValue evaluate(Cell var1);

   int evaluateFormulaCell(Cell var1);

   @Internal(
      since = "POI 3.15 beta 3"
   )
   CellType evaluateFormulaCellEnum(Cell var1);

   Cell evaluateInCell(Cell var1);

   void setupReferencedWorkbooks(Map var1);

   void setIgnoreMissingWorkbooks(boolean var1);

   void setDebugEvaluationOutputForNextEval(boolean var1);
}
