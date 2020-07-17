package org.etsi.uri.x01903.v13.impl;

import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.OCSPIdentifierType;
import org.etsi.uri.x01903.v13.ResponderIDType;

public class OCSPIdentifierTypeImpl extends XmlComplexContentImpl implements OCSPIdentifierType {

   private static final QName RESPONDERID$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "ResponderID");
   private static final QName PRODUCEDAT$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "ProducedAt");
   private static final QName URI$4 = new QName("", "URI");


   public OCSPIdentifierTypeImpl(SchemaType var1) {
      super(var1);
   }

   public ResponderIDType getResponderID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ResponderIDType var2 = null;
         var2 = (ResponderIDType)this.get_store().find_element_user(RESPONDERID$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setResponderID(ResponderIDType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ResponderIDType var3 = null;
         var3 = (ResponderIDType)this.get_store().find_element_user(RESPONDERID$0, 0);
         if(var3 == null) {
            var3 = (ResponderIDType)this.get_store().add_element_user(RESPONDERID$0);
         }

         var3.set(var1);
      }
   }

   public ResponderIDType addNewResponderID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ResponderIDType var2 = null;
         var2 = (ResponderIDType)this.get_store().add_element_user(RESPONDERID$0);
         return var2;
      }
   }

   public Calendar getProducedAt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(PRODUCEDAT$2, 0);
         return var2 == null?null:var2.getCalendarValue();
      }
   }

   public XmlDateTime xgetProducedAt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var2 = null;
         var2 = (XmlDateTime)this.get_store().find_element_user(PRODUCEDAT$2, 0);
         return var2;
      }
   }

   public void setProducedAt(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(PRODUCEDAT$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(PRODUCEDAT$2);
         }

         var3.setCalendarValue(var1);
      }
   }

   public void xsetProducedAt(XmlDateTime var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().find_element_user(PRODUCEDAT$2, 0);
         if(var3 == null) {
            var3 = (XmlDateTime)this.get_store().add_element_user(PRODUCEDAT$2);
         }

         var3.set((XmlObject)var1);
      }
   }

   public String getURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(URI$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(URI$4);
         return var2;
      }
   }

   public boolean isSetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(URI$4) != null;
      }
   }

   public void setURI(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(URI$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(URI$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetURI(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(URI$4);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(URI$4);
         }

         var3.set(var1);
      }
   }

   public void unsetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(URI$4);
      }
   }

}
