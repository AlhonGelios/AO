package org.apache.poi.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class LZWDecompresser {

   private final boolean maskMeansCompressed;
   private final int codeLengthIncrease;
   private final boolean positionIsBigEndian;


   protected LZWDecompresser(boolean maskMeansCompressed, int codeLengthIncrease, boolean positionIsBigEndian) {
      this.maskMeansCompressed = maskMeansCompressed;
      this.codeLengthIncrease = codeLengthIncrease;
      this.positionIsBigEndian = positionIsBigEndian;
   }

   protected abstract int populateDictionary(byte[] var1);

   protected abstract int adjustDictionaryOffset(int var1);

   public byte[] decompress(InputStream src) throws IOException {
      ByteArrayOutputStream res = new ByteArrayOutputStream();
      this.decompress(src, res);
      return res.toByteArray();
   }

   public void decompress(InputStream src, OutputStream res) throws IOException {
      byte[] buffer = new byte[4096];
      int pos = this.populateDictionary(buffer);
      byte[] dataB = new byte[16 + this.codeLengthIncrease];

      int flag;
      while((flag = src.read()) != -1) {
         for(int mask = 1; mask < 256; mask <<= 1) {
            boolean isMaskSet = (flag & mask) > 0;
            if(isMaskSet ^ this.maskMeansCompressed) {
               int dataI;
               if((dataI = src.read()) != -1) {
                  buffer[pos & 4095] = fromInt(dataI);
                  ++pos;
                  res.write(new byte[]{fromInt(dataI)});
               }
            } else {
               int dataIPt1 = src.read();
               int dataIPt2 = src.read();
               if(dataIPt1 == -1 || dataIPt2 == -1) {
                  break;
               }

               int len = (dataIPt2 & 15) + this.codeLengthIncrease;
               int pntr;
               if(this.positionIsBigEndian) {
                  pntr = (dataIPt1 << 4) + (dataIPt2 >> 4);
               } else {
                  pntr = dataIPt1 + ((dataIPt2 & 240) << 4);
               }

               pntr = this.adjustDictionaryOffset(pntr);

               for(int i = 0; i < len; ++i) {
                  dataB[i] = buffer[pntr + i & 4095];
                  buffer[pos + i & 4095] = dataB[i];
               }

               res.write(dataB, 0, len);
               pos += len;
            }
         }
      }

   }

   public static byte fromInt(int b) {
      return b < 128?(byte)b:(byte)(b - 256);
   }

   public static int fromByte(byte b) {
      return b >= 0?b:b + 256;
   }
}
