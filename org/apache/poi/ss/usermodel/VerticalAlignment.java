package org.apache.poi.ss.usermodel;


public enum VerticalAlignment {

   TOP("TOP", 0),
   CENTER("CENTER", 1),
   BOTTOM("BOTTOM", 2),
   JUSTIFY("JUSTIFY", 3),
   DISTRIBUTED("DISTRIBUTED", 4);
   // $FF: synthetic field
   private static final VerticalAlignment[] $VALUES = new VerticalAlignment[]{TOP, CENTER, BOTTOM, JUSTIFY, DISTRIBUTED};


   private VerticalAlignment(String var1, int var2) {}

   public short getCode() {
      return (short)this.ordinal();
   }

   public static VerticalAlignment forInt(int code) {
      if(code >= 0 && code < values().length) {
         return values()[code];
      } else {
         throw new IllegalArgumentException("Invalid VerticalAlignment code: " + code);
      }
   }

}
