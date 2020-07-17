package org.apache.poi.ss.formula;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.ptg.AreaPtg;
import org.apache.poi.ss.formula.ptg.AreaPtgBase;
import org.apache.poi.ss.formula.ptg.OperandPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.RefPtg;
import org.apache.poi.ss.formula.ptg.RefPtgBase;

public class SharedFormula {

   private final int _columnWrappingMask;
   private final int _rowWrappingMask;


   public SharedFormula(SpreadsheetVersion ssVersion) {
      this._columnWrappingMask = ssVersion.getLastColumnIndex();
      this._rowWrappingMask = ssVersion.getLastRowIndex();
   }

   public Ptg[] convertSharedFormulas(Ptg[] ptgs, int formulaRow, int formulaColumn) {
      Ptg[] newPtgStack = new Ptg[ptgs.length];

      for(int k = 0; k < ptgs.length; ++k) {
         Object ptg = ptgs[k];
         byte originalOperandClass = -1;
         if(!((Ptg)ptg).isBaseToken()) {
            originalOperandClass = ((Ptg)ptg).getPtgClass();
         }

         if(ptg instanceof RefPtgBase) {
            RefPtgBase areaNPtg = (RefPtgBase)ptg;
            ptg = new RefPtg(this.fixupRelativeRow(formulaRow, areaNPtg.getRow(), areaNPtg.isRowRelative()), this.fixupRelativeColumn(formulaColumn, areaNPtg.getColumn(), areaNPtg.isColRelative()), areaNPtg.isRowRelative(), areaNPtg.isColRelative());
            ((Ptg)ptg).setClass(originalOperandClass);
         } else if(ptg instanceof AreaPtgBase) {
            AreaPtgBase var9 = (AreaPtgBase)ptg;
            ptg = new AreaPtg(this.fixupRelativeRow(formulaRow, var9.getFirstRow(), var9.isFirstRowRelative()), this.fixupRelativeRow(formulaRow, var9.getLastRow(), var9.isLastRowRelative()), this.fixupRelativeColumn(formulaColumn, var9.getFirstColumn(), var9.isFirstColRelative()), this.fixupRelativeColumn(formulaColumn, var9.getLastColumn(), var9.isLastColRelative()), var9.isFirstRowRelative(), var9.isLastRowRelative(), var9.isFirstColRelative(), var9.isLastColRelative());
            ((Ptg)ptg).setClass(originalOperandClass);
         } else if(ptg instanceof OperandPtg) {
            ptg = ((OperandPtg)ptg).copy();
         }

         newPtgStack[k] = (Ptg)ptg;
      }

      return newPtgStack;
   }

   private int fixupRelativeColumn(int currentcolumn, int column, boolean relative) {
      return relative?column + currentcolumn & this._columnWrappingMask:column;
   }

   private int fixupRelativeRow(int currentrow, int row, boolean relative) {
      return relative?row + currentrow & this._rowWrappingMask:row;
   }
}
