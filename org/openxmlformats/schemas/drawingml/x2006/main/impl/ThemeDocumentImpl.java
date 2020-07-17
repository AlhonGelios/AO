package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;

public class ThemeDocumentImpl extends XmlComplexContentImpl implements ThemeDocument {

   private static final QName THEME$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "theme");


   public ThemeDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTOfficeStyleSheet getTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeStyleSheet var2 = null;
         var2 = (CTOfficeStyleSheet)this.get_store().find_element_user(THEME$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setTheme(CTOfficeStyleSheet var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeStyleSheet var3 = null;
         var3 = (CTOfficeStyleSheet)this.get_store().find_element_user(THEME$0, 0);
         if(var3 == null) {
            var3 = (CTOfficeStyleSheet)this.get_store().add_element_user(THEME$0);
         }

         var3.set(var1);
      }
   }

   public CTOfficeStyleSheet addNewTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeStyleSheet var2 = null;
         var2 = (CTOfficeStyleSheet)this.get_store().add_element_user(THEME$0);
         return var2;
      }
   }

}
