package com.microsoft.schemas.vml;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STStrokeArrowType$Enum extends StringEnumAbstractBase {

   static final int INT_NONE = 1;
   static final int INT_BLOCK = 2;
   static final int INT_CLASSIC = 3;
   static final int INT_OVAL = 4;
   static final int INT_DIAMOND = 5;
   static final int INT_OPEN = 6;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STStrokeArrowType$Enum[]{new STStrokeArrowType$Enum("none", 1), new STStrokeArrowType$Enum("block", 2), new STStrokeArrowType$Enum("classic", 3), new STStrokeArrowType$Enum("oval", 4), new STStrokeArrowType$Enum("diamond", 5), new STStrokeArrowType$Enum("open", 6)});
   private static final long serialVersionUID = 1L;


   public static STStrokeArrowType$Enum forString(String var0) {
      return (STStrokeArrowType$Enum)table.forString(var0);
   }

   public static STStrokeArrowType$Enum forInt(int var0) {
      return (STStrokeArrowType$Enum)table.forInt(var0);
   }

   private STStrokeArrowType$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
