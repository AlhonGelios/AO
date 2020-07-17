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
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGroupDrawingShapeProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps;
import org.w3c.dom.Node;

public interface CTGroupShapeNonVisual extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGroupShapeNonVisual.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgroupshapenonvisual3e44type");


   CTNonVisualDrawingProps getCNvPr();

   void setCNvPr(CTNonVisualDrawingProps var1);

   CTNonVisualDrawingProps addNewCNvPr();

   CTNonVisualGroupDrawingShapeProps getCNvGrpSpPr();

   void setCNvGrpSpPr(CTNonVisualGroupDrawingShapeProps var1);

   CTNonVisualGroupDrawingShapeProps addNewCNvGrpSpPr();

   CTApplicationNonVisualDrawingProps getNvPr();

   void setNvPr(CTApplicationNonVisualDrawingProps var1);

   CTApplicationNonVisualDrawingProps addNewNvPr();


   public static final class Factory {

      public static CTGroupShapeNonVisual newInstance() {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.newInstance(CTGroupShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTGroupShapeNonVisual newInstance(XmlOptions var0) {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.newInstance(CTGroupShapeNonVisual.type, var0);
      }

      public static CTGroupShapeNonVisual parse(String var0) throws XmlException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTGroupShapeNonVisual parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, var1);
      }

      public static CTGroupShapeNonVisual parse(File var0) throws XmlException, IOException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTGroupShapeNonVisual parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, var1);
      }

      public static CTGroupShapeNonVisual parse(URL var0) throws XmlException, IOException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTGroupShapeNonVisual parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, var1);
      }

      public static CTGroupShapeNonVisual parse(InputStream var0) throws XmlException, IOException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTGroupShapeNonVisual parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, var1);
      }

      public static CTGroupShapeNonVisual parse(Reader var0) throws XmlException, IOException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTGroupShapeNonVisual parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, var1);
      }

      public static CTGroupShapeNonVisual parse(XMLStreamReader var0) throws XmlException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTGroupShapeNonVisual parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, var1);
      }

      public static CTGroupShapeNonVisual parse(Node var0) throws XmlException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTGroupShapeNonVisual parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, var1);
      }

      public static CTGroupShapeNonVisual parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, (XmlOptions)null);
      }

      public static CTGroupShapeNonVisual parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGroupShapeNonVisual)POIXMLTypeLoader.parse(var0, CTGroupShapeNonVisual.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroupShapeNonVisual.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroupShapeNonVisual.type, var1);
      }

   }
}
