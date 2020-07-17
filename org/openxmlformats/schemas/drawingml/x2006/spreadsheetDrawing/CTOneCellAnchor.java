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
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape;
import org.w3c.dom.Node;

public interface CTOneCellAnchor extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTOneCellAnchor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctonecellanchor0527type");


   CTMarker getFrom();

   void setFrom(CTMarker var1);

   CTMarker addNewFrom();

   CTPositiveSize2D getExt();

   void setExt(CTPositiveSize2D var1);

   CTPositiveSize2D addNewExt();

   CTShape getSp();

   boolean isSetSp();

   void setSp(CTShape var1);

   CTShape addNewSp();

   void unsetSp();

   CTGroupShape getGrpSp();

   boolean isSetGrpSp();

   void setGrpSp(CTGroupShape var1);

   CTGroupShape addNewGrpSp();

   void unsetGrpSp();

   CTGraphicalObjectFrame getGraphicFrame();

   boolean isSetGraphicFrame();

   void setGraphicFrame(CTGraphicalObjectFrame var1);

   CTGraphicalObjectFrame addNewGraphicFrame();

   void unsetGraphicFrame();

   CTConnector getCxnSp();

   boolean isSetCxnSp();

   void setCxnSp(CTConnector var1);

   CTConnector addNewCxnSp();

   void unsetCxnSp();

   CTPicture getPic();

   boolean isSetPic();

   void setPic(CTPicture var1);

   CTPicture addNewPic();

   void unsetPic();

   CTAnchorClientData getClientData();

   void setClientData(CTAnchorClientData var1);

   CTAnchorClientData addNewClientData();


   public static final class Factory {

      public static CTOneCellAnchor newInstance() {
         return (CTOneCellAnchor)POIXMLTypeLoader.newInstance(CTOneCellAnchor.type, (XmlOptions)null);
      }

      public static CTOneCellAnchor newInstance(XmlOptions var0) {
         return (CTOneCellAnchor)POIXMLTypeLoader.newInstance(CTOneCellAnchor.type, var0);
      }

      public static CTOneCellAnchor parse(String var0) throws XmlException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, (XmlOptions)null);
      }

      public static CTOneCellAnchor parse(String var0, XmlOptions var1) throws XmlException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, var1);
      }

      public static CTOneCellAnchor parse(File var0) throws XmlException, IOException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, (XmlOptions)null);
      }

      public static CTOneCellAnchor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, var1);
      }

      public static CTOneCellAnchor parse(URL var0) throws XmlException, IOException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, (XmlOptions)null);
      }

      public static CTOneCellAnchor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, var1);
      }

      public static CTOneCellAnchor parse(InputStream var0) throws XmlException, IOException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, (XmlOptions)null);
      }

      public static CTOneCellAnchor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, var1);
      }

      public static CTOneCellAnchor parse(Reader var0) throws XmlException, IOException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, (XmlOptions)null);
      }

      public static CTOneCellAnchor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, var1);
      }

      public static CTOneCellAnchor parse(XMLStreamReader var0) throws XmlException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, (XmlOptions)null);
      }

      public static CTOneCellAnchor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, var1);
      }

      public static CTOneCellAnchor parse(Node var0) throws XmlException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, (XmlOptions)null);
      }

      public static CTOneCellAnchor parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, var1);
      }

      public static CTOneCellAnchor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, (XmlOptions)null);
      }

      public static CTOneCellAnchor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTOneCellAnchor)POIXMLTypeLoader.parse(var0, CTOneCellAnchor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOneCellAnchor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOneCellAnchor.type, var1);
      }

   }
}
