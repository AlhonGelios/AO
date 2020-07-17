package org.openxmlformats.schemas.officeDocument.x2006.customProperties.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.PropertiesDocument;

public class PropertiesDocumentImpl extends XmlComplexContentImpl implements PropertiesDocument {

   private static final QName PROPERTIES$0 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/custom-properties", "Properties");


   public PropertiesDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTProperties getProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProperties var2 = null;
         var2 = (CTProperties)this.get_store().find_element_user(PROPERTIES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setProperties(CTProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProperties var3 = null;
         var3 = (CTProperties)this.get_store().find_element_user(PROPERTIES$0, 0);
         if(var3 == null) {
            var3 = (CTProperties)this.get_store().add_element_user(PROPERTIES$0);
         }

         var3.set(var1);
      }
   }

   public CTProperties addNewProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProperties var2 = null;
         var2 = (CTProperties)this.get_store().add_element_user(PROPERTIES$0);
         return var2;
      }
   }

}
