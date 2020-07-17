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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STZoom;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STZoom$Enum;
import org.w3c.dom.Node;

public interface CTZoom extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTZoom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctzoomc275type");


   STZoom$Enum getVal();

   STZoom xgetVal();

   boolean isSetVal();

   void setVal(STZoom$Enum var1);

   void xsetVal(STZoom var1);

   void unsetVal();

   BigInteger getPercent();

   STDecimalNumber xgetPercent();

   void setPercent(BigInteger var1);

   void xsetPercent(STDecimalNumber var1);


   public static final class Factory {

      public static CTZoom newInstance() {
         return (CTZoom)POIXMLTypeLoader.newInstance(CTZoom.type, (XmlOptions)null);
      }

      public static CTZoom newInstance(XmlOptions var0) {
         return (CTZoom)POIXMLTypeLoader.newInstance(CTZoom.type, var0);
      }

      public static CTZoom parse(String var0) throws XmlException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, (XmlOptions)null);
      }

      public static CTZoom parse(String var0, XmlOptions var1) throws XmlException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, var1);
      }

      public static CTZoom parse(File var0) throws XmlException, IOException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, (XmlOptions)null);
      }

      public static CTZoom parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, var1);
      }

      public static CTZoom parse(URL var0) throws XmlException, IOException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, (XmlOptions)null);
      }

      public static CTZoom parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, var1);
      }

      public static CTZoom parse(InputStream var0) throws XmlException, IOException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, (XmlOptions)null);
      }

      public static CTZoom parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, var1);
      }

      public static CTZoom parse(Reader var0) throws XmlException, IOException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, (XmlOptions)null);
      }

      public static CTZoom parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, var1);
      }

      public static CTZoom parse(XMLStreamReader var0) throws XmlException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, (XmlOptions)null);
      }

      public static CTZoom parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, var1);
      }

      public static CTZoom parse(Node var0) throws XmlException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, (XmlOptions)null);
      }

      public static CTZoom parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, var1);
      }

      public static CTZoom parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, (XmlOptions)null);
      }

      public static CTZoom parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTZoom)POIXMLTypeLoader.parse(var0, CTZoom.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTZoom.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTZoom.type, var1);
      }

   }
}
