package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRow;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSheetDataImpl.1RowList;

public class CTSheetDataImpl extends XmlComplexContentImpl implements CTSheetData {

   private static final QName ROW$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "row");


   public CTSheetDataImpl(SchemaType var1) {
      super(var1);
   }

   public List getRowList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RowList(this);
      }
   }

   public CTRow[] getRowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ROW$0, var2);
         CTRow[] var3 = new CTRow[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRow getRowArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRow var3 = null;
         var3 = (CTRow)this.get_store().find_element_user(ROW$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ROW$0);
      }
   }

   public void setRowArray(CTRow[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ROW$0);
      }
   }

   public void setRowArray(int var1, CTRow var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRow var4 = null;
         var4 = (CTRow)this.get_store().find_element_user(ROW$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRow insertNewRow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRow var3 = null;
         var3 = (CTRow)this.get_store().insert_element_user(ROW$0, var1);
         return var3;
      }
   }

   public CTRow addNewRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRow var2 = null;
         var2 = (CTRow)this.get_store().add_element_user(ROW$0);
         return var2;
      }
   }

   public void removeRow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ROW$0, var1);
      }
   }

}
