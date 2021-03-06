package org.apache.poi.sl.draw.binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.poi.sl.draw.binding.CTPolarAdjustHandle;
import org.apache.poi.sl.draw.binding.CTXYAdjustHandle;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_AdjustHandleList",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
   propOrder = {"ahXYOrAhPolar"}
)
public class CTAdjustHandleList {

   @XmlElements({      @XmlElement(
         name = "ahXY",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTXYAdjustHandle.class
      ),       @XmlElement(
         name = "ahPolar",
         namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
         type = CTPolarAdjustHandle.class
      )})
   protected List ahXYOrAhPolar;


   public List getAhXYOrAhPolar() {
      if(this.ahXYOrAhPolar == null) {
         this.ahXYOrAhPolar = new ArrayList();
      }

      return this.ahXYOrAhPolar;
   }

   public boolean isSetAhXYOrAhPolar() {
      return this.ahXYOrAhPolar != null && !this.ahXYOrAhPolar.isEmpty();
   }

   public void unsetAhXYOrAhPolar() {
      this.ahXYOrAhPolar = null;
   }
}
