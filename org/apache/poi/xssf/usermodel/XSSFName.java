package org.apache.poi.xssf.usermodel;

import java.util.Iterator;
import org.apache.poi.ss.formula.FormulaParser;
import org.apache.poi.ss.formula.FormulaType;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.util.AreaReference;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName;

public final class XSSFName implements Name {

   public static final String BUILTIN_PRINT_AREA = "_xlnm.Print_Area";
   public static final String BUILTIN_PRINT_TITLE = "_xlnm.Print_Titles";
   public static final String BUILTIN_CRITERIA = "_xlnm.Criteria:";
   public static final String BUILTIN_EXTRACT = "_xlnm.Extract:";
   public static final String BUILTIN_FILTER_DB = "_xlnm._FilterDatabase";
   public static final String BUILTIN_CONSOLIDATE_AREA = "_xlnm.Consolidate_Area";
   public static final String BUILTIN_DATABASE = "_xlnm.Database";
   public static final String BUILTIN_SHEET_TITLE = "_xlnm.Sheet_Title";
   private XSSFWorkbook _workbook;
   private CTDefinedName _ctName;


   protected XSSFName(CTDefinedName name, XSSFWorkbook workbook) {
      this._workbook = workbook;
      this._ctName = name;
   }

   protected CTDefinedName getCTName() {
      return this._ctName;
   }

   public String getNameName() {
      return this._ctName.getName();
   }

   public void setNameName(String name) {
      validateName(name);
      String oldName = this.getNameName();
      int sheetIndex = this.getSheetIndex();
      Iterator i$ = this._workbook.getNames(name).iterator();

      XSSFName foundName;
      do {
         if(!i$.hasNext()) {
            this._ctName.setName(name);
            this._workbook.updateName(this, oldName);
            return;
         }

         foundName = (XSSFName)i$.next();
      } while(foundName.getSheetIndex() != sheetIndex || foundName == this);

      String msg = "The " + (sheetIndex == -1?"workbook":"sheet") + " already contains this name: " + name;
      throw new IllegalArgumentException(msg);
   }

   public String getRefersToFormula() {
      String result = this._ctName.getStringValue();
      return result != null && result.length() >= 1?result:null;
   }

   public void setRefersToFormula(String formulaText) {
      XSSFEvaluationWorkbook fpb = XSSFEvaluationWorkbook.create(this._workbook);
      FormulaParser.parse(formulaText, fpb, FormulaType.NAMEDRANGE, this.getSheetIndex(), -1);
      this._ctName.setStringValue(formulaText);
   }

   public boolean isDeleted() {
      String formulaText = this.getRefersToFormula();
      if(formulaText == null) {
         return false;
      } else {
         XSSFEvaluationWorkbook fpb = XSSFEvaluationWorkbook.create(this._workbook);
         Ptg[] ptgs = FormulaParser.parse(formulaText, fpb, FormulaType.NAMEDRANGE, this.getSheetIndex(), -1);
         return Ptg.doesFormulaReferToDeletedCell(ptgs);
      }
   }

   public void setSheetIndex(int index) {
      int lastSheetIx = this._workbook.getNumberOfSheets() - 1;
      if(index >= -1 && index <= lastSheetIx) {
         if(index == -1) {
            if(this._ctName.isSetLocalSheetId()) {
               this._ctName.unsetLocalSheetId();
            }
         } else {
            this._ctName.setLocalSheetId((long)index);
         }

      } else {
         throw new IllegalArgumentException("Sheet index (" + index + ") is out of range" + (lastSheetIx == -1?"":" (0.." + lastSheetIx + ")"));
      }
   }

   public int getSheetIndex() {
      return this._ctName.isSetLocalSheetId()?(int)this._ctName.getLocalSheetId():-1;
   }

   public void setFunction(boolean value) {
      this._ctName.setFunction(value);
   }

   public boolean getFunction() {
      return this._ctName.getFunction();
   }

   public void setFunctionGroupId(int functionGroupId) {
      this._ctName.setFunctionGroupId((long)functionGroupId);
   }

   public int getFunctionGroupId() {
      return (int)this._ctName.getFunctionGroupId();
   }

   public String getSheetName() {
      if(this._ctName.isSetLocalSheetId()) {
         int ref1 = (int)this._ctName.getLocalSheetId();
         return this._workbook.getSheetName(ref1);
      } else {
         String ref = this.getRefersToFormula();
         AreaReference areaRef = new AreaReference(ref);
         return areaRef.getFirstCell().getSheetName();
      }
   }

   public boolean isFunctionName() {
      return this.getFunction();
   }

   public String getComment() {
      return this._ctName.getComment();
   }

   public void setComment(String comment) {
      this._ctName.setComment(comment);
   }

   public int hashCode() {
      return this._ctName.toString().hashCode();
   }

   public boolean equals(Object o) {
      if(o == this) {
         return true;
      } else if(!(o instanceof XSSFName)) {
         return false;
      } else {
         XSSFName cf = (XSSFName)o;
         return this._ctName.toString().equals(cf.getCTName().toString());
      }
   }

   private static void validateName(String name) {
      if(name.length() == 0) {
         throw new IllegalArgumentException("Name cannot be blank");
      } else {
         char c = name.charAt(0);
         String allowedSymbols = "_";
         boolean characterIsValid = Character.isLetter(c) || allowedSymbols.indexOf(c) != -1;
         if(!characterIsValid) {
            throw new IllegalArgumentException("Invalid name: \'" + name + "\': first character must be underscore or a letter");
         } else {
            allowedSymbols = "_\\";
            char[] arr$ = name.toCharArray();
            int len$ = arr$.length;

            for(int i$ = 0; i$ < len$; ++i$) {
               char ch = arr$[i$];
               characterIsValid = Character.isLetterOrDigit(ch) || allowedSymbols.indexOf(ch) != -1;
               if(!characterIsValid) {
                  throw new IllegalArgumentException("Invalid name: \'" + name + "\'");
               }
            }

         }
      }
   }
}
