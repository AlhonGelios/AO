package org.apache.poi.xssf.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class EvilUnclosedBRFixingInputStream extends InputStream {

   private InputStream source;
   private byte[] spare;
   private static byte[] detect = new byte[]{(byte)60, (byte)98, (byte)114, (byte)62};


   public EvilUnclosedBRFixingInputStream(InputStream source) {
      this.source = source;
   }

   public int read() throws IOException {
      return this.source.read();
   }

   public int read(byte[] b, int off, int len) throws IOException {
      int readA = this.readFromSpare(b, off, len);
      int readB = this.source.read(b, off + readA, len - readA);
      int read;
      if(readB != -1 && readB != 0) {
         read = readA + readB;
      } else {
         if(readA == 0) {
            return readB;
         }

         read = readA;
      }

      if(read > 0) {
         read = this.fixUp(b, off, read);
      }

      return read;
   }

   public int read(byte[] b) throws IOException {
      return this.read(b, 0, b.length);
   }

   private int readFromSpare(byte[] b, int offset, int len) {
      if(this.spare == null) {
         return 0;
      } else if(len == 0) {
         throw new IllegalArgumentException("Asked to read 0 bytes");
      } else if(this.spare.length <= len) {
         System.arraycopy(this.spare, 0, b, offset, this.spare.length);
         int newspare1 = this.spare.length;
         this.spare = null;
         return newspare1;
      } else {
         byte[] newspare = new byte[this.spare.length - len];
         System.arraycopy(this.spare, 0, b, offset, len);
         System.arraycopy(this.spare, len, newspare, 0, newspare.length);
         this.spare = newspare;
         return len;
      }
   }

   private void addToSpare(byte[] b, int offset, int len, boolean atTheEnd) {
      if(this.spare == null) {
         this.spare = new byte[len];
         System.arraycopy(b, offset, this.spare, 0, len);
      } else {
         byte[] newspare = new byte[this.spare.length + len];
         if(atTheEnd) {
            System.arraycopy(this.spare, 0, newspare, 0, this.spare.length);
            System.arraycopy(b, offset, newspare, this.spare.length, len);
         } else {
            System.arraycopy(b, offset, newspare, 0, len);
            System.arraycopy(this.spare, 0, newspare, len, this.spare.length);
         }

         this.spare = newspare;
      }

   }

   private int fixUp(byte[] b, int offset, int read) {
      int needed;
      boolean overshoot;
      int j;
      for(int fixAt = 0; fixAt < detect.length - 1; ++fixAt) {
         needed = offset + read - 1 - fixAt;
         if(needed >= 0) {
            overshoot = true;

            for(j = 0; j <= fixAt && overshoot; ++j) {
               if(b[needed + j] != detect[j]) {
                  overshoot = false;
               }
            }

            if(overshoot) {
               this.addToSpare(b, needed, fixAt + 1, true);
               --read;
               read -= fixAt;
               break;
            }
         }
      }

      ArrayList var10 = new ArrayList();

      for(needed = offset; needed <= offset + read - detect.length; ++needed) {
         overshoot = true;

         for(j = 0; j < detect.length && overshoot; ++j) {
            if(b[needed + j] != detect[j]) {
               overshoot = false;
            }
         }

         if(overshoot) {
            var10.add(Integer.valueOf(needed));
         }
      }

      if(var10.size() == 0) {
         return read;
      } else {
         needed = offset + read + var10.size();
         int var11 = needed - b.length;
         if(var11 > 0) {
            j = 0;

            for(Iterator i = var10.iterator(); i.hasNext(); ++j) {
               int tmp = ((Integer)i.next()).intValue();
               if(tmp > offset + read - detect.length - var11 - j) {
                  var11 = needed - tmp - 1 - j;
                  break;
               }
            }

            this.addToSpare(b, offset + read - var11, var11, false);
            read -= var11;
         }

         for(j = var10.size() - 1; j >= 0; --j) {
            int var12 = ((Integer)var10.get(j)).intValue();
            if(var12 < read + offset && var12 <= read - 3) {
               byte[] var13 = new byte[read - var12 - 3];
               System.arraycopy(b, var12 + 3, var13, 0, var13.length);
               b[var12 + 3] = 47;
               System.arraycopy(var13, 0, b, var12 + 4, var13.length);
               ++read;
            }
         }

         return read;
      }
   }

}
