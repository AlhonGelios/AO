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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1;
import org.w3c.dom.Node;

public interface DocumentDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(DocumentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("document2bd9doctype");


   CTDocument1 getDocument();

   void setDocument(CTDocument1 var1);

   CTDocument1 addNewDocument();


   public static final class Factory {

      public static DocumentDocument newInstance() {
         return (DocumentDocument)POIXMLTypeLoader.newInstance(DocumentDocument.type, (XmlOptions)null);
      }

      public static DocumentDocument newInstance(XmlOptions var0) {
         return (DocumentDocument)POIXMLTypeLoader.newInstance(DocumentDocument.type, var0);
      }

      public static DocumentDocument parse(String var0) throws XmlException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, (XmlOptions)null);
      }

      public static DocumentDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, var1);
      }

      public static DocumentDocument parse(File var0) throws XmlException, IOException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, (XmlOptions)null);
      }

      public static DocumentDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, var1);
      }

      public static DocumentDocument parse(URL var0) throws XmlException, IOException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, (XmlOptions)null);
      }

      public static DocumentDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, var1);
      }

      public static DocumentDocument parse(InputStream var0) throws XmlException, IOException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, (XmlOptions)null);
      }

      public static DocumentDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, var1);
      }

      public static DocumentDocument parse(Reader var0) throws XmlException, IOException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, (XmlOptions)null);
      }

      public static DocumentDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, var1);
      }

      public static DocumentDocument parse(XMLStreamReader var0) throws XmlException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, (XmlOptions)null);
      }

      public static DocumentDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, var1);
      }

      public static DocumentDocument parse(Node var0) throws XmlException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, (XmlOptions)null);
      }

      public static DocumentDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, var1);
      }

      public static DocumentDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, (XmlOptions)null);
      }

      public static DocumentDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (DocumentDocument)POIXMLTypeLoader.parse(var0, DocumentDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, DocumentDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, DocumentDocument.type, var1);
      }

   }
}
