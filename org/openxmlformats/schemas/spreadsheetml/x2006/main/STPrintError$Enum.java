package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STPrintError$Enum extends StringEnumAbstractBase {

   static final int INT_DISPLAYED = 1;
   static final int INT_BLANK = 2;
   static final int INT_DASH = 3;
   static final int INT_NA = 4;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPrintError$Enum[]{new STPrintError$Enum("displayed", 1), new STPrintError$Enum("blank", 2), new STPrintError$Enum("dash", 3), new STPrintError$Enum("NA", 4)});
   private static final long serialVersionUID = 1L;


   public static STPrintError$Enum forString(String var0) {
      return (STPrintError$Enum)table.forString(var0);
   }

   public static STPrintError$Enum forInt(int var0) {
      return (STPrintError$Enum)table.forInt(var0);
   }

   private STPrintError$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
