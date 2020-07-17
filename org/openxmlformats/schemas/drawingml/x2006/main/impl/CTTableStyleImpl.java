package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableBackgroundStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.STGuid;

public class CTTableStyleImpl extends XmlComplexContentImpl implements CTTableStyle {

   private static final QName TBLBG$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblBg");
   private static final QName WHOLETBL$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "wholeTbl");
   private static final QName BAND1H$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "band1H");
   private static final QName BAND2H$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "band2H");
   private static final QName BAND1V$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "band1V");
   private static final QName BAND2V$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "band2V");
   private static final QName LASTCOL$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lastCol");
   private static final QName FIRSTCOL$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "firstCol");
   private static final QName LASTROW$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lastRow");
   private static final QName SECELL$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "seCell");
   private static final QName SWCELL$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "swCell");
   private static final QName FIRSTROW$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "firstRow");
   private static final QName NECELL$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "neCell");
   private static final QName NWCELL$26 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "nwCell");
   private static final QName EXTLST$28 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName STYLEID$30 = new QName("", "styleId");
   private static final QName STYLENAME$32 = new QName("", "styleName");


   public CTTableStyleImpl(SchemaType var1) {
      super(var1);
   }

   public CTTableBackgroundStyle getTblBg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableBackgroundStyle var2 = null;
         var2 = (CTTableBackgroundStyle)this.get_store().find_element_user(TBLBG$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblBg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLBG$0) != 0;
      }
   }

   public void setTblBg(CTTableBackgroundStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableBackgroundStyle var3 = null;
         var3 = (CTTableBackgroundStyle)this.get_store().find_element_user(TBLBG$0, 0);
         if(var3 == null) {
            var3 = (CTTableBackgroundStyle)this.get_store().add_element_user(TBLBG$0);
         }

         var3.set(var1);
      }
   }

   public CTTableBackgroundStyle addNewTblBg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableBackgroundStyle var2 = null;
         var2 = (CTTableBackgroundStyle)this.get_store().add_element_user(TBLBG$0);
         return var2;
      }
   }

   public void unsetTblBg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLBG$0, 0);
      }
   }

   public CTTablePartStyle getWholeTbl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(WHOLETBL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWholeTbl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WHOLETBL$2) != 0;
      }
   }

   public void setWholeTbl(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(WHOLETBL$2, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(WHOLETBL$2);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewWholeTbl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(WHOLETBL$2);
         return var2;
      }
   }

   public void unsetWholeTbl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WHOLETBL$2, 0);
      }
   }

   public CTTablePartStyle getBand1H() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(BAND1H$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBand1H() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BAND1H$4) != 0;
      }
   }

   public void setBand1H(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(BAND1H$4, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(BAND1H$4);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewBand1H() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(BAND1H$4);
         return var2;
      }
   }

   public void unsetBand1H() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BAND1H$4, 0);
      }
   }

   public CTTablePartStyle getBand2H() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(BAND2H$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBand2H() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BAND2H$6) != 0;
      }
   }

   public void setBand2H(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(BAND2H$6, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(BAND2H$6);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewBand2H() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(BAND2H$6);
         return var2;
      }
   }

   public void unsetBand2H() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BAND2H$6, 0);
      }
   }

   public CTTablePartStyle getBand1V() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(BAND1V$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBand1V() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BAND1V$8) != 0;
      }
   }

   public void setBand1V(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(BAND1V$8, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(BAND1V$8);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewBand1V() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(BAND1V$8);
         return var2;
      }
   }

   public void unsetBand1V() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BAND1V$8, 0);
      }
   }

   public CTTablePartStyle getBand2V() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(BAND2V$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBand2V() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BAND2V$10) != 0;
      }
   }

   public void setBand2V(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(BAND2V$10, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(BAND2V$10);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewBand2V() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(BAND2V$10);
         return var2;
      }
   }

   public void unsetBand2V() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BAND2V$10, 0);
      }
   }

   public CTTablePartStyle getLastCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(LASTCOL$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLastCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LASTCOL$12) != 0;
      }
   }

   public void setLastCol(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(LASTCOL$12, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(LASTCOL$12);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewLastCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(LASTCOL$12);
         return var2;
      }
   }

   public void unsetLastCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LASTCOL$12, 0);
      }
   }

   public CTTablePartStyle getFirstCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(FIRSTCOL$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFirstCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FIRSTCOL$14) != 0;
      }
   }

   public void setFirstCol(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(FIRSTCOL$14, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(FIRSTCOL$14);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewFirstCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(FIRSTCOL$14);
         return var2;
      }
   }

   public void unsetFirstCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FIRSTCOL$14, 0);
      }
   }

   public CTTablePartStyle getLastRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(LASTROW$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLastRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LASTROW$16) != 0;
      }
   }

   public void setLastRow(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(LASTROW$16, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(LASTROW$16);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewLastRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(LASTROW$16);
         return var2;
      }
   }

   public void unsetLastRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LASTROW$16, 0);
      }
   }

   public CTTablePartStyle getSeCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(SECELL$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSeCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SECELL$18) != 0;
      }
   }

   public void setSeCell(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(SECELL$18, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(SECELL$18);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewSeCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(SECELL$18);
         return var2;
      }
   }

   public void unsetSeCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SECELL$18, 0);
      }
   }

   public CTTablePartStyle getSwCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(SWCELL$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSwCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SWCELL$20) != 0;
      }
   }

   public void setSwCell(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(SWCELL$20, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(SWCELL$20);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewSwCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(SWCELL$20);
         return var2;
      }
   }

   public void unsetSwCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SWCELL$20, 0);
      }
   }

   public CTTablePartStyle getFirstRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(FIRSTROW$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFirstRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FIRSTROW$22) != 0;
      }
   }

   public void setFirstRow(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(FIRSTROW$22, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(FIRSTROW$22);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewFirstRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(FIRSTROW$22);
         return var2;
      }
   }

   public void unsetFirstRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FIRSTROW$22, 0);
      }
   }

   public CTTablePartStyle getNeCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(NECELL$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNeCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NECELL$24) != 0;
      }
   }

   public void setNeCell(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(NECELL$24, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(NECELL$24);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewNeCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(NECELL$24);
         return var2;
      }
   }

   public void unsetNeCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NECELL$24, 0);
      }
   }

   public CTTablePartStyle getNwCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().find_element_user(NWCELL$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNwCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NWCELL$26) != 0;
      }
   }

   public void setNwCell(CTTablePartStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var3 = null;
         var3 = (CTTablePartStyle)this.get_store().find_element_user(NWCELL$26, 0);
         if(var3 == null) {
            var3 = (CTTablePartStyle)this.get_store().add_element_user(NWCELL$26);
         }

         var3.set(var1);
      }
   }

   public CTTablePartStyle addNewNwCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTablePartStyle var2 = null;
         var2 = (CTTablePartStyle)this.get_store().add_element_user(NWCELL$26);
         return var2;
      }
   }

   public void unsetNwCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NWCELL$26, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$28) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$28, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$28);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$28);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$28, 0);
      }
   }

   public String getStyleId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STYLEID$30);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STGuid xgetStyleId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGuid var2 = null;
         var2 = (STGuid)this.get_store().find_attribute_user(STYLEID$30);
         return var2;
      }
   }

   public void setStyleId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STYLEID$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STYLEID$30);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetStyleId(STGuid var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGuid var3 = null;
         var3 = (STGuid)this.get_store().find_attribute_user(STYLEID$30);
         if(var3 == null) {
            var3 = (STGuid)this.get_store().add_attribute_user(STYLEID$30);
         }

         var3.set(var1);
      }
   }

   public String getStyleName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STYLENAME$32);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetStyleName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(STYLENAME$32);
         return var2;
      }
   }

   public void setStyleName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STYLENAME$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STYLENAME$32);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetStyleName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(STYLENAME$32);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(STYLENAME$32);
         }

         var3.set(var1);
      }
   }

}
