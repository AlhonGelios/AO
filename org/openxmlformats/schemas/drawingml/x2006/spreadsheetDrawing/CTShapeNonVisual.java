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
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingShapeProps;
import org.w3c.dom.Node;

public interface CTShapeNonVisual extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTShapeNonVisual.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctshapenonvisuale220type");


   CTNonVisualDrawingProps getCNvPr();

   void setCNvPr(CTNonVisualDrawingProps var1);

   CTNonVisualDrawingProps addNewCNvPr();

   CTNonVisualDrawingShapeProps getCNvSpPr();

   void setCNvSpPr(CTNonVisualDrawingShapeProps var1);

   CTNonVisualDrawingShapeProps addNewCNvSpPr();


   public static final class Factory {

      public static CTShapeNonVisual newInstance() {
         return (CTShapeNonVisual)POIXMLTypeLoader.newInstance(CTShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTShapeNonVisual newInstance(XmlOptions var0) {
         return (CTShapeNonVisual)POIXMLTypeLoader.newInstance(CTShapeNonVisual.type, var0);
      }

      public static CTShapeNonVisual parse(String var0) throws XmlException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTShapeNonVisual parse(String var0, XmlOptions var1) throws XmlException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, var1);
      }

      public static CTShapeNonVisual parse(File var0) throws XmlException, IOException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTShapeNonVisual parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, var1);
      }

      public static CTShapeNonVisual parse(URL var0) throws XmlException, IOException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTShapeNonVisual parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, var1);
      }

      public static CTShapeNonVisual parse(InputStream var0) throws XmlException, IOException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTShapeNonVisual parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, var1);
      }

      public static CTShapeNonVisual parse(Reader var0) throws XmlException, IOException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTShapeNonVisual parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, var1);
      }

      public static CTShapeNonVisual parse(XMLStreamReader var0) throws XmlException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTShapeNonVisual parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, var1);
      }

      public static CTShapeNonVisual parse(Node var0) throws XmlException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTShapeNonVisual parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, var1);
      }

      public static CTShapeNonVisual parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTShapeNonVisual parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTShapeNonVisual)POIXMLTypeLoader.parse(var0, CTShapeNonVisual.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShapeNonVisual.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShapeNonVisual.type, var1);
      }

   }
}
