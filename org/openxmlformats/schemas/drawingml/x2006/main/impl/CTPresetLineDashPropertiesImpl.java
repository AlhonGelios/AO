package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STPresetLineDashVal;

public class CTPresetLineDashPropertiesImpl extends XmlComplexContentImpl implements CTPresetLineDashProperties {

   private static final QName VAL$0 = new QName("", "val");


   public CTPresetLineDashPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public STPresetLineDashVal.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STPresetLineDashVal.Enum)var2.getEnumValue();
      }
   }

   public STPresetLineDashVal xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPresetLineDashVal var2 = null;
         var2 = (STPresetLineDashVal)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public boolean isSetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VAL$0) != null;
      }
   }

   public void setVal(STPresetLineDashVal.Enum var1) {
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

   public void xsetVal(STPresetLineDashVal var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPresetLineDashVal var3 = null;
         var3 = (STPresetLineDashVal)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STPresetLineDashVal)this.get_store().add_attribute_user(VAL$0);
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
