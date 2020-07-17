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
import org.openxmlformats.schemas.drawingml.x2006.chart.STLegendPos;
import org.w3c.dom.Node;

public interface CTLegendPos extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLegendPos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlegendpos053ftype");


   STLegendPos.Enum getVal();

   STLegendPos xgetVal();

   boolean isSetVal();

   void setVal(STLegendPos.Enum var1);

   void xsetVal(STLegendPos var1);

   void unsetVal();


   public static final class Factory {

      public static CTLegendPos newInstance() {
         return (CTLegendPos)POIXMLTypeLoader.newInstance(CTLegendPos.type, (XmlOptions)null);
      }

      public static CTLegendPos newInstance(XmlOptions var0) {
         return (CTLegendPos)POIXMLTypeLoader.newInstance(CTLegendPos.type, var0);
      }

      public static CTLegendPos parse(String var0) throws XmlException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, (XmlOptions)null);
      }

      public static CTLegendPos parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, var1);
      }

      public static CTLegendPos parse(File var0) throws XmlException, IOException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, (XmlOptions)null);
      }

      public static CTLegendPos parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, var1);
      }

      public static CTLegendPos parse(URL var0) throws XmlException, IOException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, (XmlOptions)null);
      }

      public static CTLegendPos parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, var1);
      }

      public static CTLegendPos parse(InputStream var0) throws XmlException, IOException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, (XmlOptions)null);
      }

      public static CTLegendPos parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, var1);
      }

      public static CTLegendPos parse(Reader var0) throws XmlException, IOException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, (XmlOptions)null);
      }

      public static CTLegendPos parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, var1);
      }

      public static CTLegendPos parse(XMLStreamReader var0) throws XmlException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, (XmlOptions)null);
      }

      public static CTLegendPos parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, var1);
      }

      public static CTLegendPos parse(Node var0) throws XmlException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, (XmlOptions)null);
      }

      public static CTLegendPos parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, var1);
      }

      public static CTLegendPos parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, (XmlOptions)null);
      }

      public static CTLegendPos parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLegendPos)POIXMLTypeLoader.parse(var0, CTLegendPos.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLegendPos.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLegendPos.type, var1);
      }

   }
}
