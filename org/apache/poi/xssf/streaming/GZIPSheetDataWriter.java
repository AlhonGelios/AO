package org.apache.poi.xssf.streaming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.poi.util.TempFile;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.streaming.SheetDataWriter;

public class GZIPSheetDataWriter extends SheetDataWriter {

   public GZIPSheetDataWriter() throws IOException {}

   public GZIPSheetDataWriter(SharedStringsTable sharedStringsTable) throws IOException {
      super(sharedStringsTable);
   }

   public File createTempFile() throws IOException {
      return TempFile.createTempFile("poi-sxssf-sheet-xml", ".gz");
   }

   public Writer createWriter(File fd) throws IOException {
      return new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(fd)), "UTF-8");
   }

   public InputStream getWorksheetXMLInputStream() throws IOException {
      File fd = this.getTempFile();
      return new GZIPInputStream(new FileInputStream(fd));
   }
}
