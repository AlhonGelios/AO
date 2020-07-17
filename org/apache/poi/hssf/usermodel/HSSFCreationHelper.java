package org.apache.poi.hssf.usermodel;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.record.common.ExtendedColor;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFExtendedColor;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.util.Internal;
import org.apache.poi.util.Removal;

public class HSSFCreationHelper implements CreationHelper {

   private final HSSFWorkbook workbook;


   @Internal(
      since = "3.15 beta 3"
   )
   HSSFCreationHelper(HSSFWorkbook wb) {
      this.workbook = wb;
   }

   public HSSFRichTextString createRichTextString(String text) {
      return new HSSFRichTextString(text);
   }

   public HSSFDataFormat createDataFormat() {
      return this.workbook.createDataFormat();
   }

   @Deprecated
   @Removal(
      version = "3.17"
   )
   public HSSFHyperlink createHyperlink(int type) {
      return new HSSFHyperlink(type);
   }

   public HSSFHyperlink createHyperlink(HyperlinkType type) {
      return new HSSFHyperlink(type);
   }

   public HSSFExtendedColor createExtendedColor() {
      return new HSSFExtendedColor(new ExtendedColor());
   }

   public HSSFFormulaEvaluator createFormulaEvaluator() {
      return new HSSFFormulaEvaluator(this.workbook);
   }

   public HSSFClientAnchor createClientAnchor() {
      return new HSSFClientAnchor();
   }
}
