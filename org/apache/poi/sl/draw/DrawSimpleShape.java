package org.apache.poi.sl.draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D.Double;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.EventFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.sl.draw.DrawPaint;
import org.apache.poi.sl.draw.DrawShape;
import org.apache.poi.sl.draw.Drawable;
import org.apache.poi.sl.draw.binding.CTCustomGeometry2D;
import org.apache.poi.sl.draw.geom.Context;
import org.apache.poi.sl.draw.geom.CustomGeometry;
import org.apache.poi.sl.draw.geom.Outline;
import org.apache.poi.sl.draw.geom.Path;
import org.apache.poi.sl.usermodel.LineDecoration;
import org.apache.poi.sl.usermodel.PaintStyle;
import org.apache.poi.sl.usermodel.Shadow;
import org.apache.poi.sl.usermodel.SimpleShape;

public class DrawSimpleShape extends DrawShape {

   private static final double DECO_SIZE_POW = 1.5D;


   public DrawSimpleShape(SimpleShape shape) {
      super(shape);
   }

   public void draw(Graphics2D graphics) {
      DrawPaint drawPaint = DrawFactory.getInstance(graphics).getPaint(this.getShape());
      Paint fill = drawPaint.getPaint(graphics, this.getShape().getFillStyle().getPaint());
      Paint line = drawPaint.getPaint(graphics, this.getShape().getStrokeStyle().getPaint());
      BasicStroke stroke = this.getStroke();
      graphics.setStroke(stroke);
      Collection elems = this.computeOutlines(graphics);
      this.drawShadow(graphics, elems, fill, line);
      Iterator i$;
      Outline o;
      Shape s;
      if(fill != null) {
         graphics.setPaint(fill);
         i$ = elems.iterator();

         while(i$.hasNext()) {
            o = (Outline)i$.next();
            if(o.getPath().isFilled()) {
               s = o.getOutline();
               graphics.setRenderingHint(Drawable.GRADIENT_SHAPE, s);
               graphics.fill(s);
            }
         }
      }

      this.drawContent(graphics);
      if(line != null) {
         graphics.setPaint(line);
         graphics.setStroke(stroke);
         i$ = elems.iterator();

         while(i$.hasNext()) {
            o = (Outline)i$.next();
            if(o.getPath().isStroked()) {
               s = o.getOutline();
               graphics.setRenderingHint(Drawable.GRADIENT_SHAPE, s);
               graphics.draw(s);
            }
         }
      }

      this.drawDecoration(graphics, line, stroke);
   }

   protected void drawDecoration(Graphics2D graphics, Paint line, BasicStroke stroke) {
      if(line != null) {
         graphics.setPaint(line);
         ArrayList lst = new ArrayList();
         LineDecoration deco = this.getShape().getLineDecoration();
         Outline head = this.getHeadDecoration(graphics, deco, stroke);
         if(head != null) {
            lst.add(head);
         }

         Outline tail = this.getTailDecoration(graphics, deco, stroke);
         if(tail != null) {
            lst.add(tail);
         }

         Iterator i$ = lst.iterator();

         while(i$.hasNext()) {
            Outline o = (Outline)i$.next();
            Shape s = o.getOutline();
            Path p = o.getPath();
            graphics.setRenderingHint(Drawable.GRADIENT_SHAPE, s);
            if(p.isFilled()) {
               graphics.fill(s);
            }

            if(p.isStroked()) {
               graphics.draw(s);
            }
         }

      }
   }

