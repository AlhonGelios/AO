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
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTConnectorNonVisual;
import org.w3c.dom.Node;

public interface CTConnector extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTConnector.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctconnector3d37type");


   CTConnectorNonVisual getNvCxnSpPr();

   void setNvCxnSpPr(CTConnectorNonVisual var1);

   CTConnectorNonVisual addNewNvCxnSpPr();

   CTShapeProperties getSpPr();

   void setSpPr(CTShapeProperties var1);

   CTShapeProperties addNewSpPr();

   CTShapeStyle getStyle();

   boolean isSetStyle();

   void setStyle(CTShapeStyle var1);

   CTShapeStyle addNewStyle();

   void unsetStyle();

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

      public static CTConnector newInstance() {
         return (CTConnector)POIXMLTypeLoader.newInstance(CTConnector.type, (XmlOptions)null);
      }

      public static CTConnector newInstance(XmlOptions var0) {
         return (CTConnector)POIXMLTypeLoader.newInstance(CTConnector.type, var0);
      }

      public static CTConnector parse(String var0) throws XmlException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, (XmlOptions)null);
      }

      public static CTConnector parse(String var0, XmlOptions var1) throws XmlException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, var1);
      }

      public static CTConnector parse(File var0) throws XmlException, IOException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, (XmlOptions)null);
      }

      public static CTConnector parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, var1);
      }

      public static CTConnector parse(URL var0) throws XmlException, IOException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, (XmlOptions)null);
      }

      public static CTConnector parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, var1);
      }

      public static CTConnector parse(InputStream var0) throws XmlException, IOException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, (XmlOptions)null);
      }

      public static CTConnector parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, var1);
      }

      public static CTConnector parse(Reader var0) throws XmlException, IOException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, (XmlOptions)null);
      }

      public static CTConnector parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, var1);
      }

      public static CTConnector parse(XMLStreamReader var0) throws XmlException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, (XmlOptions)null);
      }

      public static CTConnector parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, var1);
      }

      public static CTConnector parse(Node var0) throws XmlException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, (XmlOptions)null);
      }

      public static CTConnector parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, var1);
      }

      public static CTConnector parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, (XmlOptions)null);
      }

      public static CTConnector parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTConnector)POIXMLTypeLoader.parse(var0, CTConnector.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTConnector.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTConnector.type, var1);
      }

   }
}
