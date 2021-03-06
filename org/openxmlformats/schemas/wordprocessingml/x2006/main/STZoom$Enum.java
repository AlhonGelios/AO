package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STZoom$Enum extends StringEnumAbstractBase {

   static final int INT_NONE = 1;
   static final int INT_FULL_PAGE = 2;
   static final int INT_BEST_FIT = 3;
   static final int INT_TEXT_FIT = 4;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STZoom$Enum[]{new STZoom$Enum("none", 1), new STZoom$Enum("fullPage", 2), new STZoom$Enum("bestFit", 3), new STZoom$Enum("textFit", 4)});
   private static final long serialVersionUID = 1L;


   public static STZoom$Enum forString(String var0) {
      return (STZoom$Enum)table.forString(var0);
   }

   public static STZoom$Enum forInt(int var0) {
      return (STZoom$Enum)table.forInt(var0);
   }

   private STZoom$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
