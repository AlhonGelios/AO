package org.apache.poi.xwpf.usermodel;

import java.util.HashMap;
import java.util.Map;

public enum VerticalAlign {

   BASELINE("BASELINE", 0, 1),
   SUPERSCRIPT("SUPERSCRIPT", 1, 2),
   SUBSCRIPT("SUBSCRIPT", 2, 3);
   private static Map imap = new HashMap();
   private final int value;
   // $FF: synthetic field
   private static final VerticalAlign[] $VALUES = new VerticalAlign[]{BASELINE, SUPERSCRIPT, SUBSCRIPT};


   private VerticalAlign(String var1, int var2, int val) {
      this.value = val;
   }

   public static VerticalAlign valueOf(int type) {
      VerticalAlign align = (VerticalAlign)imap.get(Integer.valueOf(type));
      if(align == null) {
         throw new IllegalArgumentException("Unknown vertical alignment: " + type);
      } else {
         return align;
      }
   }

   public int getValue() {
      return this.value;
   }

   static {
      VerticalAlign[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         VerticalAlign p = arr$[i$];
         imap.put(Integer.valueOf(p.getValue()), p);
      }

   }
}
