package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster;
import org.openxmlformats.schemas.presentationml.x2006.main.SldMasterDocument;

public class SldMasterDocumentImpl extends XmlComplexContentImpl implements SldMasterDocument {

   private static final QName SLDMASTER$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldMaster");


   public SldMasterDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTSlideMaster getSldMaster() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMaster var2 = null;
         var2 = (CTSlideMaster)this.get_store().find_element_user(SLDMASTER$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSldMaster(CTSlideMaster var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMaster var3 = null;
         var3 = (CTSlideMaster)this.get_store().find_element_user(SLDMASTER$0, 0);
         if(var3 == null) {
            var3 = (CTSlideMaster)this.get_store().add_element_user(SLDMASTER$0);
         }

         var3.set(var1);
      }
   }

   public CTSlideMaster addNewSldMaster() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMaster var2 = null;
         var2 = (CTSlideMaster)this.get_store().add_element_user(SLDMASTER$0);
         return var2;
      }
   }

}
