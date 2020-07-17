package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTCacheFieldImpl.1MpMapList;

public class CTCacheFieldImpl extends XmlComplexContentImpl implements CTCacheField {

   private static final QName SHAREDITEMS$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sharedItems");
   private static final QName FIELDGROUP$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fieldGroup");
   private static final QName MPMAP$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mpMap");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName NAME$8 = new QName("", "name");
   private static final QName CAPTION$10 = new QName("", "caption");
   private static final QName PROPERTYNAME$12 = new QName("", "propertyName");
   private static final QName SERVERFIELD$14 = new QName("", "serverField");
   private static final QName UNIQUELIST$16 = new QName("", "uniqueList");
   private static final QName NUMFMTID$18 = new QName("", "numFmtId");
   private static final QName FORMULA$20 = new QName("", "formula");
   private static final QName SQLTYPE$22 = new QName("", "sqlType");
   private static final QName HIERARCHY$24 = new QName("", "hierarchy");
   private static final QName LEVEL$26 = new QName("", "level");
   private static final QName DATABASEFIELD$28 = new QName("", "databaseField");
   private static final QName MAPPINGCOUNT$30 = new QName("", "mappingCount");
   private static final QName MEMBERPROPERTYFIELD$32 = new QName("", "memberPropertyField");


   public CTCacheFieldImpl(SchemaType var1) {
      super(var1);
   }

