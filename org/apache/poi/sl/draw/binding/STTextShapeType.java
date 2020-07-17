package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(
   name = "ST_TextShapeType",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
@XmlEnum
public enum STTextShapeType {

   @XmlEnumValue("textNoShape")
   TEXT_NO_SHAPE("TEXT_NO_SHAPE", 0, "textNoShape"),
   @XmlEnumValue("textPlain")
   TEXT_PLAIN("TEXT_PLAIN", 1, "textPlain"),
   @XmlEnumValue("textStop")
   TEXT_STOP("TEXT_STOP", 2, "textStop"),
   @XmlEnumValue("textTriangle")
   TEXT_TRIANGLE("TEXT_TRIANGLE", 3, "textTriangle"),
   @XmlEnumValue("textTriangleInverted")
   TEXT_TRIANGLE_INVERTED("TEXT_TRIANGLE_INVERTED", 4, "textTriangleInverted"),
   @XmlEnumValue("textChevron")
   TEXT_CHEVRON("TEXT_CHEVRON", 5, "textChevron"),
   @XmlEnumValue("textChevronInverted")
   TEXT_CHEVRON_INVERTED("TEXT_CHEVRON_INVERTED", 6, "textChevronInverted"),
   @XmlEnumValue("textRingInside")
   TEXT_RING_INSIDE("TEXT_RING_INSIDE", 7, "textRingInside"),
   @XmlEnumValue("textRingOutside")
   TEXT_RING_OUTSIDE("TEXT_RING_OUTSIDE", 8, "textRingOutside"),
   @XmlEnumValue("textArchUp")
   TEXT_ARCH_UP("TEXT_ARCH_UP", 9, "textArchUp"),
   @XmlEnumValue("textArchDown")
   TEXT_ARCH_DOWN("TEXT_ARCH_DOWN", 10, "textArchDown"),
   @XmlEnumValue("textCircle")
   TEXT_CIRCLE("TEXT_CIRCLE", 11, "textCircle"),
   @XmlEnumValue("textButton")
   TEXT_BUTTON("TEXT_BUTTON", 12, "textButton"),
   @XmlEnumValue("textArchUpPour")
   TEXT_ARCH_UP_POUR("TEXT_ARCH_UP_POUR", 13, "textArchUpPour"),
   @XmlEnumValue("textArchDownPour")
   TEXT_ARCH_DOWN_POUR("TEXT_ARCH_DOWN_POUR", 14, "textArchDownPour"),
   @XmlEnumValue("textCirclePour")
   TEXT_CIRCLE_POUR("TEXT_CIRCLE_POUR", 15, "textCirclePour"),
   @XmlEnumValue("textButtonPour")
   TEXT_BUTTON_POUR("TEXT_BUTTON_POUR", 16, "textButtonPour"),
   @XmlEnumValue("textCurveUp")
   TEXT_CURVE_UP("TEXT_CURVE_UP", 17, "textCurveUp"),
   @XmlEnumValue("textCurveDown")
   TEXT_CURVE_DOWN("TEXT_CURVE_DOWN", 18, "textCurveDown"),
   @XmlEnumValue("textCanUp")
   TEXT_CAN_UP("TEXT_CAN_UP", 19, "textCanUp"),
   @XmlEnumValue("textCanDown")
   TEXT_CAN_DOWN("TEXT_CAN_DOWN", 20, "textCanDown"),
   @XmlEnumValue("textWave1")
   TEXT_WAVE_1("TEXT_WAVE_1", 21, "textWave1"),
   @XmlEnumValue("textWave2")
   TEXT_WAVE_2("TEXT_WAVE_2", 22, "textWave2"),
   @XmlEnumValue("textDoubleWave1")
   TEXT_DOUBLE_WAVE_1("TEXT_DOUBLE_WAVE_1", 23, "textDoubleWave1"),
   @XmlEnumValue("textWave4")
   TEXT_WAVE_4("TEXT_WAVE_4", 24, "textWave4"),
   @XmlEnumValue("textInflate")
   TEXT_INFLATE("TEXT_INFLATE", 25, "textInflate"),
   @XmlEnumValue("textDeflate")
   TEXT_DEFLATE("TEXT_DEFLATE", 26, "textDeflate"),
   @XmlEnumValue("textInflateBottom")
   TEXT_INFLATE_BOTTOM("TEXT_INFLATE_BOTTOM", 27, "textInflateBottom"),
   @XmlEnumValue("textDeflateBottom")
   TEXT_DEFLATE_BOTTOM("TEXT_DEFLATE_BOTTOM", 28, "textDeflateBottom"),
   @XmlEnumValue("textInflateTop")
   TEXT_INFLATE_TOP("TEXT_INFLATE_TOP", 29, "textInflateTop"),
   @XmlEnumValue("textDeflateTop")
   TEXT_DEFLATE_TOP("TEXT_DEFLATE_TOP", 30, "textDeflateTop"),
   @XmlEnumValue("textDeflateInflate")
   TEXT_DEFLATE_INFLATE("TEXT_DEFLATE_INFLATE", 31, "textDeflateInflate"),
   @XmlEnumValue("textDeflateInflateDeflate")
   TEXT_DEFLATE_INFLATE_DEFLATE("TEXT_DEFLATE_INFLATE_DEFLATE", 32, "textDeflateInflateDeflate"),
   @XmlEnumValue("textFadeRight")
   TEXT_FADE_RIGHT("TEXT_FADE_RIGHT", 33, "textFadeRight"),
   @XmlEnumValue("textFadeLeft")
   TEXT_FADE_LEFT("TEXT_FADE_LEFT", 34, "textFadeLeft"),
   @XmlEnumValue("textFadeUp")
   TEXT_FADE_UP("TEXT_FADE_UP", 35, "textFadeUp"),
   @XmlEnumValue("textFadeDown")
   TEXT_FADE_DOWN("TEXT_FADE_DOWN", 36, "textFadeDown"),
   @XmlEnumValue("textSlantUp")
   TEXT_SLANT_UP("TEXT_SLANT_UP", 37, "textSlantUp"),
   @XmlEnumValue("textSlantDown")
   TEXT_SLANT_DOWN("TEXT_SLANT_DOWN", 38, "textSlantDown"),
   @XmlEnumValue("textCascadeUp")
   TEXT_CASCADE_UP("TEXT_CASCADE_UP", 39, "textCascadeUp"),
   @XmlEnumValue("textCascadeDown")
   TEXT_CASCADE_DOWN("TEXT_CASCADE_DOWN", 40, "textCascadeDown");
   private final String value;
   // $FF: synthetic field
   private static final STTextShapeType[] $VALUES = new STTextShapeType[]{TEXT_NO_SHAPE, TEXT_PLAIN, TEXT_STOP, TEXT_TRIANGLE, TEXT_TRIANGLE_INVERTED, TEXT_CHEVRON, TEXT_CHEVRON_INVERTED, TEXT_RING_INSIDE, TEXT_RING_OUTSIDE, TEXT_ARCH_UP, TEXT_ARCH_DOWN, TEXT_CIRCLE, TEXT_BUTTON, TEXT_ARCH_UP_POUR, TEXT_ARCH_DOWN_POUR, TEXT_CIRCLE_POUR, TEXT_BUTTON_POUR, TEXT_CURVE_UP, TEXT_CURVE_DOWN, TEXT_CAN_UP, TEXT_CAN_DOWN, TEXT_WAVE_1, TEXT_WAVE_2, TEXT_DOUBLE_WAVE_1, TEXT_WAVE_4, TEXT_INFLATE, TEXT_DEFLATE, TEXT_INFLATE_BOTTOM, TEXT_DEFLATE_BOTTOM, TEXT_INFLATE_TOP, TEXT_DEFLATE_TOP, TEXT_DEFLATE_INFLATE, TEXT_DEFLATE_INFLATE_DEFLATE, TEXT_FADE_RIGHT, TEXT_FADE_LEFT, TEXT_FADE_UP, TEXT_FADE_DOWN, TEXT_SLANT_UP, TEXT_SLANT_DOWN, TEXT_CASCADE_UP, TEXT_CASCADE_DOWN};


   private STTextShapeType(String var1, int var2, String v) {
      this.value = v;
   }

   public String value() {
      return this.value;
   }

   public static STTextShapeType fromValue(String v) {
      STTextShapeType[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         STTextShapeType c = arr$[i$];
         if(c.value.equals(v)) {
            return c;
         }
      }

      throw new IllegalArgumentException(v);
   }

}
