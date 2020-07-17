package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D;

public class CTChartImpl extends XmlComplexContentImpl implements CTChart {

   private static final QName TITLE$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "title");
   private static final QName AUTOTITLEDELETED$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "autoTitleDeleted");
   private static final QName PIVOTFMTS$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pivotFmts");
   private static final QName VIEW3D$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "view3D");
   private static final QName FLOOR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "floor");
   private static final QName SIDEWALL$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "sideWall");
   private static final QName BACKWALL$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "backWall");
   private static final QName PLOTAREA$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "plotArea");
   private static final QName LEGEND$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "legend");
   private static final QName PLOTVISONLY$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "plotVisOnly");
   private static final QName DISPBLANKSAS$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dispBlanksAs");
   private static final QName SHOWDLBLSOVERMAX$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "showDLblsOverMax");
   private static final QName EXTLST$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTChartImpl(SchemaType var1) {
      super(var1);
   }

   public CTTitle getTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTitle var2 = null;
         var2 = (CTTitle)this.get_store().find_element_user(TITLE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TITLE$0) != 0;
      }
   }

   public void setTitle(CTTitle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTitle var3 = null;
         var3 = (CTTitle)this.get_store().find_element_user(TITLE$0, 0);
         if(var3 == null) {
            var3 = (CTTitle)this.get_store().add_element_user(TITLE$0);
         }

         var3.set(var1);
      }
   }

   public CTTitle addNewTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTitle var2 = null;
         var2 = (CTTitle)this.get_store().add_element_user(TITLE$0);
         return var2;
      }
   }

   public void unsetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TITLE$0, 0);
      }
   }

   public CTBoolean getAutoTitleDeleted() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(AUTOTITLEDELETED$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAutoTitleDeleted() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOTITLEDELETED$2) != 0;
      }
   }

   public void setAutoTitleDeleted(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(AUTOTITLEDELETED$2, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(AUTOTITLEDELETED$2);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewAutoTitleDeleted() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(AUTOTITLEDELETED$2);
         return var2;
      }
   }

   public void unsetAutoTitleDeleted() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOTITLEDELETED$2, 0);
      }
   }

   public CTPivotFmts getPivotFmts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotFmts var2 = null;
         var2 = (CTPivotFmts)this.get_store().find_element_user(PIVOTFMTS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPivotFmts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIVOTFMTS$4) != 0;
      }
   }

   public void setPivotFmts(CTPivotFmts var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotFmts var3 = null;
         var3 = (CTPivotFmts)this.get_store().find_element_user(PIVOTFMTS$4, 0);
         if(var3 == null) {
            var3 = (CTPivotFmts)this.get_store().add_element_user(PIVOTFMTS$4);
         }

         var3.set(var1);
      }
   }

   public CTPivotFmts addNewPivotFmts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotFmts var2 = null;
         var2 = (CTPivotFmts)this.get_store().add_element_user(PIVOTFMTS$4);
         return var2;
      }
   }

   public void unsetPivotFmts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIVOTFMTS$4, 0);
      }
   }

   public CTView3D getView3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTView3D var2 = null;
         var2 = (CTView3D)this.get_store().find_element_user(VIEW3D$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetView3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VIEW3D$6) != 0;
      }
   }

   public void setView3D(CTView3D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTView3D var3 = null;
         var3 = (CTView3D)this.get_store().find_element_user(VIEW3D$6, 0);
         if(var3 == null) {
            var3 = (CTView3D)this.get_store().add_element_user(VIEW3D$6);
         }

         var3.set(var1);
      }
   }

   public CTView3D addNewView3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTView3D var2 = null;
         var2 = (CTView3D)this.get_store().add_element_user(VIEW3D$6);
         return var2;
      }
   }

   public void unsetView3D() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VIEW3D$6, 0);
      }
   }

   public CTSurface getFloor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface var2 = null;
         var2 = (CTSurface)this.get_store().find_element_user(FLOOR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFloor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FLOOR$8) != 0;
      }
   }

   public void setFloor(CTSurface var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface var3 = null;
         var3 = (CTSurface)this.get_store().find_element_user(FLOOR$8, 0);
         if(var3 == null) {
            var3 = (CTSurface)this.get_store().add_element_user(FLOOR$8);
         }

         var3.set(var1);
      }
   }

   public CTSurface addNewFloor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface var2 = null;
         var2 = (CTSurface)this.get_store().add_element_user(FLOOR$8);
         return var2;
      }
   }

   public void unsetFloor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FLOOR$8, 0);
      }
   }

   public CTSurface getSideWall() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface var2 = null;
         var2 = (CTSurface)this.get_store().find_element_user(SIDEWALL$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSideWall() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIDEWALL$10) != 0;
      }
   }

   public void setSideWall(CTSurface var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface var3 = null;
         var3 = (CTSurface)this.get_store().find_element_user(SIDEWALL$10, 0);
         if(var3 == null) {
            var3 = (CTSurface)this.get_store().add_element_user(SIDEWALL$10);
         }

         var3.set(var1);
      }
   }

   public CTSurface addNewSideWall() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface var2 = null;
         var2 = (CTSurface)this.get_store().add_element_user(SIDEWALL$10);
         return var2;
      }
   }

   public void unsetSideWall() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIDEWALL$10, 0);
      }
   }

   public CTSurface getBackWall() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface var2 = null;
         var2 = (CTSurface)this.get_store().find_element_user(BACKWALL$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBackWall() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BACKWALL$12) != 0;
      }
   }

   public void setBackWall(CTSurface var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface var3 = null;
         var3 = (CTSurface)this.get_store().find_element_user(BACKWALL$12, 0);
         if(var3 == null) {
            var3 = (CTSurface)this.get_store().add_element_user(BACKWALL$12);
         }

         var3.set(var1);
      }
   }

   public CTSurface addNewBackWall() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface var2 = null;
         var2 = (CTSurface)this.get_store().add_element_user(BACKWALL$12);
         return var2;
      }
   }

   public void unsetBackWall() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BACKWALL$12, 0);
      }
   }

   public CTPlotArea getPlotArea() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPlotArea var2 = null;
         var2 = (CTPlotArea)this.get_store().find_element_user(PLOTAREA$14, 0);
         return var2 == null?null:var2;
      }
   }

   public void setPlotArea(CTPlotArea var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPlotArea var3 = null;
         var3 = (CTPlotArea)this.get_store().find_element_user(PLOTAREA$14, 0);
         if(var3 == null) {
            var3 = (CTPlotArea)this.get_store().add_element_user(PLOTAREA$14);
         }

         var3.set(var1);
      }
   }

   public CTPlotArea addNewPlotArea() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPlotArea var2 = null;
         var2 = (CTPlotArea)this.get_store().add_element_user(PLOTAREA$14);
         return var2;
      }
   }

   public CTLegend getLegend() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegend var2 = null;
         var2 = (CTLegend)this.get_store().find_element_user(LEGEND$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLegend() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGEND$16) != 0;
      }
   }

   public void setLegend(CTLegend var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegend var3 = null;
         var3 = (CTLegend)this.get_store().find_element_user(LEGEND$16, 0);
         if(var3 == null) {
            var3 = (CTLegend)this.get_store().add_element_user(LEGEND$16);
         }

         var3.set(var1);
      }
   }

   public CTLegend addNewLegend() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegend var2 = null;
         var2 = (CTLegend)this.get_store().add_element_user(LEGEND$16);
         return var2;
      }
   }

   public void unsetLegend() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGEND$16, 0);
      }
   }

   public CTBoolean getPlotVisOnly() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(PLOTVISONLY$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPlotVisOnly() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PLOTVISONLY$18) != 0;
      }
   }

   public void setPlotVisOnly(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(PLOTVISONLY$18, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(PLOTVISONLY$18);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewPlotVisOnly() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(PLOTVISONLY$18);
         return var2;
      }
   }

   public void unsetPlotVisOnly() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PLOTVISONLY$18, 0);
      }
   }

   public CTDispBlanksAs getDispBlanksAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDispBlanksAs var2 = null;
         var2 = (CTDispBlanksAs)this.get_store().find_element_user(DISPBLANKSAS$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDispBlanksAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DISPBLANKSAS$20) != 0;
      }
   }

   public void setDispBlanksAs(CTDispBlanksAs var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDispBlanksAs var3 = null;
         var3 = (CTDispBlanksAs)this.get_store().find_element_user(DISPBLANKSAS$20, 0);
         if(var3 == null) {
            var3 = (CTDispBlanksAs)this.get_store().add_element_user(DISPBLANKSAS$20);
         }

         var3.set(var1);
      }
   }

   public CTDispBlanksAs addNewDispBlanksAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDispBlanksAs var2 = null;
         var2 = (CTDispBlanksAs)this.get_store().add_element_user(DISPBLANKSAS$20);
         return var2;
      }
   }

   public void unsetDispBlanksAs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DISPBLANKSAS$20, 0);
      }
   }

   public CTBoolean getShowDLblsOverMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().find_element_user(SHOWDLBLSOVERMAX$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShowDLblsOverMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHOWDLBLSOVERMAX$22) != 0;
      }
   }

   public void setShowDLblsOverMax(CTBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(SHOWDLBLSOVERMAX$22, 0);
         if(var3 == null) {
            var3 = (CTBoolean)this.get_store().add_element_user(SHOWDLBLSOVERMAX$22);
         }

         var3.set(var1);
      }
   }

   public CTBoolean addNewShowDLblsOverMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(SHOWDLBLSOVERMAX$22);
         return var2;
      }
   }

   public void unsetShowDLblsOverMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHOWDLBLSOVERMAX$22, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$24) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$24, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$24);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$24);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$24, 0);
      }
   }

}
