package org.apache.poi.xslf.usermodel;

import java.awt.Graphics2D;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.sl.draw.DrawPictureShape;
import org.apache.poi.sl.draw.DrawSheet;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.sl.usermodel.Placeholder;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.Internal;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFAutoShape;
import org.apache.poi.xslf.usermodel.XSLFBackground;
import org.apache.poi.xslf.usermodel.XSLFCommonSlideData;
import org.apache.poi.xslf.usermodel.XSLFConnectorShape;
import org.apache.poi.xslf.usermodel.XSLFDrawing;
import org.apache.poi.xslf.usermodel.XSLFFreeformShape;
import org.apache.poi.xslf.usermodel.XSLFGraphicFrame;
import org.apache.poi.xslf.usermodel.XSLFGroupShape;
import org.apache.poi.xslf.usermodel.XSLFPictureData;
import org.apache.poi.xslf.usermodel.XSLFPictureShape;
import org.apache.poi.xslf.usermodel.XSLFRelation;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFShapeContainer;
import org.apache.poi.xslf.usermodel.XSLFSimpleShape;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.apache.poi.xslf.usermodel.XSLFTableRow;
import org.apache.poi.xslf.usermodel.XSLFTextBox;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTConnector;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPicture;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;

public abstract class XSLFSheet extends POIXMLDocumentPart implements XSLFShapeContainer, Sheet {

   private XSLFCommonSlideData _commonSlideData;
   private XSLFDrawing _drawing;
   private List _shapes;
   private CTGroupShape _spTree;
   private List _placeholders;
   private Map _placeholderByIdMap;
   private Map _placeholderByTypeMap;


   public XSLFSheet() {}

   public XSLFSheet(PackagePart part) {
      super(part);
   }

   @Deprecated
   public XSLFSheet(PackagePart part, PackageRelationship rel) {
      this(part);
   }

   public XMLSlideShow getSlideShow() {
      for(POIXMLDocumentPart p = this.getParent(); p != null; p = p.getParent()) {
         if(p instanceof XMLSlideShow) {
            return (XMLSlideShow)p;
         }
      }

      throw new IllegalStateException("SlideShow was not found");
   }

   protected static List buildShapes(CTGroupShape spTree, XSLFSheet sheet) {
      ArrayList shapes = new ArrayList();
      XmlObject[] arr$ = spTree.selectPath("*");
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         XmlObject ch = arr$[i$];
         if(ch instanceof CTShape) {
            XSLFAutoShape shape = XSLFAutoShape.create((CTShape)ch, sheet);
            shapes.add(shape);
         } else if(ch instanceof CTGroupShape) {
            shapes.add(new XSLFGroupShape((CTGroupShape)ch, sheet));
         } else if(ch instanceof CTConnector) {
            shapes.add(new XSLFConnectorShape((CTConnector)ch, sheet));
         } else if(ch instanceof CTPicture) {
            shapes.add(new XSLFPictureShape((CTPicture)ch, sheet));
         } else if(ch instanceof CTGraphicalObjectFrame) {
            XSLFGraphicFrame var8 = XSLFGraphicFrame.create((CTGraphicalObjectFrame)ch, sheet);
            shapes.add(var8);
         }
      }

