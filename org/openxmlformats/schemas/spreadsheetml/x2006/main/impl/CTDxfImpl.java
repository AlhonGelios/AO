package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt;

public class CTDxfImpl extends XmlComplexContentImpl implements CTDxf {

   private static final QName FONT$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "font");
   private static final QName NUMFMT$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "numFmt");
   private static final QName FILL$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fill");
   private static final QName ALIGNMENT$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "alignment");
   private static final QName BORDER$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "border");
   private static final QName PROTECTION$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "protection");
   private static final QName EXTLST$12 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTDxfImpl(SchemaType var1) {
      super(var1);
   }

   public CTFont getFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFont var2 = null;
         var2 = (CTFont)this.get_store().find_element_user(FONT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FONT$0) != 0;
      }
   }

   public void setFont(CTFont var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFont var3 = null;
         var3 = (CTFont)this.get_store().find_element_user(FONT$0, 0);
         if(var3 == null) {
            var3 = (CTFont)this.get_store().add_element_user(FONT$0);
         }

         var3.set(var1);
      }
   }

   public CTFont addNewFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFont var2 = null;
         var2 = (CTFont)this.get_store().add_element_user(FONT$0);
         return var2;
      }
   }

   public void unsetFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FONT$0, 0);
      }
   }

   public CTNumFmt getNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmt var2 = null;
         var2 = (CTNumFmt)this.get_store().find_element_user(NUMFMT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMFMT$2) != 0;
      }
   }

   public void setNumFmt(CTNumFmt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmt var3 = null;
         var3 = (CTNumFmt)this.get_store().find_element_user(NUMFMT$2, 0);
         if(var3 == null) {
            var3 = (CTNumFmt)this.get_store().add_element_user(NUMFMT$2);
         }

         var3.set(var1);
      }
   }

   public CTNumFmt addNewNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmt var2 = null;
         var2 = (CTNumFmt)this.get_store().add_element_user(NUMFMT$2);
         return var2;
      }
   }

   public void unsetNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMFMT$2, 0);
      }
   }

   public CTFill getFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFill var2 = null;
         var2 = (CTFill)this.get_store().find_element_user(FILL$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILL$4) != 0;
      }
   }

   public void setFill(CTFill var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFill var3 = null;
         var3 = (CTFill)this.get_store().find_element_user(FILL$4, 0);
         if(var3 == null) {
            var3 = (CTFill)this.get_store().add_element_user(FILL$4);
         }

         var3.set(var1);
      }
   }

   public CTFill addNewFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFill var2 = null;
         var2 = (CTFill)this.get_store().add_element_user(FILL$4);
         return var2;
      }
   }

   public void unsetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILL$4, 0);
      }
   }

   public CTCellAlignment getAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellAlignment var2 = null;
         var2 = (CTCellAlignment)this.get_store().find_element_user(ALIGNMENT$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALIGNMENT$6) != 0;
      }
   }

   public void setAlignment(CTCellAlignment var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellAlignment var3 = null;
         var3 = (CTCellAlignment)this.get_store().find_element_user(ALIGNMENT$6, 0);
         if(var3 == null) {
            var3 = (CTCellAlignment)this.get_store().add_element_user(ALIGNMENT$6);
         }

         var3.set(var1);
      }
   }

   public CTCellAlignment addNewAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellAlignment var2 = null;
         var2 = (CTCellAlignment)this.get_store().add_element_user(ALIGNMENT$6);
         return var2;
      }
   }

   public void unsetAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALIGNMENT$6, 0);
      }
   }

   public CTBorder getBorder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().find_element_user(BORDER$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBorder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BORDER$8) != 0;
      }
   }

   public void setBorder(CTBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(BORDER$8, 0);
         if(var3 == null) {
            var3 = (CTBorder)this.get_store().add_element_user(BORDER$8);
         }

         var3.set(var1);
      }
   }

   public CTBorder addNewBorder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(BORDER$8);
         return var2;
      }
   }

   public void unsetBorder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BORDER$8, 0);
      }
   }

   public CTCellProtection getProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellProtection var2 = null;
         var2 = (CTCellProtection)this.get_store().find_element_user(PROTECTION$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROTECTION$10) != 0;
      }
   }

   public void setProtection(CTCellProtection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellProtection var3 = null;
         var3 = (CTCellProtection)this.get_store().find_element_user(PROTECTION$10, 0);
         if(var3 == null) {
            var3 = (CTCellProtection)this.get_store().add_element_user(PROTECTION$10);
         }

         var3.set(var1);
      }
   }

   public CTCellProtection addNewProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellProtection var2 = null;
         var2 = (CTCellProtection)this.get_store().add_element_user(PROTECTION$10);
         return var2;
      }
   }

   public void unsetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROTECTION$10, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$12) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$12, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$12);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$12);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$12, 0);
      }
   }

}
