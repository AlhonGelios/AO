package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheRecords;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRecord;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTPivotCacheRecordsImpl.1RList;

public class CTPivotCacheRecordsImpl extends XmlComplexContentImpl implements CTPivotCacheRecords {

   private static final QName R$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "r");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName COUNT$4 = new QName("", "count");


   public CTPivotCacheRecordsImpl(SchemaType var1) {
      super(var1);
   }

   public List getRList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RList(this);
      }
   }

   public CTRecord[] getRArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(R$0, var2);
         CTRecord[] var3 = new CTRecord[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRecord getRArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRecord var3 = null;
         var3 = (CTRecord)this.get_store().find_element_user(R$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(R$0);
      }
   }

   public void setRArray(CTRecord[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, R$0);
      }
   }

   public void setRArray(int var1, CTRecord var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRecord var4 = null;
         var4 = (CTRecord)this.get_store().find_element_user(R$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRecord insertNewR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRecord var3 = null;
         var3 = (CTRecord)this.get_store().insert_element_user(R$0, var1);
         return var3;
      }
   }

   public CTRecord addNewR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRecord var2 = null;
         var2 = (CTRecord)this.get_store().add_element_user(R$0);
         return var2;
      }
   }

   public void removeR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(R$0, var1);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$2) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$2, 0);
      }
   }

   public long getCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COUNT$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$4);
         return var2;
      }
   }

   public boolean isSetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COUNT$4) != null;
      }
   }

   public void setCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(COUNT$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(COUNT$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(COUNT$4);
         }

         var3.set(var1);
      }
   }

   public void unsetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COUNT$4);
      }
   }

}
