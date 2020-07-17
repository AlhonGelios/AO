package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextTabAlignType$Enum;

public class CTTextTabStopImpl extends XmlComplexContentImpl implements CTTextTabStop {

   private static final QName POS$0 = new QName("", "pos");
   private static final QName ALGN$2 = new QName("", "algn");


   public CTTextTabStopImpl(SchemaType var1) {
      super(var1);
   }

   public int getPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(POS$0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STCoordinate32 xgetPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var2 = null;
         var2 = (STCoordinate32)this.get_store().find_attribute_user(POS$0);
         return var2;
      }
   }

   public boolean isSetPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(POS$0) != null;
      }
   }

   public void setPos(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(POS$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(POS$0);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetPos(STCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var3 = null;
         var3 = (STCoordinate32)this.get_store().find_attribute_user(POS$0);
         if(var3 == null) {
            var3 = (STCoordinate32)this.get_store().add_attribute_user(POS$0);
         }

         var3.set(var1);
      }
   }

   public void unsetPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(POS$0);
      }
   }

   public STTextTabAlignType$Enum getAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALGN$2);
         return var2 == null?null:(STTextTabAlignType$Enum)var2.getEnumValue();
      }
   }

   public STTextTabAlignType xgetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextTabAlignType var2 = null;
         var2 = (STTextTabAlignType)this.get_store().find_attribute_user(ALGN$2);
         return var2;
      }
   }

   public boolean isSetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALGN$2) != null;
      }
   }

   public void setAlgn(STTextTabAlignType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALGN$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALGN$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAlgn(STTextTabAlignType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextTabAlignType var3 = null;
         var3 = (STTextTabAlignType)this.get_store().find_attribute_user(ALGN$2);
         if(var3 == null) {
            var3 = (STTextTabAlignType)this.get_store().add_attribute_user(ALGN$2);
         }

         var3.set(var1);
      }
   }

   public void unsetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALGN$2);
      }
   }

}
