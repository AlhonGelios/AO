package org.apache.poi.hpsf;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import org.apache.poi.util.SuppressForbidden;

public class Util {

   public static final long EPOCH_DIFF = 11644473600000L;


   public static boolean equal(byte[] a, byte[] b) {
      if(a.length != b.length) {
         return false;
      } else {
         for(int i = 0; i < a.length; ++i) {
            if(a[i] != b[i]) {
               return false;
            }
         }

         return true;
      }
   }

   public static void copy(byte[] src, int srcOffset, int length, byte[] dst, int dstOffset) {
      for(int i = 0; i < length; ++i) {
         dst[dstOffset + i] = src[srcOffset + i];
      }

   }

   public static byte[] cat(byte[][] byteArrays) {
      int capacity = 0;

      for(int result = 0; result < byteArrays.length; ++result) {
         capacity += byteArrays[result].length;
      }

      byte[] var6 = new byte[capacity];
      int r = 0;

      for(int i = 0; i < byteArrays.length; ++i) {
         for(int j = 0; j < byteArrays[i].length; ++j) {
            var6[r++] = byteArrays[i][j];
         }
      }

      return var6;
   }

   public static byte[] copy(byte[] src, int offset, int length) {
      byte[] result = new byte[length];
      copy(src, offset, length, result, 0);
      return result;
   }

   public static java.util.Date filetimeToDate(int high, int low) {
      long filetime = (long)high << 32 | (long)low & 4294967295L;
      return filetimeToDate(filetime);
   }

   public static java.util.Date filetimeToDate(long filetime) {
      long ms_since_16010101 = filetime / 10000L;
      long ms_since_19700101 = ms_since_16010101 - 11644473600000L;
      return new java.util.Date(ms_since_19700101);
   }

   public static long dateToFileTime(java.util.Date date) {
      long ms_since_19700101 = date.getTime();
      long ms_since_16010101 = ms_since_19700101 + 11644473600000L;
      return ms_since_16010101 * 10000L;
   }

   public static boolean equals(Collection c1, Collection c2) {
      Object[] o1 = c1.toArray();
      Object[] o2 = c2.toArray();
      return internalEquals(o1, o2);
   }

   public static boolean equals(Object[] c1, Object[] c2) {
      Object[] o1 = (Object[])c1.clone();
      Object[] o2 = (Object[])c2.clone();
      return internalEquals(o1, o2);
   }

   private static boolean internalEquals(Object[] o1, Object[] o2) {
      for(int i1 = 0; i1 < o1.length; ++i1) {
         Object obj1 = o1[i1];
         boolean matchFound = false;

         for(int i2 = 0; !matchFound && i2 < o1.length; ++i2) {
            Object obj2 = o2[i2];
            if(obj1.equals(obj2)) {
               matchFound = true;
               o2[i2] = null;
            }
         }

         if(!matchFound) {
            return false;
         }
      }

      return true;
   }

   public static byte[] pad4(byte[] ba) {
      boolean PAD = true;
      int l = ba.length % 4;
      byte[] result;
      if(l == 0) {
         result = ba;
      } else {
         l = 4 - l;
         result = new byte[ba.length + l];
         System.arraycopy(ba, 0, result, 0, ba.length);
      }

      return result;
   }

   public static char[] pad4(char[] ca) {
      boolean PAD = true;
      int l = ca.length % 4;
      char[] result;
      if(l == 0) {
         result = ca;
      } else {
         l = 4 - l;
         result = new char[ca.length + l];
         System.arraycopy(ca, 0, result, 0, ca.length);
      }

      return result;
   }

   public static char[] pad4(String s) {
      return pad4(s.toCharArray());
   }

   @SuppressForbidden("uses printStackTrace")
   public static String toString(Throwable t) {
      StringWriter sw = new StringWriter();
      PrintWriter pw = new PrintWriter(sw);
      t.printStackTrace(pw);
      pw.close();

      try {
         sw.close();
         return sw.toString();
      } catch (IOException var5) {
         StringBuffer b = new StringBuffer(t.getMessage());
         b.append("\n");
         b.append("Could not create a stacktrace. Reason: ");
         b.append(var5.getMessage());
         return b.toString();
      }
   }
}
