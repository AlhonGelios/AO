package org.apache.poi.xssf.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.AxisCrossBetween;
import org.apache.poi.ss.usermodel.charts.AxisCrosses;
import org.apache.poi.ss.usermodel.charts.AxisOrientation;
import org.apache.poi.ss.usermodel.charts.AxisPosition;
import org.apache.poi.ss.usermodel.charts.AxisTickMark;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.ss.usermodel.charts.ValueAxis;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.apache.poi.xssf.usermodel.charts.XSSFChartAxis;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.STCrossBetween;
import org.openxmlformats.schemas.drawingml.x2006.chart.STTickLblPos;

public class XSSFValueAxis extends XSSFChartAxis implements ValueAxis {

   private CTValAx ctValAx;


   public XSSFValueAxis(XSSFChart chart, long id, AxisPosition pos) {
      super(chart);
      this.createAxis(id, pos);
   }

   public XSSFValueAxis(XSSFChart chart, CTValAx ctValAx) {
      super(chart);
      this.ctValAx = ctValAx;
   }

   public long getId() {
      return this.ctValAx.getAxId().getVal();
   }

   public void setCrossBetween(AxisCrossBetween crossBetween) {
      this.ctValAx.getCrossBetween().setVal(fromCrossBetween(crossBetween));
   }

   public AxisCrossBetween getCrossBetween() {
      return toCrossBetween(this.ctValAx.getCrossBetween().getVal());
   }

   protected CTAxPos getCTAxPos() {
      return this.ctValAx.getAxPos();
   }

   protected CTNumFmt getCTNumFmt() {
      return this.ctValAx.isSetNumFmt()?this.ctValAx.getNumFmt():this.ctValAx.addNewNumFmt();
   }

   protected CTScaling getCTScaling() {
      return this.ctValAx.getScaling();
   }

   protected CTCrosses getCTCrosses() {
      return this.ctValAx.getCrosses();
   }

   protected CTBoolean getDelete() {
      return this.ctValAx.getDelete();
   }

   protected CTTickMark getMajorCTTickMark() {
      return this.ctValAx.getMajorTickMark();
   }

   protected CTTickMark getMinorCTTickMark() {
      return this.ctValAx.getMinorTickMark();
   }

   public void crossAxis(ChartAxis axis) {
      this.ctValAx.getCrossAx().setVal(axis.getId());
   }

   private void createAxis(long id, AxisPosition pos) {
      this.ctValAx = this.chart.getCTChart().getPlotArea().addNewValAx();
      this.ctValAx.addNewAxId().setVal(id);
      this.ctValAx.addNewAxPos();
      this.ctValAx.addNewScaling();
      this.ctValAx.addNewCrossBetween();
      this.ctValAx.addNewCrosses();
      this.ctValAx.addNewCrossAx();
      this.ctValAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
      this.ctValAx.addNewDelete();
      this.ctValAx.addNewMajorTickMark();
      this.ctValAx.addNewMinorTickMark();
      this.setPosition(pos);
      this.setOrientation(AxisOrientation.MIN_MAX);
      this.setCrossBetween(AxisCrossBetween.MIDPOINT_CATEGORY);
      this.setCrosses(AxisCrosses.AUTO_ZERO);
      this.setVisible(true);
      this.setMajorTickMark(AxisTickMark.CROSS);
      this.setMinorTickMark(AxisTickMark.NONE);
   }

   private static STCrossBetween.Enum fromCrossBetween(AxisCrossBetween crossBetween) {
      switch(XSSFValueAxis.NamelessClass2121569461.$SwitchMap$org$apache$poi$ss$usermodel$charts$AxisCrossBetween[crossBetween.ordinal()]) {
      case 1:
         return STCrossBetween.BETWEEN;
      case 2:
         return STCrossBetween.MID_CAT;
      default:
         throw new IllegalArgumentException();
      }
   }

   private static AxisCrossBetween toCrossBetween(STCrossBetween.Enum ctCrossBetween) {
      switch(ctCrossBetween.intValue()) {
      case 1:
         return AxisCrossBetween.BETWEEN;
      case 2:
         return AxisCrossBetween.MIDPOINT_CATEGORY;
      default:
         throw new IllegalArgumentException();
      }
   }

   // $FF: synthetic class
   static class NamelessClass2121569461 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisCrossBetween = new int[AxisCrossBetween.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisCrossBetween[AxisCrossBetween.BETWEEN.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$charts$AxisCrossBetween[AxisCrossBetween.MIDPOINT_CATEGORY.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
