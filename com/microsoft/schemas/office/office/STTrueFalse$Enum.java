package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STTrueFalse$Enum extends StringEnumAbstractBase {

   static final int INT_T = 1;
   static final int INT_F = 2;
   static final int INT_TRUE = 3;
   static final int INT_FALSE = 4;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTrueFalse$Enum[]{new STTrueFalse$Enum("t", 1), new STTrueFalse$Enum("f", 2), new STTrueFalse$Enum("true", 3), new STTrueFalse$Enum("false", 4)});
   private static final long serialVersionUID = 1L;


   public static STTrueFalse$Enum forString(String var0) {
      return (STTrueFalse$Enum)table.forString(var0);
   }

   public static STTrueFalse$Enum forInt(int var0) {
      return (STTrueFalse$Enum)table.forInt(var0);
   }

   private STTrueFalse$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
