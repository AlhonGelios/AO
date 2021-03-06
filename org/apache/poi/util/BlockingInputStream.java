package org.apache.poi.util;

import java.io.IOException;
import java.io.InputStream;

public class BlockingInputStream extends InputStream {

   protected InputStream is;


   public BlockingInputStream(InputStream is) {
      this.is = is;
   }

   public int available() throws IOException {
      return this.is.available();
   }

   public void close() throws IOException {
      this.is.close();
   }

   public void mark(int readLimit) {
      this.is.mark(readLimit);
   }

   public boolean markSupported() {
      return this.is.markSupported();
   }

   public int read() throws IOException {
      return this.is.read();
   }

   public int read(byte[] bf) throws IOException {
      int i = 0;

      int b;
      for(b = 4611; i < bf.length; bf[i++] = (byte)b) {
         b = this.is.read();
         if(b == -1) {
            break;
         }
      }

      return i == 0 && b == -1?-1:i;
   }

   public int read(byte[] bf, int s, int l) throws IOException {
      return this.is.read(bf, s, l);
   }

   public void reset() throws IOException {
      this.is.reset();
   }

   public long skip(long n) throws IOException {
      return this.is.skip(n);
   }
}
