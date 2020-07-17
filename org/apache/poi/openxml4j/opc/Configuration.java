package org.apache.poi.openxml4j.opc;

import java.io.File;

public final class Configuration {

   private static String pathForXmlSchema = System.getProperty("user.dir") + File.separator + "src" + File.separator + "schemas";


   public static String getPathForXmlSchema() {
      return pathForXmlSchema;
   }

   public static void setPathForXmlSchema(String pathForXmlSchema) {
      pathForXmlSchema = pathForXmlSchema;
   }

}
