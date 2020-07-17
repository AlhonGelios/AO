package org.apache.poi.xslf.util;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import javax.imageio.ImageIO;
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.sl.usermodel.Slide;
import org.apache.poi.sl.usermodel.SlideShow;
import org.apache.poi.sl.usermodel.SlideShowFactory;

public class PPTX2PNG {

   static void usage(String error) {
      String msg = "Usage: PPTX2PNG [options] <ppt or pptx file>\n" + (error == null?"":"Error: " + error + "\n") + "Options:\n" + "    -scale <float>   scale factor\n" + "    -slide <integer> 1-based index of a slide to render\n" + "    -format <type>   png,gif,jpg (,null for testing)" + "    -outdir <dir>    output directory, defaults to origin of the ppt/pptx file" + "    -quiet           do not write to console (for normal processing)";
      System.out.println(msg);
   }

   public static void main(String[] args) throws Exception {
      if(args.length == 0) {
         usage((String)null);
      } else {
         String slidenumStr = "-1";
         float scale = 1.0F;
         File file = null;
         String format = "png";
         File outdir = null;
         boolean quiet = false;

         for(int ss = 0; ss < args.length; ++ss) {
            if(args[ss].startsWith("-")) {
               if("-scale".equals(args[ss])) {
                  ++ss;
                  scale = Float.parseFloat(args[ss]);
               } else if("-slide".equals(args[ss])) {
                  ++ss;
                  slidenumStr = args[ss];
               } else if("-format".equals(args[ss])) {
                  ++ss;
                  format = args[ss];
               } else if("-outdir".equals(args[ss])) {
                  File var10000 = new File;
                  ++ss;
                  var10000.<init>(args[ss]);
                  outdir = var10000;
               } else if("-quiet".equals(args[ss])) {
                  quiet = true;
               }
            } else {
               file = new File(args[ss]);
            }
         }

         if(file != null && file.exists()) {
            if(format != null && format.matches("^(png|gif|jpg|null)$")) {
               if(outdir == null) {
                  outdir = file.getParentFile();
               }

               if(!"null".equals(format) && (outdir == null || !outdir.exists() || !outdir.isDirectory())) {
                  usage("Output directory doesn\'t exist");
               } else if(scale < 0.0F) {
                  usage("Invalid scale given");
               } else {
                  if(!quiet) {
                     System.out.println("Processing " + file);
                  }

                  SlideShow var24 = SlideShowFactory.create(file, (String)null, true);

                  label210: {
                     try {
                        List slides = var24.getSlides();
                        Set slidenum = slideIndexes(slides.size(), slidenumStr);
                        if(!slidenum.isEmpty()) {
                           Dimension pgsize = var24.getPageSize();
                           int width = (int)((float)pgsize.width * scale);
                           int height = (int)((float)pgsize.height * scale);
                           Iterator i$ = slidenum.iterator();

                           while(true) {
                              if(!i$.hasNext()) {
                                 break label210;
                              }

                              Integer slideNo = (Integer)i$.next();
                              Slide slide = (Slide)slides.get(slideNo.intValue());
                              String title = slide.getTitle();
                              if(!quiet) {
                                 System.out.println("Rendering slide " + slideNo + (title == null?"":": " + title));
                              }

                              BufferedImage img = new BufferedImage(width, height, 2);
                              Graphics2D graphics = img.createGraphics();
                              DrawFactory.getInstance(graphics).fixFonts(graphics);
                              graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                              graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                              graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
                              graphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                              graphics.scale((double)scale, (double)scale);
                              slide.draw(graphics);
                              if(!"null".equals(format)) {
                                 String outname = file.getName().replaceFirst(".pptx?", "");
                                 outname = String.format(Locale.ROOT, "%1$s-%2$04d.%3$s", new Object[]{outname, slideNo, format});
                                 File outfile = new File(outdir, outname);
                                 ImageIO.write(img, format, outfile);
                              }

                              graphics.dispose();
                              img.flush();
                           }
                        }

                        usage("slidenum must be either -1 (for all) or within range: [1.." + slides.size() + "] for " + file);
                     } finally {
                        var24.close();
                     }

                     return;
                  }

                  if(!quiet) {
                     System.out.println("Done");
                  }

               }
            } else {
               usage("Invalid format given");
            }
         } else {
            usage("File not specified or it doesn\'t exist");
         }
      }
   }

   private static Set slideIndexes(int slideCount, String range) {
      TreeSet slideIdx = new TreeSet();
      if("-1".equals(range)) {
         for(int arr$ = 0; arr$ < slideCount; ++arr$) {
            slideIdx.add(Integer.valueOf(arr$));
         }
      } else {
         String[] var12 = range.split(",");
         int len$ = var12.length;

         label53:
         for(int i$ = 0; i$ < len$; ++i$) {
            String subrange = var12[i$];
            String[] idx = subrange.split("-");
            int startIdx;
            int endIdx;
            int i;
            switch(idx.length) {
            case 0:
            default:
               break;
            case 1:
               startIdx = Integer.parseInt(idx[0]);
               if(subrange.contains("-")) {
                  endIdx = subrange.startsWith("-")?0:startIdx;
                  i = subrange.endsWith("-")?slideCount:Math.min(startIdx, slideCount);
                  int i1 = Math.max(endIdx, 1);

                  while(true) {
                     if(i1 >= i) {
                        continue label53;
                     }

                     slideIdx.add(Integer.valueOf(i1 - 1));
                     ++i1;
                  }
               } else {
                  slideIdx.add(Integer.valueOf(Math.max(startIdx, 1) - 1));
                  break;
               }
            case 2:
               startIdx = Math.min(Integer.parseInt(idx[0]), slideCount);
               endIdx = Math.min(Integer.parseInt(idx[1]), slideCount);

               for(i = Math.max(startIdx, 1); i < endIdx; ++i) {
                  slideIdx.add(Integer.valueOf(i - 1));
               }
            }
         }
      }

      return slideIdx;
   }
}
