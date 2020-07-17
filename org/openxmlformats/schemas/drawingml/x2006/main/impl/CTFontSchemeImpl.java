package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;

public class CTFontSchemeImpl extends XmlComplexContentImpl implements CTFontScheme {

   private static final QName MAJORFONT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "majorFont");
   private static final QName MINORFONT$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "minorFont");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName NAME$6 = new QName("", "name");


   public CTFontSchemeImpl(SchemaType var1) {
      super(var1);
   }

   public CTFontCollection getMajorFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontCollection var2 = null;
         var2 = (CTFontCollection)this.get_store().find_element_user(MAJORFONT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setMajorFont(CTFontCollection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontCollection var3 = null;
         var3 = (CTFontCollection)this.get_store().find_element_user(MAJORFONT$0, 0);
         if(var3 == null) {
            var3 = (CTFontCollection)this.get_store().add_element_user(MAJORFONT$0);
         }

         var3.set(var1);
      }
   }

   public CTFontCollection addNewMajorFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontCollection var2 = null;
         var2 = (CTFontCollection)this.get_store().add_element_user(MAJORFONT$0);
         return var2;
      }
   }

   public CTFontCollection getMinorFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontCollection var2 = null;
         var2 = (CTFontCollection)this.get_store().find_element_user(MINORFONT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setMinorFont(CTFontCollection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontCollection var3 = null;
         var3 = (CTFontCollection)this.get_store().find_element_user(MINORFONT$2, 0);
         if(var3 == null) {
            var3 = (CTFontCollection)this.get_store().add_element_user(MINORFONT$2);
         }

         var3.set(var1);
      }
   }

   public CTFontCollection addNewMinorFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontCollection var2 = null;
         var2 = (CTFontCollection)this.get_store().add_element_user(MINORFONT$2);
         return var2;
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$4) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$4);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$4);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$4, 0);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$6);
         return var2;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$6);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$6);
         }

         var3.set(var1);
      }
   }

}
