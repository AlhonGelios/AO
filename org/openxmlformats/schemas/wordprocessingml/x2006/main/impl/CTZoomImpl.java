package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STZoom;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STZoom$Enum;

public class CTZoomImpl extends XmlComplexContentImpl implements CTZoom {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
   private static final QName PERCENT$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "percent");


   public CTZoomImpl(SchemaType var1) {
      super(var1);
   }

   public STZoom$Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STZoom$Enum)var2.getEnumValue();
      }
   }

   public STZoom xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STZoom var2 = null;
         var2 = (STZoom)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public boolean isSetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VAL$0) != null;
      }
   }

   public void setVal(STZoom$Enum var1) {
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

   public void xsetVal(STZoom var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STZoom var3 = null;
         var3 = (STZoom)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STZoom)this.get_store().add_attribute_user(VAL$0);
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

   public BigInteger getPercent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PERCENT$2);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetPercent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(PERCENT$2);
         return var2;
      }
   }

   public void setPercent(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PERCENT$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PERCENT$2);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetPercent(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(PERCENT$2);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(PERCENT$2);
         }

         var3.set(var1);
      }
   }

}
