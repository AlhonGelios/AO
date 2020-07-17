package org.apache.poi.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import org.apache.poi.util.IOUtils;

public class RLEDecompressingInputStream extends InputStream {

   private static final int[] POWER2 = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, '\u8000'};
   private final InputStream in;
   private final byte[] buf;
   private int pos;
   private int len;


   public RLEDecompressingInputStream(InputStream in) throws IOException {
      this.in = in;
      this.buf = new byte[4096];
      this.pos = 0;
      int header = in.read();
      if(header != 1) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Header byte 0x01 expected, received 0x%02X", new Object[]{Integer.valueOf(header & 255)}));
      } else {
         this.len = this.readChunk();
      }
   }

   public int read() throws IOException {
      return this.len == -1?-1:(this.pos >= this.len && (this.len = this.readChunk()) == -1?-1:this.buf[this.pos++]);
   }

   public int read(byte[] b) throws IOException {
      return this.read(b, 0, b.length);
   }

   public int read(byte[] b, int off, int l) throws IOException {
      if(this.len == -1) {
         return -1;
      } else {
         int offset = off;

         int c;
         for(int length = l; length > 0; offset += c) {
            if(this.pos >= this.len && (this.len = this.readChunk()) == -1) {
               return offset > off?offset - off:-1;
            }

            c = Math.min(length, this.len - this.pos);
            System.arraycopy(this.buf, this.pos, b, offset, c);
            this.pos += c;
            length -= c;
         }

         return l;
      }
   }

   public long skip(long n) throws IOException {
      int c;
      for(long length = n; length > 0L; length -= (long)c) {
         if(this.pos >= this.len && (this.len = this.readChunk()) == -1) {
            return -1L;
         }

         c = (int)Math.min(n, (long)(this.len - this.pos));
         this.pos += c;
      }

      return n;
   }

   public int available() {
      return this.len > 0?this.len - this.pos:0;
   }

   public void close() throws IOException {
      this.in.close();
   }

   private int readChunk() throws IOException {
      this.pos = 0;
      int w = this.readShort(this.in);
      if(w == -1) {
         return -1;
      } else {
         int chunkSize = (w & 4095) + 1;
         if((w & 28672) != 12288) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Chunksize header A should be 0x3000, received 0x%04X", new Object[]{Integer.valueOf(w & '\ue000')}));
         } else {
            boolean rawChunk = (w & '\u8000') == 0;
            if(rawChunk) {
               if(this.in.read(this.buf, 0, chunkSize) < chunkSize) {
                  throw new IllegalStateException(String.format(Locale.ROOT, "Not enough bytes read, expected %d", new Object[]{Integer.valueOf(chunkSize)}));
               } else {
                  return chunkSize;
               }
            } else {
               int inOffset = 0;
               int outOffset = 0;

               while(inOffset < chunkSize) {
                  int tokenFlags = this.in.read();
                  ++inOffset;
                  if(tokenFlags == -1) {
                     break;
                  }

                  for(int n = 0; n < 8 && inOffset < chunkSize; ++n) {
                     int token;
                     if((tokenFlags & POWER2[n]) == 0) {
                        token = this.in.read();
                        if(token == -1) {
                           return -1;
                        }

                        this.buf[outOffset++] = (byte)token;
                        ++inOffset;
                     } else {
                        token = this.readShort(this.in);
                        if(token == -1) {
                           return -1;
                        }

                        inOffset += 2;
                        int copyLenBits = getCopyLenBits(outOffset - 1);
                        int copyOffset = (token >> copyLenBits) + 1;
                        int copyLen = (token & POWER2[copyLenBits] - 1) + 3;
                        int startPos = outOffset - copyOffset;
                        int endPos = startPos + copyLen;

                        for(int i = startPos; i < endPos; ++i) {
                           this.buf[outOffset++] = this.buf[i];
                        }
                     }
                  }
               }

               return outOffset;
            }
         }
      }
   }

   static int getCopyLenBits(int offset) {
      for(int n = 11; n >= 4; --n) {
         if((offset & POWER2[n]) != 0) {
            return 15 - n;
         }
      }

      return 12;
   }

   public int readShort() throws IOException {
      return this.readShort(this);
   }

   public int readInt() throws IOException {
      return this.readInt(this);
   }

   private int readShort(InputStream stream) throws IOException {
      int b0;
      int b1;
      return (b0 = stream.read()) == -1?-1:((b1 = stream.read()) == -1?-1:b0 & 255 | (b1 & 255) << 8);
   }

   private int readInt(InputStream stream) throws IOException {
      int b0;
      int b1;
      int b2;
      int b3;
      return (b0 = stream.read()) == -1?-1:((b1 = stream.read()) == -1?-1:((b2 = stream.read()) == -1?-1:((b3 = stream.read()) == -1?-1:b0 & 255 | (b1 & 255) << 8 | (b2 & 255) << 16 | (b3 & 255) << 24)));
   }

   public static byte[] decompress(byte[] compressed) throws IOException {
      return decompress(compressed, 0, compressed.length);
   }

   public static byte[] decompress(byte[] compressed, int offset, int length) throws IOException {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      ByteArrayInputStream instream = new ByteArrayInputStream(compressed, offset, length);
      RLEDecompressingInputStream stream = new RLEDecompressingInputStream(instream);
      IOUtils.copy(stream, out);
      stream.close();
      out.close();
      return out.toByteArray();
   }

}
