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
import org.openxmlformats.schemas.drawingml.x2006.chart.STTickLblPos;
import org.w3c.dom.Node;

public interface CTTickLblPos extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTickLblPos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctticklblposff61type");


   STTickLblPos.Enum getVal();

   STTickLblPos xgetVal();

   boolean isSetVal();

   void setVal(STTickLblPos.Enum var1);

   void xsetVal(STTickLblPos var1);

   void unsetVal();


   public static final class Factory {

      public static CTTickLblPos newInstance() {
         return (CTTickLblPos)POIXMLTypeLoader.newInstance(CTTickLblPos.type, (XmlOptions)null);
      }

      public static CTTickLblPos newInstance(XmlOptions var0) {
         return (CTTickLblPos)POIXMLTypeLoader.newInstance(CTTickLblPos.type, var0);
      }

      public static CTTickLblPos parse(String var0) throws XmlException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, (XmlOptions)null);
      }

      public static CTTickLblPos parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, var1);
      }

      public static CTTickLblPos parse(File var0) throws XmlException, IOException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, (XmlOptions)null);
      }

      public static CTTickLblPos parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, var1);
      }

      public static CTTickLblPos parse(URL var0) throws XmlException, IOException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, (XmlOptions)null);
      }

      public static CTTickLblPos parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, var1);
      }

      public static CTTickLblPos parse(InputStream var0) throws XmlException, IOException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, (XmlOptions)null);
      }

      public static CTTickLblPos parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, var1);
      }

      public static CTTickLblPos parse(Reader var0) throws XmlException, IOException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, (XmlOptions)null);
      }

      public static CTTickLblPos parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, var1);
      }

      public static CTTickLblPos parse(XMLStreamReader var0) throws XmlException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, (XmlOptions)null);
      }

      public static CTTickLblPos parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, var1);
      }

      public static CTTickLblPos parse(Node var0) throws XmlException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, (XmlOptions)null);
      }

      public static CTTickLblPos parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, var1);
      }

      public static CTTickLblPos parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, (XmlOptions)null);
      }

      public static CTTickLblPos parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTickLblPos)POIXMLTypeLoader.parse(var0, CTTickLblPos.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTickLblPos.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTickLblPos.type, var1);
      }

   }
}
