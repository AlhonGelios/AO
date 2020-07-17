package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1Area3DChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1AreaChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1Bar3DChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1BarChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1BubbleChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1CatAxList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1DateAxList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1DoughnutChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1Line3DChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1LineChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1OfPieChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1Pie3DChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1PieChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1RadarChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1ScatterChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1SerAxList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1StockChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1Surface3DChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1SurfaceChartList;
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.CTPlotAreaImpl.1ValAxList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;

public class CTPlotAreaImpl extends XmlComplexContentImpl implements CTPlotArea {

   private static final QName LAYOUT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "layout");
   private static final QName AREACHART$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "areaChart");
   private static final QName AREA3DCHART$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "area3DChart");
   private static final QName LINECHART$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "lineChart");
   private static final QName LINE3DCHART$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "line3DChart");
   private static final QName STOCKCHART$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "stockChart");
   private static final QName RADARCHART$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "radarChart");
   private static final QName SCATTERCHART$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "scatterChart");
   private static final QName PIECHART$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pieChart");
   private static final QName PIE3DCHART$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pie3DChart");
   private static final QName DOUGHNUTCHART$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "doughnutChart");
   private static final QName BARCHART$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "barChart");
   private static final QName BAR3DCHART$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "bar3DChart");
   private static final QName OFPIECHART$26 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "ofPieChart");
   private static final QName SURFACECHART$28 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "surfaceChart");
   private static final QName SURFACE3DCHART$30 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "surface3DChart");
   private static final QName BUBBLECHART$32 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "bubbleChart");
   private static final QName VALAX$34 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "valAx");
   private static final QName CATAX$36 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "catAx");
   private static final QName DATEAX$38 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dateAx");
   private static final QName SERAX$40 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "serAx");
   private static final QName DTABLE$42 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "dTable");
   private static final QName SPPR$44 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "spPr");
   private static final QName EXTLST$46 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTPlotAreaImpl(SchemaType var1) {
      super(var1);
   }

   public CTLayout getLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayout var2 = null;
         var2 = (CTLayout)this.get_store().find_element_user(LAYOUT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LAYOUT$0) != 0;
      }
   }

   public void setLayout(CTLayout var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayout var3 = null;
         var3 = (CTLayout)this.get_store().find_element_user(LAYOUT$0, 0);
         if(var3 == null) {
            var3 = (CTLayout)this.get_store().add_element_user(LAYOUT$0);
         }

         var3.set(var1);
      }
   }

   public CTLayout addNewLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLayout var2 = null;
         var2 = (CTLayout)this.get_store().add_element_user(LAYOUT$0);
         return var2;
      }
   }

   public void unsetLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LAYOUT$0, 0);
      }
   }

   public List getAreaChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AreaChartList(this);
      }
   }

   public CTAreaChart[] getAreaChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AREACHART$2, var2);
         CTAreaChart[] var3 = new CTAreaChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAreaChart getAreaChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAreaChart var3 = null;
         var3 = (CTAreaChart)this.get_store().find_element_user(AREACHART$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAreaChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AREACHART$2);
      }
   }

   public void setAreaChartArray(CTAreaChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AREACHART$2);
      }
   }

   public void setAreaChartArray(int var1, CTAreaChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAreaChart var4 = null;
         var4 = (CTAreaChart)this.get_store().find_element_user(AREACHART$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAreaChart insertNewAreaChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAreaChart var3 = null;
         var3 = (CTAreaChart)this.get_store().insert_element_user(AREACHART$2, var1);
         return var3;
      }
   }

   public CTAreaChart addNewAreaChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAreaChart var2 = null;
         var2 = (CTAreaChart)this.get_store().add_element_user(AREACHART$2);
         return var2;
      }
   }

   public void removeAreaChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AREACHART$2, var1);
      }
   }

   public List getArea3DChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1Area3DChartList(this);
      }
   }

   public CTArea3DChart[] getArea3DChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AREA3DCHART$4, var2);
         CTArea3DChart[] var3 = new CTArea3DChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTArea3DChart getArea3DChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArea3DChart var3 = null;
         var3 = (CTArea3DChart)this.get_store().find_element_user(AREA3DCHART$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfArea3DChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AREA3DCHART$4);
      }
   }

   public void setArea3DChartArray(CTArea3DChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AREA3DCHART$4);
      }
   }

   public void setArea3DChartArray(int var1, CTArea3DChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArea3DChart var4 = null;
         var4 = (CTArea3DChart)this.get_store().find_element_user(AREA3DCHART$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTArea3DChart insertNewArea3DChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArea3DChart var3 = null;
         var3 = (CTArea3DChart)this.get_store().insert_element_user(AREA3DCHART$4, var1);
         return var3;
      }
   }

   public CTArea3DChart addNewArea3DChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArea3DChart var2 = null;
         var2 = (CTArea3DChart)this.get_store().add_element_user(AREA3DCHART$4);
         return var2;
      }
   }

   public void removeArea3DChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AREA3DCHART$4, var1);
      }
   }

   public List getLineChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LineChartList(this);
      }
   }

   public CTLineChart[] getLineChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LINECHART$6, var2);
         CTLineChart[] var3 = new CTLineChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLineChart getLineChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineChart var3 = null;
         var3 = (CTLineChart)this.get_store().find_element_user(LINECHART$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLineChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LINECHART$6);
      }
   }

   public void setLineChartArray(CTLineChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LINECHART$6);
      }
   }

   public void setLineChartArray(int var1, CTLineChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineChart var4 = null;
         var4 = (CTLineChart)this.get_store().find_element_user(LINECHART$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLineChart insertNewLineChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineChart var3 = null;
         var3 = (CTLineChart)this.get_store().insert_element_user(LINECHART$6, var1);
         return var3;
      }
   }

   public CTLineChart addNewLineChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineChart var2 = null;
         var2 = (CTLineChart)this.get_store().add_element_user(LINECHART$6);
         return var2;
      }
   }

   public void removeLineChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LINECHART$6, var1);
      }
   }

   public List getLine3DChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1Line3DChartList(this);
      }
   }

   public CTLine3DChart[] getLine3DChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LINE3DCHART$8, var2);
         CTLine3DChart[] var3 = new CTLine3DChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLine3DChart getLine3DChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLine3DChart var3 = null;
         var3 = (CTLine3DChart)this.get_store().find_element_user(LINE3DCHART$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLine3DChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LINE3DCHART$8);
      }
   }

   public void setLine3DChartArray(CTLine3DChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LINE3DCHART$8);
      }
   }

   public void setLine3DChartArray(int var1, CTLine3DChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLine3DChart var4 = null;
         var4 = (CTLine3DChart)this.get_store().find_element_user(LINE3DCHART$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLine3DChart insertNewLine3DChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLine3DChart var3 = null;
         var3 = (CTLine3DChart)this.get_store().insert_element_user(LINE3DCHART$8, var1);
         return var3;
      }
   }

   public CTLine3DChart addNewLine3DChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLine3DChart var2 = null;
         var2 = (CTLine3DChart)this.get_store().add_element_user(LINE3DCHART$8);
         return var2;
      }
   }

   public void removeLine3DChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LINE3DCHART$8, var1);
      }
   }

   public List getStockChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1StockChartList(this);
      }
   }

   public CTStockChart[] getStockChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(STOCKCHART$10, var2);
         CTStockChart[] var3 = new CTStockChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTStockChart getStockChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStockChart var3 = null;
         var3 = (CTStockChart)this.get_store().find_element_user(STOCKCHART$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfStockChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STOCKCHART$10);
      }
   }

   public void setStockChartArray(CTStockChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, STOCKCHART$10);
      }
   }

   public void setStockChartArray(int var1, CTStockChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStockChart var4 = null;
         var4 = (CTStockChart)this.get_store().find_element_user(STOCKCHART$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTStockChart insertNewStockChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStockChart var3 = null;
         var3 = (CTStockChart)this.get_store().insert_element_user(STOCKCHART$10, var1);
         return var3;
      }
   }

   public CTStockChart addNewStockChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStockChart var2 = null;
         var2 = (CTStockChart)this.get_store().add_element_user(STOCKCHART$10);
         return var2;
      }
   }

   public void removeStockChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STOCKCHART$10, var1);
      }
   }

   public List getRadarChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RadarChartList(this);
      }
   }

   public CTRadarChart[] getRadarChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RADARCHART$12, var2);
         CTRadarChart[] var3 = new CTRadarChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRadarChart getRadarChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRadarChart var3 = null;
         var3 = (CTRadarChart)this.get_store().find_element_user(RADARCHART$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRadarChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RADARCHART$12);
      }
   }

   public void setRadarChartArray(CTRadarChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RADARCHART$12);
      }
   }

   public void setRadarChartArray(int var1, CTRadarChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRadarChart var4 = null;
         var4 = (CTRadarChart)this.get_store().find_element_user(RADARCHART$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRadarChart insertNewRadarChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRadarChart var3 = null;
         var3 = (CTRadarChart)this.get_store().insert_element_user(RADARCHART$12, var1);
         return var3;
      }
   }

   public CTRadarChart addNewRadarChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRadarChart var2 = null;
         var2 = (CTRadarChart)this.get_store().add_element_user(RADARCHART$12);
         return var2;
      }
   }

   public void removeRadarChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RADARCHART$12, var1);
      }
   }

   public List getScatterChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ScatterChartList(this);
      }
   }

   public CTScatterChart[] getScatterChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SCATTERCHART$14, var2);
         CTScatterChart[] var3 = new CTScatterChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTScatterChart getScatterChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterChart var3 = null;
         var3 = (CTScatterChart)this.get_store().find_element_user(SCATTERCHART$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfScatterChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCATTERCHART$14);
      }
   }

   public void setScatterChartArray(CTScatterChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SCATTERCHART$14);
      }
   }

   public void setScatterChartArray(int var1, CTScatterChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterChart var4 = null;
         var4 = (CTScatterChart)this.get_store().find_element_user(SCATTERCHART$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTScatterChart insertNewScatterChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterChart var3 = null;
         var3 = (CTScatterChart)this.get_store().insert_element_user(SCATTERCHART$14, var1);
         return var3;
      }
   }

   public CTScatterChart addNewScatterChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScatterChart var2 = null;
         var2 = (CTScatterChart)this.get_store().add_element_user(SCATTERCHART$14);
         return var2;
      }
   }

   public void removeScatterChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCATTERCHART$14, var1);
      }
   }

   public List getPieChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PieChartList(this);
      }
   }

   public CTPieChart[] getPieChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PIECHART$16, var2);
         CTPieChart[] var3 = new CTPieChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPieChart getPieChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPieChart var3 = null;
         var3 = (CTPieChart)this.get_store().find_element_user(PIECHART$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPieChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIECHART$16);
      }
   }

   public void setPieChartArray(CTPieChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PIECHART$16);
      }
   }

   public void setPieChartArray(int var1, CTPieChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPieChart var4 = null;
         var4 = (CTPieChart)this.get_store().find_element_user(PIECHART$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPieChart insertNewPieChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPieChart var3 = null;
         var3 = (CTPieChart)this.get_store().insert_element_user(PIECHART$16, var1);
         return var3;
      }
   }

   public CTPieChart addNewPieChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPieChart var2 = null;
         var2 = (CTPieChart)this.get_store().add_element_user(PIECHART$16);
         return var2;
      }
   }

   public void removePieChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIECHART$16, var1);
      }
   }

   public List getPie3DChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1Pie3DChartList(this);
      }
   }

   public CTPie3DChart[] getPie3DChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PIE3DCHART$18, var2);
         CTPie3DChart[] var3 = new CTPie3DChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPie3DChart getPie3DChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPie3DChart var3 = null;
         var3 = (CTPie3DChart)this.get_store().find_element_user(PIE3DCHART$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPie3DChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIE3DCHART$18);
      }
   }

   public void setPie3DChartArray(CTPie3DChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PIE3DCHART$18);
      }
   }

   public void setPie3DChartArray(int var1, CTPie3DChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPie3DChart var4 = null;
         var4 = (CTPie3DChart)this.get_store().find_element_user(PIE3DCHART$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPie3DChart insertNewPie3DChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPie3DChart var3 = null;
         var3 = (CTPie3DChart)this.get_store().insert_element_user(PIE3DCHART$18, var1);
         return var3;
      }
   }

   public CTPie3DChart addNewPie3DChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPie3DChart var2 = null;
         var2 = (CTPie3DChart)this.get_store().add_element_user(PIE3DCHART$18);
         return var2;
      }
   }

   public void removePie3DChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIE3DCHART$18, var1);
      }
   }

   public List getDoughnutChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DoughnutChartList(this);
      }
   }

   public CTDoughnutChart[] getDoughnutChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DOUGHNUTCHART$20, var2);
         CTDoughnutChart[] var3 = new CTDoughnutChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDoughnutChart getDoughnutChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDoughnutChart var3 = null;
         var3 = (CTDoughnutChart)this.get_store().find_element_user(DOUGHNUTCHART$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDoughnutChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOUGHNUTCHART$20);
      }
   }

   public void setDoughnutChartArray(CTDoughnutChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DOUGHNUTCHART$20);
      }
   }

   public void setDoughnutChartArray(int var1, CTDoughnutChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDoughnutChart var4 = null;
         var4 = (CTDoughnutChart)this.get_store().find_element_user(DOUGHNUTCHART$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDoughnutChart insertNewDoughnutChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDoughnutChart var3 = null;
         var3 = (CTDoughnutChart)this.get_store().insert_element_user(DOUGHNUTCHART$20, var1);
         return var3;
      }
   }

   public CTDoughnutChart addNewDoughnutChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDoughnutChart var2 = null;
         var2 = (CTDoughnutChart)this.get_store().add_element_user(DOUGHNUTCHART$20);
         return var2;
      }
   }

   public void removeDoughnutChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOUGHNUTCHART$20, var1);
      }
   }

   public List getBarChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BarChartList(this);
      }
   }

   public CTBarChart[] getBarChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BARCHART$22, var2);
         CTBarChart[] var3 = new CTBarChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBarChart getBarChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBarChart var3 = null;
         var3 = (CTBarChart)this.get_store().find_element_user(BARCHART$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBarChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BARCHART$22);
      }
   }

   public void setBarChartArray(CTBarChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BARCHART$22);
      }
   }

   public void setBarChartArray(int var1, CTBarChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBarChart var4 = null;
         var4 = (CTBarChart)this.get_store().find_element_user(BARCHART$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBarChart insertNewBarChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBarChart var3 = null;
         var3 = (CTBarChart)this.get_store().insert_element_user(BARCHART$22, var1);
         return var3;
      }
   }

   public CTBarChart addNewBarChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBarChart var2 = null;
         var2 = (CTBarChart)this.get_store().add_element_user(BARCHART$22);
         return var2;
      }
   }

   public void removeBarChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BARCHART$22, var1);
      }
   }

   public List getBar3DChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1Bar3DChartList(this);
      }
   }

   public CTBar3DChart[] getBar3DChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BAR3DCHART$24, var2);
         CTBar3DChart[] var3 = new CTBar3DChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBar3DChart getBar3DChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBar3DChart var3 = null;
         var3 = (CTBar3DChart)this.get_store().find_element_user(BAR3DCHART$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBar3DChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BAR3DCHART$24);
      }
   }

   public void setBar3DChartArray(CTBar3DChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BAR3DCHART$24);
      }
   }

   public void setBar3DChartArray(int var1, CTBar3DChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBar3DChart var4 = null;
         var4 = (CTBar3DChart)this.get_store().find_element_user(BAR3DCHART$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBar3DChart insertNewBar3DChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBar3DChart var3 = null;
         var3 = (CTBar3DChart)this.get_store().insert_element_user(BAR3DCHART$24, var1);
         return var3;
      }
   }

   public CTBar3DChart addNewBar3DChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBar3DChart var2 = null;
         var2 = (CTBar3DChart)this.get_store().add_element_user(BAR3DCHART$24);
         return var2;
      }
   }

   public void removeBar3DChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BAR3DCHART$24, var1);
      }
   }

   public List getOfPieChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1OfPieChartList(this);
      }
   }

   public CTOfPieChart[] getOfPieChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(OFPIECHART$26, var2);
         CTOfPieChart[] var3 = new CTOfPieChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOfPieChart getOfPieChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfPieChart var3 = null;
         var3 = (CTOfPieChart)this.get_store().find_element_user(OFPIECHART$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfOfPieChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OFPIECHART$26);
      }
   }

   public void setOfPieChartArray(CTOfPieChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OFPIECHART$26);
      }
   }

   public void setOfPieChartArray(int var1, CTOfPieChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfPieChart var4 = null;
         var4 = (CTOfPieChart)this.get_store().find_element_user(OFPIECHART$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOfPieChart insertNewOfPieChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfPieChart var3 = null;
         var3 = (CTOfPieChart)this.get_store().insert_element_user(OFPIECHART$26, var1);
         return var3;
      }
   }

   public CTOfPieChart addNewOfPieChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfPieChart var2 = null;
         var2 = (CTOfPieChart)this.get_store().add_element_user(OFPIECHART$26);
         return var2;
      }
   }

   public void removeOfPieChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OFPIECHART$26, var1);
      }
   }

   public List getSurfaceChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SurfaceChartList(this);
      }
   }

   public CTSurfaceChart[] getSurfaceChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SURFACECHART$28, var2);
         CTSurfaceChart[] var3 = new CTSurfaceChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSurfaceChart getSurfaceChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurfaceChart var3 = null;
         var3 = (CTSurfaceChart)this.get_store().find_element_user(SURFACECHART$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSurfaceChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SURFACECHART$28);
      }
   }

   public void setSurfaceChartArray(CTSurfaceChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SURFACECHART$28);
      }
   }

   public void setSurfaceChartArray(int var1, CTSurfaceChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurfaceChart var4 = null;
         var4 = (CTSurfaceChart)this.get_store().find_element_user(SURFACECHART$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSurfaceChart insertNewSurfaceChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurfaceChart var3 = null;
         var3 = (CTSurfaceChart)this.get_store().insert_element_user(SURFACECHART$28, var1);
         return var3;
      }
   }

   public CTSurfaceChart addNewSurfaceChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurfaceChart var2 = null;
         var2 = (CTSurfaceChart)this.get_store().add_element_user(SURFACECHART$28);
         return var2;
      }
   }

   public void removeSurfaceChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SURFACECHART$28, var1);
      }
   }

   public List getSurface3DChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1Surface3DChartList(this);
      }
   }

   public CTSurface3DChart[] getSurface3DChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SURFACE3DCHART$30, var2);
         CTSurface3DChart[] var3 = new CTSurface3DChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSurface3DChart getSurface3DChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface3DChart var3 = null;
         var3 = (CTSurface3DChart)this.get_store().find_element_user(SURFACE3DCHART$30, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSurface3DChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SURFACE3DCHART$30);
      }
   }

   public void setSurface3DChartArray(CTSurface3DChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SURFACE3DCHART$30);
      }
   }

   public void setSurface3DChartArray(int var1, CTSurface3DChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface3DChart var4 = null;
         var4 = (CTSurface3DChart)this.get_store().find_element_user(SURFACE3DCHART$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSurface3DChart insertNewSurface3DChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface3DChart var3 = null;
         var3 = (CTSurface3DChart)this.get_store().insert_element_user(SURFACE3DCHART$30, var1);
         return var3;
      }
   }

   public CTSurface3DChart addNewSurface3DChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSurface3DChart var2 = null;
         var2 = (CTSurface3DChart)this.get_store().add_element_user(SURFACE3DCHART$30);
         return var2;
      }
   }

   public void removeSurface3DChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SURFACE3DCHART$30, var1);
      }
   }

   public List getBubbleChartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BubbleChartList(this);
      }
   }

   public CTBubbleChart[] getBubbleChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BUBBLECHART$32, var2);
         CTBubbleChart[] var3 = new CTBubbleChart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBubbleChart getBubbleChartArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBubbleChart var3 = null;
         var3 = (CTBubbleChart)this.get_store().find_element_user(BUBBLECHART$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBubbleChartArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUBBLECHART$32);
      }
   }

   public void setBubbleChartArray(CTBubbleChart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BUBBLECHART$32);
      }
   }

   public void setBubbleChartArray(int var1, CTBubbleChart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBubbleChart var4 = null;
         var4 = (CTBubbleChart)this.get_store().find_element_user(BUBBLECHART$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBubbleChart insertNewBubbleChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBubbleChart var3 = null;
         var3 = (CTBubbleChart)this.get_store().insert_element_user(BUBBLECHART$32, var1);
         return var3;
      }
   }

   public CTBubbleChart addNewBubbleChart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBubbleChart var2 = null;
         var2 = (CTBubbleChart)this.get_store().add_element_user(BUBBLECHART$32);
         return var2;
      }
   }

   public void removeBubbleChart(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUBBLECHART$32, var1);
      }
   }

   public List getValAxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ValAxList(this);
      }
   }

   public CTValAx[] getValAxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(VALAX$34, var2);
         CTValAx[] var3 = new CTValAx[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTValAx getValAxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTValAx var3 = null;
         var3 = (CTValAx)this.get_store().find_element_user(VALAX$34, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfValAxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VALAX$34);
      }
   }

   public void setValAxArray(CTValAx[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, VALAX$34);
      }
   }

   public void setValAxArray(int var1, CTValAx var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTValAx var4 = null;
         var4 = (CTValAx)this.get_store().find_element_user(VALAX$34, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTValAx insertNewValAx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTValAx var3 = null;
         var3 = (CTValAx)this.get_store().insert_element_user(VALAX$34, var1);
         return var3;
      }
   }

   public CTValAx addNewValAx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTValAx var2 = null;
         var2 = (CTValAx)this.get_store().add_element_user(VALAX$34);
         return var2;
      }
   }

   public void removeValAx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VALAX$34, var1);
      }
   }

   public List getCatAxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CatAxList(this);
      }
   }

   public CTCatAx[] getCatAxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CATAX$36, var2);
         CTCatAx[] var3 = new CTCatAx[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCatAx getCatAxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCatAx var3 = null;
         var3 = (CTCatAx)this.get_store().find_element_user(CATAX$36, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCatAxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CATAX$36);
      }
   }

   public void setCatAxArray(CTCatAx[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CATAX$36);
      }
   }

   public void setCatAxArray(int var1, CTCatAx var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCatAx var4 = null;
         var4 = (CTCatAx)this.get_store().find_element_user(CATAX$36, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCatAx insertNewCatAx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCatAx var3 = null;
         var3 = (CTCatAx)this.get_store().insert_element_user(CATAX$36, var1);
         return var3;
      }
   }

   public CTCatAx addNewCatAx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCatAx var2 = null;
         var2 = (CTCatAx)this.get_store().add_element_user(CATAX$36);
         return var2;
      }
   }

   public void removeCatAx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CATAX$36, var1);
      }
   }

   public List getDateAxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DateAxList(this);
      }
   }

   public CTDateAx[] getDateAxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DATEAX$38, var2);
         CTDateAx[] var3 = new CTDateAx[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDateAx getDateAxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDateAx var3 = null;
         var3 = (CTDateAx)this.get_store().find_element_user(DATEAX$38, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDateAxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATEAX$38);
      }
   }

   public void setDateAxArray(CTDateAx[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DATEAX$38);
      }
   }

   public void setDateAxArray(int var1, CTDateAx var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDateAx var4 = null;
         var4 = (CTDateAx)this.get_store().find_element_user(DATEAX$38, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDateAx insertNewDateAx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDateAx var3 = null;
         var3 = (CTDateAx)this.get_store().insert_element_user(DATEAX$38, var1);
         return var3;
      }
   }

   public CTDateAx addNewDateAx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDateAx var2 = null;
         var2 = (CTDateAx)this.get_store().add_element_user(DATEAX$38);
         return var2;
      }
   }

   public void removeDateAx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATEAX$38, var1);
      }
   }

   public List getSerAxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SerAxList(this);
      }
   }

   public CTSerAx[] getSerAxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SERAX$40, var2);
         CTSerAx[] var3 = new CTSerAx[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSerAx getSerAxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSerAx var3 = null;
         var3 = (CTSerAx)this.get_store().find_element_user(SERAX$40, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSerAxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SERAX$40);
      }
   }

   public void setSerAxArray(CTSerAx[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SERAX$40);
      }
   }

   public void setSerAxArray(int var1, CTSerAx var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSerAx var4 = null;
         var4 = (CTSerAx)this.get_store().find_element_user(SERAX$40, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSerAx insertNewSerAx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSerAx var3 = null;
         var3 = (CTSerAx)this.get_store().insert_element_user(SERAX$40, var1);
         return var3;
      }
   }

   public CTSerAx addNewSerAx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSerAx var2 = null;
         var2 = (CTSerAx)this.get_store().add_element_user(SERAX$40);
         return var2;
      }
   }

   public void removeSerAx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SERAX$40, var1);
      }
   }

   public CTDTable getDTable() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDTable var2 = null;
         var2 = (CTDTable)this.get_store().find_element_user(DTABLE$42, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDTable() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DTABLE$42) != 0;
      }
   }

   public void setDTable(CTDTable var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDTable var3 = null;
         var3 = (CTDTable)this.get_store().find_element_user(DTABLE$42, 0);
         if(var3 == null) {
            var3 = (CTDTable)this.get_store().add_element_user(DTABLE$42);
         }

         var3.set(var1);
      }
   }

   public CTDTable addNewDTable() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDTable var2 = null;
         var2 = (CTDTable)this.get_store().add_element_user(DTABLE$42);
         return var2;
      }
   }

   public void unsetDTable() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DTABLE$42, 0);
      }
   }

   public CTShapeProperties getSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().find_element_user(SPPR$44, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPPR$44) != 0;
      }
   }

   public void setSpPr(CTShapeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var3 = null;
         var3 = (CTShapeProperties)this.get_store().find_element_user(SPPR$44, 0);
         if(var3 == null) {
            var3 = (CTShapeProperties)this.get_store().add_element_user(SPPR$44);
         }

         var3.set(var1);
      }
   }

   public CTShapeProperties addNewSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().add_element_user(SPPR$44);
         return var2;
      }
   }

   public void unsetSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPPR$44, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$46, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$46) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$46, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$46);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$46);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$46, 0);
      }
   }

}
