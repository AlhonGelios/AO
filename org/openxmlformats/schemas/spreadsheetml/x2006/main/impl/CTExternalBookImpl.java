package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetDataSet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalSheetNames;

public class CTExternalBookImpl extends XmlComplexContentImpl implements CTExternalBook {

   private static final QName SHEETNAMES$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetNames");
   private static final QName DEFINEDNAMES$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "definedNames");
   private static final QName SHEETDATASET$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetDataSet");
   private static final QName ID$6 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");


   public CTExternalBookImpl(SchemaType var1) {
      super(var1);
   }

   public CTExternalSheetNames getSheetNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalSheetNames var2 = null;
         var2 = (CTExternalSheetNames)this.get_store().find_element_user(SHEETNAMES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETNAMES$0) != 0;
      }
   }

   public void setSheetNames(CTExternalSheetNames var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalSheetNames var3 = null;
         var3 = (CTExternalSheetNames)this.get_store().find_element_user(SHEETNAMES$0, 0);
         if(var3 == null) {
            var3 = (CTExternalSheetNames)this.get_store().add_element_user(SHEETNAMES$0);
         }

         var3.set(var1);
      }
   }

   public CTExternalSheetNames addNewSheetNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalSheetNames var2 = null;
         var2 = (CTExternalSheetNames)this.get_store().add_element_user(SHEETNAMES$0);
         return var2;
      }
   }

   public void unsetSheetNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETNAMES$0, 0);
      }
   }

   public CTExternalDefinedNames getDefinedNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalDefinedNames var2 = null;
         var2 = (CTExternalDefinedNames)this.get_store().find_element_user(DEFINEDNAMES$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDefinedNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFINEDNAMES$2) != 0;
      }
   }

   public void setDefinedNames(CTExternalDefinedNames var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalDefinedNames var3 = null;
         var3 = (CTExternalDefinedNames)this.get_store().find_element_user(DEFINEDNAMES$2, 0);
         if(var3 == null) {
            var3 = (CTExternalDefinedNames)this.get_store().add_element_user(DEFINEDNAMES$2);
         }

         var3.set(var1);
      }
   }

   public CTExternalDefinedNames addNewDefinedNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalDefinedNames var2 = null;
         var2 = (CTExternalDefinedNames)this.get_store().add_element_user(DEFINEDNAMES$2);
         return var2;
      }
   }

   public void unsetDefinedNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFINEDNAMES$2, 0);
      }
   }

   public CTExternalSheetDataSet getSheetDataSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalSheetDataSet var2 = null;
         var2 = (CTExternalSheetDataSet)this.get_store().find_element_user(SHEETDATASET$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetDataSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETDATASET$4) != 0;
      }
   }

   public void setSheetDataSet(CTExternalSheetDataSet var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalSheetDataSet var3 = null;
         var3 = (CTExternalSheetDataSet)this.get_store().find_element_user(SHEETDATASET$4, 0);
         if(var3 == null) {
            var3 = (CTExternalSheetDataSet)this.get_store().add_element_user(SHEETDATASET$4);
         }

         var3.set(var1);
      }
   }

   public CTExternalSheetDataSet addNewSheetDataSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalSheetDataSet var2 = null;
         var2 = (CTExternalSheetDataSet)this.get_store().add_element_user(SHEETDATASET$4);
         return var2;
      }
   }

   public void unsetSheetDataSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETDATASET$4, 0);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID$6);
         return var2;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID$6);
         }

         var3.set(var1);
      }
   }

}
