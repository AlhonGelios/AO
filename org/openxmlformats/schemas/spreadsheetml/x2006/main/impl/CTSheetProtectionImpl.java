package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex;

public class CTSheetProtectionImpl extends XmlComplexContentImpl implements CTSheetProtection {

   private static final QName PASSWORD$0 = new QName("", "password");
   private static final QName SHEET$2 = new QName("", "sheet");
   private static final QName OBJECTS$4 = new QName("", "objects");
   private static final QName SCENARIOS$6 = new QName("", "scenarios");
   private static final QName FORMATCELLS$8 = new QName("", "formatCells");
   private static final QName FORMATCOLUMNS$10 = new QName("", "formatColumns");
   private static final QName FORMATROWS$12 = new QName("", "formatRows");
   private static final QName INSERTCOLUMNS$14 = new QName("", "insertColumns");
   private static final QName INSERTROWS$16 = new QName("", "insertRows");
   private static final QName INSERTHYPERLINKS$18 = new QName("", "insertHyperlinks");
   private static final QName DELETECOLUMNS$20 = new QName("", "deleteColumns");
   private static final QName DELETEROWS$22 = new QName("", "deleteRows");
   private static final QName SELECTLOCKEDCELLS$24 = new QName("", "selectLockedCells");
   private static final QName SORT$26 = new QName("", "sort");
   private static final QName AUTOFILTER$28 = new QName("", "autoFilter");
   private static final QName PIVOTTABLES$30 = new QName("", "pivotTables");
   private static final QName SELECTUNLOCKEDCELLS$32 = new QName("", "selectUnlockedCells");


   public CTSheetProtectionImpl(SchemaType var1) {
      super(var1);
   }

