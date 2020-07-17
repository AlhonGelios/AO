package org.apache.poi.ss.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.LineChartData;
import org.apache.poi.ss.usermodel.charts.ScatterChartData;

public interface ChartDataFactory {

   ScatterChartData createScatterChartData();

   LineChartData createLineChartData();
}
