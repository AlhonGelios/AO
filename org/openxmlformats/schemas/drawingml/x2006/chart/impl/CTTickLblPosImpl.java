package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.STTickLblPos;

public class CTTickLblPosImpl extends XmlComplexContentImpl implements CTTickLblPos {

   private static final QName VAL$0 = new QName("", "val");


   public CTTickLblPosImpl(SchemaType var1) {
      super(var1);
   }

   public STTickLblPos.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VAL$0);
         }

         return var2 == null?null:(STTickLblPos.Enum)var2.getEnumValue();
      }
   }

   public STTickLblPos xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTickLblPos var2 = null;
         var2 = (STTickLblPos)this.get_store().find_attribute_user(VAL$0);
         if(var2 == null) {
            var2 = (STTickLblPos)this.get_default_attribute_value(VAL$0);
         }

         return var2;
      }
   }

   public boolean isSetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VAL$0) != null;
      }
   }

   public void setVal(STTickLblPos.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetVal(STTickLblPos var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTickLblPos var3 = null;
         var3 = (STTickLblPos)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STTickLblPos)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

   public void unsetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VAL$0);
      }
   }

}
