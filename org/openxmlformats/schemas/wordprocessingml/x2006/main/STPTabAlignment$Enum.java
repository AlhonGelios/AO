package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STPTabAlignment$Enum extends StringEnumAbstractBase {

   static final int INT_LEFT = 1;
   static final int INT_CENTER = 2;
   static final int INT_RIGHT = 3;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPTabAlignment$Enum[]{new STPTabAlignment$Enum("left", 1), new STPTabAlignment$Enum("center", 2), new STPTabAlignment$Enum("right", 3)});
   private static final long serialVersionUID = 1L;


   public static STPTabAlignment$Enum forString(String var0) {
      return (STPTabAlignment$Enum)table.forString(var0);
   }

   public static STPTabAlignment$Enum forInt(int var0) {
      return (STPTabAlignment$Enum)table.forInt(var0);
   }

   private STPTabAlignment$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
