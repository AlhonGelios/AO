package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.w3c.dom.Node;

public interface CTMarkup extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTMarkup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmarkup2d80type");


   BigInteger getId();

   STDecimalNumber xgetId();

   void setId(BigInteger var1);

   void xsetId(STDecimalNumber var1);


   public static final class Factory {

      public static CTMarkup newInstance() {
         return (CTMarkup)POIXMLTypeLoader.newInstance(CTMarkup.type, (XmlOptions)null);
      }

      public static CTMarkup newInstance(XmlOptions var0) {
         return (CTMarkup)POIXMLTypeLoader.newInstance(CTMarkup.type, var0);
      }

      public static CTMarkup parse(String var0) throws XmlException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, (XmlOptions)null);
      }

      public static CTMarkup parse(String var0, XmlOptions var1) throws XmlException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, var1);
      }

      public static CTMarkup parse(File var0) throws XmlException, IOException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, (XmlOptions)null);
      }

      public static CTMarkup parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, var1);
      }

      public static CTMarkup parse(URL var0) throws XmlException, IOException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, (XmlOptions)null);
      }

      public static CTMarkup parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, var1);
      }

      public static CTMarkup parse(InputStream var0) throws XmlException, IOException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, (XmlOptions)null);
      }

      public static CTMarkup parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, var1);
      }

      public static CTMarkup parse(Reader var0) throws XmlException, IOException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, (XmlOptions)null);
      }

      public static CTMarkup parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, var1);
      }

      public static CTMarkup parse(XMLStreamReader var0) throws XmlException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, (XmlOptions)null);
      }

      public static CTMarkup parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, var1);
      }

      public static CTMarkup parse(Node var0) throws XmlException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, (XmlOptions)null);
      }

      public static CTMarkup parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, var1);
      }

      public static CTMarkup parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, (XmlOptions)null);
      }

      public static CTMarkup parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTMarkup)POIXMLTypeLoader.parse(var0, CTMarkup.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMarkup.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMarkup.type, var1);
      }

   }
}
