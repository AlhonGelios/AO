package org.apache.poi.openxml4j.opc;


public enum CompressionOption {

   FAST("FAST", 0, 1),
   MAXIMUM("MAXIMUM", 1, 9),
   NORMAL("NORMAL", 2, -1),
   NOT_COMPRESSED("NOT_COMPRESSED", 3, 0);
   private final int value;
   // $FF: synthetic field
   private static final CompressionOption[] $VALUES = new CompressionOption[]{FAST, MAXIMUM, NORMAL, NOT_COMPRESSED};


   private CompressionOption(String var1, int var2, int value) {
      this.value = value;
   }

   public int value() {
      return this.value;
   }

}
