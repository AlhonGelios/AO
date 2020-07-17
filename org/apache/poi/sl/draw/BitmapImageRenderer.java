package org.apache.poi.sl.draw;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RescaleOp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.stream.MemoryCacheImageInputStream;
import org.apache.poi.sl.draw.ImageRenderer;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class BitmapImageRenderer implements ImageRenderer {

   private static final POILogger LOG = POILogFactory.getLogger(ImageRenderer.class);
   protected BufferedImage img;


   public void loadImage(InputStream data, String contentType) throws IOException {
      this.img = readImage(data, contentType);
   }

   public void loadImage(byte[] data, String contentType) throws IOException {
      this.img = readImage(new ByteArrayInputStream(data), contentType);
   }

   private static BufferedImage readImage(InputStream data, String contentType) throws IOException {
      IOException lastException = null;
      BufferedImage img = null;
      MemoryCacheImageInputStream iis = new MemoryCacheImageInputStream(data);

      try {
         iis = new MemoryCacheImageInputStream(data);
         iis.mark();
         Iterator argbImg = ImageIO.getImageReaders(iis);

         while(img == null && argbImg.hasNext()) {
            ImageReader g = (ImageReader)argbImg.next();
            ImageReadParam param = g.getDefaultReadParam();

            for(int mode = 0; img == null && mode < 2; ++mode) {
               iis.reset();
               iis.mark();
               if(mode == 1) {
                  Iterator e = g.getImageTypes(0);

                  while(e.hasNext()) {
                     ImageTypeSpecifier imageTypeSpecifier = (ImageTypeSpecifier)e.next();
                     int bufferedImageType = imageTypeSpecifier.getBufferedImageType();
                     if(bufferedImageType == 10) {
                        param.setDestinationType(imageTypeSpecifier);
                        break;
                     }
                  }
               }

               try {
                  g.setInput(iis, false, true);
                  img = g.read(0, param);
               } catch (IOException var16) {
                  lastException = var16;
               } catch (RuntimeException var17) {
                  lastException = new IOException("ImageIO runtime exception - " + (mode == 0?"normal":"fallback"), var17);
               }
            }

            g.dispose();
         }
      } finally {
         iis.close();
      }

      if(img == null) {
         if(lastException != null) {
            throw lastException;
         } else {
            LOG.log(5, new Object[]{"Content-type: " + contentType + " is not support. Image ignored."});
            return null;
         }
      } else if(img.getType() != 2) {
         BufferedImage var19 = new BufferedImage(img.getWidth(), img.getHeight(), 2);
         Graphics var20 = var19.getGraphics();
         var20.drawImage(img, 0, 0, (ImageObserver)null);
         var20.dispose();
         return var19;
      } else {
         return img;
      }
   }

   public BufferedImage getImage() {
      return this.img;
   }

   public BufferedImage getImage(Dimension dim) {
      double w_old = (double)this.img.getWidth();
      double h_old = (double)this.img.getHeight();
      BufferedImage scaled = new BufferedImage((int)w_old, (int)h_old, 2);
      double w_new = dim.getWidth();
      double h_new = dim.getHeight();
      AffineTransform at = new AffineTransform();
      at.scale(w_new / w_old, h_new / h_old);
      AffineTransformOp scaleOp = new AffineTransformOp(at, 2);
      scaleOp.filter(this.img, scaled);
      return scaled;
   }

   public Dimension getDimension() {
      return this.img == null?new Dimension(0, 0):new Dimension(this.img.getWidth(), this.img.getHeight());
   }

   public void setAlpha(double alpha) {
      if(this.img != null) {
         Dimension dim = this.getDimension();
         BufferedImage newImg = new BufferedImage((int)dim.getWidth(), (int)dim.getHeight(), 2);
         Graphics2D g = newImg.createGraphics();
         RescaleOp op = new RescaleOp(new float[]{1.0F, 1.0F, 1.0F, (float)alpha}, new float[]{0.0F, 0.0F, 0.0F, 0.0F}, (RenderingHints)null);
         g.drawImage(this.img, op, 0, 0);
         g.dispose();
         this.img = newImg;
      }
   }

   public boolean drawImage(Graphics2D graphics, Rectangle2D anchor) {
      return this.drawImage(graphics, anchor, (Insets)null);
   }

   public boolean drawImage(Graphics2D graphics, Rectangle2D anchor, Insets clip) {
      if(this.img == null) {
         return false;
      } else {
         boolean isClipped = true;
         if(clip == null) {
            isClipped = false;
            clip = new Insets(0, 0, 0, 0);
         }

         int iw = this.img.getWidth();
         int ih = this.img.getHeight();
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

         graphics.drawRenderedImage(this.img, at);
         graphics.setClip(clipOld);
         return true;
      }
   }

}
