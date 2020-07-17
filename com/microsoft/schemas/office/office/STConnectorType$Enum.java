package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STConnectorType$Enum extends StringEnumAbstractBase {

   static final int INT_NONE = 1;
   static final int INT_STRAIGHT = 2;
   static final int INT_ELBOW = 3;
   static final int INT_CURVED = 4;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STConnectorType$Enum[]{new STConnectorType$Enum("none", 1), new STConnectorType$Enum("straight", 2), new STConnectorType$Enum("elbow", 3), new STConnectorType$Enum("curved", 4)});
   private static final long serialVersionUID = 1L;


   public static STConnectorType$Enum forString(String var0) {
      return (STConnectorType$Enum)table.forString(var0);
   }

   public static STConnectorType$Enum forInt(int var0) {
      return (STConnectorType$Enum)table.forInt(var0);
   }

   private STConnectorType$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
