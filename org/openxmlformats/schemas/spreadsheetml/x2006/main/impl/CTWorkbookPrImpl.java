package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STObjects$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUpdateLinks$Enum;

public class CTWorkbookPrImpl extends XmlComplexContentImpl implements CTWorkbookPr {

   private static final QName DATE1904$0 = new QName("", "date1904");
   private static final QName SHOWOBJECTS$2 = new QName("", "showObjects");
   private static final QName SHOWBORDERUNSELECTEDTABLES$4 = new QName("", "showBorderUnselectedTables");
   private static final QName FILTERPRIVACY$6 = new QName("", "filterPrivacy");
   private static final QName PROMPTEDSOLUTIONS$8 = new QName("", "promptedSolutions");
   private static final QName SHOWINKANNOTATION$10 = new QName("", "showInkAnnotation");
   private static final QName BACKUPFILE$12 = new QName("", "backupFile");
   private static final QName SAVEEXTERNALLINKVALUES$14 = new QName("", "saveExternalLinkValues");
   private static final QName UPDATELINKS$16 = new QName("", "updateLinks");
   private static final QName CODENAME$18 = new QName("", "codeName");
   private static final QName HIDEPIVOTFIELDLIST$20 = new QName("", "hidePivotFieldList");
   private static final QName SHOWPIVOTCHARTFILTER$22 = new QName("", "showPivotChartFilter");
   private static final QName ALLOWREFRESHQUERY$24 = new QName("", "allowRefreshQuery");
   private static final QName PUBLISHITEMS$26 = new QName("", "publishItems");
   private static final QName CHECKCOMPATIBILITY$28 = new QName("", "checkCompatibility");
   private static final QName AUTOCOMPRESSPICTURES$30 = new QName("", "autoCompressPictures");
   private static final QName REFRESHALLCONNECTIONS$32 = new QName("", "refreshAllConnections");
   private static final QName DEFAULTTHEMEVERSION$34 = new QName("", "defaultThemeVersion");


   public CTWorkbookPrImpl(SchemaType var1) {
      super(var1);
   }

