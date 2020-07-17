package org.openxmlformats.schemas.drawingml.x2006.chart;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STPageSetupOrientation$Enum extends StringEnumAbstractBase {

   static final int INT_DEFAULT = 1;
   static final int INT_PORTRAIT = 2;
   static final int INT_LANDSCAPE = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPageSetupOrientation$Enum[]{new STPageSetupOrientation$Enum("default", 1), new STPageSetupOrientation$Enum("portrait", 2), new STPageSetupOrientation$Enum("landscape", 3)});
   private static final long serialVersionUID = 1L;


   public static STPageSetupOrientation$Enum forString(String var0) {
      return (STPageSetupOrientation$Enum)table.forString(var0);
   }

   public static STPageSetupOrientation$Enum forInt(int var0) {
      return (STPageSetupOrientation$Enum)table.forInt(var0);
   }

   private STPageSetupOrientation$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
