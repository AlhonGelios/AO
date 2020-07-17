package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.w3c.dom.Node;

public interface CTComments extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTComments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcommentse3bdtype");


   CTAuthors getAuthors();

   void setAuthors(CTAuthors var1);

   CTAuthors addNewAuthors();

   CTCommentList getCommentList();

   void setCommentList(CTCommentList var1);

   CTCommentList addNewCommentList();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTComments newInstance() {
         return (CTComments)POIXMLTypeLoader.newInstance(CTComments.type, (XmlOptions)null);
      }

      public static CTComments newInstance(XmlOptions var0) {
         return (CTComments)POIXMLTypeLoader.newInstance(CTComments.type, var0);
      }

      public static CTComments parse(String var0) throws XmlException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, (XmlOptions)null);
      }

      public static CTComments parse(String var0, XmlOptions var1) throws XmlException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, var1);
      }

      public static CTComments parse(File var0) throws XmlException, IOException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, (XmlOptions)null);
      }

      public static CTComments parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, var1);
      }

      public static CTComments parse(URL var0) throws XmlException, IOException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, (XmlOptions)null);
      }

      public static CTComments parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, var1);
      }

      public static CTComments parse(InputStream var0) throws XmlException, IOException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, (XmlOptions)null);
      }

      public static CTComments parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, var1);
      }

      public static CTComments parse(Reader var0) throws XmlException, IOException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, (XmlOptions)null);
      }

      public static CTComments parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, var1);
      }

      public static CTComments parse(XMLStreamReader var0) throws XmlException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, (XmlOptions)null);
      }

      public static CTComments parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, var1);
      }

      public static CTComments parse(Node var0) throws XmlException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, (XmlOptions)null);
      }

      public static CTComments parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, var1);
      }

      public static CTComments parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, (XmlOptions)null);
      }

      public static CTComments parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTComments)POIXMLTypeLoader.parse(var0, CTComments.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTComments.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTComments.type, var1);
      }

   }
}
