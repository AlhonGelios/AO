package com.microsoft.schemas.vml;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STImageAspect$Enum extends StringEnumAbstractBase {

   static final int INT_IGNORE = 1;
   static final int INT_AT_MOST = 2;
   static final int INT_AT_LEAST = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STImageAspect$Enum[]{new STImageAspect$Enum("ignore", 1), new STImageAspect$Enum("atMost", 2), new STImageAspect$Enum("atLeast", 3)});
   private static final long serialVersionUID = 1L;


   public static STImageAspect$Enum forString(String var0) {
      return (STImageAspect$Enum)table.forString(var0);
   }

   public static STImageAspect$Enum forInt(int var0) {
      return (STImageAspect$Enum)table.forInt(var0);
   }

   private STImageAspect$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
