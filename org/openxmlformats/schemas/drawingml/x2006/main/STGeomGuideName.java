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
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STGeomGuideName extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STGeomGuideName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stgeomguidename366ctype");



   public static final class Factory {

      public static STGeomGuideName newValue(Object var0) {
         return (STGeomGuideName)STGeomGuideName.type.newValue(var0);
      }

      public static STGeomGuideName newInstance() {
         return (STGeomGuideName)POIXMLTypeLoader.newInstance(STGeomGuideName.type, (XmlOptions)null);
      }

      public static STGeomGuideName newInstance(XmlOptions var0) {
         return (STGeomGuideName)POIXMLTypeLoader.newInstance(STGeomGuideName.type, var0);
      }

      public static STGeomGuideName parse(String var0) throws XmlException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, (XmlOptions)null);
      }

      public static STGeomGuideName parse(String var0, XmlOptions var1) throws XmlException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, var1);
      }

      public static STGeomGuideName parse(File var0) throws XmlException, IOException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, (XmlOptions)null);
      }

      public static STGeomGuideName parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, var1);
      }

      public static STGeomGuideName parse(URL var0) throws XmlException, IOException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, (XmlOptions)null);
      }

      public static STGeomGuideName parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, var1);
      }

      public static STGeomGuideName parse(InputStream var0) throws XmlException, IOException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, (XmlOptions)null);
      }

      public static STGeomGuideName parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, var1);
      }

      public static STGeomGuideName parse(Reader var0) throws XmlException, IOException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, (XmlOptions)null);
      }

      public static STGeomGuideName parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, var1);
      }

      public static STGeomGuideName parse(XMLStreamReader var0) throws XmlException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, (XmlOptions)null);
      }

      public static STGeomGuideName parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, var1);
      }

      public static STGeomGuideName parse(Node var0) throws XmlException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, (XmlOptions)null);
      }

      public static STGeomGuideName parse(Node var0, XmlOptions var1) throws XmlException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, var1);
      }

      public static STGeomGuideName parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, (XmlOptions)null);
      }

      public static STGeomGuideName parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STGeomGuideName)POIXMLTypeLoader.parse(var0, STGeomGuideName.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STGeomGuideName.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STGeomGuideName.type, var1);
      }

   }
}
