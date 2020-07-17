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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUnsignedDecimalNumber;
import org.w3c.dom.Node;

public interface STTwipsMeasure extends STUnsignedDecimalNumber {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTwipsMeasure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttwipsmeasure1e23type");



   public static final class Factory {

      public static STTwipsMeasure newValue(Object var0) {
         return (STTwipsMeasure)STTwipsMeasure.type.newValue(var0);
      }

      public static STTwipsMeasure newInstance() {
         return (STTwipsMeasure)POIXMLTypeLoader.newInstance(STTwipsMeasure.type, (XmlOptions)null);
      }

      public static STTwipsMeasure newInstance(XmlOptions var0) {
         return (STTwipsMeasure)POIXMLTypeLoader.newInstance(STTwipsMeasure.type, var0);
      }

      public static STTwipsMeasure parse(String var0) throws XmlException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, (XmlOptions)null);
      }

      public static STTwipsMeasure parse(String var0, XmlOptions var1) throws XmlException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, var1);
      }

      public static STTwipsMeasure parse(File var0) throws XmlException, IOException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, (XmlOptions)null);
      }

      public static STTwipsMeasure parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, var1);
      }

      public static STTwipsMeasure parse(URL var0) throws XmlException, IOException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, (XmlOptions)null);
      }

      public static STTwipsMeasure parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, var1);
      }

      public static STTwipsMeasure parse(InputStream var0) throws XmlException, IOException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, (XmlOptions)null);
      }

      public static STTwipsMeasure parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, var1);
      }

      public static STTwipsMeasure parse(Reader var0) throws XmlException, IOException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, (XmlOptions)null);
      }

      public static STTwipsMeasure parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, var1);
      }

      public static STTwipsMeasure parse(XMLStreamReader var0) throws XmlException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, (XmlOptions)null);
      }

      public static STTwipsMeasure parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, var1);
      }

      public static STTwipsMeasure parse(Node var0) throws XmlException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, (XmlOptions)null);
      }

      public static STTwipsMeasure parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, var1);
      }

      public static STTwipsMeasure parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, (XmlOptions)null);
      }

      public static STTwipsMeasure parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTwipsMeasure)POIXMLTypeLoader.parse(var0, STTwipsMeasure.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTwipsMeasure.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTwipsMeasure.type, var1);
      }

   }
}
