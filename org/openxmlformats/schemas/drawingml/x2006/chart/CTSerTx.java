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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef;
import org.openxmlformats.schemas.drawingml.x2006.chart.STXstring;
import org.w3c.dom.Node;

public interface CTSerTx extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSerTx.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsertxd722type");


   CTStrRef getStrRef();

   boolean isSetStrRef();

   void setStrRef(CTStrRef var1);

   CTStrRef addNewStrRef();

   void unsetStrRef();

   String getV();

   STXstring xgetV();

   boolean isSetV();

   void setV(String var1);

   void xsetV(STXstring var1);

   void unsetV();


   public static final class Factory {

      public static CTSerTx newInstance() {
         return (CTSerTx)POIXMLTypeLoader.newInstance(CTSerTx.type, (XmlOptions)null);
      }

      public static CTSerTx newInstance(XmlOptions var0) {
         return (CTSerTx)POIXMLTypeLoader.newInstance(CTSerTx.type, var0);
      }

      public static CTSerTx parse(String var0) throws XmlException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, (XmlOptions)null);
      }

      public static CTSerTx parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, var1);
      }

      public static CTSerTx parse(File var0) throws XmlException, IOException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, (XmlOptions)null);
      }

      public static CTSerTx parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, var1);
      }

      public static CTSerTx parse(URL var0) throws XmlException, IOException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, (XmlOptions)null);
      }

      public static CTSerTx parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, var1);
      }

      public static CTSerTx parse(InputStream var0) throws XmlException, IOException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, (XmlOptions)null);
      }

      public static CTSerTx parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, var1);
      }

      public static CTSerTx parse(Reader var0) throws XmlException, IOException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, (XmlOptions)null);
      }

      public static CTSerTx parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, var1);
      }

      public static CTSerTx parse(XMLStreamReader var0) throws XmlException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, (XmlOptions)null);
      }

      public static CTSerTx parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, var1);
      }

      public static CTSerTx parse(Node var0) throws XmlException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, (XmlOptions)null);
      }

      public static CTSerTx parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, var1);
      }

      public static CTSerTx parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, (XmlOptions)null);
      }

      public static CTSerTx parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSerTx)POIXMLTypeLoader.parse(var0, CTSerTx.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSerTx.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSerTx.type, var1);
      }

   }
}
