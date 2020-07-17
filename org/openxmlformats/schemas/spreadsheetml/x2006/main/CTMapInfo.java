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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMap;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSchema;
import org.w3c.dom.Node;

public interface CTMapInfo extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTMapInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmapinfo1a09type");


   List getSchemaList();

   CTSchema[] getSchemaArray();

   CTSchema getSchemaArray(int var1);

   int sizeOfSchemaArray();

   void setSchemaArray(CTSchema[] var1);

   void setSchemaArray(int var1, CTSchema var2);

   CTSchema insertNewSchema(int var1);

   CTSchema addNewSchema();

   void removeSchema(int var1);

   List getMapList();

   CTMap[] getMapArray();

   CTMap getMapArray(int var1);

   int sizeOfMapArray();

   void setMapArray(CTMap[] var1);

   void setMapArray(int var1, CTMap var2);

   CTMap insertNewMap(int var1);

   CTMap addNewMap();

   void removeMap(int var1);

   String getSelectionNamespaces();

   XmlString xgetSelectionNamespaces();

   void setSelectionNamespaces(String var1);

   void xsetSelectionNamespaces(XmlString var1);


   public static final class Factory {

      public static CTMapInfo newInstance() {
         return (CTMapInfo)POIXMLTypeLoader.newInstance(CTMapInfo.type, (XmlOptions)null);
      }

      public static CTMapInfo newInstance(XmlOptions var0) {
         return (CTMapInfo)POIXMLTypeLoader.newInstance(CTMapInfo.type, var0);
      }

      public static CTMapInfo parse(String var0) throws XmlException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, (XmlOptions)null);
      }

      public static CTMapInfo parse(String var0, XmlOptions var1) throws XmlException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, var1);
      }

      public static CTMapInfo parse(File var0) throws XmlException, IOException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, (XmlOptions)null);
      }

      public static CTMapInfo parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, var1);
      }

      public static CTMapInfo parse(URL var0) throws XmlException, IOException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, (XmlOptions)null);
      }

      public static CTMapInfo parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, var1);
      }

      public static CTMapInfo parse(InputStream var0) throws XmlException, IOException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, (XmlOptions)null);
      }

      public static CTMapInfo parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, var1);
      }

      public static CTMapInfo parse(Reader var0) throws XmlException, IOException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, (XmlOptions)null);
      }

      public static CTMapInfo parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, var1);
      }

      public static CTMapInfo parse(XMLStreamReader var0) throws XmlException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, (XmlOptions)null);
      }

      public static CTMapInfo parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, var1);
      }

      public static CTMapInfo parse(Node var0) throws XmlException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, (XmlOptions)null);
      }

      public static CTMapInfo parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, var1);
      }

      public static CTMapInfo parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, (XmlOptions)null);
      }

      public static CTMapInfo parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTMapInfo)POIXMLTypeLoader.parse(var0, CTMapInfo.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMapInfo.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMapInfo.type, var1);
      }

   }
}
