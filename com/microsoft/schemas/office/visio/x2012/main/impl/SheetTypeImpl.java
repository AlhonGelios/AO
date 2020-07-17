package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.SectionType;
import com.microsoft.schemas.office.visio.x2012.main.SheetType;
import com.microsoft.schemas.office.visio.x2012.main.TriggerType;
import com.microsoft.schemas.office.visio.x2012.main.impl.SheetTypeImpl.1CellList;
import com.microsoft.schemas.office.visio.x2012.main.impl.SheetTypeImpl.1SectionList;
import com.microsoft.schemas.office.visio.x2012.main.impl.SheetTypeImpl.1TriggerList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class SheetTypeImpl extends XmlComplexContentImpl implements SheetType {

   private static final QName CELL$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Cell");
   private static final QName TRIGGER$2 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Trigger");
   private static final QName SECTION$4 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Section");
   private static final QName LINESTYLE$6 = new QName("", "LineStyle");
   private static final QName FILLSTYLE$8 = new QName("", "FillStyle");
   private static final QName TEXTSTYLE$10 = new QName("", "TextStyle");


   public SheetTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getCellList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CellList(this);
      }
   }

   public CellType[] getCellArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CELL$0, var2);
         CellType[] var3 = new CellType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CellType getCellArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CellType var3 = null;
         var3 = (CellType)this.get_store().find_element_user(CELL$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCellArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CELL$0);
      }
   }

   public void setCellArray(CellType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CELL$0);
      }
   }

   public void setCellArray(int var1, CellType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CellType var4 = null;
         var4 = (CellType)this.get_store().find_element_user(CELL$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CellType insertNewCell(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CellType var3 = null;
         var3 = (CellType)this.get_store().insert_element_user(CELL$0, var1);
         return var3;
      }
   }

   public CellType addNewCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CellType var2 = null;
         var2 = (CellType)this.get_store().add_element_user(CELL$0);
         return var2;
      }
   }

   public void removeCell(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CELL$0, var1);
      }
   }

   public List getTriggerList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TriggerList(this);
      }
   }

   public TriggerType[] getTriggerArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TRIGGER$2, var2);
         TriggerType[] var3 = new TriggerType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public TriggerType getTriggerArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TriggerType var3 = null;
         var3 = (TriggerType)this.get_store().find_element_user(TRIGGER$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTriggerArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TRIGGER$2);
      }
   }

   public void setTriggerArray(TriggerType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TRIGGER$2);
      }
   }

   public void setTriggerArray(int var1, TriggerType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TriggerType var4 = null;
         var4 = (TriggerType)this.get_store().find_element_user(TRIGGER$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public TriggerType insertNewTrigger(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TriggerType var3 = null;
         var3 = (TriggerType)this.get_store().insert_element_user(TRIGGER$2, var1);
         return var3;
      }
   }

   public TriggerType addNewTrigger() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TriggerType var2 = null;
         var2 = (TriggerType)this.get_store().add_element_user(TRIGGER$2);
         return var2;
      }
   }

   public void removeTrigger(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TRIGGER$2, var1);
      }
   }

   public List getSectionList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SectionList(this);
      }
   }

   public SectionType[] getSectionArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SECTION$4, var2);
         SectionType[] var3 = new SectionType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public SectionType getSectionArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SectionType var3 = null;
         var3 = (SectionType)this.get_store().find_element_user(SECTION$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSectionArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SECTION$4);
      }
   }

   public void setSectionArray(SectionType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SECTION$4);
      }
   }

   public void setSectionArray(int var1, SectionType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SectionType var4 = null;
         var4 = (SectionType)this.get_store().find_element_user(SECTION$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public SectionType insertNewSection(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SectionType var3 = null;
         var3 = (SectionType)this.get_store().insert_element_user(SECTION$4, var1);
         return var3;
      }
   }

   public SectionType addNewSection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SectionType var2 = null;
         var2 = (SectionType)this.get_store().add_element_user(SECTION$4);
         return var2;
      }
   }

   public void removeSection(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SECTION$4, var1);
      }
   }

   public long getLineStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LINESTYLE$6);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetLineStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(LINESTYLE$6);
         return var2;
      }
   }

   public boolean isSetLineStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LINESTYLE$6) != null;
      }
   }

   public void setLineStyle(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(LINESTYLE$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(LINESTYLE$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetLineStyle(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(LINESTYLE$6);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(LINESTYLE$6);
         }

         var3.set(var1);
      }
   }

   public void unsetLineStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LINESTYLE$6);
      }
   }

   public long getFillStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILLSTYLE$8);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFillStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FILLSTYLE$8);
         return var2;
      }
   }

   public boolean isSetFillStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILLSTYLE$8) != null;
      }
   }

   public void setFillStyle(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FILLSTYLE$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FILLSTYLE$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFillStyle(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FILLSTYLE$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FILLSTYLE$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFillStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILLSTYLE$8);
      }
   }

   public long getTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TEXTSTYLE$10);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(TEXTSTYLE$10);
         return var2;
      }
   }

   public boolean isSetTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TEXTSTYLE$10) != null;
      }
   }

   public void setTextStyle(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TEXTSTYLE$10);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TEXTSTYLE$10);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetTextStyle(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(TEXTSTYLE$10);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(TEXTSTYLE$10);
         }

         var3.set(var1);
      }
   }

   public void unsetTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TEXTSTYLE$10);
      }
   }

}
