package org.apache.poi.xssf.usermodel.charts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Chart;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.apache.poi.ss.usermodel.charts.ScatterChartData;
import org.apache.poi.ss.usermodel.charts.ScatterChartSeries;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.apache.poi.xssf.usermodel.charts.AbstractXSSFChartSeries;
import org.apache.poi.xssf.usermodel.charts.XSSFChartUtil;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle;
import org.openxmlformats.schemas.drawingml.x2006.chart.STScatterStyle;

public class XSSFScatterChartData implements ScatterChartData {

   private List series = new ArrayList();


   public ScatterChartSeries addSerie(ChartDataSource xs, ChartDataSource ys) {
      if(!ys.isNumeric()) {
         throw new IllegalArgumentException("Y axis data source must be numeric.");
      } else {
         int numOfSeries = this.series.size();
         XSSFScatterChartData.Series newSerie = new XSSFScatterChartData.Series(numOfSeries, numOfSeries, xs, ys);
         this.series.add(newSerie);
         return newSerie;
      }
   }

   public void fillChart(Chart chart, ChartAxis ... axis) {
      if(!(chart instanceof XSSFChart)) {
         throw new IllegalArgumentException("Chart must be instance of XSSFChart");
      } else {
         XSSFChart xssfChart = (XSSFChart)chart;
         CTPlotArea plotArea = xssfChart.getCTChart().getPlotArea();
         CTScatterChart scatterChart = plotArea.addNewScatterChart();
         this.addStyle(scatterChart);
         Iterator arr$ = this.series.iterator();

         while(arr$.hasNext()) {
            XSSFScatterChartData.Series len$ = (XSSFScatterChartData.Series)arr$.next();
            len$.addToChart(scatterChart);
         }

         ChartAxis[] var10 = axis;
         int var11 = axis.length;

         for(int i$ = 0; i$ < var11; ++i$) {
            ChartAxis ax = var10[i$];
            scatterChart.addNewAxId().setVal(ax.getId());
         }

      }
   }

   public List getSeries() {
      return this.series;
   }

   private void addStyle(CTScatterChart ctScatterChart) {
      CTScatterStyle scatterStyle = ctScatterChart.addNewScatterStyle();
      scatterStyle.setVal(STScatterStyle.LINE_MARKER);
   }

   static class Series extends AbstractXSSFChartSeries implements ScatterChartSeries {

      private int id;
      private int order;
      private ChartDataSource xs;
      private ChartDataSource ys;


      protected Series(int id, int order, ChartDataSource xs, ChartDataSource ys) {
         this.id = id;
         this.order = order;
         this.xs = xs;
         this.ys = ys;
      }

      public ChartDataSource getXValues() {
         return this.xs;
      }

      public ChartDataSource getYValues() {
         return this.ys;
      }

      protected void addToChart(CTScatterChart ctScatterChart) {
         CTScatterSer scatterSer = ctScatterChart.addNewSer();
         scatterSer.addNewIdx().setVal((long)this.id);
         scatterSer.addNewOrder().setVal((long)this.order);
         CTAxDataSource xVal = scatterSer.addNewXVal();
         XSSFChartUtil.buildAxDataSource(xVal, this.xs);
         CTNumDataSource yVal = scatterSer.addNewYVal();
         XSSFChartUtil.buildNumDataSource(yVal, this.ys);
         if(this.isTitleSet()) {
            scatterSer.setTx(this.getCTSerTx());
         }

      }
   }
}
