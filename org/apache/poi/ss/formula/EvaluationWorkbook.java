package org.apache.poi.ss.formula;

import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationName;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.formula.ptg.NamePtg;
import org.apache.poi.ss.formula.ptg.NameXPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.util.Internal;

@Internal
public interface EvaluationWorkbook {

   String getSheetName(int var1);

   int getSheetIndex(EvaluationSheet var1);

   int getSheetIndex(String var1);

   EvaluationSheet getSheet(int var1);

   EvaluationWorkbook.ExternalSheet getExternalSheet(int var1);

   EvaluationWorkbook.ExternalSheet getExternalSheet(String var1, String var2, int var3);

   int convertFromExternSheetIndex(int var1);

   EvaluationWorkbook.ExternalName getExternalName(int var1, int var2);

   EvaluationWorkbook.ExternalName getExternalName(String var1, String var2, int var3);

   EvaluationName getName(NamePtg var1);

   EvaluationName getName(String var1, int var2);

   String resolveNameXText(NameXPtg var1);

   Ptg[] getFormulaTokens(EvaluationCell var1);

   UDFFinder getUDFFinder();

   void clearAllCachedResultValues();

   public static class ExternalSheet {

      private final String _workbookName;
      private final String _sheetName;


      public ExternalSheet(String workbookName, String sheetName) {
         this._workbookName = workbookName;
         this._sheetName = sheetName;
      }

      public String getWorkbookName() {
         return this._workbookName;
      }

      public String getSheetName() {
         return this._sheetName;
      }
   }

   public static class ExternalSheetRange extends EvaluationWorkbook.ExternalSheet {

      private final String _lastSheetName;


      public ExternalSheetRange(String workbookName, String firstSheetName, String lastSheetName) {
         super(workbookName, firstSheetName);
         this._lastSheetName = lastSheetName;
      }

      public String getFirstSheetName() {
         return this.getSheetName();
      }

      public String getLastSheetName() {
         return this._lastSheetName;
      }
   }

   public static class ExternalName {

      private final String _nameName;
      private final int _nameNumber;
      private final int _ix;


      public ExternalName(String nameName, int nameNumber, int ix) {
         this._nameName = nameName;
         this._nameNumber = nameNumber;
         this._ix = ix;
      }

      public String getName() {
         return this._nameName;
      }

      public int getNumber() {
         return this._nameNumber;
      }

      public int getIx() {
         return this._ix;
      }
   }
}
