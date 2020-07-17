package org.apache.poi.ss.usermodel.charts;

import java.util.List;
import org.apache.poi.ss.usermodel.charts.ChartData;
import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.apache.poi.ss.usermodel.charts.ScatterChartSeries;

public interface ScatterChartData extends ChartData {

   ScatterChartSeries addSerie(ChartDataSource var1, ChartDataSource var2);

   List getSeries();
}
