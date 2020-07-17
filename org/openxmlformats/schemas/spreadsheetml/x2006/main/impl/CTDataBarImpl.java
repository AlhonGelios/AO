package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTDataBarImpl.1CfvoList;

public class CTDataBarImpl extends XmlComplexContentImpl implements CTDataBar {

   private static final QName CFVO$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cfvo");
   private static final QName COLOR$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "color");
   private static final QName MINLENGTH$4 = new QName("", "minLength");
   private static final QName MAXLENGTH$6 = new QName("", "maxLength");
   private static final QName SHOWVALUE$8 = new QName("", "showValue");


   public CTDataBarImpl(SchemaType var1) {
      super(var1);
   }

   public List getCfvoList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CfvoList(this);
      }
   }

   public CTCfvo[] getCfvoArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CFVO$0, var2);
         CTCfvo[] var3 = new CTCfvo[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCfvo getCfvoArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfvo var3 = null;
         var3 = (CTCfvo)this.get_store().find_element_user(CFVO$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCfvoArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CFVO$0);
      }
   }

   public void setCfvoArray(CTCfvo[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CFVO$0);
      }
   }

   public void setCfvoArray(int var1, CTCfvo var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfvo var4 = null;
         var4 = (CTCfvo)this.get_store().find_element_user(CFVO$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCfvo insertNewCfvo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfvo var3 = null;
         var3 = (CTCfvo)this.get_store().insert_element_user(CFVO$0, var1);
         return var3;
      }
   }

   public CTCfvo addNewCfvo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfvo var2 = null;
         var2 = (CTCfvo)this.get_store().add_element_user(CFVO$0);
         return var2;
      }
   }

   public void removeCfvo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CFVO$0, var1);
      }
   }

   public CTColor getColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(COLOR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setColor(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(COLOR$2, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(COLOR$2);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(COLOR$2);
         return var2;
      }
   }

   public long getMinLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MINLENGTH$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MINLENGTH$4);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMinLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MINLENGTH$4);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(MINLENGTH$4);
         }

         return var2;
      }
   }

   public boolean isSetMinLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MINLENGTH$4) != null;
      }
   }

   public void setMinLength(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MINLENGTH$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MINLENGTH$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMinLength(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MINLENGTH$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MINLENGTH$4);
         }

         var3.set(var1);
      }
   }

   public void unsetMinLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MINLENGTH$4);
      }
   }

   public long getMaxLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MAXLENGTH$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MAXLENGTH$6);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMaxLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MAXLENGTH$6);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(MAXLENGTH$6);
         }

         return var2;
      }
   }

   public boolean isSetMaxLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MAXLENGTH$6) != null;
      }
   }

   public void setMaxLength(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MAXLENGTH$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MAXLENGTH$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMaxLength(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MAXLENGTH$6);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MAXLENGTH$6);
         }

         var3.set(var1);
      }
   }

   public void unsetMaxLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MAXLENGTH$6);
      }
   }

   public boolean getShowValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWVALUE$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWVALUE$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWVALUE$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWVALUE$8);
         }

         return var2;
      }
   }

   public boolean isSetShowValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWVALUE$8) != null;
      }
   }

   public void setShowValue(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWVALUE$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWVALUE$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowValue(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWVALUE$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWVALUE$8);
         }

         var3.set(var1);
      }
   }

   public void unsetShowValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWVALUE$8);
      }
   }

}
