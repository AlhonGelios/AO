package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.STAxPos;

public class CTAxPosImpl extends XmlComplexContentImpl implements CTAxPos {

   private static final QName VAL$0 = new QName("", "val");


   public CTAxPosImpl(SchemaType var1) {
      super(var1);
   }

   public STAxPos.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STAxPos.Enum)var2.getEnumValue();
      }
   }

   public STAxPos xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAxPos var2 = null;
         var2 = (STAxPos)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STAxPos.Enum var1) {
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

   public void xsetVal(STAxPos var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAxPos var3 = null;
         var3 = (STAxPos)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STAxPos)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
