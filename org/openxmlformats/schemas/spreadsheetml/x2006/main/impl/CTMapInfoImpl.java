package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTMapInfoImpl.1MapList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTMapInfoImpl.1SchemaList;

public class CTMapInfoImpl extends XmlComplexContentImpl implements CTMapInfo {

   private static final QName SCHEMA$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "Schema");
   private static final QName MAP$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "Map");
   private static final QName SELECTIONNAMESPACES$4 = new QName("", "SelectionNamespaces");


   public CTMapInfoImpl(SchemaType var1) {
      super(var1);
   }

   public List getSchemaList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SchemaList(this);
      }
   }

   public CTSchema[] getSchemaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCHEMA$0, var2);
         CTSchema[] var3 = new CTSchema[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSchema getSchemaArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchema var3 = null;
         var3 = (CTSchema)this.get_store().find_element_user(SCHEMA$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSchemaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCHEMA$0);
      }
   }

   public void setSchemaArray(CTSchema[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCHEMA$0);
      }
   }

   public void setSchemaArray(int var1, CTSchema var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchema var4 = null;
         var4 = (CTSchema)this.get_store().find_element_user(SCHEMA$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSchema insertNewSchema(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchema var3 = null;
         var3 = (CTSchema)this.get_store().insert_element_user(SCHEMA$0, var1);
         return var3;
      }
   }

   public CTSchema addNewSchema() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchema var2 = null;
         var2 = (CTSchema)this.get_store().add_element_user(SCHEMA$0);
         return var2;
      }
   }

   public void removeSchema(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCHEMA$0, var1);
      }
   }

   public List getMapList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MapList(this);
      }
   }

   public CTMap[] getMapArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MAP$2, var2);
         CTMap[] var3 = new CTMap[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMap getMapArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMap var3 = null;
         var3 = (CTMap)this.get_store().find_element_user(MAP$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMapArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MAP$2);
      }
   }

   public void setMapArray(CTMap[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MAP$2);
      }
   }

   public void setMapArray(int var1, CTMap var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMap var4 = null;
         var4 = (CTMap)this.get_store().find_element_user(MAP$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMap insertNewMap(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMap var3 = null;
         var3 = (CTMap)this.get_store().insert_element_user(MAP$2, var1);
         return var3;
      }
   }

   public CTMap addNewMap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMap var2 = null;
         var2 = (CTMap)this.get_store().add_element_user(MAP$2);
         return var2;
      }
   }

   public void removeMap(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MAP$2, var1);
      }
   }

   public String getSelectionNamespaces() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SELECTIONNAMESPACES$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetSelectionNamespaces() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(SELECTIONNAMESPACES$4);
         return var2;
      }
   }

   public void setSelectionNamespaces(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SELECTIONNAMESPACES$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SELECTIONNAMESPACES$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSelectionNamespaces(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(SELECTIONNAMESPACES$4);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(SELECTIONNAMESPACES$4);
         }

         var3.set(var1);
      }
   }

}
