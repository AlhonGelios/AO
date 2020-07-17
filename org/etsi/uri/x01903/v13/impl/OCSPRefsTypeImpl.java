package org.etsi.uri.x01903.v13.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.OCSPRefType;
import org.etsi.uri.x01903.v13.OCSPRefsType;
import org.etsi.uri.x01903.v13.impl.OCSPRefsTypeImpl.1OCSPRefList;

public class OCSPRefsTypeImpl extends XmlComplexContentImpl implements OCSPRefsType {

   private static final QName OCSPREF$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "OCSPRef");


   public OCSPRefsTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getOCSPRefList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1OCSPRefList(this);
      }
   }

   public OCSPRefType[] getOCSPRefArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(OCSPREF$0, var2);
         OCSPRefType[] var3 = new OCSPRefType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public OCSPRefType getOCSPRefArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPRefType var3 = null;
         var3 = (OCSPRefType)this.get_store().find_element_user(OCSPREF$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfOCSPRefArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OCSPREF$0);
      }
   }

   public void setOCSPRefArray(OCSPRefType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OCSPREF$0);
      }
   }

   public void setOCSPRefArray(int var1, OCSPRefType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPRefType var4 = null;
         var4 = (OCSPRefType)this.get_store().find_element_user(OCSPREF$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public OCSPRefType insertNewOCSPRef(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPRefType var3 = null;
         var3 = (OCSPRefType)this.get_store().insert_element_user(OCSPREF$0, var1);
         return var3;
      }
   }

   public OCSPRefType addNewOCSPRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPRefType var2 = null;
         var2 = (OCSPRefType)this.get_store().add_element_user(OCSPREF$0);
         return var2;
      }
   }

   public void removeOCSPRef(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OCSPREF$0, var1);
      }
   }

}
