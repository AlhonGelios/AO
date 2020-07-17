package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks$Enum;
import org.w3c.dom.Node;

public interface CTWorkbookPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTWorkbookPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctworkbookpr03a5type");


   boolean getDate1904();

   XmlBoolean xgetDate1904();

   boolean isSetDate1904();

   void setDate1904(boolean var1);

   void xsetDate1904(XmlBoolean var1);

   void unsetDate1904();

   STObjects$Enum getShowObjects();

   STObjects xgetShowObjects();

   boolean isSetShowObjects();

   void setShowObjects(STObjects$Enum var1);

   void xsetShowObjects(STObjects var1);

   void unsetShowObjects();

   boolean getShowBorderUnselectedTables();

   XmlBoolean xgetShowBorderUnselectedTables();

   boolean isSetShowBorderUnselectedTables();

   void setShowBorderUnselectedTables(boolean var1);

   void xsetShowBorderUnselectedTables(XmlBoolean var1);

   void unsetShowBorderUnselectedTables();

   boolean getFilterPrivacy();

   XmlBoolean xgetFilterPrivacy();

   boolean isSetFilterPrivacy();

   void setFilterPrivacy(boolean var1);

   void xsetFilterPrivacy(XmlBoolean var1);

   void unsetFilterPrivacy();

   boolean getPromptedSolutions();

   XmlBoolean xgetPromptedSolutions();

   boolean isSetPromptedSolutions();

   void setPromptedSolutions(boolean var1);

   void xsetPromptedSolutions(XmlBoolean var1);

   void unsetPromptedSolutions();

   boolean getShowInkAnnotation();

   XmlBoolean xgetShowInkAnnotation();

   boolean isSetShowInkAnnotation();

   void setShowInkAnnotation(boolean var1);

   void xsetShowInkAnnotation(XmlBoolean var1);

   void unsetShowInkAnnotation();

   boolean getBackupFile();

   XmlBoolean xgetBackupFile();

   boolean isSetBackupFile();

   void setBackupFile(boolean var1);

   void xsetBackupFile(XmlBoolean var1);

   void unsetBackupFile();

   boolean getSaveExternalLinkValues();

   XmlBoolean xgetSaveExternalLinkValues();

   boolean isSetSaveExternalLinkValues();

   void setSaveExternalLinkValues(boolean var1);

   void xsetSaveExternalLinkValues(XmlBoolean var1);

   void unsetSaveExternalLinkValues();

   STUpdateLinks$Enum getUpdateLinks();

   STUpdateLinks xgetUpdateLinks();

   boolean isSetUpdateLinks();

   void setUpdateLinks(STUpdateLinks$Enum var1);

   void xsetUpdateLinks(STUpdateLinks var1);

   void unsetUpdateLinks();

   String getCodeName();

   XmlString xgetCodeName();

   boolean isSetCodeName();

   void setCodeName(String var1);

   void xsetCodeName(XmlString var1);

   void unsetCodeName();

   boolean getHidePivotFieldList();

   XmlBoolean xgetHidePivotFieldList();

   boolean isSetHidePivotFieldList();

   void setHidePivotFieldList(boolean var1);

   void xsetHidePivotFieldList(XmlBoolean var1);

   void unsetHidePivotFieldList();

   boolean getShowPivotChartFilter();

   XmlBoolean xgetShowPivotChartFilter();

   boolean isSetShowPivotChartFilter();

   void setShowPivotChartFilter(boolean var1);

   void xsetShowPivotChartFilter(XmlBoolean var1);

   void unsetShowPivotChartFilter();

   boolean getAllowRefreshQuery();

   XmlBoolean xgetAllowRefreshQuery();

   boolean isSetAllowRefreshQuery();

   void setAllowRefreshQuery(boolean var1);

   void xsetAllowRefreshQuery(XmlBoolean var1);

   void unsetAllowRefreshQuery();

   boolean getPublishItems();

   XmlBoolean xgetPublishItems();

   boolean isSetPublishItems();

   void setPublishItems(boolean var1);

   void xsetPublishItems(XmlBoolean var1);

   void unsetPublishItems();

   boolean getCheckCompatibility();

   XmlBoolean xgetCheckCompatibility();

   boolean isSetCheckCompatibility();

   void setCheckCompatibility(boolean var1);

   void xsetCheckCompatibility(XmlBoolean var1);

   void unsetCheckCompatibility();

   boolean getAutoCompressPictures();

   XmlBoolean xgetAutoCompressPictures();

   boolean isSetAutoCompressPictures();

   void setAutoCompressPictures(boolean var1);

   void xsetAutoCompressPictures(XmlBoolean var1);

   void unsetAutoCompressPictures();

   boolean getRefreshAllConnections();

   XmlBoolean xgetRefreshAllConnections();

   boolean isSetRefreshAllConnections();

   void setRefreshAllConnections(boolean var1);

   void xsetRefreshAllConnections(XmlBoolean var1);

   void unsetRefreshAllConnections();

   long getDefaultThemeVersion();

   XmlUnsignedInt xgetDefaultThemeVersion();

   boolean isSetDefaultThemeVersion();

   void setDefaultThemeVersion(long var1);

   void xsetDefaultThemeVersion(XmlUnsignedInt var1);

   void unsetDefaultThemeVersion();


   public static final class Factory {

      public static CTWorkbookPr newInstance() {
         return (CTWorkbookPr)POIXMLTypeLoader.newInstance(CTWorkbookPr.type, (XmlOptions)null);
      }

      public static CTWorkbookPr newInstance(XmlOptions var0) {
         return (CTWorkbookPr)POIXMLTypeLoader.newInstance(CTWorkbookPr.type, var0);
      }

      public static CTWorkbookPr parse(String var0) throws XmlException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, (XmlOptions)null);
      }

      public static CTWorkbookPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, var1);
      }

      public static CTWorkbookPr parse(File var0) throws XmlException, IOException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, (XmlOptions)null);
      }

      public static CTWorkbookPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, var1);
      }

      public static CTWorkbookPr parse(URL var0) throws XmlException, IOException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, (XmlOptions)null);
      }

      public static CTWorkbookPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, var1);
      }

      public static CTWorkbookPr parse(InputStream var0) throws XmlException, IOException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, (XmlOptions)null);
      }

      public static CTWorkbookPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, var1);
      }

      public static CTWorkbookPr parse(Reader var0) throws XmlException, IOException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, (XmlOptions)null);
      }

      public static CTWorkbookPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, var1);
      }

      public static CTWorkbookPr parse(XMLStreamReader var0) throws XmlException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, (XmlOptions)null);
      }

      public static CTWorkbookPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, var1);
      }

      public static CTWorkbookPr parse(Node var0) throws XmlException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, (XmlOptions)null);
      }

      public static CTWorkbookPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, var1);
      }

      public static CTWorkbookPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, (XmlOptions)null);
      }

      public static CTWorkbookPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTWorkbookPr)POIXMLTypeLoader.parse(var0, CTWorkbookPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTWorkbookPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTWorkbookPr.type, var1);
      }

   }
}
