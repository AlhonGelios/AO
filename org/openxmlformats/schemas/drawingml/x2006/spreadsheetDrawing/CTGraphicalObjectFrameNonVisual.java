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
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties;
import org.w3c.dom.Node;

public interface CTGraphicalObjectFrameNonVisual extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGraphicalObjectFrameNonVisual.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgraphicalobjectframenonvisual833ctype");


   CTNonVisualDrawingProps getCNvPr();

   void setCNvPr(CTNonVisualDrawingProps var1);

   CTNonVisualDrawingProps addNewCNvPr();

   CTNonVisualGraphicFrameProperties getCNvGraphicFramePr();

   void setCNvGraphicFramePr(CTNonVisualGraphicFrameProperties var1);

   CTNonVisualGraphicFrameProperties addNewCNvGraphicFramePr();


   public static final class Factory {

      public static CTGraphicalObjectFrameNonVisual newInstance() {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.newInstance(CTGraphicalObjectFrameNonVisual.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameNonVisual newInstance(XmlOptions var0) {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.newInstance(CTGraphicalObjectFrameNonVisual.type, var0);
      }

      public static CTGraphicalObjectFrameNonVisual parse(String var0) throws XmlException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameNonVisual parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, var1);
      }

      public static CTGraphicalObjectFrameNonVisual parse(File var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameNonVisual parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, var1);
      }

      public static CTGraphicalObjectFrameNonVisual parse(URL var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameNonVisual parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, var1);
      }

      public static CTGraphicalObjectFrameNonVisual parse(InputStream var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameNonVisual parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, var1);
      }

      public static CTGraphicalObjectFrameNonVisual parse(Reader var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameNonVisual parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, var1);
      }

      public static CTGraphicalObjectFrameNonVisual parse(XMLStreamReader var0) throws XmlException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameNonVisual parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, var1);
      }

      public static CTGraphicalObjectFrameNonVisual parse(Node var0) throws XmlException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameNonVisual parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, var1);
      }

      public static CTGraphicalObjectFrameNonVisual parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrameNonVisual parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGraphicalObjectFrameNonVisual)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrameNonVisual.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGraphicalObjectFrameNonVisual.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGraphicalObjectFrameNonVisual.type, var1);
      }

   }
}
