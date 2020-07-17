package org.apache.poi.ss.formula.constant;

import org.apache.poi.ss.formula.constant.ErrorConstant;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianOutput;
import org.apache.poi.util.StringUtil;

public final class ConstantValueParser {

   private static final int TYPE_EMPTY = 0;
   private static final int TYPE_NUMBER = 1;
   private static final int TYPE_STRING = 2;
   private static final int TYPE_BOOLEAN = 4;
   private static final int TYPE_ERROR_CODE = 16;
   private static final int TRUE_ENCODING = 1;
   private static final int FALSE_ENCODING = 0;
   private static final Object EMPTY_REPRESENTATION = null;


   public static Object[] parse(LittleEndianInput in, int nValues) {
      Object[] result = new Object[nValues];

      for(int i = 0; i < result.length; ++i) {
         result[i] = readAConstantValue(in);
      }

      return result;
   }

   private static Object readAConstantValue(LittleEndianInput in) {
      byte grbit = in.readByte();
      switch(grbit) {
      case 0:
         in.readLong();
         return EMPTY_REPRESENTATION;
      case 1:
         return new Double(in.readDouble());
      case 2:
         return StringUtil.readUnicodeString(in);
      case 4:
         return readBoolean(in);
      case 16:
         int errCode = in.readUShort();
         in.readUShort();
         in.readInt();
         return ErrorConstant.valueOf(errCode);
      default:
         throw new RuntimeException("Unknown grbit value (" + grbit + ")");
      }
   }

   private static Object readBoolean(LittleEndianInput in) {
      byte val = (byte)((int)in.readLong());
      switch(val) {
      case 0:
         return Boolean.FALSE;
      case 1:
         return Boolean.TRUE;
      default:
         throw new RuntimeException("unexpected boolean encoding (" + val + ")");
      }
   }

   public static int getEncodedSize(Object[] values) {
      int result = values.length * 1;

      for(int i = 0; i < values.length; ++i) {
         result += getEncodedSize(values[i]);
      }

      return result;
   }

   private static int getEncodedSize(Object object) {
      if(object == EMPTY_REPRESENTATION) {
         return 8;
      } else {
         Class cls = object.getClass();
         if(cls != Boolean.class && cls != Double.class && cls != ErrorConstant.class) {
            String strVal = (String)object;
            return StringUtil.getEncodedSize(strVal);
         } else {
            return 8;
         }
      }
   }

   public static void encode(LittleEndianOutput out, Object[] values) {
      for(int i = 0; i < values.length; ++i) {
         encodeSingleValue(out, values[i]);
      }

   }

   private static void encodeSingleValue(LittleEndianOutput out, Object value) {
      if(value == EMPTY_REPRESENTATION) {
         out.writeByte(0);
         out.writeLong(0L);
      } else {
         long longVal;
         if(value instanceof Boolean) {
            Boolean ecVal3 = (Boolean)value;
            out.writeByte(4);
            longVal = ecVal3.booleanValue()?1L:0L;
            out.writeLong(longVal);
         } else if(value instanceof Double) {
            Double ecVal2 = (Double)value;
            out.writeByte(1);
            out.writeDouble(ecVal2.doubleValue());
         } else if(value instanceof String) {
            String ecVal1 = (String)value;
            out.writeByte(2);
            StringUtil.writeUnicodeString(out, ecVal1);
         } else if(value instanceof ErrorConstant) {
            ErrorConstant ecVal = (ErrorConstant)value;
            out.writeByte(16);
            longVal = (long)ecVal.getErrorCode();
            out.writeLong(longVal);
         } else {
            throw new IllegalStateException("Unexpected value type (" + value.getClass().getName() + "\'");
         }
      }
   }

}
