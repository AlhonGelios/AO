package org.apache.poi.xslf.usermodel;

import org.apache.poi.util.Internal;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties;

@Internal
class XSLFPropertiesDelegate {

   private static final POILogger LOG = POILogFactory.getLogger(XSLFPropertiesDelegate.class);


   public static XSLFPropertiesDelegate.XSLFFillProperties getFillDelegate(XmlObject props) {
      return (XSLFPropertiesDelegate.XSLFFillProperties)getDelegate(XSLFPropertiesDelegate.XSLFFillProperties.class, props);
   }

   public static XSLFPropertiesDelegate.XSLFGeometryProperties getGeometryDelegate(XmlObject props) {
      return (XSLFPropertiesDelegate.XSLFGeometryProperties)getDelegate(XSLFPropertiesDelegate.XSLFGeometryProperties.class, props);
   }

   public static XSLFPropertiesDelegate.XSLFEffectProperties getEffectDelegate(XmlObject props) {
      return (XSLFPropertiesDelegate.XSLFEffectProperties)getDelegate(XSLFPropertiesDelegate.XSLFEffectProperties.class, props);
   }

   private static Object getDelegate(Class clazz, XmlObject props) {
      Object obj = null;
      if(props == null) {
         return null;
      } else {
         if(props instanceof CTShapeProperties) {
            obj = new XSLFPropertiesDelegate.ShapeDelegate((CTShapeProperties)props);
         } else if(props instanceof CTBackgroundProperties) {
            obj = new XSLFPropertiesDelegate.BackgroundDelegate((CTBackgroundProperties)props);
         } else if(props instanceof CTStyleMatrixReference) {
            obj = new XSLFPropertiesDelegate.StyleMatrixDelegate((CTStyleMatrixReference)props);
         } else if(props instanceof CTTableCellProperties) {
            obj = new XSLFPropertiesDelegate.TableCellDelegate((CTTableCellProperties)props);
         } else if(!(props instanceof CTNoFillProperties) && !(props instanceof CTSolidColorFillProperties) && !(props instanceof CTGradientFillProperties) && !(props instanceof CTBlipFillProperties) && !(props instanceof CTPatternFillProperties) && !(props instanceof CTGroupFillProperties)) {
            if(props instanceof CTFillProperties) {
               obj = new XSLFPropertiesDelegate.FillDelegate((CTFillProperties)props);
            } else if(props instanceof CTLineProperties) {
               obj = new XSLFPropertiesDelegate.LineStyleDelegate((CTLineProperties)props);
            } else {
               if(!(props instanceof CTTextCharacterProperties)) {
                  LOG.log(7, new Object[]{props.getClass().toString() + " is an unknown properties type"});
                  return null;
               }

               obj = new XSLFPropertiesDelegate.TextCharDelegate((CTTextCharacterProperties)props);
            }
         } else {
            obj = new XSLFPropertiesDelegate.FillPartDelegate(props);
         }

         if(clazz.isInstance(obj)) {
            return obj;
         } else {
            LOG.log(5, new Object[]{obj.getClass().toString() + " doesn\'t implement " + clazz.toString()});
            return null;
         }
      }
   }


   private static class TextCharDelegate implements XSLFPropertiesDelegate.XSLFFillProperties {

      final CTTextCharacterProperties props;


      TextCharDelegate(CTTextCharacterProperties props) {
         this.props = props;
      }

      public CTNoFillProperties getNoFill() {
         return this.props.getNoFill();
      }

      public boolean isSetNoFill() {
         return this.props.isSetNoFill();
      }

      public void setNoFill(CTNoFillProperties noFill) {
         this.props.setNoFill(noFill);
      }

      public CTNoFillProperties addNewNoFill() {
         return this.props.addNewNoFill();
      }

      public void unsetNoFill() {
         this.props.unsetNoFill();
      }

      public CTSolidColorFillProperties getSolidFill() {
         return this.props.getSolidFill();
      }

      public boolean isSetSolidFill() {
         return this.props.isSetSolidFill();
      }

      public void setSolidFill(CTSolidColorFillProperties solidFill) {
         this.props.setSolidFill(solidFill);
      }

