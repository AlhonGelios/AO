package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTFontCollectionImpl.1FontList;

public class CTFontCollectionImpl extends XmlComplexContentImpl implements CTFontCollection {

   private static final QName LATIN$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "latin");
   private static final QName EA$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ea");
   private static final QName CS$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cs");
   private static final QName FONT$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "font");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");


   public CTFontCollectionImpl(SchemaType var1) {
      super(var1);
   }

   public CTTextFont getLatin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().find_element_user(LATIN$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setLatin(CTTextFont var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var3 = null;
         var3 = (CTTextFont)this.get_store().find_element_user(LATIN$0, 0);
         if(var3 == null) {
            var3 = (CTTextFont)this.get_store().add_element_user(LATIN$0);
         }

         var3.set(var1);
      }
   }

   public CTTextFont addNewLatin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().add_element_user(LATIN$0);
         return var2;
      }
   }

   public CTTextFont getEa() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().find_element_user(EA$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setEa(CTTextFont var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var3 = null;
         var3 = (CTTextFont)this.get_store().find_element_user(EA$2, 0);
         if(var3 == null) {
            var3 = (CTTextFont)this.get_store().add_element_user(EA$2);
         }

         var3.set(var1);
      }
   }

   public CTTextFont addNewEa() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().add_element_user(EA$2);
         return var2;
      }
   }

   public CTTextFont getCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().find_element_user(CS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCs(CTTextFont var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var3 = null;
         var3 = (CTTextFont)this.get_store().find_element_user(CS$4, 0);
         if(var3 == null) {
            var3 = (CTTextFont)this.get_store().add_element_user(CS$4);
         }

         var3.set(var1);
      }
   }

   public CTTextFont addNewCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().add_element_user(CS$4);
         return var2;
      }
   }

   public List getFontList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FontList(this);
      }
   }

   public CTSupplementalFont[] getFontArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FONT$6, var2);
         CTSupplementalFont[] var3 = new CTSupplementalFont[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSupplementalFont getFontArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSupplementalFont var3 = null;
         var3 = (CTSupplementalFont)this.get_store().find_element_user(FONT$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFontArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FONT$6);
      }
   }

   public void setFontArray(CTSupplementalFont[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FONT$6);
      }
   }

   public void setFontArray(int var1, CTSupplementalFont var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSupplementalFont var4 = null;
         var4 = (CTSupplementalFont)this.get_store().find_element_user(FONT$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSupplementalFont insertNewFont(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSupplementalFont var3 = null;
         var3 = (CTSupplementalFont)this.get_store().insert_element_user(FONT$6, var1);
         return var3;
      }
   }

   public CTSupplementalFont addNewFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSupplementalFont var2 = null;
         var2 = (CTSupplementalFont)this.get_store().add_element_user(FONT$6);
         return var2;
      }
   }

   public void removeFont(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FONT$6, var1);
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

}
