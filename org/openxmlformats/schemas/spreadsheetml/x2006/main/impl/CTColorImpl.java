package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex;

public class CTColorImpl extends XmlComplexContentImpl implements CTColor {

   private static final QName AUTO$0 = new QName("", "auto");
   private static final QName INDEXED$2 = new QName("", "indexed");
   private static final QName RGB$4 = new QName("", "rgb");
   private static final QName THEME$6 = new QName("", "theme");
   private static final QName TINT$8 = new QName("", "tint");


   public CTColorImpl(SchemaType var1) {
      super(var1);
   }

   public boolean getAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTO$0);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(AUTO$0);
         return var2;
      }
   }

   public boolean isSetAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AUTO$0) != null;
      }
   }

   public void setAuto(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AUTO$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AUTO$0);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAuto(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(AUTO$0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(AUTO$0);
         }

         var3.set(var1);
      }
   }

   public void unsetAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AUTO$0);
      }
   }

   public long getIndexed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INDEXED$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetIndexed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(INDEXED$2);
         return var2;
      }
   }

   public boolean isSetIndexed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INDEXED$2) != null;
      }
   }

   public void setIndexed(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(INDEXED$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(INDEXED$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetIndexed(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(INDEXED$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(INDEXED$2);
         }

         var3.set(var1);
      }
   }

   public void unsetIndexed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INDEXED$2);
      }
   }

   public byte[] getRgb() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RGB$4);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STUnsignedIntHex xgetRgb() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUnsignedIntHex var2 = null;
         var2 = (STUnsignedIntHex)this.get_store().find_attribute_user(RGB$4);
         return var2;
      }
   }

   public boolean isSetRgb() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RGB$4) != null;
      }
   }

   public void setRgb(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RGB$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RGB$4);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetRgb(STUnsignedIntHex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUnsignedIntHex var3 = null;
         var3 = (STUnsignedIntHex)this.get_store().find_attribute_user(RGB$4);
         if(var3 == null) {
            var3 = (STUnsignedIntHex)this.get_store().add_attribute_user(RGB$4);
         }

         var3.set(var1);
      }
   }

   public void unsetRgb() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RGB$4);
      }
   }

   public long getTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THEME$6);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(THEME$6);
         return var2;
      }
   }

   public boolean isSetTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THEME$6) != null;
      }
   }

   public void setTheme(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(THEME$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(THEME$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetTheme(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(THEME$6);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(THEME$6);
         }

         var3.set(var1);
      }
   }

   public void unsetTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THEME$6);
      }
   }

   public double getTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TINT$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TINT$8);
         }

         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(TINT$8);
         if(var2 == null) {
            var2 = (XmlDouble)this.get_default_attribute_value(TINT$8);
         }

         return var2;
      }
   }

   public boolean isSetTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TINT$8) != null;
      }
   }

   public void setTint(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TINT$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TINT$8);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetTint(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(TINT$8);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(TINT$8);
         }

         var3.set(var1);
      }
   }

   public void unsetTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TINT$8);
      }
   }

}
