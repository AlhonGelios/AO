package org.w3.x2000.x09.xmldsig.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.w3.x2000.x09.xmldsig.X509IssuerSerialType;

public class X509IssuerSerialTypeImpl extends XmlComplexContentImpl implements X509IssuerSerialType {

   private static final QName X509ISSUERNAME$0 = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerName");
   private static final QName X509SERIALNUMBER$2 = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SerialNumber");


   public X509IssuerSerialTypeImpl(SchemaType var1) {
      super(var1);
   }

   public String getX509IssuerName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(X509ISSUERNAME$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetX509IssuerName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(X509ISSUERNAME$0, 0);
         return var2;
      }
   }

   public void setX509IssuerName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(X509ISSUERNAME$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(X509ISSUERNAME$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetX509IssuerName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(X509ISSUERNAME$0, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(X509ISSUERNAME$0);
         }

         var3.set(var1);
      }
   }

   public BigInteger getX509SerialNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(X509SERIALNUMBER$2, 0);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlInteger xgetX509SerialNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().find_element_user(X509SERIALNUMBER$2, 0);
         return var2;
      }
   }

   public void setX509SerialNumber(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(X509SERIALNUMBER$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(X509SERIALNUMBER$2);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetX509SerialNumber(XmlInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(X509SERIALNUMBER$2, 0);
         if(var3 == null) {
            var3 = (XmlInteger)this.get_store().add_element_user(X509SERIALNUMBER$2);
         }

         var3.set(var1);
      }
   }

}
