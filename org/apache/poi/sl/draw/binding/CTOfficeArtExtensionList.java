package org.apache.poi.sl.draw.binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CT_OfficeArtExtensionList",
   namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
   propOrder = {"ext"}
)
public class CTOfficeArtExtensionList {

   @XmlElement(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main"
   )
   protected List ext;


   public List getExt() {
      if(this.ext == null) {
         this.ext = new ArrayList();
      }

      return this.ext;
   }

   public boolean isSetExt() {
      return this.ext != null && !this.ext.isEmpty();
   }

   public void unsetExt() {
      this.ext = null;
   }
}
