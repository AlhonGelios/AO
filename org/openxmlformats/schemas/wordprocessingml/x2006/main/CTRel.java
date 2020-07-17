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
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.w3c.dom.Node;

public interface CTRel extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctrel4519type");


   String getId();

   STRelationshipId xgetId();

   void setId(String var1);

   void xsetId(STRelationshipId var1);


   public static final class Factory {

      public static CTRel newInstance() {
         return (CTRel)POIXMLTypeLoader.newInstance(CTRel.type, (XmlOptions)null);
      }

      public static CTRel newInstance(XmlOptions var0) {
         return (CTRel)POIXMLTypeLoader.newInstance(CTRel.type, var0);
      }

      public static CTRel parse(String var0) throws XmlException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, (XmlOptions)null);
      }

      public static CTRel parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, var1);
      }

      public static CTRel parse(File var0) throws XmlException, IOException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, (XmlOptions)null);
      }

      public static CTRel parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, var1);
      }

      public static CTRel parse(URL var0) throws XmlException, IOException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, (XmlOptions)null);
      }

      public static CTRel parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, var1);
      }

      public static CTRel parse(InputStream var0) throws XmlException, IOException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, (XmlOptions)null);
      }

      public static CTRel parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, var1);
      }

      public static CTRel parse(Reader var0) throws XmlException, IOException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, (XmlOptions)null);
      }

      public static CTRel parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, var1);
      }

      public static CTRel parse(XMLStreamReader var0) throws XmlException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, (XmlOptions)null);
      }

      public static CTRel parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, var1);
      }

      public static CTRel parse(Node var0) throws XmlException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, (XmlOptions)null);
      }

      public static CTRel parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, var1);
      }

      public static CTRel parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, (XmlOptions)null);
      }

      public static CTRel parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRel)POIXMLTypeLoader.parse(var0, CTRel.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRel.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRel.type, var1);
      }

   }
}
