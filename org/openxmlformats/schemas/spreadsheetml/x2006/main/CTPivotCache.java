package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.w3c.dom.Node;

public interface CTPivotCache extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPivotCache.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpivotcache4de9type");


   long getCacheId();

   XmlUnsignedInt xgetCacheId();

   void setCacheId(long var1);

   void xsetCacheId(XmlUnsignedInt var1);

   String getId();

   STRelationshipId xgetId();

   void setId(String var1);

   void xsetId(STRelationshipId var1);


   public static final class Factory {

      public static CTPivotCache newInstance() {
         return (CTPivotCache)POIXMLTypeLoader.newInstance(CTPivotCache.type, (XmlOptions)null);
      }

      public static CTPivotCache newInstance(XmlOptions var0) {
         return (CTPivotCache)POIXMLTypeLoader.newInstance(CTPivotCache.type, var0);
      }

      public static CTPivotCache parse(String var0) throws XmlException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, (XmlOptions)null);
      }

      public static CTPivotCache parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, var1);
      }

      public static CTPivotCache parse(File var0) throws XmlException, IOException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, (XmlOptions)null);
      }

      public static CTPivotCache parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, var1);
      }

      public static CTPivotCache parse(URL var0) throws XmlException, IOException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, (XmlOptions)null);
      }

      public static CTPivotCache parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, var1);
      }

      public static CTPivotCache parse(InputStream var0) throws XmlException, IOException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, (XmlOptions)null);
      }

      public static CTPivotCache parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, var1);
      }

      public static CTPivotCache parse(Reader var0) throws XmlException, IOException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, (XmlOptions)null);
      }

      public static CTPivotCache parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, var1);
      }

      public static CTPivotCache parse(XMLStreamReader var0) throws XmlException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, (XmlOptions)null);
      }

      public static CTPivotCache parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, var1);
      }

      public static CTPivotCache parse(Node var0) throws XmlException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, (XmlOptions)null);
      }

      public static CTPivotCache parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, var1);
      }

      public static CTPivotCache parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, (XmlOptions)null);
      }

      public static CTPivotCache parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPivotCache)POIXMLTypeLoader.parse(var0, CTPivotCache.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotCache.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotCache.type, var1);
      }

   }
}