      public CTSolidColorFillProperties addNewSolidFill() {
         return this.props.addNewSolidFill();
      }

      public void unsetSolidFill() {
         this.props.unsetSolidFill();
      }

      public CTGradientFillProperties getGradFill() {
         return this.props.getGradFill();
      }

      public boolean isSetGradFill() {
         return this.props.isSetGradFill();
      }

      public void setGradFill(CTGradientFillProperties gradFill) {
         this.props.setGradFill(gradFill);
      }

      public CTGradientFillProperties addNewGradFill() {
         return this.props.addNewGradFill();
      }

      public void unsetGradFill() {
         this.props.unsetGradFill();
      }

      public CTBlipFillProperties getBlipFill() {
         return this.props.getBlipFill();
      }

      public boolean isSetBlipFill() {
         return this.props.isSetBlipFill();
      }

      public void setBlipFill(CTBlipFillProperties blipFill) {
         this.props.setBlipFill(blipFill);
      }

      public CTBlipFillProperties addNewBlipFill() {
         return this.props.addNewBlipFill();
      }

      public void unsetBlipFill() {
         this.props.unsetBlipFill();
      }

      public CTPatternFillProperties getPattFill() {
         return this.props.getPattFill();
      }

      public boolean isSetPattFill() {
         return this.props.isSetPattFill();
      }

      public void setPattFill(CTPatternFillProperties pattFill) {
         this.props.setPattFill(pattFill);
      }

      public CTPatternFillProperties addNewPattFill() {
         return this.props.addNewPattFill();
      }

      public void unsetPattFill() {
         this.props.unsetPattFill();
      }

      public CTGroupFillProperties getGrpFill() {
         return this.props.getGrpFill();
      }

      public boolean isSetGrpFill() {
         return this.props.isSetGrpFill();
      }

      public void setGrpFill(CTGroupFillProperties grpFill) {
         this.props.setGrpFill(grpFill);
      }

      public CTGroupFillProperties addNewGrpFill() {
         return this.props.addNewGrpFill();
      }

      public void unsetGrpFill() {
         this.props.unsetGrpFill();
      }

      public boolean isSetMatrixStyle() {
         return false;
      }

      public CTStyleMatrixReference getMatrixStyle() {
         return null;
      }

      public boolean isLineStyle() {
         return false;
      }
   }

   private static class StyleMatrixDelegate implements XSLFPropertiesDelegate.XSLFFillProperties {

      final CTStyleMatrixReference props;


      StyleMatrixDelegate(CTStyleMatrixReference props) {
         this.props = props;
      }

      public CTNoFillProperties getNoFill() {
         return null;
      }

      public boolean isSetNoFill() {
         return false;
      }

      public void setNoFill(CTNoFillProperties noFill) {}

      public CTNoFillProperties addNewNoFill() {
         return null;
      }

      public void unsetNoFill() {}

      public CTSolidColorFillProperties getSolidFill() {
         return null;
      }

      public boolean isSetSolidFill() {
         return false;
      }

      public void setSolidFill(CTSolidColorFillProperties solidFill) {}

      public CTSolidColorFillProperties addNewSolidFill() {
         return null;
      }

      public void unsetSolidFill() {}

      public CTGradientFillProperties getGradFill() {
         return null;
      }

      public boolean isSetGradFill() {
         return false;
      }

      public void setGradFill(CTGradientFillProperties gradFill) {}

      public CTGradientFillProperties addNewGradFill() {
         return null;
      }

      public void unsetGradFill() {}

      public CTBlipFillProperties getBlipFill() {
         return null;
      }

      public boolean isSetBlipFill() {
         return false;
      }

      public void setBlipFill(CTBlipFillProperties blipFill) {}

      public CTBlipFillProperties addNewBlipFill() {
         return null;
      }

      public void unsetBlipFill() {}

      public CTPatternFillProperties getPattFill() {
         return null;
      }

      public boolean isSetPattFill() {
         return false;
      }

      public void setPattFill(CTPatternFillProperties pattFill) {}

      public CTPatternFillProperties addNewPattFill() {
         return null;
      }

      public void unsetPattFill() {}

      public CTGroupFillProperties getGrpFill() {
         return null;
      }

      public boolean isSetGrpFill() {
         return false;
      }

