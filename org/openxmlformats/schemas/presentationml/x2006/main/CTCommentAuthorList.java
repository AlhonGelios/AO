package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor;
import org.w3c.dom.Node;

public interface CTCommentAuthorList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCommentAuthorList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcommentauthorlisteb07type");


   List getCmAuthorList();

   CTCommentAuthor[] getCmAuthorArray();

   CTCommentAuthor getCmAuthorArray(int var1);

   int sizeOfCmAuthorArray();

   void setCmAuthorArray(CTCommentAuthor[] var1);

   void setCmAuthorArray(int var1, CTCommentAuthor var2);

   CTCommentAuthor insertNewCmAuthor(int var1);

   CTCommentAuthor addNewCmAuthor();

   void removeCmAuthor(int var1);


   public static final class Factory {

      public static CTCommentAuthorList newInstance() {
         return (CTCommentAuthorList)POIXMLTypeLoader.newInstance(CTCommentAuthorList.type, (XmlOptions)null);
      }

      public static CTCommentAuthorList newInstance(XmlOptions var0) {
         return (CTCommentAuthorList)POIXMLTypeLoader.newInstance(CTCommentAuthorList.type, var0);
      }

      public static CTCommentAuthorList parse(String var0) throws XmlException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, (XmlOptions)null);
      }

      public static CTCommentAuthorList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, var1);
      }

      public static CTCommentAuthorList parse(File var0) throws XmlException, IOException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, (XmlOptions)null);
      }

      public static CTCommentAuthorList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, var1);
      }

      public static CTCommentAuthorList parse(URL var0) throws XmlException, IOException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, (XmlOptions)null);
      }

      public static CTCommentAuthorList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, var1);
      }

      public static CTCommentAuthorList parse(InputStream var0) throws XmlException, IOException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, (XmlOptions)null);
      }

      public static CTCommentAuthorList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, var1);
      }

      public static CTCommentAuthorList parse(Reader var0) throws XmlException, IOException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, (XmlOptions)null);
      }

      public static CTCommentAuthorList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, var1);
      }

      public static CTCommentAuthorList parse(XMLStreamReader var0) throws XmlException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, (XmlOptions)null);
      }

      public static CTCommentAuthorList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, var1);
      }

      public static CTCommentAuthorList parse(Node var0) throws XmlException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, (XmlOptions)null);
      }

      public static CTCommentAuthorList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, var1);
      }

      public static CTCommentAuthorList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, (XmlOptions)null);
      }

      public static CTCommentAuthorList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCommentAuthorList)POIXMLTypeLoader.parse(var0, CTCommentAuthorList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCommentAuthorList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCommentAuthorList.type, var1);
      }

   }
}
