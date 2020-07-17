package org.apache.poi.xssf.streaming;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.AutoFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellRange;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.PrintSetup;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.PaneInformation;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.util.Internal;
import org.apache.poi.util.NotImplemented;
import org.apache.poi.util.Removal;
import org.apache.poi.xssf.streaming.AutoSizeColumnTracker;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.streaming.SheetDataWriter;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;

public class SXSSFSheet implements Sheet {

   final XSSFSheet _sh;
   private final SXSSFWorkbook _workbook;
   private final TreeMap _rows = new TreeMap();
   private final SheetDataWriter _writer;
   private int _randomAccessWindowSize = 100;
   private final AutoSizeColumnTracker _autoSizeColumnTracker;
   private int outlineLevelRow = 0;
   private int lastFlushedRowNumber = -1;
   private boolean allFlushed = false;


   public SXSSFSheet(SXSSFWorkbook workbook, XSSFSheet xSheet) throws IOException {
      this._workbook = workbook;
      this._sh = xSheet;
      this._writer = workbook.createSheetDataWriter();
      this.setRandomAccessWindowSize(this._workbook.getRandomAccessWindowSize());
      this._autoSizeColumnTracker = new AutoSizeColumnTracker(this);
   }

   @Internal
   SheetDataWriter getSheetDataWriter() {
      return this._writer;
   }

   public InputStream getWorksheetXMLInputStream() throws IOException {
      this.flushRows(0);
      this._writer.close();
      return this._writer.getWorksheetXMLInputStream();
   }

   public Iterator iterator() {
      return this.rowIterator();
   }

   public SXSSFRow createRow(int rownum) {
      int maxrow = SpreadsheetVersion.EXCEL2007.getLastRowIndex();
      if(rownum >= 0 && rownum <= maxrow) {
         if(rownum <= this._writer.getLastFlushedRow()) {
            throw new IllegalArgumentException("Attempting to write a row[" + rownum + "] " + "in the range [0," + this._writer.getLastFlushedRow() + "] that is already written to disk.");
         } else if(this._sh.getPhysicalNumberOfRows() > 0 && rownum <= this._sh.getLastRowNum()) {
            throw new IllegalArgumentException("Attempting to write a row[" + rownum + "] " + "in the range [0," + this._sh.getLastRowNum() + "] that is already written to disk.");
         } else {
            SXSSFRow newRow = new SXSSFRow(this);
            this._rows.put(Integer.valueOf(rownum), newRow);
            this.allFlushed = false;
            if(this._randomAccessWindowSize >= 0 && this._rows.size() > this._randomAccessWindowSize) {
               try {
                  this.flushRows(this._randomAccessWindowSize);
               } catch (IOException var5) {
                  throw new RuntimeException(var5);
               }
            }

            return newRow;
         }
      } else {
         throw new IllegalArgumentException("Invalid row number (" + rownum + ") outside allowable range (0.." + maxrow + ")");
      }
   }

   public void removeRow(Row row) {
      if(row.getSheet() != this) {
         throw new IllegalArgumentException("Specified row does not belong to this sheet");
      } else {
         Iterator iter = this._rows.entrySet().iterator();

         Entry entry;
         do {
            if(!iter.hasNext()) {
               return;
            }

            entry = (Entry)iter.next();
         } while(entry.getValue() != row);

         iter.remove();
      }
   }

   public SXSSFRow getRow(int rownum) {
      return (SXSSFRow)this._rows.get(Integer.valueOf(rownum));
   }

   public int getPhysicalNumberOfRows() {
      return this._rows.size() + this._writer.getNumberOfFlushedRows();
   }

   public int getFirstRowNum() {
      return this._writer.getNumberOfFlushedRows() > 0?this._writer.getLowestIndexOfFlushedRows():(this._rows.size() == 0?0:((Integer)this._rows.firstKey()).intValue());
   }

   public int getLastRowNum() {
      return this._rows.size() == 0?0:((Integer)this._rows.lastKey()).intValue();
   }

   public void setColumnHidden(int columnIndex, boolean hidden) {
      this._sh.setColumnHidden(columnIndex, hidden);
   }

   public boolean isColumnHidden(int columnIndex) {
      return this._sh.isColumnHidden(columnIndex);
   }

   public void setColumnWidth(int columnIndex, int width) {
      this._sh.setColumnWidth(columnIndex, width);
   }

   public int getColumnWidth(int columnIndex) {
      return this._sh.getColumnWidth(columnIndex);
   }

   public float getColumnWidthInPixels(int columnIndex) {
      return this._sh.getColumnWidthInPixels(columnIndex);
   }

