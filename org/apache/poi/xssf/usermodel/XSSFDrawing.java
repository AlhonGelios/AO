package org.apache.poi.xssf.usermodel;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.model.CommentsTable;
import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFConnector;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFGraphicFrame;
import org.apache.poi.xssf.usermodel.XSSFPicture;
import org.apache.poi.xssf.usermodel.XSSFPictureData;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFShapeGroup;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSimpleShape;
import org.apache.poi.xssf.usermodel.XSSFTextBox;
import org.apache.poi.xssf.usermodel.XSSFVMLDrawing;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs;

public final class XSSFDrawing extends POIXMLDocumentPart implements Drawing {

   private CTDrawing drawing;
   private long numOfGraphicFrames;
   protected static final String NAMESPACE_A = "http://schemas.openxmlformats.org/drawingml/2006/main";
   protected static final String NAMESPACE_C = "http://schemas.openxmlformats.org/drawingml/2006/chart";


   protected XSSFDrawing() {
      this.numOfGraphicFrames = 0L;
      this.drawing = newDrawing();
   }

   public XSSFDrawing(PackagePart part) throws IOException, XmlException {
      super(part);
      this.numOfGraphicFrames = 0L;
      XmlOptions options = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      options.setLoadReplaceDocumentElement((QName)null);
      this.drawing = CTDrawing.Factory.parse(part.getInputStream(), options);
   }

   @Deprecated
   public XSSFDrawing(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   private static CTDrawing newDrawing() {
      return CTDrawing.Factory.newInstance();
   }

   @Internal
   public CTDrawing getCTDrawing() {
      return this.drawing;
   }

   protected void commit() throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveSyntheticDocumentElement(new QName(CTDrawing.type.getName().getNamespaceURI(), "wsDr", "xdr"));
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.drawing.save(out, xmlOptions);
      out.close();
   }

   public XSSFClientAnchor createAnchor(int dx1, int dy1, int dx2, int dy2, int col1, int row1, int col2, int row2) {
      return new XSSFClientAnchor(dx1, dy1, dx2, dy2, col1, row1, col2, row2);
   }

   public XSSFTextBox createTextbox(XSSFClientAnchor anchor) {
      long shapeId = this.newShapeId();
      CTTwoCellAnchor ctAnchor = this.createTwoCellAnchor(anchor);
      CTShape ctShape = ctAnchor.addNewSp();
      ctShape.set(XSSFSimpleShape.prototype());
      ctShape.getNvSpPr().getCNvPr().setId(shapeId);
      XSSFTextBox shape = new XSSFTextBox(this, ctShape);
      shape.anchor = anchor;
      return shape;
   }

   public XSSFPicture createPicture(XSSFClientAnchor anchor, int pictureIndex) {
      PackageRelationship rel = this.addPictureReference(pictureIndex);
      long shapeId = this.newShapeId();
      CTTwoCellAnchor ctAnchor = this.createTwoCellAnchor(anchor);
      CTPicture ctShape = ctAnchor.addNewPic();
      ctShape.set(XSSFPicture.prototype());
      ctShape.getNvPicPr().getCNvPr().setId(shapeId);
      XSSFPicture shape = new XSSFPicture(this, ctShape);
      shape.anchor = anchor;
      shape.setPictureReference(rel);
      return shape;
   }

   public XSSFPicture createPicture(ClientAnchor anchor, int pictureIndex) {
      return this.createPicture((XSSFClientAnchor)anchor, pictureIndex);
   }

   public XSSFChart createChart(XSSFClientAnchor anchor) {
      int chartNumber = this.getPackagePart().getPackage().getPartsByContentType(XSSFRelation.CHART.getContentType()).size() + 1;
      POIXMLDocumentPart.RelationPart rp = this.createRelationship(XSSFRelation.CHART, XSSFFactory.getInstance(), chartNumber, false);
      XSSFChart chart = (XSSFChart)rp.getDocumentPart();
      String chartRelId = rp.getRelationship().getId();
      XSSFGraphicFrame frame = this.createGraphicFrame(anchor);
      frame.setChart(chart, chartRelId);
      return chart;
   }

