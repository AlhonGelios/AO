package org.apache.poi.xssf.usermodel;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.ss.usermodel.Chart;
import org.apache.poi.ss.usermodel.charts.AxisPosition;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.ss.usermodel.charts.ChartAxisFactory;
import org.apache.poi.ss.usermodel.charts.ChartData;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.XSSFGraphicFrame;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.charts.XSSFCategoryAxis;
import org.apache.poi.xssf.usermodel.charts.XSSFChartDataFactory;
import org.apache.poi.xssf.usermodel.charts.XSSFChartLegend;
import org.apache.poi.xssf.usermodel.charts.XSSFManualLayout;
import org.apache.poi.xssf.usermodel.charts.XSSFValueAxis;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.ChartSpaceDocument;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextField;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public final class XSSFChart extends POIXMLDocumentPart implements Chart, ChartAxisFactory {

   private XSSFGraphicFrame frame;
   private CTChartSpace chartSpace;
   private CTChart chart;
   List axis;


   protected XSSFChart() {
      this.axis = new ArrayList();
      this.createChart();
   }

   protected XSSFChart(PackagePart part) throws IOException, XmlException {
      super(part);
      this.axis = new ArrayList();
      this.chartSpace = ChartSpaceDocument.Factory.parse(part.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS).getChartSpace();
      this.chart = this.chartSpace.getChart();
   }

   @Deprecated
   protected XSSFChart(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   private void createChart() {
      this.chartSpace = CTChartSpace.Factory.newInstance();
      this.chart = this.chartSpace.addNewChart();
      CTPlotArea plotArea = this.chart.addNewPlotArea();
      plotArea.addNewLayout();
      this.chart.addNewPlotVisOnly().setVal(true);
      CTPrintSettings printSettings = this.chartSpace.addNewPrintSettings();
      printSettings.addNewHeaderFooter();
      CTPageMargins pageMargins = printSettings.addNewPageMargins();
      pageMargins.setB(0.75D);
      pageMargins.setL(0.7D);
      pageMargins.setR(0.7D);
      pageMargins.setT(0.75D);
      pageMargins.setHeader(0.3D);
      pageMargins.setFooter(0.3D);
      printSettings.addNewPageSetup();
   }

   @Internal
   public CTChartSpace getCTChartSpace() {
      return this.chartSpace;
   }

   @Internal
   public CTChart getCTChart() {
      return this.chart;
   }

   protected void commit() throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveSyntheticDocumentElement(new QName(CTChartSpace.type.getName().getNamespaceURI(), "chartSpace", "c"));
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.chartSpace.save(out, xmlOptions);
      out.close();
   }

   public XSSFGraphicFrame getGraphicFrame() {
      return this.frame;
   }

   protected void setGraphicFrame(XSSFGraphicFrame frame) {
      this.frame = frame;
   }

   public XSSFChartDataFactory getChartDataFactory() {
      return XSSFChartDataFactory.getInstance();
   }

   public XSSFChart getChartAxisFactory() {
      return this;
   }

   public void plot(ChartData data, ChartAxis ... chartAxis) {
      data.fillChart(this, chartAxis);
   }

   public XSSFValueAxis createValueAxis(AxisPosition pos) {
      long id = (long)(this.axis.size() + 1);
      XSSFValueAxis valueAxis = new XSSFValueAxis(this, id, pos);
      if(this.axis.size() == 1) {
         ChartAxis ax = (ChartAxis)this.axis.get(0);
         ax.crossAxis(valueAxis);
         valueAxis.crossAxis(ax);
      }

      this.axis.add(valueAxis);
      return valueAxis;
   }

   public XSSFCategoryAxis createCategoryAxis(AxisPosition pos) {
      long id = (long)(this.axis.size() + 1);
      XSSFCategoryAxis categoryAxis = new XSSFCategoryAxis(this, id, pos);
      if(this.axis.size() == 1) {
         ChartAxis ax = (ChartAxis)this.axis.get(0);
         ax.crossAxis(categoryAxis);
         categoryAxis.crossAxis(ax);
      }

      this.axis.add(categoryAxis);
      return categoryAxis;
   }

   public List getAxis() {
      if(this.axis.isEmpty() && this.hasAxis()) {
         this.parseAxis();
      }

      return this.axis;
   }

   public XSSFManualLayout getManualLayout() {
      return new XSSFManualLayout(this);
   }

   public boolean isPlotOnlyVisibleCells() {
      return this.chart.getPlotVisOnly().getVal();
   }

   public void setPlotOnlyVisibleCells(boolean plotVisOnly) {
      this.chart.getPlotVisOnly().setVal(plotVisOnly);
   }

   public XSSFRichTextString getTitle() {
      if(!this.chart.isSetTitle()) {
         return null;
      } else {
         CTTitle title = this.chart.getTitle();
         StringBuffer text = new StringBuffer();
         XmlObject[] t = title.selectPath("declare namespace a=\'http://schemas.openxmlformats.org/drawingml/2006/main\' .//a:t");

         for(int m = 0; m < t.length; ++m) {
            NodeList kids = t[m].getDomNode().getChildNodes();
            int count = kids.getLength();

            for(int n = 0; n < count; ++n) {
               Node kid = kids.item(n);
               if(kid instanceof Text) {
                  text.append(kid.getNodeValue());
               }
            }
         }

         return new XSSFRichTextString(text.toString());
      }
   }

   public void setTitle(String newTitle) {
      CTTitle ctTitle;
      if(this.chart.isSetTitle()) {
         ctTitle = this.chart.getTitle();
      } else {
         ctTitle = this.chart.addNewTitle();
      }

      CTTx tx;
      if(ctTitle.isSetTx()) {
         tx = ctTitle.getTx();
      } else {
         tx = ctTitle.addNewTx();
      }

      if(tx.isSetStrRef()) {
         tx.unsetStrRef();
      }

      CTTextBody rich;
      if(tx.isSetRich()) {
         rich = tx.getRich();
      } else {
         rich = tx.addNewRich();
         rich.addNewBodyPr();
      }

      CTTextParagraph para;
      if(rich.sizeOfPArray() > 0) {
         para = rich.getPArray(0);
      } else {
         para = rich.addNewP();
      }

      CTRegularTextRun run;
      if(para.sizeOfRArray() > 0) {
         run = para.getRArray(0);
         run.setT(newTitle);
      } else if(para.sizeOfFldArray() > 0) {
         CTTextField run1 = para.getFldArray(0);
         run1.setT(newTitle);
      } else {
         run = para.addNewR();
         run.setT(newTitle);
      }

   }

   public XSSFChartLegend getOrCreateLegend() {
      return new XSSFChartLegend(this);
   }

   public void deleteLegend() {
      if(this.chart.isSetLegend()) {
         this.chart.unsetLegend();
      }

   }

   private boolean hasAxis() {
      CTPlotArea ctPlotArea = this.chart.getPlotArea();
      int totalAxisCount = ctPlotArea.sizeOfValAxArray() + ctPlotArea.sizeOfCatAxArray() + ctPlotArea.sizeOfDateAxArray() + ctPlotArea.sizeOfSerAxArray();
      return totalAxisCount > 0;
   }

   private void parseAxis() {
      this.parseCategoryAxis();
      this.parseValueAxis();
   }

   private void parseCategoryAxis() {
      CTCatAx[] arr$ = this.chart.getPlotArea().getCatAxArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTCatAx catAx = arr$[i$];
         this.axis.add(new XSSFCategoryAxis(this, catAx));
      }

   }

   private void parseValueAxis() {
      CTValAx[] arr$ = this.chart.getPlotArea().getValAxArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTValAx valAx = arr$[i$];
         this.axis.add(new XSSFValueAxis(this, valAx));
      }

   }
}
