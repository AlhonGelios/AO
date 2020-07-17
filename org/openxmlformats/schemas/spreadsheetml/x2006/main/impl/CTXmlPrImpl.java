package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXmlDataType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTXmlPrImpl extends XmlComplexContentImpl implements CTXmlPr {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName MAPID$2 = new QName("", "mapId");
   private static final QName XPATH$4 = new QName("", "xpath");
   private static final QName XMLDATATYPE$6 = new QName("", "xmlDataType");


   public CTXmlPrImpl(SchemaType var1) {
      super(var1);
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$0) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$0, 0);
      }
   }

   public long getMapId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MAPID$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMapId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MAPID$2);
         return var2;
      }
   }

   public void setMapId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MAPID$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MAPID$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMapId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MAPID$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MAPID$2);
         }

         var3.set(var1);
      }
   }

   public String getXpath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(XPATH$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetXpath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(XPATH$4);
         return var2;
      }
   }

   public void setXpath(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(XPATH$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(XPATH$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetXpath(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(XPATH$4);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(XPATH$4);
         }

         var3.set(var1);
      }
   }

   public STXmlDataType.Enum getXmlDataType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(XMLDATATYPE$6);
         return var2 == null?null:(STXmlDataType.Enum)var2.getEnumValue();
      }
   }

   public STXmlDataType xgetXmlDataType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXmlDataType var2 = null;
         var2 = (STXmlDataType)this.get_store().find_attribute_user(XMLDATATYPE$6);
         return var2;
      }
   }

   public void setXmlDataType(STXmlDataType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(XMLDATATYPE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(XMLDATATYPE$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetXmlDataType(STXmlDataType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXmlDataType var3 = null;
         var3 = (STXmlDataType)this.get_store().find_attribute_user(XMLDATATYPE$6);
         if(var3 == null) {
            var3 = (STXmlDataType)this.get_store().add_attribute_user(XMLDATATYPE$6);
         }

         var3.set(var1);
      }
   }

}
