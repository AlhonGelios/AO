package org.apache.poi.ss.usermodel.helpers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.formula.FormulaShifter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.Internal;

public abstract class RowShifter {

   protected final Sheet sheet;


   public RowShifter(Sheet sh) {
      this.sheet = sh;
   }

   public List shiftMergedRegions(int startRow, int endRow, int n) {
      ArrayList shiftedRegions = new ArrayList();
      HashSet removedIndices = new HashSet();
      int size = this.sheet.getNumMergedRegions();

      CellRangeAddress region;
      for(int i$ = 0; i$ < size; ++i$) {
         region = this.sheet.getMergedRegion(i$);
         if(startRow + n <= region.getFirstRow() && endRow + n >= region.getLastRow()) {
            removedIndices.add(Integer.valueOf(i$));
         } else {
            boolean inStart = region.getFirstRow() >= startRow || region.getLastRow() >= startRow;
            boolean inEnd = region.getFirstRow() <= endRow || region.getLastRow() <= endRow;
            if(inStart && inEnd && !region.containsRow(startRow - 1) && !region.containsRow(endRow + 1)) {
               region.setFirstRow(region.getFirstRow() + n);
               region.setLastRow(region.getLastRow() + n);
               shiftedRegions.add(region);
               removedIndices.add(Integer.valueOf(i$));
            }
         }
      }

      if(!removedIndices.isEmpty()) {
         this.sheet.removeMergedRegions(removedIndices);
      }

      Iterator var11 = shiftedRegions.iterator();

      while(var11.hasNext()) {
         region = (CellRangeAddress)var11.next();
         this.sheet.addMergedRegion(region);
      }

      return shiftedRegions;
   }

   public abstract void updateNamedRanges(FormulaShifter var1);

   public abstract void updateFormulas(FormulaShifter var1);

   @Internal
   public abstract void updateRowFormulas(Row var1, FormulaShifter var2);

   public abstract void updateConditionalFormatting(FormulaShifter var1);

   public abstract void updateHyperlinks(FormulaShifter var1);
}
