package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking;
import org.w3c.dom.Node;

public interface CTNonVisualDrawingShapeProps extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNonVisualDrawingShapeProps.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnonvisualdrawingshapepropsf17btype");


   CTShapeLocking getSpLocks();

   boolean isSetSpLocks();

   void setSpLocks(CTShapeLocking var1);

   CTShapeLocking addNewSpLocks();

   void unsetSpLocks();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   boolean getTxBox();

   XmlBoolean xgetTxBox();

   boolean isSetTxBox();

   void setTxBox(boolean var1);

   void xsetTxBox(XmlBoolean var1);

   void unsetTxBox();


   public static final class Factory {

      public static CTNonVisualDrawingShapeProps newInstance() {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.newInstance(CTNonVisualDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingShapeProps newInstance(XmlOptions var0) {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.newInstance(CTNonVisualDrawingShapeProps.type, var0);
      }

      public static CTNonVisualDrawingShapeProps parse(String var0) throws XmlException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingShapeProps parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, var1);
      }

      public static CTNonVisualDrawingShapeProps parse(File var0) throws XmlException, IOException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingShapeProps parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, var1);
      }

      public static CTNonVisualDrawingShapeProps parse(URL var0) throws XmlException, IOException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingShapeProps parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, var1);
      }

      public static CTNonVisualDrawingShapeProps parse(InputStream var0) throws XmlException, IOException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingShapeProps parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, var1);
      }

      public static CTNonVisualDrawingShapeProps parse(Reader var0) throws XmlException, IOException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingShapeProps parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, var1);
      }

      public static CTNonVisualDrawingShapeProps parse(XMLStreamReader var0) throws XmlException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingShapeProps parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, var1);
      }

      public static CTNonVisualDrawingShapeProps parse(Node var0) throws XmlException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingShapeProps parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, var1);
      }

      public static CTNonVisualDrawingShapeProps parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualDrawingShapeProps parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNonVisualDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualDrawingShapeProps.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualDrawingShapeProps.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualDrawingShapeProps.type, var1);
      }

   }
}
