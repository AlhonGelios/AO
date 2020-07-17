package org.apache.poi.xslf.usermodel;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.sl.usermodel.GraphicalFrame;
import org.apache.poi.sl.usermodel.ShapeType;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.usermodel.XSLFPictureShape;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;

public class XSLFGraphicFrame extends XSLFShape implements GraphicalFrame {

   private static final POILogger LOG = POILogFactory.getLogger(XSLFGraphicFrame.class);


   XSLFGraphicFrame(CTGraphicalObjectFrame shape, XSLFSheet sheet) {
      super(shape, sheet);
   }

   public ShapeType getShapeType() {
      throw new UnsupportedOperationException();
   }

   public Rectangle2D getAnchor() {
      CTTransform2D xfrm = ((CTGraphicalObjectFrame)this.getXmlObject()).getXfrm();
      CTPoint2D off = xfrm.getOff();
      double x = Units.toPoints(off.getX());
      double y = Units.toPoints(off.getY());
      CTPositiveSize2D ext = xfrm.getExt();
      double cx = Units.toPoints(ext.getCx());
      double cy = Units.toPoints(ext.getCy());
      return new Double(x, y, cx, cy);
   }

   public void setAnchor(Rectangle2D anchor) {
      CTTransform2D xfrm = ((CTGraphicalObjectFrame)this.getXmlObject()).getXfrm();
      CTPoint2D off = xfrm.isSetOff()?xfrm.getOff():xfrm.addNewOff();
      long x = (long)Units.toEMU(anchor.getX());
      long y = (long)Units.toEMU(anchor.getY());
      off.setX(x);
      off.setY(y);
      CTPositiveSize2D ext = xfrm.isSetExt()?xfrm.getExt():xfrm.addNewExt();
      long cx = (long)Units.toEMU(anchor.getWidth());
      long cy = (long)Units.toEMU(anchor.getHeight());
      ext.setCx(cx);
      ext.setCy(cy);
   }

   static XSLFGraphicFrame create(CTGraphicalObjectFrame shape, XSLFSheet sheet) {
      String uri = shape.getGraphic().getGraphicData().getUri();
      return (XSLFGraphicFrame)("http://schemas.openxmlformats.org/drawingml/2006/table".equals(uri)?new XSLFTable(shape, sheet):new XSLFGraphicFrame(shape, sheet));
   }

   public void setRotation(double theta) {
      throw new IllegalArgumentException("Operation not supported");
   }

   public double getRotation() {
      return 0.0D;
   }

   public void setFlipHorizontal(boolean flip) {
      throw new IllegalArgumentException("Operation not supported");
   }

   public void setFlipVertical(boolean flip) {
      throw new IllegalArgumentException("Operation not supported");
   }

   public boolean getFlipHorizontal() {
      return false;
   }

   public boolean getFlipVertical() {
      return false;
   }

   void copy(XSLFShape sh) {
      super.copy(sh);
      CTGraphicalObjectData data = ((CTGraphicalObjectFrame)this.getXmlObject()).getGraphic().getGraphicData();
      String uri = data.getUri();
      if(uri.equals("http://schemas.openxmlformats.org/drawingml/2006/diagram")) {
         this.copyDiagram(data, (XSLFGraphicFrame)sh);
      }

   }

   private void copyDiagram(CTGraphicalObjectData objData, XSLFGraphicFrame srcShape) {
      String xpath = "declare namespace dgm=\'http://schemas.openxmlformats.org/drawingml/2006/diagram\' $this//dgm:relIds";
      XmlObject[] obj = objData.selectPath(xpath);
      if(obj != null && obj.length == 1) {
         XmlCursor c = obj[0].newCursor();
         XSLFSheet sheet = srcShape.getSheet();

         try {
            String e = c.getAttributeText(new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "dm"));
            PackageRelationship dmRel = sheet.getPackagePart().getRelationship(e);
            PackagePart dmPart = sheet.getPackagePart().getRelatedPart(dmRel);
            this.getSheet().importPart(dmRel, dmPart);
            String lo = c.getAttributeText(new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "lo"));
            PackageRelationship loRel = sheet.getPackagePart().getRelationship(lo);
            PackagePart loPart = sheet.getPackagePart().getRelatedPart(loRel);
            this.getSheet().importPart(loRel, loPart);
            String qs = c.getAttributeText(new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "qs"));
            PackageRelationship qsRel = sheet.getPackagePart().getRelationship(qs);
            PackagePart qsPart = sheet.getPackagePart().getRelatedPart(qsRel);
            this.getSheet().importPart(qsRel, qsPart);
            String cs = c.getAttributeText(new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "cs"));
            PackageRelationship csRel = sheet.getPackagePart().getRelationship(cs);
            PackagePart csPart = sheet.getPackagePart().getRelatedPart(csRel);
            this.getSheet().importPart(csRel, csPart);
         } catch (InvalidFormatException var19) {
            throw new POIXMLException(var19);
         }

         c.dispose();
      }

   }

   public XSLFPictureShape getFallbackPicture() {
      String xquery = "declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\'; declare namespace mc=\'http://schemas.openxmlformats.org/markup-compatibility/2006\' .//mc:Fallback/*/p:pic";
      XmlObject xo = this.selectProperty(XmlObject.class, xquery);
      if(xo == null) {
         return null;
      } else {
         CTGroupShape gs;
         try {
            gs = CTGroupShape.Factory.parse(xo.newDomNode());
         } catch (XmlException var5) {
            LOG.log(5, new Object[]{"Can\'t parse fallback picture stream of graphical frame", var5});
            return null;
         }

         return gs.sizeOfPicArray() == 0?null:new XSLFPictureShape(gs.getPicArray(0), this.getSheet());
      }
   }

}