      public void setGrpFill(CTGroupFillProperties grpFill) {}

      public CTGroupFillProperties addNewGrpFill() {
         return null;
      }

      public void unsetGrpFill() {}

      public boolean isSetMatrixStyle() {
         return true;
      }

      public CTStyleMatrixReference getMatrixStyle() {
         return this.props;
      }

      public boolean isLineStyle() {
         XmlCursor cur = this.props.newCursor();
         String name = cur.getName().getLocalPart();
         cur.dispose();
         return "lnRef".equals(name);
      }
   }

   private static class ShapeDelegate implements XSLFPropertiesDelegate.XSLFFillProperties, XSLFPropertiesDelegate.XSLFGeometryProperties, XSLFPropertiesDelegate.XSLFEffectProperties {

      final CTShapeProperties props;


      ShapeDelegate(CTShapeProperties props) {
         this.props = props;
      }

      public CTNoFillProperties getNoFill() {
         return this.props.getNoFill();
      }

      public boolean isSetNoFill() {
         return this.props.isSetNoFill();
      }

      public void setNoFill(CTNoFillProperties noFill) {
         this.props.setNoFill(noFill);
      }

      public CTNoFillProperties addNewNoFill() {
         return this.props.addNewNoFill();
      }

      public void unsetNoFill() {
         this.props.unsetNoFill();
      }

      public CTSolidColorFillProperties getSolidFill() {
         return this.props.getSolidFill();
      }

      public boolean isSetSolidFill() {
         return this.props.isSetSolidFill();
      }

      public void setSolidFill(CTSolidColorFillProperties solidFill) {
         this.props.setSolidFill(solidFill);
      }

      public CTSolidColorFillProperties addNewSolidFill() {
         return this.props.addNewSolidFill();
      }

      public void unsetSolidFill() {
         this.props.unsetSolidFill();
      }

      public CTGradientFillProperties getGradFill() {
         return this.props.getGradFill();
      }

      public boolean isSetGradFill() {
         return this.props.isSetGradFill();
      }

      public void setGradFill(CTGradientFillProperties gradFill) {
         this.props.setGradFill(gradFill);
      }

      public CTGradientFillProperties addNewGradFill() {
         return this.props.addNewGradFill();
      }

      public void unsetGradFill() {
         this.props.unsetGradFill();
      }

      public CTBlipFillProperties getBlipFill() {
         return this.props.getBlipFill();
      }

      public boolean isSetBlipFill() {
         return this.props.isSetBlipFill();
      }

      public void setBlipFill(CTBlipFillProperties blipFill) {
         this.props.setBlipFill(blipFill);
      }

      public CTBlipFillProperties addNewBlipFill() {
         return this.props.addNewBlipFill();
      }

      public void unsetBlipFill() {
         this.props.unsetBlipFill();
      }

      public CTPatternFillProperties getPattFill() {
         return this.props.getPattFill();
      }

      public boolean isSetPattFill() {
         return this.props.isSetPattFill();
      }

      public void setPattFill(CTPatternFillProperties pattFill) {
         this.props.setPattFill(pattFill);
      }

      public CTPatternFillProperties addNewPattFill() {
         return this.props.addNewPattFill();
      }

      public void unsetPattFill() {
         this.props.unsetPattFill();
      }

      public CTGroupFillProperties getGrpFill() {
         return this.props.getGrpFill();
      }

      public boolean isSetGrpFill() {
         return this.props.isSetGrpFill();
      }

      public void setGrpFill(CTGroupFillProperties grpFill) {
         this.props.setGrpFill(grpFill);
      }

      public CTGroupFillProperties addNewGrpFill() {
         return this.props.addNewGrpFill();
      }

      public void unsetGrpFill() {
         this.props.unsetGrpFill();
      }

      public CTCustomGeometry2D getCustGeom() {
         return this.props.getCustGeom();
      }

      public boolean isSetCustGeom() {
         return this.props.isSetCustGeom();
      }

      public void setCustGeom(CTCustomGeometry2D custGeom) {
         this.props.setCustGeom(custGeom);
      }

      public CTCustomGeometry2D addNewCustGeom() {
         return this.props.addNewCustGeom();
      }

