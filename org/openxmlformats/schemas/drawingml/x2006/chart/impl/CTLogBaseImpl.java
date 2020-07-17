package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase;
import org.openxmlformats.schemas.drawingml.x2006.chart.STLogBase;

public class CTLogBaseImpl extends XmlComplexContentImpl implements CTLogBase {

   private static final QName VAL$0 = new QName("", "val");


   public CTLogBaseImpl(SchemaType var1) {
      super(var1);
   }

   public double getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public STLogBase xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLogBase var2 = null;
         var2 = (STLogBase)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetVal(STLogBase var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLogBase var3 = null;
         var3 = (STLogBase)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STLogBase)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
