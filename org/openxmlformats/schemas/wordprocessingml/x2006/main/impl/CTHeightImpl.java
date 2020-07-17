package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHeightRule$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure;

public class CTHeightImpl extends XmlComplexContentImpl implements CTHeight {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
   private static final QName HRULE$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hRule");


   public CTHeightImpl(SchemaType var1) {
      super(var1);
   }

   public BigInteger getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STTwipsMeasure xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var2 = null;
         var2 = (STTwipsMeasure)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public boolean isSetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VAL$0) != null;
      }
   }

   public void setVal(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetVal(STTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var3 = null;
         var3 = (STTwipsMeasure)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STTwipsMeasure)this.get_store().add_attribute_user(VAL$0);
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

   public STHeightRule$Enum getHRule() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HRULE$2);
         return var2 == null?null:(STHeightRule$Enum)var2.getEnumValue();
      }
   }

   public STHeightRule xgetHRule() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHeightRule var2 = null;
         var2 = (STHeightRule)this.get_store().find_attribute_user(HRULE$2);
         return var2;
      }
   }

   public boolean isSetHRule() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HRULE$2) != null;
      }
   }

   public void setHRule(STHeightRule$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HRULE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HRULE$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHRule(STHeightRule var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHeightRule var3 = null;
         var3 = (STHeightRule)this.get_store().find_attribute_user(HRULE$2);
         if(var3 == null) {
            var3 = (STHeightRule)this.get_store().add_attribute_user(HRULE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetHRule() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HRULE$2);
      }
   }

}