      public void unsetCustGeom() {
         this.props.unsetCustGeom();
      }

      public CTPresetGeometry2D getPrstGeom() {
         return this.props.getPrstGeom();
      }

      public boolean isSetPrstGeom() {
         return this.props.isSetPrstGeom();
      }

      public void setPrstGeom(CTPresetGeometry2D prstGeom) {
         this.props.setPrstGeom(prstGeom);
      }

      public CTPresetGeometry2D addNewPrstGeom() {
         return this.props.addNewPrstGeom();
      }

      public void unsetPrstGeom() {
         this.props.unsetPrstGeom();
      }

      public CTEffectList getEffectLst() {
         return this.props.getEffectLst();
      }

      public boolean isSetEffectLst() {
         return this.props.isSetEffectLst();
      }

      public void setEffectLst(CTEffectList effectLst) {
         this.props.setEffectLst(effectLst);
      }

      public CTEffectList addNewEffectLst() {
         return this.props.addNewEffectLst();
      }

      public void unsetEffectLst() {
         this.props.unsetEffectLst();
      }

      public CTEffectContainer getEffectDag() {
         return this.props.getEffectDag();
      }

      public boolean isSetEffectDag() {
         return this.props.isSetEffectDag();
      }

      public void setEffectDag(CTEffectContainer effectDag) {
         this.props.setEffectDag(effectDag);
      }

      public CTEffectContainer addNewEffectDag() {
         return this.props.addNewEffectDag();
      }

      public void unsetEffectDag() {
         this.props.unsetEffectDag();
      }

      public boolean isSetMatrixStyle() {
         return false;
      }

      public CTStyleMatrixReference getMatrixStyle() {
         return null;
      }

      public boolean isLineStyle() {
         return false;
      }
   }

   public interface XSLFEffectProperties {

      CTEffectList getEffectLst();

      boolean isSetEffectLst();

      void setEffectLst(CTEffectList var1);

      CTEffectList addNewEffectLst();

      void unsetEffectLst();

      CTEffectContainer getEffectDag();

      boolean isSetEffectDag();

      void setEffectDag(CTEffectContainer var1);

      CTEffectContainer addNewEffectDag();

      void unsetEffectDag();
   }

   private static class LineStyleDelegate implements XSLFPropertiesDelegate.XSLFFillProperties {

      final CTLineProperties props;


      LineStyleDelegate(CTLineProperties props) {
         this.props = props;
      }

      public CTNoFillProperties getNoFill() {
         return this.props.getNoFill();
      }

      public boolean isSetNoFill() {
         return this.props.isSetNoFill();
      }

      public void setNoFill(CTNoFillProperties noFill) {
         this.props.setNoFill(noFill);
      }

      public CTNoFillProperties addNewNoFill() {
         return this.props.addNewNoFill();
      }

      public void unsetNoFill() {
         this.props.unsetNoFill();
      }

      public CTSolidColorFillProperties getSolidFill() {
         return this.props.getSolidFill();
      }

      public boolean isSetSolidFill() {
         return this.props.isSetSolidFill();
      }

      public void setSolidFill(CTSolidColorFillProperties solidFill) {
         this.props.setSolidFill(solidFill);
      }

      public CTSolidColorFillProperties addNewSolidFill() {
         return this.props.addNewSolidFill();
      }

      public void unsetSolidFill() {
         this.props.unsetSolidFill();
      }

      public CTGradientFillProperties getGradFill() {
         return this.props.getGradFill();
      }

      public boolean isSetGradFill() {
         return this.props.isSetGradFill();
      }

      public void setGradFill(CTGradientFillProperties gradFill) {
         this.props.setGradFill(gradFill);
      }

      public CTGradientFillProperties addNewGradFill() {
         return this.props.addNewGradFill();
      }

      public void unsetGradFill() {
         this.props.unsetGradFill();
      }

      public CTBlipFillProperties getBlipFill() {
         return null;
      }

      public boolean isSetBlipFill() {
         return false;
      }

      public void setBlipFill(CTBlipFillProperties blipFill) {}

      public CTBlipFillProperties addNewBlipFill() {
         return null;
      }

      public void unsetBlipFill() {}

      public CTPatternFillProperties getPattFill() {
         return this.props.getPattFill();
      }

