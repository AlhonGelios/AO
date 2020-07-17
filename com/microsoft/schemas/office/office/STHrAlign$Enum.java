package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STHrAlign$Enum extends StringEnumAbstractBase {

   static final int INT_LEFT = 1;
   static final int INT_RIGHT = 2;
   static final int INT_CENTER = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STHrAlign$Enum[]{new STHrAlign$Enum("left", 1), new STHrAlign$Enum("right", 2), new STHrAlign$Enum("center", 3)});
   private static final long serialVersionUID = 1L;


   public static STHrAlign$Enum forString(String var0) {
      return (STHrAlign$Enum)table.forString(var0);
   }

   public static STHrAlign$Enum forInt(int var0) {
      return (STHrAlign$Enum)table.forInt(var0);
   }

   private STHrAlign$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
