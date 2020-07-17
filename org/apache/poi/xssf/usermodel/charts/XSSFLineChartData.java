package org.apache.poi.xssf.usermodel.charts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Chart;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.apache.poi.ss.usermodel.charts.LineChartData;
import org.apache.poi.ss.usermodel.charts.LineChartSeries;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.apache.poi.xssf.usermodel.charts.AbstractXSSFChartSeries;
import org.apache.poi.xssf.usermodel.charts.XSSFChartUtil;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea;
import org.openxmlformats.schemas.drawingml.x2006.chart.STMarkerStyle;

public class XSSFLineChartData implements LineChartData {

   private List series = new ArrayList();


   public LineChartSeries addSeries(ChartDataSource categoryAxisData, ChartDataSource values) {
      if(!values.isNumeric()) {
         throw new IllegalArgumentException("Value data source must be numeric.");
      } else {
         int numOfSeries = this.series.size();
         XSSFLineChartData.Series newSeries = new XSSFLineChartData.Series(numOfSeries, numOfSeries, categoryAxisData, values);
         this.series.add(newSeries);
         return newSeries;
      }
   }

   public List getSeries() {
      return this.series;
   }

   public void fillChart(Chart chart, ChartAxis ... axis) {
      if(!(chart instanceof XSSFChart)) {
         throw new IllegalArgumentException("Chart must be instance of XSSFChart");
      } else {
         XSSFChart xssfChart = (XSSFChart)chart;
         CTPlotArea plotArea = xssfChart.getCTChart().getPlotArea();
         CTLineChart lineChart = plotArea.addNewLineChart();
         lineChart.addNewVaryColors().setVal(false);
         Iterator arr$ = this.series.iterator();

         while(arr$.hasNext()) {
            XSSFLineChartData.Series len$ = (XSSFLineChartData.Series)arr$.next();
            len$.addToChart(lineChart);
         }

         ChartAxis[] var10 = axis;
         int var11 = axis.length;

         for(int i$ = 0; i$ < var11; ++i$) {
            ChartAxis ax = var10[i$];
            lineChart.addNewAxId().setVal(ax.getId());
         }

      }
   }

   static class Series extends AbstractXSSFChartSeries implements LineChartSeries {

      private int id;
      private int order;
      private ChartDataSource categories;
      private ChartDataSource values;


      protected Series(int id, int order, ChartDataSource categories, ChartDataSource values) {
         this.id = id;
         this.order = order;
         this.categories = categories;
         this.values = values;
      }

      public ChartDataSource getCategoryAxisData() {
         return this.categories;
      }

      public ChartDataSource getValues() {
         return this.values;
      }

      protected void addToChart(CTLineChart ctLineChart) {
         CTLineSer ctLineSer = ctLineChart.addNewSer();
         ctLineSer.addNewIdx().setVal((long)this.id);
         ctLineSer.addNewOrder().setVal((long)this.order);
         ctLineSer.addNewMarker().addNewSymbol().setVal(STMarkerStyle.NONE);
         CTAxDataSource catDS = ctLineSer.addNewCat();
         XSSFChartUtil.buildAxDataSource(catDS, this.categories);
         CTNumDataSource valueDS = ctLineSer.addNewVal();
         XSSFChartUtil.buildNumDataSource(valueDS, this.values);
         if(this.isTitleSet()) {
            ctLineSer.setTx(this.getCTSerTx());
         }

      }
   }
}
