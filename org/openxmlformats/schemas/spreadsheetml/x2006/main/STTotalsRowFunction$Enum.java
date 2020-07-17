package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STTotalsRowFunction$Enum extends StringEnumAbstractBase {

   static final int INT_NONE = 1;
   static final int INT_SUM = 2;
   static final int INT_MIN = 3;
   static final int INT_MAX = 4;
   static final int INT_AVERAGE = 5;
   static final int INT_COUNT = 6;
   static final int INT_COUNT_NUMS = 7;
   static final int INT_STD_DEV = 8;
   static final int INT_VAR = 9;
   static final int INT_CUSTOM = 10;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTotalsRowFunction$Enum[]{new STTotalsRowFunction$Enum("none", 1), new STTotalsRowFunction$Enum("sum", 2), new STTotalsRowFunction$Enum("min", 3), new STTotalsRowFunction$Enum("max", 4), new STTotalsRowFunction$Enum("average", 5), new STTotalsRowFunction$Enum("count", 6), new STTotalsRowFunction$Enum("countNums", 7), new STTotalsRowFunction$Enum("stdDev", 8), new STTotalsRowFunction$Enum("var", 9), new STTotalsRowFunction$Enum("custom", 10)});
   private static final long serialVersionUID = 1L;


   public static STTotalsRowFunction$Enum forString(String var0) {
      return (STTotalsRowFunction$Enum)table.forString(var0);
   }

   public static STTotalsRowFunction$Enum forInt(int var0) {
      return (STTotalsRowFunction$Enum)table.forInt(var0);
   }

   private STTotalsRowFunction$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
