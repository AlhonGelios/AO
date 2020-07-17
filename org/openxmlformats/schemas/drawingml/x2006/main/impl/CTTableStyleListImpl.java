package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.STGuid;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTTableStyleListImpl.1TblStyleList;

public class CTTableStyleListImpl extends XmlComplexContentImpl implements CTTableStyleList {

   private static final QName TBLSTYLE$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblStyle");
   private static final QName DEF$2 = new QName("", "def");


   public CTTableStyleListImpl(SchemaType var1) {
      super(var1);
   }

   public List getTblStyleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TblStyleList(this);
      }
   }

   public CTTableStyle[] getTblStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TBLSTYLE$0, var2);
         CTTableStyle[] var3 = new CTTableStyle[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTableStyle getTblStyleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyle var3 = null;
         var3 = (CTTableStyle)this.get_store().find_element_user(TBLSTYLE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTblStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLSTYLE$0);
      }
   }

   public void setTblStyleArray(CTTableStyle[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TBLSTYLE$0);
      }
   }

   public void setTblStyleArray(int var1, CTTableStyle var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyle var4 = null;
         var4 = (CTTableStyle)this.get_store().find_element_user(TBLSTYLE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTableStyle insertNewTblStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyle var3 = null;
         var3 = (CTTableStyle)this.get_store().insert_element_user(TBLSTYLE$0, var1);
         return var3;
      }
   }

   public CTTableStyle addNewTblStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyle var2 = null;
         var2 = (CTTableStyle)this.get_store().add_element_user(TBLSTYLE$0);
         return var2;
      }
   }

   public void removeTblStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLSTYLE$0, var1);
      }
   }

   public String getDef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEF$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STGuid xgetDef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGuid var2 = null;
         var2 = (STGuid)this.get_store().find_attribute_user(DEF$2);
         return var2;
      }
   }

   public void setDef(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEF$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEF$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDef(STGuid var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGuid var3 = null;
         var3 = (STGuid)this.get_store().find_attribute_user(DEF$2);
         if(var3 == null) {
            var3 = (STGuid)this.get_store().add_attribute_user(DEF$2);
         }

         var3.set(var1);
      }
   }

}
