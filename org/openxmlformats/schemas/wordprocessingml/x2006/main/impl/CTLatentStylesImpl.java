package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTLatentStylesImpl.1LsdExceptionList;

public class CTLatentStylesImpl extends XmlComplexContentImpl implements CTLatentStyles {

   private static final QName LSDEXCEPTION$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lsdException");
   private static final QName DEFLOCKEDSTATE$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defLockedState");
   private static final QName DEFUIPRIORITY$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defUIPriority");
   private static final QName DEFSEMIHIDDEN$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defSemiHidden");
   private static final QName DEFUNHIDEWHENUSED$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defUnhideWhenUsed");
   private static final QName DEFQFORMAT$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defQFormat");
   private static final QName COUNT$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "count");


   public CTLatentStylesImpl(SchemaType var1) {
      super(var1);
   }

   public List getLsdExceptionList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LsdExceptionList(this);
      }
   }

   public CTLsdException[] getLsdExceptionArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LSDEXCEPTION$0, var2);
         CTLsdException[] var3 = new CTLsdException[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLsdException getLsdExceptionArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLsdException var3 = null;
         var3 = (CTLsdException)this.get_store().find_element_user(LSDEXCEPTION$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLsdExceptionArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LSDEXCEPTION$0);
      }
   }

   public void setLsdExceptionArray(CTLsdException[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LSDEXCEPTION$0);
      }
   }

   public void setLsdExceptionArray(int var1, CTLsdException var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLsdException var4 = null;
         var4 = (CTLsdException)this.get_store().find_element_user(LSDEXCEPTION$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLsdException insertNewLsdException(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLsdException var3 = null;
         var3 = (CTLsdException)this.get_store().insert_element_user(LSDEXCEPTION$0, var1);
         return var3;
      }
   }

   public CTLsdException addNewLsdException() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLsdException var2 = null;
         var2 = (CTLsdException)this.get_store().add_element_user(LSDEXCEPTION$0);
         return var2;
      }
   }

   public void removeLsdException(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LSDEXCEPTION$0, var1);
      }
   }

   public STOnOff.Enum getDefLockedState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFLOCKEDSTATE$2);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetDefLockedState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(DEFLOCKEDSTATE$2);
         return var2;
      }
   }

   public boolean isSetDefLockedState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFLOCKEDSTATE$2) != null;
      }
   }

   public void setDefLockedState(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEFLOCKEDSTATE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEFLOCKEDSTATE$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetDefLockedState(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(DEFLOCKEDSTATE$2);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(DEFLOCKEDSTATE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetDefLockedState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFLOCKEDSTATE$2);
      }
   }

   public BigInteger getDefUIPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFUIPRIORITY$4);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetDefUIPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(DEFUIPRIORITY$4);
         return var2;
      }
   }

   public boolean isSetDefUIPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFUIPRIORITY$4) != null;
      }
   }

   public void setDefUIPriority(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEFUIPRIORITY$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEFUIPRIORITY$4);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetDefUIPriority(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(DEFUIPRIORITY$4);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(DEFUIPRIORITY$4);
         }

         var3.set(var1);
      }
   }

   public void unsetDefUIPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFUIPRIORITY$4);
      }
   }

   public STOnOff.Enum getDefSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFSEMIHIDDEN$6);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetDefSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(DEFSEMIHIDDEN$6);
         return var2;
      }
   }

   public boolean isSetDefSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFSEMIHIDDEN$6) != null;
      }
   }

   public void setDefSemiHidden(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEFSEMIHIDDEN$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEFSEMIHIDDEN$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetDefSemiHidden(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(DEFSEMIHIDDEN$6);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(DEFSEMIHIDDEN$6);
         }

         var3.set(var1);
      }
   }

   public void unsetDefSemiHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFSEMIHIDDEN$6);
      }
   }

   public STOnOff.Enum getDefUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFUNHIDEWHENUSED$8);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetDefUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(DEFUNHIDEWHENUSED$8);
         return var2;
      }
   }

   public boolean isSetDefUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFUNHIDEWHENUSED$8) != null;
      }
   }

   public void setDefUnhideWhenUsed(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEFUNHIDEWHENUSED$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEFUNHIDEWHENUSED$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetDefUnhideWhenUsed(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(DEFUNHIDEWHENUSED$8);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(DEFUNHIDEWHENUSED$8);
         }

         var3.set(var1);
      }
   }

   public void unsetDefUnhideWhenUsed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFUNHIDEWHENUSED$8);
      }
   }

   public STOnOff.Enum getDefQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFQFORMAT$10);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetDefQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(DEFQFORMAT$10);
         return var2;
      }
   }

   public boolean isSetDefQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFQFORMAT$10) != null;
      }
   }

   public void setDefQFormat(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEFQFORMAT$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEFQFORMAT$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetDefQFormat(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(DEFQFORMAT$10);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(DEFQFORMAT$10);
         }

         var3.set(var1);
      }
   }

   public void unsetDefQFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFQFORMAT$10);
      }
   }

   public BigInteger getCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COUNT$12);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(COUNT$12);
         return var2;
      }
   }

   public boolean isSetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COUNT$12) != null;
      }
   }

   public void setCount(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COUNT$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COUNT$12);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetCount(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(COUNT$12);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(COUNT$12);
         }

         var3.set(var1);
      }
   }

   public void unsetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COUNT$12);
      }
   }

}