   public void setDefaultColumnWidth(int width) {
      this._sh.setDefaultColumnWidth(width);
   }

   public int getDefaultColumnWidth() {
      return this._sh.getDefaultColumnWidth();
   }

   public short getDefaultRowHeight() {
      return this._sh.getDefaultRowHeight();
   }

   public float getDefaultRowHeightInPoints() {
      return this._sh.getDefaultRowHeightInPoints();
   }

   public void setDefaultRowHeight(short height) {
      this._sh.setDefaultRowHeight(height);
   }

   public void setDefaultRowHeightInPoints(float height) {
      this._sh.setDefaultRowHeightInPoints(height);
   }

   public CellStyle getColumnStyle(int column) {
      return this._sh.getColumnStyle(column);
   }

   public int addMergedRegion(CellRangeAddress region) {
      return this._sh.addMergedRegion(region);
   }

   public int addMergedRegionUnsafe(CellRangeAddress region) {
      return this._sh.addMergedRegionUnsafe(region);
   }

   public void validateMergedRegions() {
      this._sh.validateMergedRegions();
   }

   public void setVerticallyCenter(boolean value) {
      this._sh.setVerticallyCenter(value);
   }

   public void setHorizontallyCenter(boolean value) {
      this._sh.setHorizontallyCenter(value);
   }

   public boolean getHorizontallyCenter() {
      return this._sh.getHorizontallyCenter();
   }

   public boolean getVerticallyCenter() {
      return this._sh.getVerticallyCenter();
   }

   public void removeMergedRegion(int index) {
      this._sh.removeMergedRegion(index);
   }

   public void removeMergedRegions(Collection indices) {
      this._sh.removeMergedRegions(indices);
   }

   public int getNumMergedRegions() {
      return this._sh.getNumMergedRegions();
   }

   public CellRangeAddress getMergedRegion(int index) {
      return this._sh.getMergedRegion(index);
   }

   public List getMergedRegions() {
      return this._sh.getMergedRegions();
   }

   public Iterator rowIterator() {
      Iterator result = this._rows.values().iterator();
      return result;
   }

   public void setAutobreaks(boolean value) {
      this._sh.setAutobreaks(value);
   }

   public void setDisplayGuts(boolean value) {
      this._sh.setDisplayGuts(value);
   }

   public void setDisplayZeros(boolean value) {
      this._sh.setDisplayZeros(value);
   }

   public boolean isDisplayZeros() {
      return this._sh.isDisplayZeros();
   }

   public void setRightToLeft(boolean value) {
      this._sh.setRightToLeft(value);
   }

   public boolean isRightToLeft() {
      return this._sh.isRightToLeft();
   }

   public void setFitToPage(boolean value) {
      this._sh.setFitToPage(value);
   }

   public void setRowSumsBelow(boolean value) {
      this._sh.setRowSumsBelow(value);
   }

   public void setRowSumsRight(boolean value) {
      this._sh.setRowSumsRight(value);
   }

   public boolean getAutobreaks() {
      return this._sh.getAutobreaks();
   }

   public boolean getDisplayGuts() {
      return this._sh.getDisplayGuts();
   }

   public boolean getFitToPage() {
      return this._sh.getFitToPage();
   }

   public boolean getRowSumsBelow() {
      return this._sh.getRowSumsBelow();
   }

   public boolean getRowSumsRight() {
      return this._sh.getRowSumsRight();
   }

   public boolean isPrintGridlines() {
      return this._sh.isPrintGridlines();
   }

   public void setPrintGridlines(boolean show) {
      this._sh.setPrintGridlines(show);
   }

   public boolean isPrintRowAndColumnHeadings() {
      return this._sh.isPrintRowAndColumnHeadings();
   }

   public void setPrintRowAndColumnHeadings(boolean show) {
      this._sh.setPrintRowAndColumnHeadings(show);
   }

   public PrintSetup getPrintSetup() {
      return this._sh.getPrintSetup();
   }

   public Header getHeader() {
      return this._sh.getHeader();
   }

   public Footer getFooter() {
      return this._sh.getFooter();
   }

   public void setSelected(boolean value) {
      this._sh.setSelected(value);
   }

   public double getMargin(short margin) {
      return this._sh.getMargin(margin);
   }

   public void setMargin(short margin, double size) {
      this._sh.setMargin(margin, size);
   }

   public boolean getProtect() {
      return this._sh.getProtect();
   }

   public void protectSheet(String password) {
      this._sh.protectSheet(password);
   }

   public boolean getScenarioProtect() {
      return this._sh.getScenarioProtect();
   }

