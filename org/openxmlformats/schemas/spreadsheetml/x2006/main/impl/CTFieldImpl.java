package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField;

public class CTFieldImpl extends XmlComplexContentImpl implements CTField {

   private static final QName X$0 = new QName("", "x");


   public CTFieldImpl(SchemaType var1) {
      super(var1);
   }

   public int getX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(X$0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(X$0);
         return var2;
      }
   }

   public void setX(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(X$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(X$0);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetX(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(X$0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(X$0);
         }

         var3.set(var1);
      }
   }

}
