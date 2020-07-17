package org.w3.x2000.x09.xmldsig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.w3.x2000.x09.xmldsig.CanonicalizationMethodType;

public class CanonicalizationMethodTypeImpl extends XmlComplexContentImpl implements CanonicalizationMethodType {

   private static final QName ALGORITHM$0 = new QName("", "Algorithm");


   public CanonicalizationMethodTypeImpl(SchemaType var1) {
      super(var1);
   }

   public String getAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALGORITHM$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(ALGORITHM$0);
         return var2;
      }
   }

   public void setAlgorithm(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALGORITHM$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALGORITHM$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAlgorithm(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(ALGORITHM$0);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(ALGORITHM$0);
         }

         var3.set(var1);
      }
   }

}
