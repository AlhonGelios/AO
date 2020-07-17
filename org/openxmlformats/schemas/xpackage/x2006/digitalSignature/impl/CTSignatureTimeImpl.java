package org.openxmlformats.schemas.xpackage.x2006.digitalSignature.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTSignatureTime;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STFormat;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STValue;

public class CTSignatureTimeImpl extends XmlComplexContentImpl implements CTSignatureTime {

   private static final QName FORMAT$0 = new QName("http://schemas.openxmlformats.org/package/2006/digital-signature", "Format");
   private static final QName VALUE$2 = new QName("http://schemas.openxmlformats.org/package/2006/digital-signature", "Value");


   public CTSignatureTimeImpl(SchemaType var1) {
      super(var1);
   }

   public String getFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(FORMAT$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STFormat xgetFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFormat var2 = null;
         var2 = (STFormat)this.get_store().find_element_user(FORMAT$0, 0);
         return var2;
      }
   }

   public void setFormat(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FORMAT$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(FORMAT$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFormat(STFormat var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFormat var3 = null;
         var3 = (STFormat)this.get_store().find_element_user(FORMAT$0, 0);
         if(var3 == null) {
            var3 = (STFormat)this.get_store().add_element_user(FORMAT$0);
         }

         var3.set(var1);
      }
   }

   public String getValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(VALUE$2, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STValue xgetValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STValue var2 = null;
         var2 = (STValue)this.get_store().find_element_user(VALUE$2, 0);
         return var2;
      }
   }

   public void setValue(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(VALUE$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(VALUE$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetValue(STValue var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STValue var3 = null;
         var3 = (STValue)this.get_store().find_element_user(VALUE$2, 0);
         if(var3 == null) {
            var3 = (STValue)this.get_store().add_element_user(VALUE$2);
         }

         var3.set(var1);
      }
   }

}
