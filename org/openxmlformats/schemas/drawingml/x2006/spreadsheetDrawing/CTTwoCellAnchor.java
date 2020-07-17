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
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnector;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShape;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.STEditAs;
import org.w3c.dom.Node;

public interface CTTwoCellAnchor extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTwoCellAnchor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttwocellanchor1e8dtype");


   CTMarker getFrom();

   void setFrom(CTMarker var1);

   CTMarker addNewFrom();

   CTMarker getTo();

   void setTo(CTMarker var1);

   CTMarker addNewTo();

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

   STEditAs.Enum getEditAs();

   STEditAs xgetEditAs();

   boolean isSetEditAs();

   void setEditAs(STEditAs.Enum var1);

   void xsetEditAs(STEditAs var1);

   void unsetEditAs();


   public static final class Factory {

      public static CTTwoCellAnchor newInstance() {
         return (CTTwoCellAnchor)POIXMLTypeLoader.newInstance(CTTwoCellAnchor.type, (XmlOptions)null);
      }

      public static CTTwoCellAnchor newInstance(XmlOptions var0) {
         return (CTTwoCellAnchor)POIXMLTypeLoader.newInstance(CTTwoCellAnchor.type, var0);
      }

      public static CTTwoCellAnchor parse(String var0) throws XmlException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, (XmlOptions)null);
      }

      public static CTTwoCellAnchor parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, var1);
      }

      public static CTTwoCellAnchor parse(File var0) throws XmlException, IOException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, (XmlOptions)null);
      }

      public static CTTwoCellAnchor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, var1);
      }

      public static CTTwoCellAnchor parse(URL var0) throws XmlException, IOException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, (XmlOptions)null);
      }

      public static CTTwoCellAnchor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, var1);
      }

      public static CTTwoCellAnchor parse(InputStream var0) throws XmlException, IOException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, (XmlOptions)null);
      }

      public static CTTwoCellAnchor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, var1);
      }

      public static CTTwoCellAnchor parse(Reader var0) throws XmlException, IOException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, (XmlOptions)null);
      }

      public static CTTwoCellAnchor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, var1);
      }

      public static CTTwoCellAnchor parse(XMLStreamReader var0) throws XmlException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, (XmlOptions)null);
      }

      public static CTTwoCellAnchor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, var1);
      }

      public static CTTwoCellAnchor parse(Node var0) throws XmlException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, (XmlOptions)null);
      }

      public static CTTwoCellAnchor parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, var1);
      }

      public static CTTwoCellAnchor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, (XmlOptions)null);
      }

      public static CTTwoCellAnchor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTwoCellAnchor)POIXMLTypeLoader.parse(var0, CTTwoCellAnchor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTwoCellAnchor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTwoCellAnchor.type, var1);
      }

   }
}
