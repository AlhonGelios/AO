package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure;

public class CTSpacingImpl extends XmlComplexContentImpl implements CTSpacing {

   private static final QName BEFORE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "before");
   private static final QName BEFORELINES$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "beforeLines");
   private static final QName BEFOREAUTOSPACING$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "beforeAutospacing");
   private static final QName AFTER$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "after");
   private static final QName AFTERLINES$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "afterLines");
   private static final QName AFTERAUTOSPACING$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "afterAutospacing");
   private static final QName LINE$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "line");
   private static final QName LINERULE$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lineRule");


   public CTSpacingImpl(SchemaType var1) {
      super(var1);
   }

   public BigInteger getBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BEFORE$0);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STTwipsMeasure xgetBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var2 = null;
         var2 = (STTwipsMeasure)this.get_store().find_attribute_user(BEFORE$0);
         return var2;
      }
   }

   public boolean isSetBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BEFORE$0) != null;
      }
   }

   public void setBefore(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BEFORE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BEFORE$0);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetBefore(STTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var3 = null;
         var3 = (STTwipsMeasure)this.get_store().find_attribute_user(BEFORE$0);
         if(var3 == null) {
            var3 = (STTwipsMeasure)this.get_store().add_attribute_user(BEFORE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BEFORE$0);
      }
   }

   public BigInteger getBeforeLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BEFORELINES$2);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetBeforeLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(BEFORELINES$2);
         return var2;
      }
   }

   public boolean isSetBeforeLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BEFORELINES$2) != null;
      }
   }

   public void setBeforeLines(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BEFORELINES$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BEFORELINES$2);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetBeforeLines(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(BEFORELINES$2);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(BEFORELINES$2);
         }

         var3.set(var1);
      }
   }

   public void unsetBeforeLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BEFORELINES$2);
      }
   }

   public STOnOff.Enum getBeforeAutospacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BEFOREAUTOSPACING$4);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetBeforeAutospacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(BEFOREAUTOSPACING$4);
         return var2;
      }
   }

   public boolean isSetBeforeAutospacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BEFOREAUTOSPACING$4) != null;
      }
   }

   public void setBeforeAutospacing(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BEFOREAUTOSPACING$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BEFOREAUTOSPACING$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBeforeAutospacing(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(BEFOREAUTOSPACING$4);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(BEFOREAUTOSPACING$4);
         }

         var3.set(var1);
      }
   }

   public void unsetBeforeAutospacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BEFOREAUTOSPACING$4);
      }
   }

   public BigInteger getAfter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AFTER$6);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STTwipsMeasure xgetAfter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var2 = null;
         var2 = (STTwipsMeasure)this.get_store().find_attribute_user(AFTER$6);
         return var2;
      }
   }

   public boolean isSetAfter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AFTER$6) != null;
      }
   }

   public void setAfter(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AFTER$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AFTER$6);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetAfter(STTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var3 = null;
         var3 = (STTwipsMeasure)this.get_store().find_attribute_user(AFTER$6);
         if(var3 == null) {
            var3 = (STTwipsMeasure)this.get_store().add_attribute_user(AFTER$6);
         }

         var3.set(var1);
      }
   }

   public void unsetAfter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AFTER$6);
      }
   }

   public BigInteger getAfterLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AFTERLINES$8);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetAfterLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(AFTERLINES$8);
         return var2;
      }
   }

   public boolean isSetAfterLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AFTERLINES$8) != null;
      }
   }

   public void setAfterLines(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AFTERLINES$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AFTERLINES$8);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetAfterLines(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(AFTERLINES$8);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(AFTERLINES$8);
         }

         var3.set(var1);
      }
   }

   public void unsetAfterLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AFTERLINES$8);
      }
   }

   public STOnOff.Enum getAfterAutospacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AFTERAUTOSPACING$10);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetAfterAutospacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(AFTERAUTOSPACING$10);
         return var2;
      }
   }

   public boolean isSetAfterAutospacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AFTERAUTOSPACING$10) != null;
      }
   }

   public void setAfterAutospacing(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AFTERAUTOSPACING$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AFTERAUTOSPACING$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAfterAutospacing(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(AFTERAUTOSPACING$10);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(AFTERAUTOSPACING$10);
         }

         var3.set(var1);
      }
   }

   public void unsetAfterAutospacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AFTERAUTOSPACING$10);
      }
   }

   public BigInteger getLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LINE$12);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STSignedTwipsMeasure xgetLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignedTwipsMeasure var2 = null;
         var2 = (STSignedTwipsMeasure)this.get_store().find_attribute_user(LINE$12);
         return var2;
      }
   }

   public boolean isSetLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LINE$12) != null;
      }
   }

   public void setLine(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LINE$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LINE$12);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetLine(STSignedTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignedTwipsMeasure var3 = null;
         var3 = (STSignedTwipsMeasure)this.get_store().find_attribute_user(LINE$12);
         if(var3 == null) {
            var3 = (STSignedTwipsMeasure)this.get_store().add_attribute_user(LINE$12);
         }

         var3.set(var1);
      }
   }

   public void unsetLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LINE$12);
      }
   }

   public STLineSpacingRule.Enum getLineRule() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LINERULE$14);
         return var2 == null?null:(STLineSpacingRule.Enum)var2.getEnumValue();
      }
   }

   public STLineSpacingRule xgetLineRule() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineSpacingRule var2 = null;
         var2 = (STLineSpacingRule)this.get_store().find_attribute_user(LINERULE$14);
         return var2;
      }
   }

   public boolean isSetLineRule() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LINERULE$14) != null;
      }
   }

   public void setLineRule(STLineSpacingRule.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LINERULE$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LINERULE$14);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetLineRule(STLineSpacingRule var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLineSpacingRule var3 = null;
         var3 = (STLineSpacingRule)this.get_store().find_attribute_user(LINERULE$14);
         if(var3 == null) {
            var3 = (STLineSpacingRule)this.get_store().add_attribute_user(LINERULE$14);
         }

         var3.set(var1);
      }
   }

   public void unsetLineRule() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LINERULE$14);
      }
   }

}
