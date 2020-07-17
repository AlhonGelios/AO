package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTTableColumnsImpl.1TableColumnList;

public class CTTableColumnsImpl extends XmlComplexContentImpl implements CTTableColumns {

   private static final QName TABLECOLUMN$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableColumn");
   private static final QName COUNT$2 = new QName("", "count");


   public CTTableColumnsImpl(SchemaType var1) {
      super(var1);
   }

   public List getTableColumnList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TableColumnList(this);
      }
   }

   public CTTableColumn[] getTableColumnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TABLECOLUMN$0, var2);
         CTTableColumn[] var3 = new CTTableColumn[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTableColumn getTableColumnArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableColumn var3 = null;
         var3 = (CTTableColumn)this.get_store().find_element_user(TABLECOLUMN$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTableColumnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TABLECOLUMN$0);
      }
   }

   public void setTableColumnArray(CTTableColumn[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TABLECOLUMN$0);
      }
   }

   public void setTableColumnArray(int var1, CTTableColumn var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableColumn var4 = null;
         var4 = (CTTableColumn)this.get_store().find_element_user(TABLECOLUMN$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTableColumn insertNewTableColumn(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableColumn var3 = null;
         var3 = (CTTableColumn)this.get_store().insert_element_user(TABLECOLUMN$0, var1);
         return var3;
      }
   }

   public CTTableColumn addNewTableColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableColumn var2 = null;
         var2 = (CTTableColumn)this.get_store().add_element_user(TABLECOLUMN$0);
         return var2;
      }
   }

   public void removeTableColumn(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TABLECOLUMN$0, var1);
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
