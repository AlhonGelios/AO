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
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShapeNonVisual;
import org.w3c.dom.Node;

public interface CTShape extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTShape.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctshapee40btype");


   CTShapeNonVisual getNvSpPr();

   void setNvSpPr(CTShapeNonVisual var1);

   CTShapeNonVisual addNewNvSpPr();

   CTShapeProperties getSpPr();

   void setSpPr(CTShapeProperties var1);

   CTShapeProperties addNewSpPr();

   CTShapeStyle getStyle();

   boolean isSetStyle();

   void setStyle(CTShapeStyle var1);

   CTShapeStyle addNewStyle();

   void unsetStyle();

   CTTextBody getTxBody();

   boolean isSetTxBody();

   void setTxBody(CTTextBody var1);

   CTTextBody addNewTxBody();

   void unsetTxBody();

   String getMacro();

   XmlString xgetMacro();

   boolean isSetMacro();

   void setMacro(String var1);

   void xsetMacro(XmlString var1);

   void unsetMacro();

   String getTextlink();

   XmlString xgetTextlink();

   boolean isSetTextlink();

   void setTextlink(String var1);

   void xsetTextlink(XmlString var1);

   void unsetTextlink();

   boolean getFLocksText();

   XmlBoolean xgetFLocksText();

   boolean isSetFLocksText();

   void setFLocksText(boolean var1);

   void xsetFLocksText(XmlBoolean var1);

   void unsetFLocksText();

   boolean getFPublished();

   XmlBoolean xgetFPublished();

   boolean isSetFPublished();

   void setFPublished(boolean var1);

   void xsetFPublished(XmlBoolean var1);

   void unsetFPublished();


   public static final class Factory {

      public static CTShape newInstance() {
         return (CTShape)POIXMLTypeLoader.newInstance(CTShape.type, (XmlOptions)null);
      }

      public static CTShape newInstance(XmlOptions var0) {
         return (CTShape)POIXMLTypeLoader.newInstance(CTShape.type, var0);
      }

      public static CTShape parse(String var0) throws XmlException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, (XmlOptions)null);
      }

      public static CTShape parse(String var0, XmlOptions var1) throws XmlException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, var1);
      }

      public static CTShape parse(File var0) throws XmlException, IOException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, (XmlOptions)null);
      }

      public static CTShape parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, var1);
      }

      public static CTShape parse(URL var0) throws XmlException, IOException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, (XmlOptions)null);
      }

      public static CTShape parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, var1);
      }

      public static CTShape parse(InputStream var0) throws XmlException, IOException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, (XmlOptions)null);
      }

      public static CTShape parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, var1);
      }

      public static CTShape parse(Reader var0) throws XmlException, IOException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, (XmlOptions)null);
      }

      public static CTShape parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, var1);
      }

      public static CTShape parse(XMLStreamReader var0) throws XmlException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, (XmlOptions)null);
      }

      public static CTShape parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, var1);
      }

      public static CTShape parse(Node var0) throws XmlException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, (XmlOptions)null);
      }

      public static CTShape parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, var1);
      }

      public static CTShape parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, (XmlOptions)null);
      }

      public static CTShape parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTShape)POIXMLTypeLoader.parse(var0, CTShape.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShape.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShape.type, var1);
      }

   }
}
