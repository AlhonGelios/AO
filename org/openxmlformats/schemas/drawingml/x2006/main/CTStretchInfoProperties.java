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
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.w3c.dom.Node;

public interface CTStretchInfoProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTStretchInfoProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstretchinfopropertiesde57type");


   CTRelativeRect getFillRect();

   boolean isSetFillRect();

   void setFillRect(CTRelativeRect var1);

   CTRelativeRect addNewFillRect();

   void unsetFillRect();


   public static final class Factory {

      public static CTStretchInfoProperties newInstance() {
         return (CTStretchInfoProperties)POIXMLTypeLoader.newInstance(CTStretchInfoProperties.type, (XmlOptions)null);
      }

      public static CTStretchInfoProperties newInstance(XmlOptions var0) {
         return (CTStretchInfoProperties)POIXMLTypeLoader.newInstance(CTStretchInfoProperties.type, var0);
      }

      public static CTStretchInfoProperties parse(String var0) throws XmlException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, (XmlOptions)null);
      }

      public static CTStretchInfoProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, var1);
      }

      public static CTStretchInfoProperties parse(File var0) throws XmlException, IOException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, (XmlOptions)null);
      }

      public static CTStretchInfoProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, var1);
      }

      public static CTStretchInfoProperties parse(URL var0) throws XmlException, IOException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, (XmlOptions)null);
      }

      public static CTStretchInfoProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, var1);
      }

      public static CTStretchInfoProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, (XmlOptions)null);
      }

      public static CTStretchInfoProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, var1);
      }

      public static CTStretchInfoProperties parse(Reader var0) throws XmlException, IOException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, (XmlOptions)null);
      }

      public static CTStretchInfoProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, var1);
      }

      public static CTStretchInfoProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, (XmlOptions)null);
      }

      public static CTStretchInfoProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, var1);
      }

      public static CTStretchInfoProperties parse(Node var0) throws XmlException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, (XmlOptions)null);
      }

      public static CTStretchInfoProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, var1);
      }

      public static CTStretchInfoProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, (XmlOptions)null);
      }

      public static CTStretchInfoProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTStretchInfoProperties)POIXMLTypeLoader.parse(var0, CTStretchInfoProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStretchInfoProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStretchInfoProperties.type, var1);
      }

   }
}
