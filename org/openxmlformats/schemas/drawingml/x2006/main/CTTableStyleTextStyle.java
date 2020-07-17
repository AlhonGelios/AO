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
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor;
import org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType;
import org.w3c.dom.Node;

public interface CTTableStyleTextStyle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableStyleTextStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablestyletextstylec932type");


   CTFontCollection getFont();

   boolean isSetFont();

   void setFont(CTFontCollection var1);

   CTFontCollection addNewFont();

   void unsetFont();

   CTFontReference getFontRef();

   boolean isSetFontRef();

   void setFontRef(CTFontReference var1);

   CTFontReference addNewFontRef();

   void unsetFontRef();

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

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   STOnOffStyleType.Enum getB();

   STOnOffStyleType xgetB();

   boolean isSetB();

   void setB(STOnOffStyleType.Enum var1);

   void xsetB(STOnOffStyleType var1);

   void unsetB();

   STOnOffStyleType.Enum getI();

   STOnOffStyleType xgetI();

   boolean isSetI();

   void setI(STOnOffStyleType.Enum var1);

   void xsetI(STOnOffStyleType var1);

   void unsetI();


   public static final class Factory {

      public static CTTableStyleTextStyle newInstance() {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.newInstance(CTTableStyleTextStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleTextStyle newInstance(XmlOptions var0) {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.newInstance(CTTableStyleTextStyle.type, var0);
      }

      public static CTTableStyleTextStyle parse(String var0) throws XmlException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleTextStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, var1);
      }

      public static CTTableStyleTextStyle parse(File var0) throws XmlException, IOException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleTextStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, var1);
      }

      public static CTTableStyleTextStyle parse(URL var0) throws XmlException, IOException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleTextStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, var1);
      }

      public static CTTableStyleTextStyle parse(InputStream var0) throws XmlException, IOException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleTextStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, var1);
      }

      public static CTTableStyleTextStyle parse(Reader var0) throws XmlException, IOException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleTextStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, var1);
      }

      public static CTTableStyleTextStyle parse(XMLStreamReader var0) throws XmlException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleTextStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, var1);
      }

      public static CTTableStyleTextStyle parse(Node var0) throws XmlException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleTextStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, var1);
      }

      public static CTTableStyleTextStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleTextStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableStyleTextStyle)POIXMLTypeLoader.parse(var0, CTTableStyleTextStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableStyleTextStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableStyleTextStyle.type, var1);
      }

   }
}
