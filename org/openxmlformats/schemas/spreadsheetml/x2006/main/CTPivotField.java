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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTPivotField extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPivotField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpivotfieldf961type");


   CTItems getItems();

   boolean isSetItems();

   void setItems(CTItems var1);

   CTItems addNewItems();

   void unsetItems();

   CTAutoSortScope getAutoSortScope();

   boolean isSetAutoSortScope();

   void setAutoSortScope(CTAutoSortScope var1);

   CTAutoSortScope addNewAutoSortScope();

   void unsetAutoSortScope();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   String getName();

   STXstring xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   void unsetName();

   STAxis.Enum getAxis();

   STAxis xgetAxis();

   boolean isSetAxis();

   void setAxis(STAxis.Enum var1);

   void xsetAxis(STAxis var1);

   void unsetAxis();

   boolean getDataField();

   XmlBoolean xgetDataField();

   boolean isSetDataField();

   void setDataField(boolean var1);

   void xsetDataField(XmlBoolean var1);

   void unsetDataField();

   String getSubtotalCaption();

   STXstring xgetSubtotalCaption();

   boolean isSetSubtotalCaption();

   void setSubtotalCaption(String var1);

   void xsetSubtotalCaption(STXstring var1);

   void unsetSubtotalCaption();

   boolean getShowDropDowns();

   XmlBoolean xgetShowDropDowns();

   boolean isSetShowDropDowns();

   void setShowDropDowns(boolean var1);

   void xsetShowDropDowns(XmlBoolean var1);

   void unsetShowDropDowns();

   boolean getHiddenLevel();

   XmlBoolean xgetHiddenLevel();

   boolean isSetHiddenLevel();

   void setHiddenLevel(boolean var1);

   void xsetHiddenLevel(XmlBoolean var1);

   void unsetHiddenLevel();

   String getUniqueMemberProperty();

   STXstring xgetUniqueMemberProperty();

   boolean isSetUniqueMemberProperty();

   void setUniqueMemberProperty(String var1);

   void xsetUniqueMemberProperty(STXstring var1);

   void unsetUniqueMemberProperty();

   boolean getCompact();

   XmlBoolean xgetCompact();

   boolean isSetCompact();

   void setCompact(boolean var1);

   void xsetCompact(XmlBoolean var1);

   void unsetCompact();

   boolean getAllDrilled();

   XmlBoolean xgetAllDrilled();

   boolean isSetAllDrilled();

   void setAllDrilled(boolean var1);

   void xsetAllDrilled(XmlBoolean var1);

   void unsetAllDrilled();

   long getNumFmtId();

   STNumFmtId xgetNumFmtId();

   boolean isSetNumFmtId();

   void setNumFmtId(long var1);

   void xsetNumFmtId(STNumFmtId var1);

   void unsetNumFmtId();

   boolean getOutline();

   XmlBoolean xgetOutline();

   boolean isSetOutline();

   void setOutline(boolean var1);

   void xsetOutline(XmlBoolean var1);

   void unsetOutline();

   boolean getSubtotalTop();

   XmlBoolean xgetSubtotalTop();

   boolean isSetSubtotalTop();

   void setSubtotalTop(boolean var1);

   void xsetSubtotalTop(XmlBoolean var1);

   void unsetSubtotalTop();

   boolean getDragToRow();

   XmlBoolean xgetDragToRow();

   boolean isSetDragToRow();

   void setDragToRow(boolean var1);

   void xsetDragToRow(XmlBoolean var1);

   void unsetDragToRow();

   boolean getDragToCol();

   XmlBoolean xgetDragToCol();

   boolean isSetDragToCol();

   void setDragToCol(boolean var1);

   void xsetDragToCol(XmlBoolean var1);

   void unsetDragToCol();

   boolean getMultipleItemSelectionAllowed();

   XmlBoolean xgetMultipleItemSelectionAllowed();

   boolean isSetMultipleItemSelectionAllowed();

   void setMultipleItemSelectionAllowed(boolean var1);

   void xsetMultipleItemSelectionAllowed(XmlBoolean var1);

   void unsetMultipleItemSelectionAllowed();

   boolean getDragToPage();

   XmlBoolean xgetDragToPage();

   boolean isSetDragToPage();

   void setDragToPage(boolean var1);

   void xsetDragToPage(XmlBoolean var1);

   void unsetDragToPage();

   boolean getDragToData();

   XmlBoolean xgetDragToData();

   boolean isSetDragToData();

   void setDragToData(boolean var1);

   void xsetDragToData(XmlBoolean var1);

   void unsetDragToData();

   boolean getDragOff();

   XmlBoolean xgetDragOff();

   boolean isSetDragOff();

   void setDragOff(boolean var1);

   void xsetDragOff(XmlBoolean var1);

   void unsetDragOff();

   boolean getShowAll();

   XmlBoolean xgetShowAll();

   boolean isSetShowAll();

   void setShowAll(boolean var1);

   void xsetShowAll(XmlBoolean var1);

   void unsetShowAll();

   boolean getInsertBlankRow();

   XmlBoolean xgetInsertBlankRow();

   boolean isSetInsertBlankRow();

   void setInsertBlankRow(boolean var1);

   void xsetInsertBlankRow(XmlBoolean var1);

   void unsetInsertBlankRow();

   boolean getServerField();

   XmlBoolean xgetServerField();

   boolean isSetServerField();

   void setServerField(boolean var1);

   void xsetServerField(XmlBoolean var1);

   void unsetServerField();

   boolean getInsertPageBreak();

   XmlBoolean xgetInsertPageBreak();

   boolean isSetInsertPageBreak();

   void setInsertPageBreak(boolean var1);

   void xsetInsertPageBreak(XmlBoolean var1);

   void unsetInsertPageBreak();

   boolean getAutoShow();

   XmlBoolean xgetAutoShow();

   boolean isSetAutoShow();

   void setAutoShow(boolean var1);

   void xsetAutoShow(XmlBoolean var1);

   void unsetAutoShow();

   boolean getTopAutoShow();

   XmlBoolean xgetTopAutoShow();

   boolean isSetTopAutoShow();

   void setTopAutoShow(boolean var1);

   void xsetTopAutoShow(XmlBoolean var1);

   void unsetTopAutoShow();

   boolean getHideNewItems();

   XmlBoolean xgetHideNewItems();

   boolean isSetHideNewItems();

   void setHideNewItems(boolean var1);

   void xsetHideNewItems(XmlBoolean var1);

   void unsetHideNewItems();

   boolean getMeasureFilter();

   XmlBoolean xgetMeasureFilter();

   boolean isSetMeasureFilter();

   void setMeasureFilter(boolean var1);

   void xsetMeasureFilter(XmlBoolean var1);

   void unsetMeasureFilter();

   boolean getIncludeNewItemsInFilter();

   XmlBoolean xgetIncludeNewItemsInFilter();

   boolean isSetIncludeNewItemsInFilter();

   void setIncludeNewItemsInFilter(boolean var1);

   void xsetIncludeNewItemsInFilter(XmlBoolean var1);

   void unsetIncludeNewItemsInFilter();

   long getItemPageCount();

   XmlUnsignedInt xgetItemPageCount();

   boolean isSetItemPageCount();

   void setItemPageCount(long var1);

   void xsetItemPageCount(XmlUnsignedInt var1);

   void unsetItemPageCount();

   STFieldSortType$Enum getSortType();

   STFieldSortType xgetSortType();

   boolean isSetSortType();

   void setSortType(STFieldSortType$Enum var1);

   void xsetSortType(STFieldSortType var1);

   void unsetSortType();

   boolean getDataSourceSort();

   XmlBoolean xgetDataSourceSort();

   boolean isSetDataSourceSort();

   void setDataSourceSort(boolean var1);

   void xsetDataSourceSort(XmlBoolean var1);

   void unsetDataSourceSort();

   boolean getNonAutoSortDefault();

   XmlBoolean xgetNonAutoSortDefault();

   boolean isSetNonAutoSortDefault();

   void setNonAutoSortDefault(boolean var1);

   void xsetNonAutoSortDefault(XmlBoolean var1);

   void unsetNonAutoSortDefault();

   long getRankBy();

   XmlUnsignedInt xgetRankBy();

   boolean isSetRankBy();

   void setRankBy(long var1);

   void xsetRankBy(XmlUnsignedInt var1);

   void unsetRankBy();

   boolean getDefaultSubtotal();

   XmlBoolean xgetDefaultSubtotal();

   boolean isSetDefaultSubtotal();

   void setDefaultSubtotal(boolean var1);

   void xsetDefaultSubtotal(XmlBoolean var1);

   void unsetDefaultSubtotal();

   boolean getSumSubtotal();

   XmlBoolean xgetSumSubtotal();

   boolean isSetSumSubtotal();

   void setSumSubtotal(boolean var1);

   void xsetSumSubtotal(XmlBoolean var1);

   void unsetSumSubtotal();

   boolean getCountASubtotal();

   XmlBoolean xgetCountASubtotal();

   boolean isSetCountASubtotal();

   void setCountASubtotal(boolean var1);

   void xsetCountASubtotal(XmlBoolean var1);

   void unsetCountASubtotal();

   boolean getAvgSubtotal();

   XmlBoolean xgetAvgSubtotal();

   boolean isSetAvgSubtotal();

   void setAvgSubtotal(boolean var1);

   void xsetAvgSubtotal(XmlBoolean var1);

   void unsetAvgSubtotal();

   boolean getMaxSubtotal();

   XmlBoolean xgetMaxSubtotal();

   boolean isSetMaxSubtotal();

   void setMaxSubtotal(boolean var1);

   void xsetMaxSubtotal(XmlBoolean var1);

   void unsetMaxSubtotal();

   boolean getMinSubtotal();

   XmlBoolean xgetMinSubtotal();

   boolean isSetMinSubtotal();

   void setMinSubtotal(boolean var1);

   void xsetMinSubtotal(XmlBoolean var1);

   void unsetMinSubtotal();

   boolean getProductSubtotal();

   XmlBoolean xgetProductSubtotal();

   boolean isSetProductSubtotal();

   void setProductSubtotal(boolean var1);

   void xsetProductSubtotal(XmlBoolean var1);

   void unsetProductSubtotal();

   boolean getCountSubtotal();

   XmlBoolean xgetCountSubtotal();

   boolean isSetCountSubtotal();

   void setCountSubtotal(boolean var1);

   void xsetCountSubtotal(XmlBoolean var1);

   void unsetCountSubtotal();

   boolean getStdDevSubtotal();

   XmlBoolean xgetStdDevSubtotal();

   boolean isSetStdDevSubtotal();

   void setStdDevSubtotal(boolean var1);

   void xsetStdDevSubtotal(XmlBoolean var1);

   void unsetStdDevSubtotal();

   boolean getStdDevPSubtotal();

   XmlBoolean xgetStdDevPSubtotal();

   boolean isSetStdDevPSubtotal();

   void setStdDevPSubtotal(boolean var1);

   void xsetStdDevPSubtotal(XmlBoolean var1);

   void unsetStdDevPSubtotal();

   boolean getVarSubtotal();

   XmlBoolean xgetVarSubtotal();

   boolean isSetVarSubtotal();

   void setVarSubtotal(boolean var1);

   void xsetVarSubtotal(XmlBoolean var1);

   void unsetVarSubtotal();

   boolean getVarPSubtotal();

   XmlBoolean xgetVarPSubtotal();

   boolean isSetVarPSubtotal();

   void setVarPSubtotal(boolean var1);

   void xsetVarPSubtotal(XmlBoolean var1);

   void unsetVarPSubtotal();

   boolean getShowPropCell();

   XmlBoolean xgetShowPropCell();

   boolean isSetShowPropCell();

   void setShowPropCell(boolean var1);

   void xsetShowPropCell(XmlBoolean var1);

   void unsetShowPropCell();

   boolean getShowPropTip();

   XmlBoolean xgetShowPropTip();

   boolean isSetShowPropTip();

   void setShowPropTip(boolean var1);

   void xsetShowPropTip(XmlBoolean var1);

   void unsetShowPropTip();

   boolean getShowPropAsCaption();

   XmlBoolean xgetShowPropAsCaption();

   boolean isSetShowPropAsCaption();

   void setShowPropAsCaption(boolean var1);

   void xsetShowPropAsCaption(XmlBoolean var1);

   void unsetShowPropAsCaption();

   boolean getDefaultAttributeDrillState();

   XmlBoolean xgetDefaultAttributeDrillState();

   boolean isSetDefaultAttributeDrillState();

   void setDefaultAttributeDrillState(boolean var1);

   void xsetDefaultAttributeDrillState(XmlBoolean var1);

   void unsetDefaultAttributeDrillState();


   public static final class Factory {

      public static CTPivotField newInstance() {
         return (CTPivotField)POIXMLTypeLoader.newInstance(CTPivotField.type, (XmlOptions)null);
      }

      public static CTPivotField newInstance(XmlOptions var0) {
         return (CTPivotField)POIXMLTypeLoader.newInstance(CTPivotField.type, var0);
      }

      public static CTPivotField parse(String var0) throws XmlException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, (XmlOptions)null);
      }

      public static CTPivotField parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, var1);
      }

      public static CTPivotField parse(File var0) throws XmlException, IOException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, (XmlOptions)null);
      }

      public static CTPivotField parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, var1);
      }

      public static CTPivotField parse(URL var0) throws XmlException, IOException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, (XmlOptions)null);
      }

      public static CTPivotField parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, var1);
      }

      public static CTPivotField parse(InputStream var0) throws XmlException, IOException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, (XmlOptions)null);
      }

      public static CTPivotField parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, var1);
      }

      public static CTPivotField parse(Reader var0) throws XmlException, IOException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, (XmlOptions)null);
      }

      public static CTPivotField parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, var1);
      }

      public static CTPivotField parse(XMLStreamReader var0) throws XmlException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, (XmlOptions)null);
      }

      public static CTPivotField parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, var1);
      }

      public static CTPivotField parse(Node var0) throws XmlException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, (XmlOptions)null);
      }

      public static CTPivotField parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, var1);
      }

      public static CTPivotField parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, (XmlOptions)null);
      }

      public static CTPivotField parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPivotField)POIXMLTypeLoader.parse(var0, CTPivotField.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotField.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotField.type, var1);
      }

   }
}
