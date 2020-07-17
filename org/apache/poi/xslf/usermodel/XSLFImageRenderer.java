package org.apache.poi.xslf.usermodel;

import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.xslf.usermodel.XSLFPictureData;

public class XSLFImageRenderer {

   public boolean drawImage(Graphics2D graphics, XSLFPictureData data, Rectangle2D anchor) {
      return this.drawImage(graphics, data, anchor, (Insets)null);
   }

   public boolean drawImage(Graphics2D graphics, XSLFPictureData data, Rectangle2D anchor, Insets clip) {
      boolean isClipped = true;
      if(clip == null) {
         isClipped = false;
         clip = new Insets(0, 0, 0, 0);
      }

      BufferedImage img;
      try {
         img = ImageIO.read(data.getPackagePart().getInputStream());
      } catch (Exception var23) {
         return false;
      }

      if(img == null) {
         return false;
      } else {
         int iw = img.getWidth();
         int ih = img.getHeight();
         double cw = (double)(100000 - clip.left - clip.right) / 100000.0D;
         double ch = (double)(100000 - clip.top - clip.bottom) / 100000.0D;
         double sx = anchor.getWidth() / ((double)iw * cw);
         double sy = anchor.getHeight() / ((double)ih * ch);
         double tx = anchor.getX() - (double)iw * sx * (double)clip.left / 100000.0D;
         double ty = anchor.getY() - (double)ih * sy * (double)clip.top / 100000.0D;
         AffineTransform at = new AffineTransform(sx, 0.0D, 0.0D, sy, tx, ty);
         Shape clipOld = graphics.getClip();
         if(isClipped) {
            graphics.clip(anchor.getBounds2D());
         }

         graphics.drawRenderedImage(img, at);
         graphics.setClip(clipOld);
         return true;
      }
   }

   public BufferedImage readImage(PackagePart packagePart) throws IOException {
      return ImageIO.read(packagePart.getInputStream());
   }
}
