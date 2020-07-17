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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;
import org.w3c.dom.Node;

public interface WorksheetDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(WorksheetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("worksheetf539doctype");


   CTWorksheet getWorksheet();

   void setWorksheet(CTWorksheet var1);

   CTWorksheet addNewWorksheet();


   public static final class Factory {

      public static WorksheetDocument newInstance() {
         return (WorksheetDocument)POIXMLTypeLoader.newInstance(WorksheetDocument.type, (XmlOptions)null);
      }

      public static WorksheetDocument newInstance(XmlOptions var0) {
         return (WorksheetDocument)POIXMLTypeLoader.newInstance(WorksheetDocument.type, var0);
      }

      public static WorksheetDocument parse(String var0) throws XmlException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, (XmlOptions)null);
      }

      public static WorksheetDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, var1);
      }

      public static WorksheetDocument parse(File var0) throws XmlException, IOException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, (XmlOptions)null);
      }

      public static WorksheetDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, var1);
      }

      public static WorksheetDocument parse(URL var0) throws XmlException, IOException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, (XmlOptions)null);
      }

      public static WorksheetDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, var1);
      }

      public static WorksheetDocument parse(InputStream var0) throws XmlException, IOException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, (XmlOptions)null);
      }

      public static WorksheetDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, var1);
      }

      public static WorksheetDocument parse(Reader var0) throws XmlException, IOException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, (XmlOptions)null);
      }

      public static WorksheetDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, var1);
      }

      public static WorksheetDocument parse(XMLStreamReader var0) throws XmlException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, (XmlOptions)null);
      }

      public static WorksheetDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, var1);
      }

      public static WorksheetDocument parse(Node var0) throws XmlException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, (XmlOptions)null);
      }

      public static WorksheetDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, var1);
      }

      public static WorksheetDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, (XmlOptions)null);
      }

      public static WorksheetDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (WorksheetDocument)POIXMLTypeLoader.parse(var0, WorksheetDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, WorksheetDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, WorksheetDocument.type, var1);
      }

   }
}
