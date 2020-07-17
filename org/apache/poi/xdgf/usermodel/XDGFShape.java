package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType;
import com.microsoft.schemas.office.visio.x2012.main.TextType;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.apache.poi.POIXMLException;
import org.apache.poi.util.Internal;
import org.apache.poi.xdgf.exceptions.XDGFException;
import org.apache.poi.xdgf.usermodel.XDGFBaseContents;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFDocument;
import org.apache.poi.xdgf.usermodel.XDGFMaster;
import org.apache.poi.xdgf.usermodel.XDGFMasterContents;
import org.apache.poi.xdgf.usermodel.XDGFPageContents;
import org.apache.poi.xdgf.usermodel.XDGFSheet;
import org.apache.poi.xdgf.usermodel.XDGFText;
import org.apache.poi.xdgf.usermodel.section.CombinedIterable;
import org.apache.poi.xdgf.usermodel.section.GeometrySection;
import org.apache.poi.xdgf.usermodel.section.XDGFSection;
import org.apache.poi.xdgf.usermodel.shape.ShapeVisitor;
import org.apache.poi.xdgf.usermodel.shape.exceptions.StopVisitingThisBranch;

public class XDGFShape extends XDGFSheet {

   XDGFBaseContents _parentPage;
   XDGFShape _parent;
   XDGFMaster _master;
   XDGFShape _masterShape;
   XDGFText _text;
   List _shapes;
   Double _pinX;
   Double _pinY;
   Double _width;
   Double _height;
   Double _locPinX;
   Double _locPinY;
   Double _beginX;
   Double _beginY;
   Double _endX;
   Double _endY;
   Double _angle;
   Double _rotationXAngle;
   Double _rotationYAngle;
   Double _rotationZAngle;
   Boolean _flipX;
   Boolean _flipY;
   Double _txtPinX;
   Double _txtPinY;
   Double _txtLocPinX;
   Double _txtLocPinY;
   Double _txtAngle;
   Double _txtWidth;
   Double _txtHeight;


   public XDGFShape(ShapeSheetType shapeSheet, XDGFBaseContents parentPage, XDGFDocument document) {
      this((XDGFShape)null, shapeSheet, parentPage, document);
   }

   public XDGFShape(XDGFShape parent, ShapeSheetType shapeSheet, XDGFBaseContents parentPage, XDGFDocument document) {
      super(shapeSheet, document);
      this._master = null;
      this._masterShape = null;
      this._text = null;
      this._shapes = null;
      this._pinX = null;
      this._pinY = null;
      this._width = null;
      this._height = null;
      this._locPinX = null;
      this._locPinY = null;
      this._beginX = null;
      this._beginY = null;
      this._endX = null;
      this._endY = null;
      this._angle = null;
      this._rotationXAngle = null;
      this._rotationYAngle = null;
      this._rotationZAngle = null;
      this._flipX = null;
      this._flipY = null;
      this._txtPinX = null;
      this._txtPinY = null;
      this._txtLocPinX = null;
      this._txtLocPinY = null;
      this._txtAngle = null;
      this._txtWidth = null;
      this._txtHeight = null;
      this._parent = parent;
      this._parentPage = parentPage;
      TextType text = shapeSheet.getText();
      if(text != null) {
         this._text = new XDGFText(text, this);
      }

      if(shapeSheet.isSetShapes()) {
         this._shapes = new ArrayList();
         ShapeSheetType[] arr$ = shapeSheet.getShapes().getShapeArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            ShapeSheetType shape = arr$[i$];
            this._shapes.add(new XDGFShape(this, shape, parentPage, document));
         }
      }

