package org.apache.poi.xwpf.usermodel;

import java.util.HashMap;
import java.util.Map;

public enum LineSpacingRule {

   AUTO("AUTO", 0, 1),
   EXACT("EXACT", 1, 2),
   AT_LEAST("AT_LEAST", 2, 3);
   private static Map imap = new HashMap();
   private final int value;
   // $FF: synthetic field
   private static final LineSpacingRule[] $VALUES = new LineSpacingRule[]{AUTO, EXACT, AT_LEAST};


   private LineSpacingRule(String var1, int var2, int val) {
      this.value = val;
   }

   public static LineSpacingRule valueOf(int type) {
      LineSpacingRule lineType = (LineSpacingRule)imap.get(Integer.valueOf(type));
      if(lineType == null) {
         throw new IllegalArgumentException("Unknown line type: " + type);
      } else {
         return lineType;
      }
   }

   public int getValue() {
      return this.value;
   }

   static {
      LineSpacingRule[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         LineSpacingRule p = arr$[i$];
         imap.put(Integer.valueOf(p.getValue()), p);
      }

   }
}
