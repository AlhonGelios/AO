package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STPTabRelativeTo$Enum extends StringEnumAbstractBase {

   static final int INT_MARGIN = 1;
   static final int INT_INDENT = 2;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPTabRelativeTo$Enum[]{new STPTabRelativeTo$Enum("margin", 1), new STPTabRelativeTo$Enum("indent", 2)});
   private static final long serialVersionUID = 1L;


   public static STPTabRelativeTo$Enum forString(String var0) {
      return (STPTabRelativeTo$Enum)table.forString(var0);
   }

   public static STPTabRelativeTo$Enum forInt(int var0) {
      return (STPTabRelativeTo$Enum)table.forInt(var0);
   }

   private STPTabRelativeTo$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
