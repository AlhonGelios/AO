package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STDisplacedByCustomXml$Enum extends StringEnumAbstractBase {

   static final int INT_NEXT = 1;
   static final int INT_PREV = 2;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STDisplacedByCustomXml$Enum[]{new STDisplacedByCustomXml$Enum("next", 1), new STDisplacedByCustomXml$Enum("prev", 2)});
   private static final long serialVersionUID = 1L;


   public static STDisplacedByCustomXml$Enum forString(String var0) {
      return (STDisplacedByCustomXml$Enum)table.forString(var0);
   }

   public static STDisplacedByCustomXml$Enum forInt(int var0) {
      return (STDisplacedByCustomXml$Enum)table.forInt(var0);
   }

   private STDisplacedByCustomXml$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
