package org.apache.poi.ss.usermodel;


public enum PrintOrientation {

   DEFAULT("DEFAULT", 0, 1),
   PORTRAIT("PORTRAIT", 1, 2),
   LANDSCAPE("LANDSCAPE", 2, 3);
   private int orientation;
   private static PrintOrientation[] _table = new PrintOrientation[4];
   // $FF: synthetic field
   private static final PrintOrientation[] $VALUES = new PrintOrientation[]{DEFAULT, PORTRAIT, LANDSCAPE};


   private PrintOrientation(String var1, int var2, int orientation) {
      this.orientation = orientation;
   }

   public int getValue() {
      return this.orientation;
   }

   public static PrintOrientation valueOf(int value) {
      return _table[value];
   }

   static {
      PrintOrientation[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         PrintOrientation c = arr$[i$];
         _table[c.getValue()] = c;
      }

   }
}
