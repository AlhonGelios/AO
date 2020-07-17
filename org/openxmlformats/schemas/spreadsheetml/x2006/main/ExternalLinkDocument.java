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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink;
import org.w3c.dom.Node;

public interface ExternalLinkDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ExternalLinkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("externallinkb4c2doctype");


   CTExternalLink getExternalLink();

   void setExternalLink(CTExternalLink var1);

   CTExternalLink addNewExternalLink();


   public static final class Factory {

      public static ExternalLinkDocument newInstance() {
         return (ExternalLinkDocument)POIXMLTypeLoader.newInstance(ExternalLinkDocument.type, (XmlOptions)null);
      }

      public static ExternalLinkDocument newInstance(XmlOptions var0) {
         return (ExternalLinkDocument)POIXMLTypeLoader.newInstance(ExternalLinkDocument.type, var0);
      }

      public static ExternalLinkDocument parse(String var0) throws XmlException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, (XmlOptions)null);
      }

      public static ExternalLinkDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, var1);
      }

      public static ExternalLinkDocument parse(File var0) throws XmlException, IOException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, (XmlOptions)null);
      }

      public static ExternalLinkDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, var1);
      }

      public static ExternalLinkDocument parse(URL var0) throws XmlException, IOException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, (XmlOptions)null);
      }

      public static ExternalLinkDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, var1);
      }

      public static ExternalLinkDocument parse(InputStream var0) throws XmlException, IOException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, (XmlOptions)null);
      }

      public static ExternalLinkDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, var1);
      }

      public static ExternalLinkDocument parse(Reader var0) throws XmlException, IOException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, (XmlOptions)null);
      }

      public static ExternalLinkDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, var1);
      }

      public static ExternalLinkDocument parse(XMLStreamReader var0) throws XmlException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, (XmlOptions)null);
      }

      public static ExternalLinkDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, var1);
      }

      public static ExternalLinkDocument parse(Node var0) throws XmlException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, (XmlOptions)null);
      }

      public static ExternalLinkDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, var1);
      }

      public static ExternalLinkDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, (XmlOptions)null);
      }

      public static ExternalLinkDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (ExternalLinkDocument)POIXMLTypeLoader.parse(var0, ExternalLinkDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ExternalLinkDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ExternalLinkDocument.type, var1);
      }

   }
}
