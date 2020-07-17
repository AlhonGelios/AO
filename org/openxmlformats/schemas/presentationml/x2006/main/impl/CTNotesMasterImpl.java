package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster;

public class CTNotesMasterImpl extends XmlComplexContentImpl implements CTNotesMaster {

   private static final QName CSLD$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cSld");
   private static final QName CLRMAP$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "clrMap");
   private static final QName HF$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "hf");
   private static final QName NOTESSTYLE$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesStyle");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");


   public CTNotesMasterImpl(SchemaType var1) {
      super(var1);
   }

   public CTCommonSlideData getCSld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommonSlideData var2 = null;
         var2 = (CTCommonSlideData)this.get_store().find_element_user(CSLD$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCSld(CTCommonSlideData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommonSlideData var3 = null;
         var3 = (CTCommonSlideData)this.get_store().find_element_user(CSLD$0, 0);
         if(var3 == null) {
            var3 = (CTCommonSlideData)this.get_store().add_element_user(CSLD$0);
         }

         var3.set(var1);
      }
   }

   public CTCommonSlideData addNewCSld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommonSlideData var2 = null;
         var2 = (CTCommonSlideData)this.get_store().add_element_user(CSLD$0);
         return var2;
      }
   }

   public CTColorMapping getClrMap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var2 = null;
         var2 = (CTColorMapping)this.get_store().find_element_user(CLRMAP$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setClrMap(CTColorMapping var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var3 = null;
         var3 = (CTColorMapping)this.get_store().find_element_user(CLRMAP$2, 0);
         if(var3 == null) {
            var3 = (CTColorMapping)this.get_store().add_element_user(CLRMAP$2);
         }

         var3.set(var1);
      }
   }

   public CTColorMapping addNewClrMap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var2 = null;
         var2 = (CTColorMapping)this.get_store().add_element_user(CLRMAP$2);
         return var2;
      }
   }

   public CTHeaderFooter getHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().find_element_user(HF$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HF$4) != 0;
      }
   }

   public void setHf(CTHeaderFooter var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var3 = null;
         var3 = (CTHeaderFooter)this.get_store().find_element_user(HF$4, 0);
         if(var3 == null) {
            var3 = (CTHeaderFooter)this.get_store().add_element_user(HF$4);
         }

         var3.set(var1);
      }
   }

   public CTHeaderFooter addNewHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().add_element_user(HF$4);
         return var2;
      }
   }

   public void unsetHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HF$4, 0);
      }
   }

   public CTTextListStyle getNotesStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().find_element_user(NOTESSTYLE$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNotesStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOTESSTYLE$6) != 0;
      }
   }

   public void setNotesStyle(CTTextListStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var3 = null;
         var3 = (CTTextListStyle)this.get_store().find_element_user(NOTESSTYLE$6, 0);
         if(var3 == null) {
            var3 = (CTTextListStyle)this.get_store().add_element_user(NOTESSTYLE$6);
         }

         var3.set(var1);
      }
   }

   public CTTextListStyle addNewNotesStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().add_element_user(NOTESSTYLE$6);
         return var2;
      }
   }

   public void unsetNotesStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOTESSTYLE$6, 0);
      }
   }

   public CTExtensionListModify getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$8) != 0;
      }
   }

   public void setExtLst(CTExtensionListModify var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var3 = null;
         var3 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$8, 0);
         if(var3 == null) {
            var3 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$8);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$8);
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
