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
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.w3c.dom.Node;

public interface CTNonVisualGraphicFrameProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNonVisualGraphicFrameProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnonvisualgraphicframeproperties43b6type");


   CTGraphicalObjectFrameLocking getGraphicFrameLocks();

   boolean isSetGraphicFrameLocks();

   void setGraphicFrameLocks(CTGraphicalObjectFrameLocking var1);

   CTGraphicalObjectFrameLocking addNewGraphicFrameLocks();

   void unsetGraphicFrameLocks();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTNonVisualGraphicFrameProperties newInstance() {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.newInstance(CTNonVisualGraphicFrameProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualGraphicFrameProperties newInstance(XmlOptions var0) {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.newInstance(CTNonVisualGraphicFrameProperties.type, var0);
      }

      public static CTNonVisualGraphicFrameProperties parse(String var0) throws XmlException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualGraphicFrameProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, var1);
      }

      public static CTNonVisualGraphicFrameProperties parse(File var0) throws XmlException, IOException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualGraphicFrameProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, var1);
      }

      public static CTNonVisualGraphicFrameProperties parse(URL var0) throws XmlException, IOException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualGraphicFrameProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, var1);
      }

      public static CTNonVisualGraphicFrameProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualGraphicFrameProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, var1);
      }

      public static CTNonVisualGraphicFrameProperties parse(Reader var0) throws XmlException, IOException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualGraphicFrameProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, var1);
      }

      public static CTNonVisualGraphicFrameProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualGraphicFrameProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, var1);
      }

      public static CTNonVisualGraphicFrameProperties parse(Node var0) throws XmlException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualGraphicFrameProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, var1);
      }

      public static CTNonVisualGraphicFrameProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualGraphicFrameProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNonVisualGraphicFrameProperties)POIXMLTypeLoader.parse(var0, CTNonVisualGraphicFrameProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualGraphicFrameProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualGraphicFrameProperties.type, var1);
      }

   }
}
