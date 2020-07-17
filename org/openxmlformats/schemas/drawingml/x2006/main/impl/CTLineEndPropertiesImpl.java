package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth;

public class CTLineEndPropertiesImpl extends XmlComplexContentImpl implements CTLineEndProperties {

   private static final QName TYPE$0 = new QName("", "type");
   private static final QName W$2 = new QName("", "w");
   private static final QName LEN$4 = new QName("", "len");


   public CTLineEndPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public STLineEndType.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$0);
         return var2 == null?null:(STLineEndType.Enum)var2.getEnumValue();
      }
   }

   public STLineEndType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineEndType var2 = null;
         var2 = (STLineEndType)this.get_store().find_attribute_user(TYPE$0);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$0) != null;
      }
   }

   public void setType(STLineEndType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STLineEndType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineEndType var3 = null;
         var3 = (STLineEndType)this.get_store().find_attribute_user(TYPE$0);
         if(var3 == null) {
            var3 = (STLineEndType)this.get_store().add_attribute_user(TYPE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$0);
      }
   }

   public STLineEndWidth.Enum getW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(W$2);
         return var2 == null?null:(STLineEndWidth.Enum)var2.getEnumValue();
      }
   }

   public STLineEndWidth xgetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineEndWidth var2 = null;
         var2 = (STLineEndWidth)this.get_store().find_attribute_user(W$2);
         return var2;
      }
   }

   public boolean isSetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(W$2) != null;
      }
   }

   public void setW(STLineEndWidth.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(W$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(W$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetW(STLineEndWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineEndWidth var3 = null;
         var3 = (STLineEndWidth)this.get_store().find_attribute_user(W$2);
         if(var3 == null) {
            var3 = (STLineEndWidth)this.get_store().add_attribute_user(W$2);
         }

         var3.set(var1);
      }
   }

   public void unsetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(W$2);
      }
   }

   public STLineEndLength.Enum getLen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LEN$4);
         return var2 == null?null:(STLineEndLength.Enum)var2.getEnumValue();
      }
   }

   public STLineEndLength xgetLen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineEndLength var2 = null;
         var2 = (STLineEndLength)this.get_store().find_attribute_user(LEN$4);
         return var2;
      }
   }

   public boolean isSetLen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LEN$4) != null;
      }
   }

   public void setLen(STLineEndLength.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LEN$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LEN$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetLen(STLineEndLength var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineEndLength var3 = null;
         var3 = (STLineEndLength)this.get_store().find_attribute_user(LEN$4);
         if(var3 == null) {
            var3 = (STLineEndLength)this.get_store().add_attribute_user(LEN$4);
         }

         var3.set(var1);
      }
   }

   public void unsetLen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LEN$4);
      }
   }

}
