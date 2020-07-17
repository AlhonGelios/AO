package org.apache.poi.ss.usermodel;


public enum BorderStyle {

   NONE("NONE", 0, 0),
   THIN("THIN", 1, 1),
   MEDIUM("MEDIUM", 2, 2),
   DASHED("DASHED", 3, 3),
   DOTTED("DOTTED", 4, 4),
   THICK("THICK", 5, 5),
   DOUBLE("DOUBLE", 6, 6),
   HAIR("HAIR", 7, 7),
   MEDIUM_DASHED("MEDIUM_DASHED", 8, 8),
   DASH_DOT("DASH_DOT", 9, 9),
   MEDIUM_DASH_DOT("MEDIUM_DASH_DOT", 10, 10),
   DASH_DOT_DOT("DASH_DOT_DOT", 11, 11),
   MEDIUM_DASH_DOT_DOT("MEDIUM_DASH_DOT_DOT", 12, 12),
   SLANTED_DASH_DOT("SLANTED_DASH_DOT", 13, 13);
   private final short code;
   private static final BorderStyle[] _table = new BorderStyle[14];
   // $FF: synthetic field
   private static final BorderStyle[] $VALUES = new BorderStyle[]{NONE, THIN, MEDIUM, DASHED, DOTTED, THICK, DOUBLE, HAIR, MEDIUM_DASHED, DASH_DOT, MEDIUM_DASH_DOT, DASH_DOT_DOT, MEDIUM_DASH_DOT_DOT, SLANTED_DASH_DOT};


   private BorderStyle(String var1, int var2, int code) {
      this.code = (short)code;
   }

   public short getCode() {
      return this.code;
   }

   public static BorderStyle valueOf(short code) {
      return _table[code];
   }

   static {
      BorderStyle[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         BorderStyle c = arr$[i$];
         _table[c.getCode()] = c;
      }

   }
}
