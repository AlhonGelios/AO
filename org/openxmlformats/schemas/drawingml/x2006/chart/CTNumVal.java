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

public interface CTNumVal extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNumVal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnumval2fe1type");


   String getV();

   STXstring xgetV();

   void setV(String var1);

   void xsetV(STXstring var1);

   long getIdx();

   XmlUnsignedInt xgetIdx();

   void setIdx(long var1);

   void xsetIdx(XmlUnsignedInt var1);

   String getFormatCode();

   STXstring xgetFormatCode();

   boolean isSetFormatCode();

   void setFormatCode(String var1);

   void xsetFormatCode(STXstring var1);

   void unsetFormatCode();


   public static final class Factory {

      public static CTNumVal newInstance() {
         return (CTNumVal)POIXMLTypeLoader.newInstance(CTNumVal.type, (XmlOptions)null);
      }

      public static CTNumVal newInstance(XmlOptions var0) {
         return (CTNumVal)POIXMLTypeLoader.newInstance(CTNumVal.type, var0);
      }

      public static CTNumVal parse(String var0) throws XmlException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, (XmlOptions)null);
      }

      public static CTNumVal parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, var1);
      }

      public static CTNumVal parse(File var0) throws XmlException, IOException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, (XmlOptions)null);
      }

      public static CTNumVal parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, var1);
      }

      public static CTNumVal parse(URL var0) throws XmlException, IOException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, (XmlOptions)null);
      }

      public static CTNumVal parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, var1);
      }

      public static CTNumVal parse(InputStream var0) throws XmlException, IOException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, (XmlOptions)null);
      }

      public static CTNumVal parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, var1);
      }

      public static CTNumVal parse(Reader var0) throws XmlException, IOException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, (XmlOptions)null);
      }

      public static CTNumVal parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, var1);
      }

      public static CTNumVal parse(XMLStreamReader var0) throws XmlException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, (XmlOptions)null);
      }

      public static CTNumVal parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, var1);
      }

      public static CTNumVal parse(Node var0) throws XmlException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, (XmlOptions)null);
      }

      public static CTNumVal parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, var1);
      }

      public static CTNumVal parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, (XmlOptions)null);
      }

      public static CTNumVal parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNumVal)POIXMLTypeLoader.parse(var0, CTNumVal.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumVal.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNumVal.type, var1);
      }

   }
}
