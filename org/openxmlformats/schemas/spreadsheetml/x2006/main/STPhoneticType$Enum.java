package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STPhoneticType$Enum extends StringEnumAbstractBase {

   static final int INT_HALFWIDTH_KATAKANA = 1;
   static final int INT_FULLWIDTH_KATAKANA = 2;
   static final int INT_HIRAGANA = 3;
   static final int INT_NO_CONVERSION = 4;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STPhoneticType$Enum[]{new STPhoneticType$Enum("halfwidthKatakana", 1), new STPhoneticType$Enum("fullwidthKatakana", 2), new STPhoneticType$Enum("Hiragana", 3), new STPhoneticType$Enum("noConversion", 4)});
   private static final long serialVersionUID = 1L;


   public static STPhoneticType$Enum forString(String var0) {
      return (STPhoneticType$Enum)table.forString(var0);
   }

   public static STPhoneticType$Enum forInt(int var0) {
      return (STPhoneticType$Enum)table.forInt(var0);
   }

   private STPhoneticType$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
