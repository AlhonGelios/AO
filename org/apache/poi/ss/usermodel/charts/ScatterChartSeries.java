package org.apache.poi.ss.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.apache.poi.ss.usermodel.charts.ChartSeries;

public interface ScatterChartSeries extends ChartSeries {

   ChartDataSource getXValues();

   ChartDataSource getYValues();
}
