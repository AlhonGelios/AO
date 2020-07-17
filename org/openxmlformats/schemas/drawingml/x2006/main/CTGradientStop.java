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
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage;
import org.w3c.dom.Node;

public interface CTGradientStop extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGradientStop.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgradientstopc7edtype");


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

   int getPos();

   STPositiveFixedPercentage xgetPos();

   void setPos(int var1);

   void xsetPos(STPositiveFixedPercentage var1);


   public static final class Factory {

      public static CTGradientStop newInstance() {
         return (CTGradientStop)POIXMLTypeLoader.newInstance(CTGradientStop.type, (XmlOptions)null);
      }

      public static CTGradientStop newInstance(XmlOptions var0) {
         return (CTGradientStop)POIXMLTypeLoader.newInstance(CTGradientStop.type, var0);
      }

      public static CTGradientStop parse(String var0) throws XmlException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, (XmlOptions)null);
      }

      public static CTGradientStop parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, var1);
      }

      public static CTGradientStop parse(File var0) throws XmlException, IOException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, (XmlOptions)null);
      }

      public static CTGradientStop parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, var1);
      }

      public static CTGradientStop parse(URL var0) throws XmlException, IOException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, (XmlOptions)null);
      }

      public static CTGradientStop parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, var1);
      }

      public static CTGradientStop parse(InputStream var0) throws XmlException, IOException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, (XmlOptions)null);
      }

      public static CTGradientStop parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, var1);
      }

      public static CTGradientStop parse(Reader var0) throws XmlException, IOException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, (XmlOptions)null);
      }

      public static CTGradientStop parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, var1);
      }

      public static CTGradientStop parse(XMLStreamReader var0) throws XmlException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, (XmlOptions)null);
      }

      public static CTGradientStop parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, var1);
      }

      public static CTGradientStop parse(Node var0) throws XmlException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, (XmlOptions)null);
      }

      public static CTGradientStop parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, var1);
      }

      public static CTGradientStop parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, (XmlOptions)null);
      }

      public static CTGradientStop parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGradientStop)POIXMLTypeLoader.parse(var0, CTGradientStop.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGradientStop.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGradientStop.type, var1);
      }

   }
}
