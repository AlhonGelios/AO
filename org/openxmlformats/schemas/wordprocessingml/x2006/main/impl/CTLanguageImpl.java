package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang;

public class CTLanguageImpl extends XmlComplexContentImpl implements CTLanguage {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
   private static final QName EASTASIA$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "eastAsia");
   private static final QName BIDI$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bidi");


   public CTLanguageImpl(SchemaType var1) {
      super(var1);
   }

   public Object getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STLang xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLang var2 = null;
         var2 = (STLang)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public boolean isSetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VAL$0) != null;
      }
   }

   public void setVal(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetVal(STLang var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLang var3 = null;
         var3 = (STLang)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STLang)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

   public void unsetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VAL$0);
      }
   }

   public Object getEastAsia() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EASTASIA$2);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STLang xgetEastAsia() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLang var2 = null;
         var2 = (STLang)this.get_store().find_attribute_user(EASTASIA$2);
         return var2;
      }
   }

   public boolean isSetEastAsia() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EASTASIA$2) != null;
      }
   }

   public void setEastAsia(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EASTASIA$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EASTASIA$2);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetEastAsia(STLang var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLang var3 = null;
         var3 = (STLang)this.get_store().find_attribute_user(EASTASIA$2);
         if(var3 == null) {
            var3 = (STLang)this.get_store().add_attribute_user(EASTASIA$2);
         }

         var3.set(var1);
      }
   }

   public void unsetEastAsia() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EASTASIA$2);
      }
   }

   public Object getBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BIDI$4);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STLang xgetBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLang var2 = null;
         var2 = (STLang)this.get_store().find_attribute_user(BIDI$4);
         return var2;
      }
   }

   public boolean isSetBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BIDI$4) != null;
      }
   }

   public void setBidi(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BIDI$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BIDI$4);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetBidi(STLang var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLang var3 = null;
         var3 = (STLang)this.get_store().find_attribute_user(BIDI$4);
         if(var3 == null) {
            var3 = (STLang)this.get_store().add_attribute_user(BIDI$4);
         }

         var3.set(var1);
      }
   }

   public void unsetBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BIDI$4);
      }
   }

}
