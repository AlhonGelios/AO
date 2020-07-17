package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "ST_BlackWhiteMode",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
@XmlEnum
public enum STBlackWhiteMode {

   @XmlEnumValue("clr")
   CLR("CLR", 0, "clr"),
   @XmlEnumValue("auto")
   AUTO("AUTO", 1, "auto"),
   @XmlEnumValue("gray")
   GRAY("GRAY", 2, "gray"),
   @XmlEnumValue("ltGray")
   LT_GRAY("LT_GRAY", 3, "ltGray"),
   @XmlEnumValue("invGray")
   INV_GRAY("INV_GRAY", 4, "invGray"),
   @XmlEnumValue("grayWhite")
   GRAY_WHITE("GRAY_WHITE", 5, "grayWhite"),
   @XmlEnumValue("blackGray")
   BLACK_GRAY("BLACK_GRAY", 6, "blackGray"),
   @XmlEnumValue("blackWhite")
   BLACK_WHITE("BLACK_WHITE", 7, "blackWhite"),
   @XmlEnumValue("black")
   BLACK("BLACK", 8, "black"),
   @XmlEnumValue("white")
   WHITE("WHITE", 9, "white"),
   @XmlEnumValue("hidden")
   HIDDEN("HIDDEN", 10, "hidden");
   private final String value;
   // $FF: synthetic field
   private static final STBlackWhiteMode[] $VALUES = new STBlackWhiteMode[]{CLR, AUTO, GRAY, LT_GRAY, INV_GRAY, GRAY_WHITE, BLACK_GRAY, BLACK_WHITE, BLACK, WHITE, HIDDEN};


   private STBlackWhiteMode(String var1, int var2, String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static STBlackWhiteMode fromValue(String v) {
      STBlackWhiteMode[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         STBlackWhiteMode c = arr$[i$];
         if(c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }

}
