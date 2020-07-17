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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook;
import org.w3c.dom.Node;

public interface WorkbookDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(WorkbookDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("workbookec17doctype");


   CTWorkbook getWorkbook();

   void setWorkbook(CTWorkbook var1);

   CTWorkbook addNewWorkbook();


   public static final class Factory {

      public static WorkbookDocument newInstance() {
         return (WorkbookDocument)POIXMLTypeLoader.newInstance(WorkbookDocument.type, (XmlOptions)null);
      }

      public static WorkbookDocument newInstance(XmlOptions var0) {
         return (WorkbookDocument)POIXMLTypeLoader.newInstance(WorkbookDocument.type, var0);
      }

      public static WorkbookDocument parse(String var0) throws XmlException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, (XmlOptions)null);
      }

      public static WorkbookDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, var1);
      }

      public static WorkbookDocument parse(File var0) throws XmlException, IOException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, (XmlOptions)null);
      }

      public static WorkbookDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, var1);
      }

      public static WorkbookDocument parse(URL var0) throws XmlException, IOException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, (XmlOptions)null);
      }

      public static WorkbookDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, var1);
      }

      public static WorkbookDocument parse(InputStream var0) throws XmlException, IOException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, (XmlOptions)null);
      }

      public static WorkbookDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, var1);
      }

      public static WorkbookDocument parse(Reader var0) throws XmlException, IOException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, (XmlOptions)null);
      }

      public static WorkbookDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, var1);
      }

      public static WorkbookDocument parse(XMLStreamReader var0) throws XmlException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, (XmlOptions)null);
      }

      public static WorkbookDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, var1);
      }

      public static WorkbookDocument parse(Node var0) throws XmlException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, (XmlOptions)null);
      }

      public static WorkbookDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, var1);
      }

      public static WorkbookDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, (XmlOptions)null);
      }

      public static WorkbookDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (WorkbookDocument)POIXMLTypeLoader.parse(var0, WorkbookDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, WorkbookDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, WorkbookDocument.type, var1);
      }

   }
}
