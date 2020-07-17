package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;

public class CTTblPrExBaseImpl extends XmlComplexContentImpl implements CTTblPrExBase {

   private static final QName TBLW$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblW");
   private static final QName JC$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "jc");
   private static final QName TBLCELLSPACING$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblCellSpacing");
   private static final QName TBLIND$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblInd");
   private static final QName TBLBORDERS$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblBorders");
   private static final QName SHD$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shd");
   private static final QName TBLLAYOUT$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblLayout");
   private static final QName TBLCELLMAR$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblCellMar");
   private static final QName TBLLOOK$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblLook");


   public CTTblPrExBaseImpl(SchemaType var1) {
      super(var1);
   }

   public CTTblWidth getTblW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(TBLW$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLW$0) != 0;
      }
   }

   public void setTblW(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(TBLW$0, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(TBLW$0);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewTblW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(TBLW$0);
         return var2;
      }
   }

   public void unsetTblW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLW$0, 0);
      }
   }

   public CTJc getJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var2 = null;
         var2 = (CTJc)this.get_store().find_element_user(JC$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(JC$2) != 0;
      }
   }

   public void setJc(CTJc var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var3 = null;
         var3 = (CTJc)this.get_store().find_element_user(JC$2, 0);
         if(var3 == null) {
            var3 = (CTJc)this.get_store().add_element_user(JC$2);
         }

         var3.set(var1);
      }
   }

   public CTJc addNewJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var2 = null;
         var2 = (CTJc)this.get_store().add_element_user(JC$2);
         return var2;
      }
   }

   public void unsetJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(JC$2, 0);
      }
   }

   public CTTblWidth getTblCellSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(TBLCELLSPACING$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblCellSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLCELLSPACING$4) != 0;
      }
   }

   public void setTblCellSpacing(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(TBLCELLSPACING$4, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(TBLCELLSPACING$4);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewTblCellSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(TBLCELLSPACING$4);
         return var2;
      }
   }

   public void unsetTblCellSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLCELLSPACING$4, 0);
      }
   }

   public CTTblWidth getTblInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(TBLIND$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLIND$6) != 0;
      }
   }

   public void setTblInd(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(TBLIND$6, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(TBLIND$6);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewTblInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(TBLIND$6);
         return var2;
      }
   }

   public void unsetTblInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLIND$6, 0);
      }
   }

   public CTTblBorders getTblBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblBorders var2 = null;
         var2 = (CTTblBorders)this.get_store().find_element_user(TBLBORDERS$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLBORDERS$8) != 0;
      }
   }

   public void setTblBorders(CTTblBorders var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblBorders var3 = null;
         var3 = (CTTblBorders)this.get_store().find_element_user(TBLBORDERS$8, 0);
         if(var3 == null) {
            var3 = (CTTblBorders)this.get_store().add_element_user(TBLBORDERS$8);
         }

         var3.set(var1);
      }
   }

   public CTTblBorders addNewTblBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblBorders var2 = null;
         var2 = (CTTblBorders)this.get_store().add_element_user(TBLBORDERS$8);
         return var2;
      }
   }

   public void unsetTblBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLBORDERS$8, 0);
      }
   }

   public CTShd getShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var2 = null;
         var2 = (CTShd)this.get_store().find_element_user(SHD$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHD$10) != 0;
      }
   }

   public void setShd(CTShd var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var3 = null;
         var3 = (CTShd)this.get_store().find_element_user(SHD$10, 0);
         if(var3 == null) {
            var3 = (CTShd)this.get_store().add_element_user(SHD$10);
         }

         var3.set(var1);
      }
   }

   public CTShd addNewShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var2 = null;
         var2 = (CTShd)this.get_store().add_element_user(SHD$10);
         return var2;
      }
   }

   public void unsetShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHD$10, 0);
      }
   }

   public CTTblLayoutType getTblLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblLayoutType var2 = null;
         var2 = (CTTblLayoutType)this.get_store().find_element_user(TBLLAYOUT$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLLAYOUT$12) != 0;
      }
   }

   public void setTblLayout(CTTblLayoutType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblLayoutType var3 = null;
         var3 = (CTTblLayoutType)this.get_store().find_element_user(TBLLAYOUT$12, 0);
         if(var3 == null) {
            var3 = (CTTblLayoutType)this.get_store().add_element_user(TBLLAYOUT$12);
         }

         var3.set(var1);
      }
   }

   public CTTblLayoutType addNewTblLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblLayoutType var2 = null;
         var2 = (CTTblLayoutType)this.get_store().add_element_user(TBLLAYOUT$12);
         return var2;
      }
   }

   public void unsetTblLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLLAYOUT$12, 0);
      }
   }

   public CTTblCellMar getTblCellMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblCellMar var2 = null;
         var2 = (CTTblCellMar)this.get_store().find_element_user(TBLCELLMAR$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblCellMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLCELLMAR$14) != 0;
      }
   }

   public void setTblCellMar(CTTblCellMar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblCellMar var3 = null;
         var3 = (CTTblCellMar)this.get_store().find_element_user(TBLCELLMAR$14, 0);
         if(var3 == null) {
            var3 = (CTTblCellMar)this.get_store().add_element_user(TBLCELLMAR$14);
         }

         var3.set(var1);
      }
   }

   public CTTblCellMar addNewTblCellMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblCellMar var2 = null;
         var2 = (CTTblCellMar)this.get_store().add_element_user(TBLCELLMAR$14);
         return var2;
      }
   }

   public void unsetTblCellMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLCELLMAR$14, 0);
      }
   }

   public CTShortHexNumber getTblLook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var2 = null;
         var2 = (CTShortHexNumber)this.get_store().find_element_user(TBLLOOK$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblLook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLLOOK$16) != 0;
      }
   }

   public void setTblLook(CTShortHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var3 = null;
         var3 = (CTShortHexNumber)this.get_store().find_element_user(TBLLOOK$16, 0);
         if(var3 == null) {
            var3 = (CTShortHexNumber)this.get_store().add_element_user(TBLLOOK$16);
         }

         var3.set(var1);
      }
   }

   public CTShortHexNumber addNewTblLook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var2 = null;
         var2 = (CTShortHexNumber)this.get_store().add_element_user(TBLLOOK$16);
         return var2;
      }
   }

   public void unsetTblLook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLLOOK$16, 0);
      }
   }

}
