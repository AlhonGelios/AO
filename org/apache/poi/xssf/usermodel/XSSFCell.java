package org.apache.poi.xssf.usermodel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.FormulaParser;
import org.apache.poi.ss.formula.FormulaRenderer;
import org.apache.poi.ss.formula.FormulaType;
import org.apache.poi.ss.formula.SharedFormula;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellCopyPolicy;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaError;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LocaleUtil;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellFormulaType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType;

public final class XSSFCell implements Cell {

   private static final String FALSE_AS_STRING = "0";
   private static final String TRUE_AS_STRING = "1";
   private static final String FALSE = "FALSE";
   private static final String TRUE = "TRUE";
   private CTCell _cell;
   private final XSSFRow _row;
   private int _cellNum;
   private SharedStringsTable _sharedStringSource;
   private StylesTable _stylesSource;


   protected XSSFCell(XSSFRow row, CTCell cell) {
      this._cell = cell;
      this._row = row;
      if(cell.getR() != null) {
         this._cellNum = (new CellReference(cell.getR())).getCol();
      } else {
         short prevNum = row.getLastCellNum();
         if(prevNum != -1) {
            this._cellNum = row.getCell(prevNum - 1, Row.MissingCellPolicy.RETURN_NULL_AND_BLANK).getColumnIndex() + 1;
         }
      }

      this._sharedStringSource = row.getSheet().getWorkbook().getSharedStringSource();
      this._stylesSource = row.getSheet().getWorkbook().getStylesSource();
   }

   @Internal
   public void copyCellFrom(Cell srcCell, CellCopyPolicy policy) {
      if(policy.isCopyCellValue()) {
         if(srcCell != null) {
            CellType srcHyperlink = srcCell.getCellTypeEnum();
            if(srcHyperlink == CellType.FORMULA && !policy.isCopyCellFormula()) {
               srcHyperlink = srcCell.getCachedFormulaResultTypeEnum();
            }

            switch(XSSFCell.NamelessClass1289329222.$SwitchMap$org$apache$poi$ss$usermodel$CellType[srcHyperlink.ordinal()]) {
            case 1:
               if(DateUtil.isCellDateFormatted(srcCell)) {
                  this.setCellValue(srcCell.getDateCellValue());
               } else {
                  this.setCellValue(srcCell.getNumericCellValue());
               }
               break;
            case 2:
               this.setCellValue(srcCell.getStringCellValue());
               break;
            case 3:
               this.setCellFormula(srcCell.getCellFormula());
               break;
            case 4:
               this.setBlank();
               break;
            case 5:
               this.setCellValue(srcCell.getBooleanCellValue());
               break;
            case 6:
               this.setCellErrorValue(srcCell.getErrorCellValue());
               break;
            default:
               throw new IllegalArgumentException("Invalid cell type " + srcCell.getCellTypeEnum());
            }
         } else {
            this.setBlank();
         }
      }

      if(policy.isCopyCellStyle()) {
         if(srcCell != null) {
            this.setCellStyle(srcCell.getCellStyle());
         } else {
            this.setCellStyle((CellStyle)null);
         }
      }

      Hyperlink srcHyperlink1;
      if(policy.isMergeHyperlink()) {
         srcHyperlink1 = srcCell.getHyperlink();
         if(srcHyperlink1 != null) {
            this.setHyperlink(new XSSFHyperlink(srcHyperlink1));
         }
      } else if(policy.isCopyHyperlink()) {
         srcHyperlink1 = srcCell.getHyperlink();
         if(srcHyperlink1 == null) {
            this.setHyperlink((Hyperlink)null);
         } else {
            this.setHyperlink(new XSSFHyperlink(srcHyperlink1));
         }
      }

   }

   protected SharedStringsTable getSharedStringSource() {
      return this._sharedStringSource;
   }

   protected StylesTable getStylesSource() {
      return this._stylesSource;
   }

   public XSSFSheet getSheet() {
      return this.getRow().getSheet();
   }

   public XSSFRow getRow() {
      return this._row;
   }

