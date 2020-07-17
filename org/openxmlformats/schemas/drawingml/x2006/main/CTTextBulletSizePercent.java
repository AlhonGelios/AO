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
import org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletSizePercent;
import org.w3c.dom.Node;

public interface CTTextBulletSizePercent extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextBulletSizePercent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextbulletsizepercent9b26type");


   int getVal();

   STTextBulletSizePercent xgetVal();

   boolean isSetVal();

   void setVal(int var1);

   void xsetVal(STTextBulletSizePercent var1);

   void unsetVal();


   public static final class Factory {

      public static CTTextBulletSizePercent newInstance() {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.newInstance(CTTextBulletSizePercent.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePercent newInstance(XmlOptions var0) {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.newInstance(CTTextBulletSizePercent.type, var0);
      }

      public static CTTextBulletSizePercent parse(String var0) throws XmlException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePercent parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, var1);
      }

      public static CTTextBulletSizePercent parse(File var0) throws XmlException, IOException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePercent parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, var1);
      }

      public static CTTextBulletSizePercent parse(URL var0) throws XmlException, IOException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePercent parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, var1);
      }

      public static CTTextBulletSizePercent parse(InputStream var0) throws XmlException, IOException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePercent parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, var1);
      }

      public static CTTextBulletSizePercent parse(Reader var0) throws XmlException, IOException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePercent parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, var1);
      }

      public static CTTextBulletSizePercent parse(XMLStreamReader var0) throws XmlException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePercent parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, var1);
      }

      public static CTTextBulletSizePercent parse(Node var0) throws XmlException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePercent parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, var1);
      }

      public static CTTextBulletSizePercent parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, (XmlOptions)null);
      }

      public static CTTextBulletSizePercent parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextBulletSizePercent)POIXMLTypeLoader.parse(var0, CTTextBulletSizePercent.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextBulletSizePercent.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextBulletSizePercent.type, var1);
      }

   }
}
