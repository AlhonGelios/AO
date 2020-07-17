package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType;
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
import org.w3c.dom.Node;

public interface VisioDocumentDocument1 extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(VisioDocumentDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("visiodocumentd431doctype");


   VisioDocumentType getVisioDocument();

   void setVisioDocument(VisioDocumentType var1);

   VisioDocumentType addNewVisioDocument();


   public static final class Factory {

      public static VisioDocumentDocument1 newInstance() {
         return (VisioDocumentDocument1)POIXMLTypeLoader.newInstance(VisioDocumentDocument1.type, (XmlOptions)null);
      }

      public static VisioDocumentDocument1 newInstance(XmlOptions var0) {
         return (VisioDocumentDocument1)POIXMLTypeLoader.newInstance(VisioDocumentDocument1.type, var0);
      }

      public static VisioDocumentDocument1 parse(String var0) throws XmlException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, (XmlOptions)null);
      }

      public static VisioDocumentDocument1 parse(String var0, XmlOptions var1) throws XmlException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, var1);
      }

      public static VisioDocumentDocument1 parse(File var0) throws XmlException, IOException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, (XmlOptions)null);
      }

      public static VisioDocumentDocument1 parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, var1);
      }

      public static VisioDocumentDocument1 parse(URL var0) throws XmlException, IOException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, (XmlOptions)null);
      }

      public static VisioDocumentDocument1 parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, var1);
      }

      public static VisioDocumentDocument1 parse(InputStream var0) throws XmlException, IOException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, (XmlOptions)null);
      }

      public static VisioDocumentDocument1 parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, var1);
      }

      public static VisioDocumentDocument1 parse(Reader var0) throws XmlException, IOException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, (XmlOptions)null);
      }

      public static VisioDocumentDocument1 parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, var1);
      }

      public static VisioDocumentDocument1 parse(XMLStreamReader var0) throws XmlException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, (XmlOptions)null);
      }

      public static VisioDocumentDocument1 parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, var1);
      }

      public static VisioDocumentDocument1 parse(Node var0) throws XmlException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, (XmlOptions)null);
      }

      public static VisioDocumentDocument1 parse(Node var0, XmlOptions var1) throws XmlException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, var1);
      }

      public static VisioDocumentDocument1 parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, (XmlOptions)null);
      }

      public static VisioDocumentDocument1 parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (VisioDocumentDocument1)POIXMLTypeLoader.parse(var0, VisioDocumentDocument1.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, VisioDocumentDocument1.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, VisioDocumentDocument1.type, var1);
      }

   }
}
