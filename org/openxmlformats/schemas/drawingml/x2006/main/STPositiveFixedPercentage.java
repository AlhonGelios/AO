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

public interface STPositiveFixedPercentage extends STPercentage {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPositiveFixedPercentage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpositivefixedpercentagee756type");



   public static final class Factory {

      public static STPositiveFixedPercentage newValue(Object var0) {
         return (STPositiveFixedPercentage)STPositiveFixedPercentage.type.newValue(var0);
      }

      public static STPositiveFixedPercentage newInstance() {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.newInstance(STPositiveFixedPercentage.type, (XmlOptions)null);
      }

      public static STPositiveFixedPercentage newInstance(XmlOptions var0) {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.newInstance(STPositiveFixedPercentage.type, var0);
      }

      public static STPositiveFixedPercentage parse(String var0) throws XmlException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, (XmlOptions)null);
      }

      public static STPositiveFixedPercentage parse(String var0, XmlOptions var1) throws XmlException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, var1);
      }

      public static STPositiveFixedPercentage parse(File var0) throws XmlException, IOException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, (XmlOptions)null);
      }

      public static STPositiveFixedPercentage parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, var1);
      }

      public static STPositiveFixedPercentage parse(URL var0) throws XmlException, IOException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, (XmlOptions)null);
      }

      public static STPositiveFixedPercentage parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, var1);
      }

      public static STPositiveFixedPercentage parse(InputStream var0) throws XmlException, IOException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, (XmlOptions)null);
      }

      public static STPositiveFixedPercentage parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, var1);
      }

      public static STPositiveFixedPercentage parse(Reader var0) throws XmlException, IOException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, (XmlOptions)null);
      }

      public static STPositiveFixedPercentage parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, var1);
      }

      public static STPositiveFixedPercentage parse(XMLStreamReader var0) throws XmlException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, (XmlOptions)null);
      }

      public static STPositiveFixedPercentage parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, var1);
      }

      public static STPositiveFixedPercentage parse(Node var0) throws XmlException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, (XmlOptions)null);
      }

      public static STPositiveFixedPercentage parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, var1);
      }

      public static STPositiveFixedPercentage parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, (XmlOptions)null);
      }

      public static STPositiveFixedPercentage parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPositiveFixedPercentage)POIXMLTypeLoader.parse(var0, STPositiveFixedPercentage.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPositiveFixedPercentage.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPositiveFixedPercentage.type, var1);
      }

   }
}
