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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;
import org.w3c.dom.Node;

public interface CTTblWidth extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTblWidth.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttblwidthec40type");


   BigInteger getW();

   STDecimalNumber xgetW();

   boolean isSetW();

   void setW(BigInteger var1);

   void xsetW(STDecimalNumber var1);

   void unsetW();

   STTblWidth.Enum getType();

   STTblWidth xgetType();

   boolean isSetType();

   void setType(STTblWidth.Enum var1);

   void xsetType(STTblWidth var1);

   void unsetType();


   public static final class Factory {

      public static CTTblWidth newInstance() {
         return (CTTblWidth)POIXMLTypeLoader.newInstance(CTTblWidth.type, (XmlOptions)null);
      }

      public static CTTblWidth newInstance(XmlOptions var0) {
         return (CTTblWidth)POIXMLTypeLoader.newInstance(CTTblWidth.type, var0);
      }

      public static CTTblWidth parse(String var0) throws XmlException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, (XmlOptions)null);
      }

      public static CTTblWidth parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, var1);
      }

      public static CTTblWidth parse(File var0) throws XmlException, IOException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, (XmlOptions)null);
      }

      public static CTTblWidth parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, var1);
      }

      public static CTTblWidth parse(URL var0) throws XmlException, IOException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, (XmlOptions)null);
      }

      public static CTTblWidth parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, var1);
      }

      public static CTTblWidth parse(InputStream var0) throws XmlException, IOException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, (XmlOptions)null);
      }

      public static CTTblWidth parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, var1);
      }

      public static CTTblWidth parse(Reader var0) throws XmlException, IOException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, (XmlOptions)null);
      }

      public static CTTblWidth parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, var1);
      }

      public static CTTblWidth parse(XMLStreamReader var0) throws XmlException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, (XmlOptions)null);
      }

      public static CTTblWidth parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, var1);
      }

      public static CTTblWidth parse(Node var0) throws XmlException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, (XmlOptions)null);
      }

      public static CTTblWidth parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, var1);
      }

      public static CTTblWidth parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, (XmlOptions)null);
      }

      public static CTTblWidth parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTblWidth)POIXMLTypeLoader.parse(var0, CTTblWidth.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblWidth.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblWidth.type, var1);
      }

   }
}
