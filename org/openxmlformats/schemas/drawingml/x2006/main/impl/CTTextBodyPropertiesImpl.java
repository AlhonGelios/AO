package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit;
import org.openxmlformats.schemas.drawingml.x2006.main.STAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextColumnCount;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType;

public class CTTextBodyPropertiesImpl extends XmlComplexContentImpl implements CTTextBodyProperties {

   private static final QName PRSTTXWARP$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstTxWarp");
   private static final QName NOAUTOFIT$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noAutofit");
   private static final QName NORMAUTOFIT$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "normAutofit");
   private static final QName SPAUTOFIT$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spAutoFit");
   private static final QName SCENE3D$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scene3d");
   private static final QName SP3D$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sp3d");
   private static final QName FLATTX$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "flatTx");
   private static final QName EXTLST$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName ROT$16 = new QName("", "rot");
   private static final QName SPCFIRSTLASTPARA$18 = new QName("", "spcFirstLastPara");
   private static final QName VERTOVERFLOW$20 = new QName("", "vertOverflow");
   private static final QName HORZOVERFLOW$22 = new QName("", "horzOverflow");
   private static final QName VERT$24 = new QName("", "vert");
   private static final QName WRAP$26 = new QName("", "wrap");
   private static final QName LINS$28 = new QName("", "lIns");
   private static final QName TINS$30 = new QName("", "tIns");
   private static final QName RINS$32 = new QName("", "rIns");
   private static final QName BINS$34 = new QName("", "bIns");
   private static final QName NUMCOL$36 = new QName("", "numCol");
   private static final QName SPCCOL$38 = new QName("", "spcCol");
   private static final QName RTLCOL$40 = new QName("", "rtlCol");
   private static final QName FROMWORDART$42 = new QName("", "fromWordArt");
   private static final QName ANCHOR$44 = new QName("", "anchor");
   private static final QName ANCHORCTR$46 = new QName("", "anchorCtr");
   private static final QName FORCEAA$48 = new QName("", "forceAA");
   private static final QName UPRIGHT$50 = new QName("", "upright");
   private static final QName COMPATLNSPC$52 = new QName("", "compatLnSpc");


   public CTTextBodyPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTPresetTextShape getPrstTxWarp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetTextShape var2 = null;
         var2 = (CTPresetTextShape)this.get_store().find_element_user(PRSTTXWARP$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrstTxWarp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRSTTXWARP$0) != 0;
      }
   }

   public void setPrstTxWarp(CTPresetTextShape var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetTextShape var3 = null;
         var3 = (CTPresetTextShape)this.get_store().find_element_user(PRSTTXWARP$0, 0);
         if(var3 == null) {
            var3 = (CTPresetTextShape)this.get_store().add_element_user(PRSTTXWARP$0);
         }

         var3.set(var1);
      }
   }

   public CTPresetTextShape addNewPrstTxWarp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetTextShape var2 = null;
         var2 = (CTPresetTextShape)this.get_store().add_element_user(PRSTTXWARP$0);
         return var2;
      }
   }

   public void unsetPrstTxWarp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRSTTXWARP$0, 0);
      }
   }

   public CTTextNoAutofit getNoAutofit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextNoAutofit var2 = null;
         var2 = (CTTextNoAutofit)this.get_store().find_element_user(NOAUTOFIT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoAutofit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOAUTOFIT$2) != 0;
      }
   }

   public void setNoAutofit(CTTextNoAutofit var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextNoAutofit var3 = null;
         var3 = (CTTextNoAutofit)this.get_store().find_element_user(NOAUTOFIT$2, 0);
         if(var3 == null) {
            var3 = (CTTextNoAutofit)this.get_store().add_element_user(NOAUTOFIT$2);
         }

         var3.set(var1);
      }
   }

   public CTTextNoAutofit addNewNoAutofit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextNoAutofit var2 = null;
         var2 = (CTTextNoAutofit)this.get_store().add_element_user(NOAUTOFIT$2);
         return var2;
      }
   }

   public void unsetNoAutofit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOAUTOFIT$2, 0);
      }
   }

   public CTTextNormalAutofit getNormAutofit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextNormalAutofit var2 = null;
         var2 = (CTTextNormalAutofit)this.get_store().find_element_user(NORMAUTOFIT$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNormAutofit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NORMAUTOFIT$4) != 0;
      }
   }

   public void setNormAutofit(CTTextNormalAutofit var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextNormalAutofit var3 = null;
         var3 = (CTTextNormalAutofit)this.get_store().find_element_user(NORMAUTOFIT$4, 0);
         if(var3 == null) {
            var3 = (CTTextNormalAutofit)this.get_store().add_element_user(NORMAUTOFIT$4);
         }

         var3.set(var1);
      }
   }

   public CTTextNormalAutofit addNewNormAutofit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextNormalAutofit var2 = null;
         var2 = (CTTextNormalAutofit)this.get_store().add_element_user(NORMAUTOFIT$4);
         return var2;
      }
   }

   public void unsetNormAutofit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NORMAUTOFIT$4, 0);
      }
   }

   public CTTextShapeAutofit getSpAutoFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextShapeAutofit var2 = null;
         var2 = (CTTextShapeAutofit)this.get_store().find_element_user(SPAUTOFIT$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpAutoFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPAUTOFIT$6) != 0;
      }
   }

   public void setSpAutoFit(CTTextShapeAutofit var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextShapeAutofit var3 = null;
         var3 = (CTTextShapeAutofit)this.get_store().find_element_user(SPAUTOFIT$6, 0);
         if(var3 == null) {
            var3 = (CTTextShapeAutofit)this.get_store().add_element_user(SPAUTOFIT$6);
         }

         var3.set(var1);
      }
   }

   public CTTextShapeAutofit addNewSpAutoFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextShapeAutofit var2 = null;
         var2 = (CTTextShapeAutofit)this.get_store().add_element_user(SPAUTOFIT$6);
         return var2;
      }
   }

   public void unsetSpAutoFit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPAUTOFIT$6, 0);
      }
   }

   public CTScene3D getScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var2 = null;
         var2 = (CTScene3D)this.get_store().find_element_user(SCENE3D$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCENE3D$8) != 0;
      }
   }

   public void setScene3D(CTScene3D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var3 = null;
         var3 = (CTScene3D)this.get_store().find_element_user(SCENE3D$8, 0);
         if(var3 == null) {
            var3 = (CTScene3D)this.get_store().add_element_user(SCENE3D$8);
         }

         var3.set(var1);
      }
   }

   public CTScene3D addNewScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var2 = null;
         var2 = (CTScene3D)this.get_store().add_element_user(SCENE3D$8);
         return var2;
      }
   }

   public void unsetScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCENE3D$8, 0);
      }
   }

   public CTShape3D getSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape3D var2 = null;
         var2 = (CTShape3D)this.get_store().find_element_user(SP3D$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SP3D$10) != 0;
      }
   }

   public void setSp3D(CTShape3D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape3D var3 = null;
         var3 = (CTShape3D)this.get_store().find_element_user(SP3D$10, 0);
         if(var3 == null) {
            var3 = (CTShape3D)this.get_store().add_element_user(SP3D$10);
         }

         var3.set(var1);
      }
   }

   public CTShape3D addNewSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape3D var2 = null;
         var2 = (CTShape3D)this.get_store().add_element_user(SP3D$10);
         return var2;
      }
   }

   public void unsetSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SP3D$10, 0);
      }
   }

   public CTFlatText getFlatTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFlatText var2 = null;
         var2 = (CTFlatText)this.get_store().find_element_user(FLATTX$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFlatTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FLATTX$12) != 0;
      }
   }

   public void setFlatTx(CTFlatText var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFlatText var3 = null;
         var3 = (CTFlatText)this.get_store().find_element_user(FLATTX$12, 0);
         if(var3 == null) {
            var3 = (CTFlatText)this.get_store().add_element_user(FLATTX$12);
         }

         var3.set(var1);
      }
   }

   public CTFlatText addNewFlatTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFlatText var2 = null;
         var2 = (CTFlatText)this.get_store().add_element_user(FLATTX$12);
         return var2;
      }
   }

   public void unsetFlatTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FLATTX$12, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$14) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$14, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$14);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$14);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$14, 0);
      }
   }

   public int getRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROT$16);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STAngle xgetRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAngle var2 = null;
         var2 = (STAngle)this.get_store().find_attribute_user(ROT$16);
         return var2;
      }
   }

   public boolean isSetRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ROT$16) != null;
      }
   }

   public void setRot(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ROT$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ROT$16);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetRot(STAngle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAngle var3 = null;
         var3 = (STAngle)this.get_store().find_attribute_user(ROT$16);
         if(var3 == null) {
            var3 = (STAngle)this.get_store().add_attribute_user(ROT$16);
         }

         var3.set(var1);
      }
   }

   public void unsetRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ROT$16);
      }
   }

   public boolean getSpcFirstLastPara() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SPCFIRSTLASTPARA$18);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSpcFirstLastPara() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SPCFIRSTLASTPARA$18);
         return var2;
      }
   }

   public boolean isSetSpcFirstLastPara() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SPCFIRSTLASTPARA$18) != null;
      }
   }

   public void setSpcFirstLastPara(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SPCFIRSTLASTPARA$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SPCFIRSTLASTPARA$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSpcFirstLastPara(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SPCFIRSTLASTPARA$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SPCFIRSTLASTPARA$18);
         }

         var3.set(var1);
      }
   }

   public void unsetSpcFirstLastPara() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SPCFIRSTLASTPARA$18);
      }
   }

   public STTextVertOverflowType.Enum getVertOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VERTOVERFLOW$20);
         return var2 == null?null:(STTextVertOverflowType.Enum)var2.getEnumValue();
      }
   }

   public STTextVertOverflowType xgetVertOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextVertOverflowType var2 = null;
         var2 = (STTextVertOverflowType)this.get_store().find_attribute_user(VERTOVERFLOW$20);
         return var2;
      }
   }

   public boolean isSetVertOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VERTOVERFLOW$20) != null;
      }
   }

   public void setVertOverflow(STTextVertOverflowType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VERTOVERFLOW$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VERTOVERFLOW$20);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetVertOverflow(STTextVertOverflowType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextVertOverflowType var3 = null;
         var3 = (STTextVertOverflowType)this.get_store().find_attribute_user(VERTOVERFLOW$20);
         if(var3 == null) {
            var3 = (STTextVertOverflowType)this.get_store().add_attribute_user(VERTOVERFLOW$20);
         }

         var3.set(var1);
      }
   }

   public void unsetVertOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VERTOVERFLOW$20);
      }
   }

   public STTextHorzOverflowType.Enum getHorzOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HORZOVERFLOW$22);
         return var2 == null?null:(STTextHorzOverflowType.Enum)var2.getEnumValue();
      }
   }

   public STTextHorzOverflowType xgetHorzOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextHorzOverflowType var2 = null;
         var2 = (STTextHorzOverflowType)this.get_store().find_attribute_user(HORZOVERFLOW$22);
         return var2;
      }
   }

   public boolean isSetHorzOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HORZOVERFLOW$22) != null;
      }
   }

   public void setHorzOverflow(STTextHorzOverflowType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HORZOVERFLOW$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HORZOVERFLOW$22);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHorzOverflow(STTextHorzOverflowType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextHorzOverflowType var3 = null;
         var3 = (STTextHorzOverflowType)this.get_store().find_attribute_user(HORZOVERFLOW$22);
         if(var3 == null) {
            var3 = (STTextHorzOverflowType)this.get_store().add_attribute_user(HORZOVERFLOW$22);
         }

         var3.set(var1);
      }
   }

   public void unsetHorzOverflow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HORZOVERFLOW$22);
      }
   }

   public STTextVerticalType.Enum getVert() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VERT$24);
         return var2 == null?null:(STTextVerticalType.Enum)var2.getEnumValue();
      }
   }

   public STTextVerticalType xgetVert() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextVerticalType var2 = null;
         var2 = (STTextVerticalType)this.get_store().find_attribute_user(VERT$24);
         return var2;
      }
   }

   public boolean isSetVert() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VERT$24) != null;
      }
   }

   public void setVert(STTextVerticalType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VERT$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VERT$24);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetVert(STTextVerticalType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextVerticalType var3 = null;
         var3 = (STTextVerticalType)this.get_store().find_attribute_user(VERT$24);
         if(var3 == null) {
            var3 = (STTextVerticalType)this.get_store().add_attribute_user(VERT$24);
         }

         var3.set(var1);
      }
   }

   public void unsetVert() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VERT$24);
      }
   }

   public STTextWrappingType.Enum getWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WRAP$26);
         return var2 == null?null:(STTextWrappingType.Enum)var2.getEnumValue();
      }
   }

   public STTextWrappingType xgetWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextWrappingType var2 = null;
         var2 = (STTextWrappingType)this.get_store().find_attribute_user(WRAP$26);
         return var2;
      }
   }

   public boolean isSetWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WRAP$26) != null;
      }
   }

   public void setWrap(STTextWrappingType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(WRAP$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(WRAP$26);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetWrap(STTextWrappingType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextWrappingType var3 = null;
         var3 = (STTextWrappingType)this.get_store().find_attribute_user(WRAP$26);
         if(var3 == null) {
            var3 = (STTextWrappingType)this.get_store().add_attribute_user(WRAP$26);
         }

         var3.set(var1);
      }
   }

   public void unsetWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WRAP$26);
      }
   }

   public int getLIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LINS$28);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STCoordinate32 xgetLIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var2 = null;
         var2 = (STCoordinate32)this.get_store().find_attribute_user(LINS$28);
         return var2;
      }
   }

   public boolean isSetLIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LINS$28) != null;
      }
   }

   public void setLIns(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LINS$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LINS$28);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetLIns(STCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var3 = null;
         var3 = (STCoordinate32)this.get_store().find_attribute_user(LINS$28);
         if(var3 == null) {
            var3 = (STCoordinate32)this.get_store().add_attribute_user(LINS$28);
         }

         var3.set(var1);
      }
   }

   public void unsetLIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LINS$28);
      }
   }

   public int getTIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TINS$30);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STCoordinate32 xgetTIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var2 = null;
         var2 = (STCoordinate32)this.get_store().find_attribute_user(TINS$30);
         return var2;
      }
   }

   public boolean isSetTIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TINS$30) != null;
      }
   }

   public void setTIns(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TINS$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TINS$30);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetTIns(STCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var3 = null;
         var3 = (STCoordinate32)this.get_store().find_attribute_user(TINS$30);
         if(var3 == null) {
            var3 = (STCoordinate32)this.get_store().add_attribute_user(TINS$30);
         }

         var3.set(var1);
      }
   }

   public void unsetTIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TINS$30);
      }
   }

   public int getRIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RINS$32);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STCoordinate32 xgetRIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var2 = null;
         var2 = (STCoordinate32)this.get_store().find_attribute_user(RINS$32);
         return var2;
      }
   }

   public boolean isSetRIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RINS$32) != null;
      }
   }

   public void setRIns(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RINS$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RINS$32);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetRIns(STCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var3 = null;
         var3 = (STCoordinate32)this.get_store().find_attribute_user(RINS$32);
         if(var3 == null) {
            var3 = (STCoordinate32)this.get_store().add_attribute_user(RINS$32);
         }

         var3.set(var1);
      }
   }

   public void unsetRIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RINS$32);
      }
   }

   public int getBIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BINS$34);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STCoordinate32 xgetBIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var2 = null;
         var2 = (STCoordinate32)this.get_store().find_attribute_user(BINS$34);
         return var2;
      }
   }

   public boolean isSetBIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BINS$34) != null;
      }
   }

   public void setBIns(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BINS$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BINS$34);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetBIns(STCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var3 = null;
         var3 = (STCoordinate32)this.get_store().find_attribute_user(BINS$34);
         if(var3 == null) {
            var3 = (STCoordinate32)this.get_store().add_attribute_user(BINS$34);
         }

         var3.set(var1);
      }
   }

   public void unsetBIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BINS$34);
      }
   }

   public int getNumCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NUMCOL$36);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextColumnCount xgetNumCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextColumnCount var2 = null;
         var2 = (STTextColumnCount)this.get_store().find_attribute_user(NUMCOL$36);
         return var2;
      }
   }

   public boolean isSetNumCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NUMCOL$36) != null;
      }
   }

   public void setNumCol(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NUMCOL$36);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NUMCOL$36);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetNumCol(STTextColumnCount var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextColumnCount var3 = null;
         var3 = (STTextColumnCount)this.get_store().find_attribute_user(NUMCOL$36);
         if(var3 == null) {
            var3 = (STTextColumnCount)this.get_store().add_attribute_user(NUMCOL$36);
         }

         var3.set(var1);
      }
   }

   public void unsetNumCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NUMCOL$36);
      }
   }

   public int getSpcCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SPCCOL$38);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPositiveCoordinate32 xgetSpcCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate32 var2 = null;
         var2 = (STPositiveCoordinate32)this.get_store().find_attribute_user(SPCCOL$38);
         return var2;
      }
   }

   public boolean isSetSpcCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SPCCOL$38) != null;
      }
   }

   public void setSpcCol(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SPCCOL$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SPCCOL$38);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSpcCol(STPositiveCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate32 var3 = null;
         var3 = (STPositiveCoordinate32)this.get_store().find_attribute_user(SPCCOL$38);
         if(var3 == null) {
            var3 = (STPositiveCoordinate32)this.get_store().add_attribute_user(SPCCOL$38);
         }

         var3.set(var1);
      }
   }

   public void unsetSpcCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SPCCOL$38);
      }
   }

   public boolean getRtlCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RTLCOL$40);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRtlCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(RTLCOL$40);
         return var2;
      }
   }

   public boolean isSetRtlCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RTLCOL$40) != null;
      }
   }

   public void setRtlCol(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RTLCOL$40);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RTLCOL$40);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRtlCol(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(RTLCOL$40);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(RTLCOL$40);
         }

         var3.set(var1);
      }
   }

   public void unsetRtlCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RTLCOL$40);
      }
   }

   public boolean getFromWordArt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FROMWORDART$42);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFromWordArt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FROMWORDART$42);
         return var2;
      }
   }

   public boolean isSetFromWordArt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FROMWORDART$42) != null;
      }
   }

   public void setFromWordArt(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FROMWORDART$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FROMWORDART$42);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFromWordArt(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FROMWORDART$42);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FROMWORDART$42);
         }

         var3.set(var1);
      }
   }

   public void unsetFromWordArt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FROMWORDART$42);
      }
   }

   public STTextAnchoringType.Enum getAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ANCHOR$44);
         return var2 == null?null:(STTextAnchoringType.Enum)var2.getEnumValue();
      }
   }

   public STTextAnchoringType xgetAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextAnchoringType var2 = null;
         var2 = (STTextAnchoringType)this.get_store().find_attribute_user(ANCHOR$44);
         return var2;
      }
   }

   public boolean isSetAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ANCHOR$44) != null;
      }
   }

   public void setAnchor(STTextAnchoringType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ANCHOR$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ANCHOR$44);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAnchor(STTextAnchoringType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextAnchoringType var3 = null;
         var3 = (STTextAnchoringType)this.get_store().find_attribute_user(ANCHOR$44);
         if(var3 == null) {
            var3 = (STTextAnchoringType)this.get_store().add_attribute_user(ANCHOR$44);
         }

         var3.set(var1);
      }
   }

   public void unsetAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ANCHOR$44);
      }
   }

   public boolean getAnchorCtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ANCHORCTR$46);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAnchorCtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ANCHORCTR$46);
         return var2;
      }
   }

   public boolean isSetAnchorCtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ANCHORCTR$46) != null;
      }
   }

   public void setAnchorCtr(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ANCHORCTR$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ANCHORCTR$46);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAnchorCtr(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ANCHORCTR$46);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ANCHORCTR$46);
         }

         var3.set(var1);
      }
   }

   public void unsetAnchorCtr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ANCHORCTR$46);
      }
   }

   public boolean getForceAA() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORCEAA$48);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetForceAA() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FORCEAA$48);
         return var2;
      }
   }

   public boolean isSetForceAA() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORCEAA$48) != null;
      }
   }

   public void setForceAA(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORCEAA$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORCEAA$48);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetForceAA(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FORCEAA$48);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FORCEAA$48);
         }

         var3.set(var1);
      }
   }

   public void unsetForceAA() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORCEAA$48);
      }
   }

   public boolean getUpright() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UPRIGHT$50);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(UPRIGHT$50);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUpright() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(UPRIGHT$50);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(UPRIGHT$50);
         }

         return var2;
      }
   }

   public boolean isSetUpright() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UPRIGHT$50) != null;
      }
   }

   public void setUpright(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UPRIGHT$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UPRIGHT$50);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUpright(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(UPRIGHT$50);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(UPRIGHT$50);
         }

         var3.set(var1);
      }
   }

   public void unsetUpright() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UPRIGHT$50);
      }
   }

   public boolean getCompatLnSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COMPATLNSPC$52);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCompatLnSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(COMPATLNSPC$52);
         return var2;
      }
   }

   public boolean isSetCompatLnSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COMPATLNSPC$52) != null;
      }
   }

   public void setCompatLnSpc(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COMPATLNSPC$52);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COMPATLNSPC$52);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCompatLnSpc(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(COMPATLNSPC$52);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(COMPATLNSPC$52);
         }

         var3.set(var1);
      }
   }

   public void unsetCompatLnSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COMPATLNSPC$52);
      }
   }

}
