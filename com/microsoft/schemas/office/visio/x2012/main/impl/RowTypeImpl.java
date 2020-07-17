package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RowType;
import com.microsoft.schemas.office.visio.x2012.main.TriggerType;
import com.microsoft.schemas.office.visio.x2012.main.impl.RowTypeImpl.1CellList;
import com.microsoft.schemas.office.visio.x2012.main.impl.RowTypeImpl.1TriggerList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class RowTypeImpl extends XmlComplexContentImpl implements RowType {

   private static final QName CELL$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Cell");
   private static final QName TRIGGER$2 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Trigger");
   private static final QName N$4 = new QName("", "N");
   private static final QName LOCALNAME$6 = new QName("", "LocalName");
   private static final QName IX$8 = new QName("", "IX");
   private static final QName T$10 = new QName("", "T");
   private static final QName DEL$12 = new QName("", "Del");


   public RowTypeImpl(SchemaType var1) {
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

   public String getN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(N$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(N$4);
         return var2;
      }
   }

   public boolean isSetN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(N$4) != null;
      }
   }

   public void setN(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(N$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(N$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetN(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(N$4);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(N$4);
         }

         var3.set(var1);
      }
   }

   public void unsetN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(N$4);
      }
   }

   public String getLocalName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LOCALNAME$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetLocalName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(LOCALNAME$6);
         return var2;
      }
   }

   public boolean isSetLocalName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LOCALNAME$6) != null;
      }
   }

   public void setLocalName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LOCALNAME$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LOCALNAME$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetLocalName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(LOCALNAME$6);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(LOCALNAME$6);
         }

         var3.set(var1);
      }
   }

   public void unsetLocalName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LOCALNAME$6);
      }
   }

   public long getIX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(IX$8);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetIX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(IX$8);
         return var2;
      }
   }

   public boolean isSetIX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(IX$8) != null;
      }
   }

   public void setIX(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(IX$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(IX$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetIX(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(IX$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(IX$8);
         }

         var3.set(var1);
      }
   }

   public void unsetIX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(IX$8);
      }
   }

   public String getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(T$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(T$10);
         return var2;
      }
   }

   public boolean isSetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(T$10) != null;
      }
   }

   public void setT(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(T$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(T$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetT(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(T$10);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(T$10);
         }

         var3.set(var1);
      }
   }

   public void unsetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(T$10);
      }
   }

   public boolean getDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEL$12);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DEL$12);
         return var2;
      }
   }

   public boolean isSetDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEL$12) != null;
      }
   }

   public void setDel(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEL$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEL$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDel(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DEL$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DEL$12);
         }

         var3.set(var1);
      }
   }

   public void unsetDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEL$12);
      }
   }

}
