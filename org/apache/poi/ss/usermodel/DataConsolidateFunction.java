package org.apache.poi.ss.usermodel;


public enum DataConsolidateFunction {

   AVERAGE("AVERAGE", 0, 1, "Average"),
   COUNT("COUNT", 1, 2, "Count"),
   COUNT_NUMS("COUNT_NUMS", 2, 3, "Count"),
   MAX("MAX", 3, 4, "Max"),
   MIN("MIN", 4, 5, "Min"),
   PRODUCT("PRODUCT", 5, 6, "Product"),
   STD_DEV("STD_DEV", 6, 7, "StdDev"),
   STD_DEVP("STD_DEVP", 7, 8, "StdDevp"),
   SUM("SUM", 8, 9, "Sum"),
   VAR("VAR", 9, 10, "Var"),
   VARP("VARP", 10, 11, "Varp");
   private final int value;
   private final String name;
   // $FF: synthetic field
   private static final DataConsolidateFunction[] $VALUES = new DataConsolidateFunction[]{AVERAGE, COUNT, COUNT_NUMS, MAX, MIN, PRODUCT, STD_DEV, STD_DEVP, SUM, VAR, VARP};


   private DataConsolidateFunction(String var1, int var2, int value, String name) {
      this.value = value;
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public int getValue() {
      return this.value;
   }

}
