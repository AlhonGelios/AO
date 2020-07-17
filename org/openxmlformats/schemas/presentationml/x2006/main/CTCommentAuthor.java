package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.presentationml.x2006.main.STName;
import org.w3c.dom.Node;

public interface CTCommentAuthor extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCommentAuthor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcommentauthora405type");


   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getId();

   XmlUnsignedInt xgetId();

   void setId(long var1);

   void xsetId(XmlUnsignedInt var1);

   String getName();

   STName xgetName();

   void setName(String var1);

   void xsetName(STName var1);

   String getInitials();

   STName xgetInitials();

   void setInitials(String var1);

   void xsetInitials(STName var1);

   long getLastIdx();

   XmlUnsignedInt xgetLastIdx();

   void setLastIdx(long var1);

   void xsetLastIdx(XmlUnsignedInt var1);

   long getClrIdx();

   XmlUnsignedInt xgetClrIdx();

   void setClrIdx(long var1);

   void xsetClrIdx(XmlUnsignedInt var1);


   public static final class Factory {

      public static CTCommentAuthor newInstance() {
         return (CTCommentAuthor)POIXMLTypeLoader.newInstance(CTCommentAuthor.type, (XmlOptions)null);
      }

      public static CTCommentAuthor newInstance(XmlOptions var0) {
         return (CTCommentAuthor)POIXMLTypeLoader.newInstance(CTCommentAuthor.type, var0);
      }

      public static CTCommentAuthor parse(String var0) throws XmlException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, (XmlOptions)null);
      }

      public static CTCommentAuthor parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, var1);
      }

      public static CTCommentAuthor parse(File var0) throws XmlException, IOException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, (XmlOptions)null);
      }

      public static CTCommentAuthor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, var1);
      }

      public static CTCommentAuthor parse(URL var0) throws XmlException, IOException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, (XmlOptions)null);
      }

      public static CTCommentAuthor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, var1);
      }

      public static CTCommentAuthor parse(InputStream var0) throws XmlException, IOException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, (XmlOptions)null);
      }

      public static CTCommentAuthor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, var1);
      }

      public static CTCommentAuthor parse(Reader var0) throws XmlException, IOException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, (XmlOptions)null);
      }

      public static CTCommentAuthor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, var1);
      }

      public static CTCommentAuthor parse(XMLStreamReader var0) throws XmlException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, (XmlOptions)null);
      }

      public static CTCommentAuthor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, var1);
      }

      public static CTCommentAuthor parse(Node var0) throws XmlException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, (XmlOptions)null);
      }

      public static CTCommentAuthor parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, var1);
      }

      public static CTCommentAuthor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, (XmlOptions)null);
      }

      public static CTCommentAuthor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCommentAuthor)POIXMLTypeLoader.parse(var0, CTCommentAuthor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCommentAuthor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCommentAuthor.type, var1);
      }

   }
}
