package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBreak;

public class CTBreakImpl extends XmlComplexContentImpl implements CTBreak {

   private static final QName ID$0 = new QName("", "id");
   private static final QName MIN$2 = new QName("", "min");
   private static final QName MAX$4 = new QName("", "max");
   private static final QName MAN$6 = new QName("", "man");
   private static final QName PT$8 = new QName("", "pt");


   public CTBreakImpl(SchemaType var1) {
      super(var1);
   }

   public long getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ID$0);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$0);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(ID$0);
         }

         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$0) != null;
      }
   }

   public void setId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$0);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$0);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$0);
      }
   }

   public long getMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MIN$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MIN$2);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MIN$2);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(MIN$2);
         }

         return var2;
      }
   }

   public boolean isSetMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MIN$2) != null;
      }
   }

   public void setMin(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MIN$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MIN$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMin(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MIN$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MIN$2);
         }

         var3.set(var1);
      }
   }

   public void unsetMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MIN$2);
      }
   }

   public long getMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MAX$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MAX$4);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MAX$4);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(MAX$4);
         }

         return var2;
      }
   }

   public boolean isSetMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MAX$4) != null;
      }
   }

   public void setMax(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MAX$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MAX$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMax(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MAX$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MAX$4);
         }

         var3.set(var1);
      }
   }

   public void unsetMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MAX$4);
      }
   }

   public boolean getMan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MAN$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MAN$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MAN$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(MAN$6);
         }

         return var2;
      }
   }

   public boolean isSetMan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MAN$6) != null;
      }
   }

   public void setMan(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MAN$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MAN$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMan(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MAN$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MAN$6);
         }

         var3.set(var1);
      }
   }

   public void unsetMan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MAN$6);
      }
   }

   public boolean getPt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PT$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PT$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PT$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PT$8);
         }

         return var2;
      }
   }

   public boolean isSetPt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PT$8) != null;
      }
   }

   public void setPt(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PT$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PT$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPt(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PT$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PT$8);
         }

         var3.set(var1);
      }
   }

   public void unsetPt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PT$8);
      }
   }

}
