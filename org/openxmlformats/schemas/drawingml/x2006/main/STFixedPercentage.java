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

public interface STFixedPercentage extends STPercentage {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STFixedPercentage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stfixedpercentagef0cftype");



   public static final class Factory {

      public static STFixedPercentage newValue(Object var0) {
         return (STFixedPercentage)STFixedPercentage.type.newValue(var0);
      }

      public static STFixedPercentage newInstance() {
         return (STFixedPercentage)POIXMLTypeLoader.newInstance(STFixedPercentage.type, (XmlOptions)null);
      }

      public static STFixedPercentage newInstance(XmlOptions var0) {
         return (STFixedPercentage)POIXMLTypeLoader.newInstance(STFixedPercentage.type, var0);
      }

      public static STFixedPercentage parse(String var0) throws XmlException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, (XmlOptions)null);
      }

      public static STFixedPercentage parse(String var0, XmlOptions var1) throws XmlException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, var1);
      }

      public static STFixedPercentage parse(File var0) throws XmlException, IOException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, (XmlOptions)null);
      }

      public static STFixedPercentage parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, var1);
      }

      public static STFixedPercentage parse(URL var0) throws XmlException, IOException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, (XmlOptions)null);
      }

      public static STFixedPercentage parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, var1);
      }

      public static STFixedPercentage parse(InputStream var0) throws XmlException, IOException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, (XmlOptions)null);
      }

      public static STFixedPercentage parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, var1);
      }

      public static STFixedPercentage parse(Reader var0) throws XmlException, IOException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, (XmlOptions)null);
      }

      public static STFixedPercentage parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, var1);
      }

      public static STFixedPercentage parse(XMLStreamReader var0) throws XmlException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, (XmlOptions)null);
      }

      public static STFixedPercentage parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, var1);
      }

      public static STFixedPercentage parse(Node var0) throws XmlException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, (XmlOptions)null);
      }

      public static STFixedPercentage parse(Node var0, XmlOptions var1) throws XmlException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, var1);
      }

      public static STFixedPercentage parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, (XmlOptions)null);
      }

      public static STFixedPercentage parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STFixedPercentage)POIXMLTypeLoader.parse(var0, STFixedPercentage.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFixedPercentage.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFixedPercentage.type, var1);
      }

   }
}
