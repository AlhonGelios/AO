package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STPTabLeader$Enum extends StringEnumAbstractBase {

   static final int INT_NONE = 1;
   static final int INT_DOT = 2;
   static final int INT_HYPHEN = 3;
   static final int INT_UNDERSCORE = 4;
   static final int INT_MIDDLE_DOT = 5;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPTabLeader$Enum[]{new STPTabLeader$Enum("none", 1), new STPTabLeader$Enum("dot", 2), new STPTabLeader$Enum("hyphen", 3), new STPTabLeader$Enum("underscore", 4), new STPTabLeader$Enum("middleDot", 5)});
   private static final long serialVersionUID = 1L;


   public static STPTabLeader$Enum forString(String var0) {
      return (STPTabLeader$Enum)table.forString(var0);
   }

   public static STPTabLeader$Enum forInt(int var0) {
      return (STPTabLeader$Enum)table.forInt(var0);
   }

   private STPTabLeader$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
