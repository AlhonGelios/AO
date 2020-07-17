package org.apache.poi.sl.draw;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.sl.draw.DrawShape;
import org.apache.poi.sl.draw.DrawSimpleShape;
import org.apache.poi.sl.draw.DrawTextParagraph;
import org.apache.poi.sl.usermodel.Insets2D;
import org.apache.poi.sl.usermodel.PlaceableShape;
import org.apache.poi.sl.usermodel.ShapeContainer;
import org.apache.poi.sl.usermodel.TextParagraph;
import org.apache.poi.sl.usermodel.TextShape;
import org.apache.poi.sl.usermodel.VerticalAlignment;

public class DrawTextShape extends DrawSimpleShape {

   public DrawTextShape(TextShape shape) {
      super(shape);
   }

   public void drawContent(Graphics2D graphics) {
      DrawFactory.getInstance(graphics).fixFonts(graphics);
      TextShape s = this.getShape();
      Rectangle2D anchor = DrawShape.getAnchor(graphics, (PlaceableShape)s);
      Insets2D insets = s.getInsets();
      double x = anchor.getX() + insets.left;
      double y = anchor.getY();
      AffineTransform tx = graphics.getTransform();
      boolean vertFlip = s.getFlipVertical();
      boolean horzFlip = s.getFlipHorizontal();

      PlaceableShape textRot;
      for(ShapeContainer sc = s.getParent(); sc instanceof PlaceableShape; sc = textRot.getParent()) {
         textRot = (PlaceableShape)sc;
         vertFlip ^= textRot.getFlipVertical();
         horzFlip ^= textRot.getFlipHorizontal();
      }

      if(horzFlip ^ vertFlip) {
         double textRot1 = anchor.getX();
         double ay = anchor.getY();
         graphics.translate(textRot1 + anchor.getWidth(), ay);
         graphics.scale(-1.0D, 1.0D);
         graphics.translate(-textRot1, -ay);
      }

      Double textRot2 = s.getTextRotation();
      double textHeight;
      double textDir;
      if(textRot2 != null && textRot2.doubleValue() != 0.0D) {
         textHeight = anchor.getCenterX();
         textDir = anchor.getCenterY();
         graphics.translate(textHeight, textDir);
         graphics.rotate(Math.toRadians(textRot2.doubleValue()));
         graphics.translate(-textHeight, -textDir);
      }

      switch(DrawTextShape.NamelessClass1200578712.$SwitchMap$org$apache$poi$sl$usermodel$VerticalAlignment[s.getVerticalAlignment().ordinal()]) {
      case 1:
      default:
         y += insets.top;
         break;
      case 2:
         textHeight = this.getTextHeight(graphics);
         y += anchor.getHeight() - textHeight - insets.bottom;
         break;
      case 3:
         textHeight = this.getTextHeight(graphics);
         textDir = anchor.getHeight() - textHeight - insets.top - insets.bottom;
         y += insets.top + textDir / 2.0D;
      }

      TextShape.TextDirection textDir1 = s.getTextDirection();
      if(textDir1 == TextShape.TextDirection.VERTICAL || textDir1 == TextShape.TextDirection.VERTICAL_270) {
         double deg = textDir1 == TextShape.TextDirection.VERTICAL?90.0D:270.0D;
         double cx = anchor.getCenterX();
         double cy = anchor.getCenterY();
         graphics.translate(cx, cy);
         graphics.rotate(Math.toRadians(deg));
         graphics.translate(-cx, -cy);
         double w = anchor.getWidth();
         double h = anchor.getHeight();
         double dx = (w - h) / 2.0D;
         graphics.translate(dx, -dx);
      }

      this.drawParagraphs(graphics, x, y);
      graphics.setTransform(tx);
   }

   public double drawParagraphs(Graphics2D graphics, double x, double y) {
      DrawFactory fact = DrawFactory.getInstance(graphics);
      double y0 = y;
      Iterator paragraphs = this.getShape().iterator();
      boolean isFirstLine = true;

      for(int autoNbrIdx = 0; paragraphs.hasNext(); ++autoNbrIdx) {
         TextParagraph p = (TextParagraph)paragraphs.next();
         DrawTextParagraph dp = fact.getDrawable(p);
         TextParagraph.BulletStyle bs = p.getBulletStyle();
         if(bs != null && bs.getAutoNumberingScheme() != null) {
            Integer spaceAfter = bs.getAutoNumberingStartAt();
            if(spaceAfter == null) {
               spaceAfter = Integer.valueOf(1);
            }

            if(spaceAfter.intValue() > autoNbrIdx) {
               autoNbrIdx = spaceAfter.intValue();
            }
         } else {
            autoNbrIdx = -1;
         }

         dp.setAutoNumberingIdx(autoNbrIdx);
         dp.breakText(graphics);
         Double var16;
         if(!isFirstLine) {
            var16 = p.getSpaceBefore();
            if(var16 == null) {
               var16 = Double.valueOf(0.0D);
            }

            if(var16.doubleValue() > 0.0D) {
               y += var16.doubleValue() * 0.01D * (double)dp.getFirstLineHeight();
            } else {
               y += -var16.doubleValue();
            }
         }

         isFirstLine = false;
         dp.setPosition(x, y);
         dp.draw(graphics);
         y += dp.getY();
         if(paragraphs.hasNext()) {
            var16 = p.getSpaceAfter();
            if(var16 == null) {
               var16 = Double.valueOf(0.0D);
            }

            if(var16.doubleValue() > 0.0D) {
               y += var16.doubleValue() * 0.01D * (double)dp.getLastLineHeight();
            } else {
               y += -var16.doubleValue();
            }
         }
      }

      return y - y0;
   }

   public double getTextHeight() {
      return this.getTextHeight((Graphics2D)null);
   }

   protected double getTextHeight(Graphics2D oldGraphics) {
      BufferedImage img = new BufferedImage(1, 1, 1);
      Graphics2D graphics = img.createGraphics();
      if(oldGraphics != null) {
         graphics.addRenderingHints(oldGraphics.getRenderingHints());
         graphics.setTransform(oldGraphics.getTransform());
      }

      DrawFactory.getInstance(graphics).fixFonts(graphics);
      return this.drawParagraphs(graphics, 0.0D, 0.0D);
   }

   protected TextShape getShape() {
      return (TextShape)this.shape;
   }

   // $FF: synthetic class
   static class NamelessClass1200578712 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$VerticalAlignment = new int[VerticalAlignment.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$sl$usermodel$VerticalAlignment[VerticalAlignment.TOP.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$VerticalAlignment[VerticalAlignment.BOTTOM.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$VerticalAlignment[VerticalAlignment.MIDDLE.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