   public byte[] getPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PASSWORD$0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STUnsignedShortHex xgetPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUnsignedShortHex var2 = null;
         var2 = (STUnsignedShortHex)this.get_store().find_attribute_user(PASSWORD$0);
         return var2;
      }
   }

   public boolean isSetPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PASSWORD$0) != null;
      }
   }

   public void setPassword(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PASSWORD$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PASSWORD$0);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetPassword(STUnsignedShortHex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUnsignedShortHex var3 = null;
         var3 = (STUnsignedShortHex)this.get_store().find_attribute_user(PASSWORD$0);
         if(var3 == null) {
            var3 = (STUnsignedShortHex)this.get_store().add_attribute_user(PASSWORD$0);
         }

         var3.set(var1);
      }
   }

   public void unsetPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PASSWORD$0);
      }
   }

   public boolean getSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHEET$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHEET$2);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHEET$2);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHEET$2);
         }

         return var2;
      }
   }

   public boolean isSetSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHEET$2) != null;
      }
   }

   public void setSheet(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHEET$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHEET$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSheet(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHEET$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHEET$2);
         }

         var3.set(var1);
      }
   }

   public void unsetSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHEET$2);
      }
   }

   public boolean getObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OBJECTS$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OBJECTS$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(OBJECTS$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(OBJECTS$4);
         }

         return var2;
      }
   }

   public boolean isSetObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OBJECTS$4) != null;
      }
   }

   public void setObjects(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OBJECTS$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OBJECTS$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetObjects(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(OBJECTS$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(OBJECTS$4);
         }

         var3.set(var1);
      }
   }

   public void unsetObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OBJECTS$4);
      }
   }

   public boolean getScenarios() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SCENARIOS$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SCENARIOS$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetScenarios() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SCENARIOS$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SCENARIOS$6);
         }

         return var2;
      }
   }

   public boolean isSetScenarios() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SCENARIOS$6) != null;
      }
   }

   public void setScenarios(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SCENARIOS$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SCENARIOS$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetScenarios(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SCENARIOS$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SCENARIOS$6);
         }

         var3.set(var1);
      }
   }

   public void unsetScenarios() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SCENARIOS$6);
      }
   }

   public boolean getFormatCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORMATCELLS$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FORMATCELLS$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFormatCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FORMATCELLS$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FORMATCELLS$8);
         }

         return var2;
      }
   }

   public boolean isSetFormatCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORMATCELLS$8) != null;
      }
   }

   public void setFormatCells(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORMATCELLS$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORMATCELLS$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFormatCells(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FORMATCELLS$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FORMATCELLS$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFormatCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORMATCELLS$8);
      }
   }

   public boolean getFormatColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORMATCOLUMNS$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FORMATCOLUMNS$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFormatColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FORMATCOLUMNS$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FORMATCOLUMNS$10);
         }

         return var2;
      }
   }

   public boolean isSetFormatColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORMATCOLUMNS$10) != null;
      }
   }

   public void setFormatColumns(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORMATCOLUMNS$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORMATCOLUMNS$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFormatColumns(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FORMATCOLUMNS$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FORMATCOLUMNS$10);
         }

         var3.set(var1);
      }
   }

   public void unsetFormatColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORMATCOLUMNS$10);
      }
   }

   public boolean getFormatRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORMATROWS$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FORMATROWS$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFormatRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FORMATROWS$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FORMATROWS$12);
         }

         return var2;
      }
   }

   public boolean isSetFormatRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORMATROWS$12) != null;
      }
   }

   public void setFormatRows(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORMATROWS$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORMATROWS$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFormatRows(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FORMATROWS$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FORMATROWS$12);
         }

         var3.set(var1);
      }
   }

   public void unsetFormatRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORMATROWS$12);
      }
   }

   public boolean getInsertColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSERTCOLUMNS$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INSERTCOLUMNS$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetInsertColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(INSERTCOLUMNS$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(INSERTCOLUMNS$14);
         }

         return var2;
      }
   }

   public boolean isSetInsertColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSERTCOLUMNS$14) != null;
      }
   }

   public void setInsertColumns(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSERTCOLUMNS$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSERTCOLUMNS$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetInsertColumns(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(INSERTCOLUMNS$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(INSERTCOLUMNS$14);
         }

         var3.set(var1);
      }
   }

   public void unsetInsertColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSERTCOLUMNS$14);
      }
   }

   public boolean getInsertRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSERTROWS$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INSERTROWS$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetInsertRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(INSERTROWS$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(INSERTROWS$16);
         }

         return var2;
      }
   }

   public boolean isSetInsertRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSERTROWS$16) != null;
      }
   }

   public void setInsertRows(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSERTROWS$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSERTROWS$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetInsertRows(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(INSERTROWS$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(INSERTROWS$16);
         }

         var3.set(var1);
      }
   }

   public void unsetInsertRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSERTROWS$16);
      }
   }

   public boolean getInsertHyperlinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSERTHYPERLINKS$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INSERTHYPERLINKS$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetInsertHyperlinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(INSERTHYPERLINKS$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(INSERTHYPERLINKS$18);
         }

         return var2;
      }
   }

   public boolean isSetInsertHyperlinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSERTHYPERLINKS$18) != null;
      }
   }

   public void setInsertHyperlinks(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSERTHYPERLINKS$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSERTHYPERLINKS$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetInsertHyperlinks(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(INSERTHYPERLINKS$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(INSERTHYPERLINKS$18);
         }

         var3.set(var1);
      }
   }

   public void unsetInsertHyperlinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSERTHYPERLINKS$18);
      }
   }

   public boolean getDeleteColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DELETECOLUMNS$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DELETECOLUMNS$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDeleteColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DELETECOLUMNS$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DELETECOLUMNS$20);
         }

         return var2;
      }
   }

   public boolean isSetDeleteColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DELETECOLUMNS$20) != null;
      }
   }

   public void setDeleteColumns(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DELETECOLUMNS$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DELETECOLUMNS$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDeleteColumns(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DELETECOLUMNS$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DELETECOLUMNS$20);
         }

         var3.set(var1);
      }
   }

   public void unsetDeleteColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DELETECOLUMNS$20);
      }
   }

   public boolean getDeleteRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DELETEROWS$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DELETEROWS$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDeleteRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DELETEROWS$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DELETEROWS$22);
         }

         return var2;
      }
   }

   public boolean isSetDeleteRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DELETEROWS$22) != null;
      }
   }

   public void setDeleteRows(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DELETEROWS$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DELETEROWS$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDeleteRows(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DELETEROWS$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DELETEROWS$22);
         }

         var3.set(var1);
      }
   }

   public void unsetDeleteRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DELETEROWS$22);
      }
   }

   public boolean getSelectLockedCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SELECTLOCKEDCELLS$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SELECTLOCKEDCELLS$24);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSelectLockedCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SELECTLOCKEDCELLS$24);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SELECTLOCKEDCELLS$24);
         }

         return var2;
      }
   }

   public boolean isSetSelectLockedCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SELECTLOCKEDCELLS$24) != null;
      }
   }

   public void setSelectLockedCells(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SELECTLOCKEDCELLS$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SELECTLOCKEDCELLS$24);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSelectLockedCells(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SELECTLOCKEDCELLS$24);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SELECTLOCKEDCELLS$24);
         }

         var3.set(var1);
      }
   }

   public void unsetSelectLockedCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SELECTLOCKEDCELLS$24);
      }
   }

   public boolean getSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SORT$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SORT$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SORT$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SORT$26);
         }

         return var2;
      }
   }

   public boolean isSetSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SORT$26) != null;
      }
   }

   public void setSort(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SORT$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SORT$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSort(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SORT$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SORT$26);
         }

         var3.set(var1);
      }
   }

   public void unsetSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SORT$26);
      }
   }

   public boolean getAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTOFILTER$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(AUTOFILTER$28);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(AUTOFILTER$28);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(AUTOFILTER$28);
         }

         return var2;
      }
   }

   public boolean isSetAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AUTOFILTER$28) != null;
      }
   }

   public void setAutoFilter(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AUTOFILTER$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AUTOFILTER$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAutoFilter(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(AUTOFILTER$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(AUTOFILTER$28);
         }

         var3.set(var1);
      }
   }

   public void unsetAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AUTOFILTER$28);
      }
   }

   public boolean getPivotTables() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PIVOTTABLES$30);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PIVOTTABLES$30);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPivotTables() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PIVOTTABLES$30);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PIVOTTABLES$30);
         }

         return var2;
      }
   }

   public boolean isSetPivotTables() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PIVOTTABLES$30) != null;
      }
   }

   public void setPivotTables(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PIVOTTABLES$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PIVOTTABLES$30);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPivotTables(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PIVOTTABLES$30);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PIVOTTABLES$30);
         }

         var3.set(var1);
      }
   }

   public void unsetPivotTables() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PIVOTTABLES$30);
      }
   }

   public boolean getSelectUnlockedCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SELECTUNLOCKEDCELLS$32);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SELECTUNLOCKEDCELLS$32);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSelectUnlockedCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SELECTUNLOCKEDCELLS$32);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SELECTUNLOCKEDCELLS$32);
         }

         return var2;
      }
   }

   public boolean isSetSelectUnlockedCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SELECTUNLOCKEDCELLS$32) != null;
      }
   }

   public void setSelectUnlockedCells(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SELECTUNLOCKEDCELLS$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SELECTUNLOCKEDCELLS$32);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSelectUnlockedCells(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SELECTUNLOCKEDCELLS$32);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SELECTUNLOCKEDCELLS$32);
         }

         var3.set(var1);
      }
   }

   public void unsetSelectUnlockedCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SELECTUNLOCKEDCELLS$32);
      }
   }

}
