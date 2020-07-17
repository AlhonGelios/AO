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
import org.openxmlformats.schemas.drawingml.x2006.chart.STCrossBetween;
import org.w3c.dom.Node;

public interface CTCrossBetween extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCrossBetween.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcrossbetweeneb14type");


   STCrossBetween.Enum getVal();

   STCrossBetween xgetVal();

   void setVal(STCrossBetween.Enum var1);

   void xsetVal(STCrossBetween var1);


   public static final class Factory {

      public static CTCrossBetween newInstance() {
         return (CTCrossBetween)POIXMLTypeLoader.newInstance(CTCrossBetween.type, (XmlOptions)null);
      }

      public static CTCrossBetween newInstance(XmlOptions var0) {
         return (CTCrossBetween)POIXMLTypeLoader.newInstance(CTCrossBetween.type, var0);
      }

      public static CTCrossBetween parse(String var0) throws XmlException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, (XmlOptions)null);
      }

      public static CTCrossBetween parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, var1);
      }

      public static CTCrossBetween parse(File var0) throws XmlException, IOException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, (XmlOptions)null);
      }

      public static CTCrossBetween parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, var1);
      }

      public static CTCrossBetween parse(URL var0) throws XmlException, IOException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, (XmlOptions)null);
      }

      public static CTCrossBetween parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, var1);
      }

      public static CTCrossBetween parse(InputStream var0) throws XmlException, IOException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, (XmlOptions)null);
      }

      public static CTCrossBetween parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, var1);
      }

      public static CTCrossBetween parse(Reader var0) throws XmlException, IOException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, (XmlOptions)null);
      }

      public static CTCrossBetween parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, var1);
      }

      public static CTCrossBetween parse(XMLStreamReader var0) throws XmlException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, (XmlOptions)null);
      }

      public static CTCrossBetween parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, var1);
      }

      public static CTCrossBetween parse(Node var0) throws XmlException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, (XmlOptions)null);
      }

      public static CTCrossBetween parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, var1);
      }

      public static CTCrossBetween parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, (XmlOptions)null);
      }

      public static CTCrossBetween parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCrossBetween)POIXMLTypeLoader.parse(var0, CTCrossBetween.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCrossBetween.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCrossBetween.type, var1);
      }

   }
}
