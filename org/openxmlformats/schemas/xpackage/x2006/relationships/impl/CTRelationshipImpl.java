package org.openxmlformats.schemas.xpackage.x2006.relationships.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.JavaStringHolderEx;
import org.openxmlformats.schemas.xpackage.x2006.relationships.CTRelationship;
import org.openxmlformats.schemas.xpackage.x2006.relationships.STTargetMode;

public class CTRelationshipImpl extends JavaStringHolderEx implements CTRelationship {

   private static final QName TARGETMODE$0 = new QName("", "TargetMode");
   private static final QName TARGET$2 = new QName("", "Target");
   private static final QName TYPE$4 = new QName("", "Type");
   private static final QName ID$6 = new QName("", "Id");


   public CTRelationshipImpl(SchemaType var1) {
      super(var1, true);
   }

   protected CTRelationshipImpl(SchemaType var1, boolean var2) {
      super(var1, var2);
   }

   public STTargetMode.Enum getTargetMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TARGETMODE$0);
         return var2 == null?null:(STTargetMode.Enum)var2.getEnumValue();
      }
   }

   public STTargetMode xgetTargetMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTargetMode var2 = null;
         var2 = (STTargetMode)this.get_store().find_attribute_user(TARGETMODE$0);
         return var2;
      }
   }

   public boolean isSetTargetMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TARGETMODE$0) != null;
      }
   }

   public void setTargetMode(STTargetMode.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TARGETMODE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TARGETMODE$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetTargetMode(STTargetMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTargetMode var3 = null;
         var3 = (STTargetMode)this.get_store().find_attribute_user(TARGETMODE$0);
         if(var3 == null) {
            var3 = (STTargetMode)this.get_store().add_attribute_user(TARGETMODE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetTargetMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TARGETMODE$0);
      }
   }

   public String getTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TARGET$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(TARGET$2);
         return var2;
      }
   }

   public void setTarget(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TARGET$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TARGET$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTarget(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(TARGET$2);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(TARGET$2);
         }

         var3.set(var1);
      }
   }

   public String getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(TYPE$4);
         return var2;
      }
   }

   public void setType(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetType(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(TYPE$4);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(TYPE$4);
         }

         var3.set(var1);
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

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$6);
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

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$6);
         }

         var3.set(var1);
      }
   }

}
