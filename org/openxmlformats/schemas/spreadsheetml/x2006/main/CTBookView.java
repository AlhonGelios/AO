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
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility$Enum;
import org.w3c.dom.Node;

public interface CTBookView extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBookView.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctbookviewf677type");


   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   STVisibility$Enum getVisibility();

   STVisibility xgetVisibility();

   boolean isSetVisibility();

   void setVisibility(STVisibility$Enum var1);

   void xsetVisibility(STVisibility var1);

   void unsetVisibility();

   boolean getMinimized();

   XmlBoolean xgetMinimized();

   boolean isSetMinimized();

   void setMinimized(boolean var1);

   void xsetMinimized(XmlBoolean var1);

   void unsetMinimized();

   boolean getShowHorizontalScroll();

   XmlBoolean xgetShowHorizontalScroll();

   boolean isSetShowHorizontalScroll();

   void setShowHorizontalScroll(boolean var1);

   void xsetShowHorizontalScroll(XmlBoolean var1);

   void unsetShowHorizontalScroll();

   boolean getShowVerticalScroll();

   XmlBoolean xgetShowVerticalScroll();

   boolean isSetShowVerticalScroll();

   void setShowVerticalScroll(boolean var1);

   void xsetShowVerticalScroll(XmlBoolean var1);

   void unsetShowVerticalScroll();

   boolean getShowSheetTabs();

   XmlBoolean xgetShowSheetTabs();

   boolean isSetShowSheetTabs();

   void setShowSheetTabs(boolean var1);

   void xsetShowSheetTabs(XmlBoolean var1);

   void unsetShowSheetTabs();

   int getXWindow();

   XmlInt xgetXWindow();

   boolean isSetXWindow();

   void setXWindow(int var1);

   void xsetXWindow(XmlInt var1);

   void unsetXWindow();

   int getYWindow();

   XmlInt xgetYWindow();

   boolean isSetYWindow();

   void setYWindow(int var1);

   void xsetYWindow(XmlInt var1);

   void unsetYWindow();

   long getWindowWidth();

   XmlUnsignedInt xgetWindowWidth();

   boolean isSetWindowWidth();

   void setWindowWidth(long var1);

   void xsetWindowWidth(XmlUnsignedInt var1);

   void unsetWindowWidth();

   long getWindowHeight();

   XmlUnsignedInt xgetWindowHeight();

   boolean isSetWindowHeight();

   void setWindowHeight(long var1);

   void xsetWindowHeight(XmlUnsignedInt var1);

   void unsetWindowHeight();

   long getTabRatio();

   XmlUnsignedInt xgetTabRatio();

   boolean isSetTabRatio();

   void setTabRatio(long var1);

   void xsetTabRatio(XmlUnsignedInt var1);

   void unsetTabRatio();

   long getFirstSheet();

   XmlUnsignedInt xgetFirstSheet();

   boolean isSetFirstSheet();

   void setFirstSheet(long var1);

   void xsetFirstSheet(XmlUnsignedInt var1);

   void unsetFirstSheet();

   long getActiveTab();

   XmlUnsignedInt xgetActiveTab();

   boolean isSetActiveTab();

   void setActiveTab(long var1);

   void xsetActiveTab(XmlUnsignedInt var1);

   void unsetActiveTab();

   boolean getAutoFilterDateGrouping();

   XmlBoolean xgetAutoFilterDateGrouping();

   boolean isSetAutoFilterDateGrouping();

   void setAutoFilterDateGrouping(boolean var1);

   void xsetAutoFilterDateGrouping(XmlBoolean var1);

   void unsetAutoFilterDateGrouping();


   public static final class Factory {

      public static CTBookView newInstance() {
         return (CTBookView)POIXMLTypeLoader.newInstance(CTBookView.type, (XmlOptions)null);
      }

      public static CTBookView newInstance(XmlOptions var0) {
         return (CTBookView)POIXMLTypeLoader.newInstance(CTBookView.type, var0);
      }

      public static CTBookView parse(String var0) throws XmlException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, (XmlOptions)null);
      }

      public static CTBookView parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, var1);
      }

      public static CTBookView parse(File var0) throws XmlException, IOException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, (XmlOptions)null);
      }

      public static CTBookView parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, var1);
      }

      public static CTBookView parse(URL var0) throws XmlException, IOException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, (XmlOptions)null);
      }

      public static CTBookView parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, var1);
      }

      public static CTBookView parse(InputStream var0) throws XmlException, IOException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, (XmlOptions)null);
      }

      public static CTBookView parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, var1);
      }

      public static CTBookView parse(Reader var0) throws XmlException, IOException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, (XmlOptions)null);
      }

      public static CTBookView parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, var1);
      }

      public static CTBookView parse(XMLStreamReader var0) throws XmlException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, (XmlOptions)null);
      }

      public static CTBookView parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, var1);
      }

      public static CTBookView parse(Node var0) throws XmlException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, (XmlOptions)null);
      }

      public static CTBookView parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, var1);
      }

      public static CTBookView parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, (XmlOptions)null);
      }

      public static CTBookView parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBookView)POIXMLTypeLoader.parse(var0, CTBookView.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBookView.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBookView.type, var1);
      }

   }
}
