package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref;

public class CTSelectionImpl extends XmlComplexContentImpl implements CTSelection {

   private static final QName PANE$0 = new QName("", "pane");
   private static final QName ACTIVECELL$2 = new QName("", "activeCell");
   private static final QName ACTIVECELLID$4 = new QName("", "activeCellId");
   private static final QName SQREF$6 = new QName("", "sqref");


   public CTSelectionImpl(SchemaType var1) {
      super(var1);
   }

   public STPane.Enum getPane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PANE$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PANE$0);
         }

         return var2 == null?null:(STPane.Enum)var2.getEnumValue();
      }
   }

   public STPane xgetPane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPane var2 = null;
         var2 = (STPane)this.get_store().find_attribute_user(PANE$0);
         if(var2 == null) {
            var2 = (STPane)this.get_default_attribute_value(PANE$0);
         }

         return var2;
      }
   }

   public boolean isSetPane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PANE$0) != null;
      }
   }

   public void setPane(STPane.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PANE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PANE$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetPane(STPane var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPane var3 = null;
         var3 = (STPane)this.get_store().find_attribute_user(PANE$0);
         if(var3 == null) {
            var3 = (STPane)this.get_store().add_attribute_user(PANE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetPane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PANE$0);
      }
   }

   public String getActiveCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACTIVECELL$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STCellRef xgetActiveCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var2 = null;
         var2 = (STCellRef)this.get_store().find_attribute_user(ACTIVECELL$2);
         return var2;
      }
   }

   public boolean isSetActiveCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ACTIVECELL$2) != null;
      }
   }

   public void setActiveCell(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ACTIVECELL$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ACTIVECELL$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetActiveCell(STCellRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var3 = null;
         var3 = (STCellRef)this.get_store().find_attribute_user(ACTIVECELL$2);
         if(var3 == null) {
            var3 = (STCellRef)this.get_store().add_attribute_user(ACTIVECELL$2);
         }

         var3.set(var1);
      }
   }

   public void unsetActiveCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ACTIVECELL$2);
      }
   }

   public long getActiveCellId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACTIVECELLID$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ACTIVECELLID$4);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetActiveCellId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ACTIVECELLID$4);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(ACTIVECELLID$4);
         }

         return var2;
      }
   }

   public boolean isSetActiveCellId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ACTIVECELLID$4) != null;
      }
   }

   public void setActiveCellId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ACTIVECELLID$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ACTIVECELLID$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetActiveCellId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ACTIVECELLID$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ACTIVECELLID$4);
         }

         var3.set(var1);
      }
   }

   public void unsetActiveCellId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ACTIVECELLID$4);
      }
   }

   public List getSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SQREF$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SQREF$6);
         }

         return var2 == null?null:var2.getListValue();
      }
   }

   public STSqref xgetSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSqref var2 = null;
         var2 = (STSqref)this.get_store().find_attribute_user(SQREF$6);
         if(var2 == null) {
            var2 = (STSqref)this.get_default_attribute_value(SQREF$6);
         }

         return var2;
      }
   }

   public boolean isSetSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SQREF$6) != null;
      }
   }

   public void setSqref(List var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SQREF$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SQREF$6);
         }

         var3.setListValue(var1);
      }
   }

   public void xsetSqref(STSqref var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSqref var3 = null;
         var3 = (STSqref)this.get_store().find_attribute_user(SQREF$6);
         if(var3 == null) {
            var3 = (STSqref)this.get_store().add_attribute_user(SQREF$6);
         }

         var3.set(var1);
      }
   }

   public void unsetSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SQREF$6);
      }
   }

}
