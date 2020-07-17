package org.apache.poi.ss.usermodel;

import java.util.Calendar;
import java.util.Date;
import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.Removal;

public interface Cell {

   @Removal(
      version = "4.0"
   )
   int CELL_TYPE_NUMERIC = 0;
   @Removal(
      version = "4.0"
   )
   int CELL_TYPE_STRING = 1;
   @Removal(
      version = "4.0"
   )
   int CELL_TYPE_FORMULA = 2;
   @Removal(
      version = "4.0"
   )
   int CELL_TYPE_BLANK = 3;
   @Removal(
      version = "4.0"
   )
   int CELL_TYPE_BOOLEAN = 4;
   @Removal(
      version = "4.0"
   )
   int CELL_TYPE_ERROR = 5;


   int getColumnIndex();

   int getRowIndex();

   Sheet getSheet();

   Row getRow();

   @Removal(
      version = "4.0"
   )
   void setCellType(int var1);

   void setCellType(CellType var1);

   int getCellType();

   @Removal(
      version = "4.2"
   )
   CellType getCellTypeEnum();

   int getCachedFormulaResultType();

   CellType getCachedFormulaResultTypeEnum();

   void setCellValue(double var1);

   void setCellValue(Date var1);

   void setCellValue(Calendar var1);

   void setCellValue(RichTextString var1);

   void setCellValue(String var1);

   void setCellFormula(String var1) throws FormulaParseException;

   String getCellFormula();

   double getNumericCellValue();

   Date getDateCellValue();

   RichTextString getRichStringCellValue();

   String getStringCellValue();

   void setCellValue(boolean var1);

   void setCellErrorValue(byte var1);

   boolean getBooleanCellValue();

   byte getErrorCellValue();

   void setCellStyle(CellStyle var1);

   CellStyle getCellStyle();

   void setAsActiveCell();

   CellAddress getAddress();

   void setCellComment(Comment var1);

   Comment getCellComment();

   void removeCellComment();

   Hyperlink getHyperlink();

   void setHyperlink(Hyperlink var1);

   void removeHyperlink();

   CellRangeAddress getArrayFormulaRange();

   boolean isPartOfArrayFormulaGroup();
}
