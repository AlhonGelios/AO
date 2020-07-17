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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STBorderId extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STBorderId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stborderid1a80type");



   public static final class Factory {

      public static STBorderId newValue(Object var0) {
         return (STBorderId)STBorderId.type.newValue(var0);
      }

      public static STBorderId newInstance() {
         return (STBorderId)POIXMLTypeLoader.newInstance(STBorderId.type, (XmlOptions)null);
      }

      public static STBorderId newInstance(XmlOptions var0) {
         return (STBorderId)POIXMLTypeLoader.newInstance(STBorderId.type, var0);
      }

      public static STBorderId parse(String var0) throws XmlException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, (XmlOptions)null);
      }

      public static STBorderId parse(String var0, XmlOptions var1) throws XmlException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, var1);
      }

      public static STBorderId parse(File var0) throws XmlException, IOException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, (XmlOptions)null);
      }

      public static STBorderId parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, var1);
      }

      public static STBorderId parse(URL var0) throws XmlException, IOException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, (XmlOptions)null);
      }

      public static STBorderId parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, var1);
      }

      public static STBorderId parse(InputStream var0) throws XmlException, IOException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, (XmlOptions)null);
      }

      public static STBorderId parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, var1);
      }

      public static STBorderId parse(Reader var0) throws XmlException, IOException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, (XmlOptions)null);
      }

      public static STBorderId parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, var1);
      }

      public static STBorderId parse(XMLStreamReader var0) throws XmlException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, (XmlOptions)null);
      }

      public static STBorderId parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, var1);
      }

      public static STBorderId parse(Node var0) throws XmlException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, (XmlOptions)null);
      }

      public static STBorderId parse(Node var0, XmlOptions var1) throws XmlException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, var1);
      }

      public static STBorderId parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, (XmlOptions)null);
      }

      public static STBorderId parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STBorderId)POIXMLTypeLoader.parse(var0, STBorderId.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBorderId.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBorderId.type, var1);
      }

   }
}
