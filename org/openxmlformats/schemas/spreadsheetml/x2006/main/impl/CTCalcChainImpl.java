package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;

public class CTCalcChainImpl extends XmlComplexContentImpl implements CTCalcChain {

   private static final QName C$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "c");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTCalcChainImpl(SchemaType var1) {
      super(var1);
   }

   public List getCList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class CList extends AbstractList {

            public CTCalcCell get(int var1) {
               return CTCalcChainImpl.this.getCArray(var1);
            }

            public CTCalcCell set(int var1, CTCalcCell var2) {
               CTCalcCell var3 = CTCalcChainImpl.this.getCArray(var1);
               CTCalcChainImpl.this.setCArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTCalcCell var2) {
               CTCalcChainImpl.this.insertNewC(var1).set(var2);
            }

            public CTCalcCell remove(int var1) {
               CTCalcCell var2 = CTCalcChainImpl.this.getCArray(var1);
               CTCalcChainImpl.this.removeC(var1);
               return var2;
            }

            public int size() {
               return CTCalcChainImpl.this.sizeOfCArray();
            }
         }

         return new CList();
      }
   }

   public CTCalcCell[] getCArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(C$0, var2);
         CTCalcCell[] var3 = new CTCalcCell[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCalcCell getCArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalcCell var3 = null;
         var3 = (CTCalcCell)this.get_store().find_element_user(C$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(C$0);
      }
   }

   public void setCArray(CTCalcCell[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, C$0);
      }
   }

   public void setCArray(int var1, CTCalcCell var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalcCell var4 = null;
         var4 = (CTCalcCell)this.get_store().find_element_user(C$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCalcCell insertNewC(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalcCell var3 = null;
         var3 = (CTCalcCell)this.get_store().insert_element_user(C$0, var1);
         return var3;
      }
   }

   public CTCalcCell addNewC() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalcCell var2 = null;
         var2 = (CTCalcCell)this.get_store().add_element_user(C$0);
         return var2;
      }
   }

   public void removeC(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(C$0, var1);
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
