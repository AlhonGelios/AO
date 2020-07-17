package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangeNumbering;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;

public class CTFldCharImpl extends XmlComplexContentImpl implements CTFldChar {

   private static final QName FLDDATA$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fldData");
   private static final QName FFDATA$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ffData");
   private static final QName NUMBERINGCHANGE$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numberingChange");
   private static final QName FLDCHARTYPE$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fldCharType");
   private static final QName FLDLOCK$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fldLock");
   private static final QName DIRTY$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dirty");


   public CTFldCharImpl(SchemaType var1) {
      super(var1);
   }

   public CTText getFldData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var2 = null;
         var2 = (CTText)this.get_store().find_element_user(FLDDATA$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFldData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FLDDATA$0) != 0;
      }
   }

   public void setFldData(CTText var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var3 = null;
         var3 = (CTText)this.get_store().find_element_user(FLDDATA$0, 0);
         if(var3 == null) {
            var3 = (CTText)this.get_store().add_element_user(FLDDATA$0);
         }

         var3.set(var1);
      }
   }

   public CTText addNewFldData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var2 = null;
         var2 = (CTText)this.get_store().add_element_user(FLDDATA$0);
         return var2;
      }
   }

   public void unsetFldData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FLDDATA$0, 0);
      }
   }

   public CTFFData getFfData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFData var2 = null;
         var2 = (CTFFData)this.get_store().find_element_user(FFDATA$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFfData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FFDATA$2) != 0;
      }
   }

   public void setFfData(CTFFData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFData var3 = null;
         var3 = (CTFFData)this.get_store().find_element_user(FFDATA$2, 0);
         if(var3 == null) {
            var3 = (CTFFData)this.get_store().add_element_user(FFDATA$2);
         }

         var3.set(var1);
      }
   }

   public CTFFData addNewFfData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFData var2 = null;
         var2 = (CTFFData)this.get_store().add_element_user(FFDATA$2);
         return var2;
      }
   }

   public void unsetFfData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FFDATA$2, 0);
      }
   }

   public CTTrackChangeNumbering getNumberingChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChangeNumbering var2 = null;
         var2 = (CTTrackChangeNumbering)this.get_store().find_element_user(NUMBERINGCHANGE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumberingChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMBERINGCHANGE$4) != 0;
      }
   }

   public void setNumberingChange(CTTrackChangeNumbering var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChangeNumbering var3 = null;
         var3 = (CTTrackChangeNumbering)this.get_store().find_element_user(NUMBERINGCHANGE$4, 0);
         if(var3 == null) {
            var3 = (CTTrackChangeNumbering)this.get_store().add_element_user(NUMBERINGCHANGE$4);
         }

         var3.set(var1);
      }
   }

   public CTTrackChangeNumbering addNewNumberingChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChangeNumbering var2 = null;
         var2 = (CTTrackChangeNumbering)this.get_store().add_element_user(NUMBERINGCHANGE$4);
         return var2;
      }
   }

   public void unsetNumberingChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMBERINGCHANGE$4, 0);
      }
   }

   public STFldCharType.Enum getFldCharType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FLDCHARTYPE$6);
         return var2 == null?null:(STFldCharType.Enum)var2.getEnumValue();
      }
   }

   public STFldCharType xgetFldCharType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFldCharType var2 = null;
         var2 = (STFldCharType)this.get_store().find_attribute_user(FLDCHARTYPE$6);
         return var2;
      }
   }

   public void setFldCharType(STFldCharType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FLDCHARTYPE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FLDCHARTYPE$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFldCharType(STFldCharType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFldCharType var3 = null;
         var3 = (STFldCharType)this.get_store().find_attribute_user(FLDCHARTYPE$6);
         if(var3 == null) {
            var3 = (STFldCharType)this.get_store().add_attribute_user(FLDCHARTYPE$6);
         }

         var3.set(var1);
      }
   }

   public STOnOff.Enum getFldLock() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FLDLOCK$8);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetFldLock() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(FLDLOCK$8);
         return var2;
      }
   }

   public boolean isSetFldLock() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FLDLOCK$8) != null;
      }
   }

   public void setFldLock(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FLDLOCK$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FLDLOCK$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFldLock(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(FLDLOCK$8);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(FLDLOCK$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFldLock() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FLDLOCK$8);
      }
   }

   public STOnOff.Enum getDirty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DIRTY$10);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetDirty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(DIRTY$10);
         return var2;
      }
   }

   public boolean isSetDirty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DIRTY$10) != null;
      }
   }

   public void setDirty(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DIRTY$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DIRTY$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetDirty(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(DIRTY$10);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(DIRTY$10);
         }

         var3.set(var1);
      }
   }

   public void unsetDirty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DIRTY$10);
      }
   }

}
