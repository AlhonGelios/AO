package org.apache.poi.common.usermodel;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.util.Internal;

public enum HyperlinkType {

   @Internal
   NONE("NONE", 0, -1),
   URL("URL", 1, 1),
   DOCUMENT("DOCUMENT", 2, 2),
   EMAIL("EMAIL", 3, 3),
   FILE("FILE", 4, 4);
   @Internal(
      since = "3.15 beta 3"
   )
   @Deprecated
   private final int code;
   private static final Map map = new HashMap();
   // $FF: synthetic field
   private static final HyperlinkType[] $VALUES = new HyperlinkType[]{NONE, URL, DOCUMENT, EMAIL, FILE};


   @Internal(
      since = "3.15 beta 3"
   )
   @Deprecated
   private HyperlinkType(String var1, int var2, int code) {
      this.code = code;
   }

   @Internal(
      since = "3.15 beta 3"
   )
   @Deprecated
   public int getCode() {
      return this.code;
   }

   @Internal(
      since = "3.15 beta 3"
   )
   @Deprecated
   public static HyperlinkType forInt(int code) {
      HyperlinkType type = (HyperlinkType)map.get(Integer.valueOf(code));
      if(type == null) {
         throw new IllegalArgumentException("Invalid type: " + code);
      } else {
         return type;
      }
   }

   static {
      HyperlinkType[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         HyperlinkType type = arr$[i$];
         map.put(Integer.valueOf(type.getCode()), type);
      }

   }
}
