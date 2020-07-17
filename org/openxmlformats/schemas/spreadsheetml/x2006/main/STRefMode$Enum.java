package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STRefMode$Enum extends StringEnumAbstractBase {

   static final int INT_A_1 = 1;
   static final int INT_R_1_C_1 = 2;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STRefMode$Enum[]{new STRefMode$Enum("A1", 1), new STRefMode$Enum("R1C1", 2)});
   private static final long serialVersionUID = 1L;


   public static STRefMode$Enum forString(String var0) {
      return (STRefMode$Enum)table.forString(var0);
   }

   public static STRefMode$Enum forInt(int var0) {
      return (STRefMode$Enum)table.forInt(var0);
   }

   private STRefMode$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