   public XSSFChart createChart(ClientAnchor anchor) {
      return this.createChart((XSSFClientAnchor)anchor);
   }

   protected PackageRelationship addPictureReference(int pictureIndex) {
      XSSFWorkbook wb = (XSSFWorkbook)this.getParent().getParent();
      XSSFPictureData data = (XSSFPictureData)wb.getAllPictures().get(pictureIndex);
      XSSFPictureData pic = new XSSFPictureData(data.getPackagePart());
      POIXMLDocumentPart.RelationPart rp = this.addRelation((String)null, XSSFRelation.IMAGES, pic);
      return rp.getRelationship();
   }

   public XSSFSimpleShape createSimpleShape(XSSFClientAnchor anchor) {
      long shapeId = this.newShapeId();
      CTTwoCellAnchor ctAnchor = this.createTwoCellAnchor(anchor);
      CTShape ctShape = ctAnchor.addNewSp();
      ctShape.set(XSSFSimpleShape.prototype());
      ctShape.getNvSpPr().getCNvPr().setId(shapeId);
      XSSFSimpleShape shape = new XSSFSimpleShape(this, ctShape);
      shape.anchor = anchor;
      return shape;
   }

   public XSSFConnector createConnector(XSSFClientAnchor anchor) {
      CTTwoCellAnchor ctAnchor = this.createTwoCellAnchor(anchor);
      CTConnector ctShape = ctAnchor.addNewCxnSp();
      ctShape.set(XSSFConnector.prototype());
      XSSFConnector shape = new XSSFConnector(this, ctShape);
      shape.anchor = anchor;
      return shape;
   }

   public XSSFShapeGroup createGroup(XSSFClientAnchor anchor) {
      CTTwoCellAnchor ctAnchor = this.createTwoCellAnchor(anchor);
      CTGroupShape ctGroup = ctAnchor.addNewGrpSp();
      ctGroup.set(XSSFShapeGroup.prototype());
      XSSFShapeGroup shape = new XSSFShapeGroup(this, ctGroup);
      shape.anchor = anchor;
      return shape;
   }

   public XSSFComment createCellComment(ClientAnchor anchor) {
      XSSFClientAnchor ca = (XSSFClientAnchor)anchor;
      XSSFSheet sheet = (XSSFSheet)this.getParent();
      CommentsTable comments = sheet.getCommentsTable(true);
      XSSFVMLDrawing vml = sheet.getVMLDrawing(true);
      com.microsoft.schemas.vml.CTShape vmlShape = vml.newCommentShape();
      if(ca.isSet()) {
         int ref = ca.getDx1() / 9525;
         int dy1Pixels = ca.getDy1() / 9525;
         int dx2Pixels = ca.getDx2() / 9525;
         int dy2Pixels = ca.getDy2() / 9525;
         String position = ca.getCol1() + ", " + ref + ", " + ca.getRow1() + ", " + dy1Pixels + ", " + ca.getCol2() + ", " + dx2Pixels + ", " + ca.getRow2() + ", " + dy2Pixels;
         vmlShape.getClientDataArray(0).setAnchorArray(0, position);
      }

      CellAddress ref1 = new CellAddress(ca.getRow1(), ca.getCol1());
      if(comments.findCellComment(ref1) != null) {
         throw new IllegalArgumentException("Multiple cell comments in one cell are not allowed, cell: " + ref1);
      } else {
         return new XSSFComment(comments, comments.newComment(ref1), vmlShape);
      }
   }

   private XSSFGraphicFrame createGraphicFrame(XSSFClientAnchor anchor) {
      CTTwoCellAnchor ctAnchor = this.createTwoCellAnchor(anchor);
      CTGraphicalObjectFrame ctGraphicFrame = ctAnchor.addNewGraphicFrame();
      ctGraphicFrame.set(XSSFGraphicFrame.prototype());
      long frameId = (long)(this.numOfGraphicFrames++);
      XSSFGraphicFrame graphicFrame = new XSSFGraphicFrame(this, ctGraphicFrame);
      graphicFrame.setAnchor(anchor);
      graphicFrame.setId(frameId);
      graphicFrame.setName("Diagramm" + frameId);
      return graphicFrame;
   }

