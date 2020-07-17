package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CertIDListType;
import org.etsi.uri.x01903.v13.CompleteCertificateRefsType;

public class CompleteCertificateRefsTypeImpl extends XmlComplexContentImpl implements CompleteCertificateRefsType {

   private static final QName CERTREFS$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CertRefs");
   private static final QName ID$2 = new QName("", "Id");


   public CompleteCertificateRefsTypeImpl(SchemaType var1) {
      super(var1);
   }

   public CertIDListType getCertRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertIDListType var2 = null;
         var2 = (CertIDListType)this.get_store().find_element_user(CERTREFS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCertRefs(CertIDListType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertIDListType var3 = null;
         var3 = (CertIDListType)this.get_store().find_element_user(CERTREFS$0, 0);
         if(var3 == null) {
            var3 = (CertIDListType)this.get_store().add_element_user(CERTREFS$0);
         }

         var3.set(var1);
      }
   }

   public CertIDListType addNewCertRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertIDListType var2 = null;
         var2 = (CertIDListType)this.get_store().add_element_user(CERTREFS$0);
         return var2;
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$2);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$2) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$2);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$2);
      }
   }

}
