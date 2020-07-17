package org.apache.poi.xssf.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.LayoutMode;
import org.apache.poi.ss.usermodel.charts.LayoutTarget;
import org.apache.poi.ss.usermodel.charts.ManualLayout;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutMode;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayoutTarget;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTManualLayout;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea;
import org.openxmlformats.schemas.drawingml.x2006.chart.STLayoutMode;
import org.openxmlformats.schemas.drawingml.x2006.chart.STLayoutTarget;

public final class XSSFManualLayout implements ManualLayout {

   private CTManualLayout layout;
   private static final LayoutMode defaultLayoutMode = LayoutMode.EDGE;
   private static final LayoutTarget defaultLayoutTarget = LayoutTarget.INNER;


   public XSSFManualLayout(CTLayout ctLayout) {
      this.initLayout(ctLayout);
   }

   public XSSFManualLayout(XSSFChart chart) {
      CTPlotArea ctPlotArea = chart.getCTChart().getPlotArea();
      CTLayout ctLayout = ctPlotArea.isSetLayout()?ctPlotArea.getLayout():ctPlotArea.addNewLayout();
      this.initLayout(ctLayout);
   }

   @Internal
   public CTManualLayout getCTManualLayout() {
      return this.layout;
   }

   public void setWidthRatio(double ratio) {
      if(!this.layout.isSetW()) {
         this.layout.addNewW();
      }

      this.layout.getW().setVal(ratio);
   }

   public double getWidthRatio() {
      return !this.layout.isSetW()?0.0D:this.layout.getW().getVal();
   }

   public void setHeightRatio(double ratio) {
      if(!this.layout.isSetH()) {
         this.layout.addNewH();
      }

      this.layout.getH().setVal(ratio);
   }

   public double getHeightRatio() {
      return !this.layout.isSetH()?0.0D:this.layout.getH().getVal();
   }

   public LayoutTarget getTarget() {
      return !this.layout.isSetLayoutTarget()?defaultLayoutTarget:this.toLayoutTarget(this.layout.getLayoutTarget());
   }

   public void setTarget(LayoutTarget target) {
      if(!this.layout.isSetLayoutTarget()) {
         this.layout.addNewLayoutTarget();
      }

      this.layout.getLayoutTarget().setVal(this.fromLayoutTarget(target));
   }

   public LayoutMode getXMode() {
      return !this.layout.isSetXMode()?defaultLayoutMode:this.toLayoutMode(this.layout.getXMode());
   }

   public void setXMode(LayoutMode mode) {
      if(!this.layout.isSetXMode()) {
         this.layout.addNewXMode();
      }

      this.layout.getXMode().setVal(this.fromLayoutMode(mode));
   }

   public LayoutMode getYMode() {
      return !this.layout.isSetYMode()?defaultLayoutMode:this.toLayoutMode(this.layout.getYMode());
   }

   public void setYMode(LayoutMode mode) {
      if(!this.layout.isSetYMode()) {
         this.layout.addNewYMode();
      }

      this.layout.getYMode().setVal(this.fromLayoutMode(mode));
   }

   public double getX() {
      return !this.layout.isSetX()?0.0D:this.layout.getX().getVal();
   }

   public void setX(double x) {
      if(!this.layout.isSetX()) {
         this.layout.addNewX();
      }

      this.layout.getX().setVal(x);
   }

   public double getY() {
      return !this.layout.isSetY()?0.0D:this.layout.getY().getVal();
   }

   public void setY(double y) {
      if(!this.layout.isSetY()) {
         this.layout.addNewY();
      }

      this.layout.getY().setVal(y);
   }

   public LayoutMode getWidthMode() {
      return !this.layout.isSetWMode()?defaultLayoutMode:this.toLayoutMode(this.layout.getWMode());
   }

   public void setWidthMode(LayoutMode mode) {
      if(!this.layout.isSetWMode()) {
         this.layout.addNewWMode();
      }

      this.layout.getWMode().setVal(this.fromLayoutMode(mode));
   }

   public LayoutMode getHeightMode() {
      return !this.layout.isSetHMode()?defaultLayoutMode:this.toLayoutMode(this.layout.getHMode());
   }

   public void setHeightMode(LayoutMode mode) {
      if(!this.layout.isSetHMode()) {
         this.layout.addNewHMode();
      }

      this.layout.getHMode().setVal(this.fromLayoutMode(mode));
   }

   private void initLayout(CTLayout ctLayout) {
      if(ctLayout.isSetManualLayout()) {
         this.layout = ctLayout.getManualLayout();
      } else {
         this.layout = ctLayout.addNewManualLayout();
      }

   }

   private STLayoutMode.Enum fromLayoutMode(LayoutMode mode) {
      switch(XSSFManualLayout.NamelessClass1364547426.$SwitchMap$org$apache$poi$ss$usermodel$charts$LayoutMode[mode.ordinal()]) {
      case 1:
         return STLayoutMode.EDGE;
      case 2:
         return STLayoutMode.FACTOR;
      default:
         throw new IllegalArgumentException();
      }
   }

   private LayoutMode toLayoutMode(CTLayoutMode ctLayoutMode) {
      switch(ctLayoutMode.getVal().intValue()) {
      case 1:
         return LayoutMode.EDGE;
      case 2:
         return LayoutMode.FACTOR;
      default:
         throw new IllegalArgumentException();
      }
   }

   private STLayoutTarget.Enum fromLayoutTarget(LayoutTarget target) {
      switch(XSSFManualLayout.NamelessClass1364547426.$SwitchMap$org$apache$poi$ss$usermodel$charts$LayoutTarget[target.ordinal()]) {
      case 1:
         return STLayoutTarget.INNER;
      case 2:
         return STLayoutTarget.OUTER;
      default:
         throw new IllegalArgumentException();
      }
   }

   private LayoutTarget toLayoutTarget(CTLayoutTarget ctLayoutTarget) {
      switch(ctLayoutTarget.getVal().intValue()) {
      case 1:
         return LayoutTarget.INNER;
      case 2:
         return LayoutTarget.OUTER;
      default:
         throw new IllegalArgumentException();
      }
   }


   // $FF: synthetic class
   static class NamelessClass1364547426 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$charts$LayoutMode;
      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$charts$LayoutTarget = new int[LayoutTarget.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$LayoutTarget[LayoutTarget.INNER.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$LayoutTarget[LayoutTarget.OUTER.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         $SwitchMap$org$apache$poi$ss$usermodel$charts$LayoutMode = new int[LayoutMode.values().length];

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$LayoutMode[LayoutMode.EDGE.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$LayoutMode[LayoutMode.FACTOR.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
