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

public interface STSignedTwipsMeasure extends XmlInteger {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSignedTwipsMeasure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stsignedtwipsmeasureb227type");



   public static final class Factory {

      public static STSignedTwipsMeasure newValue(Object var0) {
         return (STSignedTwipsMeasure)STSignedTwipsMeasure.type.newValue(var0);
      }

      public static STSignedTwipsMeasure newInstance() {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.newInstance(STSignedTwipsMeasure.type, (XmlOptions)null);
      }

      public static STSignedTwipsMeasure newInstance(XmlOptions var0) {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.newInstance(STSignedTwipsMeasure.type, var0);
      }

      public static STSignedTwipsMeasure parse(String var0) throws XmlException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, (XmlOptions)null);
      }

      public static STSignedTwipsMeasure parse(String var0, XmlOptions var1) throws XmlException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, var1);
      }

      public static STSignedTwipsMeasure parse(File var0) throws XmlException, IOException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, (XmlOptions)null);
      }

      public static STSignedTwipsMeasure parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, var1);
      }

      public static STSignedTwipsMeasure parse(URL var0) throws XmlException, IOException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, (XmlOptions)null);
      }

      public static STSignedTwipsMeasure parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, var1);
      }

      public static STSignedTwipsMeasure parse(InputStream var0) throws XmlException, IOException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, (XmlOptions)null);
      }

      public static STSignedTwipsMeasure parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, var1);
      }

      public static STSignedTwipsMeasure parse(Reader var0) throws XmlException, IOException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, (XmlOptions)null);
      }

      public static STSignedTwipsMeasure parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, var1);
      }

      public static STSignedTwipsMeasure parse(XMLStreamReader var0) throws XmlException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, (XmlOptions)null);
      }

      public static STSignedTwipsMeasure parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, var1);
      }

      public static STSignedTwipsMeasure parse(Node var0) throws XmlException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, (XmlOptions)null);
      }

      public static STSignedTwipsMeasure parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, var1);
      }

      public static STSignedTwipsMeasure parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, (XmlOptions)null);
      }

      public static STSignedTwipsMeasure parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSignedTwipsMeasure)POIXMLTypeLoader.parse(var0, STSignedTwipsMeasure.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSignedTwipsMeasure.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSignedTwipsMeasure.type, var1);
      }

   }
}
