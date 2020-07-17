package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTAbstractNumImpl.1LvlList;

public class CTAbstractNumImpl extends XmlComplexContentImpl implements CTAbstractNum {

   private static final QName NSID$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "nsid");
   private static final QName MULTILEVELTYPE$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "multiLevelType");
   private static final QName TMPL$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tmpl");
   private static final QName NAME$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
   private static final QName STYLELINK$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "styleLink");
   private static final QName NUMSTYLELINK$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numStyleLink");
   private static final QName LVL$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvl");
   private static final QName ABSTRACTNUMID$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "abstractNumId");


   public CTAbstractNumImpl(SchemaType var1) {
      super(var1);
   }

   public CTLongHexNumber getNsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLongHexNumber var2 = null;
         var2 = (CTLongHexNumber)this.get_store().find_element_user(NSID$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NSID$0) != 0;
      }
   }

   public void setNsid(CTLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLongHexNumber var3 = null;
         var3 = (CTLongHexNumber)this.get_store().find_element_user(NSID$0, 0);
         if(var3 == null) {
            var3 = (CTLongHexNumber)this.get_store().add_element_user(NSID$0);
         }

         var3.set(var1);
      }
   }

   public CTLongHexNumber addNewNsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLongHexNumber var2 = null;
         var2 = (CTLongHexNumber)this.get_store().add_element_user(NSID$0);
         return var2;
      }
   }

   public void unsetNsid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NSID$0, 0);
      }
   }

   public CTMultiLevelType getMultiLevelType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMultiLevelType var2 = null;
         var2 = (CTMultiLevelType)this.get_store().find_element_user(MULTILEVELTYPE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMultiLevelType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MULTILEVELTYPE$2) != 0;
      }
   }

   public void setMultiLevelType(CTMultiLevelType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMultiLevelType var3 = null;
         var3 = (CTMultiLevelType)this.get_store().find_element_user(MULTILEVELTYPE$2, 0);
         if(var3 == null) {
            var3 = (CTMultiLevelType)this.get_store().add_element_user(MULTILEVELTYPE$2);
         }

         var3.set(var1);
      }
   }

   public CTMultiLevelType addNewMultiLevelType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMultiLevelType var2 = null;
         var2 = (CTMultiLevelType)this.get_store().add_element_user(MULTILEVELTYPE$2);
         return var2;
      }
   }

   public void unsetMultiLevelType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MULTILEVELTYPE$2, 0);
      }
   }

   public CTLongHexNumber getTmpl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLongHexNumber var2 = null;
         var2 = (CTLongHexNumber)this.get_store().find_element_user(TMPL$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTmpl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TMPL$4) != 0;
      }
   }

   public void setTmpl(CTLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLongHexNumber var3 = null;
         var3 = (CTLongHexNumber)this.get_store().find_element_user(TMPL$4, 0);
         if(var3 == null) {
            var3 = (CTLongHexNumber)this.get_store().add_element_user(TMPL$4);
         }

         var3.set(var1);
      }
   }

   public CTLongHexNumber addNewTmpl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLongHexNumber var2 = null;
         var2 = (CTLongHexNumber)this.get_store().add_element_user(TMPL$4);
         return var2;
      }
   }

   public void unsetTmpl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TMPL$4, 0);
      }
   }

   public CTString getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(NAME$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NAME$6) != 0;
      }
   }

   public void setName(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(NAME$6, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(NAME$6);
         }

         var3.set(var1);
      }
   }

   public CTString addNewName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(NAME$6);
         return var2;
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NAME$6, 0);
      }
   }

   public CTString getStyleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(STYLELINK$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStyleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLELINK$8) != 0;
      }
   }

   public void setStyleLink(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(STYLELINK$8, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(STYLELINK$8);
         }

         var3.set(var1);
      }
   }

   public CTString addNewStyleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(STYLELINK$8);
         return var2;
      }
   }

   public void unsetStyleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLELINK$8, 0);
      }
   }

   public CTString getNumStyleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(NUMSTYLELINK$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumStyleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMSTYLELINK$10) != 0;
      }
   }

   public void setNumStyleLink(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(NUMSTYLELINK$10, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(NUMSTYLELINK$10);
         }

         var3.set(var1);
      }
   }

   public CTString addNewNumStyleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(NUMSTYLELINK$10);
         return var2;
      }
   }

   public void unsetNumStyleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMSTYLELINK$10, 0);
      }
   }

   public List getLvlList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LvlList(this);
      }
   }

   public CTLvl[] getLvlArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LVL$12, var2);
         CTLvl[] var3 = new CTLvl[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLvl getLvlArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLvl var3 = null;
         var3 = (CTLvl)this.get_store().find_element_user(LVL$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLvlArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL$12);
      }
   }

   public void setLvlArray(CTLvl[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LVL$12);
      }
   }

   public void setLvlArray(int var1, CTLvl var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLvl var4 = null;
         var4 = (CTLvl)this.get_store().find_element_user(LVL$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLvl insertNewLvl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLvl var3 = null;
         var3 = (CTLvl)this.get_store().insert_element_user(LVL$12, var1);
         return var3;
      }
   }

   public CTLvl addNewLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLvl var2 = null;
         var2 = (CTLvl)this.get_store().add_element_user(LVL$12);
         return var2;
      }
   }

   public void removeLvl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL$12, var1);
      }
   }

   public BigInteger getAbstractNumId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ABSTRACTNUMID$14);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetAbstractNumId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(ABSTRACTNUMID$14);
         return var2;
      }
   }

   public void setAbstractNumId(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ABSTRACTNUMID$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ABSTRACTNUMID$14);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetAbstractNumId(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(ABSTRACTNUMID$14);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(ABSTRACTNUMID$14);
         }

         var3.set(var1);
      }
   }

}
