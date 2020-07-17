package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;

public class CTNumLvlImpl extends XmlComplexContentImpl implements CTNumLvl {

   private static final QName STARTOVERRIDE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "startOverride");
   private static final QName LVL$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvl");
   private static final QName ILVL$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ilvl");


   public CTNumLvlImpl(SchemaType var1) {
      super(var1);
   }

   public CTDecimalNumber getStartOverride() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(STARTOVERRIDE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStartOverride() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STARTOVERRIDE$0) != 0;
      }
   }

   public void setStartOverride(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(STARTOVERRIDE$0, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(STARTOVERRIDE$0);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewStartOverride() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(STARTOVERRIDE$0);
         return var2;
      }
   }

   public void unsetStartOverride() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STARTOVERRIDE$0, 0);
      }
   }

   public CTLvl getLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLvl var2 = null;
         var2 = (CTLvl)this.get_store().find_element_user(LVL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL$2) != 0;
      }
   }

   public void setLvl(CTLvl var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLvl var3 = null;
         var3 = (CTLvl)this.get_store().find_element_user(LVL$2, 0);
         if(var3 == null) {
            var3 = (CTLvl)this.get_store().add_element_user(LVL$2);
         }

         var3.set(var1);
      }
   }

   public CTLvl addNewLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLvl var2 = null;
         var2 = (CTLvl)this.get_store().add_element_user(LVL$2);
         return var2;
      }
   }

   public void unsetLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL$2, 0);
      }
   }

   public BigInteger getIlvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ILVL$4);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetIlvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(ILVL$4);
         return var2;
      }
   }

   public void setIlvl(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ILVL$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ILVL$4);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetIlvl(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(ILVL$4);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(ILVL$4);
         }

         var3.set(var1);
      }
   }

}
