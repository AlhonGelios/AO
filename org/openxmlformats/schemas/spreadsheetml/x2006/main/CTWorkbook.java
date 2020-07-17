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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookViews;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomWorkbookViews;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedNames;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileRecoveryPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileSharing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFileVersion;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleSize;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCaches;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheets;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTagTypes;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishObjects;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection;
import org.w3c.dom.Node;

public interface CTWorkbook extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTWorkbook.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctworkbook83c3type");


   CTFileVersion getFileVersion();

   boolean isSetFileVersion();

   void setFileVersion(CTFileVersion var1);

   CTFileVersion addNewFileVersion();

   void unsetFileVersion();

   CTFileSharing getFileSharing();

   boolean isSetFileSharing();

   void setFileSharing(CTFileSharing var1);

   CTFileSharing addNewFileSharing();

   void unsetFileSharing();

   CTWorkbookPr getWorkbookPr();

   boolean isSetWorkbookPr();

   void setWorkbookPr(CTWorkbookPr var1);

   CTWorkbookPr addNewWorkbookPr();

   void unsetWorkbookPr();

   CTWorkbookProtection getWorkbookProtection();

   boolean isSetWorkbookProtection();

   void setWorkbookProtection(CTWorkbookProtection var1);

   CTWorkbookProtection addNewWorkbookProtection();

   void unsetWorkbookProtection();

   CTBookViews getBookViews();

   boolean isSetBookViews();

   void setBookViews(CTBookViews var1);

   CTBookViews addNewBookViews();

   void unsetBookViews();

   CTSheets getSheets();

   void setSheets(CTSheets var1);

   CTSheets addNewSheets();

   CTFunctionGroups getFunctionGroups();

   boolean isSetFunctionGroups();

   void setFunctionGroups(CTFunctionGroups var1);

   CTFunctionGroups addNewFunctionGroups();

   void unsetFunctionGroups();

   CTExternalReferences getExternalReferences();

   boolean isSetExternalReferences();

   void setExternalReferences(CTExternalReferences var1);

   CTExternalReferences addNewExternalReferences();

   void unsetExternalReferences();

   CTDefinedNames getDefinedNames();

   boolean isSetDefinedNames();

   void setDefinedNames(CTDefinedNames var1);

   CTDefinedNames addNewDefinedNames();

   void unsetDefinedNames();

   CTCalcPr getCalcPr();

   boolean isSetCalcPr();

   void setCalcPr(CTCalcPr var1);

   CTCalcPr addNewCalcPr();

   void unsetCalcPr();

   CTOleSize getOleSize();

   boolean isSetOleSize();

   void setOleSize(CTOleSize var1);

   CTOleSize addNewOleSize();

   void unsetOleSize();

   CTCustomWorkbookViews getCustomWorkbookViews();

   boolean isSetCustomWorkbookViews();

   void setCustomWorkbookViews(CTCustomWorkbookViews var1);

   CTCustomWorkbookViews addNewCustomWorkbookViews();

   void unsetCustomWorkbookViews();

   CTPivotCaches getPivotCaches();

   boolean isSetPivotCaches();

   void setPivotCaches(CTPivotCaches var1);

   CTPivotCaches addNewPivotCaches();

   void unsetPivotCaches();

   CTSmartTagPr getSmartTagPr();

   boolean isSetSmartTagPr();

   void setSmartTagPr(CTSmartTagPr var1);

   CTSmartTagPr addNewSmartTagPr();

   void unsetSmartTagPr();

   CTSmartTagTypes getSmartTagTypes();

   boolean isSetSmartTagTypes();

   void setSmartTagTypes(CTSmartTagTypes var1);

   CTSmartTagTypes addNewSmartTagTypes();

   void unsetSmartTagTypes();

   CTWebPublishing getWebPublishing();

   boolean isSetWebPublishing();

   void setWebPublishing(CTWebPublishing var1);

   CTWebPublishing addNewWebPublishing();

   void unsetWebPublishing();

   List getFileRecoveryPrList();

   CTFileRecoveryPr[] getFileRecoveryPrArray();

   CTFileRecoveryPr getFileRecoveryPrArray(int var1);

   int sizeOfFileRecoveryPrArray();

   void setFileRecoveryPrArray(CTFileRecoveryPr[] var1);

   void setFileRecoveryPrArray(int var1, CTFileRecoveryPr var2);

   CTFileRecoveryPr insertNewFileRecoveryPr(int var1);

   CTFileRecoveryPr addNewFileRecoveryPr();

   void removeFileRecoveryPr(int var1);

   CTWebPublishObjects getWebPublishObjects();

   boolean isSetWebPublishObjects();

   void setWebPublishObjects(CTWebPublishObjects var1);

   CTWebPublishObjects addNewWebPublishObjects();

   void unsetWebPublishObjects();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTWorkbook newInstance() {
         return (CTWorkbook)POIXMLTypeLoader.newInstance(CTWorkbook.type, (XmlOptions)null);
      }

      public static CTWorkbook newInstance(XmlOptions var0) {
         return (CTWorkbook)POIXMLTypeLoader.newInstance(CTWorkbook.type, var0);
      }

      public static CTWorkbook parse(String var0) throws XmlException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, (XmlOptions)null);
      }

      public static CTWorkbook parse(String var0, XmlOptions var1) throws XmlException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, var1);
      }

      public static CTWorkbook parse(File var0) throws XmlException, IOException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, (XmlOptions)null);
      }

      public static CTWorkbook parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, var1);
      }

      public static CTWorkbook parse(URL var0) throws XmlException, IOException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, (XmlOptions)null);
      }

      public static CTWorkbook parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, var1);
      }

      public static CTWorkbook parse(InputStream var0) throws XmlException, IOException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, (XmlOptions)null);
      }

      public static CTWorkbook parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, var1);
      }

      public static CTWorkbook parse(Reader var0) throws XmlException, IOException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, (XmlOptions)null);
      }

      public static CTWorkbook parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, var1);
      }

      public static CTWorkbook parse(XMLStreamReader var0) throws XmlException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, (XmlOptions)null);
      }

      public static CTWorkbook parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, var1);
      }

      public static CTWorkbook parse(Node var0) throws XmlException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, (XmlOptions)null);
      }

      public static CTWorkbook parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, var1);
      }

      public static CTWorkbook parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, (XmlOptions)null);
      }

      public static CTWorkbook parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTWorkbook)POIXMLTypeLoader.parse(var0, CTWorkbook.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTWorkbook.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTWorkbook.type, var1);
      }

   }
}
