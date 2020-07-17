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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedLong;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STUnsignedDecimalNumber extends XmlUnsignedLong {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STUnsignedDecimalNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stunsigneddecimalnumber74fdtype");



   public static final class Factory {

      public static STUnsignedDecimalNumber newValue(Object var0) {
         return (STUnsignedDecimalNumber)STUnsignedDecimalNumber.type.newValue(var0);
      }

      public static STUnsignedDecimalNumber newInstance() {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.newInstance(STUnsignedDecimalNumber.type, (XmlOptions)null);
      }

      public static STUnsignedDecimalNumber newInstance(XmlOptions var0) {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.newInstance(STUnsignedDecimalNumber.type, var0);
      }

      public static STUnsignedDecimalNumber parse(String var0) throws XmlException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, (XmlOptions)null);
      }

      public static STUnsignedDecimalNumber parse(String var0, XmlOptions var1) throws XmlException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, var1);
      }

      public static STUnsignedDecimalNumber parse(File var0) throws XmlException, IOException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, (XmlOptions)null);
      }

      public static STUnsignedDecimalNumber parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, var1);
      }

      public static STUnsignedDecimalNumber parse(URL var0) throws XmlException, IOException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, (XmlOptions)null);
      }

      public static STUnsignedDecimalNumber parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, var1);
      }

      public static STUnsignedDecimalNumber parse(InputStream var0) throws XmlException, IOException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, (XmlOptions)null);
      }

      public static STUnsignedDecimalNumber parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, var1);
      }

      public static STUnsignedDecimalNumber parse(Reader var0) throws XmlException, IOException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, (XmlOptions)null);
      }

      public static STUnsignedDecimalNumber parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, var1);
      }

      public static STUnsignedDecimalNumber parse(XMLStreamReader var0) throws XmlException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, (XmlOptions)null);
      }

      public static STUnsignedDecimalNumber parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, var1);
      }

      public static STUnsignedDecimalNumber parse(Node var0) throws XmlException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, (XmlOptions)null);
      }

      public static STUnsignedDecimalNumber parse(Node var0, XmlOptions var1) throws XmlException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, var1);
      }

      public static STUnsignedDecimalNumber parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, (XmlOptions)null);
      }

      public static STUnsignedDecimalNumber parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STUnsignedDecimalNumber)POIXMLTypeLoader.parse(var0, STUnsignedDecimalNumber.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STUnsignedDecimalNumber.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STUnsignedDecimalNumber.type, var1);
      }

   }
}
