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

public interface STDxfId extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STDxfId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stdxfid9fdctype");



   public static final class Factory {

      public static STDxfId newValue(Object var0) {
         return (STDxfId)STDxfId.type.newValue(var0);
      }

      public static STDxfId newInstance() {
         return (STDxfId)POIXMLTypeLoader.newInstance(STDxfId.type, (XmlOptions)null);
      }

      public static STDxfId newInstance(XmlOptions var0) {
         return (STDxfId)POIXMLTypeLoader.newInstance(STDxfId.type, var0);
      }

      public static STDxfId parse(String var0) throws XmlException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, (XmlOptions)null);
      }

      public static STDxfId parse(String var0, XmlOptions var1) throws XmlException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, var1);
      }

      public static STDxfId parse(File var0) throws XmlException, IOException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, (XmlOptions)null);
      }

      public static STDxfId parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, var1);
      }

      public static STDxfId parse(URL var0) throws XmlException, IOException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, (XmlOptions)null);
      }

      public static STDxfId parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, var1);
      }

      public static STDxfId parse(InputStream var0) throws XmlException, IOException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, (XmlOptions)null);
      }

      public static STDxfId parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, var1);
      }

      public static STDxfId parse(Reader var0) throws XmlException, IOException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, (XmlOptions)null);
      }

      public static STDxfId parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, var1);
      }

      public static STDxfId parse(XMLStreamReader var0) throws XmlException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, (XmlOptions)null);
      }

      public static STDxfId parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, var1);
      }

      public static STDxfId parse(Node var0) throws XmlException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, (XmlOptions)null);
      }

      public static STDxfId parse(Node var0, XmlOptions var1) throws XmlException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, var1);
      }

      public static STDxfId parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, (XmlOptions)null);
      }

      public static STDxfId parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STDxfId)POIXMLTypeLoader.parse(var0, STDxfId.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDxfId.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDxfId.type, var1);
      }

   }
}
