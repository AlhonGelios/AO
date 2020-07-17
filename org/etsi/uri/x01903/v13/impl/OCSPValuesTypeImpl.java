package org.etsi.uri.x01903.v13.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.EncapsulatedPKIDataType;
import org.etsi.uri.x01903.v13.OCSPValuesType;
import org.etsi.uri.x01903.v13.impl.OCSPValuesTypeImpl.1EncapsulatedOCSPValueList;

public class OCSPValuesTypeImpl extends XmlComplexContentImpl implements OCSPValuesType {

   private static final QName ENCAPSULATEDOCSPVALUE$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "EncapsulatedOCSPValue");


   public OCSPValuesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getEncapsulatedOCSPValueList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EncapsulatedOCSPValueList(this);
      }
   }

   public EncapsulatedPKIDataType[] getEncapsulatedOCSPValueArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ENCAPSULATEDOCSPVALUE$0, var2);
         EncapsulatedPKIDataType[] var3 = new EncapsulatedPKIDataType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public EncapsulatedPKIDataType getEncapsulatedOCSPValueArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var3 = null;
         var3 = (EncapsulatedPKIDataType)this.get_store().find_element_user(ENCAPSULATEDOCSPVALUE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEncapsulatedOCSPValueArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENCAPSULATEDOCSPVALUE$0);
      }
   }

   public void setEncapsulatedOCSPValueArray(EncapsulatedPKIDataType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ENCAPSULATEDOCSPVALUE$0);
      }
   }

   public void setEncapsulatedOCSPValueArray(int var1, EncapsulatedPKIDataType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var4 = null;
         var4 = (EncapsulatedPKIDataType)this.get_store().find_element_user(ENCAPSULATEDOCSPVALUE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public EncapsulatedPKIDataType insertNewEncapsulatedOCSPValue(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var3 = null;
         var3 = (EncapsulatedPKIDataType)this.get_store().insert_element_user(ENCAPSULATEDOCSPVALUE$0, var1);
         return var3;
      }
   }

   public EncapsulatedPKIDataType addNewEncapsulatedOCSPValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var2 = null;
         var2 = (EncapsulatedPKIDataType)this.get_store().add_element_user(ENCAPSULATEDOCSPVALUE$0);
         return var2;
      }
   }

   public void removeEncapsulatedOCSPValue(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENCAPSULATEDOCSPVALUE$0, var1);
      }
   }

}
