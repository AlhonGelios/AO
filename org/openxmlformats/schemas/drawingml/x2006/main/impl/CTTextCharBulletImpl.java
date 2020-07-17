package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet;

public class CTTextCharBulletImpl extends XmlComplexContentImpl implements CTTextCharBullet {

   private static final QName CHAR$0 = new QName("", "char");


   public CTTextCharBulletImpl(SchemaType var1) {
      super(var1);
   }

   public String getChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CHAR$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(CHAR$0);
         return var2;
      }
   }

   public void setChar(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CHAR$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CHAR$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetChar(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(CHAR$0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(CHAR$0);
         }

         var3.set(var1);
      }
   }

}
