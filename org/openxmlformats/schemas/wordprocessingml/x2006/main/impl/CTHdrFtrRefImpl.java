package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHdrFtr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRelImpl;

public class CTHdrFtrRefImpl extends CTRelImpl implements CTHdrFtrRef {

   private static final QName TYPE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");


   public CTHdrFtrRefImpl(SchemaType var1) {
      super(var1);
   }

   public STHdrFtr.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$0);
         return var2 == null?null:(STHdrFtr.Enum)var2.getEnumValue();
      }
   }

   public STHdrFtr xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHdrFtr var2 = null;
         var2 = (STHdrFtr)this.get_store().find_attribute_user(TYPE$0);
         return var2;
      }
   }

   public void setType(STHdrFtr.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STHdrFtr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHdrFtr var3 = null;
         var3 = (STHdrFtr)this.get_store().find_attribute_user(TYPE$0);
         if(var3 == null) {
            var3 = (STHdrFtr)this.get_store().add_attribute_user(TYPE$0);
         }

         var3.set(var1);
      }
   }

}
