package org.apache.poi.ss.usermodel;


public enum PageOrder {

   DOWN_THEN_OVER("DOWN_THEN_OVER", 0, 1),
   OVER_THEN_DOWN("OVER_THEN_DOWN", 1, 2);
   private int order;
   private static PageOrder[] _table = new PageOrder[3];
   // $FF: synthetic field
   private static final PageOrder[] $VALUES = new PageOrder[]{DOWN_THEN_OVER, OVER_THEN_DOWN};


   private PageOrder(String var1, int var2, int order) {
      this.order = order;
   }

   public int getValue() {
      return this.order;
   }

   public static PageOrder valueOf(int value) {
      return _table[value];
   }

   static {
      PageOrder[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         PageOrder c = arr$[i$];
         _table[c.getValue()] = c;
      }

   }
}
