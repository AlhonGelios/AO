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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32;
import org.w3c.dom.Node;

public interface STSlideSizeCoordinate extends STPositiveCoordinate32 {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSlideSizeCoordinate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stslidesizecoordinate24b5type");



   public static final class Factory {

      public static STSlideSizeCoordinate newValue(Object var0) {
         return (STSlideSizeCoordinate)STSlideSizeCoordinate.type.newValue(var0);
      }

      public static STSlideSizeCoordinate newInstance() {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.newInstance(STSlideSizeCoordinate.type, (XmlOptions)null);
      }

      public static STSlideSizeCoordinate newInstance(XmlOptions var0) {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.newInstance(STSlideSizeCoordinate.type, var0);
      }

      public static STSlideSizeCoordinate parse(String var0) throws XmlException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, (XmlOptions)null);
      }

      public static STSlideSizeCoordinate parse(String var0, XmlOptions var1) throws XmlException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, var1);
      }

      public static STSlideSizeCoordinate parse(File var0) throws XmlException, IOException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, (XmlOptions)null);
      }

      public static STSlideSizeCoordinate parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, var1);
      }

      public static STSlideSizeCoordinate parse(URL var0) throws XmlException, IOException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, (XmlOptions)null);
      }

      public static STSlideSizeCoordinate parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, var1);
      }

      public static STSlideSizeCoordinate parse(InputStream var0) throws XmlException, IOException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, (XmlOptions)null);
      }

      public static STSlideSizeCoordinate parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, var1);
      }

      public static STSlideSizeCoordinate parse(Reader var0) throws XmlException, IOException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, (XmlOptions)null);
      }

      public static STSlideSizeCoordinate parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, var1);
      }

      public static STSlideSizeCoordinate parse(XMLStreamReader var0) throws XmlException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, (XmlOptions)null);
      }

      public static STSlideSizeCoordinate parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, var1);
      }

      public static STSlideSizeCoordinate parse(Node var0) throws XmlException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, (XmlOptions)null);
      }

      public static STSlideSizeCoordinate parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, var1);
      }

      public static STSlideSizeCoordinate parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, (XmlOptions)null);
      }

      public static STSlideSizeCoordinate parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSlideSizeCoordinate)POIXMLTypeLoader.parse(var0, STSlideSizeCoordinate.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSlideSizeCoordinate.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSlideSizeCoordinate.type, var1);
      }

   }
}
