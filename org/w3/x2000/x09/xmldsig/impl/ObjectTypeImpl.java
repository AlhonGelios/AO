package org.w3.x2000.x09.xmldsig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.w3.x2000.x09.xmldsig.ObjectType;

public class ObjectTypeImpl extends XmlComplexContentImpl implements ObjectType {

   private static final QName ID$0 = new QName("", "Id");
   private static final QName MIMETYPE$2 = new QName("", "MimeType");
   private static final QName ENCODING$4 = new QName("", "Encoding");


   public ObjectTypeImpl(SchemaType var1) {
      super(var1);
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$0);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$0) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$0);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$0);
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

   public String getMimeType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MIMETYPE$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetMimeType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(MIMETYPE$2);
         return var2;
      }
   }

   public boolean isSetMimeType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MIMETYPE$2) != null;
      }
   }

   public void setMimeType(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MIMETYPE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MIMETYPE$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetMimeType(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(MIMETYPE$2);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(MIMETYPE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetMimeType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MIMETYPE$2);
      }
   }

   public String getEncoding() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENCODING$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetEncoding() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(ENCODING$4);
         return var2;
      }
   }

   public boolean isSetEncoding() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENCODING$4) != null;
      }
   }

   public void setEncoding(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENCODING$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENCODING$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetEncoding(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(ENCODING$4);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(ENCODING$4);
         }

         var3.set(var1);
      }
   }

   public void unsetEncoding() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENCODING$4);
      }
   }

}
