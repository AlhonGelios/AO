package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.w3c.dom.Node;

public interface CTConnectorNonVisual extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTConnectorNonVisual.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctconnectornonvisual1a74type");


   CTNonVisualDrawingProps getCNvPr();

   void setCNvPr(CTNonVisualDrawingProps var1);

   CTNonVisualDrawingProps addNewCNvPr();

   CTNonVisualConnectorProperties getCNvCxnSpPr();

   void setCNvCxnSpPr(CTNonVisualConnectorProperties var1);

   CTNonVisualConnectorProperties addNewCNvCxnSpPr();


   public static final class Factory {

      public static CTConnectorNonVisual newInstance() {
         return (CTConnectorNonVisual)POIXMLTypeLoader.newInstance(CTConnectorNonVisual.type, (XmlOptions)null);
      }

      public static CTConnectorNonVisual newInstance(XmlOptions var0) {
         return (CTConnectorNonVisual)POIXMLTypeLoader.newInstance(CTConnectorNonVisual.type, var0);
      }

      public static CTConnectorNonVisual parse(String var0) throws XmlException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, (XmlOptions)null);
      }

      public static CTConnectorNonVisual parse(String var0, XmlOptions var1) throws XmlException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, var1);
      }

      public static CTConnectorNonVisual parse(File var0) throws XmlException, IOException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, (XmlOptions)null);
      }

      public static CTConnectorNonVisual parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, var1);
      }

      public static CTConnectorNonVisual parse(URL var0) throws XmlException, IOException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, (XmlOptions)null);
      }

      public static CTConnectorNonVisual parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, var1);
      }

      public static CTConnectorNonVisual parse(InputStream var0) throws XmlException, IOException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, (XmlOptions)null);
      }

      public static CTConnectorNonVisual parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, var1);
      }

      public static CTConnectorNonVisual parse(Reader var0) throws XmlException, IOException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, (XmlOptions)null);
      }

      public static CTConnectorNonVisual parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, var1);
      }

      public static CTConnectorNonVisual parse(XMLStreamReader var0) throws XmlException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, (XmlOptions)null);
      }

      public static CTConnectorNonVisual parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, var1);
      }

      public static CTConnectorNonVisual parse(Node var0) throws XmlException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, (XmlOptions)null);
      }

      public static CTConnectorNonVisual parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, var1);
      }

      public static CTConnectorNonVisual parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, (XmlOptions)null);
      }

      public static CTConnectorNonVisual parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTConnectorNonVisual)POIXMLTypeLoader.parse(var0, CTConnectorNonVisual.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTConnectorNonVisual.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTConnectorNonVisual.type, var1);
      }

   }
}
