package org.apache.poi.ss.usermodel;


public interface ConditionalFormattingThreshold {

   ConditionalFormattingThreshold.RangeType getRangeType();

   void setRangeType(ConditionalFormattingThreshold.RangeType var1);

   String getFormula();

   void setFormula(String var1);

   Double getValue();

   void setValue(Double var1);

   public static enum RangeType {

      NUMBER("NUMBER", 0, 1, "num"),
      MIN("MIN", 1, 2, "min"),
      MAX("MAX", 2, 3, "max"),
      PERCENT("PERCENT", 3, 4, "percent"),
      PERCENTILE("PERCENTILE", 4, 5, "percentile"),
      UNALLOCATED("UNALLOCATED", 5, 6, (String)null),
      FORMULA("FORMULA", 6, 7, "formula");
      public final int id;
      public final String name;
      // $FF: synthetic field
      private static final ConditionalFormattingThreshold.RangeType[] $VALUES = new ConditionalFormattingThreshold.RangeType[]{NUMBER, MIN, MAX, PERCENT, PERCENTILE, UNALLOCATED, FORMULA};


      public String toString() {
         return this.id + " - " + this.name;
      }

      public static ConditionalFormattingThreshold.RangeType byId(int id) {
         return values()[id - 1];
      }

      public static ConditionalFormattingThreshold.RangeType byName(String name) {
         ConditionalFormattingThreshold.RangeType[] arr$ = values();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            ConditionalFormattingThreshold.RangeType t = arr$[i$];
            if(t.name.equals(name)) {
               return t;
            }
         }

         return null;
      }

      private RangeType(String var1, int var2, int id, String name) {
         this.id = id;
         this.name = name;
      }

   }
}
