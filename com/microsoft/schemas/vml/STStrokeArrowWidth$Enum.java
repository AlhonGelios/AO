package com.microsoft.schemas.vml;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STStrokeArrowWidth$Enum extends StringEnumAbstractBase {

   static final int INT_NARROW = 1;
   static final int INT_MEDIUM = 2;
   static final int INT_WIDE = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STStrokeArrowWidth$Enum[]{new STStrokeArrowWidth$Enum("narrow", 1), new STStrokeArrowWidth$Enum("medium", 2), new STStrokeArrowWidth$Enum("wide", 3)});
   private static final long serialVersionUID = 1L;


   public static STStrokeArrowWidth$Enum forString(String var0) {
      return (STStrokeArrowWidth$Enum)table.forString(var0);
   }

   public static STStrokeArrowWidth$Enum forInt(int var0) {
      return (STStrokeArrowWidth$Enum)table.forInt(var0);
   }

   private STStrokeArrowWidth$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
