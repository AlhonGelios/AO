package org.apache.poi.xwpf.usermodel;

import java.util.HashMap;
import java.util.Map;

public enum UnderlinePatterns {

   SINGLE("SINGLE", 0, 1),
   WORDS("WORDS", 1, 2),
   DOUBLE("DOUBLE", 2, 3),
   THICK("THICK", 3, 4),
   DOTTED("DOTTED", 4, 5),
   DOTTED_HEAVY("DOTTED_HEAVY", 5, 6),
   DASH("DASH", 6, 7),
   DASHED_HEAVY("DASHED_HEAVY", 7, 8),
   DASH_LONG("DASH_LONG", 8, 9),
   DASH_LONG_HEAVY("DASH_LONG_HEAVY", 9, 10),
   DOT_DASH("DOT_DASH", 10, 11),
   DASH_DOT_HEAVY("DASH_DOT_HEAVY", 11, 12),
   DOT_DOT_DASH("DOT_DOT_DASH", 12, 13),
   DASH_DOT_DOT_HEAVY("DASH_DOT_DOT_HEAVY", 13, 14),
   WAVE("WAVE", 14, 15),
   WAVY_HEAVY("WAVY_HEAVY", 15, 16),
   WAVY_DOUBLE("WAVY_DOUBLE", 16, 17),
   NONE("NONE", 17, 18);
   private static Map imap = new HashMap();
   private final int value;
   // $FF: synthetic field
   private static final UnderlinePatterns[] $VALUES = new UnderlinePatterns[]{SINGLE, WORDS, DOUBLE, THICK, DOTTED, DOTTED_HEAVY, DASH, DASHED_HEAVY, DASH_LONG, DASH_LONG_HEAVY, DOT_DASH, DASH_DOT_HEAVY, DOT_DOT_DASH, DASH_DOT_DOT_HEAVY, WAVE, WAVY_HEAVY, WAVY_DOUBLE, NONE};


   private UnderlinePatterns(String var1, int var2, int val) {
      this.value = val;
   }

   public static UnderlinePatterns valueOf(int type) {
      UnderlinePatterns align = (UnderlinePatterns)imap.get(Integer.valueOf(type));
      if(align == null) {
         throw new IllegalArgumentException("Unknown underline pattern: " + type);
      } else {
         return align;
      }
   }

   public int getValue() {
      return this.value;
   }

   static {
      UnderlinePatterns[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         UnderlinePatterns p = arr$[i$];
         imap.put(Integer.valueOf(p.getValue()), p);
      }

   }
}
