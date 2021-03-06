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
import org.openxmlformats.schemas.drawingml.x2006.chart.STLogBase;
import org.w3c.dom.Node;

public interface CTLogBase extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLogBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlogbase9191type");


   double getVal();

   STLogBase xgetVal();

   void setVal(double var1);

   void xsetVal(STLogBase var1);


   public static final class Factory {

      public static CTLogBase newInstance() {
         return (CTLogBase)POIXMLTypeLoader.newInstance(CTLogBase.type, (XmlOptions)null);
      }

      public static CTLogBase newInstance(XmlOptions var0) {
         return (CTLogBase)POIXMLTypeLoader.newInstance(CTLogBase.type, var0);
      }

      public static CTLogBase parse(String var0) throws XmlException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, (XmlOptions)null);
      }

      public static CTLogBase parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, var1);
      }

      public static CTLogBase parse(File var0) throws XmlException, IOException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, (XmlOptions)null);
      }

      public static CTLogBase parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, var1);
      }

      public static CTLogBase parse(URL var0) throws XmlException, IOException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, (XmlOptions)null);
      }

      public static CTLogBase parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, var1);
      }

      public static CTLogBase parse(InputStream var0) throws XmlException, IOException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, (XmlOptions)null);
      }

      public static CTLogBase parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, var1);
      }

      public static CTLogBase parse(Reader var0) throws XmlException, IOException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, (XmlOptions)null);
      }

      public static CTLogBase parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, var1);
      }

      public static CTLogBase parse(XMLStreamReader var0) throws XmlException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, (XmlOptions)null);
      }

      public static CTLogBase parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, var1);
      }

      public static CTLogBase parse(Node var0) throws XmlException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, (XmlOptions)null);
      }

      public static CTLogBase parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, var1);
      }

      public static CTLogBase parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, (XmlOptions)null);
      }

      public static CTLogBase parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLogBase)POIXMLTypeLoader.parse(var0, CTLogBase.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLogBase.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLogBase.type, var1);
      }

   }
}
