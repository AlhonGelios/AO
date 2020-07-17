package org.apache.poi.ss.usermodel.charts;


public interface ChartDataSource {

   int getPointCount();

   Object getPointAt(int var1);

   boolean isReference();

   boolean isNumeric();

   String getFormulaString();
}
