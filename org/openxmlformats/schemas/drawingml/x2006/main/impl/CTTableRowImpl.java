package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableRow;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTTableRowImpl.1TcList;

public class CTTableRowImpl extends XmlComplexContentImpl implements CTTableRow {

   private static final QName TC$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tc");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName H$4 = new QName("", "h");


   public CTTableRowImpl(SchemaType var1) {
      super(var1);
   }

   public List getTcList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TcList(this);
      }
   }

   public CTTableCell[] getTcArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TC$0, var2);
         CTTableCell[] var3 = new CTTableCell[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTableCell getTcArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCell var3 = null;
         var3 = (CTTableCell)this.get_store().find_element_user(TC$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTcArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TC$0);
      }
   }

   public void setTcArray(CTTableCell[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TC$0);
      }
   }

   public void setTcArray(int var1, CTTableCell var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCell var4 = null;
         var4 = (CTTableCell)this.get_store().find_element_user(TC$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTableCell insertNewTc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCell var3 = null;
         var3 = (CTTableCell)this.get_store().insert_element_user(TC$0, var1);
         return var3;
      }
   }

   public CTTableCell addNewTc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCell var2 = null;
         var2 = (CTTableCell)this.get_store().add_element_user(TC$0);
         return var2;
      }
   }

   public void removeTc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TC$0, var1);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$2) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$2);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$2);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$2, 0);
      }
   }

   public long getH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(H$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STCoordinate xgetH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var2 = null;
         var2 = (STCoordinate)this.get_store().find_attribute_user(H$4);
         return var2;
      }
   }

   public void setH(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(H$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(H$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetH(STCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var3 = null;
         var3 = (STCoordinate)this.get_store().find_attribute_user(H$4);
         if(var3 == null) {
            var3 = (STCoordinate)this.get_store().add_attribute_user(H$4);
         }

         var3.set(var1);
      }
   }

}
