package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema;

public class CTSchemaImpl extends XmlComplexContentImpl implements CTSchema {

   private static final QName ID$0 = new QName("", "ID");
   private static final QName SCHEMAREF$2 = new QName("", "SchemaRef");
   private static final QName NAMESPACE$4 = new QName("", "Namespace");


   public CTSchemaImpl(SchemaType var1) {
      super(var1);
   }

   public String getID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ID$0);
         return var2;
      }
   }

   public void setID(String var1) {
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

   public void xsetID(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ID$0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ID$0);
         }

         var3.set(var1);
      }
   }

   public String getSchemaRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SCHEMAREF$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetSchemaRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(SCHEMAREF$2);
         return var2;
      }
   }

   public boolean isSetSchemaRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SCHEMAREF$2) != null;
      }
   }

   public void setSchemaRef(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SCHEMAREF$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SCHEMAREF$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSchemaRef(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(SCHEMAREF$2);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(SCHEMAREF$2);
         }

         var3.set(var1);
      }
   }

   public void unsetSchemaRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SCHEMAREF$2);
      }
   }

   public String getNamespace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAMESPACE$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetNamespace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAMESPACE$4);
         return var2;
      }
   }

   public boolean isSetNamespace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAMESPACE$4) != null;
      }
   }

   public void setNamespace(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAMESPACE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAMESPACE$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetNamespace(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAMESPACE$4);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAMESPACE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetNamespace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAMESPACE$4);
      }
   }

}
