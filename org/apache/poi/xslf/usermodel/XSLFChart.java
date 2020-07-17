package org.apache.poi.xslf.usermodel;

import java.io.IOException;
import java.io.OutputStream;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.Internal;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace;
import org.openxmlformats.schemas.drawingml.x2006.chart.ChartSpaceDocument;

public final class XSLFChart extends POIXMLDocumentPart {

   private CTChartSpace chartSpace;
   private CTChart chart;


   protected XSLFChart(PackagePart part) throws IOException, XmlException {
      super(part);
      this.chartSpace = ChartSpaceDocument.Factory.parse(part.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS).getChartSpace();
      this.chart = this.chartSpace.getChart();
   }

   @Deprecated
   protected XSLFChart(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
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
}
