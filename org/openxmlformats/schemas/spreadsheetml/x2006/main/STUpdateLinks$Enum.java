package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STUpdateLinks$Enum extends StringEnumAbstractBase {

   static final int INT_USER_SET = 1;
   static final int INT_NEVER = 2;
   static final int INT_ALWAYS = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STUpdateLinks$Enum[]{new STUpdateLinks$Enum("userSet", 1), new STUpdateLinks$Enum("never", 2), new STUpdateLinks$Enum("always", 3)});
   private static final long serialVersionUID = 1L;


   public static STUpdateLinks$Enum forString(String var0) {
      return (STUpdateLinks$Enum)table.forString(var0);
   }

   public static STUpdateLinks$Enum forInt(int var0) {
      return (STUpdateLinks$Enum)table.forInt(var0);
   }

   private STUpdateLinks$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
