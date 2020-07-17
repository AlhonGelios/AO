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

public interface STValue extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("stvalueb6e1type");



   public static final class Factory {

      public static STValue newValue(Object var0) {
         return (STValue)STValue.type.newValue(var0);
      }

      public static STValue newInstance() {
         return (STValue)POIXMLTypeLoader.newInstance(STValue.type, (XmlOptions)null);
      }

      public static STValue newInstance(XmlOptions var0) {
         return (STValue)POIXMLTypeLoader.newInstance(STValue.type, var0);
      }

      public static STValue parse(String var0) throws XmlException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, (XmlOptions)null);
      }

      public static STValue parse(String var0, XmlOptions var1) throws XmlException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, var1);
      }

      public static STValue parse(File var0) throws XmlException, IOException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, (XmlOptions)null);
      }

      public static STValue parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, var1);
      }

      public static STValue parse(URL var0) throws XmlException, IOException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, (XmlOptions)null);
      }

      public static STValue parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, var1);
      }

      public static STValue parse(InputStream var0) throws XmlException, IOException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, (XmlOptions)null);
      }

      public static STValue parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, var1);
      }

      public static STValue parse(Reader var0) throws XmlException, IOException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, (XmlOptions)null);
      }

      public static STValue parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, var1);
      }

      public static STValue parse(XMLStreamReader var0) throws XmlException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, (XmlOptions)null);
      }

      public static STValue parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, var1);
      }

      public static STValue parse(Node var0) throws XmlException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, (XmlOptions)null);
      }

      public static STValue parse(Node var0, XmlOptions var1) throws XmlException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, var1);
      }

      public static STValue parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, (XmlOptions)null);
      }

      public static STValue parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STValue)POIXMLTypeLoader.parse(var0, STValue.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STValue.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STValue.type, var1);
      }

   }
}
