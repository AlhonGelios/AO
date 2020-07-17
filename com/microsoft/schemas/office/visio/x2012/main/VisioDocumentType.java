package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.ColorsType;
import com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType;
import com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType;
import com.microsoft.schemas.office.visio.x2012.main.EventListType;
import com.microsoft.schemas.office.visio.x2012.main.FaceNamesType;
import com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType;
import com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType;
import com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType;
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
import org.w3c.dom.Node;

public interface VisioDocumentType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(VisioDocumentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("visiodocumenttypebfcatype");


   DocumentSettingsType getDocumentSettings();

   boolean isSetDocumentSettings();

   void setDocumentSettings(DocumentSettingsType var1);

   DocumentSettingsType addNewDocumentSettings();

   void unsetDocumentSettings();

   ColorsType getColors();

   boolean isSetColors();

   void setColors(ColorsType var1);

   ColorsType addNewColors();

   void unsetColors();

   FaceNamesType getFaceNames();

   boolean isSetFaceNames();

   void setFaceNames(FaceNamesType var1);

   FaceNamesType addNewFaceNames();

   void unsetFaceNames();

   StyleSheetsType getStyleSheets();

   boolean isSetStyleSheets();

   void setStyleSheets(StyleSheetsType var1);

   StyleSheetsType addNewStyleSheets();

   void unsetStyleSheets();

   DocumentSheetType getDocumentSheet();

   boolean isSetDocumentSheet();

   void setDocumentSheet(DocumentSheetType var1);

   DocumentSheetType addNewDocumentSheet();

   void unsetDocumentSheet();

   EventListType getEventList();

   boolean isSetEventList();

   void setEventList(EventListType var1);

   EventListType addNewEventList();

   void unsetEventList();

   HeaderFooterType getHeaderFooter();

   boolean isSetHeaderFooter();

   void setHeaderFooter(HeaderFooterType var1);

   HeaderFooterType addNewHeaderFooter();

   void unsetHeaderFooter();

   PublishSettingsType getPublishSettings();

   boolean isSetPublishSettings();

   void setPublishSettings(PublishSettingsType var1);

   PublishSettingsType addNewPublishSettings();

   void unsetPublishSettings();


   public static final class Factory {

      public static VisioDocumentType newInstance() {
         return (VisioDocumentType)POIXMLTypeLoader.newInstance(VisioDocumentType.type, (XmlOptions)null);
      }

      public static VisioDocumentType newInstance(XmlOptions var0) {
         return (VisioDocumentType)POIXMLTypeLoader.newInstance(VisioDocumentType.type, var0);
      }

      public static VisioDocumentType parse(String var0) throws XmlException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, (XmlOptions)null);
      }

      public static VisioDocumentType parse(String var0, XmlOptions var1) throws XmlException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, var1);
      }

      public static VisioDocumentType parse(File var0) throws XmlException, IOException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, (XmlOptions)null);
      }

      public static VisioDocumentType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, var1);
      }

      public static VisioDocumentType parse(URL var0) throws XmlException, IOException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, (XmlOptions)null);
      }

      public static VisioDocumentType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, var1);
      }

      public static VisioDocumentType parse(InputStream var0) throws XmlException, IOException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, (XmlOptions)null);
      }

      public static VisioDocumentType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, var1);
      }

      public static VisioDocumentType parse(Reader var0) throws XmlException, IOException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, (XmlOptions)null);
      }

      public static VisioDocumentType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, var1);
      }

      public static VisioDocumentType parse(XMLStreamReader var0) throws XmlException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, (XmlOptions)null);
      }

      public static VisioDocumentType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, var1);
      }

      public static VisioDocumentType parse(Node var0) throws XmlException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, (XmlOptions)null);
      }

      public static VisioDocumentType parse(Node var0, XmlOptions var1) throws XmlException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, var1);
      }

      public static VisioDocumentType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, (XmlOptions)null);
      }

      public static VisioDocumentType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (VisioDocumentType)POIXMLTypeLoader.parse(var0, VisioDocumentType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, VisioDocumentType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, VisioDocumentType.type, var1);
      }

   }
}
