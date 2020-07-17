package org.apache.poi.xssf.model;

import org.apache.poi.util.Internal;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape;

@Internal
public abstract class ParagraphPropertyFetcher {

   private Object _value;
   private int _level;


   public Object getValue() {
      return this._value;
   }

   public void setValue(Object val) {
      this._value = val;
   }

   public ParagraphPropertyFetcher(int level) {
      this._level = level;
   }

   public boolean fetch(CTShape shape) {
      XmlObject[] o = shape.selectPath("declare namespace xdr=\'http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing\' declare namespace a=\'http://schemas.openxmlformats.org/drawingml/2006/main\' .//xdr:txBody/a:lstStyle/a:lvl" + (this._level + 1) + "pPr");
      if(o.length == 1) {
         CTTextParagraphProperties props = (CTTextParagraphProperties)o[0];
         return this.fetch(props);
      } else {
         return false;
      }
   }

   public abstract boolean fetch(CTTextParagraphProperties var1);
}
