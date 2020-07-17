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

public interface STSignedHpsMeasure extends XmlInteger {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSignedHpsMeasure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stsignedhpsmeasure8e89type");



   public static final class Factory {

      public static STSignedHpsMeasure newValue(Object var0) {
         return (STSignedHpsMeasure)STSignedHpsMeasure.type.newValue(var0);
      }

      public static STSignedHpsMeasure newInstance() {
         return (STSignedHpsMeasure)POIXMLTypeLoader.newInstance(STSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static STSignedHpsMeasure newInstance(XmlOptions var0) {
         return (STSignedHpsMeasure)POIXMLTypeLoader.newInstance(STSignedHpsMeasure.type, var0);
      }

      public static STSignedHpsMeasure parse(String var0) throws XmlException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static STSignedHpsMeasure parse(String var0, XmlOptions var1) throws XmlException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, var1);
      }

      public static STSignedHpsMeasure parse(File var0) throws XmlException, IOException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static STSignedHpsMeasure parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, var1);
      }

      public static STSignedHpsMeasure parse(URL var0) throws XmlException, IOException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static STSignedHpsMeasure parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, var1);
      }

      public static STSignedHpsMeasure parse(InputStream var0) throws XmlException, IOException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static STSignedHpsMeasure parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, var1);
      }

      public static STSignedHpsMeasure parse(Reader var0) throws XmlException, IOException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static STSignedHpsMeasure parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, var1);
      }

      public static STSignedHpsMeasure parse(XMLStreamReader var0) throws XmlException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static STSignedHpsMeasure parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, var1);
      }

      public static STSignedHpsMeasure parse(Node var0) throws XmlException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static STSignedHpsMeasure parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, var1);
      }

      public static STSignedHpsMeasure parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static STSignedHpsMeasure parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSignedHpsMeasure)POIXMLTypeLoader.parse(var0, STSignedHpsMeasure.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSignedHpsMeasure.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSignedHpsMeasure.type, var1);
      }

   }
}