      public boolean isSetPattFill() {
         return this.props.isSetPattFill();
      }

      public void setPattFill(CTPatternFillProperties pattFill) {
         this.props.setPattFill(pattFill);
      }

      public CTPatternFillProperties addNewPattFill() {
         return this.props.addNewPattFill();
      }

      public void unsetPattFill() {
         this.props.unsetPattFill();
      }

      public CTGroupFillProperties getGrpFill() {
         return null;
      }

      public boolean isSetGrpFill() {
         return false;
      }

      public void setGrpFill(CTGroupFillProperties grpFill) {}

      public CTGroupFillProperties addNewGrpFill() {
         return null;
      }

      public void unsetGrpFill() {}

      public boolean isSetMatrixStyle() {
         return false;
      }

      public CTStyleMatrixReference getMatrixStyle() {
         return null;
      }

      public boolean isLineStyle() {
         return true;
      }
   }

   public interface XSLFFillProperties {

      CTNoFillProperties getNoFill();

      boolean isSetNoFill();

      void setNoFill(CTNoFillProperties var1);

      CTNoFillProperties addNewNoFill();

      void unsetNoFill();

      CTSolidColorFillProperties getSolidFill();

      boolean isSetSolidFill();

      void setSolidFill(CTSolidColorFillProperties var1);

      CTSolidColorFillProperties addNewSolidFill();

      void unsetSolidFill();

      CTGradientFillProperties getGradFill();

      boolean isSetGradFill();

      void setGradFill(CTGradientFillProperties var1);

      CTGradientFillProperties addNewGradFill();

      void unsetGradFill();

      CTBlipFillProperties getBlipFill();

      boolean isSetBlipFill();

      void setBlipFill(CTBlipFillProperties var1);

      CTBlipFillProperties addNewBlipFill();

      void unsetBlipFill();

      CTPatternFillProperties getPattFill();

      boolean isSetPattFill();

      void setPattFill(CTPatternFillProperties var1);

      CTPatternFillProperties addNewPattFill();

      void unsetPattFill();

      CTGroupFillProperties getGrpFill();

      boolean isSetGrpFill();

      void setGrpFill(CTGroupFillProperties var1);

      CTGroupFillProperties addNewGrpFill();

      void unsetGrpFill();

      boolean isSetMatrixStyle();

      CTStyleMatrixReference getMatrixStyle();

      boolean isLineStyle();
   }

   private static class FillPartDelegate implements XSLFPropertiesDelegate.XSLFFillProperties {

      final XmlObject props;


      FillPartDelegate(XmlObject props) {
         this.props = props;
      }

      public CTNoFillProperties getNoFill() {
         return this.isSetNoFill()?(CTNoFillProperties)this.props:null;
      }

      public boolean isSetNoFill() {
         return this.props instanceof CTNoFillProperties;
      }

      public void setNoFill(CTNoFillProperties noFill) {}

      public CTNoFillProperties addNewNoFill() {
         return null;
      }

      public void unsetNoFill() {}

      public CTSolidColorFillProperties getSolidFill() {
         return this.isSetSolidFill()?(CTSolidColorFillProperties)this.props:null;
      }

      public boolean isSetSolidFill() {
         return this.props instanceof CTSolidColorFillProperties;
      }

      public void setSolidFill(CTSolidColorFillProperties solidFill) {}

      public CTSolidColorFillProperties addNewSolidFill() {
         return null;
      }

      public void unsetSolidFill() {}

      public CTGradientFillProperties getGradFill() {
         return this.isSetGradFill()?(CTGradientFillProperties)this.props:null;
      }

      public boolean isSetGradFill() {
         return this.props instanceof CTGradientFillProperties;
      }

      public void setGradFill(CTGradientFillProperties gradFill) {}

      public CTGradientFillProperties addNewGradFill() {
         return null;
      }

      public void unsetGradFill() {}

      public CTBlipFillProperties getBlipFill() {
         return this.isSetBlipFill()?(CTBlipFillProperties)this.props:null;
      }

      public boolean isSetBlipFill() {
         return this.props instanceof CTBlipFillProperties;
      }

      public void setBlipFill(CTBlipFillProperties blipFill) {}

