package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.DocumentDocument;

public class DocumentDocumentImpl extends XmlComplexContentImpl implements DocumentDocument {

   private static final QName DOCUMENT$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "document");


   public DocumentDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTDocument1 getDocument() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocument1 var2 = null;
         var2 = (CTDocument1)this.get_store().find_element_user(DOCUMENT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setDocument(CTDocument1 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocument1 var3 = null;
         var3 = (CTDocument1)this.get_store().find_element_user(DOCUMENT$0, 0);
         if(var3 == null) {
            var3 = (CTDocument1)this.get_store().add_element_user(DOCUMENT$0);
         }

         var3.set(var1);
      }
   }

   public CTDocument1 addNewDocument() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocument1 var2 = null;
         var2 = (CTDocument1)this.get_store().add_element_user(DOCUMENT$0);
         return var2;
      }
   }

}
