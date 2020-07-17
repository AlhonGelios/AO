package org.apache.poi.ss.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.TitleType;
import org.apache.poi.ss.util.CellReference;

public interface ChartSeries {

   void setTitle(String var1);

   void setTitle(CellReference var1);

   String getTitleString();

   CellReference getTitleCellReference();

   TitleType getTitleType();
}
