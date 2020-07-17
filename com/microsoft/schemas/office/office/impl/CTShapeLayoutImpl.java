package com.microsoft.schemas.office.office.impl;

import com.microsoft.schemas.office.office.CTIdMap;
import com.microsoft.schemas.office.office.CTRegroupTable;
import com.microsoft.schemas.office.office.CTRules;
import com.microsoft.schemas.office.office.CTShapeLayout;
import com.microsoft.schemas.vml.STExt;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTShapeLayoutImpl extends XmlComplexContentImpl implements CTShapeLayout {

   private static final QName IDMAP$0 = new QName("urn:schemas-microsoft-com:office:office", "idmap");
   private static final QName REGROUPTABLE$2 = new QName("urn:schemas-microsoft-com:office:office", "regrouptable");
   private static final QName RULES$4 = new QName("urn:schemas-microsoft-com:office:office", "rules");
   private static final QName EXT$6 = new QName("urn:schemas-microsoft-com:vml", "ext");


   public CTShapeLayoutImpl(SchemaType var1) {
      super(var1);
   }

   public CTIdMap getIdmap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIdMap var2 = null;
         var2 = (CTIdMap)this.get_store().find_element_user(IDMAP$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIdmap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(IDMAP$0) != 0;
      }
   }

   public void setIdmap(CTIdMap var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIdMap var3 = null;
         var3 = (CTIdMap)this.get_store().find_element_user(IDMAP$0, 0);
         if(var3 == null) {
            var3 = (CTIdMap)this.get_store().add_element_user(IDMAP$0);
         }

         var3.set(var1);
      }
   }

   public CTIdMap addNewIdmap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIdMap var2 = null;
         var2 = (CTIdMap)this.get_store().add_element_user(IDMAP$0);
         return var2;
      }
   }

   public void unsetIdmap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(IDMAP$0, 0);
      }
   }

   public CTRegroupTable getRegrouptable() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRegroupTable var2 = null;
         var2 = (CTRegroupTable)this.get_store().find_element_user(REGROUPTABLE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRegrouptable() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REGROUPTABLE$2) != 0;
      }
   }

   public void setRegrouptable(CTRegroupTable var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRegroupTable var3 = null;
         var3 = (CTRegroupTable)this.get_store().find_element_user(REGROUPTABLE$2, 0);
         if(var3 == null) {
            var3 = (CTRegroupTable)this.get_store().add_element_user(REGROUPTABLE$2);
         }

         var3.set(var1);
      }
   }

   public CTRegroupTable addNewRegrouptable() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRegroupTable var2 = null;
         var2 = (CTRegroupTable)this.get_store().add_element_user(REGROUPTABLE$2);
         return var2;
      }
   }

   public void unsetRegrouptable() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REGROUPTABLE$2, 0);
      }
   }

   public CTRules getRules() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRules var2 = null;
         var2 = (CTRules)this.get_store().find_element_user(RULES$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRules() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RULES$4) != 0;
      }
   }

   public void setRules(CTRules var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRules var3 = null;
         var3 = (CTRules)this.get_store().find_element_user(RULES$4, 0);
         if(var3 == null) {
            var3 = (CTRules)this.get_store().add_element_user(RULES$4);
         }

         var3.set(var1);
      }
   }

   public CTRules addNewRules() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRules var2 = null;
         var2 = (CTRules)this.get_store().add_element_user(RULES$4);
         return var2;
      }
   }

   public void unsetRules() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RULES$4, 0);
      }
   }

   public STExt.Enum getExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EXT$6);
         return var2 == null?null:(STExt.Enum)var2.getEnumValue();
      }
   }

   public STExt xgetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STExt var2 = null;
         var2 = (STExt)this.get_store().find_attribute_user(EXT$6);
         return var2;
      }
   }

   public boolean isSetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EXT$6) != null;
      }
   }

   public void setExt(STExt.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EXT$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EXT$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetExt(STExt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STExt var3 = null;
         var3 = (STExt)this.get_store().find_attribute_user(EXT$6);
         if(var3 == null) {
            var3 = (STExt)this.get_store().add_attribute_user(EXT$6);
         }

         var3.set(var1);
      }
   }

   public void unsetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EXT$6);
      }
   }

}
