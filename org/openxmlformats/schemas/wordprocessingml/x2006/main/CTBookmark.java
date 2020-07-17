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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmarkRange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.w3c.dom.Node;

public interface CTBookmark extends CTBookmarkRange {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBookmark.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbookmarkd672type");


   String getName();

   STString xgetName();

   void setName(String var1);

   void xsetName(STString var1);


   public static final class Factory {

      public static CTBookmark newInstance() {
         return (CTBookmark)POIXMLTypeLoader.newInstance(CTBookmark.type, (XmlOptions)null);
      }

      public static CTBookmark newInstance(XmlOptions var0) {
         return (CTBookmark)POIXMLTypeLoader.newInstance(CTBookmark.type, var0);
      }

      public static CTBookmark parse(String var0) throws XmlException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, (XmlOptions)null);
      }

      public static CTBookmark parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, var1);
      }

      public static CTBookmark parse(File var0) throws XmlException, IOException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, (XmlOptions)null);
      }

      public static CTBookmark parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, var1);
      }

      public static CTBookmark parse(URL var0) throws XmlException, IOException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, (XmlOptions)null);
      }

      public static CTBookmark parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, var1);
      }

      public static CTBookmark parse(InputStream var0) throws XmlException, IOException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, (XmlOptions)null);
      }

      public static CTBookmark parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, var1);
      }

      public static CTBookmark parse(Reader var0) throws XmlException, IOException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, (XmlOptions)null);
      }

      public static CTBookmark parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, var1);
      }

      public static CTBookmark parse(XMLStreamReader var0) throws XmlException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, (XmlOptions)null);
      }

      public static CTBookmark parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, var1);
      }

      public static CTBookmark parse(Node var0) throws XmlException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, (XmlOptions)null);
      }

      public static CTBookmark parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, var1);
      }

      public static CTBookmark parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, (XmlOptions)null);
      }

      public static CTBookmark parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBookmark)POIXMLTypeLoader.parse(var0, CTBookmark.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBookmark.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBookmark.type, var1);
      }

   }
}
