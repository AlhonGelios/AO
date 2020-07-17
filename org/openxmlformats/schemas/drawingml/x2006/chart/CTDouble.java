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
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTDouble extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDouble.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdoublec10btype");


   double getVal();

   XmlDouble xgetVal();

   void setVal(double var1);

   void xsetVal(XmlDouble var1);


   public static final class Factory {

      public static CTDouble newInstance() {
         return (CTDouble)POIXMLTypeLoader.newInstance(CTDouble.type, (XmlOptions)null);
      }

      public static CTDouble newInstance(XmlOptions var0) {
         return (CTDouble)POIXMLTypeLoader.newInstance(CTDouble.type, var0);
      }

      public static CTDouble parse(String var0) throws XmlException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, (XmlOptions)null);
      }

      public static CTDouble parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, var1);
      }

      public static CTDouble parse(File var0) throws XmlException, IOException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, (XmlOptions)null);
      }

      public static CTDouble parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, var1);
      }

      public static CTDouble parse(URL var0) throws XmlException, IOException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, (XmlOptions)null);
      }

      public static CTDouble parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, var1);
      }

      public static CTDouble parse(InputStream var0) throws XmlException, IOException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, (XmlOptions)null);
      }

      public static CTDouble parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, var1);
      }

      public static CTDouble parse(Reader var0) throws XmlException, IOException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, (XmlOptions)null);
      }

      public static CTDouble parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, var1);
      }

      public static CTDouble parse(XMLStreamReader var0) throws XmlException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, (XmlOptions)null);
      }

      public static CTDouble parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, var1);
      }

      public static CTDouble parse(Node var0) throws XmlException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, (XmlOptions)null);
      }

      public static CTDouble parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, var1);
      }

      public static CTDouble parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, (XmlOptions)null);
      }

      public static CTDouble parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDouble)POIXMLTypeLoader.parse(var0, CTDouble.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDouble.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDouble.type, var1);
      }

   }
}
