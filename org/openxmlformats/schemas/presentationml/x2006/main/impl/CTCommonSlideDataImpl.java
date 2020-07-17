package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackground;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTControlList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;

public class CTCommonSlideDataImpl extends XmlComplexContentImpl implements CTCommonSlideData {

   private static final QName BG$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bg");
   private static final QName SPTREE$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "spTree");
   private static final QName CUSTDATALST$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custDataLst");
   private static final QName CONTROLS$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "controls");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName NAME$10 = new QName("", "name");


   public CTCommonSlideDataImpl(SchemaType var1) {
      super(var1);
   }

   public CTBackground getBg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackground var2 = null;
         var2 = (CTBackground)this.get_store().find_element_user(BG$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BG$0) != 0;
      }
   }

   public void setBg(CTBackground var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackground var3 = null;
         var3 = (CTBackground)this.get_store().find_element_user(BG$0, 0);
         if(var3 == null) {
            var3 = (CTBackground)this.get_store().add_element_user(BG$0);
         }

         var3.set(var1);
      }
   }

   public CTBackground addNewBg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackground var2 = null;
         var2 = (CTBackground)this.get_store().add_element_user(BG$0);
         return var2;
      }
   }

   public void unsetBg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BG$0, 0);
      }
   }

   public CTGroupShape getSpTree() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShape var2 = null;
         var2 = (CTGroupShape)this.get_store().find_element_user(SPTREE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSpTree(CTGroupShape var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShape var3 = null;
         var3 = (CTGroupShape)this.get_store().find_element_user(SPTREE$2, 0);
         if(var3 == null) {
            var3 = (CTGroupShape)this.get_store().add_element_user(SPTREE$2);
         }

         var3.set(var1);
      }
   }

   public CTGroupShape addNewSpTree() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupShape var2 = null;
         var2 = (CTGroupShape)this.get_store().add_element_user(SPTREE$2);
         return var2;
      }
   }

   public CTCustomerDataList getCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerDataList var2 = null;
         var2 = (CTCustomerDataList)this.get_store().find_element_user(CUSTDATALST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTDATALST$4) != 0;
      }
   }

   public void setCustDataLst(CTCustomerDataList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerDataList var3 = null;
         var3 = (CTCustomerDataList)this.get_store().find_element_user(CUSTDATALST$4, 0);
         if(var3 == null) {
            var3 = (CTCustomerDataList)this.get_store().add_element_user(CUSTDATALST$4);
         }

         var3.set(var1);
      }
   }

   public CTCustomerDataList addNewCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerDataList var2 = null;
         var2 = (CTCustomerDataList)this.get_store().add_element_user(CUSTDATALST$4);
         return var2;
      }
   }

   public void unsetCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTDATALST$4, 0);
      }
   }

   public CTControlList getControls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControlList var2 = null;
         var2 = (CTControlList)this.get_store().find_element_user(CONTROLS$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetControls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONTROLS$6) != 0;
      }
   }

   public void setControls(CTControlList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControlList var3 = null;
         var3 = (CTControlList)this.get_store().find_element_user(CONTROLS$6, 0);
         if(var3 == null) {
            var3 = (CTControlList)this.get_store().add_element_user(CONTROLS$6);
         }

         var3.set(var1);
      }
   }

   public CTControlList addNewControls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControlList var2 = null;
         var2 = (CTControlList)this.get_store().add_element_user(CONTROLS$6);
         return var2;
      }
   }

   public void unsetControls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONTROLS$6, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$8) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$8, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$8);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$8);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$8, 0);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NAME$10);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$10);
         if(var2 == null) {
            var2 = (XmlString)this.get_default_attribute_value(NAME$10);
         }

         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$10) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$10);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$10);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$10);
      }
   }

}
