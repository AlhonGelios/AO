package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CertIDType;
import org.etsi.uri.x01903.v13.DigestAlgAndValueType;
import org.w3.x2000.x09.xmldsig.X509IssuerSerialType;

public class CertIDTypeImpl extends XmlComplexContentImpl implements CertIDType {

   private static final QName CERTDIGEST$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CertDigest");
   private static final QName ISSUERSERIAL$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "IssuerSerial");
   private static final QName URI$4 = new QName("", "URI");


   public CertIDTypeImpl(SchemaType var1) {
      super(var1);
   }

   public DigestAlgAndValueType getCertDigest() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestAlgAndValueType var2 = null;
         var2 = (DigestAlgAndValueType)this.get_store().find_element_user(CERTDIGEST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCertDigest(DigestAlgAndValueType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestAlgAndValueType var3 = null;
         var3 = (DigestAlgAndValueType)this.get_store().find_element_user(CERTDIGEST$0, 0);
         if(var3 == null) {
            var3 = (DigestAlgAndValueType)this.get_store().add_element_user(CERTDIGEST$0);
         }

         var3.set(var1);
      }
   }

   public DigestAlgAndValueType addNewCertDigest() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestAlgAndValueType var2 = null;
         var2 = (DigestAlgAndValueType)this.get_store().add_element_user(CERTDIGEST$0);
         return var2;
      }
   }

   public X509IssuerSerialType getIssuerSerial() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         X509IssuerSerialType var2 = null;
         var2 = (X509IssuerSerialType)this.get_store().find_element_user(ISSUERSERIAL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setIssuerSerial(X509IssuerSerialType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         X509IssuerSerialType var3 = null;
         var3 = (X509IssuerSerialType)this.get_store().find_element_user(ISSUERSERIAL$2, 0);
         if(var3 == null) {
            var3 = (X509IssuerSerialType)this.get_store().add_element_user(ISSUERSERIAL$2);
         }

         var3.set(var1);
      }
   }

   public X509IssuerSerialType addNewIssuerSerial() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         X509IssuerSerialType var2 = null;
         var2 = (X509IssuerSerialType)this.get_store().add_element_user(ISSUERSERIAL$2);
         return var2;
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
