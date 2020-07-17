package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTHyperlinkImpl extends XmlComplexContentImpl implements CTHyperlink {

   private static final QName REF$0 = new QName("", "ref");
   private static final QName ID$2 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
   private static final QName LOCATION$4 = new QName("", "location");
   private static final QName TOOLTIP$6 = new QName("", "tooltip");
   private static final QName DISPLAY$8 = new QName("", "display");


   public CTHyperlinkImpl(SchemaType var1) {
      super(var1);
   }

   public String getRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REF$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRef xgetRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var2 = null;
         var2 = (STRef)this.get_store().find_attribute_user(REF$0);
         return var2;
      }
   }

   public void setRef(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REF$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REF$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRef(STRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var3 = null;
         var3 = (STRef)this.get_store().find_attribute_user(REF$0);
         if(var3 == null) {
            var3 = (STRef)this.get_store().add_attribute_user(REF$0);
         }

         var3.set(var1);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID$2);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$2) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID$2);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$2);
      }
   }

   public String getLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LOCATION$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(LOCATION$4);
         return var2;
      }
   }

   public boolean isSetLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LOCATION$4) != null;
      }
   }

   public void setLocation(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LOCATION$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LOCATION$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetLocation(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(LOCATION$4);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(LOCATION$4);
         }

         var3.set(var1);
      }
   }

   public void unsetLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LOCATION$4);
      }
   }

   public String getTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOOLTIP$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(TOOLTIP$6);
         return var2;
      }
   }

   public boolean isSetTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOOLTIP$6) != null;
      }
   }

   public void setTooltip(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOOLTIP$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOOLTIP$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTooltip(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(TOOLTIP$6);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(TOOLTIP$6);
         }

         var3.set(var1);
      }
   }

   public void unsetTooltip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOOLTIP$6);
      }
   }

   public String getDisplay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISPLAY$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetDisplay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(DISPLAY$8);
         return var2;
      }
   }

   public boolean isSetDisplay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISPLAY$8) != null;
      }
   }

   public void setDisplay(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DISPLAY$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DISPLAY$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDisplay(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(DISPLAY$8);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(DISPLAY$8);
         }

         var3.set(var1);
      }
   }

   public void unsetDisplay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISPLAY$8);
      }
   }

}
