package org.apache.poi.xssf.streaming;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.NotImplemented;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.TempFile;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.streaming.GZIPSheetDataWriter;
import org.apache.poi.xssf.streaming.SXSSFCreationHelper;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SheetDataWriter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SXSSFWorkbook implements Workbook {

   public static final int DEFAULT_WINDOW_SIZE = 100;
   private static final POILogger logger = POILogFactory.getLogger(SXSSFWorkbook.class);
   private final XSSFWorkbook _wb;
   private final Map _sxFromXHash;
   private final Map _xFromSxHash;
   private int _randomAccessWindowSize;
   private boolean _compressTmpFiles;
   private final SharedStringsTable _sharedStringSource;


   public SXSSFWorkbook() {
      this((XSSFWorkbook)null);
   }

   public SXSSFWorkbook(XSSFWorkbook workbook) {
      this(workbook, 100);
   }

   public SXSSFWorkbook(XSSFWorkbook workbook, int rowAccessWindowSize) {
      this(workbook, rowAccessWindowSize, false);
   }

   public SXSSFWorkbook(XSSFWorkbook workbook, int rowAccessWindowSize, boolean compressTmpFiles) {
      this(workbook, rowAccessWindowSize, compressTmpFiles, false);
   }

   public SXSSFWorkbook(XSSFWorkbook workbook, int rowAccessWindowSize, boolean compressTmpFiles, boolean useSharedStringsTable) {
      this._sxFromXHash = new HashMap();
      this._xFromSxHash = new HashMap();
      this._randomAccessWindowSize = 100;
      this._compressTmpFiles = false;
      this.setRandomAccessWindowSize(rowAccessWindowSize);
      this.setCompressTempFiles(compressTmpFiles);
      if(workbook == null) {
         this._wb = new XSSFWorkbook();
         this._sharedStringSource = useSharedStringsTable?this._wb.getSharedStringSource():null;
      } else {
         this._wb = workbook;
         this._sharedStringSource = useSharedStringsTable?this._wb.getSharedStringSource():null;
         int numberOfSheets = this._wb.getNumberOfSheets();

         for(int i = 0; i < numberOfSheets; ++i) {
            XSSFSheet sheet = this._wb.getSheetAt(i);
            this.createAndRegisterSXSSFSheet(sheet);
         }
      }

   }

   public SXSSFWorkbook(int rowAccessWindowSize) {
      this((XSSFWorkbook)null, rowAccessWindowSize);
   }

   public int getRandomAccessWindowSize() {
      return this._randomAccessWindowSize;
   }

   private void setRandomAccessWindowSize(int rowAccessWindowSize) {
      if(rowAccessWindowSize != 0 && rowAccessWindowSize >= -1) {
         this._randomAccessWindowSize = rowAccessWindowSize;
      } else {
         throw new IllegalArgumentException("rowAccessWindowSize must be greater than 0 or -1");
      }
   }

   public void setCompressTempFiles(boolean compress) {
      this._compressTmpFiles = compress;
   }

   SheetDataWriter createSheetDataWriter() throws IOException {
      return (SheetDataWriter)(this._compressTmpFiles?new GZIPSheetDataWriter(this._sharedStringSource):new SheetDataWriter(this._sharedStringSource));
   }

   XSSFSheet getXSSFSheet(SXSSFSheet sheet) {
      return (XSSFSheet)this._sxFromXHash.get(sheet);
   }

   SXSSFSheet getSXSSFSheet(XSSFSheet sheet) {
      return (SXSSFSheet)this._xFromSxHash.get(sheet);
   }

   void registerSheetMapping(SXSSFSheet sxSheet, XSSFSheet xSheet) {
      this._sxFromXHash.put(sxSheet, xSheet);
      this._xFromSxHash.put(xSheet, sxSheet);
   }

   void deregisterSheetMapping(XSSFSheet xSheet) {
      SXSSFSheet sxSheet = this.getSXSSFSheet(xSheet);

      try {
         sxSheet.getSheetDataWriter().close();
      } catch (IOException var4) {
         ;
      }

      this._sxFromXHash.remove(sxSheet);
      this._xFromSxHash.remove(xSheet);
   }

   private XSSFSheet getSheetFromZipEntryName(String sheetRef) {
      Iterator i$ = this._sxFromXHash.values().iterator();

      XSSFSheet sheet;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         sheet = (XSSFSheet)i$.next();
      } while(!sheetRef.equals(sheet.getPackagePart().getPartName().getName().substring(1)));

      return sheet;
   }

   private void injectData(File zipfile, OutputStream out) throws IOException {
      ZipFile zip = new ZipFile(zipfile);

      try {
         ZipOutputStream zos = new ZipOutputStream(out);

         InputStream is;
         try {
            for(Enumeration en = zip.entries(); en.hasMoreElements(); is.close()) {
               ZipEntry ze = (ZipEntry)en.nextElement();
               zos.putNextEntry(new ZipEntry(ze.getName()));
               is = zip.getInputStream(ze);
               XSSFSheet xSheet = this.getSheetFromZipEntryName(ze.getName());
               if(xSheet != null) {
                  SXSSFSheet sxSheet = this.getSXSSFSheet(xSheet);
                  InputStream xis = sxSheet.getWorksheetXMLInputStream();

                  try {
                     copyStreamAndInjectWorksheet(is, zos, xis);
                  } finally {
                     xis.close();
                  }
               } else {
                  copyStream(is, zos);
               }
            }
         } finally {
            zos.close();
         }
      } finally {
         zip.close();
      }

   }

   private static void copyStream(InputStream in, OutputStream out) throws IOException {
      byte[] chunk = new byte[1024];

      int count;
      while((count = in.read(chunk)) >= 0) {
         out.write(chunk, 0, count);
      }

   }

   private static void copyStreamAndInjectWorksheet(InputStream in, OutputStream out, InputStream worksheetData) throws IOException {
      InputStreamReader inReader = new InputStreamReader(in, "UTF-8");
      OutputStreamWriter outWriter = new OutputStreamWriter(out, "UTF-8");
      boolean needsStartTag = true;
      int pos = 0;
      String s = "<sheetData";
      int n = s.length();

      int c;
      while((c = inReader.read()) != -1) {
         if(c == s.charAt(pos)) {
            ++pos;
            if(pos == n) {
               if(!"<sheetData".equals(s)) {
                  break;
               }

               c = inReader.read();
               if(c == -1) {
                  outWriter.write(s);
                  break;
               }

               if(c == 62) {
                  outWriter.write(s);
                  outWriter.write(c);
                  s = "</sheetData>";
                  n = s.length();
                  pos = 0;
                  needsStartTag = false;
               } else if(c == 47) {
                  c = inReader.read();
                  if(c == -1) {
                     outWriter.write(s);
                     break;
                  }

                  if(c == 62) {
                     break;
                  }

                  outWriter.write(s);
                  outWriter.write(47);
                  outWriter.write(c);
                  pos = 0;
               } else {
                  outWriter.write(s);
                  outWriter.write(47);
                  outWriter.write(c);
                  pos = 0;
               }
            }
         } else {
            if(pos > 0) {
               outWriter.write(s, 0, pos);
            }

            if(c == s.charAt(0)) {
               pos = 1;
            } else {
               outWriter.write(c);
               pos = 0;
            }
         }
      }

      outWriter.flush();
      if(needsStartTag) {
         outWriter.write("<sheetData>\n");
         outWriter.flush();
      }

      copyStream(worksheetData, out);
      outWriter.write("</sheetData>");
      outWriter.flush();

      while((c = inReader.read()) != -1) {
         outWriter.write(c);
      }

      outWriter.flush();
   }

   public XSSFWorkbook getXSSFWorkbook() {
      return this._wb;
   }

   public int getActiveSheetIndex() {
      return this._wb.getActiveSheetIndex();
   }

   public void setActiveSheet(int sheetIndex) {
      this._wb.setActiveSheet(sheetIndex);
   }

   public int getFirstVisibleTab() {
      return this._wb.getFirstVisibleTab();
   }

   public void setFirstVisibleTab(int sheetIndex) {
      this._wb.setFirstVisibleTab(sheetIndex);
   }

   public void setSheetOrder(String sheetname, int pos) {
      this._wb.setSheetOrder(sheetname, pos);
   }

   public void setSelectedTab(int index) {
      this._wb.setSelectedTab(index);
   }

   public void setSheetName(int sheet, String name) {
      this._wb.setSheetName(sheet, name);
   }

   public String getSheetName(int sheet) {
      return this._wb.getSheetName(sheet);
   }

   public int getSheetIndex(String name) {
      return this._wb.getSheetIndex(name);
   }

   public int getSheetIndex(Sheet sheet) {
      return this._wb.getSheetIndex((Sheet)this.getXSSFSheet((SXSSFSheet)sheet));
   }

   public SXSSFSheet createSheet() {
      return this.createAndRegisterSXSSFSheet(this._wb.createSheet());
   }

   SXSSFSheet createAndRegisterSXSSFSheet(XSSFSheet xSheet) {
      SXSSFSheet sxSheet;
      try {
         sxSheet = new SXSSFSheet(this, xSheet);
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }

      this.registerSheetMapping(sxSheet, xSheet);
      return sxSheet;
   }

   public SXSSFSheet createSheet(String sheetname) {
      return this.createAndRegisterSXSSFSheet(this._wb.createSheet(sheetname));
   }

   @NotImplemented
   public Sheet cloneSheet(int sheetNum) {
      throw new RuntimeException("NotImplemented");
   }

   public int getNumberOfSheets() {
      return this._wb.getNumberOfSheets();
   }

   public Iterator sheetIterator() {
      return new SXSSFWorkbook.SheetIterator();
   }

   public Iterator iterator() {
      return this.sheetIterator();
   }

   public SXSSFSheet getSheetAt(int index) {
      return this.getSXSSFSheet(this._wb.getSheetAt(index));
   }

   public SXSSFSheet getSheet(String name) {
      return this.getSXSSFSheet(this._wb.getSheet(name));
   }

   public void removeSheetAt(int index) {
      XSSFSheet xSheet = this._wb.getSheetAt(index);
      SXSSFSheet sxSheet = this.getSXSSFSheet(xSheet);
      this._wb.removeSheetAt(index);
      this.deregisterSheetMapping(xSheet);

      try {
         sxSheet.dispose();
      } catch (IOException var5) {
         logger.log(5, new Object[]{var5});
      }

   }

   public Font createFont() {
      return this._wb.createFont();
   }

   public Font findFont(short boldWeight, short color, short fontHeight, String name, boolean italic, boolean strikeout, short typeOffset, byte underline) {
      return this._wb.findFont(boldWeight, color, fontHeight, name, italic, strikeout, typeOffset, underline);
   }

   public Font findFont(boolean bold, short color, short fontHeight, String name, boolean italic, boolean strikeout, short typeOffset, byte underline) {
      return this._wb.findFont(bold, color, fontHeight, name, italic, strikeout, typeOffset, underline);
   }

   public short getNumberOfFonts() {
      return this._wb.getNumberOfFonts();
   }

   public Font getFontAt(short idx) {
      return this._wb.getFontAt(idx);
   }

   public CellStyle createCellStyle() {
      return this._wb.createCellStyle();
   }

   public int getNumCellStyles() {
      return this._wb.getNumCellStyles();
   }

   public CellStyle getCellStyleAt(int idx) {
      return this._wb.getCellStyleAt(idx);
   }

   public void close() throws IOException {
      Iterator i$ = this._xFromSxHash.values().iterator();

      while(i$.hasNext()) {
         SXSSFSheet sheet = (SXSSFSheet)i$.next();

         try {
            sheet.getSheetDataWriter().close();
         } catch (IOException var4) {
            ;
         }
      }

      this._wb.close();
   }

   public void write(OutputStream stream) throws IOException {
      Iterator tmplFile = this._xFromSxHash.values().iterator();

      while(tmplFile.hasNext()) {
         SXSSFSheet os = (SXSSFSheet)tmplFile.next();
         os.flushRows();
      }

      File tmplFile1 = TempFile.createTempFile("poi-sxssf-template", ".xlsx");

      try {
         FileOutputStream os1 = new FileOutputStream(tmplFile1);

         try {
            this._wb.write(os1);
         } finally {
            os1.close();
         }

         this.injectData(tmplFile1, stream);
      } finally {
         if(!tmplFile1.delete()) {
            throw new IOException("Could not delete temporary file after processing: " + tmplFile1);
         }

      }

   }

   public boolean dispose() {
      boolean success = true;
      Iterator i$ = this._sxFromXHash.keySet().iterator();

      while(i$.hasNext()) {
         SXSSFSheet sheet = (SXSSFSheet)i$.next();

         try {
            success = sheet.dispose() && success;
         } catch (IOException var5) {
            logger.log(5, new Object[]{var5});
            success = false;
         }
      }

      return success;
   }

   public int getNumberOfNames() {
      return this._wb.getNumberOfNames();
   }

   public Name getName(String name) {
      return this._wb.getName(name);
   }

   public List getNames(String name) {
      return this._wb.getNames(name);
   }

   public List getAllNames() {
      return this._wb.getAllNames();
   }

   @Deprecated
   public Name getNameAt(int nameIndex) {
      return this._wb.getNameAt(nameIndex);
   }

   public Name createName() {
      return this._wb.createName();
   }

   @Deprecated
   public int getNameIndex(String name) {
      return this._wb.getNameIndex(name);
   }

   @Deprecated
   public void removeName(int index) {
      this._wb.removeName(index);
   }

   @Deprecated
   public void removeName(String name) {
      this._wb.removeName(name);
   }

   public void removeName(Name name) {
      this._wb.removeName(name);
   }

   public void setPrintArea(int sheetIndex, String reference) {
      this._wb.setPrintArea(sheetIndex, reference);
   }

   public void setPrintArea(int sheetIndex, int startColumn, int endColumn, int startRow, int endRow) {
      this._wb.setPrintArea(sheetIndex, startColumn, endColumn, startRow, endRow);
   }

   public String getPrintArea(int sheetIndex) {
      return this._wb.getPrintArea(sheetIndex);
   }

   public void removePrintArea(int sheetIndex) {
      this._wb.removePrintArea(sheetIndex);
   }

   public Row.MissingCellPolicy getMissingCellPolicy() {
      return this._wb.getMissingCellPolicy();
   }

   public void setMissingCellPolicy(Row.MissingCellPolicy missingCellPolicy) {
      this._wb.setMissingCellPolicy(missingCellPolicy);
   }

   public DataFormat createDataFormat() {
      return this._wb.createDataFormat();
   }

   public int addPicture(byte[] pictureData, int format) {
      return this._wb.addPicture(pictureData, format);
   }

   public List getAllPictures() {
      return this._wb.getAllPictures();
   }

   public CreationHelper getCreationHelper() {
      return new SXSSFCreationHelper(this);
   }

   protected boolean isDate1904() {
      return this._wb.isDate1904();
   }

   public boolean isHidden() {
      return this._wb.isHidden();
   }

   public void setHidden(boolean hiddenFlag) {
      this._wb.setHidden(hiddenFlag);
   }

   public boolean isSheetHidden(int sheetIx) {
      return this._wb.isSheetHidden(sheetIx);
   }

   public boolean isSheetVeryHidden(int sheetIx) {
      return this._wb.isSheetVeryHidden(sheetIx);
   }

   public void setSheetHidden(int sheetIx, boolean hidden) {
      this._wb.setSheetHidden(sheetIx, hidden);
   }

   public void setSheetHidden(int sheetIx, int hidden) {
      this._wb.setSheetHidden(sheetIx, hidden);
   }

   @NotImplemented
   public int linkExternalWorkbook(String name, Workbook workbook) {
      throw new RuntimeException("NotImplemented");
   }

   public void addToolPack(UDFFinder toopack) {
      this._wb.addToolPack(toopack);
   }

   public void setForceFormulaRecalculation(boolean value) {
      this._wb.setForceFormulaRecalculation(value);
   }

   public boolean getForceFormulaRecalculation() {
      return this._wb.getForceFormulaRecalculation();
   }

   public SpreadsheetVersion getSpreadsheetVersion() {
      return SpreadsheetVersion.EXCEL2007;
   }


   private final class SheetIterator implements Iterator {

      private final Iterator it;


      public SheetIterator() {
         this.it = SXSSFWorkbook.this._wb.iterator();
      }

      public boolean hasNext() {
         return this.it.hasNext();
      }

      public Sheet next() throws NoSuchElementException {
         XSSFSheet xssfSheet = (XSSFSheet)this.it.next();
         return SXSSFWorkbook.this.getSXSSFSheet(xssfSheet);
      }

      public void remove() throws IllegalStateException {
         throw new UnsupportedOperationException("remove method not supported on XSSFWorkbook.iterator(). Use Sheet.removeSheetAt(int) instead.");
      }
   }
}