   @Removal(
      version = "3.16"
   )
   public void setZoom(int numerator, int denominator) {
      this._sh.setZoom(numerator, denominator);
   }

   public void setZoom(int scale) {
      this._sh.setZoom(scale);
   }

   public short getTopRow() {
      return this._sh.getTopRow();
   }

   public short getLeftCol() {
      return this._sh.getLeftCol();
   }

   public void showInPane(int toprow, int leftcol) {
      this._sh.showInPane(toprow, leftcol);
   }

   public void setForceFormulaRecalculation(boolean value) {
      this._sh.setForceFormulaRecalculation(value);
   }

   public boolean getForceFormulaRecalculation() {
      return this._sh.getForceFormulaRecalculation();
   }

   @NotImplemented
   public void shiftRows(int startRow, int endRow, int n) {
      throw new RuntimeException("NotImplemented");
   }

   @NotImplemented
   public void shiftRows(int startRow, int endRow, int n, boolean copyRowHeight, boolean resetOriginalRowHeight) {
      throw new RuntimeException("NotImplemented");
   }

   public void createFreezePane(int colSplit, int rowSplit, int leftmostColumn, int topRow) {
      this._sh.createFreezePane(colSplit, rowSplit, leftmostColumn, topRow);
   }

   public void createFreezePane(int colSplit, int rowSplit) {
      this._sh.createFreezePane(colSplit, rowSplit);
   }

   public void createSplitPane(int xSplitPos, int ySplitPos, int leftmostColumn, int topRow, int activePane) {
      this._sh.createSplitPane(xSplitPos, ySplitPos, leftmostColumn, topRow, activePane);
   }

   public PaneInformation getPaneInformation() {
      return this._sh.getPaneInformation();
   }

   public void setDisplayGridlines(boolean show) {
      this._sh.setDisplayGridlines(show);
   }

   public boolean isDisplayGridlines() {
      return this._sh.isDisplayGridlines();
   }

   public void setDisplayFormulas(boolean show) {
      this._sh.setDisplayFormulas(show);
   }

   public boolean isDisplayFormulas() {
      return this._sh.isDisplayFormulas();
   }

   public void setDisplayRowColHeadings(boolean show) {
      this._sh.setDisplayRowColHeadings(show);
   }

   public boolean isDisplayRowColHeadings() {
      return this._sh.isDisplayRowColHeadings();
   }

   public void setRowBreak(int row) {
      this._sh.setRowBreak(row);
   }

   public boolean isRowBroken(int row) {
      return this._sh.isRowBroken(row);
   }

   public void removeRowBreak(int row) {
      this._sh.removeRowBreak(row);
   }

   public int[] getRowBreaks() {
      return this._sh.getRowBreaks();
   }

   public int[] getColumnBreaks() {
      return this._sh.getColumnBreaks();
   }

   public void setColumnBreak(int column) {
      this._sh.setColumnBreak(column);
   }

   public boolean isColumnBroken(int column) {
      return this._sh.isColumnBroken(column);
   }

   public void removeColumnBreak(int column) {
      this._sh.removeColumnBreak(column);
   }

   public void setColumnGroupCollapsed(int columnNumber, boolean collapsed) {
      this._sh.setColumnGroupCollapsed(columnNumber, collapsed);
   }

   public void groupColumn(int fromColumn, int toColumn) {
      this._sh.groupColumn(fromColumn, toColumn);
   }

   public void ungroupColumn(int fromColumn, int toColumn) {
      this._sh.ungroupColumn(fromColumn, toColumn);
   }

   public void groupRow(int fromRow, int toRow) {
      Iterator i$ = this._rows.subMap(Integer.valueOf(fromRow), Integer.valueOf(toRow + 1)).values().iterator();

      while(i$.hasNext()) {
         SXSSFRow row = (SXSSFRow)i$.next();
         int level = row.getOutlineLevel() + 1;
         row.setOutlineLevel(level);
         if(level > this.outlineLevelRow) {
            this.outlineLevelRow = level;
         }
      }

      this.setWorksheetOutlineLevelRow();
   }

   public void setRowOutlineLevel(int rownum, int level) {
      SXSSFRow row = (SXSSFRow)this._rows.get(Integer.valueOf(rownum));
      row.setOutlineLevel(level);
      if(level > 0 && level > this.outlineLevelRow) {
         this.outlineLevelRow = level;
         this.setWorksheetOutlineLevelRow();
      }

   }

