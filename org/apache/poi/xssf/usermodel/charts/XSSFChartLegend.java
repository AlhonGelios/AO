package org.apache.poi.xssf.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.ChartLegend;
import org.apache.poi.ss.usermodel.charts.LegendPosition;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.apache.poi.xssf.usermodel.charts.XSSFManualLayout;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.STLegendPos;

public final class XSSFChartLegend implements ChartLegend {

   private CTLegend legend;


   public XSSFChartLegend(XSSFChart chart) {
      CTChart ctChart = chart.getCTChart();
      this.legend = ctChart.isSetLegend()?ctChart.getLegend():ctChart.addNewLegend();
      this.setDefaults();
   }

   private void setDefaults() {
      if(!this.legend.isSetOverlay()) {
         this.legend.addNewOverlay();
      }

      this.legend.getOverlay().setVal(false);
   }

   @Internal
   public CTLegend getCTLegend() {
      return this.legend;
   }

   public void setPosition(LegendPosition position) {
      if(!this.legend.isSetLegendPos()) {
         this.legend.addNewLegendPos();
      }

      this.legend.getLegendPos().setVal(this.fromLegendPosition(position));
   }

   public LegendPosition getPosition() {
      return this.legend.isSetLegendPos()?this.toLegendPosition(this.legend.getLegendPos()):LegendPosition.RIGHT;
   }

   public XSSFManualLayout getManualLayout() {
      if(!this.legend.isSetLayout()) {
         this.legend.addNewLayout();
      }

      return new XSSFManualLayout(this.legend.getLayout());
   }

   public boolean isOverlay() {
      return this.legend.getOverlay().getVal();
   }

   public void setOverlay(boolean value) {
      this.legend.getOverlay().setVal(value);
   }

   private STLegendPos.Enum fromLegendPosition(LegendPosition position) {
      switch(XSSFChartLegend.NamelessClass1432704672.$SwitchMap$org$apache$poi$ss$usermodel$charts$LegendPosition[position.ordinal()]) {
      case 1:
         return STLegendPos.B;
      case 2:
         return STLegendPos.L;
      case 3:
         return STLegendPos.R;
      case 4:
         return STLegendPos.T;
      case 5:
         return STLegendPos.TR;
      default:
         throw new IllegalArgumentException();
      }
   }

   private LegendPosition toLegendPosition(CTLegendPos ctLegendPos) {
      switch(ctLegendPos.getVal().intValue()) {
      case 1:
         return LegendPosition.BOTTOM;
      case 2:
         return LegendPosition.TOP_RIGHT;
      case 3:
         return LegendPosition.LEFT;
      case 4:
         return LegendPosition.RIGHT;
      case 5:
         return LegendPosition.TOP;
      default:
         throw new IllegalArgumentException();
      }
   }

   // $FF: synthetic class
   static class NamelessClass1432704672 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$charts$LegendPosition = new int[LegendPosition.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$LegendPosition[LegendPosition.BOTTOM.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$LegendPosition[LegendPosition.LEFT.ordinal()] = 2;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$LegendPosition[LegendPosition.RIGHT.ordinal()] = 3;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$LegendPosition[LegendPosition.TOP.ordinal()] = 4;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$LegendPosition[LegendPosition.TOP_RIGHT.ordinal()] = 5;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
