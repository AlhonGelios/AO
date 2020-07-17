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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTAnchorClientData extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTAnchorClientData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctanchorclientdata02betype");


   boolean getFLocksWithSheet();

   XmlBoolean xgetFLocksWithSheet();

   boolean isSetFLocksWithSheet();

   void setFLocksWithSheet(boolean var1);

   void xsetFLocksWithSheet(XmlBoolean var1);

   void unsetFLocksWithSheet();

   boolean getFPrintsWithSheet();

   XmlBoolean xgetFPrintsWithSheet();

   boolean isSetFPrintsWithSheet();

   void setFPrintsWithSheet(boolean var1);

   void xsetFPrintsWithSheet(XmlBoolean var1);

   void unsetFPrintsWithSheet();


   public static final class Factory {

      public static CTAnchorClientData newInstance() {
         return (CTAnchorClientData)POIXMLTypeLoader.newInstance(CTAnchorClientData.type, (XmlOptions)null);
      }

      public static CTAnchorClientData newInstance(XmlOptions var0) {
         return (CTAnchorClientData)POIXMLTypeLoader.newInstance(CTAnchorClientData.type, var0);
      }

      public static CTAnchorClientData parse(String var0) throws XmlException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, (XmlOptions)null);
      }

      public static CTAnchorClientData parse(String var0, XmlOptions var1) throws XmlException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, var1);
      }

      public static CTAnchorClientData parse(File var0) throws XmlException, IOException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, (XmlOptions)null);
      }

      public static CTAnchorClientData parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, var1);
      }

      public static CTAnchorClientData parse(URL var0) throws XmlException, IOException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, (XmlOptions)null);
      }

      public static CTAnchorClientData parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, var1);
      }

      public static CTAnchorClientData parse(InputStream var0) throws XmlException, IOException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, (XmlOptions)null);
      }

      public static CTAnchorClientData parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, var1);
      }

      public static CTAnchorClientData parse(Reader var0) throws XmlException, IOException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, (XmlOptions)null);
      }

      public static CTAnchorClientData parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, var1);
      }

      public static CTAnchorClientData parse(XMLStreamReader var0) throws XmlException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, (XmlOptions)null);
      }

      public static CTAnchorClientData parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, var1);
      }

      public static CTAnchorClientData parse(Node var0) throws XmlException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, (XmlOptions)null);
      }

      public static CTAnchorClientData parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, var1);
      }

      public static CTAnchorClientData parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, (XmlOptions)null);
      }

      public static CTAnchorClientData parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTAnchorClientData)POIXMLTypeLoader.parse(var0, CTAnchorClientData.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAnchorClientData.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTAnchorClientData.type, var1);
      }

   }
}