      public CTBlipFillProperties addNewBlipFill() {
         return null;
      }

      public void unsetBlipFill() {}

      public CTPatternFillProperties getPattFill() {
         return this.isSetPattFill()?(CTPatternFillProperties)this.props:null;
      }

      public boolean isSetPattFill() {
         return this.props instanceof CTPatternFillProperties;
      }

      public void setPattFill(CTPatternFillProperties pattFill) {}

      public CTPatternFillProperties addNewPattFill() {
         return null;
      }

      public void unsetPattFill() {}

      public CTGroupFillProperties getGrpFill() {
         return this.isSetGrpFill()?(CTGroupFillProperties)this.props:null;
      }

      public boolean isSetGrpFill() {
         return this.props instanceof CTGroupFillProperties;
      }

      public void setGrpFill(CTGroupFillProperties grpFill) {}

      public CTGroupFillProperties addNewGrpFill() {
         return null;
      }

      public void unsetGrpFill() {}

      public boolean isSetMatrixStyle() {
         return false;
      }

      public CTStyleMatrixReference getMatrixStyle() {
         return null;
      }

      public boolean isLineStyle() {
         return false;
      }
   }

   public interface XSLFGeometryProperties {

      CTCustomGeometry2D getCustGeom();

      boolean isSetCustGeom();

      void setCustGeom(CTCustomGeometry2D var1);

      CTCustomGeometry2D addNewCustGeom();

      void unsetCustGeom();

      CTPresetGeometry2D getPrstGeom();

      boolean isSetPrstGeom();

      void setPrstGeom(CTPresetGeometry2D var1);

      CTPresetGeometry2D addNewPrstGeom();

      void unsetPrstGeom();
   }

   private static class BackgroundDelegate implements XSLFPropertiesDelegate.XSLFFillProperties, XSLFPropertiesDelegate.XSLFEffectProperties {

      final CTBackgroundProperties props;


      BackgroundDelegate(CTBackgroundProperties props) {
         this.props = props;
      }

      public CTNoFillProperties getNoFill() {
         return this.props.getNoFill();
      }

      public boolean isSetNoFill() {
         return this.props.isSetNoFill();
      }

      public void setNoFill(CTNoFillProperties noFill) {
         this.props.setNoFill(noFill);
      }

      public CTNoFillProperties addNewNoFill() {
         return this.props.addNewNoFill();
      }

      public void unsetNoFill() {
         this.props.unsetNoFill();
      }

      public CTSolidColorFillProperties getSolidFill() {
         return this.props.getSolidFill();
      }

      public boolean isSetSolidFill() {
         return this.props.isSetSolidFill();
      }

      public void setSolidFill(CTSolidColorFillProperties solidFill) {
         this.props.setSolidFill(solidFill);
      }

      public CTSolidColorFillProperties addNewSolidFill() {
         return this.props.addNewSolidFill();
      }

      public void unsetSolidFill() {
         this.props.unsetSolidFill();
      }

      public CTGradientFillProperties getGradFill() {
         return this.props.getGradFill();
      }

      public boolean isSetGradFill() {
         return this.props.isSetGradFill();
      }

      public void setGradFill(CTGradientFillProperties gradFill) {
         this.props.setGradFill(gradFill);
      }

      public CTGradientFillProperties addNewGradFill() {
         return this.props.addNewGradFill();
      }

      public void unsetGradFill() {
         this.props.unsetGradFill();
      }

      public CTBlipFillProperties getBlipFill() {
         return this.props.getBlipFill();
      }

      public boolean isSetBlipFill() {
         return this.props.isSetBlipFill();
      }

      public void setBlipFill(CTBlipFillProperties blipFill) {
         this.props.setBlipFill(blipFill);
      }

      public CTBlipFillProperties addNewBlipFill() {
         return this.props.addNewBlipFill();
      }

      public void unsetBlipFill() {
         this.props.unsetBlipFill();
      }

      public CTPatternFillProperties getPattFill() {
         return this.props.getPattFill();
      }

      public boolean isSetPattFill() {
         return this.props.isSetPattFill();
      }

      public void setPattFill(CTPatternFillProperties pattFill) {
         this.props.setPattFill(pattFill);
      }

