package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCache;
import org.w3c.dom.Node;

public interface CTPivotCaches extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPivotCaches.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpivotcaches4f32type");


   List getPivotCacheList();

   CTPivotCache[] getPivotCacheArray();

   CTPivotCache getPivotCacheArray(int var1);

   int sizeOfPivotCacheArray();

   void setPivotCacheArray(CTPivotCache[] var1);

   void setPivotCacheArray(int var1, CTPivotCache var2);

   CTPivotCache insertNewPivotCache(int var1);

   CTPivotCache addNewPivotCache();

   void removePivotCache(int var1);


   public static final class Factory {

      public static CTPivotCaches newInstance() {
         return (CTPivotCaches)POIXMLTypeLoader.newInstance(CTPivotCaches.type, (XmlOptions)null);
      }

      public static CTPivotCaches newInstance(XmlOptions var0) {
         return (CTPivotCaches)POIXMLTypeLoader.newInstance(CTPivotCaches.type, var0);
      }

      public static CTPivotCaches parse(String var0) throws XmlException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, (XmlOptions)null);
      }

      public static CTPivotCaches parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, var1);
      }

      public static CTPivotCaches parse(File var0) throws XmlException, IOException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, (XmlOptions)null);
      }

      public static CTPivotCaches parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, var1);
      }

      public static CTPivotCaches parse(URL var0) throws XmlException, IOException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, (XmlOptions)null);
      }

      public static CTPivotCaches parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, var1);
      }

      public static CTPivotCaches parse(InputStream var0) throws XmlException, IOException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, (XmlOptions)null);
      }

      public static CTPivotCaches parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, var1);
      }

      public static CTPivotCaches parse(Reader var0) throws XmlException, IOException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, (XmlOptions)null);
      }

      public static CTPivotCaches parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, var1);
      }

      public static CTPivotCaches parse(XMLStreamReader var0) throws XmlException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, (XmlOptions)null);
      }

      public static CTPivotCaches parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, var1);
      }

      public static CTPivotCaches parse(Node var0) throws XmlException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, (XmlOptions)null);
      }

      public static CTPivotCaches parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, var1);
      }

      public static CTPivotCaches parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, (XmlOptions)null);
      }

      public static CTPivotCaches parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPivotCaches)POIXMLTypeLoader.parse(var0, CTPivotCaches.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotCaches.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotCaches.type, var1);
      }

   }
}