   private void setWorksheetOutlineLevelRow() {
      CTWorksheet ct = this._sh.getCTWorksheet();
      CTSheetFormatPr pr = ct.isSetSheetFormatPr()?ct.getSheetFormatPr():ct.addNewSheetFormatPr();
      if(this.outlineLevelRow > 0) {
         pr.setOutlineLevelRow((short)this.outlineLevelRow);
      }

   }

   public void ungroupRow(int fromRow, int toRow) {
      this._sh.ungroupRow(fromRow, toRow);
   }

   public void setRowGroupCollapsed(int row, boolean collapse) {
      if(collapse) {
         this.collapseRow(row);
      } else {
         throw new RuntimeException("Unable to expand row: Not Implemented");
      }
   }

   private void collapseRow(int rowIndex) {
      SXSSFRow row = this.getRow(rowIndex);
      if(row == null) {
         throw new IllegalArgumentException("Invalid row number(" + rowIndex + "). Row does not exist.");
      } else {
         int startRow = this.findStartOfRowOutlineGroup(rowIndex);
         int lastRow = this.writeHidden(row, startRow, true);
         SXSSFRow lastRowObj = this.getRow(lastRow);
         if(lastRowObj != null) {
            lastRowObj.setCollapsed(Boolean.valueOf(true));
         } else {
            SXSSFRow newRow = this.createRow(lastRow);
            newRow.setCollapsed(Boolean.valueOf(true));
         }

      }
   }

   private int findStartOfRowOutlineGroup(int rowIndex) {
      SXSSFRow row = this.getRow(rowIndex);
      int level = ((SXSSFRow)row).getOutlineLevel();
      if(level == 0) {
         throw new IllegalArgumentException("Outline level is zero for the row (" + rowIndex + ").");
      } else {
         int currentRow;
         for(currentRow = rowIndex; this.getRow(currentRow) != null; --currentRow) {
            if(this.getRow(currentRow).getOutlineLevel() < level) {
               return currentRow + 1;
            }
         }

         return currentRow + 1;
      }
   }

   private int writeHidden(SXSSFRow xRow, int rowIndex, boolean hidden) {
      int level = xRow.getOutlineLevel();

      for(SXSSFRow currRow = this.getRow(rowIndex); currRow != null && currRow.getOutlineLevel() >= level; currRow = this.getRow(rowIndex)) {
         currRow.setHidden(Boolean.valueOf(hidden));
         ++rowIndex;
      }

      return rowIndex;
   }

   public void setDefaultColumnStyle(int column, CellStyle style) {
      this._sh.setDefaultColumnStyle(column, style);
   }

   public void trackColumnForAutoSizing(int column) {
      this._autoSizeColumnTracker.trackColumn(column);
   }

   public void trackColumnsForAutoSizing(Collection columns) {
      this._autoSizeColumnTracker.trackColumns(columns);
   }

   public void trackAllColumnsForAutoSizing() {
      this._autoSizeColumnTracker.trackAllColumns();
   }

   public boolean untrackColumnForAutoSizing(int column) {
      return this._autoSizeColumnTracker.untrackColumn(column);
   }

   public boolean untrackColumnsForAutoSizing(Collection columns) {
      return this._autoSizeColumnTracker.untrackColumns(columns);
   }

   public void untrackAllColumnsForAutoSizing() {
      this._autoSizeColumnTracker.untrackAllColumns();
   }

   public boolean isColumnTrackedForAutoSizing(int column) {
      return this._autoSizeColumnTracker.isColumnTracked(column);
   }

   public Set getTrackedColumnsForAutoSizing() {
      return this._autoSizeColumnTracker.getTrackedColumns();
   }

   public void autoSizeColumn(int column) {
      this.autoSizeColumn(column, false);
   }

   public void autoSizeColumn(int column, boolean useMergedCells) {
      int flushedWidth;
      try {
         flushedWidth = this._autoSizeColumnTracker.getBestFitColumnWidth(column, useMergedCells);
      } catch (IllegalStateException var8) {
         throw new IllegalStateException("Could not auto-size column. Make sure the column was tracked prior to auto-sizing the column.", var8);
      }

      int activeWidth = (int)(256.0D * SheetUtil.getColumnWidth(this, column, useMergedCells));
      int bestFitWidth = Math.max(flushedWidth, activeWidth);
      if(bestFitWidth > 0) {
         char maxColumnWidth = '\uff00';
         int width = Math.min(bestFitWidth, '\uff00');
         this.setColumnWidth(column, width);
      }

   }

   public XSSFComment getCellComment(int row, int column) {
      return this.getCellComment(new CellAddress(row, column));
   }

