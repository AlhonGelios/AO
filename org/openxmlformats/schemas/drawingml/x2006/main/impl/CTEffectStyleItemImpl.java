package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D;

public class CTEffectStyleItemImpl extends XmlComplexContentImpl implements CTEffectStyleItem {

   private static final QName EFFECTLST$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectLst");
   private static final QName EFFECTDAG$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectDag");
   private static final QName SCENE3D$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scene3d");
   private static final QName SP3D$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sp3d");


   public CTEffectStyleItemImpl(SchemaType var1) {
      super(var1);
   }

   public CTEffectList getEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var2 = null;
         var2 = (CTEffectList)this.get_store().find_element_user(EFFECTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTLST$0) != 0;
      }
   }

   public void setEffectLst(CTEffectList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var3 = null;
         var3 = (CTEffectList)this.get_store().find_element_user(EFFECTLST$0, 0);
         if(var3 == null) {
            var3 = (CTEffectList)this.get_store().add_element_user(EFFECTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTEffectList addNewEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var2 = null;
         var2 = (CTEffectList)this.get_store().add_element_user(EFFECTLST$0);
         return var2;
      }
   }

   public void unsetEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTLST$0, 0);
      }
   }

   public CTEffectContainer getEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var2 = null;
         var2 = (CTEffectContainer)this.get_store().find_element_user(EFFECTDAG$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTDAG$2) != 0;
      }
   }

   public void setEffectDag(CTEffectContainer var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var3 = null;
         var3 = (CTEffectContainer)this.get_store().find_element_user(EFFECTDAG$2, 0);
         if(var3 == null) {
            var3 = (CTEffectContainer)this.get_store().add_element_user(EFFECTDAG$2);
         }

         var3.set(var1);
      }
   }

   public CTEffectContainer addNewEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var2 = null;
         var2 = (CTEffectContainer)this.get_store().add_element_user(EFFECTDAG$2);
         return var2;
      }
   }

   public void unsetEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTDAG$2, 0);
      }
   }

   public CTScene3D getScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var2 = null;
         var2 = (CTScene3D)this.get_store().find_element_user(SCENE3D$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCENE3D$4) != 0;
      }
   }

   public void setScene3D(CTScene3D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var3 = null;
         var3 = (CTScene3D)this.get_store().find_element_user(SCENE3D$4, 0);
         if(var3 == null) {
            var3 = (CTScene3D)this.get_store().add_element_user(SCENE3D$4);
         }

         var3.set(var1);
      }
   }

   public CTScene3D addNewScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScene3D var2 = null;
         var2 = (CTScene3D)this.get_store().add_element_user(SCENE3D$4);
         return var2;
      }
   }

   public void unsetScene3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCENE3D$4, 0);
      }
   }

   public CTShape3D getSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape3D var2 = null;
         var2 = (CTShape3D)this.get_store().find_element_user(SP3D$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SP3D$6) != 0;
      }
   }

   public void setSp3D(CTShape3D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape3D var3 = null;
         var3 = (CTShape3D)this.get_store().find_element_user(SP3D$6, 0);
         if(var3 == null) {
            var3 = (CTShape3D)this.get_store().add_element_user(SP3D$6);
         }

         var3.set(var1);
      }
   }

   public CTShape3D addNewSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape3D var2 = null;
         var2 = (CTShape3D)this.get_store().add_element_user(SP3D$6);
         return var2;
      }
   }

   public void unsetSp3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SP3D$6, 0);
      }
   }

}
