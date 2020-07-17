package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.StylesDocument;

public class StylesDocumentImpl extends XmlComplexContentImpl implements StylesDocument {

   private static final QName STYLES$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "styles");


   public StylesDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTStyles getStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyles var2 = null;
         var2 = (CTStyles)this.get_store().find_element_user(STYLES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setStyles(CTStyles var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyles var3 = null;
         var3 = (CTStyles)this.get_store().find_element_user(STYLES$0, 0);
         if(var3 == null) {
            var3 = (CTStyles)this.get_store().add_element_user(STYLES$0);
         }

         var3.set(var1);
      }
   }

   public CTStyles addNewStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyles var2 = null;
         var2 = (CTStyles)this.get_store().add_element_user(STYLES$0);
         return var2;
      }
   }

}
