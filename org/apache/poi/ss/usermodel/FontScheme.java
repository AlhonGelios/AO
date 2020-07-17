package org.apache.poi.ss.usermodel;


public enum FontScheme {

   NONE("NONE", 0, 1),
   MAJOR("MAJOR", 1, 2),
   MINOR("MINOR", 2, 3);
   private int value;
   private static FontScheme[] _table = new FontScheme[4];
   // $FF: synthetic field
   private static final FontScheme[] $VALUES = new FontScheme[]{NONE, MAJOR, MINOR};


   private FontScheme(String var1, int var2, int val) {
      this.value = val;
   }

   public int getValue() {
      return this.value;
   }

   public static FontScheme valueOf(int value) {
      return _table[value];
   }

   static {
      FontScheme[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         FontScheme c = arr$[i$];
         _table[c.getValue()] = c;
      }

   }
}
