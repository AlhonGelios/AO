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
import org.openxmlformats.schemas.drawingml.x2006.chart.STMarkerStyle;
import org.w3c.dom.Node;

public interface CTMarkerStyle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTMarkerStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmarkerstyle1f6ftype");


   STMarkerStyle.Enum getVal();

   STMarkerStyle xgetVal();

   void setVal(STMarkerStyle.Enum var1);

   void xsetVal(STMarkerStyle var1);


   public static final class Factory {

      public static CTMarkerStyle newInstance() {
         return (CTMarkerStyle)POIXMLTypeLoader.newInstance(CTMarkerStyle.type, (XmlOptions)null);
      }

      public static CTMarkerStyle newInstance(XmlOptions var0) {
         return (CTMarkerStyle)POIXMLTypeLoader.newInstance(CTMarkerStyle.type, var0);
      }

      public static CTMarkerStyle parse(String var0) throws XmlException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, (XmlOptions)null);
      }

      public static CTMarkerStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, var1);
      }

      public static CTMarkerStyle parse(File var0) throws XmlException, IOException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, (XmlOptions)null);
      }

      public static CTMarkerStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, var1);
      }

      public static CTMarkerStyle parse(URL var0) throws XmlException, IOException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, (XmlOptions)null);
      }

      public static CTMarkerStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, var1);
      }

      public static CTMarkerStyle parse(InputStream var0) throws XmlException, IOException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, (XmlOptions)null);
      }

      public static CTMarkerStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, var1);
      }

      public static CTMarkerStyle parse(Reader var0) throws XmlException, IOException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, (XmlOptions)null);
      }

      public static CTMarkerStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, var1);
      }

      public static CTMarkerStyle parse(XMLStreamReader var0) throws XmlException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, (XmlOptions)null);
      }

      public static CTMarkerStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, var1);
      }

      public static CTMarkerStyle parse(Node var0) throws XmlException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, (XmlOptions)null);
      }

      public static CTMarkerStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, var1);
      }

      public static CTMarkerStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, (XmlOptions)null);
      }

      public static CTMarkerStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTMarkerStyle)POIXMLTypeLoader.parse(var0, CTMarkerStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMarkerStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMarkerStyle.type, var1);
      }

   }
}
