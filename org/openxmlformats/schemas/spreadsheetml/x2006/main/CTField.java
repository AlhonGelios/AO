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

public interface CTField extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfieldc999type");


   int getX();

   XmlInt xgetX();

   void setX(int var1);

   void xsetX(XmlInt var1);


   public static final class Factory {

      public static CTField newInstance() {
         return (CTField)POIXMLTypeLoader.newInstance(CTField.type, (XmlOptions)null);
      }

      public static CTField newInstance(XmlOptions var0) {
         return (CTField)POIXMLTypeLoader.newInstance(CTField.type, var0);
      }

      public static CTField parse(String var0) throws XmlException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, (XmlOptions)null);
      }

      public static CTField parse(String var0, XmlOptions var1) throws XmlException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, var1);
      }

      public static CTField parse(File var0) throws XmlException, IOException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, (XmlOptions)null);
      }

      public static CTField parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, var1);
      }

      public static CTField parse(URL var0) throws XmlException, IOException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, (XmlOptions)null);
      }

      public static CTField parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, var1);
      }

      public static CTField parse(InputStream var0) throws XmlException, IOException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, (XmlOptions)null);
      }

      public static CTField parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, var1);
      }

      public static CTField parse(Reader var0) throws XmlException, IOException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, (XmlOptions)null);
      }

      public static CTField parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, var1);
      }

      public static CTField parse(XMLStreamReader var0) throws XmlException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, (XmlOptions)null);
      }

      public static CTField parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, var1);
      }

      public static CTField parse(Node var0) throws XmlException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, (XmlOptions)null);
      }

      public static CTField parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, var1);
      }

      public static CTField parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, (XmlOptions)null);
      }

      public static CTField parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTField)POIXMLTypeLoader.parse(var0, CTField.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTField.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTField.type, var1);
      }

   }
}
