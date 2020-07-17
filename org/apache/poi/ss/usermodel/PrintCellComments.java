package org.apache.poi.ss.usermodel;


public enum PrintCellComments {

   NONE("NONE", 0, 1),
   AS_DISPLAYED("AS_DISPLAYED", 1, 2),
   AT_END("AT_END", 2, 3);
   private int comments;
   private static PrintCellComments[] _table = new PrintCellComments[4];
   // $FF: synthetic field
   private static final PrintCellComments[] $VALUES = new PrintCellComments[]{NONE, AS_DISPLAYED, AT_END};


   private PrintCellComments(String var1, int var2, int comments) {
      this.comments = comments;
   }

   public int getValue() {
      return this.comments;
   }

   public static PrintCellComments valueOf(int value) {
      return _table[value];
   }

   static {
      PrintCellComments[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         PrintCellComments c = arr$[i$];
         _table[c.getValue()] = c;
      }

   }
}
