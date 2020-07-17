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
import org.openxmlformats.schemas.drawingml.x2006.main.STAngle;
import org.w3c.dom.Node;

public interface STPositiveFixedAngle extends STAngle {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPositiveFixedAngle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpositivefixedangle2503type");



   public static final class Factory {

      public static STPositiveFixedAngle newValue(Object var0) {
         return (STPositiveFixedAngle)STPositiveFixedAngle.type.newValue(var0);
      }

      public static STPositiveFixedAngle newInstance() {
         return (STPositiveFixedAngle)POIXMLTypeLoader.newInstance(STPositiveFixedAngle.type, (XmlOptions)null);
      }

      public static STPositiveFixedAngle newInstance(XmlOptions var0) {
         return (STPositiveFixedAngle)POIXMLTypeLoader.newInstance(STPositiveFixedAngle.type, var0);
      }

      public static STPositiveFixedAngle parse(String var0) throws XmlException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, (XmlOptions)null);
      }

      public static STPositiveFixedAngle parse(String var0, XmlOptions var1) throws XmlException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, var1);
      }

      public static STPositiveFixedAngle parse(File var0) throws XmlException, IOException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, (XmlOptions)null);
      }

      public static STPositiveFixedAngle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, var1);
      }

      public static STPositiveFixedAngle parse(URL var0) throws XmlException, IOException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, (XmlOptions)null);
      }

      public static STPositiveFixedAngle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, var1);
      }

      public static STPositiveFixedAngle parse(InputStream var0) throws XmlException, IOException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, (XmlOptions)null);
      }

      public static STPositiveFixedAngle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, var1);
      }

      public static STPositiveFixedAngle parse(Reader var0) throws XmlException, IOException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, (XmlOptions)null);
      }

      public static STPositiveFixedAngle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, var1);
      }

      public static STPositiveFixedAngle parse(XMLStreamReader var0) throws XmlException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, (XmlOptions)null);
      }

      public static STPositiveFixedAngle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, var1);
      }

      public static STPositiveFixedAngle parse(Node var0) throws XmlException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, (XmlOptions)null);
      }

      public static STPositiveFixedAngle parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, var1);
      }

      public static STPositiveFixedAngle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, (XmlOptions)null);
      }

      public static STPositiveFixedAngle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPositiveFixedAngle)POIXMLTypeLoader.parse(var0, STPositiveFixedAngle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPositiveFixedAngle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPositiveFixedAngle.type, var1);
      }

   }
}
