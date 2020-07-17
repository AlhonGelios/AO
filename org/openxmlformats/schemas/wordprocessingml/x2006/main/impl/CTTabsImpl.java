package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabStop;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabs;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTabsImpl.1TabList;

public class CTTabsImpl extends XmlComplexContentImpl implements CTTabs {

   private static final QName TAB$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tab");


   public CTTabsImpl(SchemaType var1) {
      super(var1);
   }

   public List getTabList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TabList(this);
      }
   }

   public CTTabStop[] getTabArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TAB$0, var2);
         CTTabStop[] var3 = new CTTabStop[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTabStop getTabArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTabStop var3 = null;
         var3 = (CTTabStop)this.get_store().find_element_user(TAB$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTabArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TAB$0);
      }
   }

   public void setTabArray(CTTabStop[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TAB$0);
      }
   }

   public void setTabArray(int var1, CTTabStop var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTabStop var4 = null;
         var4 = (CTTabStop)this.get_store().find_element_user(TAB$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTabStop insertNewTab(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTabStop var3 = null;
         var3 = (CTTabStop)this.get_store().insert_element_user(TAB$0, var1);
         return var3;
      }
   }

   public CTTabStop addNewTab() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTabStop var2 = null;
         var2 = (CTTabStop)this.get_store().add_element_user(TAB$0);
         return var2;
      }
   }

   public void removeTab(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TAB$0, var1);
      }
   }

}
