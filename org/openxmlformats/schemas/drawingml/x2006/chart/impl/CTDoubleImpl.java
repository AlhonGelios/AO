package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble;

public class CTDoubleImpl extends XmlComplexContentImpl implements CTDouble {

   private static final QName VAL$0 = new QName("", "val");


   public CTDoubleImpl(SchemaType var1) {
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

   public XmlDouble xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(VAL$0);
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

   public void xsetVal(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
