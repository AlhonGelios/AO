package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetView;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSheetViewsImpl.1SheetViewList;

public class CTSheetViewsImpl extends XmlComplexContentImpl implements CTSheetViews {

   private static final QName SHEETVIEW$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetView");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTSheetViewsImpl(SchemaType var1) {
      super(var1);
   }

   public List getSheetViewList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SheetViewList(this);
      }
   }

   public CTSheetView[] getSheetViewArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SHEETVIEW$0, var2);
         CTSheetView[] var3 = new CTSheetView[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSheetView getSheetViewArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetView var3 = null;
         var3 = (CTSheetView)this.get_store().find_element_user(SHEETVIEW$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSheetViewArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETVIEW$0);
      }
   }

   public void setSheetViewArray(CTSheetView[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SHEETVIEW$0);
      }
   }

   public void setSheetViewArray(int var1, CTSheetView var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetView var4 = null;
         var4 = (CTSheetView)this.get_store().find_element_user(SHEETVIEW$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSheetView insertNewSheetView(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetView var3 = null;
         var3 = (CTSheetView)this.get_store().insert_element_user(SHEETVIEW$0, var1);
         return var3;
      }
   }

   public CTSheetView addNewSheetView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetView var2 = null;
         var2 = (CTSheetView)this.get_store().add_element_user(SHEETVIEW$0);
         return var2;
      }
   }

   public void removeSheetView(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETVIEW$0, var1);
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
