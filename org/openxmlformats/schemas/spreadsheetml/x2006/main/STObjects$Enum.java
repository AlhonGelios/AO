package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STObjects$Enum extends StringEnumAbstractBase {

   static final int INT_ALL = 1;
   static final int INT_PLACEHOLDERS = 2;
   static final int INT_NONE = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STObjects$Enum[]{new STObjects$Enum("all", 1), new STObjects$Enum("placeholders", 2), new STObjects$Enum("none", 3)});
   private static final long serialVersionUID = 1L;


   public static STObjects$Enum forString(String var0) {
      return (STObjects$Enum)table.forString(var0);
   }

   public static STObjects$Enum forInt(int var0) {
      return (STObjects$Enum)table.forInt(var0);
   }

   private STObjects$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
