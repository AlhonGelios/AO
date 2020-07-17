package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STPhoneticAlignment$Enum extends StringEnumAbstractBase {

   static final int INT_NO_CONTROL = 1;
   static final int INT_LEFT = 2;
   static final int INT_CENTER = 3;
   static final int INT_DISTRIBUTED = 4;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPhoneticAlignment$Enum[]{new STPhoneticAlignment$Enum("noControl", 1), new STPhoneticAlignment$Enum("left", 2), new STPhoneticAlignment$Enum("center", 3), new STPhoneticAlignment$Enum("distributed", 4)});
   private static final long serialVersionUID = 1L;


   public static STPhoneticAlignment$Enum forString(String var0) {
      return (STPhoneticAlignment$Enum)table.forString(var0);
   }

   public static STPhoneticAlignment$Enum forInt(int var0) {
      return (STPhoneticAlignment$Enum)table.forInt(var0);
   }

   private STPhoneticAlignment$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
