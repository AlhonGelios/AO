package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize;
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate;
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType;
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType$Enum;

public class CTSlideSizeImpl extends XmlComplexContentImpl implements CTSlideSize {

   private static final QName CX$0 = new QName("", "cx");
   private static final QName CY$2 = new QName("", "cy");
   private static final QName TYPE$4 = new QName("", "type");


   public CTSlideSizeImpl(SchemaType var1) {
      super(var1);
   }

   public int getCx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CX$0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STSlideSizeCoordinate xgetCx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSlideSizeCoordinate var2 = null;
         var2 = (STSlideSizeCoordinate)this.get_store().find_attribute_user(CX$0);
         return var2;
      }
   }

   public void setCx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CX$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CX$0);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetCx(STSlideSizeCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSlideSizeCoordinate var3 = null;
         var3 = (STSlideSizeCoordinate)this.get_store().find_attribute_user(CX$0);
         if(var3 == null) {
            var3 = (STSlideSizeCoordinate)this.get_store().add_attribute_user(CX$0);
         }

         var3.set(var1);
      }
   }

   public int getCy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CY$2);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STSlideSizeCoordinate xgetCy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSlideSizeCoordinate var2 = null;
         var2 = (STSlideSizeCoordinate)this.get_store().find_attribute_user(CY$2);
         return var2;
      }
   }

   public void setCy(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CY$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CY$2);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetCy(STSlideSizeCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSlideSizeCoordinate var3 = null;
         var3 = (STSlideSizeCoordinate)this.get_store().find_attribute_user(CY$2);
         if(var3 == null) {
            var3 = (STSlideSizeCoordinate)this.get_store().add_attribute_user(CY$2);
         }

         var3.set(var1);
      }
   }

   public STSlideSizeType$Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TYPE$4);
         }

         return var2 == null?null:(STSlideSizeType$Enum)var2.getEnumValue();
      }
   }

   public STSlideSizeType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSlideSizeType var2 = null;
         var2 = (STSlideSizeType)this.get_store().find_attribute_user(TYPE$4);
         if(var2 == null) {
            var2 = (STSlideSizeType)this.get_default_attribute_value(TYPE$4);
         }

         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$4) != null;
      }
   }

   public void setType(STSlideSizeType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STSlideSizeType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSlideSizeType var3 = null;
         var3 = (STSlideSizeType)this.get_store().find_attribute_user(TYPE$4);
         if(var3 == null) {
            var3 = (STSlideSizeType)this.get_store().add_attribute_user(TYPE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$4);
      }
   }

}
