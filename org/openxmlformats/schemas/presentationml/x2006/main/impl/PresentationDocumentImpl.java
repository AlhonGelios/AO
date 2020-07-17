package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation;
import org.openxmlformats.schemas.presentationml.x2006.main.PresentationDocument;

public class PresentationDocumentImpl extends XmlComplexContentImpl implements PresentationDocument {

   private static final QName PRESENTATION$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "presentation");


   public PresentationDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTPresentation getPresentation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresentation var2 = null;
         var2 = (CTPresentation)this.get_store().find_element_user(PRESENTATION$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setPresentation(CTPresentation var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresentation var3 = null;
         var3 = (CTPresentation)this.get_store().find_element_user(PRESENTATION$0, 0);
         if(var3 == null) {
            var3 = (CTPresentation)this.get_store().add_element_user(PRESENTATION$0);
         }

         var3.set(var1);
      }
   }

   public CTPresentation addNewPresentation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresentation var2 = null;
         var2 = (CTPresentation)this.get_store().add_element_user(PRESENTATION$0);
         return var2;
      }
   }

}
