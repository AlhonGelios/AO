package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTAuthors extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTAuthors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctauthorsb8a7type");


   List getAuthorList();

   String[] getAuthorArray();

   String getAuthorArray(int var1);

   List xgetAuthorList();

   STXstring[] xgetAuthorArray();

   STXstring xgetAuthorArray(int var1);

   int sizeOfAuthorArray();

   void setAuthorArray(String[] var1);

   void setAuthorArray(int var1, String var2);

   void xsetAuthorArray(STXstring[] var1);

   void xsetAuthorArray(int var1, STXstring var2);

   void insertAuthor(int var1, String var2);

   void addAuthor(String var1);

   STXstring insertNewAuthor(int var1);

   STXstring addNewAuthor();

   void removeAuthor(int var1);


   public static final class Factory {

      public static CTAuthors newInstance() {
         return (CTAuthors)POIXMLTypeLoader.newInstance(CTAuthors.type, (XmlOptions)null);
      }

      public static CTAuthors newInstance(XmlOptions var0) {
         return (CTAuthors)POIXMLTypeLoader.newInstance(CTAuthors.type, var0);
      }

      public static CTAuthors parse(String var0) throws XmlException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, (XmlOptions)null);
      }

      public static CTAuthors parse(String var0, XmlOptions var1) throws XmlException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, var1);
      }

      public static CTAuthors parse(File var0) throws XmlException, IOException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, (XmlOptions)null);
      }

      public static CTAuthors parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, var1);
      }

      public static CTAuthors parse(URL var0) throws XmlException, IOException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, (XmlOptions)null);
      }

      public static CTAuthors parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, var1);
      }

      public static CTAuthors parse(InputStream var0) throws XmlException, IOException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, (XmlOptions)null);
      }

      public static CTAuthors parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, var1);
      }

      public static CTAuthors parse(Reader var0) throws XmlException, IOException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, (XmlOptions)null);
      }

      public static CTAuthors parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, var1);
      }

      public static CTAuthors parse(XMLStreamReader var0) throws XmlException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, (XmlOptions)null);
      }

      public static CTAuthors parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, var1);
      }

      public static CTAuthors parse(Node var0) throws XmlException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, (XmlOptions)null);
      }

      public static CTAuthors parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, var1);
      }

      public static CTAuthors parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, (XmlOptions)null);
      }

      public static CTAuthors parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTAuthors)POIXMLTypeLoader.parse(var0, CTAuthors.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAuthors.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAuthors.type, var1);
      }

   }
}
