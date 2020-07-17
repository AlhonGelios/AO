package org.apache.poi.xslf.usermodel;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.sl.draw.DrawPaint;
import org.apache.poi.sl.draw.geom.CustomGeometry;
import org.apache.poi.sl.draw.geom.Guide;
import org.apache.poi.sl.draw.geom.PresetGeometries;
import org.apache.poi.sl.usermodel.FillStyle;
import org.apache.poi.sl.usermodel.LineDecoration;
import org.apache.poi.sl.usermodel.PaintStyle;
import org.apache.poi.sl.usermodel.Placeholder;
import org.apache.poi.sl.usermodel.ShapeType;
import org.apache.poi.sl.usermodel.SimpleShape;
import org.apache.poi.sl.usermodel.StrokeStyle;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.model.PropertyFetcher;
import org.apache.poi.xslf.usermodel.XSLFColor;
import org.apache.poi.xslf.usermodel.XSLFHyperlink;
import org.apache.poi.xslf.usermodel.XSLFPropertiesDelegate;
import org.apache.poi.xslf.usermodel.XSLFShadow;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineCap;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth;
import org.openxmlformats.schemas.drawingml.x2006.main.STPresetLineDashVal;
import org.openxmlformats.schemas.drawingml.x2006.main.STShapeType;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;

public abstract class XSLFSimpleShape extends XSLFShape implements SimpleShape {

   private static CTOuterShadowEffect NO_SHADOW = CTOuterShadowEffect.Factory.newInstance();
   private static final POILogger LOG = POILogFactory.getLogger(XSLFSimpleShape.class);


   XSLFSimpleShape(XmlObject shape, XSLFSheet sheet) {
      super(shape, sheet);
   }

   public void setShapeType(ShapeType type) {
      XSLFPropertiesDelegate.XSLFGeometryProperties gp = XSLFPropertiesDelegate.getGeometryDelegate(this.getShapeProperties());
      if(gp != null) {
         if(gp.isSetCustGeom()) {
            gp.unsetCustGeom();
         }

         CTPresetGeometry2D prst = gp.isSetPrstGeom()?gp.getPrstGeom():gp.addNewPrstGeom();
         prst.setPrst(STShapeType.Enum.forInt(type.ooxmlId));
      }
   }

   public ShapeType getShapeType() {
      XSLFPropertiesDelegate.XSLFGeometryProperties gp = XSLFPropertiesDelegate.getGeometryDelegate(this.getShapeProperties());
      if(gp != null && gp.isSetPrstGeom()) {
         STShapeType.Enum geom = gp.getPrstGeom().getPrst();
         if(geom != null) {
            return ShapeType.forId(geom.intValue(), true);
         }
      }

      return null;
   }

