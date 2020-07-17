package org.apache.poi.util;

import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public final class XMLHelper {

   private static POILogger logger = POILogFactory.getLogger(XMLHelper.class);


   public static DocumentBuilderFactory getDocumentBuilderFactory() {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setExpandEntityReferences(false);
      trySetSAXFeature(factory, "http://javax.xml.XMLConstants/feature/secure-processing", true);
      trySetSAXFeature(factory, "http://xml.org/sax/features/external-general-entities", false);
      trySetSAXFeature(factory, "http://xml.org/sax/features/external-parameter-entities", false);
      trySetSAXFeature(factory, "http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
      trySetSAXFeature(factory, "http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
      return factory;
   }

   private static void trySetSAXFeature(DocumentBuilderFactory documentBuilderFactory, String feature, boolean enabled) {
      try {
         documentBuilderFactory.setFeature(feature, enabled);
      } catch (Exception var4) {
         logger.log(5, new Object[]{"SAX Feature unsupported", feature, var4});
      } catch (AbstractMethodError var5) {
         logger.log(5, new Object[]{"Cannot set SAX feature because outdated XML parser in classpath", feature, var5});
      }

   }

}
