package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTIntProperty extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTIntProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctintproperty32c3type");


   int getVal();

   XmlInt xgetVal();

   void setVal(int var1);

   void xsetVal(XmlInt var1);


   public static final class Factory {

      public static CTIntProperty newInstance() {
         return (CTIntProperty)POIXMLTypeLoader.newInstance(CTIntProperty.type, (XmlOptions)null);
      }

      public static CTIntProperty newInstance(XmlOptions var0) {
         return (CTIntProperty)POIXMLTypeLoader.newInstance(CTIntProperty.type, var0);
      }

      public static CTIntProperty parse(String var0) throws XmlException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, (XmlOptions)null);
      }

      public static CTIntProperty parse(String var0, XmlOptions var1) throws XmlException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, var1);
      }

      public static CTIntProperty parse(File var0) throws XmlException, IOException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, (XmlOptions)null);
      }

      public static CTIntProperty parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, var1);
      }

      public static CTIntProperty parse(URL var0) throws XmlException, IOException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, (XmlOptions)null);
      }

      public static CTIntProperty parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, var1);
      }

      public static CTIntProperty parse(InputStream var0) throws XmlException, IOException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, (XmlOptions)null);
      }

      public static CTIntProperty parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, var1);
      }

      public static CTIntProperty parse(Reader var0) throws XmlException, IOException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, (XmlOptions)null);
      }

      public static CTIntProperty parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, var1);
      }

      public static CTIntProperty parse(XMLStreamReader var0) throws XmlException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, (XmlOptions)null);
      }

      public static CTIntProperty parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, var1);
      }

      public static CTIntProperty parse(Node var0) throws XmlException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, (XmlOptions)null);
      }

      public static CTIntProperty parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, var1);
      }

      public static CTIntProperty parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, (XmlOptions)null);
      }

      public static CTIntProperty parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTIntProperty)POIXMLTypeLoader.parse(var0, CTIntProperty.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTIntProperty.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTIntProperty.type, var1);
      }

   }
}