      public CTPatternFillProperties addNewPattFill() {
         return this.props.addNewPattFill();
      }

      public void unsetPattFill() {
         this.props.unsetPattFill();
      }

      public CTGroupFillProperties getGrpFill() {
         return this.props.getGrpFill();
      }

      public boolean isSetGrpFill() {
         return this.props.isSetGrpFill();
      }

      public void setGrpFill(CTGroupFillProperties grpFill) {
         this.props.setGrpFill(grpFill);
      }

      public CTGroupFillProperties addNewGrpFill() {
         return this.props.addNewGrpFill();
      }

      public void unsetGrpFill() {
         this.props.unsetGrpFill();
      }

      public CTEffectList getEffectLst() {
         return this.props.getEffectLst();
      }

      public boolean isSetEffectLst() {
         return this.props.isSetEffectLst();
      }

      public void setEffectLst(CTEffectList effectLst) {
         this.props.setEffectLst(effectLst);
      }

      public CTEffectList addNewEffectLst() {
         return this.props.addNewEffectLst();
      }

      public void unsetEffectLst() {
         this.props.unsetEffectLst();
      }

      public CTEffectContainer getEffectDag() {
         return this.props.getEffectDag();
      }

      public boolean isSetEffectDag() {
         return this.props.isSetEffectDag();
      }

      public void setEffectDag(CTEffectContainer effectDag) {
         this.props.setEffectDag(effectDag);
      }

      public CTEffectContainer addNewEffectDag() {
         return this.props.addNewEffectDag();
      }

      public void unsetEffectDag() {
         this.props.unsetEffectDag();
      }

      public boolean isSetMatrixStyle() {
         return false;
      }

      public CTStyleMatrixReference getMatrixStyle() {
         return null;
      }

      public boolean isLineStyle() {
         return false;
      }
   }

   private static class FillDelegate implements XSLFPropertiesDelegate.XSLFFillProperties {

      final CTFillProperties props;


      FillDelegate(CTFillProperties props) {
         this.props = props;
      }

      public CTNoFillProperties getNoFill() {
         return this.props.getNoFill();
      }

      public boolean isSetNoFill() {
         return this.props.isSetNoFill();
      }

      public void setNoFill(CTNoFillProperties noFill) {
         this.props.setNoFill(noFill);
      }

      public CTNoFillProperties addNewNoFill() {
         return this.props.addNewNoFill();
      }

      public void unsetNoFill() {
         this.props.unsetNoFill();
      }

      public CTSolidColorFillProperties getSolidFill() {
         return this.props.getSolidFill();
      }

      public boolean isSetSolidFill() {
         return this.props.isSetSolidFill();
      }

      public void setSolidFill(CTSolidColorFillProperties solidFill) {
         this.props.setSolidFill(solidFill);
      }

      public CTSolidColorFillProperties addNewSolidFill() {
         return this.props.addNewSolidFill();
      }

      public void unsetSolidFill() {
         this.props.unsetSolidFill();
      }

      public CTGradientFillProperties getGradFill() {
         return this.props.getGradFill();
      }

      public boolean isSetGradFill() {
         return this.props.isSetGradFill();
      }

      public void setGradFill(CTGradientFillProperties gradFill) {
         this.props.setGradFill(gradFill);
      }

      public CTGradientFillProperties addNewGradFill() {
         return this.props.addNewGradFill();
      }

      public void unsetGradFill() {
         this.props.unsetGradFill();
      }

      public CTBlipFillProperties getBlipFill() {
         return this.props.getBlipFill();
      }

      public boolean isSetBlipFill() {
         return this.props.isSetBlipFill();
      }

      public void setBlipFill(CTBlipFillProperties blipFill) {
         this.props.setBlipFill(blipFill);
      }

      public CTBlipFillProperties addNewBlipFill() {
         return this.props.addNewBlipFill();
      }

      public void unsetBlipFill() {
         this.props.unsetBlipFill();
      }

      public CTPatternFillProperties getPattFill() {
         return this.props.getPattFill();
      }

      public boolean isSetPattFill() {
         return this.props.isSetPattFill();
      }

      public void setPattFill(CTPatternFillProperties pattFill) {
         this.props.setPattFill(pattFill);
      }

