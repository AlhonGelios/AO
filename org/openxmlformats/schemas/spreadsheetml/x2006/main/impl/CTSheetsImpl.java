package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets;

public class CTSheetsImpl extends XmlComplexContentImpl implements CTSheets {

   private static final QName SHEET$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheet");


   public CTSheetsImpl(SchemaType var1) {
      super(var1);
   }

   public List getSheetList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class SheetList extends AbstractList {

            public CTSheet get(int var1) {
               return CTSheetsImpl.this.getSheetArray(var1);
            }

            public CTSheet set(int var1, CTSheet var2) {
               CTSheet var3 = CTSheetsImpl.this.getSheetArray(var1);
               CTSheetsImpl.this.setSheetArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTSheet var2) {
               CTSheetsImpl.this.insertNewSheet(var1).set(var2);
            }

            public CTSheet remove(int var1) {
               CTSheet var2 = CTSheetsImpl.this.getSheetArray(var1);
               CTSheetsImpl.this.removeSheet(var1);
               return var2;
            }

            public int size() {
               return CTSheetsImpl.this.sizeOfSheetArray();
            }
         }

         return new SheetList();
      }
   }

   public CTSheet[] getSheetArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SHEET$0, var2);
         CTSheet[] var3 = new CTSheet[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSheet getSheetArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheet var3 = null;
         var3 = (CTSheet)this.get_store().find_element_user(SHEET$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSheetArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEET$0);
      }
   }

   public void setSheetArray(CTSheet[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SHEET$0);
      }
   }

   public void setSheetArray(int var1, CTSheet var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheet var4 = null;
         var4 = (CTSheet)this.get_store().find_element_user(SHEET$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSheet insertNewSheet(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheet var3 = null;
         var3 = (CTSheet)this.get_store().insert_element_user(SHEET$0, var1);
         return var3;
      }
   }

   public CTSheet addNewSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheet var2 = null;
         var2 = (CTSheet)this.get_store().add_element_user(SHEET$0);
         return var2;
      }
   }

   public void removeSheet(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEET$0, var1);
      }
   }

}
