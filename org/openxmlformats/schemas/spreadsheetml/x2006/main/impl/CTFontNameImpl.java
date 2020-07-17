package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTFontNameImpl extends XmlComplexContentImpl implements CTFontName {

   private static final QName VAL$0 = new QName("", "val");


   public CTFontNameImpl(SchemaType var1) {
      super(var1);
   }

   public String getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetVal(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

}
