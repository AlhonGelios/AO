package org.apache.poi.util;

import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class Configurator {

   private static POILogger logger = POILogFactory.getLogger(Configurator.class);


   public static int getIntValue(String systemProperty, int defaultValue) {
      int result = defaultValue;
      String property = System.getProperty(systemProperty);

      try {
         result = Integer.parseInt(property);
      } catch (Exception var5) {
         logger.log(7, (Object)("System property -D" + systemProperty + " do not contains a valid integer " + property));
      }

      return result;
   }

}
