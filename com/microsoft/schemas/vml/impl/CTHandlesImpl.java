package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.vml.CTH;
import com.microsoft.schemas.vml.CTHandles;
import com.microsoft.schemas.vml.impl.CTHandlesImpl.1HList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTHandlesImpl extends XmlComplexContentImpl implements CTHandles {

   private static final QName H$0 = new QName("urn:schemas-microsoft-com:vml", "h");


   public CTHandlesImpl(SchemaType var1) {
      super(var1);
   }

   public List getHList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HList(this);
      }
   }

   public CTH[] getHArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(H$0, var2);
         CTH[] var3 = new CTH[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTH getHArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTH var3 = null;
         var3 = (CTH)this.get_store().find_element_user(H$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(H$0);
      }
   }

   public void setHArray(CTH[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, H$0);
      }
   }

   public void setHArray(int var1, CTH var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTH var4 = null;
         var4 = (CTH)this.get_store().find_element_user(H$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTH insertNewH(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTH var3 = null;
         var3 = (CTH)this.get_store().insert_element_user(H$0, var1);
         return var3;
      }
   }

   public CTH addNewH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTH var2 = null;
         var2 = (CTH)this.get_store().add_element_user(H$0);
         return var2;
      }
   }

   public void removeH(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(H$0, var1);
      }
   }

}
