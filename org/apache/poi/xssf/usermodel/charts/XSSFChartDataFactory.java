package org.apache.poi.xssf.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.ChartDataFactory;
import org.apache.poi.xssf.usermodel.charts.XSSFLineChartData;
import org.apache.poi.xssf.usermodel.charts.XSSFScatterChartData;

public class XSSFChartDataFactory implements ChartDataFactory {

   private static XSSFChartDataFactory instance;


   public XSSFScatterChartData createScatterChartData() {
      return new XSSFScatterChartData();
   }

   public XSSFLineChartData createLineChartData() {
      return new XSSFLineChartData();
   }

   public static XSSFChartDataFactory getInstance() {
      if(instance == null) {
         instance = new XSSFChartDataFactory();
      }

      return instance;
   }
}
