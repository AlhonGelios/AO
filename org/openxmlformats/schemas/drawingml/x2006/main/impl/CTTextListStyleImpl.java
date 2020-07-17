package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;

public class CTTextListStyleImpl extends XmlComplexContentImpl implements CTTextListStyle {

   private static final QName DEFPPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "defPPr");
   private static final QName LVL1PPR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl1pPr");
   private static final QName LVL2PPR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl2pPr");
   private static final QName LVL3PPR$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl3pPr");
   private static final QName LVL4PPR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl4pPr");
   private static final QName LVL5PPR$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl5pPr");
   private static final QName LVL6PPR$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl6pPr");
   private static final QName LVL7PPR$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl7pPr");
   private static final QName LVL8PPR$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl8pPr");
   private static final QName LVL9PPR$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl9pPr");
   private static final QName EXTLST$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");


   public CTTextListStyleImpl(SchemaType var1) {
      super(var1);
   }

   public CTTextParagraphProperties getDefPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(DEFPPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDefPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFPPR$0) != 0;
      }
   }

   public void setDefPPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(DEFPPR$0, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(DEFPPR$0);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewDefPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(DEFPPR$0);
         return var2;
      }
   }

   public void unsetDefPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFPPR$0, 0);
      }
   }

   public CTTextParagraphProperties getLvl1PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL1PPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvl1PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL1PPR$2) != 0;
      }
   }

   public void setLvl1PPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL1PPR$2, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL1PPR$2);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewLvl1PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL1PPR$2);
         return var2;
      }
   }

   public void unsetLvl1PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL1PPR$2, 0);
      }
   }

   public CTTextParagraphProperties getLvl2PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL2PPR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvl2PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL2PPR$4) != 0;
      }
   }

   public void setLvl2PPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL2PPR$4, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL2PPR$4);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewLvl2PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL2PPR$4);
         return var2;
      }
   }

   public void unsetLvl2PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL2PPR$4, 0);
      }
   }

   public CTTextParagraphProperties getLvl3PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL3PPR$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvl3PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL3PPR$6) != 0;
      }
   }

   public void setLvl3PPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL3PPR$6, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL3PPR$6);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewLvl3PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL3PPR$6);
         return var2;
      }
   }

   public void unsetLvl3PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL3PPR$6, 0);
      }
   }

   public CTTextParagraphProperties getLvl4PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL4PPR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvl4PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL4PPR$8) != 0;
      }
   }

   public void setLvl4PPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL4PPR$8, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL4PPR$8);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewLvl4PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL4PPR$8);
         return var2;
      }
   }

   public void unsetLvl4PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL4PPR$8, 0);
      }
   }

   public CTTextParagraphProperties getLvl5PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL5PPR$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvl5PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL5PPR$10) != 0;
      }
   }

   public void setLvl5PPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL5PPR$10, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL5PPR$10);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewLvl5PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL5PPR$10);
         return var2;
      }
   }

   public void unsetLvl5PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL5PPR$10, 0);
      }
   }

   public CTTextParagraphProperties getLvl6PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL6PPR$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvl6PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL6PPR$12) != 0;
      }
   }

   public void setLvl6PPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL6PPR$12, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL6PPR$12);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewLvl6PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL6PPR$12);
         return var2;
      }
   }

   public void unsetLvl6PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL6PPR$12, 0);
      }
   }

   public CTTextParagraphProperties getLvl7PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL7PPR$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvl7PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL7PPR$14) != 0;
      }
   }

   public void setLvl7PPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL7PPR$14, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL7PPR$14);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewLvl7PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL7PPR$14);
         return var2;
      }
   }

   public void unsetLvl7PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL7PPR$14, 0);
      }
   }

   public CTTextParagraphProperties getLvl8PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL8PPR$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvl8PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL8PPR$16) != 0;
      }
   }

   public void setLvl8PPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL8PPR$16, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL8PPR$16);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewLvl8PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL8PPR$16);
         return var2;
      }
   }

   public void unsetLvl8PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL8PPR$16, 0);
      }
   }

   public CTTextParagraphProperties getLvl9PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL9PPR$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvl9PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVL9PPR$18) != 0;
      }
   }

   public void setLvl9PPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(LVL9PPR$18, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL9PPR$18);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewLvl9PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(LVL9PPR$18);
         return var2;
      }
   }

   public void unsetLvl9PPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVL9PPR$18, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$20) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$20);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$20);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$20, 0);
      }
   }

}
