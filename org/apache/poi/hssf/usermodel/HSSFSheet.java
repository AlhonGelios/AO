package org.apache.poi.hssf.usermodel;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.hssf.model.DrawingManager2;
import org.apache.poi.hssf.model.HSSFFormulaParser;
import org.apache.poi.hssf.model.InternalSheet;
import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.record.AutoFilterInfoRecord;
import org.apache.poi.hssf.record.CellValueRecordInterface;
import org.apache.poi.hssf.record.DVRecord;
import org.apache.poi.hssf.record.DrawingRecord;
import org.apache.poi.hssf.record.EscherAggregate;
import org.apache.poi.hssf.record.ExtendedFormatRecord;
import org.apache.poi.hssf.record.HyperlinkRecord;
import org.apache.poi.hssf.record.NameRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.RecordBase;
import org.apache.poi.hssf.record.RowRecord;
import org.apache.poi.hssf.record.SCLRecord;
import org.apache.poi.hssf.record.WSBoolRecord;
import org.apache.poi.hssf.record.aggregates.DataValidityTable;
import org.apache.poi.hssf.record.aggregates.FormulaRecordAggregate;
import org.apache.poi.hssf.record.aggregates.RecordAggregate;
import org.apache.poi.hssf.record.aggregates.WorksheetProtectionBlock;
import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFAutoFilter;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.hssf.usermodel.HSSFDataValidationHelper;
import org.apache.poi.hssf.usermodel.HSSFEvaluationWorkbook;
import org.apache.poi.hssf.usermodel.HSSFFooter;
import org.apache.poi.hssf.usermodel.HSSFHeader;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.usermodel.HSSFName;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFPrintSetup;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFShapeContainer;
import org.apache.poi.hssf.usermodel.HSSFShapeGroup;
import org.apache.poi.hssf.usermodel.HSSFSheetConditionalFormatting;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.helpers.HSSFRowShifter;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.FormulaShifter;
import org.apache.poi.ss.formula.FormulaType;
import org.apache.poi.ss.formula.ptg.Area3DPtg;
import org.apache.poi.ss.formula.ptg.MemFuncPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.UnionPtg;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellRange;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.ss.util.PaneInformation;
import org.apache.poi.ss.util.SSCellRange;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.util.Configurator;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public final class HSSFSheet implements Sheet {

   private static final POILogger log = POILogFactory.getLogger(HSSFSheet.class);
   private static final int DEBUG = 1;
   private static final float PX_DEFAULT = 32.0F;
   private static final float PX_MODIFIED = 36.56F;
   public static final int INITIAL_CAPACITY = Configurator.getIntValue("HSSFSheet.RowInitialCapacity", 20);
   private final InternalSheet _sheet;
   private final TreeMap _rows;
   protected final InternalWorkbook _book;
   protected final HSSFWorkbook _workbook;
   private HSSFPatriarch _patriarch;
   private int _firstrow;
   private int _lastrow;


   protected HSSFSheet(HSSFWorkbook workbook) {
      this._sheet = InternalSheet.createSheet();
      this._rows = new TreeMap();
      this._workbook = workbook;
      this._book = workbook.getWorkbook();
   }

   protected HSSFSheet(HSSFWorkbook workbook, InternalSheet sheet) {
      this._sheet = sheet;
      this._rows = new TreeMap();
      this._workbook = workbook;
      this._book = workbook.getWorkbook();
      this.setPropertiesFromSheet(sheet);
   }

   HSSFSheet cloneSheet(HSSFWorkbook workbook) {
      this.getDrawingPatriarch();
      HSSFSheet sheet = new HSSFSheet(workbook, this._sheet.cloneSheet());
      int pos = sheet._sheet.findFirstRecordLocBySid((short)236);
      DrawingRecord dr = (DrawingRecord)sheet._sheet.findFirstRecordBySid((short)236);
      if(null != dr) {
         sheet._sheet.getRecords().remove(dr);
      }

      if(this.getDrawingPatriarch() != null) {
         HSSFPatriarch patr = HSSFPatriarch.createPatriarch(this.getDrawingPatriarch(), sheet);
         sheet._sheet.getRecords().add(pos, patr.getBoundAggregate());
         sheet._patriarch = patr;
      }

      return sheet;
   }

   protected void preSerialize() {
      if(this._patriarch != null) {
         this._patriarch.preSerialize();
      }

   }

   public HSSFWorkbook getWorkbook() {
      return this._workbook;
   }

   private void setPropertiesFromSheet(InternalSheet sheet) {
      for(RowRecord row = sheet.getNextRow(); row != null; row = sheet.getNextRow()) {
         this.createRowFromRecord(row);
      }

      Iterator iter = sheet.getCellValueIterator();
      long timestart = System.currentTimeMillis();
      if(log.check(1)) {
         log.log(1, new Object[]{"Time at start of cell creating in HSSF sheet = ", Long.valueOf(timestart)});
      }

      HSSFRow lastrow = null;

      while(iter.hasNext()) {
         CellValueRecordInterface cval = (CellValueRecordInterface)iter.next();
         long cellstart = System.currentTimeMillis();
         HSSFRow hrow = lastrow;
         if(lastrow == null || lastrow.getRowNum() != cval.getRow()) {
            hrow = this.getRow(cval.getRow());
            lastrow = hrow;
            if(hrow == null) {
               RowRecord rowRec = new RowRecord(cval.getRow());
               sheet.addRow(rowRec);
               hrow = this.createRowFromRecord(rowRec);
            }
         }

         if(log.check(1)) {
            if(cval instanceof Record) {
               log.log(1, new Object[]{"record id = " + Integer.toHexString(((Record)cval).getSid())});
            } else {
               log.log(1, new Object[]{"record = " + cval});
            }
         }

         hrow.createCellFromRecord(cval);
         if(log.check(1)) {
            log.log(1, new Object[]{"record took ", Long.valueOf(System.currentTimeMillis() - cellstart)});
         }
      }

      if(log.check(1)) {
         log.log(1, new Object[]{"total sheet cell creation took ", Long.valueOf(System.currentTimeMillis() - timestart)});
      }

   }

   public HSSFRow createRow(int rownum) {
      HSSFRow row = new HSSFRow(this._workbook, this, rownum);
      row.setHeight(this.getDefaultRowHeight());
      row.getRowRecord().setBadFontHeight(false);
      this.addRow(row, true);
      return row;
   }

   private HSSFRow createRowFromRecord(RowRecord row) {
      HSSFRow hrow = new HSSFRow(this._workbook, this, row);
      this.addRow(hrow, false);
      return hrow;
   }

   public void removeRow(Row row) {
      HSSFRow hrow = (HSSFRow)row;
      if(row.getSheet() != this) {
         throw new IllegalArgumentException("Specified row does not belong to this sheet");
      } else {
         Iterator key = row.iterator();

         while(key.hasNext()) {
            Cell removedRow = (Cell)key.next();
            HSSFCell xcell = (HSSFCell)removedRow;
            if(xcell.isPartOfArrayFormulaGroup()) {
               String msg = "Row[rownum=" + row.getRowNum() + "] contains cell(s) included in a multi-cell array formula. You cannot change part of an array.";
               xcell.notifyArrayFormulaChanging(msg);
            }
         }

         if(this._rows.size() > 0) {
            Integer key1 = Integer.valueOf(row.getRowNum());
            HSSFRow removedRow1 = (HSSFRow)this._rows.remove(key1);
            if(removedRow1 != row) {
               throw new IllegalArgumentException("Specified row does not belong to this sheet");
            }

            if(hrow.getRowNum() == this.getLastRowNum()) {
               this._lastrow = this.findLastRow(this._lastrow);
            }

            if(hrow.getRowNum() == this.getFirstRowNum()) {
               this._firstrow = this.findFirstRow(this._firstrow);
            }

            this._sheet.removeRow(hrow.getRowRecord());
         }

      }
   }

   private int findLastRow(int lastrow) {
      if(lastrow < 1) {
         return 0;
      } else {
         int rownum = lastrow - 1;

         HSSFRow r;
         for(r = this.getRow(rownum); r == null && rownum > 0; r = this.getRow(rownum)) {
            --rownum;
         }

         return r == null?0:rownum;
      }
   }

   private int findFirstRow(int firstrow) {
      int rownum = firstrow + 1;

      for(HSSFRow r = this.getRow(rownum); r == null && rownum <= this.getLastRowNum(); r = this.getRow(rownum)) {
         ++rownum;
      }

      return rownum > this.getLastRowNum()?0:rownum;
   }

   private void addRow(HSSFRow row, boolean addLow) {
      this._rows.put(Integer.valueOf(row.getRowNum()), row);
      if(addLow) {
         this._sheet.addRow(row.getRowRecord());
      }

      boolean firstRow = this._rows.size() == 1;
      if(row.getRowNum() > this.getLastRowNum() || firstRow) {
         this._lastrow = row.getRowNum();
      }

      if(row.getRowNum() < this.getFirstRowNum() || firstRow) {
         this._firstrow = row.getRowNum();
      }

   }

   public HSSFRow getRow(int rowIndex) {
      return (HSSFRow)this._rows.get(Integer.valueOf(rowIndex));
   }

   public int getPhysicalNumberOfRows() {
      return this._rows.size();
   }

   public int getFirstRowNum() {
      return this._firstrow;
   }

   public int getLastRowNum() {
      return this._lastrow;
   }

   public List getDataValidations() {
      DataValidityTable dvt = this._sheet.getOrCreateDataValidityTable();
      final ArrayList hssfValidations = new ArrayList();
      RecordAggregate.RecordVisitor visitor = new RecordAggregate.RecordVisitor() {

         private HSSFEvaluationWorkbook book = HSSFEvaluationWorkbook.create(HSSFSheet.this.getWorkbook());

         public void visitRecord(Record r) {
            if(r instanceof DVRecord) {
               DVRecord dvRecord = (DVRecord)r;
               CellRangeAddressList regions = dvRecord.getCellRangeAddress().copy();
               DVConstraint constraint = DVConstraint.createDVConstraint(dvRecord, this.book);
               HSSFDataValidation hssfDataValidation = new HSSFDataValidation(regions, constraint);
               hssfDataValidation.setErrorStyle(dvRecord.getErrorStyle());
               hssfDataValidation.setEmptyCellAllowed(dvRecord.getEmptyCellAllowed());
               hssfDataValidation.setSuppressDropDownArrow(dvRecord.getSuppressDropdownArrow());
               hssfDataValidation.createPromptBox(dvRecord.getPromptTitle(), dvRecord.getPromptText());
               hssfDataValidation.setShowPromptBox(dvRecord.getShowPromptOnCellSelected());
               hssfDataValidation.createErrorBox(dvRecord.getErrorTitle(), dvRecord.getErrorText());
               hssfDataValidation.setShowErrorBox(dvRecord.getShowErrorOnInvalidValue());
               hssfValidations.add(hssfDataValidation);
            }
         }
      };
      dvt.visitContainedRecords(visitor);
      return hssfValidations;
   }

   public void addValidationData(DataValidation dataValidation) {
      if(dataValidation == null) {
         throw new IllegalArgumentException("objValidation must not be null");
      } else {
         HSSFDataValidation hssfDataValidation = (HSSFDataValidation)dataValidation;
         DataValidityTable dvt = this._sheet.getOrCreateDataValidityTable();
         DVRecord dvRecord = hssfDataValidation.createDVRecord(this);
         dvt.addDataValidation(dvRecord);
      }
   }

   public void setColumnHidden(int columnIndex, boolean hidden) {
      this._sheet.setColumnHidden(columnIndex, hidden);
   }

   public boolean isColumnHidden(int columnIndex) {
      return this._sheet.isColumnHidden(columnIndex);
   }

   public void setColumnWidth(int columnIndex, int width) {
      this._sheet.setColumnWidth(columnIndex, width);
   }

   public int getColumnWidth(int columnIndex) {
      return this._sheet.getColumnWidth(columnIndex);
   }

   public float getColumnWidthInPixels(int column) {
      int cw = this.getColumnWidth(column);
      int def = this.getDefaultColumnWidth() * 256;
      float px = cw == def?32.0F:36.56F;
      return (float)cw / px;
   }

   public int getDefaultColumnWidth() {
      return this._sheet.getDefaultColumnWidth();
   }

   public void setDefaultColumnWidth(int width) {
      this._sheet.setDefaultColumnWidth(width);
   }

   public short getDefaultRowHeight() {
      return this._sheet.getDefaultRowHeight();
   }

   public float getDefaultRowHeightInPoints() {
      return (float)this._sheet.getDefaultRowHeight() / 20.0F;
   }

   public void setDefaultRowHeight(short height) {
      this._sheet.setDefaultRowHeight(height);
   }

   public void setDefaultRowHeightInPoints(float height) {
      this._sheet.setDefaultRowHeight((short)((int)(height * 20.0F)));
   }

   public HSSFCellStyle getColumnStyle(int column) {
      short styleIndex = this._sheet.getXFIndexForColAt((short)column);
      if(styleIndex == 15) {
         return null;
      } else {
         ExtendedFormatRecord xf = this._book.getExFormatAt(styleIndex);
         return new HSSFCellStyle(styleIndex, xf, this._book);
      }
   }

   public boolean isGridsPrinted() {
      return this._sheet.isGridsPrinted();
   }

   public void setGridsPrinted(boolean value) {
      this._sheet.setGridsPrinted(value);
   }

   public int addMergedRegion(CellRangeAddress region) {
      return this.addMergedRegion(region, true);
   }

   public int addMergedRegionUnsafe(CellRangeAddress region) {
      return this.addMergedRegion(region, false);
   }

   public void validateMergedRegions() {
      this.checkForMergedRegionsIntersectingArrayFormulas();
      this.checkForIntersectingMergedRegions();
   }

   private int addMergedRegion(CellRangeAddress region, boolean validate) {
      if(region.getNumberOfCells() < 2) {
         throw new IllegalArgumentException("Merged region " + region.formatAsString() + " must contain 2 or more cells");
      } else {
         region.validate(SpreadsheetVersion.EXCEL97);
         if(validate) {
            this.validateArrayFormulas(region);
            this.validateMergedRegions(region);
         }

         return this._sheet.addMergedRegion(region.getFirstRow(), region.getFirstColumn(), region.getLastRow(), region.getLastColumn());
      }
   }

   private void validateArrayFormulas(CellRangeAddress region) {
      int firstRow = region.getFirstRow();
      int firstColumn = region.getFirstColumn();
      int lastRow = region.getLastRow();
      int lastColumn = region.getLastColumn();

      for(int rowIn = firstRow; rowIn <= lastRow; ++rowIn) {
         HSSFRow row = this.getRow(rowIn);
         if(row != null) {
            for(int colIn = firstColumn; colIn <= lastColumn; ++colIn) {
               HSSFCell cell = row.getCell(colIn);
               if(cell != null && cell.isPartOfArrayFormulaGroup()) {
                  CellRangeAddress arrayRange = cell.getArrayFormulaRange();
                  if(arrayRange.getNumberOfCells() > 1 && region.intersects(arrayRange)) {
                     String msg = "The range " + region.formatAsString() + " intersects with a multi-cell array formula. " + "You cannot merge cells of an array.";
                     throw new IllegalStateException(msg);
                  }
               }
            }
         }
      }

   }

   private void checkForMergedRegionsIntersectingArrayFormulas() {
      Iterator i$ = this.getMergedRegions().iterator();

      while(i$.hasNext()) {
         CellRangeAddress region = (CellRangeAddress)i$.next();
         this.validateArrayFormulas(region);
      }

   }

   private void validateMergedRegions(CellRangeAddress candidateRegion) {
      Iterator i$ = this.getMergedRegions().iterator();

      CellRangeAddress existingRegion;
      do {
         if(!i$.hasNext()) {
            return;
         }

         existingRegion = (CellRangeAddress)i$.next();
      } while(!existingRegion.intersects(candidateRegion));

      throw new IllegalStateException("Cannot add merged region " + candidateRegion.formatAsString() + " to sheet because it overlaps with an existing merged region (" + existingRegion.formatAsString() + ").");
   }

   private void checkForIntersectingMergedRegions() {
      List regions = this.getMergedRegions();
      int size = regions.size();
      int i = 0;

      label21:
      while(i < size) {
         CellRangeAddress region = (CellRangeAddress)regions.get(i);
         Iterator i$ = regions.subList(i + 1, regions.size()).iterator();

         CellRangeAddress other;
         do {
            if(!i$.hasNext()) {
               ++i;
               continue label21;
            }

            other = (CellRangeAddress)i$.next();
         } while(!region.intersects(other));

         String msg = "The range " + region.formatAsString() + " intersects with another merged region " + other.formatAsString() + " in this sheet";
         throw new IllegalStateException(msg);
      }

   }

   public void setForceFormulaRecalculation(boolean value) {
      this._sheet.setUncalced(value);
   }

   public boolean getForceFormulaRecalculation() {
      return this._sheet.getUncalced();
   }

   public void setVerticallyCenter(boolean value) {
      this._sheet.getPageSettings().getVCenter().setVCenter(value);
   }

   public boolean getVerticallyCenter() {
      return this._sheet.getPageSettings().getVCenter().getVCenter();
   }

   public void setHorizontallyCenter(boolean value) {
      this._sheet.getPageSettings().getHCenter().setHCenter(value);
   }

   public boolean getHorizontallyCenter() {
      return this._sheet.getPageSettings().getHCenter().getHCenter();
   }

   public void setRightToLeft(boolean value) {
      this._sheet.getWindowTwo().setArabic(value);
   }

   public boolean isRightToLeft() {
      return this._sheet.getWindowTwo().getArabic();
   }

   public void removeMergedRegion(int index) {
      this._sheet.removeMergedRegion(index);
   }

   public void removeMergedRegions(Collection indices) {
      Iterator i$ = (new TreeSet(indices)).descendingSet().iterator();

      while(i$.hasNext()) {
         int i = ((Integer)i$.next()).intValue();
         this._sheet.removeMergedRegion(i);
      }

   }

   public int getNumMergedRegions() {
      return this._sheet.getNumMergedRegions();
   }

   public CellRangeAddress getMergedRegion(int index) {
      return this._sheet.getMergedRegionAt(index);
   }

   public List getMergedRegions() {
      ArrayList addresses = new ArrayList();
      int count = this._sheet.getNumMergedRegions();

      for(int i = 0; i < count; ++i) {
         addresses.add(this._sheet.getMergedRegionAt(i));
      }

      return addresses;
   }

   public Iterator rowIterator() {
      Iterator result = this._rows.values().iterator();
      return result;
   }

   public Iterator iterator() {
      return this.rowIterator();
   }

   InternalSheet getSheet() {
      return this._sheet;
   }

   public void setAlternativeExpression(boolean b) {
      WSBoolRecord record = (WSBoolRecord)this._sheet.findFirstRecordBySid((short)129);
      record.setAlternateExpression(b);
   }

   public void setAlternativeFormula(boolean b) {
      WSBoolRecord record = (WSBoolRecord)this._sheet.findFirstRecordBySid((short)129);
      record.setAlternateFormula(b);
   }

   public void setAutobreaks(boolean b) {
      WSBoolRecord record = (WSBoolRecord)this._sheet.findFirstRecordBySid((short)129);
      record.setAutobreaks(b);
   }

   public void setDialog(boolean b) {
      WSBoolRecord record = (WSBoolRecord)this._sheet.findFirstRecordBySid((short)129);
      record.setDialog(b);
   }

   public void setDisplayGuts(boolean b) {
      WSBoolRecord record = (WSBoolRecord)this._sheet.findFirstRecordBySid((short)129);
      record.setDisplayGuts(b);
   }

   public void setFitToPage(boolean b) {
      WSBoolRecord record = (WSBoolRecord)this._sheet.findFirstRecordBySid((short)129);
      record.setFitToPage(b);
   }

   public void setRowSumsBelow(boolean b) {
      WSBoolRecord record = (WSBoolRecord)this._sheet.findFirstRecordBySid((short)129);
      record.setRowSumsBelow(b);
      record.setAlternateExpression(b);
   }

   public void setRowSumsRight(boolean b) {
      WSBoolRecord record = (WSBoolRecord)this._sheet.findFirstRecordBySid((short)129);
      record.setRowSumsRight(b);
   }

   public boolean getAlternateExpression() {
      return ((WSBoolRecord)this._sheet.findFirstRecordBySid((short)129)).getAlternateExpression();
   }

   public boolean getAlternateFormula() {
      return ((WSBoolRecord)this._sheet.findFirstRecordBySid((short)129)).getAlternateFormula();
   }

   public boolean getAutobreaks() {
      return ((WSBoolRecord)this._sheet.findFirstRecordBySid((short)129)).getAutobreaks();
   }

   public boolean getDialog() {
      return ((WSBoolRecord)this._sheet.findFirstRecordBySid((short)129)).getDialog();
   }

   public boolean getDisplayGuts() {
      return ((WSBoolRecord)this._sheet.findFirstRecordBySid((short)129)).getDisplayGuts();
   }

   public boolean isDisplayZeros() {
      return this._sheet.getWindowTwo().getDisplayZeros();
   }

   public void setDisplayZeros(boolean value) {
      this._sheet.getWindowTwo().setDisplayZeros(value);
   }

   public boolean getFitToPage() {
      return ((WSBoolRecord)this._sheet.findFirstRecordBySid((short)129)).getFitToPage();
   }

   public boolean getRowSumsBelow() {
      return ((WSBoolRecord)this._sheet.findFirstRecordBySid((short)129)).getRowSumsBelow();
   }

   public boolean getRowSumsRight() {
      return ((WSBoolRecord)this._sheet.findFirstRecordBySid((short)129)).getRowSumsRight();
   }

   public boolean isPrintGridlines() {
      return this.getSheet().getPrintGridlines().getPrintGridlines();
   }

   public void setPrintGridlines(boolean show) {
      this.getSheet().getPrintGridlines().setPrintGridlines(show);
   }

   public boolean isPrintRowAndColumnHeadings() {
      return this.getSheet().getPrintHeaders().getPrintHeaders();
   }

   public void setPrintRowAndColumnHeadings(boolean show) {
      this.getSheet().getPrintHeaders().setPrintHeaders(show);
   }

   public HSSFPrintSetup getPrintSetup() {
      return new HSSFPrintSetup(this._sheet.getPageSettings().getPrintSetup());
   }

   public HSSFHeader getHeader() {
      return new HSSFHeader(this._sheet.getPageSettings());
   }

   public HSSFFooter getFooter() {
      return new HSSFFooter(this._sheet.getPageSettings());
   }

   public boolean isSelected() {
      return this.getSheet().getWindowTwo().getSelected();
   }

   public void setSelected(boolean sel) {
      this.getSheet().getWindowTwo().setSelected(sel);
   }

   public boolean isActive() {
      return this.getSheet().getWindowTwo().isActive();
   }

   public void setActive(boolean sel) {
      this.getSheet().getWindowTwo().setActive(sel);
   }

   public double getMargin(short margin) {
      switch(margin) {
      case 4:
         return this._sheet.getPageSettings().getPrintSetup().getHeaderMargin();
      case 5:
         return this._sheet.getPageSettings().getPrintSetup().getFooterMargin();
      default:
         return this._sheet.getPageSettings().getMargin(margin);
      }
   }

   public void setMargin(short margin, double size) {
      switch(margin) {
      case 4:
         this._sheet.getPageSettings().getPrintSetup().setHeaderMargin(size);
         break;
      case 5:
         this._sheet.getPageSettings().getPrintSetup().setFooterMargin(size);
         break;
      default:
         this._sheet.getPageSettings().setMargin(margin, size);
      }

   }

   private WorksheetProtectionBlock getProtectionBlock() {
      return this._sheet.getProtectionBlock();
   }

   public boolean getProtect() {
      return this.getProtectionBlock().isSheetProtected();
   }

   public short getPassword() {
      return (short)this.getProtectionBlock().getPasswordHash();
   }

   public boolean getObjectProtect() {
      return this.getProtectionBlock().isObjectProtected();
   }

   public boolean getScenarioProtect() {
      return this.getProtectionBlock().isScenarioProtected();
   }

   public void protectSheet(String password) {
      this.getProtectionBlock().protectSheet(password, true, true);
   }

   public void setZoom(int numerator, int denominator) {
      if(numerator >= 1 && numerator <= '\uffff') {
         if(denominator >= 1 && denominator <= '\uffff') {
            SCLRecord sclRecord = new SCLRecord();
            sclRecord.setNumerator((short)numerator);
            sclRecord.setDenominator((short)denominator);
            this.getSheet().setSCLRecord(sclRecord);
         } else {
            throw new IllegalArgumentException("Denominator must be greater than 0 and less than 65536");
         }
      } else {
         throw new IllegalArgumentException("Numerator must be greater than 0 and less than 65536");
      }
   }

   public void setZoom(int scale) {
      this.setZoom(scale, 100);
   }

   public short getTopRow() {
      return this._sheet.getTopRow();
   }

   public short getLeftCol() {
      return this._sheet.getLeftCol();
   }

   public void showInPane(int toprow, int leftcol) {
      int maxrow = SpreadsheetVersion.EXCEL97.getLastRowIndex();
      if(toprow > maxrow) {
         throw new IllegalArgumentException("Maximum row number is " + maxrow);
      } else {
         this.showInPane((short)toprow, (short)leftcol);
      }
   }

   private void showInPane(short toprow, short leftcol) {
      this._sheet.setTopRow(toprow);
      this._sheet.setLeftCol(leftcol);
   }

   protected void shiftMerged(int startRow, int endRow, int n, boolean isRow) {
      HSSFRowShifter rowShifter = new HSSFRowShifter(this);
      rowShifter.shiftMergedRegions(startRow, endRow, n);
   }

   public void shiftRows(int startRow, int endRow, int n) {
      this.shiftRows(startRow, endRow, n, false, false);
   }

   public void shiftRows(int startRow, int endRow, int n, boolean copyRowHeight, boolean resetOriginalRowHeight) {
      this.shiftRows(startRow, endRow, n, copyRowHeight, resetOriginalRowHeight, true);
   }

   private static int clip(int row) {
      return Math.min(Math.max(0, row), SpreadsheetVersion.EXCEL97.getLastRowIndex());
   }

   public void shiftRows(int startRow, int endRow, int n, boolean copyRowHeight, boolean resetOriginalRowHeight, boolean moveComments) {
      if(endRow < startRow) {
         throw new IllegalArgumentException("startRow must be less than or equal to endRow. To shift rows up, use n<0.");
      } else {
         int s;
         byte inc;
         if(n < 0) {
            s = startRow;
            inc = 1;
         } else {
            if(n <= 0) {
               return;
            }

            s = endRow;
            inc = -1;
         }

         HSSFRowShifter rowShifter = new HSSFRowShifter(this);
         int externSheetIndex;
         if(moveComments) {
            HSSFPatriarch firstOverwrittenRow = this.createDrawingPatriarch();
            Iterator lastOverwrittenRow = firstOverwrittenRow.getChildren().iterator();

            while(lastOverwrittenRow.hasNext()) {
               HSSFShape sheetIndex = (HSSFShape)lastOverwrittenRow.next();
               if(sheetIndex instanceof HSSFComment) {
                  HSSFComment sheetName = (HSSFComment)sheetIndex;
                  externSheetIndex = sheetName.getRow();
                  if(startRow <= externSheetIndex && externSheetIndex <= endRow) {
                     sheetName.setRow(clip(externSheetIndex + n));
                  }
               }
            }
         }

         rowShifter.shiftMergedRegions(startRow, endRow, n);
         this._sheet.getPageSettings().shiftRowBreaks(startRow, endRow, n);
         int var20 = startRow + n;
         int var21 = endRow + n;
         Iterator var22 = this.getHyperlinkList().iterator();

         while(var22.hasNext()) {
            HSSFHyperlink var24 = (HSSFHyperlink)var22.next();
            externSheetIndex = var24.getFirstRow();
            int shifter = var24.getLastRow();
            if(var20 <= externSheetIndex && externSheetIndex <= var21 && var21 <= shifter && shifter <= var21) {
               this.removeHyperlink(var24);
            }
         }

         int var23;
         for(var23 = s; var23 >= startRow && var23 <= endRow && var23 >= 0 && var23 < 65536; var23 += inc) {
            HSSFRow var25 = this.getRow(var23);
            if(var25 != null) {
               this.notifyRowShifting(var25);
            }

            HSSFRow var27 = this.getRow(var23 + n);
            if(var27 == null) {
               var27 = this.createRow(var23 + n);
            }

            var27.removeAllCells();
            if(var25 != null) {
               if(copyRowHeight) {
                  var27.setHeight(var25.getHeight());
               }

               if(resetOriginalRowHeight) {
                  var25.setHeight((short)255);
               }

               Iterator var28 = var25.cellIterator();

               while(var28.hasNext()) {
                  HSSFCell nSheets = (HSSFCell)var28.next();
                  HSSFHyperlink i = nSheets.getHyperlink();
                  var25.removeCell(nSheets);
                  CellValueRecordInterface otherSheet = nSheets.getCellValueRecord();
                  otherSheet.setRow(var23 + n);
                  var27.createCellFromRecord(otherSheet);
                  this._sheet.addValueRecord(var23 + n, otherSheet);
                  if(i != null) {
                     i.setFirstRow(i.getFirstRow() + n);
                     i.setLastRow(i.getLastRow() + n);
                  }
               }

               var25.removeAllCells();
            }
         }

         if(n > 0) {
            if(startRow == this._firstrow) {
               this._firstrow = Math.max(startRow + n, 0);

               for(var23 = startRow + 1; var23 < startRow + n; ++var23) {
                  if(this.getRow(var23) != null) {
                     this._firstrow = var23;
                     break;
                  }
               }
            }

            if(endRow + n > this._lastrow) {
               this._lastrow = Math.min(endRow + n, SpreadsheetVersion.EXCEL97.getLastRowIndex());
            }
         } else {
            if(startRow + n < this._firstrow) {
               this._firstrow = Math.max(startRow + n, 0);
            }

            if(endRow == this._lastrow) {
               this._lastrow = Math.min(endRow + n, SpreadsheetVersion.EXCEL97.getLastRowIndex());

               for(var23 = endRow - 1; var23 > endRow + n; ++var23) {
                  if(this.getRow(var23) != null) {
                     this._lastrow = var23;
                     break;
                  }
               }
            }
         }

         var23 = this._workbook.getSheetIndex((Sheet)this);
         String var26 = this._workbook.getSheetName(var23);
         short var29 = this._book.checkExternSheet(var23);
         FormulaShifter var30 = FormulaShifter.createForRowShift(var29, var26, startRow, endRow, n, SpreadsheetVersion.EXCEL97);
         this._sheet.updateFormulasAfterCellShift(var30, var29);
         int var31 = this._workbook.getNumberOfSheets();

         for(int var32 = 0; var32 < var31; ++var32) {
            InternalSheet var33 = this._workbook.getSheetAt(var32).getSheet();
            if(var33 != this._sheet) {
               short otherExtSheetIx = this._book.checkExternSheet(var32);
               var33.updateFormulasAfterCellShift(var30, otherExtSheetIx);
            }
         }

         this._workbook.getWorkbook().updateNamesAfterCellShift(var30);
      }
   }

   protected void insertChartRecords(List records) {
      int window2Loc = this._sheet.findFirstRecordLocBySid((short)574);
      this._sheet.getRecords().addAll(window2Loc, records);
   }

   private void notifyRowShifting(HSSFRow row) {
      String msg = "Row[rownum=" + row.getRowNum() + "] contains cell(s) included in a multi-cell array formula. " + "You cannot change part of an array.";
      Iterator i$ = row.iterator();

      while(i$.hasNext()) {
         Cell cell = (Cell)i$.next();
         HSSFCell hcell = (HSSFCell)cell;
         if(hcell.isPartOfArrayFormulaGroup()) {
            hcell.notifyArrayFormulaChanging(msg);
         }
      }

   }

   public void createFreezePane(int colSplit, int rowSplit, int leftmostColumn, int topRow) {
      this.validateColumn(colSplit);
      this.validateRow(rowSplit);
      if(leftmostColumn < colSplit) {
         throw new IllegalArgumentException("leftmostColumn parameter must not be less than colSplit parameter");
      } else if(topRow < rowSplit) {
         throw new IllegalArgumentException("topRow parameter must not be less than leftmostColumn parameter");
      } else {
         this.getSheet().createFreezePane(colSplit, rowSplit, topRow, leftmostColumn);
      }
   }

   public void createFreezePane(int colSplit, int rowSplit) {
      this.createFreezePane(colSplit, rowSplit, colSplit, rowSplit);
   }

   public void createSplitPane(int xSplitPos, int ySplitPos, int leftmostColumn, int topRow, int activePane) {
      this.getSheet().createSplitPane(xSplitPos, ySplitPos, topRow, leftmostColumn, activePane);
   }

   public PaneInformation getPaneInformation() {
      return this.getSheet().getPaneInformation();
   }

   public void setDisplayGridlines(boolean show) {
      this._sheet.setDisplayGridlines(show);
   }

   public boolean isDisplayGridlines() {
      return this._sheet.isDisplayGridlines();
   }

   public void setDisplayFormulas(boolean show) {
      this._sheet.setDisplayFormulas(show);
   }

   public boolean isDisplayFormulas() {
      return this._sheet.isDisplayFormulas();
   }

   public void setDisplayRowColHeadings(boolean show) {
      this._sheet.setDisplayRowColHeadings(show);
   }

   public boolean isDisplayRowColHeadings() {
      return this._sheet.isDisplayRowColHeadings();
   }

   public void setRowBreak(int row) {
      this.validateRow(row);
      this._sheet.getPageSettings().setRowBreak(row, (short)0, (short)255);
   }

   public boolean isRowBroken(int row) {
      return this._sheet.getPageSettings().isRowBroken(row);
   }

   public void removeRowBreak(int row) {
      this._sheet.getPageSettings().removeRowBreak(row);
   }

   public int[] getRowBreaks() {
      return this._sheet.getPageSettings().getRowBreaks();
   }

   public int[] getColumnBreaks() {
      return this._sheet.getPageSettings().getColumnBreaks();
   }

   public void setColumnBreak(int column) {
      this.validateColumn((short)column);
      this._sheet.getPageSettings().setColumnBreak((short)column, (short)0, (short)SpreadsheetVersion.EXCEL97.getLastRowIndex());
   }

   public boolean isColumnBroken(int column) {
      return this._sheet.getPageSettings().isColumnBroken(column);
   }

   public void removeColumnBreak(int column) {
      this._sheet.getPageSettings().removeColumnBreak(column);
   }

   protected void validateRow(int row) {
      int maxrow = SpreadsheetVersion.EXCEL97.getLastRowIndex();
      if(row > maxrow) {
         throw new IllegalArgumentException("Maximum row number is " + maxrow);
      } else if(row < 0) {
         throw new IllegalArgumentException("Minumum row number is 0");
      }
   }

   protected void validateColumn(int column) {
      int maxcol = SpreadsheetVersion.EXCEL97.getLastColumnIndex();
      if(column > maxcol) {
         throw new IllegalArgumentException("Maximum column number is " + maxcol);
      } else if(column < 0) {
         throw new IllegalArgumentException("Minimum column number is 0");
      }
   }

   public void dumpDrawingRecords(boolean fat, PrintWriter pw) {
      this._sheet.aggregateDrawingRecords(this._book.getDrawingManager(), false);
      EscherAggregate r = (EscherAggregate)this.getSheet().findFirstRecordBySid((short)9876);
      List escherRecords = r.getEscherRecords();
      Iterator i$ = escherRecords.iterator();

      while(i$.hasNext()) {
         EscherRecord escherRecord = (EscherRecord)i$.next();
         if(fat) {
            pw.println(escherRecord.toString());
         } else {
            escherRecord.display(pw, 0);
         }
      }

      pw.flush();
   }

   public EscherAggregate getDrawingEscherAggregate() {
      this._book.findDrawingGroup();
      if(this._book.getDrawingManager() == null) {
         return null;
      } else {
         int found = this._sheet.aggregateDrawingRecords(this._book.getDrawingManager(), false);
         return found == -1?null:(EscherAggregate)this._sheet.findFirstRecordBySid((short)9876);
      }
   }

   public HSSFPatriarch getDrawingPatriarch() {
      this._patriarch = this.getPatriarch(false);
      return this._patriarch;
   }

   public HSSFPatriarch createDrawingPatriarch() {
      this._patriarch = this.getPatriarch(true);
      return this._patriarch;
   }

   private HSSFPatriarch getPatriarch(boolean createIfMissing) {
      if(this._patriarch != null) {
         return this._patriarch;
      } else {
         DrawingManager2 dm = this._book.findDrawingGroup();
         if(null == dm) {
            if(!createIfMissing) {
               return null;
            }

            this._book.createDrawingGroup();
            dm = this._book.getDrawingManager();
         }

         EscherAggregate agg = (EscherAggregate)this._sheet.findFirstRecordBySid((short)9876);
         if(null == agg) {
            int pos = this._sheet.aggregateDrawingRecords(dm, false);
            if(-1 == pos) {
               if(createIfMissing) {
                  pos = this._sheet.aggregateDrawingRecords(dm, true);
                  agg = (EscherAggregate)this._sheet.getRecords().get(pos);
                  HSSFPatriarch patriarch = new HSSFPatriarch(this, agg);
                  patriarch.afterCreate();
                  return patriarch;
               }

               return null;
            }

            agg = (EscherAggregate)this._sheet.getRecords().get(pos);
         }

         return new HSSFPatriarch(this, agg);
      }
   }

   public void setColumnGroupCollapsed(int columnNumber, boolean collapsed) {
      this._sheet.setColumnGroupCollapsed(columnNumber, collapsed);
   }

   public void groupColumn(int fromColumn, int toColumn) {
      this._sheet.groupColumnRange(fromColumn, toColumn, true);
   }

   public void ungroupColumn(int fromColumn, int toColumn) {
      this._sheet.groupColumnRange(fromColumn, toColumn, false);
   }

   public void groupRow(int fromRow, int toRow) {
      this._sheet.groupRowRange(fromRow, toRow, true);
   }

   public void ungroupRow(int fromRow, int toRow) {
      this._sheet.groupRowRange(fromRow, toRow, false);
   }

   public void setRowGroupCollapsed(int rowIndex, boolean collapse) {
      if(collapse) {
         this._sheet.getRowsAggregate().collapseRow(rowIndex);
      } else {
         this._sheet.getRowsAggregate().expandRow(rowIndex);
      }

   }

   public void setDefaultColumnStyle(int column, CellStyle style) {
      this._sheet.setDefaultColumnStyle(column, ((HSSFCellStyle)style).getIndex());
   }

   public void autoSizeColumn(int column) {
      this.autoSizeColumn(column, false);
   }

   public void autoSizeColumn(int column, boolean useMergedCells) {
      double width = SheetUtil.getColumnWidth(this, column, useMergedCells);
      if(width != -1.0D) {
         width *= 256.0D;
         char maxColumnWidth = '\uff00';
         if(width > (double)maxColumnWidth) {
            width = (double)maxColumnWidth;
         }

         this.setColumnWidth(column, (int)width);
      }

   }

   public HSSFComment getCellComment(int row, int column) {
      return this.findCellComment(row, column);
   }

   public HSSFComment getCellComment(CellAddress ref) {
      return this.findCellComment(ref.getRow(), ref.getColumn());
   }

   public HSSFHyperlink getHyperlink(int row, int column) {
      Iterator i$ = this._sheet.getRecords().iterator();

      while(i$.hasNext()) {
         RecordBase rec = (RecordBase)i$.next();
         if(rec instanceof HyperlinkRecord) {
            HyperlinkRecord link = (HyperlinkRecord)rec;
            if(link.getFirstColumn() == column && link.getFirstRow() == row) {
               return new HSSFHyperlink(link);
            }
         }
      }

      return null;
   }

   public HSSFHyperlink getHyperlink(CellAddress addr) {
      return this.getHyperlink(addr.getRow(), addr.getColumn());
   }

   public List getHyperlinkList() {
      ArrayList hyperlinkList = new ArrayList();
      Iterator i$ = this._sheet.getRecords().iterator();

      while(i$.hasNext()) {
         RecordBase rec = (RecordBase)i$.next();
         if(rec instanceof HyperlinkRecord) {
            HyperlinkRecord link = (HyperlinkRecord)rec;
            hyperlinkList.add(new HSSFHyperlink(link));
         }
      }

      return hyperlinkList;
   }

   protected void removeHyperlink(HSSFHyperlink link) {
      this.removeHyperlink(link.record);
   }

   protected void removeHyperlink(HyperlinkRecord link) {
      Iterator it = this._sheet.getRecords().iterator();

      while(it.hasNext()) {
         RecordBase rec = (RecordBase)it.next();
         if(rec instanceof HyperlinkRecord) {
            HyperlinkRecord recLink = (HyperlinkRecord)rec;
            if(link == recLink) {
               it.remove();
               return;
            }
         }
      }

   }

   public HSSFSheetConditionalFormatting getSheetConditionalFormatting() {
      return new HSSFSheetConditionalFormatting(this);
   }

   public String getSheetName() {
      HSSFWorkbook wb = this.getWorkbook();
      int idx = wb.getSheetIndex((Sheet)this);
      return wb.getSheetName(idx);
   }

   private CellRange getCellRange(CellRangeAddress range) {
      int firstRow = range.getFirstRow();
      int firstColumn = range.getFirstColumn();
      int lastRow = range.getLastRow();
      int lastColumn = range.getLastColumn();
      int height = lastRow - firstRow + 1;
      int width = lastColumn - firstColumn + 1;
      ArrayList temp = new ArrayList(height * width);

      for(int rowIn = firstRow; rowIn <= lastRow; ++rowIn) {
         for(int colIn = firstColumn; colIn <= lastColumn; ++colIn) {
            HSSFRow row = this.getRow(rowIn);
            if(row == null) {
               row = this.createRow(rowIn);
            }

            HSSFCell cell = row.getCell(colIn);
            if(cell == null) {
               cell = row.createCell(colIn);
            }

            temp.add(cell);
         }
      }

      return SSCellRange.create(firstRow, firstColumn, height, width, temp, HSSFCell.class);
   }

   public CellRange setArrayFormula(String formula, CellRangeAddress range) {
      int sheetIndex = this._workbook.getSheetIndex((Sheet)this);
      Ptg[] ptgs = HSSFFormulaParser.parse(formula, this._workbook, FormulaType.ARRAY, sheetIndex);
      CellRange cells = this.getCellRange(range);
      Iterator mainArrayFormulaCell = cells.iterator();

      while(mainArrayFormulaCell.hasNext()) {
         HSSFCell agg = (HSSFCell)mainArrayFormulaCell.next();
         agg.setCellArrayFormula(range);
      }

      HSSFCell mainArrayFormulaCell1 = (HSSFCell)cells.getTopLeftCell();
      FormulaRecordAggregate agg1 = (FormulaRecordAggregate)mainArrayFormulaCell1.getCellValueRecord();
      agg1.setArrayFormula(range, ptgs);
      return cells;
   }

   public CellRange removeArrayFormula(Cell cell) {
      if(cell.getSheet() != this) {
         throw new IllegalArgumentException("Specified cell does not belong to this sheet.");
      } else {
         CellValueRecordInterface rec = ((HSSFCell)cell).getCellValueRecord();
         if(!(rec instanceof FormulaRecordAggregate)) {
            String fra1 = (new CellReference(cell)).formatAsString();
            throw new IllegalArgumentException("Cell " + fra1 + " is not part of an array formula.");
         } else {
            FormulaRecordAggregate fra = (FormulaRecordAggregate)rec;
            CellRangeAddress range = fra.removeArrayFormula(cell.getRowIndex(), cell.getColumnIndex());
            CellRange result = this.getCellRange(range);
            Iterator i$ = result.iterator();

            while(i$.hasNext()) {
               Cell c = (Cell)i$.next();
               c.setCellType(CellType.BLANK);
            }

            return result;
         }
      }
   }

   public DataValidationHelper getDataValidationHelper() {
      return new HSSFDataValidationHelper(this);
   }

   public HSSFAutoFilter setAutoFilter(CellRangeAddress range) {
      InternalWorkbook workbook = this._workbook.getWorkbook();
      int sheetIndex = this._workbook.getSheetIndex((Sheet)this);
      NameRecord name = workbook.getSpecificBuiltinRecord((byte)13, sheetIndex + 1);
      if(name == null) {
         name = workbook.createBuiltInName((byte)13, sheetIndex + 1);
      }

      int firstRow = range.getFirstRow();
      if(firstRow == -1) {
         firstRow = 0;
      }

      Area3DPtg ptg = new Area3DPtg(firstRow, range.getLastRow(), range.getFirstColumn(), range.getLastColumn(), false, false, false, false, sheetIndex);
      name.setNameDefinition(new Ptg[]{ptg});
      AutoFilterInfoRecord r = new AutoFilterInfoRecord();
      int numcols = 1 + range.getLastColumn() - range.getFirstColumn();
      r.setNumEntries((short)numcols);
      int idx = this._sheet.findFirstRecordLocBySid((short)512);
      this._sheet.getRecords().add(idx, r);
      HSSFPatriarch p = this.createDrawingPatriarch();
      int firstColumn = range.getFirstColumn();
      int lastColumn = range.getLastColumn();

      for(int col = firstColumn; col <= lastColumn; ++col) {
         p.createComboBox(new HSSFClientAnchor(0, 0, 0, 0, (short)col, firstRow, (short)(col + 1), firstRow + 1));
      }

      return new HSSFAutoFilter(this);
   }

   protected HSSFComment findCellComment(int row, int column) {
      HSSFPatriarch patriarch = this.getDrawingPatriarch();
      if(null == patriarch) {
         patriarch = this.createDrawingPatriarch();
      }

      return this.lookForComment(patriarch, row, column);
   }

   private HSSFComment lookForComment(HSSFShapeContainer container, int row, int column) {
      Iterator i$ = container.getChildren().iterator();

      while(i$.hasNext()) {
         Object object = i$.next();
         HSSFShape shape = (HSSFShape)object;
         HSSFComment comment;
         if(shape instanceof HSSFShapeGroup) {
            comment = this.lookForComment((HSSFShapeContainer)shape, row, column);
            if(null != comment) {
               return (HSSFComment)comment;
            }
         } else if(shape instanceof HSSFComment) {
            comment = (HSSFComment)shape;
            if(comment.hasPosition() && comment.getColumn() == column && comment.getRow() == row) {
               return comment;
            }
         }
      }

      return null;
   }

   public Map getCellComments() {
      HSSFPatriarch patriarch = this.getDrawingPatriarch();
      if(null == patriarch) {
         patriarch = this.createDrawingPatriarch();
      }

      TreeMap locations = new TreeMap();
      this.findCellCommentLocations(patriarch, locations);
      return locations;
   }

   private void findCellCommentLocations(HSSFShapeContainer container, Map locations) {
      Iterator i$ = container.getChildren().iterator();

      while(i$.hasNext()) {
         Object object = i$.next();
         HSSFShape shape = (HSSFShape)object;
         if(shape instanceof HSSFShapeGroup) {
            this.findCellCommentLocations((HSSFShapeGroup)shape, locations);
         } else if(shape instanceof HSSFComment) {
            HSSFComment comment = (HSSFComment)shape;
            if(comment.hasPosition()) {
               locations.put(new CellAddress(comment.getRow(), comment.getColumn()), comment);
            }
         }
      }

   }

   public CellRangeAddress getRepeatingRows() {
      return this.getRepeatingRowsOrColums(true);
   }

   public CellRangeAddress getRepeatingColumns() {
      return this.getRepeatingRowsOrColums(false);
   }

   public void setRepeatingRows(CellRangeAddress rowRangeRef) {
      CellRangeAddress columnRangeRef = this.getRepeatingColumns();
      this.setRepeatingRowsAndColumns(rowRangeRef, columnRangeRef);
   }

   public void setRepeatingColumns(CellRangeAddress columnRangeRef) {
      CellRangeAddress rowRangeRef = this.getRepeatingRows();
      this.setRepeatingRowsAndColumns(rowRangeRef, columnRangeRef);
   }

   private void setRepeatingRowsAndColumns(CellRangeAddress rowDef, CellRangeAddress colDef) {
      int sheetIndex = this._workbook.getSheetIndex((Sheet)this);
      int maxRowIndex = SpreadsheetVersion.EXCEL97.getLastRowIndex();
      int maxColIndex = SpreadsheetVersion.EXCEL97.getLastColumnIndex();
      int col1 = -1;
      int col2 = -1;
      int row1 = -1;
      int row2 = -1;
      if(rowDef != null) {
         row1 = rowDef.getFirstRow();
         row2 = rowDef.getLastRow();
         if(row1 == -1 && row2 != -1 || row1 > row2 || row1 < 0 || row1 > maxRowIndex || row2 < 0 || row2 > maxRowIndex) {
            throw new IllegalArgumentException("Invalid row range specification");
         }
      }

      if(colDef != null) {
         col1 = colDef.getFirstColumn();
         col2 = colDef.getLastColumn();
         if(col1 == -1 && col2 != -1 || col1 > col2 || col1 < 0 || col1 > maxColIndex || col2 < 0 || col2 > maxColIndex) {
            throw new IllegalArgumentException("Invalid column range specification");
         }
      }

      short externSheetIndex = this._workbook.getWorkbook().checkExternSheet(sheetIndex);
      boolean setBoth = rowDef != null && colDef != null;
      boolean removeAll = rowDef == null && colDef == null;
      HSSFName name = this._workbook.getBuiltInName((byte)7, sheetIndex);
      if(removeAll) {
         if(name != null) {
            this._workbook.removeName((Name)name);
         }

      } else {
         if(name == null) {
            name = this._workbook.createBuiltInName((byte)7, sheetIndex);
         }

         ArrayList ptgList = new ArrayList();
         if(setBoth) {
            boolean ptgs = true;
            ptgList.add(new MemFuncPtg(23));
         }

         Area3DPtg ptgs1;
         if(colDef != null) {
            ptgs1 = new Area3DPtg(0, maxRowIndex, col1, col2, false, false, false, false, externSheetIndex);
            ptgList.add(ptgs1);
         }

         if(rowDef != null) {
            ptgs1 = new Area3DPtg(row1, row2, 0, maxColIndex, false, false, false, false, externSheetIndex);
            ptgList.add(ptgs1);
         }

         if(setBoth) {
            ptgList.add(UnionPtg.instance);
         }

         Ptg[] ptgs2 = new Ptg[ptgList.size()];
         ptgList.toArray(ptgs2);
         name.setNameDefinition(ptgs2);
         HSSFPrintSetup printSetup = this.getPrintSetup();
         printSetup.setValidSettings(false);
         this.setActive(true);
      }
   }

   private CellRangeAddress getRepeatingRowsOrColums(boolean rows) {
      NameRecord rec = this.getBuiltinNameRecord((byte)7);
      if(rec == null) {
         return null;
      } else {
         Ptg[] nameDefinition = rec.getNameDefinition();
         if(nameDefinition == null) {
            return null;
         } else {
            int maxRowIndex = SpreadsheetVersion.EXCEL97.getLastRowIndex();
            int maxColIndex = SpreadsheetVersion.EXCEL97.getLastColumnIndex();
            Ptg[] arr$ = nameDefinition;
            int len$ = nameDefinition.length;

            for(int i$ = 0; i$ < len$; ++i$) {
               Ptg ptg = arr$[i$];
               if(ptg instanceof Area3DPtg) {
                  Area3DPtg areaPtg = (Area3DPtg)ptg;
                  if(areaPtg.getFirstColumn() == 0 && areaPtg.getLastColumn() == maxColIndex) {
                     if(rows) {
                        return new CellRangeAddress(areaPtg.getFirstRow(), areaPtg.getLastRow(), -1, -1);
                     }
                  } else if(areaPtg.getFirstRow() == 0 && areaPtg.getLastRow() == maxRowIndex && !rows) {
                     return new CellRangeAddress(-1, -1, areaPtg.getFirstColumn(), areaPtg.getLastColumn());
                  }
               }
            }

            return null;
         }
      }
   }

   private NameRecord getBuiltinNameRecord(byte builtinCode) {
      int sheetIndex = this._workbook.getSheetIndex((Sheet)this);
      int recIndex = this._workbook.findExistingBuiltinNameRecordIdx(sheetIndex, builtinCode);
      return recIndex == -1?null:this._workbook.getNameRecord(recIndex);
   }

   public int getColumnOutlineLevel(int columnIndex) {
      return this._sheet.getColumnOutlineLevel(columnIndex);
   }

   public CellAddress getActiveCell() {
      int row = this._sheet.getActiveCellRow();
      short col = this._sheet.getActiveCellCol();
      return new CellAddress(row, col);
   }

   public void setActiveCell(CellAddress address) {
      int row = address.getRow();
      short col = (short)address.getColumn();
      this._sheet.setActiveCellRow(row);
      this._sheet.setActiveCellCol(col);
   }

}
