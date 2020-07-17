package org.apache.poi.openxml4j.util;

import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.SuppressForbidden;

public class ZipSecureFile extends ZipFile {

   private static POILogger logger = POILogFactory.getLogger(ZipSecureFile.class);
   private static double MIN_INFLATE_RATIO = 0.01D;
   private static long MAX_ENTRY_SIZE = 4294967295L;
   private static final long GRACE_ENTRY_SIZE = 102400L;
   private static long MAX_TEXT_SIZE = 10485760L;


   public static void setMinInflateRatio(double ratio) {
      MIN_INFLATE_RATIO = ratio;
   }

   public static double getMinInflateRatio() {
      return MIN_INFLATE_RATIO;
   }

   public static void setMaxEntrySize(long maxEntrySize) {
      if(maxEntrySize >= 0L && maxEntrySize <= 4294967295L) {
         MAX_ENTRY_SIZE = maxEntrySize;
      } else {
         throw new IllegalArgumentException("Max entry size is bounded [0-4GB], but had " + maxEntrySize);
      }
   }

   public static long getMaxEntrySize() {
      return MAX_ENTRY_SIZE;
   }

   public static void setMaxTextSize(long maxTextSize) {
      if(maxTextSize >= 0L && maxTextSize <= 4294967295L) {
         MAX_TEXT_SIZE = maxTextSize;
      } else {
         throw new IllegalArgumentException("Max text size is bounded [0-4GB], but had " + maxTextSize);
      }
   }

   public static long getMaxTextSize() {
      return MAX_TEXT_SIZE;
   }

   public ZipSecureFile(File file, int mode) throws ZipException, IOException {
      super(file, mode);
   }

   public ZipSecureFile(File file) throws ZipException, IOException {
      super(file);
   }

   public ZipSecureFile(String name) throws ZipException, IOException {
      super(name);
   }

   public InputStream getInputStream(ZipEntry entry) throws IOException {
      InputStream zipIS = super.getInputStream(entry);
      return addThreshold(zipIS);
   }

   public static ZipSecureFile.ThresholdInputStream addThreshold(final InputStream zipIS) throws IOException {
      ZipSecureFile.ThresholdInputStream newInner;
      if(zipIS instanceof InflaterInputStream) {
         newInner = (ZipSecureFile.ThresholdInputStream)AccessController.doPrivileged(new PrivilegedAction() {
            @SuppressForbidden("TODO: Fix this to not use reflection (it will break in Java 9)! Better would be to wrap *before* instead of tyring to insert wrapper afterwards.")
            public ZipSecureFile.ThresholdInputStream run() {
               try {
                  Field ex = FilterInputStream.class.getDeclaredField("in");
                  ex.setAccessible(true);
                  InputStream oldInner = (InputStream)ex.get(zipIS);
                  ZipSecureFile.ThresholdInputStream newInner = new ZipSecureFile.ThresholdInputStream(oldInner, (ZipSecureFile.ThresholdInputStream)null);
                  ex.set(zipIS, newInner);
                  return newInner;
               } catch (Exception var4) {
                  ZipSecureFile.logger.log(5, new Object[]{"SecurityManager doesn\'t allow manipulation via reflection for zipbomb detection - continue with original input stream", var4});
                  return null;
               }
            }
         });
      } else {
         newInner = null;
      }

      return new ZipSecureFile.ThresholdInputStream(zipIS, newInner);
   }


   public static class ThresholdInputStream extends PushbackInputStream {

      long counter = 0L;
      ZipSecureFile.ThresholdInputStream cis;


      public ThresholdInputStream(InputStream is, ZipSecureFile.ThresholdInputStream cis) {
         super(is, 1);
         this.cis = cis;
      }

      public int read() throws IOException {
         int b = this.in.read();
         if(b > -1) {
            this.advance(1);
         }

         return b;
      }

      public int read(byte[] b, int off, int len) throws IOException {
         int cnt = this.in.read(b, off, len);
         if(cnt > -1) {
            this.advance(cnt);
         }

         return cnt;
      }

      public long skip(long n) throws IOException {
         this.counter = 0L;
         return this.in.skip(n);
      }

      public synchronized void reset() throws IOException {
         this.counter = 0L;
         this.in.reset();
      }

      public void advance(int advance) throws IOException {
         this.counter += (long)advance;
         if(this.counter > ZipSecureFile.MAX_ENTRY_SIZE) {
            throw new IOException("Zip bomb detected! The file would exceed the max size of the expanded data in the zip-file. This may indicates that the file is used to inflate memory usage and thus could pose a security risk. You can adjust this limit via ZipSecureFile.setMaxEntrySize() if you need to work with files which are very large. Counter: " + this.counter + ", cis.counter: " + (this.cis == null?0L:this.cis.counter) + "Limits: MAX_ENTRY_SIZE: " + ZipSecureFile.MAX_ENTRY_SIZE);
         } else if(this.cis != null) {
            if(this.counter > 102400L) {
               double ratio = (double)this.cis.counter / (double)this.counter;
               if(ratio < ZipSecureFile.MIN_INFLATE_RATIO) {
                  throw new IOException("Zip bomb detected! The file would exceed the max. ratio of compressed file size to the size of the expanded data. This may indicate that the file is used to inflate memory usage and thus could pose a security risk. You can adjust this limit via ZipSecureFile.setMinInflateRatio() if you need to work with files which exceed this limit. Counter: " + this.counter + ", cis.counter: " + this.cis.counter + ", ratio: " + (double)this.cis.counter / (double)this.counter + "Limits: MIN_INFLATE_RATIO: " + ZipSecureFile.MIN_INFLATE_RATIO);
               }
            }
         }
      }

      public ZipEntry getNextEntry() throws IOException {
         if(!(this.in instanceof ZipInputStream)) {
            throw new UnsupportedOperationException("underlying stream is not a ZipInputStream");
         } else {
            this.counter = 0L;
            return ((ZipInputStream)this.in).getNextEntry();
         }
      }

      public void closeEntry() throws IOException {
         if(!(this.in instanceof ZipInputStream)) {
            throw new UnsupportedOperationException("underlying stream is not a ZipInputStream");
         } else {
            this.counter = 0L;
            ((ZipInputStream)this.in).closeEntry();
         }
      }

      public void unread(int b) throws IOException {
         if(!(this.in instanceof PushbackInputStream)) {
            throw new UnsupportedOperationException("underlying stream is not a PushbackInputStream");
         } else {
            if(--this.counter < 0L) {
               this.counter = 0L;
            }

            ((PushbackInputStream)this.in).unread(b);
         }
      }

      public void unread(byte[] b, int off, int len) throws IOException {
         if(!(this.in instanceof PushbackInputStream)) {
            throw new UnsupportedOperationException("underlying stream is not a PushbackInputStream");
         } else {
            this.counter -= (long)len;
            if(--this.counter < 0L) {
               this.counter = 0L;
            }

            ((PushbackInputStream)this.in).unread(b, off, len);
         }
      }

      public int available() throws IOException {
         return this.in.available();
      }

      public boolean markSupported() {
         return this.in.markSupported();
      }

      public synchronized void mark(int readlimit) {
         this.in.mark(readlimit);
      }
   }
}
