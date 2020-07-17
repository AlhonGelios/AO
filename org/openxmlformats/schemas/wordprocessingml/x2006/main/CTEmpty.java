package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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

public interface CTEmpty extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTEmpty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctempty3fa5type");



   public static final class Factory {

      public static CTEmpty newInstance() {
         return (CTEmpty)POIXMLTypeLoader.newInstance(CTEmpty.type, (XmlOptions)null);
      }

      public static CTEmpty newInstance(XmlOptions var0) {
         return (CTEmpty)POIXMLTypeLoader.newInstance(CTEmpty.type, var0);
      }

      public static CTEmpty parse(String var0) throws XmlException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, (XmlOptions)null);
      }

      public static CTEmpty parse(String var0, XmlOptions var1) throws XmlException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, var1);
      }

      public static CTEmpty parse(File var0) throws XmlException, IOException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, (XmlOptions)null);
      }

      public static CTEmpty parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, var1);
      }

      public static CTEmpty parse(URL var0) throws XmlException, IOException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, (XmlOptions)null);
      }

      public static CTEmpty parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, var1);
      }

      public static CTEmpty parse(InputStream var0) throws XmlException, IOException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, (XmlOptions)null);
      }

      public static CTEmpty parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, var1);
      }

      public static CTEmpty parse(Reader var0) throws XmlException, IOException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, (XmlOptions)null);
      }

      public static CTEmpty parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, var1);
      }

      public static CTEmpty parse(XMLStreamReader var0) throws XmlException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, (XmlOptions)null);
      }

      public static CTEmpty parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, var1);
      }

      public static CTEmpty parse(Node var0) throws XmlException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, (XmlOptions)null);
      }

      public static CTEmpty parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, var1);
      }

      public static CTEmpty parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, (XmlOptions)null);
      }

      public static CTEmpty parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTEmpty)POIXMLTypeLoader.parse(var0, CTEmpty.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEmpty.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEmpty.type, var1);
      }

   }
}
