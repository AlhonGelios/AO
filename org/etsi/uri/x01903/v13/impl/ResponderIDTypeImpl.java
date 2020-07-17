package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.ResponderIDType;

public class ResponderIDTypeImpl extends XmlComplexContentImpl implements ResponderIDType {

   private static final QName BYNAME$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "ByName");
   private static final QName BYKEY$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "ByKey");


   public ResponderIDTypeImpl(SchemaType var1) {
      super(var1);
   }

   public String getByName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(BYNAME$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetByName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(BYNAME$0, 0);
         return var2;
      }
   }

   public boolean isSetByName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BYNAME$0) != 0;
      }
   }

   public void setByName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(BYNAME$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(BYNAME$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetByName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(BYNAME$0, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(BYNAME$0);
         }

         var3.set(var1);
      }
   }

   public void unsetByName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BYNAME$0, 0);
      }
   }

   public byte[] getByKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(BYKEY$2, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetByKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_element_user(BYKEY$2, 0);
         return var2;
      }
   }

   public boolean isSetByKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BYKEY$2) != 0;
      }
   }

   public void setByKey(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(BYKEY$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(BYKEY$2);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetByKey(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_element_user(BYKEY$2, 0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_element_user(BYKEY$2);
         }

         var3.set(var1);
      }
   }

   public void unsetByKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BYKEY$2, 0);
      }
   }

}
