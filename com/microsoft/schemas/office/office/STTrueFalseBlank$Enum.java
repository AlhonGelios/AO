package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STTrueFalseBlank$Enum extends StringEnumAbstractBase {

   static final int INT_X = 1;
   static final int INT_T = 2;
   static final int INT_F = 3;
   static final int INT_TRUE = 4;
   static final int INT_FALSE = 5;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTrueFalseBlank$Enum[]{new STTrueFalseBlank$Enum("", 1), new STTrueFalseBlank$Enum("t", 2), new STTrueFalseBlank$Enum("f", 3), new STTrueFalseBlank$Enum("true", 4), new STTrueFalseBlank$Enum("false", 5)});
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
