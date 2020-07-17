package com.microsoft.schemas.office.excel.impl;

import com.microsoft.schemas.office.excel.CTClientData;
import com.microsoft.schemas.office.excel.STCF;
import com.microsoft.schemas.office.excel.STCF$Enum;
import com.microsoft.schemas.office.excel.STObjectType;
import com.microsoft.schemas.office.excel.STTrueFalseBlank;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1Accel2List;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1AccelList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1AnchorList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1AutoFillList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1AutoLineList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1AutoPictList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1AutoScaleList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1CFList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1CameraList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1CancelList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1CheckedList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1ColHiddenList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1ColoredList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1ColumnList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1DDEList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1DefaultList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1DefaultSizeList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1DisabledList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1DismissList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1DropLinesList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1DropStyleList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1DxList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1FirstButtonList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1FmlaGroupList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1FmlaLinkList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1FmlaMacroList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1FmlaPictList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1FmlaRangeList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1FmlaTxbxList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1HelpList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1HorizList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1IncList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1JustLastXList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1LCTList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1ListItemList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1LockTextList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1LockedList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1MapOCXList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1MaxList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1MinList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1MoveWithCellsList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1MultiLineList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1MultiSelList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1NoThreeD2List;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1NoThreeDList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1PageList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1PrintObjectList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1RecalcAlwaysList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1RowHiddenList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1RowList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1ScriptExtendedList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1ScriptLanguageList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1ScriptLocationList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1ScriptTextList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1SecretEditList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1SelList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1SelTypeList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1SizeWithCellsList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1TextHAlignList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1TextVAlignList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1UIObjList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1VScrollList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1VTEditList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1ValList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1ValidIdsList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.1WidthMinList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2Accel2List;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2AccelList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2AnchorList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2AutoFillList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2AutoLineList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2AutoPictList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2AutoScaleList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2CFList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2CameraList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2CancelList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2CheckedList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2ColHiddenList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2ColoredList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2ColumnList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2DDEList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2DefaultList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2DefaultSizeList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2DisabledList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2DismissList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2DropLinesList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2DropStyleList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2DxList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2FirstButtonList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2FmlaGroupList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2FmlaLinkList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2FmlaMacroList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2FmlaPictList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2FmlaRangeList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2FmlaTxbxList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2HelpList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2HorizList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2IncList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2JustLastXList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2LCTList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2ListItemList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2LockTextList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2LockedList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2MapOCXList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2MaxList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2MinList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2MoveWithCellsList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2MultiLineList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2MultiSelList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2NoThreeD2List;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2NoThreeDList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2PageList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2PrintObjectList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2RecalcAlwaysList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2RowHiddenList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2RowList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2ScriptExtendedList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2ScriptLanguageList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2ScriptLocationList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2ScriptTextList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2SecretEditList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2SelList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2SelTypeList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2SizeWithCellsList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2TextHAlignList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2TextVAlignList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2UIObjList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2VScrollList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2VTEditList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2ValList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2ValidIdsList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2VisibleList;
import com.microsoft.schemas.office.excel.impl.CTClientDataImpl.2WidthMinList;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlNonNegativeInteger;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTClientDataImpl extends XmlComplexContentImpl implements CTClientData {

   private static final QName MOVEWITHCELLS$0 = new QName("urn:schemas-microsoft-com:office:excel", "MoveWithCells");
   private static final QName SIZEWITHCELLS$2 = new QName("urn:schemas-microsoft-com:office:excel", "SizeWithCells");
   private static final QName ANCHOR$4 = new QName("urn:schemas-microsoft-com:office:excel", "Anchor");
   private static final QName LOCKED$6 = new QName("urn:schemas-microsoft-com:office:excel", "Locked");
   private static final QName DEFAULTSIZE$8 = new QName("urn:schemas-microsoft-com:office:excel", "DefaultSize");
   private static final QName PRINTOBJECT$10 = new QName("urn:schemas-microsoft-com:office:excel", "PrintObject");
   private static final QName DISABLED$12 = new QName("urn:schemas-microsoft-com:office:excel", "Disabled");
   private static final QName AUTOFILL$14 = new QName("urn:schemas-microsoft-com:office:excel", "AutoFill");
   private static final QName AUTOLINE$16 = new QName("urn:schemas-microsoft-com:office:excel", "AutoLine");
   private static final QName AUTOPICT$18 = new QName("urn:schemas-microsoft-com:office:excel", "AutoPict");
   private static final QName FMLAMACRO$20 = new QName("urn:schemas-microsoft-com:office:excel", "FmlaMacro");
   private static final QName TEXTHALIGN$22 = new QName("urn:schemas-microsoft-com:office:excel", "TextHAlign");
   private static final QName TEXTVALIGN$24 = new QName("urn:schemas-microsoft-com:office:excel", "TextVAlign");
   private static final QName LOCKTEXT$26 = new QName("urn:schemas-microsoft-com:office:excel", "LockText");
   private static final QName JUSTLASTX$28 = new QName("urn:schemas-microsoft-com:office:excel", "JustLastX");
   private static final QName SECRETEDIT$30 = new QName("urn:schemas-microsoft-com:office:excel", "SecretEdit");
   private static final QName DEFAULT$32 = new QName("urn:schemas-microsoft-com:office:excel", "Default");
   private static final QName HELP$34 = new QName("urn:schemas-microsoft-com:office:excel", "Help");
   private static final QName CANCEL$36 = new QName("urn:schemas-microsoft-com:office:excel", "Cancel");
   private static final QName DISMISS$38 = new QName("urn:schemas-microsoft-com:office:excel", "Dismiss");
   private static final QName ACCEL$40 = new QName("urn:schemas-microsoft-com:office:excel", "Accel");
   private static final QName ACCEL2$42 = new QName("urn:schemas-microsoft-com:office:excel", "Accel2");
   private static final QName ROW$44 = new QName("urn:schemas-microsoft-com:office:excel", "Row");
   private static final QName COLUMN$46 = new QName("urn:schemas-microsoft-com:office:excel", "Column");
   private static final QName VISIBLE$48 = new QName("urn:schemas-microsoft-com:office:excel", "Visible");
   private static final QName ROWHIDDEN$50 = new QName("urn:schemas-microsoft-com:office:excel", "RowHidden");
   private static final QName COLHIDDEN$52 = new QName("urn:schemas-microsoft-com:office:excel", "ColHidden");
   private static final QName VTEDIT$54 = new QName("urn:schemas-microsoft-com:office:excel", "VTEdit");
   private static final QName MULTILINE$56 = new QName("urn:schemas-microsoft-com:office:excel", "MultiLine");
   private static final QName VSCROLL$58 = new QName("urn:schemas-microsoft-com:office:excel", "VScroll");
   private static final QName VALIDIDS$60 = new QName("urn:schemas-microsoft-com:office:excel", "ValidIds");
   private static final QName FMLARANGE$62 = new QName("urn:schemas-microsoft-com:office:excel", "FmlaRange");
   private static final QName WIDTHMIN$64 = new QName("urn:schemas-microsoft-com:office:excel", "WidthMin");
   private static final QName SEL$66 = new QName("urn:schemas-microsoft-com:office:excel", "Sel");
   private static final QName NOTHREED2$68 = new QName("urn:schemas-microsoft-com:office:excel", "NoThreeD2");
   private static final QName SELTYPE$70 = new QName("urn:schemas-microsoft-com:office:excel", "SelType");
   private static final QName MULTISEL$72 = new QName("urn:schemas-microsoft-com:office:excel", "MultiSel");
   private static final QName LCT$74 = new QName("urn:schemas-microsoft-com:office:excel", "LCT");
   private static final QName LISTITEM$76 = new QName("urn:schemas-microsoft-com:office:excel", "ListItem");
   private static final QName DROPSTYLE$78 = new QName("urn:schemas-microsoft-com:office:excel", "DropStyle");
   private static final QName COLORED$80 = new QName("urn:schemas-microsoft-com:office:excel", "Colored");
   private static final QName DROPLINES$82 = new QName("urn:schemas-microsoft-com:office:excel", "DropLines");
   private static final QName CHECKED$84 = new QName("urn:schemas-microsoft-com:office:excel", "Checked");
   private static final QName FMLALINK$86 = new QName("urn:schemas-microsoft-com:office:excel", "FmlaLink");
   private static final QName FMLAPICT$88 = new QName("urn:schemas-microsoft-com:office:excel", "FmlaPict");
   private static final QName NOTHREED$90 = new QName("urn:schemas-microsoft-com:office:excel", "NoThreeD");
   private static final QName FIRSTBUTTON$92 = new QName("urn:schemas-microsoft-com:office:excel", "FirstButton");
   private static final QName FMLAGROUP$94 = new QName("urn:schemas-microsoft-com:office:excel", "FmlaGroup");
   private static final QName VAL$96 = new QName("urn:schemas-microsoft-com:office:excel", "Val");
   private static final QName MIN$98 = new QName("urn:schemas-microsoft-com:office:excel", "Min");
   private static final QName MAX$100 = new QName("urn:schemas-microsoft-com:office:excel", "Max");
   private static final QName INC$102 = new QName("urn:schemas-microsoft-com:office:excel", "Inc");
   private static final QName PAGE$104 = new QName("urn:schemas-microsoft-com:office:excel", "Page");
   private static final QName HORIZ$106 = new QName("urn:schemas-microsoft-com:office:excel", "Horiz");
   private static final QName DX$108 = new QName("urn:schemas-microsoft-com:office:excel", "Dx");
   private static final QName MAPOCX$110 = new QName("urn:schemas-microsoft-com:office:excel", "MapOCX");
   private static final QName CF$112 = new QName("urn:schemas-microsoft-com:office:excel", "CF");
   private static final QName CAMERA$114 = new QName("urn:schemas-microsoft-com:office:excel", "Camera");
   private static final QName RECALCALWAYS$116 = new QName("urn:schemas-microsoft-com:office:excel", "RecalcAlways");
   private static final QName AUTOSCALE$118 = new QName("urn:schemas-microsoft-com:office:excel", "AutoScale");
   private static final QName DDE$120 = new QName("urn:schemas-microsoft-com:office:excel", "DDE");
   private static final QName UIOBJ$122 = new QName("urn:schemas-microsoft-com:office:excel", "UIObj");
   private static final QName SCRIPTTEXT$124 = new QName("urn:schemas-microsoft-com:office:excel", "ScriptText");
   private static final QName SCRIPTEXTENDED$126 = new QName("urn:schemas-microsoft-com:office:excel", "ScriptExtended");
   private static final QName SCRIPTLANGUAGE$128 = new QName("urn:schemas-microsoft-com:office:excel", "ScriptLanguage");
   private static final QName SCRIPTLOCATION$130 = new QName("urn:schemas-microsoft-com:office:excel", "ScriptLocation");
   private static final QName FMLATXBX$132 = new QName("urn:schemas-microsoft-com:office:excel", "FmlaTxbx");
   private static final QName OBJECTTYPE$134 = new QName("", "ObjectType");


   public CTClientDataImpl(SchemaType var1) {
      super(var1);
   }

   public List getMoveWithCellsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MoveWithCellsList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getMoveWithCellsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MOVEWITHCELLS$0, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getMoveWithCellsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(MOVEWITHCELLS$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetMoveWithCellsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2MoveWithCellsList(this);
      }
   }

   public STTrueFalseBlank[] xgetMoveWithCellsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MOVEWITHCELLS$0, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetMoveWithCellsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(MOVEWITHCELLS$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMoveWithCellsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVEWITHCELLS$0);
      }
   }

   public void setMoveWithCellsArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVEWITHCELLS$0);
      }
   }

   public void setMoveWithCellsArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(MOVEWITHCELLS$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetMoveWithCellsArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MOVEWITHCELLS$0);
      }
   }

   public void xsetMoveWithCellsArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(MOVEWITHCELLS$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertMoveWithCells(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(MOVEWITHCELLS$0, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addMoveWithCells(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(MOVEWITHCELLS$0);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewMoveWithCells(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(MOVEWITHCELLS$0, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewMoveWithCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(MOVEWITHCELLS$0);
         return var2;
      }
   }

   public void removeMoveWithCells(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVEWITHCELLS$0, var1);
      }
   }

   public List getSizeWithCellsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SizeWithCellsList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getSizeWithCellsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SIZEWITHCELLS$2, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getSizeWithCellsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SIZEWITHCELLS$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetSizeWithCellsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2SizeWithCellsList(this);
      }
   }

   public STTrueFalseBlank[] xgetSizeWithCellsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SIZEWITHCELLS$2, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetSizeWithCellsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(SIZEWITHCELLS$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSizeWithCellsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIZEWITHCELLS$2);
      }
   }

   public void setSizeWithCellsArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SIZEWITHCELLS$2);
      }
   }

   public void setSizeWithCellsArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(SIZEWITHCELLS$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetSizeWithCellsArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SIZEWITHCELLS$2);
      }
   }

   public void xsetSizeWithCellsArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(SIZEWITHCELLS$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertSizeWithCells(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(SIZEWITHCELLS$2, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addSizeWithCells(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(SIZEWITHCELLS$2);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewSizeWithCells(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(SIZEWITHCELLS$2, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewSizeWithCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(SIZEWITHCELLS$2);
         return var2;
      }
   }

   public void removeSizeWithCells(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIZEWITHCELLS$2, var1);
      }
   }

   public List getAnchorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AnchorList(this);
      }
   }

   public String[] getAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ANCHOR$4, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getAnchorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ANCHOR$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetAnchorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2AnchorList(this);
      }
   }

   public XmlString[] xgetAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ANCHOR$4, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetAnchorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(ANCHOR$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ANCHOR$4);
      }
   }

   public void setAnchorArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ANCHOR$4);
      }
   }

   public void setAnchorArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(ANCHOR$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetAnchorArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ANCHOR$4);
      }
   }

   public void xsetAnchorArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(ANCHOR$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertAnchor(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(ANCHOR$4, var1);
         var4.setStringValue(var2);
      }
   }

   public void addAnchor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(ANCHOR$4);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewAnchor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(ANCHOR$4, var1);
         return var3;
      }
   }

   public XmlString addNewAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(ANCHOR$4);
         return var2;
      }
   }

   public void removeAnchor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ANCHOR$4, var1);
      }
   }

   public List getLockedList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LockedList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getLockedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LOCKED$6, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getLockedArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(LOCKED$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetLockedList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2LockedList(this);
      }
   }

   public STTrueFalseBlank[] xgetLockedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LOCKED$6, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetLockedArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(LOCKED$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLockedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LOCKED$6);
      }
   }

   public void setLockedArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LOCKED$6);
      }
   }

   public void setLockedArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(LOCKED$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetLockedArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LOCKED$6);
      }
   }

   public void xsetLockedArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(LOCKED$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertLocked(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(LOCKED$6, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addLocked(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(LOCKED$6);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewLocked(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(LOCKED$6, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(LOCKED$6);
         return var2;
      }
   }

   public void removeLocked(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LOCKED$6, var1);
      }
   }

   public List getDefaultSizeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DefaultSizeList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getDefaultSizeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DEFAULTSIZE$8, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getDefaultSizeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DEFAULTSIZE$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetDefaultSizeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2DefaultSizeList(this);
      }
   }

   public STTrueFalseBlank[] xgetDefaultSizeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DEFAULTSIZE$8, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetDefaultSizeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(DEFAULTSIZE$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDefaultSizeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFAULTSIZE$8);
      }
   }

   public void setDefaultSizeArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DEFAULTSIZE$8);
      }
   }

   public void setDefaultSizeArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(DEFAULTSIZE$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetDefaultSizeArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DEFAULTSIZE$8);
      }
   }

   public void xsetDefaultSizeArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(DEFAULTSIZE$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertDefaultSize(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(DEFAULTSIZE$8, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addDefaultSize(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(DEFAULTSIZE$8);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewDefaultSize(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(DEFAULTSIZE$8, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewDefaultSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(DEFAULTSIZE$8);
         return var2;
      }
   }

   public void removeDefaultSize(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFAULTSIZE$8, var1);
      }
   }

   public List getPrintObjectList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PrintObjectList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getPrintObjectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PRINTOBJECT$10, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getPrintObjectArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(PRINTOBJECT$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetPrintObjectList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2PrintObjectList(this);
      }
   }

   public STTrueFalseBlank[] xgetPrintObjectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PRINTOBJECT$10, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetPrintObjectArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(PRINTOBJECT$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPrintObjectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRINTOBJECT$10);
      }
   }

   public void setPrintObjectArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PRINTOBJECT$10);
      }
   }

   public void setPrintObjectArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(PRINTOBJECT$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetPrintObjectArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PRINTOBJECT$10);
      }
   }

   public void xsetPrintObjectArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(PRINTOBJECT$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertPrintObject(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(PRINTOBJECT$10, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addPrintObject(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(PRINTOBJECT$10);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewPrintObject(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(PRINTOBJECT$10, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewPrintObject() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(PRINTOBJECT$10);
         return var2;
      }
   }

   public void removePrintObject(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRINTOBJECT$10, var1);
      }
   }

   public List getDisabledList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DisabledList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getDisabledArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DISABLED$12, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getDisabledArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DISABLED$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetDisabledList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2DisabledList(this);
      }
   }

   public STTrueFalseBlank[] xgetDisabledArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DISABLED$12, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetDisabledArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(DISABLED$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDisabledArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DISABLED$12);
      }
   }

   public void setDisabledArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DISABLED$12);
      }
   }

   public void setDisabledArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(DISABLED$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetDisabledArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DISABLED$12);
      }
   }

   public void xsetDisabledArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(DISABLED$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertDisabled(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(DISABLED$12, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addDisabled(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(DISABLED$12);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewDisabled(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(DISABLED$12, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewDisabled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(DISABLED$12);
         return var2;
      }
   }

   public void removeDisabled(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DISABLED$12, var1);
      }
   }

   public List getAutoFillList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AutoFillList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getAutoFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AUTOFILL$14, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getAutoFillArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(AUTOFILL$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetAutoFillList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2AutoFillList(this);
      }
   }

   public STTrueFalseBlank[] xgetAutoFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AUTOFILL$14, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetAutoFillArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(AUTOFILL$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAutoFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOFILL$14);
      }
   }

   public void setAutoFillArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AUTOFILL$14);
      }
   }

   public void setAutoFillArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(AUTOFILL$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetAutoFillArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AUTOFILL$14);
      }
   }

   public void xsetAutoFillArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(AUTOFILL$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertAutoFill(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(AUTOFILL$14, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addAutoFill(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(AUTOFILL$14);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewAutoFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(AUTOFILL$14, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewAutoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(AUTOFILL$14);
         return var2;
      }
   }

   public void removeAutoFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOFILL$14, var1);
      }
   }

   public List getAutoLineList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AutoLineList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getAutoLineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AUTOLINE$16, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getAutoLineArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(AUTOLINE$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetAutoLineList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2AutoLineList(this);
      }
   }

   public STTrueFalseBlank[] xgetAutoLineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AUTOLINE$16, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetAutoLineArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(AUTOLINE$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAutoLineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOLINE$16);
      }
   }

   public void setAutoLineArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AUTOLINE$16);
      }
   }

   public void setAutoLineArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(AUTOLINE$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetAutoLineArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AUTOLINE$16);
      }
   }

   public void xsetAutoLineArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(AUTOLINE$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertAutoLine(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(AUTOLINE$16, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addAutoLine(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(AUTOLINE$16);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewAutoLine(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(AUTOLINE$16, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewAutoLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(AUTOLINE$16);
         return var2;
      }
   }

   public void removeAutoLine(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOLINE$16, var1);
      }
   }

   public List getAutoPictList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AutoPictList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getAutoPictArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AUTOPICT$18, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getAutoPictArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(AUTOPICT$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetAutoPictList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2AutoPictList(this);
      }
   }

   public STTrueFalseBlank[] xgetAutoPictArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AUTOPICT$18, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetAutoPictArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(AUTOPICT$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAutoPictArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOPICT$18);
      }
   }

   public void setAutoPictArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AUTOPICT$18);
      }
   }

   public void setAutoPictArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(AUTOPICT$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetAutoPictArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AUTOPICT$18);
      }
   }

   public void xsetAutoPictArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(AUTOPICT$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertAutoPict(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(AUTOPICT$18, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addAutoPict(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(AUTOPICT$18);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewAutoPict(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(AUTOPICT$18, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewAutoPict() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(AUTOPICT$18);
         return var2;
      }
   }

   public void removeAutoPict(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOPICT$18, var1);
      }
   }

   public List getFmlaMacroList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FmlaMacroList(this);
      }
   }

   public String[] getFmlaMacroArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLAMACRO$20, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getFmlaMacroArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FMLAMACRO$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetFmlaMacroList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2FmlaMacroList(this);
      }
   }

   public XmlString[] xgetFmlaMacroArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLAMACRO$20, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetFmlaMacroArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(FMLAMACRO$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFmlaMacroArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FMLAMACRO$20);
      }
   }

   public void setFmlaMacroArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLAMACRO$20);
      }
   }

   public void setFmlaMacroArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(FMLAMACRO$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetFmlaMacroArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLAMACRO$20);
      }
   }

   public void xsetFmlaMacroArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(FMLAMACRO$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertFmlaMacro(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(FMLAMACRO$20, var1);
         var4.setStringValue(var2);
      }
   }

   public void addFmlaMacro(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(FMLAMACRO$20);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewFmlaMacro(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(FMLAMACRO$20, var1);
         return var3;
      }
   }

   public XmlString addNewFmlaMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(FMLAMACRO$20);
         return var2;
      }
   }

   public void removeFmlaMacro(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FMLAMACRO$20, var1);
      }
   }

   public List getTextHAlignList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TextHAlignList(this);
      }
   }

   public String[] getTextHAlignArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TEXTHALIGN$22, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getTextHAlignArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(TEXTHALIGN$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetTextHAlignList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2TextHAlignList(this);
      }
   }

   public XmlString[] xgetTextHAlignArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TEXTHALIGN$22, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetTextHAlignArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(TEXTHALIGN$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTextHAlignArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTHALIGN$22);
      }
   }

   public void setTextHAlignArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TEXTHALIGN$22);
      }
   }

   public void setTextHAlignArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(TEXTHALIGN$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetTextHAlignArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TEXTHALIGN$22);
      }
   }

   public void xsetTextHAlignArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(TEXTHALIGN$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertTextHAlign(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(TEXTHALIGN$22, var1);
         var4.setStringValue(var2);
      }
   }

   public void addTextHAlign(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(TEXTHALIGN$22);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewTextHAlign(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(TEXTHALIGN$22, var1);
         return var3;
      }
   }

   public XmlString addNewTextHAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(TEXTHALIGN$22);
         return var2;
      }
   }

   public void removeTextHAlign(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTHALIGN$22, var1);
      }
   }

   public List getTextVAlignList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TextVAlignList(this);
      }
   }

   public String[] getTextVAlignArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TEXTVALIGN$24, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getTextVAlignArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(TEXTVALIGN$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetTextVAlignList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2TextVAlignList(this);
      }
   }

   public XmlString[] xgetTextVAlignArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TEXTVALIGN$24, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetTextVAlignArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(TEXTVALIGN$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTextVAlignArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTVALIGN$24);
      }
   }

   public void setTextVAlignArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TEXTVALIGN$24);
      }
   }

   public void setTextVAlignArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(TEXTVALIGN$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetTextVAlignArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TEXTVALIGN$24);
      }
   }

   public void xsetTextVAlignArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(TEXTVALIGN$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertTextVAlign(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(TEXTVALIGN$24, var1);
         var4.setStringValue(var2);
      }
   }

   public void addTextVAlign(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(TEXTVALIGN$24);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewTextVAlign(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(TEXTVALIGN$24, var1);
         return var3;
      }
   }

   public XmlString addNewTextVAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(TEXTVALIGN$24);
         return var2;
      }
   }

   public void removeTextVAlign(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTVALIGN$24, var1);
      }
   }

   public List getLockTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LockTextList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getLockTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LOCKTEXT$26, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getLockTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(LOCKTEXT$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetLockTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2LockTextList(this);
      }
   }

   public STTrueFalseBlank[] xgetLockTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LOCKTEXT$26, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetLockTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(LOCKTEXT$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLockTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LOCKTEXT$26);
      }
   }

   public void setLockTextArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LOCKTEXT$26);
      }
   }

   public void setLockTextArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(LOCKTEXT$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetLockTextArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LOCKTEXT$26);
      }
   }

   public void xsetLockTextArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(LOCKTEXT$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertLockText(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(LOCKTEXT$26, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addLockText(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(LOCKTEXT$26);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewLockText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(LOCKTEXT$26, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewLockText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(LOCKTEXT$26);
         return var2;
      }
   }

   public void removeLockText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LOCKTEXT$26, var1);
      }
   }

   public List getJustLastXList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1JustLastXList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getJustLastXArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(JUSTLASTX$28, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getJustLastXArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(JUSTLASTX$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetJustLastXList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2JustLastXList(this);
      }
   }

   public STTrueFalseBlank[] xgetJustLastXArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(JUSTLASTX$28, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetJustLastXArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(JUSTLASTX$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfJustLastXArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(JUSTLASTX$28);
      }
   }

   public void setJustLastXArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, JUSTLASTX$28);
      }
   }

   public void setJustLastXArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(JUSTLASTX$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetJustLastXArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, JUSTLASTX$28);
      }
   }

   public void xsetJustLastXArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(JUSTLASTX$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertJustLastX(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(JUSTLASTX$28, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addJustLastX(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(JUSTLASTX$28);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewJustLastX(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(JUSTLASTX$28, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewJustLastX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(JUSTLASTX$28);
         return var2;
      }
   }

   public void removeJustLastX(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(JUSTLASTX$28, var1);
      }
   }

   public List getSecretEditList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SecretEditList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getSecretEditArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SECRETEDIT$30, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getSecretEditArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SECRETEDIT$30, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetSecretEditList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2SecretEditList(this);
      }
   }

   public STTrueFalseBlank[] xgetSecretEditArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SECRETEDIT$30, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetSecretEditArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(SECRETEDIT$30, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSecretEditArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SECRETEDIT$30);
      }
   }

   public void setSecretEditArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SECRETEDIT$30);
      }
   }

   public void setSecretEditArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(SECRETEDIT$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetSecretEditArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SECRETEDIT$30);
      }
   }

   public void xsetSecretEditArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(SECRETEDIT$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertSecretEdit(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(SECRETEDIT$30, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addSecretEdit(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(SECRETEDIT$30);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewSecretEdit(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(SECRETEDIT$30, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewSecretEdit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(SECRETEDIT$30);
         return var2;
      }
   }

   public void removeSecretEdit(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SECRETEDIT$30, var1);
      }
   }

   public List getDefaultList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DefaultList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getDefaultArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DEFAULT$32, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getDefaultArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DEFAULT$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetDefaultList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2DefaultList(this);
      }
   }

   public STTrueFalseBlank[] xgetDefaultArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DEFAULT$32, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetDefaultArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(DEFAULT$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDefaultArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFAULT$32);
      }
   }

   public void setDefaultArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DEFAULT$32);
      }
   }

   public void setDefaultArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(DEFAULT$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetDefaultArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DEFAULT$32);
      }
   }

   public void xsetDefaultArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(DEFAULT$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertDefault(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(DEFAULT$32, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addDefault(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(DEFAULT$32);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewDefault(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(DEFAULT$32, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(DEFAULT$32);
         return var2;
      }
   }

   public void removeDefault(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFAULT$32, var1);
      }
   }

   public List getHelpList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HelpList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getHelpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HELP$34, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getHelpArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(HELP$34, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetHelpList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2HelpList(this);
      }
   }

   public STTrueFalseBlank[] xgetHelpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HELP$34, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetHelpArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(HELP$34, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHelpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HELP$34);
      }
   }

   public void setHelpArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HELP$34);
      }
   }

   public void setHelpArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(HELP$34, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetHelpArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HELP$34);
      }
   }

   public void xsetHelpArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(HELP$34, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertHelp(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(HELP$34, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addHelp(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(HELP$34);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewHelp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(HELP$34, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewHelp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(HELP$34);
         return var2;
      }
   }

   public void removeHelp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HELP$34, var1);
      }
   }

   public List getCancelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CancelList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getCancelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CANCEL$36, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getCancelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(CANCEL$36, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetCancelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2CancelList(this);
      }
   }

   public STTrueFalseBlank[] xgetCancelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CANCEL$36, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetCancelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(CANCEL$36, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCancelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CANCEL$36);
      }
   }

   public void setCancelArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CANCEL$36);
      }
   }

   public void setCancelArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(CANCEL$36, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetCancelArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CANCEL$36);
      }
   }

   public void xsetCancelArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(CANCEL$36, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertCancel(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(CANCEL$36, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addCancel(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(CANCEL$36);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewCancel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(CANCEL$36, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewCancel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(CANCEL$36);
         return var2;
      }
   }

   public void removeCancel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CANCEL$36, var1);
      }
   }

   public List getDismissList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DismissList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getDismissArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DISMISS$38, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getDismissArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DISMISS$38, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetDismissList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2DismissList(this);
      }
   }

   public STTrueFalseBlank[] xgetDismissArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DISMISS$38, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetDismissArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(DISMISS$38, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDismissArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DISMISS$38);
      }
   }

   public void setDismissArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DISMISS$38);
      }
   }

   public void setDismissArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(DISMISS$38, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetDismissArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DISMISS$38);
      }
   }

   public void xsetDismissArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(DISMISS$38, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertDismiss(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(DISMISS$38, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addDismiss(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(DISMISS$38);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewDismiss(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(DISMISS$38, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewDismiss() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(DISMISS$38);
         return var2;
      }
   }

   public void removeDismiss(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DISMISS$38, var1);
      }
   }

   public List getAccelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AccelList(this);
      }
   }

   public BigInteger[] getAccelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ACCEL$40, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getAccelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ACCEL$40, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetAccelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2AccelList(this);
      }
   }

   public XmlInteger[] xgetAccelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ACCEL$40, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetAccelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(ACCEL$40, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAccelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ACCEL$40);
      }
   }

   public void setAccelArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ACCEL$40);
      }
   }

   public void setAccelArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(ACCEL$40, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetAccelArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ACCEL$40);
      }
   }

   public void xsetAccelArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(ACCEL$40, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertAccel(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(ACCEL$40, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addAccel(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(ACCEL$40);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewAccel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(ACCEL$40, var1);
         return var3;
      }
   }

   public XmlInteger addNewAccel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(ACCEL$40);
         return var2;
      }
   }

   public void removeAccel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ACCEL$40, var1);
      }
   }

   public List getAccel2List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1Accel2List(this);
      }
   }

   public BigInteger[] getAccel2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ACCEL2$42, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getAccel2Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ACCEL2$42, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetAccel2List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2Accel2List(this);
      }
   }

   public XmlInteger[] xgetAccel2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ACCEL2$42, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetAccel2Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(ACCEL2$42, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAccel2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ACCEL2$42);
      }
   }

   public void setAccel2Array(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ACCEL2$42);
      }
   }

   public void setAccel2Array(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(ACCEL2$42, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetAccel2Array(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ACCEL2$42);
      }
   }

   public void xsetAccel2Array(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(ACCEL2$42, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertAccel2(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(ACCEL2$42, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addAccel2(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(ACCEL2$42);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewAccel2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(ACCEL2$42, var1);
         return var3;
      }
   }

   public XmlInteger addNewAccel2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(ACCEL2$42);
         return var2;
      }
   }

   public void removeAccel2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ACCEL2$42, var1);
      }
   }

   public List getRowList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RowList(this);
      }
   }

   public BigInteger[] getRowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ROW$44, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getRowArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ROW$44, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetRowList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2RowList(this);
      }
   }

   public XmlInteger[] xgetRowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ROW$44, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetRowArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(ROW$44, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ROW$44);
      }
   }

   public void setRowArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ROW$44);
      }
   }

   public void setRowArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(ROW$44, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetRowArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ROW$44);
      }
   }

   public void xsetRowArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(ROW$44, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertRow(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(ROW$44, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addRow(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(ROW$44);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewRow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(ROW$44, var1);
         return var3;
      }
   }

   public XmlInteger addNewRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(ROW$44);
         return var2;
      }
   }

   public void removeRow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ROW$44, var1);
      }
   }

   public List getColumnList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ColumnList(this);
      }
   }

   public BigInteger[] getColumnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COLUMN$46, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getColumnArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(COLUMN$46, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetColumnList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ColumnList(this);
      }
   }

   public XmlInteger[] xgetColumnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COLUMN$46, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetColumnArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(COLUMN$46, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfColumnArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLUMN$46);
      }
   }

   public void setColumnArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COLUMN$46);
      }
   }

   public void setColumnArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(COLUMN$46, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetColumnArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COLUMN$46);
      }
   }

   public void xsetColumnArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(COLUMN$46, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertColumn(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(COLUMN$46, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addColumn(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(COLUMN$46);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewColumn(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(COLUMN$46, var1);
         return var3;
      }
   }

   public XmlInteger addNewColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(COLUMN$46);
         return var2;
      }
   }

   public void removeColumn(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLUMN$46, var1);
      }
   }

   public List getVisibleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class VisibleList extends AbstractList {

            public STTrueFalseBlank.Enum get(int var1) {
               return CTClientDataImpl.this.getVisibleArray(var1);
            }

            public STTrueFalseBlank.Enum set(int var1, STTrueFalseBlank.Enum var2) {
               STTrueFalseBlank.Enum var3 = CTClientDataImpl.this.getVisibleArray(var1);
               CTClientDataImpl.this.setVisibleArray(var1, var2);
               return var3;
            }

            public void add(int var1, STTrueFalseBlank.Enum var2) {
               CTClientDataImpl.this.insertVisible(var1, var2);
            }

            public STTrueFalseBlank.Enum remove(int var1) {
               STTrueFalseBlank.Enum var2 = CTClientDataImpl.this.getVisibleArray(var1);
               CTClientDataImpl.this.removeVisible(var1);
               return var2;
            }

            public int size() {
               return CTClientDataImpl.this.sizeOfVisibleArray();
            }
         }

         return new VisibleList();
      }
   }

   public STTrueFalseBlank.Enum[] getVisibleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VISIBLE$48, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getVisibleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(VISIBLE$48, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetVisibleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2VisibleList(this);
      }
   }

   public STTrueFalseBlank[] xgetVisibleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VISIBLE$48, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetVisibleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(VISIBLE$48, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfVisibleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VISIBLE$48);
      }
   }

   public void setVisibleArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VISIBLE$48);
      }
   }

   public void setVisibleArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(VISIBLE$48, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetVisibleArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VISIBLE$48);
      }
   }

   public void xsetVisibleArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(VISIBLE$48, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertVisible(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(VISIBLE$48, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addVisible(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(VISIBLE$48);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewVisible(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(VISIBLE$48, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewVisible() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(VISIBLE$48);
         return var2;
      }
   }

   public void removeVisible(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VISIBLE$48, var1);
      }
   }

   public List getRowHiddenList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RowHiddenList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getRowHiddenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ROWHIDDEN$50, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getRowHiddenArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ROWHIDDEN$50, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetRowHiddenList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2RowHiddenList(this);
      }
   }

   public STTrueFalseBlank[] xgetRowHiddenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ROWHIDDEN$50, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetRowHiddenArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(ROWHIDDEN$50, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRowHiddenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ROWHIDDEN$50);
      }
   }

   public void setRowHiddenArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ROWHIDDEN$50);
      }
   }

   public void setRowHiddenArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(ROWHIDDEN$50, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetRowHiddenArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ROWHIDDEN$50);
      }
   }

   public void xsetRowHiddenArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(ROWHIDDEN$50, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertRowHidden(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(ROWHIDDEN$50, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addRowHidden(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(ROWHIDDEN$50);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewRowHidden(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(ROWHIDDEN$50, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewRowHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(ROWHIDDEN$50);
         return var2;
      }
   }

   public void removeRowHidden(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ROWHIDDEN$50, var1);
      }
   }

   public List getColHiddenList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ColHiddenList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getColHiddenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COLHIDDEN$52, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getColHiddenArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(COLHIDDEN$52, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetColHiddenList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ColHiddenList(this);
      }
   }

   public STTrueFalseBlank[] xgetColHiddenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COLHIDDEN$52, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetColHiddenArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(COLHIDDEN$52, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfColHiddenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLHIDDEN$52);
      }
   }

   public void setColHiddenArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COLHIDDEN$52);
      }
   }

   public void setColHiddenArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(COLHIDDEN$52, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetColHiddenArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COLHIDDEN$52);
      }
   }

   public void xsetColHiddenArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(COLHIDDEN$52, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertColHidden(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(COLHIDDEN$52, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addColHidden(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(COLHIDDEN$52);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewColHidden(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(COLHIDDEN$52, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewColHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(COLHIDDEN$52);
         return var2;
      }
   }

   public void removeColHidden(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLHIDDEN$52, var1);
      }
   }

   public List getVTEditList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1VTEditList(this);
      }
   }

   public BigInteger[] getVTEditArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VTEDIT$54, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getVTEditArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(VTEDIT$54, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetVTEditList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2VTEditList(this);
      }
   }

   public XmlInteger[] xgetVTEditArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VTEDIT$54, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetVTEditArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(VTEDIT$54, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfVTEditArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VTEDIT$54);
      }
   }

   public void setVTEditArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VTEDIT$54);
      }
   }

   public void setVTEditArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(VTEDIT$54, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetVTEditArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VTEDIT$54);
      }
   }

   public void xsetVTEditArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(VTEDIT$54, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertVTEdit(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(VTEDIT$54, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addVTEdit(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(VTEDIT$54);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewVTEdit(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(VTEDIT$54, var1);
         return var3;
      }
   }

   public XmlInteger addNewVTEdit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(VTEDIT$54);
         return var2;
      }
   }

   public void removeVTEdit(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VTEDIT$54, var1);
      }
   }

   public List getMultiLineList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MultiLineList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getMultiLineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MULTILINE$56, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getMultiLineArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(MULTILINE$56, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetMultiLineList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2MultiLineList(this);
      }
   }

   public STTrueFalseBlank[] xgetMultiLineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MULTILINE$56, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetMultiLineArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(MULTILINE$56, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMultiLineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MULTILINE$56);
      }
   }

   public void setMultiLineArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MULTILINE$56);
      }
   }

   public void setMultiLineArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(MULTILINE$56, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetMultiLineArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MULTILINE$56);
      }
   }

   public void xsetMultiLineArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(MULTILINE$56, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertMultiLine(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(MULTILINE$56, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addMultiLine(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(MULTILINE$56);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewMultiLine(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(MULTILINE$56, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewMultiLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(MULTILINE$56);
         return var2;
      }
   }

   public void removeMultiLine(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MULTILINE$56, var1);
      }
   }

   public List getVScrollList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1VScrollList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getVScrollArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VSCROLL$58, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getVScrollArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(VSCROLL$58, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetVScrollList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2VScrollList(this);
      }
   }

   public STTrueFalseBlank[] xgetVScrollArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VSCROLL$58, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetVScrollArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(VSCROLL$58, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfVScrollArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VSCROLL$58);
      }
   }

   public void setVScrollArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VSCROLL$58);
      }
   }

   public void setVScrollArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(VSCROLL$58, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetVScrollArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VSCROLL$58);
      }
   }

   public void xsetVScrollArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(VSCROLL$58, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertVScroll(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(VSCROLL$58, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addVScroll(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(VSCROLL$58);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewVScroll(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(VSCROLL$58, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewVScroll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(VSCROLL$58);
         return var2;
      }
   }

   public void removeVScroll(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VSCROLL$58, var1);
      }
   }

   public List getValidIdsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ValidIdsList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getValidIdsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VALIDIDS$60, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getValidIdsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(VALIDIDS$60, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetValidIdsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ValidIdsList(this);
      }
   }

   public STTrueFalseBlank[] xgetValidIdsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VALIDIDS$60, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetValidIdsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(VALIDIDS$60, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfValidIdsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VALIDIDS$60);
      }
   }

   public void setValidIdsArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VALIDIDS$60);
      }
   }

   public void setValidIdsArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(VALIDIDS$60, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetValidIdsArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VALIDIDS$60);
      }
   }

   public void xsetValidIdsArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(VALIDIDS$60, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertValidIds(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(VALIDIDS$60, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addValidIds(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(VALIDIDS$60);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewValidIds(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(VALIDIDS$60, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewValidIds() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(VALIDIDS$60);
         return var2;
      }
   }

   public void removeValidIds(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VALIDIDS$60, var1);
      }
   }

   public List getFmlaRangeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FmlaRangeList(this);
      }
   }

   public String[] getFmlaRangeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLARANGE$62, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getFmlaRangeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FMLARANGE$62, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetFmlaRangeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2FmlaRangeList(this);
      }
   }

   public XmlString[] xgetFmlaRangeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLARANGE$62, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetFmlaRangeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(FMLARANGE$62, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFmlaRangeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FMLARANGE$62);
      }
   }

   public void setFmlaRangeArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLARANGE$62);
      }
   }

   public void setFmlaRangeArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(FMLARANGE$62, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetFmlaRangeArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLARANGE$62);
      }
   }

   public void xsetFmlaRangeArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(FMLARANGE$62, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertFmlaRange(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(FMLARANGE$62, var1);
         var4.setStringValue(var2);
      }
   }

   public void addFmlaRange(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(FMLARANGE$62);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewFmlaRange(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(FMLARANGE$62, var1);
         return var3;
      }
   }

   public XmlString addNewFmlaRange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(FMLARANGE$62);
         return var2;
      }
   }

   public void removeFmlaRange(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FMLARANGE$62, var1);
      }
   }

   public List getWidthMinList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1WidthMinList(this);
      }
   }

   public BigInteger[] getWidthMinArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(WIDTHMIN$64, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getWidthMinArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(WIDTHMIN$64, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetWidthMinList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2WidthMinList(this);
      }
   }

   public XmlInteger[] xgetWidthMinArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(WIDTHMIN$64, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetWidthMinArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(WIDTHMIN$64, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfWidthMinArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WIDTHMIN$64);
      }
   }

   public void setWidthMinArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, WIDTHMIN$64);
      }
   }

   public void setWidthMinArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(WIDTHMIN$64, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetWidthMinArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, WIDTHMIN$64);
      }
   }

   public void xsetWidthMinArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(WIDTHMIN$64, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertWidthMin(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(WIDTHMIN$64, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addWidthMin(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(WIDTHMIN$64);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewWidthMin(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(WIDTHMIN$64, var1);
         return var3;
      }
   }

   public XmlInteger addNewWidthMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(WIDTHMIN$64);
         return var2;
      }
   }

   public void removeWidthMin(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WIDTHMIN$64, var1);
      }
   }

   public List getSelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SelList(this);
      }
   }

   public BigInteger[] getSelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SEL$66, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getSelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SEL$66, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetSelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2SelList(this);
      }
   }

   public XmlInteger[] xgetSelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SEL$66, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetSelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(SEL$66, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SEL$66);
      }
   }

   public void setSelArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SEL$66);
      }
   }

   public void setSelArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(SEL$66, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetSelArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SEL$66);
      }
   }

   public void xsetSelArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(SEL$66, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertSel(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(SEL$66, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addSel(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(SEL$66);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewSel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(SEL$66, var1);
         return var3;
      }
   }

   public XmlInteger addNewSel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(SEL$66);
         return var2;
      }
   }

   public void removeSel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SEL$66, var1);
      }
   }

   public List getNoThreeD2List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1NoThreeD2List(this);
      }
   }

   public STTrueFalseBlank.Enum[] getNoThreeD2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NOTHREED2$68, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getNoThreeD2Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(NOTHREED2$68, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetNoThreeD2List() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2NoThreeD2List(this);
      }
   }

   public STTrueFalseBlank[] xgetNoThreeD2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NOTHREED2$68, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetNoThreeD2Array(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(NOTHREED2$68, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfNoThreeD2Array() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOTHREED2$68);
      }
   }

   public void setNoThreeD2Array(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NOTHREED2$68);
      }
   }

   public void setNoThreeD2Array(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(NOTHREED2$68, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetNoThreeD2Array(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NOTHREED2$68);
      }
   }

   public void xsetNoThreeD2Array(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(NOTHREED2$68, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertNoThreeD2(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(NOTHREED2$68, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addNoThreeD2(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(NOTHREED2$68);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewNoThreeD2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(NOTHREED2$68, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewNoThreeD2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(NOTHREED2$68);
         return var2;
      }
   }

   public void removeNoThreeD2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOTHREED2$68, var1);
      }
   }

   public List getSelTypeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SelTypeList(this);
      }
   }

   public String[] getSelTypeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SELTYPE$70, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getSelTypeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SELTYPE$70, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetSelTypeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2SelTypeList(this);
      }
   }

   public XmlString[] xgetSelTypeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SELTYPE$70, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetSelTypeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(SELTYPE$70, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSelTypeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SELTYPE$70);
      }
   }

   public void setSelTypeArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SELTYPE$70);
      }
   }

   public void setSelTypeArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(SELTYPE$70, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetSelTypeArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SELTYPE$70);
      }
   }

   public void xsetSelTypeArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(SELTYPE$70, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertSelType(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(SELTYPE$70, var1);
         var4.setStringValue(var2);
      }
   }

   public void addSelType(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(SELTYPE$70);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewSelType(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(SELTYPE$70, var1);
         return var3;
      }
   }

   public XmlString addNewSelType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(SELTYPE$70);
         return var2;
      }
   }

   public void removeSelType(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SELTYPE$70, var1);
      }
   }

   public List getMultiSelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MultiSelList(this);
      }
   }

   public String[] getMultiSelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MULTISEL$72, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getMultiSelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(MULTISEL$72, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetMultiSelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2MultiSelList(this);
      }
   }

   public XmlString[] xgetMultiSelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MULTISEL$72, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetMultiSelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(MULTISEL$72, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMultiSelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MULTISEL$72);
      }
   }

   public void setMultiSelArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MULTISEL$72);
      }
   }

   public void setMultiSelArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(MULTISEL$72, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetMultiSelArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MULTISEL$72);
      }
   }

   public void xsetMultiSelArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(MULTISEL$72, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertMultiSel(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(MULTISEL$72, var1);
         var4.setStringValue(var2);
      }
   }

   public void addMultiSel(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(MULTISEL$72);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewMultiSel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(MULTISEL$72, var1);
         return var3;
      }
   }

   public XmlString addNewMultiSel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(MULTISEL$72);
         return var2;
      }
   }

   public void removeMultiSel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MULTISEL$72, var1);
      }
   }

   public List getLCTList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LCTList(this);
      }
   }

   public String[] getLCTArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LCT$74, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getLCTArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(LCT$74, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetLCTList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2LCTList(this);
      }
   }

   public XmlString[] xgetLCTArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LCT$74, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetLCTArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(LCT$74, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLCTArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LCT$74);
      }
   }

   public void setLCTArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LCT$74);
      }
   }

   public void setLCTArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(LCT$74, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetLCTArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LCT$74);
      }
   }

   public void xsetLCTArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(LCT$74, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertLCT(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(LCT$74, var1);
         var4.setStringValue(var2);
      }
   }

   public void addLCT(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(LCT$74);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewLCT(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(LCT$74, var1);
         return var3;
      }
   }

   public XmlString addNewLCT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(LCT$74);
         return var2;
      }
   }

   public void removeLCT(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LCT$74, var1);
      }
   }

   public List getListItemList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ListItemList(this);
      }
   }

   public String[] getListItemArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LISTITEM$76, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getListItemArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(LISTITEM$76, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetListItemList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ListItemList(this);
      }
   }

   public XmlString[] xgetListItemArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LISTITEM$76, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetListItemArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(LISTITEM$76, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfListItemArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LISTITEM$76);
      }
   }

   public void setListItemArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LISTITEM$76);
      }
   }

   public void setListItemArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(LISTITEM$76, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetListItemArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LISTITEM$76);
      }
   }

   public void xsetListItemArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(LISTITEM$76, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertListItem(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(LISTITEM$76, var1);
         var4.setStringValue(var2);
      }
   }

   public void addListItem(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(LISTITEM$76);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewListItem(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(LISTITEM$76, var1);
         return var3;
      }
   }

   public XmlString addNewListItem() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(LISTITEM$76);
         return var2;
      }
   }

   public void removeListItem(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LISTITEM$76, var1);
      }
   }

   public List getDropStyleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DropStyleList(this);
      }
   }

   public String[] getDropStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DROPSTYLE$78, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getDropStyleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DROPSTYLE$78, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetDropStyleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2DropStyleList(this);
      }
   }

   public XmlString[] xgetDropStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DROPSTYLE$78, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetDropStyleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(DROPSTYLE$78, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDropStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DROPSTYLE$78);
      }
   }

   public void setDropStyleArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DROPSTYLE$78);
      }
   }

   public void setDropStyleArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(DROPSTYLE$78, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetDropStyleArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DROPSTYLE$78);
      }
   }

   public void xsetDropStyleArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(DROPSTYLE$78, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertDropStyle(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(DROPSTYLE$78, var1);
         var4.setStringValue(var2);
      }
   }

   public void addDropStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(DROPSTYLE$78);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewDropStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(DROPSTYLE$78, var1);
         return var3;
      }
   }

   public XmlString addNewDropStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(DROPSTYLE$78);
         return var2;
      }
   }

   public void removeDropStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DROPSTYLE$78, var1);
      }
   }

   public List getColoredList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ColoredList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getColoredArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COLORED$80, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getColoredArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(COLORED$80, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetColoredList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ColoredList(this);
      }
   }

   public STTrueFalseBlank[] xgetColoredArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COLORED$80, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetColoredArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(COLORED$80, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfColoredArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLORED$80);
      }
   }

   public void setColoredArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COLORED$80);
      }
   }

   public void setColoredArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(COLORED$80, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetColoredArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COLORED$80);
      }
   }

   public void xsetColoredArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(COLORED$80, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertColored(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(COLORED$80, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addColored(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(COLORED$80);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewColored(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(COLORED$80, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewColored() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(COLORED$80);
         return var2;
      }
   }

   public void removeColored(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLORED$80, var1);
      }
   }

   public List getDropLinesList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DropLinesList(this);
      }
   }

   public BigInteger[] getDropLinesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DROPLINES$82, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getDropLinesArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DROPLINES$82, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetDropLinesList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2DropLinesList(this);
      }
   }

   public XmlInteger[] xgetDropLinesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DROPLINES$82, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetDropLinesArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(DROPLINES$82, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDropLinesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DROPLINES$82);
      }
   }

   public void setDropLinesArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DROPLINES$82);
      }
   }

   public void setDropLinesArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(DROPLINES$82, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetDropLinesArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DROPLINES$82);
      }
   }

   public void xsetDropLinesArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(DROPLINES$82, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertDropLines(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(DROPLINES$82, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addDropLines(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(DROPLINES$82);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewDropLines(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(DROPLINES$82, var1);
         return var3;
      }
   }

   public XmlInteger addNewDropLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(DROPLINES$82);
         return var2;
      }
   }

   public void removeDropLines(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DROPLINES$82, var1);
      }
   }

   public List getCheckedList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CheckedList(this);
      }
   }

   public BigInteger[] getCheckedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CHECKED$84, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getCheckedArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(CHECKED$84, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetCheckedList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2CheckedList(this);
      }
   }

   public XmlInteger[] xgetCheckedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CHECKED$84, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetCheckedArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(CHECKED$84, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCheckedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CHECKED$84);
      }
   }

   public void setCheckedArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CHECKED$84);
      }
   }

   public void setCheckedArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(CHECKED$84, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetCheckedArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CHECKED$84);
      }
   }

   public void xsetCheckedArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(CHECKED$84, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertChecked(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(CHECKED$84, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addChecked(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(CHECKED$84);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewChecked(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(CHECKED$84, var1);
         return var3;
      }
   }

   public XmlInteger addNewChecked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(CHECKED$84);
         return var2;
      }
   }

   public void removeChecked(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CHECKED$84, var1);
      }
   }

   public List getFmlaLinkList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FmlaLinkList(this);
      }
   }

   public String[] getFmlaLinkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLALINK$86, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getFmlaLinkArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FMLALINK$86, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetFmlaLinkList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2FmlaLinkList(this);
      }
   }

   public XmlString[] xgetFmlaLinkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLALINK$86, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetFmlaLinkArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(FMLALINK$86, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFmlaLinkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FMLALINK$86);
      }
   }

   public void setFmlaLinkArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLALINK$86);
      }
   }

   public void setFmlaLinkArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(FMLALINK$86, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetFmlaLinkArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLALINK$86);
      }
   }

   public void xsetFmlaLinkArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(FMLALINK$86, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertFmlaLink(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(FMLALINK$86, var1);
         var4.setStringValue(var2);
      }
   }

   public void addFmlaLink(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(FMLALINK$86);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewFmlaLink(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(FMLALINK$86, var1);
         return var3;
      }
   }

   public XmlString addNewFmlaLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(FMLALINK$86);
         return var2;
      }
   }

   public void removeFmlaLink(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FMLALINK$86, var1);
      }
   }

   public List getFmlaPictList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FmlaPictList(this);
      }
   }

   public String[] getFmlaPictArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLAPICT$88, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getFmlaPictArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FMLAPICT$88, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetFmlaPictList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2FmlaPictList(this);
      }
   }

   public XmlString[] xgetFmlaPictArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLAPICT$88, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetFmlaPictArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(FMLAPICT$88, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFmlaPictArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FMLAPICT$88);
      }
   }

   public void setFmlaPictArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLAPICT$88);
      }
   }

   public void setFmlaPictArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(FMLAPICT$88, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetFmlaPictArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLAPICT$88);
      }
   }

   public void xsetFmlaPictArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(FMLAPICT$88, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertFmlaPict(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(FMLAPICT$88, var1);
         var4.setStringValue(var2);
      }
   }

   public void addFmlaPict(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(FMLAPICT$88);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewFmlaPict(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(FMLAPICT$88, var1);
         return var3;
      }
   }

   public XmlString addNewFmlaPict() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(FMLAPICT$88);
         return var2;
      }
   }

   public void removeFmlaPict(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FMLAPICT$88, var1);
      }
   }

   public List getNoThreeDList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1NoThreeDList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getNoThreeDArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NOTHREED$90, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getNoThreeDArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(NOTHREED$90, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetNoThreeDList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2NoThreeDList(this);
      }
   }

   public STTrueFalseBlank[] xgetNoThreeDArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NOTHREED$90, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetNoThreeDArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(NOTHREED$90, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfNoThreeDArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOTHREED$90);
      }
   }

   public void setNoThreeDArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NOTHREED$90);
      }
   }

   public void setNoThreeDArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(NOTHREED$90, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetNoThreeDArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NOTHREED$90);
      }
   }

   public void xsetNoThreeDArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(NOTHREED$90, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertNoThreeD(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(NOTHREED$90, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addNoThreeD(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(NOTHREED$90);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewNoThreeD(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(NOTHREED$90, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewNoThreeD() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(NOTHREED$90);
         return var2;
      }
   }

   public void removeNoThreeD(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOTHREED$90, var1);
      }
   }

   public List getFirstButtonList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FirstButtonList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getFirstButtonArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FIRSTBUTTON$92, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getFirstButtonArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FIRSTBUTTON$92, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetFirstButtonList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2FirstButtonList(this);
      }
   }

   public STTrueFalseBlank[] xgetFirstButtonArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FIRSTBUTTON$92, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetFirstButtonArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(FIRSTBUTTON$92, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFirstButtonArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FIRSTBUTTON$92);
      }
   }

   public void setFirstButtonArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FIRSTBUTTON$92);
      }
   }

   public void setFirstButtonArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(FIRSTBUTTON$92, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetFirstButtonArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FIRSTBUTTON$92);
      }
   }

   public void xsetFirstButtonArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(FIRSTBUTTON$92, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertFirstButton(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(FIRSTBUTTON$92, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addFirstButton(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(FIRSTBUTTON$92);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewFirstButton(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(FIRSTBUTTON$92, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewFirstButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(FIRSTBUTTON$92);
         return var2;
      }
   }

   public void removeFirstButton(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FIRSTBUTTON$92, var1);
      }
   }

   public List getFmlaGroupList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FmlaGroupList(this);
      }
   }

   public String[] getFmlaGroupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLAGROUP$94, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getFmlaGroupArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FMLAGROUP$94, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetFmlaGroupList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2FmlaGroupList(this);
      }
   }

   public XmlString[] xgetFmlaGroupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLAGROUP$94, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetFmlaGroupArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(FMLAGROUP$94, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFmlaGroupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FMLAGROUP$94);
      }
   }

   public void setFmlaGroupArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLAGROUP$94);
      }
   }

   public void setFmlaGroupArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(FMLAGROUP$94, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetFmlaGroupArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLAGROUP$94);
      }
   }

   public void xsetFmlaGroupArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(FMLAGROUP$94, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertFmlaGroup(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(FMLAGROUP$94, var1);
         var4.setStringValue(var2);
      }
   }

   public void addFmlaGroup(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(FMLAGROUP$94);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewFmlaGroup(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(FMLAGROUP$94, var1);
         return var3;
      }
   }

   public XmlString addNewFmlaGroup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(FMLAGROUP$94);
         return var2;
      }
   }

   public void removeFmlaGroup(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FMLAGROUP$94, var1);
      }
   }

   public List getValList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ValList(this);
      }
   }

   public BigInteger[] getValArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VAL$96, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getValArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(VAL$96, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetValList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ValList(this);
      }
   }

   public XmlInteger[] xgetValArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VAL$96, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetValArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(VAL$96, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfValArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VAL$96);
      }
   }

   public void setValArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VAL$96);
      }
   }

   public void setValArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(VAL$96, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetValArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VAL$96);
      }
   }

   public void xsetValArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(VAL$96, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertVal(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(VAL$96, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addVal(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(VAL$96);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewVal(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(VAL$96, var1);
         return var3;
      }
   }

   public XmlInteger addNewVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(VAL$96);
         return var2;
      }
   }

   public void removeVal(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VAL$96, var1);
      }
   }

   public List getMinList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MinList(this);
      }
   }

   public BigInteger[] getMinArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MIN$98, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getMinArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(MIN$98, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetMinList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2MinList(this);
      }
   }

   public XmlInteger[] xgetMinArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MIN$98, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetMinArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(MIN$98, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMinArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MIN$98);
      }
   }

   public void setMinArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MIN$98);
      }
   }

   public void setMinArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(MIN$98, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetMinArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MIN$98);
      }
   }

   public void xsetMinArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(MIN$98, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertMin(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(MIN$98, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addMin(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(MIN$98);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewMin(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(MIN$98, var1);
         return var3;
      }
   }

   public XmlInteger addNewMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(MIN$98);
         return var2;
      }
   }

   public void removeMin(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MIN$98, var1);
      }
   }

   public List getMaxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MaxList(this);
      }
   }

   public BigInteger[] getMaxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MAX$100, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getMaxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(MAX$100, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetMaxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2MaxList(this);
      }
   }

   public XmlInteger[] xgetMaxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MAX$100, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetMaxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(MAX$100, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMaxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MAX$100);
      }
   }

   public void setMaxArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MAX$100);
      }
   }

   public void setMaxArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(MAX$100, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetMaxArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MAX$100);
      }
   }

   public void xsetMaxArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(MAX$100, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertMax(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(MAX$100, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addMax(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(MAX$100);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewMax(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(MAX$100, var1);
         return var3;
      }
   }

   public XmlInteger addNewMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(MAX$100);
         return var2;
      }
   }

   public void removeMax(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MAX$100, var1);
      }
   }

   public List getIncList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1IncList(this);
      }
   }

   public BigInteger[] getIncArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(INC$102, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getIncArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(INC$102, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetIncList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2IncList(this);
      }
   }

   public XmlInteger[] xgetIncArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(INC$102, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetIncArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(INC$102, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfIncArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INC$102);
      }
   }

   public void setIncArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, INC$102);
      }
   }

   public void setIncArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(INC$102, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetIncArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, INC$102);
      }
   }

   public void xsetIncArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(INC$102, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertInc(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(INC$102, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addInc(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(INC$102);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewInc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(INC$102, var1);
         return var3;
      }
   }

   public XmlInteger addNewInc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(INC$102);
         return var2;
      }
   }

   public void removeInc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INC$102, var1);
      }
   }

   public List getPageList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PageList(this);
      }
   }

   public BigInteger[] getPageArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PAGE$104, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getPageArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(PAGE$104, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetPageList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2PageList(this);
      }
   }

   public XmlInteger[] xgetPageArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PAGE$104, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetPageArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(PAGE$104, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPageArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGE$104);
      }
   }

   public void setPageArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PAGE$104);
      }
   }

   public void setPageArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(PAGE$104, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetPageArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PAGE$104);
      }
   }

   public void xsetPageArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(PAGE$104, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertPage(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(PAGE$104, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addPage(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(PAGE$104);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewPage(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(PAGE$104, var1);
         return var3;
      }
   }

   public XmlInteger addNewPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(PAGE$104);
         return var2;
      }
   }

   public void removePage(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGE$104, var1);
      }
   }

   public List getHorizList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HorizList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getHorizArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HORIZ$106, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getHorizArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(HORIZ$106, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetHorizList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2HorizList(this);
      }
   }

   public STTrueFalseBlank[] xgetHorizArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HORIZ$106, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetHorizArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(HORIZ$106, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHorizArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HORIZ$106);
      }
   }

   public void setHorizArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HORIZ$106);
      }
   }

   public void setHorizArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(HORIZ$106, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetHorizArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HORIZ$106);
      }
   }

   public void xsetHorizArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(HORIZ$106, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertHoriz(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(HORIZ$106, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addHoriz(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(HORIZ$106);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewHoriz(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(HORIZ$106, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewHoriz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(HORIZ$106);
         return var2;
      }
   }

   public void removeHoriz(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HORIZ$106, var1);
      }
   }

   public List getDxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DxList(this);
      }
   }

   public BigInteger[] getDxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DX$108, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getDxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DX$108, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetDxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2DxList(this);
      }
   }

   public XmlInteger[] xgetDxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DX$108, var2);
         XmlInteger[] var3 = new XmlInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlInteger xgetDxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_element_user(DX$108, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DX$108);
      }
   }

   public void setDxArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DX$108);
      }
   }

   public void setDxArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(DX$108, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetDxArray(XmlInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DX$108);
      }
   }

   public void xsetDxArray(int var1, XmlInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var4 = null;
         var4 = (XmlInteger)this.get_store().find_element_user(DX$108, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertDx(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(DX$108, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addDx(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(DX$108);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlInteger insertNewDx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().insert_element_user(DX$108, var1);
         return var3;
      }
   }

   public XmlInteger addNewDx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().add_element_user(DX$108);
         return var2;
      }
   }

   public void removeDx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DX$108, var1);
      }
   }

   public List getMapOCXList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MapOCXList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getMapOCXArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MAPOCX$110, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getMapOCXArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(MAPOCX$110, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetMapOCXList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2MapOCXList(this);
      }
   }

   public STTrueFalseBlank[] xgetMapOCXArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MAPOCX$110, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetMapOCXArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(MAPOCX$110, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMapOCXArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MAPOCX$110);
      }
   }

   public void setMapOCXArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MAPOCX$110);
      }
   }

   public void setMapOCXArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(MAPOCX$110, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetMapOCXArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MAPOCX$110);
      }
   }

   public void xsetMapOCXArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(MAPOCX$110, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertMapOCX(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(MAPOCX$110, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addMapOCX(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(MAPOCX$110);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewMapOCX(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(MAPOCX$110, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewMapOCX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(MAPOCX$110);
         return var2;
      }
   }

   public void removeMapOCX(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MAPOCX$110, var1);
      }
   }

   public List getCFList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CFList(this);
      }
   }

   public STCF$Enum[] getCFArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CF$112, var2);
         STCF$Enum[] var3 = new STCF$Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STCF$Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STCF$Enum getCFArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(CF$112, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STCF$Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetCFList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2CFList(this);
      }
   }

   public STCF[] xgetCFArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CF$112, var2);
         STCF[] var3 = new STCF[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STCF xgetCFArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCF var3 = null;
         var3 = (STCF)this.get_store().find_element_user(CF$112, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCFArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CF$112);
      }
   }

   public void setCFArray(STCF$Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CF$112);
      }
   }

   public void setCFArray(int var1, STCF$Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(CF$112, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetCFArray(STCF[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CF$112);
      }
   }

   public void xsetCFArray(int var1, STCF var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCF var4 = null;
         var4 = (STCF)this.get_store().find_element_user(CF$112, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertCF(int var1, STCF$Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(CF$112, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addCF(STCF$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(CF$112);
         var3.setEnumValue(var1);
      }
   }

   public STCF insertNewCF(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCF var3 = null;
         var3 = (STCF)this.get_store().insert_element_user(CF$112, var1);
         return var3;
      }
   }

   public STCF addNewCF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCF var2 = null;
         var2 = (STCF)this.get_store().add_element_user(CF$112);
         return var2;
      }
   }

   public void removeCF(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CF$112, var1);
      }
   }

   public List getCameraList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CameraList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getCameraArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CAMERA$114, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getCameraArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(CAMERA$114, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetCameraList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2CameraList(this);
      }
   }

   public STTrueFalseBlank[] xgetCameraArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CAMERA$114, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetCameraArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(CAMERA$114, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCameraArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CAMERA$114);
      }
   }

   public void setCameraArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CAMERA$114);
      }
   }

   public void setCameraArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(CAMERA$114, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetCameraArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CAMERA$114);
      }
   }

   public void xsetCameraArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(CAMERA$114, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertCamera(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(CAMERA$114, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addCamera(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(CAMERA$114);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewCamera(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(CAMERA$114, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewCamera() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(CAMERA$114);
         return var2;
      }
   }

   public void removeCamera(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CAMERA$114, var1);
      }
   }

   public List getRecalcAlwaysList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RecalcAlwaysList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getRecalcAlwaysArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RECALCALWAYS$116, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getRecalcAlwaysArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(RECALCALWAYS$116, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetRecalcAlwaysList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2RecalcAlwaysList(this);
      }
   }

   public STTrueFalseBlank[] xgetRecalcAlwaysArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RECALCALWAYS$116, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetRecalcAlwaysArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(RECALCALWAYS$116, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRecalcAlwaysArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RECALCALWAYS$116);
      }
   }

   public void setRecalcAlwaysArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RECALCALWAYS$116);
      }
   }

   public void setRecalcAlwaysArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(RECALCALWAYS$116, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetRecalcAlwaysArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RECALCALWAYS$116);
      }
   }

   public void xsetRecalcAlwaysArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(RECALCALWAYS$116, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertRecalcAlways(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(RECALCALWAYS$116, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addRecalcAlways(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(RECALCALWAYS$116);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewRecalcAlways(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(RECALCALWAYS$116, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewRecalcAlways() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(RECALCALWAYS$116);
         return var2;
      }
   }

   public void removeRecalcAlways(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RECALCALWAYS$116, var1);
      }
   }

   public List getAutoScaleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AutoScaleList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getAutoScaleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AUTOSCALE$118, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getAutoScaleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(AUTOSCALE$118, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetAutoScaleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2AutoScaleList(this);
      }
   }

   public STTrueFalseBlank[] xgetAutoScaleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AUTOSCALE$118, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetAutoScaleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(AUTOSCALE$118, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAutoScaleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOSCALE$118);
      }
   }

   public void setAutoScaleArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AUTOSCALE$118);
      }
   }

   public void setAutoScaleArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(AUTOSCALE$118, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetAutoScaleArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AUTOSCALE$118);
      }
   }

   public void xsetAutoScaleArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(AUTOSCALE$118, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertAutoScale(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(AUTOSCALE$118, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addAutoScale(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(AUTOSCALE$118);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewAutoScale(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(AUTOSCALE$118, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewAutoScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(AUTOSCALE$118);
         return var2;
      }
   }

   public void removeAutoScale(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOSCALE$118, var1);
      }
   }

   public List getDDEList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DDEList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getDDEArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DDE$120, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getDDEArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DDE$120, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetDDEList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2DDEList(this);
      }
   }

   public STTrueFalseBlank[] xgetDDEArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DDE$120, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetDDEArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(DDE$120, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDDEArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DDE$120);
      }
   }

   public void setDDEArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DDE$120);
      }
   }

   public void setDDEArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(DDE$120, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetDDEArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DDE$120);
      }
   }

   public void xsetDDEArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(DDE$120, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertDDE(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(DDE$120, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addDDE(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(DDE$120);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewDDE(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(DDE$120, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewDDE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(DDE$120);
         return var2;
      }
   }

   public void removeDDE(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DDE$120, var1);
      }
   }

   public List getUIObjList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1UIObjList(this);
      }
   }

   public STTrueFalseBlank.Enum[] getUIObjArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(UIOBJ$122, var2);
         STTrueFalseBlank.Enum[] var3 = new STTrueFalseBlank.Enum[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = (STTrueFalseBlank.Enum)((SimpleValue)var2.get(var4)).getEnumValue();
         }

         return var3;
      }
   }

   public STTrueFalseBlank.Enum getUIObjArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(UIOBJ$122, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return (STTrueFalseBlank.Enum)var3.getEnumValue();
         }
      }
   }

   public List xgetUIObjList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2UIObjList(this);
      }
   }

   public STTrueFalseBlank[] xgetUIObjArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(UIOBJ$122, var2);
         STTrueFalseBlank[] var3 = new STTrueFalseBlank[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STTrueFalseBlank xgetUIObjArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_element_user(UIOBJ$122, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfUIObjArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UIOBJ$122);
      }
   }

   public void setUIObjArray(STTrueFalseBlank.Enum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, UIOBJ$122);
      }
   }

   public void setUIObjArray(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(UIOBJ$122, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setEnumValue(var2);
         }
      }
   }

   public void xsetUIObjArray(STTrueFalseBlank[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, UIOBJ$122);
      }
   }

   public void xsetUIObjArray(int var1, STTrueFalseBlank var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var4 = null;
         var4 = (STTrueFalseBlank)this.get_store().find_element_user(UIOBJ$122, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertUIObj(int var1, STTrueFalseBlank.Enum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(UIOBJ$122, var1);
         var4.setEnumValue(var2);
      }
   }

   public void addUIObj(STTrueFalseBlank.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(UIOBJ$122);
         var3.setEnumValue(var1);
      }
   }

   public STTrueFalseBlank insertNewUIObj(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().insert_element_user(UIOBJ$122, var1);
         return var3;
      }
   }

   public STTrueFalseBlank addNewUIObj() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().add_element_user(UIOBJ$122);
         return var2;
      }
   }

   public void removeUIObj(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UIOBJ$122, var1);
      }
   }

   public List getScriptTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ScriptTextList(this);
      }
   }

   public String[] getScriptTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCRIPTTEXT$124, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getScriptTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SCRIPTTEXT$124, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetScriptTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ScriptTextList(this);
      }
   }

   public XmlString[] xgetScriptTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCRIPTTEXT$124, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetScriptTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(SCRIPTTEXT$124, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfScriptTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCRIPTTEXT$124);
      }
   }

   public void setScriptTextArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCRIPTTEXT$124);
      }
   }

   public void setScriptTextArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(SCRIPTTEXT$124, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetScriptTextArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCRIPTTEXT$124);
      }
   }

   public void xsetScriptTextArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(SCRIPTTEXT$124, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertScriptText(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(SCRIPTTEXT$124, var1);
         var4.setStringValue(var2);
      }
   }

   public void addScriptText(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(SCRIPTTEXT$124);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewScriptText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(SCRIPTTEXT$124, var1);
         return var3;
      }
   }

   public XmlString addNewScriptText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(SCRIPTTEXT$124);
         return var2;
      }
   }

   public void removeScriptText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCRIPTTEXT$124, var1);
      }
   }

   public List getScriptExtendedList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ScriptExtendedList(this);
      }
   }

   public String[] getScriptExtendedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCRIPTEXTENDED$126, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getScriptExtendedArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SCRIPTEXTENDED$126, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetScriptExtendedList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ScriptExtendedList(this);
      }
   }

   public XmlString[] xgetScriptExtendedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCRIPTEXTENDED$126, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetScriptExtendedArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(SCRIPTEXTENDED$126, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfScriptExtendedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCRIPTEXTENDED$126);
      }
   }

   public void setScriptExtendedArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCRIPTEXTENDED$126);
      }
   }

   public void setScriptExtendedArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(SCRIPTEXTENDED$126, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetScriptExtendedArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCRIPTEXTENDED$126);
      }
   }

   public void xsetScriptExtendedArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(SCRIPTEXTENDED$126, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertScriptExtended(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(SCRIPTEXTENDED$126, var1);
         var4.setStringValue(var2);
      }
   }

   public void addScriptExtended(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(SCRIPTEXTENDED$126);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewScriptExtended(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(SCRIPTEXTENDED$126, var1);
         return var3;
      }
   }

   public XmlString addNewScriptExtended() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(SCRIPTEXTENDED$126);
         return var2;
      }
   }

   public void removeScriptExtended(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCRIPTEXTENDED$126, var1);
      }
   }

   public List getScriptLanguageList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ScriptLanguageList(this);
      }
   }

   public BigInteger[] getScriptLanguageArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCRIPTLANGUAGE$128, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getScriptLanguageArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SCRIPTLANGUAGE$128, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetScriptLanguageList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ScriptLanguageList(this);
      }
   }

   public XmlNonNegativeInteger[] xgetScriptLanguageArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCRIPTLANGUAGE$128, var2);
         XmlNonNegativeInteger[] var3 = new XmlNonNegativeInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlNonNegativeInteger xgetScriptLanguageArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlNonNegativeInteger var3 = null;
         var3 = (XmlNonNegativeInteger)this.get_store().find_element_user(SCRIPTLANGUAGE$128, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfScriptLanguageArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCRIPTLANGUAGE$128);
      }
   }

   public void setScriptLanguageArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCRIPTLANGUAGE$128);
      }
   }

   public void setScriptLanguageArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(SCRIPTLANGUAGE$128, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetScriptLanguageArray(XmlNonNegativeInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCRIPTLANGUAGE$128);
      }
   }

   public void xsetScriptLanguageArray(int var1, XmlNonNegativeInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlNonNegativeInteger var4 = null;
         var4 = (XmlNonNegativeInteger)this.get_store().find_element_user(SCRIPTLANGUAGE$128, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertScriptLanguage(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(SCRIPTLANGUAGE$128, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addScriptLanguage(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(SCRIPTLANGUAGE$128);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlNonNegativeInteger insertNewScriptLanguage(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlNonNegativeInteger var3 = null;
         var3 = (XmlNonNegativeInteger)this.get_store().insert_element_user(SCRIPTLANGUAGE$128, var1);
         return var3;
      }
   }

   public XmlNonNegativeInteger addNewScriptLanguage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlNonNegativeInteger var2 = null;
         var2 = (XmlNonNegativeInteger)this.get_store().add_element_user(SCRIPTLANGUAGE$128);
         return var2;
      }
   }

   public void removeScriptLanguage(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCRIPTLANGUAGE$128, var1);
      }
   }

   public List getScriptLocationList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ScriptLocationList(this);
      }
   }

   public BigInteger[] getScriptLocationArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCRIPTLOCATION$130, var2);
         BigInteger[] var3 = new BigInteger[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getBigIntegerValue();
         }

         return var3;
      }
   }

   public BigInteger getScriptLocationArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SCRIPTLOCATION$130, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getBigIntegerValue();
         }
      }
   }

   public List xgetScriptLocationList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2ScriptLocationList(this);
      }
   }

   public XmlNonNegativeInteger[] xgetScriptLocationArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCRIPTLOCATION$130, var2);
         XmlNonNegativeInteger[] var3 = new XmlNonNegativeInteger[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlNonNegativeInteger xgetScriptLocationArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlNonNegativeInteger var3 = null;
         var3 = (XmlNonNegativeInteger)this.get_store().find_element_user(SCRIPTLOCATION$130, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfScriptLocationArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCRIPTLOCATION$130);
      }
   }

   public void setScriptLocationArray(BigInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCRIPTLOCATION$130);
      }
   }

   public void setScriptLocationArray(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(SCRIPTLOCATION$130, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setBigIntegerValue(var2);
         }
      }
   }

   public void xsetScriptLocationArray(XmlNonNegativeInteger[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCRIPTLOCATION$130);
      }
   }

   public void xsetScriptLocationArray(int var1, XmlNonNegativeInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlNonNegativeInteger var4 = null;
         var4 = (XmlNonNegativeInteger)this.get_store().find_element_user(SCRIPTLOCATION$130, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertScriptLocation(int var1, BigInteger var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(SCRIPTLOCATION$130, var1);
         var4.setBigIntegerValue(var2);
      }
   }

   public void addScriptLocation(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(SCRIPTLOCATION$130);
         var3.setBigIntegerValue(var1);
      }
   }

   public XmlNonNegativeInteger insertNewScriptLocation(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlNonNegativeInteger var3 = null;
         var3 = (XmlNonNegativeInteger)this.get_store().insert_element_user(SCRIPTLOCATION$130, var1);
         return var3;
      }
   }

   public XmlNonNegativeInteger addNewScriptLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlNonNegativeInteger var2 = null;
         var2 = (XmlNonNegativeInteger)this.get_store().add_element_user(SCRIPTLOCATION$130);
         return var2;
      }
   }

   public void removeScriptLocation(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCRIPTLOCATION$130, var1);
      }
   }

   public List getFmlaTxbxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FmlaTxbxList(this);
      }
   }

   public String[] getFmlaTxbxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLATXBX$132, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getFmlaTxbxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FMLATXBX$132, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetFmlaTxbxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2FmlaTxbxList(this);
      }
   }

   public XmlString[] xgetFmlaTxbxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FMLATXBX$132, var2);
         XmlString[] var3 = new XmlString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XmlString xgetFmlaTxbxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(FMLATXBX$132, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFmlaTxbxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FMLATXBX$132);
      }
   }

   public void setFmlaTxbxArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLATXBX$132);
      }
   }

   public void setFmlaTxbxArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(FMLATXBX$132, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetFmlaTxbxArray(XmlString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FMLATXBX$132);
      }
   }

   public void xsetFmlaTxbxArray(int var1, XmlString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var4 = null;
         var4 = (XmlString)this.get_store().find_element_user(FMLATXBX$132, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertFmlaTxbx(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(FMLATXBX$132, var1);
         var4.setStringValue(var2);
      }
   }

   public void addFmlaTxbx(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(FMLATXBX$132);
         var3.setStringValue(var1);
      }
   }

   public XmlString insertNewFmlaTxbx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().insert_element_user(FMLATXBX$132, var1);
         return var3;
      }
   }

   public XmlString addNewFmlaTxbx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().add_element_user(FMLATXBX$132);
         return var2;
      }
   }

   public void removeFmlaTxbx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FMLATXBX$132, var1);
      }
   }

   public STObjectType.Enum getObjectType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OBJECTTYPE$134);
         return var2 == null?null:(STObjectType.Enum)var2.getEnumValue();
      }
   }

   public STObjectType xgetObjectType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STObjectType var2 = null;
         var2 = (STObjectType)this.get_store().find_attribute_user(OBJECTTYPE$134);
         return var2;
      }
   }

   public void setObjectType(STObjectType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OBJECTTYPE$134);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OBJECTTYPE$134);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetObjectType(STObjectType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STObjectType var3 = null;
         var3 = (STObjectType)this.get_store().find_attribute_user(OBJECTTYPE$134);
         if(var3 == null) {
            var3 = (STObjectType)this.get_store().add_attribute_user(OBJECTTYPE$134);
         }

         var3.set(var1);
      }
   }

}
