package org.apache.poi.xssf.streaming;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaError;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.TempFile;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellType;

public class SheetDataWriter {

   private static final POILogger logger = POILogFactory.getLogger(SheetDataWriter.class);
   private final File _fd;
   private final Writer _out;
   private int _rownum;
   private int _numberOfFlushedRows;
   private int _lowestIndexOfFlushedRows;
   private int _numberOfCellsOfLastFlushedRow;
   private int _numberLastFlushedRow;
   private SharedStringsTable _sharedStringSource;


   public SheetDataWriter() throws IOException {
      this._numberLastFlushedRow = -1;
      this._fd = this.createTempFile();
      this._out = this.createWriter(this._fd);
   }

   public SheetDataWriter(SharedStringsTable sharedStringsTable) throws IOException {
      this();
      this._sharedStringSource = sharedStringsTable;
   }

   public File createTempFile() throws IOException {
      return TempFile.createTempFile("poi-sxssf-sheet", ".xml");
   }

   public Writer createWriter(File fd) throws IOException {
      return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fd), "UTF-8"));
   }

   public void close() throws IOException {
      this._out.flush();
      this._out.close();
   }

   File getTempFile() {
      return this._fd;
   }

   public InputStream getWorksheetXMLInputStream() throws IOException {
      File fd = this.getTempFile();
      return new FileInputStream(fd);
   }

   public int getNumberOfFlushedRows() {
      return this._numberOfFlushedRows;
   }

   public int getNumberOfCellsOfLastFlushedRow() {
      return this._numberOfCellsOfLastFlushedRow;
   }

   public int getLowestIndexOfFlushedRows() {
      return this._lowestIndexOfFlushedRows;
   }

   public int getLastFlushedRow() {
      return this._numberLastFlushedRow;
   }

   protected void finalize() throws Throwable {
      if(!this._fd.delete()) {
         logger.log(7, new Object[]{"Can\'t delete temporary encryption file: " + this._fd});
      }

      super.finalize();
   }

   public void writeRow(int rownum, SXSSFRow row) throws IOException {
      if(this._numberOfFlushedRows == 0) {
         this._lowestIndexOfFlushedRows = rownum;
      }

      this._numberLastFlushedRow = Math.max(rownum, this._numberLastFlushedRow);
      this._numberOfCellsOfLastFlushedRow = row.getLastCellNum();
      ++this._numberOfFlushedRows;
      this.beginRow(rownum, row);
      Iterator cells = row.allCellsIterator();
      int columnIndex = 0;

      while(cells.hasNext()) {
         this.writeCell(columnIndex++, (Cell)cells.next());
      }

      this.endRow();
   }

   void beginRow(int rownum, SXSSFRow row) throws IOException {
      this._out.write("<row r=\"" + (rownum + 1) + "\"");
      if(row.hasCustomHeight()) {
         this._out.write(" customHeight=\"true\"  ht=\"" + row.getHeightInPoints() + "\"");
      }

      if(row.getZeroHeight()) {
         this._out.write(" hidden=\"true\"");
      }

      if(row.isFormatted()) {
         this._out.write(" s=\"" + row.getRowStyleIndex() + "\"");
         this._out.write(" customFormat=\"1\"");
      }

      if(row.getOutlineLevel() != 0) {
         this._out.write(" outlineLevel=\"" + row.getOutlineLevel() + "\"");
      }

      if(row.getHidden() != null) {
         this._out.write(" hidden=\"" + (row.getHidden().booleanValue()?"1":"0") + "\"");
      }

      if(row.getCollapsed() != null) {
         this._out.write(" collapsed=\"" + (row.getCollapsed().booleanValue()?"1":"0") + "\"");
      }

      this._out.write(">\n");
      this._rownum = rownum;
   }

   void endRow() throws IOException {
      this._out.write("</row>\n");
   }

   public void writeCell(int columnIndex, Cell cell) throws IOException {
      if(cell != null) {
         String ref = (new CellReference(this._rownum, columnIndex)).formatAsString();
         this._out.write("<c r=\"" + ref + "\"");
         CellStyle cellStyle = cell.getCellStyle();
         if(cellStyle.getIndex() != 0) {
            this._out.write(" s=\"" + (cellStyle.getIndex() & '\uffff') + "\"");
         }

         CellType cellType = cell.getCellTypeEnum();
         label36:
         switch(SheetDataWriter.NamelessClass267011255.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
         case 1:
            this._out.write(" t=\"n\">");
            this._out.write("<v>" + cell.getNumericCellValue() + "</v>");
            break;
         case 2:
            this._out.write(">");
            break;
         case 3:
            this._out.write(">");
            this._out.write("<f>");
            this.outputQuotedString(cell.getCellFormula());
            this._out.write("</f>");
            switch(SheetDataWriter.NamelessClass267011255.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cell.getCachedFormulaResultTypeEnum().ordinal()]) {
            case 1:
               double error2 = cell.getNumericCellValue();
               if(!Double.isNaN(error2)) {
                  this._out.write("<v>" + error2 + "</v>");
               }
            default:
               break label36;
            }
         case 4:
            if(this._sharedStringSource != null) {
               XSSFRichTextString error1 = new XSSFRichTextString(cell.getStringCellValue());
               int sRef = this._sharedStringSource.addEntry(error1.getCTRst());
               this._out.write(" t=\"" + STCellType.S.toString() + "\">");
               this._out.write("<v>");
               this._out.write(String.valueOf(sRef));
               this._out.write("</v>");
            } else {
               this._out.write(" t=\"inlineStr\">");
               this._out.write("<is><t");
               if(this.hasLeadingTrailingSpaces(cell.getStringCellValue())) {
                  this._out.write(" xml:space=\"preserve\"");
               }

               this._out.write(">");
               this.outputQuotedString(cell.getStringCellValue());
               this._out.write("</t></is>");
            }
            break;
         case 5:
            this._out.write(" t=\"b\">");
            this._out.write("<v>" + (cell.getBooleanCellValue()?"1":"0") + "</v>");
            break;
         case 6:
            FormulaError error = FormulaError.forInt(cell.getErrorCellValue());
            this._out.write(" t=\"e\">");
            this._out.write("<v>" + error.getString() + "</v>");
            break;
         default:
            throw new IllegalStateException("Invalid cell type: " + cellType);
         }

         this._out.write("</c>");
      }
   }

   boolean hasLeadingTrailingSpaces(String str) {
      if(str != null && str.length() > 0) {
         char firstChar = str.charAt(0);
         char lastChar = str.charAt(str.length() - 1);
         return Character.isWhitespace(firstChar) || Character.isWhitespace(lastChar);
      } else {
         return false;
      }
   }

   protected void outputQuotedString(String s) throws IOException {
      if(s != null && s.length() != 0) {
         char[] chars = s.toCharArray();
         int last = 0;
         int length = s.length();

         for(int counter = 0; counter < length; ++counter) {
            char c = chars[counter];
            switch(c) {
            case 9:
               if(counter > last) {
                  this._out.write(chars, last, counter - last);
               }

               this._out.write("&#x9;");
               last = counter + 1;
               break;
            case 10:
            case 13:
               if(counter > last) {
                  this._out.write(chars, last, counter - last);
               }

               this._out.write("&#xa;");
               last = counter + 1;
               break;
            case 34:
               if(counter > last) {
                  this._out.write(chars, last, counter - last);
               }

               last = counter + 1;
               this._out.write("&quot;");
               break;
            case 38:
               if(counter > last) {
                  this._out.write(chars, last, counter - last);
               }

               last = counter + 1;
               this._out.write("&amp;");
               break;
            case 60:
               if(counter > last) {
                  this._out.write(chars, last, counter - last);
               }

               last = counter + 1;
               this._out.write("&lt;");
               break;
            case 62:
               if(counter > last) {
                  this._out.write(chars, last, counter - last);
               }

               last = counter + 1;
               this._out.write("&gt;");
               break;
            case 160:
               if(counter > last) {
                  this._out.write(chars, last, counter - last);
               }

               this._out.write("&#xa0;");
               last = counter + 1;
               break;
            default:
               if(c >= 32 && !Character.isLowSurrogate(c) && !Character.isHighSurrogate(c) && ('\ufffe' > c || c > '\uffff')) {
                  if(c > 127) {
                     if(counter > last) {
                        this._out.write(chars, last, counter - last);
                     }

                     last = counter + 1;
                     this._out.write("&#");
                     this._out.write(String.valueOf(c));
                     this._out.write(";");
                  }
               } else {
                  if(counter > last) {
                     this._out.write(chars, last, counter - last);
                  }

                  this._out.write(63);
                  last = counter + 1;
               }
            }
         }

         if(last < length) {
            this._out.write(chars, last, length - last);
         }

      }
   }

   boolean dispose() throws IOException {
      boolean ret;
      try {
         this._out.close();
      } finally {
         ret = this._fd.delete();
      }

      return ret;
   }


   // $FF: synthetic class
   static class NamelessClass267011255 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$CellType = new int[CellType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.NUMERIC.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.BLANK.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.FORMULA.ordinal()] = 3;
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
}
