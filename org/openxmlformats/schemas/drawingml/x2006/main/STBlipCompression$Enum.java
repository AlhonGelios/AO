package org.openxmlformats.schemas.drawingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STBlipCompression$Enum extends StringEnumAbstractBase {

   static final int INT_EMAIL = 1;
   static final int INT_SCREEN = 2;
   static final int INT_PRINT = 3;
   static final int INT_HQPRINT = 4;
   static final int INT_NONE = 5;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STBlipCompression$Enum[]{new STBlipCompression$Enum("email", 1), new STBlipCompression$Enum("screen", 2), new STBlipCompression$Enum("print", 3), new STBlipCompression$Enum("hqprint", 4), new STBlipCompression$Enum("none", 5)});
   private static final long serialVersionUID = 1L;


   public static STBlipCompression$Enum forString(String var0) {
      return (STBlipCompression$Enum)table.forString(var0);
   }

   public static STBlipCompression$Enum forInt(int var0) {
      return (STBlipCompression$Enum)table.forInt(var0);
   }

   private STBlipCompression$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
