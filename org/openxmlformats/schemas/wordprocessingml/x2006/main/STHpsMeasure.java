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

public interface STHpsMeasure extends STUnsignedDecimalNumber {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STHpsMeasure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sthpsmeasurec985type");



   public static final class Factory {

      public static STHpsMeasure newValue(Object var0) {
         return (STHpsMeasure)STHpsMeasure.type.newValue(var0);
      }

      public static STHpsMeasure newInstance() {
         return (STHpsMeasure)POIXMLTypeLoader.newInstance(STHpsMeasure.type, (XmlOptions)null);
      }

      public static STHpsMeasure newInstance(XmlOptions var0) {
         return (STHpsMeasure)POIXMLTypeLoader.newInstance(STHpsMeasure.type, var0);
      }

      public static STHpsMeasure parse(String var0) throws XmlException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, (XmlOptions)null);
      }

      public static STHpsMeasure parse(String var0, XmlOptions var1) throws XmlException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, var1);
      }

      public static STHpsMeasure parse(File var0) throws XmlException, IOException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, (XmlOptions)null);
      }

      public static STHpsMeasure parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, var1);
      }

      public static STHpsMeasure parse(URL var0) throws XmlException, IOException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, (XmlOptions)null);
      }

      public static STHpsMeasure parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, var1);
      }

      public static STHpsMeasure parse(InputStream var0) throws XmlException, IOException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, (XmlOptions)null);
      }

      public static STHpsMeasure parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, var1);
      }

      public static STHpsMeasure parse(Reader var0) throws XmlException, IOException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, (XmlOptions)null);
      }

      public static STHpsMeasure parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, var1);
      }

      public static STHpsMeasure parse(XMLStreamReader var0) throws XmlException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, (XmlOptions)null);
      }

      public static STHpsMeasure parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, var1);
      }

      public static STHpsMeasure parse(Node var0) throws XmlException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, (XmlOptions)null);
      }

      public static STHpsMeasure parse(Node var0, XmlOptions var1) throws XmlException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, var1);
      }

      public static STHpsMeasure parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, (XmlOptions)null);
      }

      public static STHpsMeasure parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STHpsMeasure)POIXMLTypeLoader.parse(var0, STHpsMeasure.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHpsMeasure.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHpsMeasure.type, var1);
      }

   }
}