   public boolean getBooleanCellValue() {
      CellType cellType = this.getCellTypeEnum();
      switch(XSSFCell.NamelessClass1289329222.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 3:
         return this._cell.isSetV() && "1".equals(this._cell.getV());
      case 4:
         return false;
      case 5:
         return this._cell.isSetV() && "1".equals(this._cell.getV());
      default:
         throw typeMismatch(CellType.BOOLEAN, cellType, false);
      }
   }

   public void setCellValue(boolean value) {
      this._cell.setT(STCellType.B);
      this._cell.setV(value?"1":"0");
   }

   public double getNumericCellValue() {
      CellType cellType = this.getCellTypeEnum();
      switch(XSSFCell.NamelessClass1289329222.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
      case 3:
         if(this._cell.isSetV()) {
            String v = this._cell.getV();
            if(v.isEmpty()) {
               return 0.0D;
            }

            try {
               return Double.parseDouble(v);
            } catch (NumberFormatException var4) {
               throw typeMismatch(CellType.NUMERIC, CellType.STRING, false);
            }
         }

         return 0.0D;
      case 2:
      default:
         throw typeMismatch(CellType.NUMERIC, cellType, false);
      case 4:
         return 0.0D;
      }
   }

   public void setCellValue(double value) {
      if(Double.isInfinite(value)) {
         this._cell.setT(STCellType.E);
         this._cell.setV(FormulaError.DIV0.getString());
      } else if(Double.isNaN(value)) {
         this._cell.setT(STCellType.E);
         this._cell.setV(FormulaError.NUM.getString());
      } else {
         this._cell.setT(STCellType.N);
         this._cell.setV(String.valueOf(value));
      }

   }

   public String getStringCellValue() {
      return this.getRichStringCellValue().getString();
   }

   public XSSFRichTextString getRichStringCellValue() {
      CellType cellType = this.getCellTypeEnum();
      XSSFRichTextString rt;
      switch(XSSFCell.NamelessClass1289329222.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 2:
         if(this._cell.getT() == STCellType.INLINE_STR) {
            if(this._cell.isSetIs()) {
               rt = new XSSFRichTextString(this._cell.getIs());
            } else if(this._cell.isSetV()) {
               rt = new XSSFRichTextString(this._cell.getV());
            } else {
               rt = new XSSFRichTextString("");
            }
         } else if(this._cell.getT() == STCellType.STR) {
            rt = new XSSFRichTextString(this._cell.isSetV()?this._cell.getV():"");
         } else if(this._cell.isSetV()) {
            int idx = Integer.parseInt(this._cell.getV());
            rt = new XSSFRichTextString(this._sharedStringSource.getEntryAt(idx));
         } else {
            rt = new XSSFRichTextString("");
         }
         break;
      case 3:
         checkFormulaCachedValueType(CellType.STRING, this.getBaseCellType(false));
         rt = new XSSFRichTextString(this._cell.isSetV()?this._cell.getV():"");
         break;
      case 4:
         rt = new XSSFRichTextString("");
         break;
      default:
         throw typeMismatch(CellType.STRING, cellType, false);
      }

      rt.setStylesTableReference(this._stylesSource);
      return rt;
   }

   private static void checkFormulaCachedValueType(CellType expectedTypeCode, CellType cachedValueType) {
      if(cachedValueType != expectedTypeCode) {
         throw typeMismatch(expectedTypeCode, cachedValueType, true);
      }
   }

   public void setCellValue(String str) {
      this.setCellValue((RichTextString)(str == null?null:new XSSFRichTextString(str)));
   }

   public void setCellValue(RichTextString str) {
      if(str != null && str.getString() != null) {
         if(str.length() > SpreadsheetVersion.EXCEL2007.getMaxTextLength()) {
            throw new IllegalArgumentException("The maximum length of cell contents (text) is 32,767 characters");
         } else {
            CellType cellType = this.getCellTypeEnum();
            switch(XSSFCell.NamelessClass1289329222.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
            case 3:
               this._cell.setV(str.getString());
               this._cell.setT(STCellType.STR);
               break;
            default:
               if(this._cell.getT() == STCellType.INLINE_STR) {
                  this._cell.setV(str.getString());
               } else {
                  this._cell.setT(STCellType.S);
                  XSSFRichTextString rt = (XSSFRichTextString)str;
                  rt.setStylesTableReference(this._stylesSource);
                  int sRef = this._sharedStringSource.addEntry(rt.getCTRst());
                  this._cell.setV(Integer.toString(sRef));
               }
            }

         }
      } else {
         this.setCellType(CellType.BLANK);
      }
   }

