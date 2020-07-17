package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTConnectionSiteListImpl.1CxnList;

public class CTConnectionSiteListImpl extends XmlComplexContentImpl implements CTConnectionSiteList {

   private static final QName CXN$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cxn");


   public CTConnectionSiteListImpl(SchemaType var1) {
      super(var1);
   }

   public List getCxnList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CxnList(this);
      }
   }

   public CTConnectionSite[] getCxnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CXN$0, var2);
         CTConnectionSite[] var3 = new CTConnectionSite[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTConnectionSite getCxnArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectionSite var3 = null;
         var3 = (CTConnectionSite)this.get_store().find_element_user(CXN$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCxnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CXN$0);
      }
   }

   public void setCxnArray(CTConnectionSite[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CXN$0);
      }
   }

   public void setCxnArray(int var1, CTConnectionSite var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectionSite var4 = null;
         var4 = (CTConnectionSite)this.get_store().find_element_user(CXN$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTConnectionSite insertNewCxn(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectionSite var3 = null;
         var3 = (CTConnectionSite)this.get_store().insert_element_user(CXN$0, var1);
         return var3;
      }
   }

   public CTConnectionSite addNewCxn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectionSite var2 = null;
         var2 = (CTConnectionSite)this.get_store().add_element_user(CXN$0);
         return var2;
      }
   }

   public void removeCxn(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CXN$0, var1);
      }
   }

}
