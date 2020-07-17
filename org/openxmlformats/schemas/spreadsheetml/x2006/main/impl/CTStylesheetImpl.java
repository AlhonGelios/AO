package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyles;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColors;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyles;

public class CTStylesheetImpl extends XmlComplexContentImpl implements CTStylesheet {

   private static final QName NUMFMTS$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "numFmts");
   private static final QName FONTS$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fonts");
   private static final QName FILLS$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fills");
   private static final QName BORDERS$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "borders");
   private static final QName CELLSTYLEXFS$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellStyleXfs");
   private static final QName CELLXFS$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellXfs");
   private static final QName CELLSTYLES$12 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellStyles");
   private static final QName DXFS$14 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dxfs");
   private static final QName TABLESTYLES$16 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableStyles");
   private static final QName COLORS$18 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colors");
   private static final QName EXTLST$20 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTStylesheetImpl(SchemaType var1) {
      super(var1);
   }

   public CTNumFmts getNumFmts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmts var2 = null;
         var2 = (CTNumFmts)this.get_store().find_element_user(NUMFMTS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumFmts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMFMTS$0) != 0;
      }
   }

   public void setNumFmts(CTNumFmts var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmts var3 = null;
         var3 = (CTNumFmts)this.get_store().find_element_user(NUMFMTS$0, 0);
         if(var3 == null) {
            var3 = (CTNumFmts)this.get_store().add_element_user(NUMFMTS$0);
         }

         var3.set(var1);
      }
   }

   public CTNumFmts addNewNumFmts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmts var2 = null;
         var2 = (CTNumFmts)this.get_store().add_element_user(NUMFMTS$0);
         return var2;
      }
   }

   public void unsetNumFmts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMFMTS$0, 0);
      }
   }

   public CTFonts getFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFonts var2 = null;
         var2 = (CTFonts)this.get_store().find_element_user(FONTS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FONTS$2) != 0;
      }
   }

   public void setFonts(CTFonts var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFonts var3 = null;
         var3 = (CTFonts)this.get_store().find_element_user(FONTS$2, 0);
         if(var3 == null) {
            var3 = (CTFonts)this.get_store().add_element_user(FONTS$2);
         }

         var3.set(var1);
      }
   }

   public CTFonts addNewFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFonts var2 = null;
         var2 = (CTFonts)this.get_store().add_element_user(FONTS$2);
         return var2;
      }
   }

   public void unsetFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FONTS$2, 0);
      }
   }

   public CTFills getFills() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFills var2 = null;
         var2 = (CTFills)this.get_store().find_element_user(FILLS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFills() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILLS$4) != 0;
      }
   }

   public void setFills(CTFills var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFills var3 = null;
         var3 = (CTFills)this.get_store().find_element_user(FILLS$4, 0);
         if(var3 == null) {
            var3 = (CTFills)this.get_store().add_element_user(FILLS$4);
         }

         var3.set(var1);
      }
   }

   public CTFills addNewFills() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFills var2 = null;
         var2 = (CTFills)this.get_store().add_element_user(FILLS$4);
         return var2;
      }
   }

   public void unsetFills() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILLS$4, 0);
      }
   }

   public CTBorders getBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorders var2 = null;
         var2 = (CTBorders)this.get_store().find_element_user(BORDERS$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BORDERS$6) != 0;
      }
   }

   public void setBorders(CTBorders var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorders var3 = null;
         var3 = (CTBorders)this.get_store().find_element_user(BORDERS$6, 0);
         if(var3 == null) {
            var3 = (CTBorders)this.get_store().add_element_user(BORDERS$6);
         }

         var3.set(var1);
      }
   }

   public CTBorders addNewBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorders var2 = null;
         var2 = (CTBorders)this.get_store().add_element_user(BORDERS$6);
         return var2;
      }
   }

   public void unsetBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BORDERS$6, 0);
      }
   }

   public CTCellStyleXfs getCellStyleXfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellStyleXfs var2 = null;
         var2 = (CTCellStyleXfs)this.get_store().find_element_user(CELLSTYLEXFS$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCellStyleXfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CELLSTYLEXFS$8) != 0;
      }
   }

   public void setCellStyleXfs(CTCellStyleXfs var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellStyleXfs var3 = null;
         var3 = (CTCellStyleXfs)this.get_store().find_element_user(CELLSTYLEXFS$8, 0);
         if(var3 == null) {
            var3 = (CTCellStyleXfs)this.get_store().add_element_user(CELLSTYLEXFS$8);
         }

         var3.set(var1);
      }
   }

   public CTCellStyleXfs addNewCellStyleXfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellStyleXfs var2 = null;
         var2 = (CTCellStyleXfs)this.get_store().add_element_user(CELLSTYLEXFS$8);
         return var2;
      }
   }

   public void unsetCellStyleXfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CELLSTYLEXFS$8, 0);
      }
   }

   public CTCellXfs getCellXfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellXfs var2 = null;
         var2 = (CTCellXfs)this.get_store().find_element_user(CELLXFS$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCellXfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CELLXFS$10) != 0;
      }
   }

   public void setCellXfs(CTCellXfs var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellXfs var3 = null;
         var3 = (CTCellXfs)this.get_store().find_element_user(CELLXFS$10, 0);
         if(var3 == null) {
            var3 = (CTCellXfs)this.get_store().add_element_user(CELLXFS$10);
         }

         var3.set(var1);
      }
   }

   public CTCellXfs addNewCellXfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellXfs var2 = null;
         var2 = (CTCellXfs)this.get_store().add_element_user(CELLXFS$10);
         return var2;
      }
   }

   public void unsetCellXfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CELLXFS$10, 0);
      }
   }

   public CTCellStyles getCellStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellStyles var2 = null;
         var2 = (CTCellStyles)this.get_store().find_element_user(CELLSTYLES$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCellStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CELLSTYLES$12) != 0;
      }
   }

   public void setCellStyles(CTCellStyles var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellStyles var3 = null;
         var3 = (CTCellStyles)this.get_store().find_element_user(CELLSTYLES$12, 0);
         if(var3 == null) {
            var3 = (CTCellStyles)this.get_store().add_element_user(CELLSTYLES$12);
         }

         var3.set(var1);
      }
   }

   public CTCellStyles addNewCellStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellStyles var2 = null;
         var2 = (CTCellStyles)this.get_store().add_element_user(CELLSTYLES$12);
         return var2;
      }
   }

   public void unsetCellStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CELLSTYLES$12, 0);
      }
   }

   public CTDxfs getDxfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDxfs var2 = null;
         var2 = (CTDxfs)this.get_store().find_element_user(DXFS$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDxfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DXFS$14) != 0;
      }
   }

   public void setDxfs(CTDxfs var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDxfs var3 = null;
         var3 = (CTDxfs)this.get_store().find_element_user(DXFS$14, 0);
         if(var3 == null) {
            var3 = (CTDxfs)this.get_store().add_element_user(DXFS$14);
         }

         var3.set(var1);
      }
   }

   public CTDxfs addNewDxfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDxfs var2 = null;
         var2 = (CTDxfs)this.get_store().add_element_user(DXFS$14);
         return var2;
      }
   }

   public void unsetDxfs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DXFS$14, 0);
      }
   }

   public CTTableStyles getTableStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyles var2 = null;
         var2 = (CTTableStyles)this.get_store().find_element_user(TABLESTYLES$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTableStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TABLESTYLES$16) != 0;
      }
   }

   public void setTableStyles(CTTableStyles var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyles var3 = null;
         var3 = (CTTableStyles)this.get_store().find_element_user(TABLESTYLES$16, 0);
         if(var3 == null) {
            var3 = (CTTableStyles)this.get_store().add_element_user(TABLESTYLES$16);
         }

         var3.set(var1);
      }
   }

   public CTTableStyles addNewTableStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyles var2 = null;
         var2 = (CTTableStyles)this.get_store().add_element_user(TABLESTYLES$16);
         return var2;
      }
   }

   public void unsetTableStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TABLESTYLES$16, 0);
      }
   }

   public CTColors getColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColors var2 = null;
         var2 = (CTColors)this.get_store().find_element_user(COLORS$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLORS$18) != 0;
      }
   }

   public void setColors(CTColors var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColors var3 = null;
         var3 = (CTColors)this.get_store().find_element_user(COLORS$18, 0);
         if(var3 == null) {
            var3 = (CTColors)this.get_store().add_element_user(COLORS$18);
         }

         var3.set(var1);
      }
   }

   public CTColors addNewColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColors var2 = null;
         var2 = (CTColors)this.get_store().add_element_user(COLORS$18);
         return var2;
      }
   }

   public void unsetColors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLORS$18, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$20) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$20);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$20);
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
