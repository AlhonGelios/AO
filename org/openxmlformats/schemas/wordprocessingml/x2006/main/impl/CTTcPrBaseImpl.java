package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc;

public class CTTcPrBaseImpl extends XmlComplexContentImpl implements CTTcPrBase {

   private static final QName CNFSTYLE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cnfStyle");
   private static final QName TCW$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcW");
   private static final QName GRIDSPAN$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gridSpan");
   private static final QName HMERGE$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hMerge");
   private static final QName VMERGE$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vMerge");
   private static final QName TCBORDERS$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcBorders");
   private static final QName SHD$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shd");
   private static final QName NOWRAP$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noWrap");
   private static final QName TCMAR$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcMar");
   private static final QName TEXTDIRECTION$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "textDirection");
   private static final QName TCFITTEXT$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcFitText");
   private static final QName VALIGN$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vAlign");
   private static final QName HIDEMARK$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hideMark");


   public CTTcPrBaseImpl(SchemaType var1) {
      super(var1);
   }

   public CTCnf getCnfStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCnf var2 = null;
         var2 = (CTCnf)this.get_store().find_element_user(CNFSTYLE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCnfStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CNFSTYLE$0) != 0;
      }
   }

   public void setCnfStyle(CTCnf var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCnf var3 = null;
         var3 = (CTCnf)this.get_store().find_element_user(CNFSTYLE$0, 0);
         if(var3 == null) {
            var3 = (CTCnf)this.get_store().add_element_user(CNFSTYLE$0);
         }

         var3.set(var1);
      }
   }

   public CTCnf addNewCnfStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCnf var2 = null;
         var2 = (CTCnf)this.get_store().add_element_user(CNFSTYLE$0);
         return var2;
      }
   }

   public void unsetCnfStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CNFSTYLE$0, 0);
      }
   }

   public CTTblWidth getTcW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(TCW$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTcW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TCW$2) != 0;
      }
   }

   public void setTcW(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(TCW$2, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(TCW$2);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewTcW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(TCW$2);
         return var2;
      }
   }

   public void unsetTcW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TCW$2, 0);
      }
   }

   public CTDecimalNumber getGridSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(GRIDSPAN$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGridSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRIDSPAN$4) != 0;
      }
   }

   public void setGridSpan(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(GRIDSPAN$4, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(GRIDSPAN$4);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewGridSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(GRIDSPAN$4);
         return var2;
      }
   }

   public void unsetGridSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRIDSPAN$4, 0);
      }
   }

   public CTHMerge getHMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHMerge var2 = null;
         var2 = (CTHMerge)this.get_store().find_element_user(HMERGE$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HMERGE$6) != 0;
      }
   }

   public void setHMerge(CTHMerge var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHMerge var3 = null;
         var3 = (CTHMerge)this.get_store().find_element_user(HMERGE$6, 0);
         if(var3 == null) {
            var3 = (CTHMerge)this.get_store().add_element_user(HMERGE$6);
         }

         var3.set(var1);
      }
   }

   public CTHMerge addNewHMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHMerge var2 = null;
         var2 = (CTHMerge)this.get_store().add_element_user(HMERGE$6);
         return var2;
      }
   }

   public void unsetHMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HMERGE$6, 0);
      }
   }

   public CTVMerge getVMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVMerge var2 = null;
         var2 = (CTVMerge)this.get_store().find_element_user(VMERGE$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VMERGE$8) != 0;
      }
   }

   public void setVMerge(CTVMerge var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVMerge var3 = null;
         var3 = (CTVMerge)this.get_store().find_element_user(VMERGE$8, 0);
         if(var3 == null) {
            var3 = (CTVMerge)this.get_store().add_element_user(VMERGE$8);
         }

         var3.set(var1);
      }
   }

   public CTVMerge addNewVMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVMerge var2 = null;
         var2 = (CTVMerge)this.get_store().add_element_user(VMERGE$8);
         return var2;
      }
   }

   public void unsetVMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VMERGE$8, 0);
      }
   }

   public CTTcBorders getTcBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcBorders var2 = null;
         var2 = (CTTcBorders)this.get_store().find_element_user(TCBORDERS$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTcBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TCBORDERS$10) != 0;
      }
   }

   public void setTcBorders(CTTcBorders var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcBorders var3 = null;
         var3 = (CTTcBorders)this.get_store().find_element_user(TCBORDERS$10, 0);
         if(var3 == null) {
            var3 = (CTTcBorders)this.get_store().add_element_user(TCBORDERS$10);
         }

         var3.set(var1);
      }
   }

   public CTTcBorders addNewTcBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcBorders var2 = null;
         var2 = (CTTcBorders)this.get_store().add_element_user(TCBORDERS$10);
         return var2;
      }
   }

   public void unsetTcBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TCBORDERS$10, 0);
      }
   }

   public CTShd getShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var2 = null;
         var2 = (CTShd)this.get_store().find_element_user(SHD$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHD$12) != 0;
      }
   }

   public void setShd(CTShd var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var3 = null;
         var3 = (CTShd)this.get_store().find_element_user(SHD$12, 0);
         if(var3 == null) {
            var3 = (CTShd)this.get_store().add_element_user(SHD$12);
         }

         var3.set(var1);
      }
   }

   public CTShd addNewShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var2 = null;
         var2 = (CTShd)this.get_store().add_element_user(SHD$12);
         return var2;
      }
   }

   public void unsetShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHD$12, 0);
      }
   }

   public CTOnOff getNoWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(NOWRAP$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOWRAP$14) != 0;
      }
   }

   public void setNoWrap(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(NOWRAP$14, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(NOWRAP$14);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewNoWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(NOWRAP$14);
         return var2;
      }
   }

   public void unsetNoWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOWRAP$14, 0);
      }
   }

   public CTTcMar getTcMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcMar var2 = null;
         var2 = (CTTcMar)this.get_store().find_element_user(TCMAR$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTcMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TCMAR$16) != 0;
      }
   }

   public void setTcMar(CTTcMar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcMar var3 = null;
         var3 = (CTTcMar)this.get_store().find_element_user(TCMAR$16, 0);
         if(var3 == null) {
            var3 = (CTTcMar)this.get_store().add_element_user(TCMAR$16);
         }

         var3.set(var1);
      }
   }

   public CTTcMar addNewTcMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcMar var2 = null;
         var2 = (CTTcMar)this.get_store().add_element_user(TCMAR$16);
         return var2;
      }
   }

   public void unsetTcMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TCMAR$16, 0);
      }
   }

   public CTTextDirection getTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextDirection var2 = null;
         var2 = (CTTextDirection)this.get_store().find_element_user(TEXTDIRECTION$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTDIRECTION$18) != 0;
      }
   }

   public void setTextDirection(CTTextDirection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextDirection var3 = null;
         var3 = (CTTextDirection)this.get_store().find_element_user(TEXTDIRECTION$18, 0);
         if(var3 == null) {
            var3 = (CTTextDirection)this.get_store().add_element_user(TEXTDIRECTION$18);
         }

         var3.set(var1);
      }
   }

   public CTTextDirection addNewTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextDirection var2 = null;
         var2 = (CTTextDirection)this.get_store().add_element_user(TEXTDIRECTION$18);
         return var2;
      }
   }

   public void unsetTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTDIRECTION$18, 0);
      }
   }

   public CTOnOff getTcFitText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(TCFITTEXT$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTcFitText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TCFITTEXT$20) != 0;
      }
   }

   public void setTcFitText(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(TCFITTEXT$20, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(TCFITTEXT$20);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewTcFitText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(TCFITTEXT$20);
         return var2;
      }
   }

   public void unsetTcFitText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TCFITTEXT$20, 0);
      }
   }

   public CTVerticalJc getVAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalJc var2 = null;
         var2 = (CTVerticalJc)this.get_store().find_element_user(VALIGN$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VALIGN$22) != 0;
      }
   }

   public void setVAlign(CTVerticalJc var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalJc var3 = null;
         var3 = (CTVerticalJc)this.get_store().find_element_user(VALIGN$22, 0);
         if(var3 == null) {
            var3 = (CTVerticalJc)this.get_store().add_element_user(VALIGN$22);
         }

         var3.set(var1);
      }
   }

   public CTVerticalJc addNewVAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalJc var2 = null;
         var2 = (CTVerticalJc)this.get_store().add_element_user(VALIGN$22);
         return var2;
      }
   }

   public void unsetVAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VALIGN$22, 0);
      }
   }

   public CTOnOff getHideMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(HIDEMARK$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHideMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HIDEMARK$24) != 0;
      }
   }

   public void setHideMark(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(HIDEMARK$24, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(HIDEMARK$24);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewHideMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(HIDEMARK$24);
         return var2;
      }
   }

   public void unsetHideMark() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HIDEMARK$24, 0);
      }
   }

}
