package org.etsi.uri.x01903.v13.impl;

import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CRLIdentifierType;

public class CRLIdentifierTypeImpl extends XmlComplexContentImpl implements CRLIdentifierType {

   private static final QName ISSUER$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "Issuer");
   private static final QName ISSUETIME$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "IssueTime");
   private static final QName NUMBER$4 = new QName("http://uri.etsi.org/01903/v1.3.2#", "Number");
   private static final QName URI$6 = new QName("", "URI");


   public CRLIdentifierTypeImpl(SchemaType var1) {
      super(var1);
   }

   public String getIssuer() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(ISSUER$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetIssuer() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(ISSUER$0, 0);
         return var2;
      }
   }

   public void setIssuer(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ISSUER$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(ISSUER$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetIssuer(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(ISSUER$0, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(ISSUER$0);
         }

         var3.set(var1);
      }
   }

   public Calendar getIssueTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(ISSUETIME$2, 0);
         return var2 == null?null:var2.getCalendarValue();
      }
   }

   public XmlDateTime xgetIssueTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var2 = null;
         var2 = (XmlDateTime)this.get_store().find_element_user(ISSUETIME$2, 0);
         return var2;
      }
   }

   public void setIssueTime(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ISSUETIME$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(ISSUETIME$2);
         }

         var3.setCalendarValue(var1);
      }
   }

   public void xsetIssueTime(XmlDateTime var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().find_element_user(ISSUETIME$2, 0);
         if(var3 == null) {
            var3 = (XmlDateTime)this.get_store().add_element_user(ISSUETIME$2);
         }

         var3.set((XmlObject)var1);
      }
   }

   public BigInteger getNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(NUMBER$4, 0);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlInteger xgetNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().find_element_user(NUMBER$4, 0);
         return var2;
      }
   }

   public boolean isSetNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMBER$4) != 0;
      }
   }

   public void setNumber(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(NUMBER$4, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(NUMBER$4);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetNumber(XmlInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(NUMBER$4, 0);
         if(var3 == null) {
            var3 = (XmlInteger)this.get_store().add_element_user(NUMBER$4);
         }

         var3.set(var1);
      }
   }

   public void unsetNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMBER$4, 0);
      }
   }

   public String getURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(URI$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(URI$6);
         return var2;
      }
   }

   public boolean isSetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(URI$6) != null;
      }
   }

   public void setURI(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(URI$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(URI$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetURI(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(URI$6);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(URI$6);
         }

         var3.set(var1);
      }
   }

   public void unsetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(URI$6);
      }
   }

}
