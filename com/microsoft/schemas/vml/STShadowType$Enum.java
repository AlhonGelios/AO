package com.microsoft.schemas.vml;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STShadowType$Enum extends StringEnumAbstractBase {

   static final int INT_SINGLE = 1;
   static final int INT_DOUBLE = 2;
   static final int INT_EMBOSS = 3;
   static final int INT_PERSPECTIVE = 4;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STShadowType$Enum[]{new STShadowType$Enum("single", 1), new STShadowType$Enum("double", 2), new STShadowType$Enum("emboss", 3), new STShadowType$Enum("perspective", 4)});
   private static final long serialVersionUID = 1L;


   public static STShadowType$Enum forString(String var0) {
      return (STShadowType$Enum)table.forString(var0);
   }

   public static STShadowType$Enum forInt(int var0) {
      return (STShadowType$Enum)table.forInt(var0);
   }

   private STShadowType$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
