package org.apache.poi.ss.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.AxisCrossBetween;
import org.apache.poi.ss.usermodel.charts.ChartAxis;

public interface ValueAxis extends ChartAxis {

   AxisCrossBetween getCrossBetween();

   void setCrossBetween(AxisCrossBetween var1);
}
