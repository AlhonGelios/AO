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
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STDecimalNumber extends XmlInteger {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STDecimalNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stdecimalnumber8d28type");



   public static final class Factory {

      public static STDecimalNumber newValue(Object var0) {
         return (STDecimalNumber)STDecimalNumber.type.newValue(var0);
      }

      public static STDecimalNumber newInstance() {
         return (STDecimalNumber)POIXMLTypeLoader.newInstance(STDecimalNumber.type, (XmlOptions)null);
      }

      public static STDecimalNumber newInstance(XmlOptions var0) {
         return (STDecimalNumber)POIXMLTypeLoader.newInstance(STDecimalNumber.type, var0);
      }

      public static STDecimalNumber parse(String var0) throws XmlException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, (XmlOptions)null);
      }

      public static STDecimalNumber parse(String var0, XmlOptions var1) throws XmlException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, var1);
      }

      public static STDecimalNumber parse(File var0) throws XmlException, IOException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, (XmlOptions)null);
      }

      public static STDecimalNumber parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, var1);
      }

      public static STDecimalNumber parse(URL var0) throws XmlException, IOException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, (XmlOptions)null);
      }

      public static STDecimalNumber parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, var1);
      }

      public static STDecimalNumber parse(InputStream var0) throws XmlException, IOException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, (XmlOptions)null);
      }

      public static STDecimalNumber parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, var1);
      }

      public static STDecimalNumber parse(Reader var0) throws XmlException, IOException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, (XmlOptions)null);
      }

      public static STDecimalNumber parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, var1);
      }

      public static STDecimalNumber parse(XMLStreamReader var0) throws XmlException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, (XmlOptions)null);
      }

      public static STDecimalNumber parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, var1);
      }

      public static STDecimalNumber parse(Node var0) throws XmlException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, (XmlOptions)null);
      }

      public static STDecimalNumber parse(Node var0, XmlOptions var1) throws XmlException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, var1);
      }

      public static STDecimalNumber parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, (XmlOptions)null);
      }

      public static STDecimalNumber parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STDecimalNumber)POIXMLTypeLoader.parse(var0, STDecimalNumber.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDecimalNumber.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STDecimalNumber.type, var1);
      }

   }
}
