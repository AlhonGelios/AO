package com.microsoft.schemas.vml;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STStrokeLineStyle$Enum extends StringEnumAbstractBase {

   static final int INT_SINGLE = 1;
   static final int INT_THIN_THIN = 2;
   static final int INT_THIN_THICK = 3;
   static final int INT_THICK_THIN = 4;
   static final int INT_THICK_BETWEEN_THIN = 5;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STStrokeLineStyle$Enum[]{new STStrokeLineStyle$Enum("single", 1), new STStrokeLineStyle$Enum("thinThin", 2), new STStrokeLineStyle$Enum("thinThick", 3), new STStrokeLineStyle$Enum("thickThin", 4), new STStrokeLineStyle$Enum("thickBetweenThin", 5)});
   private static final long serialVersionUID = 1L;


   public static STStrokeLineStyle$Enum forString(String var0) {
      return (STStrokeLineStyle$Enum)table.forString(var0);
   }

   public static STStrokeLineStyle$Enum forInt(int var0) {
      return (STStrokeLineStyle$Enum)table.forInt(var0);
   }

   private STStrokeLineStyle$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
