package org.apache.poi.hssf.usermodel;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.poi.hssf.usermodel.FontDetails;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

final class StaticFontMetrics {

   private static final POILogger LOGGER = POILogFactory.getLogger(StaticFontMetrics.class);
   private static Properties fontMetricsProps;
   private static final Map fontDetailsMap = new HashMap();


   public static synchronized FontDetails getFontDetails(Font font) {
      if(fontMetricsProps == null) {
         try {
            fontMetricsProps = loadMetrics();
         } catch (IOException var6) {
            throw new RuntimeException("Could not load font metrics", var6);
         }
      }

      String fontName = font.getName();
      String fontStyle = "";
      if(font.isPlain()) {
         fontStyle = fontStyle + "plain";
      }

      if(font.isBold()) {
         fontStyle = fontStyle + "bold";
      }

      if(font.isItalic()) {
         fontStyle = fontStyle + "italic";
      }

      String fontHeight = FontDetails.buildFontHeightProperty(fontName);
      String styleHeight = FontDetails.buildFontHeightProperty(fontName + "." + fontStyle);
      if(fontMetricsProps.get(fontHeight) == null && fontMetricsProps.get(styleHeight) != null) {
         fontName = fontName + "." + fontStyle;
      }

      FontDetails fontDetails = (FontDetails)fontDetailsMap.get(fontName);
      if(fontDetails == null) {
         fontDetails = FontDetails.create(fontName, fontMetricsProps);
         fontDetailsMap.put(fontName, fontDetails);
      }

      return fontDetails;
   }

   private static Properties loadMetrics() throws IOException {
      File propFile = null;

      try {
         String metricsIn = System.getProperty("font.metrics.filename");
         if(metricsIn != null) {
            propFile = new File(metricsIn);
            if(!propFile.exists()) {
               LOGGER.log(5, new Object[]{"font_metrics.properties not found at path " + propFile.getAbsolutePath()});
               propFile = null;
            }
         }
      } catch (SecurityException var7) {
         LOGGER.log(5, new Object[]{"Can\'t access font.metrics.filename system property", var7});
      }

      Object metricsIn1 = null;

      Properties var3;
      try {
         if(propFile != null) {
            metricsIn1 = new FileInputStream(propFile);
         } else {
            metricsIn1 = FontDetails.class.getResourceAsStream("/font_metrics.properties");
            if(metricsIn1 == null) {
               String props1 = "font_metrics.properties not found in classpath";
               throw new IOException(props1);
            }
         }

         Properties props = new Properties();
         props.load((InputStream)metricsIn1);
         var3 = props;
      } finally {
         if(metricsIn1 != null) {
            ((InputStream)metricsIn1).close();
         }

      }

      return var3;
   }

}
