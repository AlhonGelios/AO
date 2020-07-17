package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;

public class CTTblWidthImpl extends XmlComplexContentImpl implements CTTblWidth {

   private static final QName W$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "w");
   private static final QName TYPE$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");


   public CTTblWidthImpl(SchemaType var1) {
      super(var1);
   }

   public BigInteger getW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(W$0);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(W$0);
         return var2;
      }
   }

   public boolean isSetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(W$0) != null;
      }
   }

   public void setW(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(W$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(W$0);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetW(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(W$0);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(W$0);
         }

         var3.set(var1);
      }
   }

   public void unsetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(W$0);
      }
   }

   public STTblWidth.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$2);
         return var2 == null?null:(STTblWidth.Enum)var2.getEnumValue();
      }
   }

   public STTblWidth xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTblWidth var2 = null;
         var2 = (STTblWidth)this.get_store().find_attribute_user(TYPE$2);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$2) != null;
      }
   }

   public void setType(STTblWidth.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTblWidth var3 = null;
         var3 = (STTblWidth)this.get_store().find_attribute_user(TYPE$2);
         if(var3 == null) {
            var3 = (STTblWidth)this.get_store().add_attribute_user(TYPE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$2);
      }
   }

}
