package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGlowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTInnerShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTReflectionEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSoftEdgesEffect;

public class CTEffectListImpl extends XmlComplexContentImpl implements CTEffectList {

   private static final QName BLUR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blur");
   private static final QName FILLOVERLAY$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillOverlay");
   private static final QName GLOW$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "glow");
   private static final QName INNERSHDW$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "innerShdw");
   private static final QName OUTERSHDW$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "outerShdw");
   private static final QName PRSTSHDW$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstShdw");
   private static final QName REFLECTION$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "reflection");
   private static final QName SOFTEDGE$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "softEdge");


   public CTEffectListImpl(SchemaType var1) {
      super(var1);
   }

   public CTBlurEffect getBlur() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlurEffect var2 = null;
         var2 = (CTBlurEffect)this.get_store().find_element_user(BLUR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBlur() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLUR$0) != 0;
      }
   }

   public void setBlur(CTBlurEffect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlurEffect var3 = null;
         var3 = (CTBlurEffect)this.get_store().find_element_user(BLUR$0, 0);
         if(var3 == null) {
            var3 = (CTBlurEffect)this.get_store().add_element_user(BLUR$0);
         }

         var3.set(var1);
      }
   }

   public CTBlurEffect addNewBlur() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlurEffect var2 = null;
         var2 = (CTBlurEffect)this.get_store().add_element_user(BLUR$0);
         return var2;
      }
   }

   public void unsetBlur() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLUR$0, 0);
      }
   }

   public CTFillOverlayEffect getFillOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillOverlayEffect var2 = null;
         var2 = (CTFillOverlayEffect)this.get_store().find_element_user(FILLOVERLAY$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFillOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILLOVERLAY$2) != 0;
      }
   }

   public void setFillOverlay(CTFillOverlayEffect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillOverlayEffect var3 = null;
         var3 = (CTFillOverlayEffect)this.get_store().find_element_user(FILLOVERLAY$2, 0);
         if(var3 == null) {
            var3 = (CTFillOverlayEffect)this.get_store().add_element_user(FILLOVERLAY$2);
         }

         var3.set(var1);
      }
   }

   public CTFillOverlayEffect addNewFillOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillOverlayEffect var2 = null;
         var2 = (CTFillOverlayEffect)this.get_store().add_element_user(FILLOVERLAY$2);
         return var2;
      }
   }

   public void unsetFillOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILLOVERLAY$2, 0);
      }
   }

   public CTGlowEffect getGlow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGlowEffect var2 = null;
         var2 = (CTGlowEffect)this.get_store().find_element_user(GLOW$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGlow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GLOW$4) != 0;
      }
   }

   public void setGlow(CTGlowEffect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGlowEffect var3 = null;
         var3 = (CTGlowEffect)this.get_store().find_element_user(GLOW$4, 0);
         if(var3 == null) {
            var3 = (CTGlowEffect)this.get_store().add_element_user(GLOW$4);
         }

         var3.set(var1);
      }
   }

   public CTGlowEffect addNewGlow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGlowEffect var2 = null;
         var2 = (CTGlowEffect)this.get_store().add_element_user(GLOW$4);
         return var2;
      }
   }

   public void unsetGlow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GLOW$4, 0);
      }
   }

   public CTInnerShadowEffect getInnerShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInnerShadowEffect var2 = null;
         var2 = (CTInnerShadowEffect)this.get_store().find_element_user(INNERSHDW$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetInnerShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INNERSHDW$6) != 0;
      }
   }

   public void setInnerShdw(CTInnerShadowEffect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInnerShadowEffect var3 = null;
         var3 = (CTInnerShadowEffect)this.get_store().find_element_user(INNERSHDW$6, 0);
         if(var3 == null) {
            var3 = (CTInnerShadowEffect)this.get_store().add_element_user(INNERSHDW$6);
         }

         var3.set(var1);
      }
   }

   public CTInnerShadowEffect addNewInnerShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInnerShadowEffect var2 = null;
         var2 = (CTInnerShadowEffect)this.get_store().add_element_user(INNERSHDW$6);
         return var2;
      }
   }

   public void unsetInnerShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INNERSHDW$6, 0);
      }
   }

   public CTOuterShadowEffect getOuterShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOuterShadowEffect var2 = null;
         var2 = (CTOuterShadowEffect)this.get_store().find_element_user(OUTERSHDW$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOuterShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OUTERSHDW$8) != 0;
      }
   }

   public void setOuterShdw(CTOuterShadowEffect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOuterShadowEffect var3 = null;
         var3 = (CTOuterShadowEffect)this.get_store().find_element_user(OUTERSHDW$8, 0);
         if(var3 == null) {
            var3 = (CTOuterShadowEffect)this.get_store().add_element_user(OUTERSHDW$8);
         }

         var3.set(var1);
      }
   }

   public CTOuterShadowEffect addNewOuterShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOuterShadowEffect var2 = null;
         var2 = (CTOuterShadowEffect)this.get_store().add_element_user(OUTERSHDW$8);
         return var2;
      }
   }

   public void unsetOuterShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OUTERSHDW$8, 0);
      }
   }

   public CTPresetShadowEffect getPrstShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetShadowEffect var2 = null;
         var2 = (CTPresetShadowEffect)this.get_store().find_element_user(PRSTSHDW$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrstShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRSTSHDW$10) != 0;
      }
   }

   public void setPrstShdw(CTPresetShadowEffect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetShadowEffect var3 = null;
         var3 = (CTPresetShadowEffect)this.get_store().find_element_user(PRSTSHDW$10, 0);
         if(var3 == null) {
            var3 = (CTPresetShadowEffect)this.get_store().add_element_user(PRSTSHDW$10);
         }

         var3.set(var1);
      }
   }

   public CTPresetShadowEffect addNewPrstShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetShadowEffect var2 = null;
         var2 = (CTPresetShadowEffect)this.get_store().add_element_user(PRSTSHDW$10);
         return var2;
      }
   }

   public void unsetPrstShdw() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRSTSHDW$10, 0);
      }
   }

   public CTReflectionEffect getReflection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTReflectionEffect var2 = null;
         var2 = (CTReflectionEffect)this.get_store().find_element_user(REFLECTION$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetReflection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REFLECTION$12) != 0;
      }
   }

   public void setReflection(CTReflectionEffect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTReflectionEffect var3 = null;
         var3 = (CTReflectionEffect)this.get_store().find_element_user(REFLECTION$12, 0);
         if(var3 == null) {
            var3 = (CTReflectionEffect)this.get_store().add_element_user(REFLECTION$12);
         }

         var3.set(var1);
      }
   }

   public CTReflectionEffect addNewReflection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTReflectionEffect var2 = null;
         var2 = (CTReflectionEffect)this.get_store().add_element_user(REFLECTION$12);
         return var2;
      }
   }

   public void unsetReflection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REFLECTION$12, 0);
      }
   }

   public CTSoftEdgesEffect getSoftEdge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSoftEdgesEffect var2 = null;
         var2 = (CTSoftEdgesEffect)this.get_store().find_element_user(SOFTEDGE$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSoftEdge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SOFTEDGE$14) != 0;
      }
   }

   public void setSoftEdge(CTSoftEdgesEffect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSoftEdgesEffect var3 = null;
         var3 = (CTSoftEdgesEffect)this.get_store().find_element_user(SOFTEDGE$14, 0);
         if(var3 == null) {
            var3 = (CTSoftEdgesEffect)this.get_store().add_element_user(SOFTEDGE$14);
         }

         var3.set(var1);
      }
   }

   public CTSoftEdgesEffect addNewSoftEdge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSoftEdgesEffect var2 = null;
         var2 = (CTSoftEdgesEffect)this.get_store().add_element_user(SOFTEDGE$14);
         return var2;
      }
   }

   public void unsetSoftEdge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SOFTEDGE$14, 0);
      }
   }

}
