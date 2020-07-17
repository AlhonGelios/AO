package org.apache.poi.xslf.model;

import org.apache.poi.xslf.model.PropertyFetcher;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;

public abstract class ParagraphPropertyFetcher extends PropertyFetcher {

   int _level;


   public ParagraphPropertyFetcher(int level) {
      this._level = level;
   }

   public boolean fetch(XSLFShape shape) {
      XmlObject[] o = shape.getXmlObject().selectPath("declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\' declare namespace a=\'http://schemas.openxmlformats.org/drawingml/2006/main\' .//p:txBody/a:lstStyle/a:lvl" + (this._level + 1) + "pPr");
      if(o.length == 1) {
         CTTextParagraphProperties props = (CTTextParagraphProperties)o[0];
         return this.fetch(props);
      } else {
         return false;
      }
   }

   public abstract boolean fetch(CTTextParagraphProperties var1);
}
