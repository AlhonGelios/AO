package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTablePart;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTTablePartsImpl.1TablePartList;

public class CTTablePartsImpl extends XmlComplexContentImpl implements CTTableParts {

   private static final QName TABLEPART$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tablePart");
   private static final QName COUNT$2 = new QName("", "count");


   public CTTablePartsImpl(SchemaType var1) {
      super(var1);
   }

   public List getTablePartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TablePartList(this);
      }
   }

   public CTTablePart[] getTablePartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TABLEPART$0, var2);
         CTTablePart[] var3 = new CTTablePart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTablePart getTablePartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePart var3 = null;
         var3 = (CTTablePart)this.get_store().find_element_user(TABLEPART$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTablePartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TABLEPART$0);
      }
   }

   public void setTablePartArray(CTTablePart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TABLEPART$0);
      }
   }

   public void setTablePartArray(int var1, CTTablePart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePart var4 = null;
         var4 = (CTTablePart)this.get_store().find_element_user(TABLEPART$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTablePart insertNewTablePart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePart var3 = null;
         var3 = (CTTablePart)this.get_store().insert_element_user(TABLEPART$0, var1);
         return var3;
      }
   }

   public CTTablePart addNewTablePart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePart var2 = null;
         var2 = (CTTablePart)this.get_store().add_element_user(TABLEPART$0);
         return var2;
      }
   }

   public void removeTablePart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TABLEPART$0, var1);
      }
   }

   public long getCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COUNT$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$2);
         return var2;
      }
   }

   public boolean isSetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COUNT$2) != null;
      }
   }

   public void setCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(COUNT$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(COUNT$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(COUNT$2);
         }

         var3.set(var1);
      }
   }

   public void unsetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COUNT$2);
      }
   }

}
