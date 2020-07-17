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

public interface CTNoFillProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNoFillProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnofillpropertiesbf92type");



   public static final class Factory {

      public static CTNoFillProperties newInstance() {
         return (CTNoFillProperties)POIXMLTypeLoader.newInstance(CTNoFillProperties.type, (XmlOptions)null);
      }

      public static CTNoFillProperties newInstance(XmlOptions var0) {
         return (CTNoFillProperties)POIXMLTypeLoader.newInstance(CTNoFillProperties.type, var0);
      }

      public static CTNoFillProperties parse(String var0) throws XmlException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, (XmlOptions)null);
      }

      public static CTNoFillProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, var1);
      }

      public static CTNoFillProperties parse(File var0) throws XmlException, IOException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, (XmlOptions)null);
      }

      public static CTNoFillProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, var1);
      }

      public static CTNoFillProperties parse(URL var0) throws XmlException, IOException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, (XmlOptions)null);
      }

      public static CTNoFillProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, var1);
      }

      public static CTNoFillProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, (XmlOptions)null);
      }

      public static CTNoFillProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, var1);
      }

      public static CTNoFillProperties parse(Reader var0) throws XmlException, IOException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, (XmlOptions)null);
      }

      public static CTNoFillProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, var1);
      }

      public static CTNoFillProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, (XmlOptions)null);
      }

      public static CTNoFillProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, var1);
      }

      public static CTNoFillProperties parse(Node var0) throws XmlException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, (XmlOptions)null);
      }

      public static CTNoFillProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, var1);
      }

      public static CTNoFillProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, (XmlOptions)null);
      }

      public static CTNoFillProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNoFillProperties)POIXMLTypeLoader.parse(var0, CTNoFillProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNoFillProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNoFillProperties.type, var1);
      }

   }
}
