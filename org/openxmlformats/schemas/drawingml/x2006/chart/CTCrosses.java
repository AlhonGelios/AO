package org.openxmlformats.schemas.drawingml.x2006.chart;

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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.chart.STCrosses;
import org.w3c.dom.Node;

public interface CTCrosses extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCrosses.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcrossesbcb8type");


   STCrosses.Enum getVal();

   STCrosses xgetVal();

   void setVal(STCrosses.Enum var1);

   void xsetVal(STCrosses var1);


   public static final class Factory {

      public static CTCrosses newInstance() {
         return (CTCrosses)POIXMLTypeLoader.newInstance(CTCrosses.type, (XmlOptions)null);
      }

      public static CTCrosses newInstance(XmlOptions var0) {
         return (CTCrosses)POIXMLTypeLoader.newInstance(CTCrosses.type, var0);
      }

      public static CTCrosses parse(String var0) throws XmlException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, (XmlOptions)null);
      }

      public static CTCrosses parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, var1);
      }

      public static CTCrosses parse(File var0) throws XmlException, IOException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, (XmlOptions)null);
      }

      public static CTCrosses parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, var1);
      }

      public static CTCrosses parse(URL var0) throws XmlException, IOException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, (XmlOptions)null);
      }

      public static CTCrosses parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, var1);
      }

      public static CTCrosses parse(InputStream var0) throws XmlException, IOException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, (XmlOptions)null);
      }

      public static CTCrosses parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, var1);
      }

      public static CTCrosses parse(Reader var0) throws XmlException, IOException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, (XmlOptions)null);
      }

      public static CTCrosses parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, var1);
      }

      public static CTCrosses parse(XMLStreamReader var0) throws XmlException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, (XmlOptions)null);
      }

      public static CTCrosses parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, var1);
      }

      public static CTCrosses parse(Node var0) throws XmlException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, (XmlOptions)null);
      }

      public static CTCrosses parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, var1);
      }

      public static CTCrosses parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, (XmlOptions)null);
      }

      public static CTCrosses parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCrosses)POIXMLTypeLoader.parse(var0, CTCrosses.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCrosses.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCrosses.type, var1);
      }

   }
}
