package org.apache.poi.ss.formula;

import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.usermodel.CellType;

public interface EvaluationCell {

   Object getIdentityKey();

   EvaluationSheet getSheet();

   int getRowIndex();

   int getColumnIndex();

   int getCellType();

   CellType getCellTypeEnum();

   double getNumericCellValue();

   String getStringCellValue();

   boolean getBooleanCellValue();

   int getErrorCellValue();

   int getCachedFormulaResultType();

   CellType getCachedFormulaResultTypeEnum();
}
