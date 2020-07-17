package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "ST_RectAlignment",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
@XmlEnum
public enum STRectAlignment {

   @XmlEnumValue("tl")
   TL("TL", 0, "tl"),
   @XmlEnumValue("t")
   T("T", 1, "t"),
   @XmlEnumValue("tr")
   TR("TR", 2, "tr"),
   @XmlEnumValue("l")
   L("L", 3, "l"),
   @XmlEnumValue("ctr")
   CTR("CTR", 4, "ctr"),
   @XmlEnumValue("r")
   R("R", 5, "r"),
   @XmlEnumValue("bl")
   BL("BL", 6, "bl"),
   @XmlEnumValue("b")
   B("B", 7, "b"),
   @XmlEnumValue("br")
   BR("BR", 8, "br");
   private final String value;
   // $FF: synthetic field
   private static final STRectAlignment[] $VALUES = new STRectAlignment[]{TL, T, TR, L, CTR, R, BL, B, BR};


   private STRectAlignment(String var1, int var2, String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static STRectAlignment fromValue(String v) {
      STRectAlignment[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         STRectAlignment c = arr$[i$];
         if(c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }

}
