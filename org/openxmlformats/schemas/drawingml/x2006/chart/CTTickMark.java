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
import org.openxmlformats.schemas.drawingml.x2006.chart.STTickMark;
import org.w3c.dom.Node;

public interface CTTickMark extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTickMark.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttickmarke7f2type");


   STTickMark.Enum getVal();

   STTickMark xgetVal();

   boolean isSetVal();

   void setVal(STTickMark.Enum var1);

   void xsetVal(STTickMark var1);

   void unsetVal();


   public static final class Factory {

      public static CTTickMark newInstance() {
         return (CTTickMark)POIXMLTypeLoader.newInstance(CTTickMark.type, (XmlOptions)null);
      }

      public static CTTickMark newInstance(XmlOptions var0) {
         return (CTTickMark)POIXMLTypeLoader.newInstance(CTTickMark.type, var0);
      }

      public static CTTickMark parse(String var0) throws XmlException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, (XmlOptions)null);
      }

      public static CTTickMark parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, var1);
      }

      public static CTTickMark parse(File var0) throws XmlException, IOException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, (XmlOptions)null);
      }

      public static CTTickMark parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, var1);
      }

      public static CTTickMark parse(URL var0) throws XmlException, IOException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, (XmlOptions)null);
      }

      public static CTTickMark parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, var1);
      }

      public static CTTickMark parse(InputStream var0) throws XmlException, IOException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, (XmlOptions)null);
      }

      public static CTTickMark parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, var1);
      }

      public static CTTickMark parse(Reader var0) throws XmlException, IOException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, (XmlOptions)null);
      }

      public static CTTickMark parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, var1);
      }

      public static CTTickMark parse(XMLStreamReader var0) throws XmlException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, (XmlOptions)null);
      }

      public static CTTickMark parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, var1);
      }

      public static CTTickMark parse(Node var0) throws XmlException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, (XmlOptions)null);
      }

      public static CTTickMark parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, var1);
      }

      public static CTTickMark parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, (XmlOptions)null);
      }

      public static CTTickMark parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTickMark)POIXMLTypeLoader.parse(var0, CTTickMark.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTickMark.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTickMark.type, var1);
      }

   }
}
