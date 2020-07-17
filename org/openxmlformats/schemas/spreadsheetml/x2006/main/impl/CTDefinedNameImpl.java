package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.JavaStringHolderEx;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDefinedName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTDefinedNameImpl extends JavaStringHolderEx implements CTDefinedName {

   private static final QName NAME$0 = new QName("", "name");
   private static final QName COMMENT$2 = new QName("", "comment");
   private static final QName CUSTOMMENU$4 = new QName("", "customMenu");
   private static final QName DESCRIPTION$6 = new QName("", "description");
   private static final QName HELP$8 = new QName("", "help");
   private static final QName STATUSBAR$10 = new QName("", "statusBar");
   private static final QName LOCALSHEETID$12 = new QName("", "localSheetId");
   private static final QName HIDDEN$14 = new QName("", "hidden");
   private static final QName FUNCTION$16 = new QName("", "function");
   private static final QName VBPROCEDURE$18 = new QName("", "vbProcedure");
   private static final QName XLM$20 = new QName("", "xlm");
   private static final QName FUNCTIONGROUPID$22 = new QName("", "functionGroupId");
   private static final QName SHORTCUTKEY$24 = new QName("", "shortcutKey");
   private static final QName PUBLISHTOSERVER$26 = new QName("", "publishToServer");
   private static final QName WORKBOOKPARAMETER$28 = new QName("", "workbookParameter");


   public CTDefinedNameImpl(SchemaType var1) {
      super(var1, true);
   }

   protected CTDefinedNameImpl(SchemaType var1, boolean var2) {
      super(var1, var2);
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(NAME$0);
         return var2;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(NAME$0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(NAME$0);
         }

         var3.set(var1);
      }
   }

   public String getComment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COMMENT$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetComment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(COMMENT$2);
         return var2;
      }
   }

   public boolean isSetComment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COMMENT$2) != null;
      }
   }

   public void setComment(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COMMENT$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COMMENT$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetComment(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(COMMENT$2);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(COMMENT$2);
         }

         var3.set(var1);
      }
   }

   public void unsetComment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COMMENT$2);
      }
   }

   public String getCustomMenu() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMMENU$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetCustomMenu() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(CUSTOMMENU$4);
         return var2;
      }
   }

   public boolean isSetCustomMenu() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CUSTOMMENU$4) != null;
      }
   }

   public void setCustomMenu(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMMENU$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CUSTOMMENU$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCustomMenu(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(CUSTOMMENU$4);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(CUSTOMMENU$4);
         }

         var3.set(var1);
      }
   }

   public void unsetCustomMenu() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CUSTOMMENU$4);
      }
   }

   public String getDescription() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DESCRIPTION$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetDescription() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(DESCRIPTION$6);
         return var2;
      }
   }

   public boolean isSetDescription() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DESCRIPTION$6) != null;
      }
   }

   public void setDescription(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DESCRIPTION$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DESCRIPTION$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDescription(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(DESCRIPTION$6);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(DESCRIPTION$6);
         }

         var3.set(var1);
      }
   }

   public void unsetDescription() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DESCRIPTION$6);
      }
   }

   public String getHelp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HELP$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetHelp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(HELP$8);
         return var2;
      }
   }

   public boolean isSetHelp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HELP$8) != null;
      }
   }

   public void setHelp(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HELP$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HELP$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetHelp(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(HELP$8);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(HELP$8);
         }

         var3.set(var1);
      }
   }

   public void unsetHelp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HELP$8);
      }
   }

   public String getStatusBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STATUSBAR$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetStatusBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(STATUSBAR$10);
         return var2;
      }
   }

   public boolean isSetStatusBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STATUSBAR$10) != null;
      }
   }

   public void setStatusBar(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STATUSBAR$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STATUSBAR$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetStatusBar(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(STATUSBAR$10);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(STATUSBAR$10);
         }

         var3.set(var1);
      }
   }

   public void unsetStatusBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STATUSBAR$10);
      }
   }

   public long getLocalSheetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LOCALSHEETID$12);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetLocalSheetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(LOCALSHEETID$12);
         return var2;
      }
   }

   public boolean isSetLocalSheetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LOCALSHEETID$12) != null;
      }
   }

   public void setLocalSheetId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(LOCALSHEETID$12);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(LOCALSHEETID$12);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetLocalSheetId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(LOCALSHEETID$12);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(LOCALSHEETID$12);
         }

         var3.set(var1);
      }
   }

   public void unsetLocalSheetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LOCALSHEETID$12);
      }
   }

   public boolean getHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HIDDEN$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HIDDEN$14);
         }

         return var2;
      }
   }

   public boolean isSetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIDDEN$14) != null;
      }
   }

   public void setHidden(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIDDEN$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHidden(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIDDEN$14);
         }

         var3.set(var1);
      }
   }

   public void unsetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIDDEN$14);
      }
   }

   public boolean getFunction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FUNCTION$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FUNCTION$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFunction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FUNCTION$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FUNCTION$16);
         }

         return var2;
      }
   }

   public boolean isSetFunction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FUNCTION$16) != null;
      }
   }

   public void setFunction(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FUNCTION$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FUNCTION$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFunction(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FUNCTION$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FUNCTION$16);
         }

         var3.set(var1);
      }
   }

   public void unsetFunction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FUNCTION$16);
      }
   }

   public boolean getVbProcedure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VBPROCEDURE$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VBPROCEDURE$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetVbProcedure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(VBPROCEDURE$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(VBPROCEDURE$18);
         }

         return var2;
      }
   }

   public boolean isSetVbProcedure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VBPROCEDURE$18) != null;
      }
   }

   public void setVbProcedure(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VBPROCEDURE$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VBPROCEDURE$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetVbProcedure(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(VBPROCEDURE$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(VBPROCEDURE$18);
         }

         var3.set(var1);
      }
   }

   public void unsetVbProcedure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VBPROCEDURE$18);
      }
   }

   public boolean getXlm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(XLM$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(XLM$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetXlm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(XLM$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(XLM$20);
         }

         return var2;
      }
   }

   public boolean isSetXlm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(XLM$20) != null;
      }
   }

   public void setXlm(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(XLM$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(XLM$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetXlm(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(XLM$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(XLM$20);
         }

         var3.set(var1);
      }
   }

   public void unsetXlm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(XLM$20);
      }
   }

   public long getFunctionGroupId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FUNCTIONGROUPID$22);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFunctionGroupId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FUNCTIONGROUPID$22);
         return var2;
      }
   }

   public boolean isSetFunctionGroupId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FUNCTIONGROUPID$22) != null;
      }
   }

   public void setFunctionGroupId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FUNCTIONGROUPID$22);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FUNCTIONGROUPID$22);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFunctionGroupId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FUNCTIONGROUPID$22);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FUNCTIONGROUPID$22);
         }

         var3.set(var1);
      }
   }

   public void unsetFunctionGroupId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FUNCTIONGROUPID$22);
      }
   }

   public String getShortcutKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHORTCUTKEY$24);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetShortcutKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(SHORTCUTKEY$24);
         return var2;
      }
   }

   public boolean isSetShortcutKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHORTCUTKEY$24) != null;
      }
   }

   public void setShortcutKey(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHORTCUTKEY$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHORTCUTKEY$24);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetShortcutKey(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(SHORTCUTKEY$24);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(SHORTCUTKEY$24);
         }

         var3.set(var1);
      }
   }

   public void unsetShortcutKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHORTCUTKEY$24);
      }
   }

   public boolean getPublishToServer() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PUBLISHTOSERVER$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PUBLISHTOSERVER$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPublishToServer() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PUBLISHTOSERVER$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PUBLISHTOSERVER$26);
         }

         return var2;
      }
   }

   public boolean isSetPublishToServer() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PUBLISHTOSERVER$26) != null;
      }
   }

   public void setPublishToServer(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PUBLISHTOSERVER$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PUBLISHTOSERVER$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPublishToServer(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PUBLISHTOSERVER$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PUBLISHTOSERVER$26);
         }

         var3.set(var1);
      }
   }

   public void unsetPublishToServer() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PUBLISHTOSERVER$26);
      }
   }

   public boolean getWorkbookParameter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WORKBOOKPARAMETER$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(WORKBOOKPARAMETER$28);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetWorkbookParameter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(WORKBOOKPARAMETER$28);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(WORKBOOKPARAMETER$28);
         }

         return var2;
      }
   }

   public boolean isSetWorkbookParameter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WORKBOOKPARAMETER$28) != null;
      }
   }

   public void setWorkbookParameter(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(WORKBOOKPARAMETER$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(WORKBOOKPARAMETER$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetWorkbookParameter(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(WORKBOOKPARAMETER$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(WORKBOOKPARAMETER$28);
         }

         var3.set(var1);
      }
   }

   public void unsetWorkbookParameter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WORKBOOKPARAMETER$28);
      }
   }

}
