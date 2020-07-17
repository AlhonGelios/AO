package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STHint$Enum extends StringEnumAbstractBase {

   static final int INT_DEFAULT = 1;
   static final int INT_EAST_ASIA = 2;
   static final int INT_CS = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STHint$Enum[]{new STHint$Enum("default", 1), new STHint$Enum("eastAsia", 2), new STHint$Enum("cs", 3)});
   private static final long serialVersionUID = 1L;


   public static STHint$Enum forString(String var0) {
      return (STHint$Enum)table.forString(var0);
   }

   public static STHint$Enum forInt(int var0) {
      return (STHint$Enum)table.forInt(var0);
   }

   private STHint$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