   public XSSFComment getCellComment(CellAddress ref) {
      return this._sh.getCellComment(ref);
   }

   public Map getCellComments() {
      return this._sh.getCellComments();
   }

   public XSSFHyperlink getHyperlink(int row, int column) {
      return this._sh.getHyperlink(row, column);
   }

   public XSSFHyperlink getHyperlink(CellAddress addr) {
      return this._sh.getHyperlink(addr);
   }

   public List getHyperlinkList() {
      return this._sh.getHyperlinkList();
   }

   public Drawing getDrawingPatriarch() {
      return this._sh.getDrawingPatriarch();
   }

   public Drawing createDrawingPatriarch() {
      return this._sh.createDrawingPatriarch();
   }

   public SXSSFWorkbook getWorkbook() {
      return this._workbook;
   }

   public String getSheetName() {
      return this._sh.getSheetName();
   }

   public boolean isSelected() {
      return this._sh.isSelected();
   }

   public CellRange setArrayFormula(String formula, CellRangeAddress range) {
      return this._sh.setArrayFormula(formula, range);
   }

   public CellRange removeArrayFormula(Cell cell) {
      return this._sh.removeArrayFormula(cell);
   }

   public DataValidationHelper getDataValidationHelper() {
      return this._sh.getDataValidationHelper();
   }

   public List getDataValidations() {
      return this._sh.getDataValidations();
   }

   public void addValidationData(DataValidation dataValidation) {
      this._sh.addValidationData(dataValidation);
   }

   public AutoFilter setAutoFilter(CellRangeAddress range) {
      return this._sh.setAutoFilter(range);
   }

   public SheetConditionalFormatting getSheetConditionalFormatting() {
      return this._sh.getSheetConditionalFormatting();
   }

   public CellRangeAddress getRepeatingRows() {
      return this._sh.getRepeatingRows();
   }

   public CellRangeAddress getRepeatingColumns() {
      return this._sh.getRepeatingColumns();
   }

   public void setRepeatingRows(CellRangeAddress rowRangeRef) {
      this._sh.setRepeatingRows(rowRangeRef);
   }

   public void setRepeatingColumns(CellRangeAddress columnRangeRef) {
      this._sh.setRepeatingColumns(columnRangeRef);
   }

   public void setRandomAccessWindowSize(int value) {
      if(value != 0 && value >= -1) {
         this._randomAccessWindowSize = value;
      } else {
         throw new IllegalArgumentException("RandomAccessWindowSize must be either -1 or a positive integer");
      }
   }

   public boolean areAllRowsFlushed() {
      return this.allFlushed;
   }

   public int getLastFlushedRowNum() {
      return this.lastFlushedRowNumber;
   }

   public void flushRows(int remaining) throws IOException {
      while(this._rows.size() > remaining) {
         this.flushOneRow();
      }

      if(remaining == 0) {
         this.allFlushed = true;
      }

   }

   public void flushRows() throws IOException {
      this.flushRows(0);
   }

   private void flushOneRow() throws IOException {
      Integer firstRowNum = (Integer)this._rows.firstKey();
      if(firstRowNum != null) {
         int rowIndex = firstRowNum.intValue();
         SXSSFRow row = (SXSSFRow)this._rows.get(firstRowNum);
         this._autoSizeColumnTracker.updateColumnWidths(row);
         this._writer.writeRow(rowIndex, row);
         this._rows.remove(firstRowNum);
         this.lastFlushedRowNumber = rowIndex;
      }

   }

   public void changeRowNum(SXSSFRow row, int newRowNum) {
      this.removeRow(row);
      this._rows.put(Integer.valueOf(newRowNum), row);
   }

   public int getRowNum(SXSSFRow row) {
      Iterator iter = this._rows.entrySet().iterator();

      Entry entry;
      do {
         if(!iter.hasNext()) {
            return -1;
         }

         entry = (Entry)iter.next();
      } while(entry.getValue() != row);

      return ((Integer)entry.getKey()).intValue();
   }

   boolean dispose() throws IOException {
      if(!this.allFlushed) {
         this.flushRows();
      }

      return this._writer.dispose();
   }

   public int getColumnOutlineLevel(int columnIndex) {
      return this._sh.getColumnOutlineLevel(columnIndex);
   }

   public CellAddress getActiveCell() {
      return this._sh.getActiveCell();
   }

   public void setActiveCell(CellAddress address) {
      this._sh.setActiveCell(address);
   }

   public XSSFColor getTabColor() {
      return this._sh.getTabColor();
   }

   public void setTabColor(XSSFColor color) {
      this._sh.setTabColor(color);
   }
}
