package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.ExternalLinkDocument;

public class ExternalLinkDocumentImpl extends XmlComplexContentImpl implements ExternalLinkDocument {

   private static final QName EXTERNALLINK$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalLink");


   public ExternalLinkDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTExternalLink getExternalLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalLink var2 = null;
         var2 = (CTExternalLink)this.get_store().find_element_user(EXTERNALLINK$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setExternalLink(CTExternalLink var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalLink var3 = null;
         var3 = (CTExternalLink)this.get_store().find_element_user(EXTERNALLINK$0, 0);
         if(var3 == null) {
            var3 = (CTExternalLink)this.get_store().add_element_user(EXTERNALLINK$0);
         }

         var3.set(var1);
      }
   }

   public CTExternalLink addNewExternalLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalLink var2 = null;
         var2 = (CTExternalLink)this.get_store().add_element_user(EXTERNALLINK$0);
         return var2;
      }
   }

}
