package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal;
import org.openxmlformats.schemas.drawingml.x2006.chart.STXstring;

public class CTStrValImpl extends XmlComplexContentImpl implements CTStrVal {

   private static final QName V$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "v");
   private static final QName IDX$2 = new QName("", "idx");


   public CTStrValImpl(SchemaType var1) {
      super(var1);
   }

   public String getV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(V$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(V$0, 0);
         return var2;
      }
   }

   public void setV(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(V$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(V$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetV(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(V$0, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(V$0);
         }

         var3.set(var1);
      }
   }

   public long getIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(IDX$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetIdx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(IDX$2);
         return var2;
      }
   }

   public void setIdx(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(IDX$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(IDX$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetIdx(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(IDX$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(IDX$2);
         }

         var3.set(var1);
      }
   }

}
