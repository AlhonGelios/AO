package org.apache.poi.util;


public final class PngUtils {

   private static final byte[] PNG_FILE_HEADER = new byte[]{(byte)-119, (byte)80, (byte)78, (byte)71, (byte)13, (byte)10, (byte)26, (byte)10};


   public static boolean matchesPngHeader(byte[] data, int offset) {
      if(data != null && data.length - offset >= PNG_FILE_HEADER.length) {
         for(int i = 0; i < PNG_FILE_HEADER.length; ++i) {
            if(PNG_FILE_HEADER[i] != data[i + offset]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

}
