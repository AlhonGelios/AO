package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTManualLayout;

public class CTManualLayoutImpl extends XmlComplexContentImpl implements CTManualLayout {

   private static final QName LAYOUTTARGET$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "layoutTarget");
   private static final QName XMODE$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "xMode");
   private static final QName YMODE$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "yMode");
   private static final QName WMODE$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "wMode");
   private static final QName HMODE$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "hMode");
   private static final QName X$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "x");
   private static final QName Y$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "y");
   private static final QName W$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "w");
   private static final QName H$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "h");
   private static final QName EXTLST$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTManualLayoutImpl(SchemaType var1) {
      super(var1);
   }

   public CTLayoutTarget getLayoutTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutTarget var2 = null;
         var2 = (CTLayoutTarget)this.get_store().find_element_user(LAYOUTTARGET$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLayoutTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LAYOUTTARGET$0) != 0;
      }
   }

   public void setLayoutTarget(CTLayoutTarget var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutTarget var3 = null;
         var3 = (CTLayoutTarget)this.get_store().find_element_user(LAYOUTTARGET$0, 0);
         if(var3 == null) {
            var3 = (CTLayoutTarget)this.get_store().add_element_user(LAYOUTTARGET$0);
         }

         var3.set(var1);
      }
   }

   public CTLayoutTarget addNewLayoutTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutTarget var2 = null;
         var2 = (CTLayoutTarget)this.get_store().add_element_user(LAYOUTTARGET$0);
         return var2;
      }
   }

   public void unsetLayoutTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LAYOUTTARGET$0, 0);
      }
   }

   public CTLayoutMode getXMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var2 = null;
         var2 = (CTLayoutMode)this.get_store().find_element_user(XMODE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetXMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(XMODE$2) != 0;
      }
   }

   public void setXMode(CTLayoutMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var3 = null;
         var3 = (CTLayoutMode)this.get_store().find_element_user(XMODE$2, 0);
         if(var3 == null) {
            var3 = (CTLayoutMode)this.get_store().add_element_user(XMODE$2);
         }

         var3.set(var1);
      }
   }

   public CTLayoutMode addNewXMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var2 = null;
         var2 = (CTLayoutMode)this.get_store().add_element_user(XMODE$2);
         return var2;
      }
   }

   public void unsetXMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(XMODE$2, 0);
      }
   }

   public CTLayoutMode getYMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var2 = null;
         var2 = (CTLayoutMode)this.get_store().find_element_user(YMODE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetYMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(YMODE$4) != 0;
      }
   }

   public void setYMode(CTLayoutMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var3 = null;
         var3 = (CTLayoutMode)this.get_store().find_element_user(YMODE$4, 0);
         if(var3 == null) {
            var3 = (CTLayoutMode)this.get_store().add_element_user(YMODE$4);
         }

         var3.set(var1);
      }
   }

   public CTLayoutMode addNewYMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var2 = null;
         var2 = (CTLayoutMode)this.get_store().add_element_user(YMODE$4);
         return var2;
      }
   }

   public void unsetYMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(YMODE$4, 0);
      }
   }

   public CTLayoutMode getWMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var2 = null;
         var2 = (CTLayoutMode)this.get_store().find_element_user(WMODE$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WMODE$6) != 0;
      }
   }

   public void setWMode(CTLayoutMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var3 = null;
         var3 = (CTLayoutMode)this.get_store().find_element_user(WMODE$6, 0);
         if(var3 == null) {
            var3 = (CTLayoutMode)this.get_store().add_element_user(WMODE$6);
         }

         var3.set(var1);
      }
   }

   public CTLayoutMode addNewWMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var2 = null;
         var2 = (CTLayoutMode)this.get_store().add_element_user(WMODE$6);
         return var2;
      }
   }

   public void unsetWMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WMODE$6, 0);
      }
   }

   public CTLayoutMode getHMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var2 = null;
         var2 = (CTLayoutMode)this.get_store().find_element_user(HMODE$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HMODE$8) != 0;
      }
   }

   public void setHMode(CTLayoutMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var3 = null;
         var3 = (CTLayoutMode)this.get_store().find_element_user(HMODE$8, 0);
         if(var3 == null) {
            var3 = (CTLayoutMode)this.get_store().add_element_user(HMODE$8);
         }

         var3.set(var1);
      }
   }

   public CTLayoutMode addNewHMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayoutMode var2 = null;
         var2 = (CTLayoutMode)this.get_store().add_element_user(HMODE$8);
         return var2;
      }
   }

   public void unsetHMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HMODE$8, 0);
      }
   }

   public CTDouble getX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().find_element_user(X$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(X$10) != 0;
      }
   }

   public void setX(CTDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var3 = null;
         var3 = (CTDouble)this.get_store().find_element_user(X$10, 0);
         if(var3 == null) {
            var3 = (CTDouble)this.get_store().add_element_user(X$10);
         }

         var3.set(var1);
      }
   }

   public CTDouble addNewX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().add_element_user(X$10);
         return var2;
      }
   }

   public void unsetX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(X$10, 0);
      }
   }

   public CTDouble getY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().find_element_user(Y$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(Y$12) != 0;
      }
   }

   public void setY(CTDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var3 = null;
         var3 = (CTDouble)this.get_store().find_element_user(Y$12, 0);
         if(var3 == null) {
            var3 = (CTDouble)this.get_store().add_element_user(Y$12);
         }

         var3.set(var1);
      }
   }

   public CTDouble addNewY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().add_element_user(Y$12);
         return var2;
      }
   }

   public void unsetY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(Y$12, 0);
      }
   }

   public CTDouble getW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().find_element_user(W$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(W$14) != 0;
      }
   }

   public void setW(CTDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var3 = null;
         var3 = (CTDouble)this.get_store().find_element_user(W$14, 0);
         if(var3 == null) {
            var3 = (CTDouble)this.get_store().add_element_user(W$14);
         }

         var3.set(var1);
      }
   }

   public CTDouble addNewW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().add_element_user(W$14);
         return var2;
      }
   }

   public void unsetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(W$14, 0);
      }
   }

   public CTDouble getH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().find_element_user(H$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(H$16) != 0;
      }
   }

   public void setH(CTDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var3 = null;
         var3 = (CTDouble)this.get_store().find_element_user(H$16, 0);
         if(var3 == null) {
            var3 = (CTDouble)this.get_store().add_element_user(H$16);
         }

         var3.set(var1);
      }
   }

   public CTDouble addNewH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().add_element_user(H$16);
         return var2;
      }
   }

   public void unsetH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(H$16, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$18) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$18, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$18);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$18);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$18, 0);
      }
   }

}
