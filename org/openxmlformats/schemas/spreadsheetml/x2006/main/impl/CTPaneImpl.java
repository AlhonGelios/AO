package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPane;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPaneState;

public class CTPaneImpl extends XmlComplexContentImpl implements CTPane {

   private static final QName XSPLIT$0 = new QName("", "xSplit");
   private static final QName YSPLIT$2 = new QName("", "ySplit");
   private static final QName TOPLEFTCELL$4 = new QName("", "topLeftCell");
   private static final QName ACTIVEPANE$6 = new QName("", "activePane");
   private static final QName STATE$8 = new QName("", "state");


   public CTPaneImpl(SchemaType var1) {
      super(var1);
   }

   public double getXSplit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(XSPLIT$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(XSPLIT$0);
         }

         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetXSplit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(XSPLIT$0);
         if(var2 == null) {
            var2 = (XmlDouble)this.get_default_attribute_value(XSPLIT$0);
         }

         return var2;
      }
   }

   public boolean isSetXSplit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(XSPLIT$0) != null;
      }
   }

   public void setXSplit(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(XSPLIT$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(XSPLIT$0);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetXSplit(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(XSPLIT$0);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(XSPLIT$0);
         }

         var3.set(var1);
      }
   }

   public void unsetXSplit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(XSPLIT$0);
      }
   }

   public double getYSplit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(YSPLIT$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(YSPLIT$2);
         }

         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetYSplit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(YSPLIT$2);
         if(var2 == null) {
            var2 = (XmlDouble)this.get_default_attribute_value(YSPLIT$2);
         }

         return var2;
      }
   }

   public boolean isSetYSplit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(YSPLIT$2) != null;
      }
   }

   public void setYSplit(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(YSPLIT$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(YSPLIT$2);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetYSplit(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(YSPLIT$2);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(YSPLIT$2);
         }

         var3.set(var1);
      }
   }

   public void unsetYSplit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(YSPLIT$2);
      }
   }

   public String getTopLeftCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOPLEFTCELL$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STCellRef xgetTopLeftCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var2 = null;
         var2 = (STCellRef)this.get_store().find_attribute_user(TOPLEFTCELL$4);
         return var2;
      }
   }

   public boolean isSetTopLeftCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOPLEFTCELL$4) != null;
      }
   }

   public void setTopLeftCell(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOPLEFTCELL$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOPLEFTCELL$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTopLeftCell(STCellRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var3 = null;
         var3 = (STCellRef)this.get_store().find_attribute_user(TOPLEFTCELL$4);
         if(var3 == null) {
            var3 = (STCellRef)this.get_store().add_attribute_user(TOPLEFTCELL$4);
         }

         var3.set(var1);
      }
   }

   public void unsetTopLeftCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOPLEFTCELL$4);
      }
   }

   public STPane.Enum getActivePane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACTIVEPANE$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ACTIVEPANE$6);
         }

         return var2 == null?null:(STPane.Enum)var2.getEnumValue();
      }
   }

   public STPane xgetActivePane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPane var2 = null;
         var2 = (STPane)this.get_store().find_attribute_user(ACTIVEPANE$6);
         if(var2 == null) {
            var2 = (STPane)this.get_default_attribute_value(ACTIVEPANE$6);
         }

         return var2;
      }
   }

   public boolean isSetActivePane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ACTIVEPANE$6) != null;
      }
   }

   public void setActivePane(STPane.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ACTIVEPANE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ACTIVEPANE$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetActivePane(STPane var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPane var3 = null;
         var3 = (STPane)this.get_store().find_attribute_user(ACTIVEPANE$6);
         if(var3 == null) {
            var3 = (STPane)this.get_store().add_attribute_user(ACTIVEPANE$6);
         }

         var3.set(var1);
      }
   }

   public void unsetActivePane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ACTIVEPANE$6);
      }
   }

   public STPaneState.Enum getState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STATE$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(STATE$8);
         }

         return var2 == null?null:(STPaneState.Enum)var2.getEnumValue();
      }
   }

   public STPaneState xgetState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPaneState var2 = null;
         var2 = (STPaneState)this.get_store().find_attribute_user(STATE$8);
         if(var2 == null) {
            var2 = (STPaneState)this.get_default_attribute_value(STATE$8);
         }

         return var2;
      }
   }

   public boolean isSetState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STATE$8) != null;
      }
   }

   public void setState(STPaneState.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STATE$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STATE$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetState(STPaneState var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPaneState var3 = null;
         var3 = (STPaneState)this.get_store().find_attribute_user(STATE$8);
         if(var3 == null) {
            var3 = (STPaneState)this.get_store().add_attribute_user(STATE$8);
         }

         var3.set(var1);
      }
   }

   public void unsetState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STATE$8);
      }
   }

}
