package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STVisibility$Enum extends StringEnumAbstractBase {

   static final int INT_VISIBLE = 1;
   static final int INT_HIDDEN = 2;
   static final int INT_VERY_HIDDEN = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STVisibility$Enum[]{new STVisibility$Enum("visible", 1), new STVisibility$Enum("hidden", 2), new STVisibility$Enum("veryHidden", 3)});
   private static final long serialVersionUID = 1L;


   public static STVisibility$Enum forString(String var0) {
      return (STVisibility$Enum)table.forString(var0);
   }

   public static STVisibility$Enum forInt(int var0) {
      return (STVisibility$Enum)table.forInt(var0);
   }

   private STVisibility$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
