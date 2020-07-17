package org.apache.poi.xssf.usermodel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.ChartsheetDocument;

public class XSSFChartSheet extends XSSFSheet {

   private static final byte[] BLANK_WORKSHEET = blankWorksheet();
   protected CTChartsheet chartsheet;


   protected XSSFChartSheet(PackagePart part) {
      super(part);
   }

   @Deprecated
   protected XSSFChartSheet(PackagePart part, PackageRelationship rel) {
      this(part);
   }

   protected void read(InputStream is) throws IOException {
      super.read(new ByteArrayInputStream(BLANK_WORKSHEET));

      try {
         this.chartsheet = ChartsheetDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS).getChartsheet();
      } catch (XmlException var3) {
         throw new POIXMLException(var3);
      }
   }

   public CTChartsheet getCTChartsheet() {
      return this.chartsheet;
   }

   protected CTDrawing getCTDrawing() {
      return this.chartsheet.getDrawing();
   }

   protected CTLegacyDrawing getCTLegacyDrawing() {
      return this.chartsheet.getLegacyDrawing();
   }

   protected void write(OutputStream out) throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveSyntheticDocumentElement(new QName(CTChartsheet.type.getName().getNamespaceURI(), "chartsheet"));
      this.chartsheet.save(out, xmlOptions);
   }

   private static byte[] blankWorksheet() {
      ByteArrayOutputStream out = new ByteArrayOutputStream();

      try {
         (new XSSFSheet()).write(out);
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }

      return out.toByteArray();
   }

}
