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

public interface CTDecimalNumber extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDecimalNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdecimalnumbera518type");


   BigInteger getVal();

   STDecimalNumber xgetVal();

   void setVal(BigInteger var1);

   void xsetVal(STDecimalNumber var1);


   public static final class Factory {

      public static CTDecimalNumber newInstance() {
         return (CTDecimalNumber)POIXMLTypeLoader.newInstance(CTDecimalNumber.type, (XmlOptions)null);
      }

      public static CTDecimalNumber newInstance(XmlOptions var0) {
         return (CTDecimalNumber)POIXMLTypeLoader.newInstance(CTDecimalNumber.type, var0);
      }

      public static CTDecimalNumber parse(String var0) throws XmlException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, (XmlOptions)null);
      }

      public static CTDecimalNumber parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, var1);
      }

      public static CTDecimalNumber parse(File var0) throws XmlException, IOException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, (XmlOptions)null);
      }

      public static CTDecimalNumber parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, var1);
      }

      public static CTDecimalNumber parse(URL var0) throws XmlException, IOException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, (XmlOptions)null);
      }

      public static CTDecimalNumber parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, var1);
      }

      public static CTDecimalNumber parse(InputStream var0) throws XmlException, IOException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, (XmlOptions)null);
      }

      public static CTDecimalNumber parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, var1);
      }

      public static CTDecimalNumber parse(Reader var0) throws XmlException, IOException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, (XmlOptions)null);
      }

      public static CTDecimalNumber parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, var1);
      }

      public static CTDecimalNumber parse(XMLStreamReader var0) throws XmlException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, (XmlOptions)null);
      }

      public static CTDecimalNumber parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, var1);
      }

      public static CTDecimalNumber parse(Node var0) throws XmlException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, (XmlOptions)null);
      }

      public static CTDecimalNumber parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, var1);
      }

      public static CTDecimalNumber parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, (XmlOptions)null);
      }

      public static CTDecimalNumber parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDecimalNumber)POIXMLTypeLoader.parse(var0, CTDecimalNumber.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDecimalNumber.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDecimalNumber.type, var1);
      }

   }
}
