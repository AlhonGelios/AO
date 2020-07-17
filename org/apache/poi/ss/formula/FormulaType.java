package org.apache.poi.ss.formula;

import org.apache.poi.util.Internal;

@Internal
public enum FormulaType {

   CELL("CELL", 0, 0),
   SHARED("SHARED", 1, 1),
   ARRAY("ARRAY", 2, 2),
   CONDFORMAT("CONDFORMAT", 3, 3),
   NAMEDRANGE("NAMEDRANGE", 4, 4),
   DATAVALIDATION_LIST("DATAVALIDATION_LIST", 5, 5);
   private final int code;
   // $FF: synthetic field
   private static final FormulaType[] $VALUES = new FormulaType[]{CELL, SHARED, ARRAY, CONDFORMAT, NAMEDRANGE, DATAVALIDATION_LIST};


   private FormulaType(String var1, int var2, int code) {
      this.code = code;
   }

   public static FormulaType forInt(int code) {
      FormulaType[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         FormulaType type = arr$[i$];
         if(type.code == code) {
            return type;
         }
      }

      throw new IllegalArgumentException("Invalid FormulaType code: " + code);
   }

}
