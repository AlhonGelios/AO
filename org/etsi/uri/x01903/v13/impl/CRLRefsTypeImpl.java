package org.etsi.uri.x01903.v13.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CRLRefType;
import org.etsi.uri.x01903.v13.CRLRefsType;
import org.etsi.uri.x01903.v13.impl.CRLRefsTypeImpl.1CRLRefList;

public class CRLRefsTypeImpl extends XmlComplexContentImpl implements CRLRefsType {

   private static final QName CRLREF$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CRLRef");


   public CRLRefsTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getCRLRefList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CRLRefList(this);
      }
   }

   public CRLRefType[] getCRLRefArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CRLREF$0, var2);
         CRLRefType[] var3 = new CRLRefType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CRLRefType getCRLRefArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLRefType var3 = null;
         var3 = (CRLRefType)this.get_store().find_element_user(CRLREF$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCRLRefArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CRLREF$0);
      }
   }

   public void setCRLRefArray(CRLRefType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CRLREF$0);
      }
   }

   public void setCRLRefArray(int var1, CRLRefType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLRefType var4 = null;
         var4 = (CRLRefType)this.get_store().find_element_user(CRLREF$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CRLRefType insertNewCRLRef(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLRefType var3 = null;
         var3 = (CRLRefType)this.get_store().insert_element_user(CRLREF$0, var1);
         return var3;
      }
   }

   public CRLRefType addNewCRLRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLRefType var2 = null;
         var2 = (CRLRefType)this.get_store().add_element_user(CRLREF$0);
         return var2;
      }
   }

   public void removeCRLRef(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CRLREF$0, var1);
      }
   }

}
