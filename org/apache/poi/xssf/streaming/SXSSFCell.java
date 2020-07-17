package org.apache.poi.xssf.streaming;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaError;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LocaleUtil;
import org.apache.poi.util.NotImplemented;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.Removal;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;

public class SXSSFCell implements Cell {

   private static final POILogger logger = POILogFactory.getLogger(SXSSFCell.class);
   private final SXSSFRow _row;
   private SXSSFCell.Value _value;
   private CellStyle _style;
   private SXSSFCell.Property _firstProperty;


   @Removal(
      version = "3.17"
   )
   @Deprecated
   public SXSSFCell(SXSSFRow row, int cellType) {
      this(row, CellType.forInt(cellType));
   }

   public SXSSFCell(SXSSFRow row, CellType cellType) {
      this._row = row;
      this.setType(cellType);
   }

   public int getColumnIndex() {
      return this._row.getCellIndex(this);
   }

   public int getRowIndex() {
      return this._row.getRowNum();
   }

   public CellAddress getAddress() {
      return new CellAddress(this);
   }

   public SXSSFSheet getSheet() {
      return this._row.getSheet();
   }

   public Row getRow() {
      return this._row;
   }

   public void setCellType(int cellType) {
      this.ensureType(CellType.forInt(cellType));
   }

   public void setCellType(CellType cellType) {
      this.ensureType(cellType);
   }

   public int getCellType() {
      return this.getCellTypeEnum().getCode();
   }

   @Internal(
      since = "POI 3.15 beta 3"
   )
   public CellType getCellTypeEnum() {
      return this._value.getType();
   }

   public int getCachedFormulaResultType() {
      return this.getCachedFormulaResultTypeEnum().getCode();
   }

   @Internal(
      since = "POI 3.15 beta 3"
   )
   public CellType getCachedFormulaResultTypeEnum() {
      if(this._value.getType() != CellType.FORMULA) {
         throw new IllegalStateException("Only formula cells have cached results");
      } else {
         return ((SXSSFCell.FormulaValue)this._value).getFormulaType();
      }
   }

