package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "ST_PathFillMode",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
@XmlEnum
public enum STPathFillMode {

   @XmlEnumValue("none")
   NONE("NONE", 0, "none"),
   @XmlEnumValue("norm")
   NORM("NORM", 1, "norm"),
   @XmlEnumValue("lighten")
   LIGHTEN("LIGHTEN", 2, "lighten"),
   @XmlEnumValue("lightenLess")
   LIGHTEN_LESS("LIGHTEN_LESS", 3, "lightenLess"),
   @XmlEnumValue("darken")
   DARKEN("DARKEN", 4, "darken"),
   @XmlEnumValue("darkenLess")
   DARKEN_LESS("DARKEN_LESS", 5, "darkenLess");
   private final String value;
   // $FF: synthetic field
   private static final STPathFillMode[] $VALUES = new STPathFillMode[]{NONE, NORM, LIGHTEN, LIGHTEN_LESS, DARKEN, DARKEN_LESS};


   private STPathFillMode(String var1, int var2, String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static STPathFillMode fromValue(String v) {
      STPathFillMode[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         STPathFillMode c = arr$[i$];
         if(c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }

}
