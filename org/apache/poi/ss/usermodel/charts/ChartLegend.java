package org.apache.poi.ss.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.LegendPosition;
import org.apache.poi.ss.usermodel.charts.ManuallyPositionable;

public interface ChartLegend extends ManuallyPositionable {

   LegendPosition getPosition();

   void setPosition(LegendPosition var1);

   boolean isOverlay();

   void setOverlay(boolean var1);
}