   public boolean getDate1904() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATE1904$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DATE1904$0);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDate1904() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DATE1904$0);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DATE1904$0);
         }

         return var2;
      }
   }

   public boolean isSetDate1904() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATE1904$0) != null;
      }
   }

   public void setDate1904(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DATE1904$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DATE1904$0);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDate1904(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DATE1904$0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DATE1904$0);
         }

         var3.set(var1);
      }
   }

   public void unsetDate1904() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATE1904$0);
      }
   }

   public STObjects$Enum getShowObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWOBJECTS$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWOBJECTS$2);
         }

         return var2 == null?null:(STObjects$Enum)var2.getEnumValue();
      }
   }

   public STObjects xgetShowObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STObjects var2 = null;
         var2 = (STObjects)this.get_store().find_attribute_user(SHOWOBJECTS$2);
         if(var2 == null) {
            var2 = (STObjects)this.get_default_attribute_value(SHOWOBJECTS$2);
         }

         return var2;
      }
   }

   public boolean isSetShowObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWOBJECTS$2) != null;
      }
   }

   public void setShowObjects(STObjects$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWOBJECTS$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWOBJECTS$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetShowObjects(STObjects var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STObjects var3 = null;
         var3 = (STObjects)this.get_store().find_attribute_user(SHOWOBJECTS$2);
         if(var3 == null) {
            var3 = (STObjects)this.get_store().add_attribute_user(SHOWOBJECTS$2);
         }

         var3.set(var1);
      }
   }

   public void unsetShowObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWOBJECTS$2);
      }
   }

   public boolean getShowBorderUnselectedTables() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWBORDERUNSELECTEDTABLES$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowBorderUnselectedTables() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWBORDERUNSELECTEDTABLES$4);
         }

         return var2;
      }
   }

   public boolean isSetShowBorderUnselectedTables() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWBORDERUNSELECTEDTABLES$4) != null;
      }
   }

   public void setShowBorderUnselectedTables(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowBorderUnselectedTables(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWBORDERUNSELECTEDTABLES$4);
         }

         var3.set(var1);
      }
   }

   public void unsetShowBorderUnselectedTables() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWBORDERUNSELECTEDTABLES$4);
      }
   }

   public boolean getFilterPrivacy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILTERPRIVACY$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FILTERPRIVACY$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFilterPrivacy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FILTERPRIVACY$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FILTERPRIVACY$6);
         }

         return var2;
      }
   }

   public boolean isSetFilterPrivacy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILTERPRIVACY$6) != null;
      }
   }

   public void setFilterPrivacy(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FILTERPRIVACY$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FILTERPRIVACY$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFilterPrivacy(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FILTERPRIVACY$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FILTERPRIVACY$6);
         }

         var3.set(var1);
      }
   }

   public void unsetFilterPrivacy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILTERPRIVACY$6);
      }
   }

   public boolean getPromptedSolutions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PROMPTEDSOLUTIONS$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PROMPTEDSOLUTIONS$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPromptedSolutions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PROMPTEDSOLUTIONS$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PROMPTEDSOLUTIONS$8);
         }

         return var2;
      }
   }

   public boolean isSetPromptedSolutions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PROMPTEDSOLUTIONS$8) != null;
      }
   }

   public void setPromptedSolutions(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PROMPTEDSOLUTIONS$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PROMPTEDSOLUTIONS$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPromptedSolutions(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PROMPTEDSOLUTIONS$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PROMPTEDSOLUTIONS$8);
         }

         var3.set(var1);
      }
   }

   public void unsetPromptedSolutions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PROMPTEDSOLUTIONS$8);
      }
   }

   public boolean getShowInkAnnotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWINKANNOTATION$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWINKANNOTATION$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowInkAnnotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWINKANNOTATION$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWINKANNOTATION$10);
         }

         return var2;
      }
   }

   public boolean isSetShowInkAnnotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWINKANNOTATION$10) != null;
      }
   }

   public void setShowInkAnnotation(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWINKANNOTATION$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWINKANNOTATION$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowInkAnnotation(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWINKANNOTATION$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWINKANNOTATION$10);
         }

         var3.set(var1);
      }
   }

   public void unsetShowInkAnnotation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWINKANNOTATION$10);
      }
   }

   public boolean getBackupFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BACKUPFILE$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BACKUPFILE$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBackupFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BACKUPFILE$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(BACKUPFILE$12);
         }

         return var2;
      }
   }

   public boolean isSetBackupFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BACKUPFILE$12) != null;
      }
   }

   public void setBackupFile(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BACKUPFILE$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BACKUPFILE$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBackupFile(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BACKUPFILE$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BACKUPFILE$12);
         }

         var3.set(var1);
      }
   }

   public void unsetBackupFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BACKUPFILE$12);
      }
   }

   public boolean getSaveExternalLinkValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SAVEEXTERNALLINKVALUES$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SAVEEXTERNALLINKVALUES$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSaveExternalLinkValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SAVEEXTERNALLINKVALUES$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SAVEEXTERNALLINKVALUES$14);
         }

         return var2;
      }
   }

   public boolean isSetSaveExternalLinkValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SAVEEXTERNALLINKVALUES$14) != null;
      }
   }

   public void setSaveExternalLinkValues(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SAVEEXTERNALLINKVALUES$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SAVEEXTERNALLINKVALUES$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSaveExternalLinkValues(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SAVEEXTERNALLINKVALUES$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SAVEEXTERNALLINKVALUES$14);
         }

         var3.set(var1);
      }
   }

   public void unsetSaveExternalLinkValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SAVEEXTERNALLINKVALUES$14);
      }
   }

   public STUpdateLinks$Enum getUpdateLinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UPDATELINKS$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(UPDATELINKS$16);
         }

         return var2 == null?null:(STUpdateLinks$Enum)var2.getEnumValue();
      }
   }

   public STUpdateLinks xgetUpdateLinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUpdateLinks var2 = null;
         var2 = (STUpdateLinks)this.get_store().find_attribute_user(UPDATELINKS$16);
         if(var2 == null) {
            var2 = (STUpdateLinks)this.get_default_attribute_value(UPDATELINKS$16);
         }

         return var2;
      }
   }

   public boolean isSetUpdateLinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UPDATELINKS$16) != null;
      }
   }

   public void setUpdateLinks(STUpdateLinks$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UPDATELINKS$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UPDATELINKS$16);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetUpdateLinks(STUpdateLinks var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUpdateLinks var3 = null;
         var3 = (STUpdateLinks)this.get_store().find_attribute_user(UPDATELINKS$16);
         if(var3 == null) {
            var3 = (STUpdateLinks)this.get_store().add_attribute_user(UPDATELINKS$16);
         }

         var3.set(var1);
      }
   }

   public void unsetUpdateLinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UPDATELINKS$16);
      }
   }

   public String getCodeName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CODENAME$18);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetCodeName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(CODENAME$18);
         return var2;
      }
   }

   public boolean isSetCodeName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CODENAME$18) != null;
      }
   }

   public void setCodeName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CODENAME$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CODENAME$18);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCodeName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(CODENAME$18);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(CODENAME$18);
         }

         var3.set(var1);
      }
   }

   public void unsetCodeName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CODENAME$18);
      }
   }

   public boolean getHidePivotFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIDEPIVOTFIELDLIST$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HIDEPIVOTFIELDLIST$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHidePivotFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIDEPIVOTFIELDLIST$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HIDEPIVOTFIELDLIST$20);
         }

         return var2;
      }
   }

   public boolean isSetHidePivotFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIDEPIVOTFIELDLIST$20) != null;
      }
   }

   public void setHidePivotFieldList(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIDEPIVOTFIELDLIST$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIDEPIVOTFIELDLIST$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHidePivotFieldList(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIDEPIVOTFIELDLIST$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIDEPIVOTFIELDLIST$20);
         }

         var3.set(var1);
      }
   }

   public void unsetHidePivotFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIDEPIVOTFIELDLIST$20);
      }
   }

   public boolean getShowPivotChartFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWPIVOTCHARTFILTER$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWPIVOTCHARTFILTER$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowPivotChartFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWPIVOTCHARTFILTER$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWPIVOTCHARTFILTER$22);
         }

         return var2;
      }
   }

   public boolean isSetShowPivotChartFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWPIVOTCHARTFILTER$22) != null;
      }
   }

   public void setShowPivotChartFilter(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWPIVOTCHARTFILTER$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWPIVOTCHARTFILTER$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowPivotChartFilter(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWPIVOTCHARTFILTER$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWPIVOTCHARTFILTER$22);
         }

         var3.set(var1);
      }
   }

   public void unsetShowPivotChartFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWPIVOTCHARTFILTER$22);
      }
   }

   public boolean getAllowRefreshQuery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALLOWREFRESHQUERY$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ALLOWREFRESHQUERY$24);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAllowRefreshQuery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ALLOWREFRESHQUERY$24);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ALLOWREFRESHQUERY$24);
         }

         return var2;
      }
   }

   public boolean isSetAllowRefreshQuery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALLOWREFRESHQUERY$24) != null;
      }
   }

   public void setAllowRefreshQuery(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALLOWREFRESHQUERY$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALLOWREFRESHQUERY$24);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAllowRefreshQuery(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ALLOWREFRESHQUERY$24);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ALLOWREFRESHQUERY$24);
         }

         var3.set(var1);
      }
   }

   public void unsetAllowRefreshQuery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALLOWREFRESHQUERY$24);
      }
   }

   public boolean getPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PUBLISHITEMS$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PUBLISHITEMS$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PUBLISHITEMS$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PUBLISHITEMS$26);
         }

         return var2;
      }
   }

   public boolean isSetPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PUBLISHITEMS$26) != null;
      }
   }

   public void setPublishItems(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PUBLISHITEMS$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PUBLISHITEMS$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPublishItems(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PUBLISHITEMS$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PUBLISHITEMS$26);
         }

         var3.set(var1);
      }
   }

   public void unsetPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PUBLISHITEMS$26);
      }
   }

   public boolean getCheckCompatibility() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CHECKCOMPATIBILITY$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CHECKCOMPATIBILITY$28);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCheckCompatibility() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CHECKCOMPATIBILITY$28);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CHECKCOMPATIBILITY$28);
         }

         return var2;
      }
   }

   public boolean isSetCheckCompatibility() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CHECKCOMPATIBILITY$28) != null;
      }
   }

   public void setCheckCompatibility(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CHECKCOMPATIBILITY$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CHECKCOMPATIBILITY$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCheckCompatibility(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CHECKCOMPATIBILITY$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CHECKCOMPATIBILITY$28);
         }

         var3.set(var1);
      }
   }

   public void unsetCheckCompatibility() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CHECKCOMPATIBILITY$28);
      }
   }

   public boolean getAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTOCOMPRESSPICTURES$30);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(AUTOCOMPRESSPICTURES$30);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(AUTOCOMPRESSPICTURES$30);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(AUTOCOMPRESSPICTURES$30);
         }

         return var2;
      }
   }

   public boolean isSetAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AUTOCOMPRESSPICTURES$30) != null;
      }
   }

   public void setAutoCompressPictures(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AUTOCOMPRESSPICTURES$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AUTOCOMPRESSPICTURES$30);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAutoCompressPictures(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(AUTOCOMPRESSPICTURES$30);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(AUTOCOMPRESSPICTURES$30);
         }

         var3.set(var1);
      }
   }

   public void unsetAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AUTOCOMPRESSPICTURES$30);
      }
   }

   public boolean getRefreshAllConnections() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REFRESHALLCONNECTIONS$32);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(REFRESHALLCONNECTIONS$32);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRefreshAllConnections() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(REFRESHALLCONNECTIONS$32);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(REFRESHALLCONNECTIONS$32);
         }

         return var2;
      }
   }

   public boolean isSetRefreshAllConnections() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REFRESHALLCONNECTIONS$32) != null;
      }
   }

   public void setRefreshAllConnections(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REFRESHALLCONNECTIONS$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REFRESHALLCONNECTIONS$32);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRefreshAllConnections(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(REFRESHALLCONNECTIONS$32);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(REFRESHALLCONNECTIONS$32);
         }

         var3.set(var1);
      }
   }

   public void unsetRefreshAllConnections() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REFRESHALLCONNECTIONS$32);
      }
   }

   public long getDefaultThemeVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTTHEMEVERSION$34);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetDefaultThemeVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(DEFAULTTHEMEVERSION$34);
         return var2;
      }
   }

   public boolean isSetDefaultThemeVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFAULTTHEMEVERSION$34) != null;
      }
   }

   public void setDefaultThemeVersion(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTTHEMEVERSION$34);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DEFAULTTHEMEVERSION$34);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDefaultThemeVersion(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(DEFAULTTHEMEVERSION$34);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(DEFAULTTHEMEVERSION$34);
         }

         var3.set(var1);
      }
   }

   public void unsetDefaultThemeVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFAULTTHEMEVERSION$34);
      }
   }

}
