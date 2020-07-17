package org.apache.poi.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.poi.util.StringUtil;

public class HexRead {

   public static byte[] readData(String filename) throws IOException {
      File file = new File(filename);
      FileInputStream stream = new FileInputStream(file);

      byte[] var3;
      try {
         var3 = readData(stream, -1);
      } finally {
         stream.close();
      }

      return var3;
   }

   public static byte[] readData(InputStream stream, String section) throws IOException {
      try {
         StringBuffer sectionText = new StringBuffer();
         boolean inSection = false;

         for(int c = stream.read(); c != -1; c = stream.read()) {
            switch(c) {
            case 10:
            case 13:
               inSection = false;
               sectionText = new StringBuffer();
               break;
            case 91:
               inSection = true;
               break;
            case 93:
               inSection = false;
               if(sectionText.toString().equals(section)) {
                  byte[] var5 = readData(stream, 91);
                  return var5;
               }

               sectionText = new StringBuffer();
               break;
            default:
               if(inSection) {
                  sectionText.append((char)c);
               }
            }
         }
      } finally {
         stream.close();
      }

      throw new IOException("Section \'" + section + "\' not found");
   }

   public static byte[] readData(String filename, String section) throws IOException {
      File file = new File(filename);
      FileInputStream stream = new FileInputStream(file);
      return readData((InputStream)stream, section);
   }

   public static byte[] readData(InputStream stream, int eofChar) throws IOException {
      int characterCount = 0;
      byte b = 0;
      ArrayList bytes = new ArrayList();
      boolean a = true;
      boolean A = true;

      while(true) {
         int polished = stream.read();
         int rval = -1;
         if(48 <= polished && polished <= 57) {
            rval = polished - 48;
         } else if(65 <= polished && polished <= 70) {
            rval = polished - 55;
         } else if(97 <= polished && polished <= 102) {
            rval = polished - 87;
         } else if(35 == polished) {
            readToEOL(stream);
         } else if(-1 == polished || eofChar == polished) {
            Byte[] var10 = (Byte[])bytes.toArray(new Byte[bytes.size()]);
            byte[] var11 = new byte[var10.length];

            for(int j = 0; j < var10.length; ++j) {
               var11[j] = var10[j].byteValue();
            }

            return var11;
         }

         if(rval != -1) {
            b = (byte)(b << 4);
            b += (byte)rval;
            ++characterCount;
            if(characterCount == 2) {
               bytes.add(Byte.valueOf(b));
               characterCount = 0;
               b = 0;
            }
         }
      }
   }

   public static byte[] readFromString(String data) {
      try {
         return readData(new ByteArrayInputStream(data.getBytes(StringUtil.UTF8)), -1);
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }

   private static void readToEOL(InputStream stream) throws IOException {
      for(int c = stream.read(); c != -1 && c != 10 && c != 13; c = stream.read()) {
         ;
      }

   }
}
