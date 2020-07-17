package org.apache.poi.sl.draw.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.poi.sl.draw.binding.CTAdjPoint2D;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_ConnectionSite",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
   propOrder = {"pos"}
)
public class CTConnectionSite {

   @XmlElement(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      required = true
   )
   protected CTAdjPoint2D pos;
   @XmlAttribute(
      required = true
   )
   protected String ang;


   public CTAdjPoint2D getPos() {
      return this.pos;
   }

   public void setPos(CTAdjPoint2D value) {
      this.pos = value;
   }

   public boolean isSetPos() {
      return this.pos != null;
   }

   public String getAng() {
      return this.ang;
   }

   public void setAng(String value) {
      this.ang = value;
   }

   public boolean isSetAng() {
      return this.ang != null;
   }
}
