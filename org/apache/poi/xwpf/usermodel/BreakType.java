package org.apache.poi.xwpf.usermodel;

import java.util.HashMap;
import java.util.Map;

public enum BreakType {

   PAGE("PAGE", 0, 1),
   COLUMN("COLUMN", 1, 2),
   TEXT_WRAPPING("TEXT_WRAPPING", 2, 3);
   private static Map imap = new HashMap();
   private final int value;
   // $FF: synthetic field
   private static final BreakType[] $VALUES = new BreakType[]{PAGE, COLUMN, TEXT_WRAPPING};


   private BreakType(String var1, int var2, int val) {
      this.value = val;
   }

   public static BreakType valueOf(int type) {
      BreakType bType = (BreakType)imap.get(Integer.valueOf(type));
      if(bType == null) {
         throw new IllegalArgumentException("Unknown break type: " + type);
      } else {
         return bType;
      }
   }

   public int getValue() {
      return this.value;
   }

   static {
      BreakType[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         BreakType p = arr$[i$];
         imap.put(Integer.valueOf(p.getValue()), p);
      }

   }
}
