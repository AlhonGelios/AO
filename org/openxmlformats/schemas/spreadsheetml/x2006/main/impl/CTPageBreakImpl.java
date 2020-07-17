package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTPageBreakImpl.1BrkList;

public class CTPageBreakImpl extends XmlComplexContentImpl implements CTPageBreak {

   private static final QName BRK$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "brk");
   private static final QName COUNT$2 = new QName("", "count");
   private static final QName MANUALBREAKCOUNT$4 = new QName("", "manualBreakCount");


   public CTPageBreakImpl(SchemaType var1) {
      super(var1);
   }

   public List getBrkList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BrkList(this);
      }
   }

   public CTBreak[] getBrkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BRK$0, var2);
         CTBreak[] var3 = new CTBreak[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBreak getBrkArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBreak var3 = null;
         var3 = (CTBreak)this.get_store().find_element_user(BRK$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBrkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BRK$0);
      }
   }

   public void setBrkArray(CTBreak[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BRK$0);
      }
   }

   public void setBrkArray(int var1, CTBreak var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBreak var4 = null;
         var4 = (CTBreak)this.get_store().find_element_user(BRK$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBreak insertNewBrk(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBreak var3 = null;
         var3 = (CTBreak)this.get_store().insert_element_user(BRK$0, var1);
         return var3;
      }
   }

   public CTBreak addNewBrk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBreak var2 = null;
         var2 = (CTBreak)this.get_store().add_element_user(BRK$0);
         return var2;
      }
   }

   public void removeBrk(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BRK$0, var1);
      }
   }

   public long getCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COUNT$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COUNT$2);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$2);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(COUNT$2);
         }

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

   public long getManualBreakCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MANUALBREAKCOUNT$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MANUALBREAKCOUNT$4);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetManualBreakCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MANUALBREAKCOUNT$4);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(MANUALBREAKCOUNT$4);
         }

         return var2;
      }
   }

   public boolean isSetManualBreakCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MANUALBREAKCOUNT$4) != null;
      }
   }

   public void setManualBreakCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MANUALBREAKCOUNT$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MANUALBREAKCOUNT$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetManualBreakCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MANUALBREAKCOUNT$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MANUALBREAKCOUNT$4);
         }

         var3.set(var1);
      }
   }

   public void unsetManualBreakCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MANUALBREAKCOUNT$4);
      }
   }

}
