package org.apache.poi.ss.util;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.Units;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ImageUtils {

   private static final POILogger logger = POILogFactory.getLogger(ImageUtils.class);
   public static final int PIXEL_DPI = 96;


   public static Dimension getImageDimension(InputStream is, int type) {
      Dimension size = new Dimension();
      switch(type) {
      case 5:
      case 6:
      case 7:
         try {
            ImageInputStream e = ImageIO.createImageInputStream(is);

            try {
               Iterator i = ImageIO.getImageReaders(e);
               ImageReader r = (ImageReader)i.next();

               try {
                  r.setInput(e);
                  BufferedImage img = r.read(0);
                  int[] dpi = getResolution(r);
                  if(dpi[0] == 0) {
                     dpi[0] = 96;
                  }

                  if(dpi[1] == 0) {
                     dpi[1] = 96;
                  }

                  size.width = img.getWidth() * 96 / dpi[0];
                  size.height = img.getHeight() * 96 / dpi[1];
               } finally {
                  r.dispose();
               }
            } finally {
               e.close();
            }
         } catch (IOException var18) {
            logger.log(5, new Object[]{var18});
         }
         break;
      default:
         logger.log(5, new Object[]{"Only JPEG, PNG and DIB pictures can be automatically sized"});
      }

      return size;
   }

   public static int[] getResolution(ImageReader r) throws IOException {
      int hdpi = 96;
      int vdpi = 96;
      double mm2inch = 25.4D;
      Element node = (Element)r.getImageMetadata(0).getAsTree("javax_imageio_1.0");
      NodeList lst = node.getElementsByTagName("HorizontalPixelSize");
      if(lst != null && lst.getLength() == 1) {
         hdpi = (int)(mm2inch / (double)Float.parseFloat(((Element)lst.item(0)).getAttribute("value")));
      }

      lst = node.getElementsByTagName("VerticalPixelSize");
      if(lst != null && lst.getLength() == 1) {
         vdpi = (int)(mm2inch / (double)Float.parseFloat(((Element)lst.item(0)).getAttribute("value")));
      }

      return new int[]{hdpi, vdpi};
   }

   public static Dimension setPreferredSize(Picture picture, double scaleX, double scaleY) {
      ClientAnchor anchor = picture.getClientAnchor();
      boolean isHSSF = anchor instanceof HSSFClientAnchor;
      PictureData data = picture.getPictureData();
      Sheet sheet = picture.getSheet();
      Dimension imgSize = getImageDimension(new ByteArrayInputStream(data.getData()), data.getPictureType());
      Dimension anchorSize = getDimensionFromAnchor(picture);
      double scaledWidth = scaleX == Double.MAX_VALUE?imgSize.getWidth():anchorSize.getWidth() / 9525.0D * scaleX;
      double scaledHeight = scaleY == Double.MAX_VALUE?imgSize.getHeight():anchorSize.getHeight() / 9525.0D * scaleY;
      double w = 0.0D;
      short col2 = anchor.getCol1();
      int dx2 = 0;
      int var29 = col2 + 1;
      w = (double)sheet.getColumnWidthInPixels(col2);
      if(isHSSF) {
         w *= 1.0D - (double)anchor.getDx1() / 1024.0D;
      } else {
         w -= (double)anchor.getDx1() / 9525.0D;
      }

      while(w < scaledWidth) {
         w += (double)sheet.getColumnWidthInPixels(var29++);
      }

      double h;
      if(w > scaledWidth) {
         --var29;
         h = (double)sheet.getColumnWidthInPixels(var29);
         double row2 = w - scaledWidth;
         if(isHSSF) {
            dx2 = (int)((h - row2) / h * 1024.0D);
         } else {
            dx2 = (int)((h - row2) * 9525.0D);
         }

         if(dx2 < 0) {
            dx2 = 0;
         }
      }

      anchor.setCol2(var29);
      anchor.setDx2(dx2);
      h = 0.0D;
      int var27 = anchor.getRow1();
      int dy2 = 0;
      h = getRowHeightInPixels(sheet, var27++);
      if(isHSSF) {
         h *= 1.0D - (double)anchor.getDy1() / 256.0D;
      } else {
         h -= (double)anchor.getDy1() / 9525.0D;
      }

      while(h < scaledHeight) {
         h += getRowHeightInPixels(sheet, var27++);
      }

      if(h > scaledHeight) {
         --var27;
         double dim = getRowHeightInPixels(sheet, var27);
         double delta = h - scaledHeight;
         if(isHSSF) {
            dy2 = (int)((dim - delta) / dim * 256.0D);
         } else {
            dy2 = (int)((dim - delta) * 9525.0D);
         }

         if(dy2 < 0) {
            dy2 = 0;
         }
      }

      anchor.setRow2(var27);
      anchor.setDy2(dy2);
      Dimension var28 = new Dimension((int)Math.round(scaledWidth * 9525.0D), (int)Math.round(scaledHeight * 9525.0D));
      return var28;
   }

   public static Dimension getDimensionFromAnchor(Picture picture) {
      ClientAnchor anchor = picture.getClientAnchor();
      boolean isHSSF = anchor instanceof HSSFClientAnchor;
      Sheet sheet = picture.getSheet();
      double w = 0.0D;
      short col2 = anchor.getCol1();
      int var10 = col2 + 1;
      w = (double)sheet.getColumnWidthInPixels(col2);
      if(isHSSF) {
         w *= 1.0D - (double)anchor.getDx1() / 1024.0D;
      } else {
         w -= (double)anchor.getDx1() / 9525.0D;
      }

      while(var10 < anchor.getCol2()) {
         w += (double)sheet.getColumnWidthInPixels(var10++);
      }

      if(isHSSF) {
         w += (double)(sheet.getColumnWidthInPixels(var10) * (float)anchor.getDx2()) / 1024.0D;
      } else {
         w += (double)anchor.getDx2() / 9525.0D;
      }

      double h = 0.0D;
      int row2 = anchor.getRow1();
      h = getRowHeightInPixels(sheet, row2++);
      if(isHSSF) {
         h *= 1.0D - (double)anchor.getDy1() / 256.0D;
      } else {
         h -= (double)anchor.getDy1() / 9525.0D;
      }

      while(row2 < anchor.getRow2()) {
         h += getRowHeightInPixels(sheet, row2++);
      }

      if(isHSSF) {
         h += getRowHeightInPixels(sheet, row2) * (double)anchor.getDy2() / 256.0D;
      } else {
         h += (double)anchor.getDy2() / 9525.0D;
      }

      w *= 9525.0D;
      h *= 9525.0D;
      return new Dimension((int)Math.rint(w), (int)Math.rint(h));
   }

   private static double getRowHeightInPixels(Sheet sheet, int rowNum) {
      Row r = sheet.getRow(rowNum);
      double points = r == null?(double)sheet.getDefaultRowHeightInPoints():(double)r.getHeightInPoints();
      return (double)Units.toEMU(points) / 9525.0D;
   }

}
