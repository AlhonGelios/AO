package org.apache.poi.sl.draw;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.sl.draw.DrawPaint;
import org.apache.poi.sl.draw.DrawShape;
import org.apache.poi.sl.draw.Drawable;
import org.apache.poi.sl.usermodel.Background;
import org.apache.poi.sl.usermodel.PlaceableShape;
import org.apache.poi.sl.usermodel.ShapeContainer;
import org.apache.poi.sl.usermodel.Sheet;

public class DrawBackground extends DrawShape {

   public DrawBackground(Background shape) {
      super(shape);
   }

   public void draw(Graphics2D graphics) {
      Dimension pg = this.shape.getSheet().getSlideShow().getPageSize();
      final Double anchor = new Double(0.0D, 0.0D, pg.getWidth(), pg.getHeight());
      PlaceableShape ps = new PlaceableShape() {
         public ShapeContainer getParent() {
            return null;
         }
         public Rectangle2D getAnchor() {
            return anchor;
         }
         public void setAnchor(Rectangle2D newAnchor) {}
         public double getRotation() {
            return 0.0D;
         }
         public void setRotation(double theta) {}
         public void setFlipHorizontal(boolean flip) {}
         public void setFlipVertical(boolean flip) {}
         public boolean getFlipHorizontal() {
            return false;
         }
         public boolean getFlipVertical() {
            return false;
         }
         public Sheet getSheet() {
            return DrawBackground.this.shape.getSheet();
         }
      };
      DrawFactory drawFact = DrawFactory.getInstance(graphics);
      DrawPaint dp = drawFact.getPaint(ps);
      Paint fill = dp.getPaint(graphics, this.getShape().getFillStyle().getPaint());
      Rectangle2D anchor2 = getAnchor(graphics, anchor);
      if(fill != null) {
         graphics.setRenderingHint(Drawable.GRADIENT_SHAPE, anchor);
         graphics.setPaint(fill);
         graphics.fill(anchor2);
      }

   }

   protected Background getShape() {
      return (Background)this.shape;
   }
}