   public String getCellFormula() {
      return this.getCellFormula((XSSFEvaluationWorkbook)null);
   }

   protected String getCellFormula(XSSFEvaluationWorkbook fpb) {
      CellType cellType = this.getCellTypeEnum();
      if(cellType != CellType.FORMULA) {
         throw typeMismatch(CellType.FORMULA, cellType, false);
      } else {
         CTCellFormula f = this._cell.getF();
         if(this.isPartOfArrayFormulaGroup() && f == null) {
            XSSFCell cell = this.getSheet().getFirstCellInArrayFormula(this);
            return cell.getCellFormula(fpb);
         } else {
            return f.getT() == STCellFormulaType.SHARED?this.convertSharedFormula((int)f.getSi(), fpb == null?XSSFEvaluationWorkbook.create(this.getSheet().getWorkbook()):fpb):f.getStringValue();
         }
      }
   }

   private String convertSharedFormula(int si, XSSFEvaluationWorkbook fpb) {
      XSSFSheet sheet = this.getSheet();
      CTCellFormula f = sheet.getSharedFormula(si);
      if(f == null) {
         throw new IllegalStateException("Master cell of a shared formula with sid=" + si + " was not found");
      } else {
         String sharedFormula = f.getStringValue();
         String sharedFormulaRange = f.getRef();
         CellRangeAddress ref = CellRangeAddress.valueOf(sharedFormulaRange);
         int sheetIndex = sheet.getWorkbook().getSheetIndex((Sheet)sheet);
         SharedFormula sf = new SharedFormula(SpreadsheetVersion.EXCEL2007);
         Ptg[] ptgs = FormulaParser.parse(sharedFormula, fpb, FormulaType.CELL, sheetIndex, this.getRowIndex());
         Ptg[] fmla = sf.convertSharedFormulas(ptgs, this.getRowIndex() - ref.getFirstRow(), this.getColumnIndex() - ref.getFirstColumn());
         return FormulaRenderer.toFormulaString(fpb, fmla);
      }
   }

   public void setCellFormula(String formula) {
      if(this.isPartOfArrayFormulaGroup()) {
         this.notifyArrayFormulaChanging();
      }

      this.setFormula(formula, FormulaType.CELL);
   }

   void setCellArrayFormula(String formula, CellRangeAddress range) {
      this.setFormula(formula, FormulaType.ARRAY);
      CTCellFormula cellFormula = this._cell.getF();
      cellFormula.setT(STCellFormulaType.ARRAY);
      cellFormula.setRef(range.formatAsString());
   }

   private void setFormula(String formula, FormulaType formulaType) {
      XSSFWorkbook wb = this._row.getSheet().getWorkbook();
      if(formula == null) {
         wb.onDeleteFormula(this);
         if(this._cell.isSetF()) {
            this._cell.unsetF();
         }

      } else {
         XSSFEvaluationWorkbook fpb = XSSFEvaluationWorkbook.create(wb);
         FormulaParser.parse(formula, fpb, formulaType, wb.getSheetIndex((Sheet)this.getSheet()), this.getRowIndex());
         CTCellFormula f = CTCellFormula.Factory.newInstance();
         f.setStringValue(formula);
         this._cell.setF(f);
         if(this._cell.isSetV()) {
            this._cell.unsetV();
         }

      }
   }

   public int getColumnIndex() {
      return this._cellNum;
   }

   public int getRowIndex() {
      return this._row.getRowNum();
   }

   public String getReference() {
      String ref = this._cell.getR();
      return ref == null?this.getAddress().formatAsString():ref;
   }

   public CellAddress getAddress() {
      return new CellAddress(this);
   }

   public XSSFCellStyle getCellStyle() {
      XSSFCellStyle style = null;
      if(this._stylesSource.getNumCellStyles() > 0) {
         long idx = this._cell.isSetS()?this._cell.getS():0L;
         style = this._stylesSource.getStyleAt((int)idx);
      }

      return style;
   }

