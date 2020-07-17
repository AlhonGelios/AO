package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBinding;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap;

public class CTMapImpl extends XmlComplexContentImpl implements CTMap {

   private static final QName DATABINDING$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "DataBinding");
   private static final QName ID$2 = new QName("", "ID");
   private static final QName NAME$4 = new QName("", "Name");
   private static final QName ROOTELEMENT$6 = new QName("", "RootElement");
   private static final QName SCHEMAID$8 = new QName("", "SchemaID");
   private static final QName SHOWIMPORTEXPORTVALIDATIONERRORS$10 = new QName("", "ShowImportExportValidationErrors");
   private static final QName AUTOFIT$12 = new QName("", "AutoFit");
   private static final QName APPEND$14 = new QName("", "Append");
   private static final QName PRESERVESORTAFLAYOUT$16 = new QName("", "PreserveSortAFLayout");
   private static final QName PRESERVEFORMAT$18 = new QName("", "PreserveFormat");


   public CTMapImpl(SchemaType var1) {
      super(var1);
   }

   public CTDataBinding getDataBinding() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataBinding var2 = null;
         var2 = (CTDataBinding)this.get_store().find_element_user(DATABINDING$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDataBinding() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATABINDING$0) != 0;
      }
   }

   public void setDataBinding(CTDataBinding var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataBinding var3 = null;
         var3 = (CTDataBinding)this.get_store().find_element_user(DATABINDING$0, 0);
         if(var3 == null) {
            var3 = (CTDataBinding)this.get_store().add_element_user(DATABINDING$0);
         }

         var3.set(var1);
      }
   }

   public CTDataBinding addNewDataBinding() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataBinding var2 = null;
         var2 = (CTDataBinding)this.get_store().add_element_user(DATABINDING$0);
         return var2;
      }
   }

   public void unsetDataBinding() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATABINDING$0, 0);
      }
   }

   public long getID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$2);
         return var2;
      }
   }

   public void setID(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetID(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$2);
         }

         var3.set(var1);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$4);
         return var2;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$4);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$4);
         }

         var3.set(var1);
      }
   }

   public String getRootElement() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROOTELEMENT$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetRootElement() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ROOTELEMENT$6);
         return var2;
      }
   }

   public void setRootElement(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ROOTELEMENT$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ROOTELEMENT$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRootElement(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ROOTELEMENT$6);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ROOTELEMENT$6);
         }

         var3.set(var1);
      }
   }

   public String getSchemaID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SCHEMAID$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetSchemaID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(SCHEMAID$8);
         return var2;
      }
   }

   public void setSchemaID(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SCHEMAID$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SCHEMAID$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSchemaID(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(SCHEMAID$8);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(SCHEMAID$8);
         }

         var3.set(var1);
      }
   }

   public boolean getShowImportExportValidationErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowImportExportValidationErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
         return var2;
      }
   }

   public void setShowImportExportValidationErrors(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowImportExportValidationErrors(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWIMPORTEXPORTVALIDATIONERRORS$10);
         }

         var3.set(var1);
      }
   }

   public boolean getAutoFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTOFIT$12);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAutoFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(AUTOFIT$12);
         return var2;
      }
   }

   public void setAutoFit(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AUTOFIT$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AUTOFIT$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAutoFit(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(AUTOFIT$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(AUTOFIT$12);
         }

         var3.set(var1);
      }
   }

   public boolean getAppend() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPEND$14);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAppend() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPEND$14);
         return var2;
      }
   }

   public void setAppend(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPEND$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPEND$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAppend(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPEND$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPEND$14);
         }

         var3.set(var1);
      }
   }

   public boolean getPreserveSortAFLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRESERVESORTAFLAYOUT$16);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPreserveSortAFLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PRESERVESORTAFLAYOUT$16);
         return var2;
      }
   }

   public void setPreserveSortAFLayout(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRESERVESORTAFLAYOUT$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRESERVESORTAFLAYOUT$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPreserveSortAFLayout(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PRESERVESORTAFLAYOUT$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PRESERVESORTAFLAYOUT$16);
         }

         var3.set(var1);
      }
   }

   public boolean getPreserveFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRESERVEFORMAT$18);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPreserveFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PRESERVEFORMAT$18);
         return var2;
      }
   }

   public void setPreserveFormat(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRESERVEFORMAT$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRESERVEFORMAT$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPreserveFormat(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PRESERVEFORMAT$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PRESERVEFORMAT$18);
         }

         var3.set(var1);
      }
   }

}
