package org.apache.poi.xslf.usermodel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import org.apache.poi.POIXMLException;
import org.apache.poi.sl.usermodel.Background;
import org.apache.poi.sl.usermodel.Placeholder;
import org.apache.poi.xslf.usermodel.XSLFColor;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFSimpleShape;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackground;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties;

public class XSLFBackground extends XSLFSimpleShape implements Background {

   XSLFBackground(CTBackground shape, XSLFSheet sheet) {
      super(shape, sheet);
   }

   public Rectangle2D getAnchor() {
      Dimension pg = this.getSheet().getSlideShow().getPageSize();
      return new Double(0.0D, 0.0D, pg.getWidth(), pg.getHeight());
   }

   protected CTTransform2D getXfrm(boolean create) {
      return null;
   }

   public void setPlaceholder(Placeholder placeholder) {
      throw new POIXMLException("Can\'t set a placeholder for a background");
   }

   protected CTBackgroundProperties getBgPr(boolean create) {
      CTBackground bg = (CTBackground)this.getXmlObject();
      if(!bg.isSetBgPr() && create) {
         if(bg.isSetBgRef()) {
            bg.unsetBgRef();
         }

         return bg.addNewBgPr();
      } else {
         return bg.getBgPr();
      }
   }

   public void setFillColor(Color color) {
      CTBackgroundProperties bgPr = this.getBgPr(true);
      if(color == null) {
         if(bgPr.isSetSolidFill()) {
            bgPr.unsetSolidFill();
         }

         if(!bgPr.isSetNoFill()) {
            bgPr.addNewNoFill();
         }
      } else {
         if(bgPr.isSetNoFill()) {
            bgPr.unsetNoFill();
         }

         CTSolidColorFillProperties fill = bgPr.isSetSolidFill()?bgPr.getSolidFill():bgPr.addNewSolidFill();
         XSLFColor col = new XSLFColor(fill, this.getSheet().getTheme(), fill.getSchemeClr());
         col.setColor(color);
      }

   }

   protected XmlObject getShapeProperties() {
      CTBackground bg = (CTBackground)this.getXmlObject();
      return (XmlObject)(bg.isSetBgPr()?bg.getBgPr():(bg.isSetBgRef()?bg.getBgRef():null));
   }
}
