package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance;
import org.w3c.dom.Node;

public interface CTInline extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTInline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctinline5726type");


   CTPositiveSize2D getExtent();

   void setExtent(CTPositiveSize2D var1);

   CTPositiveSize2D addNewExtent();

   CTEffectExtent getEffectExtent();

   boolean isSetEffectExtent();

   void setEffectExtent(CTEffectExtent var1);

   CTEffectExtent addNewEffectExtent();

   void unsetEffectExtent();

   CTNonVisualDrawingProps getDocPr();

   void setDocPr(CTNonVisualDrawingProps var1);

   CTNonVisualDrawingProps addNewDocPr();

   CTNonVisualGraphicFrameProperties getCNvGraphicFramePr();

   boolean isSetCNvGraphicFramePr();

   void setCNvGraphicFramePr(CTNonVisualGraphicFrameProperties var1);

   CTNonVisualGraphicFrameProperties addNewCNvGraphicFramePr();

   void unsetCNvGraphicFramePr();

   CTGraphicalObject getGraphic();

   void setGraphic(CTGraphicalObject var1);

   CTGraphicalObject addNewGraphic();

   long getDistT();

   STWrapDistance xgetDistT();

   boolean isSetDistT();

   void setDistT(long var1);

   void xsetDistT(STWrapDistance var1);

   void unsetDistT();

   long getDistB();

   STWrapDistance xgetDistB();

   boolean isSetDistB();

   void setDistB(long var1);

   void xsetDistB(STWrapDistance var1);

   void unsetDistB();

   long getDistL();

   STWrapDistance xgetDistL();

   boolean isSetDistL();

   void setDistL(long var1);

   void xsetDistL(STWrapDistance var1);

   void unsetDistL();

   long getDistR();

   STWrapDistance xgetDistR();

   boolean isSetDistR();

   void setDistR(long var1);

   void xsetDistR(STWrapDistance var1);

   void unsetDistR();


   public static final class Factory {

      public static CTInline newInstance() {
         return (CTInline)POIXMLTypeLoader.newInstance(CTInline.type, (XmlOptions)null);
      }

      public static CTInline newInstance(XmlOptions var0) {
         return (CTInline)POIXMLTypeLoader.newInstance(CTInline.type, var0);
      }

      public static CTInline parse(String var0) throws XmlException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, (XmlOptions)null);
      }

      public static CTInline parse(String var0, XmlOptions var1) throws XmlException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, var1);
      }

      public static CTInline parse(File var0) throws XmlException, IOException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, (XmlOptions)null);
      }

      public static CTInline parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, var1);
      }

      public static CTInline parse(URL var0) throws XmlException, IOException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, (XmlOptions)null);
      }

      public static CTInline parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, var1);
      }

      public static CTInline parse(InputStream var0) throws XmlException, IOException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, (XmlOptions)null);
      }

      public static CTInline parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, var1);
      }

      public static CTInline parse(Reader var0) throws XmlException, IOException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, (XmlOptions)null);
      }

      public static CTInline parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, var1);
      }

      public static CTInline parse(XMLStreamReader var0) throws XmlException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, (XmlOptions)null);
      }

      public static CTInline parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, var1);
      }

      public static CTInline parse(Node var0) throws XmlException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, (XmlOptions)null);
      }

      public static CTInline parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, var1);
      }

      public static CTInline parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, (XmlOptions)null);
      }

      public static CTInline parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTInline)POIXMLTypeLoader.parse(var0, CTInline.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTInline.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTInline.type, var1);
      }

   }
}
