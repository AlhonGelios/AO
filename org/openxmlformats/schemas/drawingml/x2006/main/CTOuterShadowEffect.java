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
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor;
import org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment;
import org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment$Enum;
import org.w3c.dom.Node;

public interface CTOuterShadowEffect extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTOuterShadowEffect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctoutershadoweffect7b5dtype");


   CTScRgbColor getScrgbClr();

   boolean isSetScrgbClr();

   void setScrgbClr(CTScRgbColor var1);

   CTScRgbColor addNewScrgbClr();

   void unsetScrgbClr();

   CTSRgbColor getSrgbClr();

   boolean isSetSrgbClr();

   void setSrgbClr(CTSRgbColor var1);

   CTSRgbColor addNewSrgbClr();

   void unsetSrgbClr();

   CTHslColor getHslClr();

   boolean isSetHslClr();

   void setHslClr(CTHslColor var1);

   CTHslColor addNewHslClr();

   void unsetHslClr();

   CTSystemColor getSysClr();

   boolean isSetSysClr();

   void setSysClr(CTSystemColor var1);

   CTSystemColor addNewSysClr();

   void unsetSysClr();

   CTSchemeColor getSchemeClr();

   boolean isSetSchemeClr();

   void setSchemeClr(CTSchemeColor var1);

   CTSchemeColor addNewSchemeClr();

   void unsetSchemeClr();

   CTPresetColor getPrstClr();

   boolean isSetPrstClr();

   void setPrstClr(CTPresetColor var1);

   CTPresetColor addNewPrstClr();

   void unsetPrstClr();

   long getBlurRad();

   STPositiveCoordinate xgetBlurRad();

   boolean isSetBlurRad();

   void setBlurRad(long var1);

   void xsetBlurRad(STPositiveCoordinate var1);

   void unsetBlurRad();

   long getDist();

   STPositiveCoordinate xgetDist();

   boolean isSetDist();

   void setDist(long var1);

   void xsetDist(STPositiveCoordinate var1);

   void unsetDist();

   int getDir();

   STPositiveFixedAngle xgetDir();

   boolean isSetDir();

   void setDir(int var1);

   void xsetDir(STPositiveFixedAngle var1);

   void unsetDir();

   int getSx();

   STPercentage xgetSx();

   boolean isSetSx();

   void setSx(int var1);

   void xsetSx(STPercentage var1);

   void unsetSx();

   int getSy();

   STPercentage xgetSy();

   boolean isSetSy();

   void setSy(int var1);

   void xsetSy(STPercentage var1);

   void unsetSy();

   int getKx();

   STFixedAngle xgetKx();

   boolean isSetKx();

   void setKx(int var1);

   void xsetKx(STFixedAngle var1);

   void unsetKx();

   int getKy();

   STFixedAngle xgetKy();

   boolean isSetKy();

   void setKy(int var1);

   void xsetKy(STFixedAngle var1);

   void unsetKy();

   STRectAlignment$Enum getAlgn();

   STRectAlignment xgetAlgn();

   boolean isSetAlgn();

   void setAlgn(STRectAlignment$Enum var1);

   void xsetAlgn(STRectAlignment var1);

   void unsetAlgn();

   boolean getRotWithShape();

   XmlBoolean xgetRotWithShape();

   boolean isSetRotWithShape();

   void setRotWithShape(boolean var1);

   void xsetRotWithShape(XmlBoolean var1);

   void unsetRotWithShape();


   public static final class Factory {

      public static CTOuterShadowEffect newInstance() {
         return (CTOuterShadowEffect)POIXMLTypeLoader.newInstance(CTOuterShadowEffect.type, (XmlOptions)null);
      }

      public static CTOuterShadowEffect newInstance(XmlOptions var0) {
         return (CTOuterShadowEffect)POIXMLTypeLoader.newInstance(CTOuterShadowEffect.type, var0);
      }

      public static CTOuterShadowEffect parse(String var0) throws XmlException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, (XmlOptions)null);
      }

      public static CTOuterShadowEffect parse(String var0, XmlOptions var1) throws XmlException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, var1);
      }

      public static CTOuterShadowEffect parse(File var0) throws XmlException, IOException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, (XmlOptions)null);
      }

      public static CTOuterShadowEffect parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, var1);
      }

      public static CTOuterShadowEffect parse(URL var0) throws XmlException, IOException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, (XmlOptions)null);
      }

      public static CTOuterShadowEffect parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, var1);
      }

      public static CTOuterShadowEffect parse(InputStream var0) throws XmlException, IOException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, (XmlOptions)null);
      }

      public static CTOuterShadowEffect parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, var1);
      }

      public static CTOuterShadowEffect parse(Reader var0) throws XmlException, IOException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, (XmlOptions)null);
      }

      public static CTOuterShadowEffect parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, var1);
      }

      public static CTOuterShadowEffect parse(XMLStreamReader var0) throws XmlException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, (XmlOptions)null);
      }

      public static CTOuterShadowEffect parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, var1);
      }

      public static CTOuterShadowEffect parse(Node var0) throws XmlException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, (XmlOptions)null);
      }

      public static CTOuterShadowEffect parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, var1);
      }

      public static CTOuterShadowEffect parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, (XmlOptions)null);
      }

      public static CTOuterShadowEffect parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTOuterShadowEffect)POIXMLTypeLoader.parse(var0, CTOuterShadowEffect.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOuterShadowEffect.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOuterShadowEffect.type, var1);
      }

   }
}
