package com.microsoft.schemas.vml;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STStrokeArrowLength$Enum extends StringEnumAbstractBase {

   static final int INT_SHORT = 1;
   static final int INT_MEDIUM = 2;
   static final int INT_LONG = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STStrokeArrowLength$Enum[]{new STStrokeArrowLength$Enum("short", 1), new STStrokeArrowLength$Enum("medium", 2), new STStrokeArrowLength$Enum("long", 3)});
   private static final long serialVersionUID = 1L;


   public static STStrokeArrowLength$Enum forString(String var0) {
      return (STStrokeArrowLength$Enum)table.forString(var0);
   }

   public static STStrokeArrowLength$Enum forInt(int var0) {
      return (STStrokeArrowLength$Enum)table.forInt(var0);
   }

   private STStrokeArrowLength$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
