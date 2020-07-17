package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerStyle;
import org.openxmlformats.schemas.drawingml.x2006.chart.STMarkerStyle;

public class CTMarkerStyleImpl extends XmlComplexContentImpl implements CTMarkerStyle {

   private static final QName VAL$0 = new QName("", "val");


   public CTMarkerStyleImpl(SchemaType var1) {
      super(var1);
   }

   public STMarkerStyle.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STMarkerStyle.Enum)var2.getEnumValue();
      }
   }

   public STMarkerStyle xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STMarkerStyle var2 = null;
         var2 = (STMarkerStyle)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STMarkerStyle.Enum var1) {
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

   public void xsetVal(STMarkerStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STMarkerStyle var3 = null;
         var3 = (STMarkerStyle)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STMarkerStyle)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
