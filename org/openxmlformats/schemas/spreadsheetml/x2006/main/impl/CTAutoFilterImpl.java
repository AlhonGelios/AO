package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTAutoFilterImpl.1FilterColumnList;

public class CTAutoFilterImpl extends XmlComplexContentImpl implements CTAutoFilter {

   private static final QName FILTERCOLUMN$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "filterColumn");
   private static final QName SORTSTATE$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName REF$6 = new QName("", "ref");


   public CTAutoFilterImpl(SchemaType var1) {
      super(var1);
   }

   public List getFilterColumnList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FilterColumnList(this);
      }
   }

   public CTFilterColumn[] getFilterColumnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FILTERCOLUMN$0, var2);
         CTFilterColumn[] var3 = new CTFilterColumn[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFilterColumn getFilterColumnArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFilterColumn var3 = null;
         var3 = (CTFilterColumn)this.get_store().find_element_user(FILTERCOLUMN$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFilterColumnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILTERCOLUMN$0);
      }
   }

   public void setFilterColumnArray(CTFilterColumn[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FILTERCOLUMN$0);
      }
   }

   public void setFilterColumnArray(int var1, CTFilterColumn var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFilterColumn var4 = null;
         var4 = (CTFilterColumn)this.get_store().find_element_user(FILTERCOLUMN$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFilterColumn insertNewFilterColumn(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFilterColumn var3 = null;
         var3 = (CTFilterColumn)this.get_store().insert_element_user(FILTERCOLUMN$0, var1);
         return var3;
      }
   }

   public CTFilterColumn addNewFilterColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFilterColumn var2 = null;
         var2 = (CTFilterColumn)this.get_store().add_element_user(FILTERCOLUMN$0);
         return var2;
      }
   }

   public void removeFilterColumn(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILTERCOLUMN$0, var1);
      }
   }

   public CTSortState getSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSortState var2 = null;
         var2 = (CTSortState)this.get_store().find_element_user(SORTSTATE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SORTSTATE$2) != 0;
      }
   }

   public void setSortState(CTSortState var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSortState var3 = null;
         var3 = (CTSortState)this.get_store().find_element_user(SORTSTATE$2, 0);
         if(var3 == null) {
            var3 = (CTSortState)this.get_store().add_element_user(SORTSTATE$2);
         }

         var3.set(var1);
      }
   }

   public CTSortState addNewSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSortState var2 = null;
         var2 = (CTSortState)this.get_store().add_element_user(SORTSTATE$2);
         return var2;
      }
   }

   public void unsetSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SORTSTATE$2, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$4) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$4);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$4);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$4, 0);
      }
   }

   public String getRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REF$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRef xgetRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var2 = null;
         var2 = (STRef)this.get_store().find_attribute_user(REF$6);
         return var2;
      }
   }

   public boolean isSetRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REF$6) != null;
      }
   }

   public void setRef(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REF$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REF$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRef(STRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var3 = null;
         var3 = (STRef)this.get_store().find_attribute_user(REF$6);
         if(var3 == null) {
            var3 = (STRef)this.get_store().add_attribute_user(REF$6);
         }

         var3.set(var1);
      }
   }

   public void unsetRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REF$6);
      }
   }

}
