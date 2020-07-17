package org.apache.poi.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.Charset;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LocaleUtil;

@Internal
public class HexDump {

   public static final String EOL = System.getProperty("line.separator");
   public static final Charset UTF8 = Charset.forName("UTF-8");


   public static void dump(byte[] data, long offset, OutputStream stream, int index, int length) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
      if(stream == null) {
         throw new IllegalArgumentException("cannot write to nullstream");
      } else {
         OutputStreamWriter osw = new OutputStreamWriter(stream, UTF8);
         osw.write(dump(data, offset, index, length));
         osw.flush();
      }
   }

   public static synchronized void dump(byte[] data, long offset, OutputStream stream, int index) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
      dump(data, offset, stream, index, Integer.MAX_VALUE);
   }

   public static String dump(byte[] data, long offset, int index) {
      return dump(data, offset, index, Integer.MAX_VALUE);
   }

   public static String dump(byte[] data, long offset, int index, int length) {
      if(data != null && data.length != 0) {
         int data_length = length != Integer.MAX_VALUE && length >= 0 && index + length >= 0?Math.min(data.length, index + length):data.length;
         if(index >= 0 && index < data.length) {
            long var12 = offset + (long)index;
            StringBuilder buffer = new StringBuilder(74);

            for(int j = index; j < data_length; j += 16) {
               int chars_read = data_length - j;
               if(chars_read > 16) {
                  chars_read = 16;
               }

               writeHex(buffer, var12, 8, "");

               int k;
               for(k = 0; k < 16; ++k) {
                  if(k < chars_read) {
                     writeHex(buffer, (long)data[k + j], 2, " ");
                  } else {
                     buffer.append("   ");
                  }
               }

               buffer.append(' ');

               for(k = 0; k < chars_read; ++k) {
                  buffer.append(toAscii(data[k + j]));
               }

               buffer.append(EOL);
               var12 += (long)chars_read;
            }

            return buffer.toString();
         } else {
            String display_offset = "illegal index: " + index + " into array of length " + data.length;
            throw new ArrayIndexOutOfBoundsException(display_offset);
         }
      } else {
         return "No Data" + EOL;
      }
   }

   public static char toAscii(int dataB) {
      char charB = (char)(dataB & 255);
      if(Character.isISOControl(charB)) {
         return '.';
      } else {
         switch(charB) {
         case 221:
         case 255:
            charB = 46;
         default:
            return charB;
         }
      }
   }

   public static String toHex(byte[] value) {
      StringBuilder retVal = new StringBuilder();
      retVal.append('[');
      if(value != null && value.length > 0) {
         for(int x = 0; x < value.length; ++x) {
            if(x > 0) {
               retVal.append(", ");
            }

            retVal.append(toHex(value[x]));
         }
      }

      retVal.append(']');
      return retVal.toString();
   }

   public static String toHex(short[] value) {
      StringBuilder retVal = new StringBuilder();
      retVal.append('[');

      for(int x = 0; x < value.length; ++x) {
         if(x > 0) {
            retVal.append(", ");
         }

         retVal.append(toHex(value[x]));
      }

      retVal.append(']');
      return retVal.toString();
   }

   public static String toHex(byte[] value, int bytesPerLine) {
      if(value.length == 0) {
         return ": 0";
      } else {
         int digits = (int)Math.round(Math.log((double)value.length) / Math.log(10.0D) + 0.5D);
         StringBuilder retVal = new StringBuilder();
         writeHex(retVal, 0L, digits, "");
         retVal.append(": ");
         int x = 0;

         for(int i = -1; x < value.length; ++x) {
            ++i;
            if(i == bytesPerLine) {
               retVal.append('\n');
               writeHex(retVal, (long)x, digits, "");
               retVal.append(": ");
               i = 0;
            } else if(x > 0) {
               retVal.append(", ");
            }

            retVal.append(toHex(value[x]));
         }

         return retVal.toString();
      }
   }

   public static String toHex(short value) {
      StringBuilder sb = new StringBuilder(4);
      writeHex(sb, (long)(value & '\uffff'), 4, "");
      return sb.toString();
   }

   public static String toHex(byte value) {
      StringBuilder sb = new StringBuilder(2);
      writeHex(sb, (long)(value & 255), 2, "");
      return sb.toString();
   }

   public static String toHex(int value) {
      StringBuilder sb = new StringBuilder(8);
      writeHex(sb, (long)value & 4294967295L, 8, "");
      return sb.toString();
   }

   public static String toHex(long value) {
      StringBuilder sb = new StringBuilder(16);
      writeHex(sb, value, 16, "");
      return sb.toString();
   }

   public static String toHex(String value) {
      return value != null && value.length() != 0?toHex(value.getBytes(LocaleUtil.CHARSET_1252)):"[]";
   }

   public static void dump(InputStream in, PrintStream out, int start, int bytesToDump) throws IOException {
      ByteArrayOutputStream buf = new ByteArrayOutputStream();
      int data;
      if(bytesToDump == -1) {
         for(data = in.read(); data != -1; data = in.read()) {
            buf.write(data);
         }
      } else {
         data = bytesToDump;

         while(data-- > 0) {
            int c = in.read();
            if(c == -1) {
               break;
            }

            buf.write(c);
         }
      }

      byte[] var7 = buf.toByteArray();
      dump(var7, 0L, out, start, var7.length);
   }

   public static String longToHex(long value) {
      StringBuilder sb = new StringBuilder(18);
      writeHex(sb, value, 16, "0x");
      return sb.toString();
   }

   public static String intToHex(int value) {
      StringBuilder sb = new StringBuilder(10);
      writeHex(sb, (long)value & 4294967295L, 8, "0x");
      return sb.toString();
   }

   public static String shortToHex(int value) {
      StringBuilder sb = new StringBuilder(6);
      writeHex(sb, (long)value & 65535L, 4, "0x");
      return sb.toString();
   }

   public static String byteToHex(int value) {
      StringBuilder sb = new StringBuilder(4);
      writeHex(sb, (long)value & 255L, 2, "0x");
      return sb.toString();
   }

   private static void writeHex(StringBuilder sb, long value, int nDigits, String prefix) {
      sb.append(prefix);
      char[] buf = new char[nDigits];
      long acc = value;

      for(int i = nDigits - 1; i >= 0; --i) {
         int digit = (int)(acc & 15L);
         buf[i] = (char)(digit < 10?48 + digit:65 + digit - 10);
         acc >>>= 4;
      }

      sb.append(buf);
   }

   public static void main(String[] args) throws Exception {
      File file = new File(args[0]);
      BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
      byte[] b = new byte[(int)file.length()];
      in.read(b);
      System.out.println(dump(b, 0L, 0));
      in.close();
   }

}
