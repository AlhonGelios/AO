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
import org.openxmlformats.schemas.drawingml.x2006.chart.STAxPos;
import org.w3c.dom.Node;

public interface CTAxPos extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTAxPos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctaxposff69type");


   STAxPos.Enum getVal();

   STAxPos xgetVal();

   void setVal(STAxPos.Enum var1);

   void xsetVal(STAxPos var1);


   public static final class Factory {

      public static CTAxPos newInstance() {
         return (CTAxPos)POIXMLTypeLoader.newInstance(CTAxPos.type, (XmlOptions)null);
      }

      public static CTAxPos newInstance(XmlOptions var0) {
         return (CTAxPos)POIXMLTypeLoader.newInstance(CTAxPos.type, var0);
      }

      public static CTAxPos parse(String var0) throws XmlException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, (XmlOptions)null);
      }

      public static CTAxPos parse(String var0, XmlOptions var1) throws XmlException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, var1);
      }

      public static CTAxPos parse(File var0) throws XmlException, IOException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, (XmlOptions)null);
      }

      public static CTAxPos parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, var1);
      }

      public static CTAxPos parse(URL var0) throws XmlException, IOException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, (XmlOptions)null);
      }

      public static CTAxPos parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, var1);
      }

      public static CTAxPos parse(InputStream var0) throws XmlException, IOException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, (XmlOptions)null);
      }

      public static CTAxPos parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, var1);
      }

      public static CTAxPos parse(Reader var0) throws XmlException, IOException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, (XmlOptions)null);
      }

      public static CTAxPos parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, var1);
      }

      public static CTAxPos parse(XMLStreamReader var0) throws XmlException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, (XmlOptions)null);
      }

      public static CTAxPos parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, var1);
      }

      public static CTAxPos parse(Node var0) throws XmlException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, (XmlOptions)null);
      }

      public static CTAxPos parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, var1);
      }

      public static CTAxPos parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, (XmlOptions)null);
      }

      public static CTAxPos parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTAxPos)POIXMLTypeLoader.parse(var0, CTAxPos.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAxPos.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAxPos.type, var1);
      }

   }
}
