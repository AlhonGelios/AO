package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;

public class CTLsdExceptionImpl extends XmlComplexContentImpl implements CTLsdException {

   private static final QName NAME$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
   private static final QName LOCKED$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "locked");
   private static final QName UIPRIORITY$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "uiPriority");
   private static final QName SEMIHIDDEN$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "semiHidden");
   private static final QName UNHIDEWHENUSED$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "unhideWhenUsed");
   private static final QName QFORMAT$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "qFormat");


   public CTLsdExceptionImpl(SchemaType var1) {
      super(var1);
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(NAME$0);
         return var2;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(NAME$0);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(NAME$0);
         }

         var3.set(var1);
      }
   }

   public STOnOff.Enum getLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LOCKED$2);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(LOCKED$2);
         return var2;
      }
   }

   public boolean isSetLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LOCKED$2) != null;
      }
   }

   public void setLocked(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LOCKED$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LOCKED$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetLocked(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(LOCKED$2);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(LOCKED$2);
         }

         var3.set(var1);
      }
   }

   public void unsetLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LOCKED$2);
      }
   }

   public BigInteger getUiPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UIPRIORITY$4);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetUiPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(UIPRIORITY$4);
         return var2;
      }
   }

   public boolean isSetUiPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UIPRIORITY$4) != null;
      }
   }

   public void setUiPriority(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UIPRIORITY$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UIPRIORITY$4);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetUiPriority(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(UIPRIORITY$4);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(UIPRIORITY$4);
         }

         var3.set(var1);
      }
   }

   public void unsetUiPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UIPRIORITY$4);
      }
   }

   public STOnOff.Enum getSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SEMIHIDDEN$6);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(SEMIHIDDEN$6);
         return var2;
      }
   }

   public boolean isSetSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SEMIHIDDEN$6) != null;
      }
   }

   public void setSemiHidden(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SEMIHIDDEN$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SEMIHIDDEN$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetSemiHidden(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(SEMIHIDDEN$6);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(SEMIHIDDEN$6);
         }

         var3.set(var1);
      }
   }

   public void unsetSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SEMIHIDDEN$6);
      }
   }

   public STOnOff.Enum getUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UNHIDEWHENUSED$8);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(UNHIDEWHENUSED$8);
         return var2;
      }
   }

   public boolean isSetUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UNHIDEWHENUSED$8) != null;
      }
   }

   public void setUnhideWhenUsed(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UNHIDEWHENUSED$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UNHIDEWHENUSED$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetUnhideWhenUsed(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(UNHIDEWHENUSED$8);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(UNHIDEWHENUSED$8);
         }

         var3.set(var1);
      }
   }

   public void unsetUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UNHIDEWHENUSED$8);
      }
   }

   public STOnOff.Enum getQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(QFORMAT$10);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(QFORMAT$10);
         return var2;
      }
   }

   public boolean isSetQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(QFORMAT$10) != null;
      }
   }

   public void setQFormat(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(QFORMAT$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(QFORMAT$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetQFormat(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(QFORMAT$10);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(QFORMAT$10);
         }

         var3.set(var1);
      }
   }

   public void unsetQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(QFORMAT$10);
      }
   }

}
