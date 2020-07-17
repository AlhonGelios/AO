package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;

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

public interface STClsid extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STClsid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stclsida7datype");



   public static final class Factory {

      public static STClsid newValue(Object var0) {
         return (STClsid)STClsid.type.newValue(var0);
      }

      public static STClsid newInstance() {
         return (STClsid)POIXMLTypeLoader.newInstance(STClsid.type, (XmlOptions)null);
      }

      public static STClsid newInstance(XmlOptions var0) {
         return (STClsid)POIXMLTypeLoader.newInstance(STClsid.type, var0);
      }

      public static STClsid parse(String var0) throws XmlException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, (XmlOptions)null);
      }

      public static STClsid parse(String var0, XmlOptions var1) throws XmlException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, var1);
      }

      public static STClsid parse(File var0) throws XmlException, IOException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, (XmlOptions)null);
      }

      public static STClsid parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, var1);
      }

      public static STClsid parse(URL var0) throws XmlException, IOException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, (XmlOptions)null);
      }

      public static STClsid parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, var1);
      }

      public static STClsid parse(InputStream var0) throws XmlException, IOException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, (XmlOptions)null);
      }

      public static STClsid parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, var1);
      }

      public static STClsid parse(Reader var0) throws XmlException, IOException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, (XmlOptions)null);
      }

      public static STClsid parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, var1);
      }

      public static STClsid parse(XMLStreamReader var0) throws XmlException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, (XmlOptions)null);
      }

      public static STClsid parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, var1);
      }

      public static STClsid parse(Node var0) throws XmlException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, (XmlOptions)null);
      }

      public static STClsid parse(Node var0, XmlOptions var1) throws XmlException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, var1);
      }

      public static STClsid parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, (XmlOptions)null);
      }

      public static STClsid parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STClsid)POIXMLTypeLoader.parse(var0, STClsid.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STClsid.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STClsid.type, var1);
      }

   }
}
