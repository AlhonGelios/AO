package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix;

public class CTBaseStylesImpl extends XmlComplexContentImpl implements CTBaseStyles {

   private static final QName CLRSCHEME$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrScheme");
   private static final QName FONTSCHEME$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fontScheme");
   private static final QName FMTSCHEME$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fmtScheme");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");


   public CTBaseStylesImpl(SchemaType var1) {
      super(var1);
   }

   public CTColorScheme getClrScheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorScheme var2 = null;
         var2 = (CTColorScheme)this.get_store().find_element_user(CLRSCHEME$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setClrScheme(CTColorScheme var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorScheme var3 = null;
         var3 = (CTColorScheme)this.get_store().find_element_user(CLRSCHEME$0, 0);
         if(var3 == null) {
            var3 = (CTColorScheme)this.get_store().add_element_user(CLRSCHEME$0);
         }

         var3.set(var1);
      }
   }

   public CTColorScheme addNewClrScheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorScheme var2 = null;
         var2 = (CTColorScheme)this.get_store().add_element_user(CLRSCHEME$0);
         return var2;
      }
   }

   public CTFontScheme getFontScheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontScheme var2 = null;
         var2 = (CTFontScheme)this.get_store().find_element_user(FONTSCHEME$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setFontScheme(CTFontScheme var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontScheme var3 = null;
         var3 = (CTFontScheme)this.get_store().find_element_user(FONTSCHEME$2, 0);
         if(var3 == null) {
            var3 = (CTFontScheme)this.get_store().add_element_user(FONTSCHEME$2);
         }

         var3.set(var1);
      }
   }

   public CTFontScheme addNewFontScheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontScheme var2 = null;
         var2 = (CTFontScheme)this.get_store().add_element_user(FONTSCHEME$2);
         return var2;
      }
   }

   public CTStyleMatrix getFmtScheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrix var2 = null;
         var2 = (CTStyleMatrix)this.get_store().find_element_user(FMTSCHEME$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setFmtScheme(CTStyleMatrix var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrix var3 = null;
         var3 = (CTStyleMatrix)this.get_store().find_element_user(FMTSCHEME$4, 0);
         if(var3 == null) {
            var3 = (CTStyleMatrix)this.get_store().add_element_user(FMTSCHEME$4);
         }

         var3.set(var1);
      }
   }

   public CTStyleMatrix addNewFmtScheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrix var2 = null;
         var2 = (CTStyleMatrix)this.get_store().add_element_user(FMTSCHEME$4);
         return var2;
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$6);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$6, 0);
      }
   }

}
