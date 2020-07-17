package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode$Enum;

public class CTGroupShapePropertiesImpl extends XmlComplexContentImpl implements CTGroupShapeProperties {

   private static final QName XFRM$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "xfrm");
   private static final QName NOFILL$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
   private static final QName SOLIDFILL$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
   private static final QName GRADFILL$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
   private static final QName BLIPFILL$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blipFill");
   private static final QName PATTFILL$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
   private static final QName GRPFILL$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpFill");
   private static final QName EFFECTLST$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectLst");
   private static final QName EFFECTDAG$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectDag");
   private static final QName SCENE3D$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scene3d");
   private static final QName EXTLST$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName BWMODE$22 = new QName("", "bwMode");


   public CTGroupShapePropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTGroupTransform2D getXfrm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupTransform2D var2 = null;
         var2 = (CTGroupTransform2D)this.get_store().find_element_user(XFRM$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetXfrm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(XFRM$0) != 0;
      }
   }

   public void setXfrm(CTGroupTransform2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupTransform2D var3 = null;
         var3 = (CTGroupTransform2D)this.get_store().find_element_user(XFRM$0, 0);
         if(var3 == null) {
            var3 = (CTGroupTransform2D)this.get_store().add_element_user(XFRM$0);
         }

         var3.set(var1);
      }
   }

   public CTGroupTransform2D addNewXfrm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupTransform2D var2 = null;
         var2 = (CTGroupTransform2D)this.get_store().add_element_user(XFRM$0);
         return var2;
      }
   }

   public void unsetXfrm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(XFRM$0, 0);
      }
   }

   public CTNoFillProperties getNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOFILL$2) != 0;
      }
   }

   public void setNoFill(CTNoFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var3 = null;
         var3 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$2, 0);
         if(var3 == null) {
            var3 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$2);
         }

         var3.set(var1);
      }
   }

   public CTNoFillProperties addNewNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$2);
         return var2;
      }
   }

   public void unsetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOFILL$2, 0);
      }
   }

   public CTSolidColorFillProperties getSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SOLIDFILL$4) != 0;
      }
   }

   public void setSolidFill(CTSolidColorFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var3 = null;
         var3 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$4, 0);
         if(var3 == null) {
            var3 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$4);
         }

         var3.set(var1);
      }
   }

   public CTSolidColorFillProperties addNewSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$4);
         return var2;
      }
   }

   public void unsetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SOLIDFILL$4, 0);
      }
   }

   public CTGradientFillProperties getGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRADFILL$6) != 0;
      }
   }

   public void setGradFill(CTGradientFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var3 = null;
         var3 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$6, 0);
         if(var3 == null) {
            var3 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$6);
         }

         var3.set(var1);
      }
   }

   public CTGradientFillProperties addNewGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$6);
         return var2;
      }
   }

   public void unsetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRADFILL$6, 0);
      }
   }

   public CTBlipFillProperties getBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLIPFILL$8) != 0;
      }
   }

   public void setBlipFill(CTBlipFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var3 = null;
         var3 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$8, 0);
         if(var3 == null) {
            var3 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$8);
         }

         var3.set(var1);
      }
   }

   public CTBlipFillProperties addNewBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$8);
         return var2;
      }
   }

   public void unsetBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLIPFILL$8, 0);
      }
   }

   public CTPatternFillProperties getPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PATTFILL$10) != 0;
      }
   }

   public void setPattFill(CTPatternFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var3 = null;
         var3 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$10, 0);
         if(var3 == null) {
            var3 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$10);
         }

         var3.set(var1);
      }
   }

   public CTPatternFillProperties addNewPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$10);
         return var2;
      }
   }

   public void unsetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PATTFILL$10, 0);
      }
   }

   public CTGroupFillProperties getGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRPFILL$12) != 0;
      }
   }

   public void setGrpFill(CTGroupFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var3 = null;
         var3 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$12, 0);
         if(var3 == null) {
            var3 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$12);
         }

         var3.set(var1);
      }
   }

   public CTGroupFillProperties addNewGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$12);
         return var2;
      }
   }

   public void unsetGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRPFILL$12, 0);
      }
   }

   public CTEffectList getEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var2 = null;
         var2 = (CTEffectList)this.get_store().find_element_user(EFFECTLST$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTLST$14) != 0;
      }
   }

   public void setEffectLst(CTEffectList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var3 = null;
         var3 = (CTEffectList)this.get_store().find_element_user(EFFECTLST$14, 0);
         if(var3 == null) {
            var3 = (CTEffectList)this.get_store().add_element_user(EFFECTLST$14);
         }

         var3.set(var1);
      }
   }

   public CTEffectList addNewEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var2 = null;
         var2 = (CTEffectList)this.get_store().add_element_user(EFFECTLST$14);
         return var2;
      }
   }

   public void unsetEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTLST$14, 0);
      }
   }

   public CTEffectContainer getEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var2 = null;
         var2 = (CTEffectContainer)this.get_store().find_element_user(EFFECTDAG$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTDAG$16) != 0;
      }
   }

   public void setEffectDag(CTEffectContainer var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var3 = null;
         var3 = (CTEffectContainer)this.get_store().find_element_user(EFFECTDAG$16, 0);
         if(var3 == null) {
            var3 = (CTEffectContainer)this.get_store().add_element_user(EFFECTDAG$16);
         }

         var3.set(var1);
      }
   }

   public CTEffectContainer addNewEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var2 = null;
         var2 = (CTEffectContainer)this.get_store().add_element_user(EFFECTDAG$16);
         return var2;
      }
   }

   public void unsetEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTDAG$16, 0);
      }
   }

   public CTScene3D getScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var2 = null;
         var2 = (CTScene3D)this.get_store().find_element_user(SCENE3D$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCENE3D$18) != 0;
      }
   }

   public void setScene3D(CTScene3D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var3 = null;
         var3 = (CTScene3D)this.get_store().find_element_user(SCENE3D$18, 0);
         if(var3 == null) {
            var3 = (CTScene3D)this.get_store().add_element_user(SCENE3D$18);
         }

         var3.set(var1);
      }
   }

   public CTScene3D addNewScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var2 = null;
         var2 = (CTScene3D)this.get_store().add_element_user(SCENE3D$18);
         return var2;
      }
   }

   public void unsetScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCENE3D$18, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$20) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$20);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$20);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$20, 0);
      }
   }

   public STBlackWhiteMode$Enum getBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BWMODE$22);
         return var2 == null?null:(STBlackWhiteMode$Enum)var2.getEnumValue();
      }
   }

   public STBlackWhiteMode xgetBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBlackWhiteMode var2 = null;
         var2 = (STBlackWhiteMode)this.get_store().find_attribute_user(BWMODE$22);
         return var2;
      }
   }

   public boolean isSetBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BWMODE$22) != null;
      }
   }

   public void setBwMode(STBlackWhiteMode$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BWMODE$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BWMODE$22);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBwMode(STBlackWhiteMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBlackWhiteMode var3 = null;
         var3 = (STBlackWhiteMode)this.get_store().find_attribute_user(BWMODE$22);
         if(var3 == null) {
            var3 = (STBlackWhiteMode)this.get_store().add_attribute_user(BWMODE$22);
         }

         var3.set(var1);
      }
   }

   public void unsetBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BWMODE$22);
      }
   }

}
