package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Calendar;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.w3c.dom.Node;

public interface CTMoveBookmark extends CTBookmark {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTMoveBookmark.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctmovebookmarkf7a1type");


   String getAuthor();

   STString xgetAuthor();

   void setAuthor(String var1);

   void xsetAuthor(STString var1);

   Calendar getDate();

   STDateTime xgetDate();

   void setDate(Calendar var1);

   void xsetDate(STDateTime var1);


   public static final class Factory {

      public static CTMoveBookmark newInstance() {
         return (CTMoveBookmark)POIXMLTypeLoader.newInstance(CTMoveBookmark.type, (XmlOptions)null);
      }

      public static CTMoveBookmark newInstance(XmlOptions var0) {
         return (CTMoveBookmark)POIXMLTypeLoader.newInstance(CTMoveBookmark.type, var0);
      }

      public static CTMoveBookmark parse(String var0) throws XmlException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, (XmlOptions)null);
      }

      public static CTMoveBookmark parse(String var0, XmlOptions var1) throws XmlException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, var1);
      }

      public static CTMoveBookmark parse(File var0) throws XmlException, IOException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, (XmlOptions)null);
      }

      public static CTMoveBookmark parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, var1);
      }

      public static CTMoveBookmark parse(URL var0) throws XmlException, IOException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, (XmlOptions)null);
      }

      public static CTMoveBookmark parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, var1);
      }

      public static CTMoveBookmark parse(InputStream var0) throws XmlException, IOException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, (XmlOptions)null);
      }

      public static CTMoveBookmark parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, var1);
      }

      public static CTMoveBookmark parse(Reader var0) throws XmlException, IOException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, (XmlOptions)null);
      }

      public static CTMoveBookmark parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, var1);
      }

      public static CTMoveBookmark parse(XMLStreamReader var0) throws XmlException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, (XmlOptions)null);
      }

      public static CTMoveBookmark parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, var1);
      }

      public static CTMoveBookmark parse(Node var0) throws XmlException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, (XmlOptions)null);
      }

      public static CTMoveBookmark parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, var1);
      }

      public static CTMoveBookmark parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, (XmlOptions)null);
      }

      public static CTMoveBookmark parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTMoveBookmark)POIXMLTypeLoader.parse(var0, CTMoveBookmark.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMoveBookmark.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTMoveBookmark.type, var1);
      }

   }
}
