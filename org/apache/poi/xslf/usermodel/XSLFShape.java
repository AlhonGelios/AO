package org.apache.poi.xslf.usermodel;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.sl.draw.DrawPaint;
import org.apache.poi.sl.usermodel.ColorStyle;
import org.apache.poi.sl.usermodel.PaintStyle;
import org.apache.poi.sl.usermodel.PlaceableShape;
import org.apache.poi.sl.usermodel.Placeholder;
import org.apache.poi.sl.usermodel.Shape;
import org.apache.poi.util.Internal;
import org.apache.poi.xslf.model.PropertyFetcher;
import org.apache.poi.xslf.usermodel.XSLFColor;
import org.apache.poi.xslf.usermodel.XSLFPropertiesDelegate;
import org.apache.poi.xslf.usermodel.XSLFShapeContainer;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFSimpleShape;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;
import org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType;
import org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;
import org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType;

public abstract class XSLFShape implements Shape {

   protected static final String PML_NS = "http://schemas.openxmlformats.org/presentationml/2006/main";
   private final XmlObject _shape;
   private final XSLFSheet _sheet;
   private XSLFShapeContainer _parent;
   private CTShapeStyle _spStyle;
   private CTNonVisualDrawingProps _nvPr;
   private CTPlaceholder _ph;


   protected XSLFShape(XmlObject shape, XSLFSheet sheet) {
      this._shape = shape;
      this._sheet = sheet;
   }

   public final XmlObject getXmlObject() {
      return this._shape;
   }

   public XSLFSheet getSheet() {
      return this._sheet;
   }

   public String getShapeName() {
      return this.getCNvPr().getName();
   }

   public int getShapeId() {
      return (int)this.getCNvPr().getId();
   }

   @Internal
   void copy(XSLFShape sh) {
      if(!this.getClass().isInstance(sh)) {
         throw new IllegalArgumentException("Can\'t copy " + sh.getClass().getSimpleName() + " into " + this.getClass().getSimpleName());
      } else {
         if(this instanceof PlaceableShape) {
            PlaceableShape ps = (PlaceableShape)this;
            ps.setAnchor(((PlaceableShape)sh).getAnchor());
         }

      }
   }

   public void setParent(XSLFShapeContainer parent) {
      this._parent = parent;
   }

   public XSLFShapeContainer getParent() {
      return this._parent;
   }

