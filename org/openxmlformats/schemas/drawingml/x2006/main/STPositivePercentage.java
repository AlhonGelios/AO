package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.w3c.dom.Node;

public interface STPositivePercentage extends STPercentage {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPositivePercentage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpositivepercentagedb9etype");



   public static final class Factory {

      public static STPositivePercentage newValue(Object var0) {
         return (STPositivePercentage)STPositivePercentage.type.newValue(var0);
      }

      public static STPositivePercentage newInstance() {
         return (STPositivePercentage)POIXMLTypeLoader.newInstance(STPositivePercentage.type, (XmlOptions)null);
      }

      public static STPositivePercentage newInstance(XmlOptions var0) {
         return (STPositivePercentage)POIXMLTypeLoader.newInstance(STPositivePercentage.type, var0);
      }

      public static STPositivePercentage parse(String var0) throws XmlException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, (XmlOptions)null);
      }

      public static STPositivePercentage parse(String var0, XmlOptions var1) throws XmlException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, var1);
      }

      public static STPositivePercentage parse(File var0) throws XmlException, IOException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, (XmlOptions)null);
      }

      public static STPositivePercentage parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, var1);
      }

      public static STPositivePercentage parse(URL var0) throws XmlException, IOException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, (XmlOptions)null);
      }

      public static STPositivePercentage parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, var1);
      }

      public static STPositivePercentage parse(InputStream var0) throws XmlException, IOException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, (XmlOptions)null);
      }

      public static STPositivePercentage parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, var1);
      }

      public static STPositivePercentage parse(Reader var0) throws XmlException, IOException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, (XmlOptions)null);
      }

      public static STPositivePercentage parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, var1);
      }

      public static STPositivePercentage parse(XMLStreamReader var0) throws XmlException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, (XmlOptions)null);
      }

      public static STPositivePercentage parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, var1);
      }

      public static STPositivePercentage parse(Node var0) throws XmlException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, (XmlOptions)null);
      }

      public static STPositivePercentage parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, var1);
      }

      public static STPositivePercentage parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, (XmlOptions)null);
      }

      public static STPositivePercentage parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPositivePercentage)POIXMLTypeLoader.parse(var0, STPositivePercentage.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPositivePercentage.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPositivePercentage.type, var1);
      }

   }
}
