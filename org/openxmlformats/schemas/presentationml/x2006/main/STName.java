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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STName extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stnameadaatype");



   public static final class Factory {

      public static STName newValue(Object var0) {
         return (STName)STName.type.newValue(var0);
      }

      public static STName newInstance() {
         return (STName)POIXMLTypeLoader.newInstance(STName.type, (XmlOptions)null);
      }

      public static STName newInstance(XmlOptions var0) {
         return (STName)POIXMLTypeLoader.newInstance(STName.type, var0);
      }

      public static STName parse(String var0) throws XmlException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, (XmlOptions)null);
      }

      public static STName parse(String var0, XmlOptions var1) throws XmlException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, var1);
      }

      public static STName parse(File var0) throws XmlException, IOException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, (XmlOptions)null);
      }

      public static STName parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, var1);
      }

      public static STName parse(URL var0) throws XmlException, IOException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, (XmlOptions)null);
      }

      public static STName parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, var1);
      }

      public static STName parse(InputStream var0) throws XmlException, IOException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, (XmlOptions)null);
      }

      public static STName parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, var1);
      }

      public static STName parse(Reader var0) throws XmlException, IOException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, (XmlOptions)null);
      }

      public static STName parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, var1);
      }

      public static STName parse(XMLStreamReader var0) throws XmlException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, (XmlOptions)null);
      }

      public static STName parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, var1);
      }

      public static STName parse(Node var0) throws XmlException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, (XmlOptions)null);
      }

      public static STName parse(Node var0, XmlOptions var1) throws XmlException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, var1);
      }

      public static STName parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, (XmlOptions)null);
      }

      public static STName parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STName)POIXMLTypeLoader.parse(var0, STName.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STName.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STName.type, var1);
      }

   }
}
