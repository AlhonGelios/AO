package com.microsoft.schemas.vml;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STStrokeEndCap$Enum extends StringEnumAbstractBase {

   static final int INT_FLAT = 1;
   static final int INT_SQUARE = 2;
   static final int INT_ROUND = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STStrokeEndCap$Enum[]{new STStrokeEndCap$Enum("flat", 1), new STStrokeEndCap$Enum("square", 2), new STStrokeEndCap$Enum("round", 3)});
   private static final long serialVersionUID = 1L;


   public static STStrokeEndCap$Enum forString(String var0) {
      return (STStrokeEndCap$Enum)table.forString(var0);
   }

   public static STStrokeEndCap$Enum forInt(int var0) {
      return (STStrokeEndCap$Enum)table.forInt(var0);
   }

   private STStrokeEndCap$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
