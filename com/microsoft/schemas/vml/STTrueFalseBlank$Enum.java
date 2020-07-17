package com.microsoft.schemas.vml;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STTrueFalseBlank$Enum extends StringEnumAbstractBase {

   static final int INT_T = 1;
   static final int INT_F = 2;
   static final int INT_TRUE = 3;
   static final int INT_FALSE = 4;
   static final int INT_X = 5;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTrueFalseBlank$Enum[]{new STTrueFalseBlank$Enum("t", 1), new STTrueFalseBlank$Enum("f", 2), new STTrueFalseBlank$Enum("true", 3), new STTrueFalseBlank$Enum("false", 4), new STTrueFalseBlank$Enum("", 5)});
   private static final long serialVersionUID = 1L;


   public static STTrueFalseBlank$Enum forString(String var0) {
      return (STTrueFalseBlank$Enum)table.forString(var0);
   }

   public static STTrueFalseBlank$Enum forInt(int var0) {
      return (STTrueFalseBlank$Enum)table.forInt(var0);
   }

   private STTrueFalseBlank$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