   protected CTTransform2D getXfrm(boolean create) {
      PropertyFetcher fetcher = new PropertyFetcher() {
         public boolean fetch(XSLFShape shape) {
            XmlObject xo = shape.getShapeProperties();
            if(xo instanceof CTShapeProperties && ((CTShapeProperties)xo).isSetXfrm()) {
               this.setValue(((CTShapeProperties)xo).getXfrm());
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      CTTransform2D xfrm = (CTTransform2D)fetcher.getValue();
      if(create && xfrm == null) {
         XmlObject xo = this.getShapeProperties();
         if(xo instanceof CTShapeProperties) {
            return ((CTShapeProperties)xo).addNewXfrm();
         } else {
            LOG.log(5, new Object[]{this.getClass().toString() + " doesn\'t have xfrm element."});
            return null;
         }
      } else {
         return xfrm;
      }
   }

   public Rectangle2D getAnchor() {
      CTTransform2D xfrm = this.getXfrm(false);
      if(xfrm == null) {
         return null;
      } else {
         CTPoint2D off = xfrm.getOff();
         double x = Units.toPoints(off.getX());
         double y = Units.toPoints(off.getY());
         CTPositiveSize2D ext = xfrm.getExt();
         double cx = Units.toPoints(ext.getCx());
         double cy = Units.toPoints(ext.getCy());
         return new Double(x, y, cx, cy);
      }
   }

   public void setAnchor(Rectangle2D anchor) {
      CTTransform2D xfrm = this.getXfrm(true);
      if(xfrm != null) {
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
   }

   public void setRotation(double theta) {
      CTTransform2D xfrm = this.getXfrm(true);
      if(xfrm != null) {
         xfrm.setRot((int)(theta * 60000.0D));
      }

   }

   public double getRotation() {
      CTTransform2D xfrm = this.getXfrm(false);
      return xfrm != null && xfrm.isSetRot()?(double)xfrm.getRot() / 60000.0D:0.0D;
   }

   public void setFlipHorizontal(boolean flip) {
      CTTransform2D xfrm = this.getXfrm(true);
      if(xfrm != null) {
         xfrm.setFlipH(flip);
      }

   }

   public void setFlipVertical(boolean flip) {
      CTTransform2D xfrm = this.getXfrm(true);
      if(xfrm != null) {
         xfrm.setFlipV(flip);
      }

   }

   public boolean getFlipHorizontal() {
      CTTransform2D xfrm = this.getXfrm(false);
      return xfrm != null && xfrm.isSetFlipH()?xfrm.getFlipH():false;
   }

   public boolean getFlipVertical() {
      CTTransform2D xfrm = this.getXfrm(false);
      return xfrm != null && xfrm.isSetFlipV()?xfrm.getFlipV():false;
   }

   CTLineProperties getDefaultLineProperties() {
      CTShapeStyle style = this.getSpStyle();
      if(style == null) {
         return null;
      } else {
         CTStyleMatrixReference lnRef = style.getLnRef();
         if(lnRef == null) {
            return null;
         } else {
            int idx = (int)lnRef.getIdx();
            XSLFTheme theme = this.getSheet().getTheme();
            if(theme == null) {
               return null;
            } else {
               CTBaseStyles styles = theme.getXmlObject().getThemeElements();
               if(styles == null) {
                  return null;
               } else {
                  CTStyleMatrix styleMatrix = styles.getFmtScheme();
                  if(styleMatrix == null) {
                     return null;
                  } else {
                     CTLineStyleList lineStyles = styleMatrix.getLnStyleLst();
                     return lineStyles != null && lineStyles.sizeOfLnArray() >= idx?lineStyles.getLnArray(idx - 1):null;
                  }
               }
            }
         }
      }
   }

   public void setLineColor(Color color) {
      CTLineProperties ln = getLn(this, true);
      if(ln != null) {
         if(ln.isSetSolidFill()) {
            ln.unsetSolidFill();
         }

         if(ln.isSetGradFill()) {
            ln.unsetGradFill();
         }

         if(ln.isSetPattFill()) {
            ln.unsetPattFill();
         }

         if(ln.isSetNoFill()) {
            ln.unsetNoFill();
         }

         if(color == null) {
            ln.addNewNoFill();
         } else {
            CTSolidColorFillProperties fill = ln.addNewSolidFill();
            XSLFColor col = new XSLFColor(fill, this.getSheet().getTheme(), fill.getSchemeClr());
            col.setColor(color);
         }

      }
   }

   public Color getLineColor() {
      PaintStyle ps = this.getLinePaint();
      return ps instanceof PaintStyle.SolidPaint?((PaintStyle.SolidPaint)ps).getSolidColor().getColor():null;
   }

   protected PaintStyle getLinePaint() {
      XSLFSheet sheet = this.getSheet();
      final XSLFTheme theme = sheet.getTheme();
      PropertyFetcher fetcher = new PropertyFetcher() {
         public boolean fetch(XSLFShape shape) {
            CTLineProperties spPr = XSLFSimpleShape.getLn(shape, false);
            XSLFPropertiesDelegate.XSLFFillProperties fp = XSLFPropertiesDelegate.getFillDelegate(spPr);
            PackagePart pp = shape.getSheet().getPackagePart();
            PaintStyle paint = XSLFShape.selectPaint(fp, (CTSchemeColor)null, pp, theme);
            if(paint != null) {
               this.setValue(paint);
               return true;
            } else {
               CTShapeStyle style = shape.getSpStyle();
               if(style != null) {
                  fp = XSLFPropertiesDelegate.getFillDelegate(style.getLnRef());
                  paint = XSLFShape.selectPaint(fp, (CTSchemeColor)null, pp, theme);
               }

               if(paint != null) {
                  this.setValue(paint);
                  return true;
               } else {
                  return false;
               }
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      PaintStyle paint = (PaintStyle)fetcher.getValue();
      if(paint != null) {
         return paint;
      } else {
         CTShapeStyle style = this.getSpStyle();
         if(style == null) {
            return null;
         } else {
            CTStyleMatrixReference lnRef = style.getLnRef();
            int idx = (int)lnRef.getIdx();
            CTSchemeColor phClr = lnRef.getSchemeClr();
            if(idx > 0) {
               CTLineProperties props = theme.getXmlObject().getThemeElements().getFmtScheme().getLnStyleLst().getLnArray(idx - 1);
               XSLFPropertiesDelegate.XSLFFillProperties fp = XSLFPropertiesDelegate.getFillDelegate(props);
               PackagePart pp = sheet.getPackagePart();
               paint = selectPaint(fp, phClr, pp, theme);
            }

            return paint;
         }
      }
   }

   public void setLineWidth(double width) {
      CTLineProperties lnPr = getLn(this, true);
      if(lnPr != null) {
         if(width == 0.0D) {
            if(lnPr.isSetW()) {
               lnPr.unsetW();
            }

            if(!lnPr.isSetNoFill()) {
               lnPr.addNewNoFill();
            }

            if(lnPr.isSetSolidFill()) {
               lnPr.unsetSolidFill();
            }

            if(lnPr.isSetGradFill()) {
               lnPr.unsetGradFill();
            }

            if(lnPr.isSetPattFill()) {
               lnPr.unsetPattFill();
            }
         } else {
            if(lnPr.isSetNoFill()) {
               lnPr.unsetNoFill();
            }

            lnPr.setW(Units.toEMU(width));
         }

      }
   }

   public double getLineWidth() {
      PropertyFetcher fetcher = new PropertyFetcher() {
         public boolean fetch(XSLFShape shape) {
            CTLineProperties ln = XSLFSimpleShape.getLn(shape, false);
            if(ln != null) {
               if(ln.isSetNoFill()) {
                  this.setValue(java.lang.Double.valueOf(0.0D));
                  return true;
               }

               if(ln.isSetW()) {
                  this.setValue(java.lang.Double.valueOf(Units.toPoints((long)ln.getW())));
                  return true;
               }
            }

            return false;
         }
      };
      this.fetchShapeProperty(fetcher);
      double lineWidth = 0.0D;
      if(fetcher.getValue() == null) {
         CTLineProperties defaultLn = this.getDefaultLineProperties();
         if(defaultLn != null && defaultLn.isSetW()) {
            lineWidth = Units.toPoints((long)defaultLn.getW());
         }
      } else {
         lineWidth = ((java.lang.Double)fetcher.getValue()).doubleValue();
      }

      return lineWidth;
   }

   public void setLineCompound(StrokeStyle.LineCompound compound) {
      CTLineProperties ln = getLn(this, true);
      if(ln != null) {
         if(compound == null) {
            if(ln.isSetCmpd()) {
               ln.unsetCmpd();
            }
         } else {
            STCompoundLine.Enum xCmpd;
            switch(XSLFSimpleShape.NamelessClass751156433.$SwitchMap$org$apache$poi$sl$usermodel$StrokeStyle$LineCompound[compound.ordinal()]) {
            case 1:
            default:
               xCmpd = STCompoundLine.SNG;
               break;
            case 2:
               xCmpd = STCompoundLine.DBL;
               break;
            case 3:
               xCmpd = STCompoundLine.THICK_THIN;
               break;
            case 4:
               xCmpd = STCompoundLine.THIN_THICK;
               break;
            case 5:
               xCmpd = STCompoundLine.TRI;
            }

            ln.setCmpd(xCmpd);
         }

      }
   }

   public StrokeStyle.LineCompound getLineCompound() {
      PropertyFetcher fetcher = new PropertyFetcher() {
         public boolean fetch(XSLFShape shape) {
            CTLineProperties ln = XSLFSimpleShape.getLn(shape, false);
            if(ln != null) {
               STCompoundLine.Enum stCmpd = ln.getCmpd();
               if(stCmpd != null) {
                  this.setValue(Integer.valueOf(stCmpd.intValue()));
                  return true;
               }
            }

            return false;
         }
      };
      this.fetchShapeProperty(fetcher);
      Integer cmpd = (Integer)fetcher.getValue();
      if(cmpd == null) {
         CTLineProperties defaultLn = this.getDefaultLineProperties();
         if(defaultLn != null && defaultLn.isSetCmpd()) {
            switch(defaultLn.getCmpd().intValue()) {
            case 1:
            default:
               return StrokeStyle.LineCompound.SINGLE;
            case 2:
               return StrokeStyle.LineCompound.DOUBLE;
            case 3:
               return StrokeStyle.LineCompound.THICK_THIN;
            case 4:
               return StrokeStyle.LineCompound.THIN_THICK;
            case 5:
               return StrokeStyle.LineCompound.TRIPLE;
            }
         }
      }

      return null;
   }

   public void setLineDash(StrokeStyle.LineDash dash) {
      CTLineProperties ln = getLn(this, true);
      if(ln != null) {
         if(dash == null) {
            if(ln.isSetPrstDash()) {
               ln.unsetPrstDash();
            }
         } else {
            CTPresetLineDashProperties ldp = ln.isSetPrstDash()?ln.getPrstDash():ln.addNewPrstDash();
            ldp.setVal(STPresetLineDashVal.Enum.forInt(dash.ooxmlId));
         }

      }
   }

   public StrokeStyle.LineDash getLineDash() {
      PropertyFetcher fetcher = new PropertyFetcher() {
         public boolean fetch(XSLFShape shape) {
            CTLineProperties ln = XSLFSimpleShape.getLn(shape, false);
            if(ln != null && ln.isSetPrstDash()) {
               this.setValue(StrokeStyle.LineDash.fromOoxmlId(ln.getPrstDash().getVal().intValue()));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      StrokeStyle.LineDash dash = (StrokeStyle.LineDash)fetcher.getValue();
      if(dash == null) {
         CTLineProperties defaultLn = this.getDefaultLineProperties();
         if(defaultLn != null && defaultLn.isSetPrstDash()) {
            dash = StrokeStyle.LineDash.fromOoxmlId(defaultLn.getPrstDash().getVal().intValue());
         }
      }

      return dash;
   }

   public void setLineCap(StrokeStyle.LineCap cap) {
      CTLineProperties ln = getLn(this, true);
      if(ln != null) {
         if(cap == null) {
            if(ln.isSetCap()) {
               ln.unsetCap();
            }
         } else {
            ln.setCap(STLineCap.Enum.forInt(cap.ooxmlId));
         }

      }
   }

   public StrokeStyle.LineCap getLineCap() {
      PropertyFetcher fetcher = new PropertyFetcher() {
         public boolean fetch(XSLFShape shape) {
            CTLineProperties ln = XSLFSimpleShape.getLn(shape, false);
            if(ln != null && ln.isSetCap()) {
               this.setValue(StrokeStyle.LineCap.fromOoxmlId(ln.getCap().intValue()));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      StrokeStyle.LineCap cap = (StrokeStyle.LineCap)fetcher.getValue();
      if(cap == null) {
         CTLineProperties defaultLn = this.getDefaultLineProperties();
         if(defaultLn != null && defaultLn.isSetCap()) {
            cap = StrokeStyle.LineCap.fromOoxmlId(defaultLn.getCap().intValue());
         }
      }

      return cap;
   }

   public void setFillColor(Color color) {
      XSLFPropertiesDelegate.XSLFFillProperties fp = XSLFPropertiesDelegate.getFillDelegate(this.getShapeProperties());
      if(fp != null) {
         if(color == null) {
            if(fp.isSetSolidFill()) {
               fp.unsetSolidFill();
            }

            if(fp.isSetGradFill()) {
               fp.unsetGradFill();
            }

            if(fp.isSetPattFill()) {
               fp.unsetGradFill();
            }

            if(fp.isSetBlipFill()) {
               fp.unsetBlipFill();
            }

            if(!fp.isSetNoFill()) {
               fp.addNewNoFill();
            }
         } else {
            if(fp.isSetNoFill()) {
               fp.unsetNoFill();
            }

            CTSolidColorFillProperties fill = fp.isSetSolidFill()?fp.getSolidFill():fp.addNewSolidFill();
            XSLFColor col = new XSLFColor(fill, this.getSheet().getTheme(), fill.getSchemeClr());
            col.setColor(color);
         }

      }
   }

   public Color getFillColor() {
      PaintStyle ps = this.getFillPaint();
      return ps instanceof PaintStyle.SolidPaint?DrawPaint.applyColorTransform(((PaintStyle.SolidPaint)ps).getSolidColor()):null;
   }

   public XSLFShadow getShadow() {
      PropertyFetcher fetcher = new PropertyFetcher() {
         public boolean fetch(XSLFShape shape) {
            XSLFPropertiesDelegate.XSLFEffectProperties ep = XSLFPropertiesDelegate.getEffectDelegate(shape.getShapeProperties());
            if(ep != null && ep.isSetEffectLst()) {
               CTOuterShadowEffect obj = ep.getEffectLst().getOuterShdw();
               this.setValue(obj == null?XSLFSimpleShape.NO_SHADOW:obj);
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      CTOuterShadowEffect obj = (CTOuterShadowEffect)fetcher.getValue();
      if(obj == null) {
         CTShapeStyle style = this.getSpStyle();
         if(style != null && style.getEffectRef() != null) {
            int idx = (int)style.getEffectRef().getIdx();
            if(idx != 0) {
               CTStyleMatrix styleMatrix = this.getSheet().getTheme().getXmlObject().getThemeElements().getFmtScheme();
               CTEffectStyleItem ef = styleMatrix.getEffectStyleLst().getEffectStyleArray(idx - 1);
               obj = ef.getEffectLst().getOuterShdw();
            }
         }
      }

      return obj != null && obj != NO_SHADOW?new XSLFShadow(obj, this):null;
   }

   public CustomGeometry getGeometry() {
      XSLFPropertiesDelegate.XSLFGeometryProperties gp = XSLFPropertiesDelegate.getGeometryDelegate(this.getShapeProperties());
      if(gp == null) {
         return null;
      } else {
         PresetGeometries dict = PresetGeometries.getInstance();
         CustomGeometry geom;
         if(gp.isSetPrstGeom()) {
            String staxReader = gp.getPrstGeom().getPrst().toString();
            geom = (CustomGeometry)dict.get(staxReader);
            if(geom == null) {
               throw new IllegalStateException("Unknown shape geometry: " + staxReader + ", available geometries are: " + dict.keySet());
            }
         } else if(gp.isSetCustGeom()) {
            XMLStreamReader staxReader1 = gp.getCustGeom().newXMLStreamReader();
            geom = PresetGeometries.convertCustomGeometry(staxReader1);

            try {
               staxReader1.close();
            } catch (XMLStreamException var6) {
               LOG.log(5, new Object[]{"An error occurred while closing a Custom Geometry XML Stream Reader: " + var6.getMessage()});
            }
         } else {
            geom = (CustomGeometry)dict.get("rect");
         }

         return geom;
      }
   }

   void copy(XSLFShape sh) {
      super.copy(sh);
      XSLFSimpleShape s = (XSLFSimpleShape)sh;
      Color srsSolidFill = s.getFillColor();
      Color tgtSoliFill = this.getFillColor();
      if(srsSolidFill != null && !srsSolidFill.equals(tgtSoliFill)) {
         this.setFillColor(srsSolidFill);
      }

      XSLFPropertiesDelegate.XSLFFillProperties fp = XSLFPropertiesDelegate.getFillDelegate(this.getShapeProperties());
      if(fp != null && fp.isSetBlipFill()) {
         CTBlip srcLineColor = fp.getBlipFill().getBlip();
         String tgtLineColor = srcLineColor.getEmbed();
         String srcLineWidth = this.getSheet().importBlip(tgtLineColor, s.getSheet().getPackagePart());
         srcLineColor.setEmbed(srcLineWidth);
      }

      Color srcLineColor1 = s.getLineColor();
      Color tgtLineColor1 = this.getLineColor();
      if(srcLineColor1 != null && !srcLineColor1.equals(tgtLineColor1)) {
         this.setLineColor(srcLineColor1);
      }

      double srcLineWidth1 = s.getLineWidth();
      double tgtLineWidth = this.getLineWidth();
      if(srcLineWidth1 != tgtLineWidth) {
         this.setLineWidth(srcLineWidth1);
      }

      StrokeStyle.LineDash srcLineDash = s.getLineDash();
      StrokeStyle.LineDash tgtLineDash = this.getLineDash();
      if(srcLineDash != null && srcLineDash != tgtLineDash) {
         this.setLineDash(srcLineDash);
      }

      StrokeStyle.LineCap srcLineCap = s.getLineCap();
      StrokeStyle.LineCap tgtLineCap = this.getLineCap();
      if(srcLineCap != null && srcLineCap != tgtLineCap) {
         this.setLineCap(srcLineCap);
      }

   }

   public void setLineHeadDecoration(LineDecoration.DecorationShape style) {
      CTLineProperties ln = getLn(this, true);
      if(ln != null) {
         CTLineEndProperties lnEnd = ln.isSetHeadEnd()?ln.getHeadEnd():ln.addNewHeadEnd();
         if(style == null) {
            if(lnEnd.isSetType()) {
               lnEnd.unsetType();
            }
         } else {
            lnEnd.setType(STLineEndType.Enum.forInt(style.ooxmlId));
         }

      }
   }

   public LineDecoration.DecorationShape getLineHeadDecoration() {
      CTLineProperties ln = getLn(this, false);
      LineDecoration.DecorationShape ds = LineDecoration.DecorationShape.NONE;
      if(ln != null && ln.isSetHeadEnd() && ln.getHeadEnd().isSetType()) {
         ds = LineDecoration.DecorationShape.fromOoxmlId(ln.getHeadEnd().getType().intValue());
      }

      return ds;
   }

   public void setLineHeadWidth(LineDecoration.DecorationSize style) {
      CTLineProperties ln = getLn(this, true);
      if(ln != null) {
         CTLineEndProperties lnEnd = ln.isSetHeadEnd()?ln.getHeadEnd():ln.addNewHeadEnd();
         if(style == null) {
            if(lnEnd.isSetW()) {
               lnEnd.unsetW();
            }
         } else {
            lnEnd.setW(STLineEndWidth.Enum.forInt(style.ooxmlId));
         }

      }
   }

   public LineDecoration.DecorationSize getLineHeadWidth() {
      CTLineProperties ln = getLn(this, false);
      LineDecoration.DecorationSize ds = LineDecoration.DecorationSize.MEDIUM;
      if(ln != null && ln.isSetHeadEnd() && ln.getHeadEnd().isSetW()) {
         ds = LineDecoration.DecorationSize.fromOoxmlId(ln.getHeadEnd().getW().intValue());
      }

      return ds;
   }

   public void setLineHeadLength(LineDecoration.DecorationSize style) {
      CTLineProperties ln = getLn(this, true);
      if(ln != null) {
         CTLineEndProperties lnEnd = ln.isSetHeadEnd()?ln.getHeadEnd():ln.addNewHeadEnd();
         if(style == null) {
            if(lnEnd.isSetLen()) {
               lnEnd.unsetLen();
            }
         } else {
            lnEnd.setLen(STLineEndLength.Enum.forInt(style.ooxmlId));
         }

      }
   }

   public LineDecoration.DecorationSize getLineHeadLength() {
      CTLineProperties ln = getLn(this, false);
      LineDecoration.DecorationSize ds = LineDecoration.DecorationSize.MEDIUM;
      if(ln != null && ln.isSetHeadEnd() && ln.getHeadEnd().isSetLen()) {
         ds = LineDecoration.DecorationSize.fromOoxmlId(ln.getHeadEnd().getLen().intValue());
      }

      return ds;
   }

   public void setLineTailDecoration(LineDecoration.DecorationShape style) {
      CTLineProperties ln = getLn(this, true);
      if(ln != null) {
         CTLineEndProperties lnEnd = ln.isSetTailEnd()?ln.getTailEnd():ln.addNewTailEnd();
         if(style == null) {
            if(lnEnd.isSetType()) {
               lnEnd.unsetType();
            }
         } else {
            lnEnd.setType(STLineEndType.Enum.forInt(style.ooxmlId));
         }

      }
   }

   public LineDecoration.DecorationShape getLineTailDecoration() {
      CTLineProperties ln = getLn(this, false);
      LineDecoration.DecorationShape ds = LineDecoration.DecorationShape.NONE;
      if(ln != null && ln.isSetTailEnd() && ln.getTailEnd().isSetType()) {
         ds = LineDecoration.DecorationShape.fromOoxmlId(ln.getTailEnd().getType().intValue());
      }

      return ds;
   }

   public void setLineTailWidth(LineDecoration.DecorationSize style) {
      CTLineProperties ln = getLn(this, true);
      if(ln != null) {
         CTLineEndProperties lnEnd = ln.isSetTailEnd()?ln.getTailEnd():ln.addNewTailEnd();
         if(style == null) {
            if(lnEnd.isSetW()) {
               lnEnd.unsetW();
            }
         } else {
            lnEnd.setW(STLineEndWidth.Enum.forInt(style.ooxmlId));
         }

      }
   }

   public LineDecoration.DecorationSize getLineTailWidth() {
      CTLineProperties ln = getLn(this, false);
      LineDecoration.DecorationSize ds = LineDecoration.DecorationSize.MEDIUM;
      if(ln != null && ln.isSetTailEnd() && ln.getTailEnd().isSetW()) {
         ds = LineDecoration.DecorationSize.fromOoxmlId(ln.getTailEnd().getW().intValue());
      }

      return ds;
   }

   public void setLineTailLength(LineDecoration.DecorationSize style) {
      CTLineProperties ln = getLn(this, true);
      if(ln != null) {
         CTLineEndProperties lnEnd = ln.isSetTailEnd()?ln.getTailEnd():ln.addNewTailEnd();
         if(style == null) {
            if(lnEnd.isSetLen()) {
               lnEnd.unsetLen();
            }
         } else {
            lnEnd.setLen(STLineEndLength.Enum.forInt(style.ooxmlId));
         }

      }
   }

   public LineDecoration.DecorationSize getLineTailLength() {
      CTLineProperties ln = getLn(this, false);
      LineDecoration.DecorationSize ds = LineDecoration.DecorationSize.MEDIUM;
      if(ln != null && ln.isSetTailEnd() && ln.getTailEnd().isSetLen()) {
         ds = LineDecoration.DecorationSize.fromOoxmlId(ln.getTailEnd().getLen().intValue());
      }

      return ds;
   }

   public boolean isPlaceholder() {
      CTPlaceholder ph = this.getCTPlaceholder();
      return ph != null;
   }

   public Guide getAdjustValue(String name) {
      XSLFPropertiesDelegate.XSLFGeometryProperties gp = XSLFPropertiesDelegate.getGeometryDelegate(this.getShapeProperties());
      if(gp != null && gp.isSetPrstGeom() && gp.getPrstGeom().isSetAvLst()) {
         CTGeomGuide[] arr$ = gp.getPrstGeom().getAvLst().getGdArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTGeomGuide g = arr$[i$];
            if(g.getName().equals(name)) {
               return new Guide(g.getName(), g.getFmla());
            }
         }
      }

      return null;
   }

   public LineDecoration getLineDecoration() {
      return new LineDecoration() {
         public LineDecoration.DecorationShape getHeadShape() {
            return XSLFSimpleShape.this.getLineHeadDecoration();
         }
         public LineDecoration.DecorationSize getHeadWidth() {
            return XSLFSimpleShape.this.getLineHeadWidth();
         }
         public LineDecoration.DecorationSize getHeadLength() {
            return XSLFSimpleShape.this.getLineHeadLength();
         }
         public LineDecoration.DecorationShape getTailShape() {
            return XSLFSimpleShape.this.getLineTailDecoration();
         }
         public LineDecoration.DecorationSize getTailWidth() {
            return XSLFSimpleShape.this.getLineTailWidth();
         }
         public LineDecoration.DecorationSize getTailLength() {
            return XSLFSimpleShape.this.getLineTailLength();
         }
      };
   }

   public FillStyle getFillStyle() {
      return new FillStyle() {
         public PaintStyle getPaint() {
            return XSLFSimpleShape.this.getFillPaint();
         }
      };
   }

   public StrokeStyle getStrokeStyle() {
      return new StrokeStyle() {
         public PaintStyle getPaint() {
            return XSLFSimpleShape.this.getLinePaint();
         }
         public StrokeStyle.LineCap getLineCap() {
            return XSLFSimpleShape.this.getLineCap();
         }
         public StrokeStyle.LineDash getLineDash() {
            return XSLFSimpleShape.this.getLineDash();
         }
         public double getLineWidth() {
            return XSLFSimpleShape.this.getLineWidth();
         }
         public StrokeStyle.LineCompound getLineCompound() {
            return XSLFSimpleShape.this.getLineCompound();
         }
      };
   }

   public void setStrokeStyle(Object ... styles) {
      if(styles.length == 0) {
         this.setLineColor((Color)null);
      } else {
         Object[] arr$ = styles;
         int len$ = styles.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            Object st = arr$[i$];
            if(st instanceof Number) {
               this.setLineWidth(((Number)st).doubleValue());
            } else if(st instanceof StrokeStyle.LineCap) {
               this.setLineCap((StrokeStyle.LineCap)st);
            } else if(st instanceof StrokeStyle.LineDash) {
               this.setLineDash((StrokeStyle.LineDash)st);
            } else if(st instanceof StrokeStyle.LineCompound) {
               this.setLineCompound((StrokeStyle.LineCompound)st);
            } else if(st instanceof Color) {
               this.setLineColor((Color)st);
            }
         }

      }
   }

   public void setPlaceholder(Placeholder placeholder) {
      super.setPlaceholder(placeholder);
   }

   public XSLFHyperlink getHyperlink() {
      CTNonVisualDrawingProps cNvPr = this.getCNvPr();
      return !cNvPr.isSetHlinkClick()?null:new XSLFHyperlink(cNvPr.getHlinkClick(), this.getSheet());
   }

   public XSLFHyperlink createHyperlink() {
      XSLFHyperlink hl = this.getHyperlink();
      if(hl == null) {
         CTNonVisualDrawingProps cNvPr = this.getCNvPr();
         hl = new XSLFHyperlink(cNvPr.addNewHlinkClick(), this.getSheet());
      }

      return hl;
   }

   private static CTLineProperties getLn(XSLFShape shape, boolean create) {
      XmlObject pr = shape.getShapeProperties();
      if(!(pr instanceof CTShapeProperties)) {
         LOG.log(5, new Object[]{shape.getClass().toString() + " doesn\'t have line properties"});
         return null;
      } else {
         CTShapeProperties spr = (CTShapeProperties)pr;
         return !spr.isSetLn() && create?spr.addNewLn():spr.getLn();
      }
   }


   // $FF: synthetic class
   static class NamelessClass751156433 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$StrokeStyle$LineCompound = new int[StrokeStyle.LineCompound.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$sl$usermodel$StrokeStyle$LineCompound[StrokeStyle.LineCompound.SINGLE.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$StrokeStyle$LineCompound[StrokeStyle.LineCompound.DOUBLE.ordinal()] = 2;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$StrokeStyle$LineCompound[StrokeStyle.LineCompound.THICK_THIN.ordinal()] = 3;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$StrokeStyle$LineCompound[StrokeStyle.LineCompound.THIN_THICK.ordinal()] = 4;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$StrokeStyle$LineCompound[StrokeStyle.LineCompound.TRIPLE.ordinal()] = 5;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
