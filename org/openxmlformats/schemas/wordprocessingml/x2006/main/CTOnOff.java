package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.w3c.dom.Node;

public interface CTOnOff extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTOnOff.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctonoff04c2type");


   STOnOff.Enum getVal();

   STOnOff xgetVal();

   boolean isSetVal();

   void setVal(STOnOff.Enum var1);

   void xsetVal(STOnOff var1);

   void unsetVal();


   public static final class Factory {

      public static CTOnOff newInstance() {
         return (CTOnOff)POIXMLTypeLoader.newInstance(CTOnOff.type, (XmlOptions)null);
      }

      public static CTOnOff newInstance(XmlOptions var0) {
         return (CTOnOff)POIXMLTypeLoader.newInstance(CTOnOff.type, var0);
      }

      public static CTOnOff parse(String var0) throws XmlException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, (XmlOptions)null);
      }

      public static CTOnOff parse(String var0, XmlOptions var1) throws XmlException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, var1);
      }

      public static CTOnOff parse(File var0) throws XmlException, IOException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, (XmlOptions)null);
      }

      public static CTOnOff parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, var1);
      }

      public static CTOnOff parse(URL var0) throws XmlException, IOException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, (XmlOptions)null);
      }

      public static CTOnOff parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, var1);
      }

      public static CTOnOff parse(InputStream var0) throws XmlException, IOException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, (XmlOptions)null);
      }

      public static CTOnOff parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, var1);
      }

      public static CTOnOff parse(Reader var0) throws XmlException, IOException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, (XmlOptions)null);
      }

      public static CTOnOff parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, var1);
      }

      public static CTOnOff parse(XMLStreamReader var0) throws XmlException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, (XmlOptions)null);
      }

      public static CTOnOff parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, var1);
      }

      public static CTOnOff parse(Node var0) throws XmlException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, (XmlOptions)null);
      }

      public static CTOnOff parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, var1);
      }

      public static CTOnOff parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, (XmlOptions)null);
      }

      public static CTOnOff parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTOnOff)POIXMLTypeLoader.parse(var0, CTOnOff.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOnOff.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOnOff.type, var1);
      }

   }
}
