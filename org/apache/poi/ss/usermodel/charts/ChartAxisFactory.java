package org.apache.poi.ss.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.AxisPosition;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.ss.usermodel.charts.ValueAxis;

public interface ChartAxisFactory {

   ValueAxis createValueAxis(AxisPosition var1);

   ChartAxis createCategoryAxis(AxisPosition var1);
}
