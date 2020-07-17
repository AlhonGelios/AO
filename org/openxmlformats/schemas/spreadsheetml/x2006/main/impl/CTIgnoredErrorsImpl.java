package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors;

public class CTIgnoredErrorsImpl extends XmlComplexContentImpl implements CTIgnoredErrors {

   private static final QName IGNOREDERROR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ignoredError");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTIgnoredErrorsImpl(SchemaType var1) {
      super(var1);
   }

   public List getIgnoredErrorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class IgnoredErrorList extends AbstractList {

            public CTIgnoredError get(int var1) {
               return CTIgnoredErrorsImpl.this.getIgnoredErrorArray(var1);
            }

            public CTIgnoredError set(int var1, CTIgnoredError var2) {
               CTIgnoredError var3 = CTIgnoredErrorsImpl.this.getIgnoredErrorArray(var1);
               CTIgnoredErrorsImpl.this.setIgnoredErrorArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTIgnoredError var2) {
               CTIgnoredErrorsImpl.this.insertNewIgnoredError(var1).set(var2);
            }

            public CTIgnoredError remove(int var1) {
               CTIgnoredError var2 = CTIgnoredErrorsImpl.this.getIgnoredErrorArray(var1);
               CTIgnoredErrorsImpl.this.removeIgnoredError(var1);
               return var2;
            }

            public int size() {
               return CTIgnoredErrorsImpl.this.sizeOfIgnoredErrorArray();
            }
         }

         return new IgnoredErrorList();
      }
   }

   public CTIgnoredError[] getIgnoredErrorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(IGNOREDERROR$0, var2);
         CTIgnoredError[] var3 = new CTIgnoredError[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTIgnoredError getIgnoredErrorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIgnoredError var3 = null;
         var3 = (CTIgnoredError)this.get_store().find_element_user(IGNOREDERROR$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfIgnoredErrorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(IGNOREDERROR$0);
      }
   }

   public void setIgnoredErrorArray(CTIgnoredError[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, IGNOREDERROR$0);
      }
   }

   public void setIgnoredErrorArray(int var1, CTIgnoredError var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIgnoredError var4 = null;
         var4 = (CTIgnoredError)this.get_store().find_element_user(IGNOREDERROR$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTIgnoredError insertNewIgnoredError(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIgnoredError var3 = null;
         var3 = (CTIgnoredError)this.get_store().insert_element_user(IGNOREDERROR$0, var1);
         return var3;
      }
   }

   public CTIgnoredError addNewIgnoredError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIgnoredError var2 = null;
         var2 = (CTIgnoredError)this.get_store().add_element_user(IGNOREDERROR$0);
         return var2;
      }
   }

   public void removeIgnoredError(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(IGNOREDERROR$0, var1);
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

}
