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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.w3c.dom.Node;

public interface CTNonVisualGroupDrawingShapeProps extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNonVisualGroupDrawingShapeProps.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnonvisualgroupdrawingshapeprops610ctype");


   CTGroupLocking getGrpSpLocks();

   boolean isSetGrpSpLocks();

   void setGrpSpLocks(CTGroupLocking var1);

   CTGroupLocking addNewGrpSpLocks();

   void unsetGrpSpLocks();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTNonVisualGroupDrawingShapeProps newInstance() {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.newInstance(CTNonVisualGroupDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualGroupDrawingShapeProps newInstance(XmlOptions var0) {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.newInstance(CTNonVisualGroupDrawingShapeProps.type, var0);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(String var0) throws XmlException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, var1);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(File var0) throws XmlException, IOException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, var1);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(URL var0) throws XmlException, IOException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, var1);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(InputStream var0) throws XmlException, IOException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, var1);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(Reader var0) throws XmlException, IOException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, var1);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(XMLStreamReader var0) throws XmlException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, var1);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(Node var0) throws XmlException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, var1);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, (XmlOptions)null);
      }

      public static CTNonVisualGroupDrawingShapeProps parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNonVisualGroupDrawingShapeProps)POIXMLTypeLoader.parse(var0, CTNonVisualGroupDrawingShapeProps.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualGroupDrawingShapeProps.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualGroupDrawingShapeProps.type, var1);
      }

   }
}
