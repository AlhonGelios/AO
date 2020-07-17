package org.apache.poi.ss.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.apache.poi.ss.usermodel.charts.ChartSeries;

public interface LineChartSeries extends ChartSeries {

   ChartDataSource getCategoryAxisData();

   ChartDataSource getValues();
}
