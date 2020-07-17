package org.apache.poi.xdgf.util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageIO;
import org.apache.poi.xdgf.geom.Dimension2dDouble;
import org.apache.poi.xdgf.usermodel.XDGFPage;
import org.apache.poi.xdgf.usermodel.XmlVisioDocument;
import org.apache.poi.xdgf.usermodel.shape.ShapeDebuggerRenderer;
import org.apache.poi.xdgf.usermodel.shape.ShapeRenderer;
import org.apache.poi.xdgf.util.Util;

public class VsdxToPng {

   public static void renderToPng(XDGFPage page, String outFilename, double scale, ShapeRenderer renderer) throws IOException {
      renderToPng(page, new File(outFilename), scale, renderer);
   }

   public static void renderToPngDir(XDGFPage page, File outDir, double scale, ShapeRenderer renderer) throws IOException {
      File pageFile = new File(outDir, "page" + page.getPageNumber() + "-" + Util.sanitizeFilename(page.getName()) + ".png");
      System.out.println("** Writing image to " + pageFile);
      renderToPng(page, pageFile, scale, renderer);
   }

   public static void renderToPng(XDGFPage page, File outFile, double scale, ShapeRenderer renderer) throws IOException {
      Dimension2dDouble sz = page.getPageSize();
      int width = (int)(scale * sz.getWidth());
      int height = (int)(scale * sz.getHeight());
      BufferedImage img = new BufferedImage(width, height, 1);
      Graphics2D graphics = img.createGraphics();
      graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
      graphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
      graphics.setColor(Color.black);
      graphics.setBackground(Color.white);
      graphics.clearRect(0, 0, width, height);
      graphics.translate(0, img.getHeight());
      graphics.scale(scale, -scale);
      renderer.setGraphics(graphics);
      page.getContent().visitShapes(renderer);
      graphics.dispose();
      FileOutputStream out = new FileOutputStream(outFile);
      ImageIO.write(img, "png", out);
      out.close();
   }

   public static void renderToPng(XmlVisioDocument document, String outDirname, double scale, ShapeRenderer renderer) throws IOException {
      File outDir = new File(outDirname);
      Iterator i$ = document.getPages().iterator();

      while(i$.hasNext()) {
         XDGFPage page = (XDGFPage)i$.next();
         renderToPngDir(page, outDir, scale, renderer);
      }

   }

   public static void main(String[] args) throws Exception {
      if(args.length > 2) {
         System.err.println("Usage: [--debug] in.vsdx outdir");
         System.exit(1);
      }

      Object renderer = new ShapeRenderer();
      String inFilename = args[0];
      String pngDir = args[1];
      if(args[0].equals("--debug")) {
         inFilename = args[1];
         pngDir = args[2];
         renderer = new ShapeDebuggerRenderer();
      }

      XmlVisioDocument doc = new XmlVisioDocument(new FileInputStream(inFilename));
      renderToPng(doc, pngDir, 181.8181818181818D, (ShapeRenderer)renderer);
   }
}
