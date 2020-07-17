package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles;

public class CTSlideMasterTextStylesImpl extends XmlComplexContentImpl implements CTSlideMasterTextStyles {

   private static final QName TITLESTYLE$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "titleStyle");
   private static final QName BODYSTYLE$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bodyStyle");
   private static final QName OTHERSTYLE$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "otherStyle");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");


   public CTSlideMasterTextStylesImpl(SchemaType var1) {
      super(var1);
   }

   public CTTextListStyle getTitleStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().find_element_user(TITLESTYLE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTitleStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TITLESTYLE$0) != 0;
      }
   }

   public void setTitleStyle(CTTextListStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var3 = null;
         var3 = (CTTextListStyle)this.get_store().find_element_user(TITLESTYLE$0, 0);
         if(var3 == null) {
            var3 = (CTTextListStyle)this.get_store().add_element_user(TITLESTYLE$0);
         }

         var3.set(var1);
      }
   }

   public CTTextListStyle addNewTitleStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().add_element_user(TITLESTYLE$0);
         return var2;
      }
   }

   public void unsetTitleStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TITLESTYLE$0, 0);
      }
   }

   public CTTextListStyle getBodyStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().find_element_user(BODYSTYLE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBodyStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BODYSTYLE$2) != 0;
      }
   }

   public void setBodyStyle(CTTextListStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var3 = null;
         var3 = (CTTextListStyle)this.get_store().find_element_user(BODYSTYLE$2, 0);
         if(var3 == null) {
            var3 = (CTTextListStyle)this.get_store().add_element_user(BODYSTYLE$2);
         }

         var3.set(var1);
      }
   }

   public CTTextListStyle addNewBodyStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().add_element_user(BODYSTYLE$2);
         return var2;
      }
   }

   public void unsetBodyStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BODYSTYLE$2, 0);
      }
   }

   public CTTextListStyle getOtherStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().find_element_user(OTHERSTYLE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOtherStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OTHERSTYLE$4) != 0;
      }
   }

   public void setOtherStyle(CTTextListStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var3 = null;
         var3 = (CTTextListStyle)this.get_store().find_element_user(OTHERSTYLE$4, 0);
         if(var3 == null) {
            var3 = (CTTextListStyle)this.get_store().add_element_user(OTHERSTYLE$4);
         }

         var3.set(var1);
      }
   }

   public CTTextListStyle addNewOtherStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().add_element_user(OTHERSTYLE$4);
         return var2;
      }
   }

   public void unsetOtherStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OTHERSTYLE$4, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
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