   public List getCharts() {
      ArrayList charts = new ArrayList();
      Iterator i$ = this.getRelations().iterator();

      while(i$.hasNext()) {
         POIXMLDocumentPart part = (POIXMLDocumentPart)i$.next();
         if(part instanceof XSSFChart) {
            charts.add((XSSFChart)part);
         }
      }

      return charts;
   }

   private CTTwoCellAnchor createTwoCellAnchor(XSSFClientAnchor anchor) {
      CTTwoCellAnchor ctAnchor = this.drawing.addNewTwoCellAnchor();
      ctAnchor.setFrom(anchor.getFrom());
      ctAnchor.setTo(anchor.getTo());
      ctAnchor.addNewClientData();
      anchor.setTo(ctAnchor.getTo());
      anchor.setFrom(ctAnchor.getFrom());
      STEditAs.Enum aditAs;
      switch(XSSFDrawing.NamelessClass759897633.$SwitchMap$org$apache$poi$ss$usermodel$ClientAnchor$AnchorType[anchor.getAnchorType().ordinal()]) {
      case 1:
         aditAs = STEditAs.ABSOLUTE;
         break;
      case 2:
         aditAs = STEditAs.TWO_CELL;
         break;
      case 3:
         aditAs = STEditAs.ONE_CELL;
         break;
      default:
         aditAs = STEditAs.ONE_CELL;
      }

      ctAnchor.setEditAs(aditAs);
      return ctAnchor;
   }

   private long newShapeId() {
      return (long)(this.drawing.sizeOfTwoCellAnchorArray() + 1);
   }

   public List getShapes() {
      ArrayList lst = new ArrayList();
      XmlObject[] arr$ = this.drawing.selectPath("./*/*");
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         XmlObject obj = arr$[i$];
         Object shape = null;
         if(obj instanceof CTPicture) {
            shape = new XSSFPicture(this, (CTPicture)obj);
         } else if(obj instanceof CTConnector) {
            shape = new XSSFConnector(this, (CTConnector)obj);
         } else if(obj instanceof CTShape) {
            shape = new XSSFSimpleShape(this, (CTShape)obj);
         } else if(obj instanceof CTGraphicalObjectFrame) {
            shape = new XSSFGraphicFrame(this, (CTGraphicalObjectFrame)obj);
         } else if(obj instanceof CTGroupShape) {
            shape = new XSSFShapeGroup(this, (CTGroupShape)obj);
         }

         if(shape != null) {
            ((XSSFShape)shape).anchor = this.getAnchorFromParent(obj);
            lst.add(shape);
         }
      }

      return lst;
   }

   private XSSFAnchor getAnchorFromParent(XmlObject obj) {
      XSSFClientAnchor anchor = null;
      XmlObject parentXbean = null;
      XmlCursor cursor = obj.newCursor();
      if(cursor.toParent()) {
         parentXbean = cursor.getObject();
      }

      cursor.dispose();
      if(parentXbean != null) {
         if(parentXbean instanceof CTTwoCellAnchor) {
            CTTwoCellAnchor ct = (CTTwoCellAnchor)parentXbean;
            anchor = new XSSFClientAnchor(ct.getFrom(), ct.getTo());
         } else if(parentXbean instanceof CTOneCellAnchor) {
            CTOneCellAnchor ct1 = (CTOneCellAnchor)parentXbean;
            anchor = new XSSFClientAnchor(ct1.getFrom(), CTMarker.Factory.newInstance());
         }
      }

      return anchor;
   }

   // $FF: synthetic class
   static class NamelessClass759897633 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$ClientAnchor$AnchorType = new int[ClientAnchor.AnchorType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$ClientAnchor$AnchorType[ClientAnchor.AnchorType.DONT_MOVE_AND_RESIZE.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$ClientAnchor$AnchorType[ClientAnchor.AnchorType.MOVE_AND_RESIZE.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$ClientAnchor$AnchorType[ClientAnchor.AnchorType.MOVE_DONT_RESIZE.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
