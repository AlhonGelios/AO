package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;

public class CTJcImpl extends XmlComplexContentImpl implements CTJc {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");


   public CTJcImpl(SchemaType var1) {
      super(var1);
   }

   public STJc.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STJc.Enum)var2.getEnumValue();
      }
   }

   public STJc xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STJc var2 = null;
         var2 = (STJc)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STJc.Enum var1) {
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

   public void xsetVal(STJc var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STJc var3 = null;
         var3 = (STJc)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STJc)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
