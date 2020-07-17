package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking;

public class CTPictureLockingImpl extends XmlComplexContentImpl implements CTPictureLocking {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName NOGRP$2 = new QName("", "noGrp");
   private static final QName NOSELECT$4 = new QName("", "noSelect");
   private static final QName NOROT$6 = new QName("", "noRot");
   private static final QName NOCHANGEASPECT$8 = new QName("", "noChangeAspect");
   private static final QName NOMOVE$10 = new QName("", "noMove");
   private static final QName NORESIZE$12 = new QName("", "noResize");
   private static final QName NOEDITPOINTS$14 = new QName("", "noEditPoints");
   private static final QName NOADJUSTHANDLES$16 = new QName("", "noAdjustHandles");
   private static final QName NOCHANGEARROWHEADS$18 = new QName("", "noChangeArrowheads");
   private static final QName NOCHANGESHAPETYPE$20 = new QName("", "noChangeShapeType");
   private static final QName NOCROP$22 = new QName("", "noCrop");


   public CTPictureLockingImpl(SchemaType var1) {
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

   public boolean getNoSelect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOSELECT$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOSELECT$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoSelect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOSELECT$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOSELECT$4);
         }

         return var2;
      }
   }

   public boolean isSetNoSelect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOSELECT$4) != null;
      }
   }

   public void setNoSelect(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOSELECT$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOSELECT$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoSelect(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOSELECT$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOSELECT$4);
         }

         var3.set(var1);
      }
   }

   public void unsetNoSelect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOSELECT$4);
      }
   }

   public boolean getNoRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOROT$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOROT$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOROT$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOROT$6);
         }

         return var2;
      }
   }

   public boolean isSetNoRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOROT$6) != null;
      }
   }

   public void setNoRot(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOROT$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOROT$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoRot(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOROT$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOROT$6);
         }

         var3.set(var1);
      }
   }

   public void unsetNoRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOROT$6);
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

   public boolean getNoEditPoints() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOEDITPOINTS$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOEDITPOINTS$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoEditPoints() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOEDITPOINTS$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOEDITPOINTS$14);
         }

         return var2;
      }
   }

   public boolean isSetNoEditPoints() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOEDITPOINTS$14) != null;
      }
   }

   public void setNoEditPoints(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOEDITPOINTS$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOEDITPOINTS$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoEditPoints(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOEDITPOINTS$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOEDITPOINTS$14);
         }

         var3.set(var1);
      }
   }

   public void unsetNoEditPoints() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOEDITPOINTS$14);
      }
   }

   public boolean getNoAdjustHandles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOADJUSTHANDLES$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOADJUSTHANDLES$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoAdjustHandles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOADJUSTHANDLES$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOADJUSTHANDLES$16);
         }

         return var2;
      }
   }

   public boolean isSetNoAdjustHandles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOADJUSTHANDLES$16) != null;
      }
   }

   public void setNoAdjustHandles(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOADJUSTHANDLES$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOADJUSTHANDLES$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoAdjustHandles(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOADJUSTHANDLES$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOADJUSTHANDLES$16);
         }

         var3.set(var1);
      }
   }

   public void unsetNoAdjustHandles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOADJUSTHANDLES$16);
      }
   }

   public boolean getNoChangeArrowheads() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOCHANGEARROWHEADS$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOCHANGEARROWHEADS$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoChangeArrowheads() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOCHANGEARROWHEADS$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOCHANGEARROWHEADS$18);
         }

         return var2;
      }
   }

   public boolean isSetNoChangeArrowheads() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOCHANGEARROWHEADS$18) != null;
      }
   }

   public void setNoChangeArrowheads(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOCHANGEARROWHEADS$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOCHANGEARROWHEADS$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoChangeArrowheads(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOCHANGEARROWHEADS$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOCHANGEARROWHEADS$18);
         }

         var3.set(var1);
      }
   }

   public void unsetNoChangeArrowheads() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOCHANGEARROWHEADS$18);
      }
   }

   public boolean getNoChangeShapeType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOCHANGESHAPETYPE$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOCHANGESHAPETYPE$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoChangeShapeType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOCHANGESHAPETYPE$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOCHANGESHAPETYPE$20);
         }

         return var2;
      }
   }

   public boolean isSetNoChangeShapeType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOCHANGESHAPETYPE$20) != null;
      }
   }

   public void setNoChangeShapeType(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOCHANGESHAPETYPE$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOCHANGESHAPETYPE$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoChangeShapeType(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOCHANGESHAPETYPE$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOCHANGESHAPETYPE$20);
         }

         var3.set(var1);
      }
   }

   public void unsetNoChangeShapeType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOCHANGESHAPETYPE$20);
      }
   }

   public boolean getNoCrop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOCROP$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NOCROP$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoCrop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOCROP$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NOCROP$22);
         }

         return var2;
      }
   }

   public boolean isSetNoCrop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOCROP$22) != null;
      }
   }

   public void setNoCrop(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOCROP$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOCROP$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoCrop(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOCROP$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOCROP$22);
         }

         var3.set(var1);
      }
   }

   public void unsetNoCrop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOCROP$22);
      }
   }

}
