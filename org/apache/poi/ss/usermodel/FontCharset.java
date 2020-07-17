package org.apache.poi.ss.usermodel;


public enum FontCharset {

   ANSI("ANSI", 0, 0),
   DEFAULT("DEFAULT", 1, 1),
   SYMBOL("SYMBOL", 2, 2),
   MAC("MAC", 3, 77),
   SHIFTJIS("SHIFTJIS", 4, 128),
   HANGEUL("HANGEUL", 5, 129),
   JOHAB("JOHAB", 6, 130),
   GB2312("GB2312", 7, 134),
   CHINESEBIG5("CHINESEBIG5", 8, 136),
   GREEK("GREEK", 9, 161),
   TURKISH("TURKISH", 10, 162),
   VIETNAMESE("VIETNAMESE", 11, 163),
   HEBREW("HEBREW", 12, 177),
   ARABIC("ARABIC", 13, 178),
   BALTIC("BALTIC", 14, 186),
   RUSSIAN("RUSSIAN", 15, 204),
   THAI("THAI", 16, 222),
   EASTEUROPE("EASTEUROPE", 17, 238),
   OEM("OEM", 18, 255);
   private int charset;
   private static FontCharset[] _table = new FontCharset[256];
   // $FF: synthetic field
   private static final FontCharset[] $VALUES = new FontCharset[]{ANSI, DEFAULT, SYMBOL, MAC, SHIFTJIS, HANGEUL, JOHAB, GB2312, CHINESEBIG5, GREEK, TURKISH, VIETNAMESE, HEBREW, ARABIC, BALTIC, RUSSIAN, THAI, EASTEUROPE, OEM};


   private FontCharset(String var1, int var2, int value) {
      this.charset = value;
   }

   public int getValue() {
      return this.charset;
   }

   public static FontCharset valueOf(int value) {
      return value >= _table.length?null:_table[value];
   }

   static {
      FontCharset[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         FontCharset c = arr$[i$];
         _table[c.getValue()] = c;
      }

   }
}
