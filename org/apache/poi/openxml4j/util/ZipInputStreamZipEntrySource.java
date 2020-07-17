package org.apache.poi.openxml4j.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import org.apache.poi.openxml4j.util.ZipEntrySource;
import org.apache.poi.openxml4j.util.ZipSecureFile;

public class ZipInputStreamZipEntrySource implements ZipEntrySource {

   private ArrayList zipEntries = new ArrayList();


   public ZipInputStreamZipEntrySource(ZipSecureFile.ThresholdInputStream inp) throws IOException {
      boolean going = true;

      while(going) {
         ZipEntry zipEntry = inp.getNextEntry();
         if(zipEntry == null) {
            going = false;
         } else {
            ZipInputStreamZipEntrySource.FakeZipEntry entry = new ZipInputStreamZipEntrySource.FakeZipEntry(zipEntry, inp);
            inp.closeEntry();
            this.zipEntries.add(entry);
         }
      }

      inp.close();
   }

   public Enumeration getEntries() {
      return new ZipInputStreamZipEntrySource.EntryEnumerator((ZipInputStreamZipEntrySource.NamelessClass381508013)null);
   }

   public InputStream getInputStream(ZipEntry zipEntry) {
      assert zipEntry instanceof ZipInputStreamZipEntrySource.FakeZipEntry;

      ZipInputStreamZipEntrySource.FakeZipEntry entry = (ZipInputStreamZipEntrySource.FakeZipEntry)zipEntry;
      return entry.getInputStream();
   }

   public void close() {
      this.zipEntries = null;
   }

   public boolean isClosed() {
      return this.zipEntries == null;
   }


   // $FF: synthetic class
   static class NamelessClass381508013 {
   }

   private class EntryEnumerator implements Enumeration {

      private Iterator iterator;


      private EntryEnumerator() {
         this.iterator = ZipInputStreamZipEntrySource.this.zipEntries.iterator();
      }

      public boolean hasMoreElements() {
         return this.iterator.hasNext();
      }

      public ZipEntry nextElement() {
         return (ZipEntry)this.iterator.next();
      }

      // $FF: synthetic method
      EntryEnumerator(ZipInputStreamZipEntrySource.NamelessClass381508013 x1) {
         this();
      }
   }

   public static class FakeZipEntry extends ZipEntry {

      private byte[] data;


      public FakeZipEntry(ZipEntry entry, InputStream inp) throws IOException {
         super(entry.getName());
         long entrySize = entry.getSize();
         ByteArrayOutputStream baos;
         if(entrySize != -1L) {
            if(entrySize >= 2147483647L) {
               throw new IOException("ZIP entry size is too large");
            }

            baos = new ByteArrayOutputStream((int)entrySize);
         } else {
            baos = new ByteArrayOutputStream();
         }

         byte[] buffer = new byte[4096];
         boolean read = false;

         int read1;
         while((read1 = inp.read(buffer)) != -1) {
            baos.write(buffer, 0, read1);
         }

         this.data = baos.toByteArray();
      }

      public InputStream getInputStream() {
         return new ByteArrayInputStream(this.data);
      }
   }
}
