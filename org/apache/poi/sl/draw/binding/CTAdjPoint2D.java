package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_AdjPoint2D",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
)
public class CTAdjPoint2D {

   @XmlAttribute(
      required = true
   )
   protected String x;
   @XmlAttribute(
      required = true
   )
   protected String y;


   public String getX() {
      return this.x;
   }

   public void setX(String value) {
      this.x = value;
   }

   public boolean isSetX() {
      return this.x != null;
   }

   public String getY() {
      return this.y;
   }

   public void setY(String value) {
      this.y = value;
   }

   public boolean isSetY() {
      return this.y != null;
   }
}
