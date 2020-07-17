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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex;
import org.w3c.dom.Node;

public interface CTSheetProtection extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSheetProtection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsheetprotection22f7type");


   byte[] getPassword();

   STUnsignedShortHex xgetPassword();

   boolean isSetPassword();

   void setPassword(byte[] var1);

   void xsetPassword(STUnsignedShortHex var1);

   void unsetPassword();

   boolean getSheet();

   XmlBoolean xgetSheet();

   boolean isSetSheet();

   void setSheet(boolean var1);

   void xsetSheet(XmlBoolean var1);

   void unsetSheet();

   boolean getObjects();

   XmlBoolean xgetObjects();

   boolean isSetObjects();

   void setObjects(boolean var1);

   void xsetObjects(XmlBoolean var1);

   void unsetObjects();

   boolean getScenarios();

   XmlBoolean xgetScenarios();

   boolean isSetScenarios();

   void setScenarios(boolean var1);

   void xsetScenarios(XmlBoolean var1);

   void unsetScenarios();

   boolean getFormatCells();

   XmlBoolean xgetFormatCells();

   boolean isSetFormatCells();

   void setFormatCells(boolean var1);

   void xsetFormatCells(XmlBoolean var1);

   void unsetFormatCells();

   boolean getFormatColumns();

   XmlBoolean xgetFormatColumns();

   boolean isSetFormatColumns();

   void setFormatColumns(boolean var1);

   void xsetFormatColumns(XmlBoolean var1);

   void unsetFormatColumns();

   boolean getFormatRows();

   XmlBoolean xgetFormatRows();

   boolean isSetFormatRows();

   void setFormatRows(boolean var1);

   void xsetFormatRows(XmlBoolean var1);

   void unsetFormatRows();

   boolean getInsertColumns();

   XmlBoolean xgetInsertColumns();

   boolean isSetInsertColumns();

   void setInsertColumns(boolean var1);

   void xsetInsertColumns(XmlBoolean var1);

   void unsetInsertColumns();

   boolean getInsertRows();

   XmlBoolean xgetInsertRows();

   boolean isSetInsertRows();

   void setInsertRows(boolean var1);

   void xsetInsertRows(XmlBoolean var1);

   void unsetInsertRows();

   boolean getInsertHyperlinks();

   XmlBoolean xgetInsertHyperlinks();

   boolean isSetInsertHyperlinks();

   void setInsertHyperlinks(boolean var1);

   void xsetInsertHyperlinks(XmlBoolean var1);

   void unsetInsertHyperlinks();

   boolean getDeleteColumns();

   XmlBoolean xgetDeleteColumns();

   boolean isSetDeleteColumns();

   void setDeleteColumns(boolean var1);

   void xsetDeleteColumns(XmlBoolean var1);

   void unsetDeleteColumns();

   boolean getDeleteRows();

   XmlBoolean xgetDeleteRows();

   boolean isSetDeleteRows();

   void setDeleteRows(boolean var1);

   void xsetDeleteRows(XmlBoolean var1);

   void unsetDeleteRows();

   boolean getSelectLockedCells();

   XmlBoolean xgetSelectLockedCells();

   boolean isSetSelectLockedCells();

   void setSelectLockedCells(boolean var1);

   void xsetSelectLockedCells(XmlBoolean var1);

   void unsetSelectLockedCells();

   boolean getSort();

   XmlBoolean xgetSort();

   boolean isSetSort();

   void setSort(boolean var1);

   void xsetSort(XmlBoolean var1);

   void unsetSort();

   boolean getAutoFilter();

   XmlBoolean xgetAutoFilter();

   boolean isSetAutoFilter();

   void setAutoFilter(boolean var1);

   void xsetAutoFilter(XmlBoolean var1);

   void unsetAutoFilter();

   boolean getPivotTables();

   XmlBoolean xgetPivotTables();

   boolean isSetPivotTables();

   void setPivotTables(boolean var1);

   void xsetPivotTables(XmlBoolean var1);

   void unsetPivotTables();

   boolean getSelectUnlockedCells();

   XmlBoolean xgetSelectUnlockedCells();

   boolean isSetSelectUnlockedCells();

   void setSelectUnlockedCells(boolean var1);

   void xsetSelectUnlockedCells(XmlBoolean var1);

   void unsetSelectUnlockedCells();


   public static final class Factory {

      public static CTSheetProtection newInstance() {
         return (CTSheetProtection)POIXMLTypeLoader.newInstance(CTSheetProtection.type, (XmlOptions)null);
      }

      public static CTSheetProtection newInstance(XmlOptions var0) {
         return (CTSheetProtection)POIXMLTypeLoader.newInstance(CTSheetProtection.type, var0);
      }

      public static CTSheetProtection parse(String var0) throws XmlException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, (XmlOptions)null);
      }

      public static CTSheetProtection parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, var1);
      }

      public static CTSheetProtection parse(File var0) throws XmlException, IOException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, (XmlOptions)null);
      }

      public static CTSheetProtection parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, var1);
      }

      public static CTSheetProtection parse(URL var0) throws XmlException, IOException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, (XmlOptions)null);
      }

      public static CTSheetProtection parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, var1);
      }

      public static CTSheetProtection parse(InputStream var0) throws XmlException, IOException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, (XmlOptions)null);
      }

      public static CTSheetProtection parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, var1);
      }

      public static CTSheetProtection parse(Reader var0) throws XmlException, IOException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, (XmlOptions)null);
      }

      public static CTSheetProtection parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, var1);
      }

      public static CTSheetProtection parse(XMLStreamReader var0) throws XmlException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, (XmlOptions)null);
      }

      public static CTSheetProtection parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, var1);
      }

      public static CTSheetProtection parse(Node var0) throws XmlException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, (XmlOptions)null);
      }

      public static CTSheetProtection parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, var1);
      }

      public static CTSheetProtection parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, (XmlOptions)null);
      }

      public static CTSheetProtection parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSheetProtection)POIXMLTypeLoader.parse(var0, CTSheetProtection.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetProtection.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetProtection.type, var1);
      }

   }
}
