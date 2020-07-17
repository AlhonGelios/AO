package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames;

public class CTDefinedNamesImpl extends XmlComplexContentImpl implements CTDefinedNames {

   private static final QName DEFINEDNAME$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "definedName");


   public CTDefinedNamesImpl(SchemaType var1) {
      super(var1);
   }

   public List getDefinedNameList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class DefinedNameList extends AbstractList {

            public CTDefinedName get(int var1) {
               return CTDefinedNamesImpl.this.getDefinedNameArray(var1);
            }

            public CTDefinedName set(int var1, CTDefinedName var2) {
               CTDefinedName var3 = CTDefinedNamesImpl.this.getDefinedNameArray(var1);
               CTDefinedNamesImpl.this.setDefinedNameArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTDefinedName var2) {
               CTDefinedNamesImpl.this.insertNewDefinedName(var1).set(var2);
            }

            public CTDefinedName remove(int var1) {
               CTDefinedName var2 = CTDefinedNamesImpl.this.getDefinedNameArray(var1);
               CTDefinedNamesImpl.this.removeDefinedName(var1);
               return var2;
            }

            public int size() {
               return CTDefinedNamesImpl.this.sizeOfDefinedNameArray();
            }
         }

         return new DefinedNameList();
      }
   }

   public CTDefinedName[] getDefinedNameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DEFINEDNAME$0, var2);
         CTDefinedName[] var3 = new CTDefinedName[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDefinedName getDefinedNameArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDefinedName var3 = null;
         var3 = (CTDefinedName)this.get_store().find_element_user(DEFINEDNAME$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDefinedNameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFINEDNAME$0);
      }
   }

   public void setDefinedNameArray(CTDefinedName[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DEFINEDNAME$0);
      }
   }

   public void setDefinedNameArray(int var1, CTDefinedName var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDefinedName var4 = null;
         var4 = (CTDefinedName)this.get_store().find_element_user(DEFINEDNAME$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDefinedName insertNewDefinedName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDefinedName var3 = null;
         var3 = (CTDefinedName)this.get_store().insert_element_user(DEFINEDNAME$0, var1);
         return var3;
      }
   }

   public CTDefinedName addNewDefinedName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDefinedName var2 = null;
         var2 = (CTDefinedName)this.get_store().add_element_user(DEFINEDNAME$0);
         return var2;
      }
   }

   public void removeDefinedName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFINEDNAME$0, var1);
      }
   }

}
