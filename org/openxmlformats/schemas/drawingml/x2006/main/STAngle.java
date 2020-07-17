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

public interface STAngle extends XmlInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STAngle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stangle8074type");



   public static final class Factory {

      public static STAngle newValue(Object var0) {
         return (STAngle)STAngle.type.newValue(var0);
      }

      public static STAngle newInstance() {
         return (STAngle)POIXMLTypeLoader.newInstance(STAngle.type, (XmlOptions)null);
      }

      public static STAngle newInstance(XmlOptions var0) {
         return (STAngle)POIXMLTypeLoader.newInstance(STAngle.type, var0);
      }

      public static STAngle parse(String var0) throws XmlException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, (XmlOptions)null);
      }

      public static STAngle parse(String var0, XmlOptions var1) throws XmlException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, var1);
      }

      public static STAngle parse(File var0) throws XmlException, IOException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, (XmlOptions)null);
      }

      public static STAngle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, var1);
      }

      public static STAngle parse(URL var0) throws XmlException, IOException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, (XmlOptions)null);
      }

      public static STAngle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, var1);
      }

      public static STAngle parse(InputStream var0) throws XmlException, IOException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, (XmlOptions)null);
      }

      public static STAngle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, var1);
      }

      public static STAngle parse(Reader var0) throws XmlException, IOException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, (XmlOptions)null);
      }

      public static STAngle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, var1);
      }

      public static STAngle parse(XMLStreamReader var0) throws XmlException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, (XmlOptions)null);
      }

      public static STAngle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, var1);
      }

      public static STAngle parse(Node var0) throws XmlException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, (XmlOptions)null);
      }

      public static STAngle parse(Node var0, XmlOptions var1) throws XmlException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, var1);
      }

      public static STAngle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, (XmlOptions)null);
      }

      public static STAngle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STAngle)POIXMLTypeLoader.parse(var0, STAngle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAngle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STAngle.type, var1);
      }

   }
}
