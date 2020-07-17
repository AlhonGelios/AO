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
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix;
import org.w3c.dom.Node;

public interface CTBaseStyles extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBaseStyles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbasestyles122etype");


   CTColorScheme getClrScheme();

   void setClrScheme(CTColorScheme var1);

   CTColorScheme addNewClrScheme();

   CTFontScheme getFontScheme();

   void setFontScheme(CTFontScheme var1);

   CTFontScheme addNewFontScheme();

   CTStyleMatrix getFmtScheme();

   void setFmtScheme(CTStyleMatrix var1);

   CTStyleMatrix addNewFmtScheme();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTBaseStyles newInstance() {
         return (CTBaseStyles)POIXMLTypeLoader.newInstance(CTBaseStyles.type, (XmlOptions)null);
      }

      public static CTBaseStyles newInstance(XmlOptions var0) {
         return (CTBaseStyles)POIXMLTypeLoader.newInstance(CTBaseStyles.type, var0);
      }

      public static CTBaseStyles parse(String var0) throws XmlException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, (XmlOptions)null);
      }

      public static CTBaseStyles parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, var1);
      }

      public static CTBaseStyles parse(File var0) throws XmlException, IOException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, (XmlOptions)null);
      }

      public static CTBaseStyles parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, var1);
      }

      public static CTBaseStyles parse(URL var0) throws XmlException, IOException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, (XmlOptions)null);
      }

      public static CTBaseStyles parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, var1);
      }

      public static CTBaseStyles parse(InputStream var0) throws XmlException, IOException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, (XmlOptions)null);
      }

      public static CTBaseStyles parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, var1);
      }

      public static CTBaseStyles parse(Reader var0) throws XmlException, IOException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, (XmlOptions)null);
      }

      public static CTBaseStyles parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, var1);
      }

      public static CTBaseStyles parse(XMLStreamReader var0) throws XmlException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, (XmlOptions)null);
      }

      public static CTBaseStyles parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, var1);
      }

      public static CTBaseStyles parse(Node var0) throws XmlException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, (XmlOptions)null);
      }

      public static CTBaseStyles parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, var1);
      }

      public static CTBaseStyles parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, (XmlOptions)null);
      }

      public static CTBaseStyles parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBaseStyles)POIXMLTypeLoader.parse(var0, CTBaseStyles.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBaseStyles.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBaseStyles.type, var1);
      }

   }
}
