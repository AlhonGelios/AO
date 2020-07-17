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
import org.openxmlformats.schemas.drawingml.x2006.main.STFontCollectionIndex;
import org.w3c.dom.Node;

public interface CTFontReference extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFontReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfontreferencef5adtype");


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

   STFontCollectionIndex.Enum getIdx();

   STFontCollectionIndex xgetIdx();

   void setIdx(STFontCollectionIndex.Enum var1);

   void xsetIdx(STFontCollectionIndex var1);


   public static final class Factory {

      public static CTFontReference newInstance() {
         return (CTFontReference)POIXMLTypeLoader.newInstance(CTFontReference.type, (XmlOptions)null);
      }

      public static CTFontReference newInstance(XmlOptions var0) {
         return (CTFontReference)POIXMLTypeLoader.newInstance(CTFontReference.type, var0);
      }

      public static CTFontReference parse(String var0) throws XmlException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, (XmlOptions)null);
      }

      public static CTFontReference parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, var1);
      }

      public static CTFontReference parse(File var0) throws XmlException, IOException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, (XmlOptions)null);
      }

      public static CTFontReference parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, var1);
      }

      public static CTFontReference parse(URL var0) throws XmlException, IOException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, (XmlOptions)null);
      }

      public static CTFontReference parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, var1);
      }

      public static CTFontReference parse(InputStream var0) throws XmlException, IOException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, (XmlOptions)null);
      }

      public static CTFontReference parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, var1);
      }

      public static CTFontReference parse(Reader var0) throws XmlException, IOException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, (XmlOptions)null);
      }

      public static CTFontReference parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, var1);
      }

      public static CTFontReference parse(XMLStreamReader var0) throws XmlException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, (XmlOptions)null);
      }

      public static CTFontReference parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, var1);
      }

      public static CTFontReference parse(Node var0) throws XmlException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, (XmlOptions)null);
      }

      public static CTFontReference parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, var1);
      }

      public static CTFontReference parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, (XmlOptions)null);
      }

      public static CTFontReference parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFontReference)POIXMLTypeLoader.parse(var0, CTFontReference.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFontReference.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFontReference.type, var1);
      }

   }
}
