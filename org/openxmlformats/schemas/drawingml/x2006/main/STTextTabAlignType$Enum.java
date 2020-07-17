package org.openxmlformats.schemas.drawingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STTextTabAlignType$Enum extends StringEnumAbstractBase {

   static final int INT_L = 1;
   static final int INT_CTR = 2;
   static final int INT_R = 3;
   static final int INT_DEC = 4;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTextTabAlignType$Enum[]{new STTextTabAlignType$Enum("l", 1), new STTextTabAlignType$Enum("ctr", 2), new STTextTabAlignType$Enum("r", 3), new STTextTabAlignType$Enum("dec", 4)});
   private static final long serialVersionUID = 1L;


   public static STTextTabAlignType$Enum forString(String var0) {
      return (STTextTabAlignType$Enum)table.forString(var0);
   }

   public static STTextTabAlignType$Enum forInt(int var0) {
      return (STTextTabAlignType$Enum)table.forInt(var0);
   }

   private STTextTabAlignType$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
