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
import org.openxmlformats.schemas.drawingml.x2006.chart.STOrientation;
import org.w3c.dom.Node;

public interface CTOrientation extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTOrientation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctorientationcb16type");


   STOrientation.Enum getVal();

   STOrientation xgetVal();

   boolean isSetVal();

   void setVal(STOrientation.Enum var1);

   void xsetVal(STOrientation var1);

   void unsetVal();


   public static final class Factory {

      public static CTOrientation newInstance() {
         return (CTOrientation)POIXMLTypeLoader.newInstance(CTOrientation.type, (XmlOptions)null);
      }

      public static CTOrientation newInstance(XmlOptions var0) {
         return (CTOrientation)POIXMLTypeLoader.newInstance(CTOrientation.type, var0);
      }

      public static CTOrientation parse(String var0) throws XmlException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, (XmlOptions)null);
      }

      public static CTOrientation parse(String var0, XmlOptions var1) throws XmlException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, var1);
      }

      public static CTOrientation parse(File var0) throws XmlException, IOException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, (XmlOptions)null);
      }

      public static CTOrientation parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, var1);
      }

      public static CTOrientation parse(URL var0) throws XmlException, IOException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, (XmlOptions)null);
      }

      public static CTOrientation parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, var1);
      }

      public static CTOrientation parse(InputStream var0) throws XmlException, IOException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, (XmlOptions)null);
      }

      public static CTOrientation parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, var1);
      }

      public static CTOrientation parse(Reader var0) throws XmlException, IOException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, (XmlOptions)null);
      }

      public static CTOrientation parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, var1);
      }

      public static CTOrientation parse(XMLStreamReader var0) throws XmlException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, (XmlOptions)null);
      }

      public static CTOrientation parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, var1);
      }

      public static CTOrientation parse(Node var0) throws XmlException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, (XmlOptions)null);
      }

      public static CTOrientation parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, var1);
      }

      public static CTOrientation parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, (XmlOptions)null);
      }

      public static CTOrientation parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTOrientation)POIXMLTypeLoader.parse(var0, CTOrientation.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOrientation.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOrientation.type, var1);
      }

   }
}
