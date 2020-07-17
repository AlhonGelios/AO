package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTable;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTTableImpl.1TrList;

public class CTTableImpl extends XmlComplexContentImpl implements CTTable {

   private static final QName TBLPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblPr");
   private static final QName TBLGRID$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblGrid");
   private static final QName TR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tr");


   public CTTableImpl(SchemaType var1) {
      super(var1);
   }

   public CTTableProperties getTblPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableProperties var2 = null;
         var2 = (CTTableProperties)this.get_store().find_element_user(TBLPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLPR$0) != 0;
      }
   }

   public void setTblPr(CTTableProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableProperties var3 = null;
         var3 = (CTTableProperties)this.get_store().find_element_user(TBLPR$0, 0);
         if(var3 == null) {
            var3 = (CTTableProperties)this.get_store().add_element_user(TBLPR$0);
         }

         var3.set(var1);
      }
   }

   public CTTableProperties addNewTblPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableProperties var2 = null;
         var2 = (CTTableProperties)this.get_store().add_element_user(TBLPR$0);
         return var2;
      }
   }

   public void unsetTblPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLPR$0, 0);
      }
   }

   public CTTableGrid getTblGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableGrid var2 = null;
         var2 = (CTTableGrid)this.get_store().find_element_user(TBLGRID$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setTblGrid(CTTableGrid var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableGrid var3 = null;
         var3 = (CTTableGrid)this.get_store().find_element_user(TBLGRID$2, 0);
         if(var3 == null) {
            var3 = (CTTableGrid)this.get_store().add_element_user(TBLGRID$2);
         }

         var3.set(var1);
      }
   }

   public CTTableGrid addNewTblGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableGrid var2 = null;
         var2 = (CTTableGrid)this.get_store().add_element_user(TBLGRID$2);
         return var2;
      }
   }

   public List getTrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TrList(this);
      }
   }

   public CTTableRow[] getTrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TR$4, var2);
         CTTableRow[] var3 = new CTTableRow[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTableRow getTrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableRow var3 = null;
         var3 = (CTTableRow)this.get_store().find_element_user(TR$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TR$4);
      }
   }

   public void setTrArray(CTTableRow[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TR$4);
      }
   }

   public void setTrArray(int var1, CTTableRow var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableRow var4 = null;
         var4 = (CTTableRow)this.get_store().find_element_user(TR$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTableRow insertNewTr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableRow var3 = null;
         var3 = (CTTableRow)this.get_store().insert_element_user(TR$4, var1);
         return var3;
      }
   }

   public CTTableRow addNewTr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableRow var2 = null;
         var2 = (CTTableRow)this.get_store().add_element_user(TR$4);
         return var2;
      }
   }

   public void removeTr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TR$4, var1);
      }
   }

}
