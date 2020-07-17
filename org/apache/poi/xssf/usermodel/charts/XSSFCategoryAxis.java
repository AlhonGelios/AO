package org.apache.poi.xssf.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.AxisCrosses;
import org.apache.poi.ss.usermodel.charts.AxisOrientation;
import org.apache.poi.ss.usermodel.charts.AxisPosition;
import org.apache.poi.ss.usermodel.charts.AxisTickMark;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.apache.poi.xssf.usermodel.charts.XSSFChartAxis;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark;
import org.openxmlformats.schemas.drawingml.x2006.chart.STTickLblPos;

public class XSSFCategoryAxis extends XSSFChartAxis {

   private CTCatAx ctCatAx;


   public XSSFCategoryAxis(XSSFChart chart, long id, AxisPosition pos) {
      super(chart);
      this.createAxis(id, pos);
   }

   public XSSFCategoryAxis(XSSFChart chart, CTCatAx ctCatAx) {
      super(chart);
      this.ctCatAx = ctCatAx;
   }

   public long getId() {
      return this.ctCatAx.getAxId().getVal();
   }

   protected CTAxPos getCTAxPos() {
      return this.ctCatAx.getAxPos();
   }

   protected CTNumFmt getCTNumFmt() {
      return this.ctCatAx.isSetNumFmt()?this.ctCatAx.getNumFmt():this.ctCatAx.addNewNumFmt();
   }

   protected CTScaling getCTScaling() {
      return this.ctCatAx.getScaling();
   }

   protected CTCrosses getCTCrosses() {
      return this.ctCatAx.getCrosses();
   }

   protected CTBoolean getDelete() {
      return this.ctCatAx.getDelete();
   }

   protected CTTickMark getMajorCTTickMark() {
      return this.ctCatAx.getMajorTickMark();
   }

   protected CTTickMark getMinorCTTickMark() {
      return this.ctCatAx.getMinorTickMark();
   }

   public void crossAxis(ChartAxis axis) {
      this.ctCatAx.getCrossAx().setVal(axis.getId());
   }

   private void createAxis(long id, AxisPosition pos) {
      this.ctCatAx = this.chart.getCTChart().getPlotArea().addNewCatAx();
      this.ctCatAx.addNewAxId().setVal(id);
      this.ctCatAx.addNewAxPos();
      this.ctCatAx.addNewScaling();
      this.ctCatAx.addNewCrosses();
      this.ctCatAx.addNewCrossAx();
      this.ctCatAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
      this.ctCatAx.addNewDelete();
      this.ctCatAx.addNewMajorTickMark();
      this.ctCatAx.addNewMinorTickMark();
      this.setPosition(pos);
      this.setOrientation(AxisOrientation.MIN_MAX);
      this.setCrosses(AxisCrosses.AUTO_ZERO);
      this.setVisible(true);
      this.setMajorTickMark(AxisTickMark.CROSS);
      this.setMinorTickMark(AxisTickMark.NONE);
   }
}
