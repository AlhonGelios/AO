package com.microsoft.schemas.vml;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STFillMethod$Enum extends StringEnumAbstractBase {

   static final int INT_NONE = 1;
   static final int INT_LINEAR = 2;
   static final int INT_SIGMA = 3;
   static final int INT_ANY = 4;
   static final int INT_LINEAR_SIGMA = 5;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STFillMethod$Enum[]{new STFillMethod$Enum("none", 1), new STFillMethod$Enum("linear", 2), new STFillMethod$Enum("sigma", 3), new STFillMethod$Enum("any", 4), new STFillMethod$Enum("linear sigma", 5)});
   private static final long serialVersionUID = 1L;


   public static STFillMethod$Enum forString(String var0) {
      return (STFillMethod$Enum)table.forString(var0);
   }

   public static STFillMethod$Enum forInt(int var0) {
      return (STFillMethod$Enum)table.forInt(var0);
   }

   private STFillMethod$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
