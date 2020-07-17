package org.apache.poi.ss.util.cellwalk;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.cellwalk.CellHandler;
import org.apache.poi.ss.util.cellwalk.CellWalkContext;

public class CellWalk {

   private Sheet sheet;
   private CellRangeAddress range;
   private boolean traverseEmptyCells;


   public CellWalk(Sheet sheet, CellRangeAddress range) {
      this.sheet = sheet;
      this.range = range;
      this.traverseEmptyCells = false;
   }

   public boolean isTraverseEmptyCells() {
      return this.traverseEmptyCells;
   }

   public void setTraverseEmptyCells(boolean traverseEmptyCells) {
      this.traverseEmptyCells = traverseEmptyCells;
   }

   public void traverse(CellHandler handler) {
      int firstRow = this.range.getFirstRow();
      int lastRow = this.range.getLastRow();
      int firstColumn = this.range.getFirstColumn();
      int lastColumn = this.range.getLastColumn();
      int width = lastColumn - firstColumn + 1;
      CellWalk.SimpleCellWalkContext ctx = new CellWalk.SimpleCellWalkContext((CellWalk.NamelessClass288224454)null);
      Row currentRow = null;
      Cell currentCell = null;

      for(ctx.rowNumber = firstRow; ctx.rowNumber <= lastRow; ++ctx.rowNumber) {
         currentRow = this.sheet.getRow(ctx.rowNumber);
         if(currentRow != null) {
            for(ctx.colNumber = firstColumn; ctx.colNumber <= lastColumn; ++ctx.colNumber) {
               currentCell = currentRow.getCell(ctx.colNumber);
               if(currentCell != null && (!this.isEmpty(currentCell) || this.traverseEmptyCells)) {
                  ctx.ordinalNumber = (long)((ctx.rowNumber - firstRow) * width + ctx.colNumber - firstColumn + 1);
                  handler.onCell(currentCell, ctx);
               }
            }
         }
      }

   }

   private boolean isEmpty(Cell cell) {
      return cell.getCellTypeEnum() == CellType.BLANK;
   }

   // $FF: synthetic class
   static class NamelessClass288224454 {
   }

   private static class SimpleCellWalkContext implements CellWalkContext {

      public long ordinalNumber;
      public int rowNumber;
      public int colNumber;


      private SimpleCellWalkContext() {
         this.ordinalNumber = 0L;
         this.rowNumber = 0;
         this.colNumber = 0;
      }

      public long getOrdinalNumber() {
         return this.ordinalNumber;
      }

      public int getRowNumber() {
         return this.rowNumber;
      }

      public int getColumnNumber() {
         return this.colNumber;
      }

      // $FF: synthetic method
      SimpleCellWalkContext(CellWalk.NamelessClass288224454 x0) {
         this();
      }
   }
}
