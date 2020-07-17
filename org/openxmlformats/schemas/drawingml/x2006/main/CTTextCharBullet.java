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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTTextCharBullet extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextCharBullet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextcharbullet3c20type");


   String getChar();

   XmlString xgetChar();

   void setChar(String var1);

   void xsetChar(XmlString var1);


   public static final class Factory {

      public static CTTextCharBullet newInstance() {
         return (CTTextCharBullet)POIXMLTypeLoader.newInstance(CTTextCharBullet.type, (XmlOptions)null);
      }

      public static CTTextCharBullet newInstance(XmlOptions var0) {
         return (CTTextCharBullet)POIXMLTypeLoader.newInstance(CTTextCharBullet.type, var0);
      }

      public static CTTextCharBullet parse(String var0) throws XmlException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, (XmlOptions)null);
      }

      public static CTTextCharBullet parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, var1);
      }

      public static CTTextCharBullet parse(File var0) throws XmlException, IOException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, (XmlOptions)null);
      }

      public static CTTextCharBullet parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, var1);
      }

      public static CTTextCharBullet parse(URL var0) throws XmlException, IOException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, (XmlOptions)null);
      }

      public static CTTextCharBullet parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, var1);
      }

      public static CTTextCharBullet parse(InputStream var0) throws XmlException, IOException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, (XmlOptions)null);
      }

      public static CTTextCharBullet parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, var1);
      }

      public static CTTextCharBullet parse(Reader var0) throws XmlException, IOException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, (XmlOptions)null);
      }

      public static CTTextCharBullet parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, var1);
      }

      public static CTTextCharBullet parse(XMLStreamReader var0) throws XmlException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, (XmlOptions)null);
      }

      public static CTTextCharBullet parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, var1);
      }

      public static CTTextCharBullet parse(Node var0) throws XmlException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, (XmlOptions)null);
      }

      public static CTTextCharBullet parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, var1);
      }

      public static CTTextCharBullet parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, (XmlOptions)null);
      }

      public static CTTextCharBullet parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextCharBullet)POIXMLTypeLoader.parse(var0, CTTextCharBullet.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextCharBullet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextCharBullet.type, var1);
      }

   }
}
