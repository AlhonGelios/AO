package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STTableType$Enum extends StringEnumAbstractBase {

   static final int INT_WORKSHEET = 1;
   static final int INT_XML = 2;
   static final int INT_QUERY_TABLE = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STTableType$Enum[]{new STTableType$Enum("worksheet", 1), new STTableType$Enum("xml", 2), new STTableType$Enum("queryTable", 3)});
   private static final long serialVersionUID = 1L;


   public static STTableType$Enum forString(String var0) {
      return (STTableType$Enum)table.forString(var0);
   }

   public static STTableType$Enum forInt(int var0) {
      return (STTableType$Enum)table.forInt(var0);
   }

   private STTableType$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
