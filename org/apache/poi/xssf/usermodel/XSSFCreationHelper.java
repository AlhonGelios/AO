package org.apache.poi.xssf.usermodel;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.util.Internal;
import org.apache.poi.util.Removal;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSFCreationHelper implements CreationHelper {

   private final XSSFWorkbook workbook;


   @Internal
   public XSSFCreationHelper(XSSFWorkbook wb) {
      this.workbook = wb;
   }

   public XSSFRichTextString createRichTextString(String text) {
      XSSFRichTextString rt = new XSSFRichTextString(text);
      rt.setStylesTableReference(this.workbook.getStylesSource());
      return rt;
   }

   public XSSFDataFormat createDataFormat() {
      return this.workbook.createDataFormat();
   }

   public XSSFColor createExtendedColor() {
      return new XSSFColor();
   }

   @Deprecated
   @Removal(
      version = "3.17"
   )
   public XSSFHyperlink createHyperlink(int type) {
      return new XSSFHyperlink(type);
   }

   public XSSFHyperlink createHyperlink(HyperlinkType type) {
      return new XSSFHyperlink(type);
   }

   public XSSFFormulaEvaluator createFormulaEvaluator() {
      return new XSSFFormulaEvaluator(this.workbook);
   }

   public XSSFClientAnchor createClientAnchor() {
      return new XSSFClientAnchor();
   }
}
