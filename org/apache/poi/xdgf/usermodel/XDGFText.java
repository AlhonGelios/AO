package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.TextType;
import com.microsoft.schemas.office.visio.x2012.main.impl.TextTypeImpl;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D.Double;
import org.apache.poi.util.Internal;
import org.apache.poi.xdgf.usermodel.XDGFShape;

public class XDGFText {

   TextType _text;
   XDGFShape _parent;


   public XDGFText(TextType text, XDGFShape parent) {
      this._text = text;
      this._parent = parent;
   }

   @Internal
   TextType getXmlObject() {
      return this._text;
   }

   public String getTextContent() {
      return ((TextTypeImpl)this._text).getStringValue();
   }

   public Double getTextBounds() {
      double txtPinX = this._parent.getTxtPinX().doubleValue();
      double txtPinY = this._parent.getTxtPinY().doubleValue();
      double txtLocPinX = this._parent.getTxtLocPinX().doubleValue();
      double txtLocPinY = this._parent.getTxtLocPinY().doubleValue();
      double txtWidth = this._parent.getTxtWidth().doubleValue();
      double txtHeight = this._parent.getTxtHeight().doubleValue();
      double x = txtPinX - txtLocPinX;
      double y = txtPinY - txtLocPinY;
      return new Double(x, y, txtWidth, txtHeight);
   }

   public java.awt.geom.Path2D.Double getBoundsAsPath() {
      Double rect = this.getTextBounds();
      java.lang.Double w = java.lang.Double.valueOf(rect.getWidth());
      java.lang.Double h = java.lang.Double.valueOf(rect.getHeight());
      java.awt.geom.Path2D.Double bounds = new java.awt.geom.Path2D.Double();
      bounds.moveTo(0.0D, 0.0D);
      bounds.lineTo(w.doubleValue(), 0.0D);
      bounds.lineTo(w.doubleValue(), h.doubleValue());
      bounds.lineTo(0.0D, h.doubleValue());
      bounds.lineTo(0.0D, 0.0D);
      return bounds;
   }

   public java.awt.geom.Point2D.Double getTextCenter() {
      return new java.awt.geom.Point2D.Double(this._parent.getTxtLocPinX().doubleValue(), this._parent.getTxtLocPinY().doubleValue());
   }

   public void draw(Graphics2D graphics) {
      String textContent = this.getTextContent();
      if(textContent.length() != 0) {
         Double bounds = this.getTextBounds();
         String[] lines = textContent.trim().split("\n");
         FontRenderContext frc = graphics.getFontRenderContext();
         Font font = graphics.getFont();
         AffineTransform oldTr = graphics.getTransform();
         Boolean flipX = this._parent.getFlipX();
         Boolean flipY = this._parent.getFlipY();
         if(flipY == null || !this._parent.getFlipY().booleanValue()) {
            graphics.translate(bounds.x, bounds.y);
            graphics.scale(1.0D, -1.0D);
            graphics.translate(0.0D, -bounds.height + graphics.getFontMetrics().getMaxCharBounds(graphics).getHeight());
         }

         if(flipX != null && this._parent.getFlipX().booleanValue()) {
            graphics.scale(-1.0D, 1.0D);
            graphics.translate(-bounds.width, 0.0D);
         }

         java.lang.Double txtAngle = this._parent.getTxtAngle();
         if(txtAngle != null && Math.abs(txtAngle.doubleValue()) > 0.01D) {
            graphics.rotate(txtAngle.doubleValue());
         }

         float nextY = 0.0F;
         String[] arr$ = lines;
         int len$ = lines.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            String line = arr$[i$];
            if(line.length() != 0) {
               TextLayout layout = new TextLayout(line, font, frc);
               if(layout.isLeftToRight()) {
                  layout.draw(graphics, 0.0F, nextY);
               } else {
                  layout.draw(graphics, (float)(bounds.width - (double)layout.getAdvance()), nextY);
               }

               nextY += layout.getAscent() + layout.getDescent() + layout.getLeading();
            }
         }

         graphics.setTransform(oldTr);
      }
   }
}
