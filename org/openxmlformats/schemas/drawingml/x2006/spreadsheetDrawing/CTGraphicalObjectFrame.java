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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrameNonVisual;
import org.w3c.dom.Node;

public interface CTGraphicalObjectFrame extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGraphicalObjectFrame.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgraphicalobjectframe536ftype");


   CTGraphicalObjectFrameNonVisual getNvGraphicFramePr();

   void setNvGraphicFramePr(CTGraphicalObjectFrameNonVisual var1);

   CTGraphicalObjectFrameNonVisual addNewNvGraphicFramePr();

   CTTransform2D getXfrm();

   void setXfrm(CTTransform2D var1);

   CTTransform2D addNewXfrm();

   CTGraphicalObject getGraphic();

   void setGraphic(CTGraphicalObject var1);

   CTGraphicalObject addNewGraphic();

   String getMacro();

   XmlString xgetMacro();

   boolean isSetMacro();

   void setMacro(String var1);

   void xsetMacro(XmlString var1);

   void unsetMacro();

   boolean getFPublished();

   XmlBoolean xgetFPublished();

   boolean isSetFPublished();

   void setFPublished(boolean var1);

   void xsetFPublished(XmlBoolean var1);

   void unsetFPublished();


   public static final class Factory {

      public static CTGraphicalObjectFrame newInstance() {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.newInstance(CTGraphicalObjectFrame.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrame newInstance(XmlOptions var0) {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.newInstance(CTGraphicalObjectFrame.type, var0);
      }

      public static CTGraphicalObjectFrame parse(String var0) throws XmlException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrame parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, var1);
      }

      public static CTGraphicalObjectFrame parse(File var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrame parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, var1);
      }

      public static CTGraphicalObjectFrame parse(URL var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrame parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, var1);
      }

      public static CTGraphicalObjectFrame parse(InputStream var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrame parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, var1);
      }

      public static CTGraphicalObjectFrame parse(Reader var0) throws XmlException, IOException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrame parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, var1);
      }

      public static CTGraphicalObjectFrame parse(XMLStreamReader var0) throws XmlException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrame parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, var1);
      }

      public static CTGraphicalObjectFrame parse(Node var0) throws XmlException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrame parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, var1);
      }

      public static CTGraphicalObjectFrame parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, (XmlOptions)null);
      }

      public static CTGraphicalObjectFrame parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGraphicalObjectFrame)POIXMLTypeLoader.parse(var0, CTGraphicalObjectFrame.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGraphicalObjectFrame.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGraphicalObjectFrame.type, var1);
      }

   }
}
