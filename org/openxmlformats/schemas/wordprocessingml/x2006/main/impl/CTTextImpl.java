package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.JavaStringHolderEx;
import org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;

public class CTTextImpl extends JavaStringHolderEx implements CTText {

   private static final QName SPACE$0 = new QName("http://www.w3.org/XML/1998/namespace", "space");


   public CTTextImpl(SchemaType var1) {
      super(var1, true);
   }

   protected CTTextImpl(SchemaType var1, boolean var2) {
      super(var1, var2);
   }

   public SpaceAttribute.Space.Enum getSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SPACE$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SPACE$0);
         }

         return var2 == null?null:(SpaceAttribute.Space.Enum)var2.getEnumValue();
      }
   }

   public SpaceAttribute.Space xgetSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SpaceAttribute.Space var2 = null;
         var2 = (SpaceAttribute.Space)this.get_store().find_attribute_user(SPACE$0);
         if(var2 == null) {
            var2 = (SpaceAttribute.Space)this.get_default_attribute_value(SPACE$0);
         }

         return var2;
      }
   }

   public boolean isSetSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SPACE$0) != null;
      }
   }

   public void setSpace(SpaceAttribute.Space.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SPACE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SPACE$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetSpace(SpaceAttribute.Space var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SpaceAttribute.Space var3 = null;
         var3 = (SpaceAttribute.Space)this.get_store().find_attribute_user(SPACE$0);
         if(var3 == null) {
            var3 = (SpaceAttribute.Space)this.get_store().add_attribute_user(SPACE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SPACE$0);
      }
   }

}
