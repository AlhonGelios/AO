package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import org.apache.xmlbeans.StringEnumAbstractBase;

public final class STProofErr$Enum extends StringEnumAbstractBase {

   static final int INT_SPELL_START = 1;
   static final int INT_SPELL_END = 2;
   static final int INT_GRAM_START = 3;
   static final int INT_GRAM_END = 4;
   public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STProofErr$Enum[]{new STProofErr$Enum("spellStart", 1), new STProofErr$Enum("spellEnd", 2), new STProofErr$Enum("gramStart", 3), new STProofErr$Enum("gramEnd", 4)});
   private static final long serialVersionUID = 1L;


   public static STProofErr$Enum forString(String var0) {
      return (STProofErr$Enum)table.forString(var0);
   }

   public static STProofErr$Enum forInt(int var0) {
      return (STProofErr$Enum)table.forInt(var0);
   }

   private STProofErr$Enum(String var1, int var2) {
      super(var1, var2);
   }

   private Object readResolve() {
      return forInt(this.intValue());
   }

}
