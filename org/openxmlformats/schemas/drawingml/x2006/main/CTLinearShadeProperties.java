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
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle;
import org.w3c.dom.Node;

public interface CTLinearShadeProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLinearShadeProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlinearshadeproperties7f0ctype");


   int getAng();

   STPositiveFixedAngle xgetAng();

   boolean isSetAng();

   void setAng(int var1);

   void xsetAng(STPositiveFixedAngle var1);

   void unsetAng();

   boolean getScaled();

   XmlBoolean xgetScaled();

   boolean isSetScaled();

   void setScaled(boolean var1);

   void xsetScaled(XmlBoolean var1);

   void unsetScaled();


   public static final class Factory {

      public static CTLinearShadeProperties newInstance() {
         return (CTLinearShadeProperties)POIXMLTypeLoader.newInstance(CTLinearShadeProperties.type, (XmlOptions)null);
      }

      public static CTLinearShadeProperties newInstance(XmlOptions var0) {
         return (CTLinearShadeProperties)POIXMLTypeLoader.newInstance(CTLinearShadeProperties.type, var0);
      }

      public static CTLinearShadeProperties parse(String var0) throws XmlException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, (XmlOptions)null);
      }

      public static CTLinearShadeProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, var1);
      }

      public static CTLinearShadeProperties parse(File var0) throws XmlException, IOException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, (XmlOptions)null);
      }

      public static CTLinearShadeProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, var1);
      }

      public static CTLinearShadeProperties parse(URL var0) throws XmlException, IOException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, (XmlOptions)null);
      }

      public static CTLinearShadeProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, var1);
      }

      public static CTLinearShadeProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, (XmlOptions)null);
      }

      public static CTLinearShadeProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, var1);
      }

      public static CTLinearShadeProperties parse(Reader var0) throws XmlException, IOException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, (XmlOptions)null);
      }

      public static CTLinearShadeProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, var1);
      }

      public static CTLinearShadeProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, (XmlOptions)null);
      }

      public static CTLinearShadeProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, var1);
      }

      public static CTLinearShadeProperties parse(Node var0) throws XmlException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, (XmlOptions)null);
      }

      public static CTLinearShadeProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, var1);
      }

      public static CTLinearShadeProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, (XmlOptions)null);
      }

      public static CTLinearShadeProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLinearShadeProperties)POIXMLTypeLoader.parse(var0, CTLinearShadeProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLinearShadeProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLinearShadeProperties.type, var1);
      }

   }
}
