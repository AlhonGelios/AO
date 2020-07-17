package org.apache.poi.xssf.usermodel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.FormulaShifter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellCopyPolicy;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.model.CalculationChain;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.helpers.XSSFRowShifter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow;

public class XSSFRow implements Row, Comparable {

   private final CTRow _row;
   private final TreeMap _cells;
   private final XSSFSheet _sheet;


   protected XSSFRow(CTRow row, XSSFSheet sheet) {
      this._row = row;
      this._sheet = sheet;
      this._cells = new TreeMap();
      CTCell[] nextRowNum = row.getCArray();
      int len$ = nextRowNum.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTCell c = nextRowNum[i$];
         XSSFCell cell = new XSSFCell(this, c);
         Integer colI = new Integer(cell.getColumnIndex());
         this._cells.put(colI, cell);
         sheet.onReadCell(cell);
      }

      if(!row.isSetR()) {
         int var9 = sheet.getLastRowNum() + 2;
         if(var9 == 2 && sheet.getPhysicalNumberOfRows() == 0) {
            var9 = 1;
         }

         row.setR((long)var9);
      }

   }

   public XSSFSheet getSheet() {
      return this._sheet;
   }

   public Iterator cellIterator() {
      return this._cells.values().iterator();
   }

   public Iterator iterator() {
      return this.cellIterator();
   }

   public int compareTo(XSSFRow other) {
      if(this.getSheet() != other.getSheet()) {
         throw new IllegalArgumentException("The compared rows must belong to the same sheet");
      } else {
         Integer thisRow = Integer.valueOf(this.getRowNum());
         Integer otherRow = Integer.valueOf(other.getRowNum());
         return thisRow.compareTo(otherRow);
      }
   }

   public boolean equals(Object obj) {
      if(!(obj instanceof XSSFRow)) {
         return false;
      } else {
         XSSFRow other = (XSSFRow)obj;
         return this.getRowNum() == other.getRowNum() && this.getSheet() == other.getSheet();
      }
   }

   public int hashCode() {
      return this._row.hashCode();
   }

   public XSSFCell createCell(int columnIndex) {
      return this.createCell(columnIndex, CellType.BLANK);
   }

   public XSSFCell createCell(int columnIndex, int type) {
      return this.createCell(columnIndex, CellType.forInt(type));
   }

   public XSSFCell createCell(int columnIndex, CellType type) {
      Integer colI = new Integer(columnIndex);
      XSSFCell prev = (XSSFCell)this._cells.get(colI);
      CTCell ctCell;
      if(prev != null) {
         ctCell = prev.getCTCell();
         ctCell.set(CTCell.Factory.newInstance());
      } else {
         ctCell = this._row.addNewC();
      }

      XSSFCell xcell = new XSSFCell(this, ctCell);
      xcell.setCellNum(columnIndex);
      if(type != CellType.BLANK) {
         xcell.setCellType(type);
      }

      this._cells.put(colI, xcell);
      return xcell;
   }

   public XSSFCell getCell(int cellnum) {
      return this.getCell(cellnum, this._sheet.getWorkbook().getMissingCellPolicy());
   }

   public XSSFCell getCell(int cellnum, Row.MissingCellPolicy policy) {
      if(cellnum < 0) {
         throw new IllegalArgumentException("Cell index must be >= 0");
      } else {
         Integer colI = new Integer(cellnum);
         XSSFCell cell = (XSSFCell)this._cells.get(colI);
         switch(XSSFRow.NamelessClass870700634.$SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy[policy.ordinal()]) {
         case 1:
            return cell;
         case 2:
            boolean isBlank = cell != null && cell.getCellTypeEnum() == CellType.BLANK;
            return isBlank?null:cell;
         case 3:
            return cell == null?this.createCell(cellnum, CellType.BLANK):cell;
         default:
            throw new IllegalArgumentException("Illegal policy " + policy + " (" + policy.id + ")");
         }
      }
   }

   public short getFirstCellNum() {
      return (short)(this._cells.size() == 0?-1:((Integer)this._cells.firstKey()).intValue());
   }

   public short getLastCellNum() {
      return (short)(this._cells.size() == 0?-1:((Integer)this._cells.lastKey()).intValue() + 1);
   }

   public short getHeight() {
      return (short)((int)(this.getHeightInPoints() * 20.0F));
   }

   public float getHeightInPoints() {
      return this._row.isSetHt()?(float)this._row.getHt():this._sheet.getDefaultRowHeightInPoints();
   }

   public void setHeight(short height) {
      if(height == -1) {
         if(this._row.isSetHt()) {
            this._row.unsetHt();
         }

         if(this._row.isSetCustomHeight()) {
            this._row.unsetCustomHeight();
         }
      } else {
         this._row.setHt((double)height / 20.0D);
         this._row.setCustomHeight(true);
      }

   }

   public void setHeightInPoints(float height) {
      this.setHeight((short)((int)(height == -1.0F?-1.0F:height * 20.0F)));
   }

   public int getPhysicalNumberOfCells() {
      return this._cells.size();
   }

   public int getRowNum() {
      return (int)(this._row.getR() - 1L);
   }

   public void setRowNum(int rowIndex) {
      int maxrow = SpreadsheetVersion.EXCEL2007.getLastRowIndex();
      if(rowIndex >= 0 && rowIndex <= maxrow) {
         this._row.setR((long)(rowIndex + 1));
      } else {
         throw new IllegalArgumentException("Invalid row number (" + rowIndex + ") outside allowable range (0.." + maxrow + ")");
      }
   }

   public boolean getZeroHeight() {
      return this._row.getHidden();
   }

   public void setZeroHeight(boolean height) {
      this._row.setHidden(height);
   }

   public boolean isFormatted() {
      return this._row.isSetS();
   }

   public XSSFCellStyle getRowStyle() {
      if(!this.isFormatted()) {
         return null;
      } else {
         StylesTable stylesSource = this.getSheet().getWorkbook().getStylesSource();
         return stylesSource.getNumCellStyles() > 0?stylesSource.getStyleAt((int)this._row.getS()):null;
      }
   }

   public void setRowStyle(CellStyle style) {
      if(style == null) {
         if(this._row.isSetS()) {
            this._row.unsetS();
            this._row.unsetCustomFormat();
         }
      } else {
         StylesTable styleSource = this.getSheet().getWorkbook().getStylesSource();
         XSSFCellStyle xStyle = (XSSFCellStyle)style;
         xStyle.verifyBelongsToStylesSource(styleSource);
         long idx = (long)styleSource.putStyle(xStyle);
         this._row.setS(idx);
         this._row.setCustomFormat(true);
      }

   }

   public void removeCell(Cell cell) {
      if(cell.getRow() != this) {
         throw new IllegalArgumentException("Specified cell does not belong to this row");
      } else {
         XSSFCell xcell = (XSSFCell)cell;
         if(xcell.isPartOfArrayFormulaGroup()) {
            xcell.notifyArrayFormulaChanging();
         }

         if(cell.getCellTypeEnum() == CellType.FORMULA) {
            this._sheet.getWorkbook().onDeleteFormula(xcell);
         }

         Integer colI = new Integer(cell.getColumnIndex());
         this._cells.remove(colI);
      }
   }

   @Internal
   public CTRow getCTRow() {
      return this._row;
   }

   protected void onDocumentWrite() {
      boolean isOrdered = true;
      CTCell[] cArray = this._row.getCArray();
      int i;
      Iterator i$;
      XSSFCell xssfCell;
      if(cArray.length != this._cells.size()) {
         isOrdered = false;
      } else {
         i = 0;
         i$ = this._cells.values().iterator();

         while(i$.hasNext()) {
            xssfCell = (XSSFCell)i$.next();
            CTCell c1 = xssfCell.getCTCell();
            CTCell c2 = cArray[i++];
            String r1 = c1.getR();
            String r2 = c2.getR();
            if(r1 == null) {
               if(r2 == null) {
                  continue;
               }
            } else if(r1.equals(r2)) {
               continue;
            }

            isOrdered = false;
            break;
         }
      }

      if(!isOrdered) {
         cArray = new CTCell[this._cells.size()];
         i = 0;

         for(i$ = this._cells.values().iterator(); i$.hasNext(); ++i) {
            xssfCell = (XSSFCell)i$.next();
            cArray[i] = (CTCell)xssfCell.getCTCell().copy();
            xssfCell.setCTCell(cArray[i]);
         }

         this._row.setCArray(cArray);
      }

   }

   public String toString() {
      return this._row.toString();
   }

   protected void shift(int n) {
      int rownum = this.getRowNum() + n;
      CalculationChain calcChain = this._sheet.getWorkbook().getCalculationChain();
      int sheetId = (int)this._sheet.sheet.getSheetId();
      String msg = "Row[rownum=" + this.getRowNum() + "] contains cell(s) included in a multi-cell array formula. " + "You cannot change part of an array.";
      Iterator i$ = this.iterator();

      while(i$.hasNext()) {
         Cell c = (Cell)i$.next();
         XSSFCell cell = (XSSFCell)c;
         if(cell.isPartOfArrayFormulaGroup()) {
            cell.notifyArrayFormulaChanging(msg);
         }

         if(calcChain != null) {
            calcChain.removeItem(sheetId, cell.getReference());
         }

         CTCell ctCell = cell.getCTCell();
         String r = (new CellReference(rownum, cell.getColumnIndex())).formatAsString();
         ctCell.setR(r);
      }

      this.setRowNum(rownum);
   }

   public void copyRowFrom(Row srcRow, CellCopyPolicy policy) {
      Iterator rowShifter;
      Cell sheetIndex;
      int var15;
      if(srcRow == null) {
         rowShifter = this.iterator();

         HashSet sheetName;
         while(rowShifter.hasNext()) {
            sheetIndex = (Cell)rowShifter.next();
            sheetName = null;
            ((XSSFCell)sheetIndex).copyCellFrom(sheetName, policy);
         }

         if(policy.isCopyMergedRegions()) {
            int var13 = this.getRowNum();
            var15 = 0;
            sheetName = new HashSet();

            for(Iterator srcRowNum = this.getSheet().getMergedRegions().iterator(); srcRowNum.hasNext(); ++var15) {
               CellRangeAddress destRowNum = (CellRangeAddress)srcRowNum.next();
               if(var13 == destRowNum.getFirstRow() && var13 == destRowNum.getLastRow()) {
                  sheetName.add(Integer.valueOf(var15));
               }
            }

            this.getSheet().removeMergedRegions(sheetName);
         }

         if(policy.isCopyRowHeight()) {
            this.setHeight((short)-1);
         }
      } else {
         rowShifter = srcRow.iterator();

         while(rowShifter.hasNext()) {
            sheetIndex = (Cell)rowShifter.next();
            XSSFCell var16 = (XSSFCell)sheetIndex;
            XSSFCell var18 = this.createCell(var16.getColumnIndex(), var16.getCellTypeEnum());
            var18.copyCellFrom(var16, policy);
         }

         XSSFRowShifter var14 = new XSSFRowShifter(this._sheet);
         var15 = this._sheet.getWorkbook().getSheetIndex((Sheet)this._sheet);
         String var17 = this._sheet.getWorkbook().getSheetName(var15);
         int var19 = srcRow.getRowNum();
         int var20 = this.getRowNum();
         int rowDifference = var20 - var19;
         FormulaShifter shifter = FormulaShifter.createForRowCopy(var15, var17, var19, var19, rowDifference, SpreadsheetVersion.EXCEL2007);
         var14.updateRowFormulas(this, shifter);
         if(policy.isCopyMergedRegions()) {
            Iterator i$ = srcRow.getSheet().getMergedRegions().iterator();

            while(i$.hasNext()) {
               CellRangeAddress srcRegion = (CellRangeAddress)i$.next();
               if(var19 == srcRegion.getFirstRow() && var19 == srcRegion.getLastRow()) {
                  CellRangeAddress destRegion = srcRegion.copy();
                  destRegion.setFirstRow(var20);
                  destRegion.setLastRow(var20);
                  this.getSheet().addMergedRegion(destRegion);
               }
            }
         }

         if(policy.isCopyRowHeight()) {
            this.setHeight(srcRow.getHeight());
         }
      }

   }

   public int getOutlineLevel() {
      return this._row.getOutlineLevel();
   }

   // $FF: synthetic class
   static class NamelessClass870700634 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy = new int[Row.MissingCellPolicy.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy[Row.MissingCellPolicy.RETURN_NULL_AND_BLANK.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy[Row.MissingCellPolicy.RETURN_BLANK_AS_NULL.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy[Row.MissingCellPolicy.CREATE_NULL_AS_BLANK.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
