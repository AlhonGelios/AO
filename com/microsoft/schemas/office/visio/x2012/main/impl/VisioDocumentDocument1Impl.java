package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.VisioDocumentDocument1;
import com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class VisioDocumentDocument1Impl extends XmlComplexContentImpl implements VisioDocumentDocument1 {

   private static final QName VISIODOCUMENT$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "VisioDocument");


   public VisioDocumentDocument1Impl(SchemaType var1) {
      super(var1);
   }

   public VisioDocumentType getVisioDocument() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         VisioDocumentType var2 = null;
         var2 = (VisioDocumentType)this.get_store().find_element_user(VISIODOCUMENT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setVisioDocument(VisioDocumentType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         VisioDocumentType var3 = null;
         var3 = (VisioDocumentType)this.get_store().find_element_user(VISIODOCUMENT$0, 0);
         if(var3 == null) {
            var3 = (VisioDocumentType)this.get_store().add_element_user(VISIODOCUMENT$0);
         }

         var3.set(var1);
      }
   }

   public VisioDocumentType addNewVisioDocument() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         VisioDocumentType var2 = null;
         var2 = (VisioDocumentType)this.get_store().add_element_user(VISIODOCUMENT$0);
         return var2;
      }
   }

}
