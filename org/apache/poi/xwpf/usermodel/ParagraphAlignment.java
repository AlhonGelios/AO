package org.apache.poi.xwpf.usermodel;

import java.util.HashMap;
import java.util.Map;

public enum ParagraphAlignment {

   LEFT("LEFT", 0, 1),
   CENTER("CENTER", 1, 2),
   RIGHT("RIGHT", 2, 3),
   BOTH("BOTH", 3, 4),
   MEDIUM_KASHIDA("MEDIUM_KASHIDA", 4, 5),
   DISTRIBUTE("DISTRIBUTE", 5, 6),
   NUM_TAB("NUM_TAB", 6, 7),
   HIGH_KASHIDA("HIGH_KASHIDA", 7, 8),
   LOW_KASHIDA("LOW_KASHIDA", 8, 9),
   THAI_DISTRIBUTE("THAI_DISTRIBUTE", 9, 10);
   private static Map imap = new HashMap();
   private final int value;
   // $FF: synthetic field
   private static final ParagraphAlignment[] $VALUES = new ParagraphAlignment[]{LEFT, CENTER, RIGHT, BOTH, MEDIUM_KASHIDA, DISTRIBUTE, NUM_TAB, HIGH_KASHIDA, LOW_KASHIDA, THAI_DISTRIBUTE};


   private ParagraphAlignment(String var1, int var2, int val) {
      this.value = val;
   }

   public static ParagraphAlignment valueOf(int type) {
      ParagraphAlignment err = (ParagraphAlignment)imap.get(Integer.valueOf(type));
      if(err == null) {
         throw new IllegalArgumentException("Unknown paragraph alignment: " + type);
      } else {
         return err;
      }
   }

   public int getValue() {
      return this.value;
   }

   static {
      ParagraphAlignment[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         ParagraphAlignment p = arr$[i$];
         imap.put(Integer.valueOf(p.getValue()), p);
      }

   }
}
