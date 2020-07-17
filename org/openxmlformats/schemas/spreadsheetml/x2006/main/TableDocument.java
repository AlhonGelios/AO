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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable;
import org.w3c.dom.Node;

public interface TableDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(TableDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("table0b99doctype");


   CTTable getTable();

   void setTable(CTTable var1);

   CTTable addNewTable();


   public static final class Factory {

      public static TableDocument newInstance() {
         return (TableDocument)POIXMLTypeLoader.newInstance(TableDocument.type, (XmlOptions)null);
      }

      public static TableDocument newInstance(XmlOptions var0) {
         return (TableDocument)POIXMLTypeLoader.newInstance(TableDocument.type, var0);
      }

      public static TableDocument parse(String var0) throws XmlException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, (XmlOptions)null);
      }

      public static TableDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, var1);
      }

      public static TableDocument parse(File var0) throws XmlException, IOException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, (XmlOptions)null);
      }

      public static TableDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, var1);
      }

      public static TableDocument parse(URL var0) throws XmlException, IOException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, (XmlOptions)null);
      }

      public static TableDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, var1);
      }

      public static TableDocument parse(InputStream var0) throws XmlException, IOException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, (XmlOptions)null);
      }

      public static TableDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, var1);
      }

      public static TableDocument parse(Reader var0) throws XmlException, IOException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, (XmlOptions)null);
      }

      public static TableDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, var1);
      }

      public static TableDocument parse(XMLStreamReader var0) throws XmlException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, (XmlOptions)null);
      }

      public static TableDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, var1);
      }

      public static TableDocument parse(Node var0) throws XmlException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, (XmlOptions)null);
      }

      public static TableDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, var1);
      }

      public static TableDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, (XmlOptions)null);
      }

      public static TableDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (TableDocument)POIXMLTypeLoader.parse(var0, TableDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, TableDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, TableDocument.type, var1);
      }

   }
}
