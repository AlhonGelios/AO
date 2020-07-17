package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTTextTabStopListImpl.1TabList;

public class CTTextTabStopListImpl extends XmlComplexContentImpl implements CTTextTabStopList {

   private static final QName TAB$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tab");


   public CTTextTabStopListImpl(SchemaType var1) {
      super(var1);
   }

   public List getTabList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TabList(this);
      }
   }

   public CTTextTabStop[] getTabArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TAB$0, var2);
         CTTextTabStop[] var3 = new CTTextTabStop[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTextTabStop getTabArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextTabStop var3 = null;
         var3 = (CTTextTabStop)this.get_store().find_element_user(TAB$0, var1);
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

   public void setTabArray(CTTextTabStop[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TAB$0);
      }
   }

   public void setTabArray(int var1, CTTextTabStop var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextTabStop var4 = null;
         var4 = (CTTextTabStop)this.get_store().find_element_user(TAB$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTextTabStop insertNewTab(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextTabStop var3 = null;
         var3 = (CTTextTabStop)this.get_store().insert_element_user(TAB$0, var1);
         return var3;
      }
   }

   public CTTextTabStop addNewTab() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextTabStop var2 = null;
         var2 = (CTTextTabStop)this.get_store().add_element_user(TAB$0);
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