   public void setCellStyle(CellStyle style) {
      if(style == null) {
         if(this._cell.isSetS()) {
            this._cell.unsetS();
         }
      } else {
         XSSFCellStyle xStyle = (XSSFCellStyle)style;
         xStyle.verifyBelongsToStylesSource(this._stylesSource);
         long idx = (long)this._stylesSource.putStyle(xStyle);
         this._cell.setS(idx);
      }

   }

   private boolean isFormulaCell() {
      return this._cell.getF() != null || this.getSheet().isCellInArrayFormulaContext(this);
   }

   public int getCellType() {
      return this.getCellTypeEnum().getCode();
   }

   @Internal(
      since = "POI 3.15 beta 3"
   )
   public CellType getCellTypeEnum() {
      return this.isFormulaCell()?CellType.FORMULA:this.getBaseCellType(true);
   }

   public int getCachedFormulaResultType() {
      return this.getCachedFormulaResultTypeEnum().getCode();
   }

   public CellType getCachedFormulaResultTypeEnum() {
      if(!this.isFormulaCell()) {
         throw new IllegalStateException("Only formula cells have cached results");
      } else {
         return this.getBaseCellType(false);
      }
   }

   private CellType getBaseCellType(boolean blankCells) {
      switch(this._cell.getT().intValue()) {
      case 1:
         return CellType.BOOLEAN;
      case 2:
         if(!this._cell.isSetV() && blankCells) {
            return CellType.BLANK;
         }

         return CellType.NUMERIC;
      case 3:
         return CellType.ERROR;
      case 4:
      case 5:
      case 6:
         return CellType.STRING;
      default:
         throw new IllegalStateException("Illegal cell type: " + this._cell.getT());
      }
   }

   public Date getDateCellValue() {
      if(this.getCellTypeEnum() == CellType.BLANK) {
         return null;
      } else {
         double value = this.getNumericCellValue();
         boolean date1904 = this.getSheet().getWorkbook().isDate1904();
         return DateUtil.getJavaDate(value, date1904);
      }
   }

   public void setCellValue(Date value) {
      if(value == null) {
         this.setCellType(CellType.BLANK);
      } else {
         boolean date1904 = this.getSheet().getWorkbook().isDate1904();
         this.setCellValue(DateUtil.getExcelDate(value, date1904));
      }
   }

   public void setCellValue(Calendar value) {
      if(value == null) {
         this.setCellType(CellType.BLANK);
      } else {
         boolean date1904 = this.getSheet().getWorkbook().isDate1904();
         this.setCellValue(DateUtil.getExcelDate(value, date1904));
      }
   }

   public String getErrorCellString() throws IllegalStateException {
      CellType cellType = this.getBaseCellType(true);
      if(cellType != CellType.ERROR) {
         throw typeMismatch(CellType.ERROR, cellType, false);
      } else {
         return this._cell.getV();
      }
   }

   public byte getErrorCellValue() throws IllegalStateException {
      String code = this.getErrorCellString();
      if(code == null) {
         return (byte)0;
      } else {
         try {
            return FormulaError.forString(code).getCode();
         } catch (IllegalArgumentException var3) {
            throw new IllegalStateException("Unexpected error code", var3);
         }
      }
   }

   public void setCellErrorValue(byte errorCode) {
      FormulaError error = FormulaError.forInt(errorCode);
      this.setCellErrorValue(error);
   }

   public void setCellErrorValue(FormulaError error) {
      this._cell.setT(STCellType.E);
      this._cell.setV(error.getString());
   }

   public void setAsActiveCell() {
      this.getSheet().setActiveCell(this.getAddress());
   }

   private void setBlank() {
      CTCell blank = CTCell.Factory.newInstance();
      blank.setR(this._cell.getR());
      if(this._cell.isSetS()) {
         blank.setS(this._cell.getS());
      }

      this._cell.set(blank);
   }

   protected void setCellNum(int num) {
      checkBounds(num);
      this._cellNum = num;
      String ref = (new CellReference(this.getRowIndex(), this.getColumnIndex())).formatAsString();
      this._cell.setR(ref);
   }

   public void setCellType(int cellType) {
      this.setCellType(CellType.forInt(cellType));
   }

