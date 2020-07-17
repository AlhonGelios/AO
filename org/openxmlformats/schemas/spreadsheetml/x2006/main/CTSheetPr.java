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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.w3c.dom.Node;

public interface CTSheetPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSheetPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsheetpr3ae0type");


   CTColor getTabColor();

   boolean isSetTabColor();

   void setTabColor(CTColor var1);

   CTColor addNewTabColor();

   void unsetTabColor();

   CTOutlinePr getOutlinePr();

   boolean isSetOutlinePr();

   void setOutlinePr(CTOutlinePr var1);

   CTOutlinePr addNewOutlinePr();

   void unsetOutlinePr();

   CTPageSetUpPr getPageSetUpPr();

   boolean isSetPageSetUpPr();

   void setPageSetUpPr(CTPageSetUpPr var1);

   CTPageSetUpPr addNewPageSetUpPr();

   void unsetPageSetUpPr();

   boolean getSyncHorizontal();

   XmlBoolean xgetSyncHorizontal();

   boolean isSetSyncHorizontal();

   void setSyncHorizontal(boolean var1);

   void xsetSyncHorizontal(XmlBoolean var1);

   void unsetSyncHorizontal();

   boolean getSyncVertical();

   XmlBoolean xgetSyncVertical();

   boolean isSetSyncVertical();

   void setSyncVertical(boolean var1);

   void xsetSyncVertical(XmlBoolean var1);

   void unsetSyncVertical();

   String getSyncRef();

   STRef xgetSyncRef();

   boolean isSetSyncRef();

   void setSyncRef(String var1);

   void xsetSyncRef(STRef var1);

   void unsetSyncRef();

   boolean getTransitionEvaluation();

   XmlBoolean xgetTransitionEvaluation();

   boolean isSetTransitionEvaluation();

   void setTransitionEvaluation(boolean var1);

   void xsetTransitionEvaluation(XmlBoolean var1);

   void unsetTransitionEvaluation();

   boolean getTransitionEntry();

   XmlBoolean xgetTransitionEntry();

   boolean isSetTransitionEntry();

   void setTransitionEntry(boolean var1);

   void xsetTransitionEntry(XmlBoolean var1);

   void unsetTransitionEntry();

   boolean getPublished();

   XmlBoolean xgetPublished();

   boolean isSetPublished();

   void setPublished(boolean var1);

   void xsetPublished(XmlBoolean var1);

   void unsetPublished();

   String getCodeName();

   XmlString xgetCodeName();

   boolean isSetCodeName();

   void setCodeName(String var1);

   void xsetCodeName(XmlString var1);

   void unsetCodeName();

   boolean getFilterMode();

   XmlBoolean xgetFilterMode();

   boolean isSetFilterMode();

   void setFilterMode(boolean var1);

   void xsetFilterMode(XmlBoolean var1);

   void unsetFilterMode();

   boolean getEnableFormatConditionsCalculation();

   XmlBoolean xgetEnableFormatConditionsCalculation();

   boolean isSetEnableFormatConditionsCalculation();

   void setEnableFormatConditionsCalculation(boolean var1);

   void xsetEnableFormatConditionsCalculation(XmlBoolean var1);

   void unsetEnableFormatConditionsCalculation();


   public static final class Factory {

      public static CTSheetPr newInstance() {
         return (CTSheetPr)POIXMLTypeLoader.newInstance(CTSheetPr.type, (XmlOptions)null);
      }

      public static CTSheetPr newInstance(XmlOptions var0) {
         return (CTSheetPr)POIXMLTypeLoader.newInstance(CTSheetPr.type, var0);
      }

      public static CTSheetPr parse(String var0) throws XmlException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, (XmlOptions)null);
      }

      public static CTSheetPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, var1);
      }

      public static CTSheetPr parse(File var0) throws XmlException, IOException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, (XmlOptions)null);
      }

      public static CTSheetPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, var1);
      }

      public static CTSheetPr parse(URL var0) throws XmlException, IOException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, (XmlOptions)null);
      }

      public static CTSheetPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, var1);
      }

      public static CTSheetPr parse(InputStream var0) throws XmlException, IOException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, (XmlOptions)null);
      }

      public static CTSheetPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, var1);
      }

      public static CTSheetPr parse(Reader var0) throws XmlException, IOException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, (XmlOptions)null);
      }

      public static CTSheetPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, var1);
      }

      public static CTSheetPr parse(XMLStreamReader var0) throws XmlException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, (XmlOptions)null);
      }

      public static CTSheetPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, var1);
      }

      public static CTSheetPr parse(Node var0) throws XmlException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, (XmlOptions)null);
      }

      public static CTSheetPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, var1);
      }

      public static CTSheetPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, (XmlOptions)null);
      }

      public static CTSheetPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSheetPr)POIXMLTypeLoader.parse(var0, CTSheetPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetPr.type, var1);
      }

   }
}
