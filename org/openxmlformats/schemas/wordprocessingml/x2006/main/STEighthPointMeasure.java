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

public interface STEighthPointMeasure extends STUnsignedDecimalNumber {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STEighthPointMeasure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("steighthpointmeasure3371type");



   public static final class Factory {

      public static STEighthPointMeasure newValue(Object var0) {
         return (STEighthPointMeasure)STEighthPointMeasure.type.newValue(var0);
      }

      public static STEighthPointMeasure newInstance() {
         return (STEighthPointMeasure)POIXMLTypeLoader.newInstance(STEighthPointMeasure.type, (XmlOptions)null);
      }

      public static STEighthPointMeasure newInstance(XmlOptions var0) {
         return (STEighthPointMeasure)POIXMLTypeLoader.newInstance(STEighthPointMeasure.type, var0);
      }

      public static STEighthPointMeasure parse(String var0) throws XmlException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, (XmlOptions)null);
      }

      public static STEighthPointMeasure parse(String var0, XmlOptions var1) throws XmlException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, var1);
      }

      public static STEighthPointMeasure parse(File var0) throws XmlException, IOException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, (XmlOptions)null);
      }

      public static STEighthPointMeasure parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, var1);
      }

      public static STEighthPointMeasure parse(URL var0) throws XmlException, IOException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, (XmlOptions)null);
      }

      public static STEighthPointMeasure parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, var1);
      }

      public static STEighthPointMeasure parse(InputStream var0) throws XmlException, IOException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, (XmlOptions)null);
      }

      public static STEighthPointMeasure parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, var1);
      }

      public static STEighthPointMeasure parse(Reader var0) throws XmlException, IOException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, (XmlOptions)null);
      }

      public static STEighthPointMeasure parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, var1);
      }

      public static STEighthPointMeasure parse(XMLStreamReader var0) throws XmlException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, (XmlOptions)null);
      }

      public static STEighthPointMeasure parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, var1);
      }

      public static STEighthPointMeasure parse(Node var0) throws XmlException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, (XmlOptions)null);
      }

      public static STEighthPointMeasure parse(Node var0, XmlOptions var1) throws XmlException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, var1);
      }

      public static STEighthPointMeasure parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, (XmlOptions)null);
      }

      public static STEighthPointMeasure parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STEighthPointMeasure)POIXMLTypeLoader.parse(var0, STEighthPointMeasure.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STEighthPointMeasure.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STEighthPointMeasure.type, var1);
      }

   }
}
