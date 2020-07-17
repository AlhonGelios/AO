package org.w3.x2000.x09.xmldsig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.w3.x2000.x09.xmldsig.DigestMethodType;
import org.w3.x2000.x09.xmldsig.DigestValueType;
import org.w3.x2000.x09.xmldsig.ReferenceType;
import org.w3.x2000.x09.xmldsig.TransformsType;

public class ReferenceTypeImpl extends XmlComplexContentImpl implements ReferenceType {

   private static final QName TRANSFORMS$0 = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
   private static final QName DIGESTMETHOD$2 = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
   private static final QName DIGESTVALUE$4 = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
   private static final QName ID$6 = new QName("", "Id");
   private static final QName URI$8 = new QName("", "URI");
   private static final QName TYPE$10 = new QName("", "Type");


   public ReferenceTypeImpl(SchemaType var1) {
      super(var1);
   }

   public TransformsType getTransforms() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TransformsType var2 = null;
         var2 = (TransformsType)this.get_store().find_element_user(TRANSFORMS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTransforms() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TRANSFORMS$0) != 0;
      }
   }

   public void setTransforms(TransformsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TransformsType var3 = null;
         var3 = (TransformsType)this.get_store().find_element_user(TRANSFORMS$0, 0);
         if(var3 == null) {
            var3 = (TransformsType)this.get_store().add_element_user(TRANSFORMS$0);
         }

         var3.set(var1);
      }
   }

   public TransformsType addNewTransforms() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TransformsType var2 = null;
         var2 = (TransformsType)this.get_store().add_element_user(TRANSFORMS$0);
         return var2;
      }
   }

   public void unsetTransforms() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TRANSFORMS$0, 0);
      }
   }

   public DigestMethodType getDigestMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestMethodType var2 = null;
         var2 = (DigestMethodType)this.get_store().find_element_user(DIGESTMETHOD$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setDigestMethod(DigestMethodType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestMethodType var3 = null;
         var3 = (DigestMethodType)this.get_store().find_element_user(DIGESTMETHOD$2, 0);
         if(var3 == null) {
            var3 = (DigestMethodType)this.get_store().add_element_user(DIGESTMETHOD$2);
         }

         var3.set(var1);
      }
   }

   public DigestMethodType addNewDigestMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestMethodType var2 = null;
         var2 = (DigestMethodType)this.get_store().add_element_user(DIGESTMETHOD$2);
         return var2;
      }
   }

   public byte[] getDigestValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(DIGESTVALUE$4, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public DigestValueType xgetDigestValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestValueType var2 = null;
         var2 = (DigestValueType)this.get_store().find_element_user(DIGESTVALUE$4, 0);
         return var2;
      }
   }

   public void setDigestValue(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DIGESTVALUE$4, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(DIGESTVALUE$4);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetDigestValue(DigestValueType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestValueType var3 = null;
         var3 = (DigestValueType)this.get_store().find_element_user(DIGESTVALUE$4, 0);
         if(var3 == null) {
            var3 = (DigestValueType)this.get_store().add_element_user(DIGESTVALUE$4);
         }

         var3.set(var1);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$6);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$6) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$6);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$6);
      }
   }

   public String getURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(URI$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(URI$8);
         return var2;
      }
   }

   public boolean isSetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(URI$8) != null;
      }
   }

   public void setURI(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(URI$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(URI$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetURI(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(URI$8);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(URI$8);
         }

         var3.set(var1);
      }
   }

   public void unsetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(URI$8);
      }
   }

   public String getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(TYPE$10);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$10) != null;
      }
   }

   public void setType(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetType(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(TYPE$10);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(TYPE$10);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$10);
      }
   }

}
