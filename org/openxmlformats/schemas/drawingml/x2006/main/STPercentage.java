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
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STPercentage extends XmlInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPercentage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpercentage0a85type");



   public static final class Factory {

      public static STPercentage newValue(Object var0) {
         return (STPercentage)STPercentage.type.newValue(var0);
      }

      public static STPercentage newInstance() {
         return (STPercentage)POIXMLTypeLoader.newInstance(STPercentage.type, (XmlOptions)null);
      }

      public static STPercentage newInstance(XmlOptions var0) {
         return (STPercentage)POIXMLTypeLoader.newInstance(STPercentage.type, var0);
      }

      public static STPercentage parse(String var0) throws XmlException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, (XmlOptions)null);
      }

      public static STPercentage parse(String var0, XmlOptions var1) throws XmlException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, var1);
      }

      public static STPercentage parse(File var0) throws XmlException, IOException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, (XmlOptions)null);
      }

      public static STPercentage parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, var1);
      }

      public static STPercentage parse(URL var0) throws XmlException, IOException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, (XmlOptions)null);
      }

      public static STPercentage parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, var1);
      }

      public static STPercentage parse(InputStream var0) throws XmlException, IOException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, (XmlOptions)null);
      }

      public static STPercentage parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, var1);
      }

      public static STPercentage parse(Reader var0) throws XmlException, IOException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, (XmlOptions)null);
      }

      public static STPercentage parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, var1);
      }

      public static STPercentage parse(XMLStreamReader var0) throws XmlException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, (XmlOptions)null);
      }

      public static STPercentage parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, var1);
      }

      public static STPercentage parse(Node var0) throws XmlException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, (XmlOptions)null);
      }

      public static STPercentage parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, var1);
      }

      public static STPercentage parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, (XmlOptions)null);
      }

      public static STPercentage parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPercentage)POIXMLTypeLoader.parse(var0, STPercentage.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPercentage.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPercentage.type, var1);
      }

   }
}
