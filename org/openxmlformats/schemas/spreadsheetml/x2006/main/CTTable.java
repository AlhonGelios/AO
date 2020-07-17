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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTTable extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttable736dtype");


   CTAutoFilter getAutoFilter();

   boolean isSetAutoFilter();

   void setAutoFilter(CTAutoFilter var1);

   CTAutoFilter addNewAutoFilter();

   void unsetAutoFilter();

   CTSortState getSortState();

   boolean isSetSortState();

   void setSortState(CTSortState var1);

   CTSortState addNewSortState();

   void unsetSortState();

   CTTableColumns getTableColumns();

   void setTableColumns(CTTableColumns var1);

   CTTableColumns addNewTableColumns();

   CTTableStyleInfo getTableStyleInfo();

   boolean isSetTableStyleInfo();

   void setTableStyleInfo(CTTableStyleInfo var1);

   CTTableStyleInfo addNewTableStyleInfo();

   void unsetTableStyleInfo();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getId();

   XmlUnsignedInt xgetId();

   void setId(long var1);

   void xsetId(XmlUnsignedInt var1);

   String getName();

   STXstring xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   void unsetName();

   String getDisplayName();

   STXstring xgetDisplayName();

   void setDisplayName(String var1);

   void xsetDisplayName(STXstring var1);

   String getComment();

   STXstring xgetComment();

   boolean isSetComment();

   void setComment(String var1);

   void xsetComment(STXstring var1);

   void unsetComment();

   String getRef();

   STRef xgetRef();

   void setRef(String var1);

   void xsetRef(STRef var1);

   STTableType$Enum getTableType();

   STTableType xgetTableType();

   boolean isSetTableType();

   void setTableType(STTableType$Enum var1);

   void xsetTableType(STTableType var1);

   void unsetTableType();

   long getHeaderRowCount();

   XmlUnsignedInt xgetHeaderRowCount();

   boolean isSetHeaderRowCount();

   void setHeaderRowCount(long var1);

   void xsetHeaderRowCount(XmlUnsignedInt var1);

   void unsetHeaderRowCount();

   boolean getInsertRow();

   XmlBoolean xgetInsertRow();

   boolean isSetInsertRow();

   void setInsertRow(boolean var1);

   void xsetInsertRow(XmlBoolean var1);

   void unsetInsertRow();

   boolean getInsertRowShift();

   XmlBoolean xgetInsertRowShift();

   boolean isSetInsertRowShift();

   void setInsertRowShift(boolean var1);

   void xsetInsertRowShift(XmlBoolean var1);

   void unsetInsertRowShift();

   long getTotalsRowCount();

   XmlUnsignedInt xgetTotalsRowCount();

   boolean isSetTotalsRowCount();

   void setTotalsRowCount(long var1);

   void xsetTotalsRowCount(XmlUnsignedInt var1);

   void unsetTotalsRowCount();

   boolean getTotalsRowShown();

   XmlBoolean xgetTotalsRowShown();

   boolean isSetTotalsRowShown();

   void setTotalsRowShown(boolean var1);

   void xsetTotalsRowShown(XmlBoolean var1);

   void unsetTotalsRowShown();

   boolean getPublished();

   XmlBoolean xgetPublished();

   boolean isSetPublished();

   void setPublished(boolean var1);

   void xsetPublished(XmlBoolean var1);

   void unsetPublished();

   long getHeaderRowDxfId();

   STDxfId xgetHeaderRowDxfId();

   boolean isSetHeaderRowDxfId();

   void setHeaderRowDxfId(long var1);

   void xsetHeaderRowDxfId(STDxfId var1);

   void unsetHeaderRowDxfId();

   long getDataDxfId();

   STDxfId xgetDataDxfId();

   boolean isSetDataDxfId();

   void setDataDxfId(long var1);

   void xsetDataDxfId(STDxfId var1);

   void unsetDataDxfId();

   long getTotalsRowDxfId();

   STDxfId xgetTotalsRowDxfId();

   boolean isSetTotalsRowDxfId();

   void setTotalsRowDxfId(long var1);

   void xsetTotalsRowDxfId(STDxfId var1);

   void unsetTotalsRowDxfId();

   long getHeaderRowBorderDxfId();

   STDxfId xgetHeaderRowBorderDxfId();

   boolean isSetHeaderRowBorderDxfId();

   void setHeaderRowBorderDxfId(long var1);

   void xsetHeaderRowBorderDxfId(STDxfId var1);

   void unsetHeaderRowBorderDxfId();

   long getTableBorderDxfId();

   STDxfId xgetTableBorderDxfId();

   boolean isSetTableBorderDxfId();

   void setTableBorderDxfId(long var1);

   void xsetTableBorderDxfId(STDxfId var1);

   void unsetTableBorderDxfId();

   long getTotalsRowBorderDxfId();

   STDxfId xgetTotalsRowBorderDxfId();

   boolean isSetTotalsRowBorderDxfId();

   void setTotalsRowBorderDxfId(long var1);

   void xsetTotalsRowBorderDxfId(STDxfId var1);

   void unsetTotalsRowBorderDxfId();

   String getHeaderRowCellStyle();

   STXstring xgetHeaderRowCellStyle();

   boolean isSetHeaderRowCellStyle();

   void setHeaderRowCellStyle(String var1);

   void xsetHeaderRowCellStyle(STXstring var1);

   void unsetHeaderRowCellStyle();

   String getDataCellStyle();

   STXstring xgetDataCellStyle();

   boolean isSetDataCellStyle();

   void setDataCellStyle(String var1);

   void xsetDataCellStyle(STXstring var1);

   void unsetDataCellStyle();

   String getTotalsRowCellStyle();

   STXstring xgetTotalsRowCellStyle();

   boolean isSetTotalsRowCellStyle();

   void setTotalsRowCellStyle(String var1);

   void xsetTotalsRowCellStyle(STXstring var1);

   void unsetTotalsRowCellStyle();

   long getConnectionId();

   XmlUnsignedInt xgetConnectionId();

   boolean isSetConnectionId();

   void setConnectionId(long var1);

   void xsetConnectionId(XmlUnsignedInt var1);

   void unsetConnectionId();


   public static final class Factory {

      public static CTTable newInstance() {
         return (CTTable)POIXMLTypeLoader.newInstance(CTTable.type, (XmlOptions)null);
      }

      public static CTTable newInstance(XmlOptions var0) {
         return (CTTable)POIXMLTypeLoader.newInstance(CTTable.type, var0);
      }

      public static CTTable parse(String var0) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(File var0) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(URL var0) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(InputStream var0) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(Reader var0) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(XMLStreamReader var0) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(Node var0) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static CTTable parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, (XmlOptions)null);
      }

      public static CTTable parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTable)POIXMLTypeLoader.parse(var0, CTTable.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTable.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTable.type, var1);
      }

   }
}
