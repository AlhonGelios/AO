package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.IconType;
import com.microsoft.schemas.office.visio.x2012.main.MasterType;
import com.microsoft.schemas.office.visio.x2012.main.PageSheetType;
import com.microsoft.schemas.office.visio.x2012.main.RelType;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.XmlUnsignedShort;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class MasterTypeImpl extends XmlComplexContentImpl implements MasterType {

   private static final QName PAGESHEET$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "PageSheet");
   private static final QName REL$2 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Rel");
   private static final QName ICON$4 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Icon");
   private static final QName ID$6 = new QName("", "ID");
   private static final QName BASEID$8 = new QName("", "BaseID");
   private static final QName UNIQUEID$10 = new QName("", "UniqueID");
   private static final QName MATCHBYNAME$12 = new QName("", "MatchByName");
   private static final QName NAME$14 = new QName("", "Name");
   private static final QName NAMEU$16 = new QName("", "NameU");
   private static final QName ISCUSTOMNAME$18 = new QName("", "IsCustomName");
   private static final QName ISCUSTOMNAMEU$20 = new QName("", "IsCustomNameU");
   private static final QName ICONSIZE$22 = new QName("", "IconSize");
   private static final QName PATTERNFLAGS$24 = new QName("", "PatternFlags");
   private static final QName PROMPT$26 = new QName("", "Prompt");
   private static final QName HIDDEN$28 = new QName("", "Hidden");
   private static final QName ICONUPDATE$30 = new QName("", "IconUpdate");
   private static final QName ALIGNNAME$32 = new QName("", "AlignName");
   private static final QName MASTERTYPE$34 = new QName("", "MasterType");


   public MasterTypeImpl(SchemaType var1) {
      super(var1);
   }

   public PageSheetType getPageSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageSheetType var2 = null;
         var2 = (PageSheetType)this.get_store().find_element_user(PAGESHEET$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGESHEET$0) != 0;
      }
   }

   public void setPageSheet(PageSheetType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageSheetType var3 = null;
         var3 = (PageSheetType)this.get_store().find_element_user(PAGESHEET$0, 0);
         if(var3 == null) {
            var3 = (PageSheetType)this.get_store().add_element_user(PAGESHEET$0);
         }

         var3.set(var1);
      }
   }

   public PageSheetType addNewPageSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageSheetType var2 = null;
         var2 = (PageSheetType)this.get_store().add_element_user(PAGESHEET$0);
         return var2;
      }
   }

   public void unsetPageSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGESHEET$0, 0);
      }
   }

   public RelType getRel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RelType var2 = null;
         var2 = (RelType)this.get_store().find_element_user(REL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setRel(RelType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RelType var3 = null;
         var3 = (RelType)this.get_store().find_element_user(REL$2, 0);
         if(var3 == null) {
            var3 = (RelType)this.get_store().add_element_user(REL$2);
         }

         var3.set(var1);
      }
   }

   public RelType addNewRel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RelType var2 = null;
         var2 = (RelType)this.get_store().add_element_user(REL$2);
         return var2;
      }
   }

   public IconType getIcon() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         IconType var2 = null;
         var2 = (IconType)this.get_store().find_element_user(ICON$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIcon() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ICON$4) != 0;
      }
   }

   public void setIcon(IconType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         IconType var3 = null;
         var3 = (IconType)this.get_store().find_element_user(ICON$4, 0);
         if(var3 == null) {
            var3 = (IconType)this.get_store().add_element_user(ICON$4);
         }

         var3.set(var1);
      }
   }

   public IconType addNewIcon() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         IconType var2 = null;
         var2 = (IconType)this.get_store().add_element_user(ICON$4);
         return var2;
      }
   }

   public void unsetIcon() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ICON$4, 0);
      }
   }

   public long getID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$6);
         return var2;
      }
   }

   public void setID(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetID(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$6);
         }

         var3.set(var1);
      }
   }

   public String getBaseID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BASEID$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBaseID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(BASEID$8);
         return var2;
      }
   }

   public boolean isSetBaseID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BASEID$8) != null;
      }
   }

   public void setBaseID(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BASEID$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BASEID$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBaseID(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(BASEID$8);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(BASEID$8);
         }

         var3.set(var1);
      }
   }

   public void unsetBaseID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BASEID$8);
      }
   }

   public String getUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UNIQUEID$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(UNIQUEID$10);
         return var2;
      }
   }

   public boolean isSetUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UNIQUEID$10) != null;
      }
   }

   public void setUniqueID(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UNIQUEID$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UNIQUEID$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetUniqueID(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(UNIQUEID$10);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(UNIQUEID$10);
         }

         var3.set(var1);
      }
   }

   public void unsetUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UNIQUEID$10);
      }
   }

   public boolean getMatchByName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MATCHBYNAME$12);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMatchByName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MATCHBYNAME$12);
         return var2;
      }
   }

   public boolean isSetMatchByName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MATCHBYNAME$12) != null;
      }
   }

   public void setMatchByName(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MATCHBYNAME$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MATCHBYNAME$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMatchByName(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MATCHBYNAME$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MATCHBYNAME$12);
         }

         var3.set(var1);
      }
   }

   public void unsetMatchByName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MATCHBYNAME$12);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$14);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$14);
         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$14) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$14);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$14);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$14);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$14);
      }
   }

   public String getNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAMEU$16);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAMEU$16);
         return var2;
      }
   }

   public boolean isSetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAMEU$16) != null;
      }
   }

   public void setNameU(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAMEU$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAMEU$16);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetNameU(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAMEU$16);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAMEU$16);
         }

         var3.set(var1);
      }
   }

   public void unsetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAMEU$16);
      }
   }

   public boolean getIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAME$18);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAME$18);
         return var2;
      }
   }

   public boolean isSetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ISCUSTOMNAME$18) != null;
      }
   }

   public void setIsCustomName(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAME$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ISCUSTOMNAME$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIsCustomName(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAME$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ISCUSTOMNAME$18);
         }

         var3.set(var1);
      }
   }

   public void unsetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ISCUSTOMNAME$18);
      }
   }

   public boolean getIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAMEU$20);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAMEU$20);
         return var2;
      }
   }

   public boolean isSetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ISCUSTOMNAMEU$20) != null;
      }
   }

   public void setIsCustomNameU(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAMEU$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ISCUSTOMNAMEU$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIsCustomNameU(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAMEU$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ISCUSTOMNAMEU$20);
         }

         var3.set(var1);
      }
   }

   public void unsetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ISCUSTOMNAMEU$20);
      }
   }

   public int getIconSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ICONSIZE$22);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlUnsignedShort xgetIconSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var2 = null;
         var2 = (XmlUnsignedShort)this.get_store().find_attribute_user(ICONSIZE$22);
         return var2;
      }
   }

   public boolean isSetIconSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ICONSIZE$22) != null;
      }
   }

   public void setIconSize(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ICONSIZE$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ICONSIZE$22);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetIconSize(XmlUnsignedShort var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var3 = null;
         var3 = (XmlUnsignedShort)this.get_store().find_attribute_user(ICONSIZE$22);
         if(var3 == null) {
            var3 = (XmlUnsignedShort)this.get_store().add_attribute_user(ICONSIZE$22);
         }

         var3.set(var1);
      }
   }

   public void unsetIconSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ICONSIZE$22);
      }
   }

   public int getPatternFlags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PATTERNFLAGS$24);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlUnsignedShort xgetPatternFlags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var2 = null;
         var2 = (XmlUnsignedShort)this.get_store().find_attribute_user(PATTERNFLAGS$24);
         return var2;
      }
   }

   public boolean isSetPatternFlags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PATTERNFLAGS$24) != null;
      }
   }

   public void setPatternFlags(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PATTERNFLAGS$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PATTERNFLAGS$24);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetPatternFlags(XmlUnsignedShort var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var3 = null;
         var3 = (XmlUnsignedShort)this.get_store().find_attribute_user(PATTERNFLAGS$24);
         if(var3 == null) {
            var3 = (XmlUnsignedShort)this.get_store().add_attribute_user(PATTERNFLAGS$24);
         }

         var3.set(var1);
      }
   }

   public void unsetPatternFlags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PATTERNFLAGS$24);
      }
   }

   public String getPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PROMPT$26);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(PROMPT$26);
         return var2;
      }
   }

   public boolean isSetPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PROMPT$26) != null;
      }
   }

   public void setPrompt(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PROMPT$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PROMPT$26);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPrompt(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(PROMPT$26);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(PROMPT$26);
         }

         var3.set(var1);
      }
   }

   public void unsetPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PROMPT$26);
      }
   }

   public boolean getHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$28);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$28);
         return var2;
      }
   }

   public boolean isSetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIDDEN$28) != null;
      }
   }

   public void setHidden(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIDDEN$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHidden(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIDDEN$28);
         }

         var3.set(var1);
      }
   }

   public void unsetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIDDEN$28);
      }
   }

   public boolean getIconUpdate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ICONUPDATE$30);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIconUpdate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ICONUPDATE$30);
         return var2;
      }
   }

   public boolean isSetIconUpdate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ICONUPDATE$30) != null;
      }
   }

   public void setIconUpdate(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ICONUPDATE$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ICONUPDATE$30);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIconUpdate(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ICONUPDATE$30);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ICONUPDATE$30);
         }

         var3.set(var1);
      }
   }

   public void unsetIconUpdate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ICONUPDATE$30);
      }
   }

   public int getAlignName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALIGNNAME$32);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlUnsignedShort xgetAlignName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var2 = null;
         var2 = (XmlUnsignedShort)this.get_store().find_attribute_user(ALIGNNAME$32);
         return var2;
      }
   }

   public boolean isSetAlignName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALIGNNAME$32) != null;
      }
   }

   public void setAlignName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALIGNNAME$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALIGNNAME$32);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetAlignName(XmlUnsignedShort var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var3 = null;
         var3 = (XmlUnsignedShort)this.get_store().find_attribute_user(ALIGNNAME$32);
         if(var3 == null) {
            var3 = (XmlUnsignedShort)this.get_store().add_attribute_user(ALIGNNAME$32);
         }

         var3.set(var1);
      }
   }

   public void unsetAlignName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALIGNNAME$32);
      }
   }

   public int getMasterType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MASTERTYPE$34);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlUnsignedShort xgetMasterType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var2 = null;
         var2 = (XmlUnsignedShort)this.get_store().find_attribute_user(MASTERTYPE$34);
         return var2;
      }
   }

   public boolean isSetMasterType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MASTERTYPE$34) != null;
      }
   }

   public void setMasterType(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MASTERTYPE$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MASTERTYPE$34);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetMasterType(XmlUnsignedShort var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedShort var3 = null;
         var3 = (XmlUnsignedShort)this.get_store().find_attribute_user(MASTERTYPE$34);
         if(var3 == null) {
            var3 = (XmlUnsignedShort)this.get_store().add_attribute_user(MASTERTYPE$34);
         }

         var3.set(var1);
      }
   }

   public void unsetMasterType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MASTERTYPE$34);
      }
   }

}
