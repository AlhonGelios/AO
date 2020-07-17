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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.w3c.dom.Node;

public interface CTString extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTString.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstring9c37type");


   String getVal();

   STString xgetVal();

   void setVal(String var1);

   void xsetVal(STString var1);


   public static final class Factory {

      public static CTString newInstance() {
         return (CTString)POIXMLTypeLoader.newInstance(CTString.type, (XmlOptions)null);
      }

      public static CTString newInstance(XmlOptions var0) {
         return (CTString)POIXMLTypeLoader.newInstance(CTString.type, var0);
      }

      public static CTString parse(String var0) throws XmlException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, (XmlOptions)null);
      }

      public static CTString parse(String var0, XmlOptions var1) throws XmlException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, var1);
      }

      public static CTString parse(File var0) throws XmlException, IOException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, (XmlOptions)null);
      }

      public static CTString parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, var1);
      }

      public static CTString parse(URL var0) throws XmlException, IOException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, (XmlOptions)null);
      }

      public static CTString parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, var1);
      }

      public static CTString parse(InputStream var0) throws XmlException, IOException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, (XmlOptions)null);
      }

      public static CTString parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, var1);
      }

      public static CTString parse(Reader var0) throws XmlException, IOException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, (XmlOptions)null);
      }

      public static CTString parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, var1);
      }

      public static CTString parse(XMLStreamReader var0) throws XmlException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, (XmlOptions)null);
      }

      public static CTString parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, var1);
      }

      public static CTString parse(Node var0) throws XmlException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, (XmlOptions)null);
      }

      public static CTString parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, var1);
      }

      public static CTString parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, (XmlOptions)null);
      }

      public static CTString parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTString)POIXMLTypeLoader.parse(var0, CTString.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTString.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTString.type, var1);
      }

   }
}
