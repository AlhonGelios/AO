package org.apache.poi.xslf.usermodel;

import java.awt.Color;
import java.awt.geom.Rectangle2D.Double;
import org.apache.poi.xslf.usermodel.XSLFAutoShape;
import org.apache.poi.xslf.usermodel.XSLFConnectorShape;
import org.apache.poi.xslf.usermodel.XSLFFreeformShape;
import org.apache.poi.xslf.usermodel.XSLFGroupShape;
import org.apache.poi.xslf.usermodel.XSLFPictureShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.apache.poi.xslf.usermodel.XSLFTextBox;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTConnector;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPicture;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;

public class XSLFDrawing {

   private XSLFSheet _sheet;
   private int _shapeId = 1;
   private CTGroupShape _spTree;


   XSLFDrawing(XSLFSheet sheet, CTGroupShape spTree) {
      this._sheet = sheet;
      this._spTree = spTree;
      XmlObject[] cNvPr = sheet.getSpTree().selectPath("declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\' .//*/p:cNvPr");
      XmlObject[] arr$ = cNvPr;
      int len$ = cNvPr.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         XmlObject o = arr$[i$];
         if(o instanceof CTNonVisualDrawingProps) {
            CTNonVisualDrawingProps p = (CTNonVisualDrawingProps)o;
            this._shapeId = (int)Math.max((long)this._shapeId, p.getId());
         }
      }

   }

   public XSLFAutoShape createAutoShape() {
      CTShape sp = this._spTree.addNewSp();
      sp.set(XSLFAutoShape.prototype(this._shapeId++));
      XSLFAutoShape shape = new XSLFAutoShape(sp, this._sheet);
      shape.setAnchor(new Double());
      return shape;
   }

   public XSLFFreeformShape createFreeform() {
      CTShape sp = this._spTree.addNewSp();
      sp.set(XSLFFreeformShape.prototype(this._shapeId++));
      XSLFFreeformShape shape = new XSLFFreeformShape(sp, this._sheet);
      shape.setAnchor(new Double());
      return shape;
   }

   public XSLFTextBox createTextBox() {
      CTShape sp = this._spTree.addNewSp();
      sp.set(XSLFTextBox.prototype(this._shapeId++));
      XSLFTextBox shape = new XSLFTextBox(sp, this._sheet);
      shape.setAnchor(new Double());
      return shape;
   }

   public XSLFConnectorShape createConnector() {
      CTConnector sp = this._spTree.addNewCxnSp();
      sp.set(XSLFConnectorShape.prototype(this._shapeId++));
      XSLFConnectorShape shape = new XSLFConnectorShape(sp, this._sheet);
      shape.setAnchor(new Double());
      shape.setLineColor(Color.black);
      shape.setLineWidth(0.75D);
      return shape;
   }

   public XSLFGroupShape createGroup() {
      CTGroupShape obj = this._spTree.addNewGrpSp();
      obj.set(XSLFGroupShape.prototype(this._shapeId++));
      XSLFGroupShape shape = new XSLFGroupShape(obj, this._sheet);
      shape.setAnchor(new Double());
      return shape;
   }

   public XSLFPictureShape createPicture(String rel) {
      CTPicture obj = this._spTree.addNewPic();
      obj.set(XSLFPictureShape.prototype(this._shapeId++, rel));
      XSLFPictureShape shape = new XSLFPictureShape(obj, this._sheet);
      shape.setAnchor(new Double());
      return shape;
   }

   public XSLFTable createTable() {
      CTGraphicalObjectFrame obj = this._spTree.addNewGraphicFrame();
      obj.set(XSLFTable.prototype(this._shapeId++));
      XSLFTable shape = new XSLFTable(obj, this._sheet);
      shape.setAnchor(new Double());
      return shape;
   }
}
