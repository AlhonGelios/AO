package org.apache.poi.ss.usermodel;


public enum FontFamily {

   NOT_APPLICABLE("NOT_APPLICABLE", 0, 0),
   ROMAN("ROMAN", 1, 1),
   SWISS("SWISS", 2, 2),
   MODERN("MODERN", 3, 3),
   SCRIPT("SCRIPT", 4, 4),
   DECORATIVE("DECORATIVE", 5, 5);
   private int family;
   private static FontFamily[] _table = new FontFamily[6];
   // $FF: synthetic field
   private static final FontFamily[] $VALUES = new FontFamily[]{NOT_APPLICABLE, ROMAN, SWISS, MODERN, SCRIPT, DECORATIVE};


   private FontFamily(String var1, int var2, int value) {
      this.family = value;
   }

   public int getValue() {
      return this.family;
   }

   public static FontFamily valueOf(int family) {
      return _table[family];
   }

   static {
      FontFamily[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         FontFamily c = arr$[i$];
         _table[c.getValue()] = c;
      }

   }
}
