package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector;
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTVectorVariant;

public class CTVectorVariantImpl extends XmlComplexContentImpl implements CTVectorVariant {

   private static final QName VECTOR$0 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "vector");


   public CTVectorVariantImpl(SchemaType var1) {
      super(var1);
   }

   public CTVector getVector() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVector var2 = null;
         var2 = (CTVector)this.get_store().find_element_user(VECTOR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setVector(CTVector var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVector var3 = null;
         var3 = (CTVector)this.get_store().find_element_user(VECTOR$0, 0);
         if(var3 == null) {
            var3 = (CTVector)this.get_store().add_element_user(VECTOR$0);
         }

         var3.set(var1);
      }
   }

   public CTVector addNewVector() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVector var2 = null;
         var2 = (CTVector)this.get_store().add_element_user(VECTOR$0);
         return var2;
      }
   }

}
