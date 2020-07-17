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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation;
import org.w3c.dom.Node;

public interface PresentationDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PresentationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("presentation02f7doctype");


   CTPresentation getPresentation();

   void setPresentation(CTPresentation var1);

   CTPresentation addNewPresentation();


   public static final class Factory {

      public static PresentationDocument newInstance() {
         return (PresentationDocument)POIXMLTypeLoader.newInstance(PresentationDocument.type, (XmlOptions)null);
      }

      public static PresentationDocument newInstance(XmlOptions var0) {
         return (PresentationDocument)POIXMLTypeLoader.newInstance(PresentationDocument.type, var0);
      }

      public static PresentationDocument parse(String var0) throws XmlException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, (XmlOptions)null);
      }

      public static PresentationDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, var1);
      }

      public static PresentationDocument parse(File var0) throws XmlException, IOException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, (XmlOptions)null);
      }

      public static PresentationDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, var1);
      }

      public static PresentationDocument parse(URL var0) throws XmlException, IOException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, (XmlOptions)null);
      }

      public static PresentationDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, var1);
      }

      public static PresentationDocument parse(InputStream var0) throws XmlException, IOException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, (XmlOptions)null);
      }

      public static PresentationDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, var1);
      }

      public static PresentationDocument parse(Reader var0) throws XmlException, IOException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, (XmlOptions)null);
      }

      public static PresentationDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, var1);
      }

      public static PresentationDocument parse(XMLStreamReader var0) throws XmlException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, (XmlOptions)null);
      }

      public static PresentationDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, var1);
      }

      public static PresentationDocument parse(Node var0) throws XmlException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, (XmlOptions)null);
      }

      public static PresentationDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, var1);
      }

      public static PresentationDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, (XmlOptions)null);
      }

      public static PresentationDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (PresentationDocument)POIXMLTypeLoader.parse(var0, PresentationDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PresentationDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PresentationDocument.type, var1);
      }

   }
}
