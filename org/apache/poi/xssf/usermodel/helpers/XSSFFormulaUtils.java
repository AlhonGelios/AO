package org.apache.poi.xssf.usermodel.helpers;

import java.util.Iterator;
import org.apache.poi.ss.formula.FormulaParser;
import org.apache.poi.ss.formula.FormulaRenderer;
import org.apache.poi.ss.formula.FormulaType;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.Pxg;
import org.apache.poi.ss.formula.ptg.Pxg3D;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula;

public final class XSSFFormulaUtils {

   private final XSSFWorkbook _wb;
   private final XSSFEvaluationWorkbook _fpwb;


   public XSSFFormulaUtils(XSSFWorkbook wb) {
      this._wb = wb;
      this._fpwb = XSSFEvaluationWorkbook.create(this._wb);
   }

   public void updateSheetName(int sheetIndex, String oldName, String newName) {
      Iterator i$ = this._wb.getAllNames().iterator();

      while(i$.hasNext()) {
         XSSFName sh = (XSSFName)i$.next();
         if(sh.getSheetIndex() == -1 || sh.getSheetIndex() == sheetIndex) {
            this.updateName(sh, oldName, newName);
         }
      }

      i$ = this._wb.iterator();

      while(i$.hasNext()) {
         Sheet sh1 = (Sheet)i$.next();
         Iterator i$1 = sh1.iterator();

         while(i$1.hasNext()) {
            Row row = (Row)i$1.next();
            Iterator i$2 = row.iterator();

            while(i$2.hasNext()) {
               Cell cell = (Cell)i$2.next();
               if(cell.getCellTypeEnum() == CellType.FORMULA) {
                  this.updateFormula((XSSFCell)cell, oldName, newName);
               }
            }
         }
      }

   }

   private void updateFormula(XSSFCell cell, String oldName, String newName) {
      CTCellFormula f = cell.getCTCell().getF();
      if(f != null) {
         String formula = f.getStringValue();
         if(formula != null && formula.length() > 0) {
            int sheetIndex = this._wb.getSheetIndex((Sheet)cell.getSheet());
            Ptg[] ptgs = FormulaParser.parse(formula, this._fpwb, FormulaType.CELL, sheetIndex, cell.getRowIndex());
            Ptg[] updatedFormula = ptgs;
            int len$ = ptgs.length;

            for(int i$ = 0; i$ < len$; ++i$) {
               Ptg ptg = updatedFormula[i$];
               this.updatePtg(ptg, oldName, newName);
            }

            String var12 = FormulaRenderer.toFormulaString(this._fpwb, ptgs);
            if(!formula.equals(var12)) {
               f.setStringValue(var12);
            }
         }
      }

   }

   private void updateName(XSSFName name, String oldName, String newName) {
      String formula = name.getRefersToFormula();
      if(formula != null) {
         int sheetIndex = name.getSheetIndex();
         byte rowIndex = -1;
         Ptg[] ptgs = FormulaParser.parse(formula, this._fpwb, FormulaType.NAMEDRANGE, sheetIndex, rowIndex);
         Ptg[] updatedFormula = ptgs;
         int len$ = ptgs.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            Ptg ptg = updatedFormula[i$];
            this.updatePtg(ptg, oldName, newName);
         }

         String var12 = FormulaRenderer.toFormulaString(this._fpwb, ptgs);
         if(!formula.equals(var12)) {
            name.setRefersToFormula(var12);
         }
      }

   }

   private void updatePtg(Ptg ptg, String oldName, String newName) {
      if(ptg instanceof Pxg) {
         Pxg pxg = (Pxg)ptg;
         if(pxg.getExternalWorkbookNumber() < 1) {
            if(pxg.getSheetName() != null && pxg.getSheetName().equals(oldName)) {
               pxg.setSheetName(newName);
            }

            if(pxg instanceof Pxg3D) {
               Pxg3D pxg3D = (Pxg3D)pxg;
               if(pxg3D.getLastSheetName() != null && pxg3D.getLastSheetName().equals(oldName)) {
                  pxg3D.setLastSheetName(newName);
               }
            }
         }
      }

   }
}
