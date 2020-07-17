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

public interface CTGroupFillProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGroupFillProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgroupfillpropertiesec66type");



   public static final class Factory {

      public static CTGroupFillProperties newInstance() {
         return (CTGroupFillProperties)POIXMLTypeLoader.newInstance(CTGroupFillProperties.type, (XmlOptions)null);
      }

      public static CTGroupFillProperties newInstance(XmlOptions var0) {
         return (CTGroupFillProperties)POIXMLTypeLoader.newInstance(CTGroupFillProperties.type, var0);
      }

      public static CTGroupFillProperties parse(String var0) throws XmlException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, (XmlOptions)null);
      }

      public static CTGroupFillProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, var1);
      }

      public static CTGroupFillProperties parse(File var0) throws XmlException, IOException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, (XmlOptions)null);
      }

      public static CTGroupFillProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, var1);
      }

      public static CTGroupFillProperties parse(URL var0) throws XmlException, IOException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, (XmlOptions)null);
      }

      public static CTGroupFillProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, var1);
      }

      public static CTGroupFillProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, (XmlOptions)null);
      }

      public static CTGroupFillProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, var1);
      }

      public static CTGroupFillProperties parse(Reader var0) throws XmlException, IOException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, (XmlOptions)null);
      }

      public static CTGroupFillProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, var1);
      }

      public static CTGroupFillProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, (XmlOptions)null);
      }

      public static CTGroupFillProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, var1);
      }

      public static CTGroupFillProperties parse(Node var0) throws XmlException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, (XmlOptions)null);
      }

      public static CTGroupFillProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, var1);
      }

      public static CTGroupFillProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, (XmlOptions)null);
      }

      public static CTGroupFillProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGroupFillProperties)POIXMLTypeLoader.parse(var0, CTGroupFillProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroupFillProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroupFillProperties.type, var1);
      }

   }
}
