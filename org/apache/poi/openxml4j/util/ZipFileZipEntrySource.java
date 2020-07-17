package org.apache.poi.openxml4j.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.poi.openxml4j.util.ZipEntrySource;

public class ZipFileZipEntrySource implements ZipEntrySource {

   private ZipFile zipArchive;


   public ZipFileZipEntrySource(ZipFile zipFile) {
      this.zipArchive = zipFile;
   }

   public void close() throws IOException {
      if(this.zipArchive != null) {
         this.zipArchive.close();
      }

      this.zipArchive = null;
   }

   public boolean isClosed() {
      return this.zipArchive == null;
   }

   public Enumeration getEntries() {
      if(this.zipArchive == null) {
         throw new IllegalStateException("Zip File is closed");
      } else {
         return this.zipArchive.entries();
      }
   }

   public InputStream getInputStream(ZipEntry entry) throws IOException {
      if(this.zipArchive == null) {
         throw new IllegalStateException("Zip File is closed");
      } else {
         return this.zipArchive.getInputStream(entry);
      }
   }
}
