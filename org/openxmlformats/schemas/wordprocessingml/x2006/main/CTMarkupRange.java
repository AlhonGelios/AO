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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDisplacedByCustomXml$Enum;
import org.w3c.dom.Node;

public interface CTMarkupRange extends CTMarkup {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTMarkupRange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmarkuprangeba3dtype");


   STDisplacedByCustomXml$Enum getDisplacedByCustomXml();

   STDisplacedByCustomXml xgetDisplacedByCustomXml();

   boolean isSetDisplacedByCustomXml();

   void setDisplacedByCustomXml(STDisplacedByCustomXml$Enum var1);

   void xsetDisplacedByCustomXml(STDisplacedByCustomXml var1);

   void unsetDisplacedByCustomXml();


   public static final class Factory {

      public static CTMarkupRange newInstance() {
         return (CTMarkupRange)POIXMLTypeLoader.newInstance(CTMarkupRange.type, (XmlOptions)null);
      }

      public static CTMarkupRange newInstance(XmlOptions var0) {
         return (CTMarkupRange)POIXMLTypeLoader.newInstance(CTMarkupRange.type, var0);
      }

      public static CTMarkupRange parse(String var0) throws XmlException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, (XmlOptions)null);
      }

      public static CTMarkupRange parse(String var0, XmlOptions var1) throws XmlException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, var1);
      }

      public static CTMarkupRange parse(File var0) throws XmlException, IOException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, (XmlOptions)null);
      }

      public static CTMarkupRange parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, var1);
      }

      public static CTMarkupRange parse(URL var0) throws XmlException, IOException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, (XmlOptions)null);
      }

      public static CTMarkupRange parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, var1);
      }

      public static CTMarkupRange parse(InputStream var0) throws XmlException, IOException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, (XmlOptions)null);
      }

      public static CTMarkupRange parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, var1);
      }

      public static CTMarkupRange parse(Reader var0) throws XmlException, IOException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, (XmlOptions)null);
      }

      public static CTMarkupRange parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, var1);
      }

      public static CTMarkupRange parse(XMLStreamReader var0) throws XmlException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, (XmlOptions)null);
      }

      public static CTMarkupRange parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, var1);
      }

      public static CTMarkupRange parse(Node var0) throws XmlException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, (XmlOptions)null);
      }

      public static CTMarkupRange parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, var1);
      }

      public static CTMarkupRange parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, (XmlOptions)null);
      }

      public static CTMarkupRange parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTMarkupRange)POIXMLTypeLoader.parse(var0, CTMarkupRange.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMarkupRange.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMarkupRange.type, var1);
      }

   }
}
