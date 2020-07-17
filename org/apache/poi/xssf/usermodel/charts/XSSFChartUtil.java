package org.apache.poi.xssf.usermodel.charts;

import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumVal;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrVal;

class XSSFChartUtil {

   public static void buildAxDataSource(CTAxDataSource ctAxDataSource, ChartDataSource dataSource) {
      if(dataSource.isNumeric()) {
         if(dataSource.isReference()) {
            buildNumRef(ctAxDataSource.addNewNumRef(), dataSource);
         } else {
            buildNumLit(ctAxDataSource.addNewNumLit(), dataSource);
         }
      } else if(dataSource.isReference()) {
         buildStrRef(ctAxDataSource.addNewStrRef(), dataSource);
      } else {
         buildStrLit(ctAxDataSource.addNewStrLit(), dataSource);
      }

   }

   public static void buildNumDataSource(CTNumDataSource ctNumDataSource, ChartDataSource dataSource) {
      if(dataSource.isReference()) {
         buildNumRef(ctNumDataSource.addNewNumRef(), dataSource);
      } else {
         buildNumLit(ctNumDataSource.addNewNumLit(), dataSource);
      }

   }

   private static void buildNumRef(CTNumRef ctNumRef, ChartDataSource dataSource) {
      ctNumRef.setF(dataSource.getFormulaString());
      CTNumData cache = ctNumRef.addNewNumCache();
      fillNumCache(cache, dataSource);
   }

   private static void buildNumLit(CTNumData ctNumData, ChartDataSource dataSource) {
      fillNumCache(ctNumData, dataSource);
   }

   private static void buildStrRef(CTStrRef ctStrRef, ChartDataSource dataSource) {
      ctStrRef.setF(dataSource.getFormulaString());
      CTStrData cache = ctStrRef.addNewStrCache();
      fillStringCache(cache, dataSource);
   }

   private static void buildStrLit(CTStrData ctStrData, ChartDataSource dataSource) {
      fillStringCache(ctStrData, dataSource);
   }

   private static void fillStringCache(CTStrData cache, ChartDataSource dataSource) {
      int numOfPoints = dataSource.getPointCount();
      cache.addNewPtCount().setVal((long)numOfPoints);

      for(int i = 0; i < numOfPoints; ++i) {
         Object value = dataSource.getPointAt(i);
         if(value != null) {
            CTStrVal ctStrVal = cache.addNewPt();
            ctStrVal.setIdx((long)i);
            ctStrVal.setV(value.toString());
         }
      }

   }

   private static void fillNumCache(CTNumData cache, ChartDataSource dataSource) {
      int numOfPoints = dataSource.getPointCount();
      cache.addNewPtCount().setVal((long)numOfPoints);

      for(int i = 0; i < numOfPoints; ++i) {
         Number value = (Number)dataSource.getPointAt(i);
         if(value != null) {
            CTNumVal ctNumVal = cache.addNewPt();
            ctNumVal.setIdx((long)i);
            ctNumVal.setV(value.toString());
         }
      }

   }
}
