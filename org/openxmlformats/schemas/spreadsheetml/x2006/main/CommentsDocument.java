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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments;
import org.w3c.dom.Node;

public interface CommentsDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CommentsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("comments4c11doctype");


   CTComments getComments();

   void setComments(CTComments var1);

   CTComments addNewComments();


   public static final class Factory {

      public static CommentsDocument newInstance() {
         return (CommentsDocument)POIXMLTypeLoader.newInstance(CommentsDocument.type, (XmlOptions)null);
      }

      public static CommentsDocument newInstance(XmlOptions var0) {
         return (CommentsDocument)POIXMLTypeLoader.newInstance(CommentsDocument.type, var0);
      }

      public static CommentsDocument parse(String var0) throws XmlException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, (XmlOptions)null);
      }

      public static CommentsDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, var1);
      }

      public static CommentsDocument parse(File var0) throws XmlException, IOException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, (XmlOptions)null);
      }

      public static CommentsDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, var1);
      }

      public static CommentsDocument parse(URL var0) throws XmlException, IOException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, (XmlOptions)null);
      }

      public static CommentsDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, var1);
      }

      public static CommentsDocument parse(InputStream var0) throws XmlException, IOException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, (XmlOptions)null);
      }

      public static CommentsDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, var1);
      }

      public static CommentsDocument parse(Reader var0) throws XmlException, IOException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, (XmlOptions)null);
      }

      public static CommentsDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, var1);
      }

      public static CommentsDocument parse(XMLStreamReader var0) throws XmlException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, (XmlOptions)null);
      }

      public static CommentsDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, var1);
      }

      public static CommentsDocument parse(Node var0) throws XmlException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, (XmlOptions)null);
      }

      public static CommentsDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, var1);
      }

      public static CommentsDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, (XmlOptions)null);
      }

      public static CommentsDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CommentsDocument)POIXMLTypeLoader.parse(var0, CommentsDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CommentsDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CommentsDocument.type, var1);
      }

   }
}
