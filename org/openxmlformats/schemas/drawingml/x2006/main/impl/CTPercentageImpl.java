package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;

public class CTPercentageImpl extends XmlComplexContentImpl implements CTPercentage {

   private static final QName VAL$0 = new QName("", "val");


   public CTPercentageImpl(SchemaType var1) {
      super(var1);
   }

   public int getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetVal(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
