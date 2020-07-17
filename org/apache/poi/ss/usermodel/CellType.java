package org.apache.poi.ss.usermodel;

import org.apache.poi.util.Internal;

public enum CellType {

   @Internal(
      since = "POI 3.15 beta 3"
   )
   _NONE("_NONE", 0, -1),
   NUMERIC("NUMERIC", 1, 0),
   STRING("STRING", 2, 1),
   FORMULA("FORMULA", 3, 2),
   BLANK("BLANK", 4, 3),
   BOOLEAN("BOOLEAN", 5, 4),
   ERROR("ERROR", 6, 5);
   private final int code;
   // $FF: synthetic field
   private static final CellType[] $VALUES = new CellType[]{_NONE, NUMERIC, STRING, FORMULA, BLANK, BOOLEAN, ERROR};


   private CellType(String var1, int var2, int code) {
      this.code = code;
   }

   public static CellType forInt(int code) {
      CellType[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CellType type = arr$[i$];
         if(type.code == code) {
            return type;
         }
      }

      throw new IllegalArgumentException("Invalid CellType code: " + code);
   }

   public int getCode() {
      return this.code;
   }

}
