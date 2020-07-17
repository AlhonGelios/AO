package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTPictureBaseImpl;

public class CTObjectImpl extends CTPictureBaseImpl implements CTObject {

   private static final QName CONTROL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "control");
   private static final QName DXAORIG$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dxaOrig");
   private static final QName DYAORIG$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dyaOrig");


   public CTObjectImpl(SchemaType var1) {
      super(var1);
   }

   public CTControl getControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControl var2 = null;
         var2 = (CTControl)this.get_store().find_element_user(CONTROL$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONTROL$0) != 0;
      }
   }

   public void setControl(CTControl var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControl var3 = null;
         var3 = (CTControl)this.get_store().find_element_user(CONTROL$0, 0);
         if(var3 == null) {
            var3 = (CTControl)this.get_store().add_element_user(CONTROL$0);
         }

         var3.set(var1);
      }
   }

   public CTControl addNewControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControl var2 = null;
         var2 = (CTControl)this.get_store().add_element_user(CONTROL$0);
         return var2;
      }
   }

   public void unsetControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONTROL$0, 0);
      }
   }

   public BigInteger getDxaOrig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DXAORIG$2);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STTwipsMeasure xgetDxaOrig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var2 = null;
         var2 = (STTwipsMeasure)this.get_store().find_attribute_user(DXAORIG$2);
         return var2;
      }
   }

   public boolean isSetDxaOrig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DXAORIG$2) != null;
      }
   }

   public void setDxaOrig(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DXAORIG$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DXAORIG$2);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetDxaOrig(STTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var3 = null;
         var3 = (STTwipsMeasure)this.get_store().find_attribute_user(DXAORIG$2);
         if(var3 == null) {
            var3 = (STTwipsMeasure)this.get_store().add_attribute_user(DXAORIG$2);
         }

         var3.set(var1);
      }
   }

   public void unsetDxaOrig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DXAORIG$2);
      }
   }

   public BigInteger getDyaOrig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DYAORIG$4);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STTwipsMeasure xgetDyaOrig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var2 = null;
         var2 = (STTwipsMeasure)this.get_store().find_attribute_user(DYAORIG$4);
         return var2;
      }
   }

   public boolean isSetDyaOrig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DYAORIG$4) != null;
      }
   }

   public void setDyaOrig(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DYAORIG$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DYAORIG$4);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetDyaOrig(STTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var3 = null;
         var3 = (STTwipsMeasure)this.get_store().find_attribute_user(DYAORIG$4);
         if(var3 == null) {
            var3 = (STTwipsMeasure)this.get_store().add_attribute_user(DYAORIG$4);
         }

         var3.set(var1);
      }
   }

   public void unsetDyaOrig() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DYAORIG$4);
      }
   }

}
