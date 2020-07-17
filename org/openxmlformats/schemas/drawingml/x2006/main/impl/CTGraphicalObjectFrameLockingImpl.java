package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;

public class CTGraphicalObjectFrameLockingImpl extends XmlComplexContentImpl implements CTGraphicalObjectFrameLocking {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName NOGRP$2 = new QName("", "noGrp");
   private static final QName NODRILLDOWN$4 = new QName("", "noDrilldown");
   private static final QName NOSELECT$6 = new QName("", "noSelect");
   private static final QName NOCHANGEASPECT$8 = new QName("", "noChangeAspect");
   private static final QName NOMOVE$10 = new QName("", "noMove");
   private static final QName NORESIZE$12 = new QName("", "noResize");


   public CTGraphicalObjectFrameLockingImpl(SchemaType var1) {
      super(var1);
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$0) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$0);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$0, 0);
      }
   }

   public boolean getNoGrp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOGRP$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOGRP$2);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoGrp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOGRP$2);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOGRP$2);
         }

         return var2;
      }
   }

   public boolean isSetNoGrp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOGRP$2) != null;
      }
   }

   public void setNoGrp(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOGRP$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOGRP$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoGrp(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOGRP$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOGRP$2);
         }

         var3.set(var1);
      }
   }

   public void unsetNoGrp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOGRP$2);
      }
   }

   public boolean getNoDrilldown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NODRILLDOWN$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NODRILLDOWN$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoDrilldown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NODRILLDOWN$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NODRILLDOWN$4);
         }

         return var2;
      }
   }

   public boolean isSetNoDrilldown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NODRILLDOWN$4) != null;
      }
   }

   public void setNoDrilldown(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NODRILLDOWN$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NODRILLDOWN$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoDrilldown(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NODRILLDOWN$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NODRILLDOWN$4);
         }

         var3.set(var1);
      }
   }

   public void unsetNoDrilldown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NODRILLDOWN$4);
      }
   }

   public boolean getNoSelect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOSELECT$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOSELECT$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoSelect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOSELECT$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOSELECT$6);
         }

         return var2;
      }
   }

   public boolean isSetNoSelect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOSELECT$6) != null;
      }
   }

   public void setNoSelect(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOSELECT$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOSELECT$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoSelect(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOSELECT$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOSELECT$6);
         }

         var3.set(var1);
      }
   }

   public void unsetNoSelect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOSELECT$6);
      }
   }

   public boolean getNoChangeAspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOCHANGEASPECT$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOCHANGEASPECT$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoChangeAspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOCHANGEASPECT$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOCHANGEASPECT$8);
         }

         return var2;
      }
   }

   public boolean isSetNoChangeAspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOCHANGEASPECT$8) != null;
      }
   }

   public void setNoChangeAspect(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOCHANGEASPECT$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOCHANGEASPECT$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoChangeAspect(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOCHANGEASPECT$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOCHANGEASPECT$8);
         }

         var3.set(var1);
      }
   }

   public void unsetNoChangeAspect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOCHANGEASPECT$8);
      }
   }

   public boolean getNoMove() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOMOVE$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOMOVE$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoMove() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOMOVE$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOMOVE$10);
         }

         return var2;
      }
   }

   public boolean isSetNoMove() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOMOVE$10) != null;
      }
   }

   public void setNoMove(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOMOVE$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOMOVE$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoMove(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOMOVE$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOMOVE$10);
         }

         var3.set(var1);
      }
   }

   public void unsetNoMove() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOMOVE$10);
      }
   }

   public boolean getNoResize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NORESIZE$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NORESIZE$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoResize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NORESIZE$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NORESIZE$12);
         }

         return var2;
      }
   }

   public boolean isSetNoResize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NORESIZE$12) != null;
      }
   }

   public void setNoResize(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NORESIZE$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NORESIZE$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoResize(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NORESIZE$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NORESIZE$12);
         }

         var3.set(var1);
      }
   }

   public void unsetNoResize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NORESIZE$12);
      }
   }

}
