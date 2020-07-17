package org.apache.poi.sl.draw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.RenderingHints.Key;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import org.apache.poi.sl.draw.DrawPaint;
import org.apache.poi.sl.usermodel.FreeformShape;
import org.apache.poi.sl.usermodel.GroupShape;
import org.apache.poi.sl.usermodel.Insets2D;
import org.apache.poi.sl.usermodel.PaintStyle;
import org.apache.poi.sl.usermodel.SimpleShape;
import org.apache.poi.sl.usermodel.StrokeStyle;
import org.apache.poi.sl.usermodel.TextBox;
import org.apache.poi.sl.usermodel.TextParagraph;
import org.apache.poi.sl.usermodel.TextRun;
import org.apache.poi.sl.usermodel.VerticalAlignment;
import org.apache.poi.util.NotImplemented;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.SuppressForbidden;

public final class SLGraphics extends Graphics2D implements Cloneable {

   protected POILogger log = POILogFactory.getLogger(this.getClass());
   private GroupShape _group;
   private AffineTransform _transform;
   private Stroke _stroke;
   private Paint _paint;
   private Font _font;
   private Color _foreground;
   private Color _background;
   private RenderingHints _hints;


   public SLGraphics(GroupShape group) {
      this._group = group;
      this._transform = new AffineTransform();
      this._stroke = new BasicStroke();
      this._paint = Color.black;
      this._font = new Font("Arial", 0, 12);
      this._background = Color.black;
      this._foreground = Color.white;
      this._hints = new RenderingHints((Map)null);
   }

   public GroupShape getShapeGroup() {
      return this._group;
   }

   public Font getFont() {
      return this._font;
   }

   public void setFont(Font font) {
      this._font = font;
   }

   public Color getColor() {
      return this._foreground;
   }

   public void setColor(Color c) {
      this.setPaint(c);
   }

   public Stroke getStroke() {
      return this._stroke;
   }

   public void setStroke(Stroke s) {
      this._stroke = s;
   }

   public Paint getPaint() {
      return this._paint;
   }

   public void setPaint(Paint paint) {
      if(paint != null) {
         this._paint = paint;
         if(paint instanceof Color) {
            this._foreground = (Color)paint;
         }

      }
   }

   public AffineTransform getTransform() {
      return new AffineTransform(this._transform);
   }

   public void setTransform(AffineTransform Tx) {
      this._transform = new AffineTransform(Tx);
   }

   public void draw(Shape shape) {
      Double path = new Double(this._transform.createTransformedShape(shape));
      FreeformShape p = this._group.createFreeform();
      p.setPath(path);
      p.setFillColor((Color)null);
      this.applyStroke(p);
      if(this._paint instanceof Color) {
         p.setStrokeStyle(new Object[]{(Color)this._paint});
      }

   }

   public void drawString(String s, float x, float y) {
      TextBox txt = this._group.createTextBox();
      TextRun rt = (TextRun)((TextParagraph)txt.getTextParagraphs().get(0)).getTextRuns().get(0);
      rt.setFontSize(java.lang.Double.valueOf((double)this._font.getSize()));
      rt.setFontFamily(this._font.getFamily());
      if(this.getColor() != null) {
         rt.setFontColor((PaintStyle)DrawPaint.createSolidPaint(this.getColor()));
      }

      if(this._font.isBold()) {
         rt.setBold(true);
      }

      if(this._font.isItalic()) {
         rt.setItalic(true);
      }

      txt.setText(s);
      txt.setInsets(new Insets2D(0.0D, 0.0D, 0.0D, 0.0D));
      txt.setWordWrap(false);
      txt.setHorizontalCentered(Boolean.valueOf(false));
      txt.setVerticalAlignment(VerticalAlignment.MIDDLE);
      TextLayout layout = new TextLayout(s, this._font, this.getFontRenderContext());
      float ascent = layout.getAscent();
      float width = (float)Math.floor((double)layout.getAdvance());
      float height = ascent * 2.0F;
      y -= height / 2.0F + ascent / 2.0F;
      txt.setAnchor(new Rectangle((int)x, (int)y, (int)width, (int)height));
   }