      this.readProperties();
   }

   public String toString() {
      return this._parentPage instanceof XDGFMasterContents?this._parentPage + ": <Shape ID=\"" + this.getID() + "\">":"<Shape ID=\"" + this.getID() + "\">";
   }

   protected void readProperties() {
      this._pinX = XDGFCell.maybeGetDouble(this._cells, "PinX");
      this._pinY = XDGFCell.maybeGetDouble(this._cells, "PinY");
      this._width = XDGFCell.maybeGetDouble(this._cells, "Width");
      this._height = XDGFCell.maybeGetDouble(this._cells, "Height");
      this._locPinX = XDGFCell.maybeGetDouble(this._cells, "LocPinX");
      this._locPinY = XDGFCell.maybeGetDouble(this._cells, "LocPinY");
      this._beginX = XDGFCell.maybeGetDouble(this._cells, "BeginX");
      this._beginY = XDGFCell.maybeGetDouble(this._cells, "BeginY");
      this._endX = XDGFCell.maybeGetDouble(this._cells, "EndX");
      this._endY = XDGFCell.maybeGetDouble(this._cells, "EndY");
      this._angle = XDGFCell.maybeGetDouble(this._cells, "Angle");
      this._rotationXAngle = XDGFCell.maybeGetDouble(this._cells, "RotationXAngle");
      this._rotationYAngle = XDGFCell.maybeGetDouble(this._cells, "RotationYAngle");
      this._rotationZAngle = XDGFCell.maybeGetDouble(this._cells, "RotationZAngle");
      this._flipX = XDGFCell.maybeGetBoolean(this._cells, "FlipX");
      this._flipY = XDGFCell.maybeGetBoolean(this._cells, "FlipY");
      this._txtPinX = XDGFCell.maybeGetDouble(this._cells, "TxtPinX");
      this._txtPinY = XDGFCell.maybeGetDouble(this._cells, "TxtPinY");
      this._txtLocPinX = XDGFCell.maybeGetDouble(this._cells, "TxtLocPinX");
      this._txtLocPinY = XDGFCell.maybeGetDouble(this._cells, "TxtLocPinY");
      this._txtWidth = XDGFCell.maybeGetDouble(this._cells, "TxtWidth");
      this._txtHeight = XDGFCell.maybeGetDouble(this._cells, "TxtHeight");
      this._txtAngle = XDGFCell.maybeGetDouble(this._cells, "TxtAngle");
   }

   protected void setupMaster(XDGFPageContents pageContents, XDGFMasterContents master) {
      ShapeSheetType obj = this.getXmlObject();
      if(obj.isSetMaster()) {
         this._master = pageContents.getMasterById(obj.getMaster());
         if(this._master == null) {
            throw XDGFException.error("refers to non-existant master " + obj.getMaster(), this);
         }

         List i$ = this._master.getContent().getTopLevelShapes();
         switch(i$.size()) {
         case 0:
            throw XDGFException.error("Could not retrieve master shape from " + this._master, this);
         case 1:
            this._masterShape = (XDGFShape)i$.iterator().next();
         }
      } else if(obj.isSetMasterShape()) {
         this._masterShape = master.getShapeById(obj.getMasterShape());
         if(this._masterShape == null) {
            throw XDGFException.error("refers to non-existant master shape " + obj.getMasterShape(), this);
         }
      }

      this.setupSectionMasters();
      if(this._shapes != null) {
         Iterator i$1 = this._shapes.iterator();

         while(i$1.hasNext()) {
            XDGFShape shape = (XDGFShape)i$1.next();
            shape.setupMaster(pageContents, this._master == null?master:this._master.getContent());
         }
      }

   }

   protected void setupSectionMasters() {
      if(this._masterShape != null) {
         try {
            Iterator e = this._sections.entrySet().iterator();

            Entry section;
            while(e.hasNext()) {
               section = (Entry)e.next();
               XDGFSection master = this._masterShape.getSection((String)section.getKey());
               if(master != null) {
                  ((XDGFSection)section.getValue()).setupMaster(master);
               }
            }

            e = this._geometry.entrySet().iterator();

            while(e.hasNext()) {
               section = (Entry)e.next();
               GeometrySection master1 = this._masterShape.getGeometryByIdx(((Long)section.getKey()).longValue());
               if(master1 != null) {
                  ((GeometrySection)section.getValue()).setupMaster(master1);
               }
            }

         } catch (POIXMLException var4) {
            throw XDGFException.wrap(this.toString(), var4);
         }
      }
   }

   @Internal
   public ShapeSheetType getXmlObject() {
      return (ShapeSheetType)this._sheet;
   }

   public long getID() {
      return this.getXmlObject().getID();
   }

   public String getType() {
      return this.getXmlObject().getType();
   }

   public String getTextAsString() {
      XDGFText text = this.getText();
      return text == null?"":text.getTextContent();
   }

   public boolean hasText() {
      return this._text != null || this._masterShape != null && this._masterShape._text != null;
   }

   public XDGFCell getCell(String cellName) {
      XDGFCell _cell = super.getCell(cellName);
      if(_cell == null && this._masterShape != null) {
         _cell = this._masterShape.getCell(cellName);
      }

      return _cell;
   }

   public GeometrySection getGeometryByIdx(long idx) {
      return (GeometrySection)this._geometry.get(Long.valueOf(idx));
   }

   public List getShapes() {
      return this._shapes;
   }

   public String getName() {
      String name = this.getXmlObject().getName();
      return name == null?"":name;
   }

   public String getShapeType() {
      String type = this.getXmlObject().getType();
      return type == null?"":type;
   }

   public String getSymbolName() {
      if(this._master == null) {
         return "";
      } else {
         String name = this._master.getName();
         return name == null?"":name;
      }
   }

   public XDGFShape getMasterShape() {
      return this._masterShape;
   }

   public XDGFShape getParentShape() {
      return this._parent;
   }

   public XDGFShape getTopmostParentShape() {
      XDGFShape top = null;
      if(this._parent != null) {
         top = this._parent.getTopmostParentShape();
         if(top == null) {
            top = this._parent;
         }
      }

      return top;
   }

   public boolean hasMaster() {
      return this._master != null;
   }

   public boolean hasMasterShape() {
      return this._masterShape != null;
   }

   public boolean hasParent() {
      return this._parent != null;
   }

   public boolean hasShapes() {
      return this._shapes != null;
   }

   public boolean isTopmost() {
      return this._parent == null;
   }

   public boolean isShape1D() {
      return this.getBeginX() != null;
   }

   public boolean isDeleted() {
      return this.getXmlObject().isSetDel()?this.getXmlObject().getDel():false;
   }

   public XDGFText getText() {
      return this._text == null && this._masterShape != null?this._masterShape.getText():this._text;
   }

   public Double getPinX() {
      if(this._pinX == null && this._masterShape != null) {
         return this._masterShape.getPinX();
      } else if(this._pinX == null) {
         throw XDGFException.error("PinX not set!", this);
      } else {
         return this._pinX;
      }
   }

   public Double getPinY() {
      if(this._pinY == null && this._masterShape != null) {
         return this._masterShape.getPinY();
      } else if(this._pinY == null) {
         throw XDGFException.error("PinY not specified!", this);
      } else {
         return this._pinY;
      }
   }

   public Double getWidth() {
      if(this._width == null && this._masterShape != null) {
         return this._masterShape.getWidth();
      } else if(this._width == null) {
         throw XDGFException.error("Width not specified!", this);
      } else {
         return this._width;
      }
   }

   public Double getHeight() {
      if(this._height == null && this._masterShape != null) {
         return this._masterShape.getHeight();
      } else if(this._height == null) {
         throw XDGFException.error("Height not specified!", this);
      } else {
         return this._height;
      }
   }

   public Double getLocPinX() {
      if(this._locPinX == null && this._masterShape != null) {
         return this._masterShape.getLocPinX();
      } else if(this._locPinX == null) {
         throw XDGFException.error("LocPinX not specified!", this);
      } else {
         return this._locPinX;
      }
   }

   public Double getLocPinY() {
      if(this._locPinY == null && this._masterShape != null) {
         return this._masterShape.getLocPinY();
      } else if(this._locPinY == null) {
         throw XDGFException.error("LocPinY not specified!", this);
      } else {
         return this._locPinY;
      }
   }

   public Double getBeginX() {
      return this._beginX == null && this._masterShape != null?this._masterShape.getBeginX():this._beginX;
   }

   public Double getBeginY() {
      return this._beginY == null && this._masterShape != null?this._masterShape.getBeginY():this._beginY;
   }

   public Double getEndX() {
      return this._endX == null && this._masterShape != null?this._masterShape.getEndX():this._endX;
   }

   public Double getEndY() {
      return this._endY == null && this._masterShape != null?this._masterShape.getEndY():this._endY;
   }

   public Double getAngle() {
      return this._angle == null && this._masterShape != null?this._masterShape.getAngle():this._angle;
   }

   public Boolean getFlipX() {
      return this._flipX == null && this._masterShape != null?this._masterShape.getFlipX():this._flipX;
   }

   public Boolean getFlipY() {
      return this._flipY == null && this._masterShape != null?this._masterShape.getFlipY():this._flipY;
   }

   public Double getTxtPinX() {
      return this._txtPinX == null && this._masterShape != null && this._masterShape._txtPinX != null?this._masterShape._txtPinX:(this._txtPinX == null?Double.valueOf(this.getWidth().doubleValue() * 0.5D):this._txtPinX);
   }

   public Double getTxtPinY() {
      return this._txtLocPinY == null && this._masterShape != null && this._masterShape._txtLocPinY != null?this._masterShape._txtLocPinY:(this._txtPinY == null?Double.valueOf(this.getHeight().doubleValue() * 0.5D):this._txtPinY);
   }

   public Double getTxtLocPinX() {
      return this._txtLocPinX == null && this._masterShape != null && this._masterShape._txtLocPinX != null?this._masterShape._txtLocPinX:(this._txtLocPinX == null?Double.valueOf(this.getTxtWidth().doubleValue() * 0.5D):this._txtLocPinX);
   }

   public Double getTxtLocPinY() {
      return this._txtLocPinY == null && this._masterShape != null && this._masterShape._txtLocPinY != null?this._masterShape._txtLocPinY:(this._txtLocPinY == null?Double.valueOf(this.getTxtHeight().doubleValue() * 0.5D):this._txtLocPinY);
   }

   public Double getTxtAngle() {
      return this._txtAngle == null && this._masterShape != null?this._masterShape.getTxtAngle():this._txtAngle;
   }

   public Double getTxtWidth() {
      return this._txtWidth == null && this._masterShape != null && this._masterShape._txtWidth != null?this._masterShape._txtWidth:(this._txtWidth == null?this.getWidth():this._txtWidth);
   }

   public Double getTxtHeight() {
      return this._txtHeight == null && this._masterShape != null && this._masterShape._txtHeight != null?this._masterShape._txtHeight:(this._txtHeight == null?this.getHeight():this._txtHeight);
   }

   public Integer getLineCap() {
      Integer lineCap = super.getLineCap();
      return lineCap != null?lineCap:(this._masterShape != null?this._masterShape.getLineCap():this._document.getDefaultLineStyle().getLineCap());
   }

   public Color getLineColor() {
      Color lineColor = super.getLineColor();
      return lineColor != null?lineColor:(this._masterShape != null?this._masterShape.getLineColor():this._document.getDefaultLineStyle().getLineColor());
   }

   public Integer getLinePattern() {
      Integer linePattern = super.getLinePattern();
      return linePattern != null?linePattern:(this._masterShape != null?this._masterShape.getLinePattern():this._document.getDefaultLineStyle().getLinePattern());
   }

   public Double getLineWeight() {
      Double lineWeight = super.getLineWeight();
      return lineWeight != null?lineWeight:(this._masterShape != null?this._masterShape.getLineWeight():this._document.getDefaultLineStyle().getLineWeight());
   }

   public Color getFontColor() {
      Color fontColor = super.getFontColor();
      return fontColor != null?fontColor:(this._masterShape != null?this._masterShape.getFontColor():this._document.getDefaultTextStyle().getFontColor());
   }

   public Double getFontSize() {
      Double fontSize = super.getFontSize();
      return fontSize != null?fontSize:(this._masterShape != null?this._masterShape.getFontSize():this._document.getDefaultTextStyle().getFontSize());
   }

   public Stroke getStroke() {
      float lineWeight = this.getLineWeight().floatValue();
      byte join = 0;
      float miterlimit = 10.0F;
      byte cap;
      switch(this.getLineCap().intValue()) {
      case 0:
         cap = 1;
         break;
      case 1:
         cap = 2;
         break;
      case 2:
         cap = 0;
         break;
      default:
         throw new POIXMLException("Invalid line cap specified");
      }

      float[] dash = null;
      switch(this.getLinePattern().intValue()) {
      case 0:
      case 1:
         break;
      case 2:
         dash = new float[]{5.0F, 3.0F};
         break;
      case 3:
         dash = new float[]{1.0F, 4.0F};
         break;
      case 4:
         dash = new float[]{6.0F, 3.0F, 1.0F, 3.0F};
         break;
      case 5:
         dash = new float[]{6.0F, 3.0F, 1.0F, 3.0F, 1.0F, 3.0F};
         break;
      case 6:
         dash = new float[]{1.0F, 3.0F, 6.0F, 3.0F, 6.0F, 3.0F};
         break;
      case 7:
         dash = new float[]{15.0F, 3.0F, 6.0F, 3.0F};
         break;
      case 8:
         dash = new float[]{6.0F, 3.0F, 6.0F, 3.0F};
         break;
      case 9:
         dash = new float[]{3.0F, 2.0F};
         break;
      case 10:
         dash = new float[]{1.0F, 2.0F};
         break;
      case 11:
         dash = new float[]{3.0F, 2.0F, 1.0F, 2.0F};
         break;
      case 12:
         dash = new float[]{3.0F, 2.0F, 1.0F, 2.0F, 1.0F};
         break;
      case 13:
         dash = new float[]{1.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F};
         break;
      case 14:
         dash = new float[]{3.0F, 2.0F, 7.0F, 2.0F};
         break;
      case 15:
         dash = new float[]{7.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F};
         break;
      case 16:
         dash = new float[]{12.0F, 6.0F};
         break;
      case 17:
         dash = new float[]{1.0F, 6.0F};
         break;
      case 18:
         dash = new float[]{1.0F, 6.0F, 12.0F, 6.0F};
         break;
      case 19:
         dash = new float[]{1.0F, 6.0F, 1.0F, 6.0F, 12.0F, 6.0F};
         break;
      case 20:
         dash = new float[]{1.0F, 6.0F, 12.0F, 6.0F, 12.0F, 6.0F};
         break;
      case 21:
         dash = new float[]{30.0F, 6.0F, 12.0F, 6.0F};
         break;
      case 22:
         dash = new float[]{30.0F, 6.0F, 12.0F, 6.0F, 12.0F, 6.0F};
         break;
      case 23:
         dash = new float[]{1.0F};
         break;
      case 254:
         throw new POIXMLException("Unsupported line pattern value");
      default:
         throw new POIXMLException("Invalid line pattern value");
      }

      if(dash != null) {
         for(int i = 0; i < dash.length; ++i) {
            dash[i] *= lineWeight;
         }
      }

      return new BasicStroke(lineWeight, cap, join, miterlimit, dash, 0.0F);
   }

   public Iterable getGeometrySections() {
      return new CombinedIterable(this._geometry, this._masterShape != null?this._masterShape._geometry:null);
   }

   public java.awt.geom.Rectangle2D.Double getBounds() {
      return new java.awt.geom.Rectangle2D.Double(0.0D, 0.0D, this.getWidth().doubleValue(), this.getHeight().doubleValue());
   }

   public java.awt.geom.Path2D.Double getBoundsAsPath() {
      Double w = this.getWidth();
      Double h = this.getHeight();
      java.awt.geom.Path2D.Double bounds = new java.awt.geom.Path2D.Double();
      bounds.moveTo(0.0D, 0.0D);
      bounds.lineTo(w.doubleValue(), 0.0D);
      bounds.lineTo(w.doubleValue(), h.doubleValue());
      bounds.lineTo(0.0D, h.doubleValue());
      bounds.lineTo(0.0D, 0.0D);
      return bounds;
   }

   public java.awt.geom.Path2D.Double getPath() {
      Iterator i$ = this.getGeometrySections().iterator();

      GeometrySection geoSection;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         geoSection = (GeometrySection)i$.next();
      } while(geoSection.getNoShow().booleanValue());

      return geoSection.getPath(this);
   }

   public boolean hasGeometry() {
      Iterator i$ = this.getGeometrySections().iterator();

      GeometrySection geoSection;
      do {
         if(!i$.hasNext()) {
            return false;
         }

         geoSection = (GeometrySection)i$.next();
      } while(geoSection.getNoShow().booleanValue());

      return true;
   }

   protected AffineTransform getParentTransform() {
      AffineTransform tr = new AffineTransform();
      Double locX = this.getLocPinX();
      Double locY = this.getLocPinY();
      Boolean flipX = this.getFlipX();
      Boolean flipY = this.getFlipY();
      Double angle = this.getAngle();
      tr.translate(-locX.doubleValue(), -locY.doubleValue());
      tr.translate(this.getPinX().doubleValue(), this.getPinY().doubleValue());
      if(angle != null && Math.abs(angle.doubleValue()) > 0.001D) {
         tr.rotate(angle.doubleValue(), locX.doubleValue(), locY.doubleValue());
      }

      if(flipX != null && flipX.booleanValue()) {
         tr.scale(-1.0D, 1.0D);
         tr.translate(-this.getWidth().doubleValue(), 0.0D);
      }

      if(flipY != null && flipY.booleanValue()) {
         tr.scale(1.0D, -1.0D);
         tr.translate(0.0D, -this.getHeight().doubleValue());
      }

      return tr;
   }

   public void visitShapes(ShapeVisitor visitor, AffineTransform tr, int level) {
      tr = (AffineTransform)tr.clone();
      tr.concatenate(this.getParentTransform());

      try {
         if(visitor.accept(this)) {
            visitor.visit(this, tr, level);
         }

         if(this._shapes != null) {
            Iterator e = this._shapes.iterator();

            while(e.hasNext()) {
               XDGFShape shape = (XDGFShape)e.next();
               shape.visitShapes(visitor, tr, level + 1);
            }
         }
      } catch (StopVisitingThisBranch var6) {
         ;
      } catch (POIXMLException var7) {
         throw XDGFException.wrap(this.toString(), var7);
      }

   }

   public void visitShapes(ShapeVisitor visitor, int level) {
      try {
         if(visitor.accept(this)) {
            visitor.visit(this, (AffineTransform)null, level);
         }

         if(this._shapes != null) {
            Iterator e = this._shapes.iterator();

            while(e.hasNext()) {
               XDGFShape shape = (XDGFShape)e.next();
               shape.visitShapes(visitor, level + 1);
            }
         }
      } catch (StopVisitingThisBranch var5) {
         ;
      } catch (POIXMLException var6) {
         throw XDGFException.wrap(this.toString(), var6);
      }

   }
}
