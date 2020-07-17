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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STRef extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stref90a2type");



   public static final class Factory {

      public static STRef newValue(Object var0) {
         return (STRef)STRef.type.newValue(var0);
      }

      public static STRef newInstance() {
         return (STRef)POIXMLTypeLoader.newInstance(STRef.type, (XmlOptions)null);
      }

      public static STRef newInstance(XmlOptions var0) {
         return (STRef)POIXMLTypeLoader.newInstance(STRef.type, var0);
      }

      public static STRef parse(String var0) throws XmlException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, (XmlOptions)null);
      }

      public static STRef parse(String var0, XmlOptions var1) throws XmlException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, var1);
      }

      public static STRef parse(File var0) throws XmlException, IOException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, (XmlOptions)null);
      }

      public static STRef parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, var1);
      }

      public static STRef parse(URL var0) throws XmlException, IOException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, (XmlOptions)null);
      }

      public static STRef parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, var1);
      }

      public static STRef parse(InputStream var0) throws XmlException, IOException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, (XmlOptions)null);
      }

      public static STRef parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, var1);
      }

      public static STRef parse(Reader var0) throws XmlException, IOException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, (XmlOptions)null);
      }

      public static STRef parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, var1);
      }

      public static STRef parse(XMLStreamReader var0) throws XmlException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, (XmlOptions)null);
      }

      public static STRef parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, var1);
      }

      public static STRef parse(Node var0) throws XmlException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, (XmlOptions)null);
      }

      public static STRef parse(Node var0, XmlOptions var1) throws XmlException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, var1);
      }

      public static STRef parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, (XmlOptions)null);
      }

      public static STRef parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STRef)POIXMLTypeLoader.parse(var0, STRef.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STRef.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STRef.type, var1);
      }

   }
}
