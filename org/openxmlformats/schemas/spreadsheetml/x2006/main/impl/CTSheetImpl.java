package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetState;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTSheetImpl extends XmlComplexContentImpl implements CTSheet {

   private static final QName NAME$0 = new QName("", "name");
   private static final QName SHEETID$2 = new QName("", "sheetId");
   private static final QName STATE$4 = new QName("", "state");
   private static final QName ID$6 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");


   public CTSheetImpl(SchemaType var1) {
      super(var1);
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

   public long getSheetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHEETID$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetSheetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(SHEETID$2);
         return var2;
      }
   }

   public void setSheetId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(SHEETID$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(SHEETID$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetSheetId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(SHEETID$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(SHEETID$2);
         }

         var3.set(var1);
      }
   }

   public STSheetState.Enum getState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STATE$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(STATE$4);
         }

         return var2 == null?null:(STSheetState.Enum)var2.getEnumValue();
      }
   }

   public STSheetState xgetState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSheetState var2 = null;
         var2 = (STSheetState)this.get_store().find_attribute_user(STATE$4);
         if(var2 == null) {
            var2 = (STSheetState)this.get_default_attribute_value(STATE$4);
         }

         return var2;
      }
   }

   public boolean isSetState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STATE$4) != null;
      }
   }

   public void setState(STSheetState.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STATE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STATE$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetState(STSheetState var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSheetState var3 = null;
         var3 = (STSheetState)this.get_store().find_attribute_user(STATE$4);
         if(var3 == null) {
            var3 = (STSheetState)this.get_store().add_attribute_user(STATE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STATE$4);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID$6);
         return var2;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID$6);
         }

         var3.set(var1);
      }
   }

}
