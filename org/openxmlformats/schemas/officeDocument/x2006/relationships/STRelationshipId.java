package org.openxmlformats.schemas.officeDocument.x2006.relationships;

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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STRelationshipId extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STRelationshipId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("strelationshipid1e94type");



   public static final class Factory {

      public static STRelationshipId newValue(Object var0) {
         return (STRelationshipId)STRelationshipId.type.newValue(var0);
      }

      public static STRelationshipId newInstance() {
         return (STRelationshipId)POIXMLTypeLoader.newInstance(STRelationshipId.type, (XmlOptions)null);
      }

      public static STRelationshipId newInstance(XmlOptions var0) {
         return (STRelationshipId)POIXMLTypeLoader.newInstance(STRelationshipId.type, var0);
      }

      public static STRelationshipId parse(String var0) throws XmlException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, (XmlOptions)null);
      }

      public static STRelationshipId parse(String var0, XmlOptions var1) throws XmlException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, var1);
      }

      public static STRelationshipId parse(File var0) throws XmlException, IOException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, (XmlOptions)null);
      }

      public static STRelationshipId parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, var1);
      }

      public static STRelationshipId parse(URL var0) throws XmlException, IOException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, (XmlOptions)null);
      }

      public static STRelationshipId parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, var1);
      }

      public static STRelationshipId parse(InputStream var0) throws XmlException, IOException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, (XmlOptions)null);
      }

      public static STRelationshipId parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, var1);
      }

      public static STRelationshipId parse(Reader var0) throws XmlException, IOException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, (XmlOptions)null);
      }

      public static STRelationshipId parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, var1);
      }

      public static STRelationshipId parse(XMLStreamReader var0) throws XmlException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, (XmlOptions)null);
      }

      public static STRelationshipId parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, var1);
      }

      public static STRelationshipId parse(Node var0) throws XmlException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, (XmlOptions)null);
      }

      public static STRelationshipId parse(Node var0, XmlOptions var1) throws XmlException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, var1);
      }

      public static STRelationshipId parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, (XmlOptions)null);
      }

      public static STRelationshipId parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STRelationshipId)POIXMLTypeLoader.parse(var0, STRelationshipId.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STRelationshipId.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STRelationshipId.type, var1);
      }

   }
}
