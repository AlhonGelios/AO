package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "ST_SchemeColorVal",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
@XmlEnum
public enum STSchemeColorVal {

   @XmlEnumValue("bg1")
   BG_1("BG_1", 0, "bg1"),
   @XmlEnumValue("tx1")
   TX_1("TX_1", 1, "tx1"),
   @XmlEnumValue("bg2")
   BG_2("BG_2", 2, "bg2"),
   @XmlEnumValue("tx2")
   TX_2("TX_2", 3, "tx2"),
   @XmlEnumValue("accent1")
   ACCENT_1("ACCENT_1", 4, "accent1"),
   @XmlEnumValue("accent2")
   ACCENT_2("ACCENT_2", 5, "accent2"),
   @XmlEnumValue("accent3")
   ACCENT_3("ACCENT_3", 6, "accent3"),
   @XmlEnumValue("accent4")
   ACCENT_4("ACCENT_4", 7, "accent4"),
   @XmlEnumValue("accent5")
   ACCENT_5("ACCENT_5", 8, "accent5"),
   @XmlEnumValue("accent6")
   ACCENT_6("ACCENT_6", 9, "accent6"),
   @XmlEnumValue("hlink")
   HLINK("HLINK", 10, "hlink"),
   @XmlEnumValue("folHlink")
   FOL_HLINK("FOL_HLINK", 11, "folHlink"),
   @XmlEnumValue("phClr")
   PH_CLR("PH_CLR", 12, "phClr"),
   @XmlEnumValue("dk1")
   DK_1("DK_1", 13, "dk1"),
   @XmlEnumValue("lt1")
   LT_1("LT_1", 14, "lt1"),
   @XmlEnumValue("dk2")
   DK_2("DK_2", 15, "dk2"),
   @XmlEnumValue("lt2")
   LT_2("LT_2", 16, "lt2");
   private final String value;
   // $FF: synthetic field
   private static final STSchemeColorVal[] $VALUES = new STSchemeColorVal[]{BG_1, TX_1, BG_2, TX_2, ACCENT_1, ACCENT_2, ACCENT_3, ACCENT_4, ACCENT_5, ACCENT_6, HLINK, FOL_HLINK, PH_CLR, DK_1, LT_1, DK_2, LT_2};


   private STSchemeColorVal(String var1, int var2, String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static STSchemeColorVal fromValue(String v) {
      STSchemeColorVal[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         STSchemeColorVal c = arr$[i$];
         if(c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }

}
