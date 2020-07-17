package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.HdrDocument;

public class HdrDocumentImpl extends XmlComplexContentImpl implements HdrDocument {

   private static final QName HDR$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hdr");


   public HdrDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTHdrFtr getHdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtr var2 = null;
         var2 = (CTHdrFtr)this.get_store().find_element_user(HDR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setHdr(CTHdrFtr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtr var3 = null;
         var3 = (CTHdrFtr)this.get_store().find_element_user(HDR$0, 0);
         if(var3 == null) {
            var3 = (CTHdrFtr)this.get_store().add_element_user(HDR$0);
         }

         var3.set(var1);
      }
   }

   public CTHdrFtr addNewHdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtr var2 = null;
         var2 = (CTHdrFtr)this.get_store().add_element_user(HDR$0);
         return var2;
      }
   }

}
