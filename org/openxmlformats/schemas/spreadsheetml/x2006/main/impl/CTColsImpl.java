package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols;

public class CTColsImpl extends XmlComplexContentImpl implements CTCols {

   private static final QName COL$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "col");


   public CTColsImpl(SchemaType var1) {
      super(var1);
   }

   public List getColList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class ColList extends AbstractList {

            public CTCol get(int var1) {
               return CTColsImpl.this.getColArray(var1);
            }

            public CTCol set(int var1, CTCol var2) {
               CTCol var3 = CTColsImpl.this.getColArray(var1);
               CTColsImpl.this.setColArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTCol var2) {
               CTColsImpl.this.insertNewCol(var1).set(var2);
            }

            public CTCol remove(int var1) {
               CTCol var2 = CTColsImpl.this.getColArray(var1);
               CTColsImpl.this.removeCol(var1);
               return var2;
            }

            public int size() {
               return CTColsImpl.this.sizeOfColArray();
            }
         }

         return new ColList();
      }
   }

   public CTCol[] getColArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COL$0, var2);
         CTCol[] var3 = new CTCol[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCol getColArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCol var3 = null;
         var3 = (CTCol)this.get_store().find_element_user(COL$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfColArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COL$0);
      }
   }

   public void setColArray(CTCol[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COL$0);
      }
   }

   public void setColArray(int var1, CTCol var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCol var4 = null;
         var4 = (CTCol)this.get_store().find_element_user(COL$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCol insertNewCol(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCol var3 = null;
         var3 = (CTCol)this.get_store().insert_element_user(COL$0, var1);
         return var3;
      }
   }

   public CTCol addNewCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCol var2 = null;
         var2 = (CTCol)this.get_store().add_element_user(COL$0);
         return var2;
      }
   }

   public void removeCol(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COL$0, var1);
      }
   }

}
