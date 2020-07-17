package org.apache.poi.sl.draw.binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_GeomGuideList",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
   propOrder = {"gd"}
)
public class CTGeomGuideList {

   @XmlElement(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
   )
   protected List gd;


   public List getGd() {
      if(this.gd == null) {
         this.gd = new ArrayList();
      }

      return this.gd;
   }

   public boolean isSetGd() {
      return this.gd != null && !this.gd.isEmpty();
   }

   public void unsetGd() {
      this.gd = null;
   }
}
