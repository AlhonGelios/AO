package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblOverlap;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;

public class CTTblPrBaseImpl extends XmlComplexContentImpl implements CTTblPrBase {

   private static final QName TBLSTYLE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblStyle");
   private static final QName TBLPPR$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblpPr");
   private static final QName TBLOVERLAP$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblOverlap");
   private static final QName BIDIVISUAL$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bidiVisual");
   private static final QName TBLSTYLEROWBANDSIZE$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblStyleRowBandSize");
   private static final QName TBLSTYLECOLBANDSIZE$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblStyleColBandSize");
   private static final QName TBLW$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblW");
   private static final QName JC$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "jc");
   private static final QName TBLCELLSPACING$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblCellSpacing");
   private static final QName TBLIND$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblInd");
   private static final QName TBLBORDERS$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblBorders");
   private static final QName SHD$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shd");
   private static final QName TBLLAYOUT$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblLayout");
   private static final QName TBLCELLMAR$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblCellMar");
   private static final QName TBLLOOK$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblLook");


   public CTTblPrBaseImpl(SchemaType var1) {
      super(var1);
   }

   public CTString getTblStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(TBLSTYLE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLSTYLE$0) != 0;
      }
   }

   public void setTblStyle(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(TBLSTYLE$0, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(TBLSTYLE$0);
         }

         var3.set(var1);
      }
   }

   public CTString addNewTblStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(TBLSTYLE$0);
         return var2;
      }
   }

   public void unsetTblStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLSTYLE$0, 0);
      }
   }

   public CTTblPPr getTblpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPPr var2 = null;
         var2 = (CTTblPPr)this.get_store().find_element_user(TBLPPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLPPR$2) != 0;
      }
   }

   public void setTblpPr(CTTblPPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPPr var3 = null;
         var3 = (CTTblPPr)this.get_store().find_element_user(TBLPPR$2, 0);
         if(var3 == null) {
            var3 = (CTTblPPr)this.get_store().add_element_user(TBLPPR$2);
         }

         var3.set(var1);
      }
   }

   public CTTblPPr addNewTblpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPPr var2 = null;
         var2 = (CTTblPPr)this.get_store().add_element_user(TBLPPR$2);
         return var2;
      }
   }

   public void unsetTblpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLPPR$2, 0);
      }
   }

   public CTTblOverlap getTblOverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblOverlap var2 = null;
         var2 = (CTTblOverlap)this.get_store().find_element_user(TBLOVERLAP$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblOverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLOVERLAP$4) != 0;
      }
   }

   public void setTblOverlap(CTTblOverlap var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblOverlap var3 = null;
         var3 = (CTTblOverlap)this.get_store().find_element_user(TBLOVERLAP$4, 0);
         if(var3 == null) {
            var3 = (CTTblOverlap)this.get_store().add_element_user(TBLOVERLAP$4);
         }

         var3.set(var1);
      }
   }

   public CTTblOverlap addNewTblOverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblOverlap var2 = null;
         var2 = (CTTblOverlap)this.get_store().add_element_user(TBLOVERLAP$4);
         return var2;
      }
   }

   public void unsetTblOverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLOVERLAP$4, 0);
      }
   }

   public CTOnOff getBidiVisual() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(BIDIVISUAL$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBidiVisual() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BIDIVISUAL$6) != 0;
      }
   }

   public void setBidiVisual(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(BIDIVISUAL$6, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(BIDIVISUAL$6);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewBidiVisual() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(BIDIVISUAL$6);
         return var2;
      }
   }

   public void unsetBidiVisual() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BIDIVISUAL$6, 0);
      }
   }

   public CTDecimalNumber getTblStyleRowBandSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(TBLSTYLEROWBANDSIZE$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblStyleRowBandSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLSTYLEROWBANDSIZE$8) != 0;
      }
   }

   public void setTblStyleRowBandSize(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(TBLSTYLEROWBANDSIZE$8, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(TBLSTYLEROWBANDSIZE$8);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewTblStyleRowBandSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(TBLSTYLEROWBANDSIZE$8);
         return var2;
      }
   }

   public void unsetTblStyleRowBandSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLSTYLEROWBANDSIZE$8, 0);
      }
   }

   public CTDecimalNumber getTblStyleColBandSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(TBLSTYLECOLBANDSIZE$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblStyleColBandSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLSTYLECOLBANDSIZE$10) != 0;
      }
   }

   public void setTblStyleColBandSize(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(TBLSTYLECOLBANDSIZE$10, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(TBLSTYLECOLBANDSIZE$10);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewTblStyleColBandSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(TBLSTYLECOLBANDSIZE$10);
         return var2;
      }
   }

   public void unsetTblStyleColBandSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLSTYLECOLBANDSIZE$10, 0);
      }
   }

   public CTTblWidth getTblW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(TBLW$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLW$12) != 0;
      }
   }

   public void setTblW(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(TBLW$12, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(TBLW$12);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewTblW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(TBLW$12);
         return var2;
      }
   }

   public void unsetTblW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLW$12, 0);
      }
   }

   public CTJc getJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var2 = null;
         var2 = (CTJc)this.get_store().find_element_user(JC$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(JC$14) != 0;
      }
   }

   public void setJc(CTJc var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var3 = null;
         var3 = (CTJc)this.get_store().find_element_user(JC$14, 0);
         if(var3 == null) {
            var3 = (CTJc)this.get_store().add_element_user(JC$14);
         }

         var3.set(var1);
      }
   }

   public CTJc addNewJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var2 = null;
         var2 = (CTJc)this.get_store().add_element_user(JC$14);
         return var2;
      }
   }

   public void unsetJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(JC$14, 0);
      }
   }

   public CTTblWidth getTblCellSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(TBLCELLSPACING$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblCellSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLCELLSPACING$16) != 0;
      }
   }

   public void setTblCellSpacing(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(TBLCELLSPACING$16, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(TBLCELLSPACING$16);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewTblCellSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(TBLCELLSPACING$16);
         return var2;
      }
   }

   public void unsetTblCellSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLCELLSPACING$16, 0);
      }
   }

   public CTTblWidth getTblInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(TBLIND$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLIND$18) != 0;
      }
   }

   public void setTblInd(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(TBLIND$18, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(TBLIND$18);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewTblInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(TBLIND$18);
         return var2;
      }
   }

   public void unsetTblInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLIND$18, 0);
      }
   }

   public CTTblBorders getTblBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblBorders var2 = null;
         var2 = (CTTblBorders)this.get_store().find_element_user(TBLBORDERS$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLBORDERS$20) != 0;
      }
   }

   public void setTblBorders(CTTblBorders var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblBorders var3 = null;
         var3 = (CTTblBorders)this.get_store().find_element_user(TBLBORDERS$20, 0);
         if(var3 == null) {
            var3 = (CTTblBorders)this.get_store().add_element_user(TBLBORDERS$20);
         }

         var3.set(var1);
      }
   }

   public CTTblBorders addNewTblBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblBorders var2 = null;
         var2 = (CTTblBorders)this.get_store().add_element_user(TBLBORDERS$20);
         return var2;
      }
   }

   public void unsetTblBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLBORDERS$20, 0);
      }
   }

   public CTShd getShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var2 = null;
         var2 = (CTShd)this.get_store().find_element_user(SHD$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHD$22) != 0;
      }
   }

   public void setShd(CTShd var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var3 = null;
         var3 = (CTShd)this.get_store().find_element_user(SHD$22, 0);
         if(var3 == null) {
            var3 = (CTShd)this.get_store().add_element_user(SHD$22);
         }

         var3.set(var1);
      }
   }

   public CTShd addNewShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var2 = null;
         var2 = (CTShd)this.get_store().add_element_user(SHD$22);
         return var2;
      }
   }

   public void unsetShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHD$22, 0);
      }
   }

   public CTTblLayoutType getTblLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblLayoutType var2 = null;
         var2 = (CTTblLayoutType)this.get_store().find_element_user(TBLLAYOUT$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLLAYOUT$24) != 0;
      }
   }

   public void setTblLayout(CTTblLayoutType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblLayoutType var3 = null;
         var3 = (CTTblLayoutType)this.get_store().find_element_user(TBLLAYOUT$24, 0);
         if(var3 == null) {
            var3 = (CTTblLayoutType)this.get_store().add_element_user(TBLLAYOUT$24);
         }

         var3.set(var1);
      }
   }

   public CTTblLayoutType addNewTblLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblLayoutType var2 = null;
         var2 = (CTTblLayoutType)this.get_store().add_element_user(TBLLAYOUT$24);
         return var2;
      }
   }

   public void unsetTblLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLLAYOUT$24, 0);
      }
   }

   public CTTblCellMar getTblCellMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblCellMar var2 = null;
         var2 = (CTTblCellMar)this.get_store().find_element_user(TBLCELLMAR$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblCellMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLCELLMAR$26) != 0;
      }
   }

   public void setTblCellMar(CTTblCellMar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblCellMar var3 = null;
         var3 = (CTTblCellMar)this.get_store().find_element_user(TBLCELLMAR$26, 0);
         if(var3 == null) {
            var3 = (CTTblCellMar)this.get_store().add_element_user(TBLCELLMAR$26);
         }

         var3.set(var1);
      }
   }

   public CTTblCellMar addNewTblCellMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblCellMar var2 = null;
         var2 = (CTTblCellMar)this.get_store().add_element_user(TBLCELLMAR$26);
         return var2;
      }
   }

   public void unsetTblCellMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLCELLMAR$26, 0);
      }
   }

   public CTShortHexNumber getTblLook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var2 = null;
         var2 = (CTShortHexNumber)this.get_store().find_element_user(TBLLOOK$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblLook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLLOOK$28) != 0;
      }
   }

   public void setTblLook(CTShortHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var3 = null;
         var3 = (CTShortHexNumber)this.get_store().find_element_user(TBLLOOK$28, 0);
         if(var3 == null) {
            var3 = (CTShortHexNumber)this.get_store().add_element_user(TBLLOOK$28);
         }

         var3.set(var1);
      }
   }

   public CTShortHexNumber addNewTblLook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var2 = null;
         var2 = (CTShortHexNumber)this.get_store().add_element_user(TBLLOOK$28);
         return var2;
      }
   }

   public void unsetTblLook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLLOOK$28, 0);
      }
   }

}
