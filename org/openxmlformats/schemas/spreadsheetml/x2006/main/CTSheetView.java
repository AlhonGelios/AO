package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType$Enum;
import org.w3c.dom.Node;

public interface CTSheetView extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSheetView.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsheetview0f43type");


   CTPane getPane();

   boolean isSetPane();

   void setPane(CTPane var1);

   CTPane addNewPane();

   void unsetPane();

   List getSelectionList();

   CTSelection[] getSelectionArray();

   CTSelection getSelectionArray(int var1);

   int sizeOfSelectionArray();

   void setSelectionArray(CTSelection[] var1);

   void setSelectionArray(int var1, CTSelection var2);

   CTSelection insertNewSelection(int var1);

   CTSelection addNewSelection();

   void removeSelection(int var1);

   List getPivotSelectionList();

   CTPivotSelection[] getPivotSelectionArray();

   CTPivotSelection getPivotSelectionArray(int var1);

   int sizeOfPivotSelectionArray();

   void setPivotSelectionArray(CTPivotSelection[] var1);

   void setPivotSelectionArray(int var1, CTPivotSelection var2);

   CTPivotSelection insertNewPivotSelection(int var1);

   CTPivotSelection addNewPivotSelection();

   void removePivotSelection(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   boolean getWindowProtection();

   XmlBoolean xgetWindowProtection();

   boolean isSetWindowProtection();

   void setWindowProtection(boolean var1);

   void xsetWindowProtection(XmlBoolean var1);

   void unsetWindowProtection();

   boolean getShowFormulas();

   XmlBoolean xgetShowFormulas();

   boolean isSetShowFormulas();

   void setShowFormulas(boolean var1);

   void xsetShowFormulas(XmlBoolean var1);

   void unsetShowFormulas();

   boolean getShowGridLines();

   XmlBoolean xgetShowGridLines();

   boolean isSetShowGridLines();

   void setShowGridLines(boolean var1);

   void xsetShowGridLines(XmlBoolean var1);

   void unsetShowGridLines();

   boolean getShowRowColHeaders();

   XmlBoolean xgetShowRowColHeaders();

   boolean isSetShowRowColHeaders();

   void setShowRowColHeaders(boolean var1);

   void xsetShowRowColHeaders(XmlBoolean var1);

   void unsetShowRowColHeaders();

   boolean getShowZeros();

   XmlBoolean xgetShowZeros();

   boolean isSetShowZeros();

   void setShowZeros(boolean var1);

   void xsetShowZeros(XmlBoolean var1);

   void unsetShowZeros();

   boolean getRightToLeft();

   XmlBoolean xgetRightToLeft();

   boolean isSetRightToLeft();

   void setRightToLeft(boolean var1);

   void xsetRightToLeft(XmlBoolean var1);

   void unsetRightToLeft();

   boolean getTabSelected();

   XmlBoolean xgetTabSelected();

   boolean isSetTabSelected();

   void setTabSelected(boolean var1);

   void xsetTabSelected(XmlBoolean var1);

   void unsetTabSelected();

   boolean getShowRuler();

   XmlBoolean xgetShowRuler();

   boolean isSetShowRuler();

   void setShowRuler(boolean var1);

   void xsetShowRuler(XmlBoolean var1);

   void unsetShowRuler();

   boolean getShowOutlineSymbols();

   XmlBoolean xgetShowOutlineSymbols();

   boolean isSetShowOutlineSymbols();

   void setShowOutlineSymbols(boolean var1);

   void xsetShowOutlineSymbols(XmlBoolean var1);

   void unsetShowOutlineSymbols();

   boolean getDefaultGridColor();

   XmlBoolean xgetDefaultGridColor();

   boolean isSetDefaultGridColor();

   void setDefaultGridColor(boolean var1);

   void xsetDefaultGridColor(XmlBoolean var1);

   void unsetDefaultGridColor();

   boolean getShowWhiteSpace();

   XmlBoolean xgetShowWhiteSpace();

   boolean isSetShowWhiteSpace();

   void setShowWhiteSpace(boolean var1);

   void xsetShowWhiteSpace(XmlBoolean var1);

   void unsetShowWhiteSpace();

   STSheetViewType$Enum getView();

   STSheetViewType xgetView();

   boolean isSetView();

   void setView(STSheetViewType$Enum var1);

   void xsetView(STSheetViewType var1);

   void unsetView();

   String getTopLeftCell();

   STCellRef xgetTopLeftCell();

   boolean isSetTopLeftCell();

   void setTopLeftCell(String var1);

   void xsetTopLeftCell(STCellRef var1);

   void unsetTopLeftCell();

   long getColorId();

   XmlUnsignedInt xgetColorId();

   boolean isSetColorId();

   void setColorId(long var1);

   void xsetColorId(XmlUnsignedInt var1);

   void unsetColorId();

   long getZoomScale();

   XmlUnsignedInt xgetZoomScale();

   boolean isSetZoomScale();

   void setZoomScale(long var1);

   void xsetZoomScale(XmlUnsignedInt var1);

   void unsetZoomScale();

   long getZoomScaleNormal();

   XmlUnsignedInt xgetZoomScaleNormal();

   boolean isSetZoomScaleNormal();

   void setZoomScaleNormal(long var1);

   void xsetZoomScaleNormal(XmlUnsignedInt var1);

   void unsetZoomScaleNormal();

   long getZoomScaleSheetLayoutView();

   XmlUnsignedInt xgetZoomScaleSheetLayoutView();

   boolean isSetZoomScaleSheetLayoutView();

   void setZoomScaleSheetLayoutView(long var1);

   void xsetZoomScaleSheetLayoutView(XmlUnsignedInt var1);

   void unsetZoomScaleSheetLayoutView();

   long getZoomScalePageLayoutView();

   XmlUnsignedInt xgetZoomScalePageLayoutView();

   boolean isSetZoomScalePageLayoutView();

   void setZoomScalePageLayoutView(long var1);

   void xsetZoomScalePageLayoutView(XmlUnsignedInt var1);

   void unsetZoomScalePageLayoutView();

   long getWorkbookViewId();

   XmlUnsignedInt xgetWorkbookViewId();

   void setWorkbookViewId(long var1);

   void xsetWorkbookViewId(XmlUnsignedInt var1);


   public static final class Factory {

      public static CTSheetView newInstance() {
         return (CTSheetView)POIXMLTypeLoader.newInstance(CTSheetView.type, (XmlOptions)null);
      }

      public static CTSheetView newInstance(XmlOptions var0) {
         return (CTSheetView)POIXMLTypeLoader.newInstance(CTSheetView.type, var0);
      }

      public static CTSheetView parse(String var0) throws XmlException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, (XmlOptions)null);
      }

      public static CTSheetView parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, var1);
      }

      public static CTSheetView parse(File var0) throws XmlException, IOException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, (XmlOptions)null);
      }

      public static CTSheetView parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, var1);
      }

      public static CTSheetView parse(URL var0) throws XmlException, IOException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, (XmlOptions)null);
      }

      public static CTSheetView parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, var1);
      }

      public static CTSheetView parse(InputStream var0) throws XmlException, IOException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, (XmlOptions)null);
      }

      public static CTSheetView parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, var1);
      }

      public static CTSheetView parse(Reader var0) throws XmlException, IOException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, (XmlOptions)null);
      }

      public static CTSheetView parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, var1);
      }

      public static CTSheetView parse(XMLStreamReader var0) throws XmlException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, (XmlOptions)null);
      }

      public static CTSheetView parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, var1);
      }

      public static CTSheetView parse(Node var0) throws XmlException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, (XmlOptions)null);
      }

      public static CTSheetView parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, var1);
      }

      public static CTSheetView parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, (XmlOptions)null);
      }

      public static CTSheetView parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSheetView)POIXMLTypeLoader.parse(var0, CTSheetView.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetView.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetView.type, var1);
      }

   }
}
