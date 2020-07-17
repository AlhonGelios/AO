package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STFieldSortType$Enum extends StringEnumAbstractBase {

   static final int INT_MANUAL = 1;
   static final int INT_ASCENDING = 2;
   static final int INT_DESCENDING = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STFieldSortType$Enum[]{new STFieldSortType$Enum("manual", 1), new STFieldSortType$Enum("ascending", 2), new STFieldSortType$Enum("descending", 3)});
   private static final long serialVersionUID = 1L;


   public static STFieldSortType$Enum forString(String var0) {
      return (STFieldSortType$Enum)table.forString(var0);
   }

   public static STFieldSortType$Enum forInt(int var0) {
      return (STFieldSortType$Enum)table.forInt(var0);
   }

   private STFieldSortType$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
