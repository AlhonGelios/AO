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
import org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking;
import org.w3c.dom.Node;

public interface CTNonVisualPictureProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTNonVisualPictureProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctnonvisualpicturepropertiesee3ftype");


   CTPictureLocking getPicLocks();

   boolean isSetPicLocks();

   void setPicLocks(CTPictureLocking var1);

   CTPictureLocking addNewPicLocks();

   void unsetPicLocks();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   boolean getPreferRelativeResize();

   XmlBoolean xgetPreferRelativeResize();

   boolean isSetPreferRelativeResize();

   void setPreferRelativeResize(boolean var1);

   void xsetPreferRelativeResize(XmlBoolean var1);

   void unsetPreferRelativeResize();


   public static final class Factory {

      public static CTNonVisualPictureProperties newInstance() {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.newInstance(CTNonVisualPictureProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualPictureProperties newInstance(XmlOptions var0) {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.newInstance(CTNonVisualPictureProperties.type, var0);
      }

      public static CTNonVisualPictureProperties parse(String var0) throws XmlException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualPictureProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, var1);
      }

      public static CTNonVisualPictureProperties parse(File var0) throws XmlException, IOException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualPictureProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, var1);
      }

      public static CTNonVisualPictureProperties parse(URL var0) throws XmlException, IOException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualPictureProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, var1);
      }

      public static CTNonVisualPictureProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualPictureProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, var1);
      }

      public static CTNonVisualPictureProperties parse(Reader var0) throws XmlException, IOException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualPictureProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, var1);
      }

      public static CTNonVisualPictureProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualPictureProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, var1);
      }

      public static CTNonVisualPictureProperties parse(Node var0) throws XmlException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualPictureProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, var1);
      }

      public static CTNonVisualPictureProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, (XmlOptions)null);
      }

      public static CTNonVisualPictureProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTNonVisualPictureProperties)POIXMLTypeLoader.parse(var0, CTNonVisualPictureProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualPictureProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTNonVisualPictureProperties.type, var1);
      }

   }
}
