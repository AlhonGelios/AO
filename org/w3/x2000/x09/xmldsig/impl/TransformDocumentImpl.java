package org.w3.x2000.x09.xmldsig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.w3.x2000.x09.xmldsig.TransformDocument;
import org.w3.x2000.x09.xmldsig.TransformType;

public class TransformDocumentImpl extends XmlComplexContentImpl implements TransformDocument {

   private static final QName TRANSFORM$0 = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");


   public TransformDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public TransformType getTransform() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TransformType var2 = null;
         var2 = (TransformType)this.get_store().find_element_user(TRANSFORM$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setTransform(TransformType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TransformType var3 = null;
         var3 = (TransformType)this.get_store().find_element_user(TRANSFORM$0, 0);
         if(var3 == null) {
            var3 = (TransformType)this.get_store().add_element_user(TRANSFORM$0);
         }

         var3.set(var1);
      }
   }

   public TransformType addNewTransform() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TransformType var2 = null;
         var2 = (TransformType)this.get_store().add_element_user(TRANSFORM$0);
         return var2;
      }
   }

}
