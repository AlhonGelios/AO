package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.DigestAlgAndValueType;
import org.w3.x2000.x09.xmldsig.DigestMethodType;
import org.w3.x2000.x09.xmldsig.DigestValueType;

public class DigestAlgAndValueTypeImpl extends XmlComplexContentImpl implements DigestAlgAndValueType {

   private static final QName DIGESTMETHOD$0 = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
   private static final QName DIGESTVALUE$2 = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");


   public DigestAlgAndValueTypeImpl(SchemaType var1) {
      super(var1);
   }

   public DigestMethodType getDigestMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestMethodType var2 = null;
         var2 = (DigestMethodType)this.get_store().find_element_user(DIGESTMETHOD$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setDigestMethod(DigestMethodType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestMethodType var3 = null;
         var3 = (DigestMethodType)this.get_store().find_element_user(DIGESTMETHOD$0, 0);
         if(var3 == null) {
            var3 = (DigestMethodType)this.get_store().add_element_user(DIGESTMETHOD$0);
         }

         var3.set(var1);
      }
   }

   public DigestMethodType addNewDigestMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestMethodType var2 = null;
         var2 = (DigestMethodType)this.get_store().add_element_user(DIGESTMETHOD$0);
         return var2;
      }
   }

   public byte[] getDigestValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(DIGESTVALUE$2, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public DigestValueType xgetDigestValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestValueType var2 = null;
         var2 = (DigestValueType)this.get_store().find_element_user(DIGESTVALUE$2, 0);
         return var2;
      }
   }

   public void setDigestValue(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DIGESTVALUE$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(DIGESTVALUE$2);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetDigestValue(DigestValueType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestValueType var3 = null;
         var3 = (DigestValueType)this.get_store().find_element_user(DIGESTVALUE$2, 0);
         if(var3 == null) {
            var3 = (DigestValueType)this.get_store().add_element_user(DIGESTVALUE$2);
         }

         var3.set(var1);
      }
   }

}
