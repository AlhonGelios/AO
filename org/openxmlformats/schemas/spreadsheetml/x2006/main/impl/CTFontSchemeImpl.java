package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontScheme;

public class CTFontSchemeImpl extends XmlComplexContentImpl implements CTFontScheme {

   private static final QName VAL$0 = new QName("", "val");


   public CTFontSchemeImpl(SchemaType var1) {
      super(var1);
   }

   public STFontScheme.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STFontScheme.Enum)var2.getEnumValue();
      }
   }

   public STFontScheme xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFontScheme var2 = null;
         var2 = (STFontScheme)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STFontScheme.Enum var1) {
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

   public void xsetVal(STFontScheme var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFontScheme var3 = null;
         var3 = (STFontScheme)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STFontScheme)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
