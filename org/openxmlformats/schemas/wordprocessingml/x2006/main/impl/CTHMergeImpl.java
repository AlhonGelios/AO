package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STMerge;

public class CTHMergeImpl extends XmlComplexContentImpl implements CTHMerge {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");


   public CTHMergeImpl(SchemaType var1) {
      super(var1);
   }

   public STMerge.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STMerge.Enum)var2.getEnumValue();
      }
   }

   public STMerge xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STMerge var2 = null;
         var2 = (STMerge)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public boolean isSetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VAL$0) != null;
      }
   }

   public void setVal(STMerge.Enum var1) {
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

   public void xsetVal(STMerge var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STMerge var3 = null;
         var3 = (STMerge)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STMerge)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

   public void unsetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VAL$0);
      }
   }

}
