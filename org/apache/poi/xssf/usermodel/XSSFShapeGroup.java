package org.apache.poi.xssf.usermodel;

import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.XSSFChildAnchor;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFConnector;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFPicture;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSimpleShape;
import org.apache.poi.xssf.usermodel.XSSFTextBox;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape;

public final class XSSFShapeGroup extends XSSFShape {

   private static CTGroupShape prototype = null;
   private CTGroupShape ctGroup;


   protected XSSFShapeGroup(XSSFDrawing drawing, CTGroupShape ctGroup) {
      this.drawing = drawing;
      this.ctGroup = ctGroup;
   }

   protected static CTGroupShape prototype() {
      if(prototype == null) {
         CTGroupShape shape = CTGroupShape.Factory.newInstance();
         CTGroupShapeNonVisual nv = shape.addNewNvGrpSpPr();
         CTNonVisualDrawingProps nvpr = nv.addNewCNvPr();
         nvpr.setId(0L);
         nvpr.setName("Group 0");
         nv.addNewCNvGrpSpPr();
         CTGroupShapeProperties sp = shape.addNewGrpSpPr();
         CTGroupTransform2D t2d = sp.addNewXfrm();
         CTPositiveSize2D p1 = t2d.addNewExt();
         p1.setCx(0L);
         p1.setCy(0L);
         CTPoint2D p2 = t2d.addNewOff();
         p2.setX(0L);
         p2.setY(0L);
         CTPositiveSize2D p3 = t2d.addNewChExt();
         p3.setCx(0L);
         p3.setCy(0L);
         CTPoint2D p4 = t2d.addNewChOff();
         p4.setX(0L);
         p4.setY(0L);
         prototype = shape;
      }

      return prototype;
   }

   public XSSFTextBox createTextbox(XSSFChildAnchor anchor) {
      CTShape ctShape = this.ctGroup.addNewSp();
      ctShape.set(XSSFSimpleShape.prototype());
      XSSFTextBox shape = new XSSFTextBox(this.getDrawing(), ctShape);
      shape.parent = this;
      shape.anchor = anchor;
      shape.getCTShape().getSpPr().setXfrm(anchor.getCTTransform2D());
      return shape;
   }

   public XSSFSimpleShape createSimpleShape(XSSFChildAnchor anchor) {
      CTShape ctShape = this.ctGroup.addNewSp();
      ctShape.set(XSSFSimpleShape.prototype());
      XSSFSimpleShape shape = new XSSFSimpleShape(this.getDrawing(), ctShape);
      shape.parent = this;
      shape.anchor = anchor;
      shape.getCTShape().getSpPr().setXfrm(anchor.getCTTransform2D());
      return shape;
   }

   public XSSFConnector createConnector(XSSFChildAnchor anchor) {
      CTConnector ctShape = this.ctGroup.addNewCxnSp();
      ctShape.set(XSSFConnector.prototype());
      XSSFConnector shape = new XSSFConnector(this.getDrawing(), ctShape);
      shape.parent = this;
      shape.anchor = anchor;
      shape.getCTConnector().getSpPr().setXfrm(anchor.getCTTransform2D());
      return shape;
   }

   public XSSFPicture createPicture(XSSFClientAnchor anchor, int pictureIndex) {
      PackageRelationship rel = this.getDrawing().addPictureReference(pictureIndex);
      CTPicture ctShape = this.ctGroup.addNewPic();
      ctShape.set(XSSFPicture.prototype());
      XSSFPicture shape = new XSSFPicture(this.getDrawing(), ctShape);
      shape.parent = this;
      shape.anchor = anchor;
      shape.setPictureReference(rel);
      return shape;
   }

   @Internal
   public CTGroupShape getCTGroupShape() {
      return this.ctGroup;
   }

   public void setCoordinates(int x1, int y1, int x2, int y2) {
      CTGroupTransform2D t2d = this.ctGroup.getGrpSpPr().getXfrm();
      CTPoint2D off = t2d.getOff();
      off.setX((long)x1);
      off.setY((long)y1);
      CTPositiveSize2D ext = t2d.getExt();
      ext.setCx((long)x2);
      ext.setCy((long)y2);
      CTPoint2D chOff = t2d.getChOff();
      chOff.setX((long)x1);
      chOff.setY((long)y1);
      CTPositiveSize2D chExt = t2d.getChExt();
      chExt.setCx((long)x2);
      chExt.setCy((long)y2);
   }

   protected CTShapeProperties getShapeProperties() {
      throw new IllegalStateException("Not supported for shape group");
   }

}
