package org.openxmlformats.schemas.presentationml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STDirection$Enum extends StringEnumAbstractBase {

   static final int INT_HORZ = 1;
   static final int INT_VERT = 2;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STDirection$Enum[]{new STDirection$Enum("horz", 1), new STDirection$Enum("vert", 2)});
   private static final long serialVersionUID = 1L;


   public static STDirection$Enum forString(String var0) {
      return (STDirection$Enum)table.forString(var0);
   }

   public static STDirection$Enum forInt(int var0) {
      return (STDirection$Enum)table.forInt(var0);
   }

   private STDirection$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
