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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;
import org.w3c.dom.Node;

public interface CTJc extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTJc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctjc158ftype");


   STJc.Enum getVal();

   STJc xgetVal();

   void setVal(STJc.Enum var1);

   void xsetVal(STJc var1);


   public static final class Factory {

      public static CTJc newInstance() {
         return (CTJc)POIXMLTypeLoader.newInstance(CTJc.type, (XmlOptions)null);
      }

      public static CTJc newInstance(XmlOptions var0) {
         return (CTJc)POIXMLTypeLoader.newInstance(CTJc.type, var0);
      }

      public static CTJc parse(String var0) throws XmlException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, (XmlOptions)null);
      }

      public static CTJc parse(String var0, XmlOptions var1) throws XmlException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, var1);
      }

      public static CTJc parse(File var0) throws XmlException, IOException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, (XmlOptions)null);
      }

      public static CTJc parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, var1);
      }

      public static CTJc parse(URL var0) throws XmlException, IOException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, (XmlOptions)null);
      }

      public static CTJc parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, var1);
      }

      public static CTJc parse(InputStream var0) throws XmlException, IOException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, (XmlOptions)null);
      }

      public static CTJc parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, var1);
      }

      public static CTJc parse(Reader var0) throws XmlException, IOException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, (XmlOptions)null);
      }

      public static CTJc parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, var1);
      }

      public static CTJc parse(XMLStreamReader var0) throws XmlException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, (XmlOptions)null);
      }

      public static CTJc parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, var1);
      }

      public static CTJc parse(Node var0) throws XmlException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, (XmlOptions)null);
      }

      public static CTJc parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, var1);
      }

      public static CTJc parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, (XmlOptions)null);
      }

      public static CTJc parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTJc)POIXMLTypeLoader.parse(var0, CTJc.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTJc.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTJc.type, var1);
      }

   }
}
