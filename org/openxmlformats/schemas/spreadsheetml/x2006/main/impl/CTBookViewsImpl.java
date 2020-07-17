package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTBookViewsImpl.1WorkbookViewList;

public class CTBookViewsImpl extends XmlComplexContentImpl implements CTBookViews {

   private static final QName WORKBOOKVIEW$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbookView");


   public CTBookViewsImpl(SchemaType var1) {
      super(var1);
   }

   public List getWorkbookViewList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1WorkbookViewList(this);
      }
   }

   public CTBookView[] getWorkbookViewArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(WORKBOOKVIEW$0, var2);
         CTBookView[] var3 = new CTBookView[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBookView getWorkbookViewArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookView var3 = null;
         var3 = (CTBookView)this.get_store().find_element_user(WORKBOOKVIEW$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfWorkbookViewArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WORKBOOKVIEW$0);
      }
   }

   public void setWorkbookViewArray(CTBookView[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, WORKBOOKVIEW$0);
      }
   }

   public void setWorkbookViewArray(int var1, CTBookView var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookView var4 = null;
         var4 = (CTBookView)this.get_store().find_element_user(WORKBOOKVIEW$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBookView insertNewWorkbookView(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookView var3 = null;
         var3 = (CTBookView)this.get_store().insert_element_user(WORKBOOKVIEW$0, var1);
         return var3;
      }
   }

   public CTBookView addNewWorkbookView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookView var2 = null;
         var2 = (CTBookView)this.get_store().add_element_user(WORKBOOKVIEW$0);
         return var2;
      }
   }

   public void removeWorkbookView(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WORKBOOKVIEW$0, var1);
      }
   }

}
