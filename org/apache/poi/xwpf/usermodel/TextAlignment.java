package org.apache.poi.xwpf.usermodel;

import java.util.HashMap;
import java.util.Map;

public enum TextAlignment {

   TOP("TOP", 0, 1),
   CENTER("CENTER", 1, 2),
   BASELINE("BASELINE", 2, 3),
   BOTTOM("BOTTOM", 3, 4),
   AUTO("AUTO", 4, 5);
   private static Map imap = new HashMap();
   private final int value;
   // $FF: synthetic field
   private static final TextAlignment[] $VALUES = new TextAlignment[]{TOP, CENTER, BASELINE, BOTTOM, AUTO};


   private TextAlignment(String var1, int var2, int val) {
      this.value = val;
   }

   public static TextAlignment valueOf(int type) {
      TextAlignment align = (TextAlignment)imap.get(Integer.valueOf(type));
      if(align == null) {
         throw new IllegalArgumentException("Unknown text alignment: " + type);
      } else {
         return align;
      }
   }

   public int getValue() {
      return this.value;
   }

   static {
      TextAlignment[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         TextAlignment p = arr$[i$];
         imap.put(Integer.valueOf(p.getValue()), p);
      }

   }
}
