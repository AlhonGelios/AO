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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.w3c.dom.Node;

public interface CTBookmarkRange extends CTMarkupRange {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBookmarkRange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbookmarkranged88btype");


   BigInteger getColFirst();

   STDecimalNumber xgetColFirst();

   boolean isSetColFirst();

   void setColFirst(BigInteger var1);

   void xsetColFirst(STDecimalNumber var1);

   void unsetColFirst();

   BigInteger getColLast();

   STDecimalNumber xgetColLast();

   boolean isSetColLast();

   void setColLast(BigInteger var1);

   void xsetColLast(STDecimalNumber var1);

   void unsetColLast();


   public static final class Factory {

      public static CTBookmarkRange newInstance() {
         return (CTBookmarkRange)POIXMLTypeLoader.newInstance(CTBookmarkRange.type, (XmlOptions)null);
      }

      public static CTBookmarkRange newInstance(XmlOptions var0) {
         return (CTBookmarkRange)POIXMLTypeLoader.newInstance(CTBookmarkRange.type, var0);
      }

      public static CTBookmarkRange parse(String var0) throws XmlException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, (XmlOptions)null);
      }

      public static CTBookmarkRange parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, var1);
      }

      public static CTBookmarkRange parse(File var0) throws XmlException, IOException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, (XmlOptions)null);
      }

      public static CTBookmarkRange parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, var1);
      }

      public static CTBookmarkRange parse(URL var0) throws XmlException, IOException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, (XmlOptions)null);
      }

      public static CTBookmarkRange parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, var1);
      }

      public static CTBookmarkRange parse(InputStream var0) throws XmlException, IOException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, (XmlOptions)null);
      }

      public static CTBookmarkRange parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, var1);
      }

      public static CTBookmarkRange parse(Reader var0) throws XmlException, IOException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, (XmlOptions)null);
      }

      public static CTBookmarkRange parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, var1);
      }

      public static CTBookmarkRange parse(XMLStreamReader var0) throws XmlException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, (XmlOptions)null);
      }

      public static CTBookmarkRange parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, var1);
      }

      public static CTBookmarkRange parse(Node var0) throws XmlException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, (XmlOptions)null);
      }

      public static CTBookmarkRange parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, var1);
      }

      public static CTBookmarkRange parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, (XmlOptions)null);
      }

      public static CTBookmarkRange parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBookmarkRange)POIXMLTypeLoader.parse(var0, CTBookmarkRange.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBookmarkRange.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBookmarkRange.type, var1);
      }

   }
}
