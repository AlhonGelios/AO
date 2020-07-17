package org.apache.poi.xslf.model;

import org.apache.poi.xslf.model.PropertyFetcher;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties;

public abstract class TextBodyPropertyFetcher extends PropertyFetcher {

   public boolean fetch(XSLFShape shape) {
      XmlObject[] o = shape.getXmlObject().selectPath("declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\' declare namespace a=\'http://schemas.openxmlformats.org/drawingml/2006/main\' .//p:txBody/a:bodyPr");
      if(o.length == 1) {
         CTTextBodyProperties props = (CTTextBodyProperties)o[0];
         return this.fetch(props);
      } else {
         return false;
      }
   }

   public abstract boolean fetch(CTTextBodyProperties var1);
}
