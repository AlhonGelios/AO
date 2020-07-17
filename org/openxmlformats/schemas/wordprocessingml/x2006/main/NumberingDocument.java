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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering;
import org.w3c.dom.Node;

public interface NumberingDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(NumberingDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("numbering1c4ddoctype");


   CTNumbering getNumbering();

   void setNumbering(CTNumbering var1);

   CTNumbering addNewNumbering();


   public static final class Factory {

      public static NumberingDocument newInstance() {
         return (NumberingDocument)POIXMLTypeLoader.newInstance(NumberingDocument.type, (XmlOptions)null);
      }

      public static NumberingDocument newInstance(XmlOptions var0) {
         return (NumberingDocument)POIXMLTypeLoader.newInstance(NumberingDocument.type, var0);
      }

      public static NumberingDocument parse(String var0) throws XmlException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, (XmlOptions)null);
      }

      public static NumberingDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, var1);
      }

      public static NumberingDocument parse(File var0) throws XmlException, IOException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, (XmlOptions)null);
      }

      public static NumberingDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, var1);
      }

      public static NumberingDocument parse(URL var0) throws XmlException, IOException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, (XmlOptions)null);
      }

      public static NumberingDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, var1);
      }

      public static NumberingDocument parse(InputStream var0) throws XmlException, IOException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, (XmlOptions)null);
      }

      public static NumberingDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, var1);
      }

      public static NumberingDocument parse(Reader var0) throws XmlException, IOException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, (XmlOptions)null);
      }

      public static NumberingDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, var1);
      }

      public static NumberingDocument parse(XMLStreamReader var0) throws XmlException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, (XmlOptions)null);
      }

      public static NumberingDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, var1);
      }

      public static NumberingDocument parse(Node var0) throws XmlException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, (XmlOptions)null);
      }

      public static NumberingDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, var1);
      }

      public static NumberingDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, (XmlOptions)null);
      }

      public static NumberingDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (NumberingDocument)POIXMLTypeLoader.parse(var0, NumberingDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, NumberingDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, NumberingDocument.type, var1);
      }

   }
}
