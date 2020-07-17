package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTPivotCachesImpl.1PivotCacheList;

public class CTPivotCachesImpl extends XmlComplexContentImpl implements CTPivotCaches {

   private static final QName PIVOTCACHE$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotCache");


   public CTPivotCachesImpl(SchemaType var1) {
      super(var1);
   }

   public List getPivotCacheList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PivotCacheList(this);
      }
   }

   public CTPivotCache[] getPivotCacheArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PIVOTCACHE$0, var2);
         CTPivotCache[] var3 = new CTPivotCache[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPivotCache getPivotCacheArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotCache var3 = null;
         var3 = (CTPivotCache)this.get_store().find_element_user(PIVOTCACHE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPivotCacheArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIVOTCACHE$0);
      }
   }

   public void setPivotCacheArray(CTPivotCache[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PIVOTCACHE$0);
      }
   }

   public void setPivotCacheArray(int var1, CTPivotCache var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotCache var4 = null;
         var4 = (CTPivotCache)this.get_store().find_element_user(PIVOTCACHE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPivotCache insertNewPivotCache(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotCache var3 = null;
         var3 = (CTPivotCache)this.get_store().insert_element_user(PIVOTCACHE$0, var1);
         return var3;
      }
   }

   public CTPivotCache addNewPivotCache() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotCache var2 = null;
         var2 = (CTPivotCache)this.get_store().add_element_user(PIVOTCACHE$0);
         return var2;
      }
   }

   public void removePivotCache(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIVOTCACHE$0, var1);
      }
   }

}
