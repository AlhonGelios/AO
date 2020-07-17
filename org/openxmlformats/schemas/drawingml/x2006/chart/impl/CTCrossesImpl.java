package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses;
import org.openxmlformats.schemas.drawingml.x2006.chart.STCrosses;

public class CTCrossesImpl extends XmlComplexContentImpl implements CTCrosses {

   private static final QName VAL$0 = new QName("", "val");


   public CTCrossesImpl(SchemaType var1) {
      super(var1);
   }

   public STCrosses.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STCrosses.Enum)var2.getEnumValue();
      }
   }

   public STCrosses xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCrosses var2 = null;
         var2 = (STCrosses)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STCrosses.Enum var1) {
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

   public void xsetVal(STCrosses var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCrosses var3 = null;
         var3 = (STCrosses)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STCrosses)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
