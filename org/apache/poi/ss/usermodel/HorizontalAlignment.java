package org.apache.poi.ss.usermodel;


public enum HorizontalAlignment {

   GENERAL("GENERAL", 0),
   LEFT("LEFT", 1),
   CENTER("CENTER", 2),
   RIGHT("RIGHT", 3),
   FILL("FILL", 4),
   JUSTIFY("JUSTIFY", 5),
   CENTER_SELECTION("CENTER_SELECTION", 6),
   DISTRIBUTED("DISTRIBUTED", 7);
   // $FF: synthetic field
   private static final HorizontalAlignment[] $VALUES = new HorizontalAlignment[]{GENERAL, LEFT, CENTER, RIGHT, FILL, JUSTIFY, CENTER_SELECTION, DISTRIBUTED};


   private HorizontalAlignment(String var1, int var2) {}

   public short getCode() {
      return (short)this.ordinal();
   }

   public static HorizontalAlignment forInt(int code) {
      if(code >= 0 && code < values().length) {
         return values()[code];
      } else {
         throw new IllegalArgumentException("Invalid HorizontalAlignment code: " + code);
      }
   }

}
