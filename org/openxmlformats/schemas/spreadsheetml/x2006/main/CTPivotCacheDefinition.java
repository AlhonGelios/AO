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
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTPivotCacheDefinition extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPivotCacheDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpivotcachedefinition575ctype");


   CTCacheSource getCacheSource();

   void setCacheSource(CTCacheSource var1);

   CTCacheSource addNewCacheSource();

   CTCacheFields getCacheFields();

   void setCacheFields(CTCacheFields var1);

   CTCacheFields addNewCacheFields();

   CTCacheHierarchies getCacheHierarchies();

   boolean isSetCacheHierarchies();

   void setCacheHierarchies(CTCacheHierarchies var1);

   CTCacheHierarchies addNewCacheHierarchies();

   void unsetCacheHierarchies();

   CTPCDKPIs getKpis();

   boolean isSetKpis();

   void setKpis(CTPCDKPIs var1);

   CTPCDKPIs addNewKpis();

   void unsetKpis();

   CTTupleCache getTupleCache();

   boolean isSetTupleCache();

   void setTupleCache(CTTupleCache var1);

   CTTupleCache addNewTupleCache();

   void unsetTupleCache();

   CTCalculatedItems getCalculatedItems();

   boolean isSetCalculatedItems();

   void setCalculatedItems(CTCalculatedItems var1);

   CTCalculatedItems addNewCalculatedItems();

   void unsetCalculatedItems();

   CTCalculatedMembers getCalculatedMembers();

   boolean isSetCalculatedMembers();

   void setCalculatedMembers(CTCalculatedMembers var1);

   CTCalculatedMembers addNewCalculatedMembers();

   void unsetCalculatedMembers();

   CTDimensions getDimensions();

   boolean isSetDimensions();

   void setDimensions(CTDimensions var1);

   CTDimensions addNewDimensions();

   void unsetDimensions();

   CTMeasureGroups getMeasureGroups();

   boolean isSetMeasureGroups();

   void setMeasureGroups(CTMeasureGroups var1);

   CTMeasureGroups addNewMeasureGroups();

   void unsetMeasureGroups();

   CTMeasureDimensionMaps getMaps();

   boolean isSetMaps();

   void setMaps(CTMeasureDimensionMaps var1);

   CTMeasureDimensionMaps addNewMaps();

   void unsetMaps();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   String getId();

   STRelationshipId xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(STRelationshipId var1);

   void unsetId();

   boolean getInvalid();

   XmlBoolean xgetInvalid();

   boolean isSetInvalid();

   void setInvalid(boolean var1);

   void xsetInvalid(XmlBoolean var1);

   void unsetInvalid();

   boolean getSaveData();

   XmlBoolean xgetSaveData();

   boolean isSetSaveData();

   void setSaveData(boolean var1);

   void xsetSaveData(XmlBoolean var1);

   void unsetSaveData();

   boolean getRefreshOnLoad();

   XmlBoolean xgetRefreshOnLoad();

   boolean isSetRefreshOnLoad();

   void setRefreshOnLoad(boolean var1);

   void xsetRefreshOnLoad(XmlBoolean var1);

   void unsetRefreshOnLoad();

   boolean getOptimizeMemory();

   XmlBoolean xgetOptimizeMemory();

   boolean isSetOptimizeMemory();

   void setOptimizeMemory(boolean var1);

   void xsetOptimizeMemory(XmlBoolean var1);

   void unsetOptimizeMemory();

   boolean getEnableRefresh();

   XmlBoolean xgetEnableRefresh();

   boolean isSetEnableRefresh();

   void setEnableRefresh(boolean var1);

   void xsetEnableRefresh(XmlBoolean var1);

   void unsetEnableRefresh();

   String getRefreshedBy();

   STXstring xgetRefreshedBy();

   boolean isSetRefreshedBy();

   void setRefreshedBy(String var1);

   void xsetRefreshedBy(STXstring var1);

   void unsetRefreshedBy();

   double getRefreshedDate();

   XmlDouble xgetRefreshedDate();

   boolean isSetRefreshedDate();

   void setRefreshedDate(double var1);

   void xsetRefreshedDate(XmlDouble var1);

   void unsetRefreshedDate();

   boolean getBackgroundQuery();

   XmlBoolean xgetBackgroundQuery();

   boolean isSetBackgroundQuery();

   void setBackgroundQuery(boolean var1);

   void xsetBackgroundQuery(XmlBoolean var1);

   void unsetBackgroundQuery();

   long getMissingItemsLimit();

   XmlUnsignedInt xgetMissingItemsLimit();

   boolean isSetMissingItemsLimit();

   void setMissingItemsLimit(long var1);

   void xsetMissingItemsLimit(XmlUnsignedInt var1);

   void unsetMissingItemsLimit();

   short getCreatedVersion();

   XmlUnsignedByte xgetCreatedVersion();

   boolean isSetCreatedVersion();

   void setCreatedVersion(short var1);

   void xsetCreatedVersion(XmlUnsignedByte var1);

   void unsetCreatedVersion();

   short getRefreshedVersion();

   XmlUnsignedByte xgetRefreshedVersion();

   boolean isSetRefreshedVersion();

   void setRefreshedVersion(short var1);

   void xsetRefreshedVersion(XmlUnsignedByte var1);

   void unsetRefreshedVersion();

   short getMinRefreshableVersion();

   XmlUnsignedByte xgetMinRefreshableVersion();

   boolean isSetMinRefreshableVersion();

   void setMinRefreshableVersion(short var1);

   void xsetMinRefreshableVersion(XmlUnsignedByte var1);

   void unsetMinRefreshableVersion();

   long getRecordCount();

   XmlUnsignedInt xgetRecordCount();

   boolean isSetRecordCount();

   void setRecordCount(long var1);

   void xsetRecordCount(XmlUnsignedInt var1);

   void unsetRecordCount();

   boolean getUpgradeOnRefresh();

   XmlBoolean xgetUpgradeOnRefresh();

   boolean isSetUpgradeOnRefresh();

   void setUpgradeOnRefresh(boolean var1);

   void xsetUpgradeOnRefresh(XmlBoolean var1);

   void unsetUpgradeOnRefresh();

   boolean getTupleCache2();

   XmlBoolean xgetTupleCache2();

   boolean isSetTupleCache2();

   void setTupleCache2(boolean var1);

   void xsetTupleCache2(XmlBoolean var1);

   void unsetTupleCache2();

   boolean getSupportSubquery();

   XmlBoolean xgetSupportSubquery();

   boolean isSetSupportSubquery();

   void setSupportSubquery(boolean var1);

   void xsetSupportSubquery(XmlBoolean var1);

   void unsetSupportSubquery();

   boolean getSupportAdvancedDrill();

   XmlBoolean xgetSupportAdvancedDrill();

   boolean isSetSupportAdvancedDrill();

   void setSupportAdvancedDrill(boolean var1);

   void xsetSupportAdvancedDrill(XmlBoolean var1);

   void unsetSupportAdvancedDrill();


   public static final class Factory {

      public static CTPivotCacheDefinition newInstance() {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.newInstance(CTPivotCacheDefinition.type, (XmlOptions)null);
      }

      public static CTPivotCacheDefinition newInstance(XmlOptions var0) {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.newInstance(CTPivotCacheDefinition.type, var0);
      }

      public static CTPivotCacheDefinition parse(String var0) throws XmlException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, (XmlOptions)null);
      }

      public static CTPivotCacheDefinition parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, var1);
      }

      public static CTPivotCacheDefinition parse(File var0) throws XmlException, IOException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, (XmlOptions)null);
      }

      public static CTPivotCacheDefinition parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, var1);
      }

      public static CTPivotCacheDefinition parse(URL var0) throws XmlException, IOException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, (XmlOptions)null);
      }

      public static CTPivotCacheDefinition parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, var1);
      }

      public static CTPivotCacheDefinition parse(InputStream var0) throws XmlException, IOException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, (XmlOptions)null);
      }

      public static CTPivotCacheDefinition parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, var1);
      }

      public static CTPivotCacheDefinition parse(Reader var0) throws XmlException, IOException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, (XmlOptions)null);
      }

      public static CTPivotCacheDefinition parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, var1);
      }

      public static CTPivotCacheDefinition parse(XMLStreamReader var0) throws XmlException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, (XmlOptions)null);
      }

      public static CTPivotCacheDefinition parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, var1);
      }

      public static CTPivotCacheDefinition parse(Node var0) throws XmlException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, (XmlOptions)null);
      }

      public static CTPivotCacheDefinition parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, var1);
      }

      public static CTPivotCacheDefinition parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, (XmlOptions)null);
      }

      public static CTPivotCacheDefinition parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPivotCacheDefinition)POIXMLTypeLoader.parse(var0, CTPivotCacheDefinition.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotCacheDefinition.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotCacheDefinition.type, var1);
      }

   }
}