   public void setCellValue(double value) {
      if(Double.isInfinite(value)) {
         this.setCellErrorValue(FormulaError.DIV0.getCode());
      } else if(Double.isNaN(value)) {
         this.setCellErrorValue(FormulaError.NUM.getCode());
      } else {
         this.ensureTypeOrFormulaType(CellType.NUMERIC);
         if(this._value.getType() == CellType.FORMULA) {
            ((SXSSFCell.NumericFormulaValue)this._value).setPreEvaluatedValue(value);
         } else {
            ((SXSSFCell.NumericValue)this._value).setValue(value);
         }
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

   public void setCellValue(RichTextString value) {
      XSSFRichTextString xvalue = (XSSFRichTextString)value;
      if(xvalue != null && xvalue.getString() != null) {
         this.ensureRichTextStringType();
         if(xvalue.length() > SpreadsheetVersion.EXCEL2007.getMaxTextLength()) {
            throw new IllegalArgumentException("The maximum length of cell contents (text) is 32,767 characters");
         }

         if(xvalue.hasFormatting()) {
            logger.log(5, new Object[]{"SXSSF doesn\'t support Shared Strings, rich text formatting information has be lost"});
         }

         ((SXSSFCell.RichTextValue)this._value).setValue(xvalue);
      } else {
         this.setCellType(CellType.BLANK);
      }

   }

   public void setCellValue(String value) {
      if(value != null) {
         this.ensureTypeOrFormulaType(CellType.STRING);
         if(value.length() > SpreadsheetVersion.EXCEL2007.getMaxTextLength()) {
            throw new IllegalArgumentException("The maximum length of cell contents (text) is 32,767 characters");
         }

         if(this._value.getType() == CellType.FORMULA) {
            if(this._value instanceof SXSSFCell.NumericFormulaValue) {
               ((SXSSFCell.NumericFormulaValue)this._value).setPreEvaluatedValue(Double.parseDouble(value));
            } else {
               ((SXSSFCell.StringFormulaValue)this._value).setPreEvaluatedValue(value);
            }
         } else {
            ((SXSSFCell.PlainStringValue)this._value).setValue(value);
         }
      } else {
         this.setCellType(CellType.BLANK);
      }

   }

   public void setCellFormula(String formula) throws FormulaParseException {
      if(formula == null) {
         this.setType(CellType.BLANK);
      } else {
         this.ensureFormulaType(this.computeTypeFromFormula(formula));
         ((SXSSFCell.FormulaValue)this._value).setValue(formula);
      }
   }

   public String getCellFormula() {
      if(this._value.getType() != CellType.FORMULA) {
         throw typeMismatch(CellType.FORMULA, this._value.getType(), false);
      } else {
         return ((SXSSFCell.FormulaValue)this._value).getValue();
      }
   }

   public double getNumericCellValue() {
      CellType cellType = this.getCellTypeEnum();
      switch(SXSSFCell.NamelessClass386579859.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
         return 0.0D;
      case 2:
         SXSSFCell.FormulaValue fv = (SXSSFCell.FormulaValue)this._value;
         if(fv.getFormulaType() != CellType.NUMERIC) {
            throw typeMismatch(CellType.NUMERIC, CellType.FORMULA, false);
         }

         return ((SXSSFCell.NumericFormulaValue)this._value).getPreEvaluatedValue();
      case 3:
         return ((SXSSFCell.NumericValue)this._value).getValue();
      default:
         throw typeMismatch(CellType.NUMERIC, cellType, false);
      }
   }

   public Date getDateCellValue() {
      CellType cellType = this.getCellTypeEnum();
      if(cellType == CellType.BLANK) {
         return null;
      } else {
         double value = this.getNumericCellValue();
         boolean date1904 = this.getSheet().getWorkbook().isDate1904();
         return DateUtil.getJavaDate(value, date1904);
      }
   }

   public RichTextString getRichStringCellValue() {
      CellType cellType = this.getCellTypeEnum();
      if(this.getCellTypeEnum() != CellType.STRING) {
         throw typeMismatch(CellType.STRING, cellType, false);
      } else {
         SXSSFCell.StringValue sval = (SXSSFCell.StringValue)this._value;
         if(sval.isRichText()) {
            return ((SXSSFCell.RichTextValue)this._value).getValue();
         } else {
            String plainText = this.getStringCellValue();
            return this.getSheet().getWorkbook().getCreationHelper().createRichTextString(plainText);
         }
      }
   }

   public String getStringCellValue() {
      CellType cellType = this.getCellTypeEnum();
      switch(SXSSFCell.NamelessClass386579859.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
         return "";
      case 2:
         SXSSFCell.FormulaValue fv = (SXSSFCell.FormulaValue)this._value;
         if(fv.getFormulaType() != CellType.STRING) {
            throw typeMismatch(CellType.STRING, CellType.FORMULA, false);
         }

         return ((SXSSFCell.StringFormulaValue)this._value).getPreEvaluatedValue();
      case 3:
      default:
         throw typeMismatch(CellType.STRING, cellType, false);
      case 4:
         return ((SXSSFCell.StringValue)this._value).isRichText()?((SXSSFCell.RichTextValue)this._value).getValue().getString():((SXSSFCell.PlainStringValue)this._value).getValue();
      }
   }

   public void setCellValue(boolean value) {
      this.ensureTypeOrFormulaType(CellType.BOOLEAN);
      if(this._value.getType() == CellType.FORMULA) {
         ((SXSSFCell.BooleanFormulaValue)this._value).setPreEvaluatedValue(value);
      } else {
         ((SXSSFCell.BooleanValue)this._value).setValue(value);
      }

   }

   public void setCellErrorValue(byte value) {
      this.ensureType(CellType.ERROR);
      if(this._value.getType() == CellType.FORMULA) {
         ((SXSSFCell.ErrorFormulaValue)this._value).setPreEvaluatedValue(value);
      } else {
         ((SXSSFCell.ErrorValue)this._value).setValue(value);
      }

   }

   public boolean getBooleanCellValue() {
      CellType cellType = this.getCellTypeEnum();
      switch(SXSSFCell.NamelessClass386579859.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
         return false;
      case 2:
         SXSSFCell.FormulaValue fv = (SXSSFCell.FormulaValue)this._value;
         if(fv.getFormulaType() != CellType.BOOLEAN) {
            throw typeMismatch(CellType.BOOLEAN, CellType.FORMULA, false);
         }

         return ((SXSSFCell.BooleanFormulaValue)this._value).getPreEvaluatedValue();
      case 3:
      case 4:
      default:
         throw typeMismatch(CellType.BOOLEAN, cellType, false);
      case 5:
         return ((SXSSFCell.BooleanValue)this._value).getValue();
      }
   }

   public byte getErrorCellValue() {
      CellType cellType = this.getCellTypeEnum();
      switch(SXSSFCell.NamelessClass386579859.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
         return (byte)0;
      case 2:
         SXSSFCell.FormulaValue fv = (SXSSFCell.FormulaValue)this._value;
         if(fv.getFormulaType() != CellType.ERROR) {
            throw typeMismatch(CellType.ERROR, CellType.FORMULA, false);
         }

         return ((SXSSFCell.ErrorFormulaValue)this._value).getPreEvaluatedValue();
      case 6:
         return ((SXSSFCell.ErrorValue)this._value).getValue();
      default:
         throw typeMismatch(CellType.ERROR, cellType, false);
      }
   }

   public void setCellStyle(CellStyle style) {
      this._style = style;
   }

   public CellStyle getCellStyle() {
      if(this._style == null) {
         SXSSFWorkbook wb = (SXSSFWorkbook)this.getRow().getSheet().getWorkbook();
         return wb.getCellStyleAt(0);
      } else {
         return this._style;
      }
   }

   public void setAsActiveCell() {
      this.getSheet().setActiveCell(this.getAddress());
   }

   public void setCellComment(Comment comment) {
      this.setProperty(1, comment);
   }

   public Comment getCellComment() {
      return (Comment)this.getPropertyValue(1);
   }

   public void removeCellComment() {
      this.removeProperty(1);
   }

   public Hyperlink getHyperlink() {
      return (Hyperlink)this.getPropertyValue(2);
   }

   public void setHyperlink(Hyperlink link) {
      if(link == null) {
         this.removeHyperlink();
      } else {
         this.setProperty(2, link);
         XSSFHyperlink xssfobj = (XSSFHyperlink)link;
         CellReference ref = new CellReference(this.getRowIndex(), this.getColumnIndex());
         xssfobj.getCTHyperlink().setRef(ref.formatAsString());
         this.getSheet()._sh.addHyperlink(xssfobj);
      }
   }

   public void removeHyperlink() {
      this.removeProperty(2);
      this.getSheet()._sh.removeHyperlink(this.getRowIndex(), this.getColumnIndex());
   }

   @NotImplemented
   public CellRangeAddress getArrayFormulaRange() {
      return null;
   }

   @NotImplemented
   public boolean isPartOfArrayFormulaGroup() {
      return false;
   }

   public String toString() {
      switch(SXSSFCell.NamelessClass386579859.$SwitchMap$org$apache$poi$ss$usermodel$CellType[this.getCellTypeEnum().ordinal()]) {
      case 1:
         return "";
      case 2:
         return this.getCellFormula();
      case 3:
         if(DateUtil.isCellDateFormatted(this)) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", LocaleUtil.getUserLocale());
            sdf.setTimeZone(LocaleUtil.getUserTimeZone());
            return sdf.format(this.getDateCellValue());
         }

         return this.getNumericCellValue() + "";
      case 4:
         return this.getRichStringCellValue().toString();
      case 5:
         return this.getBooleanCellValue()?"TRUE":"FALSE";
      case 6:
         return ErrorEval.getText(this.getErrorCellValue());
      default:
         return "Unknown Cell Type: " + this.getCellTypeEnum();
      }
   }

   void removeProperty(int type) {
      SXSSFCell.Property current = this._firstProperty;

      SXSSFCell.Property previous;
      for(previous = null; current != null && current.getType() != type; current = current._next) {
         previous = current;
      }

      if(current != null) {
         if(previous != null) {
            previous._next = current._next;
         } else {
            this._firstProperty = current._next;
         }
      }

   }

   void setProperty(int type, Object value) {
      SXSSFCell.Property current = this._firstProperty;

      SXSSFCell.Property previous;
      for(previous = null; current != null && current.getType() != type; current = current._next) {
         previous = current;
      }

      if(current != null) {
         current.setValue(value);
      } else {
         Object current1;
         switch(type) {
         case 1:
            current1 = new SXSSFCell.CommentProperty(value);
            break;
         case 2:
            current1 = new SXSSFCell.HyperlinkProperty(value);
            break;
         default:
            throw new IllegalArgumentException("Invalid type: " + type);
         }

         if(previous != null) {
            previous._next = (SXSSFCell.Property)current1;
         } else {
            this._firstProperty = (SXSSFCell.Property)current1;
         }
      }

   }

   Object getPropertyValue(int type) {
      return this.getPropertyValue(type, (String)null);
   }

   Object getPropertyValue(int type, String defaultValue) {
      SXSSFCell.Property current;
      for(current = this._firstProperty; current != null && current.getType() != type; current = current._next) {
         ;
      }

      return current == null?defaultValue:current.getValue();
   }

   void ensurePlainStringType() {
      if(this._value.getType() != CellType.STRING || ((SXSSFCell.StringValue)this._value).isRichText()) {
         this._value = new SXSSFCell.PlainStringValue();
      }

   }

   void ensureRichTextStringType() {
      if(this._value.getType() != CellType.STRING || !((SXSSFCell.StringValue)this._value).isRichText()) {
         this._value = new SXSSFCell.RichTextValue();
      }

   }

   void ensureType(CellType type) {
      if(this._value.getType() != type) {
         this.setType(type);
      }

   }

   void ensureFormulaType(CellType type) {
      if(this._value.getType() != CellType.FORMULA || ((SXSSFCell.FormulaValue)this._value).getFormulaType() != type) {
         this.setFormulaType(type);
      }

   }

   void ensureTypeOrFormulaType(CellType type) {
      if(this._value.getType() == type) {
         if(type == CellType.STRING && ((SXSSFCell.StringValue)this._value).isRichText()) {
            this.setType(CellType.STRING);
         }

      } else if(this._value.getType() == CellType.FORMULA) {
         if(((SXSSFCell.FormulaValue)this._value).getFormulaType() != type) {
            this.setFormulaType(type);
         }
      } else {
         this.setType(type);
      }
   }

   void setType(CellType type) {
      switch(SXSSFCell.NamelessClass386579859.$SwitchMap$org$apache$poi$ss$usermodel$CellType[type.ordinal()]) {
      case 1:
         this._value = new SXSSFCell.BlankValue();
         break;
      case 2:
         this._value = new SXSSFCell.NumericFormulaValue();
         break;
      case 3:
         this._value = new SXSSFCell.NumericValue();
         break;
      case 4:
         SXSSFCell.PlainStringValue bval1 = new SXSSFCell.PlainStringValue();
         if(this._value != null) {
            String val1 = this.convertCellValueToString();
            bval1.setValue(val1);
         }

         this._value = bval1;
         break;
      case 5:
         SXSSFCell.BooleanValue bval = new SXSSFCell.BooleanValue();
         if(this._value != null) {
            boolean val = this.convertCellValueToBoolean();
            bval.setValue(val);
         }

         this._value = bval;
         break;
      case 6:
         this._value = new SXSSFCell.ErrorValue();
         break;
      default:
         throw new IllegalArgumentException("Illegal type " + type);
      }

   }

   void setFormulaType(CellType type) {
      SXSSFCell.Value prevValue = this._value;
      switch(SXSSFCell.NamelessClass386579859.$SwitchMap$org$apache$poi$ss$usermodel$CellType[type.ordinal()]) {
      case 3:
         this._value = new SXSSFCell.NumericFormulaValue();
         break;
      case 4:
         this._value = new SXSSFCell.StringFormulaValue();
         break;
      case 5:
         this._value = new SXSSFCell.BooleanFormulaValue();
         break;
      case 6:
         this._value = new SXSSFCell.ErrorFormulaValue();
         break;
      default:
         throw new IllegalArgumentException("Illegal type " + type);
      }

      if(prevValue instanceof SXSSFCell.FormulaValue) {
         ((SXSSFCell.FormulaValue)this._value)._value = ((SXSSFCell.FormulaValue)prevValue)._value;
      }

   }

   @NotImplemented
   CellType computeTypeFromFormula(String formula) {
      return CellType.NUMERIC;
   }

   private static RuntimeException typeMismatch(CellType expectedTypeCode, CellType actualTypeCode, boolean isFormulaCell) {
      String msg = "Cannot get a " + expectedTypeCode + " value from a " + actualTypeCode + " " + (isFormulaCell?"formula ":"") + "cell";
      return new IllegalStateException(msg);
   }

   private boolean convertCellValueToBoolean() {
      CellType cellType = this.getCellTypeEnum();
      if(cellType == CellType.FORMULA) {
         cellType = this.getCachedFormulaResultTypeEnum();
      }

      switch(SXSSFCell.NamelessClass386579859.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
      case 6:
         return false;
      case 2:
      default:
         throw new RuntimeException("Unexpected cell type (" + cellType + ")");
      case 3:
         return this.getNumericCellValue() != 0.0D;
      case 4:
         String text = this.getStringCellValue();
         return Boolean.parseBoolean(text);
      case 5:
         return this.getBooleanCellValue();
      }
   }

   private String convertCellValueToString() {
      CellType cellType = this.getCellTypeEnum();
      return this.convertCellValueToString(cellType);
   }

   private String convertCellValueToString(CellType cellType) {
      switch(SXSSFCell.NamelessClass386579859.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
         return "";
      case 2:
         if(this._value != null) {
            SXSSFCell.FormulaValue fv = (SXSSFCell.FormulaValue)this._value;
            if(fv.getFormulaType() != CellType.FORMULA) {
               return this.convertCellValueToString(fv.getFormulaType());
            }
         }

         return "";
      case 3:
         return Double.toString(this.getNumericCellValue());
      case 4:
         return this.getStringCellValue();
      case 5:
         return this.getBooleanCellValue()?"TRUE":"FALSE";
      case 6:
         byte errVal = this.getErrorCellValue();
         return FormulaError.forInt(errVal).getString();
      default:
         throw new IllegalStateException("Unexpected cell type (" + cellType + ")");
      }
   }


   abstract static class StringValue implements SXSSFCell.Value {

      public CellType getType() {
         return CellType.STRING;
      }

      abstract boolean isRichText();
   }

   // $FF: synthetic class
   static class NamelessClass386579859 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$CellType = new int[CellType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.BLANK.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.FORMULA.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.NUMERIC.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.STRING.ordinal()] = 4;
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

   static class HyperlinkProperty extends SXSSFCell.Property {

      public HyperlinkProperty(Object value) {
         super(value);
      }

      public int getType() {
         return 2;
      }
   }

   static class NumericValue implements SXSSFCell.Value {

      double _value;


      public CellType getType() {
         return CellType.NUMERIC;
      }

      void setValue(double value) {
         this._value = value;
      }

      double getValue() {
         return this._value;
      }
   }

   abstract static class Property {

      static final int COMMENT = 1;
      static final int HYPERLINK = 2;
      Object _value;
      SXSSFCell.Property _next;


      public Property(Object value) {
         this._value = value;
      }

      abstract int getType();

      void setValue(Object value) {
         this._value = value;
      }

      Object getValue() {
         return this._value;
      }
   }

   static class BooleanValue implements SXSSFCell.Value {

      boolean _value;


      public CellType getType() {
         return CellType.BOOLEAN;
      }

      void setValue(boolean value) {
         this._value = value;
      }

      boolean getValue() {
         return this._value;
      }
   }

   static class RichTextValue extends SXSSFCell.StringValue {

      RichTextString _value;


      public CellType getType() {
         return CellType.STRING;
      }

      void setValue(RichTextString value) {
         this._value = value;
      }

      RichTextString getValue() {
         return this._value;
      }

      boolean isRichText() {
         return true;
      }
   }

   static class PlainStringValue extends SXSSFCell.StringValue {

      String _value;


      void setValue(String value) {
         this._value = value;
      }

      String getValue() {
         return this._value;
      }

      boolean isRichText() {
         return false;
      }
   }

   interface Value {

      CellType getType();
   }

   static class NumericFormulaValue extends SXSSFCell.FormulaValue {

      double _preEvaluatedValue;


      CellType getFormulaType() {
         return CellType.NUMERIC;
      }

      void setPreEvaluatedValue(double value) {
         this._preEvaluatedValue = value;
      }

      double getPreEvaluatedValue() {
         return this._preEvaluatedValue;
      }
   }

   static class BooleanFormulaValue extends SXSSFCell.FormulaValue {

      boolean _preEvaluatedValue;


      CellType getFormulaType() {
         return CellType.BOOLEAN;
      }

      void setPreEvaluatedValue(boolean value) {
         this._preEvaluatedValue = value;
      }

      boolean getPreEvaluatedValue() {
         return this._preEvaluatedValue;
      }
   }

   static class StringFormulaValue extends SXSSFCell.FormulaValue {

      String _preEvaluatedValue;


      CellType getFormulaType() {
         return CellType.STRING;
      }

      void setPreEvaluatedValue(String value) {
         this._preEvaluatedValue = value;
      }

      String getPreEvaluatedValue() {
         return this._preEvaluatedValue;
      }
   }

   static class ErrorValue implements SXSSFCell.Value {

      byte _value;


      public CellType getType() {
         return CellType.ERROR;
      }

      void setValue(byte value) {
         this._value = value;
      }

      byte getValue() {
         return this._value;
      }
   }

   static class BlankValue implements SXSSFCell.Value {

      public CellType getType() {
         return CellType.BLANK;
      }
   }

   static class ErrorFormulaValue extends SXSSFCell.FormulaValue {

      byte _preEvaluatedValue;


      CellType getFormulaType() {
         return CellType.ERROR;
      }

      void setPreEvaluatedValue(byte value) {
         this._preEvaluatedValue = value;
      }

      byte getPreEvaluatedValue() {
         return this._preEvaluatedValue;
      }
   }

   abstract static class FormulaValue implements SXSSFCell.Value {

      String _value;


      public CellType getType() {
         return CellType.FORMULA;
      }

      void setValue(String value) {
         this._value = value;
      }

      String getValue() {
         return this._value;
      }

      abstract CellType getFormulaType();
   }

   static class CommentProperty extends SXSSFCell.Property {

      public CommentProperty(Object value) {
         super(value);
      }

      public int getType() {
         return 1;
      }
   }
}
