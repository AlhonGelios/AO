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
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode$Enum;
import org.w3c.dom.Node;

public interface CTGradientFillProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGradientFillProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgradientfillproperties81c1type");


   CTGradientStopList getGsLst();

   boolean isSetGsLst();

   void setGsLst(CTGradientStopList var1);

   CTGradientStopList addNewGsLst();

   void unsetGsLst();

   CTLinearShadeProperties getLin();

   boolean isSetLin();

   void setLin(CTLinearShadeProperties var1);

   CTLinearShadeProperties addNewLin();

   void unsetLin();

   CTPathShadeProperties getPath();

   boolean isSetPath();

   void setPath(CTPathShadeProperties var1);

   CTPathShadeProperties addNewPath();

   void unsetPath();

   CTRelativeRect getTileRect();

   boolean isSetTileRect();

   void setTileRect(CTRelativeRect var1);

   CTRelativeRect addNewTileRect();

   void unsetTileRect();

   STTileFlipMode$Enum getFlip();

   STTileFlipMode xgetFlip();

   boolean isSetFlip();

   void setFlip(STTileFlipMode$Enum var1);

   void xsetFlip(STTileFlipMode var1);

   void unsetFlip();

   boolean getRotWithShape();

   XmlBoolean xgetRotWithShape();

   boolean isSetRotWithShape();

   void setRotWithShape(boolean var1);

   void xsetRotWithShape(XmlBoolean var1);

   void unsetRotWithShape();


   public static final class Factory {

      public static CTGradientFillProperties newInstance() {
         return (CTGradientFillProperties)POIXMLTypeLoader.newInstance(CTGradientFillProperties.type, (XmlOptions)null);
      }

      public static CTGradientFillProperties newInstance(XmlOptions var0) {
         return (CTGradientFillProperties)POIXMLTypeLoader.newInstance(CTGradientFillProperties.type, var0);
      }

      public static CTGradientFillProperties parse(String var0) throws XmlException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, (XmlOptions)null);
      }

      public static CTGradientFillProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, var1);
      }

      public static CTGradientFillProperties parse(File var0) throws XmlException, IOException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, (XmlOptions)null);
      }

      public static CTGradientFillProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, var1);
      }

      public static CTGradientFillProperties parse(URL var0) throws XmlException, IOException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, (XmlOptions)null);
      }

      public static CTGradientFillProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, var1);
      }

      public static CTGradientFillProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, (XmlOptions)null);
      }

      public static CTGradientFillProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, var1);
      }

      public static CTGradientFillProperties parse(Reader var0) throws XmlException, IOException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, (XmlOptions)null);
      }

      public static CTGradientFillProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, var1);
      }

      public static CTGradientFillProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, (XmlOptions)null);
      }

      public static CTGradientFillProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, var1);
      }

      public static CTGradientFillProperties parse(Node var0) throws XmlException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, (XmlOptions)null);
      }

      public static CTGradientFillProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, var1);
      }

      public static CTGradientFillProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, (XmlOptions)null);
      }

      public static CTGradientFillProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGradientFillProperties)POIXMLTypeLoader.parse(var0, CTGradientFillProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGradientFillProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGradientFillProperties.type, var1);
      }

   }
}
