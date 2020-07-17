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
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum;
import org.w3c.dom.Node;

public interface CTTextAutonumberBullet extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTextAutonumberBullet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttextautonumberbulletd602type");


   STTextAutonumberScheme.Enum getType();

   STTextAutonumberScheme xgetType();

   void setType(STTextAutonumberScheme.Enum var1);

   void xsetType(STTextAutonumberScheme var1);

   int getStartAt();

   STTextBulletStartAtNum xgetStartAt();

   boolean isSetStartAt();

   void setStartAt(int var1);

   void xsetStartAt(STTextBulletStartAtNum var1);

   void unsetStartAt();


   public static final class Factory {

      public static CTTextAutonumberBullet newInstance() {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.newInstance(CTTextAutonumberBullet.type, (XmlOptions)null);
      }

      public static CTTextAutonumberBullet newInstance(XmlOptions var0) {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.newInstance(CTTextAutonumberBullet.type, var0);
      }

      public static CTTextAutonumberBullet parse(String var0) throws XmlException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, (XmlOptions)null);
      }

      public static CTTextAutonumberBullet parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, var1);
      }

      public static CTTextAutonumberBullet parse(File var0) throws XmlException, IOException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, (XmlOptions)null);
      }

      public static CTTextAutonumberBullet parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, var1);
      }

      public static CTTextAutonumberBullet parse(URL var0) throws XmlException, IOException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, (XmlOptions)null);
      }

      public static CTTextAutonumberBullet parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, var1);
      }

      public static CTTextAutonumberBullet parse(InputStream var0) throws XmlException, IOException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, (XmlOptions)null);
      }

      public static CTTextAutonumberBullet parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, var1);
      }

      public static CTTextAutonumberBullet parse(Reader var0) throws XmlException, IOException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, (XmlOptions)null);
      }

      public static CTTextAutonumberBullet parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, var1);
      }

      public static CTTextAutonumberBullet parse(XMLStreamReader var0) throws XmlException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, (XmlOptions)null);
      }

      public static CTTextAutonumberBullet parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, var1);
      }

      public static CTTextAutonumberBullet parse(Node var0) throws XmlException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, (XmlOptions)null);
      }

      public static CTTextAutonumberBullet parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, var1);
      }

      public static CTTextAutonumberBullet parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, (XmlOptions)null);
      }

      public static CTTextAutonumberBullet parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTextAutonumberBullet)POIXMLTypeLoader.parse(var0, CTTextAutonumberBullet.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextAutonumberBullet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTextAutonumberBullet.type, var1);
      }

   }
}
