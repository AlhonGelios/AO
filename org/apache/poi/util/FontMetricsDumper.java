package org.apache.poi.util;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.util.SuppressForbidden;

public class FontMetricsDumper {

   @SuppressForbidden("command line tool")
   public static void main(String[] args) throws IOException {
      Properties props = new Properties();
      Font[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();

      for(int fileOut = 0; fileOut < allFonts.length; ++fileOut) {
         String fontName = allFonts[fileOut].getFontName();
         Font font = new Font(fontName, 1, 10);
         FontMetrics fontMetrics = Toolkit.getDefaultToolkit().getFontMetrics(font);
         int fontHeight = fontMetrics.getHeight();
         props.setProperty("font." + fontName + ".height", fontHeight + "");
         StringBuffer characters = new StringBuffer();

         char widths;
         for(widths = 97; widths <= 122; ++widths) {
            characters.append(widths + ", ");
         }

         for(widths = 65; widths <= 90; ++widths) {
            characters.append(widths + ", ");
         }

         for(widths = 48; widths <= 57; ++widths) {
            characters.append(widths + ", ");
         }

         StringBuffer var15 = new StringBuffer();

         char c;
         for(c = 97; c <= 122; ++c) {
            var15.append(fontMetrics.getWidths()[c] + ", ");
         }

         for(c = 65; c <= 90; ++c) {
            var15.append(fontMetrics.getWidths()[c] + ", ");
         }

         for(c = 48; c <= 57; ++c) {
            var15.append(fontMetrics.getWidths()[c] + ", ");
         }

         props.setProperty("font." + fontName + ".characters", characters.toString());
         props.setProperty("font." + fontName + ".widths", var15.toString());
      }

      FileOutputStream var14 = new FileOutputStream("font_metrics.properties");

      try {
         props.store(var14, "Font Metrics");
      } finally {
         var14.close();
      }

   }
}
