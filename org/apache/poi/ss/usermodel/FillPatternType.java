package org.apache.poi.ss.usermodel;


public enum FillPatternType {

   NO_FILL("NO_FILL", 0, 0),
   SOLID_FOREGROUND("SOLID_FOREGROUND", 1, 1),
   FINE_DOTS("FINE_DOTS", 2, 2),
   ALT_BARS("ALT_BARS", 3, 3),
   SPARSE_DOTS("SPARSE_DOTS", 4, 4),
   THICK_HORZ_BANDS("THICK_HORZ_BANDS", 5, 5),
   THICK_VERT_BANDS("THICK_VERT_BANDS", 6, 6),
   THICK_BACKWARD_DIAG("THICK_BACKWARD_DIAG", 7, 7),
   THICK_FORWARD_DIAG("THICK_FORWARD_DIAG", 8, 8),
   BIG_SPOTS("BIG_SPOTS", 9, 9),
   BRICKS("BRICKS", 10, 10),
   THIN_HORZ_BANDS("THIN_HORZ_BANDS", 11, 11),
   THIN_VERT_BANDS("THIN_VERT_BANDS", 12, 12),
   THIN_BACKWARD_DIAG("THIN_BACKWARD_DIAG", 13, 13),
   THIN_FORWARD_DIAG("THIN_FORWARD_DIAG", 14, 14),
   SQUARES("SQUARES", 15, 15),
   DIAMONDS("DIAMONDS", 16, 16),
   LESS_DOTS("LESS_DOTS", 17, 17),
   LEAST_DOTS("LEAST_DOTS", 18, 18);
   private final short code;
   private static final int length = values().length;
   // $FF: synthetic field
   private static final FillPatternType[] $VALUES = new FillPatternType[]{NO_FILL, SOLID_FOREGROUND, FINE_DOTS, ALT_BARS, SPARSE_DOTS, THICK_HORZ_BANDS, THICK_VERT_BANDS, THICK_BACKWARD_DIAG, THICK_FORWARD_DIAG, BIG_SPOTS, BRICKS, THIN_HORZ_BANDS, THIN_VERT_BANDS, THIN_BACKWARD_DIAG, THIN_FORWARD_DIAG, SQUARES, DIAMONDS, LESS_DOTS, LEAST_DOTS};


   private FillPatternType(String var1, int var2, int code) {
      this.code = (short)code;
   }

   public short getCode() {
      return this.code;
   }

   public static FillPatternType forInt(int code) {
      if(code >= 0 && code <= length) {
         return values()[code];
      } else {
         throw new IllegalArgumentException("Invalid FillPatternType code: " + code);
      }
   }

}
