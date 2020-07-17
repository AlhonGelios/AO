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
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTPivotTableDefinition extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPivotTableDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpivottabledefinitionb188type");


   CTLocation getLocation();

   void setLocation(CTLocation var1);

   CTLocation addNewLocation();

   CTPivotFields getPivotFields();

   boolean isSetPivotFields();

   void setPivotFields(CTPivotFields var1);

   CTPivotFields addNewPivotFields();

   void unsetPivotFields();

   CTRowFields getRowFields();

   boolean isSetRowFields();

   void setRowFields(CTRowFields var1);

   CTRowFields addNewRowFields();

   void unsetRowFields();

   CTRowItems getRowItems();

   boolean isSetRowItems();

   void setRowItems(CTRowItems var1);

   CTRowItems addNewRowItems();

   void unsetRowItems();

   CTColFields getColFields();

   boolean isSetColFields();

   void setColFields(CTColFields var1);

   CTColFields addNewColFields();

   void unsetColFields();

   CTColItems getColItems();

   boolean isSetColItems();

   void setColItems(CTColItems var1);

   CTColItems addNewColItems();

   void unsetColItems();

   CTPageFields getPageFields();

   boolean isSetPageFields();

   void setPageFields(CTPageFields var1);

   CTPageFields addNewPageFields();

   void unsetPageFields();

   CTDataFields getDataFields();

   boolean isSetDataFields();

   void setDataFields(CTDataFields var1);

   CTDataFields addNewDataFields();

   void unsetDataFields();

   CTFormats getFormats();

   boolean isSetFormats();

   void setFormats(CTFormats var1);

   CTFormats addNewFormats();

   void unsetFormats();

   CTConditionalFormats getConditionalFormats();

   boolean isSetConditionalFormats();

   void setConditionalFormats(CTConditionalFormats var1);

   CTConditionalFormats addNewConditionalFormats();

   void unsetConditionalFormats();

   CTChartFormats getChartFormats();

   boolean isSetChartFormats();

   void setChartFormats(CTChartFormats var1);

   CTChartFormats addNewChartFormats();

   void unsetChartFormats();

   CTPivotHierarchies getPivotHierarchies();

   boolean isSetPivotHierarchies();

   void setPivotHierarchies(CTPivotHierarchies var1);

   CTPivotHierarchies addNewPivotHierarchies();

   void unsetPivotHierarchies();

   CTPivotTableStyle getPivotTableStyleInfo();

   boolean isSetPivotTableStyleInfo();

   void setPivotTableStyleInfo(CTPivotTableStyle var1);

   CTPivotTableStyle addNewPivotTableStyleInfo();

   void unsetPivotTableStyleInfo();

   CTPivotFilters getFilters();

   boolean isSetFilters();

   void setFilters(CTPivotFilters var1);

   CTPivotFilters addNewFilters();

   void unsetFilters();

   CTRowHierarchiesUsage getRowHierarchiesUsage();

   boolean isSetRowHierarchiesUsage();

   void setRowHierarchiesUsage(CTRowHierarchiesUsage var1);

   CTRowHierarchiesUsage addNewRowHierarchiesUsage();

   void unsetRowHierarchiesUsage();

   CTColHierarchiesUsage getColHierarchiesUsage();

   boolean isSetColHierarchiesUsage();

   void setColHierarchiesUsage(CTColHierarchiesUsage var1);

   CTColHierarchiesUsage addNewColHierarchiesUsage();

   void unsetColHierarchiesUsage();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   String getName();

   STXstring xgetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   long getCacheId();

   XmlUnsignedInt xgetCacheId();

   void setCacheId(long var1);

   void xsetCacheId(XmlUnsignedInt var1);

   boolean getDataOnRows();

   XmlBoolean xgetDataOnRows();

   boolean isSetDataOnRows();

   void setDataOnRows(boolean var1);

   void xsetDataOnRows(XmlBoolean var1);

   void unsetDataOnRows();

   long getDataPosition();

   XmlUnsignedInt xgetDataPosition();

   boolean isSetDataPosition();

   void setDataPosition(long var1);

   void xsetDataPosition(XmlUnsignedInt var1);

   void unsetDataPosition();

   long getAutoFormatId();

   XmlUnsignedInt xgetAutoFormatId();

   boolean isSetAutoFormatId();

   void setAutoFormatId(long var1);

   void xsetAutoFormatId(XmlUnsignedInt var1);

   void unsetAutoFormatId();

   boolean getApplyNumberFormats();

   XmlBoolean xgetApplyNumberFormats();

   boolean isSetApplyNumberFormats();

   void setApplyNumberFormats(boolean var1);

   void xsetApplyNumberFormats(XmlBoolean var1);

   void unsetApplyNumberFormats();

   boolean getApplyBorderFormats();

   XmlBoolean xgetApplyBorderFormats();

   boolean isSetApplyBorderFormats();

   void setApplyBorderFormats(boolean var1);

   void xsetApplyBorderFormats(XmlBoolean var1);

   void unsetApplyBorderFormats();

   boolean getApplyFontFormats();

   XmlBoolean xgetApplyFontFormats();

   boolean isSetApplyFontFormats();

   void setApplyFontFormats(boolean var1);

   void xsetApplyFontFormats(XmlBoolean var1);

   void unsetApplyFontFormats();

   boolean getApplyPatternFormats();

   XmlBoolean xgetApplyPatternFormats();

   boolean isSetApplyPatternFormats();

   void setApplyPatternFormats(boolean var1);

   void xsetApplyPatternFormats(XmlBoolean var1);

   void unsetApplyPatternFormats();

   boolean getApplyAlignmentFormats();

   XmlBoolean xgetApplyAlignmentFormats();

   boolean isSetApplyAlignmentFormats();

   void setApplyAlignmentFormats(boolean var1);

   void xsetApplyAlignmentFormats(XmlBoolean var1);

   void unsetApplyAlignmentFormats();

   boolean getApplyWidthHeightFormats();

   XmlBoolean xgetApplyWidthHeightFormats();

   boolean isSetApplyWidthHeightFormats();

   void setApplyWidthHeightFormats(boolean var1);

   void xsetApplyWidthHeightFormats(XmlBoolean var1);

   void unsetApplyWidthHeightFormats();

   String getDataCaption();

   STXstring xgetDataCaption();

   void setDataCaption(String var1);

   void xsetDataCaption(STXstring var1);

   String getGrandTotalCaption();

   STXstring xgetGrandTotalCaption();

   boolean isSetGrandTotalCaption();

   void setGrandTotalCaption(String var1);

   void xsetGrandTotalCaption(STXstring var1);

   void unsetGrandTotalCaption();

   String getErrorCaption();

   STXstring xgetErrorCaption();

   boolean isSetErrorCaption();

   void setErrorCaption(String var1);

   void xsetErrorCaption(STXstring var1);

   void unsetErrorCaption();

   boolean getShowError();

   XmlBoolean xgetShowError();

   boolean isSetShowError();

   void setShowError(boolean var1);

   void xsetShowError(XmlBoolean var1);

   void unsetShowError();

   String getMissingCaption();

   STXstring xgetMissingCaption();

   boolean isSetMissingCaption();

   void setMissingCaption(String var1);

   void xsetMissingCaption(STXstring var1);

   void unsetMissingCaption();

   boolean getShowMissing();

   XmlBoolean xgetShowMissing();

   boolean isSetShowMissing();

   void setShowMissing(boolean var1);

   void xsetShowMissing(XmlBoolean var1);

   void unsetShowMissing();

   String getPageStyle();

   STXstring xgetPageStyle();

   boolean isSetPageStyle();

   void setPageStyle(String var1);

   void xsetPageStyle(STXstring var1);

   void unsetPageStyle();

   String getPivotTableStyle();

   STXstring xgetPivotTableStyle();

   boolean isSetPivotTableStyle();

   void setPivotTableStyle(String var1);

   void xsetPivotTableStyle(STXstring var1);

   void unsetPivotTableStyle();

   String getVacatedStyle();

   STXstring xgetVacatedStyle();

   boolean isSetVacatedStyle();

   void setVacatedStyle(String var1);

   void xsetVacatedStyle(STXstring var1);

   void unsetVacatedStyle();

   String getTag();

   STXstring xgetTag();

   boolean isSetTag();

   void setTag(String var1);

   void xsetTag(STXstring var1);

   void unsetTag();

   short getUpdatedVersion();

   XmlUnsignedByte xgetUpdatedVersion();

   boolean isSetUpdatedVersion();

   void setUpdatedVersion(short var1);

   void xsetUpdatedVersion(XmlUnsignedByte var1);

   void unsetUpdatedVersion();

   short getMinRefreshableVersion();

   XmlUnsignedByte xgetMinRefreshableVersion();

   boolean isSetMinRefreshableVersion();

   void setMinRefreshableVersion(short var1);

   void xsetMinRefreshableVersion(XmlUnsignedByte var1);

   void unsetMinRefreshableVersion();

   boolean getAsteriskTotals();

   XmlBoolean xgetAsteriskTotals();

   boolean isSetAsteriskTotals();

   void setAsteriskTotals(boolean var1);

   void xsetAsteriskTotals(XmlBoolean var1);

   void unsetAsteriskTotals();

   boolean getShowItems();

   XmlBoolean xgetShowItems();

   boolean isSetShowItems();

   void setShowItems(boolean var1);

   void xsetShowItems(XmlBoolean var1);

   void unsetShowItems();

   boolean getEditData();

   XmlBoolean xgetEditData();

   boolean isSetEditData();

   void setEditData(boolean var1);

   void xsetEditData(XmlBoolean var1);

   void unsetEditData();

   boolean getDisableFieldList();

   XmlBoolean xgetDisableFieldList();

   boolean isSetDisableFieldList();

   void setDisableFieldList(boolean var1);

   void xsetDisableFieldList(XmlBoolean var1);

   void unsetDisableFieldList();

   boolean getShowCalcMbrs();

   XmlBoolean xgetShowCalcMbrs();

   boolean isSetShowCalcMbrs();

   void setShowCalcMbrs(boolean var1);

   void xsetShowCalcMbrs(XmlBoolean var1);

   void unsetShowCalcMbrs();

   boolean getVisualTotals();

   XmlBoolean xgetVisualTotals();

   boolean isSetVisualTotals();

   void setVisualTotals(boolean var1);

   void xsetVisualTotals(XmlBoolean var1);

   void unsetVisualTotals();

   boolean getShowMultipleLabel();

   XmlBoolean xgetShowMultipleLabel();

   boolean isSetShowMultipleLabel();

   void setShowMultipleLabel(boolean var1);

   void xsetShowMultipleLabel(XmlBoolean var1);

   void unsetShowMultipleLabel();

   boolean getShowDataDropDown();

   XmlBoolean xgetShowDataDropDown();

   boolean isSetShowDataDropDown();

   void setShowDataDropDown(boolean var1);

   void xsetShowDataDropDown(XmlBoolean var1);

   void unsetShowDataDropDown();

   boolean getShowDrill();

   XmlBoolean xgetShowDrill();

   boolean isSetShowDrill();

   void setShowDrill(boolean var1);

   void xsetShowDrill(XmlBoolean var1);

   void unsetShowDrill();

   boolean getPrintDrill();

   XmlBoolean xgetPrintDrill();

   boolean isSetPrintDrill();

   void setPrintDrill(boolean var1);

   void xsetPrintDrill(XmlBoolean var1);

   void unsetPrintDrill();

   boolean getShowMemberPropertyTips();

   XmlBoolean xgetShowMemberPropertyTips();

   boolean isSetShowMemberPropertyTips();

   void setShowMemberPropertyTips(boolean var1);

   void xsetShowMemberPropertyTips(XmlBoolean var1);

   void unsetShowMemberPropertyTips();

   boolean getShowDataTips();

   XmlBoolean xgetShowDataTips();

   boolean isSetShowDataTips();

   void setShowDataTips(boolean var1);

   void xsetShowDataTips(XmlBoolean var1);

   void unsetShowDataTips();

   boolean getEnableWizard();

   XmlBoolean xgetEnableWizard();

   boolean isSetEnableWizard();

   void setEnableWizard(boolean var1);

   void xsetEnableWizard(XmlBoolean var1);

   void unsetEnableWizard();

   boolean getEnableDrill();

   XmlBoolean xgetEnableDrill();

   boolean isSetEnableDrill();

   void setEnableDrill(boolean var1);

   void xsetEnableDrill(XmlBoolean var1);

   void unsetEnableDrill();

   boolean getEnableFieldProperties();

   XmlBoolean xgetEnableFieldProperties();

   boolean isSetEnableFieldProperties();

   void setEnableFieldProperties(boolean var1);

   void xsetEnableFieldProperties(XmlBoolean var1);

   void unsetEnableFieldProperties();

   boolean getPreserveFormatting();

   XmlBoolean xgetPreserveFormatting();

   boolean isSetPreserveFormatting();

   void setPreserveFormatting(boolean var1);

   void xsetPreserveFormatting(XmlBoolean var1);

   void unsetPreserveFormatting();

   boolean getUseAutoFormatting();

   XmlBoolean xgetUseAutoFormatting();

   boolean isSetUseAutoFormatting();

   void setUseAutoFormatting(boolean var1);

   void xsetUseAutoFormatting(XmlBoolean var1);

   void unsetUseAutoFormatting();

   long getPageWrap();

   XmlUnsignedInt xgetPageWrap();

   boolean isSetPageWrap();

   void setPageWrap(long var1);

   void xsetPageWrap(XmlUnsignedInt var1);

   void unsetPageWrap();

   boolean getPageOverThenDown();

   XmlBoolean xgetPageOverThenDown();

   boolean isSetPageOverThenDown();

   void setPageOverThenDown(boolean var1);

   void xsetPageOverThenDown(XmlBoolean var1);

   void unsetPageOverThenDown();

   boolean getSubtotalHiddenItems();

   XmlBoolean xgetSubtotalHiddenItems();

   boolean isSetSubtotalHiddenItems();

   void setSubtotalHiddenItems(boolean var1);

   void xsetSubtotalHiddenItems(XmlBoolean var1);

   void unsetSubtotalHiddenItems();

   boolean getRowGrandTotals();

   XmlBoolean xgetRowGrandTotals();

   boolean isSetRowGrandTotals();

   void setRowGrandTotals(boolean var1);

   void xsetRowGrandTotals(XmlBoolean var1);

   void unsetRowGrandTotals();

   boolean getColGrandTotals();

   XmlBoolean xgetColGrandTotals();

   boolean isSetColGrandTotals();

   void setColGrandTotals(boolean var1);

   void xsetColGrandTotals(XmlBoolean var1);

   void unsetColGrandTotals();

   boolean getFieldPrintTitles();

   XmlBoolean xgetFieldPrintTitles();

   boolean isSetFieldPrintTitles();

   void setFieldPrintTitles(boolean var1);

   void xsetFieldPrintTitles(XmlBoolean var1);

   void unsetFieldPrintTitles();

   boolean getItemPrintTitles();

   XmlBoolean xgetItemPrintTitles();

   boolean isSetItemPrintTitles();

   void setItemPrintTitles(boolean var1);

   void xsetItemPrintTitles(XmlBoolean var1);

   void unsetItemPrintTitles();

   boolean getMergeItem();

   XmlBoolean xgetMergeItem();

   boolean isSetMergeItem();

   void setMergeItem(boolean var1);

   void xsetMergeItem(XmlBoolean var1);

   void unsetMergeItem();

   boolean getShowDropZones();

   XmlBoolean xgetShowDropZones();

   boolean isSetShowDropZones();

   void setShowDropZones(boolean var1);

   void xsetShowDropZones(XmlBoolean var1);

   void unsetShowDropZones();

   short getCreatedVersion();

   XmlUnsignedByte xgetCreatedVersion();

   boolean isSetCreatedVersion();

   void setCreatedVersion(short var1);

   void xsetCreatedVersion(XmlUnsignedByte var1);

   void unsetCreatedVersion();

   long getIndent();

   XmlUnsignedInt xgetIndent();

   boolean isSetIndent();

   void setIndent(long var1);

   void xsetIndent(XmlUnsignedInt var1);

   void unsetIndent();

   boolean getShowEmptyRow();

   XmlBoolean xgetShowEmptyRow();

   boolean isSetShowEmptyRow();

   void setShowEmptyRow(boolean var1);

   void xsetShowEmptyRow(XmlBoolean var1);

   void unsetShowEmptyRow();

   boolean getShowEmptyCol();

   XmlBoolean xgetShowEmptyCol();

   boolean isSetShowEmptyCol();

   void setShowEmptyCol(boolean var1);

   void xsetShowEmptyCol(XmlBoolean var1);

   void unsetShowEmptyCol();

   boolean getShowHeaders();

   XmlBoolean xgetShowHeaders();

   boolean isSetShowHeaders();

   void setShowHeaders(boolean var1);

   void xsetShowHeaders(XmlBoolean var1);

   void unsetShowHeaders();

   boolean getCompact();

   XmlBoolean xgetCompact();

   boolean isSetCompact();

   void setCompact(boolean var1);

   void xsetCompact(XmlBoolean var1);

   void unsetCompact();

   boolean getOutline();

   XmlBoolean xgetOutline();

   boolean isSetOutline();

   void setOutline(boolean var1);

   void xsetOutline(XmlBoolean var1);

   void unsetOutline();

   boolean getOutlineData();

   XmlBoolean xgetOutlineData();

   boolean isSetOutlineData();

   void setOutlineData(boolean var1);

   void xsetOutlineData(XmlBoolean var1);

   void unsetOutlineData();

   boolean getCompactData();

   XmlBoolean xgetCompactData();

   boolean isSetCompactData();

   void setCompactData(boolean var1);

   void xsetCompactData(XmlBoolean var1);

   void unsetCompactData();

   boolean getPublished();

   XmlBoolean xgetPublished();

   boolean isSetPublished();

   void setPublished(boolean var1);

   void xsetPublished(XmlBoolean var1);

   void unsetPublished();

   boolean getGridDropZones();

   XmlBoolean xgetGridDropZones();

   boolean isSetGridDropZones();

   void setGridDropZones(boolean var1);

   void xsetGridDropZones(XmlBoolean var1);

   void unsetGridDropZones();

   boolean getImmersive();

   XmlBoolean xgetImmersive();

   boolean isSetImmersive();

   void setImmersive(boolean var1);

   void xsetImmersive(XmlBoolean var1);

   void unsetImmersive();

   boolean getMultipleFieldFilters();

   XmlBoolean xgetMultipleFieldFilters();

   boolean isSetMultipleFieldFilters();

   void setMultipleFieldFilters(boolean var1);

   void xsetMultipleFieldFilters(XmlBoolean var1);

   void unsetMultipleFieldFilters();

   long getChartFormat();

   XmlUnsignedInt xgetChartFormat();

   boolean isSetChartFormat();

   void setChartFormat(long var1);

   void xsetChartFormat(XmlUnsignedInt var1);

   void unsetChartFormat();

   String getRowHeaderCaption();

   STXstring xgetRowHeaderCaption();

   boolean isSetRowHeaderCaption();

   void setRowHeaderCaption(String var1);

   void xsetRowHeaderCaption(STXstring var1);

   void unsetRowHeaderCaption();

   String getColHeaderCaption();

   STXstring xgetColHeaderCaption();

   boolean isSetColHeaderCaption();

   void setColHeaderCaption(String var1);

   void xsetColHeaderCaption(STXstring var1);

   void unsetColHeaderCaption();

   boolean getFieldListSortAscending();

   XmlBoolean xgetFieldListSortAscending();

   boolean isSetFieldListSortAscending();

   void setFieldListSortAscending(boolean var1);

   void xsetFieldListSortAscending(XmlBoolean var1);

   void unsetFieldListSortAscending();

   boolean getMdxSubqueries();

   XmlBoolean xgetMdxSubqueries();

   boolean isSetMdxSubqueries();

   void setMdxSubqueries(boolean var1);

   void xsetMdxSubqueries(XmlBoolean var1);

   void unsetMdxSubqueries();

   boolean getCustomListSort();

   XmlBoolean xgetCustomListSort();

   boolean isSetCustomListSort();

   void setCustomListSort(boolean var1);

   void xsetCustomListSort(XmlBoolean var1);

   void unsetCustomListSort();


   public static final class Factory {

      public static CTPivotTableDefinition newInstance() {
         return (CTPivotTableDefinition)POIXMLTypeLoader.newInstance(CTPivotTableDefinition.type, (XmlOptions)null);
      }

      public static CTPivotTableDefinition newInstance(XmlOptions var0) {
         return (CTPivotTableDefinition)POIXMLTypeLoader.newInstance(CTPivotTableDefinition.type, var0);
      }

      public static CTPivotTableDefinition parse(String var0) throws XmlException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, (XmlOptions)null);
      }

      public static CTPivotTableDefinition parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, var1);
      }

      public static CTPivotTableDefinition parse(File var0) throws XmlException, IOException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, (XmlOptions)null);
      }

      public static CTPivotTableDefinition parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, var1);
      }

      public static CTPivotTableDefinition parse(URL var0) throws XmlException, IOException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, (XmlOptions)null);
      }

      public static CTPivotTableDefinition parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, var1);
      }

      public static CTPivotTableDefinition parse(InputStream var0) throws XmlException, IOException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, (XmlOptions)null);
      }

      public static CTPivotTableDefinition parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, var1);
      }

      public static CTPivotTableDefinition parse(Reader var0) throws XmlException, IOException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, (XmlOptions)null);
      }

      public static CTPivotTableDefinition parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, var1);
      }

      public static CTPivotTableDefinition parse(XMLStreamReader var0) throws XmlException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, (XmlOptions)null);
      }

      public static CTPivotTableDefinition parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, var1);
      }

      public static CTPivotTableDefinition parse(Node var0) throws XmlException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, (XmlOptions)null);
      }

      public static CTPivotTableDefinition parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, var1);
      }

      public static CTPivotTableDefinition parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, (XmlOptions)null);
      }

      public static CTPivotTableDefinition parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPivotTableDefinition)POIXMLTypeLoader.parse(var0, CTPivotTableDefinition.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotTableDefinition.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotTableDefinition.type, var1);
      }

   }
}