   public void fill(Shape shape) {
      Double path = new Double(this._transform.createTransformedShape(shape));
      FreeformShape p = this._group.createFreeform();
      p.setPath(path);
      this.applyPaint(p);
      p.setStrokeStyle(new Object[0]);
   }

   public void translate(int x, int y) {
      this._transform.translate((double)x, (double)y);
   }

   @NotImplemented
   public void clip(Shape s) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

   }

   @NotImplemented
   public Shape getClip() {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

      return null;
   }

   public void scale(double sx, double sy) {
      this._transform.scale(sx, sy);
   }

   public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
      java.awt.geom.RoundRectangle2D.Double rect = new java.awt.geom.RoundRectangle2D.Double((double)x, (double)y, (double)width, (double)height, (double)arcWidth, (double)arcHeight);
      this.draw(rect);
   }

   public void drawString(String str, int x, int y) {
      this.drawString(str, (float)x, (float)y);
   }

   public void fillOval(int x, int y, int width, int height) {
      java.awt.geom.Ellipse2D.Double oval = new java.awt.geom.Ellipse2D.Double((double)x, (double)y, (double)width, (double)height);
      this.fill(oval);
   }

   public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
      java.awt.geom.RoundRectangle2D.Double rect = new java.awt.geom.RoundRectangle2D.Double((double)x, (double)y, (double)width, (double)height, (double)arcWidth, (double)arcHeight);
      this.fill(rect);
   }

   public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
      java.awt.geom.Arc2D.Double arc = new java.awt.geom.Arc2D.Double((double)x, (double)y, (double)width, (double)height, (double)startAngle, (double)arcAngle, 2);
      this.fill(arc);
   }

   public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
      java.awt.geom.Arc2D.Double arc = new java.awt.geom.Arc2D.Double((double)x, (double)y, (double)width, (double)height, (double)startAngle, (double)arcAngle, 0);
      this.draw(arc);
   }

   public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
      if(nPoints > 0) {
         GeneralPath path = new GeneralPath();
         path.moveTo((float)xPoints[0], (float)yPoints[0]);

         for(int i = 1; i < nPoints; ++i) {
            path.lineTo((float)xPoints[i], (float)yPoints[i]);
         }

         this.draw(path);
      }

   }

   public void drawOval(int x, int y, int width, int height) {
      java.awt.geom.Ellipse2D.Double oval = new java.awt.geom.Ellipse2D.Double((double)x, (double)y, (double)width, (double)height);
      this.draw(oval);
   }

   @NotImplemented
   public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

      return false;
   }

   @NotImplemented
   public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

      return false;
   }

   @NotImplemented
   public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

      return false;
   }

   @NotImplemented
   public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

      return false;
   }

   @NotImplemented
   public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

      return false;
   }

   public void dispose() {}

   public void drawLine(int x1, int y1, int x2, int y2) {
      java.awt.geom.Line2D.Double line = new java.awt.geom.Line2D.Double((double)x1, (double)y1, (double)x2, (double)y2);
      this.draw(line);
   }

   public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
      Polygon polygon = new Polygon(xPoints, yPoints, nPoints);
      this.fill(polygon);
   }

   public void fillRect(int x, int y, int width, int height) {
      Rectangle rect = new Rectangle(x, y, width, height);
      this.fill(rect);
   }

   public void drawRect(int x, int y, int width, int height) {
      Rectangle rect = new Rectangle(x, y, width, height);
      this.draw(rect);
   }

   public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
      Polygon polygon = new Polygon(xPoints, yPoints, nPoints);
      this.draw(polygon);
   }

   public void clipRect(int x, int y, int width, int height) {
      this.clip(new Rectangle(x, y, width, height));
   }

   @NotImplemented
   public void setClip(Shape clip) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

   }

   public Rectangle getClipBounds() {
      Shape c = this.getClip();
      return c == null?null:c.getBounds();
   }

   public void drawString(AttributedCharacterIterator iterator, int x, int y) {
      this.drawString(iterator, (float)x, (float)y);
   }

   public void clearRect(int x, int y, int width, int height) {
      Paint paint = this.getPaint();
      this.setColor(this.getBackground());
      this.fillRect(x, y, width, height);
      this.setPaint(paint);
   }

   public void copyArea(int x, int y, int width, int height, int dx, int dy) {}

   public void setClip(int x, int y, int width, int height) {
      this.setClip(new Rectangle(x, y, width, height));
   }

   public void rotate(double theta) {
      this._transform.rotate(theta);
   }

   public void rotate(double theta, double x, double y) {
      this._transform.rotate(theta, x, y);
   }

   public void shear(double shx, double shy) {
      this._transform.shear(shx, shy);
   }

   public FontRenderContext getFontRenderContext() {
      boolean isAntiAliased = RenderingHints.VALUE_TEXT_ANTIALIAS_ON.equals(this.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING));
      boolean usesFractionalMetrics = RenderingHints.VALUE_FRACTIONALMETRICS_ON.equals(this.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS));
      return new FontRenderContext(new AffineTransform(), isAntiAliased, usesFractionalMetrics);
   }

   public void transform(AffineTransform Tx) {
      this._transform.concatenate(Tx);
   }

   public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {
      img = op.filter(img, (BufferedImage)null);
      this.drawImage(img, x, y, (ImageObserver)null);
   }

   public void setBackground(Color color) {
      if(color != null) {
         this._background = color;
      }
   }

   public Color getBackground() {
      return this._background;
   }

   @NotImplemented
   public void setComposite(Composite comp) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

   }

   @NotImplemented
   public Composite getComposite() {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

      return null;
   }

   public Object getRenderingHint(Key hintKey) {
      return this._hints.get(hintKey);
   }

   public void setRenderingHint(Key hintKey, Object hintValue) {
      this._hints.put(hintKey, hintValue);
   }

   public void drawGlyphVector(GlyphVector g, float x, float y) {
      Shape glyphOutline = g.getOutline(x, y);
      this.fill(glyphOutline);
   }

   public GraphicsConfiguration getDeviceConfiguration() {
      return GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
   }

   public void addRenderingHints(Map hints) {
      this._hints.putAll(hints);
   }

   public void translate(double tx, double ty) {
      this._transform.translate(tx, ty);
   }

   @NotImplemented
   public void drawString(AttributedCharacterIterator iterator, float x, float y) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

   }

   public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
      if(onStroke) {
         s = this.getStroke().createStrokedShape(s);
      }

      s = this.getTransform().createTransformedShape(s);
      return s.intersects(rect);
   }

   public RenderingHints getRenderingHints() {
      return this._hints;
   }

   public void setRenderingHints(Map hints) {
      this._hints = new RenderingHints((Map)null);
      this._hints.putAll(hints);
   }

   @NotImplemented
   public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

      return false;
   }

   @NotImplemented
   public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

      return false;
   }

   public Graphics create() {
      try {
         return (Graphics)this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new RuntimeException(var2);
      }
   }

   @SuppressForbidden
   public FontMetrics getFontMetrics(Font f) {
      return Toolkit.getDefaultToolkit().getFontMetrics(f);
   }

   @NotImplemented
   public void setXORMode(Color c1) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

   }

   @NotImplemented
   public void setPaintMode() {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

   }

   @NotImplemented
   public void drawRenderedImage(RenderedImage img, AffineTransform xform) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

   }

   @NotImplemented
   public void drawRenderableImage(RenderableImage img, AffineTransform xform) {
      if(this.log.check(5)) {
         this.log.log(5, new Object[]{"Not implemented"});
      }

   }

   protected void applyStroke(SimpleShape shape) {
      if(this._stroke instanceof BasicStroke) {
         BasicStroke bs = (BasicStroke)this._stroke;
         shape.setStrokeStyle(new Object[]{java.lang.Double.valueOf((double)bs.getLineWidth())});
         float[] dash = bs.getDashArray();
         if(dash != null) {
            shape.setStrokeStyle(new Object[]{StrokeStyle.LineDash.DASH});
         }
      }

   }

   protected void applyPaint(SimpleShape shape) {
      if(this._paint instanceof Color) {
         shape.setFillColor((Color)this._paint);
      }

   }
}
