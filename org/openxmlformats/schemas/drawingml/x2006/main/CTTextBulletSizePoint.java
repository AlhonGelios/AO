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
import org.openxmlformats.schemas.drawingml.x2006.main.STTextFontSize;
import org.w3c.dom.Node;

public interface CTTextBulletSizePoint extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextBulletSizePoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextbulletsizepointe4f1type");


   int getVal();

   STTextFontSize xgetVal();

   boolean isSetVal();

   void setVal(int var1);

   void xsetVal(STTextFontSize var1);

   void unsetVal();


   public static final class Factory {

      public static CTTextBulletSizePoint newInstance() {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.newInstance(CTTextBulletSizePoint.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePoint newInstance(XmlOptions var0) {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.newInstance(CTTextBulletSizePoint.type, var0);
      }

      public static CTTextBulletSizePoint parse(String var0) throws XmlException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePoint parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, var1);
      }

      public static CTTextBulletSizePoint parse(File var0) throws XmlException, IOException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePoint parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, var1);
      }

      public static CTTextBulletSizePoint parse(URL var0) throws XmlException, IOException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePoint parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, var1);
      }

      public static CTTextBulletSizePoint parse(InputStream var0) throws XmlException, IOException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePoint parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, var1);
      }

      public static CTTextBulletSizePoint parse(Reader var0) throws XmlException, IOException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePoint parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, var1);
      }

      public static CTTextBulletSizePoint parse(XMLStreamReader var0) throws XmlException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePoint parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, var1);
      }

      public static CTTextBulletSizePoint parse(Node var0) throws XmlException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePoint parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, var1);
      }

      public static CTTextBulletSizePoint parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePoint parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextBulletSizePoint)POIXMLTypeLoader.parse(var0, CTTextBulletSizePoint.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextBulletSizePoint.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextBulletSizePoint.type, var1);
      }

   }
}
