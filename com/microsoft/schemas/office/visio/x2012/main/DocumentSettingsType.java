package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType;
import com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType;
import com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType;
import com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType;
import com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType;
import com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType;
import com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType;
import com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType;
import com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType;
import com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType;
import com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType;
import com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType;
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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface DocumentSettingsType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(DocumentSettingsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("documentsettingstype945btype");


   GlueSettingsType getGlueSettings();

   boolean isSetGlueSettings();

   void setGlueSettings(GlueSettingsType var1);

   GlueSettingsType addNewGlueSettings();

   void unsetGlueSettings();

   SnapSettingsType getSnapSettings();

   boolean isSetSnapSettings();

   void setSnapSettings(SnapSettingsType var1);

   SnapSettingsType addNewSnapSettings();

   void unsetSnapSettings();

   SnapExtensionsType getSnapExtensions();

   boolean isSetSnapExtensions();

   void setSnapExtensions(SnapExtensionsType var1);

   SnapExtensionsType addNewSnapExtensions();

   void unsetSnapExtensions();

   SnapAnglesType getSnapAngles();

   boolean isSetSnapAngles();

   void setSnapAngles(SnapAnglesType var1);

   SnapAnglesType addNewSnapAngles();

   void unsetSnapAngles();

   DynamicGridEnabledType getDynamicGridEnabled();

   boolean isSetDynamicGridEnabled();

   void setDynamicGridEnabled(DynamicGridEnabledType var1);

   DynamicGridEnabledType addNewDynamicGridEnabled();

   void unsetDynamicGridEnabled();

   ProtectStylesType getProtectStyles();

   boolean isSetProtectStyles();

   void setProtectStyles(ProtectStylesType var1);

   ProtectStylesType addNewProtectStyles();

   void unsetProtectStyles();

   ProtectShapesType getProtectShapes();

   boolean isSetProtectShapes();

   void setProtectShapes(ProtectShapesType var1);

   ProtectShapesType addNewProtectShapes();

   void unsetProtectShapes();

   ProtectMastersType getProtectMasters();

   boolean isSetProtectMasters();

   void setProtectMasters(ProtectMastersType var1);

   ProtectMastersType addNewProtectMasters();

   void unsetProtectMasters();

   ProtectBkgndsType getProtectBkgnds();

   boolean isSetProtectBkgnds();

   void setProtectBkgnds(ProtectBkgndsType var1);

   ProtectBkgndsType addNewProtectBkgnds();

   void unsetProtectBkgnds();

   CustomMenusFileType getCustomMenusFile();

   boolean isSetCustomMenusFile();

   void setCustomMenusFile(CustomMenusFileType var1);

   CustomMenusFileType addNewCustomMenusFile();

   void unsetCustomMenusFile();

   CustomToolbarsFileType getCustomToolbarsFile();

   boolean isSetCustomToolbarsFile();

   void setCustomToolbarsFile(CustomToolbarsFileType var1);

   CustomToolbarsFileType addNewCustomToolbarsFile();

   void unsetCustomToolbarsFile();

   AttachedToolbarsType getAttachedToolbars();

   boolean isSetAttachedToolbars();

   void setAttachedToolbars(AttachedToolbarsType var1);

   AttachedToolbarsType addNewAttachedToolbars();

   void unsetAttachedToolbars();

   long getTopPage();

   XmlUnsignedInt xgetTopPage();

   boolean isSetTopPage();

   void setTopPage(long var1);

   void xsetTopPage(XmlUnsignedInt var1);

   void unsetTopPage();

   long getDefaultTextStyle();

   XmlUnsignedInt xgetDefaultTextStyle();

   boolean isSetDefaultTextStyle();

   void setDefaultTextStyle(long var1);

   void xsetDefaultTextStyle(XmlUnsignedInt var1);

   void unsetDefaultTextStyle();

   long getDefaultLineStyle();

   XmlUnsignedInt xgetDefaultLineStyle();

   boolean isSetDefaultLineStyle();

   void setDefaultLineStyle(long var1);

   void xsetDefaultLineStyle(XmlUnsignedInt var1);

   void unsetDefaultLineStyle();

   long getDefaultFillStyle();

   XmlUnsignedInt xgetDefaultFillStyle();

   boolean isSetDefaultFillStyle();

   void setDefaultFillStyle(long var1);

   void xsetDefaultFillStyle(XmlUnsignedInt var1);

   void unsetDefaultFillStyle();

   long getDefaultGuideStyle();

   XmlUnsignedInt xgetDefaultGuideStyle();

   boolean isSetDefaultGuideStyle();

   void setDefaultGuideStyle(long var1);

   void xsetDefaultGuideStyle(XmlUnsignedInt var1);

   void unsetDefaultGuideStyle();


   public static final class Factory {

      public static DocumentSettingsType newInstance() {
         return (DocumentSettingsType)POIXMLTypeLoader.newInstance(DocumentSettingsType.type, (XmlOptions)null);
      }

      public static DocumentSettingsType newInstance(XmlOptions var0) {
         return (DocumentSettingsType)POIXMLTypeLoader.newInstance(DocumentSettingsType.type, var0);
      }

      public static DocumentSettingsType parse(String var0) throws XmlException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, (XmlOptions)null);
      }

      public static DocumentSettingsType parse(String var0, XmlOptions var1) throws XmlException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, var1);
      }

      public static DocumentSettingsType parse(File var0) throws XmlException, IOException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, (XmlOptions)null);
      }

      public static DocumentSettingsType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, var1);
      }

      public static DocumentSettingsType parse(URL var0) throws XmlException, IOException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, (XmlOptions)null);
      }

      public static DocumentSettingsType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, var1);
      }

      public static DocumentSettingsType parse(InputStream var0) throws XmlException, IOException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, (XmlOptions)null);
      }

      public static DocumentSettingsType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, var1);
      }

      public static DocumentSettingsType parse(Reader var0) throws XmlException, IOException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, (XmlOptions)null);
      }

      public static DocumentSettingsType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, var1);
      }

      public static DocumentSettingsType parse(XMLStreamReader var0) throws XmlException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, (XmlOptions)null);
      }

      public static DocumentSettingsType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, var1);
      }

      public static DocumentSettingsType parse(Node var0) throws XmlException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, (XmlOptions)null);
      }

      public static DocumentSettingsType parse(Node var0, XmlOptions var1) throws XmlException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, var1);
      }

      public static DocumentSettingsType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, (XmlOptions)null);
      }

      public static DocumentSettingsType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (DocumentSettingsType)POIXMLTypeLoader.parse(var0, DocumentSettingsType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, DocumentSettingsType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, DocumentSettingsType.type, var1);
      }

   }
}
