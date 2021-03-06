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
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.w3c.dom.Node;

public interface CTLegacyDrawing extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLegacyDrawing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlegacydrawing49f4type");


   String getId();

   STRelationshipId xgetId();

   void setId(String var1);

   void xsetId(STRelationshipId var1);


   public static final class Factory {

      public static CTLegacyDrawing newInstance() {
         return (CTLegacyDrawing)POIXMLTypeLoader.newInstance(CTLegacyDrawing.type, (XmlOptions)null);
      }

      public static CTLegacyDrawing newInstance(XmlOptions var0) {
         return (CTLegacyDrawing)POIXMLTypeLoader.newInstance(CTLegacyDrawing.type, var0);
      }

      public static CTLegacyDrawing parse(String var0) throws XmlException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, (XmlOptions)null);
      }

      public static CTLegacyDrawing parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, var1);
      }

      public static CTLegacyDrawing parse(File var0) throws XmlException, IOException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, (XmlOptions)null);
      }

      public static CTLegacyDrawing parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, var1);
      }

      public static CTLegacyDrawing parse(URL var0) throws XmlException, IOException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, (XmlOptions)null);
      }

      public static CTLegacyDrawing parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, var1);
      }

      public static CTLegacyDrawing parse(InputStream var0) throws XmlException, IOException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, (XmlOptions)null);
      }

      public static CTLegacyDrawing parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, var1);
      }

      public static CTLegacyDrawing parse(Reader var0) throws XmlException, IOException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, (XmlOptions)null);
      }

      public static CTLegacyDrawing parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, var1);
      }

      public static CTLegacyDrawing parse(XMLStreamReader var0) throws XmlException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, (XmlOptions)null);
      }

      public static CTLegacyDrawing parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, var1);
      }

      public static CTLegacyDrawing parse(Node var0) throws XmlException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, (XmlOptions)null);
      }

      public static CTLegacyDrawing parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, var1);
      }

      public static CTLegacyDrawing parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, (XmlOptions)null);
      }

      public static CTLegacyDrawing parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLegacyDrawing)POIXMLTypeLoader.parse(var0, CTLegacyDrawing.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLegacyDrawing.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLegacyDrawing.type, var1);
      }

   }
}