   protected PaintStyle getFillPaint() {
      final XSLFTheme theme = this.getSheet().getTheme();
      PropertyFetcher fetcher = new PropertyFetcher() {
         public boolean fetch(XSLFShape shape) {
            XSLFPropertiesDelegate.XSLFFillProperties fp = XSLFPropertiesDelegate.getFillDelegate(shape.getShapeProperties());
            if(fp == null) {
               return false;
            } else if(fp.isSetNoFill()) {
               this.setValue((Object)null);
               return true;
            } else {
               PackagePart pp = shape.getSheet().getPackagePart();
               PaintStyle paint = XSLFShape.selectPaint(fp, (CTSchemeColor)null, pp, theme);
               if(paint != null) {
                  this.setValue(paint);
                  return true;
               } else {
                  CTShapeStyle style = shape.getSpStyle();
                  if(style != null) {
                     fp = XSLFPropertiesDelegate.getFillDelegate(style.getFillRef());
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
         }
      };
      this.fetchShapeProperty(fetcher);
      return (PaintStyle)fetcher.getValue();
   }

   protected CTBackgroundProperties getBgPr() {
      return (CTBackgroundProperties)this.getChild(CTBackgroundProperties.class, "http://schemas.openxmlformats.org/presentationml/2006/main", "bgPr");
   }

   protected CTStyleMatrixReference getBgRef() {
      return (CTStyleMatrixReference)this.getChild(CTStyleMatrixReference.class, "http://schemas.openxmlformats.org/presentationml/2006/main", "bgRef");
   }

   protected CTGroupShapeProperties getGrpSpPr() {
      return (CTGroupShapeProperties)this.getChild(CTGroupShapeProperties.class, "http://schemas.openxmlformats.org/presentationml/2006/main", "grpSpPr");
   }

   protected CTNonVisualDrawingProps getCNvPr() {
      if(this._nvPr == null) {
         String xquery = "declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\' .//*/p:cNvPr";
         this._nvPr = (CTNonVisualDrawingProps)this.selectProperty(CTNonVisualDrawingProps.class, xquery);
      }

      return this._nvPr;
   }

   protected CTShapeStyle getSpStyle() {
      if(this._spStyle == null) {
         this._spStyle = (CTShapeStyle)this.getChild(CTShapeStyle.class, "http://schemas.openxmlformats.org/presentationml/2006/main", "style");
      }

      return this._spStyle;
   }

   protected XmlObject getChild(Class childClass, String namespace, String nodename) {
      XmlCursor cur = this.getXmlObject().newCursor();
      XmlObject child = null;
      if(cur.toChild(namespace, nodename)) {
         child = cur.getObject();
      }

      cur.dispose();
      return child;
   }

   protected CTPlaceholder getCTPlaceholder() {
      if(this._ph == null) {
         String xquery = "declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\' .//*/p:nvPr/p:ph";
         this._ph = (CTPlaceholder)this.selectProperty(CTPlaceholder.class, xquery);
      }

      return this._ph;
   }

   public Placeholder getPlaceholder() {
      CTPlaceholder ph = this.getCTPlaceholder();
      return ph != null && (ph.isSetType() || ph.isSetIdx())?Placeholder.lookupOoxml(ph.getType().intValue()):null;
   }

   protected void setPlaceholder(Placeholder placeholder) {
      String xquery = "declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\' .//*/p:nvPr";
      CTApplicationNonVisualDrawingProps nv = (CTApplicationNonVisualDrawingProps)this.selectProperty(CTApplicationNonVisualDrawingProps.class, xquery);
      if(nv != null) {
         if(placeholder == null) {
            if(nv.isSetPh()) {
               nv.unsetPh();
            }

            this._ph = null;
         } else {
            nv.addNewPh().setType(STPlaceholderType.Enum.forInt(placeholder.ooxmlId));
         }

      }
   }

   protected XmlObject selectProperty(Class resultClass, String xquery) {
      XmlObject[] rs = this.getXmlObject().selectPath(xquery);
      return rs.length == 0?null:(resultClass.isInstance(rs[0])?rs[0]:null);
   }

   protected boolean fetchShapeProperty(PropertyFetcher visitor) {
      boolean ok = visitor.fetch(this);
      XSLFSheet masterSheet = (XSLFSheet)this.getSheet().getMasterSheet();
      CTPlaceholder ph = this.getCTPlaceholder();
      if(masterSheet != null && ph != null) {
         XSLFSimpleShape masterShape;
         if(!ok) {
            masterShape = masterSheet.getPlaceholder(ph);
            if(masterShape != null) {
               ok = visitor.fetch(masterShape);
            }
         }

         if(!ok) {
            int textType;
            if(!ph.isSetType()) {
               textType = 2;
            } else {
               switch(ph.getType().intValue()) {
               case 1:
               case 3:
                  textType = 1;
                  break;
               case 2:
               case 4:
               default:
                  textType = 2;
                  break;
               case 5:
               case 6:
               case 7:
                  textType = ph.getType().intValue();
               }
            }

            XSLFSheet master = (XSLFSheet)masterSheet.getMasterSheet();
            if(master != null) {
               masterShape = master.getPlaceholderByType(textType);
               if(masterShape != null) {
                  ok = visitor.fetch(masterShape);
               }
            }
         }
      }

      return ok;
   }

   protected static PaintStyle selectPaint(XSLFPropertiesDelegate.XSLFFillProperties fp, CTSchemeColor phClr, PackagePart parentPart, XSLFTheme theme) {
      return fp != null && !fp.isSetNoFill()?(fp.isSetSolidFill()?selectPaint(fp.getSolidFill(), phClr, theme):(fp.isSetBlipFill()?selectPaint(fp.getBlipFill(), parentPart):(fp.isSetGradFill()?selectPaint(fp.getGradFill(), phClr, theme):(fp.isSetMatrixStyle()?selectPaint(fp.getMatrixStyle(), theme, fp.isLineStyle()):null)))):null;
   }

   protected static PaintStyle selectPaint(CTSolidColorFillProperties solidFill, CTSchemeColor phClr, XSLFTheme theme) {
      if(phClr == null && solidFill.isSetSchemeClr()) {
         phClr = solidFill.getSchemeClr();
      }

      XSLFColor c = new XSLFColor(solidFill, theme, phClr);
      return DrawPaint.createSolidPaint(c.getColorStyle());
   }

   protected static PaintStyle selectPaint(CTBlipFillProperties blipFill, final PackagePart parentPart) {
      final CTBlip blip = blipFill.getBlip();
      return new PaintStyle.TexturePaint() {
         private PackagePart getPart() {
            try {
               String e = blip.getEmbed();
               PackageRelationship rel = parentPart.getRelationship(e);
               return parentPart.getRelatedPart(rel);
            } catch (InvalidFormatException var3) {
               throw new RuntimeException(var3);
            }
         }
         public InputStream getImageData() {
            try {
               return this.getPart().getInputStream();
            } catch (IOException var2) {
               throw new RuntimeException(var2);
            }
         }
         public String getContentType() {
            return this.getPart().getContentType();
         }
         public int getAlpha() {
            return blip.sizeOfAlphaModFixArray() > 0?blip.getAlphaModFixArray(0).getAmt():100000;
         }
      };
   }

   protected static PaintStyle selectPaint(final CTGradientFillProperties gradFill, CTSchemeColor phClr, XSLFTheme theme) {
      CTGradientStop[] gs = gradFill.getGsLst().getGsArray();
      Arrays.sort(gs, new Comparator() {
         public int compare(CTGradientStop o1, CTGradientStop o2) {
            Integer pos1 = Integer.valueOf(o1.getPos());
            Integer pos2 = Integer.valueOf(o2.getPos());
            return pos1.compareTo(pos2);
         }
      });
      final ColorStyle[] cs = new ColorStyle[gs.length];
      final float[] fractions = new float[gs.length];
      int i = 0;
      CTGradientStop[] arr$ = gs;
      int len$ = gs.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTGradientStop cgs = arr$[i$];
         CTSchemeColor phClrCgs = phClr;
         if(phClr == null && cgs.isSetSchemeClr()) {
            phClrCgs = cgs.getSchemeClr();
         }

         cs[i] = (new XSLFColor(cgs, theme, phClrCgs)).getColorStyle();
         fractions[i] = (float)cgs.getPos() / 100000.0F;
         ++i;
      }

      return new PaintStyle.GradientPaint() {
         public double getGradientAngle() {
            return gradFill.isSetLin()?(double)gradFill.getLin().getAng() / 60000.0D:0.0D;
         }
         public ColorStyle[] getGradientColors() {
            return cs;
         }
         public float[] getGradientFractions() {
            return fractions;
         }
         public boolean isRotatedWithShape() {
            return gradFill.isSetRotWithShape() || !gradFill.getRotWithShape();
         }
         public PaintStyle.GradientPaint.GradientType getGradientType() {
            if(gradFill.isSetLin()) {
               return PaintStyle.GradientPaint.GradientType.linear;
            } else {
               if(gradFill.isSetPath()) {
                  STPathShadeType.Enum ps = gradFill.getPath().getPath();
                  if(ps == STPathShadeType.CIRCLE) {
                     return PaintStyle.GradientPaint.GradientType.circular;
                  }

                  if(ps == STPathShadeType.SHAPE) {
                     return PaintStyle.GradientPaint.GradientType.shape;
                  }
               }

               return PaintStyle.GradientPaint.GradientType.linear;
            }
         }
      };
   }

   protected static PaintStyle selectPaint(CTStyleMatrixReference fillRef, XSLFTheme theme, boolean isLineStyle) {
      if(fillRef == null) {
         return null;
      } else {
         int idx = (int)fillRef.getIdx();
         CTSchemeColor phClr = fillRef.getSchemeClr();
         CTStyleMatrix matrix = theme.getXmlObject().getThemeElements().getFmtScheme();
         Object styleLst = null;
         int childIdx;
         if(idx >= 1 && idx <= 999) {
            childIdx = idx - 1;
            styleLst = isLineStyle?matrix.getLnStyleLst():matrix.getFillStyleLst();
         } else {
            if(idx < 1001) {
               return null;
            }

            childIdx = idx - 1001;
            styleLst = matrix.getBgFillStyleLst();
         }

         XmlCursor cur = ((XmlObject)styleLst).newCursor();
         XSLFPropertiesDelegate.XSLFFillProperties fp = null;
         if(cur.toChild(childIdx)) {
            fp = XSLFPropertiesDelegate.getFillDelegate(cur.getObject());
         }

         cur.dispose();
         return selectPaint(fp, phClr, theme.getPackagePart(), theme);
      }
   }

   public void draw(Graphics2D graphics, Rectangle2D bounds) {
      DrawFactory.getInstance(graphics).drawShape(graphics, this, bounds);
   }

   protected XmlObject getShapeProperties() {
      return this.getChild(CTShapeProperties.class, "http://schemas.openxmlformats.org/presentationml/2006/main", "spPr");
   }
}
