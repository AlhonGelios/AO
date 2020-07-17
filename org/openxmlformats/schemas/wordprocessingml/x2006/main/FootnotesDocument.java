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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes;
import org.w3c.dom.Node;

public interface FootnotesDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FootnotesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("footnotes8773doctype");


   CTFootnotes getFootnotes();

   void setFootnotes(CTFootnotes var1);

   CTFootnotes addNewFootnotes();


   public static final class Factory {

      public static FootnotesDocument newInstance() {
         return (FootnotesDocument)POIXMLTypeLoader.newInstance(FootnotesDocument.type, (XmlOptions)null);
      }

      public static FootnotesDocument newInstance(XmlOptions var0) {
         return (FootnotesDocument)POIXMLTypeLoader.newInstance(FootnotesDocument.type, var0);
      }

      public static FootnotesDocument parse(String var0) throws XmlException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, (XmlOptions)null);
      }

      public static FootnotesDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, var1);
      }

      public static FootnotesDocument parse(File var0) throws XmlException, IOException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, (XmlOptions)null);
      }

      public static FootnotesDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, var1);
      }

      public static FootnotesDocument parse(URL var0) throws XmlException, IOException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, (XmlOptions)null);
      }

      public static FootnotesDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, var1);
      }

      public static FootnotesDocument parse(InputStream var0) throws XmlException, IOException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, (XmlOptions)null);
      }

      public static FootnotesDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, var1);
      }

      public static FootnotesDocument parse(Reader var0) throws XmlException, IOException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, (XmlOptions)null);
      }

      public static FootnotesDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, var1);
      }

      public static FootnotesDocument parse(XMLStreamReader var0) throws XmlException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, (XmlOptions)null);
      }

      public static FootnotesDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, var1);
      }

      public static FootnotesDocument parse(Node var0) throws XmlException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, (XmlOptions)null);
      }

      public static FootnotesDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, var1);
      }

      public static FootnotesDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, (XmlOptions)null);
      }

      public static FootnotesDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (FootnotesDocument)POIXMLTypeLoader.parse(var0, FootnotesDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, FootnotesDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, FootnotesDocument.type, var1);
      }

   }
}
