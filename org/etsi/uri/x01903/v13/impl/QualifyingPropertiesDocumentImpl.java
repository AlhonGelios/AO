package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.QualifyingPropertiesDocument;
import org.etsi.uri.x01903.v13.QualifyingPropertiesType;

public class QualifyingPropertiesDocumentImpl extends XmlComplexContentImpl implements QualifyingPropertiesDocument {

   private static final QName QUALIFYINGPROPERTIES$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "QualifyingProperties");


   public QualifyingPropertiesDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public QualifyingPropertiesType getQualifyingProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         QualifyingPropertiesType var2 = null;
         var2 = (QualifyingPropertiesType)this.get_store().find_element_user(QUALIFYINGPROPERTIES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setQualifyingProperties(QualifyingPropertiesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         QualifyingPropertiesType var3 = null;
         var3 = (QualifyingPropertiesType)this.get_store().find_element_user(QUALIFYINGPROPERTIES$0, 0);
         if(var3 == null) {
            var3 = (QualifyingPropertiesType)this.get_store().add_element_user(QUALIFYINGPROPERTIES$0);
         }

         var3.set(var1);
      }
   }

   public QualifyingPropertiesType addNewQualifyingProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         QualifyingPropertiesType var2 = null;
         var2 = (QualifyingPropertiesType)this.get_store().add_element_user(QUALIFYINGPROPERTIES$0);
         return var2;
      }
   }

}
