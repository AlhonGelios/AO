package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STHeightRule$Enum extends StringEnumAbstractBase {

   static final int INT_AUTO = 1;
   static final int INT_EXACT = 2;
   static final int INT_AT_LEAST = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STHeightRule$Enum[]{new STHeightRule$Enum("auto", 1), new STHeightRule$Enum("exact", 2), new STHeightRule$Enum("atLeast", 3)});
   private static final long serialVersionUID = 1L;


   public static STHeightRule$Enum forString(String var0) {
      return (STHeightRule$Enum)table.forString(var0);
   }

   public static STHeightRule$Enum forInt(int var0) {
      return (STHeightRule$Enum)table.forInt(var0);
   }

   private STHeightRule$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
