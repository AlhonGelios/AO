package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.StyleSheetDocument;

public class StyleSheetDocumentImpl extends XmlComplexContentImpl implements StyleSheetDocument {

   private static final QName STYLESHEET$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "styleSheet");


   public StyleSheetDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTStylesheet getStyleSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStylesheet var2 = null;
         var2 = (CTStylesheet)this.get_store().find_element_user(STYLESHEET$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setStyleSheet(CTStylesheet var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStylesheet var3 = null;
         var3 = (CTStylesheet)this.get_store().find_element_user(STYLESHEET$0, 0);
         if(var3 == null) {
            var3 = (CTStylesheet)this.get_store().add_element_user(STYLESHEET$0);
         }

         var3.set(var1);
      }
   }

   public CTStylesheet addNewStyleSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStylesheet var2 = null;
         var2 = (CTStylesheet)this.get_store().add_element_user(STYLESHEET$0);
         return var2;
      }
   }

}
