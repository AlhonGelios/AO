package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSingleXmlCellsImpl.1SingleXmlCellList;

public class CTSingleXmlCellsImpl extends XmlComplexContentImpl implements CTSingleXmlCells {

   private static final QName SINGLEXMLCELL$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "singleXmlCell");


   public CTSingleXmlCellsImpl(SchemaType var1) {
      super(var1);
   }

   public List getSingleXmlCellList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SingleXmlCellList(this);
      }
   }

   public CTSingleXmlCell[] getSingleXmlCellArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SINGLEXMLCELL$0, var2);
         CTSingleXmlCell[] var3 = new CTSingleXmlCell[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSingleXmlCell getSingleXmlCellArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSingleXmlCell var3 = null;
         var3 = (CTSingleXmlCell)this.get_store().find_element_user(SINGLEXMLCELL$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSingleXmlCellArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SINGLEXMLCELL$0);
      }
   }

   public void setSingleXmlCellArray(CTSingleXmlCell[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SINGLEXMLCELL$0);
      }
   }

   public void setSingleXmlCellArray(int var1, CTSingleXmlCell var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSingleXmlCell var4 = null;
         var4 = (CTSingleXmlCell)this.get_store().find_element_user(SINGLEXMLCELL$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSingleXmlCell insertNewSingleXmlCell(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSingleXmlCell var3 = null;
         var3 = (CTSingleXmlCell)this.get_store().insert_element_user(SINGLEXMLCELL$0, var1);
         return var3;
      }
   }

   public CTSingleXmlCell addNewSingleXmlCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSingleXmlCell var2 = null;
         var2 = (CTSingleXmlCell)this.get_store().add_element_user(SINGLEXMLCELL$0);
         return var2;
      }
   }

   public void removeSingleXmlCell(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SINGLEXMLCELL$0, var1);
      }
   }

}
