package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCol;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableGrid;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTTableGridImpl.1GridColList;

public class CTTableGridImpl extends XmlComplexContentImpl implements CTTableGrid {

   private static final QName GRIDCOL$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gridCol");


   public CTTableGridImpl(SchemaType var1) {
      super(var1);
   }

   public List getGridColList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GridColList(this);
      }
   }

   public CTTableCol[] getGridColArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GRIDCOL$0, var2);
         CTTableCol[] var3 = new CTTableCol[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTableCol getGridColArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCol var3 = null;
         var3 = (CTTableCol)this.get_store().find_element_user(GRIDCOL$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGridColArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRIDCOL$0);
      }
   }

   public void setGridColArray(CTTableCol[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GRIDCOL$0);
      }
   }

   public void setGridColArray(int var1, CTTableCol var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCol var4 = null;
         var4 = (CTTableCol)this.get_store().find_element_user(GRIDCOL$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTableCol insertNewGridCol(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCol var3 = null;
         var3 = (CTTableCol)this.get_store().insert_element_user(GRIDCOL$0, var1);
         return var3;
      }
   }

   public CTTableCol addNewGridCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCol var2 = null;
         var2 = (CTTableCol)this.get_store().add_element_user(GRIDCOL$0);
         return var2;
      }
   }

   public void removeGridCol(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRIDCOL$0, var1);
      }
   }

}
