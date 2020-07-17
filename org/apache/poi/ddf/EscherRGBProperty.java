package org.apache.poi.ddf;

import org.apache.poi.ddf.EscherSimpleProperty;
import org.apache.poi.util.HexDump;

public class EscherRGBProperty extends EscherSimpleProperty {

   public EscherRGBProperty(short propertyNumber, int rgbColor) {
      super(propertyNumber, rgbColor);
   }

   public int getRgbColor() {
      return this.propertyValue;
   }

   public byte getRed() {
      return (byte)(this.propertyValue & 255);
   }

   public byte getGreen() {
      return (byte)(this.propertyValue >> 8 & 255);
   }

   public byte getBlue() {
      return (byte)(this.propertyValue >> 16 & 255);
   }

   public String toXml(String tab) {
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append("<").append(this.getClass().getSimpleName()).append(" id=\"0x").append(HexDump.toHex(this.getId())).append("\" name=\"").append(this.getName()).append("\" blipId=\"").append(this.isBlipId()).append("\" value=\"0x").append(HexDump.toHex(this.propertyValue)).append("\"/>\n");
      return builder.toString();
   }
}
