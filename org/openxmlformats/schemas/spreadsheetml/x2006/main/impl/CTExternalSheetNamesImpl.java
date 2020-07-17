package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTExternalSheetNamesImpl.1SheetNameList;

public class CTExternalSheetNamesImpl extends XmlComplexContentImpl implements CTExternalSheetNames {

   private static final QName SHEETNAME$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetName");


   public CTExternalSheetNamesImpl(SchemaType var1) {
      super(var1);
   }

   public List getSheetNameList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SheetNameList(this);
      }
   }

   public CTExternalSheetName[] getSheetNameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SHEETNAME$0, var2);
         CTExternalSheetName[] var3 = new CTExternalSheetName[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTExternalSheetName getSheetNameArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalSheetName var3 = null;
         var3 = (CTExternalSheetName)this.get_store().find_element_user(SHEETNAME$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSheetNameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETNAME$0);
      }
   }

   public void setSheetNameArray(CTExternalSheetName[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SHEETNAME$0);
      }
   }

   public void setSheetNameArray(int var1, CTExternalSheetName var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalSheetName var4 = null;
         var4 = (CTExternalSheetName)this.get_store().find_element_user(SHEETNAME$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTExternalSheetName insertNewSheetName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalSheetName var3 = null;
         var3 = (CTExternalSheetName)this.get_store().insert_element_user(SHEETNAME$0, var1);
         return var3;
      }
   }

   public CTExternalSheetName addNewSheetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalSheetName var2 = null;
         var2 = (CTExternalSheetName)this.get_store().add_element_user(SHEETNAME$0);
         return var2;
      }
   }

   public void removeSheetName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETNAME$0, var1);
      }
   }

}
