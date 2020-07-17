package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTNumImpl.1LvlOverrideList;

public class CTNumImpl extends XmlComplexContentImpl implements CTNum {

   private static final QName ABSTRACTNUMID$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "abstractNumId");
   private static final QName LVLOVERRIDE$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvlOverride");
   private static final QName NUMID$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numId");


   public CTNumImpl(SchemaType var1) {
      super(var1);
   }

   public CTDecimalNumber getAbstractNumId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(ABSTRACTNUMID$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setAbstractNumId(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(ABSTRACTNUMID$0, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(ABSTRACTNUMID$0);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewAbstractNumId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(ABSTRACTNUMID$0);
         return var2;
      }
   }

   public List getLvlOverrideList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LvlOverrideList(this);
      }
   }

   public CTNumLvl[] getLvlOverrideArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LVLOVERRIDE$2, var2);
         CTNumLvl[] var3 = new CTNumLvl[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTNumLvl getLvlOverrideArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumLvl var3 = null;
         var3 = (CTNumLvl)this.get_store().find_element_user(LVLOVERRIDE$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLvlOverrideArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVLOVERRIDE$2);
      }
   }

   public void setLvlOverrideArray(CTNumLvl[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LVLOVERRIDE$2);
      }
   }

   public void setLvlOverrideArray(int var1, CTNumLvl var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumLvl var4 = null;
         var4 = (CTNumLvl)this.get_store().find_element_user(LVLOVERRIDE$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTNumLvl insertNewLvlOverride(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumLvl var3 = null;
         var3 = (CTNumLvl)this.get_store().insert_element_user(LVLOVERRIDE$2, var1);
         return var3;
      }
   }

   public CTNumLvl addNewLvlOverride() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumLvl var2 = null;
         var2 = (CTNumLvl)this.get_store().add_element_user(LVLOVERRIDE$2);
         return var2;
      }
   }

   public void removeLvlOverride(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVLOVERRIDE$2, var1);
      }
   }

   public BigInteger getNumId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NUMID$4);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetNumId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(NUMID$4);
         return var2;
      }
   }

   public void setNumId(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NUMID$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NUMID$4);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetNumId(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(NUMID$4);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(NUMID$4);
         }

         var3.set(var1);
      }
   }

}
