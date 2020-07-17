package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage;

public class CTAlphaModulateFixedEffectImpl extends XmlComplexContentImpl implements CTAlphaModulateFixedEffect {

   private static final QName AMT$0 = new QName("", "amt");


   public CTAlphaModulateFixedEffectImpl(SchemaType var1) {
      super(var1);
   }

   public int getAmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AMT$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(AMT$0);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPositivePercentage xgetAmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositivePercentage var2 = null;
         var2 = (STPositivePercentage)this.get_store().find_attribute_user(AMT$0);
         if(var2 == null) {
            var2 = (STPositivePercentage)this.get_default_attribute_value(AMT$0);
         }

         return var2;
      }
   }

   public boolean isSetAmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AMT$0) != null;
      }
   }

   public void setAmt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AMT$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AMT$0);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetAmt(STPositivePercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositivePercentage var3 = null;
         var3 = (STPositivePercentage)this.get_store().find_attribute_user(AMT$0);
         if(var3 == null) {
            var3 = (STPositivePercentage)this.get_store().add_attribute_user(AMT$0);
         }

         var3.set(var1);
      }
   }

   public void unsetAmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AMT$0);
      }
   }

}
