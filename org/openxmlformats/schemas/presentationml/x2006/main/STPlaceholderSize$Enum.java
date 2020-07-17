package org.openxmlformats.schemas.presentationml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STPlaceholderSize$Enum extends StringEnumAbstractBase {

   static final int INT_FULL = 1;
   static final int INT_HALF = 2;
   static final int INT_QUARTER = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPlaceholderSize$Enum[]{new STPlaceholderSize$Enum("full", 1), new STPlaceholderSize$Enum("half", 2), new STPlaceholderSize$Enum("quarter", 3)});
   private static final long serialVersionUID = 1L;


   public static STPlaceholderSize$Enum forString(String var0) {
      return (STPlaceholderSize$Enum)table.forString(var0);
   }

   public static STPlaceholderSize$Enum forInt(int var0) {
      return (STPlaceholderSize$Enum)table.forInt(var0);
   }

   private STPlaceholderSize$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
