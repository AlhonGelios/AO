package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.SstDocument;

public class SstDocumentImpl extends XmlComplexContentImpl implements SstDocument {

   private static final QName SST$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sst");


   public SstDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTSst getSst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSst var2 = null;
         var2 = (CTSst)this.get_store().find_element_user(SST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSst(CTSst var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSst var3 = null;
         var3 = (CTSst)this.get_store().find_element_user(SST$0, 0);
         if(var3 == null) {
            var3 = (CTSst)this.get_store().add_element_user(SST$0);
         }

         var3.set(var1);
      }
   }

   public CTSst addNewSst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSst var2 = null;
         var2 = (CTSst)this.get_store().add_element_user(SST$0);
         return var2;
      }
   }

}
