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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes;
import org.w3c.dom.Node;

public interface EndnotesDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(EndnotesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("endnotes960edoctype");


   CTEndnotes getEndnotes();

   void setEndnotes(CTEndnotes var1);

   CTEndnotes addNewEndnotes();


   public static final class Factory {

      public static EndnotesDocument newInstance() {
         return (EndnotesDocument)POIXMLTypeLoader.newInstance(EndnotesDocument.type, (XmlOptions)null);
      }

      public static EndnotesDocument newInstance(XmlOptions var0) {
         return (EndnotesDocument)POIXMLTypeLoader.newInstance(EndnotesDocument.type, var0);
      }

      public static EndnotesDocument parse(String var0) throws XmlException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, (XmlOptions)null);
      }

      public static EndnotesDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, var1);
      }

      public static EndnotesDocument parse(File var0) throws XmlException, IOException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, (XmlOptions)null);
      }

      public static EndnotesDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, var1);
      }

      public static EndnotesDocument parse(URL var0) throws XmlException, IOException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, (XmlOptions)null);
      }

      public static EndnotesDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, var1);
      }

      public static EndnotesDocument parse(InputStream var0) throws XmlException, IOException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, (XmlOptions)null);
      }

      public static EndnotesDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, var1);
      }

      public static EndnotesDocument parse(Reader var0) throws XmlException, IOException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, (XmlOptions)null);
      }

      public static EndnotesDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, var1);
      }

      public static EndnotesDocument parse(XMLStreamReader var0) throws XmlException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, (XmlOptions)null);
      }

      public static EndnotesDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, var1);
      }

      public static EndnotesDocument parse(Node var0) throws XmlException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, (XmlOptions)null);
      }

      public static EndnotesDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, var1);
      }

      public static EndnotesDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, (XmlOptions)null);
      }

      public static EndnotesDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (EndnotesDocument)POIXMLTypeLoader.parse(var0, EndnotesDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, EndnotesDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, EndnotesDocument.type, var1);
      }

   }
}
