package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween;
import org.openxmlformats.schemas.drawingml.x2006.chart.STCrossBetween;

public class CTCrossBetweenImpl extends XmlComplexContentImpl implements CTCrossBetween {

   private static final QName VAL$0 = new QName("", "val");


   public CTCrossBetweenImpl(SchemaType var1) {
      super(var1);
   }

   public STCrossBetween.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STCrossBetween.Enum)var2.getEnumValue();
      }
   }

   public STCrossBetween xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCrossBetween var2 = null;
         var2 = (STCrossBetween)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STCrossBetween.Enum var1) {
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

   public void xsetVal(STCrossBetween var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCrossBetween var3 = null;
         var3 = (STCrossBetween)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STCrossBetween)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
