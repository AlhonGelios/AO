package org.openxmlformats.schemas.drawingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STRectAlignment$Enum extends StringEnumAbstractBase {

   static final int INT_TL = 1;
   static final int INT_T = 2;
   static final int INT_TR = 3;
   static final int INT_L = 4;
   static final int INT_CTR = 5;
   static final int INT_R = 6;
   static final int INT_BL = 7;
   static final int INT_B = 8;
   static final int INT_BR = 9;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STRectAlignment$Enum[]{new STRectAlignment$Enum("tl", 1), new STRectAlignment$Enum("t", 2), new STRectAlignment$Enum("tr", 3), new STRectAlignment$Enum("l", 4), new STRectAlignment$Enum("ctr", 5), new STRectAlignment$Enum("r", 6), new STRectAlignment$Enum("bl", 7), new STRectAlignment$Enum("b", 8), new STRectAlignment$Enum("br", 9)});
   private static final long serialVersionUID = 1L;


   public static STRectAlignment$Enum forString(String var0) {
      return (STRectAlignment$Enum)table.forString(var0);
   }

   public static STRectAlignment$Enum forInt(int var0) {
      return (STRectAlignment$Enum)table.forInt(var0);
   }

   private STRectAlignment$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
