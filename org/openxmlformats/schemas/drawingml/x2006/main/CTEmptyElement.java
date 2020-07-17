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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTEmptyElement extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTEmptyElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctemptyelement05catype");



   public static final class Factory {

      public static CTEmptyElement newInstance() {
         return (CTEmptyElement)POIXMLTypeLoader.newInstance(CTEmptyElement.type, (XmlOptions)null);
      }

      public static CTEmptyElement newInstance(XmlOptions var0) {
         return (CTEmptyElement)POIXMLTypeLoader.newInstance(CTEmptyElement.type, var0);
      }

      public static CTEmptyElement parse(String var0) throws XmlException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, (XmlOptions)null);
      }

      public static CTEmptyElement parse(String var0, XmlOptions var1) throws XmlException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, var1);
      }

      public static CTEmptyElement parse(File var0) throws XmlException, IOException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, (XmlOptions)null);
      }

      public static CTEmptyElement parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, var1);
      }

      public static CTEmptyElement parse(URL var0) throws XmlException, IOException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, (XmlOptions)null);
      }

      public static CTEmptyElement parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, var1);
      }

      public static CTEmptyElement parse(InputStream var0) throws XmlException, IOException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, (XmlOptions)null);
      }

      public static CTEmptyElement parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, var1);
      }

      public static CTEmptyElement parse(Reader var0) throws XmlException, IOException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, (XmlOptions)null);
      }

      public static CTEmptyElement parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, var1);
      }

      public static CTEmptyElement parse(XMLStreamReader var0) throws XmlException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, (XmlOptions)null);
      }

      public static CTEmptyElement parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, var1);
      }

      public static CTEmptyElement parse(Node var0) throws XmlException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, (XmlOptions)null);
      }

      public static CTEmptyElement parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, var1);
      }

      public static CTEmptyElement parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, (XmlOptions)null);
      }

      public static CTEmptyElement parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTEmptyElement)POIXMLTypeLoader.parse(var0, CTEmptyElement.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEmptyElement.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEmptyElement.type, var1);
      }

   }
}
