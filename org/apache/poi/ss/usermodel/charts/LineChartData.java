package org.apache.poi.ss.usermodel.charts;

import java.util.List;
import org.apache.poi.ss.usermodel.charts.ChartData;
import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.apache.poi.ss.usermodel.charts.LineChartSeries;

public interface LineChartData extends ChartData {

   LineChartSeries addSeries(ChartDataSource var1, ChartDataSource var2);

   List getSeries();
}