   protected Outline getTailDecoration(Graphics2D graphics, LineDecoration deco, BasicStroke stroke) {
      if(deco != null && stroke != null) {
         LineDecoration.DecorationSize tailLength = deco.getTailLength();
         if(tailLength == null) {
            tailLength = LineDecoration.DecorationSize.MEDIUM;
         }

         LineDecoration.DecorationSize tailWidth = deco.getTailWidth();
         if(tailWidth == null) {
            tailWidth = LineDecoration.DecorationSize.MEDIUM;
         }

         double lineWidth = Math.max(2.5D, (double)stroke.getLineWidth());
         Rectangle2D anchor = getAnchor(graphics, this.getShape());
         double x2 = anchor.getX() + anchor.getWidth();
         double y2 = anchor.getY() + anchor.getHeight();
         double alpha = Math.atan(anchor.getHeight() / anchor.getWidth());
         AffineTransform at = new AffineTransform();
         Object tailShape = null;
         Path p = null;
         double scaleY = Math.pow(1.5D, (double)(tailWidth.ordinal() + 1));
         double scaleX = Math.pow(1.5D, (double)(tailLength.ordinal() + 1));
         LineDecoration.DecorationShape tailShapeEnum = deco.getTailShape();
         if(tailShapeEnum == null) {
            return null;
         } else {
            switch(DrawSimpleShape.NamelessClass1717856541.$SwitchMap$org$apache$poi$sl$usermodel$LineDecoration$DecorationShape[tailShapeEnum.ordinal()]) {
            case 1:
               p = new Path();
               tailShape = new Double(0.0D, 0.0D, lineWidth * scaleX, lineWidth * scaleY);
               Rectangle2D bounds = ((Shape)tailShape).getBounds2D();
               at.translate(x2 - bounds.getWidth() / 2.0D, y2 - bounds.getHeight() / 2.0D);
               at.rotate(alpha, bounds.getX() + bounds.getWidth() / 2.0D, bounds.getY() + bounds.getHeight() / 2.0D);
               break;
            case 2:
            case 3:
               p = new Path(false, true);
               java.awt.geom.Path2D.Double arrow = new java.awt.geom.Path2D.Double();
               arrow.moveTo(-lineWidth * scaleX, -lineWidth * scaleY / 2.0D);
               arrow.lineTo(0.0D, 0.0D);
               arrow.lineTo(-lineWidth * scaleX, lineWidth * scaleY / 2.0D);
               tailShape = arrow;
               at.translate(x2, y2);
               at.rotate(alpha);
               break;
            case 4:
               p = new Path();
               java.awt.geom.Path2D.Double triangle = new java.awt.geom.Path2D.Double();
               triangle.moveTo(-lineWidth * scaleX, -lineWidth * scaleY / 2.0D);
               triangle.lineTo(0.0D, 0.0D);
               triangle.lineTo(-lineWidth * scaleX, lineWidth * scaleY / 2.0D);
               triangle.closePath();
               tailShape = triangle;
               at.translate(x2, y2);
               at.rotate(alpha);
            }

            if(tailShape != null) {
               tailShape = at.createTransformedShape((Shape)tailShape);
            }

            return tailShape == null?null:new Outline((Shape)tailShape, p);
         }
      } else {
         return null;
      }
   }

