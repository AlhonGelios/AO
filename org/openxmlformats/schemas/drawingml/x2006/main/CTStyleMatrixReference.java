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
import org.openxmlformats.schemas.drawingml.x2006.main.STStyleMatrixColumnIndex;
import org.w3c.dom.Node;

public interface CTStyleMatrixReference extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTStyleMatrixReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctstylematrixreference6ef4type");


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

   long getIdx();

   STStyleMatrixColumnIndex xgetIdx();

   void setIdx(long var1);

   void xsetIdx(STStyleMatrixColumnIndex var1);


   public static final class Factory {

      public static CTStyleMatrixReference newInstance() {
         return (CTStyleMatrixReference)POIXMLTypeLoader.newInstance(CTStyleMatrixReference.type, (XmlOptions)null);
      }

      public static CTStyleMatrixReference newInstance(XmlOptions var0) {
         return (CTStyleMatrixReference)POIXMLTypeLoader.newInstance(CTStyleMatrixReference.type, var0);
      }

      public static CTStyleMatrixReference parse(String var0) throws XmlException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, (XmlOptions)null);
      }

      public static CTStyleMatrixReference parse(String var0, XmlOptions var1) throws XmlException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, var1);
      }

      public static CTStyleMatrixReference parse(File var0) throws XmlException, IOException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, (XmlOptions)null);
      }

      public static CTStyleMatrixReference parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, var1);
      }

      public static CTStyleMatrixReference parse(URL var0) throws XmlException, IOException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, (XmlOptions)null);
      }

      public static CTStyleMatrixReference parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, var1);
      }

      public static CTStyleMatrixReference parse(InputStream var0) throws XmlException, IOException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, (XmlOptions)null);
      }

      public static CTStyleMatrixReference parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, var1);
      }

      public static CTStyleMatrixReference parse(Reader var0) throws XmlException, IOException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, (XmlOptions)null);
      }

      public static CTStyleMatrixReference parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, var1);
      }

      public static CTStyleMatrixReference parse(XMLStreamReader var0) throws XmlException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, (XmlOptions)null);
      }

      public static CTStyleMatrixReference parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, var1);
      }

      public static CTStyleMatrixReference parse(Node var0) throws XmlException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, (XmlOptions)null);
      }

      public static CTStyleMatrixReference parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, var1);
      }

      public static CTStyleMatrixReference parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, (XmlOptions)null);
      }

      public static CTStyleMatrixReference parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTStyleMatrixReference)POIXMLTypeLoader.parse(var0, CTStyleMatrixReference.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStyleMatrixReference.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTStyleMatrixReference.type, var1);
      }

   }
}
