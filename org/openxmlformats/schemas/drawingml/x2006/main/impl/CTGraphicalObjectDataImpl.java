package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData;

public class CTGraphicalObjectDataImpl extends XmlComplexContentImpl implements CTGraphicalObjectData {

   private static final QName URI$0 = new QName("", "uri");


   public CTGraphicalObjectDataImpl(SchemaType var1) {
      super(var1);
   }

   public String getUri() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(URI$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlToken xgetUri() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlToken var2 = null;
         var2 = (XmlToken)this.get_store().find_attribute_user(URI$0);
         return var2;
      }
   }

   public boolean isSetUri() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(URI$0) != null;
      }
   }

   public void setUri(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(URI$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(URI$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetUri(XmlToken var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlToken var3 = null;
         var3 = (XmlToken)this.get_store().find_attribute_user(URI$0);
         if(var3 == null) {
            var3 = (XmlToken)this.get_store().add_attribute_user(URI$0);
         }

         var3.set(var1);
      }
   }

   public void unsetUri() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(URI$0);
      }
   }

}
