package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet;

public class CTOfficeStyleSheetImpl extends XmlComplexContentImpl implements CTOfficeStyleSheet {

   private static final QName THEMEELEMENTS$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "themeElements");
   private static final QName OBJECTDEFAULTS$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "objectDefaults");
   private static final QName EXTRACLRSCHEMELST$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extraClrSchemeLst");
   private static final QName CUSTCLRLST$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "custClrLst");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName NAME$10 = new QName("", "name");


   public CTOfficeStyleSheetImpl(SchemaType var1) {
      super(var1);
   }

   public CTBaseStyles getThemeElements() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBaseStyles var2 = null;
         var2 = (CTBaseStyles)this.get_store().find_element_user(THEMEELEMENTS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setThemeElements(CTBaseStyles var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBaseStyles var3 = null;
         var3 = (CTBaseStyles)this.get_store().find_element_user(THEMEELEMENTS$0, 0);
         if(var3 == null) {
            var3 = (CTBaseStyles)this.get_store().add_element_user(THEMEELEMENTS$0);
         }

         var3.set(var1);
      }
   }

   public CTBaseStyles addNewThemeElements() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBaseStyles var2 = null;
         var2 = (CTBaseStyles)this.get_store().add_element_user(THEMEELEMENTS$0);
         return var2;
      }
   }

   public CTObjectStyleDefaults getObjectDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTObjectStyleDefaults var2 = null;
         var2 = (CTObjectStyleDefaults)this.get_store().find_element_user(OBJECTDEFAULTS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetObjectDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OBJECTDEFAULTS$2) != 0;
      }
   }

   public void setObjectDefaults(CTObjectStyleDefaults var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTObjectStyleDefaults var3 = null;
         var3 = (CTObjectStyleDefaults)this.get_store().find_element_user(OBJECTDEFAULTS$2, 0);
         if(var3 == null) {
            var3 = (CTObjectStyleDefaults)this.get_store().add_element_user(OBJECTDEFAULTS$2);
         }

         var3.set(var1);
      }
   }

   public CTObjectStyleDefaults addNewObjectDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTObjectStyleDefaults var2 = null;
         var2 = (CTObjectStyleDefaults)this.get_store().add_element_user(OBJECTDEFAULTS$2);
         return var2;
      }
   }

   public void unsetObjectDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OBJECTDEFAULTS$2, 0);
      }
   }

   public CTColorSchemeList getExtraClrSchemeLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorSchemeList var2 = null;
         var2 = (CTColorSchemeList)this.get_store().find_element_user(EXTRACLRSCHEMELST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtraClrSchemeLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTRACLRSCHEMELST$4) != 0;
      }
   }

   public void setExtraClrSchemeLst(CTColorSchemeList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorSchemeList var3 = null;
         var3 = (CTColorSchemeList)this.get_store().find_element_user(EXTRACLRSCHEMELST$4, 0);
         if(var3 == null) {
            var3 = (CTColorSchemeList)this.get_store().add_element_user(EXTRACLRSCHEMELST$4);
         }

         var3.set(var1);
      }
   }

   public CTColorSchemeList addNewExtraClrSchemeLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorSchemeList var2 = null;
         var2 = (CTColorSchemeList)this.get_store().add_element_user(EXTRACLRSCHEMELST$4);
         return var2;
      }
   }

   public void unsetExtraClrSchemeLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTRACLRSCHEMELST$4, 0);
      }
   }

   public CTCustomColorList getCustClrLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomColorList var2 = null;
         var2 = (CTCustomColorList)this.get_store().find_element_user(CUSTCLRLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustClrLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTCLRLST$6) != 0;
      }
   }

   public void setCustClrLst(CTCustomColorList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomColorList var3 = null;
         var3 = (CTCustomColorList)this.get_store().find_element_user(CUSTCLRLST$6, 0);
         if(var3 == null) {
            var3 = (CTCustomColorList)this.get_store().add_element_user(CUSTCLRLST$6);
         }

         var3.set(var1);
      }
   }

   public CTCustomColorList addNewCustClrLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomColorList var2 = null;
         var2 = (CTCustomColorList)this.get_store().add_element_user(CUSTCLRLST$6);
         return var2;
      }
   }

   public void unsetCustClrLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTCLRLST$6, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$8) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$8, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$8);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$8);
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