   protected Outline getHeadDecoration(Graphics2D graphics, LineDecoration deco, BasicStroke stroke) {
      if(deco != null && stroke != null) {
         LineDecoration.DecorationSize headLength = deco.getHeadLength();
         if(headLength == null) {
            headLength = LineDecoration.DecorationSize.MEDIUM;
         }

         LineDecoration.DecorationSize headWidth = deco.getHeadWidth();
         if(headWidth == null) {
            headWidth = LineDecoration.DecorationSize.MEDIUM;
         }

         double lineWidth = Math.max(2.5D, (double)stroke.getLineWidth());
         Rectangle2D anchor = getAnchor(graphics, this.getShape());
         double x1 = anchor.getX();
         double y1 = anchor.getY();
         double alpha = Math.atan(anchor.getHeight() / anchor.getWidth());
         AffineTransform at = new AffineTransform();
         Object headShape = null;
         Path p = null;
         double scaleY = Math.pow(1.5D, (double)(headWidth.ordinal() + 1));
         double scaleX = Math.pow(1.5D, (double)(headLength.ordinal() + 1));
         LineDecoration.DecorationShape headShapeEnum = deco.getHeadShape();
         if(headShapeEnum == null) {
            return null;
         } else {
            switch(DrawSimpleShape.NamelessClass1717856541.$SwitchMap$org$apache$poi$sl$usermodel$LineDecoration$DecorationShape[headShapeEnum.ordinal()]) {
            case 1:
               p = new Path();
               headShape = new Double(0.0D, 0.0D, lineWidth * scaleX, lineWidth * scaleY);
               Rectangle2D bounds = ((Shape)headShape).getBounds2D();
               at.translate(x1 - bounds.getWidth() / 2.0D, y1 - bounds.getHeight() / 2.0D);
               at.rotate(alpha, bounds.getX() + bounds.getWidth() / 2.0D, bounds.getY() + bounds.getHeight() / 2.0D);
               break;
            case 2:
            case 3:
               p = new Path(false, true);
               java.awt.geom.Path2D.Double arrow = new java.awt.geom.Path2D.Double();
               arrow.moveTo(lineWidth * scaleX, -lineWidth * scaleY / 2.0D);
               arrow.lineTo(0.0D, 0.0D);
               arrow.lineTo(lineWidth * scaleX, lineWidth * scaleY / 2.0D);
               headShape = arrow;
               at.translate(x1, y1);
               at.rotate(alpha);
               break;
            case 4:
               p = new Path();
               java.awt.geom.Path2D.Double triangle = new java.awt.geom.Path2D.Double();
               triangle.moveTo(lineWidth * scaleX, -lineWidth * scaleY / 2.0D);
               triangle.lineTo(0.0D, 0.0D);
               triangle.lineTo(lineWidth * scaleX, lineWidth * scaleY / 2.0D);
               triangle.closePath();
               headShape = triangle;
               at.translate(x1, y1);
               at.rotate(alpha);
            }

            if(headShape != null) {
               headShape = at.createTransformedShape((Shape)headShape);
            }

            return headShape == null?null:new Outline((Shape)headShape, p);
         }
      } else {
         return null;
      }
   }

   public BasicStroke getStroke() {
      return getStroke(this.getShape().getStrokeStyle());
   }

   protected void drawShadow(Graphics2D graphics, Collection outlines, Paint fill, Paint line) {
      Shadow shadow = this.getShape().getShadow();
      if(shadow != null && (fill != null || line != null)) {
         PaintStyle.SolidPaint shadowPaint = shadow.getFillStyle();
         Color shadowColor = DrawPaint.applyColorTransform(shadowPaint.getSolidColor());
         double shapeRotation = this.getShape().getRotation();
         if(this.getShape().getFlipVertical()) {
            shapeRotation += 180.0D;
         }

         double angle = shadow.getAngle() - shapeRotation;
         double dist = shadow.getDistance();
         double dx = dist * Math.cos(Math.toRadians(angle));
         double dy = dist * Math.sin(Math.toRadians(angle));
         graphics.translate(dx, dy);
         Iterator i$ = outlines.iterator();

         while(i$.hasNext()) {
            Outline o = (Outline)i$.next();
            Shape s = o.getOutline();
            Path p = o.getPath();
            graphics.setRenderingHint(Drawable.GRADIENT_SHAPE, s);
            graphics.setPaint(shadowColor);
            if(fill != null && p.isFilled()) {
               graphics.fill(s);
            } else if(line != null && p.isStroked()) {
               graphics.draw(s);
            }
         }

         graphics.translate(-dx, -dy);
      }
   }

   protected static CustomGeometry getCustomGeometry(String name) {
      return getCustomGeometry(name, (Graphics2D)null);
   }

