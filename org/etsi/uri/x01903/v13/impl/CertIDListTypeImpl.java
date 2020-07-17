package org.etsi.uri.x01903.v13.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CertIDListType;
import org.etsi.uri.x01903.v13.CertIDType;
import org.etsi.uri.x01903.v13.impl.CertIDListTypeImpl.1CertList;

public class CertIDListTypeImpl extends XmlComplexContentImpl implements CertIDListType {

   private static final QName CERT$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "Cert");


   public CertIDListTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getCertList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CertList(this);
      }
   }

   public CertIDType[] getCertArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CERT$0, var2);
         CertIDType[] var3 = new CertIDType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CertIDType getCertArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertIDType var3 = null;
         var3 = (CertIDType)this.get_store().find_element_user(CERT$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCertArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CERT$0);
      }
   }

   public void setCertArray(CertIDType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CERT$0);
      }
   }

   public void setCertArray(int var1, CertIDType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertIDType var4 = null;
         var4 = (CertIDType)this.get_store().find_element_user(CERT$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CertIDType insertNewCert(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertIDType var3 = null;
         var3 = (CertIDType)this.get_store().insert_element_user(CERT$0, var1);
         return var3;
      }
   }

   public CertIDType addNewCert() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertIDType var2 = null;
         var2 = (CertIDType)this.get_store().add_element_user(CERT$0);
         return var2;
      }
   }

   public void removeCert(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CERT$0, var1);
      }
   }

}
