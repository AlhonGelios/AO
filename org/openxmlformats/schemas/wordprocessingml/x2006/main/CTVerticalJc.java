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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalJc;
import org.w3c.dom.Node;

public interface CTVerticalJc extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTVerticalJc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctverticaljca439type");


   STVerticalJc.Enum getVal();

   STVerticalJc xgetVal();

   void setVal(STVerticalJc.Enum var1);

   void xsetVal(STVerticalJc var1);


   public static final class Factory {

      public static CTVerticalJc newInstance() {
         return (CTVerticalJc)POIXMLTypeLoader.newInstance(CTVerticalJc.type, (XmlOptions)null);
      }

      public static CTVerticalJc newInstance(XmlOptions var0) {
         return (CTVerticalJc)POIXMLTypeLoader.newInstance(CTVerticalJc.type, var0);
      }

      public static CTVerticalJc parse(String var0) throws XmlException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, (XmlOptions)null);
      }

      public static CTVerticalJc parse(String var0, XmlOptions var1) throws XmlException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, var1);
      }

      public static CTVerticalJc parse(File var0) throws XmlException, IOException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, (XmlOptions)null);
      }

      public static CTVerticalJc parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, var1);
      }

      public static CTVerticalJc parse(URL var0) throws XmlException, IOException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, (XmlOptions)null);
      }

      public static CTVerticalJc parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, var1);
      }

      public static CTVerticalJc parse(InputStream var0) throws XmlException, IOException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, (XmlOptions)null);
      }

      public static CTVerticalJc parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, var1);
      }

      public static CTVerticalJc parse(Reader var0) throws XmlException, IOException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, (XmlOptions)null);
      }

      public static CTVerticalJc parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, var1);
      }

      public static CTVerticalJc parse(XMLStreamReader var0) throws XmlException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, (XmlOptions)null);
      }

      public static CTVerticalJc parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, var1);
      }

      public static CTVerticalJc parse(Node var0) throws XmlException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, (XmlOptions)null);
      }

      public static CTVerticalJc parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, var1);
      }

      public static CTVerticalJc parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, (XmlOptions)null);
      }

      public static CTVerticalJc parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTVerticalJc)POIXMLTypeLoader.parse(var0, CTVerticalJc.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVerticalJc.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVerticalJc.type, var1);
      }

   }
}
