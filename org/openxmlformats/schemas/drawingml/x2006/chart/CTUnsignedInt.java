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
import org.w3c.dom.Node;

public interface CTUnsignedInt extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTUnsignedInt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctunsignedinte8ectype");


   long getVal();

   XmlUnsignedInt xgetVal();

   void setVal(long var1);

   void xsetVal(XmlUnsignedInt var1);


   public static final class Factory {

      public static CTUnsignedInt newInstance() {
         return (CTUnsignedInt)POIXMLTypeLoader.newInstance(CTUnsignedInt.type, (XmlOptions)null);
      }

      public static CTUnsignedInt newInstance(XmlOptions var0) {
         return (CTUnsignedInt)POIXMLTypeLoader.newInstance(CTUnsignedInt.type, var0);
      }

      public static CTUnsignedInt parse(String var0) throws XmlException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, (XmlOptions)null);
      }

      public static CTUnsignedInt parse(String var0, XmlOptions var1) throws XmlException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, var1);
      }

      public static CTUnsignedInt parse(File var0) throws XmlException, IOException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, (XmlOptions)null);
      }

      public static CTUnsignedInt parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, var1);
      }

      public static CTUnsignedInt parse(URL var0) throws XmlException, IOException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, (XmlOptions)null);
      }

      public static CTUnsignedInt parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, var1);
      }

      public static CTUnsignedInt parse(InputStream var0) throws XmlException, IOException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, (XmlOptions)null);
      }

      public static CTUnsignedInt parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, var1);
      }

      public static CTUnsignedInt parse(Reader var0) throws XmlException, IOException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, (XmlOptions)null);
      }

      public static CTUnsignedInt parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, var1);
      }

      public static CTUnsignedInt parse(XMLStreamReader var0) throws XmlException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, (XmlOptions)null);
      }

      public static CTUnsignedInt parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, var1);
      }

      public static CTUnsignedInt parse(Node var0) throws XmlException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, (XmlOptions)null);
      }

      public static CTUnsignedInt parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, var1);
      }

      public static CTUnsignedInt parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, (XmlOptions)null);
      }

      public static CTUnsignedInt parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTUnsignedInt)POIXMLTypeLoader.parse(var0, CTUnsignedInt.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTUnsignedInt.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTUnsignedInt.type, var1);
      }

   }
}
