package com.microsoft.schemas.vml;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STEditAs$Enum extends StringEnumAbstractBase {

   static final int INT_CANVAS = 1;
   static final int INT_ORGCHART = 2;
   static final int INT_RADIAL = 3;
   static final int INT_CYCLE = 4;
   static final int INT_STACKED = 5;
   static final int INT_VENN = 6;
   static final int INT_BULLSEYE = 7;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STEditAs$Enum[]{new STEditAs$Enum("canvas", 1), new STEditAs$Enum("orgchart", 2), new STEditAs$Enum("radial", 3), new STEditAs$Enum("cycle", 4), new STEditAs$Enum("stacked", 5), new STEditAs$Enum("venn", 6), new STEditAs$Enum("bullseye", 7)});
   private static final long serialVersionUID = 1L;


   public static STEditAs$Enum forString(String var0) {
      return (STEditAs$Enum)table.forString(var0);
   }

   public static STEditAs$Enum forInt(int var0) {
      return (STEditAs$Enum)table.forInt(var0);
   }

   private STEditAs$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
