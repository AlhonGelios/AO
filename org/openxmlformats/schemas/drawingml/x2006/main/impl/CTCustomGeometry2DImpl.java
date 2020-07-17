package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSiteList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList;

public class CTCustomGeometry2DImpl extends XmlComplexContentImpl implements CTCustomGeometry2D {

   private static final QName AVLST$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "avLst");
   private static final QName GDLST$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gdLst");
   private static final QName AHLST$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ahLst");
   private static final QName CXNLST$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cxnLst");
   private static final QName RECT$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "rect");
   private static final QName PATHLST$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pathLst");


   public CTCustomGeometry2DImpl(SchemaType var1) {
      super(var1);
   }

   public CTGeomGuideList getAvLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuideList var2 = null;
         var2 = (CTGeomGuideList)this.get_store().find_element_user(AVLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAvLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AVLST$0) != 0;
      }
   }

   public void setAvLst(CTGeomGuideList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuideList var3 = null;
         var3 = (CTGeomGuideList)this.get_store().find_element_user(AVLST$0, 0);
         if(var3 == null) {
            var3 = (CTGeomGuideList)this.get_store().add_element_user(AVLST$0);
         }

         var3.set(var1);
      }
   }

   public CTGeomGuideList addNewAvLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuideList var2 = null;
         var2 = (CTGeomGuideList)this.get_store().add_element_user(AVLST$0);
         return var2;
      }
   }

   public void unsetAvLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AVLST$0, 0);
      }
   }

   public CTGeomGuideList getGdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuideList var2 = null;
         var2 = (CTGeomGuideList)this.get_store().find_element_user(GDLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GDLST$2) != 0;
      }
   }

   public void setGdLst(CTGeomGuideList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuideList var3 = null;
         var3 = (CTGeomGuideList)this.get_store().find_element_user(GDLST$2, 0);
         if(var3 == null) {
            var3 = (CTGeomGuideList)this.get_store().add_element_user(GDLST$2);
         }

         var3.set(var1);
      }
   }

   public CTGeomGuideList addNewGdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuideList var2 = null;
         var2 = (CTGeomGuideList)this.get_store().add_element_user(GDLST$2);
         return var2;
      }
   }

   public void unsetGdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GDLST$2, 0);
      }
   }

   public CTAdjustHandleList getAhLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAdjustHandleList var2 = null;
         var2 = (CTAdjustHandleList)this.get_store().find_element_user(AHLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAhLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AHLST$4) != 0;
      }
   }

   public void setAhLst(CTAdjustHandleList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAdjustHandleList var3 = null;
         var3 = (CTAdjustHandleList)this.get_store().find_element_user(AHLST$4, 0);
         if(var3 == null) {
            var3 = (CTAdjustHandleList)this.get_store().add_element_user(AHLST$4);
         }

         var3.set(var1);
      }
   }

   public CTAdjustHandleList addNewAhLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAdjustHandleList var2 = null;
         var2 = (CTAdjustHandleList)this.get_store().add_element_user(AHLST$4);
         return var2;
      }
   }

   public void unsetAhLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AHLST$4, 0);
      }
   }

   public CTConnectionSiteList getCxnLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectionSiteList var2 = null;
         var2 = (CTConnectionSiteList)this.get_store().find_element_user(CXNLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCxnLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CXNLST$6) != 0;
      }
   }

   public void setCxnLst(CTConnectionSiteList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectionSiteList var3 = null;
         var3 = (CTConnectionSiteList)this.get_store().find_element_user(CXNLST$6, 0);
         if(var3 == null) {
            var3 = (CTConnectionSiteList)this.get_store().add_element_user(CXNLST$6);
         }

         var3.set(var1);
      }
   }

   public CTConnectionSiteList addNewCxnLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectionSiteList var2 = null;
         var2 = (CTConnectionSiteList)this.get_store().add_element_user(CXNLST$6);
         return var2;
      }
   }

   public void unsetCxnLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CXNLST$6, 0);
      }
   }

   public CTGeomRect getRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomRect var2 = null;
         var2 = (CTGeomRect)this.get_store().find_element_user(RECT$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RECT$8) != 0;
      }
   }

   public void setRect(CTGeomRect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomRect var3 = null;
         var3 = (CTGeomRect)this.get_store().find_element_user(RECT$8, 0);
         if(var3 == null) {
            var3 = (CTGeomRect)this.get_store().add_element_user(RECT$8);
         }

         var3.set(var1);
      }
   }

   public CTGeomRect addNewRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomRect var2 = null;
         var2 = (CTGeomRect)this.get_store().add_element_user(RECT$8);
         return var2;
      }
   }

   public void unsetRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RECT$8, 0);
      }
   }

   public CTPath2DList getPathLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DList var2 = null;
         var2 = (CTPath2DList)this.get_store().find_element_user(PATHLST$10, 0);
         return var2 == null?null:var2;
      }
   }

   public void setPathLst(CTPath2DList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DList var3 = null;
         var3 = (CTPath2DList)this.get_store().find_element_user(PATHLST$10, 0);
         if(var3 == null) {
            var3 = (CTPath2DList)this.get_store().add_element_user(PATHLST$10);
         }

         var3.set(var1);
      }
   }

   public CTPath2DList addNewPathLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath2DList var2 = null;
         var2 = (CTPath2DList)this.get_store().add_element_user(PATHLST$10);
         return var2;
      }
   }

}
