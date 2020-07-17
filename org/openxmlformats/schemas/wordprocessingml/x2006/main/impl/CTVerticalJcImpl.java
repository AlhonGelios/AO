package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalJc;

public class CTVerticalJcImpl extends XmlComplexContentImpl implements CTVerticalJc {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");


   public CTVerticalJcImpl(SchemaType var1) {
      super(var1);
   }

   public STVerticalJc.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STVerticalJc.Enum)var2.getEnumValue();
      }
   }

   public STVerticalJc xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVerticalJc var2 = null;
         var2 = (STVerticalJc)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STVerticalJc.Enum var1) {
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

   public void xsetVal(STVerticalJc var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVerticalJc var3 = null;
         var3 = (STVerticalJc)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STVerticalJc)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
