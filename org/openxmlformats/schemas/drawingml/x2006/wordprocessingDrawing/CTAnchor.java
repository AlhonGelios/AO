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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance;
import org.w3c.dom.Node;

public interface CTAnchor extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTAnchor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctanchorff8atype");


   CTPoint2D getSimplePos();

   void setSimplePos(CTPoint2D var1);

   CTPoint2D addNewSimplePos();

   CTPosH getPositionH();

   void setPositionH(CTPosH var1);

   CTPosH addNewPositionH();

   CTPosV getPositionV();

   void setPositionV(CTPosV var1);

   CTPosV addNewPositionV();

   CTPositiveSize2D getExtent();

   void setExtent(CTPositiveSize2D var1);

   CTPositiveSize2D addNewExtent();

   CTEffectExtent getEffectExtent();

   boolean isSetEffectExtent();

   void setEffectExtent(CTEffectExtent var1);

   CTEffectExtent addNewEffectExtent();

   void unsetEffectExtent();

   CTWrapNone getWrapNone();

   boolean isSetWrapNone();

   void setWrapNone(CTWrapNone var1);

   CTWrapNone addNewWrapNone();

   void unsetWrapNone();

   CTWrapSquare getWrapSquare();

   boolean isSetWrapSquare();

   void setWrapSquare(CTWrapSquare var1);

   CTWrapSquare addNewWrapSquare();

   void unsetWrapSquare();

   CTWrapTight getWrapTight();

   boolean isSetWrapTight();

   void setWrapTight(CTWrapTight var1);

   CTWrapTight addNewWrapTight();

   void unsetWrapTight();

   CTWrapThrough getWrapThrough();

   boolean isSetWrapThrough();

   void setWrapThrough(CTWrapThrough var1);

   CTWrapThrough addNewWrapThrough();

   void unsetWrapThrough();

   CTWrapTopBottom getWrapTopAndBottom();

   boolean isSetWrapTopAndBottom();

   void setWrapTopAndBottom(CTWrapTopBottom var1);

   CTWrapTopBottom addNewWrapTopAndBottom();

   void unsetWrapTopAndBottom();

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

   boolean getSimplePos2();

   XmlBoolean xgetSimplePos2();

   boolean isSetSimplePos2();

   void setSimplePos2(boolean var1);

   void xsetSimplePos2(XmlBoolean var1);

   void unsetSimplePos2();

   long getRelativeHeight();

   XmlUnsignedInt xgetRelativeHeight();

   void setRelativeHeight(long var1);

   void xsetRelativeHeight(XmlUnsignedInt var1);

   boolean getBehindDoc();

   XmlBoolean xgetBehindDoc();

   void setBehindDoc(boolean var1);

   void xsetBehindDoc(XmlBoolean var1);

   boolean getLocked();

   XmlBoolean xgetLocked();

   void setLocked(boolean var1);

   void xsetLocked(XmlBoolean var1);

   boolean getLayoutInCell();

   XmlBoolean xgetLayoutInCell();

   void setLayoutInCell(boolean var1);

   void xsetLayoutInCell(XmlBoolean var1);

   boolean getHidden();

   XmlBoolean xgetHidden();

   boolean isSetHidden();

   void setHidden(boolean var1);

   void xsetHidden(XmlBoolean var1);

   void unsetHidden();

   boolean getAllowOverlap();

   XmlBoolean xgetAllowOverlap();

   void setAllowOverlap(boolean var1);

   void xsetAllowOverlap(XmlBoolean var1);


   public static final class Factory {

      public static CTAnchor newInstance() {
         return (CTAnchor)POIXMLTypeLoader.newInstance(CTAnchor.type, (XmlOptions)null);
      }

      public static CTAnchor newInstance(XmlOptions var0) {
         return (CTAnchor)POIXMLTypeLoader.newInstance(CTAnchor.type, var0);
      }

      public static CTAnchor parse(String var0) throws XmlException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, (XmlOptions)null);
      }

      public static CTAnchor parse(String var0, XmlOptions var1) throws XmlException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, var1);
      }

      public static CTAnchor parse(File var0) throws XmlException, IOException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, (XmlOptions)null);
      }

      public static CTAnchor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, var1);
      }

      public static CTAnchor parse(URL var0) throws XmlException, IOException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, (XmlOptions)null);
      }

      public static CTAnchor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, var1);
      }

      public static CTAnchor parse(InputStream var0) throws XmlException, IOException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, (XmlOptions)null);
      }

      public static CTAnchor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, var1);
      }

      public static CTAnchor parse(Reader var0) throws XmlException, IOException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, (XmlOptions)null);
      }

      public static CTAnchor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, var1);
      }

      public static CTAnchor parse(XMLStreamReader var0) throws XmlException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, (XmlOptions)null);
      }

      public static CTAnchor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, var1);
      }

      public static CTAnchor parse(Node var0) throws XmlException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, (XmlOptions)null);
      }

      public static CTAnchor parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, var1);
      }

      public static CTAnchor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, (XmlOptions)null);
      }

      public static CTAnchor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTAnchor)POIXMLTypeLoader.parse(var0, CTAnchor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAnchor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAnchor.type, var1);
      }

   }
}