   protected static CustomGeometry getCustomGeometry(String name, Graphics2D graphics) {
      Object presets = graphics == null?null:(Map)graphics.getRenderingHint(Drawable.PRESET_GEOMETRY_CACHE);
      if(presets == null) {
         presets = new HashMap();
         if(graphics != null) {
            graphics.setRenderingHint(Drawable.PRESET_GEOMETRY_CACHE, presets);
         }

         String packageName = "org.apache.poi.sl.draw.binding";
         InputStream presetIS = Drawable.class.getResourceAsStream("presetShapeDefinitions.xml");
         EventFilter startElementFilter = new EventFilter() {
            public boolean accept(XMLEvent event) {
               return event.isStartElement();
            }
         };

         try {
            XMLInputFactory e = XMLInputFactory.newInstance();
            XMLEventReader staxReader = e.createXMLEventReader(presetIS);
            XMLEventReader staxFiltRd = e.createFilteredReader(staxReader, startElementFilter);
            staxFiltRd.nextEvent();
            JAXBContext jaxbContext = JAXBContext.newInstance(packageName);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            while(staxFiltRd.peek() != null) {
               StartElement evRoot = (StartElement)staxFiltRd.peek();
               String cusName = evRoot.getName().getLocalPart();
               JAXBElement el = unmarshaller.unmarshal(staxReader, CTCustomGeometry2D.class);
               CTCustomGeometry2D cusGeom = (CTCustomGeometry2D)el.getValue();
               ((Map)presets).put(cusName, new CustomGeometry(cusGeom));
            }

            staxFiltRd.close();
            staxReader.close();
         } catch (Exception var22) {
            throw new RuntimeException("Unable to load preset geometries.", var22);
         } finally {
            try {
               presetIS.close();
            } catch (IOException var21) {
               throw new RuntimeException("Unable to load preset geometries.", var21);
            }
         }
      }

      return (CustomGeometry)((Map)presets).get(name);
   }

   protected Collection computeOutlines(Graphics2D graphics) {
      ArrayList lst = new ArrayList();
      CustomGeometry geom = this.getShape().getGeometry();
      if(geom == null) {
         return lst;
      } else {
         Rectangle2D anchor = getAnchor(graphics, this.getShape());
         Iterator i$ = geom.iterator();

         while(i$.hasNext()) {
            Path p = (Path)i$.next();
            double w = p.getW() == -1L?anchor.getWidth() * 12700.0D:(double)p.getW();
            double h = p.getH() == -1L?anchor.getHeight() * 12700.0D:(double)p.getH();
            java.awt.geom.Rectangle2D.Double pathAnchor = new java.awt.geom.Rectangle2D.Double(0.0D, 0.0D, w, h);
            Context ctx = new Context(geom, pathAnchor, this.getShape());
            java.awt.geom.Path2D.Double gp = p.getPath(ctx);
            AffineTransform at = new AffineTransform();
            at.translate(anchor.getX(), anchor.getY());
            double scaleX;
            if(p.getW() != -1L) {
               scaleX = anchor.getWidth() / (double)p.getW();
            } else {
               scaleX = 7.874015748031496E-5D;
            }

            double scaleY;
            if(p.getH() != -1L) {
               scaleY = anchor.getHeight() / (double)p.getH();
            } else {
               scaleY = 7.874015748031496E-5D;
            }

            at.scale(scaleX, scaleY);
            Shape canvasShape = at.createTransformedShape(gp);
            lst.add(new Outline(canvasShape, p));
         }

         return lst;
      }
   }

   protected SimpleShape getShape() {
      return (SimpleShape)this.shape;
   }

   // $FF: synthetic class
   static class NamelessClass1717856541 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$LineDecoration$DecorationShape = new int[LineDecoration.DecorationShape.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$sl$usermodel$LineDecoration$DecorationShape[LineDecoration.DecorationShape.OVAL.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$LineDecoration$DecorationShape[LineDecoration.DecorationShape.STEALTH.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$LineDecoration$DecorationShape[LineDecoration.DecorationShape.ARROW.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$LineDecoration$DecorationShape[LineDecoration.DecorationShape.TRIANGLE.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
