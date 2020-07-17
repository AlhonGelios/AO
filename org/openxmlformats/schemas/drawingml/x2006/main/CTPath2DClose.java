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

public interface CTPath2DClose extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPath2DClose.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpath2dclose09f2type");



   public static final class Factory {

      public static CTPath2DClose newInstance() {
         return (CTPath2DClose)POIXMLTypeLoader.newInstance(CTPath2DClose.type, (XmlOptions)null);
      }

      public static CTPath2DClose newInstance(XmlOptions var0) {
         return (CTPath2DClose)POIXMLTypeLoader.newInstance(CTPath2DClose.type, var0);
      }

      public static CTPath2DClose parse(String var0) throws XmlException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, (XmlOptions)null);
      }

      public static CTPath2DClose parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, var1);
      }

      public static CTPath2DClose parse(File var0) throws XmlException, IOException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, (XmlOptions)null);
      }

      public static CTPath2DClose parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, var1);
      }

      public static CTPath2DClose parse(URL var0) throws XmlException, IOException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, (XmlOptions)null);
      }

      public static CTPath2DClose parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, var1);
      }

      public static CTPath2DClose parse(InputStream var0) throws XmlException, IOException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, (XmlOptions)null);
      }

      public static CTPath2DClose parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, var1);
      }

      public static CTPath2DClose parse(Reader var0) throws XmlException, IOException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, (XmlOptions)null);
      }

      public static CTPath2DClose parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, var1);
      }

      public static CTPath2DClose parse(XMLStreamReader var0) throws XmlException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, (XmlOptions)null);
      }

      public static CTPath2DClose parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, var1);
      }

      public static CTPath2DClose parse(Node var0) throws XmlException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, (XmlOptions)null);
      }

      public static CTPath2DClose parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, var1);
      }

      public static CTPath2DClose parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, (XmlOptions)null);
      }

      public static CTPath2DClose parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPath2DClose)POIXMLTypeLoader.parse(var0, CTPath2DClose.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath2DClose.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPath2DClose.type, var1);
      }

   }
}
