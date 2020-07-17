package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeCoordinate;
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType;
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideSizeType$Enum;
import org.w3c.dom.Node;

public interface CTSlideSize extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSlideSize.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctslidesizeb0fdtype");


   int getCx();

   STSlideSizeCoordinate xgetCx();

   void setCx(int var1);

   void xsetCx(STSlideSizeCoordinate var1);

   int getCy();

   STSlideSizeCoordinate xgetCy();

   void setCy(int var1);

   void xsetCy(STSlideSizeCoordinate var1);

   STSlideSizeType$Enum getType();

   STSlideSizeType xgetType();

   boolean isSetType();

   void setType(STSlideSizeType$Enum var1);

   void xsetType(STSlideSizeType var1);

   void unsetType();


   public static final class Factory {

      public static CTSlideSize newInstance() {
         return (CTSlideSize)POIXMLTypeLoader.newInstance(CTSlideSize.type, (XmlOptions)null);
      }

      public static CTSlideSize newInstance(XmlOptions var0) {
         return (CTSlideSize)POIXMLTypeLoader.newInstance(CTSlideSize.type, var0);
      }

      public static CTSlideSize parse(String var0) throws XmlException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, (XmlOptions)null);
      }

      public static CTSlideSize parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, var1);
      }

      public static CTSlideSize parse(File var0) throws XmlException, IOException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, (XmlOptions)null);
      }

      public static CTSlideSize parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, var1);
      }

      public static CTSlideSize parse(URL var0) throws XmlException, IOException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, (XmlOptions)null);
      }

      public static CTSlideSize parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, var1);
      }

      public static CTSlideSize parse(InputStream var0) throws XmlException, IOException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, (XmlOptions)null);
      }

      public static CTSlideSize parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, var1);
      }

      public static CTSlideSize parse(Reader var0) throws XmlException, IOException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, (XmlOptions)null);
      }

      public static CTSlideSize parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, var1);
      }

      public static CTSlideSize parse(XMLStreamReader var0) throws XmlException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, (XmlOptions)null);
      }

      public static CTSlideSize parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, var1);
      }

      public static CTSlideSize parse(Node var0) throws XmlException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, (XmlOptions)null);
      }

      public static CTSlideSize parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, var1);
      }

      public static CTSlideSize parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, (XmlOptions)null);
      }

      public static CTSlideSize parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSlideSize)POIXMLTypeLoader.parse(var0, CTSlideSize.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideSize.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSlideSize.type, var1);
      }

   }
}
