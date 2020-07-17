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

public interface CTPictureBase extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPictureBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpicturebase5f83type");



   public static final class Factory {

      public static CTPictureBase newInstance() {
         return (CTPictureBase)POIXMLTypeLoader.newInstance(CTPictureBase.type, (XmlOptions)null);
      }

      public static CTPictureBase newInstance(XmlOptions var0) {
         return (CTPictureBase)POIXMLTypeLoader.newInstance(CTPictureBase.type, var0);
      }

      public static CTPictureBase parse(String var0) throws XmlException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, (XmlOptions)null);
      }

      public static CTPictureBase parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, var1);
      }

      public static CTPictureBase parse(File var0) throws XmlException, IOException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, (XmlOptions)null);
      }

      public static CTPictureBase parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, var1);
      }

      public static CTPictureBase parse(URL var0) throws XmlException, IOException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, (XmlOptions)null);
      }

      public static CTPictureBase parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, var1);
      }

      public static CTPictureBase parse(InputStream var0) throws XmlException, IOException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, (XmlOptions)null);
      }

      public static CTPictureBase parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, var1);
      }

      public static CTPictureBase parse(Reader var0) throws XmlException, IOException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, (XmlOptions)null);
      }

      public static CTPictureBase parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, var1);
      }

      public static CTPictureBase parse(XMLStreamReader var0) throws XmlException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, (XmlOptions)null);
      }

      public static CTPictureBase parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, var1);
      }

      public static CTPictureBase parse(Node var0) throws XmlException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, (XmlOptions)null);
      }

      public static CTPictureBase parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, var1);
      }

      public static CTPictureBase parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, (XmlOptions)null);
      }

      public static CTPictureBase parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPictureBase)POIXMLTypeLoader.parse(var0, CTPictureBase.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPictureBase.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPictureBase.type, var1);
      }

   }
}
