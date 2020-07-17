package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode$Enum;

public class CTShapePropertiesImpl extends XmlComplexContentImpl implements CTShapeProperties {

   private static final QName XFRM$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "xfrm");
   private static final QName CUSTGEOM$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "custGeom");
   private static final QName PRSTGEOM$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstGeom");
   private static final QName NOFILL$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
   private static final QName SOLIDFILL$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
   private static final QName GRADFILL$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
   private static final QName BLIPFILL$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blipFill");
   private static final QName PATTFILL$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
   private static final QName GRPFILL$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpFill");
   private static final QName LN$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ln");
   private static final QName EFFECTLST$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectLst");
   private static final QName EFFECTDAG$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectDag");
   private static final QName SCENE3D$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scene3d");
   private static final QName SP3D$26 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sp3d");
   private static final QName EXTLST$28 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName BWMODE$30 = new QName("", "bwMode");


   public CTShapePropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTTransform2D getXfrm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTransform2D var2 = null;
         var2 = (CTTransform2D)this.get_store().find_element_user(XFRM$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetXfrm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(XFRM$0) != 0;
      }
   }

   public void setXfrm(CTTransform2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTransform2D var3 = null;
         var3 = (CTTransform2D)this.get_store().find_element_user(XFRM$0, 0);
         if(var3 == null) {
            var3 = (CTTransform2D)this.get_store().add_element_user(XFRM$0);
         }

         var3.set(var1);
      }
   }

   public CTTransform2D addNewXfrm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTransform2D var2 = null;
         var2 = (CTTransform2D)this.get_store().add_element_user(XFRM$0);
         return var2;
      }
   }

   public void unsetXfrm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(XFRM$0, 0);
      }
   }

   public CTCustomGeometry2D getCustGeom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomGeometry2D var2 = null;
         var2 = (CTCustomGeometry2D)this.get_store().find_element_user(CUSTGEOM$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustGeom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTGEOM$2) != 0;
      }
   }

   public void setCustGeom(CTCustomGeometry2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomGeometry2D var3 = null;
         var3 = (CTCustomGeometry2D)this.get_store().find_element_user(CUSTGEOM$2, 0);
         if(var3 == null) {
            var3 = (CTCustomGeometry2D)this.get_store().add_element_user(CUSTGEOM$2);
         }

         var3.set(var1);
      }
   }

   public CTCustomGeometry2D addNewCustGeom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomGeometry2D var2 = null;
         var2 = (CTCustomGeometry2D)this.get_store().add_element_user(CUSTGEOM$2);
         return var2;
      }
   }

   public void unsetCustGeom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTGEOM$2, 0);
      }
   }

   public CTPresetGeometry2D getPrstGeom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetGeometry2D var2 = null;
         var2 = (CTPresetGeometry2D)this.get_store().find_element_user(PRSTGEOM$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrstGeom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRSTGEOM$4) != 0;
      }
   }

   public void setPrstGeom(CTPresetGeometry2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetGeometry2D var3 = null;
         var3 = (CTPresetGeometry2D)this.get_store().find_element_user(PRSTGEOM$4, 0);
         if(var3 == null) {
            var3 = (CTPresetGeometry2D)this.get_store().add_element_user(PRSTGEOM$4);
         }

         var3.set(var1);
      }
   }

   public CTPresetGeometry2D addNewPrstGeom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetGeometry2D var2 = null;
         var2 = (CTPresetGeometry2D)this.get_store().add_element_user(PRSTGEOM$4);
         return var2;
      }
   }

   public void unsetPrstGeom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRSTGEOM$4, 0);
      }
   }

   public CTNoFillProperties getNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOFILL$6) != 0;
      }
   }

   public void setNoFill(CTNoFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var3 = null;
         var3 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$6, 0);
         if(var3 == null) {
            var3 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$6);
         }

         var3.set(var1);
      }
   }

   public CTNoFillProperties addNewNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$6);
         return var2;
      }
   }

   public void unsetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOFILL$6, 0);
      }
   }

   public CTSolidColorFillProperties getSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SOLIDFILL$8) != 0;
      }
   }

   public void setSolidFill(CTSolidColorFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var3 = null;
         var3 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$8, 0);
         if(var3 == null) {
            var3 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$8);
         }

         var3.set(var1);
      }
   }

   public CTSolidColorFillProperties addNewSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$8);
         return var2;
      }
   }

   public void unsetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SOLIDFILL$8, 0);
      }
   }

   public CTGradientFillProperties getGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRADFILL$10) != 0;
      }
   }

   public void setGradFill(CTGradientFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var3 = null;
         var3 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$10, 0);
         if(var3 == null) {
            var3 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$10);
         }

         var3.set(var1);
      }
   }

   public CTGradientFillProperties addNewGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$10);
         return var2;
      }
   }

   public void unsetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRADFILL$10, 0);
      }
   }

   public CTBlipFillProperties getBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLIPFILL$12) != 0;
      }
   }

   public void setBlipFill(CTBlipFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var3 = null;
         var3 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$12, 0);
         if(var3 == null) {
            var3 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$12);
         }

         var3.set(var1);
      }
   }

   public CTBlipFillProperties addNewBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$12);
         return var2;
      }
   }

   public void unsetBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLIPFILL$12, 0);
      }
   }

   public CTPatternFillProperties getPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PATTFILL$14) != 0;
      }
   }

   public void setPattFill(CTPatternFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var3 = null;
         var3 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$14, 0);
         if(var3 == null) {
            var3 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$14);
         }

         var3.set(var1);
      }
   }

   public CTPatternFillProperties addNewPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$14);
         return var2;
      }
   }

   public void unsetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PATTFILL$14, 0);
      }
   }

   public CTGroupFillProperties getGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRPFILL$16) != 0;
      }
   }

   public void setGrpFill(CTGroupFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var3 = null;
         var3 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$16, 0);
         if(var3 == null) {
            var3 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$16);
         }

         var3.set(var1);
      }
   }

   public CTGroupFillProperties addNewGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$16);
         return var2;
      }
   }

   public void unsetGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRPFILL$16, 0);
      }
   }

   public CTLineProperties getLn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().find_element_user(LN$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LN$18) != 0;
      }
   }

   public void setLn(CTLineProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().find_element_user(LN$18, 0);
         if(var3 == null) {
            var3 = (CTLineProperties)this.get_store().add_element_user(LN$18);
         }

         var3.set(var1);
      }
   }

   public CTLineProperties addNewLn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().add_element_user(LN$18);
         return var2;
      }
   }

   public void unsetLn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LN$18, 0);
      }
   }

   public CTEffectList getEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var2 = null;
         var2 = (CTEffectList)this.get_store().find_element_user(EFFECTLST$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTLST$20) != 0;
      }
   }

   public void setEffectLst(CTEffectList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var3 = null;
         var3 = (CTEffectList)this.get_store().find_element_user(EFFECTLST$20, 0);
         if(var3 == null) {
            var3 = (CTEffectList)this.get_store().add_element_user(EFFECTLST$20);
         }

         var3.set(var1);
      }
   }

   public CTEffectList addNewEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var2 = null;
         var2 = (CTEffectList)this.get_store().add_element_user(EFFECTLST$20);
         return var2;
      }
   }

   public void unsetEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTLST$20, 0);
      }
   }

   public CTEffectContainer getEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var2 = null;
         var2 = (CTEffectContainer)this.get_store().find_element_user(EFFECTDAG$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTDAG$22) != 0;
      }
   }

   public void setEffectDag(CTEffectContainer var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var3 = null;
         var3 = (CTEffectContainer)this.get_store().find_element_user(EFFECTDAG$22, 0);
         if(var3 == null) {
            var3 = (CTEffectContainer)this.get_store().add_element_user(EFFECTDAG$22);
         }

         var3.set(var1);
      }
   }

   public CTEffectContainer addNewEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var2 = null;
         var2 = (CTEffectContainer)this.get_store().add_element_user(EFFECTDAG$22);
         return var2;
      }
   }

   public void unsetEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTDAG$22, 0);
      }
   }

   public CTScene3D getScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var2 = null;
         var2 = (CTScene3D)this.get_store().find_element_user(SCENE3D$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCENE3D$24) != 0;
      }
   }

   public void setScene3D(CTScene3D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var3 = null;
         var3 = (CTScene3D)this.get_store().find_element_user(SCENE3D$24, 0);
         if(var3 == null) {
            var3 = (CTScene3D)this.get_store().add_element_user(SCENE3D$24);
         }

         var3.set(var1);
      }
   }

   public CTScene3D addNewScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var2 = null;
         var2 = (CTScene3D)this.get_store().add_element_user(SCENE3D$24);
         return var2;
      }
   }

   public void unsetScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCENE3D$24, 0);
      }
   }

   public CTShape3D getSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape3D var2 = null;
         var2 = (CTShape3D)this.get_store().find_element_user(SP3D$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SP3D$26) != 0;
      }
   }

   public void setSp3D(CTShape3D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape3D var3 = null;
         var3 = (CTShape3D)this.get_store().find_element_user(SP3D$26, 0);
         if(var3 == null) {
            var3 = (CTShape3D)this.get_store().add_element_user(SP3D$26);
         }

         var3.set(var1);
      }
   }

   public CTShape3D addNewSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape3D var2 = null;
         var2 = (CTShape3D)this.get_store().add_element_user(SP3D$26);
         return var2;
      }
   }

   public void unsetSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SP3D$26, 0);
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

   public STBlackWhiteMode$Enum getBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BWMODE$30);
         return var2 == null?null:(STBlackWhiteMode$Enum)var2.getEnumValue();
      }
   }

   public STBlackWhiteMode xgetBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBlackWhiteMode var2 = null;
         var2 = (STBlackWhiteMode)this.get_store().find_attribute_user(BWMODE$30);
         return var2;
      }
   }

   public boolean isSetBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BWMODE$30) != null;
      }
   }

   public void setBwMode(STBlackWhiteMode$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BWMODE$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BWMODE$30);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBwMode(STBlackWhiteMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBlackWhiteMode var3 = null;
         var3 = (STBlackWhiteMode)this.get_store().find_attribute_user(BWMODE$30);
         if(var3 == null) {
            var3 = (STBlackWhiteMode)this.get_store().add_attribute_user(BWMODE$30);
         }

         var3.set(var1);
      }
   }

   public void unsetBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BWMODE$30);
      }
   }

}
