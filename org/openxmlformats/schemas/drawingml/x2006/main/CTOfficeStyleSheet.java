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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorSchemeList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTObjectStyleDefaults;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.w3c.dom.Node;

public interface CTOfficeStyleSheet extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTOfficeStyleSheet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctofficestylesheetce25type");


   CTBaseStyles getThemeElements();

   void setThemeElements(CTBaseStyles var1);

   CTBaseStyles addNewThemeElements();

   CTObjectStyleDefaults getObjectDefaults();

   boolean isSetObjectDefaults();

   void setObjectDefaults(CTObjectStyleDefaults var1);

   CTObjectStyleDefaults addNewObjectDefaults();

   void unsetObjectDefaults();

   CTColorSchemeList getExtraClrSchemeLst();

   boolean isSetExtraClrSchemeLst();

   void setExtraClrSchemeLst(CTColorSchemeList var1);

   CTColorSchemeList addNewExtraClrSchemeLst();

   void unsetExtraClrSchemeLst();

   CTCustomColorList getCustClrLst();

   boolean isSetCustClrLst();

   void setCustClrLst(CTCustomColorList var1);

   CTCustomColorList addNewCustClrLst();

   void unsetCustClrLst();

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   String getName();

   XmlString xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   void unsetName();


   public static final class Factory {

      public static CTOfficeStyleSheet newInstance() {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.newInstance(CTOfficeStyleSheet.type, (XmlOptions)null);
      }

      public static CTOfficeStyleSheet newInstance(XmlOptions var0) {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.newInstance(CTOfficeStyleSheet.type, var0);
      }

      public static CTOfficeStyleSheet parse(String var0) throws XmlException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, (XmlOptions)null);
      }

      public static CTOfficeStyleSheet parse(String var0, XmlOptions var1) throws XmlException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, var1);
      }

      public static CTOfficeStyleSheet parse(File var0) throws XmlException, IOException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, (XmlOptions)null);
      }

      public static CTOfficeStyleSheet parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, var1);
      }

      public static CTOfficeStyleSheet parse(URL var0) throws XmlException, IOException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, (XmlOptions)null);
      }

      public static CTOfficeStyleSheet parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, var1);
      }

      public static CTOfficeStyleSheet parse(InputStream var0) throws XmlException, IOException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, (XmlOptions)null);
      }

      public static CTOfficeStyleSheet parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, var1);
      }

      public static CTOfficeStyleSheet parse(Reader var0) throws XmlException, IOException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, (XmlOptions)null);
      }

      public static CTOfficeStyleSheet parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, var1);
      }

      public static CTOfficeStyleSheet parse(XMLStreamReader var0) throws XmlException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, (XmlOptions)null);
      }

      public static CTOfficeStyleSheet parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, var1);
      }

      public static CTOfficeStyleSheet parse(Node var0) throws XmlException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, (XmlOptions)null);
      }

      public static CTOfficeStyleSheet parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, var1);
      }

      public static CTOfficeStyleSheet parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, (XmlOptions)null);
      }

      public static CTOfficeStyleSheet parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTOfficeStyleSheet)POIXMLTypeLoader.parse(var0, CTOfficeStyleSheet.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOfficeStyleSheet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOfficeStyleSheet.type, var1);
      }

   }
}
