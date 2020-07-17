package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType;

public class CTTableCellPropertiesImpl extends XmlComplexContentImpl implements CTTableCellProperties {

   private static final QName LNL$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnL");
   private static final QName LNR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnR");
   private static final QName LNT$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnT");
   private static final QName LNB$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnB");
   private static final QName LNTLTOBR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnTlToBr");
   private static final QName LNBLTOTR$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnBlToTr");
   private static final QName CELL3D$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cell3D");
   private static final QName NOFILL$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
   private static final QName SOLIDFILL$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
   private static final QName GRADFILL$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
   private static final QName BLIPFILL$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blipFill");
   private static final QName PATTFILL$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
   private static final QName GRPFILL$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpFill");
   private static final QName EXTLST$26 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName MARL$28 = new QName("", "marL");
   private static final QName MARR$30 = new QName("", "marR");
   private static final QName MART$32 = new QName("", "marT");
   private static final QName MARB$34 = new QName("", "marB");
   private static final QName VERT$36 = new QName("", "vert");
   private static final QName ANCHOR$38 = new QName("", "anchor");
   private static final QName ANCHORCTR$40 = new QName("", "anchorCtr");
   private static final QName HORZOVERFLOW$42 = new QName("", "horzOverflow");


   public CTTableCellPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTLineProperties getLnL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().find_element_user(LNL$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLnL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LNL$0) != 0;
      }
   }

   public void setLnL(CTLineProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().find_element_user(LNL$0, 0);
         if(var3 == null) {
            var3 = (CTLineProperties)this.get_store().add_element_user(LNL$0);
         }

         var3.set(var1);
      }
   }

   public CTLineProperties addNewLnL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().add_element_user(LNL$0);
         return var2;
      }
   }

   public void unsetLnL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LNL$0, 0);
      }
   }

   public CTLineProperties getLnR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().find_element_user(LNR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLnR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LNR$2) != 0;
      }
   }

   public void setLnR(CTLineProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().find_element_user(LNR$2, 0);
         if(var3 == null) {
            var3 = (CTLineProperties)this.get_store().add_element_user(LNR$2);
         }

         var3.set(var1);
      }
   }

   public CTLineProperties addNewLnR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().add_element_user(LNR$2);
         return var2;
      }
   }

   public void unsetLnR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LNR$2, 0);
      }
   }

   public CTLineProperties getLnT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().find_element_user(LNT$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLnT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LNT$4) != 0;
      }
   }

   public void setLnT(CTLineProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().find_element_user(LNT$4, 0);
         if(var3 == null) {
            var3 = (CTLineProperties)this.get_store().add_element_user(LNT$4);
         }

         var3.set(var1);
      }
   }

   public CTLineProperties addNewLnT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().add_element_user(LNT$4);
         return var2;
      }
   }

   public void unsetLnT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LNT$4, 0);
      }
   }

   public CTLineProperties getLnB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().find_element_user(LNB$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLnB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LNB$6) != 0;
      }
   }

   public void setLnB(CTLineProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().find_element_user(LNB$6, 0);
         if(var3 == null) {
            var3 = (CTLineProperties)this.get_store().add_element_user(LNB$6);
         }

         var3.set(var1);
      }
   }

   public CTLineProperties addNewLnB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().add_element_user(LNB$6);
         return var2;
      }
   }

   public void unsetLnB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LNB$6, 0);
      }
   }

   public CTLineProperties getLnTlToBr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().find_element_user(LNTLTOBR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLnTlToBr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LNTLTOBR$8) != 0;
      }
   }

   public void setLnTlToBr(CTLineProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().find_element_user(LNTLTOBR$8, 0);
         if(var3 == null) {
            var3 = (CTLineProperties)this.get_store().add_element_user(LNTLTOBR$8);
         }

         var3.set(var1);
      }
   }

   public CTLineProperties addNewLnTlToBr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().add_element_user(LNTLTOBR$8);
         return var2;
      }
   }

   public void unsetLnTlToBr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LNTLTOBR$8, 0);
      }
   }

   public CTLineProperties getLnBlToTr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().find_element_user(LNBLTOTR$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLnBlToTr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LNBLTOTR$10) != 0;
      }
   }

   public void setLnBlToTr(CTLineProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().find_element_user(LNBLTOTR$10, 0);
         if(var3 == null) {
            var3 = (CTLineProperties)this.get_store().add_element_user(LNBLTOTR$10);
         }

         var3.set(var1);
      }
   }

   public CTLineProperties addNewLnBlToTr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().add_element_user(LNBLTOTR$10);
         return var2;
      }
   }

   public void unsetLnBlToTr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LNBLTOTR$10, 0);
      }
   }

   public CTCell3D getCell3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCell3D var2 = null;
         var2 = (CTCell3D)this.get_store().find_element_user(CELL3D$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCell3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CELL3D$12) != 0;
      }
   }

   public void setCell3D(CTCell3D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCell3D var3 = null;
         var3 = (CTCell3D)this.get_store().find_element_user(CELL3D$12, 0);
         if(var3 == null) {
            var3 = (CTCell3D)this.get_store().add_element_user(CELL3D$12);
         }

         var3.set(var1);
      }
   }

   public CTCell3D addNewCell3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCell3D var2 = null;
         var2 = (CTCell3D)this.get_store().add_element_user(CELL3D$12);
         return var2;
      }
   }

   public void unsetCell3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CELL3D$12, 0);
      }
   }

   public CTNoFillProperties getNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOFILL$14) != 0;
      }
   }

   public void setNoFill(CTNoFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var3 = null;
         var3 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$14, 0);
         if(var3 == null) {
            var3 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$14);
         }

         var3.set(var1);
      }
   }

   public CTNoFillProperties addNewNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$14);
         return var2;
      }
   }

   public void unsetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOFILL$14, 0);
      }
   }

   public CTSolidColorFillProperties getSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SOLIDFILL$16) != 0;
      }
   }

   public void setSolidFill(CTSolidColorFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var3 = null;
         var3 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$16, 0);
         if(var3 == null) {
            var3 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$16);
         }

         var3.set(var1);
      }
   }

   public CTSolidColorFillProperties addNewSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$16);
         return var2;
      }
   }

   public void unsetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SOLIDFILL$16, 0);
      }
   }

   public CTGradientFillProperties getGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRADFILL$18) != 0;
      }
   }

   public void setGradFill(CTGradientFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var3 = null;
         var3 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$18, 0);
         if(var3 == null) {
            var3 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$18);
         }

         var3.set(var1);
      }
   }

   public CTGradientFillProperties addNewGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$18);
         return var2;
      }
   }

   public void unsetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRADFILL$18, 0);
      }
   }

   public CTBlipFillProperties getBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLIPFILL$20) != 0;
      }
   }

   public void setBlipFill(CTBlipFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var3 = null;
         var3 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$20, 0);
         if(var3 == null) {
            var3 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$20);
         }

         var3.set(var1);
      }
   }

   public CTBlipFillProperties addNewBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$20);
         return var2;
      }
   }

   public void unsetBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLIPFILL$20, 0);
      }
   }

   public CTPatternFillProperties getPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PATTFILL$22) != 0;
      }
   }

   public void setPattFill(CTPatternFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var3 = null;
         var3 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$22, 0);
         if(var3 == null) {
            var3 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$22);
         }

         var3.set(var1);
      }
   }

   public CTPatternFillProperties addNewPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$22);
         return var2;
      }
   }

   public void unsetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PATTFILL$22, 0);
      }
   }

   public CTGroupFillProperties getGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRPFILL$24) != 0;
      }
   }

   public void setGrpFill(CTGroupFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var3 = null;
         var3 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$24, 0);
         if(var3 == null) {
            var3 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$24);
         }

         var3.set(var1);
      }
   }

   public CTGroupFillProperties addNewGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$24);
         return var2;
      }
   }

   public void unsetGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRPFILL$24, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$26) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$26, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$26);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$26);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$26, 0);
      }
   }

   public int getMarL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MARL$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MARL$28);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STCoordinate32 xgetMarL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var2 = null;
         var2 = (STCoordinate32)this.get_store().find_attribute_user(MARL$28);
         if(var2 == null) {
            var2 = (STCoordinate32)this.get_default_attribute_value(MARL$28);
         }

         return var2;
      }
   }

   public boolean isSetMarL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MARL$28) != null;
      }
   }

   public void setMarL(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MARL$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MARL$28);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetMarL(STCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var3 = null;
         var3 = (STCoordinate32)this.get_store().find_attribute_user(MARL$28);
         if(var3 == null) {
            var3 = (STCoordinate32)this.get_store().add_attribute_user(MARL$28);
         }

         var3.set(var1);
      }
   }

   public void unsetMarL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MARL$28);
      }
   }

   public int getMarR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MARR$30);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MARR$30);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STCoordinate32 xgetMarR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var2 = null;
         var2 = (STCoordinate32)this.get_store().find_attribute_user(MARR$30);
         if(var2 == null) {
            var2 = (STCoordinate32)this.get_default_attribute_value(MARR$30);
         }

         return var2;
      }
   }

   public boolean isSetMarR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MARR$30) != null;
      }
   }

   public void setMarR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MARR$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MARR$30);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetMarR(STCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var3 = null;
         var3 = (STCoordinate32)this.get_store().find_attribute_user(MARR$30);
         if(var3 == null) {
            var3 = (STCoordinate32)this.get_store().add_attribute_user(MARR$30);
         }

         var3.set(var1);
      }
   }

   public void unsetMarR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MARR$30);
      }
   }

   public int getMarT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MART$32);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MART$32);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STCoordinate32 xgetMarT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var2 = null;
         var2 = (STCoordinate32)this.get_store().find_attribute_user(MART$32);
         if(var2 == null) {
            var2 = (STCoordinate32)this.get_default_attribute_value(MART$32);
         }

         return var2;
      }
   }

   public boolean isSetMarT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MART$32) != null;
      }
   }

   public void setMarT(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MART$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MART$32);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetMarT(STCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var3 = null;
         var3 = (STCoordinate32)this.get_store().find_attribute_user(MART$32);
         if(var3 == null) {
            var3 = (STCoordinate32)this.get_store().add_attribute_user(MART$32);
         }

         var3.set(var1);
      }
   }

   public void unsetMarT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MART$32);
      }
   }

   public int getMarB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MARB$34);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MARB$34);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STCoordinate32 xgetMarB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var2 = null;
         var2 = (STCoordinate32)this.get_store().find_attribute_user(MARB$34);
         if(var2 == null) {
            var2 = (STCoordinate32)this.get_default_attribute_value(MARB$34);
         }

         return var2;
      }
   }

   public boolean isSetMarB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MARB$34) != null;
      }
   }

   public void setMarB(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MARB$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MARB$34);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetMarB(STCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var3 = null;
         var3 = (STCoordinate32)this.get_store().find_attribute_user(MARB$34);
         if(var3 == null) {
            var3 = (STCoordinate32)this.get_store().add_attribute_user(MARB$34);
         }

         var3.set(var1);
      }
   }

   public void unsetMarB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MARB$34);
      }
   }

   public STTextVerticalType.Enum getVert() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VERT$36);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VERT$36);
         }

         return var2 == null?null:(STTextVerticalType.Enum)var2.getEnumValue();
      }
   }

   public STTextVerticalType xgetVert() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextVerticalType var2 = null;
         var2 = (STTextVerticalType)this.get_store().find_attribute_user(VERT$36);
         if(var2 == null) {
            var2 = (STTextVerticalType)this.get_default_attribute_value(VERT$36);
         }

         return var2;
      }
   }

   public boolean isSetVert() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VERT$36) != null;
      }
   }

   public void setVert(STTextVerticalType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VERT$36);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VERT$36);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetVert(STTextVerticalType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextVerticalType var3 = null;
         var3 = (STTextVerticalType)this.get_store().find_attribute_user(VERT$36);
         if(var3 == null) {
            var3 = (STTextVerticalType)this.get_store().add_attribute_user(VERT$36);
         }

         var3.set(var1);
      }
   }

   public void unsetVert() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VERT$36);
      }
   }

   public STTextAnchoringType.Enum getAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ANCHOR$38);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ANCHOR$38);
         }

         return var2 == null?null:(STTextAnchoringType.Enum)var2.getEnumValue();
      }
   }

   public STTextAnchoringType xgetAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextAnchoringType var2 = null;
         var2 = (STTextAnchoringType)this.get_store().find_attribute_user(ANCHOR$38);
         if(var2 == null) {
            var2 = (STTextAnchoringType)this.get_default_attribute_value(ANCHOR$38);
         }

         return var2;
      }
   }

   public boolean isSetAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ANCHOR$38) != null;
      }
   }

   public void setAnchor(STTextAnchoringType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ANCHOR$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ANCHOR$38);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAnchor(STTextAnchoringType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextAnchoringType var3 = null;
         var3 = (STTextAnchoringType)this.get_store().find_attribute_user(ANCHOR$38);
         if(var3 == null) {
            var3 = (STTextAnchoringType)this.get_store().add_attribute_user(ANCHOR$38);
         }

         var3.set(var1);
      }
   }

   public void unsetAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ANCHOR$38);
      }
   }

   public boolean getAnchorCtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ANCHORCTR$40);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ANCHORCTR$40);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAnchorCtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ANCHORCTR$40);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ANCHORCTR$40);
         }

         return var2;
      }
   }

   public boolean isSetAnchorCtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ANCHORCTR$40) != null;
      }
   }

   public void setAnchorCtr(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ANCHORCTR$40);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ANCHORCTR$40);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAnchorCtr(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ANCHORCTR$40);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ANCHORCTR$40);
         }

         var3.set(var1);
      }
   }

   public void unsetAnchorCtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ANCHORCTR$40);
      }
   }

   public STTextHorzOverflowType.Enum getHorzOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HORZOVERFLOW$42);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HORZOVERFLOW$42);
         }

         return var2 == null?null:(STTextHorzOverflowType.Enum)var2.getEnumValue();
      }
   }

   public STTextHorzOverflowType xgetHorzOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextHorzOverflowType var2 = null;
         var2 = (STTextHorzOverflowType)this.get_store().find_attribute_user(HORZOVERFLOW$42);
         if(var2 == null) {
            var2 = (STTextHorzOverflowType)this.get_default_attribute_value(HORZOVERFLOW$42);
         }

         return var2;
      }
   }

   public boolean isSetHorzOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HORZOVERFLOW$42) != null;
      }
   }

   public void setHorzOverflow(STTextHorzOverflowType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HORZOVERFLOW$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HORZOVERFLOW$42);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHorzOverflow(STTextHorzOverflowType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextHorzOverflowType var3 = null;
         var3 = (STTextHorzOverflowType)this.get_store().find_attribute_user(HORZOVERFLOW$42);
         if(var3 == null) {
            var3 = (STTextHorzOverflowType)this.get_store().add_attribute_user(HORZOVERFLOW$42);
         }

         var3.set(var1);
      }
   }

   public void unsetHorzOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HORZOVERFLOW$42);
      }
   }

}
