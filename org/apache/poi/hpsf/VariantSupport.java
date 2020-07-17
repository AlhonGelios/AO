package org.apache.poi.hpsf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;
import org.apache.poi.hpsf.ClipboardData;
import org.apache.poi.hpsf.CodePageString;
import org.apache.poi.hpsf.Filetime;
import org.apache.poi.hpsf.ReadingNotSupportedException;
import org.apache.poi.hpsf.TypeWriter;
import org.apache.poi.hpsf.TypedPropertyValue;
import org.apache.poi.hpsf.UnicodeString;
import org.apache.poi.hpsf.UnsupportedVariantTypeException;
import org.apache.poi.hpsf.Util;
import org.apache.poi.hpsf.Variant;
import org.apache.poi.hpsf.VariantBool;
import org.apache.poi.hpsf.WritingNotSupportedException;
import org.apache.poi.util.CodePageUtil;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class VariantSupport extends Variant {

   private static final POILogger logger = POILogFactory.getLogger(VariantSupport.class);
   private static boolean logUnsupportedTypes = false;
   protected static List unsupportedMessage;
   public static final int[] SUPPORTED_TYPES = new int[]{0, 2, 3, 20, 5, 64, 30, 31, 71, 11};


   public static void setLogUnsupportedTypes(boolean logUnsupportedTypes) {
      logUnsupportedTypes = logUnsupportedTypes;
   }

   public static boolean isLogUnsupportedTypes() {
      return logUnsupportedTypes;
   }

   protected static void writeUnsupportedTypeMessage(UnsupportedVariantTypeException ex) {
      if(isLogUnsupportedTypes()) {
         if(unsupportedMessage == null) {
            unsupportedMessage = new LinkedList();
         }

         Long vt = Long.valueOf(ex.getVariantType());
         if(!unsupportedMessage.contains(vt)) {
            logger.log(7, new Object[]{ex.getMessage()});
            unsupportedMessage.add(vt);
         }
      }

   }

   public boolean isSupportedType(int variantType) {
      for(int i = 0; i < SUPPORTED_TYPES.length; ++i) {
         if(variantType == SUPPORTED_TYPES[i]) {
            return true;
         }
      }

      return false;
   }

   public static Object read(byte[] src, int offset, int length, long type, int codepage) throws ReadingNotSupportedException, UnsupportedEncodingException {
      TypedPropertyValue typedPropertyValue = new TypedPropertyValue((int)type, (Object)null);

      int unpadded;
      try {
         unpadded = typedPropertyValue.readValue(src, offset);
      } catch (UnsupportedOperationException var11) {
         int propLength = Math.min(length, src.length - offset);
         byte[] v1 = new byte[propLength];
         System.arraycopy(src, offset, v1, 0, propLength);
         throw new ReadingNotSupportedException(type, v1);
      }

      switch((int)type) {
      case 0:
      case 3:
      case 5:
      case 20:
         return typedPropertyValue.getValue();
      case 2:
         return Integer.valueOf(((Short)typedPropertyValue.getValue()).intValue());
      case 11:
         VariantBool v5 = (VariantBool)typedPropertyValue.getValue();
         return Boolean.valueOf(v5.getValue());
      case 30:
         CodePageString v4 = (CodePageString)typedPropertyValue.getValue();
         return v4.getJavaValue(codepage);
      case 31:
         UnicodeString v3 = (UnicodeString)typedPropertyValue.getValue();
         return v3.toJavaString();
      case 64:
         Filetime v2 = (Filetime)typedPropertyValue.getValue();
         return Util.filetimeToDate((int)v2.getHigh(), (int)v2.getLow());
      case 71:
         ClipboardData v = (ClipboardData)typedPropertyValue.getValue();
         return v.toByteArray();
      default:
         byte[] v6 = new byte[unpadded];
         System.arraycopy(src, offset, v6, 0, unpadded);
         throw new ReadingNotSupportedException(type, v6);
      }
   }

   public static String codepageToEncoding(int codepage) throws UnsupportedEncodingException {
      return CodePageUtil.codepageToEncoding(codepage);
   }

   public static int write(OutputStream out, long type, Object value, int codepage) throws IOException, WritingNotSupportedException {
      byte length = 0;
      byte[] b;
      int high;
      int low;
      int var13;
      switch((int)type) {
      case 0:
         var13 = length + TypeWriter.writeUIntToStream(out, 0L);
         break;
      case 2:
         var13 = length + TypeWriter.writeToStream(out, ((Integer)value).shortValue());
         break;
      case 3:
         if(!(value instanceof Integer)) {
            throw new ClassCastException("Could not cast an object to " + Integer.class.toString() + ": " + value.getClass().toString() + ", " + value.toString());
         }

         var13 = length + TypeWriter.writeToStream(out, ((Integer)value).intValue());
         break;
      case 5:
         var13 = length + TypeWriter.writeToStream(out, ((Double)value).doubleValue());
         break;
      case 11:
         if(((Boolean)value).booleanValue()) {
            out.write(255);
            out.write(255);
         } else {
            out.write(0);
            out.write(0);
         }

         var13 = length + 2;
         break;
      case 20:
         var13 = length + TypeWriter.writeToStream(out, ((Long)value).longValue());
         break;
      case 30:
         CodePageString var16 = new CodePageString((String)value, codepage);
         var13 = length + var16.write(out);
         break;
      case 31:
         int var15 = ((String)value).length() + 1;
         var13 = length + TypeWriter.writeUIntToStream(out, (long)var15);
         char[] s = ((String)value).toCharArray();

         for(high = 0; high < s.length; ++high) {
            low = (s[high] & '\uff00') >> 8;
            int var17 = s[high] & 255;
            byte highb = (byte)low;
            byte lowb = (byte)var17;
            out.write(lowb);
            out.write(highb);
            var13 += 2;
         }

         out.write(0);
         out.write(0);
         var13 += 2;
         break;
      case 64:
         long var14 = Util.dateToFileTime((java.util.Date)value);
         high = (int)(var14 >> 32 & 4294967295L);
         low = (int)(var14 & 4294967295L);
         Filetime filetimeValue = new Filetime(low, high);
         var13 = length + filetimeValue.write(out);
         break;
      case 71:
         b = (byte[])((byte[])value);
         out.write(b);
         var13 = b.length;
         break;
      default:
         if(!(value instanceof byte[])) {
            throw new WritingNotSupportedException(type, value);
         }

         b = (byte[])((byte[])value);
         out.write(b);
         var13 = b.length;
         writeUnsupportedTypeMessage(new WritingNotSupportedException(type, value));
      }

      while((var13 & 3) != 0) {
         out.write(0);
         ++var13;
      }

      return var13;
   }

}