      public CTPatternFillProperties addNewPattFill() {
         return this.props.addNewPattFill();
      }

      public void unsetPattFill() {
         this.props.unsetPattFill();
      }

      public CTGroupFillProperties getGrpFill() {
         return this.props.getGrpFill();
      }

      public boolean isSetGrpFill() {
         return this.props.isSetGrpFill();
      }

      public void setGrpFill(CTGroupFillProperties grpFill) {
         this.props.setGrpFill(grpFill);
      }

      public CTGroupFillProperties addNewGrpFill() {
         return this.props.addNewGrpFill();
      }

      public void unsetGrpFill() {
         this.props.unsetGrpFill();
      }

      public boolean isSetMatrixStyle() {
         return false;
      }

      public CTStyleMatrixReference getMatrixStyle() {
         return null;
      }

      public boolean isLineStyle() {
         return false;
      }
   }

   private static class TableCellDelegate implements XSLFPropertiesDelegate.XSLFFillProperties {

      final CTTableCellProperties props;


      TableCellDelegate(CTTableCellProperties props) {
         this.props = props;
      }

      public CTNoFillProperties getNoFill() {
         return this.props.getNoFill();
      }

      public boolean isSetNoFill() {
         return this.props.isSetNoFill();
      }

      public void setNoFill(CTNoFillProperties noFill) {
         this.props.setNoFill(noFill);
      }

      public CTNoFillProperties addNewNoFill() {
         return this.props.addNewNoFill();
      }

      public void unsetNoFill() {
         this.props.unsetNoFill();
      }

      public CTSolidColorFillProperties getSolidFill() {
         return this.props.getSolidFill();
      }

      public boolean isSetSolidFill() {
         return this.props.isSetSolidFill();
      }

      public void setSolidFill(CTSolidColorFillProperties solidFill) {
         this.props.setSolidFill(solidFill);
      }

      public CTSolidColorFillProperties addNewSolidFill() {
         return this.props.addNewSolidFill();
      }

      public void unsetSolidFill() {
         this.props.unsetSolidFill();
      }

      public CTGradientFillProperties getGradFill() {
         return this.props.getGradFill();
      }

      public boolean isSetGradFill() {
         return this.props.isSetGradFill();
      }

      public void setGradFill(CTGradientFillProperties gradFill) {
         this.props.setGradFill(gradFill);
      }

      public CTGradientFillProperties addNewGradFill() {
         return this.props.addNewGradFill();
      }

      public void unsetGradFill() {
         this.props.unsetGradFill();
      }

      public CTBlipFillProperties getBlipFill() {
         return this.props.getBlipFill();
      }

      public boolean isSetBlipFill() {
         return this.props.isSetBlipFill();
      }

      public void setBlipFill(CTBlipFillProperties blipFill) {
         this.props.setBlipFill(blipFill);
      }

      public CTBlipFillProperties addNewBlipFill() {
         return this.props.addNewBlipFill();
      }

      public void unsetBlipFill() {
         this.props.unsetBlipFill();
      }

      public CTPatternFillProperties getPattFill() {
         return this.props.getPattFill();
      }

      public boolean isSetPattFill() {
         return this.props.isSetPattFill();
      }

      public void setPattFill(CTPatternFillProperties pattFill) {
         this.props.setPattFill(pattFill);
      }

      public CTPatternFillProperties addNewPattFill() {
         return this.props.addNewPattFill();
      }

      public void unsetPattFill() {
         this.props.unsetPattFill();
      }

      public CTGroupFillProperties getGrpFill() {
         return this.props.getGrpFill();
      }

      public boolean isSetGrpFill() {
         return this.props.isSetGrpFill();
      }

      public void setGrpFill(CTGroupFillProperties grpFill) {
         this.props.setGrpFill(grpFill);
      }

      public CTGroupFillProperties addNewGrpFill() {
         return this.props.addNewGrpFill();
      }

      public void unsetGrpFill() {
         this.props.unsetGrpFill();
      }

      public boolean isSetMatrixStyle() {
         return false;
      }

      public CTStyleMatrixReference getMatrixStyle() {
         return null;
      }

      public boolean isLineStyle() {
         return false;
      }
   }
}
