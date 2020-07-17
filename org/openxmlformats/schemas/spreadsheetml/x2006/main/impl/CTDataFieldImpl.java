package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataConsolidateFunction;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STShowDataAs$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTDataFieldImpl extends XmlComplexContentImpl implements CTDataField {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName NAME$2 = new QName("", "name");
   private static final QName FLD$4 = new QName("", "fld");
   private static final QName SUBTOTAL$6 = new QName("", "subtotal");
   private static final QName SHOWDATAAS$8 = new QName("", "showDataAs");
   private static final QName BASEFIELD$10 = new QName("", "baseField");
   private static final QName BASEITEM$12 = new QName("", "baseItem");
   private static final QName NUMFMTID$14 = new QName("", "numFmtId");


   public CTDataFieldImpl(SchemaType var1) {
      super(var1);
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$0) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$0, 0);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(NAME$2);
         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$2) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(NAME$2);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(NAME$2);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$2);
      }
   }

   public long getFld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FLD$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FLD$4);
         return var2;
      }
   }

   public void setFld(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FLD$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FLD$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFld(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FLD$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FLD$4);
         }

         var3.set(var1);
      }
   }

   public STDataConsolidateFunction.Enum getSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SUBTOTAL$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SUBTOTAL$6);
         }

         return var2 == null?null:(STDataConsolidateFunction.Enum)var2.getEnumValue();
      }
   }

   public STDataConsolidateFunction xgetSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDataConsolidateFunction var2 = null;
         var2 = (STDataConsolidateFunction)this.get_store().find_attribute_user(SUBTOTAL$6);
         if(var2 == null) {
            var2 = (STDataConsolidateFunction)this.get_default_attribute_value(SUBTOTAL$6);
         }

         return var2;
      }
   }

   public boolean isSetSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SUBTOTAL$6) != null;
      }
   }

   public void setSubtotal(STDataConsolidateFunction.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SUBTOTAL$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SUBTOTAL$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetSubtotal(STDataConsolidateFunction var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDataConsolidateFunction var3 = null;
         var3 = (STDataConsolidateFunction)this.get_store().find_attribute_user(SUBTOTAL$6);
         if(var3 == null) {
            var3 = (STDataConsolidateFunction)this.get_store().add_attribute_user(SUBTOTAL$6);
         }

         var3.set(var1);
      }
   }

   public void unsetSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SUBTOTAL$6);
      }
   }

   public STShowDataAs$Enum getShowDataAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWDATAAS$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWDATAAS$8);
         }

         return var2 == null?null:(STShowDataAs$Enum)var2.getEnumValue();
      }
   }

   public STShowDataAs xgetShowDataAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STShowDataAs var2 = null;
         var2 = (STShowDataAs)this.get_store().find_attribute_user(SHOWDATAAS$8);
         if(var2 == null) {
            var2 = (STShowDataAs)this.get_default_attribute_value(SHOWDATAAS$8);
         }

         return var2;
      }
   }

   public boolean isSetShowDataAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWDATAAS$8) != null;
      }
   }

   public void setShowDataAs(STShowDataAs$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWDATAAS$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWDATAAS$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetShowDataAs(STShowDataAs var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STShowDataAs var3 = null;
         var3 = (STShowDataAs)this.get_store().find_attribute_user(SHOWDATAAS$8);
         if(var3 == null) {
            var3 = (STShowDataAs)this.get_store().add_attribute_user(SHOWDATAAS$8);
         }

         var3.set(var1);
      }
   }

   public void unsetShowDataAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWDATAAS$8);
      }
   }

   public int getBaseField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BASEFIELD$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BASEFIELD$10);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetBaseField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(BASEFIELD$10);
         if(var2 == null) {
            var2 = (XmlInt)this.get_default_attribute_value(BASEFIELD$10);
         }

         return var2;
      }
   }

   public boolean isSetBaseField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BASEFIELD$10) != null;
      }
   }

   public void setBaseField(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BASEFIELD$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BASEFIELD$10);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetBaseField(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(BASEFIELD$10);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(BASEFIELD$10);
         }

         var3.set(var1);
      }
   }

   public void unsetBaseField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BASEFIELD$10);
      }
   }

   public long getBaseItem() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BASEITEM$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BASEITEM$12);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetBaseItem() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(BASEITEM$12);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(BASEITEM$12);
         }

         return var2;
      }
   }

   public boolean isSetBaseItem() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BASEITEM$12) != null;
      }
   }

   public void setBaseItem(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(BASEITEM$12);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(BASEITEM$12);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetBaseItem(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(BASEITEM$12);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(BASEITEM$12);
         }

         var3.set(var1);
      }
   }

   public void unsetBaseItem() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BASEITEM$12);
      }
   }

   public long getNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NUMFMTID$14);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STNumFmtId xgetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STNumFmtId var2 = null;
         var2 = (STNumFmtId)this.get_store().find_attribute_user(NUMFMTID$14);
         return var2;
      }
   }

   public boolean isSetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NUMFMTID$14) != null;
      }
   }

   public void setNumFmtId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(NUMFMTID$14);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(NUMFMTID$14);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetNumFmtId(STNumFmtId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STNumFmtId var3 = null;
         var3 = (STNumFmtId)this.get_store().find_attribute_user(NUMFMTID$14);
         if(var3 == null) {
            var3 = (STNumFmtId)this.get_store().add_attribute_user(NUMFMTID$14);
         }

         var3.set(var1);
      }
   }

   public void unsetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NUMFMTID$14);
      }
   }

}
