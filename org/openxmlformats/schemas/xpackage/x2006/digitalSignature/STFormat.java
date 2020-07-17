package org.openxmlformats.schemas.xpackage.x2006.digitalSignature;

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

public interface STFormat extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STFormat.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("stformat98d1type");



   public static final class Factory {

      public static STFormat newValue(Object var0) {
         return (STFormat)STFormat.type.newValue(var0);
      }

      public static STFormat newInstance() {
         return (STFormat)POIXMLTypeLoader.newInstance(STFormat.type, (XmlOptions)null);
      }

      public static STFormat newInstance(XmlOptions var0) {
         return (STFormat)POIXMLTypeLoader.newInstance(STFormat.type, var0);
      }

      public static STFormat parse(String var0) throws XmlException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, (XmlOptions)null);
      }

      public static STFormat parse(String var0, XmlOptions var1) throws XmlException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, var1);
      }

      public static STFormat parse(File var0) throws XmlException, IOException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, (XmlOptions)null);
      }

      public static STFormat parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, var1);
      }

      public static STFormat parse(URL var0) throws XmlException, IOException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, (XmlOptions)null);
      }

      public static STFormat parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, var1);
      }

      public static STFormat parse(InputStream var0) throws XmlException, IOException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, (XmlOptions)null);
      }

      public static STFormat parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, var1);
      }

      public static STFormat parse(Reader var0) throws XmlException, IOException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, (XmlOptions)null);
      }

      public static STFormat parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, var1);
      }

      public static STFormat parse(XMLStreamReader var0) throws XmlException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, (XmlOptions)null);
      }

      public static STFormat parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, var1);
      }

      public static STFormat parse(Node var0) throws XmlException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, (XmlOptions)null);
      }

      public static STFormat parse(Node var0, XmlOptions var1) throws XmlException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, var1);
      }

      public static STFormat parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, (XmlOptions)null);
      }

      public static STFormat parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STFormat)POIXMLTypeLoader.parse(var0, STFormat.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFormat.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFormat.type, var1);
      }

   }
}
