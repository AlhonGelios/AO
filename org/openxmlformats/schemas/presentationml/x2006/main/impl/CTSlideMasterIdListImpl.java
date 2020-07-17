package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry;

public class CTSlideMasterIdListImpl extends XmlComplexContentImpl implements CTSlideMasterIdList {

   private static final QName SLDMASTERID$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldMasterId");


   public CTSlideMasterIdListImpl(SchemaType var1) {
      super(var1);
   }

   public List getSldMasterIdList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class SldMasterIdList extends AbstractList {

            public CTSlideMasterIdListEntry get(int var1) {
               return CTSlideMasterIdListImpl.this.getSldMasterIdArray(var1);
            }

            public CTSlideMasterIdListEntry set(int var1, CTSlideMasterIdListEntry var2) {
               CTSlideMasterIdListEntry var3 = CTSlideMasterIdListImpl.this.getSldMasterIdArray(var1);
               CTSlideMasterIdListImpl.this.setSldMasterIdArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTSlideMasterIdListEntry var2) {
               CTSlideMasterIdListImpl.this.insertNewSldMasterId(var1).set(var2);
            }

            public CTSlideMasterIdListEntry remove(int var1) {
               CTSlideMasterIdListEntry var2 = CTSlideMasterIdListImpl.this.getSldMasterIdArray(var1);
               CTSlideMasterIdListImpl.this.removeSldMasterId(var1);
               return var2;
            }

            public int size() {
               return CTSlideMasterIdListImpl.this.sizeOfSldMasterIdArray();
            }
         }

         return new SldMasterIdList();
      }
   }

   public CTSlideMasterIdListEntry[] getSldMasterIdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SLDMASTERID$0, var2);
         CTSlideMasterIdListEntry[] var3 = new CTSlideMasterIdListEntry[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSlideMasterIdListEntry getSldMasterIdArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMasterIdListEntry var3 = null;
         var3 = (CTSlideMasterIdListEntry)this.get_store().find_element_user(SLDMASTERID$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSldMasterIdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SLDMASTERID$0);
      }
   }

   public void setSldMasterIdArray(CTSlideMasterIdListEntry[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SLDMASTERID$0);
      }
   }

   public void setSldMasterIdArray(int var1, CTSlideMasterIdListEntry var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMasterIdListEntry var4 = null;
         var4 = (CTSlideMasterIdListEntry)this.get_store().find_element_user(SLDMASTERID$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSlideMasterIdListEntry insertNewSldMasterId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMasterIdListEntry var3 = null;
         var3 = (CTSlideMasterIdListEntry)this.get_store().insert_element_user(SLDMASTERID$0, var1);
         return var3;
      }
   }

   public CTSlideMasterIdListEntry addNewSldMasterId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMasterIdListEntry var2 = null;
         var2 = (CTSlideMasterIdListEntry)this.get_store().add_element_user(SLDMASTERID$0);
         return var2;
      }
   }

   public void removeSldMasterId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SLDMASTERID$0, var1);
      }
   }

}
