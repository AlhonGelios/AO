package org.apache.poi.ss.usermodel;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public interface Workbook extends Closeable, Iterable {

   int PICTURE_TYPE_EMF = 2;
   int PICTURE_TYPE_WMF = 3;
   int PICTURE_TYPE_PICT = 4;
   int PICTURE_TYPE_JPEG = 5;
   int PICTURE_TYPE_PNG = 6;
   int PICTURE_TYPE_DIB = 7;
   int SHEET_STATE_VISIBLE = 0;
   int SHEET_STATE_HIDDEN = 1;
   int SHEET_STATE_VERY_HIDDEN = 2;


   int getActiveSheetIndex();

   void setActiveSheet(int var1);

   int getFirstVisibleTab();

   void setFirstVisibleTab(int var1);

   void setSheetOrder(String var1, int var2);

   void setSelectedTab(int var1);

   void setSheetName(int var1, String var2);

   String getSheetName(int var1);

   int getSheetIndex(String var1);

   int getSheetIndex(Sheet var1);

   Sheet createSheet();

   Sheet createSheet(String var1);

   Sheet cloneSheet(int var1);

   Iterator sheetIterator();

   int getNumberOfSheets();

   Sheet getSheetAt(int var1);

   Sheet getSheet(String var1);

   void removeSheetAt(int var1);

   Font createFont();

   Font findFont(short var1, short var2, short var3, String var4, boolean var5, boolean var6, short var7, byte var8);

   Font findFont(boolean var1, short var2, short var3, String var4, boolean var5, boolean var6, short var7, byte var8);

   short getNumberOfFonts();

   Font getFontAt(short var1);

   CellStyle createCellStyle();

   int getNumCellStyles();

   CellStyle getCellStyleAt(int var1);

   void write(OutputStream var1) throws IOException;

   void close() throws IOException;

   int getNumberOfNames();

   Name getName(String var1);

   List getNames(String var1);

   List getAllNames();

   Name getNameAt(int var1);

   Name createName();

   int getNameIndex(String var1);

   void removeName(int var1);

   void removeName(String var1);

   void removeName(Name var1);

   int linkExternalWorkbook(String var1, Workbook var2);

   void setPrintArea(int var1, String var2);

   void setPrintArea(int var1, int var2, int var3, int var4, int var5);

   String getPrintArea(int var1);

   void removePrintArea(int var1);

   Row.MissingCellPolicy getMissingCellPolicy();

   void setMissingCellPolicy(Row.MissingCellPolicy var1);

   DataFormat createDataFormat();

   int addPicture(byte[] var1, int var2);

   List getAllPictures();

   CreationHelper getCreationHelper();

   boolean isHidden();

   void setHidden(boolean var1);

   boolean isSheetHidden(int var1);

   boolean isSheetVeryHidden(int var1);

   void setSheetHidden(int var1, boolean var2);

   void setSheetHidden(int var1, int var2);

   void addToolPack(UDFFinder var1);

   void setForceFormulaRecalculation(boolean var1);

   boolean getForceFormulaRecalculation();

   SpreadsheetVersion getSpreadsheetVersion();
}
