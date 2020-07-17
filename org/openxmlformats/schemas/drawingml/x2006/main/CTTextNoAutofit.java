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

public interface CTTextNoAutofit extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextNoAutofit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextnoautofit1045type");



   public static final class Factory {

      public static CTTextNoAutofit newInstance() {
         return (CTTextNoAutofit)POIXMLTypeLoader.newInstance(CTTextNoAutofit.type, (XmlOptions)null);
      }

      public static CTTextNoAutofit newInstance(XmlOptions var0) {
         return (CTTextNoAutofit)POIXMLTypeLoader.newInstance(CTTextNoAutofit.type, var0);
      }

      public static CTTextNoAutofit parse(String var0) throws XmlException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, (XmlOptions)null);
      }

      public static CTTextNoAutofit parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, var1);
      }

      public static CTTextNoAutofit parse(File var0) throws XmlException, IOException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, (XmlOptions)null);
      }

      public static CTTextNoAutofit parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, var1);
      }

      public static CTTextNoAutofit parse(URL var0) throws XmlException, IOException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, (XmlOptions)null);
      }

      public static CTTextNoAutofit parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, var1);
      }

      public static CTTextNoAutofit parse(InputStream var0) throws XmlException, IOException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, (XmlOptions)null);
      }

      public static CTTextNoAutofit parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, var1);
      }

      public static CTTextNoAutofit parse(Reader var0) throws XmlException, IOException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, (XmlOptions)null);
      }

      public static CTTextNoAutofit parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, var1);
      }

      public static CTTextNoAutofit parse(XMLStreamReader var0) throws XmlException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, (XmlOptions)null);
      }

      public static CTTextNoAutofit parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, var1);
      }

      public static CTTextNoAutofit parse(Node var0) throws XmlException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, (XmlOptions)null);
      }

      public static CTTextNoAutofit parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, var1);
      }

      public static CTTextNoAutofit parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, (XmlOptions)null);
      }

      public static CTTextNoAutofit parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextNoAutofit)POIXMLTypeLoader.parse(var0, CTTextNoAutofit.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextNoAutofit.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextNoAutofit.type, var1);
      }

   }
}