   public void setCellType(CellType cellType) {
      CellType prevType = this.getCellTypeEnum();
      if(this.isPartOfArrayFormulaGroup()) {
         this.notifyArrayFormulaChanging();
      }

      if(prevType == CellType.FORMULA && cellType != CellType.FORMULA) {
         this.getSheet().getWorkbook().onDeleteFormula(this);
      }

      String newVal;
      switch(XSSFCell.NamelessClass1289329222.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
         this._cell.setT(STCellType.N);
         break;
      case 2:
         if(prevType != CellType.STRING) {
            newVal = this.convertCellValueToString();
            XSSFRichTextString rt = new XSSFRichTextString(newVal);
            rt.setStylesTableReference(this._stylesSource);
            int sRef = this._sharedStringSource.addEntry(rt.getCTRst());
            this._cell.setV(Integer.toString(sRef));
         }

         this._cell.setT(STCellType.S);
         break;
      case 3:
         if(!this._cell.isSetF()) {
            CTCellFormula newVal1 = CTCellFormula.Factory.newInstance();
            newVal1.setStringValue("0");
            this._cell.setF(newVal1);
            if(this._cell.isSetT()) {
               this._cell.unsetT();
            }
         }
         break;
      case 4:
         this.setBlank();
         break;
      case 5:
         newVal = this.convertCellValueToBoolean()?"1":"0";
         this._cell.setT(STCellType.B);
         this._cell.setV(newVal);
         break;
      case 6:
         this._cell.setT(STCellType.E);
         break;
      default:
         throw new IllegalArgumentException("Illegal cell type: " + cellType);
      }

      if(cellType != CellType.FORMULA && this._cell.isSetF()) {
         this._cell.unsetF();
      }

   }

