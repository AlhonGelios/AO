package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry;

public class CTNotesMasterIdListImpl extends XmlComplexContentImpl implements CTNotesMasterIdList {

   private static final QName NOTESMASTERID$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesMasterId");


   public CTNotesMasterIdListImpl(SchemaType var1) {
      super(var1);
   }

   public CTNotesMasterIdListEntry getNotesMasterId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesMasterIdListEntry var2 = null;
         var2 = (CTNotesMasterIdListEntry)this.get_store().find_element_user(NOTESMASTERID$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNotesMasterId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOTESMASTERID$0) != 0;
      }
   }

   public void setNotesMasterId(CTNotesMasterIdListEntry var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesMasterIdListEntry var3 = null;
         var3 = (CTNotesMasterIdListEntry)this.get_store().find_element_user(NOTESMASTERID$0, 0);
         if(var3 == null) {
            var3 = (CTNotesMasterIdListEntry)this.get_store().add_element_user(NOTESMASTERID$0);
         }

         var3.set(var1);
      }
   }

   public CTNotesMasterIdListEntry addNewNotesMasterId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesMasterIdListEntry var2 = null;
         var2 = (CTNotesMasterIdListEntry)this.get_store().add_element_user(NOTESMASTERID$0);
         return var2;
      }
   }

   public void unsetNotesMasterId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOTESMASTERID$0, 0);
      }
   }

}
