package org.apache.poi.xwpf.usermodel;

import java.util.HashMap;
import java.util.Map;

public enum BreakClear {

   NONE("NONE", 0, 1),
   LEFT("LEFT", 1, 2),
   RIGHT("RIGHT", 2, 3),
   ALL("ALL", 3, 4);
   private static Map imap = new HashMap();
   private final int value;
   // $FF: synthetic field
   private static final BreakClear[] $VALUES = new BreakClear[]{NONE, LEFT, RIGHT, ALL};


   private BreakClear(String var1, int var2, int val) {
      this.value = val;
   }

   public static BreakClear valueOf(int type) {
      BreakClear bType = (BreakClear)imap.get(Integer.valueOf(type));
      if(bType == null) {
         throw new IllegalArgumentException("Unknown break clear type: " + type);
      } else {
         return bType;
      }
   }

   public int getValue() {
      return this.value;
   }

   static {
      BreakClear[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         BreakClear p = arr$[i$];
         imap.put(Integer.valueOf(p.getValue()), p);
      }

   }
}