   public CTSharedItems getSharedItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSharedItems var2 = null;
         var2 = (CTSharedItems)this.get_store().find_element_user(SHAREDITEMS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSharedItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHAREDITEMS$0) != 0;
      }
   }

   public void setSharedItems(CTSharedItems var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSharedItems var3 = null;
         var3 = (CTSharedItems)this.get_store().find_element_user(SHAREDITEMS$0, 0);
         if(var3 == null) {
            var3 = (CTSharedItems)this.get_store().add_element_user(SHAREDITEMS$0);
         }

         var3.set(var1);
      }
   }

   public CTSharedItems addNewSharedItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSharedItems var2 = null;
         var2 = (CTSharedItems)this.get_store().add_element_user(SHAREDITEMS$0);
         return var2;
      }
   }

   public void unsetSharedItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHAREDITEMS$0, 0);
      }
   }

   public CTFieldGroup getFieldGroup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFieldGroup var2 = null;
         var2 = (CTFieldGroup)this.get_store().find_element_user(FIELDGROUP$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFieldGroup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FIELDGROUP$2) != 0;
      }
   }

   public void setFieldGroup(CTFieldGroup var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFieldGroup var3 = null;
         var3 = (CTFieldGroup)this.get_store().find_element_user(FIELDGROUP$2, 0);
         if(var3 == null) {
            var3 = (CTFieldGroup)this.get_store().add_element_user(FIELDGROUP$2);
         }

         var3.set(var1);
      }
   }

   public CTFieldGroup addNewFieldGroup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFieldGroup var2 = null;
         var2 = (CTFieldGroup)this.get_store().add_element_user(FIELDGROUP$2);
         return var2;
      }
   }

   public void unsetFieldGroup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FIELDGROUP$2, 0);
      }
   }

   public List getMpMapList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MpMapList(this);
      }
   }

   public CTX[] getMpMapArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MPMAP$4, var2);
         CTX[] var3 = new CTX[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTX getMpMapArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTX var3 = null;
         var3 = (CTX)this.get_store().find_element_user(MPMAP$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMpMapArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MPMAP$4);
      }
   }

   public void setMpMapArray(CTX[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MPMAP$4);
      }
   }

   public void setMpMapArray(int var1, CTX var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTX var4 = null;
         var4 = (CTX)this.get_store().find_element_user(MPMAP$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTX insertNewMpMap(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTX var3 = null;
         var3 = (CTX)this.get_store().insert_element_user(MPMAP$4, var1);
         return var3;
      }
   }

   public CTX addNewMpMap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTX var2 = null;
         var2 = (CTX)this.get_store().add_element_user(MPMAP$4);
         return var2;
      }
   }

   public void removeMpMap(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MPMAP$4, var1);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$6, 0);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(NAME$8);
         return var2;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(NAME$8);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(NAME$8);
         }

         var3.set(var1);
      }
   }

   public String getCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CAPTION$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(CAPTION$10);
         return var2;
      }
   }

   public boolean isSetCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CAPTION$10) != null;
      }
   }

   public void setCaption(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CAPTION$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CAPTION$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCaption(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(CAPTION$10);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(CAPTION$10);
         }

         var3.set(var1);
      }
   }

   public void unsetCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CAPTION$10);
      }
   }

   public String getPropertyName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PROPERTYNAME$12);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetPropertyName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(PROPERTYNAME$12);
         return var2;
      }
   }

   public boolean isSetPropertyName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PROPERTYNAME$12) != null;
      }
   }

   public void setPropertyName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PROPERTYNAME$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PROPERTYNAME$12);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPropertyName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(PROPERTYNAME$12);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(PROPERTYNAME$12);
         }

         var3.set(var1);
      }
   }

   public void unsetPropertyName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PROPERTYNAME$12);
      }
   }

   public boolean getServerField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SERVERFIELD$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SERVERFIELD$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetServerField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SERVERFIELD$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SERVERFIELD$14);
         }

         return var2;
      }
   }

   public boolean isSetServerField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SERVERFIELD$14) != null;
      }
   }

   public void setServerField(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SERVERFIELD$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SERVERFIELD$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetServerField(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SERVERFIELD$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SERVERFIELD$14);
         }

         var3.set(var1);
      }
   }

   public void unsetServerField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SERVERFIELD$14);
      }
   }

   public boolean getUniqueList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UNIQUELIST$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(UNIQUELIST$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUniqueList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(UNIQUELIST$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(UNIQUELIST$16);
         }

         return var2;
      }
   }

   public boolean isSetUniqueList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UNIQUELIST$16) != null;
      }
   }

   public void setUniqueList(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UNIQUELIST$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UNIQUELIST$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUniqueList(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(UNIQUELIST$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(UNIQUELIST$16);
         }

         var3.set(var1);
      }
   }

   public void unsetUniqueList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UNIQUELIST$16);
      }
   }

   public long getNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NUMFMTID$18);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STNumFmtId xgetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STNumFmtId var2 = null;
         var2 = (STNumFmtId)this.get_store().find_attribute_user(NUMFMTID$18);
         return var2;
      }
   }

   public boolean isSetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NUMFMTID$18) != null;
      }
   }

   public void setNumFmtId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(NUMFMTID$18);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(NUMFMTID$18);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetNumFmtId(STNumFmtId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STNumFmtId var3 = null;
         var3 = (STNumFmtId)this.get_store().find_attribute_user(NUMFMTID$18);
         if(var3 == null) {
            var3 = (STNumFmtId)this.get_store().add_attribute_user(NUMFMTID$18);
         }

         var3.set(var1);
      }
   }

   public void unsetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NUMFMTID$18);
      }
   }

   public String getFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORMULA$20);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(FORMULA$20);
         return var2;
      }
   }

   public boolean isSetFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORMULA$20) != null;
      }
   }

   public void setFormula(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORMULA$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORMULA$20);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFormula(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(FORMULA$20);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(FORMULA$20);
         }

         var3.set(var1);
      }
   }

   public void unsetFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORMULA$20);
      }
   }

   public int getSqlType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SQLTYPE$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SQLTYPE$22);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetSqlType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(SQLTYPE$22);
         if(var2 == null) {
            var2 = (XmlInt)this.get_default_attribute_value(SQLTYPE$22);
         }

         return var2;
      }
   }

   public boolean isSetSqlType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SQLTYPE$22) != null;
      }
   }

   public void setSqlType(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SQLTYPE$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SQLTYPE$22);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSqlType(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(SQLTYPE$22);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(SQLTYPE$22);
         }

         var3.set(var1);
      }
   }

   public void unsetSqlType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SQLTYPE$22);
      }
   }

   public int getHierarchy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIERARCHY$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HIERARCHY$24);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetHierarchy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(HIERARCHY$24);
         if(var2 == null) {
            var2 = (XmlInt)this.get_default_attribute_value(HIERARCHY$24);
         }

         return var2;
      }
   }

   public boolean isSetHierarchy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIERARCHY$24) != null;
      }
   }

   public void setHierarchy(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIERARCHY$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIERARCHY$24);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetHierarchy(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(HIERARCHY$24);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(HIERARCHY$24);
         }

         var3.set(var1);
      }
   }

   public void unsetHierarchy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIERARCHY$24);
      }
   }

   public long getLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LEVEL$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(LEVEL$26);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(LEVEL$26);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(LEVEL$26);
         }

         return var2;
      }
   }

   public boolean isSetLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LEVEL$26) != null;
      }
   }

   public void setLevel(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(LEVEL$26);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(LEVEL$26);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetLevel(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(LEVEL$26);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(LEVEL$26);
         }

         var3.set(var1);
      }
   }

   public void unsetLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LEVEL$26);
      }
   }

   public boolean getDatabaseField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATABASEFIELD$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DATABASEFIELD$28);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDatabaseField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DATABASEFIELD$28);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DATABASEFIELD$28);
         }

         return var2;
      }
   }

   public boolean isSetDatabaseField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATABASEFIELD$28) != null;
      }
   }

   public void setDatabaseField(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DATABASEFIELD$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DATABASEFIELD$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDatabaseField(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DATABASEFIELD$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DATABASEFIELD$28);
         }

         var3.set(var1);
      }
   }

   public void unsetDatabaseField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATABASEFIELD$28);
      }
   }

   public long getMappingCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MAPPINGCOUNT$30);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMappingCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MAPPINGCOUNT$30);
         return var2;
      }
   }

   public boolean isSetMappingCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MAPPINGCOUNT$30) != null;
      }
   }

   public void setMappingCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MAPPINGCOUNT$30);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MAPPINGCOUNT$30);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMappingCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MAPPINGCOUNT$30);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MAPPINGCOUNT$30);
         }

         var3.set(var1);
      }
   }

   public void unsetMappingCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MAPPINGCOUNT$30);
      }
   }

   public boolean getMemberPropertyField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MEMBERPROPERTYFIELD$32);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MEMBERPROPERTYFIELD$32);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMemberPropertyField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MEMBERPROPERTYFIELD$32);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(MEMBERPROPERTYFIELD$32);
         }

         return var2;
      }
   }

   public boolean isSetMemberPropertyField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MEMBERPROPERTYFIELD$32) != null;
      }
   }

   public void setMemberPropertyField(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MEMBERPROPERTYFIELD$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MEMBERPROPERTYFIELD$32);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMemberPropertyField(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MEMBERPROPERTYFIELD$32);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MEMBERPROPERTYFIELD$32);
         }

         var3.set(var1);
      }
   }

   public void unsetMemberPropertyField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MEMBERPROPERTYFIELD$32);
      }
   }

}
