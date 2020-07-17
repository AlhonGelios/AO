package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;

public class CTUnsignedIntImpl extends XmlComplexContentImpl implements CTUnsignedInt {

   private static final QName VAL$0 = new QName("", "val");


   public CTUnsignedIntImpl(SchemaType var1) {
      super(var1);
   }

   public long getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetVal(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
