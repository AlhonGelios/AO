package org.apache.poi.xslf.usermodel;

import org.apache.poi.sl.usermodel.AutoShape;
import org.apache.poi.xslf.usermodel.XSLFFreeformShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFTextBox;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.openxmlformats.schemas.drawingml.x2006.main.STShapeType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShapeNonVisual;

public class XSLFAutoShape extends XSLFTextShape implements AutoShape {

   XSLFAutoShape(CTShape shape, XSLFSheet sheet) {
      super(shape, sheet);
   }

   static XSLFAutoShape create(CTShape shape, XSLFSheet sheet) {
      return (XSLFAutoShape)(shape.getSpPr().isSetCustGeom()?new XSLFFreeformShape(shape, sheet):(shape.getNvSpPr().getCNvSpPr().isSetTxBox()?new XSLFTextBox(shape, sheet):new XSLFAutoShape(shape, sheet)));
   }

   static CTShape prototype(int shapeId) {
      CTShape ct = CTShape.Factory.newInstance();
      CTShapeNonVisual nvSpPr = ct.addNewNvSpPr();
      CTNonVisualDrawingProps cnv = nvSpPr.addNewCNvPr();
      cnv.setName("AutoShape " + shapeId);
      cnv.setId((long)(shapeId + 1));
      nvSpPr.addNewCNvSpPr();
      nvSpPr.addNewNvPr();
      CTShapeProperties spPr = ct.addNewSpPr();
      CTPresetGeometry2D prst = spPr.addNewPrstGeom();
      prst.setPrst(STShapeType.RECT);
      prst.addNewAvLst();
      return ct;
   }

   protected static void initTextBody(CTTextBody txBody) {
      CTTextBodyProperties bodypr = txBody.addNewBodyPr();
      bodypr.setAnchor(STTextAnchoringType.T);
      bodypr.setRtlCol(false);
      CTTextParagraph p = txBody.addNewP();
      p.addNewPPr().setAlgn(STTextAlignType.L);
      CTTextCharacterProperties endPr = p.addNewEndParaRPr();
      endPr.setLang("en-US");
      endPr.setSz(1100);
      p.addNewR().setT("");
      txBody.addNewLstStyle();
   }

   protected CTTextBody getTextBody(boolean create) {
      CTShape shape = (CTShape)this.getXmlObject();
      CTTextBody txBody = shape.getTxBody();
      if(txBody == null && create) {
         txBody = shape.addNewTxBody();
         initTextBody(txBody);
      }

      return txBody;
   }

   public String toString() {
      return "[" + this.getClass().getSimpleName() + "] " + this.getShapeName();
   }
}
