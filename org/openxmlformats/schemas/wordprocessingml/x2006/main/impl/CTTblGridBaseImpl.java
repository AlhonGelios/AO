package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridCol;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTblGridBaseImpl.1GridColList;

public class CTTblGridBaseImpl extends XmlComplexContentImpl implements CTTblGridBase {

   private static final QName GRIDCOL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gridCol");


   public CTTblGridBaseImpl(SchemaType var1) {
      super(var1);
   }

   public List getGridColList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GridColList(this);
      }
   }

   public CTTblGridCol[] getGridColArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GRIDCOL$0, var2);
         CTTblGridCol[] var3 = new CTTblGridCol[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTblGridCol getGridColArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblGridCol var3 = null;
         var3 = (CTTblGridCol)this.get_store().find_element_user(GRIDCOL$0, var1);
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

   public void setGridColArray(CTTblGridCol[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GRIDCOL$0);
      }
   }

   public void setGridColArray(int var1, CTTblGridCol var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblGridCol var4 = null;
         var4 = (CTTblGridCol)this.get_store().find_element_user(GRIDCOL$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTblGridCol insertNewGridCol(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblGridCol var3 = null;
         var3 = (CTTblGridCol)this.get_store().insert_element_user(GRIDCOL$0, var1);
         return var3;
      }
   }

   public CTTblGridCol addNewGridCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblGridCol var2 = null;
         var2 = (CTTblGridCol)this.get_store().add_element_user(GRIDCOL$0);
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