      return shapes;
   }

   public abstract XmlObject getXmlObject();

   @Internal
   public XSLFCommonSlideData getCommonSlideData() {
      return this._commonSlideData;
   }

   protected void setCommonSlideData(CTCommonSlideData data) {
      if(data == null) {
         this._commonSlideData = null;
      } else {
         this._commonSlideData = new XSLFCommonSlideData(data);
      }

   }

   private XSLFDrawing getDrawing() {
      this.initDrawingAndShapes();
      return this._drawing;
   }

   public List getShapes() {
      this.initDrawingAndShapes();
      return this._shapes;
   }

   private void initDrawingAndShapes() {
      CTGroupShape cgs = this.getSpTree();
      if(this._drawing == null) {
         this._drawing = new XSLFDrawing(this, cgs);
      }

      if(this._shapes == null) {
         this._shapes = buildShapes(cgs, this);
      }

   }

   public XSLFAutoShape createAutoShape() {
      XSLFAutoShape sh = this.getDrawing().createAutoShape();
      this.getShapes().add(sh);
      sh.setParent(this);
      return sh;
   }

   public XSLFFreeformShape createFreeform() {
      XSLFFreeformShape sh = this.getDrawing().createFreeform();
      this.getShapes().add(sh);
      sh.setParent(this);
      return sh;
   }

   public XSLFTextBox createTextBox() {
      XSLFTextBox sh = this.getDrawing().createTextBox();
      this.getShapes().add(sh);
      sh.setParent(this);
      return sh;
   }

   public XSLFConnectorShape createConnector() {
      XSLFConnectorShape sh = this.getDrawing().createConnector();
      this.getShapes().add(sh);
      sh.setParent(this);
      return sh;
   }

   public XSLFGroupShape createGroup() {
      XSLFGroupShape sh = this.getDrawing().createGroup();
      this.getShapes().add(sh);
      sh.setParent(this);
      return sh;
   }

   public XSLFPictureShape createPicture(PictureData pictureData) {
      if(!(pictureData instanceof XSLFPictureData)) {
         throw new IllegalArgumentException("pictureData needs to be of type XSLFPictureData");
      } else {
         XSLFPictureData xPictureData = (XSLFPictureData)pictureData;
         PackagePart pic = xPictureData.getPackagePart();
         POIXMLDocumentPart.RelationPart rp = this.addRelation((String)null, XSLFRelation.IMAGES, new XSLFPictureData(pic));
         XSLFPictureShape sh = this.getDrawing().createPicture(rp.getRelationship().getId());
         (new DrawPictureShape(sh)).resize();
         this.getShapes().add(sh);
         sh.setParent(this);
         return sh;
      }
   }

   public XSLFTable createTable() {
      XSLFTable sh = this.getDrawing().createTable();
      this.getShapes().add(sh);
      sh.setParent(this);
      return sh;
   }

   public XSLFTable createTable(int numRows, int numCols) {
      if(numRows >= 1 && numCols >= 1) {
         XSLFTable sh = this.getDrawing().createTable();
         this.getShapes().add(sh);
         sh.setParent(this);

         for(int r = 0; r < numRows; ++r) {
            XSLFTableRow row = sh.addRow();

            for(int c = 0; c < numCols; ++c) {
               row.addCell();
            }
         }

         return sh;
      } else {
         throw new IllegalArgumentException("numRows and numCols must be greater than 0");
      }
   }

   public Iterator iterator() {
      return this.getShapes().iterator();
   }

   public void addShape(XSLFShape shape) {
      throw new UnsupportedOperationException("Adding a shape from a different container is not supported - create it from scratch witht XSLFSheet.create* methods");
   }

   public boolean removeShape(XSLFShape xShape) {
      XmlObject obj = xShape.getXmlObject();
      CTGroupShape spTree = this.getSpTree();
      if(obj instanceof CTShape) {
         spTree.getSpList().remove(obj);
      } else if(obj instanceof CTGroupShape) {
         spTree.getGrpSpList().remove(obj);
      } else if(obj instanceof CTConnector) {
         spTree.getCxnSpList().remove(obj);
      } else if(obj instanceof CTGraphicalObjectFrame) {
         spTree.getGraphicFrameList().remove(obj);
      } else {
         if(!(obj instanceof CTPicture)) {
            throw new IllegalArgumentException("Unsupported shape: " + xShape);
         }

         XSLFPictureShape ps = (XSLFPictureShape)xShape;
         this.removePictureRelation(ps);
         spTree.getPicList().remove(obj);
      }

      return this.getShapes().remove(xShape);
   }

   public void clear() {
      ArrayList shapes = new ArrayList(this.getShapes());
      Iterator i$ = shapes.iterator();

      while(i$.hasNext()) {
         XSLFShape shape = (XSLFShape)i$.next();
         this.removeShape(shape);
      }

   }

   protected abstract String getRootElementName();

   protected CTGroupShape getSpTree() {
      if(this._spTree == null) {
         XmlObject root = this.getXmlObject();
         XmlObject[] sp = root.selectPath("declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\' .//*/p:spTree");
         if(sp.length == 0) {
            throw new IllegalStateException("CTGroupShape was not found");
         }

         this._spTree = (CTGroupShape)sp[0];
      }

      return this._spTree;
   }

   protected final void commit() throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      String docName = this.getRootElementName();
      if(docName != null) {
         xmlOptions.setSaveSyntheticDocumentElement(new QName("http://schemas.openxmlformats.org/presentationml/2006/main", docName));
      }

      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.getXmlObject().save(out, xmlOptions);
      out.close();
   }

   public XSLFSheet importContent(XSLFSheet src) {
      this._shapes = null;
      this._spTree = null;
      this._drawing = null;
      this._spTree = null;
      this._placeholders = null;
      this.getSpTree().set(src.getSpTree());
      List tgtShapes = this.getShapes();
      List srcShapes = src.getShapes();

      for(int i = 0; i < tgtShapes.size(); ++i) {
         XSLFShape s1 = (XSLFShape)srcShapes.get(i);
         XSLFShape s2 = (XSLFShape)tgtShapes.get(i);
         s2.copy(s1);
      }

      return this;
   }

   public XSLFSheet appendContent(XSLFSheet src) {
      CTGroupShape spTree = this.getSpTree();
      int numShapes = this.getShapes().size();
      CTGroupShape srcTree = src.getSpTree();
      XmlObject[] tgtShapes = srcTree.selectPath("*");
      int srcShapes = tgtShapes.length;

      int i;
      for(i = 0; i < srcShapes; ++i) {
         XmlObject s1 = tgtShapes[i];
         if(s1 instanceof CTShape) {
            spTree.addNewSp().set(s1);
         } else if(s1 instanceof CTGroupShape) {
            spTree.addNewGrpSp().set(s1);
         } else if(s1 instanceof CTConnector) {
            spTree.addNewCxnSp().set(s1);
         } else if(s1 instanceof CTPicture) {
            spTree.addNewPic().set(s1);
         } else if(s1 instanceof CTGraphicalObjectFrame) {
            spTree.addNewGraphicFrame().set(s1);
         }
      }

      this._shapes = null;
      this._spTree = null;
      this._drawing = null;
      this._spTree = null;
      this._placeholders = null;
      List var10 = this.getShapes();
      List var11 = src.getShapes();

      for(i = 0; i < var11.size(); ++i) {
         XSLFShape var12 = (XSLFShape)var11.get(i);
         XSLFShape s2 = (XSLFShape)var10.get(numShapes + i);
         s2.copy(var12);
      }

      return this;
   }

   XSLFTheme getTheme() {
      return null;
   }

   protected XSLFTextShape getTextShapeByType(Placeholder type) {
      Iterator i$ = this.getShapes().iterator();

      while(i$.hasNext()) {
         XSLFShape shape = (XSLFShape)i$.next();
         if(shape instanceof XSLFTextShape) {
            XSLFTextShape txt = (XSLFTextShape)shape;
            if(txt.getTextType() == type) {
               return txt;
            }
         }
      }

      return null;
   }

   XSLFSimpleShape getPlaceholder(CTPlaceholder ph) {
      XSLFSimpleShape shape = null;
      if(ph.isSetIdx()) {
         shape = this.getPlaceholderById((int)ph.getIdx());
      }

      if(shape == null && ph.isSetType()) {
         shape = this.getPlaceholderByType(ph.getType().intValue());
      }

      return shape;
   }

   void initPlaceholders() {
      if(this._placeholders == null) {
         this._placeholders = new ArrayList();
         this._placeholderByIdMap = new HashMap();
         this._placeholderByTypeMap = new HashMap();
         Iterator i$ = this.getShapes().iterator();

         while(i$.hasNext()) {
            XSLFShape sh = (XSLFShape)i$.next();
            if(sh instanceof XSLFTextShape) {
               XSLFTextShape sShape = (XSLFTextShape)sh;
               CTPlaceholder ph = sShape.getCTPlaceholder();
               if(ph != null) {
                  this._placeholders.add(sShape);
                  if(ph.isSetIdx()) {
                     int idx = (int)ph.getIdx();
                     this._placeholderByIdMap.put(Integer.valueOf(idx), sShape);
                  }

                  if(ph.isSetType()) {
                     this._placeholderByTypeMap.put(Integer.valueOf(ph.getType().intValue()), sShape);
                  }
               }
            }
         }
      }

   }

   XSLFSimpleShape getPlaceholderById(int id) {
      this.initPlaceholders();
      return (XSLFSimpleShape)this._placeholderByIdMap.get(Integer.valueOf(id));
   }

   XSLFSimpleShape getPlaceholderByType(int ordinal) {
      this.initPlaceholders();
      return (XSLFSimpleShape)this._placeholderByTypeMap.get(Integer.valueOf(ordinal));
   }

   public XSLFTextShape getPlaceholder(int idx) {
      this.initPlaceholders();
      return (XSLFTextShape)this._placeholders.get(idx);
   }

   public XSLFTextShape[] getPlaceholders() {
      this.initPlaceholders();
      return (XSLFTextShape[])this._placeholders.toArray(new XSLFTextShape[this._placeholders.size()]);
   }

   protected boolean canDraw(XSLFShape shape) {
      return true;
   }

   public boolean getFollowMasterGraphics() {
      return false;
   }

   public XSLFBackground getBackground() {
      return null;
   }

   public void draw(Graphics2D graphics) {
      DrawFactory drawFact = DrawFactory.getInstance(graphics);
      DrawSheet draw = drawFact.getDrawable((Sheet)this);
      draw.draw(graphics);
   }

   String importBlip(String blipId, PackagePart packagePart) {
      PackageRelationship blipRel = packagePart.getRelationship(blipId);

      PackagePart blipPart;
      try {
         blipPart = packagePart.getRelatedPart(blipRel);
      } catch (InvalidFormatException var10) {
         throw new POIXMLException(var10);
      }

      XSLFPictureData data = new XSLFPictureData(blipPart);
      XMLSlideShow ppt = this.getSlideShow();
      XSLFPictureData pictureData = ppt.addPicture(data.getData(), data.getType());
      PackagePart pic = pictureData.getPackagePart();
      POIXMLDocumentPart.RelationPart rp = this.addRelation(blipId, XSLFRelation.IMAGES, new XSLFPictureData(pic));
      return rp.getRelationship().getId();
   }

   PackagePart importPart(PackageRelationship srcRel, PackagePart srcPafrt) {
      PackagePart destPP = this.getPackagePart();
      PackagePartName srcPPName = srcPafrt.getPartName();
      OPCPackage pkg = destPP.getPackage();
      if(pkg.containPart(srcPPName)) {
         return pkg.getPart(srcPPName);
      } else {
         destPP.addRelationship(srcPPName, TargetMode.INTERNAL, srcRel.getRelationshipType());
         PackagePart part = pkg.createPart(srcPPName, srcPafrt.getContentType());

         try {
            OutputStream e = part.getOutputStream();
            InputStream is = srcPafrt.getInputStream();
            IOUtils.copy(is, e);
            is.close();
            e.close();
            return part;
         } catch (IOException var9) {
            throw new POIXMLException(var9);
         }
      }
   }

   void removePictureRelation(XSLFPictureShape pictureShape) {
      POIXMLDocumentPart pd = this.getRelationById(pictureShape.getBlipId());
      this.removeRelation(pd);
   }
}
