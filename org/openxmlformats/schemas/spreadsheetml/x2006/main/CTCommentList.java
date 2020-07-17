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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment;
import org.w3c.dom.Node;

public interface CTCommentList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCommentList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcommentlist7a3ctype");


   List getCommentList();

   CTComment[] getCommentArray();

   CTComment getCommentArray(int var1);

   int sizeOfCommentArray();

   void setCommentArray(CTComment[] var1);

   void setCommentArray(int var1, CTComment var2);

   CTComment insertNewComment(int var1);

   CTComment addNewComment();

   void removeComment(int var1);


   public static final class Factory {

      public static CTCommentList newInstance() {
         return (CTCommentList)POIXMLTypeLoader.newInstance(CTCommentList.type, (XmlOptions)null);
      }

      public static CTCommentList newInstance(XmlOptions var0) {
         return (CTCommentList)POIXMLTypeLoader.newInstance(CTCommentList.type, var0);
      }

      public static CTCommentList parse(String var0) throws XmlException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, (XmlOptions)null);
      }

      public static CTCommentList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, var1);
      }

      public static CTCommentList parse(File var0) throws XmlException, IOException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, (XmlOptions)null);
      }

      public static CTCommentList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, var1);
      }

      public static CTCommentList parse(URL var0) throws XmlException, IOException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, (XmlOptions)null);
      }

      public static CTCommentList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, var1);
      }

      public static CTCommentList parse(InputStream var0) throws XmlException, IOException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, (XmlOptions)null);
      }

      public static CTCommentList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, var1);
      }

      public static CTCommentList parse(Reader var0) throws XmlException, IOException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, (XmlOptions)null);
      }

      public static CTCommentList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, var1);
      }

      public static CTCommentList parse(XMLStreamReader var0) throws XmlException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, (XmlOptions)null);
      }

      public static CTCommentList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, var1);
      }

      public static CTCommentList parse(Node var0) throws XmlException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, (XmlOptions)null);
      }

      public static CTCommentList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, var1);
      }

      public static CTCommentList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, (XmlOptions)null);
      }

      public static CTCommentList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCommentList)POIXMLTypeLoader.parse(var0, CTCommentList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCommentList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCommentList.type, var1);
      }

   }
}
