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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.chart.STXstring;
import org.w3c.dom.Node;

public interface CTStrVal extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTStrVal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstrval86cctype");


   String getV();

   STXstring xgetV();

   void setV(String var1);

   void xsetV(STXstring var1);

   long getIdx();

   XmlUnsignedInt xgetIdx();

   void setIdx(long var1);

   void xsetIdx(XmlUnsignedInt var1);


   public static final class Factory {

      public static CTStrVal newInstance() {
         return (CTStrVal)POIXMLTypeLoader.newInstance(CTStrVal.type, (XmlOptions)null);
      }

      public static CTStrVal newInstance(XmlOptions var0) {
         return (CTStrVal)POIXMLTypeLoader.newInstance(CTStrVal.type, var0);
      }

      public static CTStrVal parse(String var0) throws XmlException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, (XmlOptions)null);
      }

      public static CTStrVal parse(String var0, XmlOptions var1) throws XmlException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, var1);
      }

      public static CTStrVal parse(File var0) throws XmlException, IOException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, (XmlOptions)null);
      }

      public static CTStrVal parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, var1);
      }

      public static CTStrVal parse(URL var0) throws XmlException, IOException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, (XmlOptions)null);
      }

      public static CTStrVal parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, var1);
      }

      public static CTStrVal parse(InputStream var0) throws XmlException, IOException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, (XmlOptions)null);
      }

      public static CTStrVal parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, var1);
      }

      public static CTStrVal parse(Reader var0) throws XmlException, IOException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, (XmlOptions)null);
      }

      public static CTStrVal parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, var1);
      }

      public static CTStrVal parse(XMLStreamReader var0) throws XmlException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, (XmlOptions)null);
      }

      public static CTStrVal parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, var1);
      }

      public static CTStrVal parse(Node var0) throws XmlException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, (XmlOptions)null);
      }

      public static CTStrVal parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, var1);
      }

      public static CTStrVal parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, (XmlOptions)null);
      }

      public static CTStrVal parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTStrVal)POIXMLTypeLoader.parse(var0, CTStrVal.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStrVal.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStrVal.type, var1);
      }

   }
}
