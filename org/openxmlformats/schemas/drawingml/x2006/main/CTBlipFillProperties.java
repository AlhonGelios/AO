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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties;
import org.w3c.dom.Node;

public interface CTBlipFillProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBlipFillProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctblipfillproperties0382type");


   CTBlip getBlip();

   boolean isSetBlip();

   void setBlip(CTBlip var1);

   CTBlip addNewBlip();

   void unsetBlip();

   CTRelativeRect getSrcRect();

   boolean isSetSrcRect();

   void setSrcRect(CTRelativeRect var1);

   CTRelativeRect addNewSrcRect();

   void unsetSrcRect();

   CTTileInfoProperties getTile();

   boolean isSetTile();

   void setTile(CTTileInfoProperties var1);

   CTTileInfoProperties addNewTile();

   void unsetTile();

   CTStretchInfoProperties getStretch();

   boolean isSetStretch();

   void setStretch(CTStretchInfoProperties var1);

   CTStretchInfoProperties addNewStretch();

   void unsetStretch();

   long getDpi();

   XmlUnsignedInt xgetDpi();

   boolean isSetDpi();

   void setDpi(long var1);

   void xsetDpi(XmlUnsignedInt var1);

   void unsetDpi();

   boolean getRotWithShape();

   XmlBoolean xgetRotWithShape();

   boolean isSetRotWithShape();

   void setRotWithShape(boolean var1);

   void xsetRotWithShape(XmlBoolean var1);

   void unsetRotWithShape();


   public static final class Factory {

      public static CTBlipFillProperties newInstance() {
         return (CTBlipFillProperties)POIXMLTypeLoader.newInstance(CTBlipFillProperties.type, (XmlOptions)null);
      }

      public static CTBlipFillProperties newInstance(XmlOptions var0) {
         return (CTBlipFillProperties)POIXMLTypeLoader.newInstance(CTBlipFillProperties.type, var0);
      }

      public static CTBlipFillProperties parse(String var0) throws XmlException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, (XmlOptions)null);
      }

      public static CTBlipFillProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, var1);
      }

      public static CTBlipFillProperties parse(File var0) throws XmlException, IOException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, (XmlOptions)null);
      }

      public static CTBlipFillProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, var1);
      }

      public static CTBlipFillProperties parse(URL var0) throws XmlException, IOException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, (XmlOptions)null);
      }

      public static CTBlipFillProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, var1);
      }

      public static CTBlipFillProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, (XmlOptions)null);
      }

      public static CTBlipFillProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, var1);
      }

      public static CTBlipFillProperties parse(Reader var0) throws XmlException, IOException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, (XmlOptions)null);
      }

      public static CTBlipFillProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, var1);
      }

      public static CTBlipFillProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, (XmlOptions)null);
      }

      public static CTBlipFillProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, var1);
      }

      public static CTBlipFillProperties parse(Node var0) throws XmlException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, (XmlOptions)null);
      }

      public static CTBlipFillProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, var1);
      }

      public static CTBlipFillProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, (XmlOptions)null);
      }

      public static CTBlipFillProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBlipFillProperties)POIXMLTypeLoader.parse(var0, CTBlipFillProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBlipFillProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBlipFillProperties.type, var1);
      }

   }
}
