package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlCellPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTXmlCellPrImpl extends XmlComplexContentImpl implements CTXmlCellPr {

   private static final QName XMLPR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "xmlPr");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName ID$4 = new QName("", "id");
   private static final QName UNIQUENAME$6 = new QName("", "uniqueName");


   public CTXmlCellPrImpl(SchemaType var1) {
      super(var1);
   }

   public CTXmlPr getXmlPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXmlPr var2 = null;
         var2 = (CTXmlPr)this.get_store().find_element_user(XMLPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setXmlPr(CTXmlPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXmlPr var3 = null;
         var3 = (CTXmlPr)this.get_store().find_element_user(XMLPR$0, 0);
         if(var3 == null) {
            var3 = (CTXmlPr)this.get_store().add_element_user(XMLPR$0);
         }

         var3.set(var1);
      }
   }

   public CTXmlPr addNewXmlPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXmlPr var2 = null;
         var2 = (CTXmlPr)this.get_store().add_element_user(XMLPR$0);
         return var2;
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$2) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$2, 0);
      }
   }

   public long getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$4);
         return var2;
      }
   }

   public void setId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$4);
         }

         var3.set(var1);
      }
   }

   public String getUniqueName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UNIQUENAME$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetUniqueName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(UNIQUENAME$6);
         return var2;
      }
   }

   public boolean isSetUniqueName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UNIQUENAME$6) != null;
      }
   }

   public void setUniqueName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UNIQUENAME$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UNIQUENAME$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetUniqueName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(UNIQUENAME$6);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(UNIQUENAME$6);
         }

         var3.set(var1);
      }
   }

   public void unsetUniqueName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UNIQUENAME$6);
      }
   }

}
