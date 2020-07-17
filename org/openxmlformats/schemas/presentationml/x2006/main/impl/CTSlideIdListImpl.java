package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry;

public class CTSlideIdListImpl extends XmlComplexContentImpl implements CTSlideIdList {

   private static final QName SLDID$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldId");


   public CTSlideIdListImpl(SchemaType var1) {
      super(var1);
   }

   public List getSldIdList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class SldIdList extends AbstractList {

            public CTSlideIdListEntry get(int var1) {
               return CTSlideIdListImpl.this.getSldIdArray(var1);
            }

            public CTSlideIdListEntry set(int var1, CTSlideIdListEntry var2) {
               CTSlideIdListEntry var3 = CTSlideIdListImpl.this.getSldIdArray(var1);
               CTSlideIdListImpl.this.setSldIdArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTSlideIdListEntry var2) {
               CTSlideIdListImpl.this.insertNewSldId(var1).set(var2);
            }

            public CTSlideIdListEntry remove(int var1) {
               CTSlideIdListEntry var2 = CTSlideIdListImpl.this.getSldIdArray(var1);
               CTSlideIdListImpl.this.removeSldId(var1);
               return var2;
            }

            public int size() {
               return CTSlideIdListImpl.this.sizeOfSldIdArray();
            }
         }

         return new SldIdList();
      }
   }

   public CTSlideIdListEntry[] getSldIdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SLDID$0, var2);
         CTSlideIdListEntry[] var3 = new CTSlideIdListEntry[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSlideIdListEntry getSldIdArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideIdListEntry var3 = null;
         var3 = (CTSlideIdListEntry)this.get_store().find_element_user(SLDID$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSldIdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SLDID$0);
      }
   }

   public void setSldIdArray(CTSlideIdListEntry[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SLDID$0);
      }
   }

   public void setSldIdArray(int var1, CTSlideIdListEntry var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideIdListEntry var4 = null;
         var4 = (CTSlideIdListEntry)this.get_store().find_element_user(SLDID$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSlideIdListEntry insertNewSldId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideIdListEntry var3 = null;
         var3 = (CTSlideIdListEntry)this.get_store().insert_element_user(SLDID$0, var1);
         return var3;
      }
   }

   public CTSlideIdListEntry addNewSldId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideIdListEntry var2 = null;
         var2 = (CTSlideIdListEntry)this.get_store().add_element_user(SLDID$0);
         return var2;
      }
   }

   public void removeSldId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SLDID$0, var1);
      }
   }

}