   public String toString() {
      switch(XSSFCell.NamelessClass1289329222.$SwitchMap$org$apache$poi$ss$usermodel$CellType[this.getCellTypeEnum().ordinal()]) {
      case 1:
         if(DateUtil.isCellDateFormatted(this)) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", LocaleUtil.getUserLocale());
            sdf.setTimeZone(LocaleUtil.getUserTimeZone());
            return sdf.format(this.getDateCellValue());
         }

         return Double.toString(this.getNumericCellValue());
      case 2:
         return this.getRichStringCellValue().toString();
      case 3:
         return this.getCellFormula();
      case 4:
         return "";
      case 5:
         return this.getBooleanCellValue()?"TRUE":"FALSE";
      case 6:
         return ErrorEval.getText(this.getErrorCellValue());
      default:
         return "Unknown Cell Type: " + this.getCellTypeEnum();
      }
   }

   public String getRawValue() {
      return this._cell.getV();
   }

   private static RuntimeException typeMismatch(CellType expectedType, CellType actualType, boolean isFormulaCell) {
      String msg = "Cannot get a " + expectedType + " value from a " + actualType + " " + (isFormulaCell?"formula ":"") + "cell";
      return new IllegalStateException(msg);
   }

   private static void checkBounds(int cellIndex) {
      SpreadsheetVersion v = SpreadsheetVersion.EXCEL2007;
      int maxcol = SpreadsheetVersion.EXCEL2007.getLastColumnIndex();
      if(cellIndex < 0 || cellIndex > maxcol) {
         throw new IllegalArgumentException("Invalid column index (" + cellIndex + ").  Allowable column range for " + v.name() + " is (0.." + maxcol + ") or (\'A\'..\'" + v.getLastColumnName() + "\')");
      }
   }

   public XSSFComment getCellComment() {
      return this.getSheet().getCellComment(new CellAddress(this));
   }

   public void setCellComment(Comment comment) {
      if(comment == null) {
         this.removeCellComment();
      } else {
         comment.setAddress(this.getRowIndex(), this.getColumnIndex());
      }
   }

   public void removeCellComment() {
      XSSFComment comment = this.getCellComment();
      if(comment != null) {
         CellAddress ref = new CellAddress(this.getReference());
         XSSFSheet sh = this.getSheet();
         sh.getCommentsTable(false).removeComment(ref);
         sh.getVMLDrawing(false).removeCommentShape(this.getRowIndex(), this.getColumnIndex());
      }

   }

   public XSSFHyperlink getHyperlink() {
      return this.getSheet().getHyperlink(this._row.getRowNum(), this._cellNum);
   }

   public void setHyperlink(Hyperlink hyperlink) {
      if(hyperlink == null) {
         this.removeHyperlink();
      } else {
         XSSFHyperlink link = (XSSFHyperlink)hyperlink;
         link.setCellReference((new CellReference(this._row.getRowNum(), this._cellNum)).formatAsString());
         this.getSheet().addHyperlink(link);
      }
   }

   public void removeHyperlink() {
      this.getSheet().removeHyperlink(this._row.getRowNum(), this._cellNum);
   }

   @Internal
   public CTCell getCTCell() {
      return this._cell;
   }

   @Internal
   public void setCTCell(CTCell cell) {
      this._cell = cell;
   }

   private boolean convertCellValueToBoolean() {
      CellType cellType = this.getCellTypeEnum();
      if(cellType == CellType.FORMULA) {
         cellType = this.getBaseCellType(false);
      }

      switch(XSSFCell.NamelessClass1289329222.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
         return Double.parseDouble(this._cell.getV()) != 0.0D;
      case 2:
         int sstIndex = Integer.parseInt(this._cell.getV());
         XSSFRichTextString rt = new XSSFRichTextString(this._sharedStringSource.getEntryAt(sstIndex));
         String text = rt.getString();
         return Boolean.parseBoolean(text);
      case 3:
      default:
         throw new RuntimeException("Unexpected cell type (" + cellType + ")");
      case 4:
      case 6:
         return false;
      case 5:
         return "1".equals(this._cell.getV());
      }
   }

   private String convertCellValueToString() {
      CellType cellType = this.getCellTypeEnum();
      switch(XSSFCell.NamelessClass1289329222.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
      case 6:
         return this._cell.getV();
      case 2:
         int textValue1 = Integer.parseInt(this._cell.getV());
         XSSFRichTextString rt = new XSSFRichTextString(this._sharedStringSource.getEntryAt(textValue1));
         return rt.getString();
      case 3:
         cellType = this.getBaseCellType(false);
         String textValue = this._cell.getV();
         switch(XSSFCell.NamelessClass1289329222.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
         case 1:
         case 2:
         case 6:
            return textValue;
         case 3:
         case 4:
         default:
            throw new IllegalStateException("Unexpected formula result type (" + cellType + ")");
         case 5:
            if("1".equals(textValue)) {
               return "TRUE";
            } else {
               if("0".equals(textValue)) {
                  return "FALSE";
               }

               throw new IllegalStateException("Unexpected boolean cached formula value \'" + textValue + "\'.");
            }
         }
      case 4:
         return "";
      case 5:
         return "1".equals(this._cell.getV())?"TRUE":"FALSE";
      default:
         throw new IllegalStateException("Unexpected cell type (" + cellType + ")");
      }
   }

   public CellRangeAddress getArrayFormulaRange() {
      XSSFCell cell = this.getSheet().getFirstCellInArrayFormula(this);
      if(cell == null) {
         throw new IllegalStateException("Cell " + this.getReference() + " is not part of an array formula.");
      } else {
         String formulaRef = cell._cell.getF().getRef();
         return CellRangeAddress.valueOf(formulaRef);
      }
   }

   public boolean isPartOfArrayFormulaGroup() {
      return this.getSheet().isCellInArrayFormulaContext(this);
   }

   void notifyArrayFormulaChanging(String msg) {
      if(this.isPartOfArrayFormulaGroup()) {
         CellRangeAddress cra = this.getArrayFormulaRange();
         if(cra.getNumberOfCells() > 1) {
            throw new IllegalStateException(msg);
         }

         this.getRow().getSheet().removeArrayFormula(this);
      }

   }

   void notifyArrayFormulaChanging() {
      CellReference ref = new CellReference(this);
      String msg = "Cell " + ref.formatAsString() + " is part of a multi-cell array formula. " + "You cannot change part of an array.";
      this.notifyArrayFormulaChanging(msg);
   }

   // $FF: synthetic class
   static class NamelessClass1289329222 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$CellType = new int[CellType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.NUMERIC.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.STRING.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.FORMULA.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.BLANK.ordinal()] = 4;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.BOOLEAN.ordinal()] = 5;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.ERROR.ordinal()] = 6;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
