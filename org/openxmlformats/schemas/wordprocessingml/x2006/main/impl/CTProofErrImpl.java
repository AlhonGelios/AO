package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STProofErr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STProofErr$Enum;

public class CTProofErrImpl extends XmlComplexContentImpl implements CTProofErr {

   private static final QName TYPE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");


   public CTProofErrImpl(SchemaType var1) {
      super(var1);
   }

   public STProofErr$Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$0);
         return var2 == null?null:(STProofErr$Enum)var2.getEnumValue();
      }
   }

   public STProofErr xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STProofErr var2 = null;
         var2 = (STProofErr)this.get_store().find_attribute_user(TYPE$0);
         return var2;
      }
   }

   public void setType(STProofErr$Enum var1) {
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

   public void xsetType(STProofErr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STProofErr var3 = null;
         var3 = (STProofErr)this.get_store().find_attribute_user(TYPE$0);
         if(var3 == null) {
            var3 = (STProofErr)this.get_store().add_attribute_user(TYPE$0);
         }

         var3.set(var1);
      }
   }

}
