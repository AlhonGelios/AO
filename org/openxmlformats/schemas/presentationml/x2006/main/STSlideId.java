package org.openxmlformats.schemas.presentationml.x2006.main;

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

public interface STSlideId extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSlideId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stslideida0b3type");



   public static final class Factory {

      public static STSlideId newValue(Object var0) {
         return (STSlideId)STSlideId.type.newValue(var0);
      }

      public static STSlideId newInstance() {
         return (STSlideId)POIXMLTypeLoader.newInstance(STSlideId.type, (XmlOptions)null);
      }

      public static STSlideId newInstance(XmlOptions var0) {
         return (STSlideId)POIXMLTypeLoader.newInstance(STSlideId.type, var0);
      }

      public static STSlideId parse(String var0) throws XmlException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, (XmlOptions)null);
      }

      public static STSlideId parse(String var0, XmlOptions var1) throws XmlException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, var1);
      }

      public static STSlideId parse(File var0) throws XmlException, IOException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, (XmlOptions)null);
      }

      public static STSlideId parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, var1);
      }

      public static STSlideId parse(URL var0) throws XmlException, IOException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, (XmlOptions)null);
      }

      public static STSlideId parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, var1);
      }

      public static STSlideId parse(InputStream var0) throws XmlException, IOException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, (XmlOptions)null);
      }

      public static STSlideId parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, var1);
      }

      public static STSlideId parse(Reader var0) throws XmlException, IOException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, (XmlOptions)null);
      }

      public static STSlideId parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, var1);
      }

      public static STSlideId parse(XMLStreamReader var0) throws XmlException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, (XmlOptions)null);
      }

      public static STSlideId parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, var1);
      }

      public static STSlideId parse(Node var0) throws XmlException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, (XmlOptions)null);
      }

      public static STSlideId parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, var1);
      }

      public static STSlideId parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, (XmlOptions)null);
      }

      public static STSlideId parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSlideId)POIXMLTypeLoader.parse(var0, STSlideId.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSlideId.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSlideId.type, var1);
      }

   }
}
