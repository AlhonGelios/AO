package org.etsi.uri.x01903.v13.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CRLValuesType;
import org.etsi.uri.x01903.v13.EncapsulatedPKIDataType;
import org.etsi.uri.x01903.v13.impl.CRLValuesTypeImpl.1EncapsulatedCRLValueList;

public class CRLValuesTypeImpl extends XmlComplexContentImpl implements CRLValuesType {

   private static final QName ENCAPSULATEDCRLVALUE$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "EncapsulatedCRLValue");


   public CRLValuesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getEncapsulatedCRLValueList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EncapsulatedCRLValueList(this);
      }
   }

   public EncapsulatedPKIDataType[] getEncapsulatedCRLValueArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ENCAPSULATEDCRLVALUE$0, var2);
         EncapsulatedPKIDataType[] var3 = new EncapsulatedPKIDataType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public EncapsulatedPKIDataType getEncapsulatedCRLValueArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var3 = null;
         var3 = (EncapsulatedPKIDataType)this.get_store().find_element_user(ENCAPSULATEDCRLVALUE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEncapsulatedCRLValueArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENCAPSULATEDCRLVALUE$0);
      }
   }

   public void setEncapsulatedCRLValueArray(EncapsulatedPKIDataType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ENCAPSULATEDCRLVALUE$0);
      }
   }

   public void setEncapsulatedCRLValueArray(int var1, EncapsulatedPKIDataType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var4 = null;
         var4 = (EncapsulatedPKIDataType)this.get_store().find_element_user(ENCAPSULATEDCRLVALUE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public EncapsulatedPKIDataType insertNewEncapsulatedCRLValue(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var3 = null;
         var3 = (EncapsulatedPKIDataType)this.get_store().insert_element_user(ENCAPSULATEDCRLVALUE$0, var1);
         return var3;
      }
   }

   public EncapsulatedPKIDataType addNewEncapsulatedCRLValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var2 = null;
         var2 = (EncapsulatedPKIDataType)this.get_store().add_element_user(ENCAPSULATEDCRLVALUE$0);
         return var2;
      }
   }

   public void removeEncapsulatedCRLValue(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENCAPSULATEDCRLVALUE$0, var1);
      }
   }

}
