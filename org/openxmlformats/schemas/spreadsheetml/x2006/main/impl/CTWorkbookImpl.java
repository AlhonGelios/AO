package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTWorkbookImpl.1FileRecoveryPrList;

public class CTWorkbookImpl extends XmlComplexContentImpl implements CTWorkbook {

   private static final QName FILEVERSION$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fileVersion");
   private static final QName FILESHARING$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fileSharing");
   private static final QName WORKBOOKPR$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbookPr");
   private static final QName WORKBOOKPROTECTION$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbookProtection");
   private static final QName BOOKVIEWS$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "bookViews");
   private static final QName SHEETS$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheets");
   private static final QName FUNCTIONGROUPS$12 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "functionGroups");
   private static final QName EXTERNALREFERENCES$14 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalReferences");
   private static final QName DEFINEDNAMES$16 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "definedNames");
   private static final QName CALCPR$18 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calcPr");
   private static final QName OLESIZE$20 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleSize");
   private static final QName CUSTOMWORKBOOKVIEWS$22 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customWorkbookViews");
   private static final QName PIVOTCACHES$24 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotCaches");
   private static final QName SMARTTAGPR$26 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "smartTagPr");
   private static final QName SMARTTAGTYPES$28 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "smartTagTypes");
   private static final QName WEBPUBLISHING$30 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishing");
   private static final QName FILERECOVERYPR$32 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fileRecoveryPr");
   private static final QName WEBPUBLISHOBJECTS$34 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishObjects");
   private static final QName EXTLST$36 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTWorkbookImpl(SchemaType var1) {
      super(var1);
   }

   public CTFileVersion getFileVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFileVersion var2 = null;
         var2 = (CTFileVersion)this.get_store().find_element_user(FILEVERSION$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFileVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILEVERSION$0) != 0;
      }
   }

   public void setFileVersion(CTFileVersion var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFileVersion var3 = null;
         var3 = (CTFileVersion)this.get_store().find_element_user(FILEVERSION$0, 0);
         if(var3 == null) {
            var3 = (CTFileVersion)this.get_store().add_element_user(FILEVERSION$0);
         }

         var3.set(var1);
      }
   }

   public CTFileVersion addNewFileVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFileVersion var2 = null;
         var2 = (CTFileVersion)this.get_store().add_element_user(FILEVERSION$0);
         return var2;
      }
   }

   public void unsetFileVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILEVERSION$0, 0);
      }
   }

   public CTFileSharing getFileSharing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFileSharing var2 = null;
         var2 = (CTFileSharing)this.get_store().find_element_user(FILESHARING$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFileSharing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILESHARING$2) != 0;
      }
   }

   public void setFileSharing(CTFileSharing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFileSharing var3 = null;
         var3 = (CTFileSharing)this.get_store().find_element_user(FILESHARING$2, 0);
         if(var3 == null) {
            var3 = (CTFileSharing)this.get_store().add_element_user(FILESHARING$2);
         }

         var3.set(var1);
      }
   }

   public CTFileSharing addNewFileSharing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFileSharing var2 = null;
         var2 = (CTFileSharing)this.get_store().add_element_user(FILESHARING$2);
         return var2;
      }
   }

   public void unsetFileSharing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILESHARING$2, 0);
      }
   }

   public CTWorkbookPr getWorkbookPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorkbookPr var2 = null;
         var2 = (CTWorkbookPr)this.get_store().find_element_user(WORKBOOKPR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWorkbookPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WORKBOOKPR$4) != 0;
      }
   }

   public void setWorkbookPr(CTWorkbookPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorkbookPr var3 = null;
         var3 = (CTWorkbookPr)this.get_store().find_element_user(WORKBOOKPR$4, 0);
         if(var3 == null) {
            var3 = (CTWorkbookPr)this.get_store().add_element_user(WORKBOOKPR$4);
         }

         var3.set(var1);
      }
   }

   public CTWorkbookPr addNewWorkbookPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorkbookPr var2 = null;
         var2 = (CTWorkbookPr)this.get_store().add_element_user(WORKBOOKPR$4);
         return var2;
      }
   }

   public void unsetWorkbookPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WORKBOOKPR$4, 0);
      }
   }

   public CTWorkbookProtection getWorkbookProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorkbookProtection var2 = null;
         var2 = (CTWorkbookProtection)this.get_store().find_element_user(WORKBOOKPROTECTION$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWorkbookProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WORKBOOKPROTECTION$6) != 0;
      }
   }

   public void setWorkbookProtection(CTWorkbookProtection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorkbookProtection var3 = null;
         var3 = (CTWorkbookProtection)this.get_store().find_element_user(WORKBOOKPROTECTION$6, 0);
         if(var3 == null) {
            var3 = (CTWorkbookProtection)this.get_store().add_element_user(WORKBOOKPROTECTION$6);
         }

         var3.set(var1);
      }
   }

   public CTWorkbookProtection addNewWorkbookProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorkbookProtection var2 = null;
         var2 = (CTWorkbookProtection)this.get_store().add_element_user(WORKBOOKPROTECTION$6);
         return var2;
      }
   }

   public void unsetWorkbookProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WORKBOOKPROTECTION$6, 0);
      }
   }

   public CTBookViews getBookViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookViews var2 = null;
         var2 = (CTBookViews)this.get_store().find_element_user(BOOKVIEWS$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBookViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOOKVIEWS$8) != 0;
      }
   }

   public void setBookViews(CTBookViews var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookViews var3 = null;
         var3 = (CTBookViews)this.get_store().find_element_user(BOOKVIEWS$8, 0);
         if(var3 == null) {
            var3 = (CTBookViews)this.get_store().add_element_user(BOOKVIEWS$8);
         }

         var3.set(var1);
      }
   }

   public CTBookViews addNewBookViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBookViews var2 = null;
         var2 = (CTBookViews)this.get_store().add_element_user(BOOKVIEWS$8);
         return var2;
      }
   }

   public void unsetBookViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOOKVIEWS$8, 0);
      }
   }

   public CTSheets getSheets() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheets var2 = null;
         var2 = (CTSheets)this.get_store().find_element_user(SHEETS$10, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSheets(CTSheets var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheets var3 = null;
         var3 = (CTSheets)this.get_store().find_element_user(SHEETS$10, 0);
         if(var3 == null) {
            var3 = (CTSheets)this.get_store().add_element_user(SHEETS$10);
         }

         var3.set(var1);
      }
   }

   public CTSheets addNewSheets() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheets var2 = null;
         var2 = (CTSheets)this.get_store().add_element_user(SHEETS$10);
         return var2;
      }
   }

   public CTFunctionGroups getFunctionGroups() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFunctionGroups var2 = null;
         var2 = (CTFunctionGroups)this.get_store().find_element_user(FUNCTIONGROUPS$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFunctionGroups() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FUNCTIONGROUPS$12) != 0;
      }
   }

   public void setFunctionGroups(CTFunctionGroups var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFunctionGroups var3 = null;
         var3 = (CTFunctionGroups)this.get_store().find_element_user(FUNCTIONGROUPS$12, 0);
         if(var3 == null) {
            var3 = (CTFunctionGroups)this.get_store().add_element_user(FUNCTIONGROUPS$12);
         }

         var3.set(var1);
      }
   }

   public CTFunctionGroups addNewFunctionGroups() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFunctionGroups var2 = null;
         var2 = (CTFunctionGroups)this.get_store().add_element_user(FUNCTIONGROUPS$12);
         return var2;
      }
   }

   public void unsetFunctionGroups() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FUNCTIONGROUPS$12, 0);
      }
   }

   public CTExternalReferences getExternalReferences() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalReferences var2 = null;
         var2 = (CTExternalReferences)this.get_store().find_element_user(EXTERNALREFERENCES$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExternalReferences() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTERNALREFERENCES$14) != 0;
      }
   }

   public void setExternalReferences(CTExternalReferences var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalReferences var3 = null;
         var3 = (CTExternalReferences)this.get_store().find_element_user(EXTERNALREFERENCES$14, 0);
         if(var3 == null) {
            var3 = (CTExternalReferences)this.get_store().add_element_user(EXTERNALREFERENCES$14);
         }

         var3.set(var1);
      }
   }

   public CTExternalReferences addNewExternalReferences() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalReferences var2 = null;
         var2 = (CTExternalReferences)this.get_store().add_element_user(EXTERNALREFERENCES$14);
         return var2;
      }
   }

   public void unsetExternalReferences() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTERNALREFERENCES$14, 0);
      }
   }

   public CTDefinedNames getDefinedNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDefinedNames var2 = null;
         var2 = (CTDefinedNames)this.get_store().find_element_user(DEFINEDNAMES$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDefinedNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFINEDNAMES$16) != 0;
      }
   }

   public void setDefinedNames(CTDefinedNames var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDefinedNames var3 = null;
         var3 = (CTDefinedNames)this.get_store().find_element_user(DEFINEDNAMES$16, 0);
         if(var3 == null) {
            var3 = (CTDefinedNames)this.get_store().add_element_user(DEFINEDNAMES$16);
         }

         var3.set(var1);
      }
   }

   public CTDefinedNames addNewDefinedNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDefinedNames var2 = null;
         var2 = (CTDefinedNames)this.get_store().add_element_user(DEFINEDNAMES$16);
         return var2;
      }
   }

   public void unsetDefinedNames() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFINEDNAMES$16, 0);
      }
   }

   public CTCalcPr getCalcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalcPr var2 = null;
         var2 = (CTCalcPr)this.get_store().find_element_user(CALCPR$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCalcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CALCPR$18) != 0;
      }
   }

   public void setCalcPr(CTCalcPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalcPr var3 = null;
         var3 = (CTCalcPr)this.get_store().find_element_user(CALCPR$18, 0);
         if(var3 == null) {
            var3 = (CTCalcPr)this.get_store().add_element_user(CALCPR$18);
         }

         var3.set(var1);
      }
   }

   public CTCalcPr addNewCalcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalcPr var2 = null;
         var2 = (CTCalcPr)this.get_store().add_element_user(CALCPR$18);
         return var2;
      }
   }

   public void unsetCalcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CALCPR$18, 0);
      }
   }

   public CTOleSize getOleSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleSize var2 = null;
         var2 = (CTOleSize)this.get_store().find_element_user(OLESIZE$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOleSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OLESIZE$20) != 0;
      }
   }

   public void setOleSize(CTOleSize var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleSize var3 = null;
         var3 = (CTOleSize)this.get_store().find_element_user(OLESIZE$20, 0);
         if(var3 == null) {
            var3 = (CTOleSize)this.get_store().add_element_user(OLESIZE$20);
         }

         var3.set(var1);
      }
   }

   public CTOleSize addNewOleSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleSize var2 = null;
         var2 = (CTOleSize)this.get_store().add_element_user(OLESIZE$20);
         return var2;
      }
   }

   public void unsetOleSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OLESIZE$20, 0);
      }
   }

   public CTCustomWorkbookViews getCustomWorkbookViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomWorkbookViews var2 = null;
         var2 = (CTCustomWorkbookViews)this.get_store().find_element_user(CUSTOMWORKBOOKVIEWS$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustomWorkbookViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMWORKBOOKVIEWS$22) != 0;
      }
   }

   public void setCustomWorkbookViews(CTCustomWorkbookViews var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomWorkbookViews var3 = null;
         var3 = (CTCustomWorkbookViews)this.get_store().find_element_user(CUSTOMWORKBOOKVIEWS$22, 0);
         if(var3 == null) {
            var3 = (CTCustomWorkbookViews)this.get_store().add_element_user(CUSTOMWORKBOOKVIEWS$22);
         }

         var3.set(var1);
      }
   }

   public CTCustomWorkbookViews addNewCustomWorkbookViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomWorkbookViews var2 = null;
         var2 = (CTCustomWorkbookViews)this.get_store().add_element_user(CUSTOMWORKBOOKVIEWS$22);
         return var2;
      }
   }

   public void unsetCustomWorkbookViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMWORKBOOKVIEWS$22, 0);
      }
   }

   public CTPivotCaches getPivotCaches() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotCaches var2 = null;
         var2 = (CTPivotCaches)this.get_store().find_element_user(PIVOTCACHES$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPivotCaches() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIVOTCACHES$24) != 0;
      }
   }

   public void setPivotCaches(CTPivotCaches var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotCaches var3 = null;
         var3 = (CTPivotCaches)this.get_store().find_element_user(PIVOTCACHES$24, 0);
         if(var3 == null) {
            var3 = (CTPivotCaches)this.get_store().add_element_user(PIVOTCACHES$24);
         }

         var3.set(var1);
      }
   }

   public CTPivotCaches addNewPivotCaches() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotCaches var2 = null;
         var2 = (CTPivotCaches)this.get_store().add_element_user(PIVOTCACHES$24);
         return var2;
      }
   }

   public void unsetPivotCaches() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIVOTCACHES$24, 0);
      }
   }

   public CTSmartTagPr getSmartTagPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagPr var2 = null;
         var2 = (CTSmartTagPr)this.get_store().find_element_user(SMARTTAGPR$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSmartTagPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SMARTTAGPR$26) != 0;
      }
   }

   public void setSmartTagPr(CTSmartTagPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagPr var3 = null;
         var3 = (CTSmartTagPr)this.get_store().find_element_user(SMARTTAGPR$26, 0);
         if(var3 == null) {
            var3 = (CTSmartTagPr)this.get_store().add_element_user(SMARTTAGPR$26);
         }

         var3.set(var1);
      }
   }

   public CTSmartTagPr addNewSmartTagPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagPr var2 = null;
         var2 = (CTSmartTagPr)this.get_store().add_element_user(SMARTTAGPR$26);
         return var2;
      }
   }

   public void unsetSmartTagPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SMARTTAGPR$26, 0);
      }
   }

   public CTSmartTagTypes getSmartTagTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagTypes var2 = null;
         var2 = (CTSmartTagTypes)this.get_store().find_element_user(SMARTTAGTYPES$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSmartTagTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SMARTTAGTYPES$28) != 0;
      }
   }

   public void setSmartTagTypes(CTSmartTagTypes var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagTypes var3 = null;
         var3 = (CTSmartTagTypes)this.get_store().find_element_user(SMARTTAGTYPES$28, 0);
         if(var3 == null) {
            var3 = (CTSmartTagTypes)this.get_store().add_element_user(SMARTTAGTYPES$28);
         }

         var3.set(var1);
      }
   }

   public CTSmartTagTypes addNewSmartTagTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagTypes var2 = null;
         var2 = (CTSmartTagTypes)this.get_store().add_element_user(SMARTTAGTYPES$28);
         return var2;
      }
   }

   public void unsetSmartTagTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SMARTTAGTYPES$28, 0);
      }
   }

   public CTWebPublishing getWebPublishing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishing var2 = null;
         var2 = (CTWebPublishing)this.get_store().find_element_user(WEBPUBLISHING$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWebPublishing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WEBPUBLISHING$30) != 0;
      }
   }

   public void setWebPublishing(CTWebPublishing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishing var3 = null;
         var3 = (CTWebPublishing)this.get_store().find_element_user(WEBPUBLISHING$30, 0);
         if(var3 == null) {
            var3 = (CTWebPublishing)this.get_store().add_element_user(WEBPUBLISHING$30);
         }

         var3.set(var1);
      }
   }

   public CTWebPublishing addNewWebPublishing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishing var2 = null;
         var2 = (CTWebPublishing)this.get_store().add_element_user(WEBPUBLISHING$30);
         return var2;
      }
   }

   public void unsetWebPublishing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WEBPUBLISHING$30, 0);
      }
   }

   public List getFileRecoveryPrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FileRecoveryPrList(this);
      }
   }

   public CTFileRecoveryPr[] getFileRecoveryPrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FILERECOVERYPR$32, var2);
         CTFileRecoveryPr[] var3 = new CTFileRecoveryPr[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFileRecoveryPr getFileRecoveryPrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFileRecoveryPr var3 = null;
         var3 = (CTFileRecoveryPr)this.get_store().find_element_user(FILERECOVERYPR$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFileRecoveryPrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILERECOVERYPR$32);
      }
   }

   public void setFileRecoveryPrArray(CTFileRecoveryPr[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FILERECOVERYPR$32);
      }
   }

   public void setFileRecoveryPrArray(int var1, CTFileRecoveryPr var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFileRecoveryPr var4 = null;
         var4 = (CTFileRecoveryPr)this.get_store().find_element_user(FILERECOVERYPR$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFileRecoveryPr insertNewFileRecoveryPr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFileRecoveryPr var3 = null;
         var3 = (CTFileRecoveryPr)this.get_store().insert_element_user(FILERECOVERYPR$32, var1);
         return var3;
      }
   }

   public CTFileRecoveryPr addNewFileRecoveryPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFileRecoveryPr var2 = null;
         var2 = (CTFileRecoveryPr)this.get_store().add_element_user(FILERECOVERYPR$32);
         return var2;
      }
   }

   public void removeFileRecoveryPr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILERECOVERYPR$32, var1);
      }
   }

   public CTWebPublishObjects getWebPublishObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishObjects var2 = null;
         var2 = (CTWebPublishObjects)this.get_store().find_element_user(WEBPUBLISHOBJECTS$34, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWebPublishObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WEBPUBLISHOBJECTS$34) != 0;
      }
   }

   public void setWebPublishObjects(CTWebPublishObjects var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishObjects var3 = null;
         var3 = (CTWebPublishObjects)this.get_store().find_element_user(WEBPUBLISHOBJECTS$34, 0);
         if(var3 == null) {
            var3 = (CTWebPublishObjects)this.get_store().add_element_user(WEBPUBLISHOBJECTS$34);
         }

         var3.set(var1);
      }
   }

   public CTWebPublishObjects addNewWebPublishObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishObjects var2 = null;
         var2 = (CTWebPublishObjects)this.get_store().add_element_user(WEBPUBLISHOBJECTS$34);
         return var2;
      }
   }

   public void unsetWebPublishObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WEBPUBLISHOBJECTS$34, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$36, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$36) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$36, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$36);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$36);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$36, 0);
      }
   }

}
