package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTIconSetImpl.1CfvoList;

public class CTIconSetImpl extends XmlComplexContentImpl implements CTIconSet {

   private static final QName CFVO$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cfvo");
   private static final QName ICONSET$2 = new QName("", "iconSet");
   private static final QName SHOWVALUE$4 = new QName("", "showValue");
   private static final QName PERCENT$6 = new QName("", "percent");
   private static final QName REVERSE$8 = new QName("", "reverse");


   public CTIconSetImpl(SchemaType var1) {
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

   public STIconSetType.Enum getIconSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ICONSET$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ICONSET$2);
         }

         return var2 == null?null:(STIconSetType.Enum)var2.getEnumValue();
      }
   }

   public STIconSetType xgetIconSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STIconSetType var2 = null;
         var2 = (STIconSetType)this.get_store().find_attribute_user(ICONSET$2);
         if(var2 == null) {
            var2 = (STIconSetType)this.get_default_attribute_value(ICONSET$2);
         }

         return var2;
      }
   }

   public boolean isSetIconSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ICONSET$2) != null;
      }
   }

   public void setIconSet(STIconSetType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ICONSET$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ICONSET$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetIconSet(STIconSetType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STIconSetType var3 = null;
         var3 = (STIconSetType)this.get_store().find_attribute_user(ICONSET$2);
         if(var3 == null) {
            var3 = (STIconSetType)this.get_store().add_attribute_user(ICONSET$2);
         }

         var3.set(var1);
      }
   }

   public void unsetIconSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ICONSET$2);
      }
   }

   public boolean getShowValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWVALUE$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWVALUE$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWVALUE$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWVALUE$4);
         }

         return var2;
      }
   }

   public boolean isSetShowValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWVALUE$4) != null;
      }
   }

   public void setShowValue(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWVALUE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWVALUE$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowValue(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWVALUE$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWVALUE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetShowValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWVALUE$4);
      }
   }

   public boolean getPercent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PERCENT$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PERCENT$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPercent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PERCENT$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PERCENT$6);
         }

         return var2;
      }
   }

   public boolean isSetPercent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PERCENT$6) != null;
      }
   }

   public void setPercent(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PERCENT$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PERCENT$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPercent(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PERCENT$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PERCENT$6);
         }

         var3.set(var1);
      }
   }

   public void unsetPercent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PERCENT$6);
      }
   }

   public boolean getReverse() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REVERSE$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(REVERSE$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetReverse() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(REVERSE$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(REVERSE$8);
         }

         return var2;
      }
   }

   public boolean isSetReverse() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REVERSE$8) != null;
      }
   }

   public void setReverse(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REVERSE$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REVERSE$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetReverse(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(REVERSE$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(REVERSE$8);
         }

         var3.set(var1);
      }
   }

   public void unsetReverse() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REVERSE$8);
      }
   }

}
