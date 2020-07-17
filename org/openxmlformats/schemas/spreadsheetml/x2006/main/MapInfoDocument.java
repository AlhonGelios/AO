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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMapInfo;
import org.w3c.dom.Node;

public interface MapInfoDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(MapInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("mapinfo5715doctype");


   CTMapInfo getMapInfo();

   void setMapInfo(CTMapInfo var1);

   CTMapInfo addNewMapInfo();


   public static final class Factory {

      public static MapInfoDocument newInstance() {
         return (MapInfoDocument)POIXMLTypeLoader.newInstance(MapInfoDocument.type, (XmlOptions)null);
      }

      public static MapInfoDocument newInstance(XmlOptions var0) {
         return (MapInfoDocument)POIXMLTypeLoader.newInstance(MapInfoDocument.type, var0);
      }

      public static MapInfoDocument parse(String var0) throws XmlException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, (XmlOptions)null);
      }

      public static MapInfoDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, var1);
      }

      public static MapInfoDocument parse(File var0) throws XmlException, IOException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, (XmlOptions)null);
      }

      public static MapInfoDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, var1);
      }

      public static MapInfoDocument parse(URL var0) throws XmlException, IOException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, (XmlOptions)null);
      }

      public static MapInfoDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, var1);
      }

      public static MapInfoDocument parse(InputStream var0) throws XmlException, IOException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, (XmlOptions)null);
      }

      public static MapInfoDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, var1);
      }

      public static MapInfoDocument parse(Reader var0) throws XmlException, IOException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, (XmlOptions)null);
      }

      public static MapInfoDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, var1);
      }

      public static MapInfoDocument parse(XMLStreamReader var0) throws XmlException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, (XmlOptions)null);
      }

      public static MapInfoDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, var1);
      }

      public static MapInfoDocument parse(Node var0) throws XmlException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, (XmlOptions)null);
      }

      public static MapInfoDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, var1);
      }

      public static MapInfoDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, (XmlOptions)null);
      }

      public static MapInfoDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (MapInfoDocument)POIXMLTypeLoader.parse(var0, MapInfoDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, MapInfoDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, MapInfoDocument.type, var1);
      }

   }
}
